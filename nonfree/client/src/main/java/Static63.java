import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static63 {

	@OriginalMember(owner = "client!md", name = "B", descriptor = "I")
	public static int anInt1522;

	@OriginalMember(owner = "client!md", name = "C", descriptor = "Z")
	public static boolean aBoolean89;

	@OriginalMember(owner = "client!md", name = "Q", descriptor = "Lclient!aa;")
	public static Class1_Sub1_Sub1_Sub1 aClass1_Sub1_Sub1_Sub1_5;

	@OriginalMember(owner = "client!md", name = "w", descriptor = "Lclient!mc;")
	public static Class42 aClass42_806 = Static23.method501("zur-Uck auf die RuneScape)2Webseite gehen");

	@OriginalMember(owner = "client!md", name = "x", descriptor = "I")
	public static int anInt1520 = 0;

	@OriginalMember(owner = "client!md", name = "Y", descriptor = "Lclient!mc;")
	private static Class42 aClass42_810 = Static23.method501("Please subscribe)1 or use a different world)3");

	@OriginalMember(owner = "client!md", name = "y", descriptor = "Lclient!mc;")
	public static Class42 aClass42_807 = aClass42_810;

	@OriginalMember(owner = "client!md", name = "H", descriptor = "I")
	public static int anInt1525 = 0;

	@OriginalMember(owner = "client!md", name = "I", descriptor = "I")
	public static int anInt1526 = 0;

	@OriginalMember(owner = "client!md", name = "M", descriptor = "Lclient!mc;")
	private static Class42 aClass42_809 = Static23.method501(" has logged out)3");

	@OriginalMember(owner = "client!md", name = "J", descriptor = "Lclient!mc;")
	public static Class42 aClass42_808 = aClass42_809;

	@OriginalMember(owner = "client!md", name = "L", descriptor = "I")
	public static int anInt1528 = -1;

	@OriginalMember(owner = "client!md", name = "S", descriptor = "I")
	public static int anInt1531 = 0;

	@OriginalMember(owner = "client!md", name = "T", descriptor = "J")
	public static volatile long aLong46 = 0L;

	@OriginalMember(owner = "client!md", name = "d", descriptor = "(I)V")
	public static void method1076() {
		try {
			@Pc(6) Graphics local6 = Static89.aCanvas1.getGraphics();
			Static33.aClass31_16.method993(0, local6, 4);
			Static31.aClass31_31.method993(0, local6, 357);
			Static29.aClass31_15.method993(722, local6, 4);
			Static74.aClass31_27.method993(743, local6, 205);
			Static99.aClass31_36.method993(0, local6, 0);
			Static3.aClass31_1.method993(516, local6, 4);
			Static109.aClass31_39.method993(516, local6, 205);
			Static38.aClass31_18.method993(496, local6, 357);
			Static6.aClass31_2.method993(0, local6, 338);
		} catch (@Pc(67) Exception local67) {
			Static89.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!md", name = "e", descriptor = "(I)V")
	public static void method1077() {
		aClass42_806 = null;
		aClass42_808 = null;
		aClass1_Sub1_Sub1_Sub1_5 = null;
		aClass42_810 = null;
		aClass42_809 = null;
		aClass42_807 = null;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(ZLjava/awt/Component;)V")
	public static void method1078(@OriginalArg(1) Component arg0) {
		arg0.removeKeyListener(Static107.aClass46_29);
		arg0.removeFocusListener(Static107.aClass46_29);
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(IIIIIZII)V")
	public static void method1079(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg3 < 1 || arg2 < 1 || arg3 > 102 || arg2 > 102) {
			return;
		}
		if (Static75.aBoolean85 && arg0 != Static82.anInt2165) {
			return;
		}
		@Pc(30) int local30 = 0;
		if (arg6 == 0) {
			local30 = Static88.aClass20_1.method474(arg0, arg3, arg2);
		}
		if (arg6 == 1) {
			local30 = Static88.aClass20_1.method470(arg0, arg3, arg2);
		}
		if (arg6 == 2) {
			local30 = Static88.aClass20_1.method467(arg0, arg3, arg2);
		}
		if (arg6 == 3) {
			local30 = Static88.aClass20_1.method481(arg0, arg3, arg2);
		}
		@Pc(82) int local82;
		if (local30 != 0) {
			local82 = Static88.aClass20_1.method460(arg0, arg3, arg2, local30);
			@Pc(88) int local88 = local30 >> 14 & 0x7FFF;
			@Pc(92) int local92 = local82 & 0x1F;
			@Pc(98) int local98 = local82 >> 6 & 0x3;
			@Pc(112) Class1_Sub1_Sub9 local112;
			if (arg6 == 0) {
				Static88.aClass20_1.method488(arg0, arg3, arg2);
				local112 = Static42.method1755(local88);
				if (local112.aBoolean75) {
					Static91.aClass6Array1[arg0].method119(local92, arg3, local98, local112.aBoolean71, arg2);
				}
			}
			if (arg6 == 1) {
				Static88.aClass20_1.method478(arg0, arg3, arg2);
			}
			if (arg6 == 2) {
				Static88.aClass20_1.method491(arg0, arg3, arg2);
				local112 = Static42.method1755(local88);
				if (arg3 + local112.anInt1279 > 103 || arg2 + local112.anInt1279 > 103 || local112.anInt1276 + arg3 > 103 || local112.anInt1276 + arg2 > 103) {
					return;
				}
				if (local112.aBoolean75) {
					Static91.aClass6Array1[arg0].method116(local112.aBoolean71, local112.anInt1279, arg2, local112.anInt1276, arg3, local98);
				}
			}
			if (arg6 == 3) {
				Static88.aClass20_1.method462(arg0, arg3, arg2);
				local112 = Static42.method1755(local88);
				if (local112.aBoolean75 && local112.anInt1272 == 1) {
					Static91.aClass6Array1[arg0].method125(arg3, arg2);
				}
			}
		}
		if (arg4 < 0) {
			return;
		}
		local82 = arg0;
		if (arg0 < 3 && (Static61.aByteArrayArrayArray7[1][arg3][arg2] & 0x2) == 2) {
			local82 = arg0 + 1;
		}
		Static71.method1286(Static88.aClass20_1, arg4, arg2, local82, arg0, arg3, Static91.aClass6Array1[arg0], arg5, arg1);
		return;
	}

	@OriginalMember(owner = "client!md", name = "f", descriptor = "(I)V")
	public static void method1080() {
		if (Static83.anInt2216 < 2 && Static35.anInt874 == 0 && Static12.anInt362 == 0) {
			return;
		}
		@Pc(35) Class42 local35;
		if (Static35.anInt874 == 1 && Static83.anInt2216 < 2) {
			local35 = Static57.method1822(new Class42[] { Static67.aClass42_862, Static3.aClass42_81, Static53.aClass42_1432, Static46.aClass42_667 });
		} else if (Static12.anInt362 == 1 && Static83.anInt2216 < 2) {
			local35 = Static57.method1822(new Class42[] { Static83.aClass42_1187, Static3.aClass42_81, Static70.aClass42_916, Static46.aClass42_667 });
		} else {
			local35 = Static36.aClass42Array6[Static83.anInt2216 - 1];
		}
		if (Static83.anInt2216 > 2) {
			local35 = Static57.method1822(new Class42[] { local35, Static73.aClass42_971, Static38.method642(Static83.anInt2216 - 2), Static52.aClass42_744 });
		}
		Static3.aClass1_Sub1_Sub1_Sub3_1.method813(local35, 4, 16777215, Static27.anInt768 / 1000);
	}
}
