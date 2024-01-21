import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static131 {

	@OriginalMember(owner = "client!ni", name = "q", descriptor = "I")
	public static int anInt2727;

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "I")
	public static int anInt2717 = -1;

	@OriginalMember(owner = "client!ni", name = "b", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_988 = Static161.method2452("Keine Antwort vom Anmelde)2Server)3");

	@OriginalMember(owner = "client!ni", name = "d", descriptor = "Lclient!dc;")
	private static final Class20 aClass20_989 = Static161.method2452("Please check your message)2centre for details)3");

	@OriginalMember(owner = "client!ni", name = "f", descriptor = "I")
	public static int anInt2719 = 0;

	@OriginalMember(owner = "client!ni", name = "j", descriptor = "Lclient!dc;")
	public static Class20 aClass20_990 = aClass20_989;

	@OriginalMember(owner = "client!ni", name = "n", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_991 = Static161.method2452("Fallen lassen");

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(I)V")
	public static void method2026() {
		for (@Pc(15) Class5_Sub23 local15 = (Class5_Sub23) Static18.aClass91_3.method2684(); local15 != null; local15 = (Class5_Sub23) Static18.aClass91_3.method2678()) {
			if (local15.anInt3037 == -1) {
				local15.anInt3030 = 0;
				Static99.method1684(local15);
			} else {
				local15.method3207();
			}
		}
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(IIIIB)V")
	public static void method2031(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(19) int local19;
		if (arg2 <= arg1) {
			for (local19 = arg2; local19 < arg1; local19++) {
				Static9.anIntArrayArray1[local19][arg3] = arg0;
			}
		} else {
			for (local19 = arg1; local19 < arg2; local19++) {
				Static9.anIntArrayArray1[local19][arg3] = arg0;
			}
		}
	}
}
