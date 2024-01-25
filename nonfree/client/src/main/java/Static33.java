import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static33 {

	@OriginalMember(owner = "client!bk", name = "I", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray4 = new String[8];

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(ZI)Lclient!dv;")
	public static Class55 method564(@OriginalArg(1) int arg0) {
		@Pc(10) Class55 local10 = (Class55) Static80.aClass44_14.method1028((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static250.aClass243_138.method5455(arg0, 1);
		local10 = new Class55();
		local10.anInt1561 = arg0;
		if (local20 != null) {
			local10.method1264(new Class5_Sub15(local20));
		}
		local10.method1260();
		if (local10.anInt1558 == 2 && Static335.aClass252_32.method5659((long) arg0) == null) {
			Static335.aClass252_32.method5658(new Class5_Sub34(Static413.anInt6873), (long) arg0);
			Static184.aClass55Array1[Static413.anInt6873++] = local10;
		}
		Static80.aClass44_14.method1017((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!bk", name = "b", descriptor = "(II)V")
	public static void method565(@OriginalArg(1) int arg0) {
		@Pc(12) Class5_Sub2_Sub9 local12 = Static72.method1073(14, arg0);
		local12.method3024();
	}
}
