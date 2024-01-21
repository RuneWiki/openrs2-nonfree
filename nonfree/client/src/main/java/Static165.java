import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static165 {

	@OriginalMember(owner = "client!te", name = "S", descriptor = "Lclient!hb;")
	public static Class28 aClass28_4;

	@OriginalMember(owner = "client!te", name = "cb", descriptor = "Lclient!dd;")
	private static Class13 aClass13_1347 = Static161.method2971("Loading textures )2 ");

	@OriginalMember(owner = "client!te", name = "P", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1343 = aClass13_1347;

	@OriginalMember(owner = "client!te", name = "Q", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1344 = Static161.method2971("Freie Welt");

	@OriginalMember(owner = "client!te", name = "T", descriptor = "I")
	public static int anInt3887 = 0;

	@OriginalMember(owner = "client!te", name = "U", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1345 = Static161.method2971("Schlie-8en");

	@OriginalMember(owner = "client!te", name = "X", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1346 = Static161.method2971("VOLL");

	@OriginalMember(owner = "client!te", name = "Z", descriptor = "I")
	public static int anInt3891 = 0;

	@OriginalMember(owner = "client!te", name = "b", descriptor = "(BI)Lclient!dd;")
	public static Class13 method2826(@OriginalArg(1) int arg0) {
		return arg0 < 999999999 ? Static3.method75(arg0) : Static130.aClass13_1097;
	}

	@OriginalMember(owner = "client!te", name = "b", descriptor = "(II)Lclient!tc;")
	public static Class1_Sub2_Sub19 method2827(@OriginalArg(1) int arg0) {
		@Pc(10) Class1_Sub2_Sub19 local10 = (Class1_Sub2_Sub19) Static173.aClass47_31.method1999((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static52.aClass4_47.method2243(9, arg0);
		local10 = new Class1_Sub2_Sub19();
		local10.anInt3854 = arg0;
		if (local20 != null) {
			local10.method2802(new Class1_Sub8(local20));
		}
		local10.method2799();
		Static173.aClass47_31.method1998(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(IILclient!kd;Z)V")
	public static void method2828(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub2_Sub2_Sub2_Sub2 arg2) {
		@Pc(9) int local9;
		@Pc(13) int local13;
		if ((arg0 & 0x2) != 0) {
			local9 = Static153.aClass1_Sub8_Sub1_2.method1638();
			local13 = Static153.aClass1_Sub8_Sub1_2.method1638();
			arg2.method1887(local9, local13, Static78.anInt2168);
			arg2.anInt2558 = Static78.anInt2168 + 300;
			arg2.anInt2563 = Static153.aClass1_Sub8_Sub1_2.method1600();
		}
		if ((arg0 & 0x4) != 0) {
			local9 = Static153.aClass1_Sub8_Sub1_2.method1603();
			@Pc(44) byte[] local44 = new byte[local9];
			@Pc(49) Class1_Sub8 local49 = new Class1_Sub8(local44);
			Static153.aClass1_Sub8_Sub1_2.method1641(local44, local9);
			Static134.aClass1_Sub8Array1[arg1] = local49;
			arg2.method1894(local49);
		}
		if ((arg0 & 0x1) != 0) {
			arg2.anInt2575 = Static153.aClass1_Sub8_Sub1_2.method1642();
			if (arg2.anInt2575 == 65535) {
				arg2.anInt2575 = -1;
			}
		}
		if ((arg0 & 0x100) != 0) {
			local9 = Static153.aClass1_Sub8_Sub1_2.method1600();
			local13 = Static153.aClass1_Sub8_Sub1_2.method1607();
			arg2.method1887(local9, local13, Static78.anInt2168);
		}
		if ((arg0 & 0x40) != 0) {
			arg2.anInt2591 = Static153.aClass1_Sub8_Sub1_2.method1634();
			arg2.anInt2565 = Static153.aClass1_Sub8_Sub1_2.method1636();
		}
		if ((arg0 & 0x200) != 0) {
			arg2.anInt2595 = Static153.aClass1_Sub8_Sub1_2.method1638();
			arg2.anInt2592 = Static153.aClass1_Sub8_Sub1_2.method1638();
			arg2.anInt2548 = Static153.aClass1_Sub8_Sub1_2.method1600();
			arg2.anInt2578 = Static153.aClass1_Sub8_Sub1_2.method1607();
			arg2.anInt2588 = Static153.aClass1_Sub8_Sub1_2.method1634() + Static78.anInt2168;
			arg2.anInt2573 = Static153.aClass1_Sub8_Sub1_2.method1634() + Static78.anInt2168;
			arg2.anInt2601 = Static153.aClass1_Sub8_Sub1_2.method1607();
			arg2.anInt2586 = 1;
			arg2.anInt2572 = 0;
		}
		if ((arg0 & 0x20) != 0) {
			arg2.aClass13_846 = Static153.aClass1_Sub8_Sub1_2.method1622();
			if (arg2.aClass13_846.method898(0) == 126) {
				arg2.aClass13_846 = arg2.aClass13_846.method901(1);
				Static169.method2887(arg2.aClass13_847, arg2.aClass13_846, 2);
			} else if (Static64.aClass1_Sub2_Sub2_Sub2_Sub2_1 == arg2) {
				Static169.method2887(arg2.aClass13_847, arg2.aClass13_846, 2);
			}
			arg2.anInt2570 = 0;
			arg2.anInt2587 = 0;
			arg2.anInt2589 = 150;
		}
		if ((arg0 & 0x400) != 0) {
			arg2.anInt2603 = Static153.aClass1_Sub8_Sub1_2.method1642();
			local9 = Static153.aClass1_Sub8_Sub1_2.method1626();
			arg2.anInt2566 = 0;
			arg2.anInt2557 = Static78.anInt2168 + (local9 & 0xFFFF);
			arg2.anInt2569 = local9 >> 16;
			arg2.anInt2598 = 0;
			if (arg2.anInt2603 == 65535) {
				arg2.anInt2603 = -1;
			}
			if (arg2.anInt2557 > Static78.anInt2168) {
				arg2.anInt2598 = -1;
			}
		}
		if ((arg0 & 0x10) != 0) {
			local9 = Static153.aClass1_Sub8_Sub1_2.method1624();
			if (local9 == 65535) {
				local9 = -1;
			}
			local13 = Static153.aClass1_Sub8_Sub1_2.method1600();
			Static97.method3061(arg2, local13, local9);
		}
		if ((arg0 & 0x80) == 0) {
			return;
		}
		local9 = Static153.aClass1_Sub8_Sub1_2.method1636();
		local13 = Static153.aClass1_Sub8_Sub1_2.method1603();
		@Pc(323) int local323 = Static153.aClass1_Sub8_Sub1_2.method1600();
		@Pc(326) int local326 = Static153.aClass1_Sub8_Sub1_2.anInt2195;
		if (arg2.aClass13_847 != null && arg2.aClass6_2 != null) {
			@Pc(334) boolean local334 = false;
			@Pc(339) long local339 = arg2.aClass13_847.method878();
			if (local13 <= 1) {
				for (@Pc(344) int local344 = 0; local344 < Static124.anInt3220; local344++) {
					if (local339 == Static5.aLongArray1[local344]) {
						local334 = true;
						break;
					}
				}
			}
			if (!local334 && Static49.anInt1575 == 0) {
				Static2.aClass1_Sub8_1.anInt2195 = 0;
				Static153.aClass1_Sub8_Sub1_2.method1641(Static2.aClass1_Sub8_1.aByteArray27, local323);
				Static2.aClass1_Sub8_1.anInt2195 = 0;
				@Pc(387) Class13 local387 = Static177.method241(Static98.method2709(Static2.aClass1_Sub8_1).method914());
				arg2.aClass13_846 = local387.method897();
				arg2.anInt2570 = local9 >> 8;
				arg2.anInt2589 = 150;
				arg2.anInt2587 = local9 & 0xFF;
				if (local13 == 2 || local13 == 3) {
					Static169.method2887(Static57.method1349(new Class13[] { Static87.aClass13_819, arg2.aClass13_847 }), local387, 1);
				} else if (local13 == 1) {
					Static169.method2887(Static57.method1349(new Class13[] { Static41.aClass13_461, arg2.aClass13_847 }), local387, 1);
				} else {
					Static169.method2887(arg2.aClass13_847, local387, 2);
				}
			}
		}
		Static153.aClass1_Sub8_Sub1_2.anInt2195 = local323 + local326;
	}

	@OriginalMember(owner = "client!te", name = "e", descriptor = "(I)V")
	public static void method2829() {
		aClass13_1346 = null;
		aClass13_1345 = null;
		aClass13_1347 = null;
		aClass28_4 = null;
		aClass13_1344 = null;
		aClass13_1343 = null;
	}
}
