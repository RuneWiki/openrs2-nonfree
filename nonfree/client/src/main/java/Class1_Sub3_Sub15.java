import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qo")
public final class Class1_Sub3_Sub15 extends Class1_Sub3 {

	@OriginalMember(owner = "client!qo", name = "x", descriptor = "[I")
	private final int[] anIntArray402;

	@OriginalMember(owner = "client!qo", name = "z", descriptor = "[I")
	private final int[] anIntArray403;

	@OriginalMember(owner = "client!qo", name = "D", descriptor = "Lclient!bu;")
	private final Class1_Sub2 aClass1_Sub2_3;

	@OriginalMember(owner = "client!qo", name = "A", descriptor = "Lclient!bu;")
	private final Class1_Sub2 aClass1_Sub2_2;

	@OriginalMember(owner = "client!qo", name = "y", descriptor = "Lclient!bu;")
	private final Class1_Sub2 aClass1_Sub2_1;

	@OriginalMember(owner = "client!qo", name = "B", descriptor = "[Lclient!bu;")
	private final Class1_Sub2[] aClass1_Sub2Array29;

	@OriginalMember(owner = "client!qo", name = "<init>", descriptor = "()V")
	private Class1_Sub3_Sub15() {
		this.anIntArray402 = new int[0];
		this.anIntArray403 = new int[0];
		this.aClass1_Sub2_3 = new Class1_Sub2_Sub27(0);
		this.aClass1_Sub2_3.anInt7401 = 1;
		this.aClass1_Sub2_2 = new Class1_Sub2_Sub27();
		this.aClass1_Sub2_2.anInt7401 = 1;
		this.aClass1_Sub2_1 = new Class1_Sub2_Sub27();
		this.aClass1_Sub2_1.anInt7401 = 1;
		this.aClass1_Sub2Array29 = new Class1_Sub2[] { this.aClass1_Sub2_2, this.aClass1_Sub2_1, this.aClass1_Sub2_3 };
	}

