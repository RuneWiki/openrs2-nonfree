import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static19 {

	@OriginalMember(owner = "client!bg", name = "H", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray3 = new String[100];

	@OriginalMember(owner = "client!bg", name = "I", descriptor = "[I")
	public static int[] anIntArray39 = new int[] { 1, 1, 1, 1, 4, 1, 1, 5, 6, 1, 5, 0, 7, 0, 4, 1, 7, 2, 1, 1, 6, 1, 1, 3, 6, 1, 7, 0, 0, 6, 7, 0, 1, 7, 6, 1, 1, 1, 5, 4, 3, 2, 1, 1, 0, 4, 1, 5 };

	@OriginalMember(owner = "client!bg", name = "X", descriptor = "[I")
	public static int[] anIntArray40 = new int[128];

	@OriginalMember(owner = "client!bg", name = "c", descriptor = "(Z)V")
	public static void method350() {
		anIntArray39 = null;
		anIntArray40 = null;
		aStringArray3 = null;
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public static boolean method351(@OriginalArg(0) String arg0) {
		return Static170.method2673(arg0);
	}

	@OriginalMember(owner = "client!bg", name = "b", descriptor = "(B)V")
	public static void method355() {
		@Pc(6) Class4_Sub23 local6;
		for (local6 = (Class4_Sub23) Static47.aClass10_8.method190(); local6 != null; local6 = (Class4_Sub23) Static47.aClass10_8.method191()) {
			if (local6.aBoolean212) {
				local6.method2708();
			}
		}
		for (local6 = (Class4_Sub23) Static118.aClass10_27.method190(); local6 != null; local6 = (Class4_Sub23) Static118.aClass10_27.method191()) {
			if (local6.aBoolean212) {
				local6.method2708();
			}
		}
	}
}
