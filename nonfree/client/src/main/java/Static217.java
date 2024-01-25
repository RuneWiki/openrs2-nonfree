import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static217 {

	@OriginalMember(owner = "client!kl", name = "b", descriptor = "Lclient!ss;")
	public static final Class231 aClass231_69 = new Class231("Starting 3D Library", "Starte 3D-Softwarebibliothek.", "Démarrage de la librairie 3D", "Iniciando biblioteca 3D");

	@OriginalMember(owner = "client!kl", name = "j", descriptor = "[Z")
	public static final boolean[] aBooleanArray18 = new boolean[200];

	@OriginalMember(owner = "client!kl", name = "k", descriptor = "Lclient!bi;")
	public static final Class25 aClass25_84 = new Class25(88, 7);

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "([Lclient!gi;IIIIZ)V")
	public static void method3046(@OriginalArg(0) Class93[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		for (@Pc(3) int local3 = 0; local3 < arg0.length; local3++) {
			@Pc(9) Class93 local9 = arg0[local3];
			if (local9 != null && local9.anInt2426 == arg2) {
				Static389.method5409(arg3, arg1, local9, arg4);
				Static83.method1223(local9, arg1, arg3);
				if (local9.anInt2472 - local9.anInt2436 < local9.anInt2451) {
					local9.anInt2451 = local9.anInt2472 - local9.anInt2436;
				}
				if (local9.anInt2451 < 0) {
					local9.anInt2451 = 0;
				}
				if (local9.anInt2435 > local9.anInt2450 - local9.anInt2495) {
					local9.anInt2435 = local9.anInt2450 - local9.anInt2495;
				}
				if (local9.anInt2435 < 0) {
					local9.anInt2435 = 0;
				}
				if (local9.anInt2494 == 0) {
					Static189.method2742(arg4, local9);
				}
			}
		}
	}
}
