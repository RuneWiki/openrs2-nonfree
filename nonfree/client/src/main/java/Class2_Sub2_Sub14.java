import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nj")
public final class Class2_Sub2_Sub14 extends Class2_Sub2 {

	@OriginalMember(owner = "client!nj", name = "x", descriptor = "[I")
	private final int[] anIntArray400;

	@OriginalMember(owner = "client!nj", name = "B", descriptor = "[I")
	private final int[] anIntArray401;

	@OriginalMember(owner = "client!nj", name = "t", descriptor = "Lclient!eo;")
	private final Class2_Sub4 aClass2_Sub4_1;

	@OriginalMember(owner = "client!nj", name = "C", descriptor = "Lclient!eo;")
	private final Class2_Sub4 aClass2_Sub4_3;

	@OriginalMember(owner = "client!nj", name = "u", descriptor = "Lclient!eo;")
	private final Class2_Sub4 aClass2_Sub4_2;

	@OriginalMember(owner = "client!nj", name = "z", descriptor = "[Lclient!eo;")
	private final Class2_Sub4[] aClass2_Sub4Array22;

	@OriginalMember(owner = "client!nj", name = "<init>", descriptor = "()V")
	private Class2_Sub2_Sub14() {
		this.anIntArray400 = new int[0];
		this.anIntArray401 = new int[0];
		this.aClass2_Sub4_1 = new Class2_Sub4_Sub30(0);
		this.aClass2_Sub4_1.anInt9462 = 1;
		this.aClass2_Sub4_3 = new Class2_Sub4_Sub30();
		this.aClass2_Sub4_3.anInt9462 = 1;
		this.aClass2_Sub4_2 = new Class2_Sub4_Sub30();
		this.aClass2_Sub4Array22 = new Class2_Sub4[] { this.aClass2_Sub4_3, this.aClass2_Sub4_2, this.aClass2_Sub4_1 };
		this.aClass2_Sub4_2.anInt9462 = 1;
	}

