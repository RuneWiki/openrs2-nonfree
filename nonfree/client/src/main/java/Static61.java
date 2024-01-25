import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static61 {

	@OriginalMember(owner = "client!bw", name = "b", descriptor = "[Lclient!pu;")
	public static Class50[] aClass50Array2;

	@OriginalMember(owner = "client!bw", name = "l", descriptor = "I")
	public static int anInt944;

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(BLclient!uaa;)V")
	public static void method828(@OriginalArg(1) Class345 arg0) {
		if (!Static55.aBoolean60) {
			return;
		}
		if (arg0.anObjectArray5 != null) {
			@Pc(22) Class345 local22 = Static144.method2595(Static549.anInt9003, Static353.anInt6392);
			if (local22 != null) {
				@Pc(28) Class5_Sub22 local28 = new Class5_Sub22();
				local28.aClass345_1 = arg0;
				local28.anObjectArray1 = arg0.anObjectArray5;
				local28.aClass345_2 = local22;
				Static652.method8743(local28);
			}
		}
		@Pc(45) Class5_Sub21 local45 = Static64.method905(Static263.aClass49_1, Static644.aClass305_103);
		local45.aClass5_Sub41_Sub2_1.method7803(arg0.anInt9664);
		local45.aClass5_Sub41_Sub2_1.method7809(arg0.anInt9611);
		local45.aClass5_Sub41_Sub2_1.method7809(Static353.anInt6392);
		local45.aClass5_Sub41_Sub2_1.method7828(Static529.anInt9069);
		local45.aClass5_Sub41_Sub2_1.method7842(Static549.anInt9003);
		local45.aClass5_Sub41_Sub2_1.method7848(arg0.anInt9654);
		Static495.method7092(local45);
	}
}
