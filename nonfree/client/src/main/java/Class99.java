import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!faa")
public final class Class99 implements Runnable {

	@OriginalMember(owner = "client!faa", name = "j", descriptor = "[B")
	private byte[] aByteArray21;

	@OriginalMember(owner = "client!faa", name = "y", descriptor = "Lclient!tj;")
	private Class316 aClass316_2;

	@OriginalMember(owner = "client!faa", name = "h", descriptor = "I")
	private int anInt2964 = 0;

	@OriginalMember(owner = "client!faa", name = "i", descriptor = "Z")
	private boolean aBoolean220 = false;

	@OriginalMember(owner = "client!faa", name = "u", descriptor = "I")
	private int anInt2971 = 0;

	@OriginalMember(owner = "client!faa", name = "t", descriptor = "Z")
	private boolean aBoolean221 = false;

	@OriginalMember(owner = "client!faa", name = "q", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket2;

	@OriginalMember(owner = "client!faa", name = "d", descriptor = "Lclient!wv;")
	private final Class366 aClass366_1;

	@OriginalMember(owner = "client!faa", name = "x", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream1;

	@OriginalMember(owner = "client!faa", name = "c", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream1;

	@OriginalMember(owner = "client!faa", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!wv;)V")
	public Class99(@OriginalArg(0) Socket arg0, @OriginalArg(1) Class366 arg1) throws IOException {
		this.aSocket2 = arg0;
		this.aClass366_1 = arg1;
		this.aSocket2.setSoTimeout(30000);
		this.aSocket2.setTcpNoDelay(true);
		this.anInputStream1 = this.aSocket2.getInputStream();
		this.anOutputStream1 = this.aSocket2.getOutputStream();
	}

	@OriginalMember(owner = "client!faa", name = "a", descriptor = "(Z)V")
	public void method2390() {
		if (!this.aBoolean220) {
			this.anInputStream1 = new InputStream_Sub2();
			this.anOutputStream1 = new OutputStream_Sub1();
		}
	}

	@OriginalMember(owner = "client!faa", name = "a", descriptor = "(I)V")
	public void method2391() {
		if (this.aBoolean220) {
			return;
		}
		synchronized (this) {
			this.aBoolean220 = true;
			this.notifyAll();
		}
		if (this.aClass316_2 != null) {
			while (this.aClass316_2.anInt9478 == 0) {
				Static214.method3478(1L);
			}
			if (this.aClass316_2.anInt9478 == 1) {
				try {
					((Thread) this.aClass316_2.anObject136).join();
				} catch (@Pc(57) InterruptedException local57) {
				}
			}
		}
		this.aClass316_2 = null;
	}

	@OriginalMember(owner = "client!faa", name = "a", descriptor = "(III[B)V")
	public void method2392(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		if (this.aBoolean220) {
			return;
		}
		while (arg0 > 0) {
			@Pc(18) int local18 = this.anInputStream1.read(arg2, arg1, arg0);
			if (local18 <= 0) {
				throw new EOFException();
			}
			arg1 += local18;
			arg0 -= local18;
		}
	}

	@OriginalMember(owner = "client!faa", name = "a", descriptor = "(B)V")
	public void method2394() throws IOException {
		if (!this.aBoolean220 && this.aBoolean221) {
			this.aBoolean221 = false;
			throw new IOException();
		}
	}

	@OriginalMember(owner = "client!faa", name = "a", descriptor = "(I[BII)V")
	public void method2395(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) throws IOException {
		if (this.aBoolean220) {
			return;
		}
		if (this.aBoolean221) {
			this.aBoolean221 = false;
			throw new IOException();
		}
		if (this.aByteArray21 == null) {
			this.aByteArray21 = new byte[5000];
		}
		synchronized (this) {
			for (@Pc(32) int local32 = 0; local32 < arg1; local32++) {
				this.aByteArray21[this.anInt2964] = arg0[local32];
				this.anInt2964 = (this.anInt2964 + 1) % 5000;
				if ((this.anInt2971 + 4900) % 5000 == this.anInt2964) {
					throw new IOException();
				}
			}
			if (this.aClass316_2 == null) {
				this.aClass316_2 = this.aClass366_1.method8285(this, 3);
			}
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!faa", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method2391();
	}

	@OriginalMember(owner = "client!faa", name = "b", descriptor = "(B)I")
	public int method2396() throws IOException {
		return this.aBoolean220 ? 0 : this.anInputStream1.available();
	}

	@OriginalMember(owner = "client!faa", name = "c", descriptor = "(B)I")
	public int method2397() throws IOException {
		return this.aBoolean220 ? 0 : this.anInputStream1.read();
	}

	@OriginalMember(owner = "client!faa", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				label77: {
					@Pc(35) int local35;
					@Pc(47) int local47;
					synchronized (this) {
						if (this.anInt2971 == this.anInt2964) {
							if (this.aBoolean220) {
								break label77;
							}
							try {
								this.wait();
							} catch (@Pc(24) InterruptedException local24) {
							}
						}
						if (this.anInt2964 < this.anInt2971) {
							local35 = 5000 - this.anInt2971;
						} else {
							local35 = this.anInt2964 - this.anInt2971;
						}
						local47 = this.anInt2971;
					}
					if (local35 <= 0) {
						continue;
					}
					try {
						this.anOutputStream1.write(this.aByteArray21, local47, local35);
					} catch (@Pc(67) IOException local67) {
						this.aBoolean221 = true;
					}
					this.anInt2971 = (local35 + this.anInt2971) % 5000;
					try {
						if (this.anInt2964 == this.anInt2971) {
							this.anOutputStream1.flush();
						}
					} catch (@Pc(92) IOException local92) {
						this.aBoolean221 = true;
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
					if (this.aSocket2 != null) {
						this.aSocket2.close();
					}
				} catch (@Pc(116) IOException local116) {
				}
				this.aByteArray21 = null;
				return;
			}
		} catch (@Pc(121) Exception local121) {
			Static109.method2014(null, local121);
		}
	}
}
