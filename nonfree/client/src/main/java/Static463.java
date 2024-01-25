import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static463 {

	@OriginalMember(owner = "client!pl", name = "c", descriptor = "Lclient!qv;")
	public static Class29_Sub1 aClass29_Sub1_2;

	@OriginalMember(owner = "client!pl", name = "e", descriptor = "Lclient!hia;")
	public static Class144 aClass144_5;

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(III)V")
	public static void method7433(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9;
		if (Static329.anInt6017 != arg1) {
			Static537.anIntArray480 = new int[arg1];
			for (local9 = 0; local9 < arg1; local9++) {
				Static537.anIntArray480[local9] = (local9 << 12) / arg1;
			}
			Static329.anInt6017 = arg1;
			Static549.anInt9613 = arg1 * 32;
			Static386.anInt7302 = arg1 - 1;
		}
		if (Static667.anInt10615 == arg0) {
			return;
		}
		if (Static329.anInt6017 == arg0) {
			Static401.anIntArray357 = Static537.anIntArray480;
		} else {
			Static401.anIntArray357 = new int[arg0];
			for (local9 = 0; local9 < arg0; local9++) {
				Static401.anIntArray357[local9] = (local9 << 12) / arg0;
			}
		}
		Static667.anInt10615 = arg0;
		Static426.anInt11132 = arg0 - 1;
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(Lclient!vu;I)Z")
	public static boolean method7434(@OriginalArg(0) Interface23 arg0) {
		@Pc(10) Class331 local10 = Static251.aClass328_1.method8261(arg0.method9451());
		if (local10.anInt9453 == -1) {
			return true;
		} else {
			@Pc(22) Class104 local22 = Static157.aClass353_1.method8902(local10.anInt9453);
			return local22.anInt3416 == -1 ? true : local22.method3192();
		}
	}
}
