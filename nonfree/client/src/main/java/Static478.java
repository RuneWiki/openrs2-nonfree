import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static478 {

	@OriginalMember(owner = "client!qc", name = "q", descriptor = "I")
	public static int anInt7943;

	@OriginalMember(owner = "client!qc", name = "u", descriptor = "Lclient!mga;")
	public static final Class218 aClass218_119 = new Class218(5, 4);

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "(I)V")
	public static void method6965() {
		Static394.aBoolean445 = true;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIILclient!bh;II)V")
	public static void method6969(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class3_Sub8 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg2.anInt945 == -1 && arg2.anIntArray80 == null) {
			return;
		}
		@Pc(15) int local15 = 0;
		@Pc(30) int local30 = arg2.anInt946 * Static24.aClass3_Sub22_4.aClass6_Sub28_2.method8690() >> 8;
		if (arg0 > arg2.anInt950) {
			local15 = arg0 - arg2.anInt950;
		} else if (arg0 < arg2.anInt964) {
			local15 = arg2.anInt964 - arg0;
		}
		if (arg4 > arg2.anInt947) {
			local15 += arg4 - arg2.anInt947;
		} else if (arg2.anInt955 > arg4) {
			local15 += arg2.anInt955 - arg4;
		}
		if (arg2.anInt959 == 0 || arg2.anInt959 < local15 - 256 || Static24.aClass3_Sub22_4.aClass6_Sub28_2.method8690() == 0 || arg3 != arg2.anInt960) {
			if (arg2.aClass3_Sub1_Sub1_1 != null) {
				Static313.aClass3_Sub1_Sub2_1.method931(arg2.aClass3_Sub1_Sub1_1);
				arg2.aClass3_Sub35_Sub1_1 = null;
				arg2.aClass3_Sub41_1 = null;
				arg2.aClass3_Sub1_Sub1_1 = null;
			}
			if (arg2.aClass3_Sub1_Sub1_2 != null) {
				Static313.aClass3_Sub1_Sub2_1.method931(arg2.aClass3_Sub1_Sub1_2);
				arg2.aClass3_Sub41_2 = null;
				arg2.aClass3_Sub1_Sub1_2 = null;
				arg2.aClass3_Sub35_Sub1_2 = null;
			}
			return;
		}
		local15 -= 256;
		if (local15 < 0) {
			local15 = 0;
		}
		@Pc(157) int local157 = arg2.anInt959 - arg2.anInt953;
		if (local157 < 0) {
			local157 = arg2.anInt959;
		}
		@Pc(167) int local167 = local30;
		@Pc(173) int local173 = local15 - arg2.anInt953;
		if (local173 > 0 && local157 > 0) {
			local167 = local30 * (local157 - local173) / local157;
		}
		Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2.method9314();
		@Pc(191) int local191 = 8192;
		@Pc(201) int local201 = (arg2.anInt964 + arg2.anInt950) / 2 - arg0;
		@Pc(212) int local212 = (arg2.anInt947 + arg2.anInt955) / 2 - arg4;
		@Pc(233) int local233;
		@Pc(245) int local245;
		if (local201 != 0 || local212 != 0) {
			local233 = -Static57.anInt1188 - (int) (Math.atan2((double) local201, (double) local212) * 2607.5945876176133D) - 4096 & 0x3FFF;
			if (local233 > 8192) {
				local233 = 16384 - local233;
			}
			if (local15 <= 0) {
				local245 = 8192;
			} else if (local15 < 4096) {
				local245 = local15 * 8192 / 4096 + 8192;
			} else {
				local245 = 16384;
			}
			local191 = local233 * local245 / 8192 + (16384 - local245 >> 1);
		}
		@Pc(342) Class3_Sub1_Sub1 local342;
		if (arg2.aClass3_Sub1_Sub1_1 != null) {
			arg2.aClass3_Sub1_Sub1_1.method96(local167);
			arg2.aClass3_Sub1_Sub1_1.method101(local191);
		} else if (arg2.anInt945 >= 0) {
			local233 = arg2.anInt956 == 256 && arg2.anInt954 == 256 ? 256 : Static665.method9178(arg2.anInt954, arg2.anInt956);
			if (arg2.aBoolean68) {
				if (arg2.aClass3_Sub41_1 == null) {
					arg2.aClass3_Sub41_1 = Static377.method5457(Static387.aClass15_101, arg2.anInt945);
				}
				if (arg2.aClass3_Sub41_1 != null) {
					if (arg2.aClass3_Sub35_Sub1_1 == null) {
						arg2.aClass3_Sub35_Sub1_1 = arg2.aClass3_Sub41_1.method5460(new int[] { 22050 });
					}
					if (arg2.aClass3_Sub35_Sub1_1 != null) {
						local342 = Static679.method67(arg2.aClass3_Sub35_Sub1_1, local233, local167 << 6, local191);
						local342.method100(-1);
						Static313.aClass3_Sub1_Sub2_1.method934(local342);
						arg2.aClass3_Sub1_Sub1_1 = local342;
					}
				}
			} else {
				@Pc(359) Class209 local359 = Static683.method5274(Static550.aClass15_138, arg2.anInt945, 0);
				if (local359 != null) {
					@Pc(366) Class3_Sub35_Sub1 local366 = local359.method5277().method4937(Static36.aClass225_1);
					@Pc(374) Class3_Sub1_Sub1 local374 = Static679.method67(local366, local233, local167 << 6, local191);
					local374.method100(-1);
					Static313.aClass3_Sub1_Sub2_1.method934(local374);
					arg2.aClass3_Sub1_Sub1_1 = local374;
				}
			}
		}
		if (arg2.aClass3_Sub1_Sub1_2 != null) {
			arg2.aClass3_Sub1_Sub1_2.method96(local167);
			arg2.aClass3_Sub1_Sub1_2.method101(local191);
			if (arg2.aClass3_Sub1_Sub1_2.method9378()) {
				return;
			}
			arg2.aClass3_Sub1_Sub1_2 = null;
			arg2.aClass3_Sub35_Sub1_2 = null;
			arg2.aClass3_Sub41_2 = null;
		} else if (arg2.anIntArray80 != null && (arg2.anInt948 -= arg1) <= 0) {
			local233 = arg2.anInt956 == 256 && arg2.anInt954 == 256 ? 256 : (int) (Math.random() * (double) (arg2.anInt956 - arg2.anInt954)) + arg2.anInt954;
			if (arg2.aBoolean69) {
				if (arg2.aClass3_Sub41_2 == null) {
					local245 = (int) ((double) arg2.anIntArray80.length * Math.random());
					arg2.aClass3_Sub41_2 = Static377.method5457(Static387.aClass15_101, arg2.anIntArray80[local245]);
				}
				if (arg2.aClass3_Sub41_2 != null) {
					if (arg2.aClass3_Sub35_Sub1_2 == null) {
						arg2.aClass3_Sub35_Sub1_2 = arg2.aClass3_Sub41_2.method5460(new int[] { 22050 });
					}
					if (arg2.aClass3_Sub35_Sub1_2 != null) {
						local342 = Static679.method67(arg2.aClass3_Sub35_Sub1_2, local233, local167 << 6, local191);
						local342.method100(0);
						Static313.aClass3_Sub1_Sub2_1.method934(local342);
						arg2.anInt948 = arg2.anInt963 + (int) ((double) (arg2.anInt949 - arg2.anInt963) * Math.random());
						arg2.aClass3_Sub1_Sub1_2 = local342;
						return;
					}
				}
				return;
			}
			local245 = (int) (Math.random() * (double) arg2.anIntArray80.length);
			@Pc(528) Class209 local528 = Static683.method5274(Static550.aClass15_138, arg2.anIntArray80[local245], 0);
			if (local528 != null) {
				@Pc(535) Class3_Sub35_Sub1 local535 = local528.method5277().method4937(Static36.aClass225_1);
				@Pc(543) Class3_Sub1_Sub1 local543 = Static679.method67(local535, local233, local167 << 6, local191);
				local543.method100(0);
				Static313.aClass3_Sub1_Sub2_1.method934(local543);
				arg2.aClass3_Sub1_Sub1_2 = local543;
				arg2.anInt948 = arg2.anInt963 + (int) ((double) (arg2.anInt949 - arg2.anInt963) * Math.random());
				return;
			}
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(I[IIIIIII)V")
	public static void method6972(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(7) int arg5) {
		if (arg2 > 0 && !Static129.method2437(arg2)) {
			throw new IllegalArgumentException("");
		} else if (arg3 <= 0 || Static129.method2437(arg3)) {
			@Pc(47) int local47 = 0;
			@Pc(54) int local54 = arg2 >= arg3 ? arg3 : arg2;
			@Pc(58) int local58 = arg2 >> 1;
			@Pc(62) int local62 = arg3 >> 1;
			@Pc(64) int[] local64 = arg1;
			@Pc(69) int[] local69 = new int[local62 * local58];
			while (true) {
				OpenGL.glTexImage2Di(arg0, local47, arg5, arg2, arg3, 0, 32993, arg4, local64, 0);
				if (local54 <= 1) {
					return;
				}
				@Pc(85) int local85 = 0;
				@Pc(87) int local87 = 0;
				@Pc(91) int local91 = arg2;
				@Pc(93) int[] local93 = local69;
				for (@Pc(95) int local95 = 0; local95 < local62; local95++) {
					for (@Pc(98) int local98 = 0; local98 < local58; local98++) {
						@Pc(104) int local104 = local64[local87++];
						@Pc(109) int local109 = local64[local91++];
						@Pc(114) int local114 = local64[local87++];
						@Pc(120) int local120 = local104 >> 16 & 0xFF;
						@Pc(125) int local125 = local64[local91++];
						@Pc(131) int local131 = local104 >> 8 & 0xFF;
						@Pc(135) int local135 = local104 & 0xFF;
						@Pc(141) int local141 = local104 >> 24 & 0xFF;
						@Pc(147) int local147 = local135 + (local114 & 0xFF);
						@Pc(155) int local155 = local141 + (local114 >> 24 & 0xFF);
						@Pc(163) int local163 = local131 + (local114 >> 8 & 0xFF);
						@Pc(171) int local171 = local120 + (local114 >> 16 & 0xFF);
						@Pc(179) int local179 = local155 + (local109 >> 24 & 0xFF);
						@Pc(187) int local187 = local163 + (local109 >> 8 & 0xFF);
						@Pc(195) int local195 = local171 + (local109 >> 16 & 0xFF);
						@Pc(201) int local201 = local147 + (local109 & 0xFF);
						@Pc(209) int local209 = local187 + (local125 >> 8 & 0xFF);
						@Pc(215) int local215 = local201 + (local125 & 0xFF);
						@Pc(223) int local223 = local195 + (local125 >> 16 & 0xFF);
						@Pc(231) int local231 = local179 + (local125 >> 24 & 0xFF);
						local69[local85++] = local215 >> 2 & 0xFF | (local223 & 0x3FC) << 14 | (local231 & 0x3FC) << 22 | (local209 & 0x3FC) << 6;
					}
					local87 += arg2;
					local91 += arg2;
				}
				local69 = local64;
				arg3 = local62;
				local64 = local93;
				arg2 = local58;
				local47++;
				local58 >>= 0x1;
				local54 >>= 0x1;
				local62 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}
}
