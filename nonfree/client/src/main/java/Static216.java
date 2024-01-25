import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static216 {

	@OriginalMember(owner = "client!kt", name = "T", descriptor = "Lclient!qt;")
	public static Class199 aClass199_7;

	@OriginalMember(owner = "client!kt", name = "U", descriptor = "F")
	public static float aFloat131;

	@OriginalMember(owner = "client!kt", name = "D", descriptor = "Lclient!sl;")
	public static final Class215 aClass215_43 = new Class215(45, 3);

	@OriginalMember(owner = "client!kt", name = "L", descriptor = "I")
	public static int anInt4008 = 2;

	@OriginalMember(owner = "client!kt", name = "S", descriptor = "I")
	public static int anInt4014 = 0;

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(BIII)Z")
	public static boolean method3257(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(18) Interface6 local18 = (Interface6) Static227.method3449(arg1, arg2, arg0);
		@Pc(20) boolean local20 = true;
		if (local18 != null) {
			local20 = Static315.method4210(local18) & true;
		}
		local18 = (Interface6) Static36.method648(arg1, arg2, arg0, f.class);
		if (local18 != null) {
			local20 &= Static315.method4210(local18);
		}
		local18 = (Interface6) Static117.method2096(arg1, arg2, arg0);
		if (local18 != null) {
			local20 &= Static315.method4210(local18);
		}
		return local20;
	}
}
