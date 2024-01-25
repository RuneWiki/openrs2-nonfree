import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static548 {

	@OriginalMember(owner = "client!sm", name = "F", descriptor = "Lclient!wm;")
	public static Class390 aClass390_107;

	@OriginalMember(owner = "client!sm", name = "T", descriptor = "Lclient!kc;")
	public static Class190 aClass190_1;

	@OriginalMember(owner = "client!sm", name = "U", descriptor = "F")
	public static float aFloat189;

	@OriginalMember(owner = "client!sm", name = "V", descriptor = "J")
	public static long aLong256;

	@OriginalMember(owner = "client!sm", name = "E", descriptor = "Lclient!rda;")
	public static final Class300 aClass300_41 = new Class300(64);

	@OriginalMember(owner = "client!sm", name = "J", descriptor = "I")
	public static int anInt8995 = 0;

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(ZC)C")
	public static char method7633(@OriginalArg(1) char arg0) {
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

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(Lclient!r;III[Z)V")
	public static void method7637(@OriginalArg(0) Class5_Sub3_Sub7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		if (Static495.aClass109Array4 == Static111.aClass109Array3) {
			return;
		}
		@Pc(10) int local10 = Static605.aClass109Array5[arg1].method7702(arg2, arg3);
		for (@Pc(12) int local12 = 0; local12 <= arg1; local12++) {
			if (arg4 == null || arg4[local12]) {
				@Pc(23) Class109 local23 = Static605.aClass109Array5[local12];
				if (local23 != null) {
					local23.wa(arg0, arg2, local10 - local23.method7702(arg2, arg3), arg3, 0, false);
				}
			}
		}
	}
}
