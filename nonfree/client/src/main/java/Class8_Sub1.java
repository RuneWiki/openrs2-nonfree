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

@OriginalClass("client!DGAWSPEW")
public final class Class8_Sub1 extends Class8 implements Runnable {

	@OriginalMember(owner = "client!DGAWSPEW", name = "b", descriptor = "[I")
	private int[] anIntArray15;

	@OriginalMember(owner = "client!DGAWSPEW", name = "d", descriptor = "[B")
	private byte[] aByteArray2;

	@OriginalMember(owner = "client!DGAWSPEW", name = "g", descriptor = "I")
	private int anInt62;

	@OriginalMember(owner = "client!DGAWSPEW", name = "i", descriptor = "I")
	private int anInt63;

	@OriginalMember(owner = "client!DGAWSPEW", name = "j", descriptor = "I")
	private int anInt64;

	@OriginalMember(owner = "client!DGAWSPEW", name = "l", descriptor = "I")
	private int anInt66;

	@OriginalMember(owner = "client!DGAWSPEW", name = "o", descriptor = "I")
	public int anInt67;

	@OriginalMember(owner = "client!DGAWSPEW", name = "p", descriptor = "J")
	private long aLong5;

	@OriginalMember(owner = "client!DGAWSPEW", name = "r", descriptor = "[I")
	private int[] anIntArray16;

	@OriginalMember(owner = "client!DGAWSPEW", name = "t", descriptor = "Lclient!DYWHHFEE;")
	private Class4_Sub1_Sub3 aClass4_Sub1_Sub3_1;

	@OriginalMember(owner = "client!DGAWSPEW", name = "v", descriptor = "I")
	private int anInt68;

	@OriginalMember(owner = "client!DGAWSPEW", name = "x", descriptor = "[I")
	private int[] anIntArray17;

