import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static101 {

	@OriginalMember(owner = "client!rc", name = "t", descriptor = "Lclient!c;")
	public static Class10 aClass10_1;

	@OriginalMember(owner = "client!rc", name = "w", descriptor = "Lclient!na;")
	public static Class56 aClass56_33;

	@OriginalMember(owner = "client!rc", name = "F", descriptor = "Ljava/awt/Image;")
	public static Image anImage4;

	@OriginalMember(owner = "client!rc", name = "s", descriptor = "I")
	public static int anInt2290 = 0;

	@OriginalMember(owner = "client!rc", name = "x", descriptor = "[Lclient!pe;")
	public static Class65[] aClass65Array57 = new Class65[100];

	@OriginalMember(owner = "client!rc", name = "z", descriptor = "Lclient!wa;")
	public static Class2_Sub22 aClass2_Sub22_12 = null;

	@OriginalMember(owner = "client!rc", name = "D", descriptor = "Lclient!pe;")
	private static Class65 aClass65_970 = Static119.method1462("flash1:");

	@OriginalMember(owner = "client!rc", name = "A", descriptor = "Lclient!pe;")
	public static Class65 aClass65_968 = aClass65_970;

	@OriginalMember(owner = "client!rc", name = "B", descriptor = "Lclient!pe;")
	public static Class65 aClass65_969 = aClass65_970;

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lclient!na;III)[Lclient!k;")
	public static Class2_Sub1_Sub4_Sub2[] method1656(@OriginalArg(0) Class56 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		return Static10.method2052(arg0, arg1, arg2) ? Static32.method621() : null;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(ILclient!pe;IIIILclient!pe;)V")
	public static void method1657(@OriginalArg(0) int arg0, @OriginalArg(1) Class65 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class65 arg5) {
		if (Static3.aBoolean5 || Static49.anInt1205 >= 500) {
			return;
		}
		Static83.aClass65Array39[Static49.anInt1205] = arg1;
		Static83.aClass65Array40[Static49.anInt1205] = arg5;
		Static126.anIntArray355[Static49.anInt1205] = arg4;
		Static45.anIntArray131[Static49.anInt1205] = arg3;
		Static84.anIntArray241[Static49.anInt1205] = arg0;
		Static113.anIntArray333[Static49.anInt1205] = arg2;
		Static49.anInt1205++;
	}

	@OriginalMember(owner = "client!rc", name = "c", descriptor = "(B)V")
	public static void method1658() {
		aClass65_969 = null;
		aClass65_970 = null;
		aClass56_33 = null;
		anImage4 = null;
		aClass2_Sub22_12 = null;
		aClass65Array57 = null;
		aClass10_1 = null;
		aClass65_968 = null;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lclient!qb;IIII)V")
	public static void method1659(@OriginalArg(0) Class2_Sub1_Sub12 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static49.anInt1205 >= 400) {
			return;
		}
		if (arg0.anIntArray282 != null) {
			arg0 = arg0.method1557();
		}
		if (arg0 == null || !arg0.aBoolean83) {
			return;
		}
		@Pc(35) Class65 local35 = arg0.aClass65_894;
		if (arg0.anInt2123 != 0) {
			local35 = Static35.method647(new Class65[] { local35, Static105.method1706(arg0.anInt2123, Static114.aClass2_Sub1_Sub1_Sub4_Sub1_1.anInt1024), Static33.aClass65_366, Static70.aClass65_700, Static120.method1871(arg0.anInt2123), Static21.aClass65_254 });
		}
		if (Static113.anInt2520 == 1) {
			method1657(arg3, Static76.aClass65_725, arg2, arg1, 43, Static35.method647(new Class65[] { Static18.aClass65_143, Static96.aClass65_920, local35 }));
		} else if (!Static117.aBoolean103) {
			@Pc(113) Class65[] local113 = arg0.aClass65Array51;
			if (Static99.aBoolean91) {
				local113 = Static47.method810(local113);
			}
			@Pc(127) int local127;
			if (local113 != null) {
				for (local127 = 4; local127 >= 0; local127--) {
					if (local113[local127] != null && !local113[local127].method1488(Static22.aClass65_263)) {
						@Pc(142) byte local142 = 0;
						if (local127 == 0) {
							local142 = 39;
						}
						if (local127 == 1) {
							local142 = 48;
						}
						if (local127 == 2) {
							local142 = 31;
						}
						if (local127 == 3) {
							local142 = 38;
						}
						if (local127 == 4) {
							local142 = 50;
						}
						method1657(arg3, local113[local127], arg2, arg1, local142, Static35.method647(new Class65[] { Static7.aClass65_93, local35 }));
					}
				}
			}
			if (local113 != null) {
				for (local127 = 4; local127 >= 0; local127--) {
					if (local113[local127] != null && local113[local127].method1488(Static22.aClass65_263)) {
						@Pc(223) int local223 = 0;
						@Pc(225) short local225 = 0;
						if (Static114.aClass2_Sub1_Sub1_Sub4_Sub1_1.anInt1024 < arg0.anInt2123) {
							local225 = 2000;
						}
						if (local127 == 0) {
							local223 = local225 + 39;
						}
						if (local127 == 1) {
							local223 = local225 + 48;
						}
						if (local127 == 2) {
							local223 = local225 + 31;
						}
						if (local127 == 3) {
							local223 = local225 + 38;
						}
						if (local127 == 4) {
							local223 = local225 + 50;
						}
						method1657(arg3, local113[local127], arg2, arg1, local223, Static35.method647(new Class65[] { Static7.aClass65_93, local35 }));
					}
				}
			}
			method1657(arg3, Static117.aClass65_1113, arg2, arg1, 1007, Static35.method647(new Class65[] { Static7.aClass65_93, local35 }));
		} else if ((Static16.anInt2217 & 0x2) == 2) {
			method1657(arg3, Static103.aClass65_984, arg2, arg1, 36, Static35.method647(new Class65[] { Static22.aClass65_262, Static96.aClass65_920, local35 }));
		}
	}
}
