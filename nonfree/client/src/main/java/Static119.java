import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static119 {

	@OriginalMember(owner = "client!fn", name = "J", descriptor = "[Z")
	public static boolean[] aBooleanArray10;

	@OriginalMember(owner = "client!fn", name = "G", descriptor = "I")
	public static int anInt2204 = 0;

	@OriginalMember(owner = "client!fn", name = "I", descriptor = "Ljava/lang/Boolean;")
	public static Boolean aBoolean148 = Boolean.FALSE;

	@OriginalMember(owner = "client!fn", name = "e", descriptor = "(I)V")
	public static void method1791() {
		for (@Pc(15) Class2_Sub5_Sub8 local15 = (Class2_Sub5_Sub8) Static186.aClass156_56.method3155(); local15 != null; local15 = (Class2_Sub5_Sub8) Static186.aClass156_56.method3150()) {
			@Pc(20) Class3_Sub4_Sub3 local20 = local15.aClass3_Sub4_Sub3_1;
			if (local20.aBoolean323) {
				local15.method5703();
				local20.method3687();
			} else if (Static266.anInt4392 >= local20.anInt4518) {
				local20.method3685(Static233.anInt6983);
				if (local20.aBoolean323) {
					local15.method5703();
				} else {
					Static249.method3169(local20, true);
				}
			}
		}
	}
}
