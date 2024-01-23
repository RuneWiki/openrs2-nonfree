import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mg")
public final class Class11_Sub1_Sub2 extends Class11_Sub1 {

	@OriginalMember(owner = "client!mg", name = "hb", descriptor = "[I")
	public static int[] anIntArray328;

	@OriginalMember(owner = "client!mg", name = "Fb", descriptor = "[I")
	public static int[] anIntArray347;

	@OriginalMember(owner = "client!mg", name = "Mb", descriptor = "[I")
	public static int[] anIntArray350;

	@OriginalMember(owner = "client!mg", name = "ob", descriptor = "[[I")
	public static int[][] anIntArrayArray20;

	@OriginalMember(owner = "client!mg", name = "zb", descriptor = "[I")
	public static int[] anIntArray342;

	@OriginalMember(owner = "client!mg", name = "wb", descriptor = "[[I")
	public static int[][] anIntArrayArray21;

	@OriginalMember(owner = "client!mg", name = "g", descriptor = "[S")
	private short[] aShortArray57;

	@OriginalMember(owner = "client!mg", name = "h", descriptor = "[B")
	private byte[] aByteArray102;

	@OriginalMember(owner = "client!mg", name = "i", descriptor = "[S")
	private short[] aShortArray58;

	@OriginalMember(owner = "client!mg", name = "j", descriptor = "S")
	private short aShort25;

	@OriginalMember(owner = "client!mg", name = "k", descriptor = "[I")
	private int[] anIntArray310;

	@OriginalMember(owner = "client!mg", name = "m", descriptor = "[[I")
	private int[][] anIntArrayArray17;

	@OriginalMember(owner = "client!mg", name = "n", descriptor = "[I")
	public int[] anIntArray311;

	@OriginalMember(owner = "client!mg", name = "o", descriptor = "S")
	private short aShort26;

	@OriginalMember(owner = "client!mg", name = "q", descriptor = "[[I")
	private int[][] anIntArrayArray18;

	@OriginalMember(owner = "client!mg", name = "r", descriptor = "[I")
	public int[] anIntArray312;

	@OriginalMember(owner = "client!mg", name = "t", descriptor = "[Lclient!rh;")
	public Class146[] aClass146Array2;

	@OriginalMember(owner = "client!mg", name = "u", descriptor = "[S")
	private short[] aShortArray59;

	@OriginalMember(owner = "client!mg", name = "v", descriptor = "[I")
	private int[] anIntArray313;

	@OriginalMember(owner = "client!mg", name = "w", descriptor = "[B")
	private byte[] aByteArray103;

	@OriginalMember(owner = "client!mg", name = "x", descriptor = "S")
	private short aShort27;

	@OriginalMember(owner = "client!mg", name = "y", descriptor = "[I")
	private int[] anIntArray314;

	@OriginalMember(owner = "client!mg", name = "z", descriptor = "[I")
	private int[] anIntArray315;

	@OriginalMember(owner = "client!mg", name = "B", descriptor = "[I")
	private int[] anIntArray316;

	@OriginalMember(owner = "client!mg", name = "C", descriptor = "S")
	private short aShort28;

	@OriginalMember(owner = "client!mg", name = "E", descriptor = "[I")
	private int[] anIntArray317;

	@OriginalMember(owner = "client!mg", name = "F", descriptor = "[I")
	private int[] anIntArray318;

	@OriginalMember(owner = "client!mg", name = "G", descriptor = "S")
	private short aShort29;

	@OriginalMember(owner = "client!mg", name = "H", descriptor = "S")
	private short aShort30;

	@OriginalMember(owner = "client!mg", name = "I", descriptor = "[I")
	public int[] anIntArray319;

	@OriginalMember(owner = "client!mg", name = "K", descriptor = "[I")
	private int[] anIntArray320;

	@OriginalMember(owner = "client!mg", name = "L", descriptor = "[I")
	private int[] anIntArray321;

	@OriginalMember(owner = "client!mg", name = "O", descriptor = "[S")
	private short[] aShortArray60;

	@OriginalMember(owner = "client!mg", name = "S", descriptor = "S")
	private short aShort31;

	@OriginalMember(owner = "client!mg", name = "V", descriptor = "[Lclient!hk;")
	public Class76[] aClass76Array2;

	@OriginalMember(owner = "client!mg", name = "W", descriptor = "[B")
	private byte[] aByteArray105;

	@OriginalMember(owner = "client!mg", name = "Z", descriptor = "S")
	private short aShort32;

	@OriginalMember(owner = "client!mg", name = "A", descriptor = "Z")
	public boolean aBoolean290 = false;

	@OriginalMember(owner = "client!mg", name = "p", descriptor = "I")
	private int anInt3321 = 0;

	@OriginalMember(owner = "client!mg", name = "s", descriptor = "Z")
	private boolean aBoolean289 = false;

	@OriginalMember(owner = "client!mg", name = "J", descriptor = "B")
	private byte aByte9 = 0;

	@OriginalMember(owner = "client!mg", name = "l", descriptor = "I")
	public int anInt3320 = 0;

	@OriginalMember(owner = "client!mg", name = "X", descriptor = "I")
	private int anInt3323 = 0;

	@OriginalMember(owner = "client!mg", name = "U", descriptor = "I")
	private int anInt3322 = 0;

	static {
		if (Static169.aBoolean291) {
			anIntArray328 = new int[4096];
			anIntArray347 = new int[4096];
		} else {
			anIntArray350 = new int[1600];
			anIntArrayArray20 = new int[1600][64];
			anIntArray342 = new int[32];
			anIntArrayArray21 = new int[32][512];
		}
	}

	@OriginalMember(owner = "client!mg", name = "<init>", descriptor = "()V")
	public Class11_Sub1_Sub2() {
	}

