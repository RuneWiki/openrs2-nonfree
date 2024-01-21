import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!PTISUREQ")
public final class Class31 implements Runnable {

	@OriginalMember(owner = "client!PTISUREQ", name = "g", descriptor = "[B")
	private byte[] aByteArray8;

	@OriginalMember(owner = "client!PTISUREQ", name = "h", descriptor = "I")
	private int anInt533;

	@OriginalMember(owner = "client!PTISUREQ", name = "i", descriptor = "I")
	private int anInt534;

	@OriginalMember(owner = "client!PTISUREQ", name = "a", descriptor = "Z")
	private boolean aBoolean112 = false;

	@OriginalMember(owner = "client!PTISUREQ", name = "e", descriptor = "Z")
	private boolean aBoolean113 = false;

	@OriginalMember(owner = "client!PTISUREQ", name = "j", descriptor = "Z")
	private boolean aBoolean114 = false;

	@OriginalMember(owner = "client!PTISUREQ", name = "k", descriptor = "Z")
	private boolean aBoolean115 = false;

	@OriginalMember(owner = "client!PTISUREQ", name = "f", descriptor = "Lclient!VTYHSWDE;")
	private Applet_Sub1 anApplet_Sub1_1;

	@OriginalMember(owner = "client!PTISUREQ", name = "d", descriptor = "Ljava/net/Socket;")
	private Socket aSocket2;

	@OriginalMember(owner = "client!PTISUREQ", name = "b", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream2;

	@OriginalMember(owner = "client!PTISUREQ", name = "c", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream2;

	@OriginalMember(owner = "client!PTISUREQ", name = "<init>", descriptor = "(ILclient!VTYHSWDE;Ljava/net/Socket;)V")
	public Class31(@OriginalArg(0) int arg0, @OriginalArg(1) Applet_Sub1 arg1, @OriginalArg(2) Socket arg2) throws IOException {
		try {
			this.anApplet_Sub1_1 = arg1;
			this.aSocket2 = arg2;
			this.aSocket2.setSoTimeout(30000);
			this.aSocket2.setTcpNoDelay(true);
			this.anInputStream2 = this.aSocket2.getInputStream();
			this.anOutputStream2 = this.aSocket2.getOutputStream();
		} catch (@Pc(50) RuntimeException local50) {
			signlink.reporterror("37389, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local50.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PTISUREQ", name = "a", descriptor = "()V")
	public void method335() {
		this.aBoolean113 = true;
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
		this.aBoolean114 = false;
		synchronized (this) {
			this.notify();
		}
		this.aByteArray8 = null;
	}

	@OriginalMember(owner = "client!PTISUREQ", name = "b", descriptor = "()I")
	public int method336() throws IOException {
		return this.aBoolean113 ? 0 : this.anInputStream2.read();
	}

	@OriginalMember(owner = "client!PTISUREQ", name = "c", descriptor = "()I")
	public int method337() throws IOException {
		return this.aBoolean113 ? 0 : this.anInputStream2.available();
	}

	@OriginalMember(owner = "client!PTISUREQ", name = "a", descriptor = "([BII)V")
	public void method338(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		if (this.aBoolean113) {
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

	@OriginalMember(owner = "client!PTISUREQ", name = "a", descriptor = "(BII[B)V")
	public void method339(@OriginalArg(2) int arg0, @OriginalArg(3) byte[] arg1) throws IOException {
		try {
			if (!this.aBoolean113) {
				if (this.aBoolean115) {
					this.aBoolean115 = false;
					throw new IOException("Error in writer thread");
				}
				if (this.aByteArray8 == null) {
					this.aByteArray8 = new byte[5000];
				}
				synchronized (this) {
					for (@Pc(39) int local39 = 0; local39 < arg0; local39++) {
						this.aByteArray8[this.anInt534] = arg1[local39 + 0];
						this.anInt534 = (this.anInt534 + 1) % 5000;
						if (this.anInt534 == (this.anInt533 + 4900) % 5000) {
							throw new IOException("buffer overflow");
						}
					}
					if (!this.aBoolean114) {
						this.aBoolean114 = true;
						this.anApplet_Sub1_1.method583(this, 3);
					}
					this.notify();
				}
			}
		} catch (@Pc(98) RuntimeException local98) {
			signlink.reporterror("3796, " + -32 + ", " + 0 + ", " + arg0 + ", " + arg1 + ", " + local98.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PTISUREQ", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean114) {
			@Pc(38) int local38;
			@Pc(27) int local27;
			synchronized (this) {
				if (this.anInt534 == this.anInt533) {
					try {
						this.wait();
					} catch (@Pc(16) InterruptedException local16) {
					}
				}
				if (!this.aBoolean114) {
					return;
				}
				local27 = this.anInt533;
				if (this.anInt534 >= this.anInt533) {
					local38 = this.anInt534 - this.anInt533;
				} else {
					local38 = 5000 - this.anInt533;
				}
			}
			if (local38 > 0) {
				try {
					this.anOutputStream2.write(this.aByteArray8, local27, local38);
				} catch (@Pc(62) IOException local62) {
					this.aBoolean115 = true;
				}
				this.anInt533 = (this.anInt533 + local38) % 5000;
				try {
					if (this.anInt534 == this.anInt533) {
						this.anOutputStream2.flush();
					}
				} catch (@Pc(83) IOException local83) {
					this.aBoolean115 = true;
				}
			}
		}
	}

	@OriginalMember(owner = "client!PTISUREQ", name = "a", descriptor = "(B)V")
	public void method340(@OriginalArg(0) byte arg0) {
		try {
			System.out.println("dummy:" + this.aBoolean113);
			System.out.println("tcycl:" + this.anInt533);
			System.out.println("tnum:" + this.anInt534);
			if (arg0 == 7) {
				System.out.println("writer:" + this.aBoolean114);
				System.out.println("ioerror:" + this.aBoolean115);
				try {
					System.out.println("available:" + this.method337());
				} catch (@Pc(65) IOException local65) {
				}
			}
		} catch (@Pc(67) RuntimeException local67) {
			signlink.reporterror("86172, " + arg0 + ", " + local67.toString());
			throw new RuntimeException();
		}
	}
}
