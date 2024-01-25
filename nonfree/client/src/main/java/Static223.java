import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static223 {

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "[I")
	public static final int[] anIntArray331 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!jc", name = "e", descriptor = "Lclient!ej;")
	public static final Class88 aClass88_117 = new Class88("Loaded title screen", "Titelbild geladen.", "Écran-titre chargé", "Tela título carregada");

	@OriginalMember(owner = "client!jc", name = "f", descriptor = "Lclient!si;")
	public static final Class143 aClass143_3 = Static514.method1478();

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IJ)V")
	public static void method3749(@OriginalArg(1) long arg0) {
		@Pc(16) int local16 = Static452.anInt8206 + Static440.aClass30_Sub1_Sub1_Sub1_2.anInt9418;
		@Pc(21) int local21 = Static440.aClass30_Sub1_Sub1_Sub1_2.anInt9416 + Static144.anInt5613;
		if (Static401.anInt7550 - local16 < -500 || Static401.anInt7550 - local16 > 500 || Static112.anInt2594 - local21 < -500 || Static112.anInt2594 - local21 > 500) {
			Static112.anInt2594 = local21;
			Static401.anInt7550 = local16;
		}
		@Pc(63) int local63;
		@Pc(71) int local71;
		if (Static401.anInt7550 != local16) {
			local63 = local16 - Static401.anInt7550;
			local71 = (int) (arg0 * (long) local63 / 320L);
			if (local63 <= 0) {
				if (local71 == 0) {
					local71 = -1;
				} else if (local71 < local63) {
					local71 = local63;
				}
			} else if (local71 == 0) {
				local71 = 1;
			} else if (local63 < local71) {
				local71 = local63;
			}
			Static401.anInt7550 += local71;
		}
		if (!Static208.aClass12_Sub10_Sub1_1.aBoolean184) {
			Static500.aFloat186 += Static516.aFloat188 * (float) arg0 / 6.0F;
			Static49.aFloat10 += (float) arg0 * Static360.aFloat146 / 6.0F;
		}
		if (Static112.anInt2594 != local21) {
			local63 = local21 - Static112.anInt2594;
			local71 = (int) (arg0 * (long) local63 / 320L);
			if (local63 > 0) {
				if (local71 == 0) {
					local71 = 1;
				} else if (local63 < local71) {
					local71 = local63;
				}
			} else if (local71 == 0) {
				local71 = -1;
			} else if (local63 > local71) {
				local71 = local63;
			}
			Static112.anInt2594 += local71;
		}
		Static184.method3617();
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(BC)Z")
	public static boolean method3750(@OriginalArg(1) char arg0) {
		if (arg0 >= ' ' && arg0 <= '~') {
			return true;
		} else if (arg0 >= ' ' && arg0 <= 'ÿ') {
			return true;
		} else {
			return arg0 == '€' || arg0 == 'Œ' || arg0 == '—' || arg0 == 'œ' || arg0 == 'Ÿ';
		}
	}
}
