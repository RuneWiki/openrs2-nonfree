import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static259 {

	@OriginalMember(owner = "client!jga", name = "d", descriptor = "[I")
	public static final int[] anIntArray299 = new int[14];

	@OriginalMember(owner = "client!jga", name = "a", descriptor = "(IIIB)Lclient!cq;")
	public static Class6_Sub9 method4618(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(10) Class6_Sub9 local10 = null;
		if (arg2 == 0) {
			local10 = Static560.method8089(Static391.aClass126_1, Static413.aClass208_65);
		}
		if (arg2 == 1) {
			local10 = Static560.method8089(Static391.aClass126_1, Static32.aClass208_7);
		}
		local10.aClass6_Sub40_Sub2_1.method8563(Static647.aClass251_1.method6712(82) ? 1 : 0);
		local10.aClass6_Sub40_Sub2_1.method8593(Static606.anInt8651 + arg0);
		local10.aClass6_Sub40_Sub2_1.method8593(arg1 + Static195.anInt3961);
		Static51.anInt935 = arg1;
		Static106.anInt2100 = arg0;
		Static362.aBoolean439 = false;
		Static168.method3101();
		return local10;
	}

	@OriginalMember(owner = "client!jga", name = "a", descriptor = "(B)V")
	public static void method4619() {
		Static469.method7115(255, -1);
	}
}
