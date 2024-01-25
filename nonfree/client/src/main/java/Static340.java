import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static340 {

	@OriginalMember(owner = "client!rf", name = "b", descriptor = "Lclient!ho;")
	public static final Class98 aClass98_15 = new Class98(10, 2, 2, 0);

	@OriginalMember(owner = "client!rf", name = "c", descriptor = "Lclient!gk;")
	public static final Class83 aClass83_119 = new Class83("You can't add yourself to your own ignore list.", "Du kannst dich nicht auf deine eigene Ignorieren-Liste setzen!", "Vous ne pouvez pas ajouter votre nom à votre liste noire.", "Você não pode adicionar a si próprio à sua lista de ignorados.");

	@OriginalMember(owner = "client!rf", name = "e", descriptor = "[I")
	public static final int[] anIntArray411 = new int[100];

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(IIIII)V")
	public static void method4613(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < arg3) {
			Static251.method3640(arg0, arg2, arg3, Static96.anIntArrayArray21[arg1]);
		} else {
			Static251.method3640(arg3, arg2, arg0, Static96.anIntArrayArray21[arg1]);
		}
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(BLclient!iv;)V")
	public static void method4615(@OriginalArg(1) Class4_Sub12 arg0) {
		for (@Pc(3) int local3 = 0; local3 < Static33.anInt602; local3++) {
			@Pc(9) int local9 = arg0.method2506();
			@Pc(13) int local13 = arg0.method2536();
			if (local13 == 65535) {
				local13 = -1;
			}
			if (Static407.aClass78_Sub1Array2[local9] != null) {
				Static407.aClass78_Sub1Array2[local9].anInt3878 = local13;
			}
		}
	}
}
