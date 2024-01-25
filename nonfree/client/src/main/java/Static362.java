import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static362 {

	@OriginalMember(owner = "client!pba", name = "s", descriptor = "I")
	public static int anInt6506;

	@OriginalMember(owner = "client!pba", name = "v", descriptor = "F")
	public static float aFloat128 = 1024.0F;

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "(I)V")
	public static void method5648() {
		if (Static283.anInt5580 != 3 && Static36.aClass130_1.anInt4072 != -1) {
			Static171.method3329(Static36.aClass130_1.aString26, Static36.aClass130_1.anInt4072);
		}
	}

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "(BI)V")
	public static void method5650(@OriginalArg(1) int arg0) {
		@Pc(8) Class1_Sub1_Sub13 local8 = Static476.method6225(4, arg0);
		local8.method4925();
	}
}
