import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static270 {

	@OriginalMember(owner = "client!ti", name = "K", descriptor = "Lclient!wf;")
	public static Class191 aClass191_15;

	@OriginalMember(owner = "client!ti", name = "P", descriptor = "Lclient!th;")
	public static Class168 aClass168_183;

	@OriginalMember(owner = "client!ti", name = "T", descriptor = "I")
	public static int anInt5412;

	@OriginalMember(owner = "client!ti", name = "L", descriptor = "[I")
	public static int[] anIntArray485 = new int[500];

	@OriginalMember(owner = "client!ti", name = "N", descriptor = "I")
	public static int anInt5407 = 0;

	@OriginalMember(owner = "client!ti", name = "R", descriptor = "I")
	public static int anInt5410 = 0;

	@OriginalMember(owner = "client!ti", name = "V", descriptor = "I")
	public static int anInt5414 = 0;

	@OriginalMember(owner = "client!ti", name = "W", descriptor = "[I")
	public static int[] anIntArray486 = new int[50];

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(ZIBIII)V")
	public static void method4099(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static207.anInt4467++;
		if (Static56.aClass2_Sub4_Sub2_1 != null && Static56.aClass2_Sub4_Sub2_1.anInt2846 + 64 - Static56.aClass2_Sub4_Sub2_1.method2088() * 64 >> 7 == Static280.anInt5624 && Static56.aClass2_Sub4_Sub2_1.anInt2794 + 64 - Static56.aClass2_Sub4_Sub2_1.method2088() * 64 >> 7 == Static259.anInt5240) {
			Static280.anInt5624 = 0;
			Static240.aBoolean314 = false;
		}
		Static43.method874();
		if (!arg0) {
			Static238.method3760();
		}
		Static175.method291();
		if (Static294.aBoolean367) {
			Static118.method1909(arg4, arg1, arg3, true, arg2);
			arg4 = Static313.anInt6270;
			arg2 = Static173.anInt3886;
			arg3 = Static265.anInt5316;
			arg1 = Static163.anInt3560;
		}
		Static42.anInt1035 = arg2;
		Static42.anInt1040 = arg1;
		@Pc(97) int local97;
		@Pc(94) int local94;
		if (Static106.anInt2378 == 1) {
			local97 = (int) Static27.aFloat44;
			if (Static115.anInt2485 / 256 > local97) {
				local97 = Static115.anInt2485 / 256;
			}
			local94 = (int) Static62.aFloat16 + Static206.anInt4452 & 0x7FF;
			if (Static103.aBooleanArray18[4] && local97 < Static225.anIntArray441[4] + 128) {
				local97 = Static225.anIntArray441[4] + 128;
			}
			Static83.method1429(local97, arg4, Static28.anInt741, Static93.method1576(Static56.aClass2_Sub4_Sub2_1.anInt2794, Static56.aClass2_Sub4_Sub2_1.anInt2846, Static185.anInt4085) - 50, local97 * 3 + 600, Static315.anInt6303, local94);
		} else if (Static106.anInt2378 == 4) {
			local94 = (int) Static62.aFloat16 & 0x7FF;
			local97 = (int) Static27.aFloat44;
			if (Static115.anInt2485 / 256 > local97) {
				local97 = Static115.anInt2485 / 256;
			}
			if (Static103.aBooleanArray18[4] && Static225.anIntArray441[4] + 128 > local97) {
				local97 = Static225.anIntArray441[4] + 128;
			}
			Static83.method1429(local97, arg4, Static28.anInt741, Static93.method1576(Static23.anInt641, Static109.anInt2425, Static185.anInt4085) - 50, local97 * 3 + 600, Static315.anInt6303, local94);
		} else if (Static106.anInt2378 == 5) {
			Static297.method4540(arg4);
		}
		local97 = Static58.anInt1269;
		local94 = Static315.anInt6297;
		@Pc(227) int local227 = Static94.anInt2161;
		@Pc(229) int local229 = Static44.anInt1071;
		@Pc(231) int local231 = Static120.anInt6251;
		@Pc(233) int local233;
		@Pc(277) int local277;
		for (local233 = 0; local233 < 5; local233++) {
			if (Static103.aBooleanArray18[local233]) {
				local277 = (int) (Math.random() * (double) (Static211.anIntArray411[local233] * 2 + 1) - (double) Static211.anIntArray411[local233] + Math.sin((double) Static44.anIntArray132[local233] * ((double) Static221.anIntArray430[local233] / 100.0D)) * (double) Static225.anIntArray441[local233]);
				if (local233 == 0) {
					Static58.anInt1269 += local277;
				}
				if (local233 == 2) {
					Static94.anInt2161 += local277;
				}
				if (local233 == 1) {
					Static315.anInt6297 += local277;
				}
				if (local233 == 3) {
					Static120.anInt6251 = Static120.anInt6251 + local277 & 0x7FF;
				}
				if (local233 == 4) {
					Static44.anInt1071 += local277;
					if (Static44.anInt1071 < 128) {
						Static44.anInt1071 = 128;
					}
					if (Static44.anInt1071 > 383) {
						Static44.anInt1071 = 383;
					}
				}
			}
		}
		Static315.method4763();
		@Pc(448) int local448;
		if (Static294.aBoolean367) {
			Static156.method2546(arg1, arg2, arg1 + arg3, arg4 + arg2);
			@Pc(401) float local401 = (float) Static44.anInt1071 * 0.17578125F;
			@Pc(408) float local408 = (float) Static120.anInt6251 * 0.17578125F;
			if (Static106.anInt2378 == 3) {
				local401 = Static194.aFloat43 * 360.0F / 6.2831855F;
				local408 = Static192.aFloat42 * 360.0F / 6.2831855F;
			}
			if (Static96.anInt2212 == 10) {
				local448 = Static117.method3400(Static166.anInt3743, Static94.anInt2161 >> 10, Static58.anInt1269 >> 10, Static286.anInt5740);
			} else {
				local448 = Static117.method3400(Static166.anInt3743, Static56.aClass2_Sub4_Sub2_1.anIntArray286[0] >> 3, Static56.aClass2_Sub4_Sub2_1.anIntArray283[0] >> 3, Static286.anInt5740);
			}
			if (Static3.anInt56 >= 0) {
				Static294.method4521();
				@Pc(474) Class139 local474 = Static234.method3708(Static245.anInt5023, Static229.anInt4845, Static64.anInt1383, Static3.anInt56);
				local474.method3548(Static240.anInt5002, arg1, arg2, arg3, arg4, Static44.anInt1071, Static120.anInt6251, local448);
			} else {
				Static294.method4487(local448);
			}
			Static294.method4508(arg1, arg2, arg3, arg4, arg1 + arg3 / 2, arg2 - -(arg4 / 2), local401, local408, Static246.anInt5030, Static246.anInt5030);
			Static207.method3278(false);
			Static294.method4500();
			Static294.method4491(true);
			Static294.method4499(true);
		} else {
			Static231.method3634(arg1, arg2, arg3 + arg1, arg2 - -arg4);
			Static237.method3736();
			if (Static3.anInt56 >= 0) {
				@Pc(367) Class139 local367 = Static234.method3708(Static245.anInt5023, Static229.anInt4845, Static64.anInt1383, Static3.anInt56);
				local367.method3544(Static240.anInt5002, arg1, arg2, arg3, arg4, Static44.anInt1071, Static120.anInt6251);
			} else {
				Static231.method3630(arg1, arg2, arg3, arg4, 0);
			}
		}
		if (Static128.aBoolean171 || Static57.anInt6304 < arg1 || Static57.anInt6304 >= arg1 + arg3 || arg2 > Static107.anInt1674 || arg4 + arg2 <= Static107.anInt1674) {
			Static217.aBoolean292 = false;
			Static38.anInt947 = 0;
			Static88.aBoolean140 = true;
		} else {
			Static217.aBoolean292 = true;
			Static38.anInt947 = 0;
			Static88.aBoolean140 = true;
			local277 = Static221.anInt4698;
			local448 = Static280.anInt5623;
			local233 = Static57.anInt6308;
			Static302.anInt5999 = (Static57.anInt6304 - arg1) * (local277 - local233) / arg3 + local233;
			@Pc(573) int local573 = Static221.anInt4693;
			Static93.anInt2128 = (local573 - local448) * (-arg2 + Static107.anInt1674) / arg4 + local448;
		}
		Static248.method3834();
		@Pc(599) byte local599 = Static153.method2465() == 2 ? (byte) Static207.anInt4467 : 1;
		if (Static294.aBoolean367) {
			Static191.method3085(Static133.anInt3061, !Static125.aBoolean164);
			Static19.method425(Static94.anInt2161, Static315.anInt6297, Static58.anInt1269, Static44.anInt1071, Static120.anInt6251);
			Static294.anInt5871 = Static133.anInt3061;
			method4101(Static58.anInt1269, Static315.anInt6297, Static94.anInt2161, Static44.anInt1071, Static120.anInt6251, Static53.aByteArrayArrayArray2, Static38.anIntArray120, Static43.anIntArray130, Static162.anIntArray323, Static49.anIntArray146, Static18.anIntArray44, Static185.anInt4085 + 1, local599, Static56.aClass2_Sub4_Sub2_1.anInt2846 >> 7, Static56.aClass2_Sub4_Sub2_1.anInt2794 >> 7);
			Static182.aBoolean252 = true;
			Static191.method3086();
			Static19.method425(0, 0, 0, 0, 0);
			Static248.method3834();
			Static166.method2724(arg3, Static246.anInt5030, arg2, arg4, Static246.anInt5030, arg1);
			Static208.method3297(Static246.anInt5030, arg4, arg2, arg1, Static246.anInt5030, arg3);
			Static144.method2375();
		} else {
			method4101(Static58.anInt1269, Static315.anInt6297, Static94.anInt2161, Static44.anInt1071, Static120.anInt6251, Static53.aByteArrayArrayArray2, Static38.anIntArray120, Static43.anIntArray130, Static162.anIntArray323, Static49.anIntArray146, Static18.anIntArray44, Static185.anInt4085 + 1, local599, Static56.aClass2_Sub4_Sub2_1.anInt2846 >> 7, Static56.aClass2_Sub4_Sub2_1.anInt2794 >> 7);
			Static248.method3834();
			Static144.method2375();
			Static166.method2724(arg3, 256, arg2, arg4, 256, arg1);
			Static208.method3297(256, arg4, arg2, arg1, 256, arg3);
		}
		((Class63_Sub1) Static237.anInterface1_1).method4611(Static286.anInt5740);
		Static215.method3445(arg3, arg4, arg1, arg2);
		Static44.anInt1071 = local229;
		Static120.anInt6251 = local231;
		Static315.anInt6297 = local94;
		Static94.anInt2161 = local227;
		Static58.anInt1269 = local97;
		if (Static211.aBoolean286 && Static280.aClass41_3.method1036() == 0) {
			Static211.aBoolean286 = false;
		}
		if (Static211.aBoolean286) {
			if (Static294.aBoolean367) {
				Static156.method2537(arg1, arg2, arg3, arg4, 0);
			} else {
				Static231.method3630(arg1, arg2, arg3, arg4, 0);
			}
			Static182.method2957(Static115.aString149, false);
		}
		if (!arg0 && !Static211.aBoolean286 && !Static128.aBoolean171 && arg1 <= Static57.anInt6304 && arg3 + arg1 > Static57.anInt6304 && arg2 <= Static107.anInt1674 && Static107.anInt1674 < arg4 + arg2) {
			Static6.method215(Static107.anInt1674, arg1, arg2, arg3, Static57.anInt6304, arg4);
		}
	}

	@OriginalMember(owner = "client!ti", name = "e", descriptor = "(III)J")
	public static long method4100(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub2 local7 = Static7.aClass1_Sub2ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null || local7.aClass136_1 == null ? 0L : local7.aClass136_1.aLong182;
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(IIIII[[[B[I[I[I[I[IIBII)V")
	private static void method4101(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[][][] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int arg11, @OriginalArg(12) byte arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		if (arg0 < 0) {
			arg0 = 0;
		} else if (arg0 >= Static90.anInt2091 * 128) {
			arg0 = Static90.anInt2091 * 128 - 1;
		}
		if (arg2 < 0) {
			arg2 = 0;
		} else if (arg2 >= Static77.anInt1766 * 128) {
			arg2 = Static77.anInt1766 * 128 - 1;
		}
		Static79.anInt1828 = Class146.anIntArray461[arg3];
		Static282.anInt5661 = Class146.anIntArray463[arg3];
		Static37.anInt930 = Class146.anIntArray461[arg4];
		Static58.anInt1267 = Class146.anIntArray463[arg4];
		Static215.anInt4665 = arg0;
		Static296.anInt5905 = arg1;
		Static2.anInt53 = arg2;
		Static101.anInt152 = arg0 / 128;
		Static245.anInt5022 = arg2 / 128;
		Static194.anInt4264 = Static101.anInt152 - Static145.anInt6062;
		if (Static194.anInt4264 < 0) {
			Static194.anInt4264 = 0;
		}
		Static151.anInt3397 = Static245.anInt5022 - Static145.anInt6062;
		if (Static151.anInt3397 < 0) {
			Static151.anInt3397 = 0;
		}
		Static235.anInt4964 = Static101.anInt152 + Static145.anInt6062;
		if (Static235.anInt4964 > Static90.anInt2091) {
			Static235.anInt4964 = Static90.anInt2091;
		}
		Static163.anInt3564 = Static245.anInt5022 + Static145.anInt6062;
		if (Static163.anInt3564 > Static77.anInt1766) {
			Static163.anInt3564 = Static77.anInt1766;
		}
		@Pc(99) short local99;
		if (Static294.aBoolean367) {
			local99 = 3584;
		} else {
			local99 = 3500;
		}
		@Pc(104) int local104;
		@Pc(113) int local113;
		for (local104 = 0; local104 < Static145.anInt6062 + Static145.anInt6062 + 2; local104++) {
			for (local113 = 0; local113 < Static145.anInt6062 + Static145.anInt6062 + 2; local113++) {
				@Pc(130) int local130 = (local104 - Static145.anInt6062 << 7) - (Static215.anInt4665 & 0x7F);
				@Pc(140) int local140 = (local113 - Static145.anInt6062 << 7) - (Static2.anInt53 & 0x7F);
				@Pc(146) int local146 = Static101.anInt152 + local104 - Static145.anInt6062;
				@Pc(152) int local152 = Static245.anInt5022 + local113 - Static145.anInt6062;
				if (local146 >= 0 && local152 >= 0 && local146 < Static90.anInt2091 && local152 < Static77.anInt1766) {
					@Pc(176) int local176;
					if (Static222.anIntArrayArrayArray12 == null) {
						local176 = Static299.anIntArrayArrayArray14[0][local146][local152] + 128 - Static296.anInt5905;
					} else {
						local176 = Static222.anIntArrayArrayArray12[0][local146][local152] + 128 - Static296.anInt5905;
					}
					@Pc(201) int local201 = Static299.anIntArrayArrayArray14[3][local146][local152] - Static296.anInt5905 - 1000;
					Static106.aBooleanArrayArray2[local104][local113] = Static104.method1728(local130, local201, local176, local140, local99);
				} else {
					Static106.aBooleanArrayArray2[local104][local113] = false;
				}
			}
		}
		for (local104 = 0; local104 < Static145.anInt6062 + Static145.anInt6062 + 1; local104++) {
			for (local113 = 0; local113 < Static145.anInt6062 + Static145.anInt6062 + 1; local113++) {
				Static166.aBooleanArrayArray3[local104][local113] = Static106.aBooleanArrayArray2[local104][local113] || Static106.aBooleanArrayArray2[local104 + 1][local113] || Static106.aBooleanArrayArray2[local104][local113 + 1] || Static106.aBooleanArrayArray2[local104 + 1][local113 + 1];
			}
		}
		Static47.anIntArray141 = arg6;
		Static149.anIntArray310 = arg7;
		Static24.anIntArray56 = arg8;
		Static99.anIntArray221 = arg9;
		Static211.anIntArray410 = arg10;
		Static297.method4542();
		if (Static86.aClass1_Sub2ArrayArrayArray3 != null) {
			Static38.method796(true);
			Static209.method3354(arg0, arg1, arg2, null, 0, (byte) 0, arg13, arg14);
			if (Static294.aBoolean367) {
				Static214.aBoolean289 = false;
				Static1.method4721(0, 0);
				Static180.method2902(null);
				Static191.method3086();
			}
			Static38.method796(false);
		}
		Static209.method3354(arg0, arg1, arg2, arg5, arg11, arg12, arg13, arg14);
	}
}
