import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static133 {

	@OriginalMember(owner = "client!gi", name = "m", descriptor = "F")
	public static float aFloat63;

	@OriginalMember(owner = "client!gi", name = "n", descriptor = "I")
	public static int anInt2523;

	@OriginalMember(owner = "client!gi", name = "j", descriptor = "Lclient!dp;")
	public static final Class55 aClass55_59 = new Class55("M", "M", "M", "M");

	@OriginalMember(owner = "client!gi", name = "l", descriptor = "I")
	public static int anInt2522 = 0;

	@OriginalMember(owner = "client!gi", name = "o", descriptor = "Ljava/lang/String;")
	public static String aString26 = "";

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(Lclient!ba;III[Z)V")
	public static void method2104(@OriginalArg(0) Class7_Sub4_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		if (Static244.aClass165Array8 == Static28.aClass165Array1) {
			return;
		}
		@Pc(9) int local9 = Static149.aClass165Array7[arg1].a(arg2, arg3);
		for (@Pc(11) int local11 = 0; local11 <= arg1; local11++) {
			if (arg4 == null || arg4[local11]) {
				@Pc(22) Class165 local22 = Static149.aClass165Array7[local11];
				if (local22 != null) {
					local22.p(arg0, arg2, local9 - local22.a(arg2, arg3), arg3, 0, false);
				}
			}
		}
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(IC)C")
	public static char method2106(@OriginalArg(1) char arg0) {
		if (arg0 == 'Æ') {
			return 'E';
		} else if (arg0 == 'æ') {
			return 'e';
		} else if (arg0 == 'ß') {
			return 's';
		} else if (arg0 == 'Œ') {
			return 'E';
		} else {
			return (char) (arg0 == 'œ' ? 'e' : '\u0000');
		}
	}
}
