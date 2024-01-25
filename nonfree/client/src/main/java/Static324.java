import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static324 {

	@OriginalMember(owner = "client!mg", name = "O", descriptor = "[I")
	public static int[] anIntArray440;

	@OriginalMember(owner = "client!mg", name = "Q", descriptor = "I")
	public static int anInt6777;

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(BLclient!tc;)V")
	public static void method5635(@OriginalArg(1) Class305 arg0) {
		if (!Static594.aBoolean851) {
			return;
		}
		if (arg0.anObjectArray18 != null) {
			@Pc(18) Class305 local18 = Static282.method4864(Static352.anInt7064, Static317.anInt9395);
			if (local18 != null) {
				@Pc(24) Class3_Sub38 local24 = new Class3_Sub38();
				local24.aClass305_11 = arg0;
				local24.anObjectArray4 = arg0.anObjectArray18;
				local24.aClass305_10 = local18;
				Static597.method8423(local24);
			}
		}
		@Pc(41) Class3_Sub9 local41 = Static587.method8316(Static187.aClass40_2, Static38.aClass230_10);
		local41.aClass3_Sub7_Sub1_1.method6495(arg0.anInt9167);
		local41.aClass3_Sub7_Sub1_1.method6528(arg0.anInt9159);
		local41.aClass3_Sub7_Sub1_1.method6556(Static317.anInt9395);
		local41.aClass3_Sub7_Sub1_1.method6527(Static153.anInt3371);
		local41.aClass3_Sub7_Sub1_1.method6558(Static352.anInt7064);
		local41.aClass3_Sub7_Sub1_1.method6527(arg0.anInt9216);
		Static230.method3933(local41);
	}

	@OriginalMember(owner = "client!mg", name = "f", descriptor = "(B)I")
	public static int method5638() {
		@Pc(7) int local7 = Static537.aClass325_25.method7780();
		if (local7 < Static507.aClass325Array1.length - 1) {
			Static537.aClass325_25 = Static507.aClass325Array1[local7 + 1];
		}
		return 100;
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(ILclient!tc;)Lclient!tc;")
	public static Class305 method5639(@OriginalArg(1) Class305 arg0) {
		if (arg0.anInt9199 != -1) {
			return Static220.method3786(arg0.anInt9199);
		}
		@Pc(23) int local23 = arg0.anInt9167 >>> 16;
		@Pc(28) Class324 local28 = new Class324(Static283.aClass25_23);
		for (@Pc(33) Class3_Sub18 local33 = (Class3_Sub18) local28.method7771(); local33 != null; local33 = (Class3_Sub18) local28.method7772()) {
			if (local23 == local33.anInt3962) {
				return Static220.method3786((int) local33.aLong262);
			}
		}
		return null;
	}
}
