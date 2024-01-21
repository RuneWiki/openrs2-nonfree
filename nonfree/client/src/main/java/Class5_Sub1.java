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

@OriginalClass("client!BPHGILGU")
public final class Class5_Sub1 extends Class5 implements Runnable {

	@OriginalMember(owner = "client!BPHGILGU", name = "d", descriptor = "B")
	private static byte aByte13 = 8;

	@OriginalMember(owner = "client!BPHGILGU", name = "b", descriptor = "I")
	private int anInt170;

	@OriginalMember(owner = "client!BPHGILGU", name = "c", descriptor = "Lclient!QWHFLOAQ;")
	private Class2_Sub1_Sub4 aClass2_Sub1_Sub4_1;

	@OriginalMember(owner = "client!BPHGILGU", name = "g", descriptor = "[B")
	private byte[] aByteArray2;

	@OriginalMember(owner = "client!BPHGILGU", name = "i", descriptor = "[I")
	private int[] anIntArray28;

	@OriginalMember(owner = "client!BPHGILGU", name = "k", descriptor = "Ljava/net/Socket;")
	private Socket aSocket1;

	@OriginalMember(owner = "client!BPHGILGU", name = "n", descriptor = "I")
	private int anInt172;

	@OriginalMember(owner = "client!BPHGILGU", name = "o", descriptor = "I")
	private int anInt173;

	@OriginalMember(owner = "client!BPHGILGU", name = "p", descriptor = "I")
	private int anInt174;

