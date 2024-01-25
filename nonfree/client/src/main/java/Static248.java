import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static248 {

	@OriginalMember(owner = "client!kg", name = "c", descriptor = "F")
	public static float aFloat156;

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(IZIII)V")
	public static void method4284(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(17) Class3_Sub10_Sub16 local17 = Static362.method5701(arg2, 4);
		local17.method6211();
		local17.anInt7561 = arg3;
		local17.anInt7557 = arg0;
		local17.anInt7556 = arg1;
	}
}
