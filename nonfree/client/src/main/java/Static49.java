import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static49 {

	@OriginalMember(owner = "client!ce", name = "b", descriptor = "I")
	public static int anInt894;

	@OriginalMember(owner = "client!ce", name = "d", descriptor = "Lclient!ph;")
	public static Class187 aClass187_12;

	@OriginalMember(owner = "client!ce", name = "g", descriptor = "[I")
	public static int[] anIntArray72;

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "Lclient!s;")
	public static final Class217 aClass217_32 = new Class217(41, 8);

	@OriginalMember(owner = "client!ce", name = "f", descriptor = "Lclient!os;")
	public static final Class182 aClass182_39 = new Class182(" has logged out.", " loggt sich aus.", " s'est déconnecté.", " saiu do jogo.");

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(IJ)V")
	public static void method841(@OriginalArg(1) long arg0) {
		@Pc(12) int local12 = Static187.anInt3752;
		@Pc(19) int local19;
		@Pc(27) int local27;
		if (local12 != Static399.anInt6746) {
			local19 = local12 - Static399.anInt6746;
			local27 = (int) ((long) local19 * arg0 / 320L);
			if (local19 > 0) {
				if (local27 == 0) {
					local27 = 1;
				} else if (local27 > local19) {
					local27 = local19;
				}
			} else if (local27 == 0) {
				local27 = -1;
			} else if (local19 > local27) {
				local27 = local19;
			}
			Static399.anInt6746 += local27;
		}
		@Pc(69) int local69 = Static131.anInt2737;
		if (!Static361.aClass85_Sub1_1.aBoolean164) {
			Static149.aFloat53 += Static231.aFloat70 * (float) arg0 / 40.0F * 8.0F;
			Static16.aFloat6 += (float) arg0 * Static141.aFloat52 / 40.0F * 8.0F;
		}
		if (Static440.anInt7366 != local69) {
			local19 = local69 - Static440.anInt7366;
			local27 = (int) ((long) local19 * arg0 / 320L);
			if (local19 <= 0) {
				if (local27 == 0) {
					local27 = -1;
				} else if (local19 > local27) {
					local27 = local19;
				}
			} else if (local27 == 0) {
				local27 = 1;
			} else if (local19 < local27) {
				local27 = local19;
			}
			Static440.anInt7366 += local27;
		}
		Static428.method5674();
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(CIB)C")
	public static char method843(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1) {
		if (arg0 >= 'À' && arg0 <= 'ÿ') {
			if (arg0 >= 'À' && arg0 <= 'Æ') {
				return 'A';
			}
			if (arg0 == 'Ç') {
				return 'C';
			}
			if (arg0 >= 'È' && arg0 <= 'Ë') {
				return 'E';
			}
			if (arg0 >= 'Ì' && arg0 <= 'Ï') {
				return 'I';
			}
			if (arg0 == 'Ñ' && arg1 != 0) {
				return 'N';
			}
			if (arg0 >= 'Ò' && arg0 <= 'Ö') {
				return 'O';
			}
			if (arg0 >= 'Ù' && arg0 <= 'Ü') {
				return 'U';
			}
			if (arg0 == 'Ý') {
				return 'Y';
			}
			if (arg0 == 'ß') {
				return 's';
			}
			if (arg0 >= 'à' && arg0 <= 'æ') {
				return 'a';
			}
			if (arg0 == 'ç') {
				return 'c';
			}
			if (arg0 >= 'è' && arg0 <= 'ë') {
				return 'e';
			}
			if (arg0 >= 'ì' && arg0 <= 'ï') {
				return 'i';
			}
			if (arg0 == 'ñ' && arg1 != 0) {
				return 'n';
			}
			if (arg0 >= 'ò' && arg0 <= 'ö') {
				return 'o';
			}
			if (arg0 >= 'ù' && arg0 <= 'ü') {
				return 'u';
			}
			if (arg0 == 'ý' || arg0 == 'ÿ') {
				return 'y';
			}
		}
		if (arg0 == 'Œ') {
			return 'O';
		} else if (arg0 == 'œ') {
			return 'o';
		} else if (arg0 == 'Ÿ') {
			return 'Y';
		} else {
			return arg0;
		}
	}
}
