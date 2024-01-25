import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static4 {

	@OriginalMember(owner = "client!ac", name = "m", descriptor = "Lclient!pu;")
	public static Class50 aClass50_1;

	@OriginalMember(owner = "client!ac", name = "p", descriptor = "[I")
	public static final int[] anIntArray3 = new int[3];

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIZI)Z")
	public static boolean method49(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(5) boolean local5 = true;
		@Pc(16) Interface1 local16 = (Interface1) Static506.method7239(arg0, arg2, arg1);
		if (local16 != null) {
			local5 = Static244.method4625(local16) & true;
		}
		local16 = (Interface1) Static241.method3771(arg0, arg2, arg1, aia.class);
		if (local16 != null) {
			local5 &= Static244.method4625(local16);
		}
		local16 = (Interface1) Static570.method7867(arg0, arg2, arg1);
		if (local16 != null) {
			local5 &= Static244.method4625(local16);
		}
		return local5;
	}
}
