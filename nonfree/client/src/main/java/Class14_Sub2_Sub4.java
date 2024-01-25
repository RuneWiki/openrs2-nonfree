import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cr")
public final class Class14_Sub2_Sub4 extends Class14_Sub2 {

	@OriginalMember(owner = "client!cr", name = "v", descriptor = "[I")
	private final int[] anIntArray70;

	@OriginalMember(owner = "client!cr", name = "C", descriptor = "[I")
	private final int[] anIntArray71;

	@OriginalMember(owner = "client!cr", name = "I", descriptor = "Lclient!na;")
	private final Class14_Sub3 aClass14_Sub3_2;

	@OriginalMember(owner = "client!cr", name = "L", descriptor = "Lclient!na;")
	private final Class14_Sub3 aClass14_Sub3_3;

	@OriginalMember(owner = "client!cr", name = "B", descriptor = "Lclient!na;")
	private final Class14_Sub3 aClass14_Sub3_1;

	@OriginalMember(owner = "client!cr", name = "w", descriptor = "[Lclient!na;")
	private final Class14_Sub3[] aClass14_Sub3Array7;

	@OriginalMember(owner = "client!cr", name = "<init>", descriptor = "()V")
	private Class14_Sub2_Sub4() {
		this.anIntArray70 = new int[0];
		this.anIntArray71 = new int[0];
		this.aClass14_Sub3_2 = new Class14_Sub3_Sub23(0);
		this.aClass14_Sub3_2.anInt6731 = 1;
		this.aClass14_Sub3_3 = new Class14_Sub3_Sub23();
		this.aClass14_Sub3_3.anInt6731 = 1;
		this.aClass14_Sub3_1 = new Class14_Sub3_Sub23();
		this.aClass14_Sub3_1.anInt6731 = 1;
		this.aClass14_Sub3Array7 = new Class14_Sub3[] { this.aClass14_Sub3_3, this.aClass14_Sub3_1, this.aClass14_Sub3_2 };
	}

