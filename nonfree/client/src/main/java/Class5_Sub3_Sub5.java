import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hf")
public final class Class5_Sub3_Sub5 extends Class5_Sub3 {

	@OriginalMember(owner = "client!hf", name = "C", descriptor = "[I")
	private final int[] anIntArray210;

	@OriginalMember(owner = "client!hf", name = "r", descriptor = "[I")
	private final int[] anIntArray209;

	@OriginalMember(owner = "client!hf", name = "w", descriptor = "Lclient!qd;")
	private final Class5_Sub2 aClass5_Sub2_2;

	@OriginalMember(owner = "client!hf", name = "v", descriptor = "Lclient!qd;")
	private final Class5_Sub2 aClass5_Sub2_1;

	@OriginalMember(owner = "client!hf", name = "z", descriptor = "Lclient!qd;")
	private final Class5_Sub2 aClass5_Sub2_3;

	@OriginalMember(owner = "client!hf", name = "x", descriptor = "[Lclient!qd;")
	private final Class5_Sub2[] aClass5_Sub2Array15;

	@OriginalMember(owner = "client!hf", name = "<init>", descriptor = "()V")
	private Class5_Sub3_Sub5() {
		this.anIntArray210 = new int[0];
		this.anIntArray209 = new int[0];
		this.aClass5_Sub2_2 = new Class5_Sub2_Sub14(0);
		this.aClass5_Sub2_2.anInt10759 = 1;
		this.aClass5_Sub2_1 = new Class5_Sub2_Sub14();
		this.aClass5_Sub2_1.anInt10759 = 1;
		this.aClass5_Sub2_3 = new Class5_Sub2_Sub14();
		this.aClass5_Sub2Array15 = new Class5_Sub2[] { this.aClass5_Sub2_1, this.aClass5_Sub2_3, this.aClass5_Sub2_2 };
		this.aClass5_Sub2_3.anInt10759 = 1;
	}

