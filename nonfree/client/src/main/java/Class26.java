import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!NQABEVLK")
public final class Class26 implements Runnable {

	@OriginalMember(owner = "client!NQABEVLK", name = "i", descriptor = "[B")
	private byte[] aByteArray11;

	@OriginalMember(owner = "client!NQABEVLK", name = "j", descriptor = "I")
	private int anInt495;

	@OriginalMember(owner = "client!NQABEVLK", name = "k", descriptor = "I")
	private int anInt496;

	@OriginalMember(owner = "client!NQABEVLK", name = "a", descriptor = "I")
	private int anInt493 = -53;

	@OriginalMember(owner = "client!NQABEVLK", name = "b", descriptor = "Z")
	private boolean aBoolean116 = true;

	@OriginalMember(owner = "client!NQABEVLK", name = "c", descriptor = "I")
	private int anInt494 = 519;

	@OriginalMember(owner = "client!NQABEVLK", name = "g", descriptor = "Z")
	private boolean aBoolean117 = false;

	@OriginalMember(owner = "client!NQABEVLK", name = "l", descriptor = "Z")
	private boolean aBoolean118 = false;

	@OriginalMember(owner = "client!NQABEVLK", name = "m", descriptor = "Z")
	private boolean aBoolean119 = false;

	@OriginalMember(owner = "client!NQABEVLK", name = "h", descriptor = "Lclient!KHACHIFW;")
	private Applet_Sub1 anApplet_Sub1_2;

	@OriginalMember(owner = "client!NQABEVLK", name = "f", descriptor = "Ljava/net/Socket;")
	private Socket aSocket2;

	@OriginalMember(owner = "client!NQABEVLK", name = "d", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream2;

	@OriginalMember(owner = "client!NQABEVLK", name = "e", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream2;

	@OriginalMember(owner = "client!NQABEVLK", name = "<init>", descriptor = "(Lclient!KHACHIFW;ILjava/net/Socket;)V")
	public Class26(@OriginalArg(0) Applet_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Socket arg2) throws IOException {
		try {
			this.anApplet_Sub1_2 = arg0;
			this.aSocket2 = arg2;
			this.aSocket2.setSoTimeout(30000);
			this.aSocket2.setTcpNoDelay(true);
			this.anInputStream2 = this.aSocket2.getInputStream();
			this.anOutputStream2 = this.aSocket2.getOutputStream();
		} catch (@Pc(57) RuntimeException local57) {
			signlink.reporterror("56019, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local57.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NQABEVLK", name = "a", descriptor = "()V")
	public void method310() {
		this.aBoolean117 = true;
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
		this.aBoolean118 = false;
		synchronized (this) {
			this.notify();
		}
		this.aByteArray11 = null;
	}

	@OriginalMember(owner = "client!NQABEVLK", name = "b", descriptor = "()I")
	public int method311() throws IOException {
		return this.aBoolean117 ? 0 : this.anInputStream2.read();
	}

	@OriginalMember(owner = "client!NQABEVLK", name = "c", descriptor = "()I")
	public int method312() throws IOException {
		return this.aBoolean117 ? 0 : this.anInputStream2.available();
	}

	@OriginalMember(owner = "client!NQABEVLK", name = "a", descriptor = "([BII)V")
	public void method313(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		if (this.aBoolean117) {
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

	@OriginalMember(owner = "client!NQABEVLK", name = "a", descriptor = "(II[BI)V")
	public void method314(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) throws IOException {
		try {
			if (!this.aBoolean117) {
				if (this.aBoolean119) {
					this.aBoolean119 = false;
					throw new IOException("Error in writer thread");
				}
				if (this.aByteArray11 == null) {
					this.aByteArray11 = new byte[5000];
				}
				synchronized (this) {
					for (@Pc(28) int local28 = 0; local28 < arg0; local28++) {
						this.aByteArray11[this.anInt496] = arg1[local28 + 0];
						this.anInt496 = (this.anInt496 + 1) % 5000;
						if (this.anInt496 == (this.anInt495 + 4900) % 5000) {
							throw new IOException("buffer overflow");
						}
					}
					if (!this.aBoolean118) {
						this.aBoolean118 = true;
						this.anApplet_Sub1_2.method576(this, 3);
					}
					this.notify();
				}
			}
		} catch (@Pc(93) RuntimeException local93) {
			signlink.reporterror("71200, " + arg0 + ", " + 0 + ", " + arg1 + ", " + 0 + ", " + local93.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NQABEVLK", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean118) {
			@Pc(38) int local38;
			@Pc(27) int local27;
			synchronized (this) {
				if (this.anInt496 == this.anInt495) {
					try {
						this.wait();
					} catch (@Pc(16) InterruptedException local16) {
					}
				}
				if (!this.aBoolean118) {
					return;
				}
				local27 = this.anInt495;
				if (this.anInt496 >= this.anInt495) {
					local38 = this.anInt496 - this.anInt495;
				} else {
					local38 = 5000 - this.anInt495;
				}
			}
			if (local38 > 0) {
				try {
					this.anOutputStream2.write(this.aByteArray11, local27, local38);
				} catch (@Pc(62) IOException local62) {
					this.aBoolean119 = true;
				}
				this.anInt495 = (this.anInt495 + local38) % 5000;
				try {
					if (this.anInt496 == this.anInt495) {
						this.anOutputStream2.flush();
					}
				} catch (@Pc(83) IOException local83) {
					this.aBoolean119 = true;
				}
			}
		}
	}

	@OriginalMember(owner = "client!NQABEVLK", name = "a", descriptor = "(B)V")
	public void method315() {
		try {
			System.out.println("dummy:" + this.aBoolean117);
			System.out.println("tcycl:" + this.anInt495);
			System.out.println("tnum:" + this.anInt496);
			System.out.println("writer:" + this.aBoolean118);
			System.out.println("ioerror:" + this.aBoolean119);
			try {
				System.out.println("available:" + this.method312());
			} catch (@Pc(67) IOException local67) {
			}
		} catch (@Pc(69) RuntimeException local69) {
			signlink.reporterror("41293, " + 1 + ", " + local69.toString());
			throw new RuntimeException();
		}
	}
}
