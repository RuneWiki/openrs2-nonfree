import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static425 {

	@OriginalMember(owner = "client!vn", name = "G", descriptor = "Lclient!oe;")
	public static final Class186 aClass186_128 = new Class186(31, 8);

	@OriginalMember(owner = "client!vn", name = "M", descriptor = "Lclient!bg;")
	public static final Class25 aClass25_111 = new Class25(61, 2);

	@OriginalMember(owner = "client!vn", name = "N", descriptor = "Lclient!sk;")
	public static final Class231 aClass231_111 = new Class231("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ");

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(II)Lclient!vh;")
	public static Class253 method5789(@OriginalArg(1) int arg0) {
		@Pc(10) Class253[] local10 = Static299.method4386();
		for (@Pc(12) int local12 = 0; local12 < local10.length; local12++) {
			@Pc(18) Class253 local18 = local10[local12];
			if (arg0 == local18.anInt7017) {
				return local18;
			}
		}
		return null;
	}
}
