import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!SAMFSOGS")
public final class Class33 implements Runnable {

	@OriginalMember(owner = "client!SAMFSOGS", name = "f", descriptor = "[B")
	private byte[] aByteArray15;

	@OriginalMember(owner = "client!SAMFSOGS", name = "g", descriptor = "I")
	private int anInt664;

	@OriginalMember(owner = "client!SAMFSOGS", name = "h", descriptor = "I")
	private int anInt665;

	@OriginalMember(owner = "client!SAMFSOGS", name = "d", descriptor = "Z")
	private boolean aBoolean135 = false;

	@OriginalMember(owner = "client!SAMFSOGS", name = "i", descriptor = "Z")
	private boolean aBoolean136 = false;

	@OriginalMember(owner = "client!SAMFSOGS", name = "j", descriptor = "Z")
	private boolean aBoolean137 = false;

	@OriginalMember(owner = "client!SAMFSOGS", name = "e", descriptor = "Lclient!MKNKYTZT;")
	private Applet_Sub1 anApplet_Sub1_1;

	@OriginalMember(owner = "client!SAMFSOGS", name = "c", descriptor = "Ljava/net/Socket;")
	private Socket aSocket1;

	@OriginalMember(owner = "client!SAMFSOGS", name = "a", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream1;

	@OriginalMember(owner = "client!SAMFSOGS", name = "b", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream1;

	@OriginalMember(owner = "client!SAMFSOGS", name = "<init>", descriptor = "(Lclient!MKNKYTZT;Ljava/net/Socket;I)V")
	public Class33(@OriginalArg(0) Applet_Sub1 arg0, @OriginalArg(1) Socket arg1, @OriginalArg(2) int arg2) throws IOException {
		try {
			this.anApplet_Sub1_1 = arg0;
			this.aSocket1 = arg1;
			this.aSocket1.setSoTimeout(30000);
			this.aSocket1.setTcpNoDelay(true);
			this.anInputStream1 = this.aSocket1.getInputStream();
			this.anOutputStream1 = this.aSocket1.getOutputStream();
			@Pc(38) int local38 = 23 / arg2;
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("14389, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local40.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SAMFSOGS", name = "a", descriptor = "()V")
	public void method483() {
		this.aBoolean135 = true;
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
		this.aBoolean136 = false;
		synchronized (this) {
			this.notify();
		}
		this.aByteArray15 = null;
	}

	@OriginalMember(owner = "client!SAMFSOGS", name = "b", descriptor = "()I")
	public int method484() throws IOException {
		return this.aBoolean135 ? 0 : this.anInputStream1.read();
	}

	@OriginalMember(owner = "client!SAMFSOGS", name = "c", descriptor = "()I")
	public int method485() throws IOException {
		return this.aBoolean135 ? 0 : this.anInputStream1.available();
	}

	@OriginalMember(owner = "client!SAMFSOGS", name = "a", descriptor = "([BII)V")
	public void method486(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		if (this.aBoolean135) {
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

	@OriginalMember(owner = "client!SAMFSOGS", name = "a", descriptor = "(IIB[B)V")
	public void method487(@OriginalArg(1) int arg0, @OriginalArg(3) byte[] arg1) throws IOException {
		try {
			if (!this.aBoolean135) {
				if (this.aBoolean137) {
					this.aBoolean137 = false;
					throw new IOException("Error in writer thread");
				}
				if (this.aByteArray15 == null) {
					this.aByteArray15 = new byte[5000];
				}
				synchronized (this) {
					for (@Pc(32) int local32 = 0; local32 < arg0; local32++) {
						this.aByteArray15[this.anInt665] = arg1[local32 + 0];
						this.anInt665 = (this.anInt665 + 1) % 5000;
						if (this.anInt665 == (this.anInt664 + 4900) % 5000) {
							throw new IOException("buffer overflow");
						}
					}
					if (!this.aBoolean136) {
						this.aBoolean136 = true;
						this.anApplet_Sub1_1.method587(this, 3);
					}
					this.notify();
				}
			}
		} catch (@Pc(91) RuntimeException local91) {
			signlink.reporterror("84231, " + 0 + ", " + arg0 + ", " + -100 + ", " + arg1 + ", " + local91.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SAMFSOGS", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean136) {
			@Pc(38) int local38;
			@Pc(27) int local27;
			synchronized (this) {
				if (this.anInt665 == this.anInt664) {
					try {
						this.wait();
					} catch (@Pc(16) InterruptedException local16) {
					}
				}
				if (!this.aBoolean136) {
					return;
				}
				local27 = this.anInt664;
				if (this.anInt665 >= this.anInt664) {
					local38 = this.anInt665 - this.anInt664;
				} else {
					local38 = 5000 - this.anInt664;
				}
			}
			if (local38 > 0) {
				try {
					this.anOutputStream1.write(this.aByteArray15, local27, local38);
				} catch (@Pc(62) IOException local62) {
					this.aBoolean137 = true;
				}
				this.anInt664 = (this.anInt664 + local38) % 5000;
				try {
					if (this.anInt665 == this.anInt664) {
						this.anOutputStream1.flush();
					}
				} catch (@Pc(83) IOException local83) {
					this.aBoolean137 = true;
				}
			}
		}
	}

	@OriginalMember(owner = "client!SAMFSOGS", name = "a", descriptor = "(I)V")
	public void method488() {
		try {
			System.out.println("dummy:" + this.aBoolean135);
			System.out.println("tcycl:" + this.anInt664);
			System.out.println("tnum:" + this.anInt665);
			System.out.println("writer:" + this.aBoolean136);
			System.out.println("ioerror:" + this.aBoolean137);
			try {
				System.out.println("available:" + this.method485());
			} catch (@Pc(68) IOException local68) {
			}
		} catch (@Pc(70) RuntimeException local70) {
			signlink.reporterror("53496, " + 1 + ", " + local70.toString());
			throw new RuntimeException();
		}
	}
}
