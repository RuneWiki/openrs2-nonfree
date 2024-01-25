import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static277 {

	@OriginalMember(owner = "client!nq", name = "A", descriptor = "Lclient!pu;")
	public static Class203 aClass203_41 = new Class203();

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(ILclient!ec;II)V")
	public static void method4096(@OriginalArg(1) Class68 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) Class24 local16 = arg0.method1579(Static30.aClass106_3);
		if (local16 == null) {
			return;
		}
		Static30.aClass106_3.ba(arg2, arg1, arg2 + arg0.anInt2107, arg0.anInt2149 + arg1);
		if (Static336.anInt6157 < 3) {
			Static235.aClass137_13.method5699((float) arg2 + (float) arg0.anInt2107 / 2.0F, (float) arg0.anInt2149 / 2.0F + (float) arg1, ((int) -Static267.aFloat83 & 0x3FFF) << 2, local16, arg2, arg1);
		} else {
			Static30.aClass106_3.ra(-16777216, local16, arg2, arg1);
		}
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(IIIIIII)I")
	public static int method4098(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if ((arg3 & 0x1) == 1) {
			@Pc(6) int local6 = arg1;
			arg1 = arg5;
			arg5 = local6;
		}
		@Pc(23) int local23 = arg0 & 0x3;
		if (local23 == 0) {
			return arg2;
		} else if (local23 == 1) {
			return arg4;
		} else if (local23 == 2) {
			return 1 + 7 - arg1 - arg2;
		} else {
			return 1 + 7 - arg5 - arg4;
		}
	}
}
