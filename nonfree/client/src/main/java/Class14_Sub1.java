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

@OriginalClass("client!FOFQGQZJ")
public final class Class14_Sub1 extends Class14 implements Runnable {

	@OriginalMember(owner = "client!FOFQGQZJ", name = "d", descriptor = "I")
	private int anInt179;

	@OriginalMember(owner = "client!FOFQGQZJ", name = "g", descriptor = "[B")
	private byte[] aByteArray9;

	@OriginalMember(owner = "client!FOFQGQZJ", name = "h", descriptor = "J")
	private long aLong10;

	@OriginalMember(owner = "client!FOFQGQZJ", name = "l", descriptor = "Ljava/net/Socket;")
	private Socket aSocket1;

	@OriginalMember(owner = "client!FOFQGQZJ", name = "m", descriptor = "Lclient!client;")
	private client aClient2;

	@OriginalMember(owner = "client!FOFQGQZJ", name = "o", descriptor = "[I")
	private int[] anIntArray41;

	@OriginalMember(owner = "client!FOFQGQZJ", name = "p", descriptor = "[I")
	private int[] anIntArray42;

	@OriginalMember(owner = "client!FOFQGQZJ", name = "q", descriptor = "[I")
	private int[] anIntArray43;

	@OriginalMember(owner = "client!FOFQGQZJ", name = "s", descriptor = "I")
	private int anInt181;

	@OriginalMember(owner = "client!FOFQGQZJ", name = "t", descriptor = "I")
	private int anInt182;

	@OriginalMember(owner = "client!FOFQGQZJ", name = "v", descriptor = "I")
	private int anInt184;

	@OriginalMember(owner = "client!FOFQGQZJ", name = "x", descriptor = "[I")
	private int[] anIntArray44;

