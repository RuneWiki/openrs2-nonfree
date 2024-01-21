import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ff")
public final class Class27 implements Runnable {

	@OriginalMember(owner = "client!ff", name = "d", descriptor = "[B")
	private byte[] aByteArray6;

	@OriginalMember(owner = "client!ff", name = "C", descriptor = "Lclient!ma;")
	private Class48 aClass48_2;

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "I")
	private int anInt807 = 0;

	@OriginalMember(owner = "client!ff", name = "x", descriptor = "Z")
	private boolean aBoolean53 = false;

	@OriginalMember(owner = "client!ff", name = "s", descriptor = "I")
	private int anInt813 = 0;

	@OriginalMember(owner = "client!ff", name = "D", descriptor = "Z")
	private boolean aBoolean54 = false;

	@OriginalMember(owner = "client!ff", name = "J", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket1;

	@OriginalMember(owner = "client!ff", name = "k", descriptor = "Lclient!g;")
	private final Class28 aClass28_4;

	@OriginalMember(owner = "client!ff", name = "u", descriptor = "Ljava/io/InputStream;")
	private final InputStream anInputStream1;

	@OriginalMember(owner = "client!ff", name = "q", descriptor = "Ljava/io/OutputStream;")
	private final OutputStream anOutputStream1;

	@OriginalMember(owner = "client!ff", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!g;)V")
	public Class27(@OriginalArg(0) Socket arg0, @OriginalArg(1) Class28 arg1) throws IOException {
		this.aSocket1 = arg0;
		this.aClass28_4 = arg1;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.anInputStream1 = this.aSocket1.getInputStream();
		this.anOutputStream1 = this.aSocket1.getOutputStream();
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(B)I")
	public int method559() throws IOException {
		return this.aBoolean54 ? 0 : this.anInputStream1.available();
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(ZII[B)V")
	public void method560(@OriginalArg(1) int arg0, @OriginalArg(3) byte[] arg1) throws IOException {
		if (this.aBoolean54) {
			return;
		}
		if (this.aBoolean53) {
			this.aBoolean53 = false;
			throw new IOException();
		}
		if (this.aByteArray6 == null) {
			this.aByteArray6 = new byte[5000];
		}
		synchronized (this) {
			for (@Pc(38) int local38 = 0; local38 < arg0; local38++) {
				this.aByteArray6[this.anInt813] = arg1[local38];
				this.anInt813 = (this.anInt813 + 1) % 5000;
				if (this.anInt813 == (this.anInt807 + 4900) % 5000) {
					throw new IOException();
				}
			}
			if (this.aClass48_2 == null) {
				this.aClass48_2 = this.aClass28_4.method579(3, this);
			}
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(I)V")
	public void method562() {
		if (this.aBoolean54) {
			return;
		}
		synchronized (this) {
			this.aBoolean54 = true;
			this.notifyAll();
		}
		if (this.aClass48_2 != null) {
			while (this.aClass48_2.anInt1534 == 0) {
				Static117.method2058(1L);
			}
			if (this.aClass48_2.anInt1534 == 1) {
				try {
					((Thread) this.aClass48_2.anObject5).join();
				} catch (@Pc(61) InterruptedException local61) {
				}
			}
		}
		this.aClass48_2 = null;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(I[BII)V")
	public void method563(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) throws IOException {
		if (this.aBoolean54) {
			return;
		}
		while (arg2 > 0) {
			@Pc(17) int local17 = this.anInputStream1.read(arg1, arg0, arg2);
			if (local17 <= 0) {
				throw new EOFException();
			}
			arg2 -= local17;
			arg0 += local17;
		}
	}

	@OriginalMember(owner = "client!ff", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method562();
	}

	@OriginalMember(owner = "client!ff", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				label77: {
					@Pc(41) int local41;
					@Pc(51) int local51;
					synchronized (this) {
						if (this.anInt813 == this.anInt807) {
							if (this.aBoolean54) {
								break label77;
							}
							try {
								this.wait();
							} catch (@Pc(28) InterruptedException local28) {
							}
						}
						if (this.anInt807 <= this.anInt813) {
							local41 = this.anInt813 - this.anInt807;
						} else {
							local41 = 5000 - this.anInt807;
						}
						local51 = this.anInt807;
					}
					if (local41 <= 0) {
						continue;
					}
					try {
						this.anOutputStream1.write(this.aByteArray6, local51, local41);
					} catch (@Pc(71) IOException local71) {
						this.aBoolean53 = true;
					}
					this.anInt807 = (local41 + this.anInt807) % 5000;
					try {
						if (this.anInt807 == this.anInt813) {
							this.anOutputStream1.flush();
						}
					} catch (@Pc(92) IOException local92) {
						this.aBoolean53 = true;
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
				} catch (@Pc(116) IOException local116) {
				}
				this.aByteArray6 = null;
				return;
			}
		} catch (@Pc(121) Exception local121) {
			Static99.method1601(local121, null);
		}
	}

	@OriginalMember(owner = "client!ff", name = "b", descriptor = "(I)I")
	public int method567() throws IOException {
		return this.aBoolean54 ? 0 : this.anInputStream1.read();
	}
}
