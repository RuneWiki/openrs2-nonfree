import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static273 {

	@OriginalMember(owner = "client!kj", name = "I", descriptor = "I")
	public static int anInt7288;

	@OriginalMember(owner = "client!kj", name = "J", descriptor = "Lclient!f;")
	public static Class78 aClass78_29;

	@OriginalMember(owner = "client!kj", name = "K", descriptor = "[Lclient!f;")
	public static Class78[] aClass78Array16;

	@OriginalMember(owner = "client!kj", name = "B", descriptor = "Lclient!sb;")
	public static final Class299 aClass299_4 = new Class299("RC", 1);

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(ILclient!r;IIIII)Lclient!da;")
	public static Class57 method6029(@OriginalArg(0) int arg0, @OriginalArg(1) Class44 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(18) long local18 = (long) arg2;
		@Pc(24) Class57 local24 = (Class57) Static379.aClass223_51.method5388(local18);
		if (local24 == null) {
			@Pc(34) Class191 local34 = Static91.method5485(Static309.aClass176_81, arg2);
			if (local34 == null) {
				return null;
			}
			if (local34.anInt5621 < 13) {
				local34.method4770();
			}
			local24 = arg1.method5016(local34, 2055, Static294.anInt3996, 64, 768);
			Static379.aClass223_51.method5394(local24, local18);
		}
		local24 = local24.method7912((byte) 2, 2055, true);
		if (arg4 != 0) {
			local24.M(arg4);
		}
		if (arg0 != 0) {
			local24.MA(arg0);
		}
		if (arg3 != 0) {
			local24.W(arg3);
		}
		if (arg5 != 0) {
			local24.oa(0, arg5, 0);
		}
		return local24;
	}
}