	@OriginalMember(owner = "client!nj", name = "<init>", descriptor = "(Lclient!gk;)V")
	public Class2_Sub2_Sub14(@OriginalArg(0) Class2_Sub7 arg0) {
		@Pc(7) int local7 = arg0.method4464();
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		this.aClass2_Sub4Array22 = new Class2_Sub4[local7];
		@Pc(18) int[][] local18 = new int[local7][];
		@Pc(50) int local50;
		for (@Pc(20) int local20 = 0; local20 < local7; local20++) {
			@Pc(26) Class2_Sub4 local26 = Static571.method7438(arg0);
			if (local26.method7560() >= 0) {
				local9++;
			}
			if (local26.method7557() >= 0) {
				local11++;
			}
			@Pc(43) int local43 = local26.aClass2_Sub4Array42.length;
			local18[local20] = new int[local43];
			for (local50 = 0; local50 < local43; local50++) {
				local18[local20][local50] = arg0.method4464();
			}
			this.aClass2_Sub4Array22[local20] = local26;
		}
		this.anIntArray401 = new int[local9];
		this.anIntArray400 = new int[local11];
		local9 = 0;
		local11 = 0;
		for (@Pc(87) int local87 = 0; local87 < local7; local87++) {
			@Pc(94) Class2_Sub4 local94 = this.aClass2_Sub4Array22[local87];
			local50 = local94.aClass2_Sub4Array42.length;
			for (@Pc(100) int local100 = 0; local100 < local50; local100++) {
				local94.aClass2_Sub4Array42[local100] = this.aClass2_Sub4Array22[local18[local87][local100]];
			}
			@Pc(122) int local122 = local94.method7560();
			@Pc(126) int local126 = local94.method7557();
			if (local122 > 0) {
				this.anIntArray401[local9++] = local122;
			}
			if (local126 > 0) {
				this.anIntArray400[local11++] = local126;
			}
			local18[local87] = null;
		}
		this.aClass2_Sub4_3 = this.aClass2_Sub4Array22[arg0.method4464()];
		this.aClass2_Sub4_2 = this.aClass2_Sub4Array22[arg0.method4464()];
		this.aClass2_Sub4_1 = this.aClass2_Sub4Array22[arg0.method4464()];
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(Lclient!mv;IZBLclient!fa;I)[F")
	public float[] method5104(@OriginalArg(0) Class229 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) Interface9 arg3, @OriginalArg(5) int arg4) {
		Static225.anInterface9_2 = arg3;
		Static55.aClass229_14 = arg0;
		for (@Pc(11) int local11 = 0; local11 < this.aClass2_Sub4Array22.length; local11++) {
			this.aClass2_Sub4Array22[local11].method7565(arg1, arg4);
		}
		Static95.method1452(arg1, arg4);
		@Pc(42) float[] local42 = new float[arg4 * arg1 * 4];
		@Pc(44) int local44 = 0;
		for (@Pc(46) int local46 = 0; local46 < arg4; local46++) {
			@Pc(64) int[] local64;
			@Pc(62) int[] local62;
			@Pc(60) int[] local60;
			if (this.aClass2_Sub4_3.aBoolean789) {
				@Pc(58) int[] local58 = this.aClass2_Sub4_3.method7564(local46);
				local60 = local58;
				local62 = local58;
				local64 = local58;
			} else {
				@Pc(72) int[][] local72 = this.aClass2_Sub4_3.method7561(local46);
				local60 = local72[2];
				local64 = local72[0];
				local62 = local72[1];
			}
			@Pc(96) int[] local96;
			if (this.aClass2_Sub4_2.aBoolean789) {
				local96 = this.aClass2_Sub4_2.method7564(local46);
			} else {
				local96 = this.aClass2_Sub4_2.method7561(local46)[0];
			}
			@Pc(114) int[] local114;
			if (this.aClass2_Sub4_1.aBoolean789) {
				local114 = this.aClass2_Sub4_1.method7564(local46);
			} else {
				local114 = this.aClass2_Sub4_1.method7561(local46)[0];
			}
			if (arg2) {
				local44 = local46 << 2;
			}
			for (@Pc(134) int local134 = arg1 - 1; local134 >= 0; local134--) {
				@Pc(143) float local143 = (float) local96[local134] / 4096.0F;
				@Pc(156) float local156 = ((float) local114[local134] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
				if (local143 < 0.0F) {
					local143 = 0.0F;
				} else if (local143 > 1.0F) {
					local143 = 1.0F;
				}
				local42[local44++] = (float) local64[local134] * local156;
				local42[local44++] = local156 * (float) local62[local134];
				local42[local44++] = (float) local60[local134] * local156;
				local42[local44++] = local143;
				if (arg2) {
					local44 += (arg1 << 2) - 4;
				}
			}
		}
		for (@Pc(242) int local242 = 0; local242 < this.aClass2_Sub4Array22.length; local242++) {
			this.aClass2_Sub4Array22[local242].method7558();
		}
		return local42;
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(IBZIZDLclient!mv;Lclient!fa;)[I")
	public int[] method5105(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) double arg4, @OriginalArg(6) Class229 arg5, @OriginalArg(7) Interface9 arg6) {
		Static55.aClass229_14 = arg5;
		Static225.anInterface9_2 = arg6;
		for (@Pc(11) int local11 = 0; local11 < this.aClass2_Sub4Array22.length; local11++) {
			this.aClass2_Sub4Array22[local11].method7565(arg0, arg2);
		}
		Static316.method4593(arg4);
		Static95.method1452(arg0, arg2);
		@Pc(46) int[] local46 = new int[arg2 * arg0];
		@Pc(52) int local52;
		@Pc(56) int local56;
		@Pc(54) byte local54;
		if (arg3) {
			local52 = arg0 - 1;
			local54 = -1;
			local56 = -1;
		} else {
			local56 = arg0;
			local52 = 0;
			local54 = 1;
		}
		@Pc(66) int local66 = 0;
		for (@Pc(68) int local68 = 0; local68 < arg2; local68++) {
			if (arg1) {
				local66 = local68;
			}
			@Pc(90) int[] local90;
			@Pc(86) int[] local86;
			@Pc(88) int[] local88;
			if (this.aClass2_Sub4_3.aBoolean789) {
				@Pc(84) int[] local84 = this.aClass2_Sub4_3.method7564(local68);
				local86 = local84;
				local88 = local84;
				local90 = local84;
			} else {
				@Pc(98) int[][] local98 = this.aClass2_Sub4_3.method7561(local68);
				local86 = local98[1];
				local88 = local98[2];
				local90 = local98[0];
			}
			for (@Pc(112) int local112 = local52; local112 != local56; local112 += local54) {
				@Pc(120) int local120 = local90[local112] >> 4;
				if (local120 > 255) {
					local120 = 255;
				}
				if (local120 < 0) {
					local120 = 0;
				}
				@Pc(138) int local138 = local86[local112] >> 4;
				if (local138 > 255) {
					local138 = 255;
				}
				if (local138 < 0) {
					local138 = 0;
				}
				@Pc(156) int local156 = local88[local112] >> 4;
				if (local156 > 255) {
					local156 = 255;
				}
				local138 = Static403.anIntArray607[local138];
				local120 = Static403.anIntArray607[local120];
				if (local156 < 0) {
					local156 = 0;
				}
				local156 = Static403.anIntArray607[local156];
				@Pc(188) int local188 = (local138 << 8) + ((local120 << 16) + local156);
				if (local188 != 0) {
					local188 |= 0xFF000000;
				}
				local46[local66++] = local188;
				if (arg1) {
					local66 += arg0 - 1;
				}
			}
		}
		for (@Pc(223) int local223 = 0; local223 < this.aClass2_Sub4Array22.length; local223++) {
			this.aClass2_Sub4Array22[local223].method7558();
		}
		return local46;
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(IZLclient!fa;Lclient!mv;IDI)[I")
	public int[] method5106(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Interface9 arg2, @OriginalArg(3) Class229 arg3, @OriginalArg(5) double arg4, @OriginalArg(6) int arg5) {
		Static225.anInterface9_2 = arg2;
		Static55.aClass229_14 = arg3;
		for (@Pc(11) int local11 = 0; local11 < this.aClass2_Sub4Array22.length; local11++) {
			this.aClass2_Sub4Array22[local11].method7565(arg5, arg0);
		}
		Static316.method4593(arg4);
		Static95.method1452(arg5, arg0);
		@Pc(41) int[] local41 = new int[arg5 * 4 * arg0];
		@Pc(43) int local43 = 0;
		for (@Pc(45) int local45 = 0; local45 < arg0; local45++) {
			@Pc(61) int[] local61;
			@Pc(69) int[] local69;
			@Pc(65) int[] local65;
			@Pc(77) int[] local77;
			if (this.aClass2_Sub4_3.aBoolean789) {
				local77 = this.aClass2_Sub4_3.method7564(local45);
				local65 = local77;
				local69 = local77;
				local61 = local77;
			} else {
				@Pc(57) int[][] local57 = this.aClass2_Sub4_3.method7561(local45);
				local61 = local57[0];
				local65 = local57[2];
				local69 = local57[1];
			}
			if (this.aClass2_Sub4_2.aBoolean789) {
				local77 = this.aClass2_Sub4_2.method7564(local45);
			} else {
				local77 = this.aClass2_Sub4_2.method7561(local45)[0];
			}
			if (arg1) {
				local43 = local45;
			}
			for (@Pc(113) int local113 = arg5 - 1; local113 >= 0; local113--) {
				@Pc(121) int local121 = local61[local113] >> 4;
				if (local121 > 255) {
					local121 = 255;
				}
				if (local121 < 0) {
					local121 = 0;
				}
				@Pc(138) int local138 = local69[local113] >> 4;
				if (local138 > 255) {
					local138 = 255;
				}
				if (local138 < 0) {
					local138 = 0;
				}
				@Pc(158) int local158 = local65[local113] >> 4;
				if (local158 > 255) {
					local158 = 255;
				}
				local138 = Static403.anIntArray607[local138];
				local121 = Static403.anIntArray607[local121];
				if (local158 < 0) {
					local158 = 0;
				}
				local158 = Static403.anIntArray607[local158];
				@Pc(196) int local196;
				if (local121 == 0 && local138 == 0 && local158 == 0) {
					local196 = 0;
				} else {
					local196 = local77[local113] >> 4;
					if (local196 > 255) {
						local196 = 255;
					}
					if (local196 < 0) {
						local196 = 0;
					}
				}
				local41[local43++] = local158 + (local138 << 8) + (local196 << 24) + (local121 << 16);
				if (arg1) {
					local43 += arg5 - 1;
				}
			}
		}
		for (@Pc(248) int local248 = 0; local248 < this.aClass2_Sub4Array22.length; local248++) {
			this.aClass2_Sub4Array22[local248].method7558();
		}
		return local41;
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(Lclient!mv;Lclient!fa;B)Z")
	public boolean method5108(@OriginalArg(0) Class229 arg0, @OriginalArg(1) Interface9 arg1) {
		@Pc(9) int local9;
		if (Static512.anInt8185 < 0) {
			for (local9 = 0; local9 < this.anIntArray401.length; local9++) {
				if (!arg0.method4954(this.anIntArray401[local9])) {
					return false;
				}
			}
		} else {
			for (local9 = 0; local9 < this.anIntArray401.length; local9++) {
				if (!arg0.method4979(Static512.anInt8185, this.anIntArray401[local9])) {
					return false;
				}
			}
		}
		for (@Pc(64) int local64 = 0; local64 < this.anIntArray400.length; local64++) {
			if (!arg1.method1073(this.anIntArray400[local64])) {
				return false;
			}
		}
		return true;
	}
}
