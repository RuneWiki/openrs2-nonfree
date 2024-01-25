import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!al")
public final class Class11 implements Runnable {

	@OriginalMember(owner = "client!al", name = "b", descriptor = "[B")
	private byte[] aByteArray3;

	@OriginalMember(owner = "client!al", name = "n", descriptor = "Lclient!qt;")
	private Class199 aClass199_1;

	@OriginalMember(owner = "client!al", name = "s", descriptor = "Z")
	private boolean aBoolean19 = false;

	@OriginalMember(owner = "client!al", name = "x", descriptor = "Z")
	private boolean aBoolean20 = false;

	@OriginalMember(owner = "client!al", name = "c", descriptor = "I")
	private int anInt170 = 0;

	@OriginalMember(owner = "client!al", name = "t", descriptor = "I")
	private int anInt183 = 0;

	@OriginalMember(owner = "client!al", name = "w", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket1;

	@OriginalMember(owner = "client!al", name = "f", descriptor = "Lclient!et;")
	private final Class66 aClass66_1;

	@OriginalMember(owner = "client!al", name = "u", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream1;

	@OriginalMember(owner = "client!al", name = "a", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream1;

	@OriginalMember(owner = "client!al", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!et;)V")
	public Class11(@OriginalArg(0) Socket arg0, @OriginalArg(1) Class66 arg1) throws IOException {
		this.aSocket1 = arg0;
		this.aClass66_1 = arg1;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.anInputStream1 = this.aSocket1.getInputStream();
		this.anOutputStream1 = this.aSocket1.getOutputStream();
	}

	@OriginalMember(owner = "client!al", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method138();
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(IBI[B)V")
	public void method131(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		if (this.aBoolean19) {
			return;
		}
		while (arg1 > 0) {
			@Pc(23) int local23 = this.anInputStream1.read(arg2, arg0, arg1);
			if (local23 <= 0) {
				throw new EOFException();
			}
			arg1 -= local23;
			arg0 += local23;
		}
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(I)V")
	public void method132() {
		if (!this.aBoolean19) {
			this.anInputStream1 = new InputStream_Sub1();
			this.anOutputStream1 = new OutputStream_Sub1();
		}
	}

	@OriginalMember(owner = "client!al", name = "b", descriptor = "(I)I")
	public int method133() throws IOException {
		return this.aBoolean19 ? 0 : this.anInputStream1.available();
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(Z)V")
	public void method138() {
		if (this.aBoolean19) {
			return;
		}
		synchronized (this) {
			this.aBoolean19 = true;
			this.notifyAll();
		}
		if (this.aClass199_1 != null) {
			while (this.aClass199_1.anInt5760 == 0) {
				Static435.method5503(1L);
			}
			if (this.aClass199_1.anInt5760 == 1) {
				try {
					((Thread) this.aClass199_1.anObject29).join();
				} catch (@Pc(56) InterruptedException local56) {
				}
			}
		}
		this.aClass199_1 = null;
	}

	@OriginalMember(owner = "client!al", name = "d", descriptor = "(I)I")
	public int method139() throws IOException {
		return this.aBoolean19 ? 0 : this.anInputStream1.read();
	}

	@OriginalMember(owner = "client!al", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				label80: {
					@Pc(40) int local40;
					@Pc(28) int local28;
					synchronized (this) {
						if (this.anInt183 == this.anInt170) {
							if (this.aBoolean19) {
								break label80;
							}
							try {
								this.wait();
							} catch (@Pc(24) InterruptedException local24) {
							}
						}
						local28 = this.anInt170;
						if (this.anInt170 <= this.anInt183) {
							local40 = this.anInt183 - this.anInt170;
						} else {
							local40 = 5000 - this.anInt170;
						}
					}
					if (local40 <= 0) {
						continue;
					}
					try {
						this.anOutputStream1.write(this.aByteArray3, local28, local40);
					} catch (@Pc(65) IOException local65) {
						this.aBoolean20 = true;
					}
					this.anInt170 = (local40 + this.anInt170) % 5000;
					try {
						if (this.anInt183 == this.anInt170) {
							this.anOutputStream1.flush();
						}
					} catch (@Pc(86) IOException local86) {
						this.aBoolean20 = true;
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
				} catch (@Pc(110) IOException local110) {
				}
				this.aByteArray3 = null;
				break;
			}
		} catch (@Pc(115) Exception local115) {
			Static94.method1654(local115, null);
		}
	}

	@OriginalMember(owner = "client!al", name = "e", descriptor = "(I)V")
	public void method141() throws IOException {
		if (!this.aBoolean19 && this.aBoolean20) {
			this.aBoolean20 = false;
			throw new IOException();
		}
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(II[BI)V")
	public void method142(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) throws IOException {
		if (this.aBoolean19) {
			return;
		}
		if (this.aBoolean20) {
			this.aBoolean20 = false;
			throw new IOException();
		}
		if (this.aByteArray3 == null) {
			this.aByteArray3 = new byte[5000];
		}
		synchronized (this) {
			for (@Pc(38) int local38 = 0; local38 < arg0; local38++) {
				this.aByteArray3[this.anInt183] = arg1[local38];
				this.anInt183 = (this.anInt183 + 1) % 5000;
				if (this.anInt183 == (this.anInt170 + 4900) % 5000) {
					throw new IOException();
				}
			}
			if (this.aClass199_1 == null) {
				this.aClass199_1 = this.aClass66_1.method1741(3, this);
			}
			this.notifyAll();
		}
	}
}
