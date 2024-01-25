import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static140 {

	@OriginalMember(owner = "client!f", name = "h", descriptor = "Lclient!aea;")
	public static final Class10 aClass10_3 = new Class10();

	@OriginalMember(owner = "client!f", name = "j", descriptor = "Lclient!hda;")
	public static final Class136 aClass136_65 = new Class136(39, -1);

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(IIIB)Z")
	public static boolean method2096(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) Interface20 local9 = (Interface20) Static601.method8388(arg0, arg2, arg1);
		@Pc(11) boolean local11 = true;
		if (local9 != null) {
			local11 = Static213.method3232(local9) & true;
		}
		local9 = (Interface20) Static1.method5727(arg0, arg2, arg1, paa.class);
		if (local9 != null) {
			local11 &= Static213.method3232(local9);
		}
		local9 = (Interface20) Static70.method7879(arg0, arg2, arg1);
		if (local9 != null) {
			local11 &= Static213.method3232(local9);
		}
		return local11;
	}
}
