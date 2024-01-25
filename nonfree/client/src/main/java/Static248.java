import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static248 {

	@OriginalMember(owner = "client!k", name = "c", descriptor = "[Lclient!xa;")
	public static Class4[] aClass4Array9;

	@OriginalMember(owner = "client!k", name = "d", descriptor = "[Z")
	public static boolean[] aBooleanArray25;

	@OriginalMember(owner = "client!k", name = "b", descriptor = "Lclient!wt;")
	public static final Class211 aClass211_1 = Static131.method1966();

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(B)V")
	public static void method3540() {
		Static120.aClass212_5.method5110();
		Static91.aClass212_24.method5110();
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(II)Z")
	public static boolean method3541(@OriginalArg(1) int arg0) {
		return arg0 == 22 || arg0 == 48 || arg0 == 1009 || arg0 == 4 || arg0 == 5;
	}

	@OriginalMember(owner = "client!k", name = "b", descriptor = "(II)V")
	public static void method3542(@OriginalArg(0) int arg0) {
		@Pc(10) Class6_Sub1_Sub5 local10 = Static77.method1176(arg0, 9);
		local10.method770();
	}
}
