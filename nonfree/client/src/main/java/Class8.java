import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!e")
public final class Class8 implements Runnable {

	@OriginalMember(owner = "client!e", name = "g", descriptor = "[B")
	private byte[] aByteArray3;

	@OriginalMember(owner = "client!e", name = "h", descriptor = "I")
	private int anInt457;

	@OriginalMember(owner = "client!e", name = "i", descriptor = "I")
	private int anInt458;

	@OriginalMember(owner = "client!e", name = "a", descriptor = "Z")
	private boolean aBoolean115 = false;

	@OriginalMember(owner = "client!e", name = "e", descriptor = "Z")
	private boolean aBoolean116 = false;

	@OriginalMember(owner = "client!e", name = "j", descriptor = "Z")
	private boolean aBoolean117 = false;

	@OriginalMember(owner = "client!e", name = "k", descriptor = "Z")
	private boolean aBoolean118 = false;

	@OriginalMember(owner = "client!e", name = "f", descriptor = "Lclient!a;")
	private Applet_Sub1 anApplet_Sub1_2;

	@OriginalMember(owner = "client!e", name = "d", descriptor = "Ljava/net/Socket;")
	private Socket aSocket2;

	@OriginalMember(owner = "client!e", name = "b", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream1;

	@OriginalMember(owner = "client!e", name = "c", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream1;

	@OriginalMember(owner = "client!e", name = "<init>", descriptor = "(Lclient!a;ILjava/net/Socket;)V")
	public Class8(@OriginalArg(0) Applet_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Socket arg2) throws IOException {
		try {
			this.anApplet_Sub1_2 = arg0;
			this.aSocket2 = arg2;
			this.aSocket2.setSoTimeout(30000);
			this.aSocket2.setTcpNoDelay(true);
			this.anInputStream1 = this.aSocket2.getInputStream();
			@Pc(36) int local36 = 84 / arg1;
			this.anOutputStream1 = this.aSocket2.getOutputStream();
		} catch (@Pc(43) RuntimeException local43) {
			signlink.reporterror("35406, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local43.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "()V")
	public void method245() {
		this.aBoolean116 = true;
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
		} catch (@Pc(22) IOException local22) {
			System.out.println("Error closing stream");
		}
		this.aBoolean117 = false;
		synchronized (this) {
			this.notify();
		}
		this.aByteArray3 = null;
	}

	@OriginalMember(owner = "client!e", name = "b", descriptor = "()I")
	public int method246() throws IOException {
		return this.aBoolean116 ? 0 : this.anInputStream1.read();
	}

	@OriginalMember(owner = "client!e", name = "c", descriptor = "()I")
	public int method247() throws IOException {
		return this.aBoolean116 ? 0 : this.anInputStream1.available();
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "([BII)V")
	public void method248(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		if (this.aBoolean116) {
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

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(II[BI)V")
	public void method249(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) throws IOException {
		try {
			if (!this.aBoolean116) {
				if (this.aBoolean118) {
					this.aBoolean118 = false;
					throw new IOException("Error in writer thread");
				}
				if (this.aByteArray3 == null) {
					this.aByteArray3 = new byte[5000];
				}
				synchronized (this) {
					for (@Pc(28) int local28 = 0; local28 < arg0; local28++) {
						this.aByteArray3[this.anInt458] = arg1[local28 + 0];
						this.anInt458 = (this.anInt458 + 1) % 5000;
						if (this.anInt458 == (this.anInt457 + 4900) % 5000) {
							throw new IOException("buffer overflow");
						}
					}
					if (!this.aBoolean117) {
						this.aBoolean117 = true;
						this.anApplet_Sub1_2.method94(this, 3);
					}
					this.notify();
				}
			}
		} catch (@Pc(98) RuntimeException local98) {
			signlink.reporterror("42310, " + -991 + ", " + arg0 + ", " + arg1 + ", " + 0 + ", " + local98.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!e", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean117) {
			@Pc(38) int local38;
			@Pc(27) int local27;
			synchronized (this) {
				if (this.anInt458 == this.anInt457) {
					try {
						this.wait();
					} catch (@Pc(16) InterruptedException local16) {
					}
				}
				if (!this.aBoolean117) {
					return;
				}
				local27 = this.anInt457;
				if (this.anInt458 >= this.anInt457) {
					local38 = this.anInt458 - this.anInt457;
				} else {
					local38 = 5000 - this.anInt457;
				}
			}
			if (local38 > 0) {
				try {
					this.anOutputStream1.write(this.aByteArray3, local27, local38);
				} catch (@Pc(62) IOException local62) {
					this.aBoolean118 = true;
				}
				this.anInt457 = (this.anInt457 + local38) % 5000;
				try {
					if (this.anInt458 == this.anInt457) {
						this.anOutputStream1.flush();
					}
				} catch (@Pc(83) IOException local83) {
					this.aBoolean118 = true;
				}
			}
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(I)V")
	public void method250(@OriginalArg(0) int arg0) {
		try {
			System.out.println("dummy:" + this.aBoolean116);
			System.out.println("tcycl:" + this.anInt457);
			System.out.println("tnum:" + this.anInt458);
			@Pc(33) boolean local33 = false;
			System.out.println("writer:" + this.aBoolean117);
			System.out.println("ioerror:" + this.aBoolean118);
			try {
				System.out.println("available:" + this.method247());
			} catch (@Pc(65) IOException local65) {
			}
		} catch (@Pc(67) RuntimeException local67) {
			signlink.reporterror("94695, " + arg0 + ", " + local67.toString());
			throw new RuntimeException();
		}
	}
}
