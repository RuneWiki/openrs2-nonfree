import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static201 {

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "Lclient!qfa;")
	public static final Class272 aClass272_122 = new Class272(30, -1);

	@OriginalMember(owner = "client!hn", name = "d", descriptor = "I")
	public static int anInt4077 = 0;

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(IC)Z")
	public static boolean method3628(@OriginalArg(1) char arg0) {
		if (arg0 >= ' ' && arg0 <= '~') {
			return true;
		} else if (arg0 >= ' ' && arg0 <= 'ÿ') {
			return true;
		} else {
			return arg0 == '€' || arg0 == 'Œ' || arg0 == '—' || arg0 == 'œ' || arg0 == 'Ÿ';
		}
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(I)Lclient!bu;")
	public static Class3_Sub3_Sub7 method3629() {
		@Pc(10) Class3_Sub3_Sub7 local10 = (Class3_Sub3_Sub7) Static529.aClass38_6.method1070();
		if (local10 != null) {
			local10.method7812();
			local10.method7720();
			return local10;
		}
		do {
			local10 = (Class3_Sub3_Sub7) Static293.aClass38_4.method1070();
			if (local10 == null) {
				return null;
			}
			if (local10.method843() > Static587.method7753()) {
				return null;
			}
			local10.method7812();
			local10.method7720();
		} while ((local10.aLong265 & Long.MIN_VALUE) == 0L);
		return local10;
	}
}
