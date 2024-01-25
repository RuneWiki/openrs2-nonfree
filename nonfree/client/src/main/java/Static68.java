import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static68 {

	@OriginalMember(owner = "client!cfa", name = "E", descriptor = "F")
	public static float aFloat50;

	@OriginalMember(owner = "client!cfa", name = "F", descriptor = "J")
	public static long aLong50 = -1L;

	@OriginalMember(owner = "client!cfa", name = "a", descriptor = "(BII)Z")
	public static boolean method1588(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x22) != 0;
	}

	@OriginalMember(owner = "client!cfa", name = "a", descriptor = "(Z)V")
	public static void method1589() {
		@Pc(20) Class2_Sub31 local20 = Static275.method4480(Static640.aClass314_2, Static556.aClass145_163);
		local20.aClass2_Sub17_Sub1_2.method2837(0);
		Static526.method7309(local20);
	}
}
