import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static180 {

	@OriginalMember(owner = "client!sh", name = "f", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_1338 = Static151.method2243("Verbindung abgebrochen)3");

	@OriginalMember(owner = "client!sh", name = "i", descriptor = "Lclient!kg;")
	public static final Class53 aClass53_23 = new Class53(64);

	@OriginalMember(owner = "client!sh", name = "j", descriptor = "Z")
	public static final boolean aBoolean166 = false;

	@OriginalMember(owner = "client!sh", name = "o", descriptor = "Z")
	public static boolean aBoolean167 = false;

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(I)V")
	public static void method2614() {
		@Pc(7) Class37 local7 = Static51.aClass37_1;
		synchronized (Static51.aClass37_1) {
			Static1.anInt35++;
			Static64.anInt1346 = Static132.anInt2866;
			@Pc(26) int local26;
			if (Static192.anInt3974 >= 0) {
				while (Static192.anInt3974 != Static65.anInt1370) {
					local26 = Static134.anIntArray254[Static65.anInt1370];
					Static65.anInt1370 = Static65.anInt1370 + 1 & 0x7F;
					if (local26 >= 0) {
						Static7.aBooleanArray15[local26] = true;
					} else {
						Static7.aBooleanArray15[~local26] = false;
					}
				}
			} else {
				for (local26 = 0; local26 < 112; local26++) {
					Static7.aBooleanArray15[local26] = false;
				}
				Static192.anInt3974 = Static65.anInt1370;
			}
			Static132.anInt2866 = Static60.anInt1269;
		}
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(BIIII)V")
	public static void method2615(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static185.anInt3845++;
		Static12.method224(true);
		Static115.method1779(true);
		Static12.method224(false);
		Static115.method1779(false);
		Static15.method240();
		Static97.method1589();
		@Pc(34) int local34;
		@Pc(40) int local40;
		if (!Static162.aBoolean147) {
			local34 = Static202.anInt4179;
			local40 = Static39.anInt4448 + Static203.anInt4219 & 0x7FF;
			if (local34 < Static152.anInt3230 / 256) {
				local34 = Static152.anInt3230 / 256;
			}
			if (Static83.aBooleanArray10[4] && Static62.anIntArray102[4] + 128 > local34) {
				local34 = Static62.anIntArray102[4] + 128;
			}
			Static7.method1725(local34, Static175.method2548(Static186.aClass7_Sub2_Sub2_1.anInt3085, Static126.anInt2806, Static186.aClass7_Sub2_Sub2_1.anInt3046) - 50, Static169.anInt3578, local34 * 3 + 600, Static17.anInt446, arg1, local40);
		}
		if (Static162.aBoolean147) {
			local34 = Static181.method2622();
		} else {
			local34 = Static24.method432();
		}
		local40 = Static42.anInt4286;
		@Pc(109) int local109 = Static29.anInt721;
		@Pc(111) int local111 = Static127.anInt2813;
		@Pc(113) int local113 = Static58.anInt1153;
		@Pc(115) int local115 = Static207.anInt4292;
		@Pc(158) int local158;
		for (@Pc(117) int local117 = 0; local117 < 5; local117++) {
			if (Static83.aBooleanArray10[local117]) {
				local158 = (int) ((double) (Static190.anIntArray363[local117] * 2 + 1) * Math.random() - (double) Static190.anIntArray363[local117] + Math.sin((double) Static196.anIntArray369[local117] / 100.0D * (double) Static173.anIntArray317[local117]) * (double) Static62.anIntArray102[local117]);
				if (local117 == 1) {
					Static127.anInt2813 += local158;
				}
				if (local117 == 2) {
					Static29.anInt721 += local158;
				}
				if (local117 == 4) {
					Static58.anInt1153 += local158;
					if (Static58.anInt1153 < 128) {
						Static58.anInt1153 = 128;
					}
					if (Static58.anInt1153 > 383) {
						Static58.anInt1153 = 383;
					}
				}
				if (local117 == 0) {
					Static42.anInt4286 += local158;
				}
				if (local117 == 3) {
					Static207.anInt4292 = local158 + Static207.anInt4292 & 0x7FF;
				}
			}
		}
		Static212.method3095(arg3, arg2, arg0 + arg3, arg1 + arg2);
		Static45.method700();
		local158 = Static163.anInt3446;
		@Pc(228) int local228 = Static32.anInt773;
		if (local158 >= arg3 && arg3 + arg0 > local158 && arg2 <= local228 && arg1 + arg2 > local228) {
			Static125.anInt2768 = 0;
			Static131.aBoolean65 = true;
			@Pc(258) int local258 = Static34.anInt822;
			@Pc(260) int local260 = Static14.anInt340;
			Static73.anInt1498 = (Static163.anInt3446 - arg3) * (local258 - local260) / arg0 + local260;
			@Pc(275) int local275 = Static131.anInt1516;
			@Pc(277) int local277 = Static143.anInt3031;
			Static5.anInt168 = local275 + (local277 - local275) * (Static32.anInt773 - arg2) / arg1;
		} else {
			Static131.aBoolean65 = false;
			Static125.anInt2768 = 0;
		}
		Static8.method148();
		Static212.method3103(arg3, arg2, arg0, arg1, 0);
		Static24.method434(Static42.anInt4286, Static127.anInt2813, Static29.anInt721, Static58.anInt1153, Static207.anInt4292, local34);
		Static8.method148();
		Static210.method3078();
		Static158.method2344(arg2, arg3, arg1, arg0);
		Static122.method1922(arg1, arg2, arg3, arg0);
		((Class77) Static45.anInterface3_1).method2301(Static103.anInt2221);
		method2616(arg3, arg2, arg0, arg1);
		Static58.anInt1153 = local113;
		Static127.anInt2813 = local111;
		Static29.anInt721 = local109;
		Static42.anInt4286 = local40;
		Static207.anInt4292 = local115;
		if (Static173.aBoolean158 && Static147.method2200() == 0) {
			Static173.aBoolean158 = false;
		}
		if (Static173.aBoolean158) {
			Static212.method3103(arg3, arg2, arg0, arg1, 0);
			Static175.method2549(Static17.aClass62_132, false);
		}
		if (!Static173.aBoolean158 && !aBoolean167 && arg3 <= local158 && arg3 + arg0 > local158 && arg2 <= local228 && arg2 + arg1 > local228) {
			Static10.method176(arg1, arg3, arg0, arg2, local158, local228);
		}
	}

	@OriginalMember(owner = "client!sh", name = "b", descriptor = "(BIIII)V")
	private static void method2616(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static134.anInt2872 == 1) {
			Static43.aClass2_Sub1_Sub2Array5[Static174.anInt3693 / 100].method280(Static81.anInt4472 - 8, Static113.anInt2471 + -8);
		}
		if (Static134.anInt2872 == 2) {
			Static43.aClass2_Sub1_Sub2Array5[Static174.anInt3693 / 100 + 4].method280(Static81.anInt4472 - 8, Static113.anInt2471 + -8);
		}
		Static59.method820();
		if (!Static137.aBoolean126) {
			return;
		}
		@Pc(54) int local54 = arg0 + 507;
		@Pc(58) int local58 = arg1 + 20;
		Static13.aClass2_Sub1_Sub12_2.method1374(Static169.method2460(new Class62[] { Static130.aClass62_993, Static119.method1865(Static165.anInt3491) }), local54, local58, 16776960, -1);
		@Pc(79) int local79 = local58 + 15;
		@Pc(81) int local81 = 16776960;
		@Pc(83) Runtime local83 = Runtime.getRuntime();
		@Pc(93) int local93 = (int) ((local83.totalMemory() - local83.freeMemory()) / 1024L);
		if (local93 > 32768 && Static60.aBoolean52) {
			local81 = 16711680;
		}
		if (local93 > 65536 && !Static60.aBoolean52) {
			local81 = 16711680;
		}
		Static13.aClass2_Sub1_Sub12_2.method1374(Static169.method2460(new Class62[] { Static28.aClass62_207, Static119.method1865(local93), Static50.aClass62_348 }), local54, local79, local81, -1);
		local58 = local79 + 15;
	}

	@OriginalMember(owner = "client!sh", name = "c", descriptor = "(I)V")
	public static void method2618() {
		System.out.println("Usage: worldid, [live/office/local], [live/rc/wip], [lowmem/highmem], [free/members], [english/german], [game0/game1]");
		System.exit(1);
	}
}
