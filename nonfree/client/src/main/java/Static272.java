import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static272 {

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "F")
	public static float aFloat131;

	@OriginalMember(owner = "client!nn", name = "e", descriptor = "I")
	public static int anInt4601;

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(Z)V")
	public static void method3648() {
		Static351.aClass7_Sub39_2 = new Class7_Sub39(Static102.aClass55_45.method1205(Static5.anInt20), "", Static194.anInt3446, 1006, -1, 0L, 0, 0, true, false);
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(ZI)V")
	public static void method3649(@OriginalArg(1) int arg0) {
		if (Static351.anInt5638 == 0) {
			Static108.aClass7_Sub8_Sub3_1.method4486(arg0);
		} else {
			Static195.anInt3458 = arg0;
		}
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(IIIII)V")
	public static void method3650(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(10) Class7_Sub4_Sub14 local10 = Static54.method750(arg3, 8);
		local10.method4716();
		local10.anInt5870 = arg0;
		local10.anInt5867 = arg1;
		local10.anInt5868 = arg2;
	}

	@OriginalMember(owner = "client!nn", name = "b", descriptor = "(Z)V")
	public static void method3651() {
		Static360.aClass95Array2 = null;
		Static352.method4542(0, Static251.anInt4258, -1, Static286.anInt4051, 0, 0, Static183.anInt3293, 0);
		if (Static360.aClass95Array2 != null) {
			Static269.method3629(Static97.anInt1983, -1412584499, Static286.anInt4051, Static251.anInt4258, 0, 0, Static360.aClass95Array2, Static36.aClass95_1.anInt2611, Static279.anInt7417);
			Static360.aClass95Array2 = null;
		}
	}
}
