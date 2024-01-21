import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!UFCPVKNJ")
public final class Class40 implements Runnable {

	@OriginalMember(owner = "client!UFCPVKNJ", name = "i", descriptor = "[B")
	private byte[] aByteArray19;

	@OriginalMember(owner = "client!UFCPVKNJ", name = "j", descriptor = "I")
	private int anInt732;

	@OriginalMember(owner = "client!UFCPVKNJ", name = "k", descriptor = "I")
	private int anInt733;

	@OriginalMember(owner = "client!UFCPVKNJ", name = "a", descriptor = "Z")
	private boolean aBoolean198 = true;

	@OriginalMember(owner = "client!UFCPVKNJ", name = "b", descriptor = "Z")
	private boolean aBoolean199 = false;

	@OriginalMember(owner = "client!UFCPVKNJ", name = "c", descriptor = "I")
	private int anInt731 = 64;

	@OriginalMember(owner = "client!UFCPVKNJ", name = "g", descriptor = "Z")
	private boolean aBoolean200 = false;

	@OriginalMember(owner = "client!UFCPVKNJ", name = "l", descriptor = "Z")
	private boolean aBoolean201 = false;

	@OriginalMember(owner = "client!UFCPVKNJ", name = "m", descriptor = "Z")
	private boolean aBoolean202 = false;

	@OriginalMember(owner = "client!UFCPVKNJ", name = "h", descriptor = "Lclient!KWRIFYWM;")
	private Applet_Sub1 anApplet_Sub1_2;

	@OriginalMember(owner = "client!UFCPVKNJ", name = "f", descriptor = "Ljava/net/Socket;")
	private Socket aSocket2;

	@OriginalMember(owner = "client!UFCPVKNJ", name = "d", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream2;

	@OriginalMember(owner = "client!UFCPVKNJ", name = "e", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream2;

	@OriginalMember(owner = "client!UFCPVKNJ", name = "<init>", descriptor = "(ILjava/net/Socket;Lclient!KWRIFYWM;)V")
	public Class40(@OriginalArg(0) int arg0, @OriginalArg(1) Socket arg1, @OriginalArg(2) Applet_Sub1 arg2) throws IOException {
		try {
			this.anApplet_Sub1_2 = arg2;
			this.aSocket2 = arg1;
			this.aSocket2.setSoTimeout(30000);
			this.aSocket2.setTcpNoDelay(true);
			this.anInputStream2 = this.aSocket2.getInputStream();
			this.anOutputStream2 = this.aSocket2.getOutputStream();
		} catch (@Pc(58) RuntimeException local58) {
			signlink.reporterror("89243, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local58.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UFCPVKNJ", name = "a", descriptor = "()V")
	public void method515() {
		this.aBoolean200 = true;
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
		this.aBoolean201 = false;
		synchronized (this) {
			this.notify();
		}
		this.aByteArray19 = null;
	}

	@OriginalMember(owner = "client!UFCPVKNJ", name = "b", descriptor = "()I")
	public int method516() throws IOException {
		return this.aBoolean200 ? 0 : this.anInputStream2.read();
	}

	@OriginalMember(owner = "client!UFCPVKNJ", name = "c", descriptor = "()I")
	public int method517() throws IOException {
		return this.aBoolean200 ? 0 : this.anInputStream2.available();
	}

	@OriginalMember(owner = "client!UFCPVKNJ", name = "a", descriptor = "([BII)V")
	public void method518(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		if (this.aBoolean200) {
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

	@OriginalMember(owner = "client!UFCPVKNJ", name = "a", descriptor = "(B[BII)V")
	public void method519(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) throws IOException {
		try {
			if (!this.aBoolean200) {
				if (this.aBoolean202) {
					this.aBoolean202 = false;
					throw new IOException("Error in writer thread");
				}
				if (this.aByteArray19 == null) {
					this.aByteArray19 = new byte[5000];
				}
				synchronized (this) {
					for (@Pc(39) int local39 = 0; local39 < arg1; local39++) {
						this.aByteArray19[this.anInt733] = arg0[local39 + 0];
						this.anInt733 = (this.anInt733 + 1) % 5000;
						if (this.anInt733 == (this.anInt732 + 4900) % 5000) {
							throw new IOException("buffer overflow");
						}
					}
					if (!this.aBoolean201) {
						this.aBoolean201 = true;
						this.anApplet_Sub1_2.method584(this, 3);
					}
					this.notify();
				}
			}
		} catch (@Pc(98) RuntimeException local98) {
			signlink.reporterror("70179, " + 120 + ", " + arg0 + ", " + arg1 + ", " + 0 + ", " + local98.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UFCPVKNJ", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean201) {
			@Pc(38) int local38;
			@Pc(27) int local27;
			synchronized (this) {
				if (this.anInt733 == this.anInt732) {
					try {
						this.wait();
					} catch (@Pc(16) InterruptedException local16) {
					}
				}
				if (!this.aBoolean201) {
					return;
				}
				local27 = this.anInt732;
				if (this.anInt733 >= this.anInt732) {
					local38 = this.anInt733 - this.anInt732;
				} else {
					local38 = 5000 - this.anInt732;
				}
			}
			if (local38 > 0) {
				try {
					this.anOutputStream2.write(this.aByteArray19, local27, local38);
				} catch (@Pc(62) IOException local62) {
					this.aBoolean202 = true;
				}
				this.anInt732 = (this.anInt732 + local38) % 5000;
				try {
					if (this.anInt733 == this.anInt732) {
						this.anOutputStream2.flush();
					}
				} catch (@Pc(83) IOException local83) {
					this.aBoolean202 = true;
				}
			}
		}
	}

	@OriginalMember(owner = "client!UFCPVKNJ", name = "a", descriptor = "(I)V")
	public void method520() {
		try {
			System.out.println("dummy:" + this.aBoolean200);
			System.out.println("tcycl:" + this.anInt732);
			System.out.println("tnum:" + this.anInt733);
			System.out.println("writer:" + this.aBoolean201);
			System.out.println("ioerror:" + this.aBoolean202);
			try {
				System.out.println("available:" + this.method517());
			} catch (@Pc(71) IOException local71) {
			}
		} catch (@Pc(73) RuntimeException local73) {
			signlink.reporterror("30379, " + 8 + ", " + local73.toString());
			throw new RuntimeException();
		}
	}
}
