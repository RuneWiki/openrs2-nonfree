import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static525 {

	@OriginalMember(owner = "client!rm", name = "ab", descriptor = "Lclient!ft;")
	public static Class125 aClass125_14;

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(ZI)V")
	public static void method7093(@OriginalArg(1) int arg0) {
		Static232.method3350();
		@Pc(11) int local11 = Static522.aClass365_1.method8030(arg0).anInt3663;
		if (local11 == 0) {
			return;
		}
		@Pc(19) int local19 = Static526.aClass293_1.anIntArray509[arg0];
		if (local11 == 6) {
			Static317.anInt4916 = local19;
		}
		if (local11 == 5) {
			Static18.anInt6908 = local19;
		}
	}
}
