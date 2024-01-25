import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!af")
public final class Class6_Sub2_Sub1 extends Class6_Sub2 {

	@OriginalMember(owner = "client!af", name = "G", descriptor = "[I")
	private final int[] anIntArray11;

	@OriginalMember(owner = "client!af", name = "s", descriptor = "[I")
	private final int[] anIntArray10;

	@OriginalMember(owner = "client!af", name = "K", descriptor = "Lclient!ba;")
	private final Class6_Sub1 aClass6_Sub1_3;

	@OriginalMember(owner = "client!af", name = "z", descriptor = "Lclient!ba;")
	private final Class6_Sub1 aClass6_Sub1_1;

	@OriginalMember(owner = "client!af", name = "E", descriptor = "Lclient!ba;")
	private final Class6_Sub1 aClass6_Sub1_2;

	@OriginalMember(owner = "client!af", name = "J", descriptor = "[Lclient!ba;")
	private final Class6_Sub1[] aClass6_Sub1Array3;

	@OriginalMember(owner = "client!af", name = "<init>", descriptor = "()V")
	private Class6_Sub2_Sub1() {
		this.anIntArray11 = new int[0];
		this.anIntArray10 = new int[0];
		this.aClass6_Sub1_3 = new Class6_Sub1_Sub26(0);
		this.aClass6_Sub1_3.anInt6204 = 1;
		this.aClass6_Sub1_1 = new Class6_Sub1_Sub26();
		this.aClass6_Sub1_1.anInt6204 = 1;
		this.aClass6_Sub1_2 = new Class6_Sub1_Sub26();
		this.aClass6_Sub1_2.anInt6204 = 1;
		this.aClass6_Sub1Array3 = new Class6_Sub1[] { this.aClass6_Sub1_1, this.aClass6_Sub1_2, this.aClass6_Sub1_3 };
	}

