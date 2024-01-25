import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jf")
public final class Class3_Sub10_Sub8 extends Class3_Sub10 {

	@OriginalMember(owner = "client!jf", name = "C", descriptor = "[I")
	private final int[] anIntArray432;

	@OriginalMember(owner = "client!jf", name = "r", descriptor = "[I")
	private final int[] anIntArray431;

	@OriginalMember(owner = "client!jf", name = "A", descriptor = "Lclient!uh;")
	private final Class3_Sub1 aClass3_Sub1_3;

	@OriginalMember(owner = "client!jf", name = "s", descriptor = "Lclient!uh;")
	private final Class3_Sub1 aClass3_Sub1_1;

	@OriginalMember(owner = "client!jf", name = "y", descriptor = "Lclient!uh;")
	private final Class3_Sub1 aClass3_Sub1_2;

	@OriginalMember(owner = "client!jf", name = "u", descriptor = "[Lclient!uh;")
	private final Class3_Sub1[] aClass3_Sub1Array21;

	@OriginalMember(owner = "client!jf", name = "<init>", descriptor = "()V")
	private Class3_Sub10_Sub8() {
		this.anIntArray432 = new int[0];
		this.anIntArray431 = new int[0];
		this.aClass3_Sub1_3 = new Class3_Sub1_Sub7(0);
		this.aClass3_Sub1_3.anInt9423 = 1;
		this.aClass3_Sub1_1 = new Class3_Sub1_Sub7();
		this.aClass3_Sub1_1.anInt9423 = 1;
		this.aClass3_Sub1_2 = new Class3_Sub1_Sub7();
		this.aClass3_Sub1_2.anInt9423 = 1;
		this.aClass3_Sub1Array21 = new Class3_Sub1[] { this.aClass3_Sub1_1, this.aClass3_Sub1_2, this.aClass3_Sub1_3 };
	}