	@OriginalMember(owner = "client!BPHGILGU", name = "r", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream1;

	@OriginalMember(owner = "client!BPHGILGU", name = "v", descriptor = "[I")
	private int[] anIntArray29;

	@OriginalMember(owner = "client!BPHGILGU", name = "y", descriptor = "I")
	private int anInt176;

	@OriginalMember(owner = "client!BPHGILGU", name = "A", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream1;

	@OriginalMember(owner = "client!BPHGILGU", name = "C", descriptor = "[I")
	private int[] anIntArray30;

	@OriginalMember(owner = "client!BPHGILGU", name = "D", descriptor = "I")
	private int anInt177;

	@OriginalMember(owner = "client!BPHGILGU", name = "E", descriptor = "J")
	private long aLong9;

	@OriginalMember(owner = "client!BPHGILGU", name = "F", descriptor = "I")
	public int anInt178;

	@OriginalMember(owner = "client!BPHGILGU", name = "G", descriptor = "[I")
	private int[] anIntArray31;

	@OriginalMember(owner = "client!BPHGILGU", name = "H", descriptor = "I")
	private int anInt179;

	@OriginalMember(owner = "client!BPHGILGU", name = "J", descriptor = "I")
	public int anInt180;

	@OriginalMember(owner = "client!BPHGILGU", name = "K", descriptor = "[I")
	private int[] anIntArray32;

	@OriginalMember(owner = "client!BPHGILGU", name = "M", descriptor = "I")
	private int anInt181;

	@OriginalMember(owner = "client!BPHGILGU", name = "N", descriptor = "I")
	private int anInt182;

	@OriginalMember(owner = "client!BPHGILGU", name = "O", descriptor = "I")
	private int anInt183;

	@OriginalMember(owner = "client!BPHGILGU", name = "S", descriptor = "Lclient!client;")
	private client aClient1;

	@OriginalMember(owner = "client!BPHGILGU", name = "T", descriptor = "[I")
	private int[] anIntArray33;

	@OriginalMember(owner = "client!BPHGILGU", name = "a", descriptor = "Lclient!ZXKMWHPZ;")
	private Class50 aClass50_4 = new Class50((byte) 8);

	@OriginalMember(owner = "client!BPHGILGU", name = "e", descriptor = "Ljava/util/zip/CRC32;")
	private CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!BPHGILGU", name = "f", descriptor = "[[I")
	private int[][] anIntArrayArray1 = new int[4][];

	@OriginalMember(owner = "client!BPHGILGU", name = "h", descriptor = "Lclient!ZXKMWHPZ;")
	private Class50 aClass50_5 = new Class50((byte) 8);

	@OriginalMember(owner = "client!BPHGILGU", name = "j", descriptor = "I")
	private int anInt171 = 310;

	@OriginalMember(owner = "client!BPHGILGU", name = "l", descriptor = "[[I")
	private int[][] anIntArrayArray2 = new int[4][];

	@OriginalMember(owner = "client!BPHGILGU", name = "m", descriptor = "Ljava/lang/String;")
	public String aString3 = "";

	@OriginalMember(owner = "client!BPHGILGU", name = "q", descriptor = "I")
	private int anInt175 = 45070;

	@OriginalMember(owner = "client!BPHGILGU", name = "s", descriptor = "[B")
	private byte[] aByteArray3 = new byte[65000];

	@OriginalMember(owner = "client!BPHGILGU", name = "t", descriptor = "[B")
	private byte[] aByteArray4 = new byte[500];

	@OriginalMember(owner = "client!BPHGILGU", name = "u", descriptor = "Z")
	private boolean aBoolean46 = true;

	@OriginalMember(owner = "client!BPHGILGU", name = "w", descriptor = "[[B")
	private byte[][] aByteArrayArray2 = new byte[4][];

	@OriginalMember(owner = "client!BPHGILGU", name = "x", descriptor = "Lclient!ZXKMWHPZ;")
	private Class50 aClass50_6 = new Class50((byte) 8);

	@OriginalMember(owner = "client!BPHGILGU", name = "z", descriptor = "Lclient!ZXKMWHPZ;")
	private Class50 aClass50_7 = new Class50((byte) 8);

	@OriginalMember(owner = "client!BPHGILGU", name = "B", descriptor = "Lclient!KHIOJPOB;")
	private Class20 aClass20_1 = new Class20(aByte13);

	@OriginalMember(owner = "client!BPHGILGU", name = "I", descriptor = "Lclient!ZXKMWHPZ;")
	private Class50 aClass50_8 = new Class50((byte) 8);

	@OriginalMember(owner = "client!BPHGILGU", name = "L", descriptor = "Z")
	private boolean aBoolean47 = false;

	@OriginalMember(owner = "client!BPHGILGU", name = "P", descriptor = "I")
	private int anInt184 = 8;

	@OriginalMember(owner = "client!BPHGILGU", name = "Q", descriptor = "Z")
	private boolean aBoolean48 = true;

	@OriginalMember(owner = "client!BPHGILGU", name = "R", descriptor = "Z")
	private boolean aBoolean49 = false;

	@OriginalMember(owner = "client!BPHGILGU", name = "a", descriptor = "()I")
	public int method171() {
		@Pc(2) Class20 local2 = this.aClass20_1;
		synchronized (this.aClass20_1) {
			return this.aClass20_1.method241();
		}
	}

	@OriginalMember(owner = "client!BPHGILGU", name = "a", descriptor = "(II)Z")
	public boolean method172(@OriginalArg(0) int arg0) {
		try {
			return this.anIntArray33[arg0] == 1;
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("27179, " + arg0 + ", " + 4 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BPHGILGU", name = "b", descriptor = "(II)V")
	public void method173(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 > this.anIntArrayArray1.length || arg1 < 0 || arg1 > this.anIntArrayArray1[arg0].length || this.anIntArrayArray1[arg0][arg1] == 0) {
			return;
		}
		@Pc(27) Class20 local27 = this.aClass20_1;
		synchronized (this.aClass20_1) {
			@Pc(34) Class2_Sub1_Sub4 local34;
			for (local34 = (Class2_Sub1_Sub4) this.aClass20_1.method239(); local34 != null; local34 = (Class2_Sub1_Sub4) this.aClass20_1.method240()) {
				if (local34.anInt549 == arg0 && local34.anInt550 == arg1) {
					return;
				}
			}
			local34 = new Class2_Sub1_Sub4();
			local34.anInt549 = arg0;
			local34.anInt550 = arg1;
			local34.aBoolean134 = true;
			@Pc(71) Class50 local71 = this.aClass50_6;
			synchronized (this.aClass50_6) {
				this.aClass50_6.method566(local34);
			}
			this.aClass20_1.method237(local34);
		}
	}

	@OriginalMember(owner = "client!BPHGILGU", name = "a", descriptor = "(I)V")
	@Override
	public void method170(@OriginalArg(0) int arg0) {
		this.method173(0, arg0);
	}

	@OriginalMember(owner = "client!BPHGILGU", name = "a", descriptor = "(B)V")
	private void method174() {
		try {
			@Pc(4) Class50 local4 = this.aClass50_6;
			@Pc(11) Class2_Sub1_Sub4 local11;
			synchronized (this.aClass50_6) {
				local11 = (Class2_Sub1_Sub4) this.aClass50_6.method568();
			}
			while (local11 != null) {
				this.aBoolean49 = true;
				@Pc(34) byte[] local34 = null;
				if (this.aClient1.aClass41Array1[0] != null) {
					local34 = this.aClient1.aClass41Array1[local11.anInt549 + 1].method492(local11.anInt550);
				}
				if (!this.method179((byte) 1, this.anIntArrayArray1[local11.anInt549][local11.anInt550], this.anIntArrayArray2[local11.anInt549][local11.anInt550], local34)) {
					local34 = null;
				}
				@Pc(79) Class50 local79 = this.aClass50_6;
				synchronized (this.aClass50_6) {
					if (local34 == null) {
						this.aClass50_4.method566(local11);
					} else {
						local11.aByteArray13 = local34;
						@Pc(95) Class50 local95 = this.aClass50_8;
						synchronized (this.aClass50_8) {
							this.aClass50_8.method566(local11);
						}
					}
					local11 = (Class2_Sub1_Sub4) this.aClass50_6.method568();
				}
			}
		} catch (@Pc(122) RuntimeException local122) {
			signlink.reporterror("88345, " + 7 + ", " + local122.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BPHGILGU", name = "c", descriptor = "(II)I")
	public int method175(@OriginalArg(1) int arg0) {
		try {
			return this.aByteArray2[arg0] & 0xFF;
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("15577, " + 0 + ", " + arg0 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BPHGILGU", name = "d", descriptor = "(II)I")
	public int method176(@OriginalArg(0) int arg0) {
		try {
			return this.anIntArrayArray1[arg0].length;
		} catch (@Pc(10) RuntimeException local10) {
			signlink.reporterror("20545, " + arg0 + ", " + 0 + ", " + local10.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BPHGILGU", name = "a", descriptor = "(BZ)V")
	public void method177(@OriginalArg(1) boolean arg0) {
		try {
			@Pc(3) int local3 = this.anIntArray29.length;
			for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
				if (arg0 || this.anIntArray31[local9] != 0) {
					this.method190(3, this.anIntArray28[local9], (byte) 2);
					this.method190(3, this.anIntArray32[local9], (byte) 2);
				}
			}
		} catch (@Pc(42) RuntimeException local42) {
			signlink.reporterror("3186, " + 53 + ", " + arg0 + ", " + local42.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BPHGILGU", name = "b", descriptor = "()V")
	public void method178() {
		this.aBoolean46 = false;
	}

	@OriginalMember(owner = "client!BPHGILGU", name = "a", descriptor = "(BII[B)Z")
	private boolean method179(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		try {
			if (arg3 == null || arg3.length < 2) {
				return false;
			}
			@Pc(12) int local12 = arg3.length - 2;
			@Pc(28) int local28 = ((arg3[local12] & 0xFF) << 8) + (arg3[local12 + 1] & 0xFF);
			@Pc(33) boolean local33 = false;
			this.aCRC32_1.reset();
			this.aCRC32_1.update(arg3, 0, local12);
			@Pc(53) int local53 = (int) this.aCRC32_1.getValue();
			if (local28 == arg1) {
				return local53 == arg2;
			} else {
				return false;
			}
		} catch (@Pc(66) RuntimeException local66) {
			signlink.reporterror("74215, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local66.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BPHGILGU", name = "a", descriptor = "(Z)V")
	private void method180() {
		try {
			try {
				@Pc(10) int local10 = this.anInputStream1.available();
				@Pc(45) int local45;
				@Pc(61) int local61;
				if (this.anInt183 == 0 && local10 >= 6) {
					this.aBoolean49 = true;
					for (@Pc(21) int local21 = 0; local21 < 6; local21 += this.anInputStream1.read(this.aByteArray4, local21, 6 - local21)) {
					}
					local45 = this.aByteArray4[0] & 0xFF;
					local61 = ((this.aByteArray4[1] & 0xFF) << 8) + (this.aByteArray4[2] & 0xFF);
					@Pc(77) int local77 = ((this.aByteArray4[3] & 0xFF) << 8) + (this.aByteArray4[4] & 0xFF);
					@Pc(84) int local84 = this.aByteArray4[5] & 0xFF;
					this.aClass2_Sub1_Sub4_1 = null;
					for (@Pc(92) Class2_Sub1_Sub4 local92 = (Class2_Sub1_Sub4) this.aClass50_7.method569(); local92 != null; local92 = (Class2_Sub1_Sub4) this.aClass50_7.method571()) {
						if (local92.anInt549 == local45 && local92.anInt550 == local61) {
							this.aClass2_Sub1_Sub4_1 = local92;
						}
						if (this.aClass2_Sub1_Sub4_1 != null) {
							local92.anInt551 = 0;
						}
					}
					if (this.aClass2_Sub1_Sub4_1 != null) {
						this.anInt181 = 0;
						if (local77 == 0) {
							signlink.reporterror("Rej: " + local45 + "," + local61);
							this.aClass2_Sub1_Sub4_1.aByteArray13 = null;
							if (this.aClass2_Sub1_Sub4_1.aBoolean134) {
								@Pc(150) Class50 local150 = this.aClass50_8;
								synchronized (this.aClass50_8) {
									this.aClass50_8.method566(this.aClass2_Sub1_Sub4_1);
								}
							} else {
								this.aClass2_Sub1_Sub4_1.method504();
							}
							this.aClass2_Sub1_Sub4_1 = null;
						} else {
							if (this.aClass2_Sub1_Sub4_1.aByteArray13 == null && local84 == 0) {
								this.aClass2_Sub1_Sub4_1.aByteArray13 = new byte[local77];
							}
							if (this.aClass2_Sub1_Sub4_1.aByteArray13 == null && local84 != 0) {
								throw new IOException("missing start of file");
							}
						}
					}
					this.anInt182 = local84 * 500;
					this.anInt183 = 500;
					if (this.anInt183 > local77 - local84 * 500) {
						this.anInt183 = local77 - local84 * 500;
					}
				}
				if (this.anInt183 > 0 && local10 >= this.anInt183) {
					this.aBoolean49 = true;
					@Pc(229) byte[] local229 = this.aByteArray4;
					local45 = 0;
					if (this.aClass2_Sub1_Sub4_1 != null) {
						local229 = this.aClass2_Sub1_Sub4_1.aByteArray13;
						local45 = this.anInt182;
					}
					for (local61 = 0; local61 < this.anInt183; local61 += this.anInputStream1.read(local229, local61 + local45, this.anInt183 - local61)) {
					}
					if (this.anInt183 + this.anInt182 >= local229.length && this.aClass2_Sub1_Sub4_1 != null) {
						if (this.aClient1.aClass41Array1[0] != null) {
							this.aClient1.aClass41Array1[this.aClass2_Sub1_Sub4_1.anInt549 + 1].method493(this.aClass2_Sub1_Sub4_1.anInt550, local229.length, local229);
						}
						if (!this.aClass2_Sub1_Sub4_1.aBoolean134 && this.aClass2_Sub1_Sub4_1.anInt549 == 3) {
							this.aClass2_Sub1_Sub4_1.aBoolean134 = true;
							this.aClass2_Sub1_Sub4_1.anInt549 = 93;
						}
						if (this.aClass2_Sub1_Sub4_1.aBoolean134) {
							@Pc(322) Class50 local322 = this.aClass50_8;
							synchronized (this.aClass50_8) {
								this.aClass50_8.method566(this.aClass2_Sub1_Sub4_1);
							}
						} else {
							this.aClass2_Sub1_Sub4_1.method504();
						}
					}
					this.anInt183 = 0;
				}
			} catch (@Pc(343) IOException local343) {
				try {
					this.aSocket1.close();
				} catch (@Pc(348) Exception local348) {
				}
				this.aSocket1 = null;
				this.anInputStream1 = null;
				this.anOutputStream1 = null;
				this.anInt183 = 0;
			}
		} catch (@Pc(362) RuntimeException local362) {
			signlink.reporterror("72482, " + true + ", " + local362.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BPHGILGU", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (this.aBoolean46) {
				this.anInt178++;
				@Pc(11) byte local11 = 20;
				if (this.anInt172 == 0 && this.aClient1.aClass41Array1[0] != null) {
					local11 = 50;
				}
				try {
					Thread.sleep((long) local11);
				} catch (@Pc(27) Exception local27) {
				}
				this.aBoolean49 = true;
				for (@Pc(32) int local32 = 0; local32 < 100 && this.aBoolean49; local32++) {
					this.aBoolean49 = false;
					this.method174();
					this.method185();
					if (this.anInt173 == 0 && local32 >= 5) {
						break;
					}
					this.method188(this.anInt171);
					if (this.anInputStream1 != null) {
						this.method180();
					}
				}
				@Pc(68) boolean local68 = false;
				@Pc(73) Class2_Sub1_Sub4 local73;
				for (local73 = (Class2_Sub1_Sub4) this.aClass50_7.method569(); local73 != null; local73 = (Class2_Sub1_Sub4) this.aClass50_7.method571()) {
					if (local73.aBoolean134) {
						local68 = true;
						local73.anInt551++;
						if (local73.anInt551 > 50) {
							local73.anInt551 = 0;
							this.method191(local73);
						}
					}
				}
				if (!local68) {
					for (local73 = (Class2_Sub1_Sub4) this.aClass50_7.method569(); local73 != null; local73 = (Class2_Sub1_Sub4) this.aClass50_7.method571()) {
						local68 = true;
						local73.anInt551++;
						if (local73.anInt551 > 50) {
							local73.anInt551 = 0;
							this.method191(local73);
						}
					}
				}
				if (local68) {
					this.anInt181++;
					if (this.anInt181 > 750) {
						try {
							this.aSocket1.close();
						} catch (@Pc(158) Exception local158) {
						}
						this.aSocket1 = null;
						this.anInputStream1 = null;
						this.anOutputStream1 = null;
						this.anInt183 = 0;
					}
				} else {
					this.anInt181 = 0;
					this.aString3 = "";
				}
				if (this.aClient1.aBoolean227 && this.aSocket1 != null && this.anOutputStream1 != null && (this.anInt172 > 0 || this.aClient1.aClass41Array1[0] == null)) {
					this.anInt170++;
					if (this.anInt170 > 500) {
						this.anInt170 = 0;
						this.aByteArray4[0] = 0;
						this.aByteArray4[1] = 0;
						this.aByteArray4[2] = 0;
						this.aByteArray4[3] = 10;
						try {
							this.anOutputStream1.write(this.aByteArray4, 0, 4);
						} catch (@Pc(239) IOException local239) {
							this.anInt181 = 5000;
						}
					}
				}
			}
		} catch (@Pc(248) Exception local248) {
			signlink.reporterror("od_ex " + local248.getMessage());
		}
	}

	@OriginalMember(owner = "client!BPHGILGU", name = "c", descriptor = "()Lclient!QWHFLOAQ;")
	public Class2_Sub1_Sub4 method181() {
		@Pc(4) Class50 local4 = this.aClass50_8;
		@Pc(11) Class2_Sub1_Sub4 local11;
		synchronized (this.aClass50_8) {
			local11 = (Class2_Sub1_Sub4) this.aClass50_8.method568();
		}
		if (local11 == null) {
			return null;
		}
		@Pc(24) Class20 local24 = this.aClass20_1;
		synchronized (this.aClass20_1) {
			local11.method505();
		}
		if (local11.aByteArray13 == null) {
			return local11;
		}
		@Pc(41) int local41 = 0;
		try {
			@Pc(50) GZIPInputStream local50 = new GZIPInputStream(new ByteArrayInputStream(local11.aByteArray13));
			while (true) {
				if (local41 == this.aByteArray3.length) {
					throw new RuntimeException("buffer overflow!");
				}
				@Pc(71) int local71 = local50.read(this.aByteArray3, local41, this.aByteArray3.length - local41);
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
			local11.aByteArray13[local93] = this.aByteArray3[local93];
		}
		return local11;
	}

	@OriginalMember(owner = "client!BPHGILGU", name = "a", descriptor = "(IB)Z")
	public boolean method182(@OriginalArg(0) int arg0) {
		try {
			for (@Pc(13) int local13 = 0; local13 < this.anIntArray29.length; local13++) {
				if (this.anIntArray28[local13] == arg0) {
					return true;
				}
			}
			return false;
		} catch (@Pc(32) RuntimeException local32) {
			signlink.reporterror("16104, " + arg0 + ", " + -88 + ", " + local32.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BPHGILGU", name = "a", descriptor = "(IIZI)I")
	public int method183(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(10) int local10 = (arg0 << 8) + arg2;
			for (@Pc(12) int local12 = 0; local12 < this.anIntArray29.length; local12++) {
				if (this.anIntArray29[local12] == local10) {
					if (arg1 == 0) {
						return this.anIntArray32[local12];
					}
					return this.anIntArray28[local12];
				}
			}
			return -1;
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("6964, " + arg0 + ", " + arg1 + ", " + false + ", " + arg2 + ", " + local41.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BPHGILGU", name = "a", descriptor = "(Lclient!VSQMPWOM;Lclient!client;)V")
	public void method184(@OriginalArg(0) Class39 arg0, @OriginalArg(1) client arg1) {
		@Pc(20) String[] local20 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
		@Pc(36) int local36;
		@Pc(56) int local56;
		for (@Pc(22) int local22 = 0; local22 < 4; local22++) {
			@Pc(31) byte[] local31 = arg0.method489(local20[local22], null);
			local36 = local31.length / 2;
			@Pc(42) Class2_Sub1_Sub2 local42 = new Class2_Sub1_Sub2(local31, -990);
			this.anIntArrayArray1[local22] = new int[local36];
			this.aByteArrayArray2[local22] = new byte[local36];
			for (local56 = 0; local56 < local36; local56++) {
				this.anIntArrayArray1[local22][local56] = local42.method81();
			}
		}
		@Pc(93) String[] local93 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
		@Pc(104) byte[] local104;
		for (local36 = 0; local36 < 4; local36++) {
			local104 = arg0.method489(local93[local36], null);
			local56 = local104.length / 4;
			@Pc(115) Class2_Sub1_Sub2 local115 = new Class2_Sub1_Sub2(local104, -990);
			this.anIntArrayArray2[local36] = new int[local56];
			for (@Pc(123) int local123 = 0; local123 < local56; local123++) {
				this.anIntArrayArray2[local36][local123] = local115.method84();
			}
		}
		local104 = arg0.method489("model_index", null);
		local56 = this.anIntArrayArray1[0].length;
		this.aByteArray2 = new byte[local56];
		for (@Pc(158) int local158 = 0; local158 < local56; local158++) {
			if (local158 < local104.length) {
				this.aByteArray2[local158] = local104[local158];
			} else {
				this.aByteArray2[local158] = 0;
			}
		}
		local104 = arg0.method489("map_index", null);
		@Pc(193) Class2_Sub1_Sub2 local193 = new Class2_Sub1_Sub2(local104, -990);
		local56 = local104.length / 7;
		this.anIntArray29 = new int[local56];
		this.anIntArray32 = new int[local56];
		this.anIntArray28 = new int[local56];
		this.anIntArray31 = new int[local56];
		for (@Pc(216) int local216 = 0; local216 < local56; local216++) {
			this.anIntArray29[local216] = local193.method81();
			this.anIntArray32[local216] = local193.method81();
			this.anIntArray28[local216] = local193.method81();
			this.anIntArray31[local216] = local193.method79();
		}
		local104 = arg0.method489("anim_index", null);
		local193 = new Class2_Sub1_Sub2(local104, -990);
		local56 = local104.length / 2;
		this.anIntArray30 = new int[local56];
		for (@Pc(268) int local268 = 0; local268 < local56; local268++) {
			this.anIntArray30[local268] = local193.method81();
		}
		local104 = arg0.method489("midi_index", null);
		local193 = new Class2_Sub1_Sub2(local104, -990);
		local56 = local104.length;
		this.anIntArray33 = new int[local56];
		for (@Pc(300) int local300 = 0; local300 < local56; local300++) {
			this.anIntArray33[local300] = local193.method79();
		}
		this.aClient1 = arg1;
		this.aBoolean46 = true;
		this.aClient1.method585(this, 2);
	}

	@OriginalMember(owner = "client!BPHGILGU", name = "b", descriptor = "(I)V")
	private void method185() {
		try {
			this.anInt173 = 0;
			this.anInt174 = 0;
			@Pc(12) Class2_Sub1_Sub4 local12 = (Class2_Sub1_Sub4) this.aClass50_7.method569();
			if (this.anInt175 == 45070) {
				while (local12 != null) {
					if (local12.aBoolean134) {
						this.anInt173++;
					} else {
						this.anInt174++;
					}
					local12 = (Class2_Sub1_Sub4) this.aClass50_7.method571();
				}
				while (this.anInt173 < 10) {
					local12 = (Class2_Sub1_Sub4) this.aClass50_4.method568();
					if (local12 == null) {
						break;
					}
					if (this.aByteArrayArray2[local12.anInt549][local12.anInt550] != 0) {
						this.anInt177++;
					}
					this.aByteArrayArray2[local12.anInt549][local12.anInt550] = 0;
					this.aClass50_7.method566(local12);
					this.anInt173++;
					this.method191(local12);
					this.aBoolean49 = true;
				}
			}
		} catch (@Pc(98) RuntimeException local98) {
			signlink.reporterror("29685, " + 45070 + ", " + local98.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BPHGILGU", name = "b", descriptor = "(B)V")
	public void method186(@OriginalArg(0) byte arg0) {
		try {
			@Pc(2) Class50 local2 = this.aClass50_5;
			synchronized (this.aClass50_5) {
				this.aClass50_5.method573();
			}
			@Pc(18) boolean local18 = false;
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("66015, " + arg0 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BPHGILGU", name = "a", descriptor = "(IZI)V")
	public void method187(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		try {
			if (this.aClient1.aClass41Array1[0] != null && (this.anIntArrayArray1[arg0][arg1] != 0 && (this.aByteArrayArray2[arg0][arg1] != 0 && this.anInt172 != 0))) {
				@Pc(30) Class2_Sub1_Sub4 local30 = new Class2_Sub1_Sub4();
				local30.anInt549 = arg0;
				local30.anInt550 = arg1;
				local30.aBoolean134 = false;
				@Pc(42) Class50 local42 = this.aClass50_5;
				synchronized (this.aClass50_5) {
					this.aClass50_5.method566(local30);
				}
			}
		} catch (@Pc(58) RuntimeException local58) {
			signlink.reporterror("967, " + arg0 + ", " + true + ", " + arg1 + ", " + local58.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BPHGILGU", name = "c", descriptor = "(I)V")
	private void method188(@OriginalArg(0) int arg0) {
		try {
			if (arg0 > 0) {
				while (this.anInt173 == 0) {
					if (this.anInt174 >= 10 || this.anInt172 == 0) {
						return;
					}
					@Pc(10) Class50 local10 = this.aClass50_5;
					@Pc(17) Class2_Sub1_Sub4 local17;
					synchronized (this.aClass50_5) {
						local17 = (Class2_Sub1_Sub4) this.aClass50_5.method568();
					}
					while (local17 != null) {
						if (this.aByteArrayArray2[local17.anInt549][local17.anInt550] != 0) {
							this.aByteArrayArray2[local17.anInt549][local17.anInt550] = 0;
							this.aClass50_7.method566(local17);
							this.method191(local17);
							this.aBoolean49 = true;
							if (this.anInt177 < this.anInt179) {
								this.anInt177++;
							}
							this.aString3 = "Loading extra files - " + this.anInt177 * 100 / this.anInt179 + "%";
							this.anInt174++;
							if (this.anInt174 == 10) {
								return;
							}
						}
						local10 = this.aClass50_5;
						synchronized (this.aClass50_5) {
							local17 = (Class2_Sub1_Sub4) this.aClass50_5.method568();
						}
					}
					for (@Pc(111) int local111 = 0; local111 < 4; local111++) {
						@Pc(118) byte[] local118 = this.aByteArrayArray2[local111];
						@Pc(121) int local121 = local118.length;
						for (@Pc(123) int local123 = 0; local123 < local121; local123++) {
							if (local118[local123] == this.anInt172) {
								local118[local123] = 0;
								local17 = new Class2_Sub1_Sub4();
								local17.anInt549 = local111;
								local17.anInt550 = local123;
								local17.aBoolean134 = false;
								this.aClass50_7.method566(local17);
								this.method191(local17);
								this.aBoolean49 = true;
								if (this.anInt177 < this.anInt179) {
									this.anInt177++;
								}
								this.aString3 = "Loading extra files - " + this.anInt177 * 100 / this.anInt179 + "%";
								this.anInt174++;
								if (this.anInt174 == 10) {
									return;
								}
							}
						}
					}
					this.anInt172--;
				}
			}
		} catch (@Pc(221) RuntimeException local221) {
			signlink.reporterror("33761, " + arg0 + ", " + local221.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BPHGILGU", name = "d", descriptor = "(I)I")
	public int method189() {
		try {
			return this.anIntArray30.length;
		} catch (@Pc(8) RuntimeException local8) {
			signlink.reporterror("50034, " + -261 + ", " + local8.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BPHGILGU", name = "a", descriptor = "(IIIB)V")
	public void method190(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte arg2) {
		try {
			if (this.aClient1.aClass41Array1[0] != null && this.anIntArrayArray1[arg0][arg1] != 0) {
				@Pc(25) byte[] local25 = this.aClient1.aClass41Array1[arg0 + 1].method492(arg1);
				if (!this.method179((byte) 1, this.anIntArrayArray1[arg0][arg1], this.anIntArrayArray2[arg0][arg1], local25)) {
					this.aByteArrayArray2[arg0][arg1] = arg2;
					if (arg2 > this.anInt172) {
						this.anInt172 = arg2;
					}
					this.anInt179++;
				}
			}
		} catch (@Pc(75) RuntimeException local75) {
			signlink.reporterror("83784, " + arg0 + ", " + -6015 + ", " + arg1 + ", " + arg2 + ", " + local75.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BPHGILGU", name = "a", descriptor = "(ZLclient!QWHFLOAQ;)V")
	private void method191(@OriginalArg(1) Class2_Sub1_Sub4 arg0) {
		try {
			try {
				if (this.aSocket1 == null) {
					@Pc(15) long local15 = System.currentTimeMillis();
					if (local15 - this.aLong9 < 4000L) {
						return;
					}
					this.aLong9 = local15;
					this.aSocket1 = this.aClient1.method712(client.anInt919 + 43594);
					this.anInputStream1 = this.aSocket1.getInputStream();
					this.anOutputStream1 = this.aSocket1.getOutputStream();
					this.anOutputStream1.write(15);
					for (@Pc(50) int local50 = 0; local50 < 8; local50++) {
						this.anInputStream1.read();
					}
					this.anInt181 = 0;
				}
				this.aByteArray4[0] = (byte) arg0.anInt549;
				this.aByteArray4[1] = (byte) (arg0.anInt550 >> 8);
				this.aByteArray4[2] = (byte) arg0.anInt550;
				if (arg0.aBoolean134) {
					this.aByteArray4[3] = 2;
				} else if (this.aClient1.aBoolean227) {
					this.aByteArray4[3] = 0;
				} else {
					this.aByteArray4[3] = 1;
				}
				this.anOutputStream1.write(this.aByteArray4, 0, 4);
				this.anInt170 = 0;
				this.anInt180 = -10000;
			} catch (@Pc(127) IOException local127) {
				try {
					this.aSocket1.close();
				} catch (@Pc(132) Exception local132) {
				}
				this.aSocket1 = null;
				this.anInputStream1 = null;
				this.anOutputStream1 = null;
				this.anInt183 = 0;
				this.anInt180++;
			}
		} catch (@Pc(152) RuntimeException local152) {
			signlink.reporterror("39925, " + false + ", " + arg0 + ", " + local152.toString());
			throw new RuntimeException();
		}
	}
}
