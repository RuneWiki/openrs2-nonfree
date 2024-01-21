import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static119 {

	@OriginalMember(owner = "client!uc", name = "r", descriptor = "Lclient!r;")
	public static Class3_Sub1_Sub2_Sub4 aClass3_Sub1_Sub2_Sub4_20;

	@OriginalMember(owner = "client!uc", name = "L", descriptor = "I")
	public static int anInt3239;

	@OriginalMember(owner = "client!uc", name = "M", descriptor = "I")
	public static int anInt3240;

	@OriginalMember(owner = "client!uc", name = "P", descriptor = "I")
	public static int anInt3243;

	@OriginalMember(owner = "client!uc", name = "t", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1363 = Static59.method1195("rot:");

	@OriginalMember(owner = "client!uc", name = "G", descriptor = "Lclient!la;")
	public static Class3_Sub12 aClass3_Sub12_8 = new Class3_Sub12(8);

	@OriginalMember(owner = "client!uc", name = "I", descriptor = "Z")
	public static boolean aBoolean118 = false;

	@OriginalMember(owner = "client!uc", name = "J", descriptor = "I")
	public static int anInt3238 = 0;

	@OriginalMember(owner = "client!uc", name = "N", descriptor = "I")
	public static int anInt3241 = 2;

	@OriginalMember(owner = "client!uc", name = "O", descriptor = "I")
	public static int anInt3242 = -1;

	@OriginalMember(owner = "client!uc", name = "c", descriptor = "(I)I")
	public static int method2147() {
		return 19;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(Z)V")
	public static void method2148() {
		try {
			if (Static104.anInt3014 == 1) {
				@Pc(15) int local15 = Static30.aClass3_Sub2_Sub4_1.method2193();
				if (local15 > 0 && Static30.aClass3_Sub2_Sub4_1.method2194()) {
					local15 -= Static64.anInt2048;
					if (local15 < 0) {
						local15 = 0;
					}
					Static30.aClass3_Sub2_Sub4_1.method2188(local15);
				} else {
					Static30.aClass3_Sub2_Sub4_1.method2204();
					Static30.aClass3_Sub2_Sub4_1.method2184();
					Static80.aClass28_1 = null;
					if (Static66.aClass25_21 == null) {
						Static104.anInt3014 = 0;
					} else {
						Static104.anInt3014 = 2;
					}
					Static61.aClass3_Sub14_1 = null;
				}
			}
		} catch (@Pc(60) Exception local60) {
			local60.printStackTrace();
			Static30.aClass3_Sub2_Sub4_1.method2204();
			Static104.anInt3014 = 0;
			Static66.aClass25_21 = null;
			Static61.aClass3_Sub14_1 = null;
			Static80.aClass28_1 = null;
		}
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(II)V")
	public static void method2149(@OriginalArg(1) int arg0) {
		Static111.method2064(arg0);
		Static29.method667(arg0);
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(IZLclient!ma;I)V")
	public static void method2150(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub1_Sub2_Sub3 arg1, @OriginalArg(3) int arg2) {
		if (arg1 == null) {
			return;
		}
		@Pc(12) int local12 = Static39.anInt1294 + Static107.anInt3040 & 0x7FF;
		@Pc(21) int local21 = arg2 * arg2 + arg0 * arg0;
		if (local21 > 6400) {
			return;
		}
		@Pc(29) int local29 = Class3_Sub1_Sub2_Sub1.anIntArray41[local12];
		@Pc(33) int local33 = Class3_Sub1_Sub2_Sub1.anIntArray39[local12];
		@Pc(41) int local41 = local33 * 256 / (Static43.anInt1424 + 256);
		@Pc(49) int local49 = local29 * 256 / (Static43.anInt1424 + 256);
		@Pc(64) int local64 = local41 * arg2 + arg0 * local49 >> 16;
		@Pc(75) int local75 = local41 * arg0 - arg2 * local49 >> 16;
		if (local21 <= 2500) {
			arg1.method1439(local64 + 94 + 4 - arg1.anInt2192 / 2, -(arg1.anInt2190 / 2) + -4 + -local75 + 83);
		} else {
			arg1.method1442(Static98.aClass3_Sub1_Sub2_Sub4_12, local64 + 94 + 4 - arg1.anInt2192 / 2, 83 - (local75 - -(arg1.anInt2190 / 2)) + -4);
		}
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(Lclient!gd;ILclient!gd;)V")
	public static void method2151(@OriginalArg(0) Class3_Sub1_Sub2_Sub2 arg0, @OriginalArg(2) Class3_Sub1_Sub2_Sub2 arg1) {
		if (Static107.aClass3_Sub1_Sub2_Sub3Array8 == null) {
			Static107.aClass3_Sub1_Sub2_Sub3Array8 = Static38.method873(Static105.aClass60_1279, Static46.aClass60_634, Static113.aClass25_Sub1_18);
		}
		if (Static11.aClass3_Sub1_Sub2_Sub4Array1 == null) {
			Static11.aClass3_Sub1_Sub2_Sub4Array1 = Static52.method1130(Static113.aClass25_Sub1_18, Static10.aClass60_137, Static105.aClass60_1279);
		}
		if (Static58.aClass3_Sub1_Sub2_Sub4Array5 == null) {
			Static58.aClass3_Sub1_Sub2_Sub4Array5 = Static52.method1130(Static113.aClass25_Sub1_18, Static122.aClass60_257, Static105.aClass60_1279);
		}
		if (Static129.aClass3_Sub1_Sub2_Sub4Array11 == null) {
			Static129.aClass3_Sub1_Sub2_Sub4Array11 = Static52.method1130(Static113.aClass25_Sub1_18, Static45.aClass60_628, Static105.aClass60_1279);
		}
		Static40.method1893(0, 23, 765, 480, 0);
		Static40.method1895(0, 0, 125, 23, 12425273, 9135624);
		Static40.method1895(125, 0, 640, 23, 5197647, 2697513);
		arg1.method842(Static104.aClass60_1264, 62, 15, 0, -1);
		if (Static129.aClass3_Sub1_Sub2_Sub4Array11 != null) {
			Static129.aClass3_Sub1_Sub2_Sub4Array11[1].method1903(140, 1);
			arg0.method847(Static60.aClass60_825, 152, 10, 16777215, -1);
			Static129.aClass3_Sub1_Sub2_Sub4Array11[0].method1903(140, 12);
			arg0.method847(Static14.aClass60_185, 152, 21, 16777215, -1);
		}
		if (Static58.aClass3_Sub1_Sub2_Sub4Array5 != null) {
			if (Static69.anIntArray219[0] == 0 && Static129.anIntArray391[0] == 0) {
				Static58.aClass3_Sub1_Sub2_Sub4Array5[2].method1903(280, 4);
			} else {
				Static58.aClass3_Sub1_Sub2_Sub4Array5[0].method1903(280, 4);
			}
			if (Static69.anIntArray219[0] == 0 && Static129.anIntArray391[0] == 1) {
				Static58.aClass3_Sub1_Sub2_Sub4Array5[3].method1903(295, 4);
			} else {
				Static58.aClass3_Sub1_Sub2_Sub4Array5[1].method1903(295, 4);
			}
			arg1.method847(Static74.aClass60_1011, 312, 17, 16777215, -1);
			if (Static69.anIntArray219[0] == 1 && Static129.anIntArray391[0] == 0) {
				Static58.aClass3_Sub1_Sub2_Sub4Array5[2].method1903(390, 4);
			} else {
				Static58.aClass3_Sub1_Sub2_Sub4Array5[0].method1903(390, 4);
			}
			if (Static69.anIntArray219[0] == 1 && Static129.anIntArray391[0] == 1) {
				Static58.aClass3_Sub1_Sub2_Sub4Array5[3].method1903(405, 4);
			} else {
				Static58.aClass3_Sub1_Sub2_Sub4Array5[1].method1903(405, 4);
			}
			arg1.method847(Static11.aClass60_142, 422, 17, 16777215, -1);
			if (Static69.anIntArray219[0] == 2 && Static129.anIntArray391[0] == 0) {
				Static58.aClass3_Sub1_Sub2_Sub4Array5[2].method1903(500, 4);
			} else {
				Static58.aClass3_Sub1_Sub2_Sub4Array5[0].method1903(500, 4);
			}
			if (Static69.anIntArray219[0] == 2 && Static129.anIntArray391[0] == 1) {
				Static58.aClass3_Sub1_Sub2_Sub4Array5[3].method1903(515, 4);
			} else {
				Static58.aClass3_Sub1_Sub2_Sub4Array5[1].method1903(515, 4);
			}
			arg1.method847(Static2.aClass60_50, 532, 17, 16777215, -1);
			if (Static69.anIntArray219[0] == 3 && Static129.anIntArray391[0] == 0) {
				Static58.aClass3_Sub1_Sub2_Sub4Array5[2].method1903(610, 4);
			} else {
				Static58.aClass3_Sub1_Sub2_Sub4Array5[0].method1903(610, 4);
			}
			if (Static69.anIntArray219[0] == 3 && Static129.anIntArray391[0] == 1) {
				Static58.aClass3_Sub1_Sub2_Sub4Array5[3].method1903(625, 4);
			} else {
				Static58.aClass3_Sub1_Sub2_Sub4Array5[1].method1903(625, 4);
			}
			arg1.method847(Static15.aClass60_246, 642, 17, 16777215, -1);
		}
		Static40.method1893(708, 4, 50, 16, 0);
		arg0.method842(Static130.aClass60_1446, 733, 16, 16777215, -1);
		Static55.anInt1754 = -1;
		if (Static107.aClass3_Sub1_Sub2_Sub3Array8 != null) {
			@Pc(391) int local391 = 8;
			@Pc(397) int local397 = 24;
			@Pc(409) int local409;
			@Pc(399) int local399;
			do {
				local399 = local391;
				if (Static38.anInt1287 <= (local391 - 1) * local397) {
					local391--;
				}
				local409 = local397;
				if (Static38.anInt1287 <= (local397 - 1) * local391) {
					local397--;
				}
				if (Static38.anInt1287 <= local391 * (local397 - 1)) {
					local397--;
				}
			} while (local397 != local409 || local399 != local391);
			local409 = (765 - local391 * 88) / (local391 + 1);
			if (local409 > 5) {
				local409 = 5;
			}
			local399 = (480 - local397 * 19) / (local397 + 1);
			if (local399 > 5) {
				local399 = 5;
			}
			@Pc(490) int local490 = (765 - local391 * 88 - (local391 + -1) * local409) / 2;
			@Pc(492) int local492 = 0;
			@Pc(494) int local494 = local490;
			@Pc(508) int local508 = (480 - local397 * 19 - (local397 - 1) * local399) / 2;
			@Pc(512) int local512 = local508 + 23;
			for (@Pc(514) int local514 = 0; local514 < Static38.anInt1287; local514++) {
				@Pc(520) Class18 local520 = Static14.aClass18Array1[local514];
				@Pc(522) boolean local522 = true;
				@Pc(527) Class60 local527 = Static65.method1341(local520.anInt996);
				if (local520.anInt996 == -1) {
					local522 = false;
					local527 = Static107.aClass60_1287;
				} else if (local520.anInt996 > 1980) {
					local527 = Static77.aClass60_1028;
					local522 = false;
				}
				if (local494 <= Static122.anInt720 && local512 <= Static12.anInt374 && local494 + 88 > Static122.anInt720 && Static12.anInt374 < local512 + 19 && local522) {
					Static55.anInt1754 = local514;
					Static107.aClass3_Sub1_Sub2_Sub3Array8[local520.aBoolean31 ? 1 : 0].method1447(local494, local512);
				} else {
					Static107.aClass3_Sub1_Sub2_Sub3Array8[local520.aBoolean31 ? 1 : 0].method1455(local494, local512);
				}
				if (Static11.aClass3_Sub1_Sub2_Sub4Array1 != null) {
					Static11.aClass3_Sub1_Sub2_Sub4Array1[local520.anInt991 + (local520.aBoolean31 ? 8 : 0)].method1903(local494 + 29, local512);
				}
				arg1.method842(Static65.method1341(local520.anInt998), local494 + 15, local512 - -9 + 5, 0, -1);
				arg0.method842(local527, local494 + 60, 5 + 9 + local512, 268435455, -1);
				local512 += local399 + 19;
				@Pc(672) int local672 = ~local397;
				local492++;
				if (local672 >= ~local492) {
					local512 = local508 + 23;
					local492 = 0;
					local494 += local409 + 88;
				}
			}
		}
		try {
			@Pc(697) Graphics local697 = Static2.aCanvas1.getGraphics();
			Static55.aClass16_41.method1664(0, 0, local697);
		} catch (@Pc(705) Exception local705) {
			Static2.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!uc", name = "c", descriptor = "(B)V")
	public static void method2152() {
		aClass60_1363 = null;
		aClass3_Sub12_8 = null;
		aClass3_Sub1_Sub2_Sub4_20 = null;
	}
}
