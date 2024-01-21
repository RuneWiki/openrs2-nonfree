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
	private int anInt473;

	@OriginalMember(owner = "client!e", name = "j", descriptor = "I")
	private int anInt474;

	@OriginalMember(owner = "client!e", name = "a", descriptor = "B")
	private byte aByte20 = -39;

	@OriginalMember(owner = "client!e", name = "b", descriptor = "Z")
	private boolean aBoolean100 = false;

	@OriginalMember(owner = "client!e", name = "f", descriptor = "Z")
	private boolean aBoolean101 = false;

	@OriginalMember(owner = "client!e", name = "k", descriptor = "Z")
	private boolean aBoolean102 = false;

	@OriginalMember(owner = "client!e", name = "l", descriptor = "Z")
	private boolean aBoolean103 = false;

	@OriginalMember(owner = "client!e", name = "g", descriptor = "Lclient!a;")
	private Applet_Sub1 anApplet_Sub1_2;

	@OriginalMember(owner = "client!e", name = "e", descriptor = "Ljava/net/Socket;")
	private Socket aSocket1;

	@OriginalMember(owner = "client!e", name = "c", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream1;

	@OriginalMember(owner = "client!e", name = "d", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream1;

	@OriginalMember(owner = "client!e", name = "<init>", descriptor = "(Lclient!a;ZLjava/net/Socket;)V")
	public Class8(@OriginalArg(0) Applet_Sub1 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Socket arg2) throws IOException {
		try {
			this.anApplet_Sub1_2 = arg0;
			this.aSocket1 = arg2;
			this.aSocket1.setSoTimeout(30000);
			this.aSocket1.setTcpNoDelay(true);
			this.anInputStream1 = this.aSocket1.getInputStream();
			this.anOutputStream1 = this.aSocket1.getOutputStream();
		} catch (@Pc(48) RuntimeException local48) {
			signlink.reporterror("25915, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local48.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "()V")
	public void method242() {
		this.aBoolean101 = true;
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
		this.aBoolean102 = false;
		synchronized (this) {
			this.notify();
		}
		this.aByteArray3 = null;
	}

	@OriginalMember(owner = "client!e", name = "b", descriptor = "()I")
	public int method243() throws IOException {
		return this.aBoolean101 ? 0 : this.anInputStream1.read();
	}

	@OriginalMember(owner = "client!e", name = "c", descriptor = "()I")
	public int method244() throws IOException {
		return this.aBoolean101 ? 0 : this.anInputStream1.available();
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "([BII)V")
	public void method245(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		if (this.aBoolean101) {
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

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(I[BBI)V")
	public void method246(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) throws IOException {
		try {
			if (this.aByte20 != -39) {
				this.aBoolean100 = !this.aBoolean100;
			}
			if (!this.aBoolean101) {
				if (this.aBoolean103) {
					this.aBoolean103 = false;
					throw new IOException("Error in writer thread");
				}
				if (this.aByteArray3 == null) {
					this.aByteArray3 = new byte[5000];
				}
				synchronized (this) {
					for (@Pc(40) int local40 = 0; local40 < arg0; local40++) {
						this.aByteArray3[this.anInt474] = arg1[local40 + 0];
						this.anInt474 = (this.anInt474 + 1) % 5000;
						if (this.anInt474 == (this.anInt473 + 4900) % 5000) {
							throw new IOException("buffer overflow");
						}
					}
					if (!this.aBoolean102) {
						this.aBoolean102 = true;
						this.anApplet_Sub1_2.method90(this, 3);
					}
					this.notify();
				}
			}
		} catch (@Pc(99) RuntimeException local99) {
			signlink.reporterror("97931, " + arg0 + ", " + arg1 + ", " + -39 + ", " + 0 + ", " + local99.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!e", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean102) {
			@Pc(38) int local38;
			@Pc(27) int local27;
			synchronized (this) {
				if (this.anInt474 == this.anInt473) {
					try {
						this.wait();
					} catch (@Pc(16) InterruptedException local16) {
					}
				}
				if (!this.aBoolean102) {
					return;
				}
				local27 = this.anInt473;
				if (this.anInt474 >= this.anInt473) {
					local38 = this.anInt474 - this.anInt473;
				} else {
					local38 = 5000 - this.anInt473;
				}
			}
			if (local38 > 0) {
				try {
					this.anOutputStream1.write(this.aByteArray3, local27, local38);
				} catch (@Pc(62) IOException local62) {
					this.aBoolean103 = true;
				}
				this.anInt473 = (this.anInt473 + local38) % 5000;
				try {
					if (this.anInt474 == this.anInt473) {
						this.anOutputStream1.flush();
					}
				} catch (@Pc(83) IOException local83) {
					this.aBoolean103 = true;
				}
			}
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(I)V")
	public void method247() {
		try {
			System.out.println("dummy:" + this.aBoolean101);
			System.out.println("tcycl:" + this.anInt473);
			System.out.println("tnum:" + this.anInt474);
			System.out.println("writer:" + this.aBoolean102);
			System.out.println("ioerror:" + this.aBoolean103);
			try {
				System.out.println("available:" + this.method244());
			} catch (@Pc(66) IOException local66) {
			}
		} catch (@Pc(68) RuntimeException local68) {
			signlink.reporterror("92308, " + -747 + ", " + local68.toString());
			throw new RuntimeException();
		}
	}
}
