import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static111 {

	@OriginalMember(owner = "client!hi", name = "t", descriptor = "I")
	public static int anInt2596;

	@OriginalMember(owner = "client!hi", name = "l", descriptor = "Lclient!cq;")
	public static final Class34 aClass34_78 = new Class34("Loaded input handler", "Eingabeprozedur geladen.", "Gestionnaire de saisie chargé", "Gerenciador de entradas carregado");

	@OriginalMember(owner = "client!hi", name = "v", descriptor = "Lclient!cq;")
	public static final Class34 aClass34_79 = new Class34("Loading config - ", "Lade Konfiguration - ", "Chargement des fichiers config - ", "Carregando config - ");

	@OriginalMember(owner = "client!hi", name = "w", descriptor = "I")
	public static int anInt2597 = 0;

	@OriginalMember(owner = "client!hi", name = "x", descriptor = "I")
	public static int anInt2598 = 0;

	@OriginalMember(owner = "client!hi", name = "y", descriptor = "Z")
	public static boolean aBoolean254 = true;

	@OriginalMember(owner = "client!hi", name = "z", descriptor = "J")
	public static volatile long aLong85 = 0L;

	@OriginalMember(owner = "client!hi", name = "A", descriptor = "I")
	public static int anInt2599 = 0;

	@OriginalMember(owner = "client!hi", name = "B", descriptor = "Lclient!aq;")
	public static Class12 aClass12_7 = null;

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIII)Z")
	public static boolean method2412(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!Static23.method662(arg0, arg1, arg2)) {
			return false;
		}
		@Pc(10) int local10 = arg1 << 7;
		@Pc(14) int local14 = arg2 << 7;
		@Pc(23) int local23 = Static298.aClass53Array3[arg0].method2785(arg1, arg2) - 1;
		@Pc(27) int local27 = local23 - 120;
		@Pc(31) int local31 = local23 - 230;
		@Pc(35) int local35 = local23 - 238;
		if (arg3 < 16) {
			if (arg3 == 1) {
				if (local10 > Static171.anInt3695) {
					if (!Static71.method3162(local10, local23, local14)) {
						return false;
					}
					if (!Static71.method3162(local10, local23, local14 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static71.method3162(local10, local27, local14)) {
						return false;
					}
					if (!Static71.method3162(local10, local27, local14 + 128)) {
						return false;
					}
				}
				if (!Static71.method3162(local10, local31, local14)) {
					return false;
				}
				if (!Static71.method3162(local10, local31, local14 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 2) {
				if (local14 < Static234.anInt4778) {
					if (!Static71.method3162(local10, local23, local14 + 128)) {
						return false;
					}
					if (!Static71.method3162(local10 + 128, local23, local14 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static71.method3162(local10, local27, local14 + 128)) {
						return false;
					}
					if (!Static71.method3162(local10 + 128, local27, local14 + 128)) {
						return false;
					}
				}
				if (!Static71.method3162(local10, local31, local14 + 128)) {
					return false;
				}
				if (!Static71.method3162(local10 + 128, local31, local14 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 4) {
				if (local10 < Static171.anInt3695) {
					if (!Static71.method3162(local10 + 128, local23, local14)) {
						return false;
					}
					if (!Static71.method3162(local10 + 128, local23, local14 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static71.method3162(local10 + 128, local27, local14)) {
						return false;
					}
					if (!Static71.method3162(local10 + 128, local27, local14 + 128)) {
						return false;
					}
				}
				if (!Static71.method3162(local10 + 128, local31, local14)) {
					return false;
				}
				if (!Static71.method3162(local10 + 128, local31, local14 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 8) {
				if (local14 > Static234.anInt4778) {
					if (!Static71.method3162(local10, local23, local14)) {
						return false;
					}
					if (!Static71.method3162(local10 + 128, local23, local14)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static71.method3162(local10, local27, local14)) {
						return false;
					}
					if (!Static71.method3162(local10 + 128, local27, local14)) {
						return false;
					}
				}
				if (!Static71.method3162(local10, local31, local14)) {
					return false;
				}
				if (!Static71.method3162(local10 + 128, local31, local14)) {
					return false;
				}
				return true;
			}
		}
		if (!Static71.method3162(local10 + 64, local35, local14 + 64)) {
			return false;
		} else if (arg3 == 16) {
			return Static71.method3162(local10, local31, local14 + 128);
		} else if (arg3 == 32) {
			return Static71.method3162(local10 + 128, local31, local14 + 128);
		} else if (arg3 == 64) {
			return Static71.method3162(local10 + 128, local31, local14);
		} else if (arg3 == 128) {
			return Static71.method3162(local10, local31, local14);
		} else {
			return true;
		}
	}
}
