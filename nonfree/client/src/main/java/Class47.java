import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!YVLAOVKQ")
public final class Class47 implements Runnable {

	@OriginalMember(owner = "client!YVLAOVKQ", name = "h", descriptor = "[B")
	private byte[] aByteArray19;

	@OriginalMember(owner = "client!YVLAOVKQ", name = "i", descriptor = "I")
	private int anInt696;

	@OriginalMember(owner = "client!YVLAOVKQ", name = "j", descriptor = "I")
	private int anInt697;

	@OriginalMember(owner = "client!YVLAOVKQ", name = "a", descriptor = "Z")
	private boolean aBoolean173 = true;

	@OriginalMember(owner = "client!YVLAOVKQ", name = "b", descriptor = "I")
	private int anInt695 = 6;

	@OriginalMember(owner = "client!YVLAOVKQ", name = "f", descriptor = "Z")
	private boolean aBoolean174 = false;

	@OriginalMember(owner = "client!YVLAOVKQ", name = "k", descriptor = "Z")
	private boolean aBoolean175 = false;

	@OriginalMember(owner = "client!YVLAOVKQ", name = "l", descriptor = "Z")
	private boolean aBoolean176 = false;

	@OriginalMember(owner = "client!YVLAOVKQ", name = "g", descriptor = "Lclient!CMOCHGYM;")
	private Applet_Sub1 anApplet_Sub1_2;

	@OriginalMember(owner = "client!YVLAOVKQ", name = "e", descriptor = "Ljava/net/Socket;")
	private Socket aSocket2;

	@OriginalMember(owner = "client!YVLAOVKQ", name = "c", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream2;

	@OriginalMember(owner = "client!YVLAOVKQ", name = "d", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream2;

	@OriginalMember(owner = "client!YVLAOVKQ", name = "<init>", descriptor = "(Lclient!CMOCHGYM;ILjava/net/Socket;)V")
	public Class47(@OriginalArg(0) Applet_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Socket arg2) throws IOException {
		try {
			this.anApplet_Sub1_2 = arg0;
			this.aSocket2 = arg2;
			this.aSocket2.setSoTimeout(30000);
			this.aSocket2.setTcpNoDelay(true);
			this.anInputStream2 = this.aSocket2.getInputStream();
			this.anOutputStream2 = this.aSocket2.getOutputStream();
		} catch (@Pc(52) RuntimeException local52) {
			signlink.reporterror("40347, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local52.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YVLAOVKQ", name = "a", descriptor = "()V")
	public void method521() {
		this.aBoolean174 = true;
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
		this.aBoolean175 = false;
		synchronized (this) {
			this.notify();
		}
		this.aByteArray19 = null;
	}

	@OriginalMember(owner = "client!YVLAOVKQ", name = "b", descriptor = "()I")
	public int method522() throws IOException {
		return this.aBoolean174 ? 0 : this.anInputStream2.read();
	}

	@OriginalMember(owner = "client!YVLAOVKQ", name = "c", descriptor = "()I")
	public int method523() throws IOException {
		return this.aBoolean174 ? 0 : this.anInputStream2.available();
	}

	@OriginalMember(owner = "client!YVLAOVKQ", name = "a", descriptor = "([BII)V")
	public void method524(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		if (this.aBoolean174) {
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

	@OriginalMember(owner = "client!YVLAOVKQ", name = "a", descriptor = "([BIII)V")
	public void method525(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) throws IOException {
		try {
			if (!this.aBoolean174) {
				if (this.aBoolean176) {
					this.aBoolean176 = false;
					throw new IOException("Error in writer thread");
				}
				if (this.aByteArray19 == null) {
					this.aByteArray19 = new byte[5000];
				}
				synchronized (this) {
					for (@Pc(28) int local28 = 0; local28 < arg1; local28++) {
						this.aByteArray19[this.anInt697] = arg0[local28 + 0];
						this.anInt697 = (this.anInt697 + 1) % 5000;
						if (this.anInt697 == (this.anInt696 + 4900) % 5000) {
							throw new IOException("buffer overflow");
						}
					}
					if (!this.aBoolean175) {
						this.aBoolean175 = true;
						this.anApplet_Sub1_2.method585(this, 3);
					}
					this.notify();
				}
			}
		} catch (@Pc(91) RuntimeException local91) {
			signlink.reporterror("82596, " + arg0 + ", " + arg1 + ", " + 29470 + ", " + 0 + ", " + local91.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YVLAOVKQ", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean175) {
			@Pc(38) int local38;
			@Pc(27) int local27;
			synchronized (this) {
				if (this.anInt697 == this.anInt696) {
					try {
						this.wait();
					} catch (@Pc(16) InterruptedException local16) {
					}
				}
				if (!this.aBoolean175) {
					return;
				}
				local27 = this.anInt696;
				if (this.anInt697 >= this.anInt696) {
					local38 = this.anInt697 - this.anInt696;
				} else {
					local38 = 5000 - this.anInt696;
				}
			}
			if (local38 > 0) {
				try {
					this.anOutputStream2.write(this.aByteArray19, local27, local38);
				} catch (@Pc(62) IOException local62) {
					this.aBoolean176 = true;
				}
				this.anInt696 = (this.anInt696 + local38) % 5000;
				try {
					if (this.anInt697 == this.anInt696) {
						this.anOutputStream2.flush();
					}
				} catch (@Pc(83) IOException local83) {
					this.aBoolean176 = true;
				}
			}
		}
	}

	@OriginalMember(owner = "client!YVLAOVKQ", name = "a", descriptor = "(Z)V")
	public void method526() {
		try {
			System.out.println("dummy:" + this.aBoolean174);
			System.out.println("tcycl:" + this.anInt696);
			System.out.println("tnum:" + this.anInt697);
			System.out.println("writer:" + this.aBoolean175);
			System.out.println("ioerror:" + this.aBoolean176);
			try {
				System.out.println("available:" + this.method523());
			} catch (@Pc(64) IOException local64) {
			}
		} catch (@Pc(66) RuntimeException local66) {
			signlink.reporterror("75657, " + true + ", " + local66.toString());
			throw new RuntimeException();
		}
	}
}
