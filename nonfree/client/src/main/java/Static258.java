import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static258 {

	@OriginalMember(owner = "client!n", name = "N", descriptor = "I")
	public static int anInt4423;

	@OriginalMember(owner = "client!n", name = "R", descriptor = "I")
	public static int anInt4426 = 0;

	@OriginalMember(owner = "client!n", name = "Z", descriptor = "Lclient!nd;")
	public static final Class175 aClass175_13 = new Class175(9, 4);

	@OriginalMember(owner = "client!n", name = "ab", descriptor = "Lclient!bg;")
	public static final Class25 aClass25_66 = new Class25(38, -1);

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(IIBII)V")
	public static void method3969(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg0 < arg3) {
			Static73.method1404(Static347.anIntArrayArray54[arg2], arg3, arg1, arg0);
		} else {
			Static73.method1404(Static347.anIntArrayArray54[arg2], arg0, arg1, arg3);
		}
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(BI)V")
	public static void method3972() {
		Static271.anInt4635 = -1;
		Static2.anInt9 = 1;
		Static61.aBoolean110 = false;
		anInt4423 = 0;
		Static422.anInt7022 = -1;
		Static411.aClass158_87 = null;
		Static254.anInt3860 = 2;
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(ZZ)Z")
	public static boolean method3975(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		return arg0 | arg1;
	}
}
