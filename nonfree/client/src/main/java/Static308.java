import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static308 {

	@OriginalMember(owner = "client!tl", name = "q", descriptor = "I")
	public static int anInt3006;

	@OriginalMember(owner = "client!tl", name = "n", descriptor = "I")
	public static int anInt3004 = 0;

	@OriginalMember(owner = "client!tl", name = "p", descriptor = "[Lclient!qg;")
	public static final Class1_Sub4_Sub19[] aClass1_Sub4_Sub19Array4 = new Class1_Sub4_Sub19[14];

	@OriginalMember(owner = "client!tl", name = "s", descriptor = "[Ljava/awt/Rectangle;")
	public static final Rectangle[] aRectangleArray2 = new Rectangle[100];

	@OriginalMember(owner = "client!tl", name = "b", descriptor = "(B)V")
	public static void method2772() {
		Static140.aBoolean292 = true;
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(IBIII)V")
	public static void method2774(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(10) Class1_Sub22 local10 = (Class1_Sub22) Static148.aClass16_14.method410(); local10 != null; local10 = (Class1_Sub22) Static148.aClass16_14.method419()) {
			Static286.method4904(arg2, arg1, arg3, arg0, local10);
		}
		for (@Pc(40) Class1_Sub22 local40 = (Class1_Sub22) Static150.aClass16_15.method410(); local40 != null; local40 = (Class1_Sub22) Static150.aClass16_15.method419()) {
			@Pc(44) byte local44 = 1;
			@Pc(49) Class123 local49 = local40.aClass17_Sub1_Sub1_Sub2_1.method4319();
			if (local40.aClass17_Sub1_Sub1_Sub2_1.aBoolean471) {
				local44 = 0;
			} else if (local40.aClass17_Sub1_Sub1_Sub2_1.anInt4824 == local49.anInt3700 || local49.anInt3686 == local40.aClass17_Sub1_Sub1_Sub2_1.anInt4824 || local49.anInt3683 == local40.aClass17_Sub1_Sub1_Sub2_1.anInt4824 || local40.aClass17_Sub1_Sub1_Sub2_1.anInt4824 == local49.anInt3698) {
				local44 = 2;
			} else if (local49.anInt3693 == local40.aClass17_Sub1_Sub1_Sub2_1.anInt4824 || local40.aClass17_Sub1_Sub1_Sub2_1.anInt4824 == local49.anInt3672 || local40.aClass17_Sub1_Sub1_Sub2_1.anInt4824 == local49.anInt3667 || local40.aClass17_Sub1_Sub1_Sub2_1.anInt4824 == local49.anInt3685) {
				local44 = 3;
			}
			if (local40.anInt3053 != local44) {
				@Pc(140) int local140 = Static353.method5618(local40.aClass17_Sub1_Sub1_Sub2_1);
				if (local140 != local40.anInt3060) {
					if (local40.aClass1_Sub1_Sub2_2 != null) {
						Static145.aClass1_Sub1_Sub4_1.method5037(local40.aClass1_Sub1_Sub2_2);
						local40.aClass1_Sub1_Sub2_2 = null;
					}
					local40.anInt3060 = local140;
				}
				local40.anInt3053 = local44;
			}
			local40.anInt3052 = local40.aClass17_Sub1_Sub1_Sub2_1.anInt5109;
			local40.anInt3057 = local40.aClass17_Sub1_Sub1_Sub2_1.anInt5109 + local40.aClass17_Sub1_Sub1_Sub2_1.method4318() * 64;
			local40.anInt3050 = local40.aClass17_Sub1_Sub1_Sub2_1.anInt5108;
			local40.anInt3059 = local40.aClass17_Sub1_Sub1_Sub2_1.anInt5108 + local40.aClass17_Sub1_Sub1_Sub2_1.method4318() * 64;
			Static286.method4904(arg2, arg1, arg3, arg0, local40);
		}
		for (@Pc(215) Class1_Sub22 local215 = (Class1_Sub22) Static248.aClass197_24.method5161(); local215 != null; local215 = (Class1_Sub22) Static248.aClass197_24.method5154()) {
			@Pc(219) byte local219 = 1;
			@Pc(224) Class123 local224 = local215.aClass17_Sub1_Sub1_Sub1_4.method4319();
			if (local215.aClass17_Sub1_Sub1_Sub1_4.aBoolean471) {
				local219 = 0;
			} else if (local224.anInt3700 == local215.aClass17_Sub1_Sub1_Sub1_4.anInt4824 || local224.anInt3686 == local215.aClass17_Sub1_Sub1_Sub1_4.anInt4824 || local224.anInt3683 == local215.aClass17_Sub1_Sub1_Sub1_4.anInt4824 || local224.anInt3698 == local215.aClass17_Sub1_Sub1_Sub1_4.anInt4824) {
				local219 = 2;
			} else if (local215.aClass17_Sub1_Sub1_Sub1_4.anInt4824 == local224.anInt3693 || local224.anInt3672 == local215.aClass17_Sub1_Sub1_Sub1_4.anInt4824 || local224.anInt3667 == local215.aClass17_Sub1_Sub1_Sub1_4.anInt4824 || local215.aClass17_Sub1_Sub1_Sub1_4.anInt4824 == local224.anInt3685) {
				local219 = 3;
			}
			if (local215.anInt3053 != local219) {
				@Pc(319) int local319 = Static322.method5249(local215.aClass17_Sub1_Sub1_Sub1_4);
				if (local215.anInt3060 != local319) {
					if (local215.aClass1_Sub1_Sub2_2 != null) {
						Static145.aClass1_Sub1_Sub4_1.method5037(local215.aClass1_Sub1_Sub2_2);
						local215.aClass1_Sub1_Sub2_2 = null;
					}
					local215.anInt3060 = local319;
				}
				local215.anInt3053 = local219;
			}
			local215.anInt3052 = local215.aClass17_Sub1_Sub1_Sub1_4.anInt5109;
			local215.anInt3057 = local215.aClass17_Sub1_Sub1_Sub1_4.anInt5109 + local215.aClass17_Sub1_Sub1_Sub1_4.method4318() * 64;
			local215.anInt3050 = local215.aClass17_Sub1_Sub1_Sub1_4.anInt5108;
			local215.anInt3059 = local215.aClass17_Sub1_Sub1_Sub1_4.anInt5108 + local215.aClass17_Sub1_Sub1_Sub1_4.method4318() * 64;
			Static286.method4904(arg2, arg1, arg3, arg0, local215);
		}
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(ILjava/lang/String;I[BII)I")
	public static int method2775(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3) {
		@Pc(10) int local10 = arg3;
		for (@Pc(12) int local12 = 0; local12 < local10; local12++) {
			@Pc(23) char local23 = arg0.charAt(local12);
			if (local23 > '\u0000' && local23 < '\u0080' || !(local23 < ' ' || local23 > 'ÿ')) {
				arg2[arg1 + local12] = (byte) local23;
			} else if (local23 == '€') {
				arg2[local12 + arg1] = -128;
			} else if (local23 == '‚') {
				arg2[arg1 + local12] = -126;
			} else if (local23 == 'ƒ') {
				arg2[local12 + arg1] = -125;
			} else if (local23 == '„') {
				arg2[local12 + arg1] = -124;
			} else if (local23 == '…') {
				arg2[arg1 + local12] = -123;
			} else if (local23 == '†') {
				arg2[arg1 + local12] = -122;
			} else if (local23 == '‡') {
				arg2[local12 + arg1] = -121;
			} else if (local23 == 'ˆ') {
				arg2[local12 + arg1] = -120;
			} else if (local23 == '‰') {
				arg2[arg1 + local12] = -119;
			} else if (local23 == 'Š') {
				arg2[local12 + arg1] = -118;
			} else if (local23 == '‹') {
				arg2[arg1 + local12] = -117;
			} else if (local23 == 'Œ') {
				arg2[local12 + arg1] = -116;
			} else if (local23 == 'Ž') {
				arg2[arg1 + local12] = -114;
			} else if (local23 == '‘') {
				arg2[local12 + arg1] = -111;
			} else if (local23 == '’') {
				arg2[local12 + arg1] = -110;
			} else if (local23 == '“') {
				arg2[arg1 + local12] = -109;
			} else if (local23 == '”') {
				arg2[arg1 + local12] = -108;
			} else if (local23 == '•') {
				arg2[arg1 + local12] = -107;
			} else if (local23 == '–') {
				arg2[local12 + arg1] = -106;
			} else if (local23 == '—') {
				arg2[arg1 + local12] = -105;
			} else if (local23 == '˜') {
				arg2[arg1 + local12] = -104;
			} else if (local23 == '™') {
				arg2[arg1 + local12] = -103;
			} else if (local23 == 'š') {
				arg2[arg1 + local12] = -102;
			} else if (local23 == '›') {
				arg2[local12 + arg1] = -101;
			} else if (local23 == 'œ') {
				arg2[arg1 + local12] = -100;
			} else if (local23 == 'ž') {
				arg2[arg1 + local12] = -98;
			} else if (local23 == 'Ÿ') {
				arg2[arg1 + local12] = -97;
			} else {
				arg2[local12 + arg1] = 63;
			}
		}
		return local10;
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(Lclient!uo;ZIIILclient!ak;IZLclient!uo;ILclient!eq;I)Lclient!c;")
	public static Class5 method2776(@OriginalArg(0) Class32 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class9 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) boolean arg6, @OriginalArg(8) Class32 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class60 arg9, @OriginalArg(11) int arg10) {
		@Pc(15) Class5 local15 = Static345.method5541(arg3, arg5, arg7, arg8, arg9, arg2, arg10);
		if (local15 != null) {
			return local15;
		}
		@Pc(23) Class111 local23 = Static20.method561(arg3);
		@Pc(35) int local35;
		if (arg10 > 1 && local23.lb != null) {
			@Pc(33) int local33 = -1;
			for (local35 = 0; local35 < 10; local35++) {
				if (local23.anIntArray274[local35] <= arg10 && local23.anIntArray274[local35] != 0) {
					local33 = local23.lb[local35];
				}
			}
			if (local33 != -1) {
				local23 = Static20.method561(local33);
			}
		}
		@Pc(77) Class82 local77 = Static221.method4154(local23.anInt3282, Static17.aClass216_5);
		if (local77 == null) {
			return null;
		}
		if (local23.aShortArray59 != null) {
			for (local35 = 0; local35 < local23.aShortArray59.length; local35++) {
				if (local23.aByteArray53 == null || local23.aByteArray53.length <= local35) {
					local77.method2345(local23.aShortArray59[local35], local23.aShortArray62[local35]);
				} else {
					local77.method2345(local23.aShortArray59[local35], Static15.aShortArray2[local23.aByteArray53[local35] & 0xFF]);
				}
			}
		}
		if (local23.aShortArray61 != null) {
			for (local35 = 0; local35 < local23.aShortArray61.length; local35++) {
				local77.method2353(local23.aShortArray61[local35], local23.aShortArray60[local35]);
			}
		}
		if (arg9 != null) {
			for (local35 = 0; local35 < 5; local35++) {
				if (Static331.aShortArrayArray7[local35].length > arg9.anIntArray196[local35]) {
					local77.method2345(Static144.aShortArray58[local35], Static331.aShortArrayArray7[local35][arg9.anIntArray196[local35]]);
				}
				if (arg9.anIntArray196[local35] < Static156.aShortArrayArray3[local35].length) {
					local77.method2345(Static71.aShortArray70[local35], Static156.aShortArrayArray3[local35][arg9.anIntArray196[local35]]);
				}
			}
		}
		@Pc(222) short local222 = 1024;
		@Pc(224) boolean local224 = false;
		if (local23.anInt3323 != 128 || local23.anInt3281 != 128 || local23.anInt3291 != 128) {
			local224 = true;
			local222 = 1031;
		}
		@Pc(262) Class73 local262 = arg0.method2153(local77, local222, 0, local23.anInt3290 + 64, local23.anInt3309 + 768);
		if (!local262.method3313()) {
			return null;
		}
		if (local224) {
			local262.method3290(local23.anInt3323, local23.anInt3281, local23.anInt3291);
		}
		@Pc(279) Class5 local279 = null;
		if (local23.anInt3320 != -1) {
			local279 = method2776(arg0, true, 0, local23.anInt3333, arg4, 0, true, arg7, 1, arg9, 10);
			if (local279 == null) {
				return null;
			}
		} else if (local23.anInt3324 != -1) {
			local279 = method2776(arg0, false, arg2, local23.anInt3311, arg4, 0, true, arg7, arg8, arg9, arg10);
			if (local279 == null) {
				return null;
			}
		}
		@Pc(328) int local328 = local23.anInt3317;
		arg0.method2242(16, 16, 512, 512);
		if (arg1) {
			local328 = (int) ((double) local328 * 1.5D);
		} else if (arg8 == 2) {
			local328 = (int) ((double) local328 * 1.04D);
		}
		@Pc(358) Class109 local358 = arg0.method2221();
		local358.method3875();
		arg0.method2201(local358);
		arg0.method2140(1.0F);
		arg0.method2189(16777215, 1.0F, 1.0F, -50.0F, -10.0F, -50.0F);
		@Pc(377) Class109 local377 = arg0.method2194();
		local377.method3864(-local23.anInt3283 << 3);
		local377.method3868(local23.anInt3327 << 3);
		local377.method3874(local23.anInt3306, (local328 * Class1_Sub3_Sub8.anIntArray159[local23.anInt3337 << 3] >> 15) - (local262.method3327() / 2 - local23.anInt3330), local23.anInt3330 + (local328 * Class1_Sub3_Sub8.anIntArray156[local23.anInt3337 << 3] >> 15));
		local377.method3880(local23.anInt3337 << 3);
		@Pc(435) int local435 = arg0.method2223();
		@Pc(438) int local438 = arg0.method2203();
		arg0.method2202(50, Integer.MAX_VALUE);
		arg0.method2177();
		arg0.method2184();
		arg0.method2241(0, 0, 36, 32, 0, 0);
		local262.method3322(local377, null, 1);
		arg0.method2202(local435, local438);
		@Pc(470) int[] local470 = arg0.method2208();
		if (arg8 >= 1) {
			local470 = Static112.method2427(-16777215, local470);
			if (arg8 >= 2) {
				local470 = Static112.method2427(-1, local470);
			}
		}
		if (arg2 != 0) {
			Static326.method2168(arg2, local470);
		}
		arg0.method2155(local470, 36, 36, 32).method3621(0, 0);
		if (local23.anInt3320 != -1) {
			local279.method3621(0, 0);
		} else if (local23.anInt3324 != -1) {
			local279.method3621(0, 0);
		}
		if (arg5 == 1 || arg5 == 2 && (local23.anInt3287 == 1 || arg10 != 1) && arg10 != -1) {
			arg4.method5021(-256, 0, 9, -16777215, Static187.method3660(arg10));
		}
		local470 = arg0.method2208();
		for (@Pc(560) int local560 = 0; local560 < local470.length; local560++) {
			if ((local470[local560] & 0xFFFFFF) == 0) {
				local470[local560] = 0;
			} else {
				local470[local560] |= 0xFF000000;
			}
		}
		@Pc(600) Class5 local600;
		if (arg6) {
			local600 = arg0.method2155(local470, 36, 36, 32);
		} else {
			local600 = arg7.method2155(local470, 36, 36, 32);
		}
		if (!arg6) {
			@Pc(616) Class119 local616 = new Class119();
			local616.aBoolean338 = arg9 != null;
			local616.anInt3596 = arg2;
			local616.anInt3593 = arg5;
			local616.anInt3597 = arg3;
			local616.anInt3602 = arg7.anInt2472;
			local616.anInt3600 = arg8;
			local616.anInt3595 = arg10;
			Static357.aClass18_3.method569(local600, local616);
		}
		return local600;
	}
}
