import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mea")
public final class Class4_Sub5_Sub14 extends Class4_Sub5 {

	@OriginalMember(owner = "client!mea", name = "G", descriptor = "[I")
	private final int[] anIntArray427;

	@OriginalMember(owner = "client!mea", name = "D", descriptor = "[I")
	private final int[] anIntArray426;

	@OriginalMember(owner = "client!mea", name = "x", descriptor = "Lclient!aea;")
	private final Class4_Sub2 aClass4_Sub2_2;

	@OriginalMember(owner = "client!mea", name = "v", descriptor = "Lclient!aea;")
	private final Class4_Sub2 aClass4_Sub2_1;

	@OriginalMember(owner = "client!mea", name = "B", descriptor = "Lclient!aea;")
	private final Class4_Sub2 aClass4_Sub2_3;

	@OriginalMember(owner = "client!mea", name = "z", descriptor = "[Lclient!aea;")
	private final Class4_Sub2[] aClass4_Sub2Array20;

	@OriginalMember(owner = "client!mea", name = "<init>", descriptor = "()V")
	private Class4_Sub5_Sub14() {
		this.anIntArray427 = new int[0];
		this.anIntArray426 = new int[0];
		this.aClass4_Sub2_2 = new Class4_Sub2_Sub22(0);
		this.aClass4_Sub2_2.anInt10378 = 1;
		this.aClass4_Sub2_1 = new Class4_Sub2_Sub22();
		this.aClass4_Sub2_1.anInt10378 = 1;
		this.aClass4_Sub2_3 = new Class4_Sub2_Sub22();
		this.aClass4_Sub2_3.anInt10378 = 1;
		this.aClass4_Sub2Array20 = new Class4_Sub2[] { this.aClass4_Sub2_1, this.aClass4_Sub2_3, this.aClass4_Sub2_2 };
	}

