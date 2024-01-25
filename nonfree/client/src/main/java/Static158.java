import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static158 {

	@OriginalMember(owner = "client!js", name = "b", descriptor = "Lclient!ct;")
	public static Class30 aClass30_48;

	@OriginalMember(owner = "client!js", name = "c", descriptor = "Lclient!ct;")
	public static Class30 aClass30_49;

	@OriginalMember(owner = "client!js", name = "d", descriptor = "Lclient!ig;")
	public static final Class89 aClass89_3 = new Class89();

	@OriginalMember(owner = "client!js", name = "f", descriptor = "I")
	public static int anInt3254 = 0;

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(CI)C")
	public static char method2986(@OriginalArg(0) char arg0) {
		if (arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-') {
			return '_';
		} else if (arg0 == '[' || arg0 == ']' || arg0 == '#') {
			return arg0;
		} else if (arg0 == 'à' || arg0 == 'á' || arg0 == 'â' || arg0 == 'ä' || arg0 == 'ã' || arg0 == 'À' || arg0 == 'Á' || arg0 == 'Â' || arg0 == 'Ä' || arg0 == 'Ã') {
			return 'a';
		} else if (arg0 == 'è' || arg0 == 'é' || arg0 == 'ê' || arg0 == 'ë' || arg0 == 'È' || arg0 == 'É' || arg0 == 'Ê' || arg0 == 'Ë') {
			return 'e';
		} else if (arg0 == 'í' || arg0 == 'î' || arg0 == 'ï' || arg0 == 'Í' || arg0 == 'Î' || arg0 == 'Ï') {
			return 'i';
		} else if (arg0 == 'ò' || arg0 == 'ó' || arg0 == 'ô' || arg0 == 'ö' || arg0 == 'õ' || arg0 == 'Ò' || arg0 == 'Ó' || arg0 == 'Ô' || arg0 == 'Ö' || arg0 == 'Õ') {
			return 'o';
		} else if (arg0 == 'ù' || arg0 == 'ú' || arg0 == 'û' || arg0 == 'ü' || arg0 == 'Ù' || arg0 == 'Ú' || arg0 == 'Û' || arg0 == 'Ü') {
			return 'u';
		} else if (arg0 == 'ç' || arg0 == 'Ç') {
			return 'c';
		} else if (arg0 == 'ÿ' || arg0 == 'Ÿ') {
			return 'y';
		} else if (arg0 == 'ñ' || arg0 == 'Ñ') {
			return 'n';
		} else if (arg0 == 'ß') {
			return 'b';
		} else {
			return Character.toLowerCase(arg0);
		}
	}

	@OriginalMember(owner = "client!js", name = "b", descriptor = "(I)V")
	public static void method2987() {
		@Pc(9) Class21 local9 = Static362.aClass21_179;
		synchronized (Static362.aClass21_179) {
			Static362.aClass21_179.method857();
		}
		local9 = Static266.aClass21_141;
		synchronized (Static266.aClass21_141) {
			Static266.aClass21_141.method857();
		}
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(III)Z")
	public static boolean method2988(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < Static46.anInt1182; local1++) {
			@Pc(6) Class152 local6 = Static195.aClass152Array2[local1];
			@Pc(15) int local15;
			@Pc(27) int local27;
			@Pc(37) int local37;
			@Pc(47) int local47;
			@Pc(57) int local57;
			if (local6.anInt4476 == 1) {
				local15 = local6.anInt4466 - arg0;
				if (local15 > 0) {
					local27 = local6.anInt4468 + (local6.anInt4467 * local15 >> 8);
					local37 = local6.anInt4464 + (local6.anInt4478 * local15 >> 8);
					local47 = local6.anInt4475 + (local6.anInt4473 * local15 >> 8);
					local57 = local6.anInt4471 + (local6.anInt4482 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt4476 == 2) {
				local15 = arg0 - local6.anInt4466;
				if (local15 > 0) {
					local27 = local6.anInt4468 + (local6.anInt4467 * local15 >> 8);
					local37 = local6.anInt4464 + (local6.anInt4478 * local15 >> 8);
					local47 = local6.anInt4475 + (local6.anInt4473 * local15 >> 8);
					local57 = local6.anInt4471 + (local6.anInt4482 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt4476 == 3) {
				local15 = local6.anInt4468 - arg2;
				if (local15 > 0) {
					local27 = local6.anInt4466 + (local6.anInt4472 * local15 >> 8);
					local37 = local6.anInt4480 + (local6.anInt4465 * local15 >> 8);
					local47 = local6.anInt4475 + (local6.anInt4473 * local15 >> 8);
					local57 = local6.anInt4471 + (local6.anInt4482 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt4476 == 4) {
				local15 = arg2 - local6.anInt4468;
				if (local15 > 0) {
					local27 = local6.anInt4466 + (local6.anInt4472 * local15 >> 8);
					local37 = local6.anInt4480 + (local6.anInt4465 * local15 >> 8);
					local47 = local6.anInt4475 + (local6.anInt4473 * local15 >> 8);
					local57 = local6.anInt4471 + (local6.anInt4482 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt4476 == 5) {
				local15 = arg1 - local6.anInt4475;
				if (local15 > 0) {
					local27 = local6.anInt4466 + (local6.anInt4472 * local15 >> 8);
					local37 = local6.anInt4480 + (local6.anInt4465 * local15 >> 8);
					local47 = local6.anInt4468 + (local6.anInt4467 * local15 >> 8);
					local57 = local6.anInt4464 + (local6.anInt4478 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg2 >= local47 && arg2 <= local57) {
						return true;
					}
				}
			}
		}
		return false;
	}
}