	@OriginalMember(owner = "client!cr", name = "<init>", descriptor = "(Lclient!jg;)V")
	public Class14_Sub2_Sub4(@OriginalArg(0) Class14_Sub4 arg0) {
		@Pc(7) int local7 = arg0.method2548();
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		@Pc(14) int[][] local14 = new int[local7][];
		this.aClass14_Sub3Array7 = new Class14_Sub3[local7];
		@Pc(50) int local50;
		for (@Pc(20) int local20 = 0; local20 < local7; local20++) {
			@Pc(26) Class14_Sub3 local26 = Static149.method2992(arg0);
			if (local26.method5995() >= 0) {
				local9++;
			}
			if (local26.method5992() >= 0) {
				local11++;
			}
			@Pc(43) int local43 = local26.aClass14_Sub3Array42.length;
			local14[local20] = new int[local43];
			for (local50 = 0; local50 < local43; local50++) {
				local14[local20][local50] = arg0.method2548();
			}
			this.aClass14_Sub3Array7[local20] = local26;
		}
		this.anIntArray71 = new int[local9];
		this.anIntArray70 = new int[local11];
		local9 = 0;
		local11 = 0;
		for (@Pc(95) int local95 = 0; local95 < local7; local95++) {
			@Pc(102) Class14_Sub3 local102 = this.aClass14_Sub3Array7[local95];
			local50 = local102.aClass14_Sub3Array42.length;
			for (@Pc(108) int local108 = 0; local108 < local50; local108++) {
				local102.aClass14_Sub3Array42[local108] = this.aClass14_Sub3Array7[local14[local95][local108]];
			}
			@Pc(130) int local130 = local102.method5995();
			@Pc(134) int local134 = local102.method5992();
			if (local130 > 0) {
				this.anIntArray71[local9++] = local130;
			}
			if (local134 > 0) {
				this.anIntArray70[local11++] = local134;
			}
			local14[local95] = null;
		}
		this.aClass14_Sub3_3 = this.aClass14_Sub3Array7[arg0.method2548()];
		this.aClass14_Sub3_1 = this.aClass14_Sub3Array7[arg0.method2548()];
		this.aClass14_Sub3_2 = this.aClass14_Sub3Array7[arg0.method2548()];
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(Lclient!mo;BLclient!ah;ZII)[F")
	public float[] method1170(@OriginalArg(0) Class143 arg0, @OriginalArg(2) Interface2 arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static224.anInterface2_5 = arg1;
		Static165.aClass143_95 = arg0;
		for (@Pc(11) int local11 = 0; local11 < this.aClass14_Sub3Array7.length; local11++) {
			this.aClass14_Sub3Array7[local11].method5993(arg3, arg4);
		}
		Static109.method2350(arg4, arg3);
		@Pc(38) float[] local38 = new float[arg4 * 4 * arg3];
		@Pc(40) int local40 = 0;
		for (@Pc(42) int local42 = 0; local42 < arg3; local42++) {
			@Pc(56) int[] local56;
			@Pc(60) int[] local60;
			@Pc(58) int[] local58;
			if (this.aClass14_Sub3_3.aBoolean446) {
				@Pc(54) int[] local54 = this.aClass14_Sub3_3.method6003(local42);
				local56 = local54;
				local58 = local54;
				local60 = local54;
			} else {
				@Pc(68) int[][] local68 = this.aClass14_Sub3_3.method5994(local42);
				local58 = local68[2];
				local60 = local68[1];
				local56 = local68[0];
			}
			@Pc(92) int[] local92;
			if (this.aClass14_Sub3_1.aBoolean446) {
				local92 = this.aClass14_Sub3_1.method6003(local42);
			} else {
				local92 = this.aClass14_Sub3_1.method5994(local42)[0];
			}
			@Pc(112) int[] local112;
			if (this.aClass14_Sub3_2.aBoolean446) {
				local112 = this.aClass14_Sub3_2.method6003(local42);
			} else {
				local112 = this.aClass14_Sub3_2.method5994(local42)[0];
			}
			if (arg2) {
				local40 = local42 << 2;
			}
			for (@Pc(130) int local130 = arg4 - 1; local130 >= 0; local130--) {
				@Pc(139) float local139 = (float) local92[local130] / 4096.0F;
				@Pc(152) float local152 = ((float) local112[local130] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
				if (local139 < 0.0F) {
					local139 = 0.0F;
				} else if (local139 > 1.0F) {
					local139 = 1.0F;
				}
				local38[local40++] = local152 * (float) local56[local130];
				local38[local40++] = (float) local60[local130] * local152;
				local38[local40++] = local152 * (float) local58[local130];
				local38[local40++] = local139;
				if (arg2) {
					local40 += (arg4 << 2) - 4;
				}
			}
		}
		for (@Pc(226) int local226 = 0; local226 < this.aClass14_Sub3Array7.length; local226++) {
			this.aClass14_Sub3Array7[local226].method5999();
		}
		return local38;
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(DZLclient!ah;IIZILclient!mo;)[I")
	public int[] method1171(@OriginalArg(0) double arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Interface2 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(7) Class143 arg6) {
		Static224.anInterface2_5 = arg2;
		Static165.aClass143_95 = arg6;
		for (@Pc(17) int local17 = 0; local17 < this.aClass14_Sub3Array7.length; local17++) {
			this.aClass14_Sub3Array7[local17].method5993(arg4, arg3);
		}
		Static136.method2754(arg0);
		Static109.method2350(arg3, arg4);
		@Pc(47) int[] local47 = new int[arg3 * arg4];
		@Pc(53) int local53;
		@Pc(55) int local55;
		@Pc(57) byte local57;
		if (arg1) {
			local53 = arg3 - 1;
			local55 = -1;
			local57 = -1;
		} else {
			local53 = 0;
			local57 = 1;
			local55 = arg3;
		}
		@Pc(67) int local67 = 0;
		for (@Pc(69) int local69 = 0; local69 < arg4; local69++) {
			@Pc(85) int[] local85;
			@Pc(83) int[] local83;
			@Pc(87) int[] local87;
			if (this.aClass14_Sub3_3.aBoolean446) {
				@Pc(81) int[] local81 = this.aClass14_Sub3_3.method6003(local69);
				local83 = local81;
				local85 = local81;
				local87 = local81;
			} else {
				@Pc(95) int[][] local95 = this.aClass14_Sub3_3.method5994(local69);
				local87 = local95[2];
				local85 = local95[0];
				local83 = local95[1];
			}
			if (arg5) {
				local67 = local69;
			}
			for (@Pc(113) int local113 = local53; local113 != local55; local113 += local57) {
				@Pc(121) int local121 = local85[local113] >> 4;
				if (local121 > 255) {
					local121 = 255;
				}
				if (local121 < 0) {
					local121 = 0;
				}
				@Pc(141) int local141 = local83[local113] >> 4;
				if (local141 > 255) {
					local141 = 255;
				}
				if (local141 < 0) {
					local141 = 0;
				}
				@Pc(158) int local158 = local87[local113] >> 4;
				if (local158 > 255) {
					local158 = 255;
				}
				local141 = Static198.anIntArray339[local141];
				if (local158 < 0) {
					local158 = 0;
				}
				local121 = Static198.anIntArray339[local121];
				local158 = Static198.anIntArray339[local158];
				@Pc(194) int local194 = local158 + (local141 << 8) + (local121 << 16);
				if (local194 != 0) {
					local194 |= 0xFF000000;
				}
				local47[local67++] = local194;
				if (arg5) {
					local67 += arg3 - 1;
				}
			}
		}
		for (@Pc(230) int local230 = 0; local230 < this.aClass14_Sub3Array7.length; local230++) {
			this.aClass14_Sub3Array7[local230].method5999();
		}
		return local47;
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(DIBLclient!ah;Lclient!mo;ZI)[I")
	public int[] method1173(@OriginalArg(0) double arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Interface2 arg2, @OriginalArg(4) Class143 arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		Static224.anInterface2_5 = arg2;
		Static165.aClass143_95 = arg3;
		for (@Pc(11) int local11 = 0; local11 < this.aClass14_Sub3Array7.length; local11++) {
			this.aClass14_Sub3Array7[local11].method5993(arg5, arg1);
		}
		Static136.method2754(arg0);
		Static109.method2350(arg1, arg5);
		@Pc(53) int[] local53 = new int[arg5 * 4 * arg1];
		@Pc(55) int local55 = 0;
		for (@Pc(57) int local57 = 0; local57 < arg5; local57++) {
			@Pc(73) int[] local73;
			@Pc(77) int[] local77;
			@Pc(81) int[] local81;
			@Pc(89) int[] local89;
			if (this.aClass14_Sub3_3.aBoolean446) {
				local89 = this.aClass14_Sub3_3.method6003(local57);
				local77 = local89;
				local81 = local89;
				local73 = local89;
			} else {
				@Pc(69) int[][] local69 = this.aClass14_Sub3_3.method5994(local57);
				local73 = local69[0];
				local77 = local69[1];
				local81 = local69[2];
			}
			if (this.aClass14_Sub3_1.aBoolean446) {
				local89 = this.aClass14_Sub3_1.method6003(local57);
			} else {
				local89 = this.aClass14_Sub3_1.method5994(local57)[0];
			}
			if (arg4) {
				local55 = local57;
			}
			for (@Pc(123) int local123 = arg1 - 1; local123 >= 0; local123--) {
				@Pc(131) int local131 = local73[local123] >> 4;
				if (local131 > 255) {
					local131 = 255;
				}
				if (local131 < 0) {
					local131 = 0;
				}
				@Pc(146) int local146 = local77[local123] >> 4;
				if (local146 > 255) {
					local146 = 255;
				}
				if (local146 < 0) {
					local146 = 0;
				}
				@Pc(163) int local163 = local81[local123] >> 4;
				if (local163 > 255) {
					local163 = 255;
				}
				local131 = Static198.anIntArray339[local131];
				local146 = Static198.anIntArray339[local146];
				if (local163 < 0) {
					local163 = 0;
				}
				local163 = Static198.anIntArray339[local163];
				@Pc(205) int local205;
				if (local131 == 0 && local146 == 0 && local163 == 0) {
					local205 = 0;
				} else {
					local205 = local89[local123] >> 4;
					if (local205 > 255) {
						local205 = 255;
					}
					if (local205 < 0) {
						local205 = 0;
					}
				}
				local53[local55++] = local163 + (local146 << 8) + (local131 << 16) + (local205 << 24);
				if (arg4) {
					local55 += arg1 - 1;
				}
			}
		}
		for (@Pc(260) int local260 = 0; local260 < this.aClass14_Sub3Array7.length; local260++) {
			this.aClass14_Sub3Array7[local260].method5999();
		}
		return local53;
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(BLclient!mo;Lclient!ah;)Z")
	public boolean method1175(@OriginalArg(1) Class143 arg0, @OriginalArg(2) Interface2 arg1) {
		@Pc(12) int local12;
		if (Static113.anInt2512 > 0) {
			for (local12 = 0; local12 < this.anIntArray71.length; local12++) {
				if (!arg0.method3749(this.anIntArray71[local12], Static113.anInt2512)) {
					return false;
				}
			}
		} else {
			for (local12 = 0; local12 < this.anIntArray71.length; local12++) {
				if (!arg0.method3736(this.anIntArray71[local12])) {
					return false;
				}
			}
		}
		for (local12 = 0; local12 < this.anIntArray70.length; local12++) {
			if (!arg1.method117(this.anIntArray70[local12])) {
				return false;
			}
		}
		return true;
	}
}
