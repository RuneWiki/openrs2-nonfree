import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static168 {

	@OriginalMember(owner = "client!sb", name = "E", descriptor = "Lclient!s;")
	public static final Class87 aClass87_25 = new Class87();

	@OriginalMember(owner = "client!sb", name = "Q", descriptor = "I")
	public static int anInt3728 = 0;

	@OriginalMember(owner = "client!sb", name = "W", descriptor = "I")
	public static int anInt3732 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!sb", name = "gb", descriptor = "[[I")
	public static final int[][] anIntArrayArray30 = new int[][] { new int[16], { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

	@OriginalMember(owner = "client!sb", name = "Fb", descriptor = "Lclient!dj;")
	private static final Class24 aClass24_1079 = Static81.method1507("Loaded wordpack");

	@OriginalMember(owner = "client!sb", name = "xb", descriptor = "Lclient!dj;")
	public static Class24 aClass24_1078 = aClass24_1079;

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "(III)I")
	public static int method2876(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = 0;
		while (arg0 > 0) {
			arg0--;
			local7 = local7 << 1 | arg1 & 0x1;
			arg1 >>>= 0x1;
		}
		return local7;
	}

	@OriginalMember(owner = "client!sb", name = "c", descriptor = "(II)Lclient!ud;")
	public static Class1_Sub2_Sub23 method2886(@OriginalArg(1) int arg0) {
		@Pc(10) Class1_Sub2_Sub23 local10 = (Class1_Sub2_Sub23) Static36.aClass86_12.method2816((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(24) byte[] local24 = Static110.aClass69_26.method2208(Static183.method3170(arg0), Static119.method2024(arg0));
		local10 = new Class1_Sub2_Sub23();
		local10.anInt4234 = arg0;
		if (local24 != null) {
			local10.method3259(new Class1_Sub7(local24));
		}
		local10.method3255();
		if (local10.anInt4221 != -1) {
			local10.method3245(method2886(local10.anInt4221), method2886(local10.anInt4198));
		}
		if (local10.anInt4223 != -1) {
			local10.method3246(method2886(local10.anInt4223), method2886(local10.anInt4205));
		}
		if (!Static130.aBoolean136 && local10.aBoolean197) {
			local10.aClass24Array25 = null;
			local10.aClass24_1214 = Static175.aClass24_1128;
			local10.aBoolean198 = false;
			local10.aClass24Array24 = null;
			local10.anInt4200 = 0;
		}
		Static36.aClass86_12.method2821(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lclient!ua;B)V")
	public static void method2891(@OriginalArg(0) Applet_Sub1 arg0) {
		if (Static122.aBoolean123) {
			Static131.method2260(arg0);
			return;
		}
		if (Static170.anInt3792 == 1 && Static157.anInt3462 >= 715 && Static92.anInt2141 >= 453) {
			Static92.aBoolean104 = !Static92.aBoolean104;
			if (Static92.aBoolean104) {
				Static144.method2512();
			} else {
				Static155.method2245(255, Static157.anInt3468, Static186.aClass69_Sub1_26);
			}
		}
		if (Static160.anInt4679 == 5) {
			return;
		}
		Static184.anInt4128++;
		if (Static160.anInt4679 != 10) {
			return;
		}
		if (Static83.anInt2000 != 2) {
			if (Static170.anInt3792 == 1 && Static157.anInt3462 >= 5 && Static157.anInt3462 <= 105 && Static92.anInt2141 >= 463 && Static92.anInt2141 <= 498) {
				Static123.method2075();
				return;
			}
			if (Static100.aClass89_1 != null) {
				Static123.method2075();
			}
		}
		@Pc(101) int local101 = Static170.anInt3792;
		@Pc(103) int local103 = Static157.anInt3462;
		@Pc(105) int local105 = Static92.anInt2141;
		if (Static106.anInt2402 == 0) {
			@Pc(501) boolean local501 = false;
			if (local101 == 1 && local103 >= 227 && local103 <= 377 && local105 >= 271 && local105 <= 311) {
				Static85.anInt3409 = 0;
				Static106.anInt2402 = 3;
			}
			if (Static212.anInt4707 != 0) {
				while (Static28.method547()) {
					if (Static122.anInt2710 == 84) {
						local501 = true;
						break;
					}
				}
			}
			if (local501 || local101 == 1 && local103 >= 387 && local103 <= 537 && local105 >= 271 && local105 <= 311) {
				Static106.anInt2402 = 2;
				Static85.anInt3409 = 0;
				Static159.aClass24_1029 = Static69.aClass24_488;
				Static159.aClass24_1033 = Static69.aClass24_495;
				Static159.aClass24_1034 = Static110.aClass24_745;
			}
		} else if (Static106.anInt2402 == 2) {
			@Pc(119) short local119 = 231;
			@Pc(120) int local120 = local119 + 30;
			if (local101 == 1 && local105 >= 246 && local105 < 261) {
				Static85.anInt3409 = 0;
			}
			local120 += 15;
			if (local101 == 1 && local105 >= 261 && local105 < 276) {
				Static85.anInt3409 = 1;
			}
			local120 += 15;
			if (local101 == 1 && local103 >= 227 && local103 <= 377 && local105 >= 301 && local105 <= 341) {
				Static159.aClass24_1036 = Static159.aClass24_1036.method758().method761();
				if (Static159.aClass24_1036.method781() == 0) {
					Static167.method2843(Static69.aClass24_491, Static64.aClass24_462, Static69.aClass24_508);
					return;
				}
				if (Static159.aClass24_1031.method781() == 0) {
					Static167.method2843(Static69.aClass24_496, Static193.aClass24_1238, Static69.aClass24_485);
					return;
				}
				Static167.method2843(Static69.aClass24_516, Static192.aClass24_1232, Static69.aClass24_504);
				Static57.method1099(20);
				return;
			}
			if (local101 == 1 && local103 >= 387 && local103 <= 537 && local105 >= 301 && local105 <= 341) {
				Static159.aClass24_1031 = Static159.aClass24_1035;
				Static106.anInt2402 = 0;
				Static159.aClass24_1036 = Static159.aClass24_1035;
			}
			while (true) {
				@Pc(274) boolean local274;
				label223: do {
					while (Static28.method547()) {
						local274 = false;
						for (@Pc(276) int local276 = 0; local276 < Static159.aClass24_1032.method781(); local276++) {
							if (Static60.anInt3600 == Static159.aClass24_1032.method743(local276)) {
								local274 = true;
								break;
							}
						}
						if (Static85.anInt3409 != 0) {
							continue label223;
						}
						if (Static122.anInt2710 == 85 && Static159.aClass24_1036.method781() > 0) {
							Static159.aClass24_1036 = Static159.aClass24_1036.method759(Static159.aClass24_1036.method781() - 1, 0);
						}
						if (Static122.anInt2710 == 84 || Static122.anInt2710 == 80) {
							Static85.anInt3409 = 1;
						}
						if (local274 && Static159.aClass24_1036.method781() < 12) {
							Static159.aClass24_1036 = Static159.aClass24_1036.method779(Static60.anInt3600);
						}
					}
					return;
				} while (Static85.anInt3409 != 1);
				if (Static122.anInt2710 == 85 && Static159.aClass24_1031.method781() > 0) {
					Static159.aClass24_1031 = Static159.aClass24_1031.method759(Static159.aClass24_1031.method781() - 1, 0);
				}
				if (Static122.anInt2710 == 84 || Static122.anInt2710 == 80) {
					Static85.anInt3409 = 0;
				}
				if (Static212.anInt4707 != 0 && Static122.anInt2710 == 84) {
					Static159.aClass24_1036 = Static159.aClass24_1036.method758().method761();
					if (Static159.aClass24_1036.method781() == 0) {
						Static167.method2843(Static69.aClass24_491, Static64.aClass24_462, Static69.aClass24_508);
						return;
					}
					if (Static159.aClass24_1031.method781() == 0) {
						Static167.method2843(Static69.aClass24_496, Static193.aClass24_1238, Static69.aClass24_485);
						return;
					}
					Static167.method2843(Static69.aClass24_516, Static192.aClass24_1232, Static69.aClass24_504);
					Static57.method1099(20);
					return;
				}
				if (local274 && Static159.aClass24_1031.method781() < 20) {
					Static159.aClass24_1031 = Static159.aClass24_1031.method779(Static60.anInt3600);
				}
			}
		} else if (Static106.anInt2402 == 3 && local101 == 1 && local103 >= 307 && local103 <= 457 && local105 >= 301 && local105 <= 341) {
			Static106.anInt2402 = 0;
		}
	}
}
