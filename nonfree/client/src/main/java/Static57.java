import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static57 {

	@OriginalMember(owner = "client!da", name = "e", descriptor = "I")
	public static int anInt5865;

	@OriginalMember(owner = "client!da", name = "a", descriptor = "[I")
	public static final int[] anIntArray699 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!da", name = "c", descriptor = "Lclient!o;")
	public static final Class169 aClass169_321 = new Class169("Loading...", "Lade...", "Chargement en cours...", "Carregando...");

	@OriginalMember(owner = "client!da", name = "f", descriptor = "[I")
	public static final int[] anIntArray700 = new int[50];

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(BIII)V")
	public static void method5054(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(14) int local14 = arg2 * Static188.aClass135_Sub1_1.anInt3379 >> 8;
		if (local14 != 0 && arg0 != -1) {
			Static346.method4883(Static339.aClass230_76, arg0, local14);
			Static12.aBoolean13 = true;
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(ZJ)V")
	public static void method5056(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Static339.method4841(arg0 - 1L);
			Static339.method4841(1L);
		} else {
			Static339.method4841(arg0);
		}
	}
}
