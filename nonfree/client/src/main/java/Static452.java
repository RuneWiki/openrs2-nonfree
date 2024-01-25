import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static452 {

	@OriginalMember(owner = "client!wp", name = "L", descriptor = "Lclient!uf;")
	public static Class246 aClass246_2;

	@OriginalMember(owner = "client!wp", name = "K", descriptor = "Lclient!at;")
	public static final Class4_Sub5 aClass4_Sub5_1 = new Class4_Sub5(0, 0);

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(IIII)Z")
	public static boolean method5998(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(14) Interface4 local14 = (Interface4) Static14.method170(arg1, arg2, arg0);
		@Pc(16) boolean local16 = true;
		if (local14 != null) {
			local16 = Static115.method1682(local14) & true;
		}
		local14 = (Interface4) Static64.method926(arg1, arg2, arg0, fw.class);
		if (local14 != null) {
			local16 &= Static115.method1682(local14);
		}
		local14 = (Interface4) Static190.method2771(arg1, arg2, arg0);
		if (local14 != null) {
			local16 &= Static115.method1682(local14);
		}
		return local16;
	}
}
