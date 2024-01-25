import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static130 {

	@OriginalMember(owner = "client!hr", name = "e", descriptor = "Lclient!ke;")
	public static Class5_Sub3_Sub3_Sub1 aClass5_Sub3_Sub3_Sub1_1;

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "Lclient!br;")
	public static final Class26 aClass26_17 = new Class26(16);

	@OriginalMember(owner = "client!hr", name = "f", descriptor = "Lclient!br;")
	public static final Class26 aClass26_18 = new Class26(16);

	@OriginalMember(owner = "client!hr", name = "g", descriptor = "I")
	public static volatile int anInt2532 = 0;

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(Ljava/lang/String;II)V")
	public static void method2458(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		@Pc(7) boolean local7 = false;
		for (@Pc(17) int local17 = 0; local17 < Static334.anInt6370; local17++) {
			@Pc(25) Class5_Sub3_Sub3_Sub1 local25 = Static254.aClass5_Sub3_Sub3_Sub1Array1[Static123.anIntArray290[local17]];
			if (local25 != null && local25.aString130 != null && local25.aString130.equalsIgnoreCase(arg0)) {
				if (arg1 == 1) {
					Static248.aClass1_Sub7_Sub1_2.method728(54);
					Static248.aClass1_Sub7_Sub1_2.method3108(0);
					Static248.aClass1_Sub7_Sub1_2.method3142(Static123.anIntArray290[local17]);
				} else if (arg1 == 4) {
					Static248.aClass1_Sub7_Sub1_2.method728(203);
					Static248.aClass1_Sub7_Sub1_2.method3128(Static123.anIntArray290[local17]);
					Static248.aClass1_Sub7_Sub1_2.method3108(0);
				} else if (arg1 == 5) {
					Static248.aClass1_Sub7_Sub1_2.method728(195);
					Static248.aClass1_Sub7_Sub1_2.method3128(Static123.anIntArray290[local17]);
					Static248.aClass1_Sub7_Sub1_2.method3096(0);
				} else if (arg1 == 6) {
					Static248.aClass1_Sub7_Sub1_2.method728(129);
					Static248.aClass1_Sub7_Sub1_2.method3116(0);
					Static248.aClass1_Sub7_Sub1_2.method3150(Static123.anIntArray290[local17]);
				} else if (arg1 == 7) {
					Static248.aClass1_Sub7_Sub1_2.method728(237);
					Static248.aClass1_Sub7_Sub1_2.method3128(Static123.anIntArray290[local17]);
					Static248.aClass1_Sub7_Sub1_2.method3116(0);
				}
				local7 = true;
				break;
			}
		}
		if (!local7) {
			Static88.method1697(Static96.aString257 + arg0);
		}
	}
}
