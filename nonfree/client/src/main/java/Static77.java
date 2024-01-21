import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static77 {

	@OriginalMember(owner = "client!nd", name = "k", descriptor = "I")
	public static int anInt2427;

	@OriginalMember(owner = "client!nd", name = "d", descriptor = "Lclient!eb;")
	public static Class17 aClass17_38 = new Class17(64);

	@OriginalMember(owner = "client!nd", name = "f", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1027 = Static59.method1195(": ");

	@OriginalMember(owner = "client!nd", name = "h", descriptor = "Lclient!qf;")
	private static Class60 aClass60_1029 = Static59.method1195("FULL");

	@OriginalMember(owner = "client!nd", name = "g", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1028 = aClass60_1029;

	@OriginalMember(owner = "client!nd", name = "i", descriptor = "Lclient!qf;")
	private static Class60 aClass60_1030 = Static59.method1195("Sorry invited players only)3");

	@OriginalMember(owner = "client!nd", name = "j", descriptor = "Lclient!eb;")
	public static Class17 aClass17_39 = new Class17(64);

	@OriginalMember(owner = "client!nd", name = "l", descriptor = "[Lclient!qf;")
	public static Class60[] aClass60Array15 = new Class60[20];

	@OriginalMember(owner = "client!nd", name = "m", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1031 = aClass60_1030;

	@OriginalMember(owner = "client!nd", name = "n", descriptor = "I")
	public static int anInt2428 = 0;

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(IBILclient!la;IIII)V")
	public static void method1567(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class3_Sub12 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(33) int local33;
		if (arg5 < 0 || arg5 >= 104 || arg4 < 0 || arg4 >= 104) {
			while (true) {
				local33 = arg2.method1936();
				if (local33 == 0) {
					break;
				}
				if (local33 == 1) {
					arg2.method1936();
					break;
				}
				if (local33 <= 49) {
					arg2.method1936();
				}
			}
			return;
		}
		Static60.aByteArrayArrayArray4[arg3][arg5][arg4] = 0;
		while (true) {
			local33 = arg2.method1936();
			if (local33 == 0) {
				if (arg3 == 0) {
					Static51.anIntArrayArrayArray3[0][arg5][arg4] = -Static14.method370(arg1 + arg4 + 556238, arg6 + 932731 + arg5) * 8;
				} else {
					Static51.anIntArrayArrayArray3[arg3][arg5][arg4] = Static51.anIntArrayArrayArray3[arg3 - 1][arg5][arg4] - 240;
				}
				break;
			}
			if (local33 == 1) {
				@Pc(91) int local91 = arg2.method1936();
				if (local91 == 1) {
					local91 = 0;
				}
				if (arg3 == 0) {
					Static51.anIntArrayArrayArray3[0][arg5][arg4] = -local91 * 8;
				} else {
					Static51.anIntArrayArrayArray3[arg3][arg5][arg4] = Static51.anIntArrayArrayArray3[arg3 - 1][arg5][arg4] - local91 * 8;
				}
				break;
			}
			if (local33 <= 49) {
				Static125.aByteArrayArrayArray7[arg3][arg5][arg4] = arg2.method1958();
				Static101.aByteArrayArrayArray6[arg3][arg5][arg4] = (byte) ((local33 - 2) / 4);
				Static36.aByteArrayArrayArray2[arg3][arg5][arg4] = (byte) (local33 + arg0 - 2 & 0x3);
			} else if (local33 <= 81) {
				Static60.aByteArrayArrayArray4[arg3][arg5][arg4] = (byte) (local33 - 49);
			} else {
				Static55.aByteArrayArrayArray3[arg3][arg5][arg4] = (byte) (local33 - 81);
			}
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lclient!gd;ILclient!gd;)V")
	public static void method1568(@OriginalArg(0) Class3_Sub1_Sub2_Sub2 arg0, @OriginalArg(2) Class3_Sub1_Sub2_Sub2 arg1) {
		if (Static21.aBoolean27) {
			Static119.method2151(arg1, arg0);
			return;
		}
		if (Static39.anInt1303 == 0 || Static39.anInt1303 == 5) {
			arg0.method842(Static45.aClass60_629, 382, 225, 16777215, -1);
			Static40.method1884(230, 233, 304, 34, 9179409);
			Static40.method1884(231, 234, 302, 32, 0);
			Static40.method1893(232, 235, Static78.anInt2433 * 3, 30, 9179409);
			Static40.method1893(Static78.anInt2433 * 3 + 232, 235, 300 - Static78.anInt2433 * 3, 30, 0);
			arg0.method842(Static105.aClass60_1275, 382, 256, 16777215, -1);
		}
		@Pc(114) short local114;
		@Pc(122) int local122;
		if (Static39.anInt1303 == 20) {
			Static96.aClass3_Sub1_Sub2_Sub4_11.method1903(382 - Static96.aClass3_Sub1_Sub2_Sub4_11.anInt2860 / 2, -(Static96.aClass3_Sub1_Sub2_Sub4_11.anInt2858 / 2) + 271);
			local114 = 211;
			arg0.method842(Static105.aClass60_1278, 382, 211, 16776960, 0);
			local122 = local114 + 15;
			arg0.method842(Static105.aClass60_1273, 382, 226, 16776960, 0);
			@Pc(130) int local130 = local122 + 15;
			arg0.method842(Static105.aClass60_1284, 382, 241, 16776960, 0);
			@Pc(138) int local138 = local130 + 15;
			@Pc(139) int local139 = local138 + 10;
			arg0.method847(Static60.method1211(new Class60[] { Static124.aClass60_1359, Static37.method834(Static105.aClass60_1281) }), 272, 266, 16777215, 0);
			@Pc(159) int local159 = local139 + 15;
			arg0.method847(Static60.method1211(new Class60[] { Static26.aClass60_375, Static105.aClass60_1276.method1834() }), 274, 281, 16777215, 0);
			@Pc(180) int local180 = local159 + 15;
		}
		if (Static39.anInt1303 == 10) {
			Static96.aClass3_Sub1_Sub2_Sub4_11.method1903(202, 171);
			if (Static53.anInt1743 == 0) {
				local114 = 251;
				arg0.method842(Static62.aClass60_861, 382, 251, 16776960, 0);
				local122 = local114 + 30;
				Static76.aClass3_Sub1_Sub2_Sub4_8.method1903(229, 271);
				arg0.method836(Static102.aClass60_1249, 229, 271, 144, 40, 16777215, 0, 1, 1, 0);
				Static76.aClass3_Sub1_Sub2_Sub4_8.method1903(389, 271);
				arg0.method836(Static59.aClass60_819, 389, 271, 144, 40, 16777215, 0, 1, 1, 0);
			} else if (Static53.anInt1743 == 2) {
				local114 = 211;
				arg0.method842(Static105.aClass60_1278, 382, 211, 16776960, 0);
				local122 = local114 + 15;
				arg0.method842(Static105.aClass60_1273, 382, 226, 16776960, 0);
				local122 += 15;
				arg0.method842(Static105.aClass60_1284, 382, 241, 16776960, 0);
				local122 += 15;
				local122 += 10;
				arg0.method847(Static60.method1211(new Class60[] { Static124.aClass60_1359, Static37.method834(Static105.aClass60_1281), Static34.anInt1183 % 40 < 20 & Static53.anInt1746 == 0 ? Static117.aClass60_1337 : Static105.aClass60_1279 }), 272, 266, 16777215, 0);
				local122 += 15;
				arg0.method847(Static60.method1211(new Class60[] { Static26.aClass60_375, Static105.aClass60_1276.method1834(), Static34.anInt1183 % 40 < 20 & Static53.anInt1746 == 1 ? Static117.aClass60_1337 : Static105.aClass60_1279 }), 274, 281, 16777215, 0);
				Static76.aClass3_Sub1_Sub2_Sub4_8.method1903(229, 301);
				arg0.method842(Static102.aClass60_1251, 302, 326, 16777215, 0);
				local122 += 15;
				Static76.aClass3_Sub1_Sub2_Sub4_8.method1903(389, 301);
				arg0.method842(Static130.aClass60_1446, 462, 326, 16777215, 0);
			} else if (Static53.anInt1743 == 3) {
				arg0.method842(Static81.aClass60_1084, 382, 211, 16776960, 0);
				local114 = 236;
				arg0.method842(Static72.aClass60_962, 382, 236, 16777215, 0);
				local122 = local114 + 15;
				arg0.method842(Static96.aClass60_1185, 382, 251, 16777215, 0);
				local122 += 15;
				arg0.method842(Static56.aClass60_793, 382, 266, 16777215, 0);
				local122 += 15;
				arg0.method842(Static56.aClass60_795, 382, 281, 16777215, 0);
				Static76.aClass3_Sub1_Sub2_Sub4_8.method1903(309, 301);
				local122 += 15;
				arg0.method842(Static130.aClass60_1446, 382, 326, 16777215, 0);
			}
		}
		if (Static22.anInt881 > 0) {
			Static96.method1805(Static22.anInt881);
			Static22.anInt881 = 0;
		}
		Static63.method1918();
		Static112.aClass3_Sub1_Sub2_Sub4Array10[Static72.aBoolean78 ? 1 : 0].method1903(725, 463);
		if (Static39.anInt1303 > 5 && Static13.anInt403 != 2 && Static123.anInt3361 == 0) {
			if (Static102.aClass3_Sub1_Sub2_Sub4_15 == null) {
				Static102.aClass3_Sub1_Sub2_Sub4_15 = Static54.method1137(Static105.aClass60_1279, Static58.aClass60_802, Static113.aClass25_Sub1_18);
			} else {
				Static102.aClass3_Sub1_Sub2_Sub4_15.method1903(5, 463);
				arg0.method842(Static60.method1211(new Class60[] { Static74.aClass60_1015, Static3.aClass60_71, Static65.method1341(Static46.anInt1445) }), 55, 478, 16777215, 0);
				if (Static52.aClass40_1 == null) {
					arg1.method842(Static63.aClass60_1225, 55, 492, 16777215, 0);
				} else {
					arg1.method842(Static15.aClass60_250, 55, 492, 16777215, 0);
				}
			}
		}
		try {
			@Pc(621) Graphics local621 = Static2.aCanvas1.getGraphics();
			Static55.aClass16_41.method1664(0, 0, local621);
		} catch (@Pc(629) Exception local629) {
			Static2.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(IIB)Z")
	public static boolean method1569(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 >> arg0 + 1 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(I)V")
	public static void method1570() {
		aClass60_1029 = null;
		aClass60_1030 = null;
		aClass17_38 = null;
		aClass60_1028 = null;
		aClass60_1027 = null;
		aClass17_39 = null;
		aClass60_1031 = null;
		aClass60Array15 = null;
	}
}
