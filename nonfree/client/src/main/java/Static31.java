import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static31 {

	@OriginalMember(owner = "client!bb", name = "X", descriptor = "Lclient!rg;")
	public static Class310 aClass310_8;

	// $FF: synthetic field
	@OriginalMember(owner = "client!bb", name = "D", descriptor = "Ljava/lang/Class;")
	private static Class aClass7;

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(BIII)Z")
	public static boolean method565(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(5) boolean local5 = true;
		@Pc(11) Interface16 local11 = (Interface16) Static34.method575(arg1, arg2, arg0);
		if (local11 != null) {
			local5 = Static470.method7060(local11) & true;
		}
		local11 = (Interface16) Static492.method7403(arg1, arg2, arg0, aClass7 == null ? (aClass7 = Class4.a("np")) : aClass7);
		if (local11 != null) {
			local5 &= Static470.method7060(local11);
		}
		local11 = (Interface16) Static447.method6640(arg1, arg2, arg0);
		if (local11 != null) {
			local5 &= Static470.method7060(local11);
		}
		return local5;
	}
}
