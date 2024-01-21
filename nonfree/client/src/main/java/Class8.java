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

	@OriginalMember(owner = "client!e", name = "j", descriptor = "[B")
	private byte[] aByteArray3;

	@OriginalMember(owner = "client!e", name = "k", descriptor = "I")
	private int anInt509;

	@OriginalMember(owner = "client!e", name = "l", descriptor = "I")
	private int anInt510;

	@OriginalMember(owner = "client!e", name = "a", descriptor = "I")
	private int anInt505 = 28009;

	@OriginalMember(owner = "client!e", name = "b", descriptor = "I")
	private int anInt506 = 2;

	@OriginalMember(owner = "client!e", name = "c", descriptor = "I")
	private int anInt507 = 2;

	@OriginalMember(owner = "client!e", name = "d", descriptor = "I")
	private int anInt508 = 741;

	@OriginalMember(owner = "client!e", name = "h", descriptor = "Z")
	private boolean aBoolean105 = false;

	@OriginalMember(owner = "client!e", name = "m", descriptor = "Z")
	private boolean aBoolean106 = false;

	@OriginalMember(owner = "client!e", name = "n", descriptor = "Z")
	private boolean aBoolean107 = false;

	@OriginalMember(owner = "client!e", name = "i", descriptor = "Lclient!a;")
	private Applet_Sub1 anApplet_Sub1_2;

	@OriginalMember(owner = "client!e", name = "g", descriptor = "Ljava/net/Socket;")
	private Socket aSocket1;

	@OriginalMember(owner = "client!e", name = "e", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream1;

	@OriginalMember(owner = "client!e", name = "f", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream1;

	@OriginalMember(owner = "client!e", name = "<init>", descriptor = "(ZLjava/net/Socket;Lclient!a;)V")
	public Class8(@OriginalArg(0) boolean arg0, @OriginalArg(1) Socket arg1, @OriginalArg(2) Applet_Sub1 arg2) throws IOException {
		try {
			this.anApplet_Sub1_2 = arg2;
			this.aSocket1 = arg1;
			this.aSocket1.setSoTimeout(30000);
			this.aSocket1.setTcpNoDelay(true);
			this.anInputStream1 = this.aSocket1.getInputStream();
			this.anOutputStream1 = this.aSocket1.getOutputStream();
		} catch (@Pc(53) RuntimeException local53) {
			signlink.reporterror("97469, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local53.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "()V")
	public void method244() {
		this.aBoolean105 = true;
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
		this.aBoolean106 = false;
		synchronized (this) {
			this.notify();
		}
		this.aByteArray3 = null;
	}

	@OriginalMember(owner = "client!e", name = "b", descriptor = "()I")
	public int method245() throws IOException {
		return this.aBoolean105 ? 0 : this.anInputStream1.read();
	}

	@OriginalMember(owner = "client!e", name = "c", descriptor = "()I")
	public int method246() throws IOException {
		return this.aBoolean105 ? 0 : this.anInputStream1.available();
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "([BII)V")
	public void method247(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		if (this.aBoolean105) {
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

	@OriginalMember(owner = "client!e", name = "a", descriptor = "([BIII)V")
	public void method248(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			@Pc(3) boolean local3 = false;
			if (!this.aBoolean105) {
				if (this.aBoolean107) {
					this.aBoolean107 = false;
					throw new IOException("Error in writer thread");
				}
				if (this.aByteArray3 == null) {
					this.aByteArray3 = new byte[5000];
				}
				synchronized (this) {
					for (@Pc(32) int local32 = 0; local32 < arg1; local32++) {
						this.aByteArray3[this.anInt510] = arg0[local32 + 0];
						this.anInt510 = (this.anInt510 + 1) % 5000;
						if (this.anInt510 == (this.anInt509 + 4900) % 5000) {
							throw new IOException("buffer overflow");
						}
					}
					if (!this.aBoolean106) {
						this.aBoolean106 = true;
						this.anApplet_Sub1_2.method96(this, 3);
					}
					this.notify();
				}
			}
		} catch (@Pc(91) RuntimeException local91) {
			signlink.reporterror("28822, " + arg0 + ", " + 0 + ", " + arg1 + ", " + arg2 + ", " + local91.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!e", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean106) {
			@Pc(38) int local38;
			@Pc(27) int local27;
			synchronized (this) {
				if (this.anInt510 == this.anInt509) {
					try {
						this.wait();
					} catch (@Pc(16) InterruptedException local16) {
					}
				}
				if (!this.aBoolean106) {
					return;
				}
				local27 = this.anInt509;
				if (this.anInt510 >= this.anInt509) {
					local38 = this.anInt510 - this.anInt509;
				} else {
					local38 = 5000 - this.anInt509;
				}
			}
			if (local38 > 0) {
				try {
					this.anOutputStream1.write(this.aByteArray3, local27, local38);
				} catch (@Pc(62) IOException local62) {
					this.aBoolean107 = true;
				}
				this.anInt509 = (this.anInt509 + local38) % 5000;
				try {
					if (this.anInt510 == this.anInt509) {
						this.anOutputStream1.flush();
					}
				} catch (@Pc(83) IOException local83) {
					this.aBoolean107 = true;
				}
			}
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(I)V")
	public void method249() {
		try {
			System.out.println("dummy:" + this.aBoolean105);
			System.out.println("tcycl:" + this.anInt509);
			System.out.println("tnum:" + this.anInt510);
			System.out.println("writer:" + this.aBoolean106);
			if (this.anInt505 != 28009) {
				this.anInt506 = -9;
			}
			System.out.println("ioerror:" + this.aBoolean107);
			try {
				System.out.println("available:" + this.method246());
			} catch (@Pc(68) IOException local68) {
			}
		} catch (@Pc(70) RuntimeException local70) {
			signlink.reporterror("7836, " + 28009 + ", " + local70.toString());
			throw new RuntimeException();
		}
	}
}
