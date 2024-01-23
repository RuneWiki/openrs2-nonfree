import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static107 {

	@OriginalMember(owner = "client!k", name = "c", descriptor = "I")
	public static int anInt2342 = 0;

	@OriginalMember(owner = "client!k", name = "d", descriptor = "Lclient!sc;")
	public static Class107 aClass107_632 = Static231.method3737("loginscreen");

	@OriginalMember(owner = "client!k", name = "f", descriptor = "[Lclient!jc;")
	public static Class60[] aClass60Array1 = new Class60[4];

	@OriginalMember(owner = "client!k", name = "g", descriptor = "Lclient!sc;")
	public static Class107 aClass107_633 = Static231.method3737("");

	@OriginalMember(owner = "client!k", name = "i", descriptor = "I")
	public static int anInt2345 = 0;

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(IZ)V")
	public static void method1858(@OriginalArg(0) int arg0) {
		Static194.anInt4290 = -1;
		Static114.anInt2509 = arg0;
		Static194.anInt4290 = -1;
		Static25.method458();
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(I)V")
	public static void method1859() {
		for (@Pc(7) int local7 = -1; local7 < Static10.anInt285; local7++) {
			@Pc(14) int local14;
			if (local7 == -1) {
				local14 = 2047;
			} else {
				local14 = Static16.anIntArray38[local7];
			}
			@Pc(24) Class5_Sub5_Sub1 local24 = Static198.aClass5_Sub5_Sub1Array1[local14];
			if (local24 != null) {
				Static179.method2850(local24, local24.anInt2997);
			}
		}
	}
}