	@OriginalMember(owner = "client!af", name = "<init>", descriptor = "(Lclient!ec;)V")
	public Class6_Sub2_Sub1(@OriginalArg(0) Class6_Sub10 arg0) {
		@Pc(7) int local7 = arg0.method3972();
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		@Pc(14) int[][] local14 = new int[local7][];
		this.aClass6_Sub1Array3 = new Class6_Sub1[local7];
		@Pc(50) int local50;
		for (@Pc(20) int local20 = 0; local20 < local7; local20++) {
			@Pc(26) Class6_Sub1 local26 = Static326.method5429(arg0);
			if (local26.method5610() >= 0) {
				local9++;
			}
			if (local26.method5615() >= 0) {
				local11++;
			}
			@Pc(43) int local43 = local26.aClass6_Sub1Array42.length;
			local14[local20] = new int[local43];
			for (local50 = 0; local50 < local43; local50++) {
				local14[local20][local50] = arg0.method3972();
			}
			this.aClass6_Sub1Array3[local20] = local26;
		}
		this.anIntArray11 = new int[local9];
		local9 = 0;
		this.anIntArray10 = new int[local11];
		local11 = 0;
		for (@Pc(91) int local91 = 0; local91 < local7; local91++) {
			@Pc(98) Class6_Sub1 local98 = this.aClass6_Sub1Array3[local91];
			local50 = local98.aClass6_Sub1Array42.length;
			for (@Pc(104) int local104 = 0; local104 < local50; local104++) {
				local98.aClass6_Sub1Array42[local104] = this.aClass6_Sub1Array3[local14[local91][local104]];
			}
			@Pc(126) int local126 = local98.method5610();
			@Pc(130) int local130 = local98.method5615();
			if (local126 > 0) {
				this.anIntArray11[local9++] = local126;
			}
			if (local130 > 0) {
				this.anIntArray10[local11++] = local130;
			}
			local14[local91] = null;
		}
		this.aClass6_Sub1_1 = this.aClass6_Sub1Array3[arg0.method3972()];
		this.aClass6_Sub1_2 = this.aClass6_Sub1Array3[arg0.method3972()];
		this.aClass6_Sub1_3 = this.aClass6_Sub1Array3[arg0.method3972()];
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(Lclient!cj;IZIDIZLclient!dp;)[I")
	public int[] method120(@OriginalArg(0) Interface2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) double arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) Class53 arg6) {
		Static39.aClass53_29 = arg6;
		Static137.anInterface2_3 = arg0;
		for (@Pc(11) int local11 = 0; local11 < this.aClass6_Sub1Array3.length; local11++) {
			this.aClass6_Sub1Array3[local11].method5606(arg3, arg1);
		}
		Static316.method5302(arg4);
		Static117.method2381(arg1, arg3);
		@Pc(50) int[] local50 = new int[arg1 * arg3];
		@Pc(60) int local60;
		@Pc(56) int local56;
		@Pc(54) byte local54;
		if (arg2) {
			local54 = -1;
			local56 = -1;
			local60 = arg3 - 1;
		} else {
			local56 = arg3;
			local54 = 1;
			local60 = 0;
		}
		@Pc(70) int local70 = 0;
		for (@Pc(72) int local72 = 0; local72 < arg1; local72++) {
			if (arg5) {
				local70 = local72;
			}
			@Pc(90) int[] local90;
			@Pc(94) int[] local94;
			@Pc(92) int[] local92;
			if (this.aClass6_Sub1_1.aBoolean411) {
				@Pc(88) int[] local88 = this.aClass6_Sub1_1.method5616(local72);
				local90 = local88;
				local92 = local88;
				local94 = local88;
			} else {
				@Pc(102) int[][] local102 = this.aClass6_Sub1_1.method5608(local72);
				local90 = local102[0];
				local94 = local102[1];
				local92 = local102[2];
			}
			for (@Pc(116) int local116 = local60; local116 != local56; local116 += local54) {
				@Pc(124) int local124 = local90[local116] >> 4;
				if (local124 > 255) {
					local124 = 255;
				}
				if (local124 < 0) {
					local124 = 0;
				}
				@Pc(141) int local141 = local94[local116] >> 4;
				if (local141 > 255) {
					local141 = 255;
				}
				if (local141 < 0) {
					local141 = 0;
				}
				@Pc(158) int local158 = local92[local116] >> 4;
				if (local158 > 255) {
					local158 = 255;
				}
				local124 = Static226.anIntArray482[local124];
				if (local158 < 0) {
					local158 = 0;
				}
				local141 = Static226.anIntArray482[local141];
				local158 = Static226.anIntArray482[local158];
				@Pc(192) int local192 = local158 + (local141 << 8) + (local124 << 16);
				if (local192 != 0) {
					local192 |= 0xFF000000;
				}
				local50[local70++] = local192;
				if (arg5) {
					local70 += arg3 - 1;
				}
			}
		}
		for (@Pc(235) int local235 = 0; local235 < this.aClass6_Sub1Array3.length; local235++) {
			this.aClass6_Sub1Array3[local235].method5613();
		}
		return local50;
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(Lclient!cj;Lclient!dp;I)Z")
	public boolean method123(@OriginalArg(0) Interface2 arg0, @OriginalArg(1) Class53 arg1) {
		@Pc(9) int local9;
		if (Static256.anInt4740 > 0) {
			for (local9 = 0; local9 < this.anIntArray11.length; local9++) {
				if (!arg1.method1036(Static256.anInt4740, this.anIntArray11[local9])) {
					return false;
				}
			}
		} else {
			for (local9 = 0; local9 < this.anIntArray11.length; local9++) {
				if (!arg1.method1026(this.anIntArray11[local9])) {
					return false;
				}
			}
		}
		for (local9 = 0; local9 < this.anIntArray10.length; local9++) {
			if (!arg0.method349(this.anIntArray10[local9])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(ILclient!cj;ILclient!dp;DZB)[I")
	public int[] method126(@OriginalArg(0) int arg0, @OriginalArg(1) Interface2 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class53 arg3, @OriginalArg(4) double arg4, @OriginalArg(5) boolean arg5) {
		Static39.aClass53_29 = arg3;
		Static137.anInterface2_3 = arg1;
		for (@Pc(19) int local19 = 0; local19 < this.aClass6_Sub1Array3.length; local19++) {
			this.aClass6_Sub1Array3[local19].method5606(arg2, arg0);
		}
		Static316.method5302(arg4);
		Static117.method2381(arg0, arg2);
		@Pc(53) int[] local53 = new int[arg2 * 4 * arg0];
		@Pc(55) int local55 = 0;
		for (@Pc(57) int local57 = 0; local57 < arg0; local57++) {
			@Pc(73) int[] local73;
			@Pc(81) int[] local81;
			@Pc(77) int[] local77;
			@Pc(89) int[] local89;
			if (this.aClass6_Sub1_1.aBoolean411) {
				local89 = this.aClass6_Sub1_1.method5616(local57);
				local73 = local89;
				local81 = local89;
				local77 = local89;
			} else {
				@Pc(69) int[][] local69 = this.aClass6_Sub1_1.method5608(local57);
				local73 = local69[0];
				local77 = local69[2];
				local81 = local69[1];
			}
			if (this.aClass6_Sub1_2.aBoolean411) {
				local89 = this.aClass6_Sub1_2.method5616(local57);
			} else {
				local89 = this.aClass6_Sub1_2.method5608(local57)[0];
			}
			if (arg5) {
				local55 = local57;
			}
			for (@Pc(123) int local123 = arg2 - 1; local123 >= 0; local123--) {
				@Pc(131) int local131 = local73[local123] >> 4;
				if (local131 > 255) {
					local131 = 255;
				}
				if (local131 < 0) {
					local131 = 0;
				}
				@Pc(149) int local149 = local81[local123] >> 4;
				if (local149 > 255) {
					local149 = 255;
				}
				if (local149 < 0) {
					local149 = 0;
				}
				@Pc(166) int local166 = local77[local123] >> 4;
				if (local166 > 255) {
					local166 = 255;
				}
				if (local166 < 0) {
					local166 = 0;
				}
				local131 = Static226.anIntArray482[local131];
				local149 = Static226.anIntArray482[local149];
				local166 = Static226.anIntArray482[local166];
				@Pc(203) int local203;
				if (local131 == 0 && local149 == 0 && local166 == 0) {
					local203 = 0;
				} else {
					local203 = local89[local123] >> 4;
					if (local203 > 255) {
						local203 = 255;
					}
					if (local203 < 0) {
						local203 = 0;
					}
				}
				local53[local55++] = (local131 << 16) + ((local203 << 24) - (-(local149 << 8) - local166));
				if (arg5) {
					local55 += arg2 - 1;
				}
			}
		}
		for (@Pc(255) int local255 = 0; local255 < this.aClass6_Sub1Array3.length; local255++) {
			this.aClass6_Sub1Array3[local255].method5613();
		}
		return local53;
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(Lclient!cj;IZLclient!dp;BI)[F")
	public float[] method130(@OriginalArg(0) Interface2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class53 arg3, @OriginalArg(5) int arg4) {
		Static39.aClass53_29 = arg3;
		Static137.anInterface2_3 = arg0;
		for (@Pc(11) int local11 = 0; local11 < this.aClass6_Sub1Array3.length; local11++) {
			this.aClass6_Sub1Array3[local11].method5606(arg1, arg4);
		}
		Static117.method2381(arg4, arg1);
		@Pc(42) float[] local42 = new float[arg1 * 4 * arg4];
		@Pc(44) int local44 = 0;
		for (@Pc(46) int local46 = 0; local46 < arg4; local46++) {
			@Pc(60) int[] local60;
			@Pc(62) int[] local62;
			@Pc(64) int[] local64;
			if (this.aClass6_Sub1_1.aBoolean411) {
				@Pc(58) int[] local58 = this.aClass6_Sub1_1.method5616(local46);
				local60 = local58;
				local62 = local58;
				local64 = local58;
			} else {
				@Pc(72) int[][] local72 = this.aClass6_Sub1_1.method5608(local46);
				local62 = local72[1];
				local60 = local72[0];
				local64 = local72[2];
			}
			@Pc(94) int[] local94;
			if (this.aClass6_Sub1_2.aBoolean411) {
				local94 = this.aClass6_Sub1_2.method5616(local46);
			} else {
				local94 = this.aClass6_Sub1_2.method5608(local46)[0];
			}
			if (arg2) {
				local44 = local46 << 2;
			}
			@Pc(122) int[] local122;
			if (this.aClass6_Sub1_3.aBoolean411) {
				local122 = this.aClass6_Sub1_3.method5616(local46);
			} else {
				local122 = this.aClass6_Sub1_3.method5608(local46)[0];
			}
			for (@Pc(134) int local134 = arg1 - 1; local134 >= 0; local134--) {
				@Pc(143) float local143 = (float) local94[local134] / 4096.0F;
				if (local143 < 0.0F) {
					local143 = 0.0F;
				} else if (local143 > 1.0F) {
					local143 = 1.0F;
				}
				@Pc(170) float local170 = ((float) local122[local134] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
				local42[local44++] = (float) local60[local134] * local170;
				local42[local44++] = (float) local62[local134] * local170;
				local42[local44++] = local170 * (float) local64[local134];
				local42[local44++] = local143;
				if (arg2) {
					local44 += (arg1 << 2) - 4;
				}
			}
		}
		for (@Pc(231) int local231 = 0; local231 < this.aClass6_Sub1Array3.length; local231++) {
			this.aClass6_Sub1Array3[local231].method5613();
		}
		return local42;
	}
}
