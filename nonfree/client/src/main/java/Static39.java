import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static39 {

	@OriginalMember(owner = "client!g", name = "q", descriptor = "Lclient!kd;")
	private static Class39 aClass39_553 = Static108.method1915("Starting game engine)3)3)3");

	@OriginalMember(owner = "client!g", name = "a", descriptor = "Lclient!kd;")
	public static Class39 aClass39_547 = aClass39_553;

	@OriginalMember(owner = "client!g", name = "d", descriptor = "Lclient!kd;")
	private static Class39 aClass39_548 = Static108.method1915("Please subscribe)1 or use a different world)3");

	@OriginalMember(owner = "client!g", name = "f", descriptor = "Lclient!kd;")
	public static Class39 aClass39_549 = aClass39_548;

	@OriginalMember(owner = "client!g", name = "m", descriptor = "Lclient!kd;")
	private static Class39 aClass39_552 = Static108.method1915("Public chat");

	@OriginalMember(owner = "client!g", name = "h", descriptor = "Lclient!kd;")
	public static Class39 aClass39_550 = aClass39_552;

	@OriginalMember(owner = "client!g", name = "l", descriptor = "Lclient!kd;")
	public static Class39 aClass39_551 = Static108.method1915("backvmid3");

	@OriginalMember(owner = "client!g", name = "n", descriptor = "I")
	public static int anInt1165 = 0;

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(Z)V")
	public static void method695() {
		aClass39_550 = null;
		aClass39_547 = null;
		aClass39_551 = null;
		aClass39_553 = null;
		aClass39_549 = null;
		aClass39_552 = null;
		aClass39_548 = null;
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(IZ)Lclient!id;")
	public static Class1_Sub1_Sub11 method696(@OriginalArg(0) int arg0) {
		@Pc(17) Class1_Sub1_Sub11 local17 = (Class1_Sub1_Sub11) Static63.aClass33_23.method1038((long) arg0);
		if (local17 != null) {
			return local17;
		}
		@Pc(27) byte[] local27 = Static75.aClass62_Sub1_50.method2008(0, arg0);
		if (local27 == null) {
			return null;
		}
		local17 = new Class1_Sub1_Sub11();
		@Pc(40) Class1_Sub18 local40 = new Class1_Sub18(local27);
		@Pc(42) int local42 = 0;
		local40.anInt3078 = local40.aByteArray96.length - 12;
		@Pc(53) int local53 = local40.method2185();
		local17.anInt1494 = local40.method2156();
		local17.anInt1490 = local40.method2156();
		local17.anInt1495 = local40.method2156();
		local17.anInt1486 = local40.method2156();
		local40.anInt3078 = 0;
		local17.anIntArray211 = new int[local53];
		local17.aClass39Array14 = new Class39[local53];
		local17.anIntArray212 = new int[local53];
		while (local40.aByteArray96.length - 12 > local40.anInt3078) {
			@Pc(94) int local94 = local40.method2156();
			if (local94 == 3) {
				local17.aClass39Array14[local42] = local40.method2139();
			} else if (local94 >= 100 || local94 == 21 || local94 == 38 || local94 == 39) {
				local17.anIntArray212[local42] = local40.method2169();
			} else {
				local17.anIntArray212[local42] = local40.method2185();
			}
			local17.anIntArray211[local42++] = local94;
		}
		Static63.aClass33_23.method1042(local17, (long) arg0);
		return local17;
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(ILclient!r;BI)V")
	public static void method698(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub2_Sub1_Sub2 arg1, @OriginalArg(3) int arg2) {
		@Pc(9) int local9;
		@Pc(13) int local13;
		if ((arg2 & 0x40) != 0) {
			local9 = Static79.aClass1_Sub18_Sub1_3.method2156();
			local13 = Static79.aClass1_Sub18_Sub1_3.method2169();
			@Pc(17) int local17 = Static79.aClass1_Sub18_Sub1_3.method2174();
			@Pc(20) int local20 = Static79.aClass1_Sub18_Sub1_3.anInt3078;
			if (arg1.aClass39_1234 != null && arg1.aClass28_1 != null) {
				@Pc(31) long local31 = arg1.aClass39_1234.method1186();
				@Pc(33) boolean local33 = false;
				if (local13 <= 1) {
					for (@Pc(40) int local40 = 0; local40 < Static108.anInt2750; local40++) {
						if (Static88.aLongArray4[local40] == local31) {
							local33 = true;
							break;
						}
					}
				}
				if (!local33 && Static30.anInt1002 == 0) {
					Static118.aClass1_Sub18_5.anInt3078 = 0;
					Static79.aClass1_Sub18_Sub1_3.method2152(local17, Static118.aClass1_Sub18_5.aByteArray96);
					Static118.aClass1_Sub18_5.anInt3078 = 0;
					@Pc(83) Class39 local83 = Static42.method744(Static99.method1757(Static118.aClass1_Sub18_5).method1168());
					arg1.aClass39_1226 = local83.method1183();
					arg1.anInt2501 = local9 >> 8;
					arg1.anInt2498 = 150;
					arg1.anInt2513 = local9 & 0xFF;
					if (local13 == 2 || local13 == 3) {
						Static66.method1189(Static30.method601(new Class39[] { Static38.aClass39_534, arg1.aClass39_1234 }), local83, 1);
					} else if (local13 == 1) {
						Static66.method1189(Static30.method601(new Class39[] { Static112.aClass39_1343, arg1.aClass39_1234 }), local83, 1);
					} else {
						Static66.method1189(arg1.aClass39_1234, local83, 2);
					}
				}
			}
			Static79.aClass1_Sub18_Sub1_3.anInt3078 = local20 + local17;
		}
		if ((arg2 & 0x400) != 0) {
			arg1.anInt2535 = Static79.aClass1_Sub18_Sub1_3.method2141();
			local9 = Static79.aClass1_Sub18_Sub1_3.method2137();
			if (arg1.anInt2535 == 65535) {
				arg1.anInt2535 = -1;
			}
			arg1.anInt2519 = 0;
			arg1.anInt2506 = 0;
			arg1.anInt2497 = local9 >> 16;
			arg1.anInt2493 = (local9 & 0xFFFF) + Static45.anInt1256;
			if (arg1.anInt2493 > Static45.anInt1256) {
				arg1.anInt2506 = -1;
			}
		}
		if ((arg2 & 0x80) != 0) {
			arg1.anInt2530 = Static79.aClass1_Sub18_Sub1_3.method2141();
			arg1.anInt2479 = Static79.aClass1_Sub18_Sub1_3.method2156();
		}
		if ((arg2 & 0x4) != 0) {
			arg1.aClass39_1226 = Static79.aClass1_Sub18_Sub1_3.method2139();
			if (arg1.aClass39_1226.method1167(0) == 126) {
				arg1.aClass39_1226 = arg1.aClass39_1226.method1181(1);
				Static66.method1189(arg1.aClass39_1234, arg1.aClass39_1226, 2);
			} else if (Static65.aClass1_Sub1_Sub2_Sub1_Sub2_1 == arg1) {
				Static66.method1189(arg1.aClass39_1234, arg1.aClass39_1226, 2);
			}
			arg1.anInt2513 = 0;
			arg1.anInt2501 = 0;
			arg1.anInt2498 = 150;
		}
		if ((arg2 & 0x1) != 0) {
			arg1.anInt2510 = Static79.aClass1_Sub18_Sub1_3.method2156();
			if (arg1.anInt2510 == 65535) {
				arg1.anInt2510 = -1;
			}
		}
		if ((arg2 & 0x100) != 0) {
			local9 = Static79.aClass1_Sub18_Sub1_3.method2171();
			local13 = Static79.aClass1_Sub18_Sub1_3.method2171();
			arg1.method1795(Static45.anInt1256, local13, local9);
			arg1.anInt2477 = Static45.anInt1256 + 300;
			arg1.anInt2484 = Static79.aClass1_Sub18_Sub1_3.method2171();
			arg1.anInt2476 = Static79.aClass1_Sub18_Sub1_3.method2169();
		}
		if ((arg2 & 0x200) != 0) {
			arg1.anInt2522 = Static79.aClass1_Sub18_Sub1_3.method2169();
			arg1.anInt2532 = Static79.aClass1_Sub18_Sub1_3.method2171();
			arg1.anInt2481 = Static79.aClass1_Sub18_Sub1_3.method2174();
			arg1.anInt2528 = Static79.aClass1_Sub18_Sub1_3.method2169();
			arg1.anInt2490 = Static79.aClass1_Sub18_Sub1_3.method2141() + Static45.anInt1256;
			arg1.anInt2502 = Static79.aClass1_Sub18_Sub1_3.method2141() + Static45.anInt1256;
			arg1.anInt2523 = Static79.aClass1_Sub18_Sub1_3.method2150();
			arg1.anInt2482 = 0;
			arg1.anInt2527 = 1;
		}
		if ((arg2 & 0x10) != 0) {
			local9 = Static79.aClass1_Sub18_Sub1_3.method2146();
			if (local9 == 65535) {
				local9 = -1;
			}
			local13 = Static79.aClass1_Sub18_Sub1_3.method2174();
			Static105.method1877(arg1, local9, local13);
		}
		if ((arg2 & 0x8) != 0) {
			local9 = Static79.aClass1_Sub18_Sub1_3.method2174();
			local13 = Static79.aClass1_Sub18_Sub1_3.method2171();
			arg1.method1795(Static45.anInt1256, local13, local9);
			arg1.anInt2477 = Static45.anInt1256 + 300;
			arg1.anInt2484 = Static79.aClass1_Sub18_Sub1_3.method2171();
			arg1.anInt2476 = Static79.aClass1_Sub18_Sub1_3.method2150();
		}
		if ((arg2 & 0x2) == 0) {
			return;
		}
		local9 = Static79.aClass1_Sub18_Sub1_3.method2150();
		@Pc(472) byte[] local472 = new byte[local9];
		@Pc(477) Class1_Sub18 local477 = new Class1_Sub18(local472);
		Static79.aClass1_Sub18_Sub1_3.method2152(local9, local472);
		Static35.aClass1_Sub18Array1[arg0] = local477;
		arg1.method1804(local477);
	}
}
