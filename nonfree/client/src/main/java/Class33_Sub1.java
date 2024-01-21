import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.zip.CRC32;
import java.util.zip.GZIPInputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ZPGPWCCV")
public final class Class33_Sub1 extends Class33 implements Runnable {

	@OriginalMember(owner = "client!ZPGPWCCV", name = "b", descriptor = "I")
	private int anInt783;

	@OriginalMember(owner = "client!ZPGPWCCV", name = "c", descriptor = "[B")
	private byte[] aByteArray18;

	@OriginalMember(owner = "client!ZPGPWCCV", name = "d", descriptor = "[I")
	private int[] anIntArray204;

	@OriginalMember(owner = "client!ZPGPWCCV", name = "i", descriptor = "I")
	private int anInt784;

	@OriginalMember(owner = "client!ZPGPWCCV", name = "j", descriptor = "I")
	private int anInt785;

	@OriginalMember(owner = "client!ZPGPWCCV", name = "k", descriptor = "I")
	private int anInt786;

	@OriginalMember(owner = "client!ZPGPWCCV", name = "m", descriptor = "I")
	private int anInt787;

	@OriginalMember(owner = "client!ZPGPWCCV", name = "n", descriptor = "[I")
	private int[] anIntArray205;

	@OriginalMember(owner = "client!ZPGPWCCV", name = "p", descriptor = "I")
	public int anInt788;

