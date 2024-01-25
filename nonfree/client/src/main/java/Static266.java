import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static266 {

	@OriginalMember(owner = "client!nf", name = "Eb", descriptor = "Lclient!vu;")
	public static Class260 aClass260_4;

	@OriginalMember(owner = "client!nf", name = "Fb", descriptor = "Lclient!hi;")
	public static final Class102 aClass102_128 = new Class102(65, 4);

	@OriginalMember(owner = "client!nf", name = "Qb", descriptor = "I")
	public static int anInt4392 = 0;

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(BC)Z")
	public static boolean method3608(@OriginalArg(1) char arg0) {
		if (arg0 >= ' ' && arg0 <= '~') {
			return true;
		} else if (arg0 >= ' ' && arg0 <= 'ÿ') {
			return true;
		} else {
			return arg0 == '€' || arg0 == 'Œ' || arg0 == '—' || arg0 == 'œ' || arg0 == 'Ÿ';
		}
	}

	@OriginalMember(owner = "client!nf", name = "C", descriptor = "(I)Lclient!rg;")
	public static Class2_Sub5_Sub15 method3609() {
		return Static282.aClass2_Sub5_Sub15_6;
	}

	@OriginalMember(owner = "client!nf", name = "j", descriptor = "(B)V")
	public static void method3613() {
		if (Static73.anInt1390 <= 0) {
			Static93.aString56 = "";
			return;
		}
		@Pc(13) int local13 = 0;
		for (@Pc(15) int local15 = 0; local15 < Static382.aStringArray35.length; local15++) {
			if (Static382.aStringArray35[local15].startsWith("--> ")) {
				local13++;
				if (local13 == Static73.anInt1390) {
					Static93.aString56 = Static382.aStringArray35[local15].substring(4);
					break;
				}
			}
		}
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(III)I")
	public static int method3616(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = arg0 * 57 + arg1;
		@Pc(20) int local20 = local9 << 13 ^ local9;
		@Pc(34) int local34 = local20 * (local20 * 15731 * local20 + 789221) + 1376312589 & Integer.MAX_VALUE;
		return local34 >> 19 & 0xFF;
	}
}
