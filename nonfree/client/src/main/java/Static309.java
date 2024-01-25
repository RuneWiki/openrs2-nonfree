import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static309 {

	@OriginalMember(owner = "client!po", name = "a", descriptor = "Lclient!wt;")
	public static final Class267 aClass267_73 = new Class267("Please wait - attempting to reestablish.", "Bitte warte - es wird versucht, die Verbindung wiederherzustellen.", "Veuillez patienter - tentative de rétablissement.", "Tentando reestabelecer conexão. Aguarde.");

	@OriginalMember(owner = "client!po", name = "d", descriptor = "I")
	public static int anInt5420 = 1;

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(Lclient!ae;B)V")
	public static void method4527(@OriginalArg(0) Class6_Sub1 arg0) {
		if (arg0.aByteArray96.length - arg0.anInt7898 < 1) {
			return;
		}
		@Pc(21) int local21 = arg0.method6433();
		if (local21 < 0 || local21 > 1 || arg0.aByteArray96.length - arg0.anInt7898 < 2) {
			return;
		}
		@Pc(54) int local54 = arg0.method6485();
		if (arg0.aByteArray96.length - arg0.anInt7898 != local54 * 6) {
			return;
		}
		while (true) {
			@Pc(74) int local74;
			@Pc(78) int local78;
			do {
				do {
					do {
						if (arg0.aByteArray96.length <= arg0.anInt7898) {
							return;
						}
						local74 = arg0.method6485();
						local78 = arg0.method6442();
					} while (local74 >= Static331.anIntArray389.length);
				} while (!Static384.aBooleanArray25[local74]);
			} while (Static388.aClass206_1.method4621(local74).aChar5 == '1' && (local78 < -1 || local78 > 1));
			Static331.anIntArray389[local74] = local78;
		}
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(IIIII)V")
	public static void method4528(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) float local9 = (float) Static7.anInt1147 / (float) Static7.anInt1141;
		@Pc(20) int local20 = arg0;
		@Pc(22) int local22 = arg2;
		if (local9 < 1.0F) {
			local22 = (int) (local9 * (float) arg0);
		} else {
			local20 = (int) ((float) arg2 / local9);
		}
		@Pc(49) int local49 = arg1 - (arg0 - local20) / 2;
		@Pc(58) int local58 = arg3 - (arg2 - local22) / 2;
		Static358.anInt6379 = -1;
		Static96.anInt5951 = -1;
		Static242.anInt4490 = Static7.anInt1147 - Static7.anInt1147 * local58 / local22;
		Static226.anInt5617 = local49 * Static7.anInt1141 / local20;
		Static306.method4501();
	}
}
