import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static446 {

	@OriginalMember(owner = "client!wh", name = "u", descriptor = "I")
	public static int anInt7545;

	@OriginalMember(owner = "client!wh", name = "x", descriptor = "Z")
	public static boolean aBoolean648 = false;

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(BI)I")
	public static int method5884(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(IIIII[III)V")
	public static void method5885(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) int arg5) {
		if (arg3 > 0 && !Static137.method2172(arg3)) {
			throw new IllegalArgumentException("");
		} else if (arg2 <= 0 || Static137.method2172(arg2)) {
			@Pc(40) int local40 = 0;
			@Pc(51) int local51 = arg3 >= arg2 ? arg2 : arg3;
			@Pc(55) int local55 = arg3 >> 1;
			@Pc(59) int local59 = arg2 >> 1;
			@Pc(66) int[] local66 = arg4;
			@Pc(71) int[] local71 = new int[local55 * local59];
			while (true) {
				OpenGL.glTexImage2Di(arg0, local40, arg5, arg3, arg2, 0, 32993, arg1, local66, 0);
				if (local51 <= 1) {
					return;
				}
				@Pc(89) int local89 = 0;
				@Pc(91) int local91 = 0;
				@Pc(95) int local95 = arg3;
				for (@Pc(97) int local97 = 0; local97 < local59; local97++) {
					for (@Pc(100) int local100 = 0; local100 < local55; local100++) {
						@Pc(106) int local106 = local66[local91++];
						@Pc(111) int local111 = local66[local91++];
						@Pc(116) int local116 = local66[local95++];
						@Pc(120) int local120 = local106 & 0xFF;
						@Pc(126) int local126 = local106 >> 16 & 0xFF;
						@Pc(132) int local132 = local106 >> 8 & 0xFF;
						@Pc(138) int local138 = local106 >> 24 & 0xFF;
						@Pc(143) int local143 = local66[local95++];
						@Pc(151) int local151 = local138 + (local111 >> 24 & 0xFF);
						@Pc(157) int local157 = local120 + (local111 & 0xFF);
						@Pc(165) int local165 = local132 + (local111 >> 8 & 0xFF);
						@Pc(173) int local173 = local126 + (local111 >> 16 & 0xFF);
						@Pc(179) int local179 = local157 + (local116 & 0xFF);
						@Pc(187) int local187 = local173 + (local116 >> 16 & 0xFF);
						@Pc(195) int local195 = local165 + (local116 >> 8 & 0xFF);
						@Pc(203) int local203 = local151 + (local116 >> 24 & 0xFF);
						@Pc(211) int local211 = local203 + (local143 >> 24 & 0xFF);
						@Pc(219) int local219 = local187 + (local143 >> 16 & 0xFF);
						@Pc(225) int local225 = local179 + (local143 & 0xFF);
						@Pc(233) int local233 = local195 + (local143 >> 8 & 0xFF);
						local71[local89++] = (local233 & 0x3FC) << 6 | (local211 & 0x3FC) << 22 | (local219 & 0x3FC) << 14 | local225 >> 2 & 0xFF;
					}
					local91 += arg3;
					local95 += arg3;
				}
				@Pc(278) int[] local278 = local71;
				local71 = local66;
				arg2 = local59;
				arg3 = local55;
				local66 = local278;
				local51 >>= 0x1;
				local55 >>= 0x1;
				local59 >>= 0x1;
				local40++;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(Lclient!qa;IILclient!ia;III[[[B[I[I[I[I[IIBIIZ)V")
	public static void method5886(@OriginalArg(0) Class172 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class107 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) byte[][][] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) byte arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) boolean arg17) {
		Static255.aClass172_9 = arg0;
		Static437.anInt7370 = arg1;
		Static12.aClass107_1 = arg3;
		Static204.aBoolean345 = Static255.aClass172_9.method5531() > 0;
		Static310.anInt5498 = arg4 >> Static336.anInt5747;
		Static111.anInt2450 = arg6 >> Static336.anInt5747;
		Static3.anInt65 = arg4;
		Static254.anInt4875 = arg6;
		Static180.anInt3574 = arg5;
		Static295.anInt5287 = Static310.anInt5498 - Static80.anInt2001;
		if (Static295.anInt5287 < 0) {
			Static179.anInt5784 = -Static295.anInt5287;
			Static295.anInt5287 = 0;
		} else {
			Static179.anInt5784 = 0;
		}
		Static158.anInt3163 = Static111.anInt2450 - Static80.anInt2001;
		if (Static158.anInt3163 < 0) {
			Static445.anInt7533 = -Static158.anInt3163;
			Static158.anInt3163 = 0;
		} else {
			Static445.anInt7533 = 0;
		}
		Static415.anInt6801 = Static310.anInt5498 + Static80.anInt2001;
		if (Static415.anInt6801 > Static405.anInt6684) {
			Static415.anInt6801 = Static405.anInt6684;
		}
		Static259.anInt4915 = Static111.anInt2450 + Static80.anInt2001;
		if (Static259.anInt4915 > Static37.anInt1025) {
			Static259.anInt4915 = Static37.anInt1025;
		}
		@Pc(77) int local77;
		@Pc(84) int local84;
		@Pc(90) int local90;
		for (@Pc(74) int local74 = 0; local74 < Static80.anInt2001 + Static80.anInt2001 + 2; local74++) {
			for (local77 = 0; local77 < Static80.anInt2001 + Static80.anInt2001 + 2; local77++) {
				local84 = Static310.anInt5498 + local74 - Static80.anInt2001;
				local90 = Static111.anInt2450 + local77 - Static80.anInt2001;
				if (local84 >= 0 && local90 >= 0 && local84 < Static405.anInt6684 && local90 < Static37.anInt1025) {
					@Pc(104) int local104 = local84 << Static336.anInt5747;
					@Pc(108) int local108 = local90 << Static336.anInt5747;
					@Pc(124) int local124 = Static26.aClass159Array1[Static26.aClass159Array1.length - 1].I(local84, local90) - (0x3E8 << Static336.anInt5747 - 7);
					@Pc(144) int local144 = Static85.aClass159Array2 == null ? Static26.aClass159Array1[0].I(local84, local90) + Static205.anInt3992 : Static85.aClass159Array2[0].I(local84, local90) + Static205.anInt3992;
					Static14.aBooleanArrayArray1[local74][local77] = Static255.aClass172_9.SA(local104, local124, local108, local104, local144, local108);
				} else {
					Static14.aBooleanArrayArray1[local74][local77] = false;
				}
			}
		}
		for (local77 = 0; local77 < Static80.anInt2001 + Static80.anInt2001 + 1; local77++) {
			for (local84 = 0; local84 < Static80.anInt2001 + Static80.anInt2001 + 1; local84++) {
				Static313.aBooleanArrayArray6[local77][local84] = Static14.aBooleanArrayArray1[local77][local84] || Static14.aBooleanArrayArray1[local77 + 1][local84] || Static14.aBooleanArrayArray1[local77][local84 + 1] || Static14.aBooleanArrayArray1[local77 + 1][local84 + 1];
			}
		}
		Static39.anIntArray77 = arg8;
		Static79.anIntArray382 = arg9;
		Static320.anIntArray371 = arg10;
		Static239.anIntArray106 = arg11;
		Static245.anIntArray303 = arg12;
		Static183.method3165();
		Static65.method1305();
		for (@Pc(260) Class6_Sub1 local260 = (Class6_Sub1) Static344.aClass138_5.method3311(); local260 != null; local260 = (Class6_Sub1) Static344.aClass138_5.method3312()) {
			local260.method5914();
			Static132.method2044(local260);
		}
		if (Static204.aBoolean345) {
			for (local90 = 0; local90 < Static268.anInt5045; local90++) {
				Static375.aClass191Array2[local90].method4287(arg17, arg1);
			}
		}
		if (arg2 > 1) {
			Static255.aClass172_9.method5523(0);
			if (Static275.aClass22_1 == null || Static275.aClass22_1 instanceof Class22_Sub1) {
				Static275.aClass22_1 = new Class22_Sub2();
			}
		} else if (Static275.aClass22_1 == null || Static275.aClass22_1 instanceof Class22_Sub2) {
			Static275.aClass22_1 = new Class22_Sub1();
		}
		Static275.aClass22_1.method1892(arg2);
		Static275.aClass22_1.method1889();
		if (Static38.aClass118ArrayArrayArray1 != null) {
			Static61.method1234(true);
			Static275.aClass22_1.method1896(22);
			Static306.method4284(arg2, null, 0, (byte) 0, arg15, arg16);
			Static275.aClass22_1.method1889();
			Static275.aClass22_1.method1896(23);
			Static61.method1234(false);
		}
		Static306.method4284(arg2, arg7, arg13, arg14, arg15, arg16);
		Static275.aClass22_1.method1889();
		Static275.aClass22_1.method1893();
		Static275.aClass22_1.method1889();
		if (arg2 > 1) {
			Static255.aClass172_9.method5521(0);
		}
		Static255.aClass172_9.method5485(0, null);
	}
}
