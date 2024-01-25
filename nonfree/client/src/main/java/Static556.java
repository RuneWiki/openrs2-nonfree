import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static556 {

	@OriginalMember(owner = "client!vfa", name = "j", descriptor = "[I")
	public static int[] anIntArray469;

	@OriginalMember(owner = "client!vfa", name = "b", descriptor = "[I")
	public static final int[] anIntArray468 = new int[4096];

	@OriginalMember(owner = "client!vfa", name = "a", descriptor = "(III)V")
	public static void method5635(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class1_Sub3_Sub1 local13 = Static374.method5445(15, 0);
		local13.method491();
		local13.anInt545 = arg0;
		local13.anInt548 = arg1;
	}

	@OriginalMember(owner = "client!vfa", name = "d", descriptor = "(I)Lclient!fw;")
	public static Class109 method5641() {
		return Static515.method7046();
	}

	@OriginalMember(owner = "client!vfa", name = "a", descriptor = "(IIII)V")
	public static void method5642(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) Class278 local9 = Static176.aClass278ArrayArray1[arg2][arg1];
		Static417.method5837(arg0, local9 == null ? Static433.aClass278_1 : local9);
	}
}
