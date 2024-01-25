import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static113 {

	@OriginalMember(owner = "client!dia", name = "b", descriptor = "[I")
	public static final int[] anIntArray135 = new int[200];

	@OriginalMember(owner = "client!dia", name = "c", descriptor = "Lclient!qn;")
	public static final Class313 aClass313_9 = new Class313(64);

	@OriginalMember(owner = "client!dia", name = "d", descriptor = "[Z")
	public static final boolean[] aBooleanArray1 = new boolean[100];

	@OriginalMember(owner = "client!dia", name = "a", descriptor = "(BII)I")
	public static int method2182(@OriginalArg(2) int arg0) {
		if (arg0 == -1) {
			return 12345678;
		}
		@Pc(24) int local24 = (arg0 & 0x7F) * 96 >> 7;
		if (local24 < 2) {
			local24 = 2;
		} else if (local24 > 126) {
			local24 = 126;
		}
		return local24 + (arg0 & 0xFF80);
	}

	@OriginalMember(owner = "client!dia", name = "b", descriptor = "(I)V")
	public static void method2183() {
		for (@Pc(7) int local7 = 0; local7 < Static28.anInt1087; local7++) {
			@Pc(20) int local20 = Static633.anIntArray705[local7];
			@Pc(27) Class3_Sub52 local27 = (Class3_Sub52) Static94.aClass313_8.method7104((long) local20);
			if (local27 != null) {
				@Pc(32) Class9_Sub1_Sub1_Sub2_Sub2 local32 = local27.aClass9_Sub1_Sub1_Sub2_Sub2_2;
				Static126.method2307(false, local32);
			}
		}
	}

	@OriginalMember(owner = "client!dia", name = "a", descriptor = "(IC)C")
	public static char method2185(@OriginalArg(1) char arg0) {
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
