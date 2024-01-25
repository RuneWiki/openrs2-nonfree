import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static177 {

	@OriginalMember(owner = "client!im", name = "a", descriptor = "I")
	public static int anInt5591 = 2;

	@OriginalMember(owner = "client!im", name = "d", descriptor = "Lclient!jm;")
	public static final Class131 aClass131_142 = new Class131(7, 6);

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(III)Z")
	public static boolean method4487(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(IC)Z")
	public static boolean method4491(@OriginalArg(1) char arg0) {
		if (arg0 >= ' ' && arg0 <= '~') {
			return true;
		} else if (arg0 >= ' ' && arg0 <= 'ÿ') {
			return true;
		} else {
			return arg0 == '€' || arg0 == 'Œ' || arg0 == '—' || arg0 == 'œ' || arg0 == 'Ÿ';
		}
	}
}
