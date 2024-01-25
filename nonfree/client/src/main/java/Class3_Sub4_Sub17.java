import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lg")
public final class Class3_Sub4_Sub17 extends Class3_Sub4 {

	@OriginalMember(owner = "client!lg", name = "t", descriptor = "[I")
	private final int[] anIntArray334;

	@OriginalMember(owner = "client!lg", name = "z", descriptor = "[I")
	private final int[] anIntArray335;

	@OriginalMember(owner = "client!lg", name = "y", descriptor = "Lclient!ih;")
	private final Class3_Sub2 aClass3_Sub2_1;

	@OriginalMember(owner = "client!lg", name = "B", descriptor = "Lclient!ih;")
	private final Class3_Sub2 aClass3_Sub2_3;

	@OriginalMember(owner = "client!lg", name = "A", descriptor = "Lclient!ih;")
	private final Class3_Sub2 aClass3_Sub2_2;

	@OriginalMember(owner = "client!lg", name = "r", descriptor = "[Lclient!ih;")
	private final Class3_Sub2[] aClass3_Sub2Array17;

	@OriginalMember(owner = "client!lg", name = "<init>", descriptor = "()V")
	private Class3_Sub4_Sub17() {
		this.anIntArray334 = new int[0];
		this.anIntArray335 = new int[0];
		this.aClass3_Sub2_1 = new Class3_Sub2_Sub16(0);
		this.aClass3_Sub2_1.anInt10030 = 1;
		this.aClass3_Sub2_3 = new Class3_Sub2_Sub16();
		this.aClass3_Sub2_3.anInt10030 = 1;
		this.aClass3_Sub2_2 = new Class3_Sub2_Sub16();
		this.aClass3_Sub2Array17 = new Class3_Sub2[] { this.aClass3_Sub2_3, this.aClass3_Sub2_2, this.aClass3_Sub2_1 };
		this.aClass3_Sub2_2.anInt10030 = 1;
	}

