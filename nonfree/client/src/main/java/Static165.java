import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static165 {

	@OriginalMember(owner = "client!ig", name = "c", descriptor = "Z")
	public static boolean aBoolean224 = false;

	@OriginalMember(owner = "client!ig", name = "e", descriptor = "Lclient!dq;")
	public static final Class56 aClass56_109 = new Class56(11, 14);

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(Lclient!ya;IBI)V")
	public static void method2303(@OriginalArg(0) Class135 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		Static172.aClass135_4 = arg0;
		Static67.aClass206ArrayArray1 = new Class206[arg2][arg1];
		if (Static410.anIntArray525 != null) {
			Static341.aClass3_4 = Static209.method2908(Static410.anIntArray525[3], Static410.anIntArray525[1], Static410.anIntArray525[5], Static410.anIntArray525[0], Static410.anIntArray525[2], Static410.anIntArray525[4]);
		}
		Static18.aClass206_1 = new Class206();
		Static277.method3669();
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(II)V")
	public static void method2304(@OriginalArg(1) int arg0) {
		@Pc(12) Class4_Sub2_Sub17 local12 = Static34.method1709(7, arg0);
		local12.method5523();
	}
}
