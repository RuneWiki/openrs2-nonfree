import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!FKSZIRZG")
public final class Class17 implements Runnable {

	@OriginalMember(owner = "client!FKSZIRZG", name = "i", descriptor = "[B")
	private byte[] aByteArray8;

	@OriginalMember(owner = "client!FKSZIRZG", name = "j", descriptor = "I")
	private int anInt169;

	@OriginalMember(owner = "client!FKSZIRZG", name = "k", descriptor = "I")
	private int anInt170;

	@OriginalMember(owner = "client!FKSZIRZG", name = "a", descriptor = "I")
	private int anInt167 = 44659;

	@OriginalMember(owner = "client!FKSZIRZG", name = "b", descriptor = "Z")
	private boolean aBoolean48 = false;

	@OriginalMember(owner = "client!FKSZIRZG", name = "c", descriptor = "I")
	private int anInt168 = -35541;

	@OriginalMember(owner = "client!FKSZIRZG", name = "g", descriptor = "Z")
	private boolean aBoolean49 = false;

	@OriginalMember(owner = "client!FKSZIRZG", name = "l", descriptor = "Z")
	private boolean aBoolean50 = false;

	@OriginalMember(owner = "client!FKSZIRZG", name = "m", descriptor = "Z")
	private boolean aBoolean51 = false;

	@OriginalMember(owner = "client!FKSZIRZG", name = "h", descriptor = "Lclient!PXJVLLTT;")
	private Applet_Sub1 anApplet_Sub1_1;

	@OriginalMember(owner = "client!FKSZIRZG", name = "f", descriptor = "Ljava/net/Socket;")
	private Socket aSocket1;

	@OriginalMember(owner = "client!FKSZIRZG", name = "d", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream1;

	@OriginalMember(owner = "client!FKSZIRZG", name = "e", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream1;

	@OriginalMember(owner = "client!FKSZIRZG", name = "<init>", descriptor = "(BLjava/net/Socket;Lclient!PXJVLLTT;)V")
	public Class17(@OriginalArg(0) byte arg0, @OriginalArg(1) Socket arg1, @OriginalArg(2) Applet_Sub1 arg2) throws IOException {
		try {
			this.anApplet_Sub1_1 = arg2;
			this.aSocket1 = arg1;
			this.aSocket1.setSoTimeout(30000);
			this.aSocket1.setTcpNoDelay(true);
			this.anInputStream1 = this.aSocket1.getInputStream();
			this.anOutputStream1 = this.aSocket1.getOutputStream();
		} catch (@Pc(51) RuntimeException local51) {
			signlink.reporterror("21158, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local51.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FKSZIRZG", name = "a", descriptor = "()V")
	public void method106() {
		this.aBoolean49 = true;
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
		this.aBoolean50 = false;
		synchronized (this) {
			this.notify();
		}
		this.aByteArray8 = null;
	}

	@OriginalMember(owner = "client!FKSZIRZG", name = "b", descriptor = "()I")
	public int method107() throws IOException {
		return this.aBoolean49 ? 0 : this.anInputStream1.read();
	}

	@OriginalMember(owner = "client!FKSZIRZG", name = "c", descriptor = "()I")
	public int method108() throws IOException {
		return this.aBoolean49 ? 0 : this.anInputStream1.available();
	}

	@OriginalMember(owner = "client!FKSZIRZG", name = "a", descriptor = "([BII)V")
	public void method109(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		if (this.aBoolean49) {
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

	@OriginalMember(owner = "client!FKSZIRZG", name = "a", descriptor = "(I[BII)V")
	public void method110(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			@Pc(3) boolean local3 = false;
			if (!this.aBoolean49) {
				if (this.aBoolean51) {
					this.aBoolean51 = false;
					throw new IOException("Error in writer thread");
				}
				if (this.aByteArray8 == null) {
					this.aByteArray8 = new byte[5000];
				}
				synchronized (this) {
					for (@Pc(32) int local32 = 0; local32 < arg1; local32++) {
						this.aByteArray8[this.anInt170] = arg0[local32 + 0];
						this.anInt170 = (this.anInt170 + 1) % 5000;
						if (this.anInt170 == (this.anInt169 + 4900) % 5000) {
							throw new IOException("buffer overflow");
						}
					}
					if (!this.aBoolean50) {
						this.aBoolean50 = true;
						this.anApplet_Sub1_1.method584(this, 3);
					}
					this.notify();
				}
			}
		} catch (@Pc(91) RuntimeException local91) {
			signlink.reporterror("64827, " + 0 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local91.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FKSZIRZG", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean50) {
			@Pc(38) int local38;
			@Pc(27) int local27;
			synchronized (this) {
				if (this.anInt170 == this.anInt169) {
					try {
						this.wait();
					} catch (@Pc(16) InterruptedException local16) {
					}
				}
				if (!this.aBoolean50) {
					return;
				}
				local27 = this.anInt169;
				if (this.anInt170 >= this.anInt169) {
					local38 = this.anInt170 - this.anInt169;
				} else {
					local38 = 5000 - this.anInt169;
				}
			}
			if (local38 > 0) {
				try {
					this.anOutputStream1.write(this.aByteArray8, local27, local38);
				} catch (@Pc(62) IOException local62) {
					this.aBoolean51 = true;
				}
				this.anInt169 = (this.anInt169 + local38) % 5000;
				try {
					if (this.anInt170 == this.anInt169) {
						this.anOutputStream1.flush();
					}
				} catch (@Pc(83) IOException local83) {
					this.aBoolean51 = true;
				}
			}
		}
	}

	@OriginalMember(owner = "client!FKSZIRZG", name = "a", descriptor = "(I)V")
	public void method111() {
		try {
			System.out.println("dummy:" + this.aBoolean49);
			System.out.println("tcycl:" + this.anInt169);
			System.out.println("tnum:" + this.anInt170);
			System.out.println("writer:" + this.aBoolean50);
			System.out.println("ioerror:" + this.aBoolean51);
			try {
				System.out.println("available:" + this.method108());
			} catch (@Pc(67) IOException local67) {
			}
		} catch (@Pc(69) RuntimeException local69) {
			signlink.reporterror("52564, " + 7 + ", " + local69.toString());
			throw new RuntimeException();
		}
	}
}