	@OriginalMember(owner = "client!ZPGPWCCV", name = "q", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream2;

	@OriginalMember(owner = "client!ZPGPWCCV", name = "r", descriptor = "I")
	public int anInt789;

	@OriginalMember(owner = "client!ZPGPWCCV", name = "u", descriptor = "I")
	private int anInt790;

	@OriginalMember(owner = "client!ZPGPWCCV", name = "w", descriptor = "Ljava/net/Socket;")
	private Socket aSocket2;

	@OriginalMember(owner = "client!ZPGPWCCV", name = "B", descriptor = "[I")
	private int[] anIntArray206;

	@OriginalMember(owner = "client!ZPGPWCCV", name = "C", descriptor = "I")
	private int anInt791;

	@OriginalMember(owner = "client!ZPGPWCCV", name = "D", descriptor = "I")
	private int anInt792;

	@OriginalMember(owner = "client!ZPGPWCCV", name = "E", descriptor = "I")
	private int anInt793;

	@OriginalMember(owner = "client!ZPGPWCCV", name = "G", descriptor = "[I")
	private int[] anIntArray207;

	@OriginalMember(owner = "client!ZPGPWCCV", name = "H", descriptor = "[I")
	private int[] anIntArray208;

	@OriginalMember(owner = "client!ZPGPWCCV", name = "J", descriptor = "I")
	private int anInt795;

	@OriginalMember(owner = "client!ZPGPWCCV", name = "L", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream2;

	@OriginalMember(owner = "client!ZPGPWCCV", name = "N", descriptor = "Lclient!QSLIGKQQ;")
	private Class10_Sub1_Sub4 aClass10_Sub1_Sub4_1;

	@OriginalMember(owner = "client!ZPGPWCCV", name = "O", descriptor = "Lclient!client;")
	private client aClient5;

	@OriginalMember(owner = "client!ZPGPWCCV", name = "Q", descriptor = "I")
	private int anInt796;

	@OriginalMember(owner = "client!ZPGPWCCV", name = "R", descriptor = "[I")
	private int[] anIntArray209;

	@OriginalMember(owner = "client!ZPGPWCCV", name = "T", descriptor = "J")
	private long aLong26;

	@OriginalMember(owner = "client!ZPGPWCCV", name = "U", descriptor = "I")
	public int anInt797;

	@OriginalMember(owner = "client!ZPGPWCCV", name = "e", descriptor = "[[B")
	private byte[][] aByteArrayArray4 = new byte[4][];

	@OriginalMember(owner = "client!ZPGPWCCV", name = "f", descriptor = "Z")
	private boolean aBoolean204 = false;

	@OriginalMember(owner = "client!ZPGPWCCV", name = "g", descriptor = "Z")
	private boolean aBoolean205 = true;

	@OriginalMember(owner = "client!ZPGPWCCV", name = "h", descriptor = "Lclient!BOHLFXVX;")
	private Class6 aClass6_5 = new Class6(true);

	@OriginalMember(owner = "client!ZPGPWCCV", name = "l", descriptor = "[[I")
	private int[][] anIntArrayArray20 = new int[4][];

	@OriginalMember(owner = "client!ZPGPWCCV", name = "o", descriptor = "Ljava/lang/String;")
	public String aString15 = "";

	@OriginalMember(owner = "client!ZPGPWCCV", name = "s", descriptor = "Lclient!BOHLFXVX;")
	private Class6 aClass6_6 = new Class6(true);

	@OriginalMember(owner = "client!ZPGPWCCV", name = "t", descriptor = "Z")
	private boolean aBoolean206 = false;

	@OriginalMember(owner = "client!ZPGPWCCV", name = "v", descriptor = "Ljava/util/zip/CRC32;")
	private CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!ZPGPWCCV", name = "x", descriptor = "Z")
	private boolean aBoolean207 = false;

	@OriginalMember(owner = "client!ZPGPWCCV", name = "y", descriptor = "Lclient!BOHLFXVX;")
	private Class6 aClass6_7 = new Class6(true);

	@OriginalMember(owner = "client!ZPGPWCCV", name = "z", descriptor = "Lclient!BOHLFXVX;")
	private Class6 aClass6_8 = new Class6(true);

	@OriginalMember(owner = "client!ZPGPWCCV", name = "A", descriptor = "[B")
	private byte[] aByteArray19 = new byte[65000];

	@OriginalMember(owner = "client!ZPGPWCCV", name = "F", descriptor = "[B")
	private byte[] aByteArray20 = new byte[500];

	@OriginalMember(owner = "client!ZPGPWCCV", name = "I", descriptor = "I")
	private int anInt794 = 591;

	@OriginalMember(owner = "client!ZPGPWCCV", name = "K", descriptor = "Lclient!CZYJUOKA;")
	private Class9 aClass9_2 = new Class9(true);

	@OriginalMember(owner = "client!ZPGPWCCV", name = "M", descriptor = "B")
	private byte aByte44 = 6;

	@OriginalMember(owner = "client!ZPGPWCCV", name = "P", descriptor = "Lclient!BOHLFXVX;")
	private Class6 aClass6_9 = new Class6(true);

	@OriginalMember(owner = "client!ZPGPWCCV", name = "S", descriptor = "[[I")
	private int[][] anIntArrayArray21 = new int[4][];

	@OriginalMember(owner = "client!ZPGPWCCV", name = "V", descriptor = "Z")
	private boolean aBoolean208 = false;

	@OriginalMember(owner = "client!ZPGPWCCV", name = "a", descriptor = "(Z)V")
	private void method553() {
		try {
			try {
				@Pc(10) int local10 = this.anInputStream2.available();
				@Pc(45) int local45;
				@Pc(61) int local61;
				if (this.anInt792 == 0 && local10 >= 6) {
					this.aBoolean204 = true;
					for (@Pc(21) int local21 = 0; local21 < 6; local21 += this.anInputStream2.read(this.aByteArray20, local21, 6 - local21)) {
					}
					local45 = this.aByteArray20[0] & 0xFF;
					local61 = ((this.aByteArray20[1] & 0xFF) << 8) + (this.aByteArray20[2] & 0xFF);
					@Pc(77) int local77 = ((this.aByteArray20[3] & 0xFF) << 8) + (this.aByteArray20[4] & 0xFF);
					@Pc(84) int local84 = this.aByteArray20[5] & 0xFF;
					this.aClass10_Sub1_Sub4_1 = null;
					for (@Pc(92) Class10_Sub1_Sub4 local92 = (Class10_Sub1_Sub4) this.aClass6_9.method6(); local92 != null; local92 = (Class10_Sub1_Sub4) this.aClass6_9.method8()) {
						if (local92.anInt486 == local45 && local92.anInt487 == local61) {
							this.aClass10_Sub1_Sub4_1 = local92;
						}
						if (this.aClass10_Sub1_Sub4_1 != null) {
							local92.anInt488 = 0;
						}
					}
					if (this.aClass10_Sub1_Sub4_1 != null) {
						this.anInt790 = 0;
						if (local77 == 0) {
							signlink.reporterror("Rej: " + local45 + "," + local61);
							this.aClass10_Sub1_Sub4_1.aByteArray13 = null;
							if (this.aClass10_Sub1_Sub4_1.aBoolean125) {
								@Pc(150) Class6 local150 = this.aClass6_7;
								synchronized (this.aClass6_7) {
									this.aClass6_7.method3(this.aClass10_Sub1_Sub4_1);
								}
							} else {
								this.aClass10_Sub1_Sub4_1.method534();
							}
							this.aClass10_Sub1_Sub4_1 = null;
						} else {
							if (this.aClass10_Sub1_Sub4_1.aByteArray13 == null && local84 == 0) {
								this.aClass10_Sub1_Sub4_1.aByteArray13 = new byte[local77];
							}
							if (this.aClass10_Sub1_Sub4_1.aByteArray13 == null && local84 != 0) {
								throw new IOException("missing start of file");
							}
						}
					}
					this.anInt791 = local84 * 500;
					this.anInt792 = 500;
					if (this.anInt792 > local77 - local84 * 500) {
						this.anInt792 = local77 - local84 * 500;
					}
				}
				if (this.anInt792 > 0 && local10 >= this.anInt792) {
					this.aBoolean204 = true;
					@Pc(229) byte[] local229 = this.aByteArray20;
					local45 = 0;
					if (this.aClass10_Sub1_Sub4_1 != null) {
						local229 = this.aClass10_Sub1_Sub4_1.aByteArray13;
						local45 = this.anInt791;
					}
					for (local61 = 0; local61 < this.anInt792; local61 += this.anInputStream2.read(local229, local61 + local45, this.anInt792 - local61)) {
					}
					if (this.anInt792 + this.anInt791 >= local229.length && this.aClass10_Sub1_Sub4_1 != null) {
						if (this.aClient5.aClass24Array1[0] != null) {
							this.aClient5.aClass24Array1[this.aClass10_Sub1_Sub4_1.anInt486 + 1].method242(local229.length, local229, this.aClass10_Sub1_Sub4_1.anInt487);
						}
						if (!this.aClass10_Sub1_Sub4_1.aBoolean125 && this.aClass10_Sub1_Sub4_1.anInt486 == 3) {
							this.aClass10_Sub1_Sub4_1.aBoolean125 = true;
							this.aClass10_Sub1_Sub4_1.anInt486 = 93;
						}
						if (this.aClass10_Sub1_Sub4_1.aBoolean125) {
							@Pc(322) Class6 local322 = this.aClass6_7;
							synchronized (this.aClass6_7) {
								this.aClass6_7.method3(this.aClass10_Sub1_Sub4_1);
							}
						} else {
							this.aClass10_Sub1_Sub4_1.method534();
						}
					}
					this.anInt792 = 0;
				}
			} catch (@Pc(343) IOException local343) {
				try {
					this.aSocket2.close();
				} catch (@Pc(348) Exception local348) {
				}
				this.aSocket2 = null;
				this.anInputStream2 = null;
				this.anOutputStream2 = null;
				this.anInt792 = 0;
			}
		} catch (@Pc(362) RuntimeException local362) {
			signlink.reporterror("74821, " + false + ", " + local362.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZPGPWCCV", name = "a", descriptor = "(II)I")
	public int method554(@OriginalArg(0) int arg0) {
		try {
			return this.aByteArray18[arg0] & 0xFF;
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("28439, " + arg0 + ", " + -493 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZPGPWCCV", name = "a", descriptor = "(I)V")
	@Override
	public void method552(@OriginalArg(0) int arg0) {
		this.method558(0, arg0);
	}

	@OriginalMember(owner = "client!ZPGPWCCV", name = "b", descriptor = "(I)V")
	private void method555() {
		try {
			while (this.anInt785 == 0) {
				if (this.anInt786 >= 10 || this.anInt784 == 0) {
					return;
				}
				@Pc(10) Class6 local10 = this.aClass6_8;
				@Pc(17) Class10_Sub1_Sub4 local17;
				synchronized (this.aClass6_8) {
					local17 = (Class10_Sub1_Sub4) this.aClass6_8.method5();
				}
				while (local17 != null) {
					if (this.aByteArrayArray4[local17.anInt486][local17.anInt487] != 0) {
						this.aByteArrayArray4[local17.anInt486][local17.anInt487] = 0;
						this.aClass6_9.method3(local17);
						this.method571(this.anInt787, local17);
						this.aBoolean204 = true;
						if (this.anInt783 < this.anInt789) {
							this.anInt783++;
						}
						this.aString15 = "Loading extra files - " + this.anInt783 * 100 / this.anInt789 + "%";
						this.anInt786++;
						if (this.anInt786 == 10) {
							return;
						}
					}
					local10 = this.aClass6_8;
					synchronized (this.aClass6_8) {
						local17 = (Class10_Sub1_Sub4) this.aClass6_8.method5();
					}
				}
				for (@Pc(112) int local112 = 0; local112 < 4; local112++) {
					@Pc(119) byte[] local119 = this.aByteArrayArray4[local112];
					@Pc(122) int local122 = local119.length;
					for (@Pc(124) int local124 = 0; local124 < local122; local124++) {
						if (local119[local124] == this.anInt784) {
							local119[local124] = 0;
							local17 = new Class10_Sub1_Sub4();
							local17.anInt486 = local112;
							local17.anInt487 = local124;
							local17.aBoolean125 = false;
							this.aClass6_9.method3(local17);
							this.method571(this.anInt787, local17);
							this.aBoolean204 = true;
							if (this.anInt783 < this.anInt789) {
								this.anInt783++;
							}
							this.aString15 = "Loading extra files - " + this.anInt783 * 100 / this.anInt789 + "%";
							this.anInt786++;
							if (this.anInt786 == 10) {
								return;
							}
						}
					}
				}
				this.anInt784--;
			}
		} catch (@Pc(223) RuntimeException local223) {
			signlink.reporterror("81922, " + 0 + ", " + local223.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZPGPWCCV", name = "a", descriptor = "(IIBI)V")
	public void method556(@OriginalArg(1) int arg0, @OriginalArg(2) byte arg1, @OriginalArg(3) int arg2) {
		try {
			if (this.aClient5.aClass24Array1[0] != null && this.anIntArrayArray21[arg0][arg2] != 0) {
				@Pc(31) byte[] local31 = this.aClient5.aClass24Array1[arg0 + 1].method241(this.aByte44, arg2);
				if (!this.method570(local31, 764, this.anIntArrayArray21[arg0][arg2], this.anIntArrayArray20[arg0][arg2])) {
					this.aByteArrayArray4[arg0][arg2] = arg1;
					if (arg1 > this.anInt784) {
						this.anInt784 = arg1;
					}
					this.anInt789++;
				}
			}
		} catch (@Pc(71) RuntimeException local71) {
			signlink.reporterror("39133, " + -44 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local71.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZPGPWCCV", name = "a", descriptor = "(IZ)Z")
	public boolean method557(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		try {
			if (!arg1) {
				throw new NullPointerException();
			}
			return this.anIntArray208[arg0] == 1;
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("75311, " + arg0 + ", " + arg1 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZPGPWCCV", name = "b", descriptor = "(II)V")
	public void method558(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 > this.anIntArrayArray21.length || arg1 < 0 || arg1 > this.anIntArrayArray21[arg0].length || this.anIntArrayArray21[arg0][arg1] == 0) {
			return;
		}
		@Pc(27) Class9 local27 = this.aClass9_2;
		synchronized (this.aClass9_2) {
			@Pc(34) Class10_Sub1_Sub4 local34;
			for (local34 = (Class10_Sub1_Sub4) this.aClass9_2.method35(); local34 != null; local34 = (Class10_Sub1_Sub4) this.aClass9_2.method36()) {
				if (local34.anInt486 == arg0 && local34.anInt487 == arg1) {
					return;
				}
			}
			local34 = new Class10_Sub1_Sub4();
			local34.anInt486 = arg0;
			local34.anInt487 = arg1;
			local34.aBoolean125 = true;
			@Pc(71) Class6 local71 = this.aClass6_5;
			synchronized (this.aClass6_5) {
				this.aClass6_5.method3(local34);
			}
			this.aClass9_2.method33(local34);
		}
	}

	@OriginalMember(owner = "client!ZPGPWCCV", name = "a", descriptor = "()Lclient!QSLIGKQQ;")
	public Class10_Sub1_Sub4 method559() {
		@Pc(4) Class6 local4 = this.aClass6_7;
		@Pc(11) Class10_Sub1_Sub4 local11;
		synchronized (this.aClass6_7) {
			local11 = (Class10_Sub1_Sub4) this.aClass6_7.method5();
		}
		if (local11 == null) {
			return null;
		}
		@Pc(24) Class9 local24 = this.aClass9_2;
		synchronized (this.aClass9_2) {
			local11.method535();
		}
		if (local11.aByteArray13 == null) {
			return local11;
		}
		@Pc(41) int local41 = 0;
		try {
			@Pc(50) GZIPInputStream local50 = new GZIPInputStream(new ByteArrayInputStream(local11.aByteArray13));
			while (true) {
				if (local41 == this.aByteArray19.length) {
					throw new RuntimeException("buffer overflow!");
				}
				@Pc(71) int local71 = local50.read(this.aByteArray19, local41, this.aByteArray19.length - local41);
				if (local71 == -1) {
					break;
				}
				local41 += local71;
			}
		} catch (@Pc(82) IOException local82) {
			throw new RuntimeException("error unzipping");
		}
		local11.aByteArray13 = new byte[local41];
		for (@Pc(93) int local93 = 0; local93 < local41; local93++) {
			local11.aByteArray13[local93] = this.aByteArray19[local93];
		}
		return local11;
	}

	@OriginalMember(owner = "client!ZPGPWCCV", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (this.aBoolean205) {
				this.anInt788++;
				@Pc(11) byte local11 = 20;
				if (this.anInt784 == 0 && this.aClient5.aClass24Array1[0] != null) {
					local11 = 50;
				}
				try {
					Thread.sleep((long) local11);
				} catch (@Pc(27) Exception local27) {
				}
				this.aBoolean204 = true;
				for (@Pc(32) int local32 = 0; local32 < 100 && this.aBoolean204; local32++) {
					this.aBoolean204 = false;
					this.method567();
					this.method560();
					if (this.anInt785 == 0 && local32 >= 5) {
						break;
					}
					this.method555();
					if (this.anInputStream2 != null) {
						this.method553();
					}
				}
				@Pc(67) boolean local67 = false;
				@Pc(72) Class10_Sub1_Sub4 local72;
				for (local72 = (Class10_Sub1_Sub4) this.aClass6_9.method6(); local72 != null; local72 = (Class10_Sub1_Sub4) this.aClass6_9.method8()) {
					if (local72.aBoolean125) {
						local67 = true;
						local72.anInt488++;
						if (local72.anInt488 > 50) {
							local72.anInt488 = 0;
							this.method571(this.anInt787, local72);
						}
					}
				}
				if (!local67) {
					for (local72 = (Class10_Sub1_Sub4) this.aClass6_9.method6(); local72 != null; local72 = (Class10_Sub1_Sub4) this.aClass6_9.method8()) {
						local67 = true;
						local72.anInt488++;
						if (local72.anInt488 > 50) {
							local72.anInt488 = 0;
							this.method571(this.anInt787, local72);
						}
					}
				}
				if (local67) {
					this.anInt790++;
					if (this.anInt790 > 750) {
						try {
							this.aSocket2.close();
						} catch (@Pc(159) Exception local159) {
						}
						this.aSocket2 = null;
						this.anInputStream2 = null;
						this.anOutputStream2 = null;
						this.anInt792 = 0;
					}
				} else {
					this.anInt790 = 0;
					this.aString15 = "";
				}
				if (this.aClient5.aBoolean244 && this.aSocket2 != null && this.anOutputStream2 != null && (this.anInt784 > 0 || this.aClient5.aClass24Array1[0] == null)) {
					this.anInt796++;
					if (this.anInt796 > 500) {
						this.anInt796 = 0;
						this.aByteArray20[0] = 0;
						this.aByteArray20[1] = 0;
						this.aByteArray20[2] = 0;
						this.aByteArray20[3] = 10;
						try {
							this.anOutputStream2.write(this.aByteArray20, 0, 4);
						} catch (@Pc(240) IOException local240) {
							this.anInt790 = 5000;
						}
					}
				}
			}
		} catch (@Pc(249) Exception local249) {
			signlink.reporterror("od_ex " + local249.getMessage());
		}
	}

	@OriginalMember(owner = "client!ZPGPWCCV", name = "c", descriptor = "(I)V")
	private void method560() {
		try {
			this.anInt785 = 0;
			this.anInt786 = 0;
			@Pc(15) Class10_Sub1_Sub4 local15;
			for (local15 = (Class10_Sub1_Sub4) this.aClass6_9.method6(); local15 != null; local15 = (Class10_Sub1_Sub4) this.aClass6_9.method8()) {
				if (local15.aBoolean125) {
					this.anInt785++;
				} else {
					this.anInt786++;
				}
			}
			while (this.anInt785 < 10) {
				local15 = (Class10_Sub1_Sub4) this.aClass6_6.method5();
				if (local15 == null) {
					break;
				}
				if (this.aByteArrayArray4[local15.anInt486][local15.anInt487] != 0) {
					this.anInt783++;
				}
				this.aByteArrayArray4[local15.anInt486][local15.anInt487] = 0;
				this.aClass6_9.method3(local15);
				this.anInt785++;
				this.method571(this.anInt787, local15);
				this.aBoolean204 = true;
			}
		} catch (@Pc(99) RuntimeException local99) {
			signlink.reporterror("54967, " + 0 + ", " + local99.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZPGPWCCV", name = "a", descriptor = "(ZB)V")
	public void method561(@OriginalArg(0) boolean arg0) {
		try {
			@Pc(14) int local14 = this.anIntArray205.length;
			for (@Pc(16) int local16 = 0; local16 < local14; local16++) {
				if (arg0 || this.anIntArray204[local16] != 0) {
					this.method556(3, (byte) 2, this.anIntArray207[local16]);
					this.method556(3, (byte) 2, this.anIntArray206[local16]);
				}
			}
		} catch (@Pc(49) RuntimeException local49) {
			signlink.reporterror("13462, " + arg0 + ", " + 109 + ", " + local49.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZPGPWCCV", name = "b", descriptor = "()I")
	public int method562() {
		@Pc(2) Class9 local2 = this.aClass9_2;
		synchronized (this.aClass9_2) {
			return this.aClass9_2.method37();
		}
	}

	@OriginalMember(owner = "client!ZPGPWCCV", name = "b", descriptor = "(IZ)Z")
	public boolean method563(@OriginalArg(0) int arg0) {
		try {
			for (@Pc(1) int local1 = 0; local1 < this.anIntArray205.length; local1++) {
				if (this.anIntArray207[local1] == arg0) {
					return true;
				}
			}
			return false;
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("39871, " + arg0 + ", " + false + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZPGPWCCV", name = "a", descriptor = "(Lclient!ATJMVOZR;Lclient!client;)V")
	public void method564(@OriginalArg(0) Class2 arg0, @OriginalArg(1) client arg1) {
		@Pc(20) String[] local20 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
		@Pc(36) int local36;
		@Pc(56) int local56;
		for (@Pc(22) int local22 = 0; local22 < 4; local22++) {
			@Pc(31) byte[] local31 = arg0.method2(local20[local22], null);
			local36 = local31.length / 2;
			@Pc(42) Class10_Sub1_Sub3 local42 = new Class10_Sub1_Sub3(true, local31);
			this.anIntArrayArray21[local22] = new int[local36];
			this.aByteArrayArray4[local22] = new byte[local36];
			for (local56 = 0; local56 < local36; local56++) {
				this.anIntArrayArray21[local22][local56] = local42.method313();
			}
		}
		@Pc(93) String[] local93 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
		@Pc(104) byte[] local104;
		for (local36 = 0; local36 < 4; local36++) {
			local104 = arg0.method2(local93[local36], null);
			local56 = local104.length / 4;
			@Pc(115) Class10_Sub1_Sub3 local115 = new Class10_Sub1_Sub3(true, local104);
			this.anIntArrayArray20[local36] = new int[local56];
			for (@Pc(123) int local123 = 0; local123 < local56; local123++) {
				this.anIntArrayArray20[local36][local123] = local115.method316();
			}
		}
		local104 = arg0.method2("model_index", null);
		local56 = this.anIntArrayArray21[0].length;
		this.aByteArray18 = new byte[local56];
		for (@Pc(158) int local158 = 0; local158 < local56; local158++) {
			if (local158 < local104.length) {
				this.aByteArray18[local158] = local104[local158];
			} else {
				this.aByteArray18[local158] = 0;
			}
		}
		local104 = arg0.method2("map_index", null);
		@Pc(193) Class10_Sub1_Sub3 local193 = new Class10_Sub1_Sub3(true, local104);
		local56 = local104.length / 7;
		this.anIntArray205 = new int[local56];
		this.anIntArray206 = new int[local56];
		this.anIntArray207 = new int[local56];
		this.anIntArray204 = new int[local56];
		for (@Pc(216) int local216 = 0; local216 < local56; local216++) {
			this.anIntArray205[local216] = local193.method313();
			this.anIntArray206[local216] = local193.method313();
			this.anIntArray207[local216] = local193.method313();
			this.anIntArray204[local216] = local193.method311();
		}
		local104 = arg0.method2("anim_index", null);
		local193 = new Class10_Sub1_Sub3(true, local104);
		local56 = local104.length / 2;
		this.anIntArray209 = new int[local56];
		for (@Pc(268) int local268 = 0; local268 < local56; local268++) {
			this.anIntArray209[local268] = local193.method313();
		}
		local104 = arg0.method2("midi_index", null);
		local193 = new Class10_Sub1_Sub3(true, local104);
		local56 = local104.length;
		this.anIntArray208 = new int[local56];
		for (@Pc(300) int local300 = 0; local300 < local56; local300++) {
			this.anIntArray208[local300] = local193.method311();
		}
		this.aClient5 = arg1;
		this.aBoolean205 = true;
		this.aClient5.method587(this, 2);
	}

	@OriginalMember(owner = "client!ZPGPWCCV", name = "a", descriptor = "(B)V")
	public void method565() {
		try {
			@Pc(2) Class6 local2 = this.aClass6_8;
			synchronized (this.aClass6_8) {
				this.aClass6_8.method10();
			}
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("61235, " + -125 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZPGPWCCV", name = "a", descriptor = "(IIB)V")
	public void method566(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		try {
			if (this.aClient5.aClass24Array1[0] != null && (this.anIntArrayArray21[arg1][arg0] != 0 && (this.aByteArrayArray4[arg1][arg0] != 0 && this.anInt784 != 0))) {
				@Pc(30) Class10_Sub1_Sub4 local30 = new Class10_Sub1_Sub4();
				if (arg2 != -113) {
					this.anInt794 = 244;
				}
				local30.anInt486 = arg1;
				local30.anInt487 = arg0;
				local30.aBoolean125 = false;
				@Pc(48) Class6 local48 = this.aClass6_8;
				synchronized (this.aClass6_8) {
					this.aClass6_8.method3(local30);
				}
			}
		} catch (@Pc(61) RuntimeException local61) {
			signlink.reporterror("6642, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local61.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZPGPWCCV", name = "b", descriptor = "(Z)V")
	private void method567() {
		try {
			@Pc(4) Class6 local4 = this.aClass6_5;
			@Pc(11) Class10_Sub1_Sub4 local11;
			synchronized (this.aClass6_5) {
				local11 = (Class10_Sub1_Sub4) this.aClass6_5.method5();
			}
			while (local11 != null) {
				this.aBoolean204 = true;
				@Pc(33) byte[] local33 = null;
				if (this.aClient5.aClass24Array1[0] != null) {
					local33 = this.aClient5.aClass24Array1[local11.anInt486 + 1].method241(this.aByte44, local11.anInt487);
				}
				if (!this.method570(local33, 764, this.anIntArrayArray21[local11.anInt486][local11.anInt487], this.anIntArrayArray20[local11.anInt486][local11.anInt487])) {
					local33 = null;
				}
				@Pc(79) Class6 local79 = this.aClass6_5;
				synchronized (this.aClass6_5) {
					if (local33 == null) {
						this.aClass6_6.method3(local11);
					} else {
						local11.aByteArray13 = local33;
						@Pc(95) Class6 local95 = this.aClass6_7;
						synchronized (this.aClass6_7) {
							this.aClass6_7.method3(local11);
						}
					}
					local11 = (Class10_Sub1_Sub4) this.aClass6_5.method5();
				}
			}
		} catch (@Pc(122) RuntimeException local122) {
			signlink.reporterror("79437, " + true + ", " + local122.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZPGPWCCV", name = "c", descriptor = "()V")
	public void method568() {
		this.aBoolean205 = false;
	}

	@OriginalMember(owner = "client!ZPGPWCCV", name = "c", descriptor = "(II)I")
	public int method569(@OriginalArg(0) int arg0) {
		try {
			return this.anIntArrayArray21[arg0].length;
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("25460, " + arg0 + ", " + -31140 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZPGPWCCV", name = "a", descriptor = "([BIII)Z")
	private boolean method570(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			@Pc(3) boolean local3 = false;
			if (arg0 == null || arg0.length < 2) {
				return false;
			}
			@Pc(16) int local16 = arg0.length - 2;
			@Pc(32) int local32 = ((arg0[local16] & 0xFF) << 8) + (arg0[local16 + 1] & 0xFF);
			this.aCRC32_1.reset();
			this.aCRC32_1.update(arg0, 0, local16);
			@Pc(46) int local46 = (int) this.aCRC32_1.getValue();
			if (local32 == arg2) {
				return local46 == arg3;
			} else {
				return false;
			}
		} catch (@Pc(59) RuntimeException local59) {
			signlink.reporterror("51252, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local59.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZPGPWCCV", name = "a", descriptor = "(ILclient!QSLIGKQQ;)V")
	private void method571(@OriginalArg(0) int arg0, @OriginalArg(1) Class10_Sub1_Sub4 arg1) {
		try {
			if (arg0 == 0) {
				try {
					if (this.aSocket2 == null) {
						@Pc(9) long local9 = System.currentTimeMillis();
						if (local9 - this.aLong26 < 4000L) {
							return;
						}
						this.aLong26 = local9;
						this.aSocket2 = this.aClient5.method607(client.anInt869 + 43594);
						this.anInputStream2 = this.aSocket2.getInputStream();
						this.anOutputStream2 = this.aSocket2.getOutputStream();
						this.anOutputStream2.write(15);
						for (@Pc(44) int local44 = 0; local44 < 8; local44++) {
							this.anInputStream2.read();
						}
						this.anInt790 = 0;
					}
					this.aByteArray20[0] = (byte) arg1.anInt486;
					this.aByteArray20[1] = (byte) (arg1.anInt487 >> 8);
					this.aByteArray20[2] = (byte) arg1.anInt487;
					if (arg1.aBoolean125) {
						this.aByteArray20[3] = 2;
					} else if (this.aClient5.aBoolean244) {
						this.aByteArray20[3] = 0;
					} else {
						this.aByteArray20[3] = 1;
					}
					this.anOutputStream2.write(this.aByteArray20, 0, 4);
					this.anInt796 = 0;
					this.anInt797 = -10000;
				} catch (@Pc(121) IOException local121) {
					try {
						this.aSocket2.close();
					} catch (@Pc(126) Exception local126) {
					}
					this.aSocket2 = null;
					this.anInputStream2 = null;
					this.anOutputStream2 = null;
					this.anInt792 = 0;
					this.anInt797++;
				}
			}
		} catch (@Pc(146) RuntimeException local146) {
			signlink.reporterror("78345, " + arg0 + ", " + arg1 + ", " + local146.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZPGPWCCV", name = "d", descriptor = "(I)I")
	public int method572(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) boolean local3 = false;
			return this.anIntArray209.length;
		} catch (@Pc(8) RuntimeException local8) {
			signlink.reporterror("67787, " + arg0 + ", " + local8.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZPGPWCCV", name = "a", descriptor = "(IIII)I")
	public int method573(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(9) int local9 = (arg0 << 8) + arg1;
			for (@Pc(11) int local11 = 0; local11 < this.anIntArray205.length; local11++) {
				if (this.anIntArray205[local11] == local9) {
					if (arg2 == 0) {
						return this.anIntArray206[local11];
					}
					return this.anIntArray207[local11];
				}
			}
			return -1;
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("26806, " + 0 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local40.toString());
			throw new RuntimeException();
		}
	}
}
