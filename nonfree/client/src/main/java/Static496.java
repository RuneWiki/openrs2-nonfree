import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static496 {

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(IBII)V")
	public static void method7444(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) int local6 = arg0 * Static104.aClass6_Sub6_Sub1_4.anInt1170 >> 8;
		if (arg2 == -1 && !Static439.aBoolean592) {
			Static136.method2556();
		} else if (arg2 != -1 && (arg2 != Static499.anInt8891 || !Static241.method4244()) && local6 != 0 && !Static439.aBoolean592) {
			Static21.method863(Static378.aClass168_88, arg2, local6, arg1);
		}
		Static499.anInt8891 = arg2;
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(IIBI)V")
	public static void method7450(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class348 local9 = Static192.aClass348ArrayArray1[arg1][arg0];
		Static180.method3567(arg2, local9 == null ? Static393.aClass348_2 : local9);
	}
}
