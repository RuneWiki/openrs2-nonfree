import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static23 {

	@OriginalMember(owner = "client!au", name = "w", descriptor = "I")
	public static int anInt578;

	@OriginalMember(owner = "client!au", name = "b", descriptor = "I")
	public static int anInt574 = 1;

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(ZI)V")
	public static void method490(@OriginalArg(1) int arg0) {
		@Pc(8) Class1_Sub8_Sub9 local8 = Static465.method6470(arg0, 10);
		local8.method4835();
	}
}
