import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bb")
public final class Class13_Sub1_Sub1 extends Class13_Sub1 {

	@OriginalMember(owner = "client!bb", name = "rb", descriptor = "[I")
	public static int[] anIntArray33;

	@OriginalMember(owner = "client!bb", name = "zb", descriptor = "[I")
	public static int[] anIntArray39;

	@OriginalMember(owner = "client!bb", name = "ub", descriptor = "[I")
	public static int[] anIntArray34;

	@OriginalMember(owner = "client!bb", name = "Bb", descriptor = "[[I")
	public static int[][] anIntArrayArray6;

	@OriginalMember(owner = "client!bb", name = "Hb", descriptor = "[I")
	public static int[] anIntArray46;

	@OriginalMember(owner = "client!bb", name = "pb", descriptor = "[[I")
	public static int[][] anIntArrayArray4;

	@OriginalMember(owner = "client!bb", name = "p", descriptor = "S")
	private short aShort3;

	@OriginalMember(owner = "client!bb", name = "q", descriptor = "[[I")
	private int[][] anIntArrayArray2;

	@OriginalMember(owner = "client!bb", name = "r", descriptor = "[[I")
	private int[][] anIntArrayArray3;

	@OriginalMember(owner = "client!bb", name = "s", descriptor = "S")
	private short aShort4;

	@OriginalMember(owner = "client!bb", name = "t", descriptor = "[I")
	private int[] anIntArray14;

	@OriginalMember(owner = "client!bb", name = "u", descriptor = "[S")
	private short[] aShortArray3;

	@OriginalMember(owner = "client!bb", name = "v", descriptor = "[Lclient!go;")
	public Class62[] aClass62Array1;

	@OriginalMember(owner = "client!bb", name = "x", descriptor = "[S")
	private short[] aShortArray4;

	@OriginalMember(owner = "client!bb", name = "y", descriptor = "S")
	private short aShort5;

	@OriginalMember(owner = "client!bb", name = "z", descriptor = "[I")
	public int[] anIntArray15;

	@OriginalMember(owner = "client!bb", name = "A", descriptor = "[I")
	private int[] anIntArray16;

	@OriginalMember(owner = "client!bb", name = "C", descriptor = "[I")
	private int[] anIntArray17;

	@OriginalMember(owner = "client!bb", name = "E", descriptor = "[I")
	private int[] anIntArray18;

	@OriginalMember(owner = "client!bb", name = "F", descriptor = "[I")
	private int[] anIntArray19;

	@OriginalMember(owner = "client!bb", name = "G", descriptor = "[I")
	public int[] anIntArray20;

	@OriginalMember(owner = "client!bb", name = "I", descriptor = "S")
	private short aShort6;

	@OriginalMember(owner = "client!bb", name = "J", descriptor = "[B")
	private byte[] aByteArray3;

	@OriginalMember(owner = "client!bb", name = "L", descriptor = "[I")
	private int[] anIntArray21;

	@OriginalMember(owner = "client!bb", name = "N", descriptor = "[I")
	public int[] anIntArray22;

	@OriginalMember(owner = "client!bb", name = "O", descriptor = "[Lclient!kd;")
	public Class88[] aClass88Array1;

	@OriginalMember(owner = "client!bb", name = "P", descriptor = "S")
	private short aShort7;

	@OriginalMember(owner = "client!bb", name = "Q", descriptor = "S")
	private short aShort8;

	@OriginalMember(owner = "client!bb", name = "R", descriptor = "[B")
	private byte[] aByteArray4;

	@OriginalMember(owner = "client!bb", name = "S", descriptor = "S")
	private short aShort9;

	@OriginalMember(owner = "client!bb", name = "T", descriptor = "[I")
	private int[] anIntArray23;

	@OriginalMember(owner = "client!bb", name = "V", descriptor = "[S")
	private short[] aShortArray5;

	@OriginalMember(owner = "client!bb", name = "W", descriptor = "[S")
	private short[] aShortArray6;

	@OriginalMember(owner = "client!bb", name = "X", descriptor = "S")
	private short aShort10;

	@OriginalMember(owner = "client!bb", name = "Z", descriptor = "[I")
	private int[] anIntArray24;

	@OriginalMember(owner = "client!bb", name = "cb", descriptor = "[I")
	private int[] anIntArray25;

	@OriginalMember(owner = "client!bb", name = "hb", descriptor = "[B")
	private byte[] aByteArray6;

	@OriginalMember(owner = "client!bb", name = "w", descriptor = "Z")
	public boolean aBoolean29 = false;

	@OriginalMember(owner = "client!bb", name = "B", descriptor = "Z")
	private boolean aBoolean30 = false;

	@OriginalMember(owner = "client!bb", name = "D", descriptor = "I")
	public int anInt422 = 0;

	@OriginalMember(owner = "client!bb", name = "M", descriptor = "B")
	private byte aByte1 = 0;

	@OriginalMember(owner = "client!bb", name = "Y", descriptor = "I")
	private int anInt425 = 0;

	@OriginalMember(owner = "client!bb", name = "U", descriptor = "I")
	private int anInt424 = 0;

	@OriginalMember(owner = "client!bb", name = "H", descriptor = "I")
	private int anInt423 = 0;

	static {
		if (Static18.aBoolean31) {
			anIntArray33 = new int[4096];
			anIntArray39 = new int[4096];
		} else {
			anIntArray34 = new int[1600];
			anIntArrayArray6 = new int[1600][64];
			anIntArray46 = new int[32];
			anIntArrayArray4 = new int[32][512];
		}
	}

	@OriginalMember(owner = "client!bb", name = "<init>", descriptor = "()V")
	public Class13_Sub1_Sub1() {
	}

