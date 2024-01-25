import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static280 {

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "[Lclient!rw;")
	public static final Class4_Sub1_Sub17[] aClass4_Sub1_Sub17Array4 = new Class4_Sub1_Sub17[14];

	@OriginalMember(owner = "client!oc", name = "k", descriptor = "[I")
	public static final int[] anIntArray407 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(II)V")
	public static void method4406(@OriginalArg(1) int arg0) {
		Static216.method4795();
		@Pc(11) int local11 = Static99.aClass50_1.method1529(arg0).anInt4982;
		if (local11 == 0) {
			return;
		}
		@Pc(19) int local19 = Static67.aClass224_1.anIntArray506[arg0];
		if (local11 == 5) {
			Static80.anInt1921 = local19;
		}
		if (local11 == 6) {
			Static84.anInt7964 = local19;
		}
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(I[[I)V")
	public static void method4410(@OriginalArg(1) int[][] arg0) {
		Static400.anIntArrayArray54 = arg0;
	}
}
