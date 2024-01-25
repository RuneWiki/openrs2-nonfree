import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static560 {

	@OriginalMember(owner = "client!tr", name = "b", descriptor = "Lclient!tba;")
	public static final Class323 aClass323_36 = new Class323(4);

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(CI)Z")
	public static boolean method7861(@OriginalArg(0) char arg0) {
		if (arg0 >= ' ' && arg0 <= '~') {
			return true;
		} else if (arg0 >= ' ' && arg0 <= 'ÿ') {
			return true;
		} else {
			return arg0 == '€' || arg0 == 'Œ' || arg0 == '—' || arg0 == 'œ' || arg0 == 'Ÿ';
		}
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(ZI)V")
	public static void method7863(@OriginalArg(0) boolean arg0) {
		@Pc(5) int local5 = Static132.anInt2866;
		@Pc(7) int local7 = Static582.anInt9501;
		if (arg0 && Static582.aBoolean678) {
			local5 <<= 0x1;
			local7 = -local5;
		}
		Static141.aClass13_27.f(local7, local5);
	}
}
