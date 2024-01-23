import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static145 {

	@OriginalMember(owner = "client!lc", name = "g", descriptor = "I")
	public static int anInt2861;

	@OriginalMember(owner = "client!lc", name = "i", descriptor = "I")
	public static int anInt2862;

	@OriginalMember(owner = "client!lc", name = "j", descriptor = "Lclient!pk;")
	public static Class132 aClass132_55;

	@OriginalMember(owner = "client!lc", name = "k", descriptor = "[[S")
	public static short[][] aShortArrayArray4;

	@OriginalMember(owner = "client!lc", name = "d", descriptor = "Ljava/util/Calendar;")
	public static Calendar aCalendar1 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

	@OriginalMember(owner = "client!lc", name = "h", descriptor = "J")
	public static long aLong109 = 0L;

	@OriginalMember(owner = "client!lc", name = "l", descriptor = "[Z")
	public static boolean[] aBooleanArray13 = new boolean[100];

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(ILclient!pk;)V")
	public static void method2284(@OriginalArg(1) Class132 arg0) {
		Static64.aClass132_23 = arg0;
	}

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "(Z)V")
	public static void method2286() {
		Static15.aClass61_3.method1378();
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(I[B)V")
	public static void method2287(@OriginalArg(1) byte[] arg0) {
		@Pc(10) Class8_Sub2 local10 = new Class8_Sub2(arg0);
		local10.anInt2955 = arg0.length - 2;
		Static288.anInt1353 = local10.method2375();
		Static247.aBooleanArray26 = new boolean[Static288.anInt1353];
		Static25.anIntArray45 = new int[Static288.anInt1353];
		Static225.anIntArray345 = new int[Static288.anInt1353];
		Static135.anIntArray225 = new int[Static288.anInt1353];
		Static241.aByteArrayArray16 = new byte[Static288.anInt1353][];
		Static92.anIntArray130 = new int[Static288.anInt1353];
		Static232.aByteArrayArray15 = new byte[Static288.anInt1353][];
		local10.anInt2955 = arg0.length - Static288.anInt1353 * 8 - 7;
		Static97.anInt1999 = local10.method2375();
		Static290.anInt5656 = local10.method2375();
		@Pc(68) int local68 = (local10.method2334() & 0xFF) + 1;
		@Pc(70) int local70;
		for (local70 = 0; local70 < Static288.anInt1353; local70++) {
			Static25.anIntArray45[local70] = local10.method2375();
		}
		for (local70 = 0; local70 < Static288.anInt1353; local70++) {
			Static225.anIntArray345[local70] = local10.method2375();
		}
		for (local70 = 0; local70 < Static288.anInt1353; local70++) {
			Static92.anIntArray130[local70] = local10.method2375();
		}
		for (local70 = 0; local70 < Static288.anInt1353; local70++) {
			Static135.anIntArray225[local70] = local10.method2375();
		}
		local10.anInt2955 = arg0.length - Static288.anInt1353 * 8 - (local68 + -1) * 3 - 7;
		Static147.anIntArray236 = new int[local68];
		for (local70 = 1; local70 < local68; local70++) {
			Static147.anIntArray236[local70] = local10.method2323();
			if (Static147.anIntArray236[local70] == 0) {
				Static147.anIntArray236[local70] = 1;
			}
		}
		local10.anInt2955 = 0;
		for (local70 = 0; local70 < Static288.anInt1353; local70++) {
			@Pc(190) int local190 = Static135.anIntArray225[local70];
			@Pc(194) int local194 = Static92.anIntArray130[local70];
			@Pc(198) int local198 = local194 * local190;
			@Pc(200) boolean local200 = false;
			@Pc(203) byte[] local203 = new byte[local198];
			@Pc(206) byte[] local206 = new byte[local198];
			Static232.aByteArrayArray15[local70] = local206;
			Static241.aByteArrayArray16[local70] = local203;
			@Pc(218) int local218 = local10.method2334();
			@Pc(227) int local227;
			if ((local218 & 0x1) == 0) {
				for (local227 = 0; local227 < local198; local227++) {
					local206[local227] = local10.method2374();
				}
				if ((local218 & 0x2) != 0) {
					for (local227 = 0; local227 < local198; local227++) {
						@Pc(263) byte local263 = local203[local227] = local10.method2374();
						local200 |= local263 != -1;
					}
				}
			} else {
				local227 = 0;
				label96: while (true) {
					@Pc(286) int local286;
					if (local194 <= local227) {
						if ((local218 & 0x2) == 0) {
							break;
						}
						local227 = 0;
						while (true) {
							if (local227 >= local194) {
								break label96;
							}
							for (local286 = 0; local286 < local190; local286++) {
								@Pc(346) byte local346 = local203[local286 * local194 + local227] = local10.method2374();
								local200 |= local346 != -1;
							}
							local227++;
						}
					}
					for (local286 = 0; local286 < local190; local286++) {
						local206[local286 * local194 + local227] = local10.method2374();
					}
					local227++;
				}
			}
			Static247.aBooleanArray26[local70] = local200;
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIZIII)V")
	public static void method2288(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		Static207.anInt4304++;
		Static218.method3410();
		@Pc(26) int local26;
		if (arg2) {
			Static260.method3919(0, false, false);
		} else {
			Static2.method7(0);
			Static260.method3919(0, true, false);
			if (Static20.anInt543 == 0) {
				for (local26 = 1; local26 <= 5; local26++) {
					Static260.method3919(local26, false, false);
					Static260.method3919(local26, false, true);
					Static2.method7(local26);
				}
			} else {
				for (local26 = 1; local26 <= 5; local26++) {
					Static2.method7(local26);
					Static260.method3919(local26, false, false);
					Static260.method3919(local26, false, true);
				}
			}
		}
		if (!arg2) {
			Static149.method2413();
		}
		Static114.method1851();
		if (Static116.aBoolean188) {
			Static239.method3610(arg1, arg0, arg4, true, arg3);
			arg0 = Static51.anInt1121;
			arg3 = Static76.anInt1637;
			arg1 = Static92.anInt1944;
			arg4 = Static15.anInt403;
		}
		@Pc(148) int local148;
		if (Static172.anInt3428 == 1) {
			local26 = (int) Static201.aFloat36;
			if (Static215.anInt4428 / 256 > local26) {
				local26 = Static215.anInt4428 / 256;
			}
			if (Static134.aBooleanArray8[4] && local26 < Static269.anIntArray376[4] + 128) {
				local26 = Static269.anIntArray376[4] + 128;
			}
			local148 = (int) Static82.aFloat20 + Static28.anInt690 & 0x7FF;
			Static163.method3405(local148, Static163.anInt4477, arg4, local26, Static59.method927(Static21.aClass36_Sub3_Sub1_1.anInt4117, Static21.aClass36_Sub3_Sub1_1.anInt4118, Static34.anInt770) - 50, 600 - -(local26 * 3), Static194.anInt3891);
		} else if (Static172.anInt3428 == 5) {
			Static132.method2123(arg4);
		}
		local148 = Static170.anInt3411;
		local26 = Static46.anInt1044;
		@Pc(188) int local188 = Static185.anInt3689;
		@Pc(190) int local190 = Static293.anInt5684;
		@Pc(196) int local196 = Static56.anInt1246;
		@Pc(198) int local198;
		@Pc(244) int local244;
		for (local198 = 0; local198 < 5; local198++) {
			if (Static134.aBooleanArray8[local198]) {
				local244 = (int) ((double) -Static165.anIntArray254[local198] + Math.random() * (double) (Static165.anIntArray254[local198] * 2 + 1) + Math.sin((double) Static70.anIntArray106[local198] / 100.0D * (double) Static39.anIntArray60[local198]) * (double) Static269.anIntArray376[local198]);
				if (local198 == 2) {
					Static185.anInt3689 += local244;
				}
				if (local198 == 4) {
					Static56.anInt1246 += local244;
					if (Static56.anInt1246 < 128) {
						Static56.anInt1246 = 128;
					}
					if (Static56.anInt1246 > 383) {
						Static56.anInt1246 = 383;
					}
				}
				if (local198 == 0) {
					Static46.anInt1044 += local244;
				}
				if (local198 == 3) {
					Static293.anInt5684 = Static293.anInt5684 + local244 & 0x7FF;
				}
				if (local198 == 1) {
					Static170.anInt3411 += local244;
				}
			}
		}
		Static35.method553();
		@Pc(369) int local369;
		if (Static116.aBoolean188) {
			Static126.method1993(arg3, arg1, arg0 + arg3, arg1 + arg4);
			@Pc(327) float local327 = (float) Static293.anInt5684 * 0.17578125F;
			@Pc(332) float local332 = (float) Static56.anInt1246 * 0.17578125F;
			if (Static172.anInt3428 == 3) {
				local332 = Static276.aFloat61 * 360.0F / 6.2831855F;
				local327 = Static210.aFloat46 * 360.0F / 6.2831855F;
			}
			if (Static23.anInt618 == 10) {
				local369 = Static84.method1371(Static185.anInt3691, Static185.anInt3689 >> 10, Static54.anInt1180, Static46.anInt1044 >> 10);
			} else {
				local369 = Static84.method1371(Static185.anInt3691, Static21.aClass36_Sub3_Sub1_1.anIntArray308[0] >> 3, Static54.anInt1180, Static21.aClass36_Sub3_Sub1_1.anIntArray310[0] >> 3);
			}
			if (Static181.anInt3564 >= 0) {
				Static116.method1905();
				@Pc(393) Class91 local393 = Static22.method402(Static216.anInt4457, Static39.anInt857, Static160.anInt3256, Static181.anInt3564);
				local393.method2097(Static82.anInt1791, arg3, arg1, arg0, arg4, Static56.anInt1246, Static293.anInt5684, local369);
			} else {
				Static116.method1876(local369);
			}
			Static116.method1887(arg3, arg1, arg0, arg4, arg0 / 2 + arg3, arg4 / 2 + arg1, local332, local327, Static36.anInt816, Static36.anInt816);
			Static245.method3662(false);
			Static116.method1877();
			Static116.method1871(true);
			Static116.method1885(true);
		} else {
			Static103.method1680(arg3, arg1, arg3 + arg0, arg1 + arg4);
			Static96.method1541();
			if (Static181.anInt3564 < 0) {
				Static103.method1664(arg3, arg1, arg0, arg4, 0);
			} else {
				@Pc(462) Class91 local462 = Static22.method402(Static216.anInt4457, Static39.anInt857, Static160.anInt3256, Static181.anInt3564);
				local462.method2099(Static82.anInt1791, arg3, arg1, arg0, arg4, Static56.anInt1246, Static293.anInt5684);
			}
		}
		if (Static147.aBoolean246 || Static127.anInt2559 < arg3 || Static127.anInt2559 >= arg0 + arg3 || arg1 > Static229.anInt4666 || arg1 + arg4 <= Static229.anInt4666) {
			Static224.aBoolean368 = false;
			Static88.anInt1896 = 0;
		} else {
			local198 = Static90.anInt1920;
			local244 = Static65.anInt5541;
			Static88.anInt1896 = 0;
			Static198.anInt3919 = local198 + (local244 - local198) * (-arg3 + Static127.anInt2559) / arg0;
			Static224.aBoolean368 = true;
			@Pc(520) int local520 = Static19.anInt523;
			local369 = Static37.anInt3864;
			Static31.anInt746 = (local520 - local369) * (-arg1 + Static229.anInt4666) / arg4 + local369;
		}
		Static16.method2745();
		@Pc(549) byte local549 = Static195.method2233() == 2 ? (byte) Static207.anInt4304 : 1;
		if (Static116.aBoolean188) {
			Static186.method2914(Static183.anInt3590, !Static37.aBoolean314);
			Static13.method260(Static293.anInt5684, Static185.anInt3689, Static46.anInt1044, Static56.anInt1246, Static170.anInt3411);
			Static116.anInt2376 = Static183.anInt3590;
			Static159.method2559(Static46.anInt1044, Static170.anInt3411, Static185.anInt3689, Static56.anInt1246, Static293.anInt5684, Static123.aByteArrayArrayArray5, Static144.anIntArray233, Static119.anIntArray194, Static255.anIntArray391, Static41.anIntArray62, Static172.anIntArray260, Static34.anInt770 + 1, local549, Static21.aClass36_Sub3_Sub1_1.anInt4117 >> 7, Static21.aClass36_Sub3_Sub1_1.anInt4118 >> 7);
			Static175.aBoolean288 = true;
			Static186.method2929();
			Static13.method260(0, 0, 0, 0, 0);
			Static16.method2745();
			Static134.method2181(Static36.anInt816, Static36.anInt816, arg4, arg3, arg1, arg0);
			Static74.method1179(arg3, arg0, arg1, Static36.anInt816, Static36.anInt816, arg4);
			Static206.method3271();
		} else {
			Static159.method2559(Static46.anInt1044, Static170.anInt3411, Static185.anInt3689, Static56.anInt1246, Static293.anInt5684, Static123.aByteArrayArrayArray5, Static144.anIntArray233, Static119.anIntArray194, Static255.anIntArray391, Static41.anIntArray62, Static172.anIntArray260, Static34.anInt770 + 1, local549, Static21.aClass36_Sub3_Sub1_1.anInt4117 >> 7, Static21.aClass36_Sub3_Sub1_1.anInt4118 >> 7);
			Static16.method2745();
			Static206.method3271();
			Static134.method2181(256, 256, arg4, arg3, arg1, arg0);
			Static74.method1179(arg3, arg0, arg1, 256, 256, arg4);
		}
		((Class49_Sub1) Static96.anInterface4_1).method1276(Static185.anInt3691);
		Static86.method1407(arg4, arg1, arg0, arg3);
		Static46.anInt1044 = local26;
		Static185.anInt3689 = local188;
		Static293.anInt5684 = local190;
		Static170.anInt3411 = local148;
		Static56.anInt1246 = local196;
		if (Static147.aBoolean245 && Static158.aClass139_2.method3449() == 0) {
			Static147.aBoolean245 = false;
		}
		if (Static147.aBoolean245) {
			if (Static116.aBoolean188) {
				Static126.method1994(arg3, arg1, arg0, arg4, 0);
			} else {
				Static103.method1664(arg3, arg1, arg0, arg4, 0);
			}
			Static261.method3923(Static58.aString83, false);
		}
		if (!arg2 && !Static147.aBoolean245 && !Static147.aBoolean246 && Static127.anInt2559 >= arg3 && arg0 + arg3 > Static127.anInt2559 && Static229.anInt4666 >= arg1 && Static229.anInt4666 < arg1 + arg4) {
			Static260.method3920(arg3, arg0, arg4, arg1, Static127.anInt2559, Static229.anInt4666);
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(B)V")
	public static void method2289() {
		Static120.aClass61_20.method1378();
		Static147.aClass61_24.method1378();
	}
}
