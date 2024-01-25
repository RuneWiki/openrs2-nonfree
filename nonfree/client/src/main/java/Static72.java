import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static72 {

	@OriginalMember(owner = "client!co", name = "ib", descriptor = "Lclient!sba;")
	public static Class280 aClass280_1;

	@OriginalMember(owner = "client!co", name = "sb", descriptor = "Lclient!jfa;")
	public static Class165 aClass165_1;

	@OriginalMember(owner = "client!co", name = "b", descriptor = "(IIBI)Z")
	public static boolean method1545(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Interface17 local9 = (Interface17) Static298.method4853(arg1, arg2, arg0);
		@Pc(11) boolean local11 = true;
		if (local9 != null) {
			local11 = Static572.method8059(local9) & true;
		}
		local9 = (Interface17) Static178.method3532(arg1, arg2, arg0, ql.class);
		if (local9 != null) {
			local11 &= Static572.method8059(local9);
		}
		local9 = (Interface17) Static216.method3980(arg1, arg2, arg0);
		if (local9 != null) {
			local11 &= Static572.method8059(local9);
		}
		return local11;
	}
}
