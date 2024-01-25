import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lm")
public final class Class3_Sub6_Sub14 extends Class3_Sub6 {

	@OriginalMember(owner = "client!lm", name = "D", descriptor = "[I")
	private final int[] anIntArray399;

	@OriginalMember(owner = "client!lm", name = "G", descriptor = "[I")
	private final int[] anIntArray400;

	@OriginalMember(owner = "client!lm", name = "B", descriptor = "Lclient!ng;")
	private final Class3_Sub2 aClass3_Sub2_2;

	@OriginalMember(owner = "client!lm", name = "C", descriptor = "Lclient!ng;")
	private final Class3_Sub2 aClass3_Sub2_3;

	@OriginalMember(owner = "client!lm", name = "z", descriptor = "Lclient!ng;")
	private final Class3_Sub2 aClass3_Sub2_1;

	@OriginalMember(owner = "client!lm", name = "H", descriptor = "[Lclient!ng;")
	private final Class3_Sub2[] aClass3_Sub2Array21;

	@OriginalMember(owner = "client!lm", name = "<init>", descriptor = "()V")
	private Class3_Sub6_Sub14() {
		this.anIntArray399 = new int[0];
		this.anIntArray400 = new int[0];
		this.aClass3_Sub2_2 = new Class3_Sub2_Sub15(0);
		this.aClass3_Sub2_2.anInt10292 = 1;
		this.aClass3_Sub2_3 = new Class3_Sub2_Sub15();
		this.aClass3_Sub2_3.anInt10292 = 1;
		this.aClass3_Sub2_1 = new Class3_Sub2_Sub15();
		this.aClass3_Sub2Array21 = new Class3_Sub2[] { this.aClass3_Sub2_3, this.aClass3_Sub2_1, this.aClass3_Sub2_2 };
		this.aClass3_Sub2_1.anInt10292 = 1;
	}

