import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static363 {

	@OriginalMember(owner = "client!oq", name = "h", descriptor = "Lclient!bv;")
	public static final Class40 aClass40_103 = new Class40("Loading HW3D - ", "Lade HW3D - ", "Chargement HW3D - ", "Carregando HW3D - ");

	@OriginalMember(owner = "client!oq", name = "j", descriptor = "[I")
	public static final int[] anIntArray510 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!oq", name = "b", descriptor = "(BI)Lclient!bi;")
	public static Class30_Sub1 method5549(@OriginalArg(1) int arg0) {
		@Pc(12) Class77[] local12 = Class267.aClass77Array1;
		synchronized (Class267.aClass77Array1) {
			@Pc(28) Class30_Sub1 local28;
			if (arg0 >= Class267.aClass77Array1.length || Class267.aClass77Array1[arg0].method2158()) {
				local28 = new Class30_Sub1();
				local28.aClass30_Sub6Array1 = new Class30_Sub6[arg0];
				for (@Pc(34) int local34 = 0; local34 < arg0; local34++) {
					local28.aClass30_Sub6Array1[local34] = new Class30_Sub6();
				}
			} else {
				local28 = (Class30_Sub1) Class267.aClass77Array1[arg0].method2161();
				local28.method6004();
				@Pc(65) int local65 = Static314.anIntArray289[arg0]--;
			}
			return local28;
		}
	}
}
