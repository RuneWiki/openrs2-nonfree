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

	@OriginalMember(owner = "client!e", name = "h", descriptor = "[B")
	private byte[] aByteArray3;

	@OriginalMember(owner = "client!e", name = "i", descriptor = "I")
	private int anInt498;

	@OriginalMember(owner = "client!e", name = "j", descriptor = "I")
	private int anInt499;

	@OriginalMember(owner = "client!e", name = "a", descriptor = "Z")
	private boolean aBoolean94 = false;

	@OriginalMember(owner = "client!e", name = "b", descriptor = "B")
	private byte aByte19 = -88;

	@OriginalMember(owner = "client!e", name = "f", descriptor = "Z")
	private boolean aBoolean95 = false;

	@OriginalMember(owner = "client!e", name = "k", descriptor = "Z")
	private boolean aBoolean96 = false;

	@OriginalMember(owner = "client!e", name = "l", descriptor = "Z")
	private boolean aBoolean97 = false;

	@OriginalMember(owner = "client!e", name = "g", descriptor = "Lclient!a;")
	private Applet_Sub1 anApplet_Sub1_2;

	@OriginalMember(owner = "client!e", name = "e", descriptor = "Ljava/net/Socket;")
	private Socket aSocket1;

	@OriginalMember(owner = "client!e", name = "c", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream1;

	@OriginalMember(owner = "client!e", name = "d", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream1;

	@OriginalMember(owner = "client!e", name = "<init>", descriptor = "(Lclient!a;ILjava/net/Socket;)V")
	public Class8(@OriginalArg(0) Applet_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Socket arg2) throws IOException {
		try {
			this.anApplet_Sub1_2 = arg0;
			this.aSocket1 = arg2;
			this.aSocket1.setSoTimeout(30000);
			this.aSocket1.setTcpNoDelay(true);
			this.anInputStream1 = this.aSocket1.getInputStream();
			this.anOutputStream1 = this.aSocket1.getOutputStream();
		} catch (@Pc(53) RuntimeException local53) {
			signlink.reporterror("40419, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local53.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "()V")
	public void method244() {
		this.aBoolean95 = true;
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
		this.aBoolean96 = false;
		synchronized (this) {
			this.notify();
		}
		this.aByteArray3 = null;
	}

	@OriginalMember(owner = "client!e", name = "b", descriptor = "()I")
	public int method245() throws IOException {
		return this.aBoolean95 ? 0 : this.anInputStream1.read();
	}

	@OriginalMember(owner = "client!e", name = "c", descriptor = "()I")
	public int method246() throws IOException {
		return this.aBoolean95 ? 0 : this.anInputStream1.available();
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "([BII)V")
	public void method247(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		if (this.aBoolean95) {
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
	public void method248(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) throws IOException {
		try {
			if (!this.aBoolean95) {
				if (this.aBoolean97) {
					this.aBoolean97 = false;
					throw new IOException("Error in writer thread");
				}
				if (this.aByteArray3 == null) {
					this.aByteArray3 = new byte[5000];
				}
				synchronized (this) {
					for (@Pc(39) int local39 = 0; local39 < arg0; local39++) {
						this.aByteArray3[this.anInt499] = arg1[local39 + 0];
						this.anInt499 = (this.anInt499 + 1) % 5000;
						if (this.anInt499 == (this.anInt498 + 4900) % 5000) {
							throw new IOException("buffer overflow");
						}
					}
					if (!this.aBoolean96) {
						this.aBoolean96 = true;
						this.anApplet_Sub1_2.method96(this, 3);
					}
					this.notify();
				}
			}
		} catch (@Pc(98) RuntimeException local98) {
			signlink.reporterror("47650, " + 0 + ", " + arg0 + ", " + arg1 + ", " + 0 + ", " + local98.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!e", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean96) {
			@Pc(38) int local38;
			@Pc(27) int local27;
			synchronized (this) {
				if (this.anInt499 == this.anInt498) {
					try {
						this.wait();
					} catch (@Pc(16) InterruptedException local16) {
					}
				}
				if (!this.aBoolean96) {
					return;
				}
				local27 = this.anInt498;
				if (this.anInt499 >= this.anInt498) {
					local38 = this.anInt499 - this.anInt498;
				} else {
					local38 = 5000 - this.anInt498;
				}
			}
			if (local38 > 0) {
				try {
					this.anOutputStream1.write(this.aByteArray3, local27, local38);
				} catch (@Pc(62) IOException local62) {
					this.aBoolean97 = true;
				}
				this.anInt498 = (this.anInt498 + local38) % 5000;
				try {
					if (this.anInt499 == this.anInt498) {
						this.anOutputStream1.flush();
					}
				} catch (@Pc(83) IOException local83) {
					this.aBoolean97 = true;
				}
			}
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(B)V")
	public void method249() {
		try {
			System.out.println("dummy:" + this.aBoolean95);
			System.out.println("tcycl:" + this.anInt498);
			if (this.aByte19 == -88) {
				System.out.println("tnum:" + this.anInt499);
				System.out.println("writer:" + this.aBoolean96);
				System.out.println("ioerror:" + this.aBoolean97);
				try {
					System.out.println("available:" + this.method246());
				} catch (@Pc(66) IOException local66) {
				}
			}
		} catch (@Pc(68) RuntimeException local68) {
			signlink.reporterror("41800, " + -88 + ", " + local68.toString());
			throw new RuntimeException();
		}
	}
}
