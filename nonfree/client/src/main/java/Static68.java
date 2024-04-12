import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static68 {

	@OriginalMember(owner = "client!ob", name = "c", descriptor = "Lclient!ud;")
	public static Class5 aClass5_24;

	@OriginalMember(owner = "client!ob", name = "e", descriptor = "Z")
	public static boolean aBoolean145;

	@OriginalMember(owner = "client!ob", name = "n", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray8;

	@OriginalMember(owner = "client!ob", name = "s", descriptor = "Lclient!cb;")
	public static Class11 aClass11_4;

	@OriginalMember(owner = "client!ob", name = "t", descriptor = "Lclient!ad;")
	public static Class5_Sub1 aClass5_Sub1_13;

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(Z)V", line = 9)
	public static void method1209() {
		for (@Pc(15) Class2_Sub7 local15 = (Class2_Sub7) Class45_Sub1.aClass44_7.method1224(); local15 != null; local15 = (Class2_Sub7) Class45_Sub1.aClass44_7.method1231()) {
			if (local15.anInt826 > 0) {
				local15.anInt826--;
			}
			if (local15.anInt826 != 0) {
				if (local15.anInt827 > 0) {
					local15.anInt827--;
				}
				if (local15.anInt827 == 0 && local15.anInt818 >= 1 && local15.anInt821 >= 1 && local15.anInt818 <= 102 && local15.anInt821 <= 102 && (local15.anInt828 < 0 || Static73.method1335(local15.anInt828, local15.anInt819))) {
					Static90.method1566(local15.anInt823, local15.anInt818, local15.anInt821, local15.anInt819, local15.anInt817, local15.anInt828, local15.anInt829);
					local15.anInt827 = -1;
					if (local15.anInt828 == local15.anInt820 && local15.anInt820 == -1) {
						local15.method1677();
					} else if (local15.anInt820 == local15.anInt828 && local15.anInt825 == local15.anInt829 && local15.anInt819 == local15.anInt830) {
						local15.method1677();
					}
				}
			} else if (local15.anInt820 < 0 || Static73.method1335(local15.anInt820, local15.anInt830)) {
				Static90.method1566(local15.anInt823, local15.anInt818, local15.anInt821, local15.anInt830, local15.anInt817, local15.anInt820, local15.anInt825);
				local15.method1677();
			}
		}
	}

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "(Z)V", line = 66)
	public static void method1210() {
		Class34.aClass47_14.method1330();
		Class56.aClass47_19.method1330();
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(I)V", line = 79)
	public static void method1211() {
		aClass5_Sub1_13 = null;
		Class42.aClass40_526 = null;
		Class42.aClass41_1 = null;
		Class42.aClass40_523 = null;
		aClass11_4 = null;
		Class42.aClass47_15 = null;
		Class42.aClass40_524 = null;
		Class42.aClass40_522 = null;
		Class42.aClass40_525 = null;
		aClass5_24 = null;
		aByteArrayArrayArray8 = null;
	}
}
