import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eb")
public final class Class15_Sub2_Sub2 extends Class15_Sub2 {

	@OriginalMember(owner = "client!eb", name = "Vb", descriptor = "[I")
	public static int[] anIntArray108;

	@OriginalMember(owner = "client!eb", name = "Pb", descriptor = "[I")
	public static int[] anIntArray104;

	@OriginalMember(owner = "client!eb", name = "mb", descriptor = "[I")
	public static int[] anIntArray85;

	@OriginalMember(owner = "client!eb", name = "pb", descriptor = "[[I")
	public static int[][] anIntArrayArray11;

	@OriginalMember(owner = "client!eb", name = "vb", descriptor = "[I")
	public static int[] anIntArray90;

	@OriginalMember(owner = "client!eb", name = "Tb", descriptor = "[[I")
	public static int[][] anIntArrayArray13;

	@OriginalMember(owner = "client!eb", name = "k", descriptor = "[I")
	private int[] anIntArray66;

	@OriginalMember(owner = "client!eb", name = "m", descriptor = "S")
	private short aShort6;

	@OriginalMember(owner = "client!eb", name = "n", descriptor = "[I")
	private int[] anIntArray67;

	@OriginalMember(owner = "client!eb", name = "o", descriptor = "S")
	private short aShort7;

	@OriginalMember(owner = "client!eb", name = "p", descriptor = "[B")
	private byte[] aByteArray8;

	@OriginalMember(owner = "client!eb", name = "q", descriptor = "[S")
	private short[] aShortArray20;

	@OriginalMember(owner = "client!eb", name = "r", descriptor = "[I")
	private int[] anIntArray68;

	@OriginalMember(owner = "client!eb", name = "s", descriptor = "[[I")
	private int[][] anIntArrayArray9;

	@OriginalMember(owner = "client!eb", name = "u", descriptor = "[I")
	public int[] anIntArray69;

	@OriginalMember(owner = "client!eb", name = "v", descriptor = "[I")
	public int[] anIntArray70;

	@OriginalMember(owner = "client!eb", name = "w", descriptor = "[B")
	private byte[] aByteArray9;

	@OriginalMember(owner = "client!eb", name = "x", descriptor = "S")
	private short aShort8;

	@OriginalMember(owner = "client!eb", name = "y", descriptor = "[S")
	private short[] aShortArray21;

	@OriginalMember(owner = "client!eb", name = "z", descriptor = "[I")
	public int[] anIntArray71;

	@OriginalMember(owner = "client!eb", name = "A", descriptor = "S")
	private short aShort9;

	@OriginalMember(owner = "client!eb", name = "C", descriptor = "[Lclient!ud;")
	public Class176[] aClass176Array2;

	@OriginalMember(owner = "client!eb", name = "D", descriptor = "[S")
	private short[] aShortArray22;

	@OriginalMember(owner = "client!eb", name = "F", descriptor = "S")
	private short aShort10;

	@OriginalMember(owner = "client!eb", name = "G", descriptor = "[Lclient!uj;")
	public Class180[] aClass180Array2;

	@OriginalMember(owner = "client!eb", name = "H", descriptor = "[I")
	private int[] anIntArray72;

	@OriginalMember(owner = "client!eb", name = "I", descriptor = "[S")
	private short[] aShortArray23;

	@OriginalMember(owner = "client!eb", name = "L", descriptor = "[[I")
	private int[][] anIntArrayArray10;

	@OriginalMember(owner = "client!eb", name = "M", descriptor = "[I")
	private int[] anIntArray73;

	@OriginalMember(owner = "client!eb", name = "Q", descriptor = "[I")
	private int[] anIntArray74;

	@OriginalMember(owner = "client!eb", name = "R", descriptor = "[I")
	private int[] anIntArray75;

	@OriginalMember(owner = "client!eb", name = "S", descriptor = "S")
	private short aShort11;

	@OriginalMember(owner = "client!eb", name = "U", descriptor = "[I")
	private int[] anIntArray76;

	@OriginalMember(owner = "client!eb", name = "V", descriptor = "S")
	private short aShort12;

	@OriginalMember(owner = "client!eb", name = "W", descriptor = "[B")
	private byte[] aByteArray10;

	@OriginalMember(owner = "client!eb", name = "X", descriptor = "[I")
	private int[] anIntArray77;

	@OriginalMember(owner = "client!eb", name = "Y", descriptor = "S")
	private short aShort13;

	@OriginalMember(owner = "client!eb", name = "l", descriptor = "Z")
	private boolean aBoolean62 = false;

	@OriginalMember(owner = "client!eb", name = "t", descriptor = "I")
	private int anInt1113 = 0;

	@OriginalMember(owner = "client!eb", name = "B", descriptor = "I")
	public int anInt1114 = 0;

	@OriginalMember(owner = "client!eb", name = "K", descriptor = "I")
	private int anInt1115 = 0;

	@OriginalMember(owner = "client!eb", name = "O", descriptor = "Z")
	public boolean aBoolean63 = false;

	@OriginalMember(owner = "client!eb", name = "T", descriptor = "B")
	private byte aByte5 = 0;

	@OriginalMember(owner = "client!eb", name = "P", descriptor = "I")
	private int anInt1116 = 0;

	static {
		if (Static58.aBoolean64) {
			anIntArray108 = new int[4096];
			anIntArray104 = new int[4096];
		} else {
			anIntArray85 = new int[1600];
			anIntArrayArray11 = new int[1600][64];
			anIntArray90 = new int[32];
			anIntArrayArray13 = new int[32][512];
		}
	}

	@OriginalMember(owner = "client!eb", name = "<init>", descriptor = "()V")
	public Class15_Sub2_Sub2() {
	}

