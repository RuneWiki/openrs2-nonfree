import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static462 {

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "D")
	public static double aDouble40;

	@OriginalMember(owner = "client!qh", name = "c", descriptor = "[Lclient!s;")
	public static Class76[] aClass76Array3;

	@OriginalMember(owner = "client!qh", name = "b", descriptor = "(I)V")
	public static void method6281() {
		@Pc(17) Class2_Sub40 local17 = Static464.method6285(Static251.aClass131_1, Static478.aClass179_129);
		local17.aClass2_Sub22_Sub2_2.method8500(Static372.anInt5855);
		Static528.method7295(local17);
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(II)Z")
	public static boolean method6282(@OriginalArg(0) int arg0) {
		return arg0 == 0 || arg0 == 2;
	}
}
