import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tg")
public final class Class5_Sub2_Sub17 extends Class5_Sub2 {

	@OriginalMember(owner = "client!tg", name = "H", descriptor = "[I")
	private final int[] anIntArray627;

	@OriginalMember(owner = "client!tg", name = "t", descriptor = "[I")
	private final int[] anIntArray625;

	@OriginalMember(owner = "client!tg", name = "x", descriptor = "Lclient!vn;")
	private final Class5_Sub1 aClass5_Sub1_1;

	@OriginalMember(owner = "client!tg", name = "y", descriptor = "Lclient!vn;")
	private final Class5_Sub1 aClass5_Sub1_2;

	@OriginalMember(owner = "client!tg", name = "A", descriptor = "Lclient!vn;")
	private final Class5_Sub1 aClass5_Sub1_3;

	@OriginalMember(owner = "client!tg", name = "D", descriptor = "[Lclient!vn;")
	private final Class5_Sub1[] aClass5_Sub1Array37;

	@OriginalMember(owner = "client!tg", name = "<init>", descriptor = "()V")
	private Class5_Sub2_Sub17() {
		this.anIntArray627 = new int[0];
		this.anIntArray625 = new int[0];
		this.aClass5_Sub1_1 = new Class5_Sub1_Sub6(0);
		this.aClass5_Sub1_1.anInt8835 = 1;
		this.aClass5_Sub1_2 = new Class5_Sub1_Sub6();
		this.aClass5_Sub1_2.anInt8835 = 1;
		this.aClass5_Sub1_3 = new Class5_Sub1_Sub6();
		this.aClass5_Sub1Array37 = new Class5_Sub1[] { this.aClass5_Sub1_2, this.aClass5_Sub1_3, this.aClass5_Sub1_1 };
		this.aClass5_Sub1_3.anInt8835 = 1;
	}

