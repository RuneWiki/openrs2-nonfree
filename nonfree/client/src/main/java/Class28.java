import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!OLIDOILN")
public final class Class28 implements Runnable {

	@OriginalMember(owner = "client!OLIDOILN", name = "g", descriptor = "[B")
	private byte[] aByteArray12;

	@OriginalMember(owner = "client!OLIDOILN", name = "h", descriptor = "I")
	private int anInt480;

	@OriginalMember(owner = "client!OLIDOILN", name = "i", descriptor = "I")
	private int anInt481;

	@OriginalMember(owner = "client!OLIDOILN", name = "a", descriptor = "Z")
	private boolean aBoolean117 = false;

	@OriginalMember(owner = "client!OLIDOILN", name = "e", descriptor = "Z")
	private boolean aBoolean118 = false;

	@OriginalMember(owner = "client!OLIDOILN", name = "j", descriptor = "Z")
	private boolean aBoolean119 = false;

	@OriginalMember(owner = "client!OLIDOILN", name = "k", descriptor = "Z")
	private boolean aBoolean120 = false;

	@OriginalMember(owner = "client!OLIDOILN", name = "f", descriptor = "Lclient!LJUNUWBY;")
	private Applet_Sub1 anApplet_Sub1_2;

	@OriginalMember(owner = "client!OLIDOILN", name = "d", descriptor = "Ljava/net/Socket;")
	private Socket aSocket1;

	@OriginalMember(owner = "client!OLIDOILN", name = "b", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream1;

	@OriginalMember(owner = "client!OLIDOILN", name = "c", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream1;

	@OriginalMember(owner = "client!OLIDOILN", name = "<init>", descriptor = "(Lclient!LJUNUWBY;ILjava/net/Socket;)V")
	public Class28(@OriginalArg(0) Applet_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Socket arg2) throws IOException {
		try {
			this.anApplet_Sub1_2 = arg0;
			this.aSocket1 = arg2;
			this.aSocket1.setSoTimeout(30000);
			this.aSocket1.setTcpNoDelay(true);
			this.anInputStream1 = this.aSocket1.getInputStream();
			this.anOutputStream1 = this.aSocket1.getOutputStream();
		} catch (@Pc(48) RuntimeException local48) {
			signlink.reporterror("88047, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local48.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OLIDOILN", name = "a", descriptor = "()V")
	public void method279() {
		this.aBoolean118 = true;
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
		} catch (@Pc(22) IOException local22) {
			System.out.println("Error closing stream");
		}
		this.aBoolean119 = false;
		synchronized (this) {
			this.notify();
		}
		this.aByteArray12 = null;
	}

	@OriginalMember(owner = "client!OLIDOILN", name = "b", descriptor = "()I")
	public int method280() throws IOException {
		return this.aBoolean118 ? 0 : this.anInputStream1.read();
	}

	@OriginalMember(owner = "client!OLIDOILN", name = "c", descriptor = "()I")
	public int method281() throws IOException {
		return this.aBoolean118 ? 0 : this.anInputStream1.available();
	}

	@OriginalMember(owner = "client!OLIDOILN", name = "a", descriptor = "([BII)V")
	public void method282(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		if (this.aBoolean118) {
			return;
		}
		while (arg2 > 0) {
			@Pc(11) int local11 = this.anInputStream1.read(arg0, arg1, arg2);
			if (local11 <= 0) {
				throw new IOException("EOF");
			}
			arg1 += local11;
			arg2 -= local11;
		}
	}

	@OriginalMember(owner = "client!OLIDOILN", name = "a", descriptor = "(II[BI)V")
	public void method283(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if (!this.aBoolean118) {
				if (this.aBoolean120) {
					this.aBoolean120 = false;
					throw new IOException("Error in writer thread");
				}
				if (this.aByteArray12 == null) {
					this.aByteArray12 = new byte[5000];
				}
				synchronized (this) {
					@Pc(28) int local28 = 0;
					while (true) {
						if (local28 >= arg0) {
							if (!this.aBoolean119) {
								this.aBoolean119 = true;
								this.anApplet_Sub1_2.method587(this, 3);
							}
							this.notify();
							break;
						}
						this.aByteArray12[this.anInt481] = arg1[local28 + 0];
						this.anInt481 = (this.anInt481 + 1) % 5000;
						if (this.anInt481 == (this.anInt480 + 4900) % 5000) {
							throw new IOException("buffer overflow");
						}
						local28++;
					}
				}
				if (arg2 < 5 || arg2 > 5) {
					;
				}
			}
		} catch (@Pc(94) RuntimeException local94) {
			signlink.reporterror("57300, " + 0 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local94.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OLIDOILN", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean119) {
			@Pc(38) int local38;
			@Pc(27) int local27;
			synchronized (this) {
				if (this.anInt481 == this.anInt480) {
					try {
						this.wait();
					} catch (@Pc(16) InterruptedException local16) {
					}
				}
				if (!this.aBoolean119) {
					return;
				}
				local27 = this.anInt480;
				if (this.anInt481 >= this.anInt480) {
					local38 = this.anInt481 - this.anInt480;
				} else {
					local38 = 5000 - this.anInt480;
				}
			}
			if (local38 > 0) {
				try {
					this.anOutputStream1.write(this.aByteArray12, local27, local38);
				} catch (@Pc(62) IOException local62) {
					this.aBoolean120 = true;
				}
				this.anInt480 = (this.anInt480 + local38) % 5000;
				try {
					if (this.anInt481 == this.anInt480) {
						this.anOutputStream1.flush();
					}
				} catch (@Pc(83) IOException local83) {
					this.aBoolean120 = true;
				}
			}
		}
	}

	@OriginalMember(owner = "client!OLIDOILN", name = "a", descriptor = "(Z)V")
	public void method284() {
		try {
			System.out.println("dummy:" + this.aBoolean118);
			System.out.println("tcycl:" + this.anInt480);
			System.out.println("tnum:" + this.anInt481);
			System.out.println("writer:" + this.aBoolean119);
			System.out.println("ioerror:" + this.aBoolean120);
			try {
				System.out.println("available:" + this.method281());
			} catch (@Pc(71) IOException local71) {
			}
		} catch (@Pc(73) RuntimeException local73) {
			signlink.reporterror("7934, " + false + ", " + local73.toString());
			throw new RuntimeException();
		}
	}
}
