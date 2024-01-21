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

	@OriginalMember(owner = "client!e", name = "i", descriptor = "[B")
	private byte[] aByteArray3;

	@OriginalMember(owner = "client!e", name = "j", descriptor = "I")
	private int anInt496;

	@OriginalMember(owner = "client!e", name = "k", descriptor = "I")
	private int anInt497;

	@OriginalMember(owner = "client!e", name = "a", descriptor = "B")
	private byte aByte16 = 4;

	@OriginalMember(owner = "client!e", name = "b", descriptor = "I")
	private int anInt495 = -32411;

	@OriginalMember(owner = "client!e", name = "c", descriptor = "Z")
	private boolean aBoolean108 = true;

	@OriginalMember(owner = "client!e", name = "g", descriptor = "Z")
	private boolean aBoolean109 = false;

	@OriginalMember(owner = "client!e", name = "l", descriptor = "Z")
	private boolean aBoolean110 = false;

	@OriginalMember(owner = "client!e", name = "m", descriptor = "Z")
	private boolean aBoolean111 = false;

	@OriginalMember(owner = "client!e", name = "h", descriptor = "Lclient!a;")
	private Applet_Sub1 anApplet_Sub1_2;

	@OriginalMember(owner = "client!e", name = "f", descriptor = "Ljava/net/Socket;")
	private Socket aSocket1;

	@OriginalMember(owner = "client!e", name = "d", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream1;

	@OriginalMember(owner = "client!e", name = "e", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream1;

	@OriginalMember(owner = "client!e", name = "<init>", descriptor = "(BLclient!a;Ljava/net/Socket;)V")
	public Class8(@OriginalArg(0) byte arg0, @OriginalArg(1) Applet_Sub1 arg1, @OriginalArg(2) Socket arg2) throws IOException {
		try {
			this.anApplet_Sub1_2 = arg1;
			this.aSocket1 = arg2;
			this.aSocket1.setSoTimeout(30000);
			if (arg0 == this.aByte16) {
				@Pc(35) boolean local35 = false;
			} else {
				this.anInt495 = 398;
			}
			this.aSocket1.setTcpNoDelay(true);
			this.anInputStream1 = this.aSocket1.getInputStream();
			this.anOutputStream1 = this.aSocket1.getOutputStream();
		} catch (@Pc(56) RuntimeException local56) {
			signlink.reporterror("17930, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local56.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "()V")
	public void method244() {
		this.aBoolean109 = true;
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
		this.aBoolean110 = false;
		synchronized (this) {
			this.notify();
		}
		this.aByteArray3 = null;
	}

	@OriginalMember(owner = "client!e", name = "b", descriptor = "()I")
	public int method245() throws IOException {
		return this.aBoolean109 ? 0 : this.anInputStream1.read();
	}

	@OriginalMember(owner = "client!e", name = "c", descriptor = "()I")
	public int method246() throws IOException {
		return this.aBoolean109 ? 0 : this.anInputStream1.available();
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "([BII)V")
	public void method247(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		if (this.aBoolean109) {
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

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(I[BIZ)V")
	public void method248(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) throws IOException {
		try {
			if (!this.aBoolean109) {
				if (this.aBoolean111) {
					this.aBoolean111 = false;
					throw new IOException("Error in writer thread");
				}
				if (this.aByteArray3 == null) {
					this.aByteArray3 = new byte[5000];
				}
				synchronized (this) {
					for (@Pc(33) int local33 = 0; local33 < arg0; local33++) {
						this.aByteArray3[this.anInt497] = arg1[local33 + 0];
						this.anInt497 = (this.anInt497 + 1) % 5000;
						if (this.anInt497 == (this.anInt496 + 4900) % 5000) {
							throw new IOException("buffer overflow");
						}
					}
					if (!this.aBoolean110) {
						this.aBoolean110 = true;
						this.anApplet_Sub1_2.method96(this, 3);
					}
					this.notify();
				}
			}
		} catch (@Pc(92) RuntimeException local92) {
			signlink.reporterror("67276, " + arg0 + ", " + arg1 + ", " + 0 + ", " + false + ", " + local92.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!e", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean110) {
			@Pc(38) int local38;
			@Pc(27) int local27;
			synchronized (this) {
				if (this.anInt497 == this.anInt496) {
					try {
						this.wait();
					} catch (@Pc(16) InterruptedException local16) {
					}
				}
				if (!this.aBoolean110) {
					return;
				}
				local27 = this.anInt496;
				if (this.anInt497 >= this.anInt496) {
					local38 = this.anInt497 - this.anInt496;
				} else {
					local38 = 5000 - this.anInt496;
				}
			}
			if (local38 > 0) {
				try {
					this.anOutputStream1.write(this.aByteArray3, local27, local38);
				} catch (@Pc(62) IOException local62) {
					this.aBoolean111 = true;
				}
				this.anInt496 = (this.anInt496 + local38) % 5000;
				try {
					if (this.anInt497 == this.anInt496) {
						this.anOutputStream1.flush();
					}
				} catch (@Pc(83) IOException local83) {
					this.aBoolean111 = true;
				}
			}
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(I)V")
	public void method249() {
		try {
			System.out.println("dummy:" + this.aBoolean109);
			System.out.println("tcycl:" + this.anInt496);
			System.out.println("tnum:" + this.anInt497);
			System.out.println("writer:" + this.aBoolean110);
			System.out.println("ioerror:" + this.aBoolean111);
			try {
				System.out.println("available:" + this.method246());
			} catch (@Pc(70) IOException local70) {
			}
		} catch (@Pc(72) RuntimeException local72) {
			signlink.reporterror("79550, " + 0 + ", " + local72.toString());
			throw new RuntimeException();
		}
	}
}
