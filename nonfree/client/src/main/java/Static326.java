import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static326 {

	@OriginalMember(owner = "client!va", name = "v", descriptor = "Lclient!bn;")
	public static final Class24 aClass24_5 = new Class24();

	@OriginalMember(owner = "client!va", name = "B", descriptor = "[I")
	public static final int[] anIntArray533 = new int[5];

	@OriginalMember(owner = "client!va", name = "F", descriptor = "I")
	public static int anInt6197 = 2;

	@OriginalMember(owner = "client!va", name = "a", descriptor = "([BIII)Ljava/lang/String;")
	public static String method5503(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(6) char[] local6 = new char[arg1];
		@Pc(16) int local16 = 0;
		for (@Pc(18) int local18 = 0; local18 < arg1; local18++) {
			@Pc(27) int local27 = arg0[local18 + arg2] & 0xFF;
			if (local27 != 0) {
				if (local27 >= 128 && local27 < 160) {
					@Pc(48) char local48 = Static95.aCharArray26[local27 - 128];
					if (local48 == '\u0000') {
						local48 = '?';
					}
					local27 = local48;
				}
				local6[local16++] = (char) local27;
			}
		}
		return new String(local6, 0, local16);
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method5504(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return -1;
		}
		for (@Pc(16) int local16 = 0; local16 < Static31.anInt829; local16++) {
			if (arg0.equalsIgnoreCase(Static61.aStringArray8[local16])) {
				return local16;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!va", name = "b", descriptor = "(CI)C")
	public static char method5506(@OriginalArg(0) char arg0) {
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
}
