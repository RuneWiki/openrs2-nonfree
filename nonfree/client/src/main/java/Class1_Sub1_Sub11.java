import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gm")
public final class Class1_Sub1_Sub11 extends Class1_Sub1 {

	@OriginalMember(owner = "client!gm", name = "F", descriptor = "[I")
	private final int[] anIntArray268;

	@OriginalMember(owner = "client!gm", name = "I", descriptor = "[I")
	private final int[] anIntArray269;

	@OriginalMember(owner = "client!gm", name = "N", descriptor = "Lclient!fm;")
	private final Class1_Sub2 aClass1_Sub2_2;

	@OriginalMember(owner = "client!gm", name = "P", descriptor = "Lclient!fm;")
	private final Class1_Sub2 aClass1_Sub2_3;

	@OriginalMember(owner = "client!gm", name = "J", descriptor = "Lclient!fm;")
	private final Class1_Sub2 aClass1_Sub2_1;

	@OriginalMember(owner = "client!gm", name = "Q", descriptor = "[Lclient!fm;")
	private final Class1_Sub2[] aClass1_Sub2Array15;

	@OriginalMember(owner = "client!gm", name = "<init>", descriptor = "()V")
	private Class1_Sub1_Sub11() {
		this.anIntArray268 = new int[0];
		this.anIntArray269 = new int[0];
		this.aClass1_Sub2_2 = new Class1_Sub2_Sub19(0);
		this.aClass1_Sub2_2.anInt6479 = 1;
		this.aClass1_Sub2_3 = new Class1_Sub2_Sub19();
		this.aClass1_Sub2_3.anInt6479 = 1;
		this.aClass1_Sub2_1 = new Class1_Sub2_Sub19();
		this.aClass1_Sub2Array15 = new Class1_Sub2[] { this.aClass1_Sub2_3, this.aClass1_Sub2_1, this.aClass1_Sub2_2 };
		this.aClass1_Sub2_1.anInt6479 = 1;
	}

