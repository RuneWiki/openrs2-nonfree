import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static115 {

	@OriginalMember(owner = "client!oa", name = "M", descriptor = "I")
	public static int anInt2777;

	@OriginalMember(owner = "client!oa", name = "A", descriptor = "Lclient!ai;")
	public static Class6 aClass6_791 = Static38.method685("Ihr Spielkonto wurde deaktiviert)3");

	@OriginalMember(owner = "client!oa", name = "F", descriptor = "Lclient!ai;")
	public static Class6 aClass6_793 = Static38.method685("me");

	@OriginalMember(owner = "client!oa", name = "I", descriptor = "I")
	public static int anInt2775 = 0;

	@OriginalMember(owner = "client!oa", name = "J", descriptor = "[I")
	public static int[] anIntArray235 = new int[5];

	@OriginalMember(owner = "client!oa", name = "K", descriptor = "[I")
	public static int[] anIntArray236 = new int[32];

	@OriginalMember(owner = "client!oa", name = "P", descriptor = "Lclient!ai;")
	private static Class6 aClass6_794 = Static38.method685("Members only world");

	@OriginalMember(owner = "client!oa", name = "R", descriptor = "Z")
	public static boolean aBoolean113 = false;

	@OriginalMember(owner = "client!oa", name = "T", descriptor = "Lclient!ai;")
	public static Class6 aClass6_795 = Static38.method685("Bitte warten Sie)3)3)3");

	@OriginalMember(owner = "client!oa", name = "U", descriptor = "Lclient!ai;")
	public static Class6 aClass6_796 = aClass6_794;

	@OriginalMember(owner = "client!oa", name = "V", descriptor = "Lclient!ai;")
	public static Class6 aClass6_797 = Static38.method685(")4slr)3ws?order=LPWM");

	@OriginalMember(owner = "client!oa", name = "W", descriptor = "Lclient!ai;")
	public static Class6 aClass6_798 = Static38.method685("<br>");

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(B)V")
	public static void method1858() {
		for (@Pc(18) Class2_Sub22 local18 = (Class2_Sub22) Static110.aClass84_6.method2694(); local18 != null; local18 = (Class2_Sub22) Static110.aClass84_6.method2697()) {
			if (local18.anInt3553 > 0) {
				local18.anInt3553--;
			}
			if (local18.anInt3553 != 0) {
				if (local18.anInt3549 > 0) {
					local18.anInt3549--;
				}
				if (local18.anInt3549 == 0 && local18.anInt3545 >= 1 && local18.anInt3557 >= 1 && local18.anInt3545 <= 102 && local18.anInt3557 <= 102 && (local18.anInt3552 < 0 || Static170.method2699(local18.anInt3558, local18.anInt3552))) {
					Static29.method521(local18.anInt3552, local18.anInt3551, local18.anInt3545, local18.anInt3550, local18.anInt3558, local18.anInt3546, local18.anInt3557);
					local18.anInt3549 = -1;
					if (local18.anInt3556 == local18.anInt3552 && local18.anInt3556 == -1) {
						local18.method2808();
					} else if (local18.anInt3556 == local18.anInt3552 && local18.anInt3551 == local18.anInt3544 && local18.anInt3558 == local18.anInt3547) {
						local18.method2808();
					}
				}
			} else if (local18.anInt3556 < 0 || Static170.method2699(local18.anInt3547, local18.anInt3556)) {
				Static29.method521(local18.anInt3556, local18.anInt3544, local18.anInt3545, local18.anInt3550, local18.anInt3547, local18.anInt3546, local18.anInt3557);
				local18.method2808();
			}
		}
	}

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "(B)V")
	public static void method1859() {
		aClass6_793 = null;
		aClass6_797 = null;
		aClass6_794 = null;
		anIntArray235 = null;
		aClass6_795 = null;
		aClass6_796 = null;
		anIntArray236 = null;
		aClass6_791 = null;
		aClass6_798 = null;
	}

	@OriginalMember(owner = "client!oa", name = "d", descriptor = "(B)I")
	public static int method1860() {
		return 6;
	}
}
