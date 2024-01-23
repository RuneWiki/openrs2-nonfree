import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static53 {

	@OriginalMember(owner = "client!ef", name = "j", descriptor = "Z")
	public static boolean aBoolean62;

	@OriginalMember(owner = "client!ef", name = "m", descriptor = "[Lclient!gd;")
	public static Class2_Sub3_Sub8[] aClass2_Sub3_Sub8Array4;

	@OriginalMember(owner = "client!ef", name = "n", descriptor = "Lclient!gf;")
	public static Class40 aClass40_2;

	@OriginalMember(owner = "client!ef", name = "o", descriptor = "I")
	public static int anInt1723;

	@OriginalMember(owner = "client!ef", name = "l", descriptor = "Lclient!qe;")
	public static Class78 aClass78_381 = Static199.method3560("Versteckt");

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(II)Lclient!qe;")
	public static Class78 method1332(@OriginalArg(1) int arg0) {
		if (arg0 < 100000) {
			return Static94.method1640(new Class78[] { Static178.aClass78_719, Static19.method268(arg0), Static143.aClass78_611 });
		} else if (arg0 < 10000000) {
			return Static94.method1640(new Class78[] { Static29.aClass78_96, Static19.method268(arg0 / 1000), Static89.aClass78_440, Static143.aClass78_611 });
		} else {
			return Static94.method1640(new Class78[] { Static123.aClass78_565, Static19.method268(arg0 / 1000000), Static43.aClass78_151, Static143.aClass78_611 });
		}
	}

	@OriginalMember(owner = "client!ef", name = "c", descriptor = "(I)Z")
	public static boolean method1335() {
		@Pc(10) Class36 local10 = Static10.aClass36_1;
		synchronized (Static10.aClass36_1) {
			if (Static126.anInt2867 == Static182.anInt4234) {
				return false;
			} else {
				Static92.anInt2046 = Static139.anIntArray447[Static126.anInt2867];
				Static153.anInt3538 = Static64.anIntArray223[Static126.anInt2867];
				Static126.anInt2867 = Static126.anInt2867 + 1 & 0x7F;
				return true;
			}
		}
	}
}