	@OriginalMember(owner = "client!lg", name = "<init>", descriptor = "(Lclient!sl;)V")
	public Class3_Sub4_Sub17(@OriginalArg(0) Class3_Sub3 arg0) {
		@Pc(7) int local7 = arg0.method4225();
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		@Pc(14) int[][] local14 = new int[local7][];
		this.aClass3_Sub2Array17 = new Class3_Sub2[local7];
		@Pc(53) int local53;
		for (@Pc(20) int local20 = 0; local20 < local7; local20++) {
			@Pc(26) Class3_Sub2 local26 = Static377.method6076(arg0);
			if (local26.method8599() >= 0) {
				local9++;
			}
			if (local26.method8597() >= 0) {
				local11++;
			}
			@Pc(46) int local46 = local26.aClass3_Sub2Array42.length;
			local14[local20] = new int[local46];
			for (local53 = 0; local53 < local46; local53++) {
				local14[local20][local53] = arg0.method4225();
			}
			this.aClass3_Sub2Array17[local20] = local26;
		}
		this.anIntArray335 = new int[local9];
		this.anIntArray334 = new int[local11];
		local9 = 0;
		local11 = 0;
		for (@Pc(90) int local90 = 0; local90 < local7; local90++) {
			@Pc(97) Class3_Sub2 local97 = this.aClass3_Sub2Array17[local90];
			local53 = local97.aClass3_Sub2Array42.length;
			for (@Pc(103) int local103 = 0; local103 < local53; local103++) {
				local97.aClass3_Sub2Array42[local103] = this.aClass3_Sub2Array17[local14[local90][local103]];
			}
			@Pc(125) int local125 = local97.method8599();
			@Pc(129) int local129 = local97.method8597();
			if (local125 > 0) {
				this.anIntArray335[local9++] = local125;
			}
			if (local129 > 0) {
				this.anIntArray334[local11++] = local129;
			}
			local14[local90] = null;
		}
		this.aClass3_Sub2_3 = this.aClass3_Sub2Array17[arg0.method4225()];
		this.aClass3_Sub2_2 = this.aClass3_Sub2Array17[arg0.method4225()];
		this.aClass3_Sub2_1 = this.aClass3_Sub2Array17[arg0.method4225()];
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(IIDZLclient!d;Lclient!la;Z)[I")
	public int[] method5208(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) double arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Interface7 arg4, @OriginalArg(5) Class196 arg5) {
		Static628.anInterface7_9 = arg4;
		Static599.aClass196_126 = arg5;
		for (@Pc(17) int local17 = 0; local17 < this.aClass3_Sub2Array17.length; local17++) {
			this.aClass3_Sub2Array17[local17].method8596(arg0, arg1);
		}
		Static475.method7130(arg2);
		Static55.method1569(arg1, arg0);
		@Pc(49) int[] local49 = new int[arg1 * arg0];
		@Pc(51) int local51 = 0;
		for (@Pc(53) int local53 = 0; local53 < arg0; local53++) {
			@Pc(69) int[] local69;
			@Pc(77) int[] local77;
			@Pc(73) int[] local73;
			@Pc(85) int[] local85;
			if (this.aClass3_Sub2_3.aBoolean720) {
				local85 = this.aClass3_Sub2_3.method8594(local53);
				local69 = local85;
				local77 = local85;
				local73 = local85;
			} else {
				@Pc(65) int[][] local65 = this.aClass3_Sub2_3.method8604(local53);
				local69 = local65[0];
				local73 = local65[2];
				local77 = local65[1];
			}
			if (arg3) {
				local51 = local53;
			}
			if (this.aClass3_Sub2_2.aBoolean720) {
				local85 = this.aClass3_Sub2_2.method8594(local53);
			} else {
				local85 = this.aClass3_Sub2_2.method8604(local53)[0];
			}
			for (@Pc(119) int local119 = arg1 - 1; local119 >= 0; local119--) {
				@Pc(127) int local127 = local69[local119] >> 4;
				if (local127 > 255) {
					local127 = 255;
				}
				if (local127 < 0) {
					local127 = 0;
				}
				@Pc(142) int local142 = local77[local119] >> 4;
				if (local142 > 255) {
					local142 = 255;
				}
				if (local142 < 0) {
					local142 = 0;
				}
				@Pc(159) int local159 = local73[local119] >> 4;
				if (local159 > 255) {
					local159 = 255;
				}
				local142 = Static281.anIntArray554[local142];
				if (local159 < 0) {
					local159 = 0;
				}
				local127 = Static281.anIntArray554[local127];
				local159 = Static281.anIntArray554[local159];
				@Pc(198) int local198;
				if (local127 == 0 && local142 == 0 && local159 == 0) {
					local198 = 0;
				} else {
					local198 = local85[local119] >> 4;
					if (local198 > 255) {
						local198 = 255;
					}
					if (local198 < 0) {
						local198 = 0;
					}
				}
				local49[local51++] = local159 + (local127 << 16) + (local198 << 24) + (local142 << 8);
				if (arg3) {
					local51 += arg1 - 1;
				}
			}
		}
		for (@Pc(249) int local249 = 0; local249 < this.aClass3_Sub2Array17.length; local249++) {
			this.aClass3_Sub2Array17[local249].method8605();
		}
		return local49;
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(BLclient!d;ZDZLclient!la;II)[I")
	public int[] method5209(@OriginalArg(1) Interface7 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) double arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) Class196 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		Static628.anInterface7_9 = arg0;
		Static599.aClass196_126 = arg4;
		for (@Pc(11) int local11 = 0; local11 < this.aClass3_Sub2Array17.length; local11++) {
			this.aClass3_Sub2Array17[local11].method8596(arg6, arg5);
		}
		Static475.method7130(arg2);
		Static55.method1569(arg5, arg6);
		@Pc(43) int[] local43 = new int[arg6 * arg5];
		@Pc(57) int local57;
		@Pc(53) int local53;
		@Pc(55) byte local55;
		if (arg3) {
			local57 = arg5 - 1;
			local55 = -1;
			local53 = -1;
		} else {
			local53 = arg5;
			local55 = 1;
			local57 = 0;
		}
		@Pc(69) int local69 = 0;
		for (@Pc(71) int local71 = 0; local71 < arg6; local71++) {
			@Pc(91) int[] local91;
			@Pc(87) int[] local87;
			@Pc(95) int[] local95;
			if (this.aClass3_Sub2_3.aBoolean720) {
				@Pc(103) int[] local103 = this.aClass3_Sub2_3.method8594(local71);
				local87 = local103;
				local91 = local103;
				local95 = local103;
			} else {
				@Pc(83) int[][] local83 = this.aClass3_Sub2_3.method8604(local71);
				local87 = local83[1];
				local91 = local83[0];
				local95 = local83[2];
			}
			if (arg1) {
				local69 = local71;
			}
			for (@Pc(115) int local115 = local57; local115 != local53; local115 += local55) {
				@Pc(123) int local123 = local91[local115] >> 4;
				if (local123 > 255) {
					local123 = 255;
				}
				if (local123 < 0) {
					local123 = 0;
				}
				@Pc(140) int local140 = local87[local115] >> 4;
				if (local140 > 255) {
					local140 = 255;
				}
				if (local140 < 0) {
					local140 = 0;
				}
				@Pc(158) int local158 = local95[local115] >> 4;
				if (local158 > 255) {
					local158 = 255;
				}
				if (local158 < 0) {
					local158 = 0;
				}
				local123 = Static281.anIntArray554[local123];
				local140 = Static281.anIntArray554[local140];
				local158 = Static281.anIntArray554[local158];
				@Pc(194) int local194 = local158 + (local140 << 8) + (local123 << 16);
				if (local194 != 0) {
					local194 |= 0xFF000000;
				}
				local43[local69++] = local194;
				if (arg1) {
					local69 += arg5 - 1;
				}
			}
		}
		for (@Pc(234) int local234 = 0; local234 < this.aClass3_Sub2Array17.length; local234++) {
			this.aClass3_Sub2Array17[local234].method8605();
		}
		return local43;
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(IIILclient!d;Lclient!la;Z)[F")
	public float[] method5210(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Interface7 arg2, @OriginalArg(4) Class196 arg3, @OriginalArg(5) boolean arg4) {
		Static628.anInterface7_9 = arg2;
		Static599.aClass196_126 = arg3;
		for (@Pc(11) int local11 = 0; local11 < this.aClass3_Sub2Array17.length; local11++) {
			this.aClass3_Sub2Array17[local11].method8596(arg1, arg0);
		}
		Static55.method1569(arg0, arg1);
		@Pc(42) float[] local42 = new float[arg0 * arg1 * 4];
		@Pc(44) int local44 = 0;
		for (@Pc(46) int local46 = 0; local46 < arg1; local46++) {
			@Pc(66) int[] local66;
			@Pc(62) int[] local62;
			@Pc(70) int[] local70;
			if (this.aClass3_Sub2_3.aBoolean720) {
				@Pc(78) int[] local78 = this.aClass3_Sub2_3.method8594(local46);
				local66 = local78;
				local70 = local78;
				local62 = local78;
			} else {
				@Pc(58) int[][] local58 = this.aClass3_Sub2_3.method8604(local46);
				local62 = local58[1];
				local66 = local58[0];
				local70 = local58[2];
			}
			@Pc(98) int[] local98;
			if (this.aClass3_Sub2_2.aBoolean720) {
				local98 = this.aClass3_Sub2_2.method8594(local46);
			} else {
				local98 = this.aClass3_Sub2_2.method8604(local46)[0];
			}
			@Pc(118) int[] local118;
			if (this.aClass3_Sub2_1.aBoolean720) {
				local118 = this.aClass3_Sub2_1.method8594(local46);
			} else {
				local118 = this.aClass3_Sub2_1.method8604(local46)[0];
			}
			if (arg4) {
				local44 = local46 << 2;
			}
			for (@Pc(136) int local136 = arg0 - 1; local136 >= 0; local136--) {
				@Pc(145) float local145 = (float) local98[local136] / 4096.0F;
				@Pc(158) float local158 = ((float) local118[local136] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
				if (local145 < 0.0F) {
					local145 = 0.0F;
				} else if (local145 > 1.0F) {
					local145 = 1.0F;
				}
				local42[local44++] = (float) local66[local136] * local158;
				local42[local44++] = (float) local62[local136] * local158;
				local42[local44++] = (float) local70[local136] * local158;
				local42[local44++] = local145;
				if (arg4) {
					local44 += (arg0 << 2) - 4;
				}
			}
		}
		for (@Pc(233) int local233 = 0; local233 < this.aClass3_Sub2Array17.length; local233++) {
			this.aClass3_Sub2Array17[local233].method8605();
		}
		return local42;
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(Lclient!la;ILclient!d;)Z")
	public boolean method5212(@OriginalArg(0) Class196 arg0, @OriginalArg(2) Interface7 arg1) {
		@Pc(17) int local17;
		if (Static156.anInt5060 >= 0) {
			for (local17 = 0; local17 < this.anIntArray335.length; local17++) {
				if (!arg0.method5115(this.anIntArray335[local17], Static156.anInt5060)) {
					return false;
				}
			}
		} else {
			for (local17 = 0; local17 < this.anIntArray335.length; local17++) {
				if (!arg0.method5111(this.anIntArray335[local17])) {
					return false;
				}
			}
		}
		for (local17 = 0; local17 < this.anIntArray334.length; local17++) {
			if (!arg1.method8115(this.anIntArray334[local17])) {
				return false;
			}
		}
		return true;
	}
}
