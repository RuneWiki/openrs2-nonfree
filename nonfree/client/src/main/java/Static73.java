import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static73 {

	@OriginalMember(owner = "client!i", name = "X", descriptor = "Lclient!gf;")
	public static Class33 aClass33_1;

	@OriginalMember(owner = "client!i", name = "P", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_621 = Static120.method1824(")1");

	@OriginalMember(owner = "client!i", name = "R", descriptor = "[I")
	public static final int[] anIntArray200 = new int[500];

	@OriginalMember(owner = "client!i", name = "T", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_622 = Static120.method1824("null");

	@OriginalMember(owner = "client!i", name = "Y", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_623 = Static120.method1824("Unerwartete Antwort vom Anmelde)2Server)3");

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(ILclient!bc;I)Z")
	public static boolean method1102(@OriginalArg(1) Class1 arg0, @OriginalArg(2) int arg1) {
		@Pc(8) byte[] local8 = arg0.method42(arg1);
		if (local8 == null) {
			return false;
		} else {
			Static71.method1065(local8);
			return true;
		}
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(ILclient!qf;I)Lclient!rd;")
	public static Class80 method1104(@OriginalArg(0) int arg0, @OriginalArg(1) Class77 arg1) {
		if (!Static158.method2506(Static71.method1062(arg1), arg0) && arg1.anObjectArray20 == null) {
			return null;
		} else if (arg1.aClass80Array22 == null || arg1.aClass80Array22.length <= arg0 || arg1.aClass80Array22[arg0] == null || arg1.aClass80Array22[arg0].method2431().method2462() == 0) {
			return Static106.aBoolean90 ? Static154.method2467(new Class80[] { Static104.aClass80_889, Static83.method1219(arg0) }) : null;
		} else {
			return arg1.aClass80Array22[arg0];
		}
	}

	@OriginalMember(owner = "client!i", name = "c", descriptor = "(II)Z")
	public static boolean method1106(@OriginalArg(1) int arg0) {
		if (arg0 < 32) {
			return false;
		} else if (arg0 == 127) {
			return false;
		} else {
			return arg0 < 129 || arg0 > 159;
		}
	}
}
