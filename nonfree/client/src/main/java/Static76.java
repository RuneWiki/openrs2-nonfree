import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static76 {

	@OriginalMember(owner = "client!nc", name = "zb", descriptor = "B")
	public static byte aByte5;

	@OriginalMember(owner = "client!nc", name = "Ab", descriptor = "Lclient!ua;")
	public static Class24_Sub1 aClass24_Sub1_12;

	@OriginalMember(owner = "client!nc", name = "ab", descriptor = "Lclient!je;")
	public static Class40 aClass40_989 = Static69.method1231("blaugr-Un:");

	@OriginalMember(owner = "client!nc", name = "jb", descriptor = "Lclient!na;")
	public static Class2_Sub9 aClass2_Sub9_4 = new Class2_Sub9(8);

	@OriginalMember(owner = "client!nc", name = "qb", descriptor = "Lclient!je;")
	public static Class40 aClass40_990 = Static69.method1231("Hierhin gehen");

	@OriginalMember(owner = "client!nc", name = "rb", descriptor = "Lclient!je;")
	public static Class40 aClass40_991 = Static69.method1231("auf einer freien Welt zu spielen)3");

	@OriginalMember(owner = "client!nc", name = "tb", descriptor = "I")
	public static int anInt1982 = 10;

	@OriginalMember(owner = "client!nc", name = "vb", descriptor = "Lclient!je;")
	public static Class40 aClass40_992 = Static69.method1231("blinken3:");

	@OriginalMember(owner = "client!nc", name = "wb", descriptor = "Lclient!je;")
	private static Class40 aClass40_993 = Static69.method1231("Please wait)3)3)3");

	@OriginalMember(owner = "client!nc", name = "xb", descriptor = "Lclient!ga;")
	public static Class2_Sub9_Sub1 aClass2_Sub9_Sub1_3 = new Class2_Sub9_Sub1(5000);

	@OriginalMember(owner = "client!nc", name = "yb", descriptor = "Lclient!je;")
	public static Class40 aClass40_994 = aClass40_993;

	@OriginalMember(owner = "client!nc", name = "Bb", descriptor = "Lclient!je;")
	public static Class40 aClass40_995 = Static69.method1231("me");

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIIBI)V")
	public static void method1263(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(11) Class2_Sub14 local11 = (Class2_Sub14) Static49.aClass3_6.method82(); local11 != null; local11 = (Class2_Sub14) Static49.aClass3_6.method74()) {
			if (local11.anInt1674 != -1 || local11.anIntArray167 != null) {
				@Pc(23) int local23 = 0;
				if (arg0 > local11.anInt1667) {
					local23 = arg0 - local11.anInt1667;
				} else if (arg0 < local11.anInt1671) {
					local23 = local11.anInt1671 - arg0;
				}
				if (arg1 > local11.anInt1660) {
					local23 += arg1 - local11.anInt1660;
				} else if (arg1 < local11.anInt1663) {
					local23 += local11.anInt1663 - arg1;
				}
				if (local23 - 64 > local11.anInt1677 || Static106.anInt2536 == 0 || arg3 != local11.anInt1664) {
					if (local11.aClass2_Sub5_Sub2_2 != null) {
						Static77.aClass2_Sub5_Sub1_1.method1137(local11.aClass2_Sub5_Sub2_2);
						local11.aClass2_Sub5_Sub2_2 = null;
					}
					if (local11.aClass2_Sub5_Sub2_1 != null) {
						Static77.aClass2_Sub5_Sub1_1.method1137(local11.aClass2_Sub5_Sub2_1);
						local11.aClass2_Sub5_Sub2_1 = null;
					}
				} else {
					local23 -= 64;
					if (local23 < 0) {
						local23 = 0;
					}
					@Pc(131) int local131 = (local11.anInt1677 - local23) * Static106.anInt2536 / local11.anInt1677;
					if (local11.aClass2_Sub5_Sub2_2 != null) {
						local11.aClass2_Sub5_Sub2_2.method1287(local131);
					} else if (local11.anInt1674 >= 0) {
						@Pc(143) Class66 local143 = Static140.method1806(Static32.aClass24_Sub1_2, local11.anInt1674, 0);
						if (local143 != null) {
							@Pc(150) Class2_Sub4_Sub1 local150 = local143.method1807().method1815(Static16.aClass31_1);
							@Pc(155) Class2_Sub5_Sub2 local155 = Static137.method1313(local150, local131);
							local155.method1326(-1);
							Static77.aClass2_Sub5_Sub1_1.method1138(local155);
							local11.aClass2_Sub5_Sub2_2 = local155;
						}
					}
					if (local11.aClass2_Sub5_Sub2_1 != null) {
						local11.aClass2_Sub5_Sub2_1.method1287(local131);
						if (!local11.aClass2_Sub5_Sub2_1.method2207()) {
							local11.aClass2_Sub5_Sub2_1 = null;
						}
					} else if (local11.anIntArray167 != null && (local11.anInt1673 -= arg2) <= 0) {
						@Pc(192) int local192 = (int) (Math.random() * (double) local11.anIntArray167.length);
						@Pc(200) Class66 local200 = Static140.method1806(Static32.aClass24_Sub1_2, local11.anIntArray167[local192], 0);
						if (local200 != null) {
							@Pc(207) Class2_Sub4_Sub1 local207 = local200.method1807().method1815(Static16.aClass31_1);
							@Pc(212) Class2_Sub5_Sub2 local212 = Static137.method1313(local207, local131);
							local212.method1326(0);
							Static77.aClass2_Sub5_Sub1_1.method1138(local212);
							local11.aClass2_Sub5_Sub2_1 = local212;
							local11.anInt1673 = (int) (Math.random() * (double) (local11.anInt1675 - local11.anInt1670)) + local11.anInt1670;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(ILclient!oe;Lclient!oe;)V")
	public static void method1264(@OriginalArg(1) Class2_Sub1_Sub2_Sub3_Sub1 arg0, @OriginalArg(2) Class2_Sub1_Sub2_Sub3_Sub1 arg1) {
		if (Static55.aClass2_Sub1_Sub2_Sub4Array9 == null) {
			Static55.aClass2_Sub1_Sub2_Sub4Array9 = Static14.method229(Static23.aClass40_370, Static87.aClass40_667, Static10.aClass24_Sub1_20);
		}
		if (Static12.aClass2_Sub1_Sub2_Sub1Array102 == null) {
			Static12.aClass2_Sub1_Sub2_Sub1Array102 = Static46.method828(Static87.aClass40_667, Static10.aClass24_Sub1_20, Static70.aClass40_941);
		}
		if (Static17.aClass2_Sub1_Sub2_Sub1Array19 == null) {
			Static17.aClass2_Sub1_Sub2_Sub1Array19 = Static46.method828(Static87.aClass40_667, Static10.aClass24_Sub1_20, Static112.aClass40_1410);
		}
		if (Static88.aClass2_Sub1_Sub2_Sub1Array74 == null) {
			Static88.aClass2_Sub1_Sub2_Sub1Array74 = Static46.method828(Static87.aClass40_667, Static10.aClass24_Sub1_20, Static121.aClass40_1522);
		}
		Static6.method1695(0, 23, 765, 480, 0);
		Static6.method1694(0, 0, 125, 23, 12425273, 9135624);
		Static6.method1694(125, 0, 640, 23, 5197647, 2697513);
		arg0.method1547(Static120.aClass40_1518, 62, 15, 0, -1);
		if (Static88.aClass2_Sub1_Sub2_Sub1Array74 != null) {
			Static88.aClass2_Sub1_Sub2_Sub1Array74[1].method1084(140, 1);
			arg1.method1549(Static109.aClass40_1599, 152, 10, 16777215, -1);
			Static88.aClass2_Sub1_Sub2_Sub1Array74[0].method1084(140, 12);
			arg1.method1549(Static58.aClass40_753, 152, 21, 16777215, -1);
		}
		if (Static17.aClass2_Sub1_Sub2_Sub1Array19 != null) {
			if (Static107.anIntArray292[0] == 0 && Static118.anIntArray325[0] == 0) {
				Static17.aClass2_Sub1_Sub2_Sub1Array19[2].method1084(280, 4);
			} else {
				Static17.aClass2_Sub1_Sub2_Sub1Array19[0].method1084(280, 4);
			}
			if (Static107.anIntArray292[0] == 0 && Static118.anIntArray325[0] == 1) {
				Static17.aClass2_Sub1_Sub2_Sub1Array19[3].method1084(295, 4);
			} else {
				Static17.aClass2_Sub1_Sub2_Sub1Array19[1].method1084(295, 4);
			}
			arg0.method1549(Static29.aClass40_424, 312, 17, 16777215, -1);
			if (Static107.anIntArray292[0] == 1 && Static118.anIntArray325[0] == 0) {
				Static17.aClass2_Sub1_Sub2_Sub1Array19[2].method1084(390, 4);
			} else {
				Static17.aClass2_Sub1_Sub2_Sub1Array19[0].method1084(390, 4);
			}
			if (Static107.anIntArray292[0] == 1 && Static118.anIntArray325[0] == 1) {
				Static17.aClass2_Sub1_Sub2_Sub1Array19[3].method1084(405, 4);
			} else {
				Static17.aClass2_Sub1_Sub2_Sub1Array19[1].method1084(405, 4);
			}
			arg0.method1549(Static29.aClass40_426, 422, 17, 16777215, -1);
			if (Static107.anIntArray292[0] == 2 && Static118.anIntArray325[0] == 0) {
				Static17.aClass2_Sub1_Sub2_Sub1Array19[2].method1084(500, 4);
			} else {
				Static17.aClass2_Sub1_Sub2_Sub1Array19[0].method1084(500, 4);
			}
			if (Static107.anIntArray292[0] == 2 && Static118.anIntArray325[0] == 1) {
				Static17.aClass2_Sub1_Sub2_Sub1Array19[3].method1084(515, 4);
			} else {
				Static17.aClass2_Sub1_Sub2_Sub1Array19[1].method1084(515, 4);
			}
			arg0.method1549(Static72.aClass40_944, 532, 17, 16777215, -1);
			if (Static107.anIntArray292[0] == 3 && Static118.anIntArray325[0] == 0) {
				Static17.aClass2_Sub1_Sub2_Sub1Array19[2].method1084(610, 4);
			} else {
				Static17.aClass2_Sub1_Sub2_Sub1Array19[0].method1084(610, 4);
			}
			if (Static107.anIntArray292[0] == 3 && Static118.anIntArray325[0] == 1) {
				Static17.aClass2_Sub1_Sub2_Sub1Array19[3].method1084(625, 4);
			} else {
				Static17.aClass2_Sub1_Sub2_Sub1Array19[1].method1084(625, 4);
			}
			arg0.method1549(Static68.aClass40_906, 642, 17, 16777215, -1);
		}
		Static6.method1695(708, 4, 50, 16, 0);
		arg1.method1547(Static60.aClass40_823, 733, 16, 16777215, -1);
		Static124.anInt2878 = -1;
		if (Static55.aClass2_Sub1_Sub2_Sub4Array9 != null) {
			@Pc(388) int local388 = 24;
			@Pc(394) int local394 = 8;
			@Pc(396) int local396;
			@Pc(398) int local398;
			do {
				local396 = local388;
				local398 = local394;
				if ((local394 - 1) * local388 >= Static29.anInt724) {
					local394--;
				}
				if (Static29.anInt724 <= (local388 - 1) * local394) {
					local388--;
				}
				if (Static29.anInt724 <= (local388 - 1) * local394) {
					local388--;
				}
			} while (local396 != local388 || local394 != local398);
			local398 = (480 - local388 * 19) / (local388 + 1);
			if (local398 > 5) {
				local398 = 5;
			}
			local396 = (765 - local394 * 88) / (local394 + 1);
			@Pc(479) int local479 = (480 - local388 * 19 - local398 * (local388 + -1)) / 2;
			@Pc(481) int local481 = 0;
			if (local396 > 5) {
				local396 = 5;
			}
			@Pc(490) int local490 = local479 + 23;
			@Pc(505) int local505 = (765 - local396 * (local394 - 1) - local394 * 88) / 2;
			@Pc(507) int local507 = local505;
			for (@Pc(509) int local509 = 0; local509 < Static29.anInt724; local509++) {
				@Pc(515) Class68 local515 = Static81.aClass68Array1[local509];
				@Pc(517) boolean local517 = true;
				@Pc(522) Class40 local522 = Static49.method886(local515.anInt2514);
				if (local515.anInt2514 == -1) {
					local517 = false;
					local522 = Static129.aClass40_1607;
				} else if (local515.anInt2514 > 1980) {
					local522 = Static10.aClass40_1602;
					local517 = false;
				}
				if (local507 <= Static112.anInt2616 && Static85.anInt2261 >= local490 && Static112.anInt2616 < local507 + 88 && Static85.anInt2261 < local490 + 19 && local517) {
					Static124.anInt2878 = local509;
					Static55.aClass2_Sub1_Sub2_Sub4Array9[local515.aBoolean202 ? 1 : 0].method1721(local507, local490);
				} else {
					Static55.aClass2_Sub1_Sub2_Sub4Array9[local515.aBoolean202 ? 1 : 0].method1712(local507, local490);
				}
				if (Static12.aClass2_Sub1_Sub2_Sub1Array102 != null) {
					Static12.aClass2_Sub1_Sub2_Sub1Array102[(local515.aBoolean202 ? 8 : 0) + local515.anInt2513].method1084(local507 + 29, local490);
				}
				arg0.method1547(Static49.method886(local515.anInt2515), local507 + 15, local490 + 9 + 5, 0, -1);
				arg1.method1547(local522, local507 + 60, local490 - -14, 268435455, -1);
				local490 += local398 + 19;
				local481++;
				if (local481 >= local388) {
					local490 = local479 + 23;
					local507 += local396 + 88;
					local481 = 0;
				}
			}
		}
		try {
			@Pc(686) Graphics local686 = Static80.aCanvas1.getGraphics();
			Static65.aClass7_1.method2132(local686);
		} catch (@Pc(694) Exception local694) {
			Static80.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!nc", name = "e", descriptor = "(B)V")
	public static void method1267() {
		aClass2_Sub9_Sub1_3 = null;
		aClass40_994 = null;
		aClass40_993 = null;
		aClass24_Sub1_12 = null;
		aClass40_995 = null;
		aClass40_990 = null;
		aClass40_989 = null;
		aClass40_991 = null;
		aClass2_Sub9_4 = null;
		aClass40_992 = null;
	}
}