	@OriginalMember(owner = "client!bb", name = "<init>", descriptor = "(Lclient!ud;IIIII)V")
	public Class13_Sub1_Sub1(@OriginalArg(0) Class13_Sub7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg0.method4290();
		arg0.method4294();
		this.anInt422 = arg0.anInt5391;
		this.anInt424 = arg0.anInt5389;
		this.anIntArray15 = arg0.anIntArray433;
		this.anIntArray22 = arg0.anIntArray434;
		this.anIntArray20 = arg0.anIntArray430;
		this.anInt425 = arg0.anInt5390;
		this.anIntArray21 = arg0.anIntArray432;
		this.anIntArray16 = arg0.anIntArray424;
		this.anIntArray19 = arg0.anIntArray426;
		this.aByteArray4 = arg0.aByteArray65;
		this.aByteArray6 = arg0.aByteArray66;
		this.aByte1 = arg0.aByte21;
		this.aShortArray4 = arg0.aShortArray91;
		this.anIntArrayArray3 = arg0.anIntArrayArray36;
		this.anIntArrayArray2 = arg0.anIntArrayArray35;
		this.aShortArray3 = arg0.aShortArray87;
		this.aClass62Array1 = arg0.aClass62Array3;
		this.aClass88Array1 = arg0.aClass88Array3;
		this.aShortArray6 = arg0.aShortArray92;
		@Pc(117) int local117 = (int) Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5));
		@Pc(123) int local123 = arg2 * local117 >> 8;
		this.anIntArray14 = new int[this.anInt425];
		this.anIntArray18 = new int[this.anInt425];
		this.anIntArray24 = new int[this.anInt425];
		@Pc(148) int local148;
		if (arg0.aShortArray89 == null) {
			this.aShortArray5 = null;
		} else {
			this.aShortArray5 = new short[this.anInt425];
			for (local148 = 0; local148 < this.anInt425; local148++) {
				@Pc(157) short local157 = arg0.aShortArray89[local148];
				if (local157 != -1 && Static283.anInterface1_1.method2433(local157)) {
					this.aShortArray5[local148] = local157;
				} else {
					this.aShortArray5[local148] = -1;
				}
			}
		}
		if (arg0.anInt5392 > 0 && arg0.aByteArray68 != null) {
			@Pc(192) int[] local192 = new int[arg0.anInt5392];
			@Pc(194) int local194;
			for (local194 = 0; local194 < this.anInt425; local194++) {
				if (arg0.aByteArray68[local194] != -1) {
					local192[arg0.aByteArray68[local194] & 0xFF]++;
				}
			}
			this.anInt423 = 0;
			for (local194 = 0; local194 < arg0.anInt5392; local194++) {
				if (local192[local194] > 0 && arg0.aByteArray67[local194] == 0) {
					this.anInt423++;
				}
			}
			this.anIntArray23 = new int[this.anInt423];
			this.anIntArray25 = new int[this.anInt423];
			this.anIntArray17 = new int[this.anInt423];
			local194 = 0;
			@Pc(263) int local263;
			for (local263 = 0; local263 < arg0.anInt5392; local263++) {
				if (local192[local263] > 0 && arg0.aByteArray67[local263] == 0) {
					this.anIntArray23[local194] = arg0.aShortArray86[local263] & 0xFFFF;
					this.anIntArray25[local194] = arg0.aShortArray83[local263] & 0xFFFF;
					this.anIntArray17[local194] = arg0.aShortArray84[local263] & 0xFFFF;
					local192[local263] = local194++;
				} else {
					local192[local263] = -1;
				}
			}
			this.aByteArray3 = new byte[this.anInt425];
			for (local263 = 0; local263 < this.anInt425; local263++) {
				if (arg0.aByteArray68[local263] == -1) {
					this.aByteArray3[local263] = -1;
				} else {
					this.aByteArray3[local263] = (byte) local192[arg0.aByteArray68[local263] & 0xFF];
					if (this.aByteArray3[local263] == -1 && this.aShortArray5 != null) {
						this.aShortArray5[local263] = -1;
					}
				}
			}
		}
		for (local148 = 0; local148 < this.anInt425; local148++) {
			@Pc(381) byte local381;
			if (arg0.aByteArray70 == null) {
				local381 = 0;
			} else {
				local381 = arg0.aByteArray70[local148];
			}
			@Pc(392) byte local392;
			if (arg0.aByteArray66 == null) {
				local392 = 0;
			} else {
				local392 = arg0.aByteArray66[local148];
			}
			@Pc(403) short local403;
			if (this.aShortArray5 == null) {
				local403 = -1;
			} else {
				local403 = this.aShortArray5[local148];
			}
			if (local392 == -2) {
				local381 = 3;
			}
			if (local392 == -1) {
				local381 = 2;
			}
			@Pc(450) Class8 local450;
			@Pc(483) int local483;
			@Pc(629) Class81 local629;
			if (local403 == -1) {
				if (local381 == 0) {
					@Pc(431) int local431 = arg0.aShortArray91[local148] & 0xFFFF;
					if (arg0.aClass8Array1 == null || arg0.aClass8Array1[this.anIntArray21[local148]] == null) {
						local450 = arg0.aClass8Array2[this.anIntArray21[local148]];
					} else {
						local450 = arg0.aClass8Array1[this.anIntArray21[local148]];
					}
					local483 = arg1 + (arg3 * local450.anInt154 + arg4 * local450.anInt153 + arg5 * local450.anInt151) / (local123 * local450.anInt150) << 17;
					this.anIntArray14[local148] = local483 | Static18.method411(local431, local483 >> 17);
					if (arg0.aClass8Array1 == null || arg0.aClass8Array1[this.anIntArray16[local148]] == null) {
						local450 = arg0.aClass8Array2[this.anIntArray16[local148]];
					} else {
						local450 = arg0.aClass8Array1[this.anIntArray16[local148]];
					}
					local483 = arg1 + (arg3 * local450.anInt154 + arg4 * local450.anInt153 + arg5 * local450.anInt151) / (local123 * local450.anInt150) << 17;
					this.anIntArray18[local148] = local483 | Static18.method411(local431, local483 >> 17);
					if (arg0.aClass8Array1 == null || arg0.aClass8Array1[this.anIntArray19[local148]] == null) {
						local450 = arg0.aClass8Array2[this.anIntArray19[local148]];
					} else {
						local450 = arg0.aClass8Array1[this.anIntArray19[local148]];
					}
					local483 = arg1 + (arg3 * local450.anInt154 + arg4 * local450.anInt153 + arg5 * local450.anInt151) / (local123 * local450.anInt150) << 17;
					this.anIntArray24[local148] = local483 | Static18.method411(local431, local483 >> 17);
				} else if (local381 == 1) {
					local629 = arg0.aClass81Array1[local148];
					local483 = arg1 + (arg3 * local629.anInt2514 + arg4 * local629.anInt2517 + arg5 * local629.anInt2516) / (local123 + local123 / 2) << 17;
					this.anIntArray14[local148] = local483 | Static18.method411(arg0.aShortArray91[local148] & 0xFFFF, local483 >> 17);
					this.anIntArray24[local148] = -1;
				} else if (local381 == 3) {
					this.anIntArray14[local148] = 128;
					this.anIntArray24[local148] = -1;
				} else {
					this.anIntArray24[local148] = -2;
				}
			} else if (local381 == 0) {
				if (arg0.aClass8Array1 == null || arg0.aClass8Array1[this.anIntArray21[local148]] == null) {
					local450 = arg0.aClass8Array2[this.anIntArray21[local148]];
				} else {
					local450 = arg0.aClass8Array1[this.anIntArray21[local148]];
				}
				local483 = arg1 + (arg3 * local450.anInt154 + arg4 * local450.anInt153 + arg5 * local450.anInt151) / (local123 * local450.anInt150);
				this.anIntArray14[local148] = Static18.method407(local483);
				if (arg0.aClass8Array1 == null || arg0.aClass8Array1[this.anIntArray16[local148]] == null) {
					local450 = arg0.aClass8Array2[this.anIntArray16[local148]];
				} else {
					local450 = arg0.aClass8Array1[this.anIntArray16[local148]];
				}
				local483 = arg1 + (arg3 * local450.anInt154 + arg4 * local450.anInt153 + arg5 * local450.anInt151) / (local123 * local450.anInt150);
				this.anIntArray18[local148] = Static18.method407(local483);
				if (arg0.aClass8Array1 == null || arg0.aClass8Array1[this.anIntArray19[local148]] == null) {
					local450 = arg0.aClass8Array2[this.anIntArray19[local148]];
				} else {
					local450 = arg0.aClass8Array1[this.anIntArray19[local148]];
				}
				local483 = arg1 + (arg3 * local450.anInt154 + arg4 * local450.anInt153 + arg5 * local450.anInt151) / (local123 * local450.anInt150);
				this.anIntArray24[local148] = Static18.method407(local483);
			} else if (local381 == 1) {
				local629 = arg0.aClass81Array1[local148];
				local483 = arg1 + (arg3 * local629.anInt2514 + arg4 * local629.anInt2517 + arg5 * local629.anInt2516) / (local123 + local123 / 2);
				this.anIntArray14[local148] = Static18.method407(local483);
				this.anIntArray24[local148] = -1;
			} else {
				this.anIntArray24[local148] = -2;
			}
		}
	}

	@OriginalMember(owner = "client!bb", name = "<init>", descriptor = "([Lclient!bb;I)V")
	private Class13_Sub1_Sub1(@OriginalArg(0) Class13_Sub1_Sub1[] arg0, @OriginalArg(1) int arg1) {
		@Pc(24) boolean local24 = false;
		@Pc(26) boolean local26 = false;
		@Pc(28) boolean local28 = false;
		@Pc(30) boolean local30 = false;
		this.anInt422 = 0;
		this.anInt425 = 0;
		this.anInt423 = 0;
		@Pc(41) int local41 = 0;
		@Pc(43) int local43 = 0;
		this.aByte1 = -1;
		@Pc(48) int local48;
		@Pc(55) Class13_Sub1_Sub1 local55;
		for (local48 = 0; local48 < arg1; local48++) {
			local55 = arg0[local48];
			if (local55 != null) {
				this.anInt422 += local55.anInt422;
				this.anInt425 += local55.anInt425;
				this.anInt423 += local55.anInt423;
				if (local55.aByteArray4 == null) {
					if (this.aByte1 == -1) {
						this.aByte1 = local55.aByte1;
					}
					if (this.aByte1 != local55.aByte1) {
						local24 = true;
					}
				} else {
					local24 = true;
				}
				local26 |= local55.aByteArray6 != null;
				local28 |= local55.aShortArray5 != null;
				local30 |= local55.aByteArray3 != null;
				if (local55.aClass62Array1 != null) {
					local41 += local55.aClass62Array1.length;
				}
				if (local55.aClass88Array1 != null) {
					local43 += local55.aClass88Array1.length;
				}
			}
		}
		this.anIntArray15 = new int[this.anInt422];
		this.anIntArray22 = new int[this.anInt422];
		this.anIntArray20 = new int[this.anInt422];
		this.anIntArray21 = new int[this.anInt425];
		this.anIntArray16 = new int[this.anInt425];
		this.anIntArray19 = new int[this.anInt425];
		this.anIntArray14 = new int[this.anInt425];
		this.anIntArray18 = new int[this.anInt425];
		this.anIntArray24 = new int[this.anInt425];
		if (local24) {
			this.aByteArray4 = new byte[this.anInt425];
		}
		if (local26) {
			this.aByteArray6 = new byte[this.anInt425];
		}
		if (local28) {
			this.aShortArray5 = new short[this.anInt425];
		}
		if (local30) {
			this.aByteArray3 = new byte[this.anInt425];
		}
		if (this.anInt423 > 0) {
			this.anIntArray23 = new int[this.anInt423];
			this.anIntArray25 = new int[this.anInt423];
			this.anIntArray17 = new int[this.anInt423];
		}
		if (local41 > 0) {
			this.aClass62Array1 = new Class62[local41];
		}
		if (local43 > 0) {
			this.aClass88Array1 = new Class88[local43];
		}
		this.aShortArray4 = new short[this.anInt425];
		this.anInt422 = 0;
		this.anInt425 = 0;
		this.anInt423 = 0;
		local43 = 0;
		local41 = 0;
		for (local48 = 0; local48 < arg1; local48++) {
			local55 = arg0[local48];
			if (local55 != null) {
				@Pc(280) int local280;
				for (local280 = 0; local280 < local55.anInt425; local280++) {
					this.anIntArray21[this.anInt425] = local55.anIntArray21[local280] + this.anInt422;
					this.anIntArray16[this.anInt425] = local55.anIntArray16[local280] + this.anInt422;
					this.anIntArray19[this.anInt425] = local55.anIntArray19[local280] + this.anInt422;
					this.anIntArray14[this.anInt425] = local55.anIntArray14[local280];
					this.anIntArray18[this.anInt425] = local55.anIntArray18[local280];
					this.anIntArray24[this.anInt425] = local55.anIntArray24[local280];
					this.aShortArray4[this.anInt425] = local55.aShortArray4[local280];
					if (local24) {
						if (local55.aByteArray4 == null) {
							this.aByteArray4[this.anInt425] = local55.aByte1;
						} else {
							this.aByteArray4[this.anInt425] = local55.aByteArray4[local280];
						}
					}
					if (local26 && local55.aByteArray6 != null) {
						this.aByteArray6[this.anInt425] = local55.aByteArray6[local280];
					}
					if (local28) {
						if (local55.aShortArray5 == null) {
							this.aShortArray5[this.anInt425] = -1;
						} else {
							this.aShortArray5[this.anInt425] = local55.aShortArray5[local280];
						}
					}
					if (local30) {
						this.aByteArray3[this.anInt425] = (byte) (local55.aByteArray3 == null || local55.aByteArray3[local280] == -1 ? -1 : local55.aByteArray3[local280] + this.anInt423);
					}
					this.anInt425++;
				}
				if (local55.aClass62Array1 != null) {
					for (local280 = 0; local280 < local55.aClass62Array1.length; local280++) {
						this.aClass62Array1[local41] = new Class62(local55.aClass62Array1[local280].aClass74_1, local55.aClass62Array1[local280].anInt1870 + this.anInt422, local55.aClass62Array1[local280].anInt1871 + this.anInt422, local55.aClass62Array1[local280].anInt1872 + this.anInt422);
						local41++;
					}
				}
				if (local55.aClass88Array1 != null) {
					for (local280 = 0; local280 < local55.aClass88Array1.length; local280++) {
						this.aClass88Array1[local43] = new Class88(local55.aClass88Array1[local280].aClass146_1, local55.aClass88Array1[local280].anInt2769 + this.anInt422);
						local43++;
					}
				}
				for (local280 = 0; local280 < local55.anInt423; local280++) {
					if (local55.anIntArray23[local280] < local55.anInt424) {
						this.anIntArray23[this.anInt423] = local55.anIntArray23[local280] + this.anInt422;
					}
					if (local55.anIntArray25[local280] < local55.anInt424) {
						this.anIntArray25[this.anInt423] = local55.anIntArray25[local280] + this.anInt422;
					}
					if (local55.anIntArray17[local280] < local55.anInt424) {
						this.anIntArray17[this.anInt423] = local55.anIntArray17[local280] + this.anInt422;
					}
					this.anInt423++;
				}
				for (local280 = 0; local280 < local55.anInt424; local280++) {
					this.anIntArray15[this.anInt422] = local55.anIntArray15[local280];
					this.anIntArray22[this.anInt422] = local55.anIntArray22[local280];
					this.anIntArray20[this.anInt422] = local55.anIntArray20[local280];
					this.anInt422++;
				}
			}
		}
		local48 = 0;
		this.anInt424 = this.anInt422;
		for (@Pc(651) int local651 = 0; local651 < arg1; local651++) {
			@Pc(658) Class13_Sub1_Sub1 local658 = arg0[local651];
			if (local658 != null) {
				@Pc(662) int local662;
				for (local662 = 0; local662 < local658.anInt423; local662++) {
					if (local658.anIntArray23[local662] >= local658.anInt424) {
						this.anIntArray23[local48] = local658.anIntArray23[local662] + this.anInt422 - local658.anInt424;
					}
					if (local658.anIntArray25[local662] >= local658.anInt424) {
						this.anIntArray25[local48] = local658.anIntArray25[local662] + this.anInt422 - local658.anInt424;
					}
					if (local658.anIntArray17[local662] >= local658.anInt424) {
						this.anIntArray17[local48] = local658.anIntArray17[local662] + this.anInt422 - local658.anInt424;
					}
					local48++;
				}
				for (local662 = local658.anInt424; local662 < local658.anInt422; local662++) {
					this.anIntArray15[this.anInt422] = local658.anIntArray15[local662];
					this.anIntArray22[this.anInt422] = local658.anIntArray22[local662];
					this.anIntArray20[this.anInt422] = local658.anIntArray20[local662];
					this.anInt422++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!bb", name = "k", descriptor = "()V")
	@Override
	public void method2747() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt422; local1++) {
			@Pc(10) int local10 = this.anIntArray20[local1];
			this.anIntArray20[local1] = this.anIntArray15[local1];
			this.anIntArray15[local1] = -local10;
		}
		this.aBoolean29 = false;
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(II[[I[[IIIIZ)Lclient!bb;")
	public Class13_Sub1_Sub1 method401(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		if (!this.aBoolean29) {
			this.method406();
		}
		@Pc(9) int local9 = arg4 + this.aShort5;
		@Pc(14) int local14 = arg4 + this.aShort6;
		@Pc(19) int local19 = arg6 + this.aShort8;
		@Pc(24) int local24 = arg6 + this.aShort3;
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
		@Pc(150) Class13_Sub1_Sub1 local150;
		if (arg7) {
			local150 = new Class13_Sub1_Sub1();
			local150.anInt422 = this.anInt422;
			local150.anInt424 = this.anInt424;
			local150.anInt425 = this.anInt425;
			local150.anInt423 = this.anInt423;
			local150.anIntArray21 = this.anIntArray21;
			local150.anIntArray16 = this.anIntArray16;
			local150.anIntArray19 = this.anIntArray19;
			local150.anIntArray14 = this.anIntArray14;
			local150.anIntArray18 = this.anIntArray18;
			local150.anIntArray24 = this.anIntArray24;
			local150.aByteArray4 = this.aByteArray4;
			local150.aByteArray3 = this.aByteArray3;
			local150.aShortArray5 = this.aShortArray5;
			local150.aShortArray4 = this.aShortArray4;
			local150.aByteArray6 = this.aByteArray6;
			local150.aByte1 = this.aByte1;
			local150.anIntArray23 = this.anIntArray23;
			local150.anIntArray25 = this.anIntArray25;
			local150.anIntArray17 = this.anIntArray17;
			local150.anIntArrayArray3 = this.anIntArrayArray3;
			local150.anIntArrayArray2 = this.anIntArrayArray2;
			local150.aShortArray6 = this.aShortArray6;
			local150.aShortArray3 = this.aShortArray3;
			local150.aBoolean223 = this.aBoolean223;
			if (arg0 == 3) {
				local150.anIntArray15 = Static162.method2610(this.anIntArray15);
				local150.anIntArray22 = Static162.method2610(this.anIntArray22);
				local150.anIntArray20 = Static162.method2610(this.anIntArray20);
			} else {
				local150.anIntArray15 = this.anIntArray15;
				local150.anIntArray22 = new int[local150.anInt422];
				local150.anIntArray20 = this.anIntArray20;
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
			for (local289 = 0; local289 < local150.anInt424; local289++) {
				local300 = this.anIntArray15[local289] + arg4;
				local307 = this.anIntArray20[local289] + arg6;
				local311 = local300 & 0x7F;
				local315 = local307 & 0x7F;
				local319 = local300 >> 7;
				local323 = local307 >> 7;
				local345 = arg2[local319][local323] * (128 - local311) + arg2[local319 + 1][local323] * local311 >> 7;
				local371 = arg2[local319][local323 + 1] * (128 - local311) + arg2[local319 + 1][local323 + 1] * local311 >> 7;
				local383 = local345 * (128 - local315) + local371 * local315 >> 7;
				local150.anIntArray22[local289] = this.anIntArray22[local289] + local383 - arg5;
			}
			for (local289 = local150.anInt424; local289 < local150.anInt422; local289++) {
				local300 = this.anIntArray15[local289] + arg4;
				local307 = this.anIntArray20[local289] + arg6;
				local311 = local300 & 0x7F;
				local315 = local307 & 0x7F;
				local319 = local300 >> 7;
				local323 = local307 >> 7;
				if (local319 >= 0 && local319 < arg2.length - 1 && local323 >= 0 && local323 < arg2[0].length - 1) {
					local345 = arg2[local319][local323] * (128 - local311) + arg2[local319 + 1][local323] * local311 >> 7;
					local371 = arg2[local319][local323 + 1] * (128 - local311) + arg2[local319 + 1][local323 + 1] * local311 >> 7;
					local383 = local345 * (128 - local315) + local371 * local315 >> 7;
					local150.anIntArray22[local289] = this.anIntArray22[local289] + local383 - arg5;
				}
			}
		} else {
			@Pc(640) int local640;
			if (arg0 == 2) {
				for (local289 = 0; local289 < local150.anInt424; local289++) {
					local300 = (this.anIntArray22[local289] << 16) / this.aShort4;
					if (local300 < arg1) {
						local307 = this.anIntArray15[local289] + arg4;
						local311 = this.anIntArray20[local289] + arg6;
						local315 = local307 & 0x7F;
						local319 = local311 & 0x7F;
						local323 = local307 >> 7;
						local345 = local311 >> 7;
						local371 = arg2[local323][local345] * (128 - local315) + arg2[local323 + 1][local345] * local315 >> 7;
						local383 = arg2[local323][local345 + 1] * (128 - local315) + arg2[local323 + 1][local345 + 1] * local315 >> 7;
						local640 = local371 * (128 - local319) + local383 * local319 >> 7;
						local150.anIntArray22[local289] = this.anIntArray22[local289] + (local640 - arg5) * (arg1 - local300) / arg1;
					} else {
						local150.anIntArray22[local289] = this.anIntArray22[local289];
					}
				}
				for (local289 = local150.anInt424; local289 < local150.anInt422; local289++) {
					local300 = (this.anIntArray22[local289] << 16) / this.aShort4;
					if (local300 < arg1) {
						local307 = this.anIntArray15[local289] + arg4;
						local311 = this.anIntArray20[local289] + arg6;
						local315 = local307 & 0x7F;
						local319 = local311 & 0x7F;
						local323 = local307 >> 7;
						local345 = local311 >> 7;
						if (local323 >= 0 && local323 < arg2.length - 1 && local345 >= 0 && local345 < arg2[0].length - 1) {
							local371 = arg2[local323][local345] * (128 - local315) + arg2[local323 + 1][local345] * local315 >> 7;
							local383 = arg2[local323][local345 + 1] * (128 - local315) + arg2[local323 + 1][local345 + 1] * local315 >> 7;
							local640 = local371 * (128 - local319) + local383 * local319 >> 7;
							local150.anIntArray22[local289] = this.anIntArray22[local289] + (local640 - arg5) * (arg1 - local300) / arg1;
						}
					} else {
						local150.anIntArray22[local289] = this.anIntArray22[local289];
					}
				}
			} else if (arg0 == 3) {
				local289 = (arg1 & 0xFF) * 4;
				local300 = (arg1 >> 8 & 0xFF) * 4;
				local150.method2756(arg2, arg4, arg5, arg6, local289, local300);
			} else if (arg0 == 4) {
				local289 = this.aShort10 - this.aShort4;
				for (local300 = 0; local300 < this.anInt424; local300++) {
					local307 = this.anIntArray15[local300] + arg4;
					local311 = this.anIntArray20[local300] + arg6;
					local315 = local307 & 0x7F;
					local319 = local311 & 0x7F;
					local323 = local307 >> 7;
					local345 = local311 >> 7;
					local371 = arg3[local323][local345] * (128 - local315) + arg3[local323 + 1][local345] * local315 >> 7;
					local383 = arg3[local323][local345 + 1] * (128 - local315) + arg3[local323 + 1][local345 + 1] * local315 >> 7;
					local640 = local371 * (128 - local319) + local383 * local319 >> 7;
					local150.anIntArray22[local300] = this.anIntArray22[local300] + local640 + local289 - arg5;
				}
				for (local300 = local150.anInt424; local300 < local150.anInt422; local300++) {
					local307 = this.anIntArray15[local300] + arg4;
					local311 = this.anIntArray20[local300] + arg6;
					local315 = local307 & 0x7F;
					local319 = local311 & 0x7F;
					local323 = local307 >> 7;
					local345 = local311 >> 7;
					if (local323 >= 0 && local323 < arg3.length - 1 && local345 >= 0 && local345 < arg3[0].length - 1) {
						local371 = arg3[local323][local345] * (128 - local315) + arg3[local323 + 1][local345] * local315 >> 7;
						local383 = arg3[local323][local345 + 1] * (128 - local315) + arg3[local323 + 1][local345 + 1] * local315 >> 7;
						local640 = local371 * (128 - local319) + local383 * local319 >> 7;
						local150.anIntArray22[local300] = this.anIntArray22[local300] + local640 + local289 - arg5;
					}
				}
			} else if (arg0 == 5) {
				local289 = this.aShort10 - this.aShort4;
				@Pc(1273) int local1273;
				@Pc(1277) int local1277;
				for (local300 = 0; local300 < this.anInt424; local300++) {
					local307 = this.anIntArray15[local300] + arg4;
					local311 = this.anIntArray20[local300] + arg6;
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
					local150.anIntArray22[local300] = ((this.anIntArray22[local300] << 8) / local289 * local1277 >> 8) - (arg5 - local640);
				}
				for (local300 = local150.anInt424; local300 < local150.anInt422; local300++) {
					local307 = this.anIntArray15[local300] + arg4;
					local311 = this.anIntArray20[local300] + arg6;
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
						local150.anIntArray22[local300] = ((this.anIntArray22[local300] << 8) / local289 * local1277 >> 8) - (arg5 - local640);
					}
				}
			}
		}
		local150.aBoolean29 = false;
		return local150;
	}

	@OriginalMember(owner = "client!bb", name = "c", descriptor = "(ZZZ)Lclient!gk;")
	@Override
	public Class13_Sub1 method2753(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		if (!arg0 && Static18.aByteArray8.length < this.anInt425) {
			Static18.aByteArray8 = new byte[this.anInt425 + 100];
		}
		if (!arg1 && Static18.aShortArray9.length < this.anInt425) {
			Static18.anIntArray55 = new int[this.anInt425 + 100];
			Static18.anIntArray35 = new int[this.anInt425 + 100];
			Static18.anIntArray40 = new int[this.anInt425 + 100];
			Static18.aShortArray9 = new short[this.anInt425 + 100];
		}
		return this.method404(arg0, arg1, Static18.aClass13_Sub1_Sub1_3, Static18.aByteArray8, Static18.aShortArray9, Static18.anIntArray55, Static18.anIntArray35, Static18.anIntArray40);
	}

	@OriginalMember(owner = "client!bb", name = "j", descriptor = "()Z")
	@Override
	protected boolean method2746() {
		if (this.anIntArrayArray3 == null) {
			return false;
		} else {
			Static18.anInt428 = 0;
			Static18.anInt427 = 0;
			Static18.anInt429 = 0;
			return true;
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(ZZJIILclient!il;)V")
	private void method402(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) long arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class21_Sub1 arg5) {
		if (arg4 >= 1600) {
			return;
		}
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		@Pc(11) int local11;
		if (!Static18.aBoolean31) {
			for (local11 = 0; local11 < 1600; local11++) {
				anIntArray34[local11] = 0;
			}
			for (local11 = 0; local11 < 32; local11++) {
				anIntArray46[local11] = 0;
			}
			Static18.anInt426 = 0;
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
		for (local11 = 0; local11 < this.anInt425; local11++) {
			if (this.anIntArray24[local11] != -2) {
				local51 = this.anIntArray21[local11];
				local56 = this.anIntArray16[local11];
				local61 = this.anIntArray19[local11];
				local65 = Static18.anIntArray54[local51];
				local69 = Static18.anIntArray54[local56];
				local73 = Static18.anIntArray54[local61];
				if (arg0 && (local65 == -5000 || local69 == -5000 || local73 == -5000)) {
					local88 = Static18.anIntArray37[local51];
					local92 = Static18.anIntArray37[local56];
					local96 = Static18.anIntArray37[local61];
					local100 = Static18.anIntArray47[local51];
					local104 = Static18.anIntArray47[local56];
					local108 = Static18.anIntArray47[local61];
					local112 = Static18.anIntArray49[local51];
					@Pc(116) int local116 = Static18.anIntArray49[local56];
					local120 = Static18.anIntArray49[local61];
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
						Static18.aBooleanArray5[local11] = true;
						if (Static18.aBoolean31) {
							anIntArray33[local5] = (Static18.anIntArray41[local51] + Static18.anIntArray41[local56] + Static18.anIntArray41[local61]) / 3;
							anIntArray39[local5++] = local11;
						} else {
							@Pc(224) int local224 = (Static18.anIntArray41[local51] + Static18.anIntArray41[local56] + Static18.anIntArray41[local61]) / 3 + arg3;
							if (anIntArray34[local224] < 64) {
								anIntArrayArray6[local224][anIntArray34[local224]++] = local11;
							} else {
								@Pc(247) int local247 = anIntArray34[local224];
								if (local247 == 64) {
									if (Static18.anInt426 == 512) {
										continue;
									}
									anIntArray34[local224] = local247 = Static18.anInt426++ + 65;
								}
								local247 -= 65;
								anIntArrayArray4[local247][anIntArray46[local247]++] = local11;
							}
						}
					}
				} else {
					if (arg1 && this.method408(Static177.anInt3590 + Static283.anInt5539, Static223.anInt4478 + Static283.anInt5542, Static18.anIntArray56[local51], Static18.anIntArray56[local56], Static18.anIntArray56[local61], local65, local69, local73)) {
						Static4.aLongArray1[Static242.anInt4774++] = arg2;
						arg1 = false;
					}
					if ((local65 - local69) * (Static18.anIntArray56[local61] - Static18.anIntArray56[local56]) - (Static18.anIntArray56[local51] - Static18.anIntArray56[local56]) * (local73 - local69) > 0) {
						Static18.aBooleanArray5[local11] = false;
						if (local65 >= 0 && local69 >= 0 && local73 >= 0 && local65 <= Static283.anInt5540 && local69 <= Static283.anInt5540 && local73 <= Static283.anInt5540) {
							Static18.aBooleanArray6[local11] = false;
						} else {
							Static18.aBooleanArray6[local11] = true;
						}
						if (Static18.aBoolean31) {
							anIntArray33[local5] = (Static18.anIntArray41[local51] + Static18.anIntArray41[local56] + Static18.anIntArray41[local61]) / 3;
							anIntArray39[local5++] = local11;
						} else {
							local88 = (Static18.anIntArray41[local51] + Static18.anIntArray41[local56] + Static18.anIntArray41[local61]) / 3 + arg3;
							if (anIntArray34[local88] < 64) {
								anIntArrayArray6[local88][anIntArray34[local88]++] = local11;
							} else {
								local92 = anIntArray34[local88];
								if (local92 == 64) {
									if (Static18.anInt426 == 512) {
										continue;
									}
									anIntArray34[local88] = local92 = Static18.anInt426++ + 65;
								}
								local92 -= 65;
								anIntArrayArray4[local92][anIntArray46[local92]++] = local11;
							}
						}
					}
				}
			}
		}
		if (arg5 != null && !Static18.aBoolean31) {
			for (local11 = 0; local11 < Static18.anIntArray48.length; local11++) {
				local51 = Static18.anIntArray48[local11] + arg3;
				if (local51 >= 0 && local51 < 1600) {
					if (anIntArray34[local51] < 64) {
						anIntArrayArray6[local51][anIntArray34[local51]++] = local11 + 1 << 16;
					} else {
						local56 = anIntArray34[local51];
						if (local56 == 64) {
							if (Static18.anInt426 == 512) {
								continue;
							}
							anIntArray34[local51] = local56 = Static18.anInt426++ + 65;
						}
						local56 -= 65;
						anIntArrayArray4[local56][anIntArray46[local56]++] = local11 + 1 << 16;
					}
				}
			}
		}
		if (Static18.aBoolean31) {
			Static254.method3929(0, anIntArray33, local5 - 1, anIntArray39);
			if (this.aByteArray4 == null) {
				for (local11 = 0; local11 < local5; local11++) {
					this.method409(anIntArray39[local11]);
				}
				return;
			}
			for (local11 = 0; local11 < 12; local11++) {
				Static18.anIntArray32[local11] = 0;
				Static18.anIntArray42[local11] = 0;
			}
			for (local11 = 0; local11 < local5; local11++) {
				local51 = anIntArray39[local11];
				local56 = anIntArray33[local11];
				@Pc(610) byte local610 = this.aByteArray4[local51];
				local65 = Static18.anIntArray32[local610]++;
				Static18.anIntArrayArray5[local610][local65] = local51;
				if (local610 < 10) {
					Static18.anIntArray42[local610] += local56;
				} else if (local610 == 10) {
					Static18.anIntArray53[local65] = local56;
				} else {
					Static18.anIntArray52[local65] = local56;
				}
			}
		} else {
			@Pc(677) int[] local677;
			if (this.aByteArray4 == null) {
				for (local11 = arg4 - 1; local11 >= 0; local11--) {
					local51 = anIntArray34[local11];
					@Pc(706) Class21_Sub2_Sub1 local706;
					if (local51 > 0) {
						local56 = local51 > 64 ? 64 : local51;
						local677 = anIntArrayArray6[local11];
						for (local65 = 0; local65 < local56; local65++) {
							local69 = local677[local65];
							if (local69 < 65536) {
								this.method409(local677[local65]);
							} else {
								local73 = (local69 >> 16) - 1;
								local706 = arg5.aClass21_Sub2_Sub1Array1[local73];
								local92 = Static18.anIntArray51[local73] * 400;
								if (local92 == 0) {
									local92 = 1;
								}
								Static258.method4027(Static18.anIntArray43[local73], Static18.anIntArray45[local73], (local706.aClass21_Sub3_1.aClass74_2.anInt2318 << 16) / local92, local706.anInt5759, local706.anInt5759 >> 24 & 0xFF);
							}
						}
					}
					if (local51 > 64) {
						local56 = anIntArray34[local11] - 64 - 1;
						local677 = anIntArrayArray4[local56];
						for (local65 = 0; local65 < anIntArray46[local56]; local65++) {
							local69 = local677[local65];
							if (local69 < 65536) {
								this.method409(local677[local65]);
							} else {
								local73 = (local69 >> 16) - 1;
								local706 = arg5.aClass21_Sub2_Sub1Array1[local73];
								local92 = Static18.anIntArray51[local73] * 400;
								if (local92 == 0) {
									local92 = 1;
								}
								Static258.method4027(Static18.anIntArray43[local73], Static18.anIntArray45[local73], (local706.aClass21_Sub3_1.aClass74_2.anInt2318 << 16) / local92, local706.anInt5759, local706.anInt5759 >> 24 & 0xFF);
							}
						}
					}
				}
				return;
			}
			for (local11 = 0; local11 < 12; local11++) {
				Static18.anIntArray32[local11] = 0;
				Static18.anIntArray42[local11] = 0;
			}
			for (local11 = arg4 - 1; local11 >= 0; local11--) {
				local51 = anIntArray34[local11];
				@Pc(881) byte local881;
				if (local51 > 0) {
					if (local51 > 64) {
						local56 = 64;
					} else {
						local56 = local51;
					}
					local677 = anIntArrayArray6[local11];
					for (local65 = 0; local65 < local56; local65++) {
						local69 = local677[local65];
						if (local69 < 65536) {
							local881 = this.aByteArray4[local69];
							local88 = Static18.anIntArray32[local881]++;
							Static18.anIntArrayArray5[local881][local88] = local69;
							if (local881 < 10) {
								Static18.anIntArray42[local881] += local11;
							} else if (local881 == 10) {
								Static18.anIntArray53[local88] = local11;
							} else {
								Static18.anIntArray52[local88] = local11;
							}
						} else {
							Static18.anIntArray36[local7++] = (local69 >> 16) - 1;
						}
					}
				}
				if (local51 > 64) {
					local56 = anIntArray34[local11] - 64 - 1;
					local677 = anIntArrayArray4[local56];
					for (local65 = 0; local65 < anIntArray46[local56]; local65++) {
						local69 = local677[local65];
						if (local69 < 65536) {
							local881 = this.aByteArray4[local69];
							local88 = Static18.anIntArray32[local881]++;
							Static18.anIntArrayArray5[local881][local88] = local69;
							if (local881 < 10) {
								Static18.anIntArray42[local881] += local11;
							} else if (local881 == 10) {
								Static18.anIntArray53[local88] = local11;
							} else {
								Static18.anIntArray52[local88] = local11;
							}
						} else {
							Static18.anIntArray36[local7++] = (local69 >> 16) - 1;
						}
					}
				}
			}
		}
		local11 = 0;
		if (Static18.anIntArray32[1] > 0 || Static18.anIntArray32[2] > 0) {
			local11 = (Static18.anIntArray42[1] + Static18.anIntArray42[2]) / (Static18.anIntArray32[1] + Static18.anIntArray32[2]);
		}
		local51 = 0;
		if (Static18.anIntArray32[3] > 0 || Static18.anIntArray32[4] > 0) {
			local51 = (Static18.anIntArray42[3] + Static18.anIntArray42[4]) / (Static18.anIntArray32[3] + Static18.anIntArray32[4]);
		}
		local56 = 0;
		if (Static18.anIntArray32[6] > 0 || Static18.anIntArray32[8] > 0) {
			local56 = (Static18.anIntArray42[6] + Static18.anIntArray42[8]) / (Static18.anIntArray32[6] + Static18.anIntArray32[8]);
		}
		local65 = 0;
		local69 = Static18.anIntArray32[10];
		@Pc(1105) int[] local1105 = Static18.anIntArrayArray5[10];
		@Pc(1107) int[] local1107 = Static18.anIntArray53;
		local92 = 0;
		if (local69 == 0) {
			local65 = 0;
			local69 = Static18.anIntArray32[11];
			local1105 = Static18.anIntArrayArray5[11];
			local1107 = Static18.anIntArray52;
		}
		if (local69 > 0) {
			local61 = local1107[0];
		} else {
			local61 = -1000;
		}
		for (local96 = 0; local96 < 10; local96++) {
			while (local96 == 0 && local61 > local11) {
				this.method409(local1105[local65++]);
				if (local65 == local69 && local1105 != Static18.anIntArrayArray5[11]) {
					local65 = 0;
					local69 = Static18.anIntArray32[11];
					local1105 = Static18.anIntArrayArray5[11];
					local1107 = Static18.anIntArray52;
				}
				if (local65 < local69) {
					local61 = local1107[local65];
				} else {
					local61 = -1000;
				}
			}
			while (local96 == 3 && local61 > local51) {
				this.method409(local1105[local65++]);
				if (local65 == local69 && local1105 != Static18.anIntArrayArray5[11]) {
					local65 = 0;
					local69 = Static18.anIntArray32[11];
					local1105 = Static18.anIntArrayArray5[11];
					local1107 = Static18.anIntArray52;
				}
				if (local65 < local69) {
					local61 = local1107[local65];
				} else {
					local61 = -1000;
				}
			}
			while (local96 == 5 && local61 > local56) {
				this.method409(local1105[local65++]);
				if (local65 == local69 && local1105 != Static18.anIntArrayArray5[11]) {
					local65 = 0;
					local69 = Static18.anIntArray32[11];
					local1105 = Static18.anIntArrayArray5[11];
					local1107 = Static18.anIntArray52;
				}
				if (local65 < local69) {
					local61 = local1107[local65];
				} else {
					local61 = -1000;
				}
			}
			local100 = Static18.anIntArray32[local96];
			@Pc(1275) int[] local1275 = Static18.anIntArrayArray5[local96];
			if (arg5 != null) {
				local108 = Integer.MAX_VALUE;
				if (local100 != 0) {
					local108 = Static18.anIntArray42[local96] / local100;
				}
				for (local112 = Static18.anIntArray36[local92]; Static18.anIntArray48[local112] + arg3 > local108; local112 = Static18.anIntArray36[local92++]) {
					@Pc(1303) Class21_Sub2_Sub1 local1303 = arg5.aClass21_Sub2_Sub1Array1[local112];
					local120 = Static18.anIntArray51[local112] * 400;
					if (local120 == 0) {
						local120 = 1;
					}
					Static258.method4027(Static18.anIntArray43[local112], Static18.anIntArray45[local112], (local1303.aClass21_Sub3_1.aClass74_2.anInt2318 << 16) / local120, local1303.anInt5759, local1303.anInt5759 >> 24 & 0xFF);
					if (local92 >= local7) {
						break;
					}
				}
			}
			for (local108 = 0; local108 < local100; local108++) {
				this.method409(local1275[local108]);
			}
		}
		while (local61 != -1000) {
			this.method409(local1105[local65++]);
			if (local65 == local69 && local1105 != Static18.anIntArrayArray5[11]) {
				local65 = 0;
				local1105 = Static18.anIntArrayArray5[11];
				local69 = Static18.anIntArray32[11];
				local1107 = Static18.anIntArray52;
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
		local96 = Static18.anIntArray36[local92];
		while (local92 < local7) {
			@Pc(1413) Class21_Sub2_Sub1 local1413 = arg5.aClass21_Sub2_Sub1Array1[local96];
			local104 = Static18.anIntArray51[local96] * 400;
			if (local104 == 0) {
				local104 = 1;
			}
			Static258.method4027(Static18.anIntArray43[local96], Static18.anIntArray45[local96], (local1413.aClass21_Sub3_1.aClass74_2.anInt2318 << 16) / local104, local1413.anInt5759, local1413.anInt5759 >> 24 & 0xFF);
			local96 = Static18.anIntArray36[local92++];
		}
	}

	@OriginalMember(owner = "client!bb", name = "d", descriptor = "()I")
	@Override
	public int method2732() {
		if (!this.aBoolean29) {
			this.method406();
		}
		return this.aShort9;
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(I[IIIIZI[I)V")
	@Override
	protected void method2752(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
		@Pc(2) int local2 = arg1.length;
		@Pc(6) int local6;
		@Pc(14) int local14;
		@Pc(33) int local33;
		@Pc(41) int local41;
		@Pc(21) int local21;
		if (arg0 == 0) {
			local6 = 0;
			Static18.anInt428 = 0;
			Static18.anInt427 = 0;
			Static18.anInt429 = 0;
			for (local14 = 0; local14 < local2; local14++) {
				local21 = arg1[local14];
				if (local21 < this.anIntArrayArray3.length) {
					@Pc(31) int[] local31 = this.anIntArrayArray3[local21];
					for (local33 = 0; local33 < local31.length; local33++) {
						local41 = local31[local33];
						if (this.aShortArray6 == null || (arg6 & this.aShortArray6[local41]) != 0) {
							Static18.anInt428 += this.anIntArray15[local41];
							Static18.anInt427 += this.anIntArray22[local41];
							Static18.anInt429 += this.anIntArray20[local41];
							local6++;
						}
					}
				}
			}
			if (local6 > 0) {
				Static18.anInt428 = Static18.anInt428 / local6 + arg2;
				Static18.anInt427 = Static18.anInt427 / local6 + arg3;
				Static18.anInt429 = Static18.anInt429 / local6 + arg4;
				Static18.aBoolean32 = true;
			} else {
				Static18.anInt428 = arg2;
				Static18.anInt427 = arg3;
				Static18.anInt429 = arg4;
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
				if (local14 < this.anIntArrayArray3.length) {
					local204 = this.anIntArrayArray3[local14];
					for (local206 = 0; local206 < local204.length; local206++) {
						local33 = local204[local206];
						if (this.aShortArray6 == null || (arg6 & this.aShortArray6[local33]) != 0) {
							this.anIntArray15[local33] += arg2;
							this.anIntArray22[local33] += arg3;
							this.anIntArray20[local33] += arg4;
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
					if (local14 < this.anIntArrayArray3.length) {
						local204 = this.anIntArrayArray3[local14];
						for (local206 = 0; local206 < local204.length; local206++) {
							local33 = local204[local206];
							if (this.aShortArray6 == null || (arg6 & this.aShortArray6[local33]) != 0) {
								this.anIntArray15[local33] -= Static18.anInt428;
								this.anIntArray22[local33] -= Static18.anInt427;
								this.anIntArray20[local33] -= Static18.anInt429;
								if (arg4 != 0) {
									local41 = Class174.anIntArray444[arg4];
									local307 = Class174.anIntArray443[arg4];
									local329 = this.anIntArray22[local33] * local41 + this.anIntArray15[local33] * local307 + 32767 >> 16;
									this.anIntArray22[local33] = this.anIntArray22[local33] * local307 + 32767 - this.anIntArray15[local33] * local41 >> 16;
									this.anIntArray15[local33] = local329;
								}
								if (arg2 != 0) {
									local41 = Class174.anIntArray444[arg2];
									local307 = Class174.anIntArray443[arg2];
									local329 = this.anIntArray22[local33] * local307 + 32767 - this.anIntArray20[local33] * local41 >> 16;
									this.anIntArray20[local33] = this.anIntArray22[local33] * local41 + this.anIntArray20[local33] * local307 + 32767 >> 16;
									this.anIntArray22[local33] = local329;
								}
								if (arg3 != 0) {
									local41 = Class174.anIntArray444[arg3];
									local307 = Class174.anIntArray443[arg3];
									local329 = this.anIntArray20[local33] * local41 + this.anIntArray15[local33] * local307 + 32767 >> 16;
									this.anIntArray20[local33] = this.anIntArray20[local33] * local307 + 32767 - this.anIntArray15[local33] * local41 >> 16;
									this.anIntArray15[local33] = local329;
								}
								this.anIntArray15[local33] += Static18.anInt428;
								this.anIntArray22[local33] += Static18.anInt427;
								this.anIntArray20[local33] += Static18.anInt429;
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
				if (Static18.aBoolean32) {
					local307 = arg7[0] * Static18.anInt428 + arg7[3] * Static18.anInt427 + arg7[6] * Static18.anInt429 + 16384 >> 15;
					local329 = arg7[1] * Static18.anInt428 + arg7[4] * Static18.anInt427 + arg7[7] * Static18.anInt429 + 16384 >> 15;
					local351 = arg7[2] * Static18.anInt428 + arg7[5] * Static18.anInt427 + arg7[8] * Static18.anInt429 + 16384 >> 15;
					local307 += local206;
					local329 += local33;
					local351 += local41;
					Static18.anInt428 = local307;
					Static18.anInt427 = local329;
					Static18.anInt429 = local351;
					Static18.aBoolean32 = false;
				}
				@Pc(374) int[] local374 = new int[9];
				local329 = Class174.anIntArray443[arg2] >> 1;
				local351 = Class174.anIntArray444[arg2] >> 1;
				local392 = Class174.anIntArray443[arg3] >> 1;
				local398 = Class174.anIntArray444[arg3] >> 1;
				local404 = Class174.anIntArray443[arg4] >> 1;
				local410 = Class174.anIntArray444[arg4] >> 1;
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
				@Pc(554) int local554 = local374[0] * -Static18.anInt428 + local374[1] * -Static18.anInt427 + local374[2] * -Static18.anInt429 + 16384 >> 15;
				local579 = local374[3] * -Static18.anInt428 + local374[4] * -Static18.anInt427 + local374[5] * -Static18.anInt429 + 16384 >> 15;
				local604 = local374[6] * -Static18.anInt428 + local374[7] * -Static18.anInt427 + local374[8] * -Static18.anInt429 + 16384 >> 15;
				local608 = local554 + Static18.anInt428;
				@Pc(612) int local612 = local579 + Static18.anInt427;
				local616 = local604 + Static18.anInt429;
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
					if (local893 < this.anIntArrayArray3.length) {
						@Pc(903) int[] local903 = this.anIntArrayArray3[local893];
						for (@Pc(905) int local905 = 0; local905 < local903.length; local905++) {
							@Pc(913) int local913 = local903[local905];
							if (this.aShortArray6 == null || (arg6 & this.aShortArray6[local913]) != 0) {
								@Pc(955) int local955 = local753[0] * this.anIntArray15[local913] + local753[1] * this.anIntArray22[local913] + local753[2] * this.anIntArray20[local913] + 16384 >> 15;
								@Pc(986) int local986 = local753[3] * this.anIntArray15[local913] + local753[4] * this.anIntArray22[local913] + local753[5] * this.anIntArray20[local913] + 16384 >> 15;
								@Pc(1017) int local1017 = local753[6] * this.anIntArray15[local913] + local753[7] * this.anIntArray22[local913] + local753[8] * this.anIntArray20[local913] + 16384 >> 15;
								@Pc(1021) int local1021 = local955 + local755;
								@Pc(1025) int local1025 = local986 + local760;
								@Pc(1029) int local1029 = local1017 + local765;
								this.anIntArray15[local913] = local1021;
								this.anIntArray22[local913] = local1025;
								this.anIntArray20[local913] = local1029;
							}
						}
					}
				}
			}
		} else if (arg0 == 3) {
			if (arg7 == null) {
				for (local6 = 0; local6 < local2; local6++) {
					local14 = arg1[local6];
					if (local14 < this.anIntArrayArray3.length) {
						local204 = this.anIntArrayArray3[local14];
						for (local206 = 0; local206 < local204.length; local206++) {
							local33 = local204[local206];
							if (this.aShortArray6 == null || (arg6 & this.aShortArray6[local33]) != 0) {
								this.anIntArray15[local33] -= Static18.anInt428;
								this.anIntArray22[local33] -= Static18.anInt427;
								this.anIntArray20[local33] -= Static18.anInt429;
								this.anIntArray15[local33] = this.anIntArray15[local33] * arg2 / 128;
								this.anIntArray22[local33] = this.anIntArray22[local33] * arg3 / 128;
								this.anIntArray20[local33] = this.anIntArray20[local33] * arg4 / 128;
								this.anIntArray15[local33] += Static18.anInt428;
								this.anIntArray22[local33] += Static18.anInt427;
								this.anIntArray20[local33] += Static18.anInt429;
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
				if (Static18.aBoolean32) {
					local307 = arg7[0] * Static18.anInt428 + arg7[3] * Static18.anInt427 + arg7[6] * Static18.anInt429 + 16384 >> 15;
					local329 = arg7[1] * Static18.anInt428 + arg7[4] * Static18.anInt427 + arg7[7] * Static18.anInt429 + 16384 >> 15;
					local351 = arg7[2] * Static18.anInt428 + arg7[5] * Static18.anInt427 + arg7[8] * Static18.anInt429 + 16384 >> 15;
					local307 += local206;
					local329 += local33;
					local351 += local41;
					Static18.anInt428 = local307;
					Static18.anInt427 = local329;
					Static18.anInt429 = local351;
					Static18.aBoolean32 = false;
				}
				local307 = arg2 << 15 >> 7;
				local329 = arg3 << 15 >> 7;
				local351 = arg4 << 15 >> 7;
				local392 = local307 * -Static18.anInt428 + 16384 >> 15;
				local398 = local329 * -Static18.anInt427 + 16384 >> 15;
				local404 = local351 * -Static18.anInt429 + 16384 >> 15;
				local410 = local392 + Static18.anInt428;
				local418 = local398 + Static18.anInt427;
				local426 = local404 + Static18.anInt429;
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
					if (local631 < this.anIntArrayArray3.length) {
						local753 = this.anIntArrayArray3[local631];
						for (local755 = 0; local755 < local753.length; local755++) {
							local760 = local753[local755];
							if (this.aShortArray6 == null || (arg6 & this.aShortArray6[local760]) != 0) {
								local765 = local1628[0] * this.anIntArray15[local760] + local1628[1] * this.anIntArray22[local760] + local1628[2] * this.anIntArray20[local760] + 16384 >> 15;
								local767 = local1628[3] * this.anIntArray15[local760] + local1628[4] * this.anIntArray22[local760] + local1628[5] * this.anIntArray20[local760] + 16384 >> 15;
								local893 = local1628[6] * this.anIntArray15[local760] + local1628[7] * this.anIntArray22[local760] + local1628[8] * this.anIntArray20[local760] + 16384 >> 15;
								@Pc(1896) int local1896 = local765 + local616;
								@Pc(1900) int local1900 = local767 + local1635;
								@Pc(1904) int local1904 = local893 + local621;
								this.anIntArray15[local760] = local1896;
								this.anIntArray22[local760] = local1900;
								this.anIntArray20[local760] = local1904;
							}
						}
					}
				}
			}
		} else if (arg0 == 5) {
			if (this.anIntArrayArray2 != null && this.aByteArray6 != null) {
				for (local6 = 0; local6 < local2; local6++) {
					local14 = arg1[local6];
					if (local14 < this.anIntArrayArray2.length) {
						local204 = this.anIntArrayArray2[local14];
						for (local206 = 0; local206 < local204.length; local206++) {
							local33 = local204[local206];
							if (this.aShortArray3 == null || (arg6 & this.aShortArray3[local33]) != 0) {
								local41 = (this.aByteArray6[local33] & 0xFF) + arg2 * 8;
								if (local41 < 0) {
									local41 = 0;
								} else if (local41 > 255) {
									local41 = 255;
								}
								this.aByteArray6[local33] = (byte) local41;
							}
						}
					}
				}
			}
		} else if (arg0 == 7 && this.anIntArrayArray2 != null) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray2.length) {
					local204 = this.anIntArrayArray2[local14];
					for (local206 = 0; local206 < local204.length; local206++) {
						local33 = local204[local206];
						if (this.aShortArray3 == null || (arg6 & this.aShortArray3[local33]) != 0) {
							local41 = this.aShortArray4[local33] & 0xFFFF;
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
							this.aShortArray4[local33] = (short) (local2209 << 10 | local329 << 7 | local351);
						}
					}
					this.aBoolean30 = true;
				}
			}
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lclient!gk;)Lclient!gk;")
	public Class13_Sub1 method403(@OriginalArg(0) Class13_Sub1 arg0) {
		return new Class13_Sub1_Sub1(new Class13_Sub1_Sub1[] { this, (Class13_Sub1_Sub1) arg0 }, 2);
	}

	@OriginalMember(owner = "client!bb", name = "e", descriptor = "()I")
	@Override
	public int method2737() {
		if (!this.aBoolean29) {
			this.method406();
		}
		return this.aShort6;
	}

	@OriginalMember(owner = "client!bb", name = "f", descriptor = "()I")
	@Override
	public int method2739() {
		if (!this.aBoolean29) {
			this.method406();
		}
		return this.aShort10;
	}

	@OriginalMember(owner = "client!bb", name = "d", descriptor = "(I)V")
	@Override
	public void method2757(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class174.anIntArray444[arg0];
		@Pc(7) int local7 = Class174.anIntArray443[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt422; local9++) {
			@Pc(29) int local29 = this.anIntArray22[local9] * local3 + this.anIntArray15[local9] * local7 >> 16;
			this.anIntArray22[local9] = this.anIntArray22[local9] * local7 - this.anIntArray15[local9] * local3 >> 16;
			this.anIntArray15[local9] = local29;
		}
		this.aBoolean29 = false;
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(ZZLclient!bb;[B[S[I[I[I)Lclient!gk;")
	private Class13_Sub1 method404(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class13_Sub1_Sub1 arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) short[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7) {
		arg2.anInt422 = this.anInt422;
		arg2.anInt424 = this.anInt424;
		arg2.anInt425 = this.anInt425;
		arg2.anInt423 = this.anInt423;
		if (arg2.anIntArray15 == null || arg2.anIntArray15.length < this.anInt422) {
			arg2.anIntArray15 = new int[this.anInt422 + 100];
			arg2.anIntArray22 = new int[this.anInt422 + 100];
			arg2.anIntArray20 = new int[this.anInt422 + 100];
		}
		@Pc(47) int local47;
		for (local47 = 0; local47 < this.anInt422; local47++) {
			arg2.anIntArray15[local47] = this.anIntArray15[local47];
			arg2.anIntArray22[local47] = this.anIntArray22[local47];
			arg2.anIntArray20[local47] = this.anIntArray20[local47];
		}
		if (arg0) {
			arg2.aByteArray6 = this.aByteArray6;
		} else {
			arg2.aByteArray6 = arg3;
			if (this.aByteArray6 == null) {
				for (local47 = 0; local47 < this.anInt425; local47++) {
					arg2.aByteArray6[local47] = 0;
				}
			} else {
				for (local47 = 0; local47 < this.anInt425; local47++) {
					arg2.aByteArray6[local47] = this.aByteArray6[local47];
				}
			}
		}
		if (arg1) {
			arg2.aShortArray4 = this.aShortArray4;
			arg2.anIntArray14 = this.anIntArray14;
			arg2.anIntArray18 = this.anIntArray18;
			arg2.anIntArray24 = this.anIntArray24;
		} else {
			arg2.aShortArray4 = arg4;
			arg2.anIntArray14 = arg5;
			arg2.anIntArray18 = arg6;
			arg2.anIntArray24 = arg7;
			for (local47 = 0; local47 < this.anInt425; local47++) {
				arg2.aShortArray4[local47] = this.aShortArray4[local47];
				arg2.anIntArray14[local47] = this.anIntArray14[local47];
				arg2.anIntArray18[local47] = this.anIntArray18[local47];
				arg2.anIntArray24[local47] = this.anIntArray24[local47];
			}
		}
		arg2.anIntArray21 = this.anIntArray21;
		arg2.anIntArray16 = this.anIntArray16;
		arg2.anIntArray19 = this.anIntArray19;
		arg2.aByteArray4 = this.aByteArray4;
		arg2.aByteArray3 = this.aByteArray3;
		arg2.aShortArray5 = this.aShortArray5;
		arg2.aByte1 = this.aByte1;
		arg2.anIntArray23 = this.anIntArray23;
		arg2.anIntArray25 = this.anIntArray25;
		arg2.anIntArray17 = this.anIntArray17;
		arg2.anIntArrayArray3 = this.anIntArrayArray3;
		arg2.anIntArrayArray2 = this.anIntArrayArray2;
		arg2.aShortArray6 = this.aShortArray6;
		arg2.aShortArray3 = this.aShortArray3;
		arg2.aBoolean223 = this.aBoolean223;
		arg2.aBoolean29 = false;
		arg2.aClass62Array1 = this.aClass62Array1;
		arg2.aClass88Array1 = this.aClass88Array1;
		return arg2;
	}

	@OriginalMember(owner = "client!bb", name = "h", descriptor = "()I")
	@Override
	public int method2742() {
		if (!this.aBoolean29) {
			this.method406();
		}
		return this.aShort3;
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(IIII)V")
	@Override
	protected void method2751(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) int local3;
		@Pc(11) int local11;
		if (arg0 == 0) {
			local3 = 0;
			Static18.anInt428 = 0;
			Static18.anInt427 = 0;
			Static18.anInt429 = 0;
			for (local11 = 0; local11 < this.anInt422; local11++) {
				Static18.anInt428 += this.anIntArray15[local11];
				Static18.anInt427 += this.anIntArray22[local11];
				Static18.anInt429 += this.anIntArray20[local11];
				local3++;
			}
			if (local3 > 0) {
				Static18.anInt428 = Static18.anInt428 / local3 + arg1;
				Static18.anInt427 = Static18.anInt427 / local3 + arg2;
				Static18.anInt429 = Static18.anInt429 / local3 + arg3;
			} else {
				Static18.anInt428 = arg1;
				Static18.anInt427 = arg2;
				Static18.anInt429 = arg3;
			}
		} else if (arg0 == 1) {
			for (local3 = 0; local3 < this.anInt422; local3++) {
				this.anIntArray15[local3] += arg1;
				this.anIntArray22[local3] += arg2;
				this.anIntArray20[local3] += arg3;
			}
		} else {
			@Pc(146) int local146;
			@Pc(164) int local164;
			if (arg0 == 2) {
				for (local3 = 0; local3 < this.anInt422; local3++) {
					this.anIntArray15[local3] -= Static18.anInt428;
					this.anIntArray22[local3] -= Static18.anInt427;
					this.anIntArray20[local3] -= Static18.anInt429;
					if (arg3 != 0) {
						local11 = Class174.anIntArray444[arg3];
						local146 = Class174.anIntArray443[arg3];
						local164 = this.anIntArray22[local3] * local11 + this.anIntArray15[local3] * local146 + 32767 >> 16;
						this.anIntArray22[local3] = this.anIntArray22[local3] * local146 + 32767 - this.anIntArray15[local3] * local11 >> 16;
						this.anIntArray15[local3] = local164;
					}
					if (arg1 != 0) {
						local11 = Class174.anIntArray444[arg1];
						local146 = Class174.anIntArray443[arg1];
						local164 = this.anIntArray22[local3] * local146 + 32767 - this.anIntArray20[local3] * local11 >> 16;
						this.anIntArray20[local3] = this.anIntArray22[local3] * local11 + this.anIntArray20[local3] * local146 + 32767 >> 16;
						this.anIntArray22[local3] = local164;
					}
					if (arg2 != 0) {
						local11 = Class174.anIntArray444[arg2];
						local146 = Class174.anIntArray443[arg2];
						local164 = this.anIntArray20[local3] * local11 + this.anIntArray15[local3] * local146 + 32767 >> 16;
						this.anIntArray20[local3] = this.anIntArray20[local3] * local146 + 32767 - this.anIntArray15[local3] * local11 >> 16;
						this.anIntArray15[local3] = local164;
					}
					this.anIntArray15[local3] += Static18.anInt428;
					this.anIntArray22[local3] += Static18.anInt427;
					this.anIntArray20[local3] += Static18.anInt429;
				}
			} else if (arg0 == 3) {
				for (local3 = 0; local3 < this.anInt422; local3++) {
					this.anIntArray15[local3] -= Static18.anInt428;
					this.anIntArray22[local3] -= Static18.anInt427;
					this.anIntArray20[local3] -= Static18.anInt429;
					this.anIntArray15[local3] = this.anIntArray15[local3] * arg1 / 128;
					this.anIntArray22[local3] = this.anIntArray22[local3] * arg2 / 128;
					this.anIntArray20[local3] = this.anIntArray20[local3] * arg3 / 128;
					this.anIntArray15[local3] += Static18.anInt428;
					this.anIntArray22[local3] += Static18.anInt427;
					this.anIntArray20[local3] += Static18.anInt429;
				}
			} else if (arg0 == 5) {
				for (local3 = 0; local3 < this.anInt425; local3++) {
					local11 = (this.aByteArray6[local3] & 0xFF) + arg1 * 8;
					if (local11 < 0) {
						local11 = 0;
					} else if (local11 > 255) {
						local11 = 255;
					}
					this.aByteArray6[local3] = (byte) local11;
				}
			} else if (arg0 == 7) {
				for (local3 = 0; local3 < this.anInt425; local3++) {
					local11 = this.aShortArray4[local3] & 0xFFFF;
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
					this.aShortArray4[local3] = (short) (local498 << 10 | local164 << 7 | local492);
				}
				this.aBoolean30 = true;
			}
		}
	}

	@OriginalMember(owner = "client!bb", name = "g", descriptor = "()I")
	@Override
	public int method2741() {
		if (!this.aBoolean29) {
			this.method406();
		}
		return this.aShort5;
	}

	@OriginalMember(owner = "client!bb", name = "c", descriptor = "()V")
	@Override
	public void method2730() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt422; local1++) {
			this.anIntArray15[local1] = -this.anIntArray15[local1];
			this.anIntArray20[local1] = -this.anIntArray20[local1];
		}
		this.aBoolean29 = false;
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(I[IIIIZ)V")
	@Override
	protected void method2734(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		@Pc(2) int local2 = arg1.length;
		@Pc(6) int local6;
		@Pc(14) int local14;
		@Pc(33) int local33;
		@Pc(41) int local41;
		if (arg0 == 0) {
			local6 = 0;
			Static18.anInt428 = 0;
			Static18.anInt427 = 0;
			Static18.anInt429 = 0;
			for (local14 = 0; local14 < local2; local14++) {
				@Pc(21) int local21 = arg1[local14];
				if (local21 < this.anIntArrayArray3.length) {
					@Pc(31) int[] local31 = this.anIntArrayArray3[local21];
					for (local33 = 0; local33 < local31.length; local33++) {
						local41 = local31[local33];
						Static18.anInt428 += this.anIntArray15[local41];
						Static18.anInt427 += this.anIntArray22[local41];
						Static18.anInt429 += this.anIntArray20[local41];
						local6++;
					}
				}
			}
			if (local6 > 0) {
				Static18.anInt428 = Static18.anInt428 / local6 + arg2;
				Static18.anInt427 = Static18.anInt427 / local6 + arg3;
				Static18.anInt429 = Static18.anInt429 / local6 + arg4;
			} else {
				Static18.anInt428 = arg2;
				Static18.anInt427 = arg3;
				Static18.anInt429 = arg4;
			}
			return;
		}
		@Pc(117) int[] local117;
		@Pc(119) int local119;
		if (arg0 == 1) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray3.length) {
					local117 = this.anIntArrayArray3[local14];
					for (local119 = 0; local119 < local117.length; local119++) {
						local33 = local117[local119];
						this.anIntArray15[local33] += arg2;
						this.anIntArray22[local33] += arg3;
						this.anIntArray20[local33] += arg4;
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
				if (local14 < this.anIntArrayArray3.length) {
					local117 = this.anIntArrayArray3[local14];
					for (local119 = 0; local119 < local117.length; local119++) {
						local33 = local117[local119];
						this.anIntArray15[local33] -= Static18.anInt428;
						this.anIntArray22[local33] -= Static18.anInt427;
						this.anIntArray20[local33] -= Static18.anInt429;
						if (arg4 != 0) {
							local41 = Class174.anIntArray444[arg4];
							local222 = Class174.anIntArray443[arg4];
							local240 = this.anIntArray22[local33] * local41 + this.anIntArray15[local33] * local222 + 32767 >> 16;
							this.anIntArray22[local33] = this.anIntArray22[local33] * local222 + 32767 - this.anIntArray15[local33] * local41 >> 16;
							this.anIntArray15[local33] = local240;
						}
						if (arg2 != 0) {
							local41 = Class174.anIntArray444[arg2];
							local222 = Class174.anIntArray443[arg2];
							local240 = this.anIntArray22[local33] * local222 + 32767 - this.anIntArray20[local33] * local41 >> 16;
							this.anIntArray20[local33] = this.anIntArray22[local33] * local41 + this.anIntArray20[local33] * local222 + 32767 >> 16;
							this.anIntArray22[local33] = local240;
						}
						if (arg3 != 0) {
							local41 = Class174.anIntArray444[arg3];
							local222 = Class174.anIntArray443[arg3];
							local240 = this.anIntArray20[local33] * local41 + this.anIntArray15[local33] * local222 + 32767 >> 16;
							this.anIntArray20[local33] = this.anIntArray20[local33] * local222 + 32767 - this.anIntArray15[local33] * local41 >> 16;
							this.anIntArray15[local33] = local240;
						}
						this.anIntArray15[local33] += Static18.anInt428;
						this.anIntArray22[local33] += Static18.anInt427;
						this.anIntArray20[local33] += Static18.anInt429;
					}
				}
			}
		} else if (arg0 == 3) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray3.length) {
					local117 = this.anIntArrayArray3[local14];
					for (local119 = 0; local119 < local117.length; local119++) {
						local33 = local117[local119];
						this.anIntArray15[local33] -= Static18.anInt428;
						this.anIntArray22[local33] -= Static18.anInt427;
						this.anIntArray20[local33] -= Static18.anInt429;
						this.anIntArray15[local33] = this.anIntArray15[local33] * arg2 / 128;
						this.anIntArray22[local33] = this.anIntArray22[local33] * arg3 / 128;
						this.anIntArray20[local33] = this.anIntArray20[local33] * arg4 / 128;
						this.anIntArray15[local33] += Static18.anInt428;
						this.anIntArray22[local33] += Static18.anInt427;
						this.anIntArray20[local33] += Static18.anInt429;
					}
				}
			}
		} else if (arg0 == 5) {
			if (this.anIntArrayArray2 != null && this.aByteArray6 != null) {
				for (local6 = 0; local6 < local2; local6++) {
					local14 = arg1[local6];
					if (local14 < this.anIntArrayArray2.length) {
						local117 = this.anIntArrayArray2[local14];
						for (local119 = 0; local119 < local117.length; local119++) {
							local33 = local117[local119];
							local41 = (this.aByteArray6[local33] & 0xFF) + arg2 * 8;
							if (local41 < 0) {
								local41 = 0;
							} else if (local41 > 255) {
								local41 = 255;
							}
							this.aByteArray6[local33] = (byte) local41;
						}
					}
				}
			}
		} else if (arg0 == 7 && this.anIntArrayArray2 != null) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray2.length) {
					local117 = this.anIntArrayArray2[local14];
					for (local119 = 0; local119 < local117.length; local119++) {
						local33 = local117[local119];
						local41 = this.aShortArray4[local33] & 0xFFFF;
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
						this.aShortArray4[local33] = (short) (local658 << 10 | local240 << 7 | local652);
					}
					this.aBoolean30 = true;
				}
			}
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(IIIIIIII)V")
	public void method405(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		try {
			if (!this.aBoolean29) {
				this.method406();
			}
			@Pc(6) int local6 = Static283.anInt5539;
			@Pc(8) int local8 = Static283.anInt5542;
			@Pc(12) int local12 = Class174.anIntArray444[0];
			@Pc(16) int local16 = Class174.anIntArray443[0];
			@Pc(20) int local20 = Class174.anIntArray444[arg0];
			@Pc(24) int local24 = Class174.anIntArray443[arg0];
			@Pc(28) int local28 = Class174.anIntArray444[arg1];
			@Pc(32) int local32 = Class174.anIntArray443[arg1];
			@Pc(36) int local36 = Class174.anIntArray444[arg2];
			@Pc(40) int local40 = Class174.anIntArray443[arg2];
			@Pc(50) int local50 = arg4 * local36 + arg5 * local40 >> 16;
			for (@Pc(52) int local52 = 0; local52 < this.anInt422; local52++) {
				@Pc(61) int local61 = this.anIntArray15[local52];
				@Pc(66) int local66 = this.anIntArray22[local52];
				@Pc(71) int local71 = this.anIntArray20[local52];
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
				Static18.anIntArray41[local52] = local71 - local50;
				Static18.anIntArray54[local52] = local6 + (local61 << 9) / arg6;
				Static18.anIntArray56[local52] = local8 + (local83 << 9) / arg6;
				if (this.anInt423 > 0) {
					Static18.anIntArray37[local52] = local61;
					Static18.anIntArray47[local52] = local83;
					Static18.anIntArray49[local52] = local71;
				}
			}
			this.method402(false, false, 0L, this.aShort7, this.aShort7 << 1, null);
		} catch (@Pc(234) RuntimeException local234) {
		}
	}

	@OriginalMember(owner = "client!bb", name = "n", descriptor = "()V")
	private void method406() {
		@Pc(1) int local1 = 32767;
		@Pc(3) int local3 = 32767;
		@Pc(5) int local5 = 32767;
		@Pc(7) int local7 = -32768;
		@Pc(9) int local9 = -32768;
		@Pc(11) int local11 = -32768;
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < this.anInt424; local17++) {
			@Pc(26) int local26 = this.anIntArray15[local17];
			@Pc(31) int local31 = this.anIntArray22[local17];
			@Pc(36) int local36 = this.anIntArray20[local17];
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
		this.aShort5 = (short) local1;
		this.aShort6 = (short) local7;
		this.aShort4 = (short) local3;
		this.aShort10 = (short) local9;
		this.aShort8 = (short) local5;
		this.aShort3 = (short) local11;
		this.aShort9 = (short) (Math.sqrt((double) local13) + 0.99D);
		this.aShort7 = (short) (Math.sqrt((double) local15) + 0.99D);
		this.aBoolean29 = true;
	}

	@OriginalMember(owner = "client!bb", name = "m", descriptor = "()I")
	@Override
	public int method2755() {
		if (!this.aBoolean29) {
			this.method406();
		}
		return this.aShort8;
	}

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "(IIIIIIII)Z")
	private boolean method408(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
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

	@OriginalMember(owner = "client!bb", name = "f", descriptor = "(I)V")
	private void method409(@OriginalArg(0) int arg0) {
		if (Static18.aBooleanArray5[arg0]) {
			this.method415(arg0);
			return;
		}
		@Pc(12) int local12 = this.anIntArray21[arg0];
		@Pc(17) int local17 = this.anIntArray16[arg0];
		@Pc(22) int local22 = this.anIntArray19[arg0];
		Static283.aBoolean376 = Static18.aBooleanArray6[arg0];
		if (this.aByteArray6 == null) {
			Static283.anInt5541 = 0;
		} else {
			Static283.anInt5541 = this.aByteArray6[arg0] & 0xFF;
		}
		if (this.aShortArray5 != null && this.aShortArray5[arg0] != -1) {
			@Pc(141) int local141;
			@Pc(146) int local146;
			@Pc(151) int local151;
			if (this.aByteArray3 == null || this.aByteArray3[arg0] == -1) {
				local141 = local12;
				local146 = local17;
				local151 = local22;
			} else {
				@Pc(136) int local136 = this.aByteArray3[arg0] & 0xFF;
				local141 = this.anIntArray23[local136];
				local146 = this.anIntArray25[local136];
				local151 = this.anIntArray17[local136];
			}
			if (this.anIntArray24[arg0] == -1) {
				Static283.method4426(Static18.anIntArray56[local12], Static18.anIntArray56[local17], Static18.anIntArray56[local22], Static18.anIntArray54[local12], Static18.anIntArray54[local17], Static18.anIntArray54[local22], this.anIntArray14[arg0], this.anIntArray14[arg0], this.anIntArray14[arg0], Static18.anIntArray37[local141], Static18.anIntArray37[local146], Static18.anIntArray37[local151], Static18.anIntArray47[local141], Static18.anIntArray47[local146], Static18.anIntArray47[local151], Static18.anIntArray49[local141], Static18.anIntArray49[local146], Static18.anIntArray49[local151], this.aShortArray5[arg0]);
			} else {
				Static283.method4426(Static18.anIntArray56[local12], Static18.anIntArray56[local17], Static18.anIntArray56[local22], Static18.anIntArray54[local12], Static18.anIntArray54[local17], Static18.anIntArray54[local22], this.anIntArray14[arg0], this.anIntArray18[arg0], this.anIntArray24[arg0], Static18.anIntArray37[local141], Static18.anIntArray37[local146], Static18.anIntArray37[local151], Static18.anIntArray47[local141], Static18.anIntArray47[local146], Static18.anIntArray47[local151], Static18.anIntArray49[local141], Static18.anIntArray49[local146], Static18.anIntArray49[local151], this.aShortArray5[arg0]);
			}
		} else if (this.anIntArray24[arg0] == -1) {
			Static283.method4424(Static18.anIntArray56[local12], Static18.anIntArray56[local17], Static18.anIntArray56[local22], Static18.anIntArray54[local12], Static18.anIntArray54[local17], Static18.anIntArray54[local22], Static283.anIntArray441[this.anIntArray14[arg0] & 0xFFFF]);
		} else {
			Static283.method4427(Static18.anIntArray56[local12], Static18.anIntArray56[local17], Static18.anIntArray56[local22], Static18.anIntArray54[local12], Static18.anIntArray54[local17], Static18.anIntArray54[local22], this.anIntArray14[arg0] & 0xFFFF, this.anIntArray18[arg0] & 0xFFFF, this.anIntArray24[arg0] & 0xFFFF);
		}
	}

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "(ZZZ)Lclient!gk;")
	@Override
	public Class13_Sub1 method2750(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		if (!arg0 && Static18.aByteArray5.length < this.anInt425) {
			Static18.aByteArray5 = new byte[this.anInt425 + 100];
		}
		if (!arg1 && Static18.aShortArray7.length < this.anInt425) {
			Static18.anIntArray26 = new int[this.anInt425 + 100];
			Static18.anIntArray28 = new int[this.anInt425 + 100];
			Static18.anIntArray27 = new int[this.anInt425 + 100];
			Static18.aShortArray7 = new short[this.anInt425 + 100];
		}
		return this.method404(arg0, arg1, Static18.aClass13_Sub1_Sub1_1, Static18.aByteArray5, Static18.aShortArray7, Static18.anIntArray26, Static18.anIntArray28, Static18.anIntArray27);
	}

	@OriginalMember(owner = "client!bb", name = "c", descriptor = "(III)V")
	@Override
	public void method2744(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt422; local1++) {
			this.anIntArray15[local1] = this.anIntArray15[local1] * arg0 / 128;
			this.anIntArray22[local1] = this.anIntArray22[local1] * arg1 / 128;
			this.anIntArray20[local1] = this.anIntArray20[local1] * arg2 / 128;
		}
		this.aBoolean29 = false;
	}

	@OriginalMember(owner = "client!bb", name = "l", descriptor = "()V")
	@Override
	protected void method2749() {
		if (this.aBoolean30) {
			this.method414();
			this.aBoolean30 = false;
		}
		this.aBoolean29 = false;
	}

	@OriginalMember(owner = "client!bb", name = "r", descriptor = "()V")
	private void method414() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt425; local1++) {
			@Pc(15) short local15 = this.aShortArray5 == null ? -1 : this.aShortArray5[local1];
			if (local15 == -1) {
				@Pc(25) int local25 = this.aShortArray4[local1] & 0xFFFF;
				@Pc(38) int local38;
				if (this.anIntArray24[local1] == -1) {
					local38 = this.anIntArray14[local1] & 0xFFFE0000;
					this.anIntArray14[local1] = local38 | Static18.method411(local25, local38 >> 17);
				} else if (this.anIntArray24[local1] != -2) {
					local38 = this.anIntArray14[local1] & 0xFFFE0000;
					this.anIntArray14[local1] = local38 | Static18.method411(local25, local38 >> 17);
					local38 = this.anIntArray18[local1] & 0xFFFE0000;
					this.anIntArray18[local1] = local38 | Static18.method411(local25, local38 >> 17);
					local38 = this.anIntArray24[local1] & 0xFFFE0000;
					this.anIntArray24[local1] = local38 | Static18.method411(local25, local38 >> 17);
				}
			}
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(IIIIIIIJ)V")
	@Override
	public void method2743(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) long arg6) {
		try {
			if (!this.aBoolean29) {
				this.method406();
			}
			@Pc(6) int local6 = Static283.anInt5539;
			@Pc(8) int local8 = Static283.anInt5542;
			@Pc(12) int local12 = Class174.anIntArray444[0];
			@Pc(16) int local16 = Class174.anIntArray443[0];
			@Pc(20) int local20 = Class174.anIntArray444[arg0];
			@Pc(24) int local24 = Class174.anIntArray443[arg0];
			@Pc(28) int local28 = Class174.anIntArray444[arg1];
			@Pc(32) int local32 = Class174.anIntArray443[arg1];
			@Pc(36) int local36 = Class174.anIntArray444[arg2];
			@Pc(40) int local40 = Class174.anIntArray443[arg2];
			@Pc(50) int local50 = arg4 * local36 + arg5 * local40 >> 16;
			for (@Pc(52) int local52 = 0; local52 < this.anInt422; local52++) {
				@Pc(61) int local61 = this.anIntArray15[local52];
				@Pc(66) int local66 = this.anIntArray22[local52];
				@Pc(71) int local71 = this.anIntArray20[local52];
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
				Static18.anIntArray41[local52] = local71 - local50;
				Static18.anIntArray54[local52] = local6 + (local61 << 9) / local71;
				Static18.anIntArray56[local52] = local8 + (local83 << 9) / local71;
				if (this.anInt423 > 0) {
					Static18.anIntArray37[local52] = local61;
					Static18.anIntArray47[local52] = local83;
					Static18.anIntArray49[local52] = local71;
				}
			}
			this.method402(false, arg6 >= 0L, arg6, this.aShort7, this.aShort7 << 1, null);
		} catch (@Pc(240) RuntimeException local240) {
		}
	}

	@OriginalMember(owner = "client!bb", name = "g", descriptor = "(I)V")
	private void method415(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static283.anInt5539;
		@Pc(3) int local3 = Static283.anInt5542;
		@Pc(5) int local5 = 0;
		@Pc(10) int local10 = this.anIntArray21[arg0];
		@Pc(15) int local15 = this.anIntArray16[arg0];
		@Pc(20) int local20 = this.anIntArray19[arg0];
		@Pc(24) int local24 = Static18.anIntArray49[local10];
		@Pc(28) int local28 = Static18.anIntArray49[local15];
		@Pc(32) int local32 = Static18.anIntArray49[local20];
		if (this.aByteArray6 == null) {
			Static283.anInt5541 = 0;
		} else {
			Static283.anInt5541 = this.aByteArray6[arg0] & 0xFF;
		}
		@Pc(75) int local75;
		@Pc(79) int local79;
		@Pc(86) int local86;
		@Pc(99) int local99;
		if (local24 >= 50) {
			Static18.anIntArray38[0] = Static18.anIntArray54[local10];
			Static18.anIntArray50[0] = Static18.anIntArray56[local10];
			local5++;
			Static18.anIntArray44[0] = this.anIntArray14[arg0] & 0xFFFF;
		} else {
			local75 = Static18.anIntArray37[local10];
			local79 = Static18.anIntArray47[local10];
			local86 = this.anIntArray14[arg0] & 0xFFFF;
			if (local32 >= 50) {
				local99 = (50 - local24) * Class174.anIntArray440[local32 - local24];
				Static18.anIntArray38[0] = local1 + (local75 + ((Static18.anIntArray37[local20] - local75) * local99 >> 16) << 9) / 50;
				Static18.anIntArray50[0] = local3 + (local79 + ((Static18.anIntArray47[local20] - local79) * local99 >> 16) << 9) / 50;
				local5++;
				Static18.anIntArray44[0] = local86 + (((this.anIntArray24[arg0] & 0xFFFF) - local86) * local99 >> 16);
			}
			if (local28 >= 50) {
				local99 = (50 - local24) * Class174.anIntArray440[local28 - local24];
				Static18.anIntArray38[local5] = local1 + (local75 + ((Static18.anIntArray37[local15] - local75) * local99 >> 16) << 9) / 50;
				Static18.anIntArray50[local5] = local3 + (local79 + ((Static18.anIntArray47[local15] - local79) * local99 >> 16) << 9) / 50;
				Static18.anIntArray44[local5++] = local86 + (((this.anIntArray18[arg0] & 0xFFFF) - local86) * local99 >> 16);
			}
		}
		if (local28 >= 50) {
			Static18.anIntArray38[local5] = Static18.anIntArray54[local15];
			Static18.anIntArray50[local5] = Static18.anIntArray56[local15];
			Static18.anIntArray44[local5++] = this.anIntArray18[arg0] & 0xFFFF;
		} else {
			local75 = Static18.anIntArray37[local15];
			local79 = Static18.anIntArray47[local15];
			local86 = this.anIntArray18[arg0] & 0xFFFF;
			if (local24 >= 50) {
				local99 = (50 - local28) * Class174.anIntArray440[local24 - local28];
				Static18.anIntArray38[local5] = local1 + (local75 + ((Static18.anIntArray37[local10] - local75) * local99 >> 16) << 9) / 50;
				Static18.anIntArray50[local5] = local3 + (local79 + ((Static18.anIntArray47[local10] - local79) * local99 >> 16) << 9) / 50;
				Static18.anIntArray44[local5++] = local86 + (((this.anIntArray14[arg0] & 0xFFFF) - local86) * local99 >> 16);
			}
			if (local32 >= 50) {
				local99 = (50 - local28) * Class174.anIntArray440[local32 - local28];
				Static18.anIntArray38[local5] = local1 + (local75 + ((Static18.anIntArray37[local20] - local75) * local99 >> 16) << 9) / 50;
				Static18.anIntArray50[local5] = local3 + (local79 + ((Static18.anIntArray47[local20] - local79) * local99 >> 16) << 9) / 50;
				Static18.anIntArray44[local5++] = local86 + (((this.anIntArray24[arg0] & 0xFFFF) - local86) * local99 >> 16);
			}
		}
		if (local32 >= 50) {
			Static18.anIntArray38[local5] = Static18.anIntArray54[local20];
			Static18.anIntArray50[local5] = Static18.anIntArray56[local20];
			Static18.anIntArray44[local5++] = this.anIntArray24[arg0] & 0xFFFF;
		} else {
			local75 = Static18.anIntArray37[local20];
			local79 = Static18.anIntArray47[local20];
			local86 = this.anIntArray24[arg0] & 0xFFFF;
			if (local28 >= 50) {
				local99 = (50 - local32) * Class174.anIntArray440[local28 - local32];
				Static18.anIntArray38[local5] = local1 + (local75 + ((Static18.anIntArray37[local15] - local75) * local99 >> 16) << 9) / 50;
				Static18.anIntArray50[local5] = local3 + (local79 + ((Static18.anIntArray47[local15] - local79) * local99 >> 16) << 9) / 50;
				Static18.anIntArray44[local5++] = local86 + (((this.anIntArray18[arg0] & 0xFFFF) - local86) * local99 >> 16);
			}
			if (local24 >= 50) {
				local99 = (50 - local32) * Class174.anIntArray440[local24 - local32];
				Static18.anIntArray38[local5] = local1 + (local75 + ((Static18.anIntArray37[local10] - local75) * local99 >> 16) << 9) / 50;
				Static18.anIntArray50[local5] = local3 + (local79 + ((Static18.anIntArray47[local10] - local79) * local99 >> 16) << 9) / 50;
				Static18.anIntArray44[local5++] = local86 + (((this.anIntArray14[arg0] & 0xFFFF) - local86) * local99 >> 16);
			}
		}
		local75 = Static18.anIntArray38[0];
		local79 = Static18.anIntArray38[1];
		local86 = Static18.anIntArray38[2];
		local99 = Static18.anIntArray50[0];
		@Pc(614) int local614 = Static18.anIntArray50[1];
		@Pc(618) int local618 = Static18.anIntArray50[2];
		Static283.aBoolean376 = false;
		@Pc(709) int local709;
		@Pc(714) int local714;
		@Pc(719) int local719;
		@Pc(704) int local704;
		if (local5 == 3) {
			if (local75 < 0 || local79 < 0 || local86 < 0 || local75 > Static283.anInt5540 || local79 > Static283.anInt5540 || local86 > Static283.anInt5540) {
				Static283.aBoolean376 = true;
			}
			if (this.aShortArray5 != null && this.aShortArray5[arg0] != -1) {
				if (this.aByteArray3 == null || this.aByteArray3[arg0] == -1) {
					local709 = local10;
					local714 = local15;
					local719 = local20;
				} else {
					local704 = this.aByteArray3[arg0] & 0xFF;
					local709 = this.anIntArray23[local704];
					local714 = this.anIntArray25[local704];
					local719 = this.anIntArray17[local704];
				}
				if (this.anIntArray24[arg0] == -1) {
					Static283.method4426(local99, local614, local618, local75, local79, local86, this.anIntArray14[arg0], this.anIntArray14[arg0], this.anIntArray14[arg0], Static18.anIntArray37[local709], Static18.anIntArray37[local714], Static18.anIntArray37[local719], Static18.anIntArray47[local709], Static18.anIntArray47[local714], Static18.anIntArray47[local719], Static18.anIntArray49[local709], Static18.anIntArray49[local714], Static18.anIntArray49[local719], this.aShortArray5[arg0]);
				} else {
					Static283.method4426(local99, local614, local618, local75, local79, local86, Static18.anIntArray44[0], Static18.anIntArray44[1], Static18.anIntArray44[2], Static18.anIntArray37[local709], Static18.anIntArray37[local714], Static18.anIntArray37[local719], Static18.anIntArray47[local709], Static18.anIntArray47[local714], Static18.anIntArray47[local719], Static18.anIntArray49[local709], Static18.anIntArray49[local714], Static18.anIntArray49[local719], this.aShortArray5[arg0]);
				}
			} else if (this.anIntArray24[arg0] == -1) {
				Static283.method4424(local99, local614, local618, local75, local79, local86, Static283.anIntArray441[this.anIntArray14[arg0] & 0xFFFF]);
			} else {
				Static283.method4427(local99, local614, local618, local75, local79, local86, Static18.anIntArray44[0], Static18.anIntArray44[1], Static18.anIntArray44[2]);
			}
		}
		if (local5 != 4) {
			return;
		}
		if (local75 < 0 || local79 < 0 || local86 < 0 || local75 > Static283.anInt5540 || local79 > Static283.anInt5540 || local86 > Static283.anInt5540 || Static18.anIntArray38[3] < 0 || Static18.anIntArray38[3] > Static283.anInt5540) {
			Static283.aBoolean376 = true;
		}
		if (this.aShortArray5 != null && this.aShortArray5[arg0] != -1) {
			if (this.aByteArray3 == null || this.aByteArray3[arg0] == -1) {
				local709 = local10;
				local714 = local15;
				local719 = local20;
			} else {
				local704 = this.aByteArray3[arg0] & 0xFF;
				local709 = this.anIntArray23[local704];
				local714 = this.anIntArray25[local704];
				local719 = this.anIntArray17[local704];
			}
			@Pc(984) short local984 = this.aShortArray5[arg0];
			if (this.anIntArray24[arg0] == -1) {
				Static283.method4426(local99, local614, local618, local75, local79, local86, this.anIntArray14[arg0], this.anIntArray14[arg0], this.anIntArray14[arg0], Static18.anIntArray37[local709], Static18.anIntArray37[local714], Static18.anIntArray37[local719], Static18.anIntArray47[local709], Static18.anIntArray47[local714], Static18.anIntArray47[local719], Static18.anIntArray49[local709], Static18.anIntArray49[local714], Static18.anIntArray49[local719], local984);
				Static283.method4426(local99, local618, Static18.anIntArray50[3], local75, local86, Static18.anIntArray38[3], this.anIntArray14[arg0], this.anIntArray14[arg0], this.anIntArray14[arg0], Static18.anIntArray37[local709], Static18.anIntArray37[local714], Static18.anIntArray37[local719], Static18.anIntArray47[local709], Static18.anIntArray47[local714], Static18.anIntArray47[local719], Static18.anIntArray49[local709], Static18.anIntArray49[local714], Static18.anIntArray49[local719], local984);
			} else {
				Static283.method4426(local99, local614, local618, local75, local79, local86, Static18.anIntArray44[0], Static18.anIntArray44[1], Static18.anIntArray44[2], Static18.anIntArray37[local709], Static18.anIntArray37[local714], Static18.anIntArray37[local719], Static18.anIntArray47[local709], Static18.anIntArray47[local714], Static18.anIntArray47[local719], Static18.anIntArray49[local709], Static18.anIntArray49[local714], Static18.anIntArray49[local719], local984);
				Static283.method4426(local99, local618, Static18.anIntArray50[3], local75, local86, Static18.anIntArray38[3], Static18.anIntArray44[0], Static18.anIntArray44[2], Static18.anIntArray44[3], Static18.anIntArray37[local709], Static18.anIntArray37[local714], Static18.anIntArray37[local719], Static18.anIntArray47[local709], Static18.anIntArray47[local714], Static18.anIntArray47[local719], Static18.anIntArray49[local709], Static18.anIntArray49[local714], Static18.anIntArray49[local719], local984);
			}
		} else if (this.anIntArray24[arg0] == -1) {
			local709 = Static283.anIntArray441[this.anIntArray14[arg0] & 0xFFFF];
			Static283.method4424(local99, local614, local618, local75, local79, local86, local709);
			Static283.method4424(local99, local618, Static18.anIntArray50[3], local75, local86, Static18.anIntArray38[3], local709);
		} else {
			Static283.method4427(local99, local614, local618, local75, local79, local86, Static18.anIntArray44[0], Static18.anIntArray44[1], Static18.anIntArray44[2]);
			Static283.method4427(local99, local618, Static18.anIntArray50[3], local75, local86, Static18.anIntArray38[3], Static18.anIntArray44[0], Static18.anIntArray44[2], Static18.anIntArray44[3]);
		}
	}

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "(III)V")
	@Override
	public void method2740(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt422; local1++) {
			this.anIntArray15[local1] += arg0;
			this.anIntArray22[local1] += arg1;
			this.anIntArray20[local1] += arg2;
		}
		this.aBoolean29 = false;
	}

	@OriginalMember(owner = "client!bb", name = "c", descriptor = "(I)V")
	@Override
	public void method2735(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class174.anIntArray444[arg0];
		@Pc(7) int local7 = Class174.anIntArray443[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt422; local9++) {
			@Pc(29) int local29 = this.anIntArray20[local9] * local3 + this.anIntArray15[local9] * local7 >> 16;
			this.anIntArray20[local9] = this.anIntArray20[local9] * local7 - this.anIntArray15[local9] * local3 >> 16;
			this.anIntArray15[local9] = local29;
		}
		this.aBoolean29 = false;
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(IIIIIIIIJILclient!il;)V")
	@Override
	public void method4262(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class21_Sub1 arg10) {
		if (!this.aBoolean29) {
			this.method406();
		}
		@Pc(14) int local14 = arg7 * arg4 - arg5 * arg3 >> 16;
		@Pc(24) int local24 = arg6 * arg1 + local14 * arg2 >> 16;
		@Pc(38) int local38 = local24 + (this.aShort9 * arg2 + this.aShort10 * arg1 >> 16);
		@Pc(53) int local53 = local24 + (-this.aShort9 * arg2 + this.aShort4 * arg1 >> 16);
		@Pc(58) int local58;
		@Pc(70) int local70;
		@Pc(87) int local87;
		if (arg10 != null) {
			local58 = arg10.method1977();
			local70 = local24 + (local58 * arg2 + arg1 * 0 >> 16);
			local87 = local24 + (-local58 * arg2 - (arg10.anInt2434 - arg10.anInt2433) * arg1 >> 16);
			if (local87 < local53) {
				local53 = local87;
			}
			if (local70 > local38) {
				local38 = local70;
			}
			arg10.method1990(arg0, arg9, arg5, arg6, arg7);
		}
		if (local38 <= 50 || local53 >= 3500) {
			return;
		}
		local58 = arg7 * arg3 + arg5 * arg4 >> 16;
		local70 = local58 + this.aShort9 << 9;
		if (local70 / local38 <= Static190.anInt3867) {
			return;
		}
		local87 = local58 - this.aShort9 << 9;
		if (local87 / local38 >= Static60.anInt1354) {
			return;
		}
		@Pc(158) int local158 = arg6 * arg2 - local14 * arg1 >> 16;
		@Pc(174) int local174 = local158 + (this.aShort9 * arg1 + this.aShort10 * arg2 >> 16) << 9;
		if (local174 / local38 <= Static244.anInt4816) {
			return;
		}
		@Pc(197) int local197 = local158 + (-this.aShort9 * arg1 + this.aShort4 * arg2 >> 16) << 9;
		if (local197 / local38 >= Static157.anInt314) {
			return;
		}
		@Pc(205) boolean local205 = false;
		@Pc(212) boolean local212 = local53 <= 50;
		@Pc(221) boolean local221 = local212 || this.anInt423 > 0;
		@Pc(223) int local223 = Static283.anInt5539;
		@Pc(225) int local225 = Static283.anInt5542;
		@Pc(227) int local227 = 0;
		@Pc(229) int local229 = 0;
		if (arg0 != 0) {
			local227 = Class174.anIntArray444[arg0];
			local229 = Class174.anIntArray443[arg0];
		}
		@Pc(241) boolean local241 = false;
		@Pc(255) int local255;
		@Pc(274) int local274;
		@Pc(259) int local259;
		@Pc(278) int local278;
		@Pc(438) int local438;
		if (arg8 > 0L && Static287.aBoolean384 && local53 > 0) {
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
			if (Static177.anInt3590 >= local255 && Static177.anInt3590 <= local259 && Static223.anInt4478 >= local274 && Static223.anInt4478 <= local278) {
				local255 = 999999;
				local259 = -999999;
				local274 = 999999;
				local278 = -999999;
				@Pc(350) int[] local350 = new int[] { this.aShort5, this.aShort6, this.aShort5, this.aShort6, this.aShort5, this.aShort6, this.aShort5, this.aShort6 };
				@Pc(393) int[] local393 = new int[] { this.aShort8, this.aShort8, this.aShort3, this.aShort3, this.aShort8, this.aShort8, this.aShort3, this.aShort3 };
				@Pc(436) int[] local436 = new int[] { this.aShort4, this.aShort4, this.aShort4, this.aShort4, this.aShort10, this.aShort10, this.aShort10, this.aShort10 };
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
				if (Static177.anInt3590 >= local255 && Static177.anInt3590 <= local259 && Static223.anInt4478 >= local274 && Static223.anInt4478 <= local278) {
					if (this.aBoolean223) {
						Static4.aLongArray1[Static242.anInt4774++] = arg8;
					} else {
						local241 = true;
					}
				}
			}
		}
		@Pc(628) int local628;
		for (local255 = 0; local255 < this.anInt422; local255++) {
			local274 = this.anIntArray15[local255];
			local259 = this.anIntArray22[local255];
			local278 = this.anIntArray20[local255];
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
			Static18.anIntArray41[local255] = local278 - local24;
			if (local278 >= 50) {
				Static18.anIntArray54[local255] = local223 + (local274 << 9) / local278;
				Static18.anIntArray56[local255] = local225 + (local628 << 9) / local278;
			} else {
				Static18.anIntArray54[local255] = -5000;
				local205 = true;
			}
			if (local221) {
				Static18.anIntArray37[local255] = local274;
				Static18.anIntArray47[local255] = local628;
				Static18.anIntArray49[local255] = local278;
			}
		}
		if (arg10 != null) {
			local255 = Static117.anInt2419 + local223;
			local274 = Static117.anInt2420 + local225;
			for (local259 = 0; local259 < arg10.aClass21_Sub2_Sub1Array1.length; local259++) {
				@Pc(770) Class21_Sub2_Sub1 local770 = arg10.aClass21_Sub2_Sub1Array1[local259];
				if (local770 == null || local770.aBoolean396) {
					Static18.anIntArray48[local259] = Integer.MIN_VALUE;
				} else {
					local628 = (local770.anInt5757 >> 12) - Static54.anInt1239;
					@Pc(789) int local789 = (local770.anInt5758 >> 12) - Static222.anInt4471;
					@Pc(796) int local796 = (local770.anInt5762 >> 12) - Static179.anInt3613;
					local438 = local796 * arg3 + local628 * arg4 >> 16;
					@Pc(816) int local816 = local796 * arg4 - local628 * arg3 >> 16;
					local628 = local438;
					local438 = local789 * arg2 - local816 * arg1 >> 16;
					@Pc(838) int local838 = local789 * arg1 + local816 * arg2 >> 16;
					if (local838 >= 50) {
						Static18.anIntArray43[local259] = local255 + (local628 << 9) / local838;
						Static18.anIntArray45[local259] = local274 + (local438 << 9) / local838;
						Static18.anIntArray51[local259] = local838;
						Static18.anIntArray48[local259] = local838 - local24;
					} else {
						Static18.anIntArray48[local259] = Integer.MIN_VALUE;
					}
				}
			}
		}
		try {
			this.method402(local205, local241, arg8, local24 - local53, local38 - local53 + 2, arg10);
		} catch (@Pc(901) Exception local901) {
		}
	}

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "(I)V")
	@Override
	public void method2733(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class174.anIntArray444[arg0];
		@Pc(7) int local7 = Class174.anIntArray443[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt422; local9++) {
			@Pc(29) int local29 = this.anIntArray22[local9] * local7 - this.anIntArray20[local9] * local3 >> 16;
			this.anIntArray20[local9] = this.anIntArray22[local9] * local3 + this.anIntArray20[local9] * local7 >> 16;
			this.anIntArray22[local9] = local29;
		}
		this.aBoolean29 = false;
	}

	@OriginalMember(owner = "client!bb", name = "i", descriptor = "()V")
	@Override
	public void method2745() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt422; local1++) {
			@Pc(10) int local10 = this.anIntArray15[local1];
			this.anIntArray15[local1] = this.anIntArray20[local1];
			this.anIntArray20[local1] = -local10;
		}
		this.aBoolean29 = false;
	}

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "()I")
	@Override
	public int method4266() {
		if (!this.aBoolean29) {
			this.method406();
		}
		return this.aShort4;
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(ZZZ)Lclient!gk;")
	@Override
	public Class13_Sub1 method2729(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		if (!arg0 && Static18.aByteArray7.length < this.anInt425) {
			Static18.aByteArray7 = new byte[this.anInt425 + 100];
		}
		if (!arg1 && Static18.aShortArray8.length < this.anInt425) {
			Static18.anIntArray31 = new int[this.anInt425 + 100];
			Static18.anIntArray30 = new int[this.anInt425 + 100];
			Static18.anIntArray29 = new int[this.anInt425 + 100];
			Static18.aShortArray8 = new short[this.anInt425 + 100];
		}
		return this.method404(arg0, arg1, Static18.aClass13_Sub1_Sub1_2, Static18.aByteArray7, Static18.aShortArray8, Static18.anIntArray31, Static18.anIntArray30, Static18.anIntArray29);
	}
}
