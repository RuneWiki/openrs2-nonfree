import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static74 {

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

	@OriginalMember(owner = "client!ob", name = "f", descriptor = "Lclient!o;")
	public static Class40 aClass40_522 = Static13.method257("Report abuse");

	@OriginalMember(owner = "client!ob", name = "i", descriptor = "Lclient!oa;")
	public static Class41 aClass41_1 = new Class41();

	@OriginalMember(owner = "client!ob", name = "k", descriptor = "Z")
	public static boolean aBoolean146 = false;

	@OriginalMember(owner = "client!ob", name = "o", descriptor = "Lclient!qc;")
	public static Class47 aClass47_15 = new Class47(30);

	@OriginalMember(owner = "client!ob", name = "p", descriptor = "Lclient!o;")
	public static Class40 aClass40_523 = Static13.method257("*6nYou have not yet set any recovery questions)3*6nIt is @lre@strongly@yel@ recommended that you do so)3*6n*6nIf you don(Wt you will be @lre@unable to recover your*6n@lre@password@yel@ if you forget it)1 or it is stolen)3");

	@OriginalMember(owner = "client!ob", name = "q", descriptor = "Lclient!o;")
	public static Class40 aClass40_524 = Static13.method257("Choose Option");

	@OriginalMember(owner = "client!ob", name = "r", descriptor = "Lclient!o;")
	public static Class40 aClass40_525 = Static13.method257("(U1");

	@OriginalMember(owner = "client!ob", name = "u", descriptor = "I")
	public static int anInt1813 = 0;

	@OriginalMember(owner = "client!ob", name = "v", descriptor = "Lclient!o;")
	public static Class40 aClass40_526 = Static13.method257("Walk here @whi@");

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(Z)V")
	public static void method1209() {
		for (@Pc(15) Class2_Sub7 local15 = (Class2_Sub7) Static92.aClass44_7.method1224(); local15 != null; local15 = (Class2_Sub7) Static92.aClass44_7.method1231()) {
			if (local15.anInt826 > 0) {
				local15.anInt826--;
			}
			if (local15.anInt826 != 0) {
				if (local15.anInt827 > 0) {
					local15.anInt827--;
				}
				if (local15.anInt827 == 0 && local15.anInt818 >= 1 && local15.anInt821 >= 1 && local15.anInt818 <= 102 && local15.anInt821 <= 102 && (local15.anInt828 < 0 || Static81.method1335(local15.anInt828, local15.anInt819))) {
					Static98.method1566(local15.anInt823, local15.anInt818, local15.anInt821, local15.anInt819, local15.anInt817, local15.anInt828, local15.anInt829);
					local15.anInt827 = -1;
					if (local15.anInt828 == local15.anInt820 && local15.anInt820 == -1) {
						local15.method1677();
					} else if (local15.anInt820 == local15.anInt828 && local15.anInt825 == local15.anInt829 && local15.anInt819 == local15.anInt830) {
						local15.method1677();
					}
				}
			} else if (local15.anInt820 < 0 || Static81.method1335(local15.anInt820, local15.anInt830)) {
				Static98.method1566(local15.anInt823, local15.anInt818, local15.anInt821, local15.anInt830, local15.anInt817, local15.anInt820, local15.anInt825);
				local15.method1677();
			}
		}
	}

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "(Z)V")
	public static void method1210() {
		Static61.aClass47_14.method1330();
		Static90.aClass47_19.method1330();
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(I)V")
	public static void method1211() {
		aClass5_Sub1_13 = null;
		aClass40_526 = null;
		aClass41_1 = null;
		aClass40_523 = null;
		aClass11_4 = null;
		aClass47_15 = null;
		aClass40_524 = null;
		aClass40_522 = null;
		aClass40_525 = null;
		aClass5_24 = null;
		aByteArrayArrayArray8 = null;
	}
}
