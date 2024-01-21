import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static61 {

	@OriginalMember(owner = "client!le", name = "cb", descriptor = "Lclient!pc;")
	public static Class12 aClass12_46;

	@OriginalMember(owner = "client!le", name = "hb", descriptor = "Lclient!pc;")
	public static Class12 aClass12_47;

	@OriginalMember(owner = "client!le", name = "V", descriptor = "Lclient!ce;")
	public static Class11 aClass11_2 = new Class11();

	@OriginalMember(owner = "client!le", name = "bb", descriptor = "I")
	public static int anInt1552 = 0;

	@OriginalMember(owner = "client!le", name = "db", descriptor = "I")
	public static int anInt1553 = 0;

	@OriginalMember(owner = "client!le", name = "eb", descriptor = "I")
	public static int anInt1554 = 0;

	@OriginalMember(owner = "client!le", name = "fb", descriptor = "Lclient!hb;")
	public static Class27 aClass27_763 = Static87.method1648("Neuer Benutzer");

	@OriginalMember(owner = "client!le", name = "gb", descriptor = "Lclient!hb;")
	public static Class27 aClass27_764 = Static87.method1648("Ihr Charakter)2Profil wird in:");

	@OriginalMember(owner = "client!le", name = "ib", descriptor = "Lclient!hb;")
	public static Class27 aClass27_765 = Static87.method1648("mod_icons");

	@OriginalMember(owner = "client!le", name = "jb", descriptor = "I")
	public static int anInt1555 = 0;

	@OriginalMember(owner = "client!le", name = "g", descriptor = "(I)V")
	public static void method1136() {
		Static70.aBoolean94 = false;
		Static26.aBoolean38 = false;
	}

	@OriginalMember(owner = "client!le", name = "b", descriptor = "(IIII)I")
	public static int method1137(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = arg1 & 0x3;
		if (local7 == 0) {
			return arg0;
		} else if (local7 == 1) {
			return 7 - arg2;
		} else if (local7 == 2) {
			return 7 - arg0;
		} else {
			return arg2;
		}
	}

	@OriginalMember(owner = "client!le", name = "c", descriptor = "(B)V")
	public static void method1139() {
		for (@Pc(10) Class3_Sub13 local10 = (Class3_Sub13) Static82.aClass28_10.method884(); local10 != null; local10 = (Class3_Sub13) Static82.aClass28_10.method875()) {
			if (local10.anInt2707 > 0) {
				local10.anInt2707--;
			}
			if (local10.anInt2707 != 0) {
				if (local10.anInt2706 > 0) {
					local10.anInt2706--;
				}
				if (local10.anInt2706 == 0 && local10.anInt2725 >= 1 && local10.anInt2716 >= 1 && local10.anInt2725 <= 102 && local10.anInt2716 <= 102 && (local10.anInt2717 < 0 || Static96.method1229(local10.anInt2715, local10.anInt2717))) {
					Static40.method873(local10.anInt2715, local10.anInt2725, local10.anInt2717, local10.anInt2711, local10.anInt2716, local10.anInt2710, local10.anInt2703);
					local10.anInt2706 = -1;
					if (local10.anInt2717 == local10.anInt2704 && local10.anInt2704 == -1) {
						local10.method1883();
					} else if (local10.anInt2717 == local10.anInt2704 && local10.anInt2703 == local10.anInt2720 && local10.anInt2709 == local10.anInt2715) {
						local10.method1883();
					}
				}
			} else if (local10.anInt2704 < 0 || Static96.method1229(local10.anInt2709, local10.anInt2704)) {
				Static40.method873(local10.anInt2709, local10.anInt2725, local10.anInt2704, local10.anInt2711, local10.anInt2716, local10.anInt2710, local10.anInt2720);
				local10.method1883();
			}
		}
	}

	@OriginalMember(owner = "client!le", name = "d", descriptor = "(B)V")
	public static void method1140() {
		aClass27_765 = null;
		aClass11_2 = null;
		aClass12_47 = null;
		aClass27_764 = null;
		aClass12_46 = null;
		aClass27_763 = null;
	}
}
