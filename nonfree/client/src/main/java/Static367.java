import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static367 {

	@OriginalMember(owner = "client!si", name = "N", descriptor = "Lclient!vs;")
	public static Class257 aClass257_4;

	@OriginalMember(owner = "client!si", name = "O", descriptor = "I")
	public static int anInt6204;

	@OriginalMember(owner = "client!si", name = "M", descriptor = "[I")
	public static final int[] anIntArray418 = new int[100];

	@OriginalMember(owner = "client!si", name = "c", descriptor = "(II)V")
	public static void method4880(@OriginalArg(0) int arg0) {
		Static447.anIntArray280 = new int[arg0];
		Static318.anIntArray225 = new int[arg0];
		Static338.anIntArray396 = new int[arg0];
		Static416.anIntArray463 = new int[arg0];
		Static437.anIntArray494 = new int[arg0];
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(Lclient!za;ZILclient!la;III)V")
	public static void method4882(@OriginalArg(0) Class34 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class76 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg1) {
			Static31.aClass6_9.method5894((Static69.anInt1304 - Static31.aClass6_9.RA()) / 2, (Static338.anInt5777 - Static31.aClass6_9.Q()) / 2);
			Static138.aClass6_27.method5894((Static69.anInt1304 - Static138.aClass6_27.RA()) / 2, 18);
		}
		@Pc(32) String local32 = "";
		if (Static191.aClass48_4 == Static183.aClass48_3) {
			local32 = Static174.aClass119_84.method2673(Static394.anInt6582);
		} else if (Static183.aClass48_3 == Static82.aClass48_7) {
			local32 = Static352.aClass119_147.method2673(Static394.anInt6582);
		}
		arg3.method4594(-1, arg5, Static69.anInt1304 / 2, local32, Static338.anInt5777 / 2 - 26);
		@Pc(72) int local72 = Static338.anInt5777 / 2 - 18;
		arg0.method5769(Static69.anInt1304 / 2 - 152, local72, 304, 34, arg4, 0);
		arg0.method5769(Static69.anInt1304 / 2 - 151, local72 + 1, 302, 32, 0, 0);
		arg0.P(Static69.anInt1304 / 2 - 150, local72 + 2, Static319.anInt5465 * 3, 30, arg2, 0);
		arg0.P(Static69.anInt1304 / 2 + Static319.anInt5465 * 3 - 150, local72 - -2, 300 - Static319.anInt5465 * 3, 30, 0, 0);
		arg3.method4594(-1, arg5, Static69.anInt1304 / 2, Static250.aString54, Static338.anInt5777 / 2 + 4);
	}
}