	@OriginalMember(owner = "client!lm", name = "<init>", descriptor = "(Lclient!fca;)V")
	public Class3_Sub6_Sub14(@OriginalArg(0) Class3_Sub17 arg0) {
		@Pc(7) int local7 = arg0.method4888();
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		@Pc(14) int[][] local14 = new int[local7][];
		this.aClass3_Sub2Array21 = new Class3_Sub2[local7];
		@Pc(53) int local53;
		for (@Pc(20) int local20 = 0; local20 < local7; local20++) {
			@Pc(26) Class3_Sub2 local26 = Static676.method8727(arg0);
			if (local26.method8717() >= 0) {
				local9++;
			}
			if (local26.method8713() >= 0) {
				local11++;
			}
			@Pc(46) int local46 = local26.aClass3_Sub2Array42.length;
			local14[local20] = new int[local46];
			for (local53 = 0; local53 < local46; local53++) {
				local14[local20][local53] = arg0.method4888();
			}
			this.aClass3_Sub2Array21[local20] = local26;
		}
		this.anIntArray399 = new int[local9];
		local9 = 0;
		this.anIntArray400 = new int[local11];
		local11 = 0;
		for (@Pc(90) int local90 = 0; local90 < local7; local90++) {
			@Pc(97) Class3_Sub2 local97 = this.aClass3_Sub2Array21[local90];
			local53 = local97.aClass3_Sub2Array42.length;
			for (@Pc(103) int local103 = 0; local103 < local53; local103++) {
				local97.aClass3_Sub2Array42[local103] = this.aClass3_Sub2Array21[local14[local90][local103]];
			}
			@Pc(129) int local129 = local97.method8717();
			@Pc(133) int local133 = local97.method8713();
			if (local129 > 0) {
				this.anIntArray399[local9++] = local129;
			}
			if (local133 > 0) {
				this.anIntArray400[local11++] = local133;
			}
			local14[local90] = null;
		}
		this.aClass3_Sub2_3 = this.aClass3_Sub2Array21[arg0.method4888()];
		this.aClass3_Sub2_1 = this.aClass3_Sub2Array21[arg0.method4888()];
		this.aClass3_Sub2_2 = this.aClass3_Sub2Array21[arg0.method4888()];
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(IILclient!gj;ILclient!d;Z)[F")
	public float[] method5217(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class143 arg2, @OriginalArg(4) Interface5 arg3, @OriginalArg(5) boolean arg4) {
		Static1.aClass143_140 = arg2;
		Static454.anInterface5_11 = arg3;
		for (@Pc(11) int local11 = 0; local11 < this.aClass3_Sub2Array21.length; local11++) {
			this.aClass3_Sub2Array21[local11].method8714(arg0, arg1);
		}
		Static453.method6504(arg1, arg0);
		@Pc(42) float[] local42 = new float[arg0 * arg1 * 4];
		@Pc(44) int local44 = 0;
		for (@Pc(46) int local46 = 0; local46 < arg1; local46++) {
			@Pc(62) int[] local62;
			@Pc(66) int[] local66;
			@Pc(70) int[] local70;
			if (this.aClass3_Sub2_3.aBoolean761) {
				@Pc(80) int[] local80 = this.aClass3_Sub2_3.method8710(local46);
				local66 = local80;
				local70 = local80;
				local62 = local80;
			} else {
				@Pc(58) int[][] local58 = this.aClass3_Sub2_3.method8711(local46);
				local62 = local58[0];
				local66 = local58[1];
				local70 = local58[2];
			}
			@Pc(98) int[] local98;
			if (this.aClass3_Sub2_1.aBoolean761) {
				local98 = this.aClass3_Sub2_1.method8710(local46);
			} else {
				local98 = this.aClass3_Sub2_1.method8711(local46)[0];
			}
			@Pc(120) int[] local120;
			if (this.aClass3_Sub2_2.aBoolean761) {
				local120 = this.aClass3_Sub2_2.method8710(local46);
			} else {
				local120 = this.aClass3_Sub2_2.method8711(local46)[0];
			}
			if (arg4) {
				local44 = local46 << 2;
			}
			for (@Pc(138) int local138 = arg0 - 1; local138 >= 0; local138--) {
				@Pc(147) float local147 = (float) local98[local138] / 4096.0F;
				@Pc(160) float local160 = ((float) local120[local138] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
				if (local147 < 0.0F) {
					local147 = 0.0F;
				} else if (local147 > 1.0F) {
					local147 = 1.0F;
				}
				local42[local44++] = (float) local62[local138] * local160;
				local42[local44++] = local160 * (float) local66[local138];
				local42[local44++] = (float) local70[local138] * local160;
				local42[local44++] = local147;
				if (arg4) {
					local44 += (arg0 << 2) - 4;
				}
			}
		}
		for (@Pc(240) int local240 = 0; local240 < this.aClass3_Sub2Array21.length; local240++) {
			this.aClass3_Sub2Array21[local240].method8715();
		}
		return local42;
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(IILclient!gj;DZIZLclient!d;)[I")
	public int[] method5219(@OriginalArg(1) int arg0, @OriginalArg(2) Class143 arg1, @OriginalArg(3) double arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) Interface5 arg6) {
		Static1.aClass143_140 = arg1;
		Static454.anInterface5_11 = arg6;
		for (@Pc(19) int local19 = 0; local19 < this.aClass3_Sub2Array21.length; local19++) {
			this.aClass3_Sub2Array21[local19].method8714(arg4, arg0);
		}
		Static189.method6688(arg2);
		Static453.method6504(arg0, arg4);
		@Pc(47) int[] local47 = new int[arg4 * arg0];
		@Pc(53) int local53;
		@Pc(55) int local55;
		@Pc(51) byte local51;
		if (arg5) {
			local51 = -1;
			local53 = arg4 - 1;
			local55 = -1;
		} else {
			local51 = 1;
			local53 = 0;
			local55 = arg4;
		}
		@Pc(67) int local67 = 0;
		for (@Pc(69) int local69 = 0; local69 < arg0; local69++) {
			if (arg3) {
				local67 = local69;
			}
			@Pc(89) int[] local89;
			@Pc(97) int[] local97;
			@Pc(93) int[] local93;
			if (this.aClass3_Sub2_3.aBoolean761) {
				@Pc(105) int[] local105 = this.aClass3_Sub2_3.method8710(local69);
				local89 = local105;
				local97 = local105;
				local93 = local105;
			} else {
				@Pc(85) int[][] local85 = this.aClass3_Sub2_3.method8711(local69);
				local89 = local85[0];
				local93 = local85[2];
				local97 = local85[1];
			}
			for (@Pc(113) int local113 = local53; local113 != local55; local113 += local51) {
				@Pc(121) int local121 = local89[local113] >> 4;
				if (local121 > 255) {
					local121 = 255;
				}
				if (local121 < 0) {
					local121 = 0;
				}
				@Pc(136) int local136 = local97[local113] >> 4;
				if (local136 > 255) {
					local136 = 255;
				}
				if (local136 < 0) {
					local136 = 0;
				}
				@Pc(154) int local154 = local93[local113] >> 4;
				if (local154 > 255) {
					local154 = 255;
				}
				local136 = Static485.anIntArray528[local136];
				if (local154 < 0) {
					local154 = 0;
				}
				local121 = Static485.anIntArray528[local121];
				local154 = Static485.anIntArray528[local154];
				@Pc(190) int local190 = local154 + (local136 << 8) + (local121 << 16);
				if (local190 != 0) {
					local190 |= 0xFF000000;
				}
				local47[local67++] = local190;
				if (arg3) {
					local67 += arg4 - 1;
				}
			}
		}
		for (@Pc(233) int local233 = 0; local233 < this.aClass3_Sub2Array21.length; local233++) {
			this.aClass3_Sub2Array21[local233].method8715();
		}
		return local47;
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(Lclient!d;Lclient!gj;B)Z")
	public boolean method5222(@OriginalArg(0) Interface5 arg0, @OriginalArg(1) Class143 arg1) {
		@Pc(9) int local9;
		if (Static206.anInt3825 >= 0) {
			for (local9 = 0; local9 < this.anIntArray399.length; local9++) {
				if (!arg1.method3113(Static206.anInt3825, this.anIntArray399[local9])) {
					return false;
				}
			}
		} else {
			for (local9 = 0; local9 < this.anIntArray399.length; local9++) {
				if (!arg1.method3130(this.anIntArray399[local9])) {
					return false;
				}
			}
		}
		for (local9 = 0; local9 < this.anIntArray400.length; local9++) {
			if (!arg0.method5197(this.anIntArray400[local9])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(Lclient!gj;DIILclient!d;IZ)[I")
	public int[] method5223(@OriginalArg(0) Class143 arg0, @OriginalArg(1) double arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Interface5 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		Static1.aClass143_140 = arg0;
		Static454.anInterface5_11 = arg3;
		for (@Pc(11) int local11 = 0; local11 < this.aClass3_Sub2Array21.length; local11++) {
			this.aClass3_Sub2Array21[local11].method8714(arg2, arg4);
		}
		Static189.method6688(arg1);
		Static453.method6504(arg4, arg2);
		@Pc(41) int[] local41 = new int[arg2 * arg4];
		@Pc(43) int local43 = 0;
		for (@Pc(45) int local45 = 0; local45 < arg4; local45++) {
			@Pc(61) int[] local61;
			@Pc(59) int[] local59;
			@Pc(63) int[] local63;
			@Pc(57) int[] local57;
			if (this.aClass3_Sub2_3.aBoolean761) {
				local57 = this.aClass3_Sub2_3.method8710(local45);
				local59 = local57;
				local61 = local57;
				local63 = local57;
			} else {
				@Pc(71) int[][] local71 = this.aClass3_Sub2_3.method8711(local45);
				local61 = local71[0];
				local59 = local71[1];
				local63 = local71[2];
			}
			if (this.aClass3_Sub2_1.aBoolean761) {
				local57 = this.aClass3_Sub2_1.method8710(local45);
			} else {
				local57 = this.aClass3_Sub2_1.method8711(local45)[0];
			}
			if (arg5) {
				local43 = local45;
			}
			for (@Pc(111) int local111 = arg2 - 1; local111 >= 0; local111--) {
				@Pc(119) int local119 = local61[local111] >> 4;
				if (local119 > 255) {
					local119 = 255;
				}
				if (local119 < 0) {
					local119 = 0;
				}
				@Pc(137) int local137 = local59[local111] >> 4;
				if (local137 > 255) {
					local137 = 255;
				}
				if (local137 < 0) {
					local137 = 0;
				}
				@Pc(154) int local154 = local63[local111] >> 4;
				if (local154 > 255) {
					local154 = 255;
				}
				if (local154 < 0) {
					local154 = 0;
				}
				local119 = Static485.anIntArray528[local119];
				local137 = Static485.anIntArray528[local137];
				local154 = Static485.anIntArray528[local154];
				@Pc(195) int local195;
				if (local119 == 0 && local137 == 0 && local154 == 0) {
					local195 = 0;
				} else {
					local195 = local57[local111] >> 4;
					if (local195 > 255) {
						local195 = 255;
					}
					if (local195 < 0) {
						local195 = 0;
					}
				}
				local41[local43++] = (local195 << 24) + local154 - (-(local119 << 16) - (local137 << 8));
				if (arg5) {
					local43 += arg2 - 1;
				}
			}
		}
		for (@Pc(249) int local249 = 0; local249 < this.aClass3_Sub2Array21.length; local249++) {
			this.aClass3_Sub2Array21[local249].method8715();
		}
		return local41;
	}
}
