import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!HUWYSFFT")
public final class Class16 implements Runnable {

	@OriginalMember(owner = "client!HUWYSFFT", name = "g", descriptor = "[B")
	private byte[] aByteArray4;

	@OriginalMember(owner = "client!HUWYSFFT", name = "h", descriptor = "I")
	private int anInt232;

	@OriginalMember(owner = "client!HUWYSFFT", name = "i", descriptor = "I")
	private int anInt233;

	@OriginalMember(owner = "client!HUWYSFFT", name = "a", descriptor = "Z")
	private boolean aBoolean74 = false;

	@OriginalMember(owner = "client!HUWYSFFT", name = "e", descriptor = "Z")
	private boolean aBoolean75 = false;

	@OriginalMember(owner = "client!HUWYSFFT", name = "j", descriptor = "Z")
	private boolean aBoolean76 = false;

	@OriginalMember(owner = "client!HUWYSFFT", name = "k", descriptor = "Z")
	private boolean aBoolean77 = false;

	@OriginalMember(owner = "client!HUWYSFFT", name = "f", descriptor = "Lclient!VZUGTFOW;")
	private Applet_Sub1 anApplet_Sub1_1;

	@OriginalMember(owner = "client!HUWYSFFT", name = "d", descriptor = "Ljava/net/Socket;")
	private Socket aSocket1;

	@OriginalMember(owner = "client!HUWYSFFT", name = "b", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream1;

	@OriginalMember(owner = "client!HUWYSFFT", name = "c", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream1;

	@OriginalMember(owner = "client!HUWYSFFT", name = "<init>", descriptor = "(ZLjava/net/Socket;Lclient!VZUGTFOW;)V")
	public Class16(@OriginalArg(0) boolean arg0, @OriginalArg(1) Socket arg1, @OriginalArg(2) Applet_Sub1 arg2) throws IOException {
		try {
			this.anApplet_Sub1_1 = arg2;
			this.aSocket1 = arg1;
			this.aSocket1.setSoTimeout(30000);
			this.aSocket1.setTcpNoDelay(true);
			this.anInputStream1 = this.aSocket1.getInputStream();
			this.anOutputStream1 = this.aSocket1.getOutputStream();
		} catch (@Pc(49) RuntimeException local49) {
			signlink.reporterror("30470, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local49.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HUWYSFFT", name = "a", descriptor = "()V")
	public void method126() {
		this.aBoolean75 = true;
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
		this.aBoolean76 = false;
		synchronized (this) {
			this.notify();
		}
		this.aByteArray4 = null;
	}

	@OriginalMember(owner = "client!HUWYSFFT", name = "b", descriptor = "()I")
	public int method127() throws IOException {
		return this.aBoolean75 ? 0 : this.anInputStream1.read();
	}

	@OriginalMember(owner = "client!HUWYSFFT", name = "c", descriptor = "()I")
	public int method128() throws IOException {
		return this.aBoolean75 ? 0 : this.anInputStream1.available();
	}

	@OriginalMember(owner = "client!HUWYSFFT", name = "a", descriptor = "([BII)V")
	public void method129(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		if (this.aBoolean75) {
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

	@OriginalMember(owner = "client!HUWYSFFT", name = "a", descriptor = "(IB[BI)V")
	public void method130(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1) throws IOException {
		try {
			if (!this.aBoolean75) {
				if (this.aBoolean77) {
					this.aBoolean77 = false;
					throw new IOException("Error in writer thread");
				}
				if (this.aByteArray4 == null) {
					this.aByteArray4 = new byte[5000];
				}
				synchronized (this) {
					for (@Pc(40) int local40 = 0; local40 < arg1; local40++) {
						this.aByteArray4[this.anInt233] = arg0[local40 + 0];
						this.anInt233 = (this.anInt233 + 1) % 5000;
						if (this.anInt233 == (this.anInt232 + 4900) % 5000) {
							throw new IOException("buffer overflow");
						}
					}
					if (!this.aBoolean76) {
						this.aBoolean76 = true;
						this.anApplet_Sub1_1.method580(this, 3);
					}
					this.notify();
				}
			}
		} catch (@Pc(99) RuntimeException local99) {
			signlink.reporterror("9784, " + 0 + ", " + 83 + ", " + arg0 + ", " + arg1 + ", " + local99.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HUWYSFFT", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean76) {
			@Pc(38) int local38;
			@Pc(27) int local27;
			synchronized (this) {
				if (this.anInt233 == this.anInt232) {
					try {
						this.wait();
					} catch (@Pc(16) InterruptedException local16) {
					}
				}
				if (!this.aBoolean76) {
					return;
				}
				local27 = this.anInt232;
				if (this.anInt233 >= this.anInt232) {
					local38 = this.anInt233 - this.anInt232;
				} else {
					local38 = 5000 - this.anInt232;
				}
			}
			if (local38 > 0) {
				try {
					this.anOutputStream1.write(this.aByteArray4, local27, local38);
				} catch (@Pc(62) IOException local62) {
					this.aBoolean77 = true;
				}
				this.anInt232 = (this.anInt232 + local38) % 5000;
				try {
					if (this.anInt233 == this.anInt232) {
						this.anOutputStream1.flush();
					}
				} catch (@Pc(83) IOException local83) {
					this.aBoolean77 = true;
				}
			}
		}
	}

	@OriginalMember(owner = "client!HUWYSFFT", name = "a", descriptor = "(Z)V")
	public void method131() {
		try {
			System.out.println("dummy:" + this.aBoolean75);
			System.out.println("tcycl:" + this.anInt232);
			System.out.println("tnum:" + this.anInt233);
			System.out.println("writer:" + this.aBoolean76);
			System.out.println("ioerror:" + this.aBoolean77);
			try {
				System.out.println("available:" + this.method128());
			} catch (@Pc(71) IOException local71) {
			}
		} catch (@Pc(73) RuntimeException local73) {
			signlink.reporterror("69573, " + true + ", " + local73.toString());
			throw new RuntimeException();
		}
	}
}
