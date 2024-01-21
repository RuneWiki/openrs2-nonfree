import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!JHRYTWFZ")
public final class Class16 implements Runnable {

	@OriginalMember(owner = "client!JHRYTWFZ", name = "h", descriptor = "[B")
	private byte[] aByteArray7;

	@OriginalMember(owner = "client!JHRYTWFZ", name = "i", descriptor = "I")
	private int anInt345;

	@OriginalMember(owner = "client!JHRYTWFZ", name = "j", descriptor = "I")
	private int anInt346;

	@OriginalMember(owner = "client!JHRYTWFZ", name = "a", descriptor = "Z")
	private boolean aBoolean76 = true;

	@OriginalMember(owner = "client!JHRYTWFZ", name = "b", descriptor = "Z")
	private boolean aBoolean77 = true;

	@OriginalMember(owner = "client!JHRYTWFZ", name = "f", descriptor = "Z")
	private boolean aBoolean78 = false;

	@OriginalMember(owner = "client!JHRYTWFZ", name = "k", descriptor = "Z")
	private boolean aBoolean79 = false;

	@OriginalMember(owner = "client!JHRYTWFZ", name = "l", descriptor = "Z")
	private boolean aBoolean80 = false;

	@OriginalMember(owner = "client!JHRYTWFZ", name = "g", descriptor = "Lclient!TFSZPSRF;")
	private Applet_Sub1 anApplet_Sub1_2;

	@OriginalMember(owner = "client!JHRYTWFZ", name = "e", descriptor = "Ljava/net/Socket;")
	private Socket aSocket2;

	@OriginalMember(owner = "client!JHRYTWFZ", name = "c", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream2;

	@OriginalMember(owner = "client!JHRYTWFZ", name = "d", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream2;

	@OriginalMember(owner = "client!JHRYTWFZ", name = "<init>", descriptor = "(Ljava/net/Socket;ILclient!TFSZPSRF;)V")
	public Class16(@OriginalArg(0) Socket arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Applet_Sub1 arg2) throws IOException {
		try {
			this.anApplet_Sub1_2 = arg2;
			this.aSocket2 = arg0;
			this.aSocket2.setSoTimeout(30000);
			this.aSocket2.setTcpNoDelay(true);
			this.anInputStream2 = this.aSocket2.getInputStream();
			this.anOutputStream2 = this.aSocket2.getOutputStream();
		} catch (@Pc(49) RuntimeException local49) {
			signlink.reporterror("12842, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local49.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JHRYTWFZ", name = "a", descriptor = "()V")
	public void method225() {
		this.aBoolean78 = true;
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
		} catch (@Pc(22) IOException local22) {
			System.out.println("Error closing stream");
		}
		this.aBoolean79 = false;
		synchronized (this) {
			this.notify();
		}
		this.aByteArray7 = null;
	}

	@OriginalMember(owner = "client!JHRYTWFZ", name = "b", descriptor = "()I")
	public int method226() throws IOException {
		return this.aBoolean78 ? 0 : this.anInputStream2.read();
	}

	@OriginalMember(owner = "client!JHRYTWFZ", name = "c", descriptor = "()I")
	public int method227() throws IOException {
		return this.aBoolean78 ? 0 : this.anInputStream2.available();
	}

	@OriginalMember(owner = "client!JHRYTWFZ", name = "a", descriptor = "([BII)V")
	public void method228(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		if (this.aBoolean78) {
			return;
		}
		while (arg2 > 0) {
			@Pc(11) int local11 = this.anInputStream2.read(arg0, arg1, arg2);
			if (local11 <= 0) {
				throw new IOException("EOF");
			}
			arg1 += local11;
			arg2 -= local11;
		}
	}

	@OriginalMember(owner = "client!JHRYTWFZ", name = "a", descriptor = "([BIII)V")
	public void method229(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) throws IOException {
		try {
			if (!this.aBoolean78) {
				if (this.aBoolean80) {
					this.aBoolean80 = false;
					throw new IOException("Error in writer thread");
				}
				if (this.aByteArray7 == null) {
					this.aByteArray7 = new byte[5000];
				}
				synchronized (this) {
					for (@Pc(28) int local28 = 0; local28 < arg1; local28++) {
						this.aByteArray7[this.anInt346] = arg0[local28 + 0];
						this.anInt346 = (this.anInt346 + 1) % 5000;
						if (this.anInt346 == (this.anInt345 + 4900) % 5000) {
							throw new IOException("buffer overflow");
						}
					}
					if (!this.aBoolean79) {
						this.aBoolean79 = true;
						this.anApplet_Sub1_2.method550(this, 3);
					}
					this.notify();
				}
			}
		} catch (@Pc(98) RuntimeException local98) {
			signlink.reporterror("94352, " + arg0 + ", " + arg1 + ", " + 0 + ", " + 0 + ", " + local98.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JHRYTWFZ", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean79) {
			@Pc(38) int local38;
			@Pc(27) int local27;
			synchronized (this) {
				if (this.anInt346 == this.anInt345) {
					try {
						this.wait();
					} catch (@Pc(16) InterruptedException local16) {
					}
				}
				if (!this.aBoolean79) {
					return;
				}
				local27 = this.anInt345;
				if (this.anInt346 >= this.anInt345) {
					local38 = this.anInt346 - this.anInt345;
				} else {
					local38 = 5000 - this.anInt345;
				}
			}
			if (local38 > 0) {
				try {
					this.anOutputStream2.write(this.aByteArray7, local27, local38);
				} catch (@Pc(62) IOException local62) {
					this.aBoolean80 = true;
				}
				this.anInt345 = (this.anInt345 + local38) % 5000;
				try {
					if (this.anInt346 == this.anInt345) {
						this.anOutputStream2.flush();
					}
				} catch (@Pc(83) IOException local83) {
					this.aBoolean80 = true;
				}
			}
		}
	}

	@OriginalMember(owner = "client!JHRYTWFZ", name = "a", descriptor = "(Z)V")
	public void method230(@OriginalArg(0) boolean arg0) {
		try {
			System.out.println("dummy:" + this.aBoolean78);
			if (arg0) {
				System.out.println("tcycl:" + this.anInt345);
				System.out.println("tnum:" + this.anInt346);
				System.out.println("writer:" + this.aBoolean79);
				System.out.println("ioerror:" + this.aBoolean80);
				try {
					System.out.println("available:" + this.method227());
				} catch (@Pc(64) IOException local64) {
				}
			}
		} catch (@Pc(66) RuntimeException local66) {
			signlink.reporterror("36850, " + arg0 + ", " + local66.toString());
			throw new RuntimeException();
		}
	}
}
