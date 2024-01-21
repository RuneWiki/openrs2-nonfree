import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static203 {

	@OriginalMember(owner = "client!ve", name = "w", descriptor = "[[[Lclient!sc;")
	public static Class2_Sub23[][][] aClass2_Sub23ArrayArrayArray1;

	@OriginalMember(owner = "client!ve", name = "I", descriptor = "[I")
	public static int[] anIntArray399;

	@OriginalMember(owner = "client!ve", name = "m", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_1152 = Static181.method2795("title)3jpg");

	@OriginalMember(owner = "client!ve", name = "t", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_1153 = Static181.method2795("(Y");

	@OriginalMember(owner = "client!ve", name = "y", descriptor = "Lclient!qe;")
	private static final Class83 aClass83_1154 = Static181.method2795("Prepared sound engine");

	@OriginalMember(owner = "client!ve", name = "A", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_1155 = Static181.method2795("und die Schaltfl-=che (WSpielkonto erstellen(W am");

	@OriginalMember(owner = "client!ve", name = "C", descriptor = "Lclient!qe;")
	public static Class83 aClass83_1156 = aClass83_1154;

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIII)I")
	public static int method3079(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int local12 = arg1 & 0x3;
		if (local12 == 0) {
			return arg2;
		} else if (local12 == 1) {
			return arg0;
		} else if (local12 == 2) {
			return 7 - arg2;
		} else {
			return 7 - arg0;
		}
	}

	@OriginalMember(owner = "client!ve", name = "c", descriptor = "(B)V")
	public static void method3081() {
		Static104.aClass86_30.method2641();
		Static108.aClass91_9.method2709();
	}
}
