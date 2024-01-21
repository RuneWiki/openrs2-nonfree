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
	private int anInt490;

	@OriginalMember(owner = "client!e", name = "i", descriptor = "I")
	private int anInt491;

	@OriginalMember(owner = "client!e", name = "a", descriptor = "Z")
	private boolean aBoolean101 = true;

	@OriginalMember(owner = "client!e", name = "e", descriptor = "Z")
	private boolean aBoolean102 = false;

	@OriginalMember(owner = "client!e", name = "j", descriptor = "Z")
	private boolean aBoolean103 = false;

	@OriginalMember(owner = "client!e", name = "k", descriptor = "Z")
	private boolean aBoolean104 = false;

	@OriginalMember(owner = "client!e", name = "f", descriptor = "Lclient!a;")
	private Applet_Sub1 anApplet_Sub1_2;

	@OriginalMember(owner = "client!e", name = "d", descriptor = "Ljava/net/Socket;")
	private Socket aSocket1;

	@OriginalMember(owner = "client!e", name = "b", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream1;

	@OriginalMember(owner = "client!e", name = "c", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream1;

	@OriginalMember(owner = "client!e", name = "<init>", descriptor = "(Lclient!a;Ljava/net/Socket;I)V")
	public Class8(@OriginalArg(0) Applet_Sub1 arg0, @OriginalArg(1) Socket arg1, @OriginalArg(2) int arg2) throws IOException {
		try {
			this.anApplet_Sub1_2 = arg0;
			this.aSocket1 = arg1;
			this.aSocket1.setSoTimeout(30000);
			this.aSocket1.setTcpNoDelay(true);
			this.anInputStream1 = this.aSocket1.getInputStream();
			this.anOutputStream1 = this.aSocket1.getOutputStream();
		} catch (@Pc(53) RuntimeException local53) {
			signlink.reporterror("3384, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local53.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "()V")
	public void method244() {
		this.aBoolean102 = true;
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
		this.aBoolean103 = false;
		synchronized (this) {
			this.notify();
		}
		this.aByteArray3 = null;
	}

	@OriginalMember(owner = "client!e", name = "b", descriptor = "()I")
	public int method245() throws IOException {
		return this.aBoolean102 ? 0 : this.anInputStream1.read();
	}

	@OriginalMember(owner = "client!e", name = "c", descriptor = "()I")
	public int method246() throws IOException {
		return this.aBoolean102 ? 0 : this.anInputStream1.available();
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "([BII)V")
	public void method247(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		if (this.aBoolean102) {
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
	public void method248(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1) throws IOException {
		try {
			if (!this.aBoolean102) {
				if (this.aBoolean104) {
					this.aBoolean104 = false;
					throw new IOException("Error in writer thread");
				}
				if (this.aByteArray3 == null) {
					this.aByteArray3 = new byte[5000];
				}
				synchronized (this) {
					for (@Pc(28) int local28 = 0; local28 < arg1; local28++) {
						this.aByteArray3[this.anInt491] = arg0[local28 + 0];
						this.anInt491 = (this.anInt491 + 1) % 5000;
						if (this.anInt491 == (this.anInt490 + 4900) % 5000) {
							throw new IOException("buffer overflow");
						}
					}
					if (!this.aBoolean103) {
						this.aBoolean103 = true;
						this.anApplet_Sub1_2.method96(this, 3);
					}
					this.notify();
				}
			}
		} catch (@Pc(99) RuntimeException local99) {
			signlink.reporterror("45528, " + 0 + ", " + 7 + ", " + arg0 + ", " + arg1 + ", " + local99.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!e", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean103) {
			@Pc(38) int local38;
			@Pc(27) int local27;
			synchronized (this) {
				if (this.anInt491 == this.anInt490) {
					try {
						this.wait();
					} catch (@Pc(16) InterruptedException local16) {
					}
				}
				if (!this.aBoolean103) {
					return;
				}
				local27 = this.anInt490;
				if (this.anInt491 >= this.anInt490) {
					local38 = this.anInt491 - this.anInt490;
				} else {
					local38 = 5000 - this.anInt490;
				}
			}
			if (local38 > 0) {
				try {
					this.anOutputStream1.write(this.aByteArray3, local27, local38);
				} catch (@Pc(62) IOException local62) {
					this.aBoolean104 = true;
				}
				this.anInt490 = (this.anInt490 + local38) % 5000;
				try {
					if (this.anInt491 == this.anInt490) {
						this.anOutputStream1.flush();
					}
				} catch (@Pc(83) IOException local83) {
					this.aBoolean104 = true;
				}
			}
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(B)V")
	public void method249(@OriginalArg(0) byte arg0) {
		try {
			System.out.println("dummy:" + this.aBoolean102);
			System.out.println("tcycl:" + this.anInt490);
			@Pc(24) boolean local24 = false;
			System.out.println("tnum:" + this.anInt491);
			System.out.println("writer:" + this.aBoolean103);
			System.out.println("ioerror:" + this.aBoolean104);
			try {
				System.out.println("available:" + this.method246());
			} catch (@Pc(69) IOException local69) {
			}
		} catch (@Pc(71) RuntimeException local71) {
			signlink.reporterror("73835, " + arg0 + ", " + local71.toString());
			throw new RuntimeException();
		}
	}
}
