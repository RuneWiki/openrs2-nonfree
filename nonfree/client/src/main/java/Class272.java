import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qg")
public final class Class272 implements Runnable {

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "[B")
	private byte[] aByteArray91;

	@OriginalMember(owner = "client!qg", name = "d", descriptor = "Lclient!nga;")
	private Class234 aClass234_7;

	@OriginalMember(owner = "client!qg", name = "b", descriptor = "I")
	private int anInt7947 = 0;

	@OriginalMember(owner = "client!qg", name = "n", descriptor = "Z")
	private boolean aBoolean545 = false;

	@OriginalMember(owner = "client!qg", name = "t", descriptor = "Z")
	private boolean aBoolean546 = false;

	@OriginalMember(owner = "client!qg", name = "f", descriptor = "I")
	private int anInt7950 = 0;

	@OriginalMember(owner = "client!qg", name = "m", descriptor = "Lclient!wd;")
	private final Class354 aClass354_6;

	@OriginalMember(owner = "client!qg", name = "w", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket1;

	@OriginalMember(owner = "client!qg", name = "v", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream1;

	@OriginalMember(owner = "client!qg", name = "o", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream2;

	@OriginalMember(owner = "client!qg", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!wd;)V")
	public Class272(@OriginalArg(0) Socket arg0, @OriginalArg(1) Class354 arg1) throws IOException {
		this.aClass354_6 = arg1;
		this.aSocket1 = arg0;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.anInputStream1 = this.aSocket1.getInputStream();
		this.anOutputStream2 = this.aSocket1.getOutputStream();
	}

	@OriginalMember(owner = "client!qg", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method6618();
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(Z)V")
	public void method6613() throws IOException {
		if (!this.aBoolean545 && this.aBoolean546) {
			this.aBoolean546 = false;
			throw new IOException();
		}
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "([BBII)V")
	public void method6615(@OriginalArg(0) byte[] arg0, @OriginalArg(3) int arg1) throws IOException {
		if (this.aBoolean545) {
			return;
		}
		if (this.aBoolean546) {
			this.aBoolean546 = false;
			throw new IOException();
		}
		if (this.aByteArray91 == null) {
			this.aByteArray91 = new byte[5000];
		}
		synchronized (this) {
			for (@Pc(37) int local37 = 0; local37 < arg1; local37++) {
				this.aByteArray91[this.anInt7950] = arg0[local37];
				this.anInt7950 = (this.anInt7950 + 1) % 5000;
				if ((this.anInt7947 + 4900) % 5000 == this.anInt7950) {
					throw new IOException();
				}
			}
			if (this.aClass234_7 == null) {
				this.aClass234_7 = this.aClass354_6.method8231(this, 3);
			}
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(I)I")
	public int method6616() throws IOException {
		return this.aBoolean545 ? 0 : this.anInputStream1.read();
	}

	@OriginalMember(owner = "client!qg", name = "b", descriptor = "(I)V")
	public void method6618() {
		if (this.aBoolean545) {
			return;
		}
		synchronized (this) {
			this.aBoolean545 = true;
			this.notifyAll();
		}
		if (this.aClass234_7 != null) {
			while (this.aClass234_7.anInt6717 == 0) {
				Static63.method1019(1L);
			}
			if (this.aClass234_7.anInt6717 == 1) {
				try {
					((Thread) this.aClass234_7.anObject16).join();
				} catch (@Pc(54) InterruptedException local54) {
				}
			}
		}
		this.aClass234_7 = null;
	}

	@OriginalMember(owner = "client!qg", name = "c", descriptor = "(I)V")
	public void method6619() {
		if (!this.aBoolean545) {
			this.anInputStream1 = new InputStream_Sub1();
			this.anOutputStream2 = new OutputStream_Sub2();
		}
	}

	@OriginalMember(owner = "client!qg", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				label77: {
					@Pc(40) int local40;
					@Pc(28) int local28;
					synchronized (this) {
						if (this.anInt7947 == this.anInt7950) {
							if (this.aBoolean545) {
								break label77;
							}
							try {
								this.wait();
							} catch (@Pc(24) InterruptedException local24) {
							}
						}
						local28 = this.anInt7947;
						if (this.anInt7950 >= this.anInt7947) {
							local40 = this.anInt7950 - this.anInt7947;
						} else {
							local40 = 5000 - this.anInt7947;
						}
					}
					if (local40 <= 0) {
						continue;
					}
					try {
						this.anOutputStream2.write(this.aByteArray91, local28, local40);
					} catch (@Pc(65) IOException local65) {
						this.aBoolean546 = true;
					}
					this.anInt7947 = (local40 + this.anInt7947) % 5000;
					try {
						if (this.anInt7950 == this.anInt7947) {
							this.anOutputStream2.flush();
						}
					} catch (@Pc(86) IOException local86) {
						this.aBoolean546 = true;
					}
					continue;
				}
				try {
					if (this.anInputStream1 != null) {
						this.anInputStream1.close();
					}
					if (this.anOutputStream2 != null) {
						this.anOutputStream2.close();
					}
					if (this.aSocket1 != null) {
						this.aSocket1.close();
					}
				} catch (@Pc(110) IOException local110) {
				}
				this.aByteArray91 = null;
				return;
			}
		} catch (@Pc(115) Exception local115) {
			Static205.method3450(null, local115);
		}
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(BI[BI)V")
	public void method6620(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		if (this.aBoolean545) {
			return;
		}
		while (arg2 > 0) {
			@Pc(23) int local23 = this.anInputStream1.read(arg1, arg0, arg2);
			if (local23 <= 0) {
				throw new EOFException();
			}
			arg2 -= local23;
			arg0 += local23;
		}
	}

	@OriginalMember(owner = "client!qg", name = "b", descriptor = "(Z)I")
	public int method6621() throws IOException {
		return this.aBoolean545 ? 0 : this.anInputStream1.available();
	}
}