	@OriginalMember(owner = "client!qo", name = "<init>", descriptor = "(Lclient!wm;)V")
	public Class1_Sub3_Sub15(@OriginalArg(0) Class1_Sub19 arg0) {
		@Pc(7) int local7 = arg0.method2915();
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		@Pc(14) int[][] local14 = new int[local7][];
		this.aClass1_Sub2Array29 = new Class1_Sub2[local7];
		@Pc(47) int local47;
		for (@Pc(20) int local20 = 0; local20 < local7; local20++) {
			@Pc(26) Class1_Sub2 local26 = Static173.method2283(arg0);
			if (local26.method5959() >= 0) {
				local9++;
			}
			if (local26.method5960() >= 0) {
				local11++;
			}
			@Pc(40) int local40 = local26.aClass1_Sub2Array42.length;
			local14[local20] = new int[local40];
			for (local47 = 0; local47 < local40; local47++) {
				local14[local20][local47] = arg0.method2915();
			}
			this.aClass1_Sub2Array29[local20] = local26;
		}
		this.anIntArray402 = new int[local9];
		this.anIntArray403 = new int[local11];
		local9 = 0;
		local11 = 0;
		for (@Pc(92) int local92 = 0; local92 < local7; local92++) {
			@Pc(99) Class1_Sub2 local99 = this.aClass1_Sub2Array29[local92];
			local47 = local99.aClass1_Sub2Array42.length;
			for (@Pc(105) int local105 = 0; local105 < local47; local105++) {
				local99.aClass1_Sub2Array42[local105] = this.aClass1_Sub2Array29[local14[local92][local105]];
			}
			@Pc(131) int local131 = local99.method5959();
			@Pc(135) int local135 = local99.method5960();
			if (local131 > 0) {
				this.anIntArray402[local9++] = local131;
			}
			if (local135 > 0) {
				this.anIntArray403[local11++] = local135;
			}
			local14[local92] = null;
		}
		this.aClass1_Sub2_2 = this.aClass1_Sub2Array29[arg0.method2915()];
		this.aClass1_Sub2_1 = this.aClass1_Sub2Array29[arg0.method2915()];
		this.aClass1_Sub2_3 = this.aClass1_Sub2Array29[arg0.method2915()];
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(ILclient!oi;Lclient!l;ZIZ)[F")
	public float[] method4471(@OriginalArg(0) int arg0, @OriginalArg(1) Class185 arg1, @OriginalArg(2) Interface4 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		Static252.anInterface4_6 = arg2;
		Static420.aClass185_113 = arg1;
		for (@Pc(11) int local11 = 0; local11 < this.aClass1_Sub2Array29.length; local11++) {
			this.aClass1_Sub2Array29[local11].method5966(arg3, arg0);
		}
		Static306.method4069(arg0, arg3);
		@Pc(47) float[] local47 = new float[arg3 * 4 * arg0];
		@Pc(49) int local49 = 0;
		for (@Pc(51) int local51 = 0; local51 < arg0; local51++) {
			@Pc(67) int[] local67;
			@Pc(75) int[] local75;
			@Pc(71) int[] local71;
			if (this.aClass1_Sub2_2.aBoolean650) {
				@Pc(83) int[] local83 = this.aClass1_Sub2_2.method5961(local51);
				local67 = local83;
				local71 = local83;
				local75 = local83;
			} else {
				@Pc(63) int[][] local63 = this.aClass1_Sub2_2.method5965(local51);
				local67 = local63[0];
				local71 = local63[2];
				local75 = local63[1];
			}
			@Pc(99) int[] local99;
			if (this.aClass1_Sub2_1.aBoolean650) {
				local99 = this.aClass1_Sub2_1.method5961(local51);
			} else {
				local99 = this.aClass1_Sub2_1.method5965(local51)[0];
			}
			@Pc(119) int[] local119;
			if (this.aClass1_Sub2_3.aBoolean650) {
				local119 = this.aClass1_Sub2_3.method5961(local51);
			} else {
				local119 = this.aClass1_Sub2_3.method5965(local51)[0];
			}
			if (arg4) {
				local49 = local51 << 2;
			}
			for (@Pc(139) int local139 = arg3 - 1; local139 >= 0; local139--) {
				@Pc(148) float local148 = (float) local99[local139] / 4096.0F;
				@Pc(161) float local161 = ((float) local119[local139] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
				if (local148 < 0.0F) {
					local148 = 0.0F;
				} else if (local148 > 1.0F) {
					local148 = 1.0F;
				}
				local47[local49++] = local161 * (float) local67[local139];
				local47[local49++] = local161 * (float) local75[local139];
				local47[local49++] = local161 * (float) local71[local139];
				local47[local49++] = local148;
				if (arg4) {
					local49 += (arg3 << 2) - 4;
				}
			}
		}
		for (@Pc(236) int local236 = 0; local236 < this.aClass1_Sub2Array29.length; local236++) {
			this.aClass1_Sub2Array29[local236].method5958();
		}
		return local47;
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(IIILclient!l;DLclient!oi;Z)[I")
	public int[] method4472(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Interface4 arg2, @OriginalArg(4) double arg3, @OriginalArg(5) Class185 arg4, @OriginalArg(6) boolean arg5) {
		Static252.anInterface4_6 = arg2;
		Static420.aClass185_113 = arg4;
		for (@Pc(11) int local11 = 0; local11 < this.aClass1_Sub2Array29.length; local11++) {
			this.aClass1_Sub2Array29[local11].method5966(arg0, arg1);
		}
		Static2.method27(arg3);
		Static306.method4069(arg1, arg0);
		@Pc(45) int[] local45 = new int[arg0 * arg1 * 4];
		@Pc(47) int local47 = 0;
		for (@Pc(49) int local49 = 0; local49 < arg1; local49++) {
			@Pc(65) int[] local65;
			@Pc(69) int[] local69;
			@Pc(73) int[] local73;
			@Pc(81) int[] local81;
			if (this.aClass1_Sub2_2.aBoolean650) {
				local81 = this.aClass1_Sub2_2.method5961(local49);
				local69 = local81;
				local65 = local81;
				local73 = local81;
			} else {
				@Pc(61) int[][] local61 = this.aClass1_Sub2_2.method5965(local49);
				local65 = local61[0];
				local69 = local61[1];
				local73 = local61[2];
			}
			if (arg5) {
				local47 = local49;
			}
			if (this.aClass1_Sub2_1.aBoolean650) {
				local81 = this.aClass1_Sub2_1.method5961(local49);
			} else {
				local81 = this.aClass1_Sub2_1.method5965(local49)[0];
			}
			for (@Pc(115) int local115 = arg0 - 1; local115 >= 0; local115--) {
				@Pc(123) int local123 = local65[local115] >> 4;
				if (local123 > 255) {
					local123 = 255;
				}
				if (local123 < 0) {
					local123 = 0;
				}
				@Pc(138) int local138 = local69[local115] >> 4;
				if (local138 > 255) {
					local138 = 255;
				}
				if (local138 < 0) {
					local138 = 0;
				}
				@Pc(153) int local153 = local73[local115] >> 4;
				if (local153 > 255) {
					local153 = 255;
				}
				local138 = Static412.anIntArray472[local138];
				if (local153 < 0) {
					local153 = 0;
				}
				local123 = Static412.anIntArray472[local123];
				local153 = Static412.anIntArray472[local153];
				@Pc(187) int local187;
				if (local123 == 0 && local138 == 0 && local153 == 0) {
					local187 = 0;
				} else {
					local187 = local81[local115] >> 4;
					if (local187 > 255) {
						local187 = 255;
					}
					if (local187 < 0) {
						local187 = 0;
					}
				}
				local45[local47++] = local153 + (local138 << 8) + (local187 << 24) + (local123 << 16);
				if (arg5) {
					local47 += arg0 - 1;
				}
			}
		}
		for (@Pc(254) int local254 = 0; local254 < this.aClass1_Sub2Array29.length; local254++) {
			this.aClass1_Sub2Array29[local254].method5958();
		}
		return local45;
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(ILclient!oi;IIZLclient!l;DZ)[I")
	public int[] method4473(@OriginalArg(0) int arg0, @OriginalArg(1) Class185 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) Interface4 arg4, @OriginalArg(6) double arg5, @OriginalArg(7) boolean arg6) {
		Static420.aClass185_113 = arg1;
		Static252.anInterface4_6 = arg4;
		for (@Pc(11) int local11 = 0; local11 < this.aClass1_Sub2Array29.length; local11++) {
			this.aClass1_Sub2Array29[local11].method5966(arg0, arg2);
		}
		Static2.method27(arg5);
		Static306.method4069(arg2, arg0);
		@Pc(39) int[] local39 = new int[arg0 * arg2];
		@Pc(47) int local47;
		@Pc(43) int local43;
		@Pc(45) byte local45;
		if (arg3) {
			local45 = -1;
			local43 = -1;
			local47 = arg0 - 1;
		} else {
			local43 = arg0;
			local45 = 1;
			local47 = 0;
		}
		@Pc(64) int local64 = 0;
		for (@Pc(66) int local66 = 0; local66 < arg2; local66++) {
			@Pc(86) int[] local86;
			@Pc(82) int[] local82;
			@Pc(84) int[] local84;
			if (this.aClass1_Sub2_2.aBoolean650) {
				@Pc(80) int[] local80 = this.aClass1_Sub2_2.method5961(local66);
				local82 = local80;
				local84 = local80;
				local86 = local80;
			} else {
				@Pc(94) int[][] local94 = this.aClass1_Sub2_2.method5965(local66);
				local82 = local94[1];
				local84 = local94[2];
				local86 = local94[0];
			}
			if (arg6) {
				local64 = local66;
			}
			for (@Pc(112) int local112 = local47; local112 != local43; local112 += local45) {
				@Pc(120) int local120 = local86[local112] >> 4;
				if (local120 > 255) {
					local120 = 255;
				}
				if (local120 < 0) {
					local120 = 0;
				}
				@Pc(138) int local138 = local82[local112] >> 4;
				if (local138 > 255) {
					local138 = 255;
				}
				if (local138 < 0) {
					local138 = 0;
				}
				@Pc(155) int local155 = local84[local112] >> 4;
				if (local155 > 255) {
					local155 = 255;
				}
				local120 = Static412.anIntArray472[local120];
				local138 = Static412.anIntArray472[local138];
				if (local155 < 0) {
					local155 = 0;
				}
				local155 = Static412.anIntArray472[local155];
				@Pc(190) int local190 = local155 + (local120 << 16) + (local138 << 8);
				if (local190 != 0) {
					local190 |= 0xFF000000;
				}
				local39[local64++] = local190;
				if (arg6) {
					local64 += arg0 - 1;
				}
			}
		}
		for (@Pc(226) int local226 = 0; local226 < this.aClass1_Sub2Array29.length; local226++) {
			this.aClass1_Sub2Array29[local226].method5958();
		}
		return local39;
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(Lclient!l;BLclient!oi;)Z")
	public boolean method4475(@OriginalArg(0) Interface4 arg0, @OriginalArg(2) Class185 arg1) {
		@Pc(12) int local12;
		if (Static68.anInt1014 >= 0) {
			for (local12 = 0; local12 < this.anIntArray402.length; local12++) {
				if (!arg1.method4024(this.anIntArray402[local12], Static68.anInt1014)) {
					return false;
				}
			}
		} else {
			for (local12 = 0; local12 < this.anIntArray402.length; local12++) {
				if (!arg1.method4000(this.anIntArray402[local12])) {
					return false;
				}
			}
		}
		for (local12 = 0; local12 < this.anIntArray403.length; local12++) {
			if (!arg0.method5089(this.anIntArray403[local12])) {
				return false;
			}
		}
		return true;
	}
}