	@OriginalMember(owner = "client!DGAWSPEW", name = "B", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream1;

	@OriginalMember(owner = "client!DGAWSPEW", name = "D", descriptor = "I")
	private int anInt72;

	@OriginalMember(owner = "client!DGAWSPEW", name = "E", descriptor = "Ljava/net/Socket;")
	private Socket aSocket1;

	@OriginalMember(owner = "client!DGAWSPEW", name = "I", descriptor = "I")
	private int anInt73;

	@OriginalMember(owner = "client!DGAWSPEW", name = "J", descriptor = "I")
	private int anInt74;

	@OriginalMember(owner = "client!DGAWSPEW", name = "K", descriptor = "I")
	private int anInt75;

	@OriginalMember(owner = "client!DGAWSPEW", name = "L", descriptor = "[I")
	private int[] anIntArray18;

	@OriginalMember(owner = "client!DGAWSPEW", name = "N", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream1;

	@OriginalMember(owner = "client!DGAWSPEW", name = "O", descriptor = "I")
	public int anInt76;

	@OriginalMember(owner = "client!DGAWSPEW", name = "R", descriptor = "[I")
	private int[] anIntArray19;

	@OriginalMember(owner = "client!DGAWSPEW", name = "S", descriptor = "[I")
	private int[] anIntArray20;

	@OriginalMember(owner = "client!DGAWSPEW", name = "T", descriptor = "Lclient!client;")
	private client aClient2;

	@OriginalMember(owner = "client!DGAWSPEW", name = "a", descriptor = "Z")
	private boolean aBoolean30 = true;

	@OriginalMember(owner = "client!DGAWSPEW", name = "c", descriptor = "Z")
	private boolean aBoolean31 = true;

	@OriginalMember(owner = "client!DGAWSPEW", name = "e", descriptor = "[[B")
	private byte[][] aByteArrayArray1 = new byte[4][];

	@OriginalMember(owner = "client!DGAWSPEW", name = "f", descriptor = "Ljava/lang/String;")
	public String aString2 = "";

	@OriginalMember(owner = "client!DGAWSPEW", name = "h", descriptor = "Z")
	private boolean aBoolean32 = true;

	@OriginalMember(owner = "client!DGAWSPEW", name = "k", descriptor = "I")
	private int anInt65 = 5;

	@OriginalMember(owner = "client!DGAWSPEW", name = "m", descriptor = "Lclient!FEPBPONH;")
	private Class11 aClass11_1 = new Class11(145);

	@OriginalMember(owner = "client!DGAWSPEW", name = "n", descriptor = "Lclient!FEPBPONH;")
	private Class11 aClass11_2 = new Class11(145);

	@OriginalMember(owner = "client!DGAWSPEW", name = "q", descriptor = "Ljava/util/zip/CRC32;")
	private CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!DGAWSPEW", name = "s", descriptor = "B")
	private byte aByte4 = -90;

	@OriginalMember(owner = "client!DGAWSPEW", name = "u", descriptor = "Lclient!NAZXUZWI;")
	private Class27 aClass27_1 = new Class27(0);

	@OriginalMember(owner = "client!DGAWSPEW", name = "w", descriptor = "[[I")
	private int[][] anIntArrayArray3 = new int[4][];

	@OriginalMember(owner = "client!DGAWSPEW", name = "y", descriptor = "I")
	private int anInt69 = -208;

	@OriginalMember(owner = "client!DGAWSPEW", name = "z", descriptor = "Z")
	private boolean aBoolean33 = true;

	@OriginalMember(owner = "client!DGAWSPEW", name = "A", descriptor = "I")
	private int anInt70 = -69;

	@OriginalMember(owner = "client!DGAWSPEW", name = "C", descriptor = "I")
	private int anInt71 = 974;

	@OriginalMember(owner = "client!DGAWSPEW", name = "F", descriptor = "[B")
	private byte[] aByteArray3 = new byte[65000];

	@OriginalMember(owner = "client!DGAWSPEW", name = "G", descriptor = "Lclient!FEPBPONH;")
	private Class11 aClass11_3 = new Class11(145);

	@OriginalMember(owner = "client!DGAWSPEW", name = "H", descriptor = "[B")
	private byte[] aByteArray4 = new byte[500];

	@OriginalMember(owner = "client!DGAWSPEW", name = "M", descriptor = "[[I")
	private int[][] anIntArrayArray4 = new int[4][];

	@OriginalMember(owner = "client!DGAWSPEW", name = "P", descriptor = "Lclient!FEPBPONH;")
	private Class11 aClass11_4 = new Class11(145);

	@OriginalMember(owner = "client!DGAWSPEW", name = "Q", descriptor = "Lclient!FEPBPONH;")
	private Class11 aClass11_5 = new Class11(145);

	@OriginalMember(owner = "client!DGAWSPEW", name = "U", descriptor = "Z")
	private boolean aBoolean34 = false;

	@OriginalMember(owner = "client!DGAWSPEW", name = "V", descriptor = "B")
	private byte aByte5 = -105;

	@OriginalMember(owner = "client!DGAWSPEW", name = "a", descriptor = "(I)V")
	@Override
	public void method85(@OriginalArg(0) int arg0) {
		this.method93(0, arg0);
	}

	@OriginalMember(owner = "client!DGAWSPEW", name = "a", descriptor = "(ZI)V")
	public void method86(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		try {
			if (arg1 == 27764) {
				@Pc(7) int local7 = this.anIntArray16.length;
				for (@Pc(9) int local9 = 0; local9 < local7; local9++) {
					if (arg0 || this.anIntArray17[local9] != 0) {
						this.method87(this.anIntArray18[local9], 3, (byte) 2);
						this.method87(this.anIntArray19[local9], 3, (byte) 2);
					}
				}
			}
		} catch (@Pc(42) RuntimeException local42) {
			signlink.reporterror("86784, " + arg0 + ", " + arg1 + ", " + local42.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DGAWSPEW", name = "a", descriptor = "(IIIB)V")
	public void method87(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte arg2) {
		try {
			if (this.aClient2.aClass34Array1[0] != null && this.anIntArrayArray4[arg1][arg0] != 0) {
				@Pc(31) byte[] local31 = this.aClient2.aClass34Array1[arg1 + 1].method433(arg0, this.anInt71);
				if (!this.method92(this.anIntArrayArray3[arg1][arg0], local31, this.anIntArrayArray4[arg1][arg0], this.aByte4)) {
					this.aByteArrayArray1[arg1][arg0] = arg2;
					if (arg2 > this.anInt73) {
						this.anInt73 = arg2;
					}
					this.anInt66++;
				}
			}
		} catch (@Pc(72) RuntimeException local72) {
			signlink.reporterror("67794, " + -93 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local72.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DGAWSPEW", name = "a", descriptor = "(IZI)V")
	public void method88(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		try {
			if (this.aClient2.aClass34Array1[0] != null && (this.anIntArrayArray4[arg2][arg0] != 0 && (this.aByteArrayArray1[arg2][arg0] != 0 && this.anInt73 != 0))) {
				@Pc(30) Class4_Sub1_Sub3 local30 = new Class4_Sub1_Sub3();
				local30.anInt110 = arg2;
				local30.anInt111 = arg0;
				if (!arg1) {
					this.aBoolean32 = !this.aBoolean32;
				}
				local30.aBoolean54 = false;
				@Pc(52) Class11 local52 = this.aClass11_5;
				synchronized (this.aClass11_5) {
					this.aClass11_5.method163(local30);
				}
			}
		} catch (@Pc(65) RuntimeException local65) {
			signlink.reporterror("96654, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local65.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DGAWSPEW", name = "a", descriptor = "(Lclient!DYWHHFEE;B)V")
	private void method89(@OriginalArg(0) Class4_Sub1_Sub3 arg0) {
		try {
			if (this.aByte5 == -105) {
				try {
					if (this.aSocket1 == null) {
						@Pc(11) long local11 = System.currentTimeMillis();
						if (local11 - this.aLong5 < 4000L) {
							return;
						}
						this.aLong5 = local11;
						this.aSocket1 = this.aClient2.method716(client.anInt875 + 43594);
						this.anInputStream1 = this.aSocket1.getInputStream();
						this.anOutputStream1 = this.aSocket1.getOutputStream();
						this.anOutputStream1.write(15);
						for (@Pc(46) int local46 = 0; local46 < 8; local46++) {
							this.anInputStream1.read();
						}
						this.anInt68 = 0;
					}
					this.aByteArray4[0] = (byte) arg0.anInt110;
					this.aByteArray4[1] = (byte) (arg0.anInt111 >> 8);
					this.aByteArray4[2] = (byte) arg0.anInt111;
					if (arg0.aBoolean54) {
						this.aByteArray4[3] = 2;
					} else if (this.aClient2.aBoolean251) {
						this.aByteArray4[3] = 0;
					} else {
						this.aByteArray4[3] = 1;
					}
					this.anOutputStream1.write(this.aByteArray4, 0, 4);
					this.anInt72 = 0;
					this.anInt67 = -10000;
				} catch (@Pc(123) IOException local123) {
					try {
						this.aSocket1.close();
					} catch (@Pc(128) Exception local128) {
					}
					this.aSocket1 = null;
					this.anInputStream1 = null;
					this.anOutputStream1 = null;
					this.anInt64 = 0;
					this.anInt67++;
				}
			}
		} catch (@Pc(148) RuntimeException local148) {
			signlink.reporterror("86255, " + arg0 + ", " + -105 + ", " + local148.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DGAWSPEW", name = "a", descriptor = "()Lclient!DYWHHFEE;")
	public Class4_Sub1_Sub3 method90() {
		@Pc(4) Class11 local4 = this.aClass11_1;
		@Pc(11) Class4_Sub1_Sub3 local11;
		synchronized (this.aClass11_1) {
			local11 = (Class4_Sub1_Sub3) this.aClass11_1.method165();
		}
		if (local11 == null) {
			return null;
		}
		@Pc(24) Class27 local24 = this.aClass27_1;
		synchronized (this.aClass27_1) {
			local11.method557();
		}
		if (local11.aByteArray5 == null) {
			return local11;
		}
		@Pc(41) int local41 = 0;
		try {
			@Pc(50) GZIPInputStream local50 = new GZIPInputStream(new ByteArrayInputStream(local11.aByteArray5));
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
		local11.aByteArray5 = new byte[local41];
		for (@Pc(93) int local93 = 0; local93 < local41; local93++) {
			local11.aByteArray5[local93] = this.aByteArray3[local93];
		}
		return local11;
	}

	@OriginalMember(owner = "client!DGAWSPEW", name = "a", descriptor = "(IBII)I")
	public int method91(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(5) int local5 = (arg0 << 8) + arg1;
			for (@Pc(13) int local13 = 0; local13 < this.anIntArray16.length; local13++) {
				if (this.anIntArray16[local13] == local5) {
					if (arg2 == 0) {
						return this.anIntArray19[local13];
					}
					return this.anIntArray18[local13];
				}
			}
			return -1;
		} catch (@Pc(42) RuntimeException local42) {
			signlink.reporterror("67923, " + arg0 + ", " + -121 + ", " + arg1 + ", " + arg2 + ", " + local42.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DGAWSPEW", name = "a", descriptor = "(I[BIB)Z")
	private boolean method92(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		try {
			if (arg1 == null || arg1.length < 2) {
				return false;
			}
			@Pc(12) int local12 = arg1.length - 2;
			if (arg3 != this.aByte4) {
				this.anInt71 = 105;
			}
			@Pc(35) int local35 = ((arg1[local12] & 0xFF) << 8) + (arg1[local12 + 1] & 0xFF);
			this.aCRC32_1.reset();
			this.aCRC32_1.update(arg1, 0, local12);
			@Pc(49) int local49 = (int) this.aCRC32_1.getValue();
			if (local35 == arg2) {
				return local49 == arg0;
			} else {
				return false;
			}
		} catch (@Pc(62) RuntimeException local62) {
			signlink.reporterror("59624, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local62.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DGAWSPEW", name = "a", descriptor = "(II)V")
	public void method93(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 > this.anIntArrayArray4.length || arg1 < 0 || arg1 > this.anIntArrayArray4[arg0].length || this.anIntArrayArray4[arg0][arg1] == 0) {
			return;
		}
		@Pc(27) Class27 local27 = this.aClass27_1;
		synchronized (this.aClass27_1) {
			@Pc(34) Class4_Sub1_Sub3 local34;
			for (local34 = (Class4_Sub1_Sub3) this.aClass27_1.method315(); local34 != null; local34 = (Class4_Sub1_Sub3) this.aClass27_1.method316()) {
				if (local34.anInt110 == arg0 && local34.anInt111 == arg1) {
					return;
				}
			}
			local34 = new Class4_Sub1_Sub3();
			local34.anInt110 = arg0;
			local34.anInt111 = arg1;
			local34.aBoolean54 = true;
			@Pc(71) Class11 local71 = this.aClass11_2;
			synchronized (this.aClass11_2) {
				this.aClass11_2.method163(local34);
			}
			this.aClass27_1.method313(local34);
		}
	}

	@OriginalMember(owner = "client!DGAWSPEW", name = "b", descriptor = "(I)V")
	private void method94() {
		try {
			try {
				@Pc(10) int local10 = this.anInputStream1.available();
				@Pc(45) int local45;
				@Pc(61) int local61;
				if (this.anInt64 == 0 && local10 >= 6) {
					this.aBoolean34 = true;
					for (@Pc(21) int local21 = 0; local21 < 6; local21 += this.anInputStream1.read(this.aByteArray4, local21, 6 - local21)) {
					}
					local45 = this.aByteArray4[0] & 0xFF;
					local61 = ((this.aByteArray4[1] & 0xFF) << 8) + (this.aByteArray4[2] & 0xFF);
					@Pc(77) int local77 = ((this.aByteArray4[3] & 0xFF) << 8) + (this.aByteArray4[4] & 0xFF);
					@Pc(84) int local84 = this.aByteArray4[5] & 0xFF;
					this.aClass4_Sub1_Sub3_1 = null;
					for (@Pc(92) Class4_Sub1_Sub3 local92 = (Class4_Sub1_Sub3) this.aClass11_3.method166(); local92 != null; local92 = (Class4_Sub1_Sub3) this.aClass11_3.method168()) {
						if (local92.anInt110 == local45 && local92.anInt111 == local61) {
							this.aClass4_Sub1_Sub3_1 = local92;
						}
						if (this.aClass4_Sub1_Sub3_1 != null) {
							local92.anInt112 = 0;
						}
					}
					if (this.aClass4_Sub1_Sub3_1 != null) {
						this.anInt68 = 0;
						if (local77 == 0) {
							signlink.reporterror("Rej: " + local45 + "," + local61);
							this.aClass4_Sub1_Sub3_1.aByteArray5 = null;
							if (this.aClass4_Sub1_Sub3_1.aBoolean54) {
								@Pc(150) Class11 local150 = this.aClass11_1;
								synchronized (this.aClass11_1) {
									this.aClass11_1.method163(this.aClass4_Sub1_Sub3_1);
								}
							} else {
								this.aClass4_Sub1_Sub3_1.method556();
							}
							this.aClass4_Sub1_Sub3_1 = null;
						} else {
							if (this.aClass4_Sub1_Sub3_1.aByteArray5 == null && local84 == 0) {
								this.aClass4_Sub1_Sub3_1.aByteArray5 = new byte[local77];
							}
							if (this.aClass4_Sub1_Sub3_1.aByteArray5 == null && local84 != 0) {
								throw new IOException("missing start of file");
							}
						}
					}
					this.anInt63 = local84 * 500;
					this.anInt64 = 500;
					if (this.anInt64 > local77 - local84 * 500) {
						this.anInt64 = local77 - local84 * 500;
					}
				}
				if (this.anInt64 > 0 && local10 >= this.anInt64) {
					this.aBoolean34 = true;
					@Pc(229) byte[] local229 = this.aByteArray4;
					local45 = 0;
					if (this.aClass4_Sub1_Sub3_1 != null) {
						local229 = this.aClass4_Sub1_Sub3_1.aByteArray5;
						local45 = this.anInt63;
					}
					for (local61 = 0; local61 < this.anInt64; local61 += this.anInputStream1.read(local229, local61 + local45, this.anInt64 - local61)) {
					}
					if (this.anInt64 + this.anInt63 >= local229.length && this.aClass4_Sub1_Sub3_1 != null) {
						if (this.aClient2.aClass34Array1[0] != null) {
							this.aClient2.aClass34Array1[this.aClass4_Sub1_Sub3_1.anInt110 + 1].method434(local229.length, local229, this.aClass4_Sub1_Sub3_1.anInt111);
						}
						if (!this.aClass4_Sub1_Sub3_1.aBoolean54 && this.aClass4_Sub1_Sub3_1.anInt110 == 3) {
							this.aClass4_Sub1_Sub3_1.aBoolean54 = true;
							this.aClass4_Sub1_Sub3_1.anInt110 = 93;
						}
						if (this.aClass4_Sub1_Sub3_1.aBoolean54) {
							@Pc(322) Class11 local322 = this.aClass11_1;
							synchronized (this.aClass11_1) {
								this.aClass11_1.method163(this.aClass4_Sub1_Sub3_1);
							}
						} else {
							this.aClass4_Sub1_Sub3_1.method556();
						}
					}
					this.anInt64 = 0;
				}
			} catch (@Pc(343) IOException local343) {
				try {
					this.aSocket1.close();
				} catch (@Pc(348) Exception local348) {
				}
				this.aSocket1 = null;
				this.anInputStream1 = null;
				this.anOutputStream1 = null;
				this.anInt64 = 0;
			}
		} catch (@Pc(362) RuntimeException local362) {
			signlink.reporterror("55734, " + -395 + ", " + local362.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DGAWSPEW", name = "a", descriptor = "(Lclient!QDHHNYHL;Lclient!client;)V")
	public void method95(@OriginalArg(0) Class32 arg0, @OriginalArg(1) client arg1) {
		@Pc(20) String[] local20 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
		@Pc(36) int local36;
		@Pc(56) int local56;
		for (@Pc(22) int local22 = 0; local22 < 4; local22++) {
			@Pc(31) byte[] local31 = arg0.method426(local20[local22], null);
			local36 = local31.length / 2;
			@Pc(42) Class4_Sub1_Sub4 local42 = new Class4_Sub1_Sub4(5, local31);
			this.anIntArrayArray4[local22] = new int[local36];
			this.aByteArrayArray1[local22] = new byte[local36];
			for (local56 = 0; local56 < local36; local56++) {
				this.anIntArrayArray4[local22][local56] = local42.method357();
			}
		}
		@Pc(93) String[] local93 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
		@Pc(104) byte[] local104;
		for (local36 = 0; local36 < 4; local36++) {
			local104 = arg0.method426(local93[local36], null);
			local56 = local104.length / 4;
			@Pc(115) Class4_Sub1_Sub4 local115 = new Class4_Sub1_Sub4(5, local104);
			this.anIntArrayArray3[local36] = new int[local56];
			for (@Pc(123) int local123 = 0; local123 < local56; local123++) {
				this.anIntArrayArray3[local36][local123] = local115.method360();
			}
		}
		local104 = arg0.method426("model_index", null);
		local56 = this.anIntArrayArray4[0].length;
		this.aByteArray2 = new byte[local56];
		for (@Pc(158) int local158 = 0; local158 < local56; local158++) {
			if (local158 < local104.length) {
				this.aByteArray2[local158] = local104[local158];
			} else {
				this.aByteArray2[local158] = 0;
			}
		}
		local104 = arg0.method426("map_index", null);
		@Pc(193) Class4_Sub1_Sub4 local193 = new Class4_Sub1_Sub4(5, local104);
		local56 = local104.length / 7;
		this.anIntArray16 = new int[local56];
		this.anIntArray19 = new int[local56];
		this.anIntArray18 = new int[local56];
		this.anIntArray17 = new int[local56];
		for (@Pc(216) int local216 = 0; local216 < local56; local216++) {
			this.anIntArray16[local216] = local193.method357();
			this.anIntArray19[local216] = local193.method357();
			this.anIntArray18[local216] = local193.method357();
			this.anIntArray17[local216] = local193.method355();
		}
		local104 = arg0.method426("anim_index", null);
		local193 = new Class4_Sub1_Sub4(5, local104);
		local56 = local104.length / 2;
		this.anIntArray20 = new int[local56];
		for (@Pc(268) int local268 = 0; local268 < local56; local268++) {
			this.anIntArray20[local268] = local193.method357();
		}
		local104 = arg0.method426("midi_index", null);
		local193 = new Class4_Sub1_Sub4(5, local104);
		local56 = local104.length;
		this.anIntArray15 = new int[local56];
		for (@Pc(300) int local300 = 0; local300 < local56; local300++) {
			this.anIntArray15[local300] = local193.method355();
		}
		this.aClient2 = arg1;
		this.aBoolean33 = true;
		this.aClient2.method584(this, 2);
	}

	@OriginalMember(owner = "client!DGAWSPEW", name = "a", descriptor = "(B)V")
	public void method96() {
		try {
			@Pc(2) Class11 local2 = this.aClass11_5;
			synchronized (this.aClass11_5) {
				this.aClass11_5.method170();
			}
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("28347, " + -98 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DGAWSPEW", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (this.aBoolean33) {
				this.anInt76++;
				@Pc(11) byte local11 = 20;
				if (this.anInt73 == 0 && this.aClient2.aClass34Array1[0] != null) {
					local11 = 50;
				}
				try {
					Thread.sleep((long) local11);
				} catch (@Pc(27) Exception local27) {
				}
				this.aBoolean34 = true;
				for (@Pc(32) int local32 = 0; local32 < 100 && this.aBoolean34; local32++) {
					this.aBoolean34 = false;
					this.method106();
					this.method100();
					if (this.anInt74 == 0 && local32 >= 5) {
						break;
					}
					this.method101(this.aBoolean31);
					if (this.anInputStream1 != null) {
						this.method94();
					}
				}
				@Pc(68) boolean local68 = false;
				@Pc(73) Class4_Sub1_Sub3 local73;
				for (local73 = (Class4_Sub1_Sub3) this.aClass11_3.method166(); local73 != null; local73 = (Class4_Sub1_Sub3) this.aClass11_3.method168()) {
					if (local73.aBoolean54) {
						local68 = true;
						local73.anInt112++;
						if (local73.anInt112 > 50) {
							local73.anInt112 = 0;
							this.method89(local73);
						}
					}
				}
				if (!local68) {
					for (local73 = (Class4_Sub1_Sub3) this.aClass11_3.method166(); local73 != null; local73 = (Class4_Sub1_Sub3) this.aClass11_3.method168()) {
						local68 = true;
						local73.anInt112++;
						if (local73.anInt112 > 50) {
							local73.anInt112 = 0;
							this.method89(local73);
						}
					}
				}
				if (local68) {
					this.anInt68++;
					if (this.anInt68 > 750) {
						try {
							this.aSocket1.close();
						} catch (@Pc(158) Exception local158) {
						}
						this.aSocket1 = null;
						this.anInputStream1 = null;
						this.anOutputStream1 = null;
						this.anInt64 = 0;
					}
				} else {
					this.anInt68 = 0;
					this.aString2 = "";
				}
				if (this.aClient2.aBoolean251 && this.aSocket1 != null && this.anOutputStream1 != null && (this.anInt73 > 0 || this.aClient2.aClass34Array1[0] == null)) {
					this.anInt72++;
					if (this.anInt72 > 500) {
						this.anInt72 = 0;
						this.aByteArray4[0] = 0;
						this.aByteArray4[1] = 0;
						this.aByteArray4[2] = 0;
						this.aByteArray4[3] = 10;
						try {
							this.anOutputStream1.write(this.aByteArray4, 0, 4);
						} catch (@Pc(239) IOException local239) {
							this.anInt68 = 5000;
						}
					}
				}
			}
		} catch (@Pc(248) Exception local248) {
			signlink.reporterror("od_ex " + local248.getMessage());
		}
	}

	@OriginalMember(owner = "client!DGAWSPEW", name = "b", descriptor = "(II)Z")
	public boolean method97(@OriginalArg(0) int arg0) {
		try {
			if (this.anInt65 != 5) {
				throw new NullPointerException();
			}
			return this.anIntArray15[arg0] == 1;
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("72655, " + arg0 + ", " + 5 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DGAWSPEW", name = "b", descriptor = "(ZI)Z")
	public boolean method98(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		try {
			if (arg0) {
				throw new NullPointerException();
			}
			for (@Pc(7) int local7 = 0; local7 < this.anIntArray16.length; local7++) {
				if (this.anIntArray18[local7] == arg1) {
					return true;
				}
			}
			return false;
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("29499, " + arg0 + ", " + arg1 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DGAWSPEW", name = "a", descriptor = "(IZ)I")
	public int method99(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		try {
			if (!arg1) {
				for (@Pc(3) int local3 = 1; local3 > 0; local3++) {
				}
			}
			return this.aByteArray2[arg0] & 0xFF;
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("53892, " + arg0 + ", " + arg1 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DGAWSPEW", name = "b", descriptor = "(B)V")
	private void method100() {
		try {
			this.anInt74 = 0;
			this.anInt75 = 0;
			@Pc(16) Class4_Sub1_Sub3 local16;
			for (local16 = (Class4_Sub1_Sub3) this.aClass11_3.method166(); local16 != null; local16 = (Class4_Sub1_Sub3) this.aClass11_3.method168()) {
				if (local16.aBoolean54) {
					this.anInt74++;
				} else {
					this.anInt75++;
				}
			}
			while (this.anInt74 < 10) {
				local16 = (Class4_Sub1_Sub3) this.aClass11_4.method165();
				if (local16 == null) {
					break;
				}
				if (this.aByteArrayArray1[local16.anInt110][local16.anInt111] != 0) {
					this.anInt62++;
				}
				this.aByteArrayArray1[local16.anInt110][local16.anInt111] = 0;
				this.aClass11_3.method163(local16);
				this.anInt74++;
				this.method89(local16);
				this.aBoolean34 = true;
			}
		} catch (@Pc(99) RuntimeException local99) {
			signlink.reporterror("81061, " + 1 + ", " + local99.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DGAWSPEW", name = "a", descriptor = "(Z)V")
	private void method101(@OriginalArg(0) boolean arg0) {
		try {
			if (arg0) {
				while (this.anInt74 == 0) {
					if (this.anInt75 >= 10 || this.anInt73 == 0) {
						return;
					}
					@Pc(10) Class11 local10 = this.aClass11_5;
					@Pc(17) Class4_Sub1_Sub3 local17;
					synchronized (this.aClass11_5) {
						local17 = (Class4_Sub1_Sub3) this.aClass11_5.method165();
					}
					while (local17 != null) {
						if (this.aByteArrayArray1[local17.anInt110][local17.anInt111] != 0) {
							this.aByteArrayArray1[local17.anInt110][local17.anInt111] = 0;
							this.aClass11_3.method163(local17);
							this.method89(local17);
							this.aBoolean34 = true;
							if (this.anInt62 < this.anInt66) {
								this.anInt62++;
							}
							this.aString2 = "Loading extra files - " + this.anInt62 * 100 / this.anInt66 + "%";
							this.anInt75++;
							if (this.anInt75 == 10) {
								return;
							}
						}
						local10 = this.aClass11_5;
						synchronized (this.aClass11_5) {
							local17 = (Class4_Sub1_Sub3) this.aClass11_5.method165();
						}
					}
					for (@Pc(111) int local111 = 0; local111 < 4; local111++) {
						@Pc(118) byte[] local118 = this.aByteArrayArray1[local111];
						@Pc(121) int local121 = local118.length;
						for (@Pc(123) int local123 = 0; local123 < local121; local123++) {
							if (local118[local123] == this.anInt73) {
								local118[local123] = 0;
								local17 = new Class4_Sub1_Sub3();
								local17.anInt110 = local111;
								local17.anInt111 = local123;
								local17.aBoolean54 = false;
								this.aClass11_3.method163(local17);
								this.method89(local17);
								this.aBoolean34 = true;
								if (this.anInt62 < this.anInt66) {
									this.anInt62++;
								}
								this.aString2 = "Loading extra files - " + this.anInt62 * 100 / this.anInt66 + "%";
								this.anInt75++;
								if (this.anInt75 == 10) {
									return;
								}
							}
						}
					}
					this.anInt73--;
				}
			}
		} catch (@Pc(221) RuntimeException local221) {
			signlink.reporterror("605, " + arg0 + ", " + local221.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DGAWSPEW", name = "c", descriptor = "(I)I")
	public int method102(@OriginalArg(0) int arg0) {
		try {
			while (arg0 >= 0) {
				for (@Pc(5) int local5 = 1; local5 > 0; local5++) {
				}
			}
			return this.anIntArray20.length;
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("56635, " + arg0 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DGAWSPEW", name = "b", descriptor = "()I")
	public int method103() {
		@Pc(2) Class27 local2 = this.aClass27_1;
		synchronized (this.aClass27_1) {
			return this.aClass27_1.method317();
		}
	}

	@OriginalMember(owner = "client!DGAWSPEW", name = "c", descriptor = "(II)I")
	public int method104(@OriginalArg(0) int arg0) {
		try {
			return this.anIntArrayArray4[arg0].length;
		} catch (@Pc(11) RuntimeException local11) {
			signlink.reporterror("67337, " + arg0 + ", " + 0 + ", " + local11.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DGAWSPEW", name = "c", descriptor = "()V")
	public void method105() {
		this.aBoolean33 = false;
	}

	@OriginalMember(owner = "client!DGAWSPEW", name = "d", descriptor = "(I)V")
	private void method106() {
		try {
			@Pc(6) Class11 local6 = this.aClass11_2;
			@Pc(13) Class4_Sub1_Sub3 local13;
			synchronized (this.aClass11_2) {
				local13 = (Class4_Sub1_Sub3) this.aClass11_2.method165();
			}
			while (local13 != null) {
				this.aBoolean34 = true;
				@Pc(24) byte[] local24 = null;
				if (this.aClient2.aClass34Array1[0] != null) {
					local24 = this.aClient2.aClass34Array1[local13.anInt110 + 1].method433(local13.anInt111, this.anInt71);
				}
				if (!this.method92(this.anIntArrayArray3[local13.anInt110][local13.anInt111], local24, this.anIntArrayArray4[local13.anInt110][local13.anInt111], this.aByte4)) {
					local24 = null;
				}
				@Pc(71) Class11 local71 = this.aClass11_2;
				synchronized (this.aClass11_2) {
					if (local24 == null) {
						this.aClass11_4.method163(local13);
					} else {
						local13.aByteArray5 = local24;
						@Pc(87) Class11 local87 = this.aClass11_1;
						synchronized (this.aClass11_1) {
							this.aClass11_1.method163(local13);
						}
					}
					local13 = (Class4_Sub1_Sub3) this.aClass11_2.method165();
				}
			}
		} catch (@Pc(114) RuntimeException local114) {
			signlink.reporterror("85199, " + 4 + ", " + local114.toString());
			throw new RuntimeException();
		}
	}
}