	@OriginalMember(owner = "client!jf", name = "<init>", descriptor = "(Lclient!rt;)V")
	public Class3_Sub10_Sub8(@OriginalArg(0) Class3_Sub27 arg0) {
		@Pc(7) int local7 = arg0.method7548();
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		@Pc(14) int[][] local14 = new int[local7][];
		this.aClass3_Sub1Array21 = new Class3_Sub1[local7];
		@Pc(50) int local50;
		for (@Pc(20) int local20 = 0; local20 < local7; local20++) {
			@Pc(26) Class3_Sub1 local26 = Static272.method4735(arg0);
			if (local26.method7787() >= 0) {
				local9++;
			}
			if (local26.method7785() >= 0) {
				local11++;
			}
			@Pc(43) int local43 = local26.aClass3_Sub1Array42.length;
			local14[local20] = new int[local43];
			for (local50 = 0; local50 < local43; local50++) {
				local14[local20][local50] = arg0.method7548();
			}
			this.aClass3_Sub1Array21[local20] = local26;
		}
		this.anIntArray431 = new int[local9];
		this.anIntArray432 = new int[local11];
		local9 = 0;
		local11 = 0;
		for (@Pc(87) int local87 = 0; local87 < local7; local87++) {
			@Pc(94) Class3_Sub1 local94 = this.aClass3_Sub1Array21[local87];
			local50 = local94.aClass3_Sub1Array42.length;
			for (@Pc(100) int local100 = 0; local100 < local50; local100++) {
				local94.aClass3_Sub1Array42[local100] = this.aClass3_Sub1Array21[local14[local87][local100]];
			}
			@Pc(122) int local122 = local94.method7787();
			@Pc(126) int local126 = local94.method7785();
			if (local122 > 0) {
				this.anIntArray431[local9++] = local122;
			}
			if (local126 > 0) {
				this.anIntArray432[local11++] = local126;
			}
			local14[local87] = null;
		}
		this.aClass3_Sub1_1 = this.aClass3_Sub1Array21[arg0.method7548()];
		this.aClass3_Sub1_2 = this.aClass3_Sub1Array21[arg0.method7548()];
		this.aClass3_Sub1_3 = this.aClass3_Sub1Array21[arg0.method7548()];
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIIZLclient!e;Lclient!kea;)[F")
	public float[] method4037(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) Interface4 arg3, @OriginalArg(5) Class161 arg4) {
		Static180.anInterface4_8 = arg3;
		Static400.aClass161_90 = arg4;
		for (@Pc(18) int local18 = 0; local18 < this.aClass3_Sub1Array21.length; local18++) {
			this.aClass3_Sub1Array21[local18].method7790(arg1, arg0);
		}
		Static166.method5704(arg0, arg1);
		@Pc(51) float[] local51 = new float[arg0 * arg1 * 4];
		@Pc(53) int local53 = 0;
		for (@Pc(55) int local55 = 0; local55 < arg1; local55++) {
			@Pc(73) int[] local73;
			@Pc(69) int[] local69;
			@Pc(71) int[] local71;
			if (this.aClass3_Sub1_1.aBoolean687) {
				@Pc(67) int[] local67 = this.aClass3_Sub1_1.method7784(local55);
				local69 = local67;
				local71 = local67;
				local73 = local67;
			} else {
				@Pc(81) int[][] local81 = this.aClass3_Sub1_1.method7781(local55);
				local71 = local81[2];
				local69 = local81[1];
				local73 = local81[0];
			}
			@Pc(105) int[] local105;
			if (this.aClass3_Sub1_2.aBoolean687) {
				local105 = this.aClass3_Sub1_2.method7784(local55);
			} else {
				local105 = this.aClass3_Sub1_2.method7781(local55)[0];
			}
			@Pc(123) int[] local123;
			if (this.aClass3_Sub1_3.aBoolean687) {
				local123 = this.aClass3_Sub1_3.method7784(local55);
			} else {
				local123 = this.aClass3_Sub1_3.method7781(local55)[0];
			}
			if (arg2) {
				local53 = local55 << 2;
			}
			for (@Pc(143) int local143 = arg0 - 1; local143 >= 0; local143--) {
				@Pc(152) float local152 = (float) local105[local143] / 4096.0F;
				if (local152 < 0.0F) {
					local152 = 0.0F;
				} else if (local152 > 1.0F) {
					local152 = 1.0F;
				}
				@Pc(179) float local179 = ((float) local123[local143] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
				local51[local53++] = (float) local73[local143] * local179;
				local51[local53++] = local179 * (float) local69[local143];
				local51[local53++] = local179 * (float) local71[local143];
				local51[local53++] = local152;
				if (arg2) {
					local53 += (arg0 << 2) - 4;
				}
			}
		}
		for (@Pc(237) int local237 = 0; local237 < this.aClass3_Sub1Array21.length; local237++) {
			this.aClass3_Sub1Array21[local237].method7780();
		}
		return local51;
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(DLclient!e;Lclient!kea;ZIIIZ)[I")
	public int[] method4038(@OriginalArg(0) double arg0, @OriginalArg(1) Interface4 arg1, @OriginalArg(2) Class161 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) boolean arg6) {
		Static400.aClass161_90 = arg2;
		Static180.anInterface4_8 = arg1;
		for (@Pc(16) int local16 = 0; local16 < this.aClass3_Sub1Array21.length; local16++) {
			this.aClass3_Sub1Array21[local16].method7790(arg4, arg5);
		}
		Static274.method4753(arg0);
		Static166.method5704(arg5, arg4);
		@Pc(50) int[] local50 = new int[arg4 * arg5];
		@Pc(54) int local54;
		@Pc(56) int local56;
		@Pc(58) byte local58;
		if (arg3) {
			local56 = -1;
			local58 = -1;
			local54 = arg5 - 1;
		} else {
			local54 = 0;
			local56 = arg5;
			local58 = 1;
		}
		@Pc(70) int local70 = 0;
		for (@Pc(72) int local72 = 0; local72 < arg4; local72++) {
			@Pc(96) int[] local96;
			@Pc(92) int[] local92;
			@Pc(88) int[] local88;
			if (this.aClass3_Sub1_1.aBoolean687) {
				@Pc(104) int[] local104 = this.aClass3_Sub1_1.method7784(local72);
				local88 = local104;
				local96 = local104;
				local92 = local104;
			} else {
				@Pc(84) int[][] local84 = this.aClass3_Sub1_1.method7781(local72);
				local88 = local84[2];
				local92 = local84[1];
				local96 = local84[0];
			}
			if (arg6) {
				local70 = local72;
			}
			for (@Pc(116) int local116 = local54; local116 != local56; local116 += local58) {
				@Pc(124) int local124 = local96[local116] >> 4;
				if (local124 > 255) {
					local124 = 255;
				}
				if (local124 < 0) {
					local124 = 0;
				}
				@Pc(139) int local139 = local92[local116] >> 4;
				if (local139 > 255) {
					local139 = 255;
				}
				if (local139 < 0) {
					local139 = 0;
				}
				@Pc(154) int local154 = local88[local116] >> 4;
				if (local154 > 255) {
					local154 = 255;
				}
				if (local154 < 0) {
					local154 = 0;
				}
				local124 = Static375.anIntArray625[local124];
				local139 = Static375.anIntArray625[local139];
				local154 = Static375.anIntArray625[local154];
				@Pc(191) int local191 = local154 + (local124 << 16) + (local139 << 8);
				if (local191 != 0) {
					local191 |= 0xFF000000;
				}
				local50[local70++] = local191;
				if (arg6) {
					local70 += arg5 - 1;
				}
			}
		}
		for (@Pc(231) int local231 = 0; local231 < this.aClass3_Sub1Array21.length; local231++) {
			this.aClass3_Sub1Array21[local231].method7780();
		}
		return local50;
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(ILclient!e;ZDZILclient!kea;)[I")
	public int[] method4039(@OriginalArg(0) int arg0, @OriginalArg(1) Interface4 arg1, @OriginalArg(3) double arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class161 arg5) {
		Static180.anInterface4_8 = arg1;
		Static400.aClass161_90 = arg5;
		for (@Pc(11) int local11 = 0; local11 < this.aClass3_Sub1Array21.length; local11++) {
			this.aClass3_Sub1Array21[local11].method7790(arg4, arg0);
		}
		Static274.method4753(arg2);
		Static166.method5704(arg0, arg4);
		@Pc(45) int[] local45 = new int[arg4 * 4 * arg0];
		@Pc(47) int local47 = 0;
		for (@Pc(49) int local49 = 0; local49 < arg4; local49++) {
			@Pc(67) int[] local67;
			@Pc(63) int[] local63;
			@Pc(65) int[] local65;
			@Pc(61) int[] local61;
			if (this.aClass3_Sub1_1.aBoolean687) {
				local61 = this.aClass3_Sub1_1.method7784(local49);
				local63 = local61;
				local65 = local61;
				local67 = local61;
			} else {
				@Pc(75) int[][] local75 = this.aClass3_Sub1_1.method7781(local49);
				local63 = local75[1];
				local65 = local75[2];
				local67 = local75[0];
			}
			if (this.aClass3_Sub1_2.aBoolean687) {
				local61 = this.aClass3_Sub1_2.method7784(local49);
			} else {
				local61 = this.aClass3_Sub1_2.method7781(local49)[0];
			}
			if (arg3) {
				local47 = local49;
			}
			for (@Pc(119) int local119 = arg0 - 1; local119 >= 0; local119--) {
				@Pc(127) int local127 = local67[local119] >> 4;
				if (local127 > 255) {
					local127 = 255;
				}
				if (local127 < 0) {
					local127 = 0;
				}
				@Pc(147) int local147 = local63[local119] >> 4;
				if (local147 > 255) {
					local147 = 255;
				}
				if (local147 < 0) {
					local147 = 0;
				}
				@Pc(164) int local164 = local65[local119] >> 4;
				if (local164 > 255) {
					local164 = 255;
				}
				local127 = Static375.anIntArray625[local127];
				local147 = Static375.anIntArray625[local147];
				if (local164 < 0) {
					local164 = 0;
				}
				local164 = Static375.anIntArray625[local164];
				@Pc(198) int local198;
				if (local127 == 0 && local147 == 0 && local164 == 0) {
					local198 = 0;
				} else {
					local198 = local61[local119] >> 4;
					if (local198 > 255) {
						local198 = 255;
					}
					if (local198 < 0) {
						local198 = 0;
					}
				}
				local45[local47++] = local164 + (local198 << 24) + (local127 << 16) + (local147 << 8);
				if (arg3) {
					local47 += arg0 - 1;
				}
			}
		}
		for (@Pc(258) int local258 = 0; local258 < this.aClass3_Sub1Array21.length; local258++) {
			this.aClass3_Sub1Array21[local258].method7780();
		}
		return local45;
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(Lclient!e;BLclient!kea;)Z")
	public boolean method4041(@OriginalArg(0) Interface4 arg0, @OriginalArg(2) Class161 arg1) {
		@Pc(25) int local25;
		if (Static488.anInt8707 >= 0) {
			for (local25 = 0; local25 < this.anIntArray431.length; local25++) {
				if (!arg1.method4241(Static488.anInt8707, this.anIntArray431[local25])) {
					return false;
				}
			}
		} else {
			for (local25 = 0; local25 < this.anIntArray431.length; local25++) {
				if (!arg1.method4268(this.anIntArray431[local25])) {
					return false;
				}
			}
		}
		for (local25 = 0; local25 < this.anIntArray432.length; local25++) {
			if (!arg0.method6708(this.anIntArray432[local25])) {
				return false;
			}
		}
		return true;
	}
}
