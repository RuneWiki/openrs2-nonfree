import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wo")
public final class Class390 implements Runnable {

	@OriginalMember(owner = "client!wo", name = "m", descriptor = "[B")
	private byte[] aByteArray108;

	@OriginalMember(owner = "client!wo", name = "r", descriptor = "Lclient!pga;")
	private Class281 aClass281_9;

	@OriginalMember(owner = "client!wo", name = "b", descriptor = "Z")
	private boolean aBoolean797 = false;

	@OriginalMember(owner = "client!wo", name = "i", descriptor = "I")
	private int anInt10555 = 0;

	@OriginalMember(owner = "client!wo", name = "h", descriptor = "Z")
	private boolean aBoolean799 = false;

	@OriginalMember(owner = "client!wo", name = "p", descriptor = "I")
	private int anInt10560 = 0;

	@OriginalMember(owner = "client!wo", name = "s", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket2;

	@OriginalMember(owner = "client!wo", name = "o", descriptor = "Lclient!lc;")
	private final Class207 aClass207_6;

	@OriginalMember(owner = "client!wo", name = "g", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream2;

	@OriginalMember(owner = "client!wo", name = "e", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream2;

	@OriginalMember(owner = "client!wo", name = "c", descriptor = "I")
	private final int anInt10553;

	@OriginalMember(owner = "client!wo", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!lc;I)V")
	public Class390(@OriginalArg(0) Socket arg0, @OriginalArg(1) Class207 arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aSocket2 = arg0;
		this.aClass207_6 = arg1;
		this.aSocket2.setSoTimeout(30000);
		this.aSocket2.setTcpNoDelay(true);
		this.anInputStream2 = this.aSocket2.getInputStream();
		this.anOutputStream2 = this.aSocket2.getOutputStream();
		this.anInt10553 = arg2;
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(Z)I")
	public int method8924() throws IOException {
		return this.aBoolean799 ? 0 : this.anInputStream2.read();
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(I)V")
	public void method8925() {
		if (!this.aBoolean799) {
			this.anInputStream2 = new InputStream_Sub1();
			this.anOutputStream2 = new OutputStream_Sub1();
		}
	}

	@OriginalMember(owner = "client!wo", name = "b", descriptor = "(Z)V")
	public void method8926() {
		if (this.aBoolean799) {
			return;
		}
		synchronized (this) {
			this.aBoolean799 = true;
			this.notifyAll();
		}
		if (this.aClass281_9 != null) {
			while (this.aClass281_9.anInt7338 == 0) {
				Static491.method6679(1L);
			}
			if (this.aClass281_9.anInt7338 == 1) {
				try {
					((Thread) this.aClass281_9.anObject17).join();
				} catch (@Pc(58) InterruptedException local58) {
				}
			}
		}
		this.aClass281_9 = null;
	}

	@OriginalMember(owner = "client!wo", name = "b", descriptor = "(I)I")
	public int method8927() throws IOException {
		return this.aBoolean799 ? 0 : this.anInputStream2.available();
	}

	@OriginalMember(owner = "client!wo", name = "c", descriptor = "(I)V")
	public void method8928() throws IOException {
		if (!this.aBoolean799 && this.aBoolean797) {
			this.aBoolean797 = false;
			throw new IOException();
		}
	}

	@OriginalMember(owner = "client!wo", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method8926();
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "([BIBI)V")
	public void method8929(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) throws IOException {
		if (this.aBoolean799) {
			return;
		}
		if (this.aBoolean797) {
			this.aBoolean797 = false;
			throw new IOException();
		}
		if (this.aByteArray108 == null) {
			this.aByteArray108 = new byte[this.anInt10553];
		}
		synchronized (this) {
			for (@Pc(33) int local33 = 0; local33 < arg1; local33++) {
				this.aByteArray108[this.anInt10555] = arg0[local33];
				this.anInt10555 = (this.anInt10555 + 1) % this.anInt10553;
				if (this.anInt10555 == (this.anInt10560 + this.anInt10553 - 100) % this.anInt10553) {
					throw new IOException();
				}
			}
			if (this.aClass281_9 == null) {
				this.aClass281_9 = this.aClass207_6.method4587(3, this);
			}
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!wo", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				label80: {
					@Pc(40) int local40;
					@Pc(24) int local24;
					synchronized (this) {
						if (this.anInt10555 == this.anInt10560) {
							if (this.aBoolean799) {
								break label80;
							}
							try {
								this.wait();
							} catch (@Pc(20) InterruptedException local20) {
							}
						}
						local24 = this.anInt10560;
						if (this.anInt10555 >= this.anInt10560) {
							local40 = this.anInt10555 - this.anInt10560;
						} else {
							local40 = this.anInt10553 - this.anInt10560;
						}
					}
					if (local40 <= 0) {
						continue;
					}
					try {
						this.anOutputStream2.write(this.aByteArray108, local24, local40);
					} catch (@Pc(66) IOException local66) {
						this.aBoolean797 = true;
					}
					this.anInt10560 = (this.anInt10560 + local40) % this.anInt10553;
					try {
						if (this.anInt10560 == this.anInt10555) {
							this.anOutputStream2.flush();
						}
					} catch (@Pc(89) IOException local89) {
						this.aBoolean797 = true;
					}
					continue;
				}
				try {
					if (this.anInputStream2 != null) {
						this.anInputStream2.close();
					}
					if (this.anOutputStream2 != null) {
						this.anOutputStream2.close();
					}
					if (this.aSocket2 != null) {
						this.aSocket2.close();
					}
				} catch (@Pc(113) IOException local113) {
				}
				this.aByteArray108 = null;
				break;
			}
		} catch (@Pc(118) Exception local118) {
			Static357.method4765(local118, (String) null);
		}
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(IIZ[B)V")
	public void method8930(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		if (this.aBoolean799) {
			return;
		}
		while (arg0 > 0) {
			@Pc(19) int local19 = this.anInputStream2.read(arg2, arg1, arg0);
			if (local19 <= 0) {
				throw new EOFException();
			}
			arg0 -= local19;
			arg1 += local19;
		}
	}
}
