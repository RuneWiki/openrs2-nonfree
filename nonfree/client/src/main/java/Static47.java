import java.awt.Font;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static47 {

	@OriginalMember(owner = "client!hd", name = "p", descriptor = "Lclient!ea;")
	public static Class20_Sub1 aClass20_Sub1_8;

	@OriginalMember(owner = "client!hd", name = "t", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray3;

	@OriginalMember(owner = "client!hd", name = "v", descriptor = "Ljava/awt/Font;")
	public static Font aFont1;

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "Lclient!pb;")
	public static Class61 aClass61_7 = new Class61();

	@OriginalMember(owner = "client!hd", name = "q", descriptor = "Lclient!ja;")
	private static Class39 aClass39_709 = Static28.method504("Loaded config");

	@OriginalMember(owner = "client!hd", name = "r", descriptor = "Lclient!ja;")
	public static Class39 aClass39_710 = aClass39_709;

	@OriginalMember(owner = "client!hd", name = "s", descriptor = "I")
	public static int anInt1183 = 0;

	@OriginalMember(owner = "client!hd", name = "u", descriptor = "Lclient!ja;")
	public static Class39 aClass39_711 = Static28.method504("<img=0>");

	@OriginalMember(owner = "client!hd", name = "w", descriptor = "I")
	public static int anInt1184 = 0;

	@OriginalMember(owner = "client!hd", name = "x", descriptor = "[Lclient!ja;")
	public static Class39[] aClass39Array8 = new Class39[500];

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIII)I")
	public static int method771(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = arg0 / arg1;
		@Pc(11) int local11 = arg2 / arg1;
		@Pc(22) int local22 = arg1 - 1 & arg0;
		@Pc(28) int local28 = arg1 - 1 & arg2;
		@Pc(33) int local33 = Static48.method784(local11, local7);
		@Pc(40) int local40 = Static48.method784(local11, local7 + 1);
		@Pc(47) int local47 = Static48.method784(local11 + 1, local7);
		@Pc(56) int local56 = Static48.method784(local11 + 1, local7 + 1);
		@Pc(63) int local63 = Static119.method2169(local22, local33, arg1, local40);
		@Pc(70) int local70 = Static119.method2169(local22, local47, arg1, local56);
		return Static119.method2169(local28, local63, arg1, local70);
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(B)V")
	public static void method772() {
		aClass20_Sub1_8 = null;
		aClass39_711 = null;
		aByteArrayArrayArray3 = null;
		aClass39Array8 = null;
		aClass39_709 = null;
		aClass39_710 = null;
		aFont1 = null;
		aClass61_7 = null;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(ILclient!mf;Lclient!mf;)V")
	public static void method773(@OriginalArg(1) Class4_Sub2_Sub3_Sub3 arg0, @OriginalArg(2) Class4_Sub2_Sub3_Sub3 arg1) {
		if (Static46.aBoolean54) {
			Static80.method1326(arg0, arg1);
			return;
		}
		if (Static88.anInt2205 == 0 || Static88.anInt2205 == 5) {
			arg0.method1280(Static28.aClass39_401, 382, 225, 16777215, -1);
			Static17.method1683(230, 233, 304, 34, 9179409);
			Static17.method1683(231, 234, 302, 32, 0);
			Static17.method1682(232, 235, Static72.anInt802 * 3, 30, 9179409);
			Static17.method1682(Static72.anInt802 * 3 + 232, 235, 300 - Static72.anInt802 * 3, 30, 0);
			arg0.method1280(Static6.aClass39_177, 382, 256, 16777215, -1);
		}
		@Pc(110) short local110;
		@Pc(118) int local118;
		if (Static88.anInt2205 == 20) {
			Static14.aClass4_Sub2_Sub3_Sub4_1.method1688(382 - Static14.aClass4_Sub2_Sub3_Sub4_1.anInt2267 / 2, 271 - Static14.aClass4_Sub2_Sub3_Sub4_1.anInt2266 / 2);
			local110 = 211;
			arg0.method1280(Static6.aClass39_184, 382, 211, 16776960, 0);
			local118 = local110 + 15;
			arg0.method1280(Static6.aClass39_182, 382, 226, 16776960, 0);
			@Pc(126) int local126 = local118 + 15;
			arg0.method1280(Static6.aClass39_185, 382, 241, 16776960, 0);
			@Pc(134) int local134 = local126 + 15;
			@Pc(135) int local135 = local134 + 10;
			arg0.method1272(Static62.method1123(new Class39[] { Static1.aClass39_3, Static76.method1263(Static6.aClass39_179) }), 272, 266, 16777215, 0);
			@Pc(157) int local157 = local135 + 15;
			arg0.method1272(Static62.method1123(new Class39[] { Static69.aClass39_908, Static6.aClass39_183.method951() }), 274, 281, 16777215, 0);
			@Pc(178) int local178 = local157 + 15;
		}
		if (Static88.anInt2205 == 10) {
			Static14.aClass4_Sub2_Sub3_Sub4_1.method1688(202, 171);
			if (Static9.anInt286 == 0) {
				local110 = 251;
				arg0.method1280(Static60.aClass39_853, 382, 251, 16776960, 0);
				Static36.aClass4_Sub2_Sub3_Sub4_3.method1688(229, 271);
				arg0.method1261(Static39.aClass39_515, 229, 271, 144, 40, 16777215, 0, 1, 1, 0);
				local118 = local110 + 30;
				Static36.aClass4_Sub2_Sub3_Sub4_3.method1688(389, 271);
				arg0.method1261(Static131.aClass39_1802, 389, 271, 144, 40, 16777215, 0, 1, 1, 0);
			} else if (Static9.anInt286 == 2) {
				local110 = 211;
				arg0.method1280(Static6.aClass39_184, 382, 211, 16776960, 0);
				local118 = local110 + 15;
				arg0.method1280(Static6.aClass39_182, 382, 226, 16776960, 0);
				local118 += 15;
				arg0.method1280(Static6.aClass39_185, 382, 241, 16776960, 0);
				local118 += 15;
				local118 += 10;
				arg0.method1272(Static62.method1123(new Class39[] { Static1.aClass39_3, Static76.method1263(Static6.aClass39_179), Static71.anInt1738 % 40 < 20 & Static80.anInt1893 == 0 ? Static92.aClass39_390 : Static6.aClass39_180 }), 272, 266, 16777215, 0);
				local118 += 15;
				arg0.method1272(Static62.method1123(new Class39[] { Static69.aClass39_908, Static6.aClass39_183.method951(), Static80.anInt1893 == 1 & Static71.anInt1738 % 40 < 20 ? Static92.aClass39_390 : Static6.aClass39_180 }), 274, 281, 16777215, 0);
				Static36.aClass4_Sub2_Sub3_Sub4_3.method1688(229, 301);
				arg0.method1280(Static15.aClass39_257, 302, 326, 16777215, 0);
				local118 += 15;
				Static36.aClass4_Sub2_Sub3_Sub4_3.method1688(389, 301);
				arg0.method1280(Static62.aClass39_862, 462, 326, 16777215, 0);
			} else if (Static9.anInt286 == 3) {
				arg0.method1280(Static108.aClass39_1421, 382, 211, 16776960, 0);
				local110 = 236;
				arg0.method1280(Static94.aClass39_1139, 382, 236, 16777215, 0);
				local118 = local110 + 15;
				arg0.method1280(Static63.aClass39_870, 382, 251, 16777215, 0);
				local118 += 15;
				arg0.method1280(Static120.aClass39_1548, 382, 266, 16777215, 0);
				local118 += 15;
				arg0.method1280(Static26.aClass39_373, 382, 281, 16777215, 0);
				Static36.aClass4_Sub2_Sub3_Sub4_3.method1688(309, 301);
				arg0.method1280(Static62.aClass39_862, 382, 326, 16777215, 0);
				local118 += 15;
			}
		}
		if (Static96.anInt2340 != 1) {
			if (Static45.anInt1160 > 0) {
				Static8.method188(Static45.anInt1160);
				Static45.anInt1160 = 0;
			}
			Static72.method530();
		}
		Static130.aClass4_Sub2_Sub3_Sub4Array9[Static5.aBoolean135 ? 1 : 0].method1688(725, 463);
		if (Static88.anInt2205 > 5 && Static105.anInt2043 != 2 && Static44.anInt1125 == 0) {
			if (Static32.aClass4_Sub2_Sub3_Sub4_2 == null) {
				Static32.aClass4_Sub2_Sub3_Sub4_2 = Static77.method1296(Static127.aClass20_Sub1_20, Static6.aClass39_180, Static82.aClass39_1045);
			} else {
				Static32.aClass4_Sub2_Sub3_Sub4_2.method1688(5, 463);
				arg0.method1280(Static62.method1123(new Class39[] { Static23.aClass39_366, Static101.aClass39_1305, Static29.method510(Static49.anInt1283) }), 55, 478, 16777215, 0);
				if (Static83.aClass47_1 == null) {
					arg1.method1280(Static113.aClass39_1479, 55, 492, 16777215, 0);
				} else {
					arg1.method1280(Static10.aClass39_227, 55, 492, 16777215, 0);
				}
			}
		}
		try {
			@Pc(625) Graphics local625 = Static8.aCanvas1.getGraphics();
			Static91.aClass6_1.method531(local625);
		} catch (@Pc(633) Exception local633) {
			Static8.aCanvas1.repaint();
		}
	}
}
