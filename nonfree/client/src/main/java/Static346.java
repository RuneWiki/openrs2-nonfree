import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static346 {

	@OriginalMember(owner = "client!tp", name = "b", descriptor = "I")
	public static int anInt5670;

	@OriginalMember(owner = "client!tp", name = "c", descriptor = "Lclient!rt;")
	public static Class205 aClass205_3;

	@OriginalMember(owner = "client!tp", name = "j", descriptor = "I")
	public static int anInt5675;

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(IILclient!so;BLclient!so;ZZ)I")
	public static int method4880(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class124_Sub1 arg2, @OriginalArg(4) Class124_Sub1 arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) boolean arg5) {
		@Pc(10) int local10 = Static391.method5544(arg4, arg3, arg2, arg0);
		if (local10 != 0) {
			return arg4 ? -local10 : local10;
		} else if (arg1 == -1) {
			return 0;
		} else {
			@Pc(41) int local41 = Static391.method5544(arg5, arg3, arg2, arg1);
			return arg5 ? -local41 : local41;
		}
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(Lclient!ui;IZIII)V")
	public static void method4883(@OriginalArg(0) Class230 arg0, @OriginalArg(1) int arg1, @OriginalArg(5) int arg2) {
		Static229.anInt3862 = 10000;
		Static211.anInt3648 = 0;
		Static315.aClass230_71 = arg0;
		Static243.anInt4123 = arg2;
		Static355.aBoolean431 = false;
		Static271.anInt4720 = 1;
		Static157.anInt2868 = arg1;
	}
}
