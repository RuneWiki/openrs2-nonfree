import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static287 {

	@OriginalMember(owner = "client!sl", name = "c", descriptor = "Lclient!lf;")
	public static Class90 aClass90_16;

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(I)V")
	public static void method4918() {
		Static176.aClass2_9.method3248(Static207.aFloat82, Static25.aFloat6, Static137.aFloat66);
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(IIII)V")
	public static void method4920(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1) {
		@Pc(9) Class186 local9 = Static152.aClass186ArrayArray1[arg0][arg1];
		Static143.method2720(5000, local9 == null ? Static95.aClass186_1 : local9);
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(Z)V")
	public static void method4921() {
		if (Static61.aClass79_1 != null) {
			@Pc(7) Class79 local7 = Static61.aClass79_1;
			synchronized (Static61.aClass79_1) {
				Static61.aClass79_1 = null;
			}
		}
	}
}
