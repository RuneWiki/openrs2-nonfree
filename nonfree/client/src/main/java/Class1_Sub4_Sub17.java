import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oa")
public final class Class1_Sub4_Sub17 extends Class1_Sub4 {

	@OriginalMember(owner = "client!oa", name = "v", descriptor = "[I")
	private final int[] anIntArray409;

	@OriginalMember(owner = "client!oa", name = "w", descriptor = "[I")
	private final int[] anIntArray410;

	@OriginalMember(owner = "client!oa", name = "A", descriptor = "Lclient!sb;")
	private final Class1_Sub3 aClass1_Sub3_1;

	@OriginalMember(owner = "client!oa", name = "L", descriptor = "Lclient!sb;")
	private final Class1_Sub3 aClass1_Sub3_3;

	@OriginalMember(owner = "client!oa", name = "B", descriptor = "Lclient!sb;")
	private final Class1_Sub3 aClass1_Sub3_2;

	@OriginalMember(owner = "client!oa", name = "t", descriptor = "[Lclient!sb;")
	private final Class1_Sub3[] aClass1_Sub3Array28;

	@OriginalMember(owner = "client!oa", name = "<init>", descriptor = "()V")
	private Class1_Sub4_Sub17() {
		this.anIntArray409 = new int[0];
		this.anIntArray410 = new int[0];
		this.aClass1_Sub3_1 = new Class1_Sub3_Sub38(0);
		this.aClass1_Sub3_1.anInt6591 = 1;
		this.aClass1_Sub3_3 = new Class1_Sub3_Sub38();
		this.aClass1_Sub3_3.anInt6591 = 1;
		this.aClass1_Sub3_2 = new Class1_Sub3_Sub38();
		this.aClass1_Sub3Array28 = new Class1_Sub3[] { this.aClass1_Sub3_3, this.aClass1_Sub3_2, this.aClass1_Sub3_1 };
		this.aClass1_Sub3_2.anInt6591 = 1;
	}

