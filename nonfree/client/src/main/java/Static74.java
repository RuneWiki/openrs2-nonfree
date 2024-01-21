import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static74 {

	@OriginalMember(owner = "client!p", name = "M", descriptor = "I")
	public static int anInt1866;

	@OriginalMember(owner = "client!p", name = "eb", descriptor = "Lclient!w;")
	public static Class15 aClass15_29;

	@OriginalMember(owner = "client!p", name = "O", descriptor = "Lclient!va;")
	private static Class61 aClass61_780 = Static88.method1421("Prepared visibility map");

	@OriginalMember(owner = "client!p", name = "Q", descriptor = "I")
	public static int anInt1869 = 0;

	@OriginalMember(owner = "client!p", name = "R", descriptor = "Lclient!va;")
	public static Class61 aClass61_781 = aClass61_780;

	@OriginalMember(owner = "client!p", name = "T", descriptor = "I")
	public static int anInt1871 = -1;

	@OriginalMember(owner = "client!p", name = "U", descriptor = "[Lclient!lb;")
	public static Class36[] aClass36Array1 = new Class36[50];

	@OriginalMember(owner = "client!p", name = "X", descriptor = "Lclient!va;")
	private static Class61 aClass61_782 = Static88.method1421("Click to continue");

	@OriginalMember(owner = "client!p", name = "ab", descriptor = "[I")
	public static int[] anIntArray228 = new int[2000];

	@OriginalMember(owner = "client!p", name = "bb", descriptor = "Lclient!va;")
	public static Class61 aClass61_783 = aClass61_782;

	@OriginalMember(owner = "client!p", name = "cb", descriptor = "I")
	public static int anInt1875 = -1;

	@OriginalMember(owner = "client!p", name = "db", descriptor = "I")
	public static int anInt1876 = 0;

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(IBLclient!me;II)V")
	public static void method1040(@OriginalArg(0) int arg0, @OriginalArg(2) Class10_Sub1_Sub5_Sub2_Sub2 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static52.aClass10_Sub1_Sub5_Sub2_Sub2_1 == arg1 || Static23.anInt747 >= 400) {
			return;
		}
		@Pc(57) Class61 local57;
		if (arg1.anInt1696 == 0) {
			local57 = Static93.method1156(new Class61[] { arg1.aClass61_699, Static39.method228(arg1.anInt1702, Static52.aClass10_Sub1_Sub5_Sub2_Sub2_1.anInt1702), Static69.aClass61_749, Static25.aClass61_301, Static29.method529(arg1.anInt1702), Static54.aClass61_614 });
		} else {
			local57 = Static93.method1156(new Class61[] { arg1.aClass61_699, Static69.aClass61_749, Static5.aClass61_14, Static29.method529(arg1.anInt1696), Static54.aClass61_614 });
		}
		@Pc(132) int local132;
		if (Static94.anInt2408 == 1) {
			Static107.method1502(arg2, arg0, 31, arg3, Static93.method1156(new Class61[] { Static101.aClass61_1035, Static24.aClass61_925, Static37.aClass61_435, Static56.aClass61_622, local57 }));
		} else if (Static20.anInt2651 != 1) {
			for (local132 = 4; local132 >= 0; local132--) {
				if (Static63.aClass61Array5[local132] != null) {
					@Pc(140) short local140 = 0;
					if (Static63.aClass61Array5[local132].method1594(Static37.aClass61_425)) {
						if (Static52.aClass10_Sub1_Sub5_Sub2_Sub2_1.anInt1702 < arg1.anInt1702) {
							local140 = 2000;
						}
						if (Static52.aClass10_Sub1_Sub5_Sub2_Sub2_1.anInt1707 != 0 && arg1.anInt1707 != 0) {
							if (Static52.aClass10_Sub1_Sub5_Sub2_Sub2_1.anInt1707 == arg1.anInt1707) {
								local140 = 2000;
							} else {
								local140 = 0;
							}
						}
					} else if (Static56.aBooleanArray7[local132]) {
						local140 = 2000;
					}
					@Pc(192) int local192 = 0;
					if (local132 == 0) {
						local192 = local140 + 52;
					}
					if (local132 == 1) {
						local192 = local140 + 47;
					}
					if (local132 == 2) {
						local192 = local140 + 19;
					}
					if (local132 == 3) {
						local192 = local140 + 5;
					}
					if (local132 == 4) {
						local192 = local140 + 25;
					}
					Static107.method1502(arg2, arg0, local192, arg3, Static93.method1156(new Class61[] { Static63.aClass61Array5[local132], Static65.aClass61_722, local57 }));
				}
			}
		} else if ((Static88.anInt2310 & 0x8) == 8) {
			Static107.method1502(arg2, arg0, 54, arg3, Static93.method1156(new Class61[] { Static49.aClass61_568, Static56.aClass61_622, local57 }));
		}
		for (local132 = 0; local132 < Static23.anInt747; local132++) {
			if (Static29.anIntArray96[local132] == 13) {
				Static19.aClass61Array7[local132] = Static93.method1156(new Class61[] { Static24.aClass61_926, Static65.aClass61_722, local57 });
				return;
			}
		}
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(BLclient!he;Lclient!he;)V")
	public static void method1041(@OriginalArg(1) Class11 arg0, @OriginalArg(2) Class11 arg1) {
		Static56.aClass11_38 = arg0;
		Static1.aClass11_1 = arg1;
		Static53.anInt1452 = Static56.aClass11_38.method217(3);
	}

	@OriginalMember(owner = "client!p", name = "b", descriptor = "(I)V")
	public static void method1042() {
		try {
			@Pc(11) Graphics local11 = Static38.aCanvas1.getGraphics();
			Static106.aClass15_39.method594(4, 4, local11);
		} catch (@Pc(19) Exception local19) {
			Static38.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!p", name = "b", descriptor = "(II)Z")
	public static boolean method1044(@OriginalArg(0) int arg0) {
		if (arg0 < 32) {
			return false;
		} else if (arg0 == 127) {
			return false;
		} else {
			return arg0 < 129 || arg0 > 159;
		}
	}

	@OriginalMember(owner = "client!p", name = "b", descriptor = "(Z)V")
	public static void method1045() {
		aClass61_781 = null;
		aClass61_783 = null;
		aClass15_29 = null;
		anIntArray228 = null;
		aClass61_780 = null;
		aClass61_782 = null;
		aClass36Array1 = null;
	}
}