	@OriginalMember(owner = "client!mea", name = "<init>", descriptor = "(Lclient!es;)V")
	public Class4_Sub5_Sub14(@OriginalArg(0) Class4_Sub11 arg0) {
		@Pc(7) int local7 = arg0.method8865();
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		this.aClass4_Sub2Array20 = new Class4_Sub2[local7];
		@Pc(18) int[][] local18 = new int[local7][];
		@Pc(53) int local53;
		for (@Pc(20) int local20 = 0; local20 < local7; local20++) {
			@Pc(26) Class4_Sub2 local26 = Static670.method6030(arg0);
			if (local26.method8770() >= 0) {
				local9++;
			}
			if (local26.method8774() >= 0) {
				local11++;
			}
			@Pc(46) int local46 = local26.aClass4_Sub2Array42.length;
			local18[local20] = new int[local46];
			for (local53 = 0; local53 < local46; local53++) {
				local18[local20][local53] = arg0.method8865();
			}
			this.aClass4_Sub2Array20[local20] = local26;
		}
		this.anIntArray426 = new int[local9];
		local9 = 0;
		this.anIntArray427 = new int[local11];
		local11 = 0;
		for (@Pc(94) int local94 = 0; local94 < local7; local94++) {
			@Pc(101) Class4_Sub2 local101 = this.aClass4_Sub2Array20[local94];
			local53 = local101.aClass4_Sub2Array42.length;
			for (@Pc(107) int local107 = 0; local107 < local53; local107++) {
				local101.aClass4_Sub2Array42[local107] = this.aClass4_Sub2Array20[local18[local94][local107]];
			}
			@Pc(133) int local133 = local101.method8770();
			@Pc(137) int local137 = local101.method8774();
			if (local133 > 0) {
				this.anIntArray426[local9++] = local133;
			}
			if (local137 > 0) {
				this.anIntArray427[local11++] = local137;
			}
			local18[local94] = null;
		}
		this.aClass4_Sub2_1 = this.aClass4_Sub2Array20[arg0.method8865()];
		this.aClass4_Sub2_3 = this.aClass4_Sub2Array20[arg0.method8865()];
		this.aClass4_Sub2_2 = this.aClass4_Sub2Array20[arg0.method8865()];
	}

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "(DLclient!bt;IILclient!d;ZI)[I")
	public int[] method4864(@OriginalArg(0) double arg0, @OriginalArg(1) Class34 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Interface9 arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		Static473.anInterface9_11 = arg3;
		Static142.aClass34_69 = arg1;
		for (@Pc(11) int local11 = 0; local11 < this.aClass4_Sub2Array20.length; local11++) {
			this.aClass4_Sub2Array20[local11].method8766(arg5, arg2);
		}
		Static502.method6839(arg0);
		Static592.method7785(arg5, arg2);
		@Pc(43) int[] local43 = new int[arg2 * arg5];
		@Pc(45) int local45 = 0;
		for (@Pc(47) int local47 = 0; local47 < arg5; local47++) {
			@Pc(61) int[] local61;
			@Pc(63) int[] local63;
			@Pc(65) int[] local65;
			@Pc(59) int[] local59;
			if (this.aClass4_Sub2_1.aBoolean793) {
				local59 = this.aClass4_Sub2_1.method8765(local47);
				local61 = local59;
				local63 = local59;
				local65 = local59;
			} else {
				@Pc(73) int[][] local73 = this.aClass4_Sub2_1.method8771(local47);
				local61 = local73[0];
				local65 = local73[2];
				local63 = local73[1];
			}
			if (this.aClass4_Sub2_3.aBoolean793) {
				local59 = this.aClass4_Sub2_3.method8765(local47);
			} else {
				local59 = this.aClass4_Sub2_3.method8771(local47)[0];
			}
			if (arg4) {
				local45 = local47;
			}
			for (@Pc(113) int local113 = arg2 - 1; local113 >= 0; local113--) {
				@Pc(121) int local121 = local61[local113] >> 4;
				if (local121 > 255) {
					local121 = 255;
				}
				if (local121 < 0) {
					local121 = 0;
				}
				@Pc(139) int local139 = local63[local113] >> 4;
				if (local139 > 255) {
					local139 = 255;
				}
				if (local139 < 0) {
					local139 = 0;
				}
				@Pc(154) int local154 = local65[local113] >> 4;
				if (local154 > 255) {
					local154 = 255;
				}
				if (local154 < 0) {
					local154 = 0;
				}
				local121 = Static61.anIntArray88[local121];
				local139 = Static61.anIntArray88[local139];
				local154 = Static61.anIntArray88[local154];
				@Pc(192) int local192;
				if (local121 == 0 && local139 == 0 && local154 == 0) {
					local192 = 0;
				} else {
					local192 = local59[local113] >> 4;
					if (local192 > 255) {
						local192 = 255;
					}
					if (local192 < 0) {
						local192 = 0;
					}
				}
				local43[local45++] = local154 + (local121 << 16) + (local192 << 24) + (local139 << 8);
				if (arg4) {
					local45 += arg2 - 1;
				}
			}
		}
		for (@Pc(259) int local259 = 0; local259 < this.aClass4_Sub2Array20.length; local259++) {
			this.aClass4_Sub2Array20[local259].method8763();
		}
		return local43;
	}

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "(IZBLclient!d;DIZLclient!bt;)[I")
	public int[] method4866(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) Interface9 arg2, @OriginalArg(4) double arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) Class34 arg6) {
		Static473.anInterface9_11 = arg2;
		Static142.aClass34_69 = arg6;
		for (@Pc(11) int local11 = 0; local11 < this.aClass4_Sub2Array20.length; local11++) {
			this.aClass4_Sub2Array20[local11].method8766(arg0, arg4);
		}
		Static502.method6839(arg3);
		Static592.method7785(arg0, arg4);
		@Pc(46) int[] local46 = new int[arg0 * arg4];
		@Pc(52) int local52;
		@Pc(56) int local56;
		@Pc(54) byte local54;
		if (arg5) {
			local52 = arg4 - 1;
			local54 = -1;
			local56 = -1;
		} else {
			local52 = 0;
			local56 = arg4;
			local54 = 1;
		}
		@Pc(66) int local66 = 0;
		for (@Pc(68) int local68 = 0; local68 < arg0; local68++) {
			@Pc(82) int[] local82;
			@Pc(84) int[] local84;
			@Pc(86) int[] local86;
			if (this.aClass4_Sub2_1.aBoolean793) {
				@Pc(80) int[] local80 = this.aClass4_Sub2_1.method8765(local68);
				local82 = local80;
				local84 = local80;
				local86 = local80;
			} else {
				@Pc(94) int[][] local94 = this.aClass4_Sub2_1.method8771(local68);
				local86 = local94[2];
				local82 = local94[0];
				local84 = local94[1];
			}
			if (arg1) {
				local66 = local68;
			}
			for (@Pc(112) int local112 = local52; local112 != local56; local112 += local54) {
				@Pc(120) int local120 = local82[local112] >> 4;
				if (local120 > 255) {
					local120 = 255;
				}
				if (local120 < 0) {
					local120 = 0;
				}
				@Pc(138) int local138 = local84[local112] >> 4;
				if (local138 > 255) {
					local138 = 255;
				}
				if (local138 < 0) {
					local138 = 0;
				}
				@Pc(158) int local158 = local86[local112] >> 4;
				if (local158 > 255) {
					local158 = 255;
				}
				local120 = Static61.anIntArray88[local120];
				local138 = Static61.anIntArray88[local138];
				if (local158 < 0) {
					local158 = 0;
				}
				local158 = Static61.anIntArray88[local158];
				@Pc(194) int local194 = local158 + (local138 << 8) + (local120 << 16);
				if (local194 != 0) {
					local194 |= 0xFF000000;
				}
				local46[local66++] = local194;
				if (arg1) {
					local66 += arg4 - 1;
				}
			}
		}
		for (@Pc(229) int local229 = 0; local229 < this.aClass4_Sub2Array20.length; local229++) {
			this.aClass4_Sub2Array20[local229].method8763();
		}
		return local46;
	}

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "(Lclient!d;Lclient!bt;IIIZ)[F")
	public float[] method4867(@OriginalArg(0) Interface9 arg0, @OriginalArg(1) Class34 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		Static142.aClass34_69 = arg1;
		Static473.anInterface9_11 = arg0;
		for (@Pc(11) int local11 = 0; local11 < this.aClass4_Sub2Array20.length; local11++) {
			this.aClass4_Sub2Array20[local11].method8766(arg3, arg2);
		}
		Static592.method7785(arg3, arg2);
		@Pc(42) float[] local42 = new float[arg3 * arg2 * 4];
		@Pc(44) int local44 = 0;
		for (@Pc(46) int local46 = 0; local46 < arg3; local46++) {
			@Pc(64) int[] local64;
			@Pc(60) int[] local60;
			@Pc(62) int[] local62;
			if (this.aClass4_Sub2_1.aBoolean793) {
				@Pc(58) int[] local58 = this.aClass4_Sub2_1.method8765(local46);
				local60 = local58;
				local62 = local58;
				local64 = local58;
			} else {
				@Pc(72) int[][] local72 = this.aClass4_Sub2_1.method8771(local46);
				local64 = local72[0];
				local62 = local72[2];
				local60 = local72[1];
			}
			@Pc(96) int[] local96;
			if (this.aClass4_Sub2_3.aBoolean793) {
				local96 = this.aClass4_Sub2_3.method8765(local46);
			} else {
				local96 = this.aClass4_Sub2_3.method8771(local46)[0];
			}
			if (arg4) {
				local44 = local46 << 2;
			}
			@Pc(122) int[] local122;
			if (this.aClass4_Sub2_2.aBoolean793) {
				local122 = this.aClass4_Sub2_2.method8765(local46);
			} else {
				local122 = this.aClass4_Sub2_2.method8771(local46)[0];
			}
			for (@Pc(136) int local136 = arg2 - 1; local136 >= 0; local136--) {
				@Pc(145) float local145 = (float) local96[local136] / 4096.0F;
				@Pc(158) float local158 = ((float) local122[local136] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
				if (local145 < 0.0F) {
					local145 = 0.0F;
				} else if (local145 > 1.0F) {
					local145 = 1.0F;
				}
				local42[local44++] = local158 * (float) local64[local136];
				local42[local44++] = local158 * (float) local60[local136];
				local42[local44++] = local158 * (float) local62[local136];
				local42[local44++] = local145;
				if (arg4) {
					local44 += (arg2 << 2) - 4;
				}
			}
		}
		for (@Pc(232) int local232 = 0; local232 < this.aClass4_Sub2Array20.length; local232++) {
			this.aClass4_Sub2Array20[local232].method8763();
		}
		return local42;
	}

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "(BLclient!d;Lclient!bt;)Z")
	public boolean method4869(@OriginalArg(1) Interface9 arg0, @OriginalArg(2) Class34 arg1) {
		@Pc(17) int local17;
		if (Static104.anInt2127 >= 0) {
			for (local17 = 0; local17 < this.anIntArray426.length; local17++) {
				if (!arg1.method1245(this.anIntArray426[local17], Static104.anInt2127)) {
					return false;
				}
			}
		} else {
			for (local17 = 0; local17 < this.anIntArray426.length; local17++) {
				if (!arg1.method1235(this.anIntArray426[local17])) {
					return false;
				}
			}
		}
		for (local17 = 0; local17 < this.anIntArray427.length; local17++) {
			if (!arg0.method1557(this.anIntArray427[local17])) {
				return false;
			}
		}
		return true;
	}
}
