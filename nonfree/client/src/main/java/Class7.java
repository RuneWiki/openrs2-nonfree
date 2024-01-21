import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!DUZSRFJE")
public final class Class7 implements Runnable {

	@OriginalMember(owner = "client!DUZSRFJE", name = "h", descriptor = "[B")
	private byte[] aByteArray2;

	@OriginalMember(owner = "client!DUZSRFJE", name = "i", descriptor = "I")
	private int anInt70;

	@OriginalMember(owner = "client!DUZSRFJE", name = "j", descriptor = "I")
	private int anInt71;

	@OriginalMember(owner = "client!DUZSRFJE", name = "a", descriptor = "I")
	private int anInt68 = 44344;

	@OriginalMember(owner = "client!DUZSRFJE", name = "b", descriptor = "I")
	private int anInt69 = 973;

	@OriginalMember(owner = "client!DUZSRFJE", name = "f", descriptor = "Z")
	private boolean aBoolean25 = false;

	@OriginalMember(owner = "client!DUZSRFJE", name = "k", descriptor = "Z")
	private boolean aBoolean26 = false;

	@OriginalMember(owner = "client!DUZSRFJE", name = "l", descriptor = "Z")
	private boolean aBoolean27 = false;

	@OriginalMember(owner = "client!DUZSRFJE", name = "g", descriptor = "Lclient!AMTYETOI;")
	private Applet_Sub1 anApplet_Sub1_2;

	@OriginalMember(owner = "client!DUZSRFJE", name = "e", descriptor = "Ljava/net/Socket;")
	private Socket aSocket1;

	@OriginalMember(owner = "client!DUZSRFJE", name = "c", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream1;

	@OriginalMember(owner = "client!DUZSRFJE", name = "d", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream1;

	@OriginalMember(owner = "client!DUZSRFJE", name = "<init>", descriptor = "(Lclient!AMTYETOI;ZLjava/net/Socket;)V")
	public Class7(@OriginalArg(0) Applet_Sub1 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Socket arg2) throws IOException {
		try {
			this.anApplet_Sub1_2 = arg0;
			this.aSocket1 = arg2;
			this.aSocket1.setSoTimeout(30000);
			if (arg1) {
				throw new NullPointerException();
			}
			this.aSocket1.setTcpNoDelay(true);
			this.anInputStream1 = this.aSocket1.getInputStream();
			this.anOutputStream1 = this.aSocket1.getOutputStream();
		} catch (@Pc(48) RuntimeException local48) {
			signlink.reporterror("49715, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local48.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DUZSRFJE", name = "a", descriptor = "()V")
	public void method42() {
		this.aBoolean25 = true;
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
		this.aBoolean26 = false;
		synchronized (this) {
			this.notify();
		}
		this.aByteArray2 = null;
	}

	@OriginalMember(owner = "client!DUZSRFJE", name = "b", descriptor = "()I")
	public int method43() throws IOException {
		return this.aBoolean25 ? 0 : this.anInputStream1.read();
	}

	@OriginalMember(owner = "client!DUZSRFJE", name = "c", descriptor = "()I")
	public int method44() throws IOException {
		return this.aBoolean25 ? 0 : this.anInputStream1.available();
	}

	@OriginalMember(owner = "client!DUZSRFJE", name = "a", descriptor = "([BII)V")
	public void method45(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		if (this.aBoolean25) {
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

	@OriginalMember(owner = "client!DUZSRFJE", name = "a", descriptor = "(I[BII)V")
	public void method46(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) throws IOException {
		try {
			if (!this.aBoolean25) {
				if (this.aBoolean27) {
					this.aBoolean27 = false;
					throw new IOException("Error in writer thread");
				}
				if (this.aByteArray2 == null) {
					this.aByteArray2 = new byte[5000];
				}
				synchronized (this) {
					for (@Pc(33) int local33 = 0; local33 < arg1; local33++) {
						this.aByteArray2[this.anInt71] = arg0[local33 + 0];
						this.anInt71 = (this.anInt71 + 1) % 5000;
						if (this.anInt71 == (this.anInt70 + 4900) % 5000) {
							throw new IOException("buffer overflow");
						}
					}
					if (!this.aBoolean26) {
						this.aBoolean26 = true;
						this.anApplet_Sub1_2.method582(this, 3);
					}
					this.notify();
				}
			}
		} catch (@Pc(92) RuntimeException local92) {
			signlink.reporterror("99698, " + 0 + ", " + arg0 + ", " + arg1 + ", " + 0 + ", " + local92.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DUZSRFJE", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean26) {
			@Pc(38) int local38;
			@Pc(27) int local27;
			synchronized (this) {
				if (this.anInt71 == this.anInt70) {
					try {
						this.wait();
					} catch (@Pc(16) InterruptedException local16) {
					}
				}
				if (!this.aBoolean26) {
					return;
				}
				local27 = this.anInt70;
				if (this.anInt71 >= this.anInt70) {
					local38 = this.anInt71 - this.anInt70;
				} else {
					local38 = 5000 - this.anInt70;
				}
			}
			if (local38 > 0) {
				try {
					this.anOutputStream1.write(this.aByteArray2, local27, local38);
				} catch (@Pc(62) IOException local62) {
					this.aBoolean27 = true;
				}
				this.anInt70 = (this.anInt70 + local38) % 5000;
				try {
					if (this.anInt71 == this.anInt70) {
						this.anOutputStream1.flush();
					}
				} catch (@Pc(83) IOException local83) {
					this.aBoolean27 = true;
				}
			}
		}
	}

	@OriginalMember(owner = "client!DUZSRFJE", name = "a", descriptor = "(I)V")
	public void method47() {
		try {
			System.out.println("dummy:" + this.aBoolean25);
			System.out.println("tcycl:" + this.anInt70);
			System.out.println("tnum:" + this.anInt71);
			System.out.println("writer:" + this.aBoolean26);
			System.out.println("ioerror:" + this.aBoolean27);
			try {
				System.out.println("available:" + this.method44());
			} catch (@Pc(66) IOException local66) {
			}
		} catch (@Pc(68) RuntimeException local68) {
			signlink.reporterror("65742, " + 0 + ", " + local68.toString());
			throw new RuntimeException();
		}
	}
}