	@OriginalMember(owner = "client!gm", name = "<init>", descriptor = "(Lclient!eb;)V")
	public Class1_Sub1_Sub11(@OriginalArg(0) Class1_Sub7 arg0) {
		@Pc(7) int local7 = arg0.method3141();
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		this.aClass1_Sub2Array15 = new Class1_Sub2[local7];
		@Pc(18) int[][] local18 = new int[local7][];
		@Pc(53) int local53;
		for (@Pc(20) int local20 = 0; local20 < local7; local20++) {
			@Pc(26) Class1_Sub2 local26 = Static203.method3795(arg0);
			if (local26.method5663() >= 0) {
				local9++;
			}
			if (local26.method5657() >= 0) {
				local11++;
			}
			@Pc(46) int local46 = local26.aClass1_Sub2Array42.length;
			local18[local20] = new int[local46];
			for (local53 = 0; local53 < local46; local53++) {
				local18[local20][local53] = arg0.method3141();
			}
			this.aClass1_Sub2Array15[local20] = local26;
		}
		this.anIntArray269 = new int[local9];
		local9 = 0;
		this.anIntArray268 = new int[local11];
		local11 = 0;
		for (@Pc(98) int local98 = 0; local98 < local7; local98++) {
			@Pc(105) Class1_Sub2 local105 = this.aClass1_Sub2Array15[local98];
			local53 = local105.aClass1_Sub2Array42.length;
			for (@Pc(111) int local111 = 0; local111 < local53; local111++) {
				local105.aClass1_Sub2Array42[local111] = this.aClass1_Sub2Array15[local18[local98][local111]];
			}
			@Pc(133) int local133 = local105.method5663();
			@Pc(137) int local137 = local105.method5657();
			if (local133 > 0) {
				this.anIntArray269[local9++] = local133;
			}
			if (local137 > 0) {
				this.anIntArray268[local11++] = local137;
			}
			local18[local98] = null;
		}
		this.aClass1_Sub2_3 = this.aClass1_Sub2Array15[arg0.method3141()];
		this.aClass1_Sub2_1 = this.aClass1_Sub2Array15[arg0.method3141()];
		this.aClass1_Sub2_2 = this.aClass1_Sub2Array15[arg0.method3141()];
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(ZIILclient!qj;Lclient!sr;I)[F")
	public float[] method2020(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class165 arg2, @OriginalArg(4) Interface7 arg3, @OriginalArg(5) int arg4) {
		Static81.anInterface7_2 = arg3;
		Static20.aClass165_6 = arg2;
		for (@Pc(11) int local11 = 0; local11 < this.aClass1_Sub2Array15.length; local11++) {
			this.aClass1_Sub2Array15[local11].method5656(arg1, arg4);
		}
		Static78.method1541(arg4, arg1);
		@Pc(38) float[] local38 = new float[arg1 * 4 * arg4];
		@Pc(40) int local40 = 0;
		for (@Pc(42) int local42 = 0; local42 < arg4; local42++) {
			@Pc(62) int[] local62;
			@Pc(58) int[] local58;
			@Pc(60) int[] local60;
			if (this.aClass1_Sub2_3.aBoolean583) {
				@Pc(56) int[] local56 = this.aClass1_Sub2_3.method5662(local42);
				local58 = local56;
				local60 = local56;
				local62 = local56;
			} else {
				@Pc(70) int[][] local70 = this.aClass1_Sub2_3.method5664(local42);
				local58 = local70[1];
				local62 = local70[0];
				local60 = local70[2];
			}
			@Pc(94) int[] local94;
			if (this.aClass1_Sub2_1.aBoolean583) {
				local94 = this.aClass1_Sub2_1.method5662(local42);
			} else {
				local94 = this.aClass1_Sub2_1.method5664(local42)[0];
			}
			if (arg0) {
				local40 = local42 << 2;
			}
			@Pc(120) int[] local120;
			if (this.aClass1_Sub2_2.aBoolean583) {
				local120 = this.aClass1_Sub2_2.method5662(local42);
			} else {
				local120 = this.aClass1_Sub2_2.method5664(local42)[0];
			}
			for (@Pc(134) int local134 = arg1 - 1; local134 >= 0; local134--) {
				@Pc(143) float local143 = (float) local94[local134] / 4096.0F;
				if (local143 < 0.0F) {
					local143 = 0.0F;
				} else if (local143 > 1.0F) {
					local143 = 1.0F;
				}
				@Pc(170) float local170 = ((float) local120[local134] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
				local38[local40++] = local170 * (float) local62[local134];
				local38[local40++] = local170 * (float) local58[local134];
				local38[local40++] = (float) local60[local134] * local170;
				local38[local40++] = local143;
				if (arg0) {
					local40 += (arg1 << 2) - 4;
				}
			}
		}
		for (@Pc(224) int local224 = 0; local224 < this.aClass1_Sub2Array15.length; local224++) {
			this.aClass1_Sub2Array15[local224].method5655();
		}
		return local38;
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(Lclient!sr;Lclient!qj;I)Z")
	public boolean method2023(@OriginalArg(0) Interface7 arg0, @OriginalArg(1) Class165 arg1) {
		@Pc(9) int local9;
		if (Static166.anInt3475 <= 0) {
			for (local9 = 0; local9 < this.anIntArray269.length; local9++) {
				if (!arg1.method4486(this.anIntArray269[local9])) {
					return false;
				}
			}
		} else {
			for (local9 = 0; local9 < this.anIntArray269.length; local9++) {
				if (!arg1.method4485(Static166.anInt3475, this.anIntArray269[local9])) {
					return false;
				}
			}
		}
		for (local9 = 0; local9 < this.anIntArray268.length; local9++) {
			if (!arg0.method2789(this.anIntArray268[local9])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(IDLclient!qj;BIZLclient!sr;)[I")
	public int[] method2025(@OriginalArg(0) int arg0, @OriginalArg(1) double arg1, @OriginalArg(2) Class165 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) Interface7 arg5) {
		Static20.aClass165_6 = arg2;
		Static81.anInterface7_2 = arg5;
		for (@Pc(11) int local11 = 0; local11 < this.aClass1_Sub2Array15.length; local11++) {
			this.aClass1_Sub2Array15[local11].method5656(arg3, arg0);
		}
		Static54.method3230(arg1);
		Static78.method1541(arg0, arg3);
		@Pc(45) int[] local45 = new int[arg0 * arg3 * 4];
		@Pc(47) int local47 = 0;
		for (@Pc(49) int local49 = 0; local49 < arg0; local49++) {
			@Pc(67) int[] local67;
			@Pc(65) int[] local65;
			@Pc(63) int[] local63;
			@Pc(61) int[] local61;
			if (this.aClass1_Sub2_3.aBoolean583) {
				local61 = this.aClass1_Sub2_3.method5662(local49);
				local63 = local61;
				local65 = local61;
				local67 = local61;
			} else {
				@Pc(75) int[][] local75 = this.aClass1_Sub2_3.method5664(local49);
				local65 = local75[1];
				local67 = local75[0];
				local63 = local75[2];
			}
			if (arg4) {
				local47 = local49;
			}
			if (this.aClass1_Sub2_1.aBoolean583) {
				local61 = this.aClass1_Sub2_1.method5662(local49);
			} else {
				local61 = this.aClass1_Sub2_1.method5664(local49)[0];
			}
			for (@Pc(115) int local115 = arg3 - 1; local115 >= 0; local115--) {
				@Pc(123) int local123 = local67[local115] >> 4;
				if (local123 > 255) {
					local123 = 255;
				}
				if (local123 < 0) {
					local123 = 0;
				}
				@Pc(138) int local138 = local65[local115] >> 4;
				if (local138 > 255) {
					local138 = 255;
				}
				if (local138 < 0) {
					local138 = 0;
				}
				@Pc(156) int local156 = local63[local115] >> 4;
				if (local156 > 255) {
					local156 = 255;
				}
				local123 = Static188.anIntArray463[local123];
				if (local156 < 0) {
					local156 = 0;
				}
				local138 = Static188.anIntArray463[local138];
				local156 = Static188.anIntArray463[local156];
				@Pc(191) int local191;
				if (local123 == 0 && local138 == 0 && local156 == 0) {
					local191 = 0;
				} else {
					local191 = local61[local115] >> 4;
					if (local191 > 255) {
						local191 = 255;
					}
					if (local191 < 0) {
						local191 = 0;
					}
				}
				local45[local47++] = (local138 << 8) + (local191 << 24) + (local123 << 16) + local156;
				if (arg4) {
					local47 += arg3 - 1;
				}
			}
		}
		for (@Pc(256) int local256 = 0; local256 < this.aClass1_Sub2Array15.length; local256++) {
			this.aClass1_Sub2Array15[local256].method5655();
		}
		return local45;
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(Lclient!sr;ZLclient!qj;DZIIZ)[I")
	public int[] method2026(@OriginalArg(0) Interface7 arg0, @OriginalArg(2) Class165 arg1, @OriginalArg(3) double arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) boolean arg6) {
		Static81.anInterface7_2 = arg0;
		Static20.aClass165_6 = arg1;
		for (@Pc(11) int local11 = 0; local11 < this.aClass1_Sub2Array15.length; local11++) {
			this.aClass1_Sub2Array15[local11].method5656(arg5, arg4);
		}
		Static54.method3230(arg2);
		Static78.method1541(arg4, arg5);
		@Pc(39) int[] local39 = new int[arg5 * arg4];
		@Pc(55) int local55;
		@Pc(49) int local49;
		@Pc(51) byte local51;
		if (arg3) {
			local49 = -1;
			local51 = -1;
			local55 = arg5 - 1;
		} else {
			local55 = 0;
			local49 = arg5;
			local51 = 1;
		}
		@Pc(65) int local65 = 0;
		for (@Pc(67) int local67 = 0; local67 < arg4; local67++) {
			@Pc(83) int[] local83;
			@Pc(81) int[] local81;
			@Pc(85) int[] local85;
			if (this.aClass1_Sub2_3.aBoolean583) {
				@Pc(79) int[] local79 = this.aClass1_Sub2_3.method5662(local67);
				local81 = local79;
				local83 = local79;
				local85 = local79;
			} else {
				@Pc(93) int[][] local93 = this.aClass1_Sub2_3.method5664(local67);
				local85 = local93[2];
				local81 = local93[1];
				local83 = local93[0];
			}
			if (arg6) {
				local65 = local67;
			}
			for (@Pc(111) int local111 = local55; local111 != local49; local111 += local51) {
				@Pc(119) int local119 = local83[local111] >> 4;
				if (local119 > 255) {
					local119 = 255;
				}
				if (local119 < 0) {
					local119 = 0;
				}
				@Pc(134) int local134 = local81[local111] >> 4;
				if (local134 > 255) {
					local134 = 255;
				}
				if (local134 < 0) {
					local134 = 0;
				}
				@Pc(152) int local152 = local85[local111] >> 4;
				if (local152 > 255) {
					local152 = 255;
				}
				local134 = Static188.anIntArray463[local134];
				if (local152 < 0) {
					local152 = 0;
				}
				local119 = Static188.anIntArray463[local119];
				local152 = Static188.anIntArray463[local152];
				@Pc(184) int local184 = (local134 << 8) + ((local119 << 16) + local152);
				if (local184 != 0) {
					local184 |= 0xFF000000;
				}
				local39[local65++] = local184;
				if (arg6) {
					local65 += arg5 - 1;
				}
			}
		}
		for (@Pc(220) int local220 = 0; local220 < this.aClass1_Sub2Array15.length; local220++) {
			this.aClass1_Sub2Array15[local220].method5655();
		}
		return local39;
	}
}
