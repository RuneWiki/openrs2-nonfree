import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static34 {

	@OriginalMember(owner = "client!bda", name = "Nb", descriptor = "[Lclient!s;")
	public static Class86[] aClass86Array5;

	@OriginalMember(owner = "client!bda", name = "xb", descriptor = "I")
	public static int anInt8073 = 0;

	@OriginalMember(owner = "client!bda", name = "yc", descriptor = "J")
	public static long aLong209 = 0L;

	@OriginalMember(owner = "client!bda", name = "Ac", descriptor = "I")
	public static int anInt8117 = -1;

	@OriginalMember(owner = "client!bda", name = "Oc", descriptor = "I")
	public static int anInt8129 = 0;

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(I[[I)V")
	public static void method6681(@OriginalArg(1) int[][] arg0) {
		Static632.anIntArrayArray65 = arg0;
	}

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(II)I")
	public static int method6690(@OriginalArg(1) int arg0) {
		@Pc(18) byte local18;
		if (arg0 > 12000) {
			Static426.method6634();
			local18 = 4;
		} else if (arg0 > 5000) {
			local18 = 3;
			Static139.method2957();
		} else if (arg0 <= 2000) {
			local18 = 1;
			Static169.method3359();
		} else {
			local18 = 2;
			Static127.method2816();
		}
		if (Static155.aClass8_Sub25_6.aClass36_Sub19_2.method6358() != 2) {
			Static155.aClass8_Sub25_6.method3465(Static155.aClass8_Sub25_6.aClass36_Sub19_1, 2);
			Static553.method7773(false, 2);
		}
		Static35.method7912();
		return local18;
	}
}
