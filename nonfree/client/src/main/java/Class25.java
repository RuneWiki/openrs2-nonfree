import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!LJVKCVYD")
public final class Class25 implements Runnable {

	@OriginalMember(owner = "client!LJVKCVYD", name = "f", descriptor = "[B")
	private byte[] aByteArray10;

	@OriginalMember(owner = "client!LJVKCVYD", name = "g", descriptor = "I")
	private int anInt348;

	@OriginalMember(owner = "client!LJVKCVYD", name = "h", descriptor = "I")
	private int anInt349;

	@OriginalMember(owner = "client!LJVKCVYD", name = "d", descriptor = "Z")
	private boolean aBoolean92 = false;

	@OriginalMember(owner = "client!LJVKCVYD", name = "i", descriptor = "Z")
	private boolean aBoolean93 = false;

	@OriginalMember(owner = "client!LJVKCVYD", name = "j", descriptor = "Z")
	private boolean aBoolean94 = false;

	@OriginalMember(owner = "client!LJVKCVYD", name = "e", descriptor = "Lclient!AYIVJZQQ;")
	private Applet_Sub1 anApplet_Sub1_1;

	@OriginalMember(owner = "client!LJVKCVYD", name = "c", descriptor = "Ljava/net/Socket;")
	private Socket aSocket1;

	@OriginalMember(owner = "client!LJVKCVYD", name = "a", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream1;

	@OriginalMember(owner = "client!LJVKCVYD", name = "b", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream1;

	@OriginalMember(owner = "client!LJVKCVYD", name = "<init>", descriptor = "(Lclient!AYIVJZQQ;Ljava/net/Socket;I)V")
	public Class25(@OriginalArg(0) Applet_Sub1 arg0, @OriginalArg(1) Socket arg1, @OriginalArg(2) int arg2) throws IOException {
		try {
			this.anApplet_Sub1_1 = arg0;
			this.aSocket1 = arg1;
			this.aSocket1.setSoTimeout(30000);
			this.aSocket1.setTcpNoDelay(true);
			this.anInputStream1 = this.aSocket1.getInputStream();
			@Pc(33) int local33 = 14 / arg2;
			this.anOutputStream1 = this.aSocket1.getOutputStream();
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("782, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local40.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LJVKCVYD", name = "a", descriptor = "()V")
	public void method290() {
		this.aBoolean92 = true;
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
		this.aBoolean93 = false;
		synchronized (this) {
			this.notify();
		}
		this.aByteArray10 = null;
	}

	@OriginalMember(owner = "client!LJVKCVYD", name = "b", descriptor = "()I")
	public int method291() throws IOException {
		return this.aBoolean92 ? 0 : this.anInputStream1.read();
	}

	@OriginalMember(owner = "client!LJVKCVYD", name = "c", descriptor = "()I")
	public int method292() throws IOException {
		return this.aBoolean92 ? 0 : this.anInputStream1.available();
	}

	@OriginalMember(owner = "client!LJVKCVYD", name = "a", descriptor = "([BII)V")
	public void method293(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		if (this.aBoolean92) {
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

	@OriginalMember(owner = "client!LJVKCVYD", name = "a", descriptor = "([BIII)V")
	public void method294(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) throws IOException {
		try {
			if (!this.aBoolean92) {
				if (this.aBoolean94) {
					this.aBoolean94 = false;
					throw new IOException("Error in writer thread");
				}
				if (this.aByteArray10 == null) {
					this.aByteArray10 = new byte[5000];
				}
				synchronized (this) {
					for (@Pc(32) int local32 = 0; local32 < arg1; local32++) {
						this.aByteArray10[this.anInt349] = arg0[local32 + 0];
						this.anInt349 = (this.anInt349 + 1) % 5000;
						if (this.anInt349 == (this.anInt348 + 4900) % 5000) {
							throw new IOException("buffer overflow");
						}
					}
					if (!this.aBoolean93) {
						this.aBoolean93 = true;
						this.anApplet_Sub1_1.method578(this, 3);
					}
					this.notify();
				}
			}
		} catch (@Pc(91) RuntimeException local91) {
			signlink.reporterror("14361, " + arg0 + ", " + arg1 + ", " + 11369 + ", " + 0 + ", " + local91.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LJVKCVYD", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean93) {
			@Pc(38) int local38;
			@Pc(27) int local27;
			synchronized (this) {
				if (this.anInt349 == this.anInt348) {
					try {
						this.wait();
					} catch (@Pc(16) InterruptedException local16) {
					}
				}
				if (!this.aBoolean93) {
					return;
				}
				local27 = this.anInt348;
				if (this.anInt349 >= this.anInt348) {
					local38 = this.anInt349 - this.anInt348;
				} else {
					local38 = 5000 - this.anInt348;
				}
			}
			if (local38 > 0) {
				try {
					this.anOutputStream1.write(this.aByteArray10, local27, local38);
				} catch (@Pc(62) IOException local62) {
					this.aBoolean94 = true;
				}
				this.anInt348 = (this.anInt348 + local38) % 5000;
				try {
					if (this.anInt349 == this.anInt348) {
						this.anOutputStream1.flush();
					}
				} catch (@Pc(83) IOException local83) {
					this.aBoolean94 = true;
				}
			}
		}
	}

	@OriginalMember(owner = "client!LJVKCVYD", name = "a", descriptor = "(I)V")
	public void method295() {
		try {
			System.out.println("dummy:" + this.aBoolean92);
			System.out.println("tcycl:" + this.anInt348);
			System.out.println("tnum:" + this.anInt349);
			System.out.println("writer:" + this.aBoolean93);
			System.out.println("ioerror:" + this.aBoolean94);
			try {
				System.out.println("available:" + this.method292());
			} catch (@Pc(71) IOException local71) {
			}
		} catch (@Pc(73) RuntimeException local73) {
			signlink.reporterror("12720, " + 40926 + ", " + local73.toString());
			throw new RuntimeException();
		}
	}
}
