import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static131 {

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "I")
	public static int anInt2935;

	@OriginalMember(owner = "client!fba", name = "i", descriptor = "I")
	public static int anInt2940;

	@OriginalMember(owner = "client!fba", name = "j", descriptor = "I")
	public static int anInt2941;

	@OriginalMember(owner = "client!fba", name = "k", descriptor = "I")
	public static int anInt2942 = 0;

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(IIBIIIIIII)V")
	public static void method2556(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(7) int arg4, @OriginalArg(8) int arg5, @OriginalArg(9) int arg6) {
		@Pc(5) Class3_Sub45 local5 = null;
		for (@Pc(24) Class3_Sub45 local24 = (Class3_Sub45) Static364.aClass183_46.method4795(); local24 != null; local24 = (Class3_Sub45) Static364.aClass183_46.method4793()) {
			if (arg2 == local24.anInt9265 && local24.anInt9258 == arg4 && local24.anInt9267 == arg1 && arg3 == local24.anInt9268) {
				local5 = local24;
				break;
			}
		}
		if (local5 == null) {
			local5 = new Class3_Sub45();
			local5.anInt9258 = arg4;
			local5.anInt9267 = arg1;
			local5.anInt9265 = arg2;
			local5.anInt9268 = arg3;
			if (arg4 >= 0 && arg1 >= 0 && Static460.anInt8640 > arg4 && arg1 < Static292.anInt7682) {
				Static459.method7067(local5);
			}
			Static364.aClass183_46.method4792(local5);
		}
		local5.anInt9256 = 0;
		local5.anInt9263 = -1;
		local5.anInt9262 = arg0;
		local5.anInt9266 = arg6;
		local5.anInt9259 = arg5;
	}
}
