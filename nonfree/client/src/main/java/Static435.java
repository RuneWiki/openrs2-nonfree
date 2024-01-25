import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static435 {

	@OriginalMember(owner = "client!vo", name = "j", descriptor = "Lclient!qu;")
	public static final Class208 aClass208_102 = new Class208(80, 7);

	@OriginalMember(owner = "client!vo", name = "k", descriptor = "Z")
	public static boolean aBoolean499 = false;

	@OriginalMember(owner = "client!vo", name = "l", descriptor = "[Lclient!gh;")
	public static final Class11_Sub5_Sub2_Sub1[] aClass11_Sub5_Sub2_Sub1Array1 = new Class11_Sub5_Sub2_Sub1[2048];

	@OriginalMember(owner = "client!vo", name = "m", descriptor = "I")
	public static int anInt7328 = -1;

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(IIIIII)V")
	public static void method5888(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(11) int local11 = arg0 + 1;
		Static215.method3035(arg4, arg3, Static46.anIntArrayArray24[arg0], arg2);
		@Pc(20) int local20 = arg1 - 1;
		Static215.method3035(arg4, arg3, Static46.anIntArrayArray24[arg1], arg2);
		for (@Pc(25) int local25 = local11; local25 <= local20; local25++) {
			@Pc(31) int[] local31 = Static46.anIntArrayArray24[local25];
			local31[arg4] = local31[arg3] = arg2;
		}
	}

	@OriginalMember(owner = "client!vo", name = "c", descriptor = "(I)V")
	public static void method5890() {
		Static375.aClass2_Sub35_2 = new Class2_Sub35(Static64.aClass231_23.method5261(Static80.anInt6195), "", Static236.anInt3995, 1011, -1, 0L, 0, 0, true, false);
	}
}
