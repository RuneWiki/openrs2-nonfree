import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static373 {

	@OriginalMember(owner = "client!oc", name = "i", descriptor = "Lclient!ga;")
	public static Class111 aClass111_90;

	@OriginalMember(owner = "client!oc", name = "m", descriptor = "[[[Lclient!se;")
	public static Class293[][][] aClass293ArrayArrayArray25;

	@OriginalMember(owner = "client!oc", name = "n", descriptor = "Z")
	public static boolean aBoolean467 = false;

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(BIII)V")
	public static void method5434(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1) {
		@Pc(19) int local19 = arg0 << 3;
		@Pc(23) int local23 = arg1 << 3;
		Static79.aFloat37 = local19;
		if (Static585.anInt9461 == 2) {
			Static427.anInt7255 = 0;
			Static124.anInt2517 = local19;
			Static202.anInt4065 = local23;
		}
		Static143.aFloat61 = local23;
		Static21.method551();
		Static459.aBoolean567 = true;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(II)Z")
	public static boolean method5435(@OriginalArg(1) int arg0) {
		return arg0 == 7 || arg0 == 9;
	}
}
