import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ur")
public final class Class253 implements Runnable {

	@OriginalMember(owner = "client!ur", name = "g", descriptor = "[B")
	private byte[] aByteArray89;

	@OriginalMember(owner = "client!ur", name = "h", descriptor = "Lclient!wp;")
	private Class270 aClass270_7;

	@OriginalMember(owner = "client!ur", name = "b", descriptor = "Z")
	private boolean aBoolean457 = false;

	@OriginalMember(owner = "client!ur", name = "l", descriptor = "I")
	private int anInt6993 = 0;

	@OriginalMember(owner = "client!ur", name = "u", descriptor = "Z")
	private boolean aBoolean458 = false;

	@OriginalMember(owner = "client!ur", name = "w", descriptor = "I")
	private int anInt6999 = 0;

	@OriginalMember(owner = "client!ur", name = "c", descriptor = "Lclient!lt;")
	private final Class159 aClass159_4;

	@OriginalMember(owner = "client!ur", name = "o", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket1;

	@OriginalMember(owner = "client!ur", name = "t", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream1;

	@OriginalMember(owner = "client!ur", name = "s", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream1;

	@OriginalMember(owner = "client!ur", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!lt;)V")
	public Class253(@OriginalArg(0) Socket arg0, @OriginalArg(1) Class159 arg1) throws IOException {
		this.aClass159_4 = arg1;
		this.aSocket1 = arg0;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.anInputStream1 = this.aSocket1.getInputStream();
		this.anOutputStream1 = this.aSocket1.getOutputStream();
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(B)V")
	public void method5484() {
		if (this.aBoolean458) {
			return;
		}
		synchronized (this) {
			this.aBoolean458 = true;
			this.notifyAll();
		}
		if (this.aClass270_7 != null) {
			while (this.aClass270_7.anInt7548 == 0) {
				Static328.method5696(1L);
			}
			if (this.aClass270_7.anInt7548 == 1) {
				try {
					((Thread) this.aClass270_7.anObject9).join();
				} catch (@Pc(53) InterruptedException local53) {
				}
			}
		}
		this.aClass270_7 = null;
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(I)I")
	public int method5486() throws IOException {
		return this.aBoolean458 ? 0 : this.anInputStream1.available();
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(IIB[B)V")
	public void method5487(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		if (this.aBoolean458) {
			return;
		}
		while (arg1 > 0) {
			@Pc(18) int local18 = this.anInputStream1.read(arg2, arg0, arg1);
			if (local18 <= 0) {
				throw new EOFException();
			}
			arg0 += local18;
			arg1 -= local18;
		}
	}

	@OriginalMember(owner = "client!ur", name = "b", descriptor = "(B)V")
	public void method5488() {
		if (!this.aBoolean458) {
			this.anInputStream1 = new InputStream_Sub1();
			this.anOutputStream1 = new OutputStream_Sub1();
		}
	}

	@OriginalMember(owner = "client!ur", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method5484();
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(Z)V")
	public void method5492() throws IOException {
		if (!this.aBoolean458 && this.aBoolean457) {
			this.aBoolean457 = false;
			throw new IOException();
		}
	}

	@OriginalMember(owner = "client!ur", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				label80: {
					@Pc(40) int local40;
					@Pc(51) int local51;
					synchronized (this) {
						if (this.anInt6993 == this.anInt6999) {
							if (this.aBoolean458) {
								break label80;
							}
							try {
								this.wait();
							} catch (@Pc(24) InterruptedException local24) {
							}
						}
						if (this.anInt6993 > this.anInt6999) {
							local40 = 5000 - this.anInt6993;
						} else {
							local40 = this.anInt6999 - this.anInt6993;
						}
						local51 = this.anInt6993;
					}
					if (local40 <= 0) {
						continue;
					}
					try {
						this.anOutputStream1.write(this.aByteArray89, local51, local40);
					} catch (@Pc(71) IOException local71) {
						this.aBoolean457 = true;
					}
					this.anInt6993 = (local40 + this.anInt6993) % 5000;
					try {
						if (this.anInt6999 == this.anInt6993) {
							this.anOutputStream1.flush();
						}
					} catch (@Pc(96) IOException local96) {
						this.aBoolean457 = true;
					}
					continue;
				}
				try {
					if (this.anInputStream1 != null) {
						this.anInputStream1.close();
					}
					if (this.anOutputStream1 != null) {
						this.anOutputStream1.close();
					}
					if (this.aSocket1 != null) {
						this.aSocket1.close();
					}
				} catch (@Pc(120) IOException local120) {
				}
				this.aByteArray89 = null;
				break;
			}
		} catch (@Pc(125) Exception local125) {
			Static432.method5720(null, local125);
		}
	}

	@OriginalMember(owner = "client!ur", name = "d", descriptor = "(I)I")
	public int method5493() throws IOException {
		return this.aBoolean458 ? 0 : this.anInputStream1.read();
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(III[B)V")
	public void method5494(@OriginalArg(1) int arg0, @OriginalArg(3) byte[] arg1) throws IOException {
		if (this.aBoolean458) {
			return;
		}
		if (this.aBoolean457) {
			this.aBoolean457 = false;
			throw new IOException();
		}
		if (this.aByteArray89 == null) {
			this.aByteArray89 = new byte[5000];
		}
		synchronized (this) {
			for (@Pc(38) int local38 = 0; local38 < arg0; local38++) {
				this.aByteArray89[this.anInt6999] = arg1[local38];
				this.anInt6999 = (this.anInt6999 + 1) % 5000;
				if (this.anInt6999 == (this.anInt6993 + 4900) % 5000) {
					throw new IOException();
				}
			}
			if (this.aClass270_7 == null) {
				this.aClass270_7 = this.aClass159_4.method3496(3, this);
			}
			this.notifyAll();
		}
	}
}
