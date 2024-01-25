import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static453 {

	@OriginalMember(owner = "client!qd", name = "t", descriptor = "I")
	public static int anInt4354;

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(Lclient!sl;Z)Lclient!naa;")
	public static Class6_Sub2 method3847(@OriginalArg(0) Class3_Sub3 arg0) {
		@Pc(12) Class6 local12 = Static10.method672(arg0);
		@Pc(16) int local16 = arg0.method4221();
		@Pc(20) int local20 = arg0.method4221();
		@Pc(24) int local24 = arg0.method4221();
		@Pc(28) int local28 = arg0.method4221();
		@Pc(32) int local32 = arg0.method4221();
		@Pc(36) int local36 = arg0.method4221();
		return new Class6_Sub2(local12.aClass83_8, local12.aClass50_7, local12.anInt2442, local12.anInt2443, local12.anInt2440, local12.anInt2436, local12.anInt2437, local12.anInt2439, local12.anInt2444, local16, local20, local24, local28, local32, local36);
	}

	@OriginalMember(owner = "client!qd", name = "d", descriptor = "(I)Lclient!uea;")
	public static Class3_Sub49 method3850() {
		if (Static110.aClass223_15 == null || Static106.aClass294_1 == null) {
			return null;
		}
		for (@Pc(21) Class3_Sub49 local21 = (Class3_Sub49) Static106.aClass294_1.method7319(); local21 != null; local21 = (Class3_Sub49) Static106.aClass294_1.method7319()) {
			@Pc(29) Class36 local29 = Static110.aClass335_4.method8125(local21.anInt9434);
			if (local29 != null && local29.aBoolean89 && local29.method1413(Static110.anInterface1_2)) {
				return local21;
			}
		}
		return null;
	}
}
