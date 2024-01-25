import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static286 {

	@OriginalMember(owner = "client!iu", name = "b", descriptor = "[Lclient!ska;")
	public static final Class342[] aClass342Array5 = new Class342[2048];

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(ZIIILclient!tha;)V")
	public static void method6359(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class3_Sub50 arg3) {
		@Pc(16) long local16 = (long) (arg1 | arg2 << 14 | arg0 << 28);
		@Pc(22) Class3_Sub20 local22 = (Class3_Sub20) Static46.aClass136_5.method3503(local16);
		if (local22 == null) {
			local22 = new Class3_Sub20();
			Static46.aClass136_5.method3508(local16, local22);
			local22.aClass357_9.method8401(arg3);
			return;
		}
		@Pc(45) Class91 local45 = Static243.aClass406_2.method9394(arg3.anInt9937);
		@Pc(48) int local48 = local45.anInt2723;
		if (local45.anInt2705 == 1) {
			local48 *= arg3.anInt9936 + 1;
		}
		for (@Pc(65) Class3_Sub50 local65 = (Class3_Sub50) local22.aClass357_9.method8391(); local65 != null; local65 = (Class3_Sub50) local22.aClass357_9.method8392()) {
			local45 = Static243.aClass406_2.method9394(local65.anInt9937);
			@Pc(76) int local76 = local45.anInt2723;
			if (local45.anInt2705 == 1) {
				local76 *= local65.anInt9936 + 1;
			}
			if (local76 < local48) {
				Static416.method6190(arg3, local65);
				return;
			}
		}
		local22.aClass357_9.method8401(arg3);
	}
}
