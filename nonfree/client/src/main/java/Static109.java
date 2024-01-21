import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static109 {

	@OriginalMember(owner = "client!ne", name = "Q", descriptor = "I")
	public static int anInt2491 = 0;

	@OriginalMember(owner = "client!ne", name = "R", descriptor = "[I")
	public static int[] anIntArray255 = new int[100];

	@OriginalMember(owner = "client!ne", name = "S", descriptor = "I")
	public static final int anInt2492 = 0;

	@OriginalMember(owner = "client!ne", name = "X", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1091 = Static51.method932("(U0a )2 non)2existant gosub script)2num: ");

	@OriginalMember(owner = "client!ne", name = "cb", descriptor = "I")
	public static int anInt2501 = 0;

	@OriginalMember(owner = "client!ne", name = "db", descriptor = "[Lclient!nf;")
	public static Class56[] aClass56Array1 = new Class56[50];

	@OriginalMember(owner = "client!ne", name = "eb", descriptor = "I")
	public static int anInt2502 = 0;

	@OriginalMember(owner = "client!ne", name = "f", descriptor = "(I)V")
	public static void method1748() {
		@Pc(9) int local9 = Static167.anInt2050 * 128 + 64;
		@Pc(15) int local15 = Static136.anInt3018 * 128 + 64;
		@Pc(23) int local23 = Static178.method2702(local15, local9, Static56.anInt1432) - Static119.anInt2709;
		if (local23 > Static110.anInt2509) {
			Static110.anInt2509 += (local23 - Static110.anInt2509) * Static117.anInt2676 / 1000 + Static74.anInt2921;
			if (Static110.anInt2509 > local23) {
				Static110.anInt2509 = local23;
			}
		}
		if (Static107.anInt2447 < local9) {
			Static107.anInt2447 += Static117.anInt2676 * (local9 - Static107.anInt2447) / 1000 + Static74.anInt2921;
			if (local9 < Static107.anInt2447) {
				Static107.anInt2447 = local9;
			}
		}
		if (Static104.anInt2384 < local15) {
			Static104.anInt2384 += Static74.anInt2921 + Static117.anInt2676 * (local15 - Static104.anInt2384) / 1000;
			if (local15 < Static104.anInt2384) {
				Static104.anInt2384 = local15;
			}
		}
		if (local9 < Static107.anInt2447) {
			Static107.anInt2447 -= Static74.anInt2921 + (Static107.anInt2447 - local9) * Static117.anInt2676 / 1000;
			if (local9 > Static107.anInt2447) {
				Static107.anInt2447 = local9;
			}
		}
		if (local15 < Static104.anInt2384) {
			Static104.anInt2384 -= Static74.anInt2921 + Static117.anInt2676 * (Static104.anInt2384 - local15) / 1000;
			if (local15 > Static104.anInt2384) {
				Static104.anInt2384 = local15;
			}
		}
		if (Static110.anInt2509 > local23) {
			Static110.anInt2509 -= Static117.anInt2676 * (Static110.anInt2509 - local23) / 1000 + Static74.anInt2921;
			if (Static110.anInt2509 < local23) {
				Static110.anInt2509 = local23;
			}
		}
		local15 = Static46.anInt1141 * 128 + 64;
		local9 = Static46.anInt1136 * 128 + 64;
		local23 = Static178.method2702(local15, local9, Static56.anInt1432) - Static28.anInt785;
		@Pc(208) int local208 = local15 - Static104.anInt2384;
		@Pc(213) int local213 = local23 - Static110.anInt2509;
		@Pc(218) int local218 = local9 - Static107.anInt2447;
		@Pc(229) int local229 = (int) Math.sqrt((double) (local218 * local218 + local208 * local208));
		@Pc(240) int local240 = (int) (Math.atan2((double) local213, (double) local229) * 325.949D) & 0x7FF;
		if (local240 < 128) {
			local240 = 128;
		}
		@Pc(256) int local256 = (int) (Math.atan2((double) local218, (double) local208) * -325.949D) & 0x7FF;
		if (local240 > 383) {
			local240 = 383;
		}
		if (Static95.anInt2250 < local240) {
			Static95.anInt2250 += Static176.anInt3789 + Static24.anInt555 * (local240 - Static95.anInt2250) / 1000;
			if (Static95.anInt2250 > local240) {
				Static95.anInt2250 = local240;
			}
		}
		@Pc(293) int local293 = local256 - Static161.anInt3427;
		if (local240 < Static95.anInt2250) {
			Static95.anInt2250 -= (Static95.anInt2250 - local240) * Static24.anInt555 / 1000 + Static176.anInt3789;
			if (local240 > Static95.anInt2250) {
				Static95.anInt2250 = local240;
			}
		}
		if (local293 > 1024) {
			local293 -= 2048;
		}
		if (local293 < -1024) {
			local293 += 2048;
		}
		if (local293 > 0) {
			Static161.anInt3427 += local293 * Static24.anInt555 / 1000 + Static176.anInt3789;
			Static161.anInt3427 &= 0x7FF;
		}
		if (local293 < 0) {
			Static161.anInt3427 -= Static176.anInt3789 + -local293 * Static24.anInt555 / 1000;
			Static161.anInt3427 &= 0x7FF;
		}
		@Pc(370) int local370 = local256 - Static161.anInt3427;
		if (local370 > 1024) {
			local370 -= 2048;
		}
		if (local370 < -1024) {
			local370 += 2048;
		}
		if (local370 < 0 && local293 > 0 || local370 > 0 && local293 < 0) {
			Static161.anInt3427 = local256;
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(ILclient!bb;)V")
	public static void method1749(@OriginalArg(1) Class2_Sub1_Sub3_Sub2 arg0) {
		if (arg0.anInt3463 == 0) {
			arg0.anInt3465 = 1024;
		}
		arg0.anInt3506 = 0;
		@Pc(20) int local20 = arg0.anInt3461 - Static14.anInt386;
		if (arg0.anInt3463 == 1) {
			arg0.anInt3465 = 1536;
		}
		if (arg0.anInt3463 == 2) {
			arg0.anInt3465 = 0;
		}
		@Pc(53) int local53 = arg0.anInt3467 * 64 + arg0.anInt3453 * 128;
		if (arg0.anInt3463 == 3) {
			arg0.anInt3465 = 512;
		}
		arg0.anInt3454 += (local53 - arg0.anInt3454) / local20;
		@Pc(83) int local83 = arg0.anInt3492 * 128 + arg0.anInt3467 * 64;
		arg0.anInt3499 += (local83 - arg0.anInt3499) / local20;
	}

	@OriginalMember(owner = "client!ne", name = "g", descriptor = "(I)V")
	public static void method1750() {
		aClass10_1091 = null;
		anIntArray255 = null;
		aClass56Array1 = null;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(IB)V")
	public static void method1751() {
		Static83.anInt1906 = -1;
		Static168.anInt3655 = 1;
		Static111.aClass29_49 = null;
		Static92.aBoolean91 = false;
		Static55.anInt1427 = -1;
		Static70.anInt1667 = 0;
		Static123.anInt2781 = 2;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(ZI)V")
	public static void method1752(@OriginalArg(0) boolean arg0) {
		if (Static119.aClass2_Sub1_Sub3_Sub2_Sub1_1.anInt3454 >> 7 == anInt2502 && Static119.aClass2_Sub1_Sub3_Sub2_Sub1_1.anInt3499 >> 7 == Static40.anInt979) {
			anInt2502 = 0;
		}
		@Pc(34) int local34 = Static54.anInt1354;
		if (arg0) {
			local34 = 1;
		}
		for (@Pc(40) int local40 = 0; local40 < local34; local40++) {
			@Pc(46) Class2_Sub1_Sub3_Sub2_Sub1 local46;
			@Pc(48) int local48;
			if (arg0) {
				local46 = Static119.aClass2_Sub1_Sub3_Sub2_Sub1_1;
				local48 = 33538048;
			} else {
				local48 = Static66.anIntArray175[local40] << 14;
				local46 = Static86.aClass2_Sub1_Sub3_Sub2_Sub1Array1[Static66.anIntArray175[local40]];
			}
			if (local46 != null && local46.method2467()) {
				@Pc(73) int local73 = local46.anInt3454 >> 7;
				local46.aBoolean54 = false;
				if ((Static170.aBoolean163 && Static54.anInt1354 > 50 || Static54.anInt1354 > 200) && !arg0 && local46.anInt3487 == local46.anInt3479) {
					local46.aBoolean54 = true;
				}
				@Pc(101) int local101 = local46.anInt3499 >> 7;
				if (local73 >= 0 && local73 < 104 && local101 >= 0 && local101 < 104) {
					if (local46.aClass2_Sub1_Sub3_Sub3_1 == null || Static14.anInt386 < local46.anInt1343 || Static14.anInt386 >= local46.anInt1329) {
						if ((local46.anInt3454 & 0x7F) == 64 && (local46.anInt3499 & 0x7F) == 64) {
							if (Static10.anIntArrayArray2[local73][local101] == Static115.anInt2612) {
								continue;
							}
							Static10.anIntArrayArray2[local73][local101] = Static115.anInt2612;
						}
						local46.anInt1332 = Static178.method2702(local46.anInt3499, local46.anInt3454, Static56.anInt1432);
						Static180.aClass60_1.method1812(Static56.anInt1432, local46.anInt3454, local46.anInt3499, local46.anInt1332, 60, local46, local46.anInt3489, local48, local46.aBoolean154);
					} else {
						local46.aBoolean54 = false;
						local46.anInt1332 = Static178.method2702(local46.anInt3499, local46.anInt3454, Static56.anInt1432);
						Static180.aClass60_1.method1817(Static56.anInt1432, local46.anInt3454, local46.anInt3499, local46.anInt1332, local46, local46.anInt3489, local48, local46.anInt1347, local46.anInt1330, local46.anInt1340, local46.anInt1341);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ne", name = "h", descriptor = "(I)V")
	public static void method1753() {
		@Pc(1) Object local1 = Static57.anObject3;
		synchronized (Static57.anObject3) {
			if (Static129.anInt2882 != 0) {
				Static129.anInt2882 = 1;
				try {
					Static57.anObject3.wait();
				} catch (@Pc(14) InterruptedException local14) {
				}
			}
		}
	}
}
