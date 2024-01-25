import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static569 {

	@OriginalMember(owner = "client!vr", name = "b", descriptor = "[Lclient!i;")
	public static Class67[] aClass67Array8;

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(IIII)V")
	public static void method7715(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(3) int local3 = arg1 << 3;
		@Pc(7) int local7 = arg0 << 3;
		Static447.aFloat233 = local7;
		Static412.aFloat13 = local3;
		if (Static311.anInt5570 == 2) {
			Static443.anInt7768 = 0;
			Static177.anInt3712 = local7;
			Static323.anInt6015 = local3;
		}
		Static274.method4150();
		Static341.aBoolean494 = true;
	}
}