	@OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(Lclient!bg;)V")
	public Class1_Sub4_Sub17(@OriginalArg(0) Class1_Sub8 arg0) {
		@Pc(7) int local7 = arg0.method4532();
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		@Pc(14) int[][] local14 = new int[local7][];
		this.aClass1_Sub3Array28 = new Class1_Sub3[local7];
		@Pc(47) int local47;
		for (@Pc(20) int local20 = 0; local20 < local7; local20++) {
			@Pc(26) Class1_Sub3 local26 = Static343.method5439(arg0);
			if (local26.method5524() >= 0) {
				local9++;
			}
			if (local26.method5527() >= 0) {
				local11++;
			}
			@Pc(40) int local40 = local26.aClass1_Sub3Array42.length;
			local14[local20] = new int[local40];
			for (local47 = 0; local47 < local40; local47++) {
				local14[local20][local47] = arg0.method4532();
			}
			this.aClass1_Sub3Array28[local20] = local26;
		}
		this.anIntArray409 = new int[local9];
		local9 = 0;
		this.anIntArray410 = new int[local11];
		local11 = 0;
		for (@Pc(92) int local92 = 0; local92 < local7; local92++) {
			@Pc(99) Class1_Sub3 local99 = this.aClass1_Sub3Array28[local92];
			local47 = local99.aClass1_Sub3Array42.length;
			for (@Pc(105) int local105 = 0; local105 < local47; local105++) {
				local99.aClass1_Sub3Array42[local105] = this.aClass1_Sub3Array28[local14[local92][local105]];
			}
			@Pc(127) int local127 = local99.method5524();
			@Pc(131) int local131 = local99.method5527();
			if (local127 > 0) {
				this.anIntArray409[local9++] = local127;
			}
			if (local131 > 0) {
				this.anIntArray410[local11++] = local131;
			}
			local14[local92] = null;
		}
		this.aClass1_Sub3_3 = this.aClass1_Sub3Array28[arg0.method4532()];
		this.aClass1_Sub3_2 = this.aClass1_Sub3Array28[arg0.method4532()];
		this.aClass1_Sub3_1 = this.aClass1_Sub3Array28[arg0.method4532()];
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(ILclient!gd;Lclient!wo;)Z")
	public boolean method4101(@OriginalArg(1) Interface2 arg0, @OriginalArg(2) Class216 arg1) {
		@Pc(9) int local9;
		if (Static127.anInt2832 <= 0) {
			for (local9 = 0; local9 < this.anIntArray409.length; local9++) {
				if (!arg1.method5651(this.anIntArray409[local9])) {
					return false;
				}
			}
		} else {
			for (local9 = 0; local9 < this.anIntArray409.length; local9++) {
				if (!arg1.method5657(this.anIntArray409[local9], Static127.anInt2832)) {
					return false;
				}
			}
		}
		for (local9 = 0; local9 < this.anIntArray410.length; local9++) {
			if (!arg0.method4241(this.anIntArray410[local9])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(ZIILclient!wo;ILclient!gd;)[F")
	public float[] method4103(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class216 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Interface2 arg4) {
		Static208.anInterface2_8 = arg4;
		Static80.aClass216_31 = arg2;
		for (@Pc(11) int local11 = 0; local11 < this.aClass1_Sub3Array28.length; local11++) {
			this.aClass1_Sub3Array28[local11].method5531(arg3, arg1);
		}
		Static78.method1761(arg3, arg1);
		@Pc(38) float[] local38 = new float[arg3 * 4 * arg1];
		@Pc(40) int local40 = 0;
		for (@Pc(42) int local42 = 0; local42 < arg1; local42++) {
			@Pc(60) int[] local60;
			@Pc(58) int[] local58;
			@Pc(56) int[] local56;
			if (this.aClass1_Sub3_3.aBoolean647) {
				@Pc(54) int[] local54 = this.aClass1_Sub3_3.method5529(local42);
				local56 = local54;
				local58 = local54;
				local60 = local54;
			} else {
				@Pc(68) int[][] local68 = this.aClass1_Sub3_3.method5538(local42);
				local60 = local68[0];
				local56 = local68[2];
				local58 = local68[1];
			}
			@Pc(90) int[] local90;
			if (this.aClass1_Sub3_2.aBoolean647) {
				local90 = this.aClass1_Sub3_2.method5529(local42);
			} else {
				local90 = this.aClass1_Sub3_2.method5538(local42)[0];
			}
			@Pc(110) int[] local110;
			if (this.aClass1_Sub3_1.aBoolean647) {
				local110 = this.aClass1_Sub3_1.method5529(local42);
			} else {
				local110 = this.aClass1_Sub3_1.method5538(local42)[0];
			}
			if (arg0) {
				local40 = local42 << 2;
			}
			for (@Pc(130) int local130 = arg3 - 1; local130 >= 0; local130--) {
				@Pc(139) float local139 = (float) local90[local130] / 4096.0F;
				if (local139 < 0.0F) {
					local139 = 0.0F;
				} else if (local139 > 1.0F) {
					local139 = 1.0F;
				}
				@Pc(166) float local166 = ((float) local110[local130] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
				local38[local40++] = local166 * (float) local60[local130];
				local38[local40++] = local166 * (float) local58[local130];
				local38[local40++] = local166 * (float) local56[local130];
				local38[local40++] = local139;
				if (arg0) {
					local40 += (arg3 << 2) - 4;
				}
			}
		}
		for (@Pc(223) int local223 = 0; local223 < this.aClass1_Sub3Array28.length; local223++) {
			this.aClass1_Sub3Array28[local223].method5536();
		}
		return local38;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(DIIZILclient!wo;Lclient!gd;Z)[I")
	public int[] method4106(@OriginalArg(0) double arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) Class216 arg4, @OriginalArg(6) Interface2 arg5, @OriginalArg(7) boolean arg6) {
		Static80.aClass216_31 = arg4;
		Static208.anInterface2_8 = arg5;
		for (@Pc(11) int local11 = 0; local11 < this.aClass1_Sub3Array28.length; local11++) {
			this.aClass1_Sub3Array28[local11].method5531(arg1, arg2);
		}
		Static148.method2961(arg0);
		Static78.method1761(arg1, arg2);
		@Pc(43) int[] local43 = new int[arg1 * arg2];
		@Pc(51) int local51;
		@Pc(47) int local47;
		@Pc(53) byte local53;
		if (arg6) {
			local47 = -1;
			local51 = arg1 - 1;
			local53 = -1;
		} else {
			local47 = arg1;
			local51 = 0;
			local53 = 1;
		}
		@Pc(63) int local63 = 0;
		for (@Pc(65) int local65 = 0; local65 < arg2; local65++) {
			if (arg3) {
				local63 = local65;
			}
			@Pc(85) int[] local85;
			@Pc(93) int[] local93;
			@Pc(89) int[] local89;
			if (this.aClass1_Sub3_3.aBoolean647) {
				@Pc(103) int[] local103 = this.aClass1_Sub3_3.method5529(local65);
				local85 = local103;
				local93 = local103;
				local89 = local103;
			} else {
				@Pc(81) int[][] local81 = this.aClass1_Sub3_3.method5538(local65);
				local85 = local81[0];
				local89 = local81[2];
				local93 = local81[1];
			}
			for (@Pc(111) int local111 = local51; local111 != local47; local111 += local53) {
				@Pc(119) int local119 = local85[local111] >> 4;
				if (local119 > 255) {
					local119 = 255;
				}
				if (local119 < 0) {
					local119 = 0;
				}
				@Pc(134) int local134 = local93[local111] >> 4;
				if (local134 > 255) {
					local134 = 255;
				}
				if (local134 < 0) {
					local134 = 0;
				}
				@Pc(151) int local151 = local89[local111] >> 4;
				if (local151 > 255) {
					local151 = 255;
				}
				local119 = Static91.anIntArray214[local119];
				local134 = Static91.anIntArray214[local134];
				if (local151 < 0) {
					local151 = 0;
				}
				local151 = Static91.anIntArray214[local151];
				@Pc(185) int local185 = (local134 << 8) + ((local119 << 16) + local151);
				if (local185 != 0) {
					local185 |= 0xFF000000;
				}
				local43[local63++] = local185;
				if (arg3) {
					local63 += arg1 - 1;
				}
			}
		}
		for (@Pc(224) int local224 = 0; local224 < this.aClass1_Sub3Array28.length; local224++) {
			this.aClass1_Sub3Array28[local224].method5536();
		}
		return local43;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(DILclient!gd;Lclient!wo;IIZ)[I")
	public int[] method4107(@OriginalArg(0) double arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface2 arg2, @OriginalArg(3) Class216 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		Static80.aClass216_31 = arg3;
		Static208.anInterface2_8 = arg2;
		for (@Pc(11) int local11 = 0; local11 < this.aClass1_Sub3Array28.length; local11++) {
			this.aClass1_Sub3Array28[local11].method5531(arg4, arg1);
		}
		Static148.method2961(arg0);
		Static78.method1761(arg4, arg1);
		@Pc(45) int[] local45 = new int[arg1 * 4 * arg4];
		@Pc(47) int local47 = 0;
		for (@Pc(56) int local56 = 0; local56 < arg1; local56++) {
			@Pc(76) int[] local76;
			@Pc(72) int[] local72;
			@Pc(80) int[] local80;
			@Pc(90) int[] local90;
			if (this.aClass1_Sub3_3.aBoolean647) {
				local90 = this.aClass1_Sub3_3.method5529(local56);
				local72 = local90;
				local76 = local90;
				local80 = local90;
			} else {
				@Pc(68) int[][] local68 = this.aClass1_Sub3_3.method5538(local56);
				local72 = local68[1];
				local76 = local68[0];
				local80 = local68[2];
			}
			if (this.aClass1_Sub3_2.aBoolean647) {
				local90 = this.aClass1_Sub3_2.method5529(local56);
			} else {
				local90 = this.aClass1_Sub3_2.method5538(local56)[0];
			}
			if (arg5) {
				local47 = local56;
			}
			for (@Pc(126) int local126 = arg4 - 1; local126 >= 0; local126--) {
				@Pc(134) int local134 = local76[local126] >> 4;
				if (local134 > 255) {
					local134 = 255;
				}
				if (local134 < 0) {
					local134 = 0;
				}
				@Pc(154) int local154 = local72[local126] >> 4;
				if (local154 > 255) {
					local154 = 255;
				}
				if (local154 < 0) {
					local154 = 0;
				}
				@Pc(169) int local169 = local80[local126] >> 4;
				if (local169 > 255) {
					local169 = 255;
				}
				local154 = Static91.anIntArray214[local154];
				if (local169 < 0) {
					local169 = 0;
				}
				local134 = Static91.anIntArray214[local134];
				local169 = Static91.anIntArray214[local169];
				@Pc(205) int local205;
				if (local134 == 0 && local154 == 0 && local169 == 0) {
					local205 = 0;
				} else {
					local205 = local90[local126] >> 4;
					if (local205 > 255) {
						local205 = 255;
					}
					if (local205 < 0) {
						local205 = 0;
					}
				}
				local45[local47++] = local169 + (local134 << 16) + (local205 << 24) + (local154 << 8);
				if (arg5) {
					local47 += arg4 - 1;
				}
			}
		}
		for (@Pc(258) int local258 = 0; local258 < this.aClass1_Sub3Array28.length; local258++) {
			this.aClass1_Sub3Array28[local258].method5536();
		}
		return local45;
	}
}
