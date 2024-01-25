import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static391 {

	@OriginalMember(owner = "client!ow", name = "v", descriptor = "Lclient!ft;")
	public static final Class110 aClass110_30 = new Class110(5, -1);

	@OriginalMember(owner = "client!ow", name = "a", descriptor = "(III)Z")
	public static boolean method6248(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static329.method5691(arg1, arg0) & Static390.method6233(arg1, arg0);
	}

	@OriginalMember(owner = "client!ow", name = "a", descriptor = "(IIIIII)V")
	public static void method6249(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(11) int local11 = Static44.method1168(Static208.anInt4309, Static55.anInt1303, arg3);
		@Pc(22) int local22 = Static44.method1168(Static208.anInt4309, Static55.anInt1303, arg0);
		@Pc(28) int local28 = Static44.method1168(Static35.anInt993, Static535.anInt9696, arg2);
		@Pc(36) int local36 = Static44.method1168(Static35.anInt993, Static535.anInt9696, arg4);
		for (@Pc(38) int local38 = local11; local38 <= local22; local38++) {
			Static426.method6794(local36, Static333.anIntArrayArray56[local38], local28, arg1);
		}
	}

	@OriginalMember(owner = "client!ow", name = "a", descriptor = "(ILclient!cw;)V")
	public static void method6250(@OriginalArg(1) Class55_Sub1 arg0) {
		arg0.aClass2_Sub2_Sub1_1 = null;
		if (Static405.anInt7968 < 20) {
			Static107.aClass134_3.method3236(arg0);
			Static405.anInt7968++;
		}
	}
}
