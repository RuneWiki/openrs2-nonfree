import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static254 {

	@OriginalMember(owner = "client!kl", name = "c", descriptor = "I")
	public static int anInt4940;

	@OriginalMember(owner = "client!kl", name = "k", descriptor = "Lclient!ada;")
	public static final Class6 aClass6_76 = new Class6(36, -2);

	@OriginalMember(owner = "client!kl", name = "l", descriptor = "Lclient!ada;")
	public static final Class6 aClass6_77 = new Class6(109, -1);

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(IIBI)Z")
	public static boolean method4287(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(5) boolean local5 = true;
		@Pc(11) Interface17 local11 = (Interface17) Static503.method7224(arg1, arg2, arg0);
		if (local11 != null) {
			local5 = Static405.method6069(local11) & true;
		}
		local11 = (Interface17) Static52.method1507(arg1, arg2, arg0, up.class);
		if (local11 != null) {
			local5 &= Static405.method6069(local11);
		}
		local11 = (Interface17) Static167.method3276(arg1, arg2, arg0);
		if (local11 != null) {
			local5 &= Static405.method6069(local11);
		}
		return local5;
	}
}