	@OriginalMember(owner = "client!mg", name = "<init>", descriptor = "(Lclient!nb;IIIII)V")
	public Class11_Sub1_Sub2(@OriginalArg(0) Class11_Sub5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg0.method3062();
		arg0.method3054();
		this.anInt3320 = arg0.anInt3474;
		this.anInt3323 = arg0.anInt3473;
		this.anIntArray312 = arg0.anIntArray365;
		this.anIntArray311 = arg0.anIntArray370;
		this.anIntArray319 = arg0.anIntArray364;
		this.anInt3322 = arg0.anInt3475;
		this.anIntArray318 = arg0.anIntArray363;
		this.anIntArray320 = arg0.anIntArray366;
		this.anIntArray317 = arg0.anIntArray362;
		this.aByteArray103 = arg0.aByteArray117;
		this.aByteArray102 = arg0.aByteArray113;
		this.aByte9 = arg0.aByte10;
		this.aShortArray57 = arg0.aShortArray65;
		this.anIntArrayArray17 = arg0.anIntArrayArray23;
		this.anIntArrayArray18 = arg0.anIntArrayArray24;
		this.aShortArray60 = arg0.aShortArray72;
		this.aClass146Array2 = arg0.aClass146Array3;
		this.aClass76Array2 = arg0.aClass76Array3;
		this.aShortArray58 = arg0.aShortArray68;
		@Pc(117) int local117 = (int) Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5));
		@Pc(123) int local123 = arg2 * local117 >> 8;
		this.anIntArray310 = new int[this.anInt3322];
		this.anIntArray313 = new int[this.anInt3322];
		this.anIntArray321 = new int[this.anInt3322];
		@Pc(148) int local148;
		if (arg0.aShortArray64 == null) {
			this.aShortArray59 = null;
		} else {
			this.aShortArray59 = new short[this.anInt3322];
			for (local148 = 0; local148 < this.anInt3322; local148++) {
				@Pc(157) short local157 = arg0.aShortArray64[local148];
				if (local157 != -1 && Static119.anInterface5_1.method1472(local157)) {
					this.aShortArray59[local148] = local157;
				} else {
					this.aShortArray59[local148] = -1;
				}
			}
		}
		if (arg0.anInt3476 > 0 && arg0.aByteArray118 != null) {
			@Pc(192) int[] local192 = new int[arg0.anInt3476];
			@Pc(194) int local194;
			for (local194 = 0; local194 < this.anInt3322; local194++) {
				if (arg0.aByteArray118[local194] != -1) {
					local192[arg0.aByteArray118[local194] & 0xFF]++;
				}
			}
			this.anInt3321 = 0;
			for (local194 = 0; local194 < arg0.anInt3476; local194++) {
				if (local192[local194] > 0 && arg0.aByteArray116[local194] == 0) {
					this.anInt3321++;
				}
			}
			this.anIntArray315 = new int[this.anInt3321];
			this.anIntArray316 = new int[this.anInt3321];
			this.anIntArray314 = new int[this.anInt3321];
			local194 = 0;
			@Pc(263) int local263;
			for (local263 = 0; local263 < arg0.anInt3476; local263++) {
				if (local192[local263] > 0 && arg0.aByteArray116[local263] == 0) {
					this.anIntArray315[local194] = arg0.aShortArray67[local263] & 0xFFFF;
					this.anIntArray316[local194] = arg0.aShortArray66[local263] & 0xFFFF;
					this.anIntArray314[local194] = arg0.aShortArray73[local263] & 0xFFFF;
					local192[local263] = local194++;
				} else {
					local192[local263] = -1;
				}
			}
			this.aByteArray105 = new byte[this.anInt3322];
			for (local263 = 0; local263 < this.anInt3322; local263++) {
				if (arg0.aByteArray118[local263] == -1) {
					this.aByteArray105[local263] = -1;
				} else {
					this.aByteArray105[local263] = (byte) local192[arg0.aByteArray118[local263] & 0xFF];
					if (this.aByteArray105[local263] == -1 && this.aShortArray59 != null) {
						this.aShortArray59[local263] = -1;
					}
				}
			}
		}
		for (local148 = 0; local148 < this.anInt3322; local148++) {
			@Pc(381) byte local381;
			if (arg0.aByteArray120 == null) {
				local381 = 0;
			} else {
				local381 = arg0.aByteArray120[local148];
			}
			@Pc(392) byte local392;
			if (arg0.aByteArray113 == null) {
				local392 = 0;
			} else {
				local392 = arg0.aByteArray113[local148];
			}
			@Pc(403) short local403;
			if (this.aShortArray59 == null) {
				local403 = -1;
			} else {
				local403 = this.aShortArray59[local148];
			}
			if (local392 == -2) {
				local381 = 3;
			}
			if (local392 == -1) {
				local381 = 2;
			}
			@Pc(450) Class31 local450;
			@Pc(483) int local483;
			@Pc(629) Class106 local629;
			if (local403 == -1) {
				if (local381 == 0) {
					@Pc(431) int local431 = arg0.aShortArray65[local148] & 0xFFFF;
					if (arg0.aClass31Array1 == null || arg0.aClass31Array1[this.anIntArray318[local148]] == null) {
						local450 = arg0.aClass31Array2[this.anIntArray318[local148]];
					} else {
						local450 = arg0.aClass31Array1[this.anIntArray318[local148]];
					}
					local483 = arg1 + (arg3 * local450.anInt1048 + arg4 * local450.anInt1053 + arg5 * local450.anInt1044) / (local123 * local450.anInt1051) << 17;
					this.anIntArray310[local148] = local483 | Static169.method2937(local431, local483 >> 17);
					if (arg0.aClass31Array1 == null || arg0.aClass31Array1[this.anIntArray320[local148]] == null) {
						local450 = arg0.aClass31Array2[this.anIntArray320[local148]];
					} else {
						local450 = arg0.aClass31Array1[this.anIntArray320[local148]];
					}
					local483 = arg1 + (arg3 * local450.anInt1048 + arg4 * local450.anInt1053 + arg5 * local450.anInt1044) / (local123 * local450.anInt1051) << 17;
					this.anIntArray313[local148] = local483 | Static169.method2937(local431, local483 >> 17);
					if (arg0.aClass31Array1 == null || arg0.aClass31Array1[this.anIntArray317[local148]] == null) {
						local450 = arg0.aClass31Array2[this.anIntArray317[local148]];
					} else {
						local450 = arg0.aClass31Array1[this.anIntArray317[local148]];
					}
					local483 = arg1 + (arg3 * local450.anInt1048 + arg4 * local450.anInt1053 + arg5 * local450.anInt1044) / (local123 * local450.anInt1051) << 17;
					this.anIntArray321[local148] = local483 | Static169.method2937(local431, local483 >> 17);
				} else if (local381 == 1) {
					local629 = arg0.aClass106Array1[local148];
					local483 = arg1 + (arg3 * local629.anInt3087 + arg4 * local629.anInt3084 + arg5 * local629.anInt3086) / (local123 + local123 / 2) << 17;
					this.anIntArray310[local148] = local483 | Static169.method2937(arg0.aShortArray65[local148] & 0xFFFF, local483 >> 17);
					this.anIntArray321[local148] = -1;
				} else if (local381 == 3) {
					this.anIntArray310[local148] = 128;
					this.anIntArray321[local148] = -1;
				} else {
					this.anIntArray321[local148] = -2;
				}
			} else if (local381 == 0) {
				if (arg0.aClass31Array1 == null || arg0.aClass31Array1[this.anIntArray318[local148]] == null) {
					local450 = arg0.aClass31Array2[this.anIntArray318[local148]];
				} else {
					local450 = arg0.aClass31Array1[this.anIntArray318[local148]];
				}
				local483 = arg1 + (arg3 * local450.anInt1048 + arg4 * local450.anInt1053 + arg5 * local450.anInt1044) / (local123 * local450.anInt1051);
				this.anIntArray310[local148] = Static169.method2926(local483);
				if (arg0.aClass31Array1 == null || arg0.aClass31Array1[this.anIntArray320[local148]] == null) {
					local450 = arg0.aClass31Array2[this.anIntArray320[local148]];
				} else {
					local450 = arg0.aClass31Array1[this.anIntArray320[local148]];
				}
				local483 = arg1 + (arg3 * local450.anInt1048 + arg4 * local450.anInt1053 + arg5 * local450.anInt1044) / (local123 * local450.anInt1051);
				this.anIntArray313[local148] = Static169.method2926(local483);
				if (arg0.aClass31Array1 == null || arg0.aClass31Array1[this.anIntArray317[local148]] == null) {
					local450 = arg0.aClass31Array2[this.anIntArray317[local148]];
				} else {
					local450 = arg0.aClass31Array1[this.anIntArray317[local148]];
				}
				local483 = arg1 + (arg3 * local450.anInt1048 + arg4 * local450.anInt1053 + arg5 * local450.anInt1044) / (local123 * local450.anInt1051);
				this.anIntArray321[local148] = Static169.method2926(local483);
			} else if (local381 == 1) {
				local629 = arg0.aClass106Array1[local148];
				local483 = arg1 + (arg3 * local629.anInt3087 + arg4 * local629.anInt3084 + arg5 * local629.anInt3086) / (local123 + local123 / 2);
				this.anIntArray310[local148] = Static169.method2926(local483);
				this.anIntArray321[local148] = -1;
			} else {
				this.anIntArray321[local148] = -2;
			}
		}
	}

	@OriginalMember(owner = "client!mg", name = "<init>", descriptor = "([Lclient!mg;I)V")
	private Class11_Sub1_Sub2(@OriginalArg(0) Class11_Sub1_Sub2[] arg0, @OriginalArg(1) int arg1) {
		@Pc(24) boolean local24 = false;
		@Pc(26) boolean local26 = false;
		@Pc(28) boolean local28 = false;
		@Pc(30) boolean local30 = false;
		this.anInt3320 = 0;
		this.anInt3322 = 0;
		this.anInt3321 = 0;
		@Pc(41) int local41 = 0;
		@Pc(43) int local43 = 0;
		this.aByte9 = -1;
		@Pc(48) int local48;
		@Pc(55) Class11_Sub1_Sub2 local55;
		for (local48 = 0; local48 < arg1; local48++) {
			local55 = arg0[local48];
			if (local55 != null) {
				this.anInt3320 += local55.anInt3320;
				this.anInt3322 += local55.anInt3322;
				this.anInt3321 += local55.anInt3321;
				if (local55.aByteArray103 == null) {
					if (this.aByte9 == -1) {
						this.aByte9 = local55.aByte9;
					}
					if (this.aByte9 != local55.aByte9) {
						local24 = true;
					}
				} else {
					local24 = true;
				}
				local26 |= local55.aByteArray102 != null;
				local28 |= local55.aShortArray59 != null;
				local30 |= local55.aByteArray105 != null;
				if (local55.aClass146Array2 != null) {
					local41 += local55.aClass146Array2.length;
				}
				if (local55.aClass76Array2 != null) {
					local43 += local55.aClass76Array2.length;
				}
			}
		}
		this.anIntArray312 = new int[this.anInt3320];
		this.anIntArray311 = new int[this.anInt3320];
		this.anIntArray319 = new int[this.anInt3320];
		this.anIntArray318 = new int[this.anInt3322];
		this.anIntArray320 = new int[this.anInt3322];
		this.anIntArray317 = new int[this.anInt3322];
		this.anIntArray310 = new int[this.anInt3322];
		this.anIntArray313 = new int[this.anInt3322];
		this.anIntArray321 = new int[this.anInt3322];
		if (local24) {
			this.aByteArray103 = new byte[this.anInt3322];
		}
		if (local26) {
			this.aByteArray102 = new byte[this.anInt3322];
		}
		if (local28) {
			this.aShortArray59 = new short[this.anInt3322];
		}
		if (local30) {
			this.aByteArray105 = new byte[this.anInt3322];
		}
		if (this.anInt3321 > 0) {
			this.anIntArray315 = new int[this.anInt3321];
			this.anIntArray316 = new int[this.anInt3321];
			this.anIntArray314 = new int[this.anInt3321];
		}
		if (local41 > 0) {
			this.aClass146Array2 = new Class146[local41];
		}
		if (local43 > 0) {
			this.aClass76Array2 = new Class76[local43];
		}
		this.aShortArray57 = new short[this.anInt3322];
		this.anInt3320 = 0;
		this.anInt3322 = 0;
		this.anInt3321 = 0;
		local43 = 0;
		local41 = 0;
		for (local48 = 0; local48 < arg1; local48++) {
			local55 = arg0[local48];
			if (local55 != null) {
				@Pc(280) int local280;
				for (local280 = 0; local280 < local55.anInt3322; local280++) {
					this.anIntArray318[this.anInt3322] = local55.anIntArray318[local280] + this.anInt3320;
					this.anIntArray320[this.anInt3322] = local55.anIntArray320[local280] + this.anInt3320;
					this.anIntArray317[this.anInt3322] = local55.anIntArray317[local280] + this.anInt3320;
					this.anIntArray310[this.anInt3322] = local55.anIntArray310[local280];
					this.anIntArray313[this.anInt3322] = local55.anIntArray313[local280];
					this.anIntArray321[this.anInt3322] = local55.anIntArray321[local280];
					this.aShortArray57[this.anInt3322] = local55.aShortArray57[local280];
					if (local24) {
						if (local55.aByteArray103 == null) {
							this.aByteArray103[this.anInt3322] = local55.aByte9;
						} else {
							this.aByteArray103[this.anInt3322] = local55.aByteArray103[local280];
						}
					}
					if (local26 && local55.aByteArray102 != null) {
						this.aByteArray102[this.anInt3322] = local55.aByteArray102[local280];
					}
					if (local28) {
						if (local55.aShortArray59 == null) {
							this.aShortArray59[this.anInt3322] = -1;
						} else {
							this.aShortArray59[this.anInt3322] = local55.aShortArray59[local280];
						}
					}
					if (local30) {
						this.aByteArray105[this.anInt3322] = (byte) (local55.aByteArray105 == null || local55.aByteArray105[local280] == -1 ? -1 : local55.aByteArray105[local280] + this.anInt3321);
					}
					this.anInt3322++;
				}
				if (local55.aClass146Array2 != null) {
					for (local280 = 0; local280 < local55.aClass146Array2.length; local280++) {
						this.aClass146Array2[local41] = new Class146(local55.aClass146Array2[local280].aClass2_2, local55.aClass146Array2[local280].anInt4472 + this.anInt3320, local55.aClass146Array2[local280].anInt4475 + this.anInt3320, local55.aClass146Array2[local280].anInt4477 + this.anInt3320);
						local41++;
					}
				}
				if (local55.aClass76Array2 != null) {
					for (local280 = 0; local280 < local55.aClass76Array2.length; local280++) {
						this.aClass76Array2[local43] = new Class76(local55.aClass76Array2[local280].aClass143_1, local55.aClass76Array2[local280].anInt2213 + this.anInt3320);
						local43++;
					}
				}
				for (local280 = 0; local280 < local55.anInt3321; local280++) {
					if (local55.anIntArray315[local280] < local55.anInt3323) {
						this.anIntArray315[this.anInt3321] = local55.anIntArray315[local280] + this.anInt3320;
					}
					if (local55.anIntArray316[local280] < local55.anInt3323) {
						this.anIntArray316[this.anInt3321] = local55.anIntArray316[local280] + this.anInt3320;
					}
					if (local55.anIntArray314[local280] < local55.anInt3323) {
						this.anIntArray314[this.anInt3321] = local55.anIntArray314[local280] + this.anInt3320;
					}
					this.anInt3321++;
				}
				for (local280 = 0; local280 < local55.anInt3323; local280++) {
					this.anIntArray312[this.anInt3320] = local55.anIntArray312[local280];
					this.anIntArray311[this.anInt3320] = local55.anIntArray311[local280];
					this.anIntArray319[this.anInt3320] = local55.anIntArray319[local280];
					this.anInt3320++;
				}
			}
		}
		local48 = 0;
		this.anInt3323 = this.anInt3320;
		for (@Pc(651) int local651 = 0; local651 < arg1; local651++) {
			@Pc(658) Class11_Sub1_Sub2 local658 = arg0[local651];
			if (local658 != null) {
				@Pc(662) int local662;
				for (local662 = 0; local662 < local658.anInt3321; local662++) {
					if (local658.anIntArray315[local662] >= local658.anInt3323) {
						this.anIntArray315[local48] = local658.anIntArray315[local662] + this.anInt3320 - local658.anInt3323;
					}
					if (local658.anIntArray316[local662] >= local658.anInt3323) {
						this.anIntArray316[local48] = local658.anIntArray316[local662] + this.anInt3320 - local658.anInt3323;
					}
					if (local658.anIntArray314[local662] >= local658.anInt3323) {
						this.anIntArray314[local48] = local658.anIntArray314[local662] + this.anInt3320 - local658.anInt3323;
					}
					local48++;
				}
				for (local662 = local658.anInt3323; local662 < local658.anInt3320; local662++) {
					this.anIntArray312[this.anInt3320] = local658.anIntArray312[local662];
					this.anIntArray311[this.anInt3320] = local658.anIntArray311[local662];
					this.anIntArray319[this.anInt3320] = local658.anIntArray319[local662];
					this.anInt3320++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(IIIIIIII)Z")
	private boolean method2925(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
			return false;
		} else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
			return false;
		} else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
			return false;
		} else {
			return arg0 <= arg5 || arg0 <= arg6 || arg0 <= arg7;
		}
	}

	@OriginalMember(owner = "client!mg", name = "i", descriptor = "()V")
	@Override
	public void method2918() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt3320; local1++) {
			@Pc(10) int local10 = this.anIntArray312[local1];
			this.anIntArray312[local1] = this.anIntArray319[local1];
			this.anIntArray319[local1] = -local10;
		}
		this.aBoolean290 = false;
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(IIIIIIIIJILclient!dh;)V")
	@Override
	public void method4299(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class22_Sub3 arg10) {
		if (!this.aBoolean290) {
			this.method2934();
		}
		@Pc(14) int local14 = arg7 * arg4 - arg5 * arg3 >> 16;
		@Pc(24) int local24 = arg6 * arg1 + local14 * arg2 >> 16;
		@Pc(38) int local38 = local24 + (this.aShort26 * arg2 + this.aShort25 * arg1 >> 16);
		@Pc(53) int local53 = local24 + (-this.aShort26 * arg2 + this.aShort27 * arg1 >> 16);
		@Pc(58) int local58;
		@Pc(70) int local70;
		@Pc(87) int local87;
		if (arg10 != null) {
			local58 = arg10.method964();
			local70 = local24 + (local58 * arg2 + arg1 * 0 >> 16);
			local87 = local24 + (-local58 * arg2 - (arg10.anInt1151 - arg10.anInt1140) * arg1 >> 16);
			if (local87 < local53) {
				local53 = local87;
			}
			if (local70 > local38) {
				local38 = local70;
			}
			arg10.method951(arg0, arg9, arg5, arg6, arg7);
		}
		if (local38 <= 50 || local53 >= 3500) {
			return;
		}
		local58 = arg7 * arg3 + arg5 * arg4 >> 16;
		local70 = local58 + this.aShort26 << 9;
		if (local70 / local38 <= Static163.anInt3267) {
			return;
		}
		local87 = local58 - this.aShort26 << 9;
		if (local87 / local38 >= Static264.anInt4880) {
			return;
		}
		@Pc(158) int local158 = arg6 * arg2 - local14 * arg1 >> 16;
		@Pc(174) int local174 = local158 + (this.aShort26 * arg1 + this.aShort25 * arg2 >> 16) << 9;
		if (local174 / local38 <= Static196.anInt3909) {
			return;
		}
		@Pc(197) int local197 = local158 + (-this.aShort26 * arg1 + this.aShort27 * arg2 >> 16) << 9;
		if (local197 / local38 >= Static143.anInt2793) {
			return;
		}
		@Pc(205) boolean local205 = false;
		@Pc(212) boolean local212 = local53 <= 50;
		@Pc(221) boolean local221 = local212 || this.anInt3321 > 0;
		@Pc(223) int local223 = Static119.anInt2423;
		@Pc(225) int local225 = Static119.anInt2427;
		@Pc(227) int local227 = 0;
		@Pc(229) int local229 = 0;
		if (arg0 != 0) {
			local227 = Class87.anIntArray173[arg0];
			local229 = Class87.anIntArray177[arg0];
		}
		@Pc(241) boolean local241 = false;
		@Pc(255) int local255;
		@Pc(274) int local274;
		@Pc(259) int local259;
		@Pc(278) int local278;
		@Pc(438) int local438;
		if (arg8 > 0L && Static271.aBoolean475 && local53 > 0) {
			if (local58 > 0) {
				local255 = local87 / local38;
				local259 = local70 / local53;
			} else {
				local255 = local87 / local53;
				local259 = local70 / local38;
			}
			if (local158 > 0) {
				local274 = local197 / local38;
				local278 = local174 / local53;
			} else {
				local274 = local197 / local53;
				local278 = local174 / local38;
			}
			if (Static42.anInt967 >= local255 && Static42.anInt967 <= local259 && Static226.anInt4237 >= local274 && Static226.anInt4237 <= local278) {
				local255 = 999999;
				local259 = -999999;
				local274 = 999999;
				local278 = -999999;
				@Pc(350) int[] local350 = new int[] { this.aShort29, this.aShort31, this.aShort29, this.aShort31, this.aShort29, this.aShort31, this.aShort29, this.aShort31 };
				@Pc(393) int[] local393 = new int[] { this.aShort30, this.aShort30, this.aShort28, this.aShort28, this.aShort30, this.aShort30, this.aShort28, this.aShort28 };
				@Pc(436) int[] local436 = new int[] { this.aShort27, this.aShort27, this.aShort27, this.aShort27, this.aShort25, this.aShort25, this.aShort25, this.aShort25 };
				for (local438 = 0; local438 < 8; local438++) {
					@Pc(445) int local445 = local350[local438];
					@Pc(449) int local449 = local436[local438];
					@Pc(453) int local453 = local393[local438];
					@Pc(465) int local465;
					if (arg0 != 0) {
						local465 = local453 * local227 + local445 * local229 >> 16;
						local453 = local453 * local229 - local445 * local227 >> 16;
						local445 = local465;
					}
					local445 += arg5;
					local449 += arg6;
					local453 += arg7;
					local465 = local453 * arg3 + local445 * arg4 >> 16;
					local453 = local453 * arg4 - local445 * arg3 >> 16;
					local445 = local465;
					local465 = local449 * arg2 - local453 * arg1 >> 16;
					local453 = local449 * arg1 + local453 * arg2 >> 16;
					if (local453 > 0) {
						@Pc(541) int local541 = (local445 << 9) / local453;
						@Pc(547) int local547 = (local465 << 9) / local453;
						if (local541 < local255) {
							local255 = local541;
						}
						if (local541 > local259) {
							local259 = local541;
						}
						if (local547 < local274) {
							local274 = local547;
						}
						if (local547 > local278) {
							local278 = local547;
						}
					}
				}
				if (Static42.anInt967 >= local255 && Static42.anInt967 <= local259 && Static226.anInt4237 >= local274 && Static226.anInt4237 <= local278) {
					if (this.aBoolean288) {
						Static273.aLongArray11[Static256.anInt4784++] = arg8;
					} else {
						local241 = true;
					}
				}
			}
		}
		@Pc(628) int local628;
		for (local255 = 0; local255 < this.anInt3320; local255++) {
			local274 = this.anIntArray312[local255];
			local259 = this.anIntArray311[local255];
			local278 = this.anIntArray319[local255];
			if (arg0 != 0) {
				local628 = local278 * local227 + local274 * local229 >> 16;
				local278 = local278 * local229 - local274 * local227 >> 16;
				local274 = local628;
			}
			local274 += arg5;
			local259 += arg6;
			local278 += arg7;
			local628 = local278 * arg3 + local274 * arg4 >> 16;
			local278 = local278 * arg4 - local274 * arg3 >> 16;
			local274 = local628;
			local628 = local259 * arg2 - local278 * arg1 >> 16;
			local278 = local259 * arg1 + local278 * arg2 >> 16;
			Static169.anIntArray335[local255] = local278 - local24;
			if (local278 >= 50) {
				Static169.anIntArray349[local255] = local223 + (local274 << 9) / local278;
				Static169.anIntArray333[local255] = local225 + (local628 << 9) / local278;
			} else {
				Static169.anIntArray349[local255] = -5000;
				local205 = true;
			}
			if (local221) {
				Static169.anIntArray329[local255] = local274;
				Static169.anIntArray344[local255] = local628;
				Static169.anIntArray340[local255] = local278;
			}
		}
		if (arg10 != null) {
			local255 = Static52.anInt1126 + local223;
			local274 = Static52.anInt1128 + local225;
			for (local259 = 0; local259 < arg10.aClass22_Sub1_Sub1Array2.length; local259++) {
				@Pc(770) Class22_Sub1_Sub1 local770 = arg10.aClass22_Sub1_Sub1Array2[local259];
				if (local770 == null || local770.aBoolean69) {
					Static169.anIntArray337[local259] = Integer.MIN_VALUE;
				} else {
					local628 = (local770.anInt647 >> 12) - Static156.anInt3124;
					@Pc(789) int local789 = (local770.anInt645 >> 12) - Static215.anInt4033;
					@Pc(796) int local796 = (local770.anInt649 >> 12) - Static292.anInt5278;
					local438 = local796 * arg3 + local628 * arg4 >> 16;
					@Pc(816) int local816 = local796 * arg4 - local628 * arg3 >> 16;
					local628 = local438;
					local438 = local789 * arg2 - local816 * arg1 >> 16;
					@Pc(838) int local838 = local789 * arg1 + local816 * arg2 >> 16;
					if (local838 >= 50) {
						Static169.anIntArray332[local259] = local255 + (local628 << 9) / local838;
						Static169.anIntArray339[local259] = local274 + (local438 << 9) / local838;
						Static169.anIntArray343[local259] = local838;
						Static169.anIntArray337[local259] = local838 - local24;
					} else {
						Static169.anIntArray337[local259] = Integer.MIN_VALUE;
					}
				}
			}
		}
		try {
			this.method2936(local205, local241, arg8, local24 - local53, local38 - local53 + 2, arg10);
		} catch (@Pc(901) Exception local901) {
		}
	}

	@OriginalMember(owner = "client!mg", name = "m", descriptor = "()V")
	@Override
	public void method2922() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt3320; local1++) {
			this.anIntArray312[local1] = -this.anIntArray312[local1];
			this.anIntArray319[local1] = -this.anIntArray319[local1];
		}
		this.aBoolean290 = false;
	}

	@OriginalMember(owner = "client!mg", name = "c", descriptor = "(III)V")
	@Override
	public void method2913(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt3320; local1++) {
			this.anIntArray312[local1] += arg0;
			this.anIntArray311[local1] += arg1;
			this.anIntArray319[local1] += arg2;
		}
		this.aBoolean290 = false;
	}

	@OriginalMember(owner = "client!mg", name = "b", descriptor = "(IIIIIIII)V")
	public void method2928(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		try {
			if (!this.aBoolean290) {
				this.method2934();
			}
			@Pc(6) int local6 = Static119.anInt2423;
			@Pc(8) int local8 = Static119.anInt2427;
			@Pc(12) int local12 = Class87.anIntArray173[0];
			@Pc(16) int local16 = Class87.anIntArray177[0];
			@Pc(20) int local20 = Class87.anIntArray173[arg0];
			@Pc(24) int local24 = Class87.anIntArray177[arg0];
			@Pc(28) int local28 = Class87.anIntArray173[arg1];
			@Pc(32) int local32 = Class87.anIntArray177[arg1];
			@Pc(36) int local36 = Class87.anIntArray173[arg2];
			@Pc(40) int local40 = Class87.anIntArray177[arg2];
			@Pc(50) int local50 = arg4 * local36 + arg5 * local40 >> 16;
			for (@Pc(52) int local52 = 0; local52 < this.anInt3320; local52++) {
				@Pc(61) int local61 = this.anIntArray312[local52];
				@Pc(66) int local66 = this.anIntArray311[local52];
				@Pc(71) int local71 = this.anIntArray319[local52];
				@Pc(83) int local83;
				if (arg1 != 0) {
					local83 = local66 * local28 + local61 * local32 >> 16;
					local66 = local66 * local32 - local61 * local28 >> 16;
					local61 = local83;
				}
				if (arg0 != 0) {
					local83 = local71 * local20 + local61 * local24 >> 16;
					local71 = local71 * local24 - local61 * local20 >> 16;
					local61 = local83;
				}
				local61 += arg3;
				local66 += arg4;
				local71 += arg5;
				local83 = local66 * local40 - local71 * local36 >> 16;
				local71 = local66 * local36 + local71 * local40 >> 16;
				Static169.anIntArray335[local52] = local71 - local50;
				Static169.anIntArray349[local52] = local6 + (local61 << 9) / arg6;
				Static169.anIntArray333[local52] = local8 + (local83 << 9) / arg6;
				if (this.anInt3321 > 0) {
					Static169.anIntArray329[local52] = local61;
					Static169.anIntArray344[local52] = local83;
					Static169.anIntArray340[local52] = local71;
				}
			}
			this.method2936(false, false, 0L, this.aShort32, this.aShort32 << 1, null);
		} catch (@Pc(234) RuntimeException local234) {
		}
	}

	@OriginalMember(owner = "client!mg", name = "g", descriptor = "()I")
	@Override
	public int method2914() {
		if (!this.aBoolean290) {
			this.method2934();
		}
		return this.aShort29;
	}

	@OriginalMember(owner = "client!mg", name = "p", descriptor = "()V")
	private void method2930() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt3322; local1++) {
			@Pc(15) short local15 = this.aShortArray59 == null ? -1 : this.aShortArray59[local1];
			if (local15 == -1) {
				@Pc(25) int local25 = this.aShortArray57[local1] & 0xFFFF;
				@Pc(38) int local38;
				if (this.anIntArray321[local1] == -1) {
					local38 = this.anIntArray310[local1] & 0xFFFE0000;
					this.anIntArray310[local1] = local38 | Static169.method2937(local25, local38 >> 17);
				} else if (this.anIntArray321[local1] != -2) {
					local38 = this.anIntArray310[local1] & 0xFFFE0000;
					this.anIntArray310[local1] = local38 | Static169.method2937(local25, local38 >> 17);
					local38 = this.anIntArray313[local1] & 0xFFFE0000;
					this.anIntArray313[local1] = local38 | Static169.method2937(local25, local38 >> 17);
					local38 = this.anIntArray321[local1] & 0xFFFE0000;
					this.anIntArray321[local1] = local38 | Static169.method2937(local25, local38 >> 17);
				}
			}
		}
	}

	@OriginalMember(owner = "client!mg", name = "b", descriptor = "(I)V")
	@Override
	public void method2896(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class87.anIntArray173[arg0];
		@Pc(7) int local7 = Class87.anIntArray177[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt3320; local9++) {
			@Pc(29) int local29 = this.anIntArray311[local9] * local7 - this.anIntArray319[local9] * local3 >> 16;
			this.anIntArray319[local9] = this.anIntArray311[local9] * local3 + this.anIntArray319[local9] * local7 >> 16;
			this.anIntArray311[local9] = local29;
		}
		this.aBoolean290 = false;
	}

	@OriginalMember(owner = "client!mg", name = "d", descriptor = "(I)V")
	@Override
	public void method2917(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class87.anIntArray173[arg0];
		@Pc(7) int local7 = Class87.anIntArray177[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt3320; local9++) {
			@Pc(29) int local29 = this.anIntArray311[local9] * local3 + this.anIntArray312[local9] * local7 >> 16;
			this.anIntArray311[local9] = this.anIntArray311[local9] * local7 - this.anIntArray312[local9] * local3 >> 16;
			this.anIntArray312[local9] = local29;
		}
		this.aBoolean290 = false;
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(ZZLclient!mg;[B[S[I[I[I)Lclient!sm;")
	private Class11_Sub1 method2931(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class11_Sub1_Sub2 arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) short[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7) {
		arg2.anInt3320 = this.anInt3320;
		arg2.anInt3323 = this.anInt3323;
		arg2.anInt3322 = this.anInt3322;
		arg2.anInt3321 = this.anInt3321;
		if (arg2.anIntArray312 == null || arg2.anIntArray312.length < this.anInt3320) {
			arg2.anIntArray312 = new int[this.anInt3320 + 100];
			arg2.anIntArray311 = new int[this.anInt3320 + 100];
			arg2.anIntArray319 = new int[this.anInt3320 + 100];
		}
		@Pc(47) int local47;
		for (local47 = 0; local47 < this.anInt3320; local47++) {
			arg2.anIntArray312[local47] = this.anIntArray312[local47];
			arg2.anIntArray311[local47] = this.anIntArray311[local47];
			arg2.anIntArray319[local47] = this.anIntArray319[local47];
		}
		if (arg0) {
			arg2.aByteArray102 = this.aByteArray102;
		} else {
			arg2.aByteArray102 = arg3;
			if (this.aByteArray102 == null) {
				for (local47 = 0; local47 < this.anInt3322; local47++) {
					arg2.aByteArray102[local47] = 0;
				}
			} else {
				for (local47 = 0; local47 < this.anInt3322; local47++) {
					arg2.aByteArray102[local47] = this.aByteArray102[local47];
				}
			}
		}
		if (arg1) {
			arg2.aShortArray57 = this.aShortArray57;
			arg2.anIntArray310 = this.anIntArray310;
			arg2.anIntArray313 = this.anIntArray313;
			arg2.anIntArray321 = this.anIntArray321;
		} else {
			arg2.aShortArray57 = arg4;
			arg2.anIntArray310 = arg5;
			arg2.anIntArray313 = arg6;
			arg2.anIntArray321 = arg7;
			for (local47 = 0; local47 < this.anInt3322; local47++) {
				arg2.aShortArray57[local47] = this.aShortArray57[local47];
				arg2.anIntArray310[local47] = this.anIntArray310[local47];
				arg2.anIntArray313[local47] = this.anIntArray313[local47];
				arg2.anIntArray321[local47] = this.anIntArray321[local47];
			}
		}
		arg2.anIntArray318 = this.anIntArray318;
		arg2.anIntArray320 = this.anIntArray320;
		arg2.anIntArray317 = this.anIntArray317;
		arg2.aByteArray103 = this.aByteArray103;
		arg2.aByteArray105 = this.aByteArray105;
		arg2.aShortArray59 = this.aShortArray59;
		arg2.aByte9 = this.aByte9;
		arg2.anIntArray315 = this.anIntArray315;
		arg2.anIntArray316 = this.anIntArray316;
		arg2.anIntArray314 = this.anIntArray314;
		arg2.anIntArrayArray17 = this.anIntArrayArray17;
		arg2.anIntArrayArray18 = this.anIntArrayArray18;
		arg2.aShortArray58 = this.aShortArray58;
		arg2.aShortArray60 = this.aShortArray60;
		arg2.aBoolean288 = this.aBoolean288;
		arg2.aBoolean290 = false;
		arg2.aClass146Array2 = this.aClass146Array2;
		arg2.aClass76Array2 = this.aClass76Array2;
		return arg2;
	}

	@OriginalMember(owner = "client!mg", name = "f", descriptor = "(I)V")
	private void method2932(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static119.anInt2423;
		@Pc(3) int local3 = Static119.anInt2427;
		@Pc(5) int local5 = 0;
		@Pc(10) int local10 = this.anIntArray318[arg0];
		@Pc(15) int local15 = this.anIntArray320[arg0];
		@Pc(20) int local20 = this.anIntArray317[arg0];
		@Pc(24) int local24 = Static169.anIntArray340[local10];
		@Pc(28) int local28 = Static169.anIntArray340[local15];
		@Pc(32) int local32 = Static169.anIntArray340[local20];
		if (this.aByteArray102 == null) {
			Static119.anInt2426 = 0;
		} else {
			Static119.anInt2426 = this.aByteArray102[arg0] & 0xFF;
		}
		@Pc(75) int local75;
		@Pc(79) int local79;
		@Pc(86) int local86;
		@Pc(99) int local99;
		if (local24 >= 50) {
			Static169.anIntArray348[0] = Static169.anIntArray349[local10];
			Static169.anIntArray352[0] = Static169.anIntArray333[local10];
			local5++;
			Static169.anIntArray351[0] = this.anIntArray310[arg0] & 0xFFFF;
		} else {
			local75 = Static169.anIntArray329[local10];
			local79 = Static169.anIntArray344[local10];
			local86 = this.anIntArray310[arg0] & 0xFFFF;
			if (local32 >= 50) {
				local99 = (50 - local24) * Class87.anIntArray176[local32 - local24];
				Static169.anIntArray348[0] = local1 + (local75 + ((Static169.anIntArray329[local20] - local75) * local99 >> 16) << 9) / 50;
				Static169.anIntArray352[0] = local3 + (local79 + ((Static169.anIntArray344[local20] - local79) * local99 >> 16) << 9) / 50;
				local5++;
				Static169.anIntArray351[0] = local86 + (((this.anIntArray321[arg0] & 0xFFFF) - local86) * local99 >> 16);
			}
			if (local28 >= 50) {
				local99 = (50 - local24) * Class87.anIntArray176[local28 - local24];
				Static169.anIntArray348[local5] = local1 + (local75 + ((Static169.anIntArray329[local15] - local75) * local99 >> 16) << 9) / 50;
				Static169.anIntArray352[local5] = local3 + (local79 + ((Static169.anIntArray344[local15] - local79) * local99 >> 16) << 9) / 50;
				Static169.anIntArray351[local5++] = local86 + (((this.anIntArray313[arg0] & 0xFFFF) - local86) * local99 >> 16);
			}
		}
		if (local28 >= 50) {
			Static169.anIntArray348[local5] = Static169.anIntArray349[local15];
			Static169.anIntArray352[local5] = Static169.anIntArray333[local15];
			Static169.anIntArray351[local5++] = this.anIntArray313[arg0] & 0xFFFF;
		} else {
			local75 = Static169.anIntArray329[local15];
			local79 = Static169.anIntArray344[local15];
			local86 = this.anIntArray313[arg0] & 0xFFFF;
			if (local24 >= 50) {
				local99 = (50 - local28) * Class87.anIntArray176[local24 - local28];
				Static169.anIntArray348[local5] = local1 + (local75 + ((Static169.anIntArray329[local10] - local75) * local99 >> 16) << 9) / 50;
				Static169.anIntArray352[local5] = local3 + (local79 + ((Static169.anIntArray344[local10] - local79) * local99 >> 16) << 9) / 50;
				Static169.anIntArray351[local5++] = local86 + (((this.anIntArray310[arg0] & 0xFFFF) - local86) * local99 >> 16);
			}
			if (local32 >= 50) {
				local99 = (50 - local28) * Class87.anIntArray176[local32 - local28];
				Static169.anIntArray348[local5] = local1 + (local75 + ((Static169.anIntArray329[local20] - local75) * local99 >> 16) << 9) / 50;
				Static169.anIntArray352[local5] = local3 + (local79 + ((Static169.anIntArray344[local20] - local79) * local99 >> 16) << 9) / 50;
				Static169.anIntArray351[local5++] = local86 + (((this.anIntArray321[arg0] & 0xFFFF) - local86) * local99 >> 16);
			}
		}
		if (local32 >= 50) {
			Static169.anIntArray348[local5] = Static169.anIntArray349[local20];
			Static169.anIntArray352[local5] = Static169.anIntArray333[local20];
			Static169.anIntArray351[local5++] = this.anIntArray321[arg0] & 0xFFFF;
		} else {
			local75 = Static169.anIntArray329[local20];
			local79 = Static169.anIntArray344[local20];
			local86 = this.anIntArray321[arg0] & 0xFFFF;
			if (local28 >= 50) {
				local99 = (50 - local32) * Class87.anIntArray176[local28 - local32];
				Static169.anIntArray348[local5] = local1 + (local75 + ((Static169.anIntArray329[local15] - local75) * local99 >> 16) << 9) / 50;
				Static169.anIntArray352[local5] = local3 + (local79 + ((Static169.anIntArray344[local15] - local79) * local99 >> 16) << 9) / 50;
				Static169.anIntArray351[local5++] = local86 + (((this.anIntArray313[arg0] & 0xFFFF) - local86) * local99 >> 16);
			}
			if (local24 >= 50) {
				local99 = (50 - local32) * Class87.anIntArray176[local24 - local32];
				Static169.anIntArray348[local5] = local1 + (local75 + ((Static169.anIntArray329[local10] - local75) * local99 >> 16) << 9) / 50;
				Static169.anIntArray352[local5] = local3 + (local79 + ((Static169.anIntArray344[local10] - local79) * local99 >> 16) << 9) / 50;
				Static169.anIntArray351[local5++] = local86 + (((this.anIntArray310[arg0] & 0xFFFF) - local86) * local99 >> 16);
			}
		}
		local75 = Static169.anIntArray348[0];
		local79 = Static169.anIntArray348[1];
		local86 = Static169.anIntArray348[2];
		local99 = Static169.anIntArray352[0];
		@Pc(614) int local614 = Static169.anIntArray352[1];
		@Pc(618) int local618 = Static169.anIntArray352[2];
		Static119.aBoolean209 = false;
		@Pc(709) int local709;
		@Pc(714) int local714;
		@Pc(719) int local719;
		@Pc(704) int local704;
		if (local5 == 3) {
			if (local75 < 0 || local79 < 0 || local86 < 0 || local75 > Static119.anInt2425 || local79 > Static119.anInt2425 || local86 > Static119.anInt2425) {
				Static119.aBoolean209 = true;
			}
			if (this.aShortArray59 != null && this.aShortArray59[arg0] != -1) {
				if (this.aByteArray105 == null || this.aByteArray105[arg0] == -1) {
					local709 = local10;
					local714 = local15;
					local719 = local20;
				} else {
					local704 = this.aByteArray105[arg0] & 0xFF;
					local709 = this.anIntArray315[local704];
					local714 = this.anIntArray316[local704];
					local719 = this.anIntArray314[local704];
				}
				if (this.anIntArray321[arg0] == -1) {
					Static119.method2165(local99, local614, local618, local75, local79, local86, this.anIntArray310[arg0], this.anIntArray310[arg0], this.anIntArray310[arg0], Static169.anIntArray329[local709], Static169.anIntArray329[local714], Static169.anIntArray329[local719], Static169.anIntArray344[local709], Static169.anIntArray344[local714], Static169.anIntArray344[local719], Static169.anIntArray340[local709], Static169.anIntArray340[local714], Static169.anIntArray340[local719], this.aShortArray59[arg0]);
				} else {
					Static119.method2165(local99, local614, local618, local75, local79, local86, Static169.anIntArray351[0], Static169.anIntArray351[1], Static169.anIntArray351[2], Static169.anIntArray329[local709], Static169.anIntArray329[local714], Static169.anIntArray329[local719], Static169.anIntArray344[local709], Static169.anIntArray344[local714], Static169.anIntArray344[local719], Static169.anIntArray340[local709], Static169.anIntArray340[local714], Static169.anIntArray340[local719], this.aShortArray59[arg0]);
				}
			} else if (this.anIntArray321[arg0] == -1) {
				Static119.method2152(local99, local614, local618, local75, local79, local86, Static119.anIntArray174[this.anIntArray310[arg0] & 0xFFFF]);
			} else {
				Static119.method2161(local99, local614, local618, local75, local79, local86, Static169.anIntArray351[0], Static169.anIntArray351[1], Static169.anIntArray351[2]);
			}
		}
		if (local5 != 4) {
			return;
		}
		if (local75 < 0 || local79 < 0 || local86 < 0 || local75 > Static119.anInt2425 || local79 > Static119.anInt2425 || local86 > Static119.anInt2425 || Static169.anIntArray348[3] < 0 || Static169.anIntArray348[3] > Static119.anInt2425) {
			Static119.aBoolean209 = true;
		}
		if (this.aShortArray59 != null && this.aShortArray59[arg0] != -1) {
			if (this.aByteArray105 == null || this.aByteArray105[arg0] == -1) {
				local709 = local10;
				local714 = local15;
				local719 = local20;
			} else {
				local704 = this.aByteArray105[arg0] & 0xFF;
				local709 = this.anIntArray315[local704];
				local714 = this.anIntArray316[local704];
				local719 = this.anIntArray314[local704];
			}
			@Pc(984) short local984 = this.aShortArray59[arg0];
			if (this.anIntArray321[arg0] == -1) {
				Static119.method2165(local99, local614, local618, local75, local79, local86, this.anIntArray310[arg0], this.anIntArray310[arg0], this.anIntArray310[arg0], Static169.anIntArray329[local709], Static169.anIntArray329[local714], Static169.anIntArray329[local719], Static169.anIntArray344[local709], Static169.anIntArray344[local714], Static169.anIntArray344[local719], Static169.anIntArray340[local709], Static169.anIntArray340[local714], Static169.anIntArray340[local719], local984);
				Static119.method2165(local99, local618, Static169.anIntArray352[3], local75, local86, Static169.anIntArray348[3], this.anIntArray310[arg0], this.anIntArray310[arg0], this.anIntArray310[arg0], Static169.anIntArray329[local709], Static169.anIntArray329[local714], Static169.anIntArray329[local719], Static169.anIntArray344[local709], Static169.anIntArray344[local714], Static169.anIntArray344[local719], Static169.anIntArray340[local709], Static169.anIntArray340[local714], Static169.anIntArray340[local719], local984);
			} else {
				Static119.method2165(local99, local614, local618, local75, local79, local86, Static169.anIntArray351[0], Static169.anIntArray351[1], Static169.anIntArray351[2], Static169.anIntArray329[local709], Static169.anIntArray329[local714], Static169.anIntArray329[local719], Static169.anIntArray344[local709], Static169.anIntArray344[local714], Static169.anIntArray344[local719], Static169.anIntArray340[local709], Static169.anIntArray340[local714], Static169.anIntArray340[local719], local984);
				Static119.method2165(local99, local618, Static169.anIntArray352[3], local75, local86, Static169.anIntArray348[3], Static169.anIntArray351[0], Static169.anIntArray351[2], Static169.anIntArray351[3], Static169.anIntArray329[local709], Static169.anIntArray329[local714], Static169.anIntArray329[local719], Static169.anIntArray344[local709], Static169.anIntArray344[local714], Static169.anIntArray344[local719], Static169.anIntArray340[local709], Static169.anIntArray340[local714], Static169.anIntArray340[local719], local984);
			}
		} else if (this.anIntArray321[arg0] == -1) {
			local709 = Static119.anIntArray174[this.anIntArray310[arg0] & 0xFFFF];
			Static119.method2152(local99, local614, local618, local75, local79, local86, local709);
			Static119.method2152(local99, local618, Static169.anIntArray352[3], local75, local86, Static169.anIntArray348[3], local709);
		} else {
			Static119.method2161(local99, local614, local618, local75, local79, local86, Static169.anIntArray351[0], Static169.anIntArray351[1], Static169.anIntArray351[2]);
			Static119.method2161(local99, local618, Static169.anIntArray352[3], local75, local86, Static169.anIntArray348[3], Static169.anIntArray351[0], Static169.anIntArray351[2], Static169.anIntArray351[3]);
		}
	}

	@OriginalMember(owner = "client!mg", name = "l", descriptor = "()I")
	@Override
	public int method2921() {
		if (!this.aBoolean290) {
			this.method2934();
		}
		return this.aShort31;
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "()I")
	@Override
	public int method4297() {
		if (!this.aBoolean290) {
			this.method2934();
		}
		return this.aShort27;
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(II[[I[[IIIIZ)Lclient!mg;")
	public Class11_Sub1_Sub2 method2933(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		if (!this.aBoolean290) {
			this.method2934();
		}
		@Pc(9) int local9 = arg4 + this.aShort29;
		@Pc(14) int local14 = arg4 + this.aShort31;
		@Pc(19) int local19 = arg6 + this.aShort30;
		@Pc(24) int local24 = arg6 + this.aShort28;
		if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (local9 < 0 || local14 + 128 >> 7 >= arg2.length || local19 < 0 || local24 + 128 >> 7 >= arg2[0].length)) {
			return this;
		}
		if (arg0 == 4 || arg0 == 5) {
			if (arg3 == null) {
				return this;
			}
			if (local9 < 0 || local14 + 128 >> 7 >= arg3.length || local19 < 0 || local24 + 128 >> 7 >= arg3[0].length) {
				return this;
			}
		} else {
			local9 >>= 0x7;
			local14 = local14 + 127 >> 7;
			local19 >>= 0x7;
			local24 = local24 + 127 >> 7;
			if (arg2[local9][local19] == arg5 && arg2[local14][local19] == arg5 && arg2[local9][local24] == arg5 && arg2[local14][local24] == arg5) {
				return this;
			}
		}
		@Pc(150) Class11_Sub1_Sub2 local150;
		if (arg7) {
			local150 = new Class11_Sub1_Sub2();
			local150.anInt3320 = this.anInt3320;
			local150.anInt3323 = this.anInt3323;
			local150.anInt3322 = this.anInt3322;
			local150.anInt3321 = this.anInt3321;
			local150.anIntArray318 = this.anIntArray318;
			local150.anIntArray320 = this.anIntArray320;
			local150.anIntArray317 = this.anIntArray317;
			local150.anIntArray310 = this.anIntArray310;
			local150.anIntArray313 = this.anIntArray313;
			local150.anIntArray321 = this.anIntArray321;
			local150.aByteArray103 = this.aByteArray103;
			local150.aByteArray105 = this.aByteArray105;
			local150.aShortArray59 = this.aShortArray59;
			local150.aShortArray57 = this.aShortArray57;
			local150.aByteArray102 = this.aByteArray102;
			local150.aByte9 = this.aByte9;
			local150.anIntArray315 = this.anIntArray315;
			local150.anIntArray316 = this.anIntArray316;
			local150.anIntArray314 = this.anIntArray314;
			local150.anIntArrayArray17 = this.anIntArrayArray17;
			local150.anIntArrayArray18 = this.anIntArrayArray18;
			local150.aShortArray58 = this.aShortArray58;
			local150.aShortArray60 = this.aShortArray60;
			local150.aBoolean288 = this.aBoolean288;
			if (arg0 == 3) {
				local150.anIntArray312 = Static282.method4273(this.anIntArray312);
				local150.anIntArray311 = Static282.method4273(this.anIntArray311);
				local150.anIntArray319 = Static282.method4273(this.anIntArray319);
			} else {
				local150.anIntArray312 = this.anIntArray312;
				local150.anIntArray311 = new int[local150.anInt3320];
				local150.anIntArray319 = this.anIntArray319;
			}
		} else {
			local150 = this;
		}
		@Pc(289) int local289;
		@Pc(300) int local300;
		@Pc(307) int local307;
		@Pc(311) int local311;
		@Pc(315) int local315;
		@Pc(319) int local319;
		@Pc(323) int local323;
		@Pc(345) int local345;
		@Pc(371) int local371;
		@Pc(383) int local383;
		if (arg0 == 1) {
			for (local289 = 0; local289 < local150.anInt3323; local289++) {
				local300 = this.anIntArray312[local289] + arg4;
				local307 = this.anIntArray319[local289] + arg6;
				local311 = local300 & 0x7F;
				local315 = local307 & 0x7F;
				local319 = local300 >> 7;
				local323 = local307 >> 7;
				local345 = arg2[local319][local323] * (128 - local311) + arg2[local319 + 1][local323] * local311 >> 7;
				local371 = arg2[local319][local323 + 1] * (128 - local311) + arg2[local319 + 1][local323 + 1] * local311 >> 7;
				local383 = local345 * (128 - local315) + local371 * local315 >> 7;
				local150.anIntArray311[local289] = this.anIntArray311[local289] + local383 - arg5;
			}
			for (local289 = local150.anInt3323; local289 < local150.anInt3320; local289++) {
				local300 = this.anIntArray312[local289] + arg4;
				local307 = this.anIntArray319[local289] + arg6;
				local311 = local300 & 0x7F;
				local315 = local307 & 0x7F;
				local319 = local300 >> 7;
				local323 = local307 >> 7;
				if (local319 >= 0 && local319 < arg2.length - 1 && local323 >= 0 && local323 < arg2[0].length - 1) {
					local345 = arg2[local319][local323] * (128 - local311) + arg2[local319 + 1][local323] * local311 >> 7;
					local371 = arg2[local319][local323 + 1] * (128 - local311) + arg2[local319 + 1][local323 + 1] * local311 >> 7;
					local383 = local345 * (128 - local315) + local371 * local315 >> 7;
					local150.anIntArray311[local289] = this.anIntArray311[local289] + local383 - arg5;
				}
			}
		} else {
			@Pc(640) int local640;
			if (arg0 == 2) {
				for (local289 = 0; local289 < local150.anInt3323; local289++) {
					local300 = (this.anIntArray311[local289] << 16) / this.aShort27;
					if (local300 < arg1) {
						local307 = this.anIntArray312[local289] + arg4;
						local311 = this.anIntArray319[local289] + arg6;
						local315 = local307 & 0x7F;
						local319 = local311 & 0x7F;
						local323 = local307 >> 7;
						local345 = local311 >> 7;
						local371 = arg2[local323][local345] * (128 - local315) + arg2[local323 + 1][local345] * local315 >> 7;
						local383 = arg2[local323][local345 + 1] * (128 - local315) + arg2[local323 + 1][local345 + 1] * local315 >> 7;
						local640 = local371 * (128 - local319) + local383 * local319 >> 7;
						local150.anIntArray311[local289] = this.anIntArray311[local289] + (local640 - arg5) * (arg1 - local300) / arg1;
					} else {
						local150.anIntArray311[local289] = this.anIntArray311[local289];
					}
				}
				for (local289 = local150.anInt3323; local289 < local150.anInt3320; local289++) {
					local300 = (this.anIntArray311[local289] << 16) / this.aShort27;
					if (local300 < arg1) {
						local307 = this.anIntArray312[local289] + arg4;
						local311 = this.anIntArray319[local289] + arg6;
						local315 = local307 & 0x7F;
						local319 = local311 & 0x7F;
						local323 = local307 >> 7;
						local345 = local311 >> 7;
						if (local323 >= 0 && local323 < arg2.length - 1 && local345 >= 0 && local345 < arg2[0].length - 1) {
							local371 = arg2[local323][local345] * (128 - local315) + arg2[local323 + 1][local345] * local315 >> 7;
							local383 = arg2[local323][local345 + 1] * (128 - local315) + arg2[local323 + 1][local345 + 1] * local315 >> 7;
							local640 = local371 * (128 - local319) + local383 * local319 >> 7;
							local150.anIntArray311[local289] = this.anIntArray311[local289] + (local640 - arg5) * (arg1 - local300) / arg1;
						}
					} else {
						local150.anIntArray311[local289] = this.anIntArray311[local289];
					}
				}
			} else if (arg0 == 3) {
				local289 = (arg1 & 0xFF) * 4;
				local300 = (arg1 >> 8 & 0xFF) * 4;
				local150.method2911(arg2, arg4, arg5, arg6, local289, local300);
			} else if (arg0 == 4) {
				local289 = this.aShort25 - this.aShort27;
				for (local300 = 0; local300 < this.anInt3323; local300++) {
					local307 = this.anIntArray312[local300] + arg4;
					local311 = this.anIntArray319[local300] + arg6;
					local315 = local307 & 0x7F;
					local319 = local311 & 0x7F;
					local323 = local307 >> 7;
					local345 = local311 >> 7;
					local371 = arg3[local323][local345] * (128 - local315) + arg3[local323 + 1][local345] * local315 >> 7;
					local383 = arg3[local323][local345 + 1] * (128 - local315) + arg3[local323 + 1][local345 + 1] * local315 >> 7;
					local640 = local371 * (128 - local319) + local383 * local319 >> 7;
					local150.anIntArray311[local300] = this.anIntArray311[local300] + local640 + local289 - arg5;
				}
				for (local300 = local150.anInt3323; local300 < local150.anInt3320; local300++) {
					local307 = this.anIntArray312[local300] + arg4;
					local311 = this.anIntArray319[local300] + arg6;
					local315 = local307 & 0x7F;
					local319 = local311 & 0x7F;
					local323 = local307 >> 7;
					local345 = local311 >> 7;
					if (local323 >= 0 && local323 < arg3.length - 1 && local345 >= 0 && local345 < arg3[0].length - 1) {
						local371 = arg3[local323][local345] * (128 - local315) + arg3[local323 + 1][local345] * local315 >> 7;
						local383 = arg3[local323][local345 + 1] * (128 - local315) + arg3[local323 + 1][local345 + 1] * local315 >> 7;
						local640 = local371 * (128 - local319) + local383 * local319 >> 7;
						local150.anIntArray311[local300] = this.anIntArray311[local300] + local640 + local289 - arg5;
					}
				}
			} else if (arg0 == 5) {
				local289 = this.aShort25 - this.aShort27;
				@Pc(1273) int local1273;
				@Pc(1277) int local1277;
				for (local300 = 0; local300 < this.anInt3323; local300++) {
					local307 = this.anIntArray312[local300] + arg4;
					local311 = this.anIntArray319[local300] + arg6;
					local315 = local307 & 0x7F;
					local319 = local311 & 0x7F;
					local323 = local307 >> 7;
					local345 = local311 >> 7;
					local371 = arg2[local323][local345] * (128 - local315) + arg2[local323 + 1][local345] * local315 >> 7;
					local383 = arg2[local323][local345 + 1] * (128 - local315) + arg2[local323 + 1][local345 + 1] * local315 >> 7;
					local640 = local371 * (128 - local319) + local383 * local319 >> 7;
					local371 = arg3[local323][local345] * (128 - local315) + arg3[local323 + 1][local345] * local315 >> 7;
					local383 = arg3[local323][local345 + 1] * (128 - local315) + arg3[local323 + 1][local345 + 1] * local315 >> 7;
					local1273 = local371 * (128 - local319) + local383 * local319 >> 7;
					local1277 = local640 - local1273;
					local150.anIntArray311[local300] = ((this.anIntArray311[local300] << 8) / local289 * local1277 >> 8) - (arg5 - local640);
				}
				for (local300 = local150.anInt3323; local300 < local150.anInt3320; local300++) {
					local307 = this.anIntArray312[local300] + arg4;
					local311 = this.anIntArray319[local300] + arg6;
					local315 = local307 & 0x7F;
					local319 = local311 & 0x7F;
					local323 = local307 >> 7;
					local345 = local311 >> 7;
					if (local323 >= 0 && local323 < arg2.length - 1 && local323 < arg3.length - 1 && local345 >= 0 && local345 < arg2[0].length - 1 && local345 < arg3[0].length - 1) {
						local371 = arg2[local323][local345] * (128 - local315) + arg2[local323 + 1][local345] * local315 >> 7;
						local383 = arg2[local323][local345 + 1] * (128 - local315) + arg2[local323 + 1][local345 + 1] * local315 >> 7;
						local640 = local371 * (128 - local319) + local383 * local319 >> 7;
						local371 = arg3[local323][local345] * (128 - local315) + arg3[local323 + 1][local345] * local315 >> 7;
						local383 = arg3[local323][local345 + 1] * (128 - local315) + arg3[local323 + 1][local345 + 1] * local315 >> 7;
						local1273 = local371 * (128 - local319) + local383 * local319 >> 7;
						local1277 = local640 - local1273;
						local150.anIntArray311[local300] = ((this.anIntArray311[local300] << 8) / local289 * local1277 >> 8) - (arg5 - local640);
					}
				}
			}
		}
		local150.aBoolean290 = false;
		return local150;
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(I[IIIIZ)V")
	@Override
	protected void method2916(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		@Pc(2) int local2 = arg1.length;
		@Pc(6) int local6;
		@Pc(14) int local14;
		@Pc(33) int local33;
		@Pc(41) int local41;
		if (arg0 == 0) {
			local6 = 0;
			Static169.anInt3327 = 0;
			Static169.anInt3324 = 0;
			Static169.anInt3325 = 0;
			for (local14 = 0; local14 < local2; local14++) {
				@Pc(21) int local21 = arg1[local14];
				if (local21 < this.anIntArrayArray17.length) {
					@Pc(31) int[] local31 = this.anIntArrayArray17[local21];
					for (local33 = 0; local33 < local31.length; local33++) {
						local41 = local31[local33];
						Static169.anInt3327 += this.anIntArray312[local41];
						Static169.anInt3324 += this.anIntArray311[local41];
						Static169.anInt3325 += this.anIntArray319[local41];
						local6++;
					}
				}
			}
			if (local6 > 0) {
				Static169.anInt3327 = Static169.anInt3327 / local6 + arg2;
				Static169.anInt3324 = Static169.anInt3324 / local6 + arg3;
				Static169.anInt3325 = Static169.anInt3325 / local6 + arg4;
			} else {
				Static169.anInt3327 = arg2;
				Static169.anInt3324 = arg3;
				Static169.anInt3325 = arg4;
			}
			return;
		}
		@Pc(117) int[] local117;
		@Pc(119) int local119;
		if (arg0 == 1) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray17.length) {
					local117 = this.anIntArrayArray17[local14];
					for (local119 = 0; local119 < local117.length; local119++) {
						local33 = local117[local119];
						this.anIntArray312[local33] += arg2;
						this.anIntArray311[local33] += arg3;
						this.anIntArray319[local33] += arg4;
					}
				}
			}
			return;
		}
		@Pc(222) int local222;
		@Pc(240) int local240;
		if (arg0 == 2) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray17.length) {
					local117 = this.anIntArrayArray17[local14];
					for (local119 = 0; local119 < local117.length; local119++) {
						local33 = local117[local119];
						this.anIntArray312[local33] -= Static169.anInt3327;
						this.anIntArray311[local33] -= Static169.anInt3324;
						this.anIntArray319[local33] -= Static169.anInt3325;
						if (arg4 != 0) {
							local41 = Class87.anIntArray173[arg4];
							local222 = Class87.anIntArray177[arg4];
							local240 = this.anIntArray311[local33] * local41 + this.anIntArray312[local33] * local222 + 32767 >> 16;
							this.anIntArray311[local33] = this.anIntArray311[local33] * local222 + 32767 - this.anIntArray312[local33] * local41 >> 16;
							this.anIntArray312[local33] = local240;
						}
						if (arg2 != 0) {
							local41 = Class87.anIntArray173[arg2];
							local222 = Class87.anIntArray177[arg2];
							local240 = this.anIntArray311[local33] * local222 + 32767 - this.anIntArray319[local33] * local41 >> 16;
							this.anIntArray319[local33] = this.anIntArray311[local33] * local41 + this.anIntArray319[local33] * local222 + 32767 >> 16;
							this.anIntArray311[local33] = local240;
						}
						if (arg3 != 0) {
							local41 = Class87.anIntArray173[arg3];
							local222 = Class87.anIntArray177[arg3];
							local240 = this.anIntArray319[local33] * local41 + this.anIntArray312[local33] * local222 + 32767 >> 16;
							this.anIntArray319[local33] = this.anIntArray319[local33] * local222 + 32767 - this.anIntArray312[local33] * local41 >> 16;
							this.anIntArray312[local33] = local240;
						}
						this.anIntArray312[local33] += Static169.anInt3327;
						this.anIntArray311[local33] += Static169.anInt3324;
						this.anIntArray319[local33] += Static169.anInt3325;
					}
				}
			}
		} else if (arg0 == 3) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray17.length) {
					local117 = this.anIntArrayArray17[local14];
					for (local119 = 0; local119 < local117.length; local119++) {
						local33 = local117[local119];
						this.anIntArray312[local33] -= Static169.anInt3327;
						this.anIntArray311[local33] -= Static169.anInt3324;
						this.anIntArray319[local33] -= Static169.anInt3325;
						this.anIntArray312[local33] = this.anIntArray312[local33] * arg2 / 128;
						this.anIntArray311[local33] = this.anIntArray311[local33] * arg3 / 128;
						this.anIntArray319[local33] = this.anIntArray319[local33] * arg4 / 128;
						this.anIntArray312[local33] += Static169.anInt3327;
						this.anIntArray311[local33] += Static169.anInt3324;
						this.anIntArray319[local33] += Static169.anInt3325;
					}
				}
			}
		} else if (arg0 == 5) {
			if (this.anIntArrayArray18 != null && this.aByteArray102 != null) {
				for (local6 = 0; local6 < local2; local6++) {
					local14 = arg1[local6];
					if (local14 < this.anIntArrayArray18.length) {
						local117 = this.anIntArrayArray18[local14];
						for (local119 = 0; local119 < local117.length; local119++) {
							local33 = local117[local119];
							local41 = (this.aByteArray102[local33] & 0xFF) + arg2 * 8;
							if (local41 < 0) {
								local41 = 0;
							} else if (local41 > 255) {
								local41 = 255;
							}
							this.aByteArray102[local33] = (byte) local41;
						}
					}
				}
			}
		} else if (arg0 == 7 && this.anIntArrayArray18 != null) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray18.length) {
					local117 = this.anIntArrayArray18[local14];
					for (local119 = 0; local119 < local117.length; local119++) {
						local33 = local117[local119];
						local41 = this.aShortArray57[local33] & 0xFFFF;
						local222 = local41 >> 10 & 0x3F;
						local240 = local41 >> 7 & 0x7;
						@Pc(652) int local652 = local41 & 0x7F;
						@Pc(658) int local658 = local222 + arg2 & 0x3F;
						local240 += arg3;
						if (local240 < 0) {
							local240 = 0;
						} else if (local240 > 7) {
							local240 = 7;
						}
						local652 += arg4;
						if (local652 < 0) {
							local652 = 0;
						} else if (local652 > 127) {
							local652 = 127;
						}
						this.aShortArray57[local33] = (short) (local658 << 10 | local240 << 7 | local652);
					}
					this.aBoolean289 = true;
				}
			}
		}
	}

	@OriginalMember(owner = "client!mg", name = "c", descriptor = "(I)V")
	@Override
	public void method2909(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class87.anIntArray173[arg0];
		@Pc(7) int local7 = Class87.anIntArray177[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt3320; local9++) {
			@Pc(29) int local29 = this.anIntArray319[local9] * local3 + this.anIntArray312[local9] * local7 >> 16;
			this.anIntArray319[local9] = this.anIntArray319[local9] * local7 - this.anIntArray312[local9] * local3 >> 16;
			this.anIntArray312[local9] = local29;
		}
		this.aBoolean290 = false;
	}

	@OriginalMember(owner = "client!mg", name = "c", descriptor = "()I")
	@Override
	public int method2899() {
		if (!this.aBoolean290) {
			this.method2934();
		}
		return this.aShort30;
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(ZZZ)Lclient!sm;")
	@Override
	public Class11_Sub1 method2895(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		if (!arg0 && Static169.aByteArray104.length < this.anInt3322) {
			Static169.aByteArray104 = new byte[this.anInt3322 + 100];
		}
		if (!arg1 && Static169.aShortArray61.length < this.anInt3322) {
			Static169.anIntArray322 = new int[this.anInt3322 + 100];
			Static169.anIntArray324 = new int[this.anInt3322 + 100];
			Static169.anIntArray323 = new int[this.anInt3322 + 100];
			Static169.aShortArray61 = new short[this.anInt3322 + 100];
		}
		return this.method2931(arg0, arg1, Static169.aClass11_Sub1_Sub2_1, Static169.aByteArray104, Static169.aShortArray61, Static169.anIntArray322, Static169.anIntArray324, Static169.anIntArray323);
	}

	@OriginalMember(owner = "client!mg", name = "h", descriptor = "()I")
	@Override
	public int method2915() {
		if (!this.aBoolean290) {
			this.method2934();
		}
		return this.aShort25;
	}

	@OriginalMember(owner = "client!mg", name = "c", descriptor = "(ZZZ)Lclient!sm;")
	@Override
	public Class11_Sub1 method2910(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		if (!arg0 && Static169.aByteArray107.length < this.anInt3322) {
			Static169.aByteArray107 = new byte[this.anInt3322 + 100];
		}
		if (!arg1 && Static169.aShortArray63.length < this.anInt3322) {
			Static169.anIntArray330 = new int[this.anInt3322 + 100];
			Static169.anIntArray346 = new int[this.anInt3322 + 100];
			Static169.anIntArray338 = new int[this.anInt3322 + 100];
			Static169.aShortArray63 = new short[this.anInt3322 + 100];
		}
		return this.method2931(arg0, arg1, Static169.aClass11_Sub1_Sub2_3, Static169.aByteArray107, Static169.aShortArray63, Static169.anIntArray330, Static169.anIntArray346, Static169.anIntArray338);
	}

	@OriginalMember(owner = "client!mg", name = "q", descriptor = "()V")
	private void method2934() {
		@Pc(1) int local1 = 32767;
		@Pc(3) int local3 = 32767;
		@Pc(5) int local5 = 32767;
		@Pc(7) int local7 = -32768;
		@Pc(9) int local9 = -32768;
		@Pc(11) int local11 = -32768;
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < this.anInt3323; local17++) {
			@Pc(26) int local26 = this.anIntArray312[local17];
			@Pc(31) int local31 = this.anIntArray311[local17];
			@Pc(36) int local36 = this.anIntArray319[local17];
			if (local26 < local1) {
				local1 = local26;
			}
			if (local26 > local7) {
				local7 = local26;
			}
			if (local31 < local3) {
				local3 = local31;
			}
			if (local31 > local9) {
				local9 = local31;
			}
			if (local36 < local5) {
				local5 = local36;
			}
			if (local36 > local11) {
				local11 = local36;
			}
			@Pc(74) int local74 = local26 * local26 + local36 * local36;
			if (local74 > local13) {
				local13 = local74;
			}
			local74 += local31 * local31;
			if (local74 > local15) {
				local15 = local74;
			}
		}
		this.aShort29 = (short) local1;
		this.aShort31 = (short) local7;
		this.aShort27 = (short) local3;
		this.aShort25 = (short) local9;
		this.aShort30 = (short) local5;
		this.aShort28 = (short) local11;
		this.aShort26 = (short) (Math.sqrt((double) local13) + 0.99D);
		this.aShort32 = (short) (Math.sqrt((double) local15) + 0.99D);
		this.aBoolean290 = true;
	}

	@OriginalMember(owner = "client!mg", name = "f", descriptor = "()I")
	@Override
	public int method2908() {
		if (!this.aBoolean290) {
			this.method2934();
		}
		return this.aShort26;
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(IIII)V")
	@Override
	protected void method2904(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) int local3;
		@Pc(11) int local11;
		if (arg0 == 0) {
			local3 = 0;
			Static169.anInt3327 = 0;
			Static169.anInt3324 = 0;
			Static169.anInt3325 = 0;
			for (local11 = 0; local11 < this.anInt3320; local11++) {
				Static169.anInt3327 += this.anIntArray312[local11];
				Static169.anInt3324 += this.anIntArray311[local11];
				Static169.anInt3325 += this.anIntArray319[local11];
				local3++;
			}
			if (local3 > 0) {
				Static169.anInt3327 = Static169.anInt3327 / local3 + arg1;
				Static169.anInt3324 = Static169.anInt3324 / local3 + arg2;
				Static169.anInt3325 = Static169.anInt3325 / local3 + arg3;
			} else {
				Static169.anInt3327 = arg1;
				Static169.anInt3324 = arg2;
				Static169.anInt3325 = arg3;
			}
		} else if (arg0 == 1) {
			for (local3 = 0; local3 < this.anInt3320; local3++) {
				this.anIntArray312[local3] += arg1;
				this.anIntArray311[local3] += arg2;
				this.anIntArray319[local3] += arg3;
			}
		} else {
			@Pc(146) int local146;
			@Pc(164) int local164;
			if (arg0 == 2) {
				for (local3 = 0; local3 < this.anInt3320; local3++) {
					this.anIntArray312[local3] -= Static169.anInt3327;
					this.anIntArray311[local3] -= Static169.anInt3324;
					this.anIntArray319[local3] -= Static169.anInt3325;
					if (arg3 != 0) {
						local11 = Class87.anIntArray173[arg3];
						local146 = Class87.anIntArray177[arg3];
						local164 = this.anIntArray311[local3] * local11 + this.anIntArray312[local3] * local146 + 32767 >> 16;
						this.anIntArray311[local3] = this.anIntArray311[local3] * local146 + 32767 - this.anIntArray312[local3] * local11 >> 16;
						this.anIntArray312[local3] = local164;
					}
					if (arg1 != 0) {
						local11 = Class87.anIntArray173[arg1];
						local146 = Class87.anIntArray177[arg1];
						local164 = this.anIntArray311[local3] * local146 + 32767 - this.anIntArray319[local3] * local11 >> 16;
						this.anIntArray319[local3] = this.anIntArray311[local3] * local11 + this.anIntArray319[local3] * local146 + 32767 >> 16;
						this.anIntArray311[local3] = local164;
					}
					if (arg2 != 0) {
						local11 = Class87.anIntArray173[arg2];
						local146 = Class87.anIntArray177[arg2];
						local164 = this.anIntArray319[local3] * local11 + this.anIntArray312[local3] * local146 + 32767 >> 16;
						this.anIntArray319[local3] = this.anIntArray319[local3] * local146 + 32767 - this.anIntArray312[local3] * local11 >> 16;
						this.anIntArray312[local3] = local164;
					}
					this.anIntArray312[local3] += Static169.anInt3327;
					this.anIntArray311[local3] += Static169.anInt3324;
					this.anIntArray319[local3] += Static169.anInt3325;
				}
			} else if (arg0 == 3) {
				for (local3 = 0; local3 < this.anInt3320; local3++) {
					this.anIntArray312[local3] -= Static169.anInt3327;
					this.anIntArray311[local3] -= Static169.anInt3324;
					this.anIntArray319[local3] -= Static169.anInt3325;
					this.anIntArray312[local3] = this.anIntArray312[local3] * arg1 / 128;
					this.anIntArray311[local3] = this.anIntArray311[local3] * arg2 / 128;
					this.anIntArray319[local3] = this.anIntArray319[local3] * arg3 / 128;
					this.anIntArray312[local3] += Static169.anInt3327;
					this.anIntArray311[local3] += Static169.anInt3324;
					this.anIntArray319[local3] += Static169.anInt3325;
				}
			} else if (arg0 == 5) {
				for (local3 = 0; local3 < this.anInt3322; local3++) {
					local11 = (this.aByteArray102[local3] & 0xFF) + arg1 * 8;
					if (local11 < 0) {
						local11 = 0;
					} else if (local11 > 255) {
						local11 = 255;
					}
					this.aByteArray102[local3] = (byte) local11;
				}
			} else if (arg0 == 7) {
				for (local3 = 0; local3 < this.anInt3322; local3++) {
					local11 = this.aShortArray57[local3] & 0xFFFF;
					local146 = local11 >> 10 & 0x3F;
					local164 = local11 >> 7 & 0x7;
					@Pc(492) int local492 = local11 & 0x7F;
					@Pc(498) int local498 = local146 + arg1 & 0x3F;
					local164 += arg2;
					if (local164 < 0) {
						local164 = 0;
					} else if (local164 > 7) {
						local164 = 7;
					}
					local492 += arg3;
					if (local492 < 0) {
						local492 = 0;
					} else if (local492 > 127) {
						local492 = 127;
					}
					this.aShortArray57[local3] = (short) (local498 << 10 | local164 << 7 | local492);
				}
				this.aBoolean289 = true;
			}
		}
	}

	@OriginalMember(owner = "client!mg", name = "k", descriptor = "()V")
	@Override
	public void method2920() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt3320; local1++) {
			@Pc(10) int local10 = this.anIntArray319[local1];
			this.anIntArray319[local1] = this.anIntArray312[local1];
			this.anIntArray312[local1] = -local10;
		}
		this.aBoolean290 = false;
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(ZZJIILclient!dh;)V")
	private void method2936(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) long arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class22_Sub3 arg5) {
		if (arg4 >= 1600) {
			return;
		}
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		@Pc(11) int local11;
		if (!Static169.aBoolean291) {
			for (local11 = 0; local11 < 1600; local11++) {
				anIntArray350[local11] = 0;
			}
			for (local11 = 0; local11 < 32; local11++) {
				anIntArray342[local11] = 0;
			}
			Static169.anInt3326 = 0;
		}
		@Pc(51) int local51;
		@Pc(56) int local56;
		@Pc(61) int local61;
		@Pc(65) int local65;
		@Pc(69) int local69;
		@Pc(73) int local73;
		@Pc(88) int local88;
		@Pc(92) int local92;
		@Pc(96) int local96;
		@Pc(100) int local100;
		@Pc(104) int local104;
		@Pc(108) int local108;
		@Pc(112) int local112;
		@Pc(120) int local120;
		for (local11 = 0; local11 < this.anInt3322; local11++) {
			if (this.anIntArray321[local11] != -2) {
				local51 = this.anIntArray318[local11];
				local56 = this.anIntArray320[local11];
				local61 = this.anIntArray317[local11];
				local65 = Static169.anIntArray349[local51];
				local69 = Static169.anIntArray349[local56];
				local73 = Static169.anIntArray349[local61];
				if (arg0 && (local65 == -5000 || local69 == -5000 || local73 == -5000)) {
					local88 = Static169.anIntArray329[local51];
					local92 = Static169.anIntArray329[local56];
					local96 = Static169.anIntArray329[local61];
					local100 = Static169.anIntArray344[local51];
					local104 = Static169.anIntArray344[local56];
					local108 = Static169.anIntArray344[local61];
					local112 = Static169.anIntArray340[local51];
					@Pc(116) int local116 = Static169.anIntArray340[local56];
					local120 = Static169.anIntArray340[local61];
					@Pc(124) int local124 = local88 - local92;
					@Pc(128) int local128 = local96 - local92;
					@Pc(132) int local132 = local100 - local104;
					@Pc(136) int local136 = local108 - local104;
					@Pc(140) int local140 = local112 - local116;
					@Pc(144) int local144 = local120 - local116;
					@Pc(152) int local152 = local132 * local144 - local140 * local136;
					@Pc(160) int local160 = local140 * local128 - local124 * local144;
					@Pc(168) int local168 = local124 * local136 - local132 * local128;
					if (local92 * local152 + local104 * local160 + local116 * local168 > 0) {
						Static169.aBooleanArray13[local11] = true;
						if (Static169.aBoolean291) {
							anIntArray328[local5] = (Static169.anIntArray335[local51] + Static169.anIntArray335[local56] + Static169.anIntArray335[local61]) / 3;
							anIntArray347[local5++] = local11;
						} else {
							@Pc(224) int local224 = (Static169.anIntArray335[local51] + Static169.anIntArray335[local56] + Static169.anIntArray335[local61]) / 3 + arg3;
							if (anIntArray350[local224] < 64) {
								anIntArrayArray20[local224][anIntArray350[local224]++] = local11;
							} else {
								@Pc(247) int local247 = anIntArray350[local224];
								if (local247 == 64) {
									if (Static169.anInt3326 == 512) {
										continue;
									}
									anIntArray350[local224] = local247 = Static169.anInt3326++ + 65;
								}
								local247 -= 65;
								anIntArrayArray21[local247][anIntArray342[local247]++] = local11;
							}
						}
					}
				} else {
					if (arg1 && this.method2925(Static42.anInt967 + Static119.anInt2423, Static226.anInt4237 + Static119.anInt2427, Static169.anIntArray333[local51], Static169.anIntArray333[local56], Static169.anIntArray333[local61], local65, local69, local73)) {
						Static273.aLongArray11[Static256.anInt4784++] = arg2;
						arg1 = false;
					}
					if ((local65 - local69) * (Static169.anIntArray333[local61] - Static169.anIntArray333[local56]) - (Static169.anIntArray333[local51] - Static169.anIntArray333[local56]) * (local73 - local69) > 0) {
						Static169.aBooleanArray13[local11] = false;
						if (local65 >= 0 && local69 >= 0 && local73 >= 0 && local65 <= Static119.anInt2425 && local69 <= Static119.anInt2425 && local73 <= Static119.anInt2425) {
							Static169.aBooleanArray12[local11] = false;
						} else {
							Static169.aBooleanArray12[local11] = true;
						}
						if (Static169.aBoolean291) {
							anIntArray328[local5] = (Static169.anIntArray335[local51] + Static169.anIntArray335[local56] + Static169.anIntArray335[local61]) / 3;
							anIntArray347[local5++] = local11;
						} else {
							local88 = (Static169.anIntArray335[local51] + Static169.anIntArray335[local56] + Static169.anIntArray335[local61]) / 3 + arg3;
							if (anIntArray350[local88] < 64) {
								anIntArrayArray20[local88][anIntArray350[local88]++] = local11;
							} else {
								local92 = anIntArray350[local88];
								if (local92 == 64) {
									if (Static169.anInt3326 == 512) {
										continue;
									}
									anIntArray350[local88] = local92 = Static169.anInt3326++ + 65;
								}
								local92 -= 65;
								anIntArrayArray21[local92][anIntArray342[local92]++] = local11;
							}
						}
					}
				}
			}
		}
		if (arg5 != null && !Static169.aBoolean291) {
			for (local11 = 0; local11 < Static169.anIntArray337.length; local11++) {
				local51 = Static169.anIntArray337[local11] + arg3;
				if (local51 >= 0 && local51 < 1600) {
					if (anIntArray350[local51] < 64) {
						anIntArrayArray20[local51][anIntArray350[local51]++] = local11 + 1 << 16;
					} else {
						local56 = anIntArray350[local51];
						if (local56 == 64) {
							if (Static169.anInt3326 == 512) {
								continue;
							}
							anIntArray350[local51] = local56 = Static169.anInt3326++ + 65;
						}
						local56 -= 65;
						anIntArrayArray21[local56][anIntArray342[local56]++] = local11 + 1 << 16;
					}
				}
			}
		}
		if (Static169.aBoolean291) {
			Static233.method3751(anIntArray347, 0, anIntArray328, local5 - 1);
			if (this.aByteArray103 == null) {
				for (local11 = 0; local11 < local5; local11++) {
					this.method2939(anIntArray347[local11]);
				}
				return;
			}
			for (local11 = 0; local11 < 12; local11++) {
				Static169.anIntArray334[local11] = 0;
				Static169.anIntArray345[local11] = 0;
			}
			for (local11 = 0; local11 < local5; local11++) {
				local51 = anIntArray347[local11];
				local56 = anIntArray328[local11];
				@Pc(610) byte local610 = this.aByteArray103[local51];
				local65 = Static169.anIntArray334[local610]++;
				Static169.anIntArrayArray19[local610][local65] = local51;
				if (local610 < 10) {
					Static169.anIntArray345[local610] += local56;
				} else if (local610 == 10) {
					Static169.anIntArray336[local65] = local56;
				} else {
					Static169.anIntArray341[local65] = local56;
				}
			}
		} else {
			@Pc(677) int[] local677;
			if (this.aByteArray103 == null) {
				for (local11 = arg4 - 1; local11 >= 0; local11--) {
					local51 = anIntArray350[local11];
					@Pc(706) Class22_Sub1_Sub1 local706;
					if (local51 > 0) {
						local56 = local51 > 64 ? 64 : local51;
						local677 = anIntArrayArray20[local11];
						for (local65 = 0; local65 < local56; local65++) {
							local69 = local677[local65];
							if (local69 < 65536) {
								this.method2939(local677[local65]);
							} else {
								local73 = (local69 >> 16) - 1;
								local706 = arg5.aClass22_Sub1_Sub1Array2[local73];
								local92 = Static169.anIntArray343[local73] * 400;
								if (local92 == 0) {
									local92 = 1;
								}
								Static77.method1585(Static169.anIntArray332[local73], Static169.anIntArray339[local73], (local706.aClass22_Sub2_1.aClass2_1.anInt87 << 16) / local92, local706.anInt646, local706.anInt646 >> 24 & 0xFF);
							}
						}
					}
					if (local51 > 64) {
						local56 = anIntArray350[local11] - 64 - 1;
						local677 = anIntArrayArray21[local56];
						for (local65 = 0; local65 < anIntArray342[local56]; local65++) {
							local69 = local677[local65];
							if (local69 < 65536) {
								this.method2939(local677[local65]);
							} else {
								local73 = (local69 >> 16) - 1;
								local706 = arg5.aClass22_Sub1_Sub1Array2[local73];
								local92 = Static169.anIntArray343[local73] * 400;
								if (local92 == 0) {
									local92 = 1;
								}
								Static77.method1585(Static169.anIntArray332[local73], Static169.anIntArray339[local73], (local706.aClass22_Sub2_1.aClass2_1.anInt87 << 16) / local92, local706.anInt646, local706.anInt646 >> 24 & 0xFF);
							}
						}
					}
				}
				return;
			}
			for (local11 = 0; local11 < 12; local11++) {
				Static169.anIntArray334[local11] = 0;
				Static169.anIntArray345[local11] = 0;
			}
			for (local11 = arg4 - 1; local11 >= 0; local11--) {
				local51 = anIntArray350[local11];
				@Pc(881) byte local881;
				if (local51 > 0) {
					if (local51 > 64) {
						local56 = 64;
					} else {
						local56 = local51;
					}
					local677 = anIntArrayArray20[local11];
					for (local65 = 0; local65 < local56; local65++) {
						local69 = local677[local65];
						if (local69 < 65536) {
							local881 = this.aByteArray103[local69];
							local88 = Static169.anIntArray334[local881]++;
							Static169.anIntArrayArray19[local881][local88] = local69;
							if (local881 < 10) {
								Static169.anIntArray345[local881] += local11;
							} else if (local881 == 10) {
								Static169.anIntArray336[local88] = local11;
							} else {
								Static169.anIntArray341[local88] = local11;
							}
						} else {
							Static169.anIntArray331[local7++] = (local69 >> 16) - 1;
						}
					}
				}
				if (local51 > 64) {
					local56 = anIntArray350[local11] - 64 - 1;
					local677 = anIntArrayArray21[local56];
					for (local65 = 0; local65 < anIntArray342[local56]; local65++) {
						local69 = local677[local65];
						if (local69 < 65536) {
							local881 = this.aByteArray103[local69];
							local88 = Static169.anIntArray334[local881]++;
							Static169.anIntArrayArray19[local881][local88] = local69;
							if (local881 < 10) {
								Static169.anIntArray345[local881] += local11;
							} else if (local881 == 10) {
								Static169.anIntArray336[local88] = local11;
							} else {
								Static169.anIntArray341[local88] = local11;
							}
						} else {
							Static169.anIntArray331[local7++] = (local69 >> 16) - 1;
						}
					}
				}
			}
		}
		local11 = 0;
		if (Static169.anIntArray334[1] > 0 || Static169.anIntArray334[2] > 0) {
			local11 = (Static169.anIntArray345[1] + Static169.anIntArray345[2]) / (Static169.anIntArray334[1] + Static169.anIntArray334[2]);
		}
		local51 = 0;
		if (Static169.anIntArray334[3] > 0 || Static169.anIntArray334[4] > 0) {
			local51 = (Static169.anIntArray345[3] + Static169.anIntArray345[4]) / (Static169.anIntArray334[3] + Static169.anIntArray334[4]);
		}
		local56 = 0;
		if (Static169.anIntArray334[6] > 0 || Static169.anIntArray334[8] > 0) {
			local56 = (Static169.anIntArray345[6] + Static169.anIntArray345[8]) / (Static169.anIntArray334[6] + Static169.anIntArray334[8]);
		}
		local65 = 0;
		local69 = Static169.anIntArray334[10];
		@Pc(1105) int[] local1105 = Static169.anIntArrayArray19[10];
		@Pc(1107) int[] local1107 = Static169.anIntArray336;
		local92 = 0;
		if (local69 == 0) {
			local65 = 0;
			local69 = Static169.anIntArray334[11];
			local1105 = Static169.anIntArrayArray19[11];
			local1107 = Static169.anIntArray341;
		}
		if (local69 > 0) {
			local61 = local1107[0];
		} else {
			local61 = -1000;
		}
		for (local96 = 0; local96 < 10; local96++) {
			while (local96 == 0 && local61 > local11) {
				this.method2939(local1105[local65++]);
				if (local65 == local69 && local1105 != Static169.anIntArrayArray19[11]) {
					local65 = 0;
					local69 = Static169.anIntArray334[11];
					local1105 = Static169.anIntArrayArray19[11];
					local1107 = Static169.anIntArray341;
				}
				if (local65 < local69) {
					local61 = local1107[local65];
				} else {
					local61 = -1000;
				}
			}
			while (local96 == 3 && local61 > local51) {
				this.method2939(local1105[local65++]);
				if (local65 == local69 && local1105 != Static169.anIntArrayArray19[11]) {
					local65 = 0;
					local69 = Static169.anIntArray334[11];
					local1105 = Static169.anIntArrayArray19[11];
					local1107 = Static169.anIntArray341;
				}
				if (local65 < local69) {
					local61 = local1107[local65];
				} else {
					local61 = -1000;
				}
			}
			while (local96 == 5 && local61 > local56) {
				this.method2939(local1105[local65++]);
				if (local65 == local69 && local1105 != Static169.anIntArrayArray19[11]) {
					local65 = 0;
					local69 = Static169.anIntArray334[11];
					local1105 = Static169.anIntArrayArray19[11];
					local1107 = Static169.anIntArray341;
				}
				if (local65 < local69) {
					local61 = local1107[local65];
				} else {
					local61 = -1000;
				}
			}
			local100 = Static169.anIntArray334[local96];
			@Pc(1275) int[] local1275 = Static169.anIntArrayArray19[local96];
			if (arg5 != null) {
				local108 = Integer.MAX_VALUE;
				if (local100 != 0) {
					local108 = Static169.anIntArray345[local96] / local100;
				}
				for (local112 = Static169.anIntArray331[local92]; Static169.anIntArray337[local112] + arg3 > local108; local112 = Static169.anIntArray331[local92++]) {
					@Pc(1303) Class22_Sub1_Sub1 local1303 = arg5.aClass22_Sub1_Sub1Array2[local112];
					local120 = Static169.anIntArray343[local112] * 400;
					if (local120 == 0) {
						local120 = 1;
					}
					Static77.method1585(Static169.anIntArray332[local112], Static169.anIntArray339[local112], (local1303.aClass22_Sub2_1.aClass2_1.anInt87 << 16) / local120, local1303.anInt646, local1303.anInt646 >> 24 & 0xFF);
					if (local92 >= local7) {
						break;
					}
				}
			}
			for (local108 = 0; local108 < local100; local108++) {
				this.method2939(local1275[local108]);
			}
		}
		while (local61 != -1000) {
			this.method2939(local1105[local65++]);
			if (local65 == local69 && local1105 != Static169.anIntArrayArray19[11]) {
				local65 = 0;
				local1105 = Static169.anIntArrayArray19[11];
				local69 = Static169.anIntArray334[11];
				local1107 = Static169.anIntArray341;
			}
			if (local65 < local69) {
				local61 = local1107[local65];
			} else {
				local61 = -1000;
			}
		}
		if (arg5 == null) {
			return;
		}
		local96 = Static169.anIntArray331[local92];
		while (local92 < local7) {
			@Pc(1413) Class22_Sub1_Sub1 local1413 = arg5.aClass22_Sub1_Sub1Array2[local96];
			local104 = Static169.anIntArray343[local96] * 400;
			if (local104 == 0) {
				local104 = 1;
			}
			Static77.method1585(Static169.anIntArray332[local96], Static169.anIntArray339[local96], (local1413.aClass22_Sub2_1.aClass2_1.anInt87 << 16) / local104, local1413.anInt646, local1413.anInt646 >> 24 & 0xFF);
			local96 = Static169.anIntArray331[local92++];
		}
	}

	@OriginalMember(owner = "client!mg", name = "b", descriptor = "(ZZZ)Lclient!sm;")
	@Override
	public Class11_Sub1 method2907(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		if (!arg0 && Static169.aByteArray106.length < this.anInt3322) {
			Static169.aByteArray106 = new byte[this.anInt3322 + 100];
		}
		if (!arg1 && Static169.aShortArray62.length < this.anInt3322) {
			Static169.anIntArray325 = new int[this.anInt3322 + 100];
			Static169.anIntArray326 = new int[this.anInt3322 + 100];
			Static169.anIntArray327 = new int[this.anInt3322 + 100];
			Static169.aShortArray62 = new short[this.anInt3322 + 100];
		}
		return this.method2931(arg0, arg1, Static169.aClass11_Sub1_Sub2_2, Static169.aByteArray106, Static169.aShortArray62, Static169.anIntArray325, Static169.anIntArray326, Static169.anIntArray327);
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(Lclient!sm;)Lclient!sm;")
	public Class11_Sub1 method2938(@OriginalArg(0) Class11_Sub1 arg0) {
		return new Class11_Sub1_Sub2(new Class11_Sub1_Sub2[] { this, (Class11_Sub1_Sub2) arg0 }, 2);
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(I[IIIIZI[I)V")
	@Override
	protected void method2898(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
		@Pc(2) int local2 = arg1.length;
		@Pc(6) int local6;
		@Pc(14) int local14;
		@Pc(33) int local33;
		@Pc(41) int local41;
		@Pc(21) int local21;
		if (arg0 == 0) {
			local6 = 0;
			Static169.anInt3327 = 0;
			Static169.anInt3324 = 0;
			Static169.anInt3325 = 0;
			for (local14 = 0; local14 < local2; local14++) {
				local21 = arg1[local14];
				if (local21 < this.anIntArrayArray17.length) {
					@Pc(31) int[] local31 = this.anIntArrayArray17[local21];
					for (local33 = 0; local33 < local31.length; local33++) {
						local41 = local31[local33];
						if (this.aShortArray58 == null || (arg6 & this.aShortArray58[local41]) != 0) {
							Static169.anInt3327 += this.anIntArray312[local41];
							Static169.anInt3324 += this.anIntArray311[local41];
							Static169.anInt3325 += this.anIntArray319[local41];
							local6++;
						}
					}
				}
			}
			if (local6 > 0) {
				Static169.anInt3327 = Static169.anInt3327 / local6 + arg2;
				Static169.anInt3324 = Static169.anInt3324 / local6 + arg3;
				Static169.anInt3325 = Static169.anInt3325 / local6 + arg4;
				Static169.aBoolean292 = true;
			} else {
				Static169.anInt3327 = arg2;
				Static169.anInt3324 = arg3;
				Static169.anInt3325 = arg4;
			}
			return;
		}
		@Pc(204) int[] local204;
		@Pc(206) int local206;
		if (arg0 == 1) {
			if (arg7 != null) {
				local6 = arg7[0] * arg2 + arg7[1] * arg3 + arg7[2] * arg4 + 16384 >> 15;
				local14 = arg7[3] * arg2 + arg7[4] * arg3 + arg7[5] * arg4 + 16384 >> 15;
				local21 = arg7[6] * arg2 + arg7[7] * arg3 + arg7[8] * arg4 + 16384 >> 15;
				arg2 = local6;
				arg3 = local14;
				arg4 = local21;
			}
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray17.length) {
					local204 = this.anIntArrayArray17[local14];
					for (local206 = 0; local206 < local204.length; local206++) {
						local33 = local204[local206];
						if (this.aShortArray58 == null || (arg6 & this.aShortArray58[local33]) != 0) {
							this.anIntArray312[local33] += arg2;
							this.anIntArray311[local33] += arg3;
							this.anIntArray319[local33] += arg4;
						}
					}
				}
			}
			return;
		}
		@Pc(307) int local307;
		@Pc(329) int local329;
		@Pc(351) int local351;
		@Pc(392) int local392;
		@Pc(398) int local398;
		@Pc(404) int local404;
		@Pc(410) int local410;
		@Pc(418) int local418;
		@Pc(426) int local426;
		@Pc(579) int local579;
		@Pc(604) int local604;
		@Pc(608) int local608;
		@Pc(616) int local616;
		@Pc(621) int local621;
		@Pc(626) int local626;
		@Pc(631) int local631;
		@Pc(753) int[] local753;
		@Pc(755) int local755;
		@Pc(760) int local760;
		@Pc(765) int local765;
		@Pc(767) int local767;
		@Pc(893) int local893;
		if (arg0 == 2) {
			if (arg7 == null) {
				for (local6 = 0; local6 < local2; local6++) {
					local14 = arg1[local6];
					if (local14 < this.anIntArrayArray17.length) {
						local204 = this.anIntArrayArray17[local14];
						for (local206 = 0; local206 < local204.length; local206++) {
							local33 = local204[local206];
							if (this.aShortArray58 == null || (arg6 & this.aShortArray58[local33]) != 0) {
								this.anIntArray312[local33] -= Static169.anInt3327;
								this.anIntArray311[local33] -= Static169.anInt3324;
								this.anIntArray319[local33] -= Static169.anInt3325;
								if (arg4 != 0) {
									local41 = Class87.anIntArray173[arg4];
									local307 = Class87.anIntArray177[arg4];
									local329 = this.anIntArray311[local33] * local41 + this.anIntArray312[local33] * local307 + 32767 >> 16;
									this.anIntArray311[local33] = this.anIntArray311[local33] * local307 + 32767 - this.anIntArray312[local33] * local41 >> 16;
									this.anIntArray312[local33] = local329;
								}
								if (arg2 != 0) {
									local41 = Class87.anIntArray173[arg2];
									local307 = Class87.anIntArray177[arg2];
									local329 = this.anIntArray311[local33] * local307 + 32767 - this.anIntArray319[local33] * local41 >> 16;
									this.anIntArray319[local33] = this.anIntArray311[local33] * local41 + this.anIntArray319[local33] * local307 + 32767 >> 16;
									this.anIntArray311[local33] = local329;
								}
								if (arg3 != 0) {
									local41 = Class87.anIntArray173[arg3];
									local307 = Class87.anIntArray177[arg3];
									local329 = this.anIntArray319[local33] * local41 + this.anIntArray312[local33] * local307 + 32767 >> 16;
									this.anIntArray319[local33] = this.anIntArray319[local33] * local307 + 32767 - this.anIntArray312[local33] * local41 >> 16;
									this.anIntArray312[local33] = local329;
								}
								this.anIntArray312[local33] += Static169.anInt3327;
								this.anIntArray311[local33] += Static169.anInt3324;
								this.anIntArray319[local33] += Static169.anInt3325;
							}
						}
					}
				}
			} else {
				local6 = arg7[9];
				local14 = arg7[10];
				local21 = arg7[11];
				local206 = arg7[12];
				local33 = arg7[13];
				local41 = arg7[14];
				if (Static169.aBoolean292) {
					local307 = arg7[0] * Static169.anInt3327 + arg7[3] * Static169.anInt3324 + arg7[6] * Static169.anInt3325 + 16384 >> 15;
					local329 = arg7[1] * Static169.anInt3327 + arg7[4] * Static169.anInt3324 + arg7[7] * Static169.anInt3325 + 16384 >> 15;
					local351 = arg7[2] * Static169.anInt3327 + arg7[5] * Static169.anInt3324 + arg7[8] * Static169.anInt3325 + 16384 >> 15;
					local307 += local206;
					local329 += local33;
					local351 += local41;
					Static169.anInt3327 = local307;
					Static169.anInt3324 = local329;
					Static169.anInt3325 = local351;
					Static169.aBoolean292 = false;
				}
				@Pc(374) int[] local374 = new int[9];
				local329 = Class87.anIntArray177[arg2] >> 1;
				local351 = Class87.anIntArray173[arg2] >> 1;
				local392 = Class87.anIntArray177[arg3] >> 1;
				local398 = Class87.anIntArray173[arg3] >> 1;
				local404 = Class87.anIntArray177[arg4] >> 1;
				local410 = Class87.anIntArray173[arg4] >> 1;
				local418 = local351 * local404 + 16384 >> 15;
				local426 = local351 * local410 + 16384 >> 15;
				local374[0] = local392 * local404 + local398 * local426 + 16384 >> 15;
				local374[1] = -local392 * local410 + local398 * local418 + 16384 >> 15;
				local374[2] = local398 * local329 + 16384 >> 15;
				local374[3] = local329 * local410 + 16384 >> 15;
				local374[4] = local329 * local404 + 16384 >> 15;
				local374[5] = -local351;
				local374[6] = -local398 * local404 + local392 * local426 + 16384 >> 15;
				local374[7] = local398 * local410 + local392 * local418 + 16384 >> 15;
				local374[8] = local392 * local329 + 16384 >> 15;
				@Pc(554) int local554 = local374[0] * -Static169.anInt3327 + local374[1] * -Static169.anInt3324 + local374[2] * -Static169.anInt3325 + 16384 >> 15;
				local579 = local374[3] * -Static169.anInt3327 + local374[4] * -Static169.anInt3324 + local374[5] * -Static169.anInt3325 + 16384 >> 15;
				local604 = local374[6] * -Static169.anInt3327 + local374[7] * -Static169.anInt3324 + local374[8] * -Static169.anInt3325 + 16384 >> 15;
				local608 = local554 + Static169.anInt3327;
				@Pc(612) int local612 = local579 + Static169.anInt3324;
				local616 = local604 + Static169.anInt3325;
				@Pc(619) int[] local619 = new int[9];
				for (local621 = 0; local621 < 3; local621++) {
					for (local626 = 0; local626 < 3; local626++) {
						local631 = 0;
						for (@Pc(633) int local633 = 0; local633 < 3; local633++) {
							local631 += local374[local621 * 3 + local633] * arg7[local626 * 3 + local633];
						}
						local619[local621 * 3 + local626] = local631 + 16384 >> 15;
					}
				}
				local621 = local374[0] * local206 + local374[1] * local33 + local374[2] * local41 + 16384 >> 15;
				local626 = local374[3] * local206 + local374[4] * local33 + local374[5] * local41 + 16384 >> 15;
				local631 = local374[6] * local206 + local374[7] * local33 + local374[8] * local41 + 16384 >> 15;
				local621 += local608;
				local626 += local612;
				local631 += local616;
				local753 = new int[9];
				for (local755 = 0; local755 < 3; local755++) {
					for (local760 = 0; local760 < 3; local760++) {
						local765 = 0;
						for (local767 = 0; local767 < 3; local767++) {
							local765 += arg7[local755 * 3 + local767] * local619[local760 + local767 * 3];
						}
						local753[local755 * 3 + local760] = local765 + 16384 >> 15;
					}
				}
				local755 = arg7[0] * local621 + arg7[1] * local626 + arg7[2] * local631 + 16384 >> 15;
				local760 = arg7[3] * local621 + arg7[4] * local626 + arg7[5] * local631 + 16384 >> 15;
				local765 = arg7[6] * local621 + arg7[7] * local626 + arg7[8] * local631 + 16384 >> 15;
				local755 += local6;
				local760 += local14;
				local765 += local21;
				for (local767 = 0; local767 < local2; local767++) {
					local893 = arg1[local767];
					if (local893 < this.anIntArrayArray17.length) {
						@Pc(903) int[] local903 = this.anIntArrayArray17[local893];
						for (@Pc(905) int local905 = 0; local905 < local903.length; local905++) {
							@Pc(913) int local913 = local903[local905];
							if (this.aShortArray58 == null || (arg6 & this.aShortArray58[local913]) != 0) {
								@Pc(955) int local955 = local753[0] * this.anIntArray312[local913] + local753[1] * this.anIntArray311[local913] + local753[2] * this.anIntArray319[local913] + 16384 >> 15;
								@Pc(986) int local986 = local753[3] * this.anIntArray312[local913] + local753[4] * this.anIntArray311[local913] + local753[5] * this.anIntArray319[local913] + 16384 >> 15;
								@Pc(1017) int local1017 = local753[6] * this.anIntArray312[local913] + local753[7] * this.anIntArray311[local913] + local753[8] * this.anIntArray319[local913] + 16384 >> 15;
								@Pc(1021) int local1021 = local955 + local755;
								@Pc(1025) int local1025 = local986 + local760;
								@Pc(1029) int local1029 = local1017 + local765;
								this.anIntArray312[local913] = local1021;
								this.anIntArray311[local913] = local1025;
								this.anIntArray319[local913] = local1029;
							}
						}
					}
				}
			}
		} else if (arg0 == 3) {
			if (arg7 == null) {
				for (local6 = 0; local6 < local2; local6++) {
					local14 = arg1[local6];
					if (local14 < this.anIntArrayArray17.length) {
						local204 = this.anIntArrayArray17[local14];
						for (local206 = 0; local206 < local204.length; local206++) {
							local33 = local204[local206];
							if (this.aShortArray58 == null || (arg6 & this.aShortArray58[local33]) != 0) {
								this.anIntArray312[local33] -= Static169.anInt3327;
								this.anIntArray311[local33] -= Static169.anInt3324;
								this.anIntArray319[local33] -= Static169.anInt3325;
								this.anIntArray312[local33] = this.anIntArray312[local33] * arg2 / 128;
								this.anIntArray311[local33] = this.anIntArray311[local33] * arg3 / 128;
								this.anIntArray319[local33] = this.anIntArray319[local33] * arg4 / 128;
								this.anIntArray312[local33] += Static169.anInt3327;
								this.anIntArray311[local33] += Static169.anInt3324;
								this.anIntArray319[local33] += Static169.anInt3325;
							}
						}
					}
				}
			} else {
				local6 = arg7[9];
				local14 = arg7[10];
				local21 = arg7[11];
				local206 = arg7[12];
				local33 = arg7[13];
				local41 = arg7[14];
				if (Static169.aBoolean292) {
					local307 = arg7[0] * Static169.anInt3327 + arg7[3] * Static169.anInt3324 + arg7[6] * Static169.anInt3325 + 16384 >> 15;
					local329 = arg7[1] * Static169.anInt3327 + arg7[4] * Static169.anInt3324 + arg7[7] * Static169.anInt3325 + 16384 >> 15;
					local351 = arg7[2] * Static169.anInt3327 + arg7[5] * Static169.anInt3324 + arg7[8] * Static169.anInt3325 + 16384 >> 15;
					local307 += local206;
					local329 += local33;
					local351 += local41;
					Static169.anInt3327 = local307;
					Static169.anInt3324 = local329;
					Static169.anInt3325 = local351;
					Static169.aBoolean292 = false;
				}
				local307 = arg2 << 15 >> 7;
				local329 = arg3 << 15 >> 7;
				local351 = arg4 << 15 >> 7;
				local392 = local307 * -Static169.anInt3327 + 16384 >> 15;
				local398 = local329 * -Static169.anInt3324 + 16384 >> 15;
				local404 = local351 * -Static169.anInt3325 + 16384 >> 15;
				local410 = local392 + Static169.anInt3327;
				local418 = local398 + Static169.anInt3324;
				local426 = local404 + Static169.anInt3325;
				@Pc(1481) int[] local1481 = new int[] { local307 * arg7[0] + 16384 >> 15, local307 * arg7[3] + 16384 >> 15, local307 * arg7[6] + 16384 >> 15, local329 * arg7[1] + 16384 >> 15, local329 * arg7[4] + 16384 >> 15, local329 * arg7[7] + 16384 >> 15, local351 * arg7[2] + 16384 >> 15, local351 * arg7[5] + 16384 >> 15, local351 * arg7[8] + 16384 >> 15 };
				local579 = local307 * local206 + 16384 >> 15;
				local604 = local329 * local33 + 16384 >> 15;
				local608 = local351 * local41 + 16384 >> 15;
				@Pc(1617) int local1617 = local579 + local410;
				@Pc(1621) int local1621 = local604 + local418;
				@Pc(1625) int local1625 = local608 + local426;
				@Pc(1628) int[] local1628 = new int[9];
				@Pc(1635) int local1635;
				for (local616 = 0; local616 < 3; local616++) {
					for (local1635 = 0; local1635 < 3; local1635++) {
						local621 = 0;
						for (local626 = 0; local626 < 3; local626++) {
							local621 += arg7[local616 * 3 + local626] * local1481[local1635 + local626 * 3];
						}
						local1628[local616 * 3 + local1635] = local621 + 16384 >> 15;
					}
				}
				local616 = arg7[0] * local1617 + arg7[1] * local1621 + arg7[2] * local1625 + 16384 >> 15;
				local1635 = arg7[3] * local1617 + arg7[4] * local1621 + arg7[5] * local1625 + 16384 >> 15;
				local621 = arg7[6] * local1617 + arg7[7] * local1621 + arg7[8] * local1625 + 16384 >> 15;
				local616 += local6;
				local1635 += local14;
				local621 += local21;
				for (local626 = 0; local626 < local2; local626++) {
					local631 = arg1[local626];
					if (local631 < this.anIntArrayArray17.length) {
						local753 = this.anIntArrayArray17[local631];
						for (local755 = 0; local755 < local753.length; local755++) {
							local760 = local753[local755];
							if (this.aShortArray58 == null || (arg6 & this.aShortArray58[local760]) != 0) {
								local765 = local1628[0] * this.anIntArray312[local760] + local1628[1] * this.anIntArray311[local760] + local1628[2] * this.anIntArray319[local760] + 16384 >> 15;
								local767 = local1628[3] * this.anIntArray312[local760] + local1628[4] * this.anIntArray311[local760] + local1628[5] * this.anIntArray319[local760] + 16384 >> 15;
								local893 = local1628[6] * this.anIntArray312[local760] + local1628[7] * this.anIntArray311[local760] + local1628[8] * this.anIntArray319[local760] + 16384 >> 15;
								@Pc(1896) int local1896 = local765 + local616;
								@Pc(1900) int local1900 = local767 + local1635;
								@Pc(1904) int local1904 = local893 + local621;
								this.anIntArray312[local760] = local1896;
								this.anIntArray311[local760] = local1900;
								this.anIntArray319[local760] = local1904;
							}
						}
					}
				}
			}
		} else if (arg0 == 5) {
			if (this.anIntArrayArray18 != null && this.aByteArray102 != null) {
				for (local6 = 0; local6 < local2; local6++) {
					local14 = arg1[local6];
					if (local14 < this.anIntArrayArray18.length) {
						local204 = this.anIntArrayArray18[local14];
						for (local206 = 0; local206 < local204.length; local206++) {
							local33 = local204[local206];
							if (this.aShortArray60 == null || (arg6 & this.aShortArray60[local33]) != 0) {
								local41 = (this.aByteArray102[local33] & 0xFF) + arg2 * 8;
								if (local41 < 0) {
									local41 = 0;
								} else if (local41 > 255) {
									local41 = 255;
								}
								this.aByteArray102[local33] = (byte) local41;
							}
						}
					}
				}
			}
		} else if (arg0 == 7 && this.anIntArrayArray18 != null) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray18.length) {
					local204 = this.anIntArrayArray18[local14];
					for (local206 = 0; local206 < local204.length; local206++) {
						local33 = local204[local206];
						if (this.aShortArray60 == null || (arg6 & this.aShortArray60[local33]) != 0) {
							local41 = this.aShortArray57[local33] & 0xFFFF;
							local307 = local41 >> 10 & 0x3F;
							local329 = local41 >> 7 & 0x7;
							local351 = local41 & 0x7F;
							@Pc(2209) int local2209 = local307 + arg2 & 0x3F;
							local329 += arg3;
							if (local329 < 0) {
								local329 = 0;
							} else if (local329 > 7) {
								local329 = 7;
							}
							local351 += arg4;
							if (local351 < 0) {
								local351 = 0;
							} else if (local351 > 127) {
								local351 = 127;
							}
							this.aShortArray57[local33] = (short) (local2209 << 10 | local329 << 7 | local351);
						}
					}
					this.aBoolean289 = true;
				}
			}
		}
	}

	@OriginalMember(owner = "client!mg", name = "e", descriptor = "()I")
	@Override
	public int method2906() {
		if (!this.aBoolean290) {
			this.method2934();
		}
		return this.aShort28;
	}

	@OriginalMember(owner = "client!mg", name = "b", descriptor = "(III)V")
	@Override
	public void method2902(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt3320; local1++) {
			this.anIntArray312[local1] = this.anIntArray312[local1] * arg0 / 128;
			this.anIntArray311[local1] = this.anIntArray311[local1] * arg1 / 128;
			this.anIntArray319[local1] = this.anIntArray319[local1] * arg2 / 128;
		}
		this.aBoolean290 = false;
	}

	@OriginalMember(owner = "client!mg", name = "d", descriptor = "()V")
	@Override
	protected void method2903() {
		if (this.aBoolean289) {
			this.method2930();
			this.aBoolean289 = false;
		}
		this.aBoolean290 = false;
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(IIIIIIIJ)V")
	@Override
	public void method2900(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) long arg6) {
		try {
			if (!this.aBoolean290) {
				this.method2934();
			}
			@Pc(6) int local6 = Static119.anInt2423;
			@Pc(8) int local8 = Static119.anInt2427;
			@Pc(12) int local12 = Class87.anIntArray173[0];
			@Pc(16) int local16 = Class87.anIntArray177[0];
			@Pc(20) int local20 = Class87.anIntArray173[arg0];
			@Pc(24) int local24 = Class87.anIntArray177[arg0];
			@Pc(28) int local28 = Class87.anIntArray173[arg1];
			@Pc(32) int local32 = Class87.anIntArray177[arg1];
			@Pc(36) int local36 = Class87.anIntArray173[arg2];
			@Pc(40) int local40 = Class87.anIntArray177[arg2];
			@Pc(50) int local50 = arg4 * local36 + arg5 * local40 >> 16;
			for (@Pc(52) int local52 = 0; local52 < this.anInt3320; local52++) {
				@Pc(61) int local61 = this.anIntArray312[local52];
				@Pc(66) int local66 = this.anIntArray311[local52];
				@Pc(71) int local71 = this.anIntArray319[local52];
				@Pc(83) int local83;
				if (arg1 != 0) {
					local83 = local66 * local28 + local61 * local32 >> 16;
					local66 = local66 * local32 - local61 * local28 >> 16;
					local61 = local83;
				}
				if (arg0 != 0) {
					local83 = local71 * local20 + local61 * local24 >> 16;
					local71 = local71 * local24 - local61 * local20 >> 16;
					local61 = local83;
				}
				local61 += arg3;
				local66 += arg4;
				local71 += arg5;
				local83 = local66 * local40 - local71 * local36 >> 16;
				local71 = local66 * local36 + local71 * local40 >> 16;
				Static169.anIntArray335[local52] = local71 - local50;
				Static169.anIntArray349[local52] = local6 + (local61 << 9) / local71;
				Static169.anIntArray333[local52] = local8 + (local83 << 9) / local71;
				if (this.anInt3321 > 0) {
					Static169.anIntArray329[local52] = local61;
					Static169.anIntArray344[local52] = local83;
					Static169.anIntArray340[local52] = local71;
				}
			}
			this.method2936(false, arg6 >= 0L, arg6, this.aShort32, this.aShort32 << 1, null);
		} catch (@Pc(240) RuntimeException local240) {
		}
	}

	@OriginalMember(owner = "client!mg", name = "g", descriptor = "(I)V")
	private void method2939(@OriginalArg(0) int arg0) {
		if (Static169.aBooleanArray13[arg0]) {
			this.method2932(arg0);
			return;
		}
		@Pc(12) int local12 = this.anIntArray318[arg0];
		@Pc(17) int local17 = this.anIntArray320[arg0];
		@Pc(22) int local22 = this.anIntArray317[arg0];
		Static119.aBoolean209 = Static169.aBooleanArray12[arg0];
		if (this.aByteArray102 == null) {
			Static119.anInt2426 = 0;
		} else {
			Static119.anInt2426 = this.aByteArray102[arg0] & 0xFF;
		}
		if (this.aShortArray59 != null && this.aShortArray59[arg0] != -1) {
			@Pc(141) int local141;
			@Pc(146) int local146;
			@Pc(151) int local151;
			if (this.aByteArray105 == null || this.aByteArray105[arg0] == -1) {
				local141 = local12;
				local146 = local17;
				local151 = local22;
			} else {
				@Pc(136) int local136 = this.aByteArray105[arg0] & 0xFF;
				local141 = this.anIntArray315[local136];
				local146 = this.anIntArray316[local136];
				local151 = this.anIntArray314[local136];
			}
			if (this.anIntArray321[arg0] == -1) {
				Static119.method2165(Static169.anIntArray333[local12], Static169.anIntArray333[local17], Static169.anIntArray333[local22], Static169.anIntArray349[local12], Static169.anIntArray349[local17], Static169.anIntArray349[local22], this.anIntArray310[arg0], this.anIntArray310[arg0], this.anIntArray310[arg0], Static169.anIntArray329[local141], Static169.anIntArray329[local146], Static169.anIntArray329[local151], Static169.anIntArray344[local141], Static169.anIntArray344[local146], Static169.anIntArray344[local151], Static169.anIntArray340[local141], Static169.anIntArray340[local146], Static169.anIntArray340[local151], this.aShortArray59[arg0]);
			} else {
				Static119.method2165(Static169.anIntArray333[local12], Static169.anIntArray333[local17], Static169.anIntArray333[local22], Static169.anIntArray349[local12], Static169.anIntArray349[local17], Static169.anIntArray349[local22], this.anIntArray310[arg0], this.anIntArray313[arg0], this.anIntArray321[arg0], Static169.anIntArray329[local141], Static169.anIntArray329[local146], Static169.anIntArray329[local151], Static169.anIntArray344[local141], Static169.anIntArray344[local146], Static169.anIntArray344[local151], Static169.anIntArray340[local141], Static169.anIntArray340[local146], Static169.anIntArray340[local151], this.aShortArray59[arg0]);
			}
		} else if (this.anIntArray321[arg0] == -1) {
			Static119.method2152(Static169.anIntArray333[local12], Static169.anIntArray333[local17], Static169.anIntArray333[local22], Static169.anIntArray349[local12], Static169.anIntArray349[local17], Static169.anIntArray349[local22], Static119.anIntArray174[this.anIntArray310[arg0] & 0xFFFF]);
		} else {
			Static119.method2161(Static169.anIntArray333[local12], Static169.anIntArray333[local17], Static169.anIntArray333[local22], Static169.anIntArray349[local12], Static169.anIntArray349[local17], Static169.anIntArray349[local22], this.anIntArray310[arg0] & 0xFFFF, this.anIntArray313[arg0] & 0xFFFF, this.anIntArray321[arg0] & 0xFFFF);
		}
	}

	@OriginalMember(owner = "client!mg", name = "j", descriptor = "()Z")
	@Override
	protected boolean method2919() {
		if (this.anIntArrayArray17 == null) {
			return false;
		} else {
			Static169.anInt3327 = 0;
			Static169.anInt3324 = 0;
			Static169.anInt3325 = 0;
			return true;
		}
	}
}
