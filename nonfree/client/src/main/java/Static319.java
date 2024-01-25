import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static319 {

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "[Lclient!fd;")
	public static Class103[] aClass103Array13;

	@OriginalMember(owner = "client!lf", name = "d", descriptor = "[[Lclient!uv;")
	public static Class344[][] aClass344ArrayArray2;

	@OriginalMember(owner = "client!lf", name = "e", descriptor = "Lclient!id;")
	public static Class157 aClass157_4;

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "Lclient!jn;")
	public static final Class178 aClass178_11 = new Class178(4, 1, 1, 1);

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(BI)Lclient!gca;")
	public static Class121 method5303(@OriginalArg(1) int arg0) {
		@Pc(10) Class121 local10 = (Class121) Static64.aClass136_15.method3134((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static408.aClass343_192.method8132(1, arg0);
		local10 = new Class121();
		local10.anInt3346 = arg0;
		if (local20 != null) {
			local10.method2885(new Class3_Sub9(local20));
		}
		local10.method2884();
		if (local10.anInt3358 == 2 && Static500.aClass25_36.method426((long) arg0) == null) {
			Static500.aClass25_36.method434((long) arg0, new Class3_Sub51(Static314.anInt6075));
			Static318.aClass121Array1[Static314.anInt6075++] = local10;
		}
		Static64.aClass136_15.method3135(local10, (long) arg0);
		return local10;
	}
}