	@OriginalMember(owner = "client!FOFQGQZJ", name = "y", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream1;

	@OriginalMember(owner = "client!FOFQGQZJ", name = "z", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream1;

	@OriginalMember(owner = "client!FOFQGQZJ", name = "C", descriptor = "I")
	private int anInt185;

	@OriginalMember(owner = "client!FOFQGQZJ", name = "E", descriptor = "I")
	public int anInt186;

	@OriginalMember(owner = "client!FOFQGQZJ", name = "G", descriptor = "I")
	private int anInt187;

	@OriginalMember(owner = "client!FOFQGQZJ", name = "I", descriptor = "I")
	private int anInt188;

	@OriginalMember(owner = "client!FOFQGQZJ", name = "J", descriptor = "I")
	private int anInt189;

	@OriginalMember(owner = "client!FOFQGQZJ", name = "K", descriptor = "I")
	private int anInt190;

	@OriginalMember(owner = "client!FOFQGQZJ", name = "M", descriptor = "Lclient!BJSSVIRC;")
	private Class2_Sub1_Sub2 aClass2_Sub1_Sub2_1;

	@OriginalMember(owner = "client!FOFQGQZJ", name = "N", descriptor = "I")
	public int anInt191;

	@OriginalMember(owner = "client!FOFQGQZJ", name = "O", descriptor = "[I")
	private int[] anIntArray45;

	@OriginalMember(owner = "client!FOFQGQZJ", name = "R", descriptor = "[I")
	private int[] anIntArray46;

	@OriginalMember(owner = "client!FOFQGQZJ", name = "a", descriptor = "[[I")
	private int[][] anIntArrayArray7 = new int[4][];

	@OriginalMember(owner = "client!FOFQGQZJ", name = "b", descriptor = "[B")
	private byte[] aByteArray8 = new byte[65000];

	@OriginalMember(owner = "client!FOFQGQZJ", name = "c", descriptor = "[[B")
	private byte[][] aByteArrayArray2 = new byte[4][];

	@OriginalMember(owner = "client!FOFQGQZJ", name = "e", descriptor = "Ljava/lang/String;")
	public String aString3 = "";

	@OriginalMember(owner = "client!FOFQGQZJ", name = "f", descriptor = "I")
	private int anInt180 = 5;

	@OriginalMember(owner = "client!FOFQGQZJ", name = "i", descriptor = "Z")
	private boolean aBoolean42 = false;

	@OriginalMember(owner = "client!FOFQGQZJ", name = "j", descriptor = "Lclient!SXQMCHPP;")
	private Class38 aClass38_1 = new Class38(5);

	@OriginalMember(owner = "client!FOFQGQZJ", name = "k", descriptor = "Ljava/util/zip/CRC32;")
	private CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!FOFQGQZJ", name = "n", descriptor = "Lclient!SXQMCHPP;")
	private Class38 aClass38_2 = new Class38(5);

	@OriginalMember(owner = "client!FOFQGQZJ", name = "r", descriptor = "[B")
	private byte[] aByteArray10 = new byte[500];

	@OriginalMember(owner = "client!FOFQGQZJ", name = "u", descriptor = "I")
	private int anInt183 = 1;

	@OriginalMember(owner = "client!FOFQGQZJ", name = "w", descriptor = "Lclient!LXCATFEF;")
	private Class24 aClass24_1 = new Class24(512);

	@OriginalMember(owner = "client!FOFQGQZJ", name = "A", descriptor = "Z")
	private boolean aBoolean43 = true;

	@OriginalMember(owner = "client!FOFQGQZJ", name = "B", descriptor = "[[I")
	private int[][] anIntArrayArray8 = new int[4][];

	@OriginalMember(owner = "client!FOFQGQZJ", name = "D", descriptor = "Z")
	private boolean aBoolean44 = false;

	@OriginalMember(owner = "client!FOFQGQZJ", name = "F", descriptor = "Lclient!SXQMCHPP;")
	private Class38 aClass38_3 = new Class38(5);

	@OriginalMember(owner = "client!FOFQGQZJ", name = "H", descriptor = "Lclient!SXQMCHPP;")
	private Class38 aClass38_4 = new Class38(5);

	@OriginalMember(owner = "client!FOFQGQZJ", name = "L", descriptor = "Lclient!SXQMCHPP;")
	private Class38 aClass38_5 = new Class38(5);

	@OriginalMember(owner = "client!FOFQGQZJ", name = "P", descriptor = "Z")
	private boolean aBoolean45 = true;

	@OriginalMember(owner = "client!FOFQGQZJ", name = "Q", descriptor = "B")
	private byte aByte6 = 114;

	@OriginalMember(owner = "client!FOFQGQZJ", name = "a", descriptor = "()Lclient!BJSSVIRC;")
	public Class2_Sub1_Sub2 method83() {
		@Pc(4) Class38 local4 = this.aClass38_2;
		@Pc(11) Class2_Sub1_Sub2 local11;
		synchronized (this.aClass38_2) {
			local11 = (Class2_Sub1_Sub2) this.aClass38_2.method460();
		}
		if (local11 == null) {
			return null;
		}
		@Pc(24) Class24 local24 = this.aClass24_1;
		synchronized (this.aClass24_1) {
			local11.method563();
		}
		if (local11.aByteArray1 == null) {
			return local11;
		}
		@Pc(41) int local41 = 0;
		try {
			@Pc(50) GZIPInputStream local50 = new GZIPInputStream(new ByteArrayInputStream(local11.aByteArray1));
			while (true) {
				if (local41 == this.aByteArray8.length) {
					throw new RuntimeException("buffer overflow!");
				}
				@Pc(71) int local71 = local50.read(this.aByteArray8, local41, this.aByteArray8.length - local41);
				if (local71 == -1) {
					break;
				}
				local41 += local71;
			}
		} catch (@Pc(82) IOException local82) {
			throw new RuntimeException("error unzipping");
		}
		local11.aByteArray1 = new byte[local41];
		for (@Pc(93) int local93 = 0; local93 < local41; local93++) {
			local11.aByteArray1[local93] = this.aByteArray8[local93];
		}
		return local11;
	}

	@OriginalMember(owner = "client!FOFQGQZJ", name = "b", descriptor = "(I)V")
	private void method84() {
		try {
			if (this.anInt180 <= 5 && this.anInt180 >= 5) {
				while (this.anInt189 == 0) {
					if (this.anInt190 >= 10 || this.anInt187 == 0) {
						return;
					}
					@Pc(16) Class38 local16 = this.aClass38_1;
					@Pc(23) Class2_Sub1_Sub2 local23;
					synchronized (this.aClass38_1) {
						local23 = (Class2_Sub1_Sub2) this.aClass38_1.method460();
					}
					while (local23 != null) {
						if (this.aByteArrayArray2[local23.anInt78][local23.anInt80] != 0) {
							this.aByteArrayArray2[local23.anInt78][local23.anInt80] = 0;
							this.aClass38_5.method458(local23);
							this.method97(local23);
							this.aBoolean42 = true;
							if (this.anInt184 < this.anInt185) {
								this.anInt184++;
							}
							this.aString3 = "Loading extra files - " + this.anInt184 * 100 / this.anInt185 + "%";
							this.anInt190++;
							if (this.anInt190 == 10) {
								return;
							}
						}
						local16 = this.aClass38_1;
						synchronized (this.aClass38_1) {
							local23 = (Class2_Sub1_Sub2) this.aClass38_1.method460();
						}
					}
					for (@Pc(117) int local117 = 0; local117 < 4; local117++) {
						@Pc(124) byte[] local124 = this.aByteArrayArray2[local117];
						@Pc(127) int local127 = local124.length;
						for (@Pc(129) int local129 = 0; local129 < local127; local129++) {
							if (local124[local129] == this.anInt187) {
								local124[local129] = 0;
								local23 = new Class2_Sub1_Sub2();
								local23.anInt78 = local117;
								local23.anInt80 = local129;
								local23.aBoolean21 = false;
								this.aClass38_5.method458(local23);
								this.method97(local23);
								this.aBoolean42 = true;
								if (this.anInt184 < this.anInt185) {
									this.anInt184++;
								}
								this.aString3 = "Loading extra files - " + this.anInt184 * 100 / this.anInt185 + "%";
								this.anInt190++;
								if (this.anInt190 == 10) {
									return;
								}
							}
						}
					}
					this.anInt187--;
				}
			}
		} catch (@Pc(227) RuntimeException local227) {
			signlink.reporterror("73751, " + 5 + ", " + local227.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FOFQGQZJ", name = "a", descriptor = "(Lclient!JUPFHAZZ;Lclient!client;)V")
	public void method85(@OriginalArg(0) Class21 arg0, @OriginalArg(1) client arg1) {
		@Pc(20) String[] local20 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
		@Pc(36) int local36;
		@Pc(56) int local56;
		for (@Pc(22) int local22 = 0; local22 < 4; local22++) {
			@Pc(31) byte[] local31 = arg0.method275(local20[local22], null);
			local36 = local31.length / 2;
			@Pc(42) Class2_Sub1_Sub4 local42 = new Class2_Sub1_Sub4(859, local31);
			this.anIntArrayArray8[local22] = new int[local36];
			this.aByteArrayArray2[local22] = new byte[local36];
			for (local56 = 0; local56 < local36; local56++) {
				this.anIntArrayArray8[local22][local56] = local42.method494();
			}
		}
		@Pc(93) String[] local93 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
		@Pc(104) byte[] local104;
		for (local36 = 0; local36 < 4; local36++) {
			local104 = arg0.method275(local93[local36], null);
			local56 = local104.length / 4;
			@Pc(115) Class2_Sub1_Sub4 local115 = new Class2_Sub1_Sub4(859, local104);
			this.anIntArrayArray7[local36] = new int[local56];
			for (@Pc(123) int local123 = 0; local123 < local56; local123++) {
				this.anIntArrayArray7[local36][local123] = local115.method497();
			}
		}
		local104 = arg0.method275("model_index", null);
		local56 = this.anIntArrayArray8[0].length;
		this.aByteArray9 = new byte[local56];
		for (@Pc(158) int local158 = 0; local158 < local56; local158++) {
			if (local158 < local104.length) {
				this.aByteArray9[local158] = local104[local158];
			} else {
				this.aByteArray9[local158] = 0;
			}
		}
		local104 = arg0.method275("map_index", null);
		@Pc(193) Class2_Sub1_Sub4 local193 = new Class2_Sub1_Sub4(859, local104);
		local56 = local104.length / 7;
		this.anIntArray44 = new int[local56];
		this.anIntArray46 = new int[local56];
		this.anIntArray42 = new int[local56];
		this.anIntArray45 = new int[local56];
		for (@Pc(216) int local216 = 0; local216 < local56; local216++) {
			this.anIntArray44[local216] = local193.method494();
			this.anIntArray46[local216] = local193.method494();
			this.anIntArray42[local216] = local193.method494();
			this.anIntArray45[local216] = local193.method492();
		}
		local104 = arg0.method275("anim_index", null);
		local193 = new Class2_Sub1_Sub4(859, local104);
		local56 = local104.length / 2;
		this.anIntArray43 = new int[local56];
		for (@Pc(268) int local268 = 0; local268 < local56; local268++) {
			this.anIntArray43[local268] = local193.method494();
		}
		local104 = arg0.method275("midi_index", null);
		local193 = new Class2_Sub1_Sub4(859, local104);
		local56 = local104.length;
		this.anIntArray41 = new int[local56];
		for (@Pc(300) int local300 = 0; local300 < local56; local300++) {
			this.anIntArray41[local300] = local193.method492();
		}
		this.aClient2 = arg1;
		this.aBoolean43 = true;
		this.aClient2.method587(this, 2);
	}

	@OriginalMember(owner = "client!FOFQGQZJ", name = "b", descriptor = "()I")
	public int method86() {
		@Pc(2) Class24 local2 = this.aClass24_1;
		synchronized (this.aClass24_1) {
			return this.aClass24_1.method346();
		}
	}

	@OriginalMember(owner = "client!FOFQGQZJ", name = "a", descriptor = "(II)V")
	public void method87(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 > this.anIntArrayArray8.length || arg1 < 0 || arg1 > this.anIntArrayArray8[arg0].length || this.anIntArrayArray8[arg0][arg1] == 0) {
			return;
		}
		@Pc(27) Class24 local27 = this.aClass24_1;
		synchronized (this.aClass24_1) {
			@Pc(34) Class2_Sub1_Sub2 local34;
			for (local34 = (Class2_Sub1_Sub2) this.aClass24_1.method344(); local34 != null; local34 = (Class2_Sub1_Sub2) this.aClass24_1.method345()) {
				if (local34.anInt78 == arg0 && local34.anInt80 == arg1) {
					return;
				}
			}
			local34 = new Class2_Sub1_Sub2();
			local34.anInt78 = arg0;
			local34.anInt80 = arg1;
			local34.aBoolean21 = true;
			@Pc(71) Class38 local71 = this.aClass38_4;
			synchronized (this.aClass38_4) {
				this.aClass38_4.method458(local34);
			}
			this.aClass24_1.method342(local34);
		}
	}

	@OriginalMember(owner = "client!FOFQGQZJ", name = "c", descriptor = "(I)I")
	public int method88() {
		try {
			return this.anIntArray43.length;
		} catch (@Pc(9) RuntimeException local9) {
			signlink.reporterror("55862, " + 5 + ", " + local9.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FOFQGQZJ", name = "c", descriptor = "()V")
	public void method89() {
		this.aBoolean43 = false;
	}

	@OriginalMember(owner = "client!FOFQGQZJ", name = "a", descriptor = "(Z)V")
	private void method90() {
		try {
			@Pc(13) Class38 local13 = this.aClass38_4;
			@Pc(20) Class2_Sub1_Sub2 local20;
			synchronized (this.aClass38_4) {
				local20 = (Class2_Sub1_Sub2) this.aClass38_4.method460();
			}
			while (local20 != null) {
				this.aBoolean42 = true;
				@Pc(31) byte[] local31 = null;
				if (this.aClient2.aClass50Array1[0] != null) {
					local31 = this.aClient2.aClass50Array1[local20.anInt78 + 1].method572(local20.anInt80);
				}
				if (!this.method102(966, local31, this.anIntArrayArray7[local20.anInt78][local20.anInt80], this.anIntArrayArray8[local20.anInt78][local20.anInt80])) {
					local31 = null;
				}
				@Pc(76) Class38 local76 = this.aClass38_4;
				synchronized (this.aClass38_4) {
					if (local31 == null) {
						this.aClass38_3.method458(local20);
					} else {
						local20.aByteArray1 = local31;
						@Pc(92) Class38 local92 = this.aClass38_2;
						synchronized (this.aClass38_2) {
							this.aClass38_2.method458(local20);
						}
					}
					local20 = (Class2_Sub1_Sub2) this.aClass38_4.method460();
				}
			}
		} catch (@Pc(119) RuntimeException local119) {
			signlink.reporterror("18357, " + true + ", " + local119.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FOFQGQZJ", name = "b", descriptor = "(II)I")
	public int method91(@OriginalArg(0) int arg0) {
		try {
			return this.aByteArray9[arg0] & 0xFF;
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("78837, " + arg0 + ", " + 30468 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FOFQGQZJ", name = "a", descriptor = "(BIZI)V")
	public void method92(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			if (this.aClient2.aClass50Array1[0] != null && this.anIntArrayArray8[arg2][arg1] != 0) {
				@Pc(25) byte[] local25 = this.aClient2.aClass50Array1[arg2 + 1].method572(arg1);
				if (!this.method102(966, local25, this.anIntArrayArray7[arg2][arg1], this.anIntArrayArray8[arg2][arg1])) {
					this.aByteArrayArray2[arg2][arg1] = arg0;
					if (arg0 > this.anInt187) {
						this.anInt187 = arg0;
					}
					this.anInt185++;
				}
			}
		} catch (@Pc(70) RuntimeException local70) {
			signlink.reporterror("70959, " + arg0 + ", " + arg1 + ", " + true + ", " + arg2 + ", " + local70.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FOFQGQZJ", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (this.aBoolean43) {
				this.anInt191++;
				@Pc(11) byte local11 = 20;
				if (this.anInt187 == 0 && this.aClient2.aClass50Array1[0] != null) {
					local11 = 50;
				}
				try {
					Thread.sleep((long) local11);
				} catch (@Pc(27) Exception local27) {
				}
				this.aBoolean42 = true;
				for (@Pc(32) int local32 = 0; local32 < 100 && this.aBoolean42; local32++) {
					this.aBoolean42 = false;
					this.method90();
					this.method93();
					if (this.anInt189 == 0 && local32 >= 5) {
						break;
					}
					this.method84();
					if (this.anInputStream1 != null) {
						this.method103();
					}
				}
				@Pc(67) boolean local67 = false;
				@Pc(72) Class2_Sub1_Sub2 local72;
				for (local72 = (Class2_Sub1_Sub2) this.aClass38_5.method461(); local72 != null; local72 = (Class2_Sub1_Sub2) this.aClass38_5.method463()) {
					if (local72.aBoolean21) {
						local67 = true;
						local72.anInt79++;
						if (local72.anInt79 > 50) {
							local72.anInt79 = 0;
							this.method97(local72);
						}
					}
				}
				if (!local67) {
					for (local72 = (Class2_Sub1_Sub2) this.aClass38_5.method461(); local72 != null; local72 = (Class2_Sub1_Sub2) this.aClass38_5.method463()) {
						local67 = true;
						local72.anInt79++;
						if (local72.anInt79 > 50) {
							local72.anInt79 = 0;
							this.method97(local72);
						}
					}
				}
				if (local67) {
					this.anInt188++;
					if (this.anInt188 > 750) {
						try {
							this.aSocket1.close();
						} catch (@Pc(157) Exception local157) {
						}
						this.aSocket1 = null;
						this.anInputStream1 = null;
						this.anOutputStream1 = null;
						this.anInt182 = 0;
					}
				} else {
					this.anInt188 = 0;
					this.aString3 = "";
				}
				if (this.aClient2.aBoolean217 && this.aSocket1 != null && this.anOutputStream1 != null && (this.anInt187 > 0 || this.aClient2.aClass50Array1[0] == null)) {
					this.anInt179++;
					if (this.anInt179 > 500) {
						this.anInt179 = 0;
						this.aByteArray10[0] = 0;
						this.aByteArray10[1] = 0;
						this.aByteArray10[2] = 0;
						this.aByteArray10[3] = 10;
						try {
							this.anOutputStream1.write(this.aByteArray10, 0, 4);
						} catch (@Pc(238) IOException local238) {
							this.anInt188 = 5000;
						}
					}
				}
			}
		} catch (@Pc(247) Exception local247) {
			signlink.reporterror("od_ex " + local247.getMessage());
		}
	}

	@OriginalMember(owner = "client!FOFQGQZJ", name = "d", descriptor = "(I)V")
	private void method93() {
		try {
			this.anInt189 = 0;
			this.anInt190 = 0;
			@Pc(22) Class2_Sub1_Sub2 local22;
			for (local22 = (Class2_Sub1_Sub2) this.aClass38_5.method461(); local22 != null; local22 = (Class2_Sub1_Sub2) this.aClass38_5.method463()) {
				if (local22.aBoolean21) {
					this.anInt189++;
				} else {
					this.anInt190++;
				}
			}
			while (this.anInt189 < 10) {
				local22 = (Class2_Sub1_Sub2) this.aClass38_3.method460();
				if (local22 == null) {
					break;
				}
				if (this.aByteArrayArray2[local22.anInt78][local22.anInt80] != 0) {
					this.anInt184++;
				}
				this.aByteArrayArray2[local22.anInt78][local22.anInt80] = 0;
				this.aClass38_5.method458(local22);
				this.anInt189++;
				this.method97(local22);
				this.aBoolean42 = true;
			}
		} catch (@Pc(105) RuntimeException local105) {
			signlink.reporterror("98236, " + 40800 + ", " + local105.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FOFQGQZJ", name = "a", descriptor = "(III)V")
	public void method94(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			if (this.aClient2.aClass50Array1[0] != null && (this.anIntArrayArray8[arg0][arg1] != 0 && (this.aByteArrayArray2[arg0][arg1] != 0 && this.anInt187 != 0))) {
				@Pc(30) Class2_Sub1_Sub2 local30 = new Class2_Sub1_Sub2();
				local30.anInt78 = arg0;
				local30.anInt80 = arg1;
				local30.aBoolean21 = false;
				@Pc(42) Class38 local42 = this.aClass38_1;
				synchronized (this.aClass38_1) {
					this.aClass38_1.method458(local30);
				}
				@Pc(58) boolean local58 = false;
			}
		} catch (@Pc(60) RuntimeException local60) {
			signlink.reporterror("68469, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local60.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FOFQGQZJ", name = "a", descriptor = "(IZ)V")
	public void method95(@OriginalArg(1) boolean arg0) {
		try {
			@Pc(5) int local5 = this.anIntArray44.length;
			for (@Pc(7) int local7 = 0; local7 < local5; local7++) {
				if (arg0 || this.anIntArray45[local7] != 0) {
					this.method92((byte) 2, this.anIntArray42[local7], 3);
					this.method92((byte) 2, this.anIntArray46[local7], 3);
				}
			}
		} catch (@Pc(50) RuntimeException local50) {
			signlink.reporterror("6712, " + 6 + ", " + arg0 + ", " + local50.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FOFQGQZJ", name = "a", descriptor = "(IZII)I")
	public int method96(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(5) int local5 = (arg2 << 8) + arg1;
			for (@Pc(7) int local7 = 0; local7 < this.anIntArray44.length; local7++) {
				if (this.anIntArray44[local7] == local5) {
					if (arg0 == 0) {
						return this.anIntArray46[local7];
					}
					return this.anIntArray42[local7];
				}
			}
			return -1;
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("45330, " + arg0 + ", " + false + ", " + arg1 + ", " + arg2 + ", " + local40.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FOFQGQZJ", name = "a", descriptor = "(BLclient!BJSSVIRC;)V")
	private void method97(@OriginalArg(1) Class2_Sub1_Sub2 arg0) {
		try {
			if (this.aByte6 == 114) {
				try {
					if (this.aSocket1 == null) {
						@Pc(11) long local11 = System.currentTimeMillis();
						if (local11 - this.aLong10 < 4000L) {
							return;
						}
						this.aLong10 = local11;
						this.aSocket1 = this.aClient2.method671(client.anInt1014 + 43594);
						this.anInputStream1 = this.aSocket1.getInputStream();
						this.anOutputStream1 = this.aSocket1.getOutputStream();
						this.anOutputStream1.write(15);
						for (@Pc(46) int local46 = 0; local46 < 8; local46++) {
							this.anInputStream1.read();
						}
						this.anInt188 = 0;
					}
					this.aByteArray10[0] = (byte) arg0.anInt78;
					this.aByteArray10[1] = (byte) (arg0.anInt80 >> 8);
					this.aByteArray10[2] = (byte) arg0.anInt80;
					if (arg0.aBoolean21) {
						this.aByteArray10[3] = 2;
					} else if (this.aClient2.aBoolean217) {
						this.aByteArray10[3] = 0;
					} else {
						this.aByteArray10[3] = 1;
					}
					this.anOutputStream1.write(this.aByteArray10, 0, 4);
					this.anInt179 = 0;
					this.anInt186 = -10000;
				} catch (@Pc(123) IOException local123) {
					try {
						this.aSocket1.close();
					} catch (@Pc(128) Exception local128) {
					}
					this.aSocket1 = null;
					this.anInputStream1 = null;
					this.anOutputStream1 = null;
					this.anInt182 = 0;
					this.anInt186++;
				}
			}
		} catch (@Pc(148) RuntimeException local148) {
			signlink.reporterror("57654, " + 114 + ", " + arg0 + ", " + local148.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FOFQGQZJ", name = "c", descriptor = "(II)Z")
	public boolean method98(@OriginalArg(0) int arg0) {
		try {
			for (@Pc(1) int local1 = 0; local1 < this.anIntArray44.length; local1++) {
				if (this.anIntArray42[local1] == arg0) {
					return true;
				}
			}
			return false;
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("6118, " + arg0 + ", " + 422 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FOFQGQZJ", name = "a", descriptor = "(B)V")
	public void method99() {
		try {
			@Pc(2) Class38 local2 = this.aClass38_1;
			synchronized (this.aClass38_1) {
				this.aClass38_1.method465();
			}
		} catch (@Pc(27) RuntimeException local27) {
			signlink.reporterror("71555, " + 0 + ", " + local27.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FOFQGQZJ", name = "d", descriptor = "(II)I")
	public int method100(@OriginalArg(1) int arg0) {
		try {
			return this.anIntArrayArray8[arg0].length;
		} catch (@Pc(11) RuntimeException local11) {
			signlink.reporterror("47083, " + 14917 + ", " + arg0 + ", " + local11.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FOFQGQZJ", name = "b", descriptor = "(IZ)Z")
	public boolean method101(@OriginalArg(0) int arg0) {
		try {
			return this.anIntArray41[arg0] == 1;
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("13762, " + arg0 + ", " + false + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FOFQGQZJ", name = "a", descriptor = "(I[BII)Z")
	private boolean method102(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			if (arg1 == null || arg1.length < 2) {
				return false;
			}
			@Pc(12) int local12 = arg1.length - 2;
			@Pc(28) int local28 = ((arg1[local12] & 0xFF) << 8) + (arg1[local12 + 1] & 0xFF);
			@Pc(32) boolean local32 = false;
			this.aCRC32_1.reset();
			this.aCRC32_1.update(arg1, 0, local12);
			@Pc(46) int local46 = (int) this.aCRC32_1.getValue();
			if (local28 == arg3) {
				return local46 == arg2;
			} else {
				return false;
			}
		} catch (@Pc(59) RuntimeException local59) {
			signlink.reporterror("82791, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local59.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FOFQGQZJ", name = "e", descriptor = "(I)V")
	private void method103() {
		try {
			try {
				@Pc(15) int local15 = this.anInputStream1.available();
				@Pc(50) int local50;
				@Pc(66) int local66;
				if (this.anInt182 == 0 && local15 >= 6) {
					this.aBoolean42 = true;
					for (@Pc(26) int local26 = 0; local26 < 6; local26 += this.anInputStream1.read(this.aByteArray10, local26, 6 - local26)) {
					}
					local50 = this.aByteArray10[0] & 0xFF;
					local66 = ((this.aByteArray10[1] & 0xFF) << 8) + (this.aByteArray10[2] & 0xFF);
					@Pc(82) int local82 = ((this.aByteArray10[3] & 0xFF) << 8) + (this.aByteArray10[4] & 0xFF);
					@Pc(89) int local89 = this.aByteArray10[5] & 0xFF;
					this.aClass2_Sub1_Sub2_1 = null;
					for (@Pc(97) Class2_Sub1_Sub2 local97 = (Class2_Sub1_Sub2) this.aClass38_5.method461(); local97 != null; local97 = (Class2_Sub1_Sub2) this.aClass38_5.method463()) {
						if (local97.anInt78 == local50 && local97.anInt80 == local66) {
							this.aClass2_Sub1_Sub2_1 = local97;
						}
						if (this.aClass2_Sub1_Sub2_1 != null) {
							local97.anInt79 = 0;
						}
					}
					if (this.aClass2_Sub1_Sub2_1 != null) {
						this.anInt188 = 0;
						if (local82 == 0) {
							signlink.reporterror("Rej: " + local50 + "," + local66);
							this.aClass2_Sub1_Sub2_1.aByteArray1 = null;
							if (this.aClass2_Sub1_Sub2_1.aBoolean21) {
								@Pc(155) Class38 local155 = this.aClass38_2;
								synchronized (this.aClass38_2) {
									this.aClass38_2.method458(this.aClass2_Sub1_Sub2_1);
								}
							} else {
								this.aClass2_Sub1_Sub2_1.method562();
							}
							this.aClass2_Sub1_Sub2_1 = null;
						} else {
							if (this.aClass2_Sub1_Sub2_1.aByteArray1 == null && local89 == 0) {
								this.aClass2_Sub1_Sub2_1.aByteArray1 = new byte[local82];
							}
							if (this.aClass2_Sub1_Sub2_1.aByteArray1 == null && local89 != 0) {
								throw new IOException("missing start of file");
							}
						}
					}
					this.anInt181 = local89 * 500;
					this.anInt182 = 500;
					if (this.anInt182 > local82 - local89 * 500) {
						this.anInt182 = local82 - local89 * 500;
					}
				}
				if (this.anInt182 > 0 && local15 >= this.anInt182) {
					this.aBoolean42 = true;
					@Pc(234) byte[] local234 = this.aByteArray10;
					local50 = 0;
					if (this.aClass2_Sub1_Sub2_1 != null) {
						local234 = this.aClass2_Sub1_Sub2_1.aByteArray1;
						local50 = this.anInt181;
					}
					for (local66 = 0; local66 < this.anInt182; local66 += this.anInputStream1.read(local234, local66 + local50, this.anInt182 - local66)) {
					}
					if (this.anInt182 + this.anInt181 >= local234.length && this.aClass2_Sub1_Sub2_1 != null) {
						if (this.aClient2.aClass50Array1[0] != null) {
							this.aClient2.aClass50Array1[this.aClass2_Sub1_Sub2_1.anInt78 + 1].method573(local234, local234.length, this.aClass2_Sub1_Sub2_1.anInt80);
						}
						if (!this.aClass2_Sub1_Sub2_1.aBoolean21 && this.aClass2_Sub1_Sub2_1.anInt78 == 3) {
							this.aClass2_Sub1_Sub2_1.aBoolean21 = true;
							this.aClass2_Sub1_Sub2_1.anInt78 = 93;
						}
						if (this.aClass2_Sub1_Sub2_1.aBoolean21) {
							@Pc(327) Class38 local327 = this.aClass38_2;
							synchronized (this.aClass38_2) {
								this.aClass38_2.method458(this.aClass2_Sub1_Sub2_1);
							}
						} else {
							this.aClass2_Sub1_Sub2_1.method562();
						}
					}
					this.anInt182 = 0;
				}
			} catch (@Pc(348) IOException local348) {
				try {
					this.aSocket1.close();
				} catch (@Pc(353) Exception local353) {
				}
				this.aSocket1 = null;
				this.anInputStream1 = null;
				this.anOutputStream1 = null;
				this.anInt182 = 0;
			}
		} catch (@Pc(367) RuntimeException local367) {
			signlink.reporterror("49728, " + 0 + ", " + local367.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FOFQGQZJ", name = "a", descriptor = "(I)V")
	@Override
	public void method82(@OriginalArg(0) int arg0) {
		this.method87(0, arg0);
	}
}
