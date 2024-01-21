import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static102 {

	@OriginalMember(owner = "client!vd", name = "c", descriptor = "Lclient!m;")
	public static Class10_Sub1_Sub1_Sub2 aClass10_Sub1_Sub1_Sub2_24;

	@OriginalMember(owner = "client!vd", name = "d", descriptor = "Lclient!m;")
	public static Class10_Sub1_Sub1_Sub2 aClass10_Sub1_Sub1_Sub2_25;

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "Lclient!va;")
	private static Class61 aClass61_1036 = Static88.method1421("Could not complete login)3");

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "I")
	public static int anInt2598 = 0;

	@OriginalMember(owner = "client!vd", name = "f", descriptor = "Lclient!va;")
	public static Class61 aClass61_1037 = Static88.method1421("p11_full");

	@OriginalMember(owner = "client!vd", name = "g", descriptor = "Lclient!va;")
	public static Class61 aClass61_1038 = aClass61_1036;

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(I)V")
	public static void method1630() {
		aClass61_1038 = null;
		aClass10_Sub1_Sub1_Sub2_25 = null;
		aClass61_1036 = null;
		aClass10_Sub1_Sub1_Sub2_24 = null;
		aClass61_1037 = null;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(Z)V")
	public static void method1631() {
		for (@Pc(7) int local7 = -1; local7 < Static10.anInt305; local7++) {
			@Pc(17) int local17;
			if (local7 == -1) {
				local17 = 2047;
			} else {
				local17 = Static58.anIntArray170[local7];
			}
			@Pc(25) Class10_Sub1_Sub5_Sub2_Sub2 local25 = Static105.aClass10_Sub1_Sub5_Sub2_Sub2Array1[local17];
			if (local25 != null) {
				Static55.method813(local25, 1);
			}
		}
	}
}
