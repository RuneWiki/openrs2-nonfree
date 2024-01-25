import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static12 {

	@OriginalMember(owner = "client!al", name = "d", descriptor = "I")
	public static int anInt170;

	@OriginalMember(owner = "client!al", name = "q", descriptor = "Lclient!ui;")
	public static Class230 aClass230_1;

	@OriginalMember(owner = "client!al", name = "n", descriptor = "Z")
	public static boolean aBoolean13 = false;

	@OriginalMember(owner = "client!al", name = "o", descriptor = "Lclient!sh;")
	public static final Class211 aClass211_5 = new Class211(78, 10);

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(III)I")
	public static int method105(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = arg0 + arg1 * 57;
		@Pc(16) int local16 = local10 ^ local10 << 13;
		@Pc(35) int local35 = (local16 * 15731 * local16 + 789221) * local16 + 1376312589 & Integer.MAX_VALUE;
		return local35 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(ZC)Z")
	public static boolean method106(@OriginalArg(1) char arg0) {
		if (arg0 >= ' ' && arg0 <= '~') {
			return true;
		} else if (arg0 >= ' ' && arg0 <= 'ÿ') {
			return true;
		} else {
			return arg0 == '€' || arg0 == 'Œ' || arg0 == '—' || arg0 == 'œ' || arg0 == 'Ÿ';
		}
	}
}
