import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static597 {

	@OriginalMember(owner = "client!vca", name = "z", descriptor = "I")
	public static int anInt9945;

	@OriginalMember(owner = "client!vca", name = "C", descriptor = "D")
	public static double aDouble26;

	@OriginalMember(owner = "client!vca", name = "a", descriptor = "(BLclient!sca;)V")
	public static void method8392(@OriginalArg(1) Class302 arg0) {
		if (!Static280.aBoolean380) {
			return;
		}
		if (arg0.anObjectArray25 != null) {
			@Pc(26) Class302 local26 = Static110.method1816(Static30.anInt4466, Static453.anInt8081);
			if (local26 != null) {
				@Pc(32) Class6_Sub10 local32 = new Class6_Sub10();
				local32.aClass302_15 = local26;
				local32.aClass302_14 = arg0;
				local32.anObjectArray1 = arg0.anObjectArray25;
				Static244.method4193(local32);
			}
		}
		@Pc(49) Class6_Sub9 local49 = Static560.method8089(Static391.aClass126_1, Static361.aClass208_60);
		local49.aClass6_Sub40_Sub2_1.method8554(arg0.anInt8838);
		local49.aClass6_Sub40_Sub2_1.method8593(Static453.anInt8081);
		local49.aClass6_Sub40_Sub2_1.method8565(Static133.anInt2549);
		local49.aClass6_Sub40_Sub2_1.method8601(Static30.anInt4466);
		local49.aClass6_Sub40_Sub2_1.method8565(arg0.anInt8834);
		local49.aClass6_Sub40_Sub2_1.method8593(arg0.anInt8877);
		Static263.method4681(local49);
	}
}