	@OriginalMember(owner = "client!hf", name = "<init>", descriptor = "(Lclient!mc;)V")
	public Class5_Sub3_Sub5(@OriginalArg(0) Class5_Sub41 arg0) {
		@Pc(7) int local7 = arg0.method7816();
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		@Pc(14) int[][] local14 = new int[local7][];
		this.aClass5_Sub2Array15 = new Class5_Sub2[local7];
		@Pc(47) int local47;
		for (@Pc(20) int local20 = 0; local20 < local7; local20++) {
			@Pc(26) Class5_Sub2 local26 = Static24.method6163(arg0);
			if (local26.method8946() >= 0) {
				local9++;
			}
			if (local26.method8953() >= 0) {
				local11++;
			}
			@Pc(40) int local40 = local26.aClass5_Sub2Array42.length;
			local14[local20] = new int[local40];
			for (local47 = 0; local47 < local40; local47++) {
				local14[local20][local47] = arg0.method7816();
			}
			this.aClass5_Sub2Array15[local20] = local26;
		}
		this.anIntArray210 = new int[local9];
		this.anIntArray209 = new int[local11];
		local9 = 0;
		local11 = 0;
		for (@Pc(84) int local84 = 0; local84 < local7; local84++) {
			@Pc(91) Class5_Sub2 local91 = this.aClass5_Sub2Array15[local84];
			local47 = local91.aClass5_Sub2Array42.length;
			for (@Pc(97) int local97 = 0; local97 < local47; local97++) {
				local91.aClass5_Sub2Array42[local97] = this.aClass5_Sub2Array15[local14[local84][local97]];
			}
			@Pc(119) int local119 = local91.method8946();
			@Pc(123) int local123 = local91.method8953();
			if (local119 > 0) {
				this.anIntArray210[local9++] = local119;
			}
			if (local123 > 0) {
				this.anIntArray209[local11++] = local123;
			}
			local14[local84] = null;
		}
		this.aClass5_Sub2_1 = this.aClass5_Sub2Array15[arg0.method7816()];
		this.aClass5_Sub2_3 = this.aClass5_Sub2Array15[arg0.method7816()];
		this.aClass5_Sub2_2 = this.aClass5_Sub2Array15[arg0.method7816()];
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(ILclient!d;IIZLclient!wm;)[F")
	public float[] method3510(@OriginalArg(1) Interface4 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) Class390 arg4) {
		Static69.aClass390_125 = arg4;
		Static476.anInterface4_9 = arg0;
		for (@Pc(19) int local19 = 0; local19 < this.aClass5_Sub2Array15.length; local19++) {
			this.aClass5_Sub2Array15[local19].method8949(arg2, arg1);
		}
		Static187.method5796(arg2, arg1);
		@Pc(50) float[] local50 = new float[arg2 * 4 * arg1];
		@Pc(52) int local52 = 0;
		for (@Pc(54) int local54 = 0; local54 < arg2; local54++) {
			@Pc(68) int[] local68;
			@Pc(70) int[] local70;
			@Pc(72) int[] local72;
			if (this.aClass5_Sub2_1.aBoolean910) {
				@Pc(66) int[] local66 = this.aClass5_Sub2_1.method8942(local54);
				local68 = local66;
				local70 = local66;
				local72 = local66;
			} else {
				@Pc(80) int[][] local80 = this.aClass5_Sub2_1.method8943(local54);
				local72 = local80[2];
				local68 = local80[0];
				local70 = local80[1];
			}
			@Pc(102) int[] local102;
			if (this.aClass5_Sub2_3.aBoolean910) {
				local102 = this.aClass5_Sub2_3.method8942(local54);
			} else {
				local102 = this.aClass5_Sub2_3.method8943(local54)[0];
			}
			@Pc(122) int[] local122;
			if (this.aClass5_Sub2_2.aBoolean910) {
				local122 = this.aClass5_Sub2_2.method8942(local54);
			} else {
				local122 = this.aClass5_Sub2_2.method8943(local54)[0];
			}
			if (arg3) {
				local52 = local54 << 2;
			}
			for (@Pc(142) int local142 = arg1 - 1; local142 >= 0; local142--) {
				@Pc(151) float local151 = (float) local102[local142] / 4096.0F;
				if (local151 < 0.0F) {
					local151 = 0.0F;
				} else if (local151 > 1.0F) {
					local151 = 1.0F;
				}
				@Pc(178) float local178 = ((float) local122[local142] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
				local50[local52++] = local178 * (float) local68[local142];
				local50[local52++] = (float) local70[local142] * local178;
				local50[local52++] = (float) local72[local142] * local178;
				local50[local52++] = local151;
				if (arg3) {
					local52 += (arg1 << 2) - 4;
				}
			}
		}
		for (@Pc(235) int local235 = 0; local235 < this.aClass5_Sub2Array15.length; local235++) {
			this.aClass5_Sub2Array15[local235].method8947();
		}
		return local50;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(ILclient!d;Lclient!wm;IIZD)[I")
	public int[] method3511(@OriginalArg(1) Interface4 arg0, @OriginalArg(2) Class390 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) double arg5) {
		Static69.aClass390_125 = arg1;
		Static476.anInterface4_9 = arg0;
		for (@Pc(11) int local11 = 0; local11 < this.aClass5_Sub2Array15.length; local11++) {
			this.aClass5_Sub2Array15[local11].method8949(arg2, arg3);
		}
		Static556.method7715(arg5);
		Static187.method5796(arg2, arg3);
		@Pc(47) int[] local47 = new int[arg2 * arg3];
		@Pc(49) int local49 = 0;
		for (@Pc(51) int local51 = 0; local51 < arg2; local51++) {
			@Pc(75) int[] local75;
			@Pc(67) int[] local67;
			@Pc(71) int[] local71;
			@Pc(83) int[] local83;
			if (this.aClass5_Sub2_1.aBoolean910) {
				local83 = this.aClass5_Sub2_1.method8942(local51);
				local75 = local83;
				local71 = local83;
				local67 = local83;
			} else {
				@Pc(63) int[][] local63 = this.aClass5_Sub2_1.method8943(local51);
				local67 = local63[1];
				local71 = local63[2];
				local75 = local63[0];
			}
			if (arg4) {
				local49 = local51;
			}
			if (this.aClass5_Sub2_3.aBoolean910) {
				local83 = this.aClass5_Sub2_3.method8942(local51);
			} else {
				local83 = this.aClass5_Sub2_3.method8943(local51)[0];
			}
			for (@Pc(117) int local117 = arg3 - 1; local117 >= 0; local117--) {
				@Pc(125) int local125 = local75[local117] >> 4;
				if (local125 > 255) {
					local125 = 255;
				}
				if (local125 < 0) {
					local125 = 0;
				}
				@Pc(145) int local145 = local67[local117] >> 4;
				if (local145 > 255) {
					local145 = 255;
				}
				if (local145 < 0) {
					local145 = 0;
				}
				@Pc(163) int local163 = local71[local117] >> 4;
				if (local163 > 255) {
					local163 = 255;
				}
				local125 = Static333.anIntArray347[local125];
				local145 = Static333.anIntArray347[local145];
				if (local163 < 0) {
					local163 = 0;
				}
				local163 = Static333.anIntArray347[local163];
				@Pc(203) int local203;
				if (local125 == 0 && local145 == 0 && local163 == 0) {
					local203 = 0;
				} else {
					local203 = local83[local117] >> 4;
					if (local203 > 255) {
						local203 = 255;
					}
					if (local203 < 0) {
						local203 = 0;
					}
				}
				local47[local49++] = (local125 << 16) + ((local203 << 24) - (-(local145 << 8) - local163));
				if (arg4) {
					local49 += arg3 - 1;
				}
			}
		}
		for (@Pc(266) int local266 = 0; local266 < this.aClass5_Sub2Array15.length; local266++) {
			this.aClass5_Sub2Array15[local266].method8947();
		}
		return local47;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(Lclient!d;Lclient!wm;B)Z")
	public boolean method3512(@OriginalArg(0) Interface4 arg0, @OriginalArg(1) Class390 arg1) {
		@Pc(21) int local21;
		if (Static445.anInt7653 < 0) {
			for (local21 = 0; local21 < this.anIntArray210.length; local21++) {
				if (!arg1.method8905(this.anIntArray210[local21])) {
					return false;
				}
			}
		} else {
			for (local21 = 0; local21 < this.anIntArray210.length; local21++) {
				if (!arg1.method8902(Static445.anInt7653, this.anIntArray210[local21])) {
					return false;
				}
			}
		}
		for (local21 = 0; local21 < this.anIntArray209.length; local21++) {
			if (!arg0.method359(this.anIntArray209[local21])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(IILclient!d;ZLclient!wm;ZZD)[I")
	public int[] method3513(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface4 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class390 arg4, @OriginalArg(5) boolean arg5, @OriginalArg(7) double arg6) {
		Static69.aClass390_125 = arg4;
		Static476.anInterface4_9 = arg2;
		for (@Pc(11) int local11 = 0; local11 < this.aClass5_Sub2Array15.length; local11++) {
			this.aClass5_Sub2Array15[local11].method8949(arg0, arg1);
		}
		Static556.method7715(arg6);
		Static187.method5796(arg0, arg1);
		@Pc(43) int[] local43 = new int[arg1 * arg0];
		@Pc(56) int local56;
		@Pc(58) int local58;
		@Pc(52) byte local52;
		if (arg5) {
			local52 = -1;
			local56 = arg1 - 1;
			local58 = -1;
		} else {
			local52 = 1;
			local56 = 0;
			local58 = arg1;
		}
		@Pc(68) int local68 = 0;
		for (@Pc(70) int local70 = 0; local70 < arg0; local70++) {
			@Pc(94) int[] local94;
			@Pc(90) int[] local90;
			@Pc(86) int[] local86;
			if (this.aClass5_Sub2_1.aBoolean910) {
				@Pc(102) int[] local102 = this.aClass5_Sub2_1.method8942(local70);
				local86 = local102;
				local90 = local102;
				local94 = local102;
			} else {
				@Pc(82) int[][] local82 = this.aClass5_Sub2_1.method8943(local70);
				local86 = local82[2];
				local90 = local82[1];
				local94 = local82[0];
			}
			if (arg3) {
				local68 = local70;
			}
			for (@Pc(114) int local114 = local56; local114 != local58; local114 += local52) {
				@Pc(122) int local122 = local94[local114] >> 4;
				if (local122 > 255) {
					local122 = 255;
				}
				if (local122 < 0) {
					local122 = 0;
				}
				@Pc(142) int local142 = local90[local114] >> 4;
				if (local142 > 255) {
					local142 = 255;
				}
				if (local142 < 0) {
					local142 = 0;
				}
				@Pc(160) int local160 = local86[local114] >> 4;
				if (local160 > 255) {
					local160 = 255;
				}
				local142 = Static333.anIntArray347[local142];
				local122 = Static333.anIntArray347[local122];
				if (local160 < 0) {
					local160 = 0;
				}
				local160 = Static333.anIntArray347[local160];
				@Pc(192) int local192 = (local122 << 16) + (local142 << 8) + local160;
				if (local192 != 0) {
					local192 |= 0xFF000000;
				}
				local43[local68++] = local192;
				if (arg3) {
					local68 += arg1 - 1;
				}
			}
		}
		for (@Pc(227) int local227 = 0; local227 < this.aClass5_Sub2Array15.length; local227++) {
			this.aClass5_Sub2Array15[local227].method8947();
		}
		return local43;
	}
}