	@OriginalMember(owner = "client!eb", name = "<init>", descriptor = "(Lclient!rd;IIIII)V")
	public Class15_Sub2_Sub2(@OriginalArg(0) Class15_Sub6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg0.method3762();
		arg0.method3765();
		this.anInt1114 = arg0.anInt4386;
		this.anInt1113 = arg0.anInt4384;
		this.anIntArray70 = arg0.anIntArray383;
		this.anIntArray69 = arg0.anIntArray382;
		this.anIntArray71 = arg0.anIntArray381;
		this.anInt1116 = arg0.anInt4382;
		this.anIntArray75 = arg0.anIntArray377;
		this.anIntArray72 = arg0.anIntArray380;
		this.anIntArray76 = arg0.anIntArray375;
		this.aByteArray8 = arg0.aByteArray58;
		this.aByteArray9 = arg0.aByteArray65;
		this.aByte5 = arg0.aByte26;
		this.aShortArray20 = arg0.aShortArray78;
		this.anIntArrayArray10 = arg0.anIntArrayArray35;
		this.anIntArrayArray9 = arg0.anIntArrayArray34;
		this.aShortArray21 = arg0.aShortArray79;
		this.aClass180Array2 = arg0.aClass180Array3;
		this.aClass176Array2 = arg0.aClass176Array3;
		this.aShortArray23 = arg0.aShortArray80;
		@Pc(117) int local117 = (int) Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5));
		@Pc(123) int local123 = arg2 * local117 >> 8;
		this.anIntArray73 = new int[this.anInt1116];
		this.anIntArray66 = new int[this.anInt1116];
		this.anIntArray68 = new int[this.anInt1116];
		@Pc(148) int local148;
		if (arg0.aShortArray85 == null) {
			this.aShortArray22 = null;
		} else {
			this.aShortArray22 = new short[this.anInt1116];
			for (local148 = 0; local148 < this.anInt1116; local148++) {
				@Pc(157) short local157 = arg0.aShortArray85[local148];
				if (local157 != -1 && Static215.anInterface5_1.method779(local157)) {
					this.aShortArray22[local148] = local157;
				} else {
					this.aShortArray22[local148] = -1;
				}
			}
		}
		if (arg0.anInt4385 > 0 && arg0.aByteArray64 != null) {
			@Pc(192) int[] local192 = new int[arg0.anInt4385];
			@Pc(194) int local194;
			for (local194 = 0; local194 < this.anInt1116; local194++) {
				if (arg0.aByteArray64[local194] != -1) {
					local192[arg0.aByteArray64[local194] & 0xFF]++;
				}
			}
			this.anInt1115 = 0;
			for (local194 = 0; local194 < arg0.anInt4385; local194++) {
				if (local192[local194] > 0 && arg0.aByteArray56[local194] == 0) {
					this.anInt1115++;
				}
			}
			this.anIntArray67 = new int[this.anInt1115];
			this.anIntArray77 = new int[this.anInt1115];
			this.anIntArray74 = new int[this.anInt1115];
			local194 = 0;
			@Pc(263) int local263;
			for (local263 = 0; local263 < arg0.anInt4385; local263++) {
				if (local192[local263] > 0 && arg0.aByteArray56[local263] == 0) {
					this.anIntArray67[local194] = arg0.aShortArray81[local263] & 0xFFFF;
					this.anIntArray77[local194] = arg0.aShortArray82[local263] & 0xFFFF;
					this.anIntArray74[local194] = arg0.aShortArray83[local263] & 0xFFFF;
					local192[local263] = local194++;
				} else {
					local192[local263] = -1;
				}
			}
			this.aByteArray10 = new byte[this.anInt1116];
			for (local263 = 0; local263 < this.anInt1116; local263++) {
				if (arg0.aByteArray64[local263] == -1) {
					this.aByteArray10[local263] = -1;
				} else {
					this.aByteArray10[local263] = (byte) local192[arg0.aByteArray64[local263] & 0xFF];
					if (this.aByteArray10[local263] == -1 && this.aShortArray22 != null) {
						this.aShortArray22[local263] = -1;
					}
				}
			}
		}
		for (local148 = 0; local148 < this.anInt1116; local148++) {
			@Pc(381) byte local381;
			if (arg0.aByteArray61 == null) {
				local381 = 0;
			} else {
				local381 = arg0.aByteArray61[local148];
			}
			@Pc(392) byte local392;
			if (arg0.aByteArray65 == null) {
				local392 = 0;
			} else {
				local392 = arg0.aByteArray65[local148];
			}
			@Pc(403) short local403;
			if (this.aShortArray22 == null) {
				local403 = -1;
			} else {
				local403 = this.aShortArray22[local148];
			}
			if (local392 == -2) {
				local381 = 3;
			}
			if (local392 == -1) {
				local381 = 2;
			}
			@Pc(450) Class122 local450;
			@Pc(483) int local483;
			@Pc(629) Class163 local629;
			if (local403 == -1) {
				if (local381 == 0) {
					@Pc(431) int local431 = arg0.aShortArray78[local148] & 0xFFFF;
					if (arg0.aClass122Array2 == null || arg0.aClass122Array2[this.anIntArray75[local148]] == null) {
						local450 = arg0.aClass122Array1[this.anIntArray75[local148]];
					} else {
						local450 = arg0.aClass122Array2[this.anIntArray75[local148]];
					}
					local483 = arg1 + (arg3 * local450.anInt3672 + arg4 * local450.anInt3676 + arg5 * local450.anInt3670) / (local123 * local450.anInt3674) << 17;
					this.anIntArray73[local148] = local483 | Static58.method1051(local431, local483 >> 17);
					if (arg0.aClass122Array2 == null || arg0.aClass122Array2[this.anIntArray72[local148]] == null) {
						local450 = arg0.aClass122Array1[this.anIntArray72[local148]];
					} else {
						local450 = arg0.aClass122Array2[this.anIntArray72[local148]];
					}
					local483 = arg1 + (arg3 * local450.anInt3672 + arg4 * local450.anInt3676 + arg5 * local450.anInt3670) / (local123 * local450.anInt3674) << 17;
					this.anIntArray66[local148] = local483 | Static58.method1051(local431, local483 >> 17);
					if (arg0.aClass122Array2 == null || arg0.aClass122Array2[this.anIntArray76[local148]] == null) {
						local450 = arg0.aClass122Array1[this.anIntArray76[local148]];
					} else {
						local450 = arg0.aClass122Array2[this.anIntArray76[local148]];
					}
					local483 = arg1 + (arg3 * local450.anInt3672 + arg4 * local450.anInt3676 + arg5 * local450.anInt3670) / (local123 * local450.anInt3674) << 17;
					this.anIntArray68[local148] = local483 | Static58.method1051(local431, local483 >> 17);
				} else if (local381 == 1) {
					local629 = arg0.aClass163Array1[local148];
					local483 = arg1 + (arg3 * local629.anInt4718 + arg4 * local629.anInt4716 + arg5 * local629.anInt4719) / (local123 + local123 / 2) << 17;
					this.anIntArray73[local148] = local483 | Static58.method1051(arg0.aShortArray78[local148] & 0xFFFF, local483 >> 17);
					this.anIntArray68[local148] = -1;
				} else if (local381 == 3) {
					this.anIntArray73[local148] = 128;
					this.anIntArray68[local148] = -1;
				} else {
					this.anIntArray68[local148] = -2;
				}
			} else if (local381 == 0) {
				if (arg0.aClass122Array2 == null || arg0.aClass122Array2[this.anIntArray75[local148]] == null) {
					local450 = arg0.aClass122Array1[this.anIntArray75[local148]];
				} else {
					local450 = arg0.aClass122Array2[this.anIntArray75[local148]];
				}
				local483 = arg1 + (arg3 * local450.anInt3672 + arg4 * local450.anInt3676 + arg5 * local450.anInt3670) / (local123 * local450.anInt3674);
				this.anIntArray73[local148] = Static58.method1058(local483);
				if (arg0.aClass122Array2 == null || arg0.aClass122Array2[this.anIntArray72[local148]] == null) {
					local450 = arg0.aClass122Array1[this.anIntArray72[local148]];
				} else {
					local450 = arg0.aClass122Array2[this.anIntArray72[local148]];
				}
				local483 = arg1 + (arg3 * local450.anInt3672 + arg4 * local450.anInt3676 + arg5 * local450.anInt3670) / (local123 * local450.anInt3674);
				this.anIntArray66[local148] = Static58.method1058(local483);
				if (arg0.aClass122Array2 == null || arg0.aClass122Array2[this.anIntArray76[local148]] == null) {
					local450 = arg0.aClass122Array1[this.anIntArray76[local148]];
				} else {
					local450 = arg0.aClass122Array2[this.anIntArray76[local148]];
				}
				local483 = arg1 + (arg3 * local450.anInt3672 + arg4 * local450.anInt3676 + arg5 * local450.anInt3670) / (local123 * local450.anInt3674);
				this.anIntArray68[local148] = Static58.method1058(local483);
			} else if (local381 == 1) {
				local629 = arg0.aClass163Array1[local148];
				local483 = arg1 + (arg3 * local629.anInt4718 + arg4 * local629.anInt4716 + arg5 * local629.anInt4719) / (local123 + local123 / 2);
				this.anIntArray73[local148] = Static58.method1058(local483);
				this.anIntArray68[local148] = -1;
			} else {
				this.anIntArray68[local148] = -2;
			}
		}
	}

	@OriginalMember(owner = "client!eb", name = "<init>", descriptor = "([Lclient!eb;I)V")
	private Class15_Sub2_Sub2(@OriginalArg(0) Class15_Sub2_Sub2[] arg0, @OriginalArg(1) int arg1) {
		@Pc(24) boolean local24 = false;
		@Pc(26) boolean local26 = false;
		@Pc(28) boolean local28 = false;
		@Pc(30) boolean local30 = false;
		this.anInt1114 = 0;
		this.anInt1116 = 0;
		this.anInt1115 = 0;
		@Pc(41) int local41 = 0;
		@Pc(43) int local43 = 0;
		this.aByte5 = -1;
		@Pc(48) int local48;
		@Pc(55) Class15_Sub2_Sub2 local55;
		for (local48 = 0; local48 < arg1; local48++) {
			local55 = arg0[local48];
			if (local55 != null) {
				this.anInt1114 += local55.anInt1114;
				this.anInt1116 += local55.anInt1116;
				this.anInt1115 += local55.anInt1115;
				if (local55.aByteArray8 == null) {
					if (this.aByte5 == -1) {
						this.aByte5 = local55.aByte5;
					}
					if (this.aByte5 != local55.aByte5) {
						local24 = true;
					}
				} else {
					local24 = true;
				}
				local26 |= local55.aByteArray9 != null;
				local28 |= local55.aShortArray22 != null;
				local30 |= local55.aByteArray10 != null;
				if (local55.aClass180Array2 != null) {
					local41 += local55.aClass180Array2.length;
				}
				if (local55.aClass176Array2 != null) {
					local43 += local55.aClass176Array2.length;
				}
			}
		}
		this.anIntArray70 = new int[this.anInt1114];
		this.anIntArray69 = new int[this.anInt1114];
		this.anIntArray71 = new int[this.anInt1114];
		this.anIntArray75 = new int[this.anInt1116];
		this.anIntArray72 = new int[this.anInt1116];
		this.anIntArray76 = new int[this.anInt1116];
		this.anIntArray73 = new int[this.anInt1116];
		this.anIntArray66 = new int[this.anInt1116];
		this.anIntArray68 = new int[this.anInt1116];
		if (local24) {
			this.aByteArray8 = new byte[this.anInt1116];
		}
		if (local26) {
			this.aByteArray9 = new byte[this.anInt1116];
		}
		if (local28) {
			this.aShortArray22 = new short[this.anInt1116];
		}
		if (local30) {
			this.aByteArray10 = new byte[this.anInt1116];
		}
		if (this.anInt1115 > 0) {
			this.anIntArray67 = new int[this.anInt1115];
			this.anIntArray77 = new int[this.anInt1115];
			this.anIntArray74 = new int[this.anInt1115];
		}
		if (local41 > 0) {
			this.aClass180Array2 = new Class180[local41];
		}
		if (local43 > 0) {
			this.aClass176Array2 = new Class176[local43];
		}
		this.aShortArray20 = new short[this.anInt1116];
		this.anInt1114 = 0;
		this.anInt1116 = 0;
		this.anInt1115 = 0;
		local43 = 0;
		local41 = 0;
		for (local48 = 0; local48 < arg1; local48++) {
			local55 = arg0[local48];
			if (local55 != null) {
				@Pc(280) int local280;
				for (local280 = 0; local280 < local55.anInt1116; local280++) {
					this.anIntArray75[this.anInt1116] = local55.anIntArray75[local280] + this.anInt1114;
					this.anIntArray72[this.anInt1116] = local55.anIntArray72[local280] + this.anInt1114;
					this.anIntArray76[this.anInt1116] = local55.anIntArray76[local280] + this.anInt1114;
					this.anIntArray73[this.anInt1116] = local55.anIntArray73[local280];
					this.anIntArray66[this.anInt1116] = local55.anIntArray66[local280];
					this.anIntArray68[this.anInt1116] = local55.anIntArray68[local280];
					this.aShortArray20[this.anInt1116] = local55.aShortArray20[local280];
					if (local24) {
						if (local55.aByteArray8 == null) {
							this.aByteArray8[this.anInt1116] = local55.aByte5;
						} else {
							this.aByteArray8[this.anInt1116] = local55.aByteArray8[local280];
						}
					}
					if (local26 && local55.aByteArray9 != null) {
						this.aByteArray9[this.anInt1116] = local55.aByteArray9[local280];
					}
					if (local28) {
						if (local55.aShortArray22 == null) {
							this.aShortArray22[this.anInt1116] = -1;
						} else {
							this.aShortArray22[this.anInt1116] = local55.aShortArray22[local280];
						}
					}
					if (local30) {
						this.aByteArray10[this.anInt1116] = (byte) (local55.aByteArray10 == null || local55.aByteArray10[local280] == -1 ? -1 : local55.aByteArray10[local280] + this.anInt1115);
					}
					this.anInt1116++;
				}
				if (local55.aClass180Array2 != null) {
					for (local280 = 0; local280 < local55.aClass180Array2.length; local280++) {
						this.aClass180Array2[local41] = new Class180(local55.aClass180Array2[local280].aClass165_1, local55.aClass180Array2[local280].anInt5137 + this.anInt1114, local55.aClass180Array2[local280].anInt5139 + this.anInt1114, local55.aClass180Array2[local280].anInt5135 + this.anInt1114);
						local41++;
					}
				}
				if (local55.aClass176Array2 != null) {
					for (local280 = 0; local280 < local55.aClass176Array2.length; local280++) {
						this.aClass176Array2[local43] = new Class176(local55.aClass176Array2[local280].aClass5_1, local55.aClass176Array2[local280].anInt5087 + this.anInt1114);
						local43++;
					}
				}
				for (local280 = 0; local280 < local55.anInt1115; local280++) {
					if (local55.anIntArray67[local280] < local55.anInt1113) {
						this.anIntArray67[this.anInt1115] = local55.anIntArray67[local280] + this.anInt1114;
					}
					if (local55.anIntArray77[local280] < local55.anInt1113) {
						this.anIntArray77[this.anInt1115] = local55.anIntArray77[local280] + this.anInt1114;
					}
					if (local55.anIntArray74[local280] < local55.anInt1113) {
						this.anIntArray74[this.anInt1115] = local55.anIntArray74[local280] + this.anInt1114;
					}
					this.anInt1115++;
				}
				for (local280 = 0; local280 < local55.anInt1113; local280++) {
					this.anIntArray70[this.anInt1114] = local55.anIntArray70[local280];
					this.anIntArray69[this.anInt1114] = local55.anIntArray69[local280];
					this.anIntArray71[this.anInt1114] = local55.anIntArray71[local280];
					this.anInt1114++;
				}
			}
		}
		local48 = 0;
		this.anInt1113 = this.anInt1114;
		for (@Pc(651) int local651 = 0; local651 < arg1; local651++) {
			@Pc(658) Class15_Sub2_Sub2 local658 = arg0[local651];
			if (local658 != null) {
				@Pc(662) int local662;
				for (local662 = 0; local662 < local658.anInt1115; local662++) {
					if (local658.anIntArray67[local662] >= local658.anInt1113) {
						this.anIntArray67[local48] = local658.anIntArray67[local662] + this.anInt1114 - local658.anInt1113;
					}
					if (local658.anIntArray77[local662] >= local658.anInt1113) {
						this.anIntArray77[local48] = local658.anIntArray77[local662] + this.anInt1114 - local658.anInt1113;
					}
					if (local658.anIntArray74[local662] >= local658.anInt1113) {
						this.anIntArray74[local48] = local658.anIntArray74[local662] + this.anInt1114 - local658.anInt1113;
					}
					local48++;
				}
				for (local662 = local658.anInt1113; local662 < local658.anInt1114; local662++) {
					this.anIntArray70[this.anInt1114] = local658.anIntArray70[local662];
					this.anIntArray69[this.anInt1114] = local658.anIntArray69[local662];
					this.anIntArray71[this.anInt1114] = local658.anIntArray71[local662];
					this.anInt1114++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(ZZZ)Lclient!bf;")
	@Override
	public Class15_Sub2 method1020(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		if (!arg0 && Static58.aByteArray13.length < this.anInt1116) {
			Static58.aByteArray13 = new byte[this.anInt1116 + 100];
		}
		if (!arg1 && Static58.aShortArray26.length < this.anInt1116) {
			Static58.anIntArray87 = new int[this.anInt1116 + 100];
			Static58.anIntArray100 = new int[this.anInt1116 + 100];
			Static58.anIntArray105 = new int[this.anInt1116 + 100];
			Static58.aShortArray26 = new short[this.anInt1116 + 100];
		}
		return this.method1055(arg0, arg1, Static58.aClass15_Sub2_Sub2_3, Static58.aByteArray13, Static58.aShortArray26, Static58.anIntArray87, Static58.anIntArray100, Static58.anIntArray105);
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIII)V")
	@Override
	protected void method1046(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) int local3;
		@Pc(11) int local11;
		if (arg0 == 0) {
			local3 = 0;
			Static58.anInt1118 = 0;
			Static58.anInt1120 = 0;
			Static58.anInt1117 = 0;
			for (local11 = 0; local11 < this.anInt1114; local11++) {
				Static58.anInt1118 += this.anIntArray70[local11];
				Static58.anInt1120 += this.anIntArray69[local11];
				Static58.anInt1117 += this.anIntArray71[local11];
				local3++;
			}
			if (local3 > 0) {
				Static58.anInt1118 = Static58.anInt1118 / local3 + arg1;
				Static58.anInt1120 = Static58.anInt1120 / local3 + arg2;
				Static58.anInt1117 = Static58.anInt1117 / local3 + arg3;
			} else {
				Static58.anInt1118 = arg1;
				Static58.anInt1120 = arg2;
				Static58.anInt1117 = arg3;
			}
		} else if (arg0 == 1) {
			for (local3 = 0; local3 < this.anInt1114; local3++) {
				this.anIntArray70[local3] += arg1;
				this.anIntArray69[local3] += arg2;
				this.anIntArray71[local3] += arg3;
			}
		} else {
			@Pc(146) int local146;
			@Pc(164) int local164;
			if (arg0 == 2) {
				for (local3 = 0; local3 < this.anInt1114; local3++) {
					this.anIntArray70[local3] -= Static58.anInt1118;
					this.anIntArray69[local3] -= Static58.anInt1120;
					this.anIntArray71[local3] -= Static58.anInt1117;
					if (arg3 != 0) {
						local11 = Class135.anIntArray335[arg3];
						local146 = Class135.anIntArray338[arg3];
						local164 = this.anIntArray69[local3] * local11 + this.anIntArray70[local3] * local146 + 32767 >> 16;
						this.anIntArray69[local3] = this.anIntArray69[local3] * local146 + 32767 - this.anIntArray70[local3] * local11 >> 16;
						this.anIntArray70[local3] = local164;
					}
					if (arg1 != 0) {
						local11 = Class135.anIntArray335[arg1];
						local146 = Class135.anIntArray338[arg1];
						local164 = this.anIntArray69[local3] * local146 + 32767 - this.anIntArray71[local3] * local11 >> 16;
						this.anIntArray71[local3] = this.anIntArray69[local3] * local11 + this.anIntArray71[local3] * local146 + 32767 >> 16;
						this.anIntArray69[local3] = local164;
					}
					if (arg2 != 0) {
						local11 = Class135.anIntArray335[arg2];
						local146 = Class135.anIntArray338[arg2];
						local164 = this.anIntArray71[local3] * local11 + this.anIntArray70[local3] * local146 + 32767 >> 16;
						this.anIntArray71[local3] = this.anIntArray71[local3] * local146 + 32767 - this.anIntArray70[local3] * local11 >> 16;
						this.anIntArray70[local3] = local164;
					}
					this.anIntArray70[local3] += Static58.anInt1118;
					this.anIntArray69[local3] += Static58.anInt1120;
					this.anIntArray71[local3] += Static58.anInt1117;
				}
			} else if (arg0 == 3) {
				for (local3 = 0; local3 < this.anInt1114; local3++) {
					this.anIntArray70[local3] -= Static58.anInt1118;
					this.anIntArray69[local3] -= Static58.anInt1120;
					this.anIntArray71[local3] -= Static58.anInt1117;
					this.anIntArray70[local3] = this.anIntArray70[local3] * arg1 / 128;
					this.anIntArray69[local3] = this.anIntArray69[local3] * arg2 / 128;
					this.anIntArray71[local3] = this.anIntArray71[local3] * arg3 / 128;
					this.anIntArray70[local3] += Static58.anInt1118;
					this.anIntArray69[local3] += Static58.anInt1120;
					this.anIntArray71[local3] += Static58.anInt1117;
				}
			} else if (arg0 == 5) {
				for (local3 = 0; local3 < this.anInt1116; local3++) {
					local11 = (this.aByteArray9[local3] & 0xFF) + arg1 * 8;
					if (local11 < 0) {
						local11 = 0;
					} else if (local11 > 255) {
						local11 = 255;
					}
					this.aByteArray9[local3] = (byte) local11;
				}
			} else if (arg0 == 7) {
				for (local3 = 0; local3 < this.anInt1116; local3++) {
					local11 = this.aShortArray20[local3] & 0xFFFF;
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
					this.aShortArray20[local3] = (short) (local498 << 10 | local164 << 7 | local492);
				}
				this.aBoolean62 = true;
			}
		}
	}

	@OriginalMember(owner = "client!eb", name = "l", descriptor = "()V")
	@Override
	protected void method1043() {
		if (this.aBoolean62) {
			this.method1061();
			this.aBoolean62 = false;
		}
		this.aBoolean63 = false;
	}

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "(I)V")
	@Override
	public void method1034(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class135.anIntArray335[arg0];
		@Pc(7) int local7 = Class135.anIntArray338[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt1114; local9++) {
			@Pc(29) int local29 = this.anIntArray71[local9] * local3 + this.anIntArray70[local9] * local7 >> 16;
			this.anIntArray71[local9] = this.anIntArray71[local9] * local7 - this.anIntArray70[local9] * local3 >> 16;
			this.anIntArray70[local9] = local29;
		}
		this.aBoolean63 = false;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(I[IIIIZI[I)V")
	@Override
	protected void method1037(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
		@Pc(2) int local2 = arg1.length;
		@Pc(6) int local6;
		@Pc(14) int local14;
		@Pc(33) int local33;
		@Pc(41) int local41;
		@Pc(21) int local21;
		if (arg0 == 0) {
			local6 = 0;
			Static58.anInt1118 = 0;
			Static58.anInt1120 = 0;
			Static58.anInt1117 = 0;
			for (local14 = 0; local14 < local2; local14++) {
				local21 = arg1[local14];
				if (local21 < this.anIntArrayArray10.length) {
					@Pc(31) int[] local31 = this.anIntArrayArray10[local21];
					for (local33 = 0; local33 < local31.length; local33++) {
						local41 = local31[local33];
						if (this.aShortArray23 == null || (arg6 & this.aShortArray23[local41]) != 0) {
							Static58.anInt1118 += this.anIntArray70[local41];
							Static58.anInt1120 += this.anIntArray69[local41];
							Static58.anInt1117 += this.anIntArray71[local41];
							local6++;
						}
					}
				}
			}
			if (local6 > 0) {
				Static58.anInt1118 = Static58.anInt1118 / local6 + arg2;
				Static58.anInt1120 = Static58.anInt1120 / local6 + arg3;
				Static58.anInt1117 = Static58.anInt1117 / local6 + arg4;
				Static58.aBoolean65 = true;
			} else {
				Static58.anInt1118 = arg2;
				Static58.anInt1120 = arg3;
				Static58.anInt1117 = arg4;
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
				if (local14 < this.anIntArrayArray10.length) {
					local204 = this.anIntArrayArray10[local14];
					for (local206 = 0; local206 < local204.length; local206++) {
						local33 = local204[local206];
						if (this.aShortArray23 == null || (arg6 & this.aShortArray23[local33]) != 0) {
							this.anIntArray70[local33] += arg2;
							this.anIntArray69[local33] += arg3;
							this.anIntArray71[local33] += arg4;
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
					if (local14 < this.anIntArrayArray10.length) {
						local204 = this.anIntArrayArray10[local14];
						for (local206 = 0; local206 < local204.length; local206++) {
							local33 = local204[local206];
							if (this.aShortArray23 == null || (arg6 & this.aShortArray23[local33]) != 0) {
								this.anIntArray70[local33] -= Static58.anInt1118;
								this.anIntArray69[local33] -= Static58.anInt1120;
								this.anIntArray71[local33] -= Static58.anInt1117;
								if (arg4 != 0) {
									local41 = Class135.anIntArray335[arg4];
									local307 = Class135.anIntArray338[arg4];
									local329 = this.anIntArray69[local33] * local41 + this.anIntArray70[local33] * local307 + 32767 >> 16;
									this.anIntArray69[local33] = this.anIntArray69[local33] * local307 + 32767 - this.anIntArray70[local33] * local41 >> 16;
									this.anIntArray70[local33] = local329;
								}
								if (arg2 != 0) {
									local41 = Class135.anIntArray335[arg2];
									local307 = Class135.anIntArray338[arg2];
									local329 = this.anIntArray69[local33] * local307 + 32767 - this.anIntArray71[local33] * local41 >> 16;
									this.anIntArray71[local33] = this.anIntArray69[local33] * local41 + this.anIntArray71[local33] * local307 + 32767 >> 16;
									this.anIntArray69[local33] = local329;
								}
								if (arg3 != 0) {
									local41 = Class135.anIntArray335[arg3];
									local307 = Class135.anIntArray338[arg3];
									local329 = this.anIntArray71[local33] * local41 + this.anIntArray70[local33] * local307 + 32767 >> 16;
									this.anIntArray71[local33] = this.anIntArray71[local33] * local307 + 32767 - this.anIntArray70[local33] * local41 >> 16;
									this.anIntArray70[local33] = local329;
								}
								this.anIntArray70[local33] += Static58.anInt1118;
								this.anIntArray69[local33] += Static58.anInt1120;
								this.anIntArray71[local33] += Static58.anInt1117;
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
				if (Static58.aBoolean65) {
					local307 = arg7[0] * Static58.anInt1118 + arg7[3] * Static58.anInt1120 + arg7[6] * Static58.anInt1117 + 16384 >> 15;
					local329 = arg7[1] * Static58.anInt1118 + arg7[4] * Static58.anInt1120 + arg7[7] * Static58.anInt1117 + 16384 >> 15;
					local351 = arg7[2] * Static58.anInt1118 + arg7[5] * Static58.anInt1120 + arg7[8] * Static58.anInt1117 + 16384 >> 15;
					local307 += local206;
					local329 += local33;
					local351 += local41;
					Static58.anInt1118 = local307;
					Static58.anInt1120 = local329;
					Static58.anInt1117 = local351;
					Static58.aBoolean65 = false;
				}
				@Pc(374) int[] local374 = new int[9];
				local329 = Class135.anIntArray338[arg2] >> 1;
				local351 = Class135.anIntArray335[arg2] >> 1;
				local392 = Class135.anIntArray338[arg3] >> 1;
				local398 = Class135.anIntArray335[arg3] >> 1;
				local404 = Class135.anIntArray338[arg4] >> 1;
				local410 = Class135.anIntArray335[arg4] >> 1;
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
				@Pc(554) int local554 = local374[0] * -Static58.anInt1118 + local374[1] * -Static58.anInt1120 + local374[2] * -Static58.anInt1117 + 16384 >> 15;
				local579 = local374[3] * -Static58.anInt1118 + local374[4] * -Static58.anInt1120 + local374[5] * -Static58.anInt1117 + 16384 >> 15;
				local604 = local374[6] * -Static58.anInt1118 + local374[7] * -Static58.anInt1120 + local374[8] * -Static58.anInt1117 + 16384 >> 15;
				local608 = local554 + Static58.anInt1118;
				@Pc(612) int local612 = local579 + Static58.anInt1120;
				local616 = local604 + Static58.anInt1117;
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
					if (local893 < this.anIntArrayArray10.length) {
						@Pc(903) int[] local903 = this.anIntArrayArray10[local893];
						for (@Pc(905) int local905 = 0; local905 < local903.length; local905++) {
							@Pc(913) int local913 = local903[local905];
							if (this.aShortArray23 == null || (arg6 & this.aShortArray23[local913]) != 0) {
								@Pc(955) int local955 = local753[0] * this.anIntArray70[local913] + local753[1] * this.anIntArray69[local913] + local753[2] * this.anIntArray71[local913] + 16384 >> 15;
								@Pc(986) int local986 = local753[3] * this.anIntArray70[local913] + local753[4] * this.anIntArray69[local913] + local753[5] * this.anIntArray71[local913] + 16384 >> 15;
								@Pc(1017) int local1017 = local753[6] * this.anIntArray70[local913] + local753[7] * this.anIntArray69[local913] + local753[8] * this.anIntArray71[local913] + 16384 >> 15;
								@Pc(1021) int local1021 = local955 + local755;
								@Pc(1025) int local1025 = local986 + local760;
								@Pc(1029) int local1029 = local1017 + local765;
								this.anIntArray70[local913] = local1021;
								this.anIntArray69[local913] = local1025;
								this.anIntArray71[local913] = local1029;
							}
						}
					}
				}
			}
		} else if (arg0 == 3) {
			if (arg7 == null) {
				for (local6 = 0; local6 < local2; local6++) {
					local14 = arg1[local6];
					if (local14 < this.anIntArrayArray10.length) {
						local204 = this.anIntArrayArray10[local14];
						for (local206 = 0; local206 < local204.length; local206++) {
							local33 = local204[local206];
							if (this.aShortArray23 == null || (arg6 & this.aShortArray23[local33]) != 0) {
								this.anIntArray70[local33] -= Static58.anInt1118;
								this.anIntArray69[local33] -= Static58.anInt1120;
								this.anIntArray71[local33] -= Static58.anInt1117;
								this.anIntArray70[local33] = this.anIntArray70[local33] * arg2 / 128;
								this.anIntArray69[local33] = this.anIntArray69[local33] * arg3 / 128;
								this.anIntArray71[local33] = this.anIntArray71[local33] * arg4 / 128;
								this.anIntArray70[local33] += Static58.anInt1118;
								this.anIntArray69[local33] += Static58.anInt1120;
								this.anIntArray71[local33] += Static58.anInt1117;
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
				if (Static58.aBoolean65) {
					local307 = arg7[0] * Static58.anInt1118 + arg7[3] * Static58.anInt1120 + arg7[6] * Static58.anInt1117 + 16384 >> 15;
					local329 = arg7[1] * Static58.anInt1118 + arg7[4] * Static58.anInt1120 + arg7[7] * Static58.anInt1117 + 16384 >> 15;
					local351 = arg7[2] * Static58.anInt1118 + arg7[5] * Static58.anInt1120 + arg7[8] * Static58.anInt1117 + 16384 >> 15;
					local307 += local206;
					local329 += local33;
					local351 += local41;
					Static58.anInt1118 = local307;
					Static58.anInt1120 = local329;
					Static58.anInt1117 = local351;
					Static58.aBoolean65 = false;
				}
				local307 = arg2 << 15 >> 7;
				local329 = arg3 << 15 >> 7;
				local351 = arg4 << 15 >> 7;
				local392 = local307 * -Static58.anInt1118 + 16384 >> 15;
				local398 = local329 * -Static58.anInt1120 + 16384 >> 15;
				local404 = local351 * -Static58.anInt1117 + 16384 >> 15;
				local410 = local392 + Static58.anInt1118;
				local418 = local398 + Static58.anInt1120;
				local426 = local404 + Static58.anInt1117;
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
					if (local631 < this.anIntArrayArray10.length) {
						local753 = this.anIntArrayArray10[local631];
						for (local755 = 0; local755 < local753.length; local755++) {
							local760 = local753[local755];
							if (this.aShortArray23 == null || (arg6 & this.aShortArray23[local760]) != 0) {
								local765 = local1628[0] * this.anIntArray70[local760] + local1628[1] * this.anIntArray69[local760] + local1628[2] * this.anIntArray71[local760] + 16384 >> 15;
								local767 = local1628[3] * this.anIntArray70[local760] + local1628[4] * this.anIntArray69[local760] + local1628[5] * this.anIntArray71[local760] + 16384 >> 15;
								local893 = local1628[6] * this.anIntArray70[local760] + local1628[7] * this.anIntArray69[local760] + local1628[8] * this.anIntArray71[local760] + 16384 >> 15;
								@Pc(1896) int local1896 = local765 + local616;
								@Pc(1900) int local1900 = local767 + local1635;
								@Pc(1904) int local1904 = local893 + local621;
								this.anIntArray70[local760] = local1896;
								this.anIntArray69[local760] = local1900;
								this.anIntArray71[local760] = local1904;
							}
						}
					}
				}
			}
		} else if (arg0 == 5) {
			if (this.anIntArrayArray9 != null && this.aByteArray9 != null) {
				for (local6 = 0; local6 < local2; local6++) {
					local14 = arg1[local6];
					if (local14 < this.anIntArrayArray9.length) {
						local204 = this.anIntArrayArray9[local14];
						for (local206 = 0; local206 < local204.length; local206++) {
							local33 = local204[local206];
							if (this.aShortArray21 == null || (arg6 & this.aShortArray21[local33]) != 0) {
								local41 = (this.aByteArray9[local33] & 0xFF) + arg2 * 8;
								if (local41 < 0) {
									local41 = 0;
								} else if (local41 > 255) {
									local41 = 255;
								}
								this.aByteArray9[local33] = (byte) local41;
							}
						}
					}
				}
			}
		} else if (arg0 == 7 && this.anIntArrayArray9 != null) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray9.length) {
					local204 = this.anIntArrayArray9[local14];
					for (local206 = 0; local206 < local204.length; local206++) {
						local33 = local204[local206];
						if (this.aShortArray21 == null || (arg6 & this.aShortArray21[local33]) != 0) {
							local41 = this.aShortArray20[local33] & 0xFFFF;
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
							this.aShortArray20[local33] = (short) (local2209 << 10 | local329 << 7 | local351);
						}
					}
					this.aBoolean62 = true;
				}
			}
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIIIIIII)V")
	public void method1047(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		try {
			if (!this.aBoolean63) {
				this.method1057();
			}
			@Pc(6) int local6 = Static215.anInt4020;
			@Pc(8) int local8 = Static215.anInt4021;
			@Pc(12) int local12 = Class135.anIntArray335[0];
			@Pc(16) int local16 = Class135.anIntArray338[0];
			@Pc(20) int local20 = Class135.anIntArray335[arg0];
			@Pc(24) int local24 = Class135.anIntArray338[arg0];
			@Pc(28) int local28 = Class135.anIntArray335[arg1];
			@Pc(32) int local32 = Class135.anIntArray338[arg1];
			@Pc(36) int local36 = Class135.anIntArray335[arg2];
			@Pc(40) int local40 = Class135.anIntArray338[arg2];
			@Pc(50) int local50 = arg4 * local36 + arg5 * local40 >> 16;
			for (@Pc(52) int local52 = 0; local52 < this.anInt1114; local52++) {
				@Pc(61) int local61 = this.anIntArray70[local52];
				@Pc(66) int local66 = this.anIntArray69[local52];
				@Pc(71) int local71 = this.anIntArray71[local52];
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
				Static58.anIntArray95[local52] = local71 - local50;
				Static58.anIntArray101[local52] = local6 + (local61 << 9) / arg6;
				Static58.anIntArray94[local52] = local8 + (local83 << 9) / arg6;
				if (this.anInt1115 > 0) {
					Static58.anIntArray97[local52] = local61;
					Static58.anIntArray103[local52] = local83;
					Static58.anIntArray89[local52] = local71;
				}
			}
			this.method1060(false, false, 0L, this.aShort13, this.aShort13 << 1, null);
		} catch (@Pc(234) RuntimeException local234) {
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "()I")
	@Override
	public int method4676() {
		if (!this.aBoolean63) {
			this.method1057();
		}
		return this.aShort7;
	}

	@OriginalMember(owner = "client!eb", name = "f", descriptor = "()I")
	@Override
	public int method1024() {
		if (!this.aBoolean63) {
			this.method1057();
		}
		return this.aShort6;
	}

	@OriginalMember(owner = "client!eb", name = "c", descriptor = "(I)V")
	@Override
	public void method1036(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class135.anIntArray335[arg0];
		@Pc(7) int local7 = Class135.anIntArray338[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt1114; local9++) {
			@Pc(29) int local29 = this.anIntArray69[local9] * local3 + this.anIntArray70[local9] * local7 >> 16;
			this.anIntArray69[local9] = this.anIntArray69[local9] * local7 - this.anIntArray70[local9] * local3 >> 16;
			this.anIntArray70[local9] = local29;
		}
		this.aBoolean63 = false;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(I[IIIIZ)V")
	@Override
	protected void method1038(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		@Pc(2) int local2 = arg1.length;
		@Pc(6) int local6;
		@Pc(14) int local14;
		@Pc(33) int local33;
		@Pc(41) int local41;
		if (arg0 == 0) {
			local6 = 0;
			Static58.anInt1118 = 0;
			Static58.anInt1120 = 0;
			Static58.anInt1117 = 0;
			for (local14 = 0; local14 < local2; local14++) {
				@Pc(21) int local21 = arg1[local14];
				if (local21 < this.anIntArrayArray10.length) {
					@Pc(31) int[] local31 = this.anIntArrayArray10[local21];
					for (local33 = 0; local33 < local31.length; local33++) {
						local41 = local31[local33];
						Static58.anInt1118 += this.anIntArray70[local41];
						Static58.anInt1120 += this.anIntArray69[local41];
						Static58.anInt1117 += this.anIntArray71[local41];
						local6++;
					}
				}
			}
			if (local6 > 0) {
				Static58.anInt1118 = Static58.anInt1118 / local6 + arg2;
				Static58.anInt1120 = Static58.anInt1120 / local6 + arg3;
				Static58.anInt1117 = Static58.anInt1117 / local6 + arg4;
			} else {
				Static58.anInt1118 = arg2;
				Static58.anInt1120 = arg3;
				Static58.anInt1117 = arg4;
			}
			return;
		}
		@Pc(117) int[] local117;
		@Pc(119) int local119;
		if (arg0 == 1) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray10.length) {
					local117 = this.anIntArrayArray10[local14];
					for (local119 = 0; local119 < local117.length; local119++) {
						local33 = local117[local119];
						this.anIntArray70[local33] += arg2;
						this.anIntArray69[local33] += arg3;
						this.anIntArray71[local33] += arg4;
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
				if (local14 < this.anIntArrayArray10.length) {
					local117 = this.anIntArrayArray10[local14];
					for (local119 = 0; local119 < local117.length; local119++) {
						local33 = local117[local119];
						this.anIntArray70[local33] -= Static58.anInt1118;
						this.anIntArray69[local33] -= Static58.anInt1120;
						this.anIntArray71[local33] -= Static58.anInt1117;
						if (arg4 != 0) {
							local41 = Class135.anIntArray335[arg4];
							local222 = Class135.anIntArray338[arg4];
							local240 = this.anIntArray69[local33] * local41 + this.anIntArray70[local33] * local222 + 32767 >> 16;
							this.anIntArray69[local33] = this.anIntArray69[local33] * local222 + 32767 - this.anIntArray70[local33] * local41 >> 16;
							this.anIntArray70[local33] = local240;
						}
						if (arg2 != 0) {
							local41 = Class135.anIntArray335[arg2];
							local222 = Class135.anIntArray338[arg2];
							local240 = this.anIntArray69[local33] * local222 + 32767 - this.anIntArray71[local33] * local41 >> 16;
							this.anIntArray71[local33] = this.anIntArray69[local33] * local41 + this.anIntArray71[local33] * local222 + 32767 >> 16;
							this.anIntArray69[local33] = local240;
						}
						if (arg3 != 0) {
							local41 = Class135.anIntArray335[arg3];
							local222 = Class135.anIntArray338[arg3];
							local240 = this.anIntArray71[local33] * local41 + this.anIntArray70[local33] * local222 + 32767 >> 16;
							this.anIntArray71[local33] = this.anIntArray71[local33] * local222 + 32767 - this.anIntArray70[local33] * local41 >> 16;
							this.anIntArray70[local33] = local240;
						}
						this.anIntArray70[local33] += Static58.anInt1118;
						this.anIntArray69[local33] += Static58.anInt1120;
						this.anIntArray71[local33] += Static58.anInt1117;
					}
				}
			}
		} else if (arg0 == 3) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray10.length) {
					local117 = this.anIntArrayArray10[local14];
					for (local119 = 0; local119 < local117.length; local119++) {
						local33 = local117[local119];
						this.anIntArray70[local33] -= Static58.anInt1118;
						this.anIntArray69[local33] -= Static58.anInt1120;
						this.anIntArray71[local33] -= Static58.anInt1117;
						this.anIntArray70[local33] = this.anIntArray70[local33] * arg2 / 128;
						this.anIntArray69[local33] = this.anIntArray69[local33] * arg3 / 128;
						this.anIntArray71[local33] = this.anIntArray71[local33] * arg4 / 128;
						this.anIntArray70[local33] += Static58.anInt1118;
						this.anIntArray69[local33] += Static58.anInt1120;
						this.anIntArray71[local33] += Static58.anInt1117;
					}
				}
			}
		} else if (arg0 == 5) {
			if (this.anIntArrayArray9 != null && this.aByteArray9 != null) {
				for (local6 = 0; local6 < local2; local6++) {
					local14 = arg1[local6];
					if (local14 < this.anIntArrayArray9.length) {
						local117 = this.anIntArrayArray9[local14];
						for (local119 = 0; local119 < local117.length; local119++) {
							local33 = local117[local119];
							local41 = (this.aByteArray9[local33] & 0xFF) + arg2 * 8;
							if (local41 < 0) {
								local41 = 0;
							} else if (local41 > 255) {
								local41 = 255;
							}
							this.aByteArray9[local33] = (byte) local41;
						}
					}
				}
			}
		} else if (arg0 == 7 && this.anIntArrayArray9 != null) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray9.length) {
					local117 = this.anIntArrayArray9[local14];
					for (local119 = 0; local119 < local117.length; local119++) {
						local33 = local117[local119];
						local41 = this.aShortArray20[local33] & 0xFFFF;
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
						this.aShortArray20[local33] = (short) (local658 << 10 | local240 << 7 | local652);
					}
					this.aBoolean62 = true;
				}
			}
		}
	}

	@OriginalMember(owner = "client!eb", name = "j", descriptor = "()I")
	@Override
	public int method1039() {
		if (!this.aBoolean63) {
			this.method1057();
		}
		return this.aShort11;
	}

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "(IIIIIIII)Z")
	private boolean method1048(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
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

	@OriginalMember(owner = "client!eb", name = "g", descriptor = "()V")
	@Override
	public void method1025() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1114; local1++) {
			@Pc(10) int local10 = this.anIntArray71[local1];
			this.anIntArray71[local1] = this.anIntArray70[local1];
			this.anIntArray70[local1] = -local10;
		}
		this.aBoolean63 = false;
	}

	@OriginalMember(owner = "client!eb", name = "e", descriptor = "()Z")
	@Override
	protected boolean method1023() {
		if (this.anIntArrayArray10 == null) {
			return false;
		} else {
			Static58.anInt1118 = 0;
			Static58.anInt1120 = 0;
			Static58.anInt1117 = 0;
			return true;
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIIIIIIJ)V")
	@Override
	public void method1035(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) long arg6) {
		try {
			if (!this.aBoolean63) {
				this.method1057();
			}
			@Pc(6) int local6 = Static215.anInt4020;
			@Pc(8) int local8 = Static215.anInt4021;
			@Pc(12) int local12 = Class135.anIntArray335[0];
			@Pc(16) int local16 = Class135.anIntArray338[0];
			@Pc(20) int local20 = Class135.anIntArray335[arg0];
			@Pc(24) int local24 = Class135.anIntArray338[arg0];
			@Pc(28) int local28 = Class135.anIntArray335[arg1];
			@Pc(32) int local32 = Class135.anIntArray338[arg1];
			@Pc(36) int local36 = Class135.anIntArray335[arg2];
			@Pc(40) int local40 = Class135.anIntArray338[arg2];
			@Pc(50) int local50 = arg4 * local36 + arg5 * local40 >> 16;
			for (@Pc(52) int local52 = 0; local52 < this.anInt1114; local52++) {
				@Pc(61) int local61 = this.anIntArray70[local52];
				@Pc(66) int local66 = this.anIntArray69[local52];
				@Pc(71) int local71 = this.anIntArray71[local52];
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
				Static58.anIntArray95[local52] = local71 - local50;
				Static58.anIntArray101[local52] = local6 + (local61 << 9) / local71;
				Static58.anIntArray94[local52] = local8 + (local83 << 9) / local71;
				if (this.anInt1115 > 0) {
					Static58.anIntArray97[local52] = local61;
					Static58.anIntArray103[local52] = local83;
					Static58.anIntArray89[local52] = local71;
				}
			}
			this.method1060(false, arg6 >= 0L, arg6, this.aShort13, this.aShort13 << 1, null);
		} catch (@Pc(240) RuntimeException local240) {
		}
	}

	@OriginalMember(owner = "client!eb", name = "e", descriptor = "(I)V")
	private void method1049(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static215.anInt4020;
		@Pc(3) int local3 = Static215.anInt4021;
		@Pc(5) int local5 = 0;
		@Pc(10) int local10 = this.anIntArray75[arg0];
		@Pc(15) int local15 = this.anIntArray72[arg0];
		@Pc(20) int local20 = this.anIntArray76[arg0];
		@Pc(24) int local24 = Static58.anIntArray89[local10];
		@Pc(28) int local28 = Static58.anIntArray89[local15];
		@Pc(32) int local32 = Static58.anIntArray89[local20];
		if (this.aByteArray9 == null) {
			Static215.anInt4023 = 0;
		} else {
			Static215.anInt4023 = this.aByteArray9[arg0] & 0xFF;
		}
		@Pc(75) int local75;
		@Pc(79) int local79;
		@Pc(86) int local86;
		@Pc(99) int local99;
		if (local24 >= 50) {
			Static58.anIntArray106[0] = Static58.anIntArray101[local10];
			Static58.anIntArray86[0] = Static58.anIntArray94[local10];
			local5++;
			Static58.anIntArray91[0] = this.anIntArray73[arg0] & 0xFFFF;
		} else {
			local75 = Static58.anIntArray97[local10];
			local79 = Static58.anIntArray103[local10];
			local86 = this.anIntArray73[arg0] & 0xFFFF;
			if (local32 >= 50) {
				local99 = (50 - local24) * Class135.anIntArray339[local32 - local24];
				Static58.anIntArray106[0] = local1 + (local75 + ((Static58.anIntArray97[local20] - local75) * local99 >> 16) << 9) / 50;
				Static58.anIntArray86[0] = local3 + (local79 + ((Static58.anIntArray103[local20] - local79) * local99 >> 16) << 9) / 50;
				local5++;
				Static58.anIntArray91[0] = local86 + (((this.anIntArray68[arg0] & 0xFFFF) - local86) * local99 >> 16);
			}
			if (local28 >= 50) {
				local99 = (50 - local24) * Class135.anIntArray339[local28 - local24];
				Static58.anIntArray106[local5] = local1 + (local75 + ((Static58.anIntArray97[local15] - local75) * local99 >> 16) << 9) / 50;
				Static58.anIntArray86[local5] = local3 + (local79 + ((Static58.anIntArray103[local15] - local79) * local99 >> 16) << 9) / 50;
				Static58.anIntArray91[local5++] = local86 + (((this.anIntArray66[arg0] & 0xFFFF) - local86) * local99 >> 16);
			}
		}
		if (local28 >= 50) {
			Static58.anIntArray106[local5] = Static58.anIntArray101[local15];
			Static58.anIntArray86[local5] = Static58.anIntArray94[local15];
			Static58.anIntArray91[local5++] = this.anIntArray66[arg0] & 0xFFFF;
		} else {
			local75 = Static58.anIntArray97[local15];
			local79 = Static58.anIntArray103[local15];
			local86 = this.anIntArray66[arg0] & 0xFFFF;
			if (local24 >= 50) {
				local99 = (50 - local28) * Class135.anIntArray339[local24 - local28];
				Static58.anIntArray106[local5] = local1 + (local75 + ((Static58.anIntArray97[local10] - local75) * local99 >> 16) << 9) / 50;
				Static58.anIntArray86[local5] = local3 + (local79 + ((Static58.anIntArray103[local10] - local79) * local99 >> 16) << 9) / 50;
				Static58.anIntArray91[local5++] = local86 + (((this.anIntArray73[arg0] & 0xFFFF) - local86) * local99 >> 16);
			}
			if (local32 >= 50) {
				local99 = (50 - local28) * Class135.anIntArray339[local32 - local28];
				Static58.anIntArray106[local5] = local1 + (local75 + ((Static58.anIntArray97[local20] - local75) * local99 >> 16) << 9) / 50;
				Static58.anIntArray86[local5] = local3 + (local79 + ((Static58.anIntArray103[local20] - local79) * local99 >> 16) << 9) / 50;
				Static58.anIntArray91[local5++] = local86 + (((this.anIntArray68[arg0] & 0xFFFF) - local86) * local99 >> 16);
			}
		}
		if (local32 >= 50) {
			Static58.anIntArray106[local5] = Static58.anIntArray101[local20];
			Static58.anIntArray86[local5] = Static58.anIntArray94[local20];
			Static58.anIntArray91[local5++] = this.anIntArray68[arg0] & 0xFFFF;
		} else {
			local75 = Static58.anIntArray97[local20];
			local79 = Static58.anIntArray103[local20];
			local86 = this.anIntArray68[arg0] & 0xFFFF;
			if (local28 >= 50) {
				local99 = (50 - local32) * Class135.anIntArray339[local28 - local32];
				Static58.anIntArray106[local5] = local1 + (local75 + ((Static58.anIntArray97[local15] - local75) * local99 >> 16) << 9) / 50;
				Static58.anIntArray86[local5] = local3 + (local79 + ((Static58.anIntArray103[local15] - local79) * local99 >> 16) << 9) / 50;
				Static58.anIntArray91[local5++] = local86 + (((this.anIntArray66[arg0] & 0xFFFF) - local86) * local99 >> 16);
			}
			if (local24 >= 50) {
				local99 = (50 - local32) * Class135.anIntArray339[local24 - local32];
				Static58.anIntArray106[local5] = local1 + (local75 + ((Static58.anIntArray97[local10] - local75) * local99 >> 16) << 9) / 50;
				Static58.anIntArray86[local5] = local3 + (local79 + ((Static58.anIntArray103[local10] - local79) * local99 >> 16) << 9) / 50;
				Static58.anIntArray91[local5++] = local86 + (((this.anIntArray73[arg0] & 0xFFFF) - local86) * local99 >> 16);
			}
		}
		local75 = Static58.anIntArray106[0];
		local79 = Static58.anIntArray106[1];
		local86 = Static58.anIntArray106[2];
		local99 = Static58.anIntArray86[0];
		@Pc(614) int local614 = Static58.anIntArray86[1];
		@Pc(618) int local618 = Static58.anIntArray86[2];
		Static215.aBoolean276 = false;
		@Pc(709) int local709;
		@Pc(714) int local714;
		@Pc(719) int local719;
		@Pc(704) int local704;
		if (local5 == 3) {
			if (local75 < 0 || local79 < 0 || local86 < 0 || local75 > Static215.anInt4024 || local79 > Static215.anInt4024 || local86 > Static215.anInt4024) {
				Static215.aBoolean276 = true;
			}
			if (this.aShortArray22 != null && this.aShortArray22[arg0] != -1) {
				if (this.aByteArray10 == null || this.aByteArray10[arg0] == -1) {
					local709 = local10;
					local714 = local15;
					local719 = local20;
				} else {
					local704 = this.aByteArray10[arg0] & 0xFF;
					local709 = this.anIntArray67[local704];
					local714 = this.anIntArray77[local704];
					local719 = this.anIntArray74[local704];
				}
				if (this.anIntArray68[arg0] == -1) {
					Static215.method3379(local99, local614, local618, local75, local79, local86, this.anIntArray73[arg0], this.anIntArray73[arg0], this.anIntArray73[arg0], Static58.anIntArray97[local709], Static58.anIntArray97[local714], Static58.anIntArray97[local719], Static58.anIntArray103[local709], Static58.anIntArray103[local714], Static58.anIntArray103[local719], Static58.anIntArray89[local709], Static58.anIntArray89[local714], Static58.anIntArray89[local719], this.aShortArray22[arg0]);
				} else {
					Static215.method3379(local99, local614, local618, local75, local79, local86, Static58.anIntArray91[0], Static58.anIntArray91[1], Static58.anIntArray91[2], Static58.anIntArray97[local709], Static58.anIntArray97[local714], Static58.anIntArray97[local719], Static58.anIntArray103[local709], Static58.anIntArray103[local714], Static58.anIntArray103[local719], Static58.anIntArray89[local709], Static58.anIntArray89[local714], Static58.anIntArray89[local719], this.aShortArray22[arg0]);
				}
			} else if (this.anIntArray68[arg0] == -1) {
				Static215.method3384(local99, local614, local618, local75, local79, local86, Static215.anIntArray340[this.anIntArray73[arg0] & 0xFFFF]);
			} else {
				Static215.method3366(local99, local614, local618, local75, local79, local86, Static58.anIntArray91[0], Static58.anIntArray91[1], Static58.anIntArray91[2]);
			}
		}
		if (local5 != 4) {
			return;
		}
		if (local75 < 0 || local79 < 0 || local86 < 0 || local75 > Static215.anInt4024 || local79 > Static215.anInt4024 || local86 > Static215.anInt4024 || Static58.anIntArray106[3] < 0 || Static58.anIntArray106[3] > Static215.anInt4024) {
			Static215.aBoolean276 = true;
		}
		if (this.aShortArray22 != null && this.aShortArray22[arg0] != -1) {
			if (this.aByteArray10 == null || this.aByteArray10[arg0] == -1) {
				local709 = local10;
				local714 = local15;
				local719 = local20;
			} else {
				local704 = this.aByteArray10[arg0] & 0xFF;
				local709 = this.anIntArray67[local704];
				local714 = this.anIntArray77[local704];
				local719 = this.anIntArray74[local704];
			}
			@Pc(984) short local984 = this.aShortArray22[arg0];
			if (this.anIntArray68[arg0] == -1) {
				Static215.method3379(local99, local614, local618, local75, local79, local86, this.anIntArray73[arg0], this.anIntArray73[arg0], this.anIntArray73[arg0], Static58.anIntArray97[local709], Static58.anIntArray97[local714], Static58.anIntArray97[local719], Static58.anIntArray103[local709], Static58.anIntArray103[local714], Static58.anIntArray103[local719], Static58.anIntArray89[local709], Static58.anIntArray89[local714], Static58.anIntArray89[local719], local984);
				Static215.method3379(local99, local618, Static58.anIntArray86[3], local75, local86, Static58.anIntArray106[3], this.anIntArray73[arg0], this.anIntArray73[arg0], this.anIntArray73[arg0], Static58.anIntArray97[local709], Static58.anIntArray97[local714], Static58.anIntArray97[local719], Static58.anIntArray103[local709], Static58.anIntArray103[local714], Static58.anIntArray103[local719], Static58.anIntArray89[local709], Static58.anIntArray89[local714], Static58.anIntArray89[local719], local984);
			} else {
				Static215.method3379(local99, local614, local618, local75, local79, local86, Static58.anIntArray91[0], Static58.anIntArray91[1], Static58.anIntArray91[2], Static58.anIntArray97[local709], Static58.anIntArray97[local714], Static58.anIntArray97[local719], Static58.anIntArray103[local709], Static58.anIntArray103[local714], Static58.anIntArray103[local719], Static58.anIntArray89[local709], Static58.anIntArray89[local714], Static58.anIntArray89[local719], local984);
				Static215.method3379(local99, local618, Static58.anIntArray86[3], local75, local86, Static58.anIntArray106[3], Static58.anIntArray91[0], Static58.anIntArray91[2], Static58.anIntArray91[3], Static58.anIntArray97[local709], Static58.anIntArray97[local714], Static58.anIntArray97[local719], Static58.anIntArray103[local709], Static58.anIntArray103[local714], Static58.anIntArray103[local719], Static58.anIntArray89[local709], Static58.anIntArray89[local714], Static58.anIntArray89[local719], local984);
			}
		} else if (this.anIntArray68[arg0] == -1) {
			local709 = Static215.anIntArray340[this.anIntArray73[arg0] & 0xFFFF];
			Static215.method3384(local99, local614, local618, local75, local79, local86, local709);
			Static215.method3384(local99, local618, Static58.anIntArray86[3], local75, local86, Static58.anIntArray106[3], local709);
		} else {
			Static215.method3366(local99, local614, local618, local75, local79, local86, Static58.anIntArray91[0], Static58.anIntArray91[1], Static58.anIntArray91[2]);
			Static215.method3366(local99, local618, Static58.anIntArray86[3], local75, local86, Static58.anIntArray106[3], Static58.anIntArray91[0], Static58.anIntArray91[2], Static58.anIntArray91[3]);
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(Lclient!bf;)Lclient!bf;")
	public Class15_Sub2 method1050(@OriginalArg(0) Class15_Sub2 arg0) {
		return new Class15_Sub2_Sub2(new Class15_Sub2_Sub2[] { this, (Class15_Sub2_Sub2) arg0 }, 2);
	}

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "(III)V")
	@Override
	public void method1028(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1114; local1++) {
			this.anIntArray70[local1] += arg0;
			this.anIntArray69[local1] += arg1;
			this.anIntArray71[local1] += arg2;
		}
		this.aBoolean63 = false;
	}

	@OriginalMember(owner = "client!eb", name = "f", descriptor = "(I)V")
	private void method1053(@OriginalArg(0) int arg0) {
		if (Static58.aBooleanArray4[arg0]) {
			this.method1049(arg0);
			return;
		}
		@Pc(12) int local12 = this.anIntArray75[arg0];
		@Pc(17) int local17 = this.anIntArray72[arg0];
		@Pc(22) int local22 = this.anIntArray76[arg0];
		Static215.aBoolean276 = Static58.aBooleanArray3[arg0];
		if (this.aByteArray9 == null) {
			Static215.anInt4023 = 0;
		} else {
			Static215.anInt4023 = this.aByteArray9[arg0] & 0xFF;
		}
		if (this.aShortArray22 != null && this.aShortArray22[arg0] != -1) {
			@Pc(141) int local141;
			@Pc(146) int local146;
			@Pc(151) int local151;
			if (this.aByteArray10 == null || this.aByteArray10[arg0] == -1) {
				local141 = local12;
				local146 = local17;
				local151 = local22;
			} else {
				@Pc(136) int local136 = this.aByteArray10[arg0] & 0xFF;
				local141 = this.anIntArray67[local136];
				local146 = this.anIntArray77[local136];
				local151 = this.anIntArray74[local136];
			}
			if (this.anIntArray68[arg0] == -1) {
				Static215.method3379(Static58.anIntArray94[local12], Static58.anIntArray94[local17], Static58.anIntArray94[local22], Static58.anIntArray101[local12], Static58.anIntArray101[local17], Static58.anIntArray101[local22], this.anIntArray73[arg0], this.anIntArray73[arg0], this.anIntArray73[arg0], Static58.anIntArray97[local141], Static58.anIntArray97[local146], Static58.anIntArray97[local151], Static58.anIntArray103[local141], Static58.anIntArray103[local146], Static58.anIntArray103[local151], Static58.anIntArray89[local141], Static58.anIntArray89[local146], Static58.anIntArray89[local151], this.aShortArray22[arg0]);
			} else {
				Static215.method3379(Static58.anIntArray94[local12], Static58.anIntArray94[local17], Static58.anIntArray94[local22], Static58.anIntArray101[local12], Static58.anIntArray101[local17], Static58.anIntArray101[local22], this.anIntArray73[arg0], this.anIntArray66[arg0], this.anIntArray68[arg0], Static58.anIntArray97[local141], Static58.anIntArray97[local146], Static58.anIntArray97[local151], Static58.anIntArray103[local141], Static58.anIntArray103[local146], Static58.anIntArray103[local151], Static58.anIntArray89[local141], Static58.anIntArray89[local146], Static58.anIntArray89[local151], this.aShortArray22[arg0]);
			}
		} else if (this.anIntArray68[arg0] == -1) {
			Static215.method3384(Static58.anIntArray94[local12], Static58.anIntArray94[local17], Static58.anIntArray94[local22], Static58.anIntArray101[local12], Static58.anIntArray101[local17], Static58.anIntArray101[local22], Static215.anIntArray340[this.anIntArray73[arg0] & 0xFFFF]);
		} else {
			Static215.method3366(Static58.anIntArray94[local12], Static58.anIntArray94[local17], Static58.anIntArray94[local22], Static58.anIntArray101[local12], Static58.anIntArray101[local17], Static58.anIntArray101[local22], this.anIntArray73[arg0] & 0xFFFF, this.anIntArray66[arg0] & 0xFFFF, this.anIntArray68[arg0] & 0xFFFF);
		}
	}

	@OriginalMember(owner = "client!eb", name = "c", descriptor = "(III)V")
	@Override
	public void method1040(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1114; local1++) {
			this.anIntArray70[local1] = this.anIntArray70[local1] * arg0 / 128;
			this.anIntArray69[local1] = this.anIntArray69[local1] * arg1 / 128;
			this.anIntArray71[local1] = this.anIntArray71[local1] * arg2 / 128;
		}
		this.aBoolean63 = false;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(II[[I[[IIIIZ)Lclient!eb;")
	public Class15_Sub2_Sub2 method1054(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		if (!this.aBoolean63) {
			this.method1057();
		}
		@Pc(9) int local9 = arg4 + this.aShort11;
		@Pc(14) int local14 = arg4 + this.aShort12;
		@Pc(19) int local19 = arg6 + this.aShort8;
		@Pc(24) int local24 = arg6 + this.aShort9;
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
		@Pc(150) Class15_Sub2_Sub2 local150;
		if (arg7) {
			local150 = new Class15_Sub2_Sub2();
			local150.anInt1114 = this.anInt1114;
			local150.anInt1113 = this.anInt1113;
			local150.anInt1116 = this.anInt1116;
			local150.anInt1115 = this.anInt1115;
			local150.anIntArray75 = this.anIntArray75;
			local150.anIntArray72 = this.anIntArray72;
			local150.anIntArray76 = this.anIntArray76;
			local150.anIntArray73 = this.anIntArray73;
			local150.anIntArray66 = this.anIntArray66;
			local150.anIntArray68 = this.anIntArray68;
			local150.aByteArray8 = this.aByteArray8;
			local150.aByteArray10 = this.aByteArray10;
			local150.aShortArray22 = this.aShortArray22;
			local150.aShortArray20 = this.aShortArray20;
			local150.aByteArray9 = this.aByteArray9;
			local150.aByte5 = this.aByte5;
			local150.anIntArray67 = this.anIntArray67;
			local150.anIntArray77 = this.anIntArray77;
			local150.anIntArray74 = this.anIntArray74;
			local150.anIntArrayArray10 = this.anIntArrayArray10;
			local150.anIntArrayArray9 = this.anIntArrayArray9;
			local150.aShortArray23 = this.aShortArray23;
			local150.aShortArray21 = this.aShortArray21;
			local150.aBoolean61 = this.aBoolean61;
			if (arg0 == 3) {
				local150.anIntArray70 = Static142.method2456(this.anIntArray70);
				local150.anIntArray69 = Static142.method2456(this.anIntArray69);
				local150.anIntArray71 = Static142.method2456(this.anIntArray71);
			} else {
				local150.anIntArray70 = this.anIntArray70;
				local150.anIntArray69 = new int[local150.anInt1114];
				local150.anIntArray71 = this.anIntArray71;
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
			for (local289 = 0; local289 < local150.anInt1113; local289++) {
				local300 = this.anIntArray70[local289] + arg4;
				local307 = this.anIntArray71[local289] + arg6;
				local311 = local300 & 0x7F;
				local315 = local307 & 0x7F;
				local319 = local300 >> 7;
				local323 = local307 >> 7;
				local345 = arg2[local319][local323] * (128 - local311) + arg2[local319 + 1][local323] * local311 >> 7;
				local371 = arg2[local319][local323 + 1] * (128 - local311) + arg2[local319 + 1][local323 + 1] * local311 >> 7;
				local383 = local345 * (128 - local315) + local371 * local315 >> 7;
				local150.anIntArray69[local289] = this.anIntArray69[local289] + local383 - arg5;
			}
			for (local289 = local150.anInt1113; local289 < local150.anInt1114; local289++) {
				local300 = this.anIntArray70[local289] + arg4;
				local307 = this.anIntArray71[local289] + arg6;
				local311 = local300 & 0x7F;
				local315 = local307 & 0x7F;
				local319 = local300 >> 7;
				local323 = local307 >> 7;
				if (local319 >= 0 && local319 < arg2.length - 1 && local323 >= 0 && local323 < arg2[0].length - 1) {
					local345 = arg2[local319][local323] * (128 - local311) + arg2[local319 + 1][local323] * local311 >> 7;
					local371 = arg2[local319][local323 + 1] * (128 - local311) + arg2[local319 + 1][local323 + 1] * local311 >> 7;
					local383 = local345 * (128 - local315) + local371 * local315 >> 7;
					local150.anIntArray69[local289] = this.anIntArray69[local289] + local383 - arg5;
				}
			}
		} else {
			@Pc(640) int local640;
			if (arg0 == 2) {
				for (local289 = 0; local289 < local150.anInt1113; local289++) {
					local300 = (this.anIntArray69[local289] << 16) / this.aShort7;
					if (local300 < arg1) {
						local307 = this.anIntArray70[local289] + arg4;
						local311 = this.anIntArray71[local289] + arg6;
						local315 = local307 & 0x7F;
						local319 = local311 & 0x7F;
						local323 = local307 >> 7;
						local345 = local311 >> 7;
						local371 = arg2[local323][local345] * (128 - local315) + arg2[local323 + 1][local345] * local315 >> 7;
						local383 = arg2[local323][local345 + 1] * (128 - local315) + arg2[local323 + 1][local345 + 1] * local315 >> 7;
						local640 = local371 * (128 - local319) + local383 * local319 >> 7;
						local150.anIntArray69[local289] = this.anIntArray69[local289] + (local640 - arg5) * (arg1 - local300) / arg1;
					} else {
						local150.anIntArray69[local289] = this.anIntArray69[local289];
					}
				}
				for (local289 = local150.anInt1113; local289 < local150.anInt1114; local289++) {
					local300 = (this.anIntArray69[local289] << 16) / this.aShort7;
					if (local300 < arg1) {
						local307 = this.anIntArray70[local289] + arg4;
						local311 = this.anIntArray71[local289] + arg6;
						local315 = local307 & 0x7F;
						local319 = local311 & 0x7F;
						local323 = local307 >> 7;
						local345 = local311 >> 7;
						if (local323 >= 0 && local323 < arg2.length - 1 && local345 >= 0 && local345 < arg2[0].length - 1) {
							local371 = arg2[local323][local345] * (128 - local315) + arg2[local323 + 1][local345] * local315 >> 7;
							local383 = arg2[local323][local345 + 1] * (128 - local315) + arg2[local323 + 1][local345 + 1] * local315 >> 7;
							local640 = local371 * (128 - local319) + local383 * local319 >> 7;
							local150.anIntArray69[local289] = this.anIntArray69[local289] + (local640 - arg5) * (arg1 - local300) / arg1;
						}
					} else {
						local150.anIntArray69[local289] = this.anIntArray69[local289];
					}
				}
			} else if (arg0 == 3) {
				local289 = (arg1 & 0xFF) * 4;
				local300 = (arg1 >> 8 & 0xFF) * 4;
				local150.method1044(arg2, arg4, arg5, arg6, local289, local300);
			} else if (arg0 == 4) {
				local289 = this.aShort6 - this.aShort7;
				for (local300 = 0; local300 < this.anInt1113; local300++) {
					local307 = this.anIntArray70[local300] + arg4;
					local311 = this.anIntArray71[local300] + arg6;
					local315 = local307 & 0x7F;
					local319 = local311 & 0x7F;
					local323 = local307 >> 7;
					local345 = local311 >> 7;
					local371 = arg3[local323][local345] * (128 - local315) + arg3[local323 + 1][local345] * local315 >> 7;
					local383 = arg3[local323][local345 + 1] * (128 - local315) + arg3[local323 + 1][local345 + 1] * local315 >> 7;
					local640 = local371 * (128 - local319) + local383 * local319 >> 7;
					local150.anIntArray69[local300] = this.anIntArray69[local300] + local640 + local289 - arg5;
				}
				for (local300 = local150.anInt1113; local300 < local150.anInt1114; local300++) {
					local307 = this.anIntArray70[local300] + arg4;
					local311 = this.anIntArray71[local300] + arg6;
					local315 = local307 & 0x7F;
					local319 = local311 & 0x7F;
					local323 = local307 >> 7;
					local345 = local311 >> 7;
					if (local323 >= 0 && local323 < arg3.length - 1 && local345 >= 0 && local345 < arg3[0].length - 1) {
						local371 = arg3[local323][local345] * (128 - local315) + arg3[local323 + 1][local345] * local315 >> 7;
						local383 = arg3[local323][local345 + 1] * (128 - local315) + arg3[local323 + 1][local345 + 1] * local315 >> 7;
						local640 = local371 * (128 - local319) + local383 * local319 >> 7;
						local150.anIntArray69[local300] = this.anIntArray69[local300] + local640 + local289 - arg5;
					}
				}
			} else if (arg0 == 5) {
				local289 = this.aShort6 - this.aShort7;
				@Pc(1273) int local1273;
				@Pc(1277) int local1277;
				for (local300 = 0; local300 < this.anInt1113; local300++) {
					local307 = this.anIntArray70[local300] + arg4;
					local311 = this.anIntArray71[local300] + arg6;
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
					local150.anIntArray69[local300] = ((this.anIntArray69[local300] << 8) / local289 * local1277 >> 8) - (arg5 - local640);
				}
				for (local300 = local150.anInt1113; local300 < local150.anInt1114; local300++) {
					local307 = this.anIntArray70[local300] + arg4;
					local311 = this.anIntArray71[local300] + arg6;
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
						local150.anIntArray69[local300] = ((this.anIntArray69[local300] << 8) / local289 * local1277 >> 8) - (arg5 - local640);
					}
				}
			}
		}
		local150.aBoolean63 = false;
		return local150;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(ZZLclient!eb;[B[S[I[I[I)Lclient!bf;")
	private Class15_Sub2 method1055(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class15_Sub2_Sub2 arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) short[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7) {
		arg2.anInt1114 = this.anInt1114;
		arg2.anInt1113 = this.anInt1113;
		arg2.anInt1116 = this.anInt1116;
		arg2.anInt1115 = this.anInt1115;
		if (arg2.anIntArray70 == null || arg2.anIntArray70.length < this.anInt1114) {
			arg2.anIntArray70 = new int[this.anInt1114 + 100];
			arg2.anIntArray69 = new int[this.anInt1114 + 100];
			arg2.anIntArray71 = new int[this.anInt1114 + 100];
		}
		@Pc(47) int local47;
		for (local47 = 0; local47 < this.anInt1114; local47++) {
			arg2.anIntArray70[local47] = this.anIntArray70[local47];
			arg2.anIntArray69[local47] = this.anIntArray69[local47];
			arg2.anIntArray71[local47] = this.anIntArray71[local47];
		}
		if (arg0) {
			arg2.aByteArray9 = this.aByteArray9;
		} else {
			arg2.aByteArray9 = arg3;
			if (this.aByteArray9 == null) {
				for (local47 = 0; local47 < this.anInt1116; local47++) {
					arg2.aByteArray9[local47] = 0;
				}
			} else {
				for (local47 = 0; local47 < this.anInt1116; local47++) {
					arg2.aByteArray9[local47] = this.aByteArray9[local47];
				}
			}
		}
		if (arg1) {
			arg2.aShortArray20 = this.aShortArray20;
			arg2.anIntArray73 = this.anIntArray73;
			arg2.anIntArray66 = this.anIntArray66;
			arg2.anIntArray68 = this.anIntArray68;
		} else {
			arg2.aShortArray20 = arg4;
			arg2.anIntArray73 = arg5;
			arg2.anIntArray66 = arg6;
			arg2.anIntArray68 = arg7;
			for (local47 = 0; local47 < this.anInt1116; local47++) {
				arg2.aShortArray20[local47] = this.aShortArray20[local47];
				arg2.anIntArray73[local47] = this.anIntArray73[local47];
				arg2.anIntArray66[local47] = this.anIntArray66[local47];
				arg2.anIntArray68[local47] = this.anIntArray68[local47];
			}
		}
		arg2.anIntArray75 = this.anIntArray75;
		arg2.anIntArray72 = this.anIntArray72;
		arg2.anIntArray76 = this.anIntArray76;
		arg2.aByteArray8 = this.aByteArray8;
		arg2.aByteArray10 = this.aByteArray10;
		arg2.aShortArray22 = this.aShortArray22;
		arg2.aByte5 = this.aByte5;
		arg2.anIntArray67 = this.anIntArray67;
		arg2.anIntArray77 = this.anIntArray77;
		arg2.anIntArray74 = this.anIntArray74;
		arg2.anIntArrayArray10 = this.anIntArrayArray10;
		arg2.anIntArrayArray9 = this.anIntArrayArray9;
		arg2.aShortArray23 = this.aShortArray23;
		arg2.aShortArray21 = this.aShortArray21;
		arg2.aBoolean61 = this.aBoolean61;
		arg2.aBoolean63 = false;
		arg2.aClass180Array2 = this.aClass180Array2;
		arg2.aClass176Array2 = this.aClass176Array2;
		return arg2;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIIIIIIIJILclient!lg;)V")
	@Override
	public void method4678(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class87_Sub2 arg10) {
		if (!this.aBoolean63) {
			this.method1057();
		}
		@Pc(14) int local14 = arg7 * arg4 - arg5 * arg3 >> 16;
		@Pc(24) int local24 = arg6 * arg1 + local14 * arg2 >> 16;
		@Pc(38) int local38 = local24 + (this.aShort10 * arg2 + this.aShort6 * arg1 >> 16);
		@Pc(53) int local53 = local24 + (-this.aShort10 * arg2 + this.aShort7 * arg1 >> 16);
		@Pc(58) int local58;
		@Pc(70) int local70;
		@Pc(87) int local87;
		if (arg10 != null) {
			local58 = arg10.method2707();
			local70 = local24 + (local58 * arg2 + arg1 * 0 >> 16);
			local87 = local24 + (-local58 * arg2 - (arg10.anInt3130 - arg10.anInt3118) * arg1 >> 16);
			if (local87 < local53) {
				local53 = local87;
			}
			if (local70 > local38) {
				local38 = local70;
			}
			arg10.method2711(arg0, arg9, arg5, arg6, arg7);
		}
		if (local38 <= 50 || local53 >= 3500) {
			return;
		}
		local58 = arg7 * arg3 + arg5 * arg4 >> 16;
		local70 = local58 + this.aShort10 << 9;
		if (local70 / local38 <= Static280.anInt5070) {
			return;
		}
		local87 = local58 - this.aShort10 << 9;
		if (local87 / local38 >= Static130.anInt2601) {
			return;
		}
		@Pc(158) int local158 = arg6 * arg2 - local14 * arg1 >> 16;
		@Pc(174) int local174 = local158 + (this.aShort10 * arg1 + this.aShort6 * arg2 >> 16) << 9;
		if (local174 / local38 <= Static126.anInt1742) {
			return;
		}
		@Pc(197) int local197 = local158 + (-this.aShort10 * arg1 + this.aShort7 * arg2 >> 16) << 9;
		if (local197 / local38 >= Static187.anInt3579) {
			return;
		}
		@Pc(205) boolean local205 = false;
		@Pc(212) boolean local212 = local53 <= 50;
		@Pc(221) boolean local221 = local212 || this.anInt1115 > 0;
		@Pc(223) int local223 = Static215.anInt4020;
		@Pc(225) int local225 = Static215.anInt4021;
		@Pc(227) int local227 = 0;
		@Pc(229) int local229 = 0;
		if (arg0 != 0) {
			local227 = Class135.anIntArray335[arg0];
			local229 = Class135.anIntArray338[arg0];
		}
		@Pc(241) boolean local241 = false;
		@Pc(255) int local255;
		@Pc(274) int local274;
		@Pc(259) int local259;
		@Pc(278) int local278;
		@Pc(438) int local438;
		if (arg8 > 0L && Static97.aBoolean108 && local53 > 0) {
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
			if (Static133.anInt2674 >= local255 && Static133.anInt2674 <= local259 && Static221.anInt4091 >= local274 && Static221.anInt4091 <= local278) {
				local255 = 999999;
				local259 = -999999;
				local274 = 999999;
				local278 = -999999;
				@Pc(350) int[] local350 = new int[] { this.aShort11, this.aShort12, this.aShort11, this.aShort12, this.aShort11, this.aShort12, this.aShort11, this.aShort12 };
				@Pc(393) int[] local393 = new int[] { this.aShort8, this.aShort8, this.aShort9, this.aShort9, this.aShort8, this.aShort8, this.aShort9, this.aShort9 };
				@Pc(436) int[] local436 = new int[] { this.aShort7, this.aShort7, this.aShort7, this.aShort7, this.aShort6, this.aShort6, this.aShort6, this.aShort6 };
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
				if (Static133.anInt2674 >= local255 && Static133.anInt2674 <= local259 && Static221.anInt4091 >= local274 && Static221.anInt4091 <= local278) {
					if (this.aBoolean61) {
						Static31.aLongArray4[Static70.anInt1489++] = arg8;
					} else {
						local241 = true;
					}
				}
			}
		}
		@Pc(628) int local628;
		for (local255 = 0; local255 < this.anInt1114; local255++) {
			local274 = this.anIntArray70[local255];
			local259 = this.anIntArray69[local255];
			local278 = this.anIntArray71[local255];
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
			Static58.anIntArray95[local255] = local278 - local24;
			if (local278 >= 50) {
				Static58.anIntArray101[local255] = local223 + (local274 << 9) / local278;
				Static58.anIntArray94[local255] = local225 + (local628 << 9) / local278;
			} else {
				Static58.anIntArray101[local255] = -5000;
				local205 = true;
			}
			if (local221) {
				Static58.anIntArray97[local255] = local274;
				Static58.anIntArray103[local255] = local628;
				Static58.anIntArray89[local255] = local278;
			}
		}
		if (arg10 != null) {
			local255 = Static158.anInt3113 + local223;
			local274 = Static158.anInt3112 + local225;
			for (local259 = 0; local259 < arg10.aClass87_Sub1_Sub1Array2.length; local259++) {
				@Pc(770) Class87_Sub1_Sub1 local770 = arg10.aClass87_Sub1_Sub1Array2[local259];
				if (local770 == null || local770.aBoolean356) {
					Static58.anIntArray107[local259] = Integer.MIN_VALUE;
				} else {
					local628 = (local770.anInt5211 >> 12) - Static160.anInt3163;
					@Pc(789) int local789 = (local770.anInt5210 >> 12) - Static193.anInt3671;
					@Pc(796) int local796 = (local770.anInt5214 >> 12) - Static100.anInt2013;
					local438 = local796 * arg3 + local628 * arg4 >> 16;
					@Pc(816) int local816 = local796 * arg4 - local628 * arg3 >> 16;
					local628 = local438;
					local438 = local789 * arg2 - local816 * arg1 >> 16;
					@Pc(838) int local838 = local789 * arg1 + local816 * arg2 >> 16;
					if (local838 >= 50) {
						Static58.anIntArray99[local259] = local255 + (local628 << 9) / local838;
						Static58.anIntArray93[local259] = local274 + (local438 << 9) / local838;
						Static58.anIntArray96[local259] = local838;
						Static58.anIntArray107[local259] = local838 - local24;
					} else {
						Static58.anIntArray107[local259] = Integer.MIN_VALUE;
					}
				}
			}
		}
		try {
			this.method1060(local205, local241, arg8, local24 - local53, local38 - local53 + 2, arg10);
		} catch (@Pc(901) Exception local901) {
		}
	}

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "(ZZZ)Lclient!bf;")
	@Override
	public Class15_Sub2 method1030(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		if (!arg0 && Static58.aByteArray11.length < this.anInt1116) {
			Static58.aByteArray11 = new byte[this.anInt1116 + 100];
		}
		if (!arg1 && Static58.aShortArray24.length < this.anInt1116) {
			Static58.anIntArray80 = new int[this.anInt1116 + 100];
			Static58.anIntArray78 = new int[this.anInt1116 + 100];
			Static58.anIntArray79 = new int[this.anInt1116 + 100];
			Static58.aShortArray24 = new short[this.anInt1116 + 100];
		}
		return this.method1055(arg0, arg1, Static58.aClass15_Sub2_Sub2_1, Static58.aByteArray11, Static58.aShortArray24, Static58.anIntArray80, Static58.anIntArray78, Static58.anIntArray79);
	}

	@OriginalMember(owner = "client!eb", name = "d", descriptor = "(I)V")
	@Override
	public void method1041(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class135.anIntArray335[arg0];
		@Pc(7) int local7 = Class135.anIntArray338[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt1114; local9++) {
			@Pc(29) int local29 = this.anIntArray69[local9] * local7 - this.anIntArray71[local9] * local3 >> 16;
			this.anIntArray71[local9] = this.anIntArray69[local9] * local3 + this.anIntArray71[local9] * local7 >> 16;
			this.anIntArray69[local9] = local29;
		}
		this.aBoolean63 = false;
	}

	@OriginalMember(owner = "client!eb", name = "c", descriptor = "(ZZZ)Lclient!bf;")
	@Override
	public Class15_Sub2 method1032(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		if (!arg0 && Static58.aByteArray12.length < this.anInt1116) {
			Static58.aByteArray12 = new byte[this.anInt1116 + 100];
		}
		if (!arg1 && Static58.aShortArray25.length < this.anInt1116) {
			Static58.anIntArray82 = new int[this.anInt1116 + 100];
			Static58.anIntArray83 = new int[this.anInt1116 + 100];
			Static58.anIntArray81 = new int[this.anInt1116 + 100];
			Static58.aShortArray25 = new short[this.anInt1116 + 100];
		}
		return this.method1055(arg0, arg1, Static58.aClass15_Sub2_Sub2_2, Static58.aByteArray12, Static58.aShortArray25, Static58.anIntArray82, Static58.anIntArray83, Static58.anIntArray81);
	}

	@OriginalMember(owner = "client!eb", name = "d", descriptor = "()I")
	@Override
	public int method1021() {
		if (!this.aBoolean63) {
			this.method1057();
		}
		return this.aShort10;
	}

	@OriginalMember(owner = "client!eb", name = "p", descriptor = "()V")
	private void method1057() {
		@Pc(1) int local1 = 32767;
		@Pc(3) int local3 = 32767;
		@Pc(5) int local5 = 32767;
		@Pc(7) int local7 = -32768;
		@Pc(9) int local9 = -32768;
		@Pc(11) int local11 = -32768;
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < this.anInt1113; local17++) {
			@Pc(26) int local26 = this.anIntArray70[local17];
			@Pc(31) int local31 = this.anIntArray69[local17];
			@Pc(36) int local36 = this.anIntArray71[local17];
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
		this.aShort11 = (short) local1;
		this.aShort12 = (short) local7;
		this.aShort7 = (short) local3;
		this.aShort6 = (short) local9;
		this.aShort8 = (short) local5;
		this.aShort9 = (short) local11;
		this.aShort10 = (short) (Math.sqrt((double) local13) + 0.99D);
		this.aShort13 = (short) (Math.sqrt((double) local15) + 0.99D);
		this.aBoolean63 = true;
	}

	@OriginalMember(owner = "client!eb", name = "k", descriptor = "()V")
	@Override
	public void method1042() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1114; local1++) {
			@Pc(10) int local10 = this.anIntArray70[local1];
			this.anIntArray70[local1] = this.anIntArray71[local1];
			this.anIntArray71[local1] = -local10;
		}
		this.aBoolean63 = false;
	}

	@OriginalMember(owner = "client!eb", name = "h", descriptor = "()I")
	@Override
	public int method1031() {
		if (!this.aBoolean63) {
			this.method1057();
		}
		return this.aShort8;
	}

	@OriginalMember(owner = "client!eb", name = "i", descriptor = "()I")
	@Override
	public int method1033() {
		if (!this.aBoolean63) {
			this.method1057();
		}
		return this.aShort12;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(ZZJIILclient!lg;)V")
	private void method1060(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) long arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class87_Sub2 arg5) {
		if (arg4 >= 1600) {
			return;
		}
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		@Pc(11) int local11;
		if (!Static58.aBoolean64) {
			for (local11 = 0; local11 < 1600; local11++) {
				anIntArray85[local11] = 0;
			}
			for (local11 = 0; local11 < 32; local11++) {
				anIntArray90[local11] = 0;
			}
			Static58.anInt1119 = 0;
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
		for (local11 = 0; local11 < this.anInt1116; local11++) {
			if (this.anIntArray68[local11] != -2) {
				local51 = this.anIntArray75[local11];
				local56 = this.anIntArray72[local11];
				local61 = this.anIntArray76[local11];
				local65 = Static58.anIntArray101[local51];
				local69 = Static58.anIntArray101[local56];
				local73 = Static58.anIntArray101[local61];
				if (arg0 && (local65 == -5000 || local69 == -5000 || local73 == -5000)) {
					local88 = Static58.anIntArray97[local51];
					local92 = Static58.anIntArray97[local56];
					local96 = Static58.anIntArray97[local61];
					local100 = Static58.anIntArray103[local51];
					local104 = Static58.anIntArray103[local56];
					local108 = Static58.anIntArray103[local61];
					local112 = Static58.anIntArray89[local51];
					@Pc(116) int local116 = Static58.anIntArray89[local56];
					local120 = Static58.anIntArray89[local61];
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
						Static58.aBooleanArray4[local11] = true;
						if (Static58.aBoolean64) {
							anIntArray108[local5] = (Static58.anIntArray95[local51] + Static58.anIntArray95[local56] + Static58.anIntArray95[local61]) / 3;
							anIntArray104[local5++] = local11;
						} else {
							@Pc(224) int local224 = (Static58.anIntArray95[local51] + Static58.anIntArray95[local56] + Static58.anIntArray95[local61]) / 3 + arg3;
							if (anIntArray85[local224] < 64) {
								anIntArrayArray11[local224][anIntArray85[local224]++] = local11;
							} else {
								@Pc(247) int local247 = anIntArray85[local224];
								if (local247 == 64) {
									if (Static58.anInt1119 == 512) {
										continue;
									}
									anIntArray85[local224] = local247 = Static58.anInt1119++ + 65;
								}
								local247 -= 65;
								anIntArrayArray13[local247][anIntArray90[local247]++] = local11;
							}
						}
					}
				} else {
					if (arg1 && this.method1048(Static133.anInt2674 + Static215.anInt4020, Static221.anInt4091 + Static215.anInt4021, Static58.anIntArray94[local51], Static58.anIntArray94[local56], Static58.anIntArray94[local61], local65, local69, local73)) {
						Static31.aLongArray4[Static70.anInt1489++] = arg2;
						arg1 = false;
					}
					if ((local65 - local69) * (Static58.anIntArray94[local61] - Static58.anIntArray94[local56]) - (Static58.anIntArray94[local51] - Static58.anIntArray94[local56]) * (local73 - local69) > 0) {
						Static58.aBooleanArray4[local11] = false;
						if (local65 >= 0 && local69 >= 0 && local73 >= 0 && local65 <= Static215.anInt4024 && local69 <= Static215.anInt4024 && local73 <= Static215.anInt4024) {
							Static58.aBooleanArray3[local11] = false;
						} else {
							Static58.aBooleanArray3[local11] = true;
						}
						if (Static58.aBoolean64) {
							anIntArray108[local5] = (Static58.anIntArray95[local51] + Static58.anIntArray95[local56] + Static58.anIntArray95[local61]) / 3;
							anIntArray104[local5++] = local11;
						} else {
							local88 = (Static58.anIntArray95[local51] + Static58.anIntArray95[local56] + Static58.anIntArray95[local61]) / 3 + arg3;
							if (anIntArray85[local88] < 64) {
								anIntArrayArray11[local88][anIntArray85[local88]++] = local11;
							} else {
								local92 = anIntArray85[local88];
								if (local92 == 64) {
									if (Static58.anInt1119 == 512) {
										continue;
									}
									anIntArray85[local88] = local92 = Static58.anInt1119++ + 65;
								}
								local92 -= 65;
								anIntArrayArray13[local92][anIntArray90[local92]++] = local11;
							}
						}
					}
				}
			}
		}
		if (arg5 != null && !Static58.aBoolean64) {
			for (local11 = 0; local11 < Static58.anIntArray107.length; local11++) {
				local51 = Static58.anIntArray107[local11] + arg3;
				if (local51 >= 0 && local51 < 1600) {
					if (anIntArray85[local51] < 64) {
						anIntArrayArray11[local51][anIntArray85[local51]++] = local11 + 1 << 16;
					} else {
						local56 = anIntArray85[local51];
						if (local56 == 64) {
							if (Static58.anInt1119 == 512) {
								continue;
							}
							anIntArray85[local51] = local56 = Static58.anInt1119++ + 65;
						}
						local56 -= 65;
						anIntArrayArray13[local56][anIntArray90[local56]++] = local11 + 1 << 16;
					}
				}
			}
		}
		if (Static58.aBoolean64) {
			Static140.method4446(0, local5 - 1, anIntArray108, anIntArray104);
			if (this.aByteArray8 == null) {
				for (local11 = 0; local11 < local5; local11++) {
					this.method1053(anIntArray104[local11]);
				}
				return;
			}
			for (local11 = 0; local11 < 12; local11++) {
				Static58.anIntArray88[local11] = 0;
				Static58.anIntArray102[local11] = 0;
			}
			for (local11 = 0; local11 < local5; local11++) {
				local51 = anIntArray104[local11];
				local56 = anIntArray108[local11];
				@Pc(610) byte local610 = this.aByteArray8[local51];
				local65 = Static58.anIntArray88[local610]++;
				Static58.anIntArrayArray12[local610][local65] = local51;
				if (local610 < 10) {
					Static58.anIntArray102[local610] += local56;
				} else if (local610 == 10) {
					Static58.anIntArray98[local65] = local56;
				} else {
					Static58.anIntArray84[local65] = local56;
				}
			}
		} else {
			@Pc(677) int[] local677;
			if (this.aByteArray8 == null) {
				for (local11 = arg4 - 1; local11 >= 0; local11--) {
					local51 = anIntArray85[local11];
					@Pc(706) Class87_Sub1_Sub1 local706;
					if (local51 > 0) {
						local56 = local51 > 64 ? 64 : local51;
						local677 = anIntArrayArray11[local11];
						for (local65 = 0; local65 < local56; local65++) {
							local69 = local677[local65];
							if (local69 < 65536) {
								this.method1053(local677[local65]);
							} else {
								local73 = (local69 >> 16) - 1;
								local706 = arg5.aClass87_Sub1_Sub1Array2[local73];
								local92 = Static58.anIntArray96[local73] * 400;
								if (local92 == 0) {
									local92 = 1;
								}
								Static25.method391(Static58.anIntArray99[local73], Static58.anIntArray93[local73], (local706.aClass87_Sub3_1.aClass165_2.anInt4790 << 16) / local92, local706.anInt5215, local706.anInt5215 >> 24 & 0xFF);
							}
						}
					}
					if (local51 > 64) {
						local56 = anIntArray85[local11] - 64 - 1;
						local677 = anIntArrayArray13[local56];
						for (local65 = 0; local65 < anIntArray90[local56]; local65++) {
							local69 = local677[local65];
							if (local69 < 65536) {
								this.method1053(local677[local65]);
							} else {
								local73 = (local69 >> 16) - 1;
								local706 = arg5.aClass87_Sub1_Sub1Array2[local73];
								local92 = Static58.anIntArray96[local73] * 400;
								if (local92 == 0) {
									local92 = 1;
								}
								Static25.method391(Static58.anIntArray99[local73], Static58.anIntArray93[local73], (local706.aClass87_Sub3_1.aClass165_2.anInt4790 << 16) / local92, local706.anInt5215, local706.anInt5215 >> 24 & 0xFF);
							}
						}
					}
				}
				return;
			}
			for (local11 = 0; local11 < 12; local11++) {
				Static58.anIntArray88[local11] = 0;
				Static58.anIntArray102[local11] = 0;
			}
			for (local11 = arg4 - 1; local11 >= 0; local11--) {
				local51 = anIntArray85[local11];
				@Pc(881) byte local881;
				if (local51 > 0) {
					if (local51 > 64) {
						local56 = 64;
					} else {
						local56 = local51;
					}
					local677 = anIntArrayArray11[local11];
					for (local65 = 0; local65 < local56; local65++) {
						local69 = local677[local65];
						if (local69 < 65536) {
							local881 = this.aByteArray8[local69];
							local88 = Static58.anIntArray88[local881]++;
							Static58.anIntArrayArray12[local881][local88] = local69;
							if (local881 < 10) {
								Static58.anIntArray102[local881] += local11;
							} else if (local881 == 10) {
								Static58.anIntArray98[local88] = local11;
							} else {
								Static58.anIntArray84[local88] = local11;
							}
						} else {
							Static58.anIntArray92[local7++] = (local69 >> 16) - 1;
						}
					}
				}
				if (local51 > 64) {
					local56 = anIntArray85[local11] - 64 - 1;
					local677 = anIntArrayArray13[local56];
					for (local65 = 0; local65 < anIntArray90[local56]; local65++) {
						local69 = local677[local65];
						if (local69 < 65536) {
							local881 = this.aByteArray8[local69];
							local88 = Static58.anIntArray88[local881]++;
							Static58.anIntArrayArray12[local881][local88] = local69;
							if (local881 < 10) {
								Static58.anIntArray102[local881] += local11;
							} else if (local881 == 10) {
								Static58.anIntArray98[local88] = local11;
							} else {
								Static58.anIntArray84[local88] = local11;
							}
						} else {
							Static58.anIntArray92[local7++] = (local69 >> 16) - 1;
						}
					}
				}
			}
		}
		local11 = 0;
		if (Static58.anIntArray88[1] > 0 || Static58.anIntArray88[2] > 0) {
			local11 = (Static58.anIntArray102[1] + Static58.anIntArray102[2]) / (Static58.anIntArray88[1] + Static58.anIntArray88[2]);
		}
		local51 = 0;
		if (Static58.anIntArray88[3] > 0 || Static58.anIntArray88[4] > 0) {
			local51 = (Static58.anIntArray102[3] + Static58.anIntArray102[4]) / (Static58.anIntArray88[3] + Static58.anIntArray88[4]);
		}
		local56 = 0;
		if (Static58.anIntArray88[6] > 0 || Static58.anIntArray88[8] > 0) {
			local56 = (Static58.anIntArray102[6] + Static58.anIntArray102[8]) / (Static58.anIntArray88[6] + Static58.anIntArray88[8]);
		}
		local65 = 0;
		local69 = Static58.anIntArray88[10];
		@Pc(1105) int[] local1105 = Static58.anIntArrayArray12[10];
		@Pc(1107) int[] local1107 = Static58.anIntArray98;
		local92 = 0;
		if (local69 == 0) {
			local65 = 0;
			local69 = Static58.anIntArray88[11];
			local1105 = Static58.anIntArrayArray12[11];
			local1107 = Static58.anIntArray84;
		}
		if (local69 > 0) {
			local61 = local1107[0];
		} else {
			local61 = -1000;
		}
		for (local96 = 0; local96 < 10; local96++) {
			while (local96 == 0 && local61 > local11) {
				this.method1053(local1105[local65++]);
				if (local65 == local69 && local1105 != Static58.anIntArrayArray12[11]) {
					local65 = 0;
					local69 = Static58.anIntArray88[11];
					local1105 = Static58.anIntArrayArray12[11];
					local1107 = Static58.anIntArray84;
				}
				if (local65 < local69) {
					local61 = local1107[local65];
				} else {
					local61 = -1000;
				}
			}
			while (local96 == 3 && local61 > local51) {
				this.method1053(local1105[local65++]);
				if (local65 == local69 && local1105 != Static58.anIntArrayArray12[11]) {
					local65 = 0;
					local69 = Static58.anIntArray88[11];
					local1105 = Static58.anIntArrayArray12[11];
					local1107 = Static58.anIntArray84;
				}
				if (local65 < local69) {
					local61 = local1107[local65];
				} else {
					local61 = -1000;
				}
			}
			while (local96 == 5 && local61 > local56) {
				this.method1053(local1105[local65++]);
				if (local65 == local69 && local1105 != Static58.anIntArrayArray12[11]) {
					local65 = 0;
					local69 = Static58.anIntArray88[11];
					local1105 = Static58.anIntArrayArray12[11];
					local1107 = Static58.anIntArray84;
				}
				if (local65 < local69) {
					local61 = local1107[local65];
				} else {
					local61 = -1000;
				}
			}
			local100 = Static58.anIntArray88[local96];
			@Pc(1275) int[] local1275 = Static58.anIntArrayArray12[local96];
			if (arg5 != null) {
				local108 = Integer.MAX_VALUE;
				if (local100 != 0) {
					local108 = Static58.anIntArray102[local96] / local100;
				}
				for (local112 = Static58.anIntArray92[local92]; Static58.anIntArray107[local112] + arg3 > local108; local112 = Static58.anIntArray92[local92++]) {
					@Pc(1303) Class87_Sub1_Sub1 local1303 = arg5.aClass87_Sub1_Sub1Array2[local112];
					local120 = Static58.anIntArray96[local112] * 400;
					if (local120 == 0) {
						local120 = 1;
					}
					Static25.method391(Static58.anIntArray99[local112], Static58.anIntArray93[local112], (local1303.aClass87_Sub3_1.aClass165_2.anInt4790 << 16) / local120, local1303.anInt5215, local1303.anInt5215 >> 24 & 0xFF);
					if (local92 >= local7) {
						break;
					}
				}
			}
			for (local108 = 0; local108 < local100; local108++) {
				this.method1053(local1275[local108]);
			}
		}
		while (local61 != -1000) {
			this.method1053(local1105[local65++]);
			if (local65 == local69 && local1105 != Static58.anIntArrayArray12[11]) {
				local65 = 0;
				local1105 = Static58.anIntArrayArray12[11];
				local69 = Static58.anIntArray88[11];
				local1107 = Static58.anIntArray84;
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
		local96 = Static58.anIntArray92[local92];
		while (local92 < local7) {
			@Pc(1413) Class87_Sub1_Sub1 local1413 = arg5.aClass87_Sub1_Sub1Array2[local96];
			local104 = Static58.anIntArray96[local96] * 400;
			if (local104 == 0) {
				local104 = 1;
			}
			Static25.method391(Static58.anIntArray99[local96], Static58.anIntArray93[local96], (local1413.aClass87_Sub3_1.aClass165_2.anInt4790 << 16) / local104, local1413.anInt5215, local1413.anInt5215 >> 24 & 0xFF);
			local96 = Static58.anIntArray92[local92++];
		}
	}

	@OriginalMember(owner = "client!eb", name = "m", descriptor = "()V")
	@Override
	public void method1045() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1114; local1++) {
			this.anIntArray70[local1] = -this.anIntArray70[local1];
			this.anIntArray71[local1] = -this.anIntArray71[local1];
		}
		this.aBoolean63 = false;
	}

	@OriginalMember(owner = "client!eb", name = "r", descriptor = "()V")
	private void method1061() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1116; local1++) {
			@Pc(15) short local15 = this.aShortArray22 == null ? -1 : this.aShortArray22[local1];
			if (local15 == -1) {
				@Pc(25) int local25 = this.aShortArray20[local1] & 0xFFFF;
				@Pc(38) int local38;
				if (this.anIntArray68[local1] == -1) {
					local38 = this.anIntArray73[local1] & 0xFFFE0000;
					this.anIntArray73[local1] = local38 | Static58.method1051(local25, local38 >> 17);
				} else if (this.anIntArray68[local1] != -2) {
					local38 = this.anIntArray73[local1] & 0xFFFE0000;
					this.anIntArray73[local1] = local38 | Static58.method1051(local25, local38 >> 17);
					local38 = this.anIntArray66[local1] & 0xFFFE0000;
					this.anIntArray66[local1] = local38 | Static58.method1051(local25, local38 >> 17);
					local38 = this.anIntArray68[local1] & 0xFFFE0000;
					this.anIntArray68[local1] = local38 | Static58.method1051(local25, local38 >> 17);
				}
			}
		}
	}

	@OriginalMember(owner = "client!eb", name = "c", descriptor = "()I")
	@Override
	public int method1018() {
		if (!this.aBoolean63) {
			this.method1057();
		}
		return this.aShort9;
	}
}
