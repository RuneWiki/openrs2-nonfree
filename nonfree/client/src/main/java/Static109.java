import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static109 {

	@OriginalMember(owner = "client!dj", name = "k", descriptor = "[Lclient!mba;")
	public static Interface14[] anInterface14Array1;

	@OriginalMember(owner = "client!dj", name = "h", descriptor = "[I")
	public static int[] anIntArray96;

	@OriginalMember(owner = "client!dj", name = "b", descriptor = "(I)V")
	public static void method1568() {
		Static608.aClass102_71 = new Class102();
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method1569(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(9) int arg6) {
		if (arg5 < 512 || arg4 < 512 || arg5 > (Static544.anInt9261 - 2) * 512 || (Static282.anInt4887 - 2) * 512 < arg4) {
			Static13.anIntArray19[0] = Static13.anIntArray19[1] = -1;
			return;
		}
		@Pc(52) int local52 = Static380.method5559(arg5, arg3, arg4, 0) - arg2;
		if (Static40.aBoolean61) {
			Static235.method3415(true);
		} else {
			Static158.aClass203_4.method8335(arg0, 0, 0);
			Static457.aClass57_11.method7657(Static158.aClass203_4);
		}
		if (Static565.aBoolean768) {
			Static457.aClass57_11.HA(arg5, local52, arg4, Static243.anInt4189, Static13.anIntArray19);
		} else {
			Static457.aClass57_11.da(arg5, local52, arg4, Static13.anIntArray19);
		}
		if (Static40.aBoolean61) {
			Static26.method424();
		} else {
			Static158.aClass203_4.method8335(-arg0, 0, 0);
			Static457.aClass57_11.method7657(Static158.aClass203_4);
		}
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(II)Lclient!dn;")
	public static Class92 method1571(@OriginalArg(1) int arg0) {
		@Pc(10) Class92 local10 = (Class92) Static561.aClass391_57.method9275((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(21) byte[] local21 = Static411.aClass208_96.method4991(1, arg0, -119);
		local10 = new Class92();
		local10.anInt1841 = arg0;
		if (local21 != null) {
			local10.method1641(new Class5_Sub23(local21));
		}
		local10.method1639();
		if (local10.anInt1838 == 2 && Static371.aClass291_26.method6993((long) arg0, 1) == null) {
			Static371.aClass291_26.method6984((long) arg0, new Class5_Sub29(Static481.anInt8132));
			Static599.aClass92Array1[Static481.anInt8132++] = local10;
		}
		Static561.aClass391_57.method9273((long) arg0, local10, 1);
		return local10;
	}
}