	@OriginalMember(owner = "client!tg", name = "<init>", descriptor = "(Lclient!co;)V")
	public Class5_Sub2_Sub17(@OriginalArg(0) Class5_Sub3 arg0) {
		@Pc(7) int local7 = arg0.method4220();
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		@Pc(14) int[][] local14 = new int[local7][];
		this.aClass5_Sub1Array37 = new Class5_Sub1[local7];
		@Pc(53) int local53;
		for (@Pc(20) int local20 = 0; local20 < local7; local20++) {
			@Pc(26) Class5_Sub1 local26 = Static383.method5692(arg0);
			if (local26.method7158() >= 0) {
				local9++;
			}
			if (local26.method7165() >= 0) {
				local11++;
			}
			@Pc(46) int local46 = local26.aClass5_Sub1Array42.length;
			local14[local20] = new int[local46];
			for (local53 = 0; local53 < local46; local53++) {
				local14[local20][local53] = arg0.method4220();
			}
			this.aClass5_Sub1Array37[local20] = local26;
		}
		this.anIntArray627 = new int[local9];
		local9 = 0;
		this.anIntArray625 = new int[local11];
		local11 = 0;
		for (@Pc(98) int local98 = 0; local98 < local7; local98++) {
			@Pc(105) Class5_Sub1 local105 = this.aClass5_Sub1Array37[local98];
			local53 = local105.aClass5_Sub1Array42.length;
			for (@Pc(111) int local111 = 0; local111 < local53; local111++) {
				local105.aClass5_Sub1Array42[local111] = this.aClass5_Sub1Array37[local14[local98][local111]];
			}
			@Pc(133) int local133 = local105.method7158();
			@Pc(137) int local137 = local105.method7165();
			if (local133 > 0) {
				this.anIntArray627[local9++] = local133;
			}
			if (local137 > 0) {
				this.anIntArray625[local11++] = local137;
			}
			local14[local98] = null;
		}
		this.aClass5_Sub1_2 = this.aClass5_Sub1Array37[arg0.method4220()];
		this.aClass5_Sub1_3 = this.aClass5_Sub1Array37[arg0.method4220()];
		this.aClass5_Sub1_1 = this.aClass5_Sub1Array37[arg0.method4220()];
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(DIILclient!n;ZLclient!gp;I)[I")
	public int[] method6580(@OriginalArg(0) double arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Interface8 arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) Class117 arg4, @OriginalArg(6) int arg5) {
		Static497.anInterface8_152 = arg2;
		Static308.aClass117_138 = arg4;
		for (@Pc(11) int local11 = 0; local11 < this.aClass5_Sub1Array37.length; local11++) {
			this.aClass5_Sub1Array37[local11].method7156(arg5, arg1);
		}
		Static126.method6806(arg0);
		Static107.method2150(arg5, arg1);
		@Pc(49) int[] local49 = new int[arg5 * arg1 * 4];
		@Pc(51) int local51 = 0;
		for (@Pc(53) int local53 = 0; local53 < arg1; local53++) {
			@Pc(67) int[] local67;
			@Pc(71) int[] local71;
			@Pc(69) int[] local69;
			@Pc(65) int[] local65;
			if (this.aClass5_Sub1_2.aBoolean642) {
				local65 = this.aClass5_Sub1_2.method7155(local53);
				local67 = local65;
				local69 = local65;
				local71 = local65;
			} else {
				@Pc(79) int[][] local79 = this.aClass5_Sub1_2.method7163(local53);
				local67 = local79[0];
				local71 = local79[1];
				local69 = local79[2];
			}
			if (arg3) {
				local51 = local53;
			}
			if (this.aClass5_Sub1_3.aBoolean642) {
				local65 = this.aClass5_Sub1_3.method7155(local53);
			} else {
				local65 = this.aClass5_Sub1_3.method7163(local53)[0];
			}
			for (@Pc(119) int local119 = arg5 - 1; local119 >= 0; local119--) {
				@Pc(127) int local127 = local67[local119] >> 4;
				if (local127 > 255) {
					local127 = 255;
				}
				if (local127 < 0) {
					local127 = 0;
				}
				@Pc(145) int local145 = local71[local119] >> 4;
				if (local145 > 255) {
					local145 = 255;
				}
				if (local145 < 0) {
					local145 = 0;
				}
				@Pc(162) int local162 = local69[local119] >> 4;
				if (local162 > 255) {
					local162 = 255;
				}
				local145 = Static540.anIntArray690[local145];
				if (local162 < 0) {
					local162 = 0;
				}
				local127 = Static540.anIntArray690[local127];
				local162 = Static540.anIntArray690[local162];
				@Pc(200) int local200;
				if (local127 == 0 && local145 == 0 && local162 == 0) {
					local200 = 0;
				} else {
					local200 = local65[local119] >> 4;
					if (local200 > 255) {
						local200 = 255;
					}
					if (local200 < 0) {
						local200 = 0;
					}
				}
				local49[local51++] = (local200 << 24) - (-(local127 << 16) - ((local145 << 8) + local162));
				if (arg3) {
					local51 += arg5 - 1;
				}
			}
		}
		for (@Pc(258) int local258 = 0; local258 < this.aClass5_Sub1Array37.length; local258++) {
			this.aClass5_Sub1Array37[local258].method7162();
		}
		return local49;
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(DIIZILclient!gp;Lclient!n;Z)[I")
	public int[] method6582(@OriginalArg(0) double arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) Class117 arg4, @OriginalArg(6) Interface8 arg5, @OriginalArg(7) boolean arg6) {
		Static497.anInterface8_152 = arg5;
		Static308.aClass117_138 = arg4;
		for (@Pc(11) int local11 = 0; local11 < this.aClass5_Sub1Array37.length; local11++) {
			this.aClass5_Sub1Array37[local11].method7156(arg2, arg1);
		}
		Static126.method6806(arg0);
		Static107.method2150(arg2, arg1);
		@Pc(50) int[] local50 = new int[arg2 * arg1];
		@Pc(56) int local56;
		@Pc(58) int local58;
		@Pc(54) byte local54;
		if (arg3) {
			local54 = -1;
			local58 = -1;
			local56 = arg2 - 1;
		} else {
			local54 = 1;
			local56 = 0;
			local58 = arg2;
		}
		@Pc(70) int local70 = 0;
		for (@Pc(72) int local72 = 0; local72 < arg1; local72++) {
			@Pc(90) int[] local90;
			@Pc(94) int[] local94;
			@Pc(98) int[] local98;
			if (this.aClass5_Sub1_2.aBoolean642) {
				@Pc(106) int[] local106 = this.aClass5_Sub1_2.method7155(local72);
				local90 = local106;
				local94 = local106;
				local98 = local106;
			} else {
				@Pc(86) int[][] local86 = this.aClass5_Sub1_2.method7163(local72);
				local90 = local86[0];
				local94 = local86[1];
				local98 = local86[2];
			}
			if (arg6) {
				local70 = local72;
			}
			for (@Pc(118) int local118 = local56; local118 != local58; local118 += local54) {
				@Pc(126) int local126 = local90[local118] >> 4;
				if (local126 > 255) {
					local126 = 255;
				}
				if (local126 < 0) {
					local126 = 0;
				}
				@Pc(141) int local141 = local94[local118] >> 4;
				if (local141 > 255) {
					local141 = 255;
				}
				if (local141 < 0) {
					local141 = 0;
				}
				@Pc(161) int local161 = local98[local118] >> 4;
				if (local161 > 255) {
					local161 = 255;
				}
				local126 = Static540.anIntArray690[local126];
				local141 = Static540.anIntArray690[local141];
				if (local161 < 0) {
					local161 = 0;
				}
				local161 = Static540.anIntArray690[local161];
				@Pc(193) int local193 = (local126 << 16) - (-(local141 << 8) - local161);
				if (local193 != 0) {
					local193 |= 0xFF000000;
				}
				local50[local70++] = local193;
				if (arg6) {
					local70 += arg2 - 1;
				}
			}
		}
		for (@Pc(228) int local228 = 0; local228 < this.aClass5_Sub1Array37.length; local228++) {
			this.aClass5_Sub1Array37[local228].method7162();
		}
		return local50;
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(ILclient!n;Lclient!gp;)Z")
	public boolean method6584(@OriginalArg(1) Interface8 arg0, @OriginalArg(2) Class117 arg1) {
		@Pc(18) int local18;
		if (Static225.anInt4189 >= 0) {
			for (local18 = 0; local18 < this.anIntArray627.length; local18++) {
				if (!arg1.method2974(this.anIntArray627[local18], Static225.anInt4189)) {
					return false;
				}
			}
		} else {
			for (local18 = 0; local18 < this.anIntArray627.length; local18++) {
				if (!arg1.method2973(this.anIntArray627[local18])) {
					return false;
				}
			}
		}
		for (local18 = 0; local18 < this.anIntArray625.length; local18++) {
			if (!arg0.method7236(this.anIntArray625[local18])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(Lclient!n;Lclient!gp;ZIII)[F")
	public float[] method6585(@OriginalArg(0) Interface8 arg0, @OriginalArg(1) Class117 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static308.aClass117_138 = arg1;
		Static497.anInterface8_152 = arg0;
		for (@Pc(17) int local17 = 0; local17 < this.aClass5_Sub1Array37.length; local17++) {
			this.aClass5_Sub1Array37[local17].method7156(arg3, arg4);
		}
		Static107.method2150(arg3, arg4);
		@Pc(44) float[] local44 = new float[arg3 * arg4 * 4];
		@Pc(46) int local46 = 0;
		for (@Pc(48) int local48 = 0; local48 < arg4; local48++) {
			@Pc(64) int[] local64;
			@Pc(68) int[] local68;
			@Pc(72) int[] local72;
			if (this.aClass5_Sub1_2.aBoolean642) {
				@Pc(80) int[] local80 = this.aClass5_Sub1_2.method7155(local48);
				local72 = local80;
				local68 = local80;
				local64 = local80;
			} else {
				@Pc(60) int[][] local60 = this.aClass5_Sub1_2.method7163(local48);
				local64 = local60[0];
				local68 = local60[1];
				local72 = local60[2];
			}
			@Pc(98) int[] local98;
			if (this.aClass5_Sub1_3.aBoolean642) {
				local98 = this.aClass5_Sub1_3.method7155(local48);
			} else {
				local98 = this.aClass5_Sub1_3.method7163(local48)[0];
			}
			if (arg2) {
				local46 = local48 << 2;
			}
			@Pc(122) int[] local122;
			if (this.aClass5_Sub1_1.aBoolean642) {
				local122 = this.aClass5_Sub1_1.method7155(local48);
			} else {
				local122 = this.aClass5_Sub1_1.method7163(local48)[0];
			}
			for (@Pc(136) int local136 = arg3 - 1; local136 >= 0; local136--) {
				@Pc(145) float local145 = (float) local98[local136] / 4096.0F;
				if (local145 < 0.0F) {
					local145 = 0.0F;
				} else if (local145 > 1.0F) {
					local145 = 1.0F;
				}
				@Pc(172) float local172 = ((float) local122[local136] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
				local44[local46++] = local172 * (float) local64[local136];
				local44[local46++] = (float) local68[local136] * local172;
				local44[local46++] = (float) local72[local136] * local172;
				local44[local46++] = local145;
				if (arg2) {
					local46 += (arg3 << 2) - 4;
				}
			}
		}
		for (@Pc(233) int local233 = 0; local233 < this.aClass5_Sub1Array37.length; local233++) {
			this.aClass5_Sub1Array37[local233].method7162();
		}
		return local44;
	}
}
