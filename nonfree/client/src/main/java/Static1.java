import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static1 {

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "I")
	public static int anInt8341 = 0;

	@OriginalMember(owner = "client!aa", name = "b", descriptor = "[I")
	public static int[] anIntArray614 = new int[1];

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(Lclient!ha;IBIIII)Lclient!ka;")
	public static Class193 method7184(@OriginalArg(0) Class13 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(18) long local18 = (long) arg4;
		@Pc(24) Class193 local24 = (Class193) Static424.aClass69_43.method1919(local18);
		if (local24 == null) {
			@Pc(36) Class212 local36 = Static532.method7368(Static72.aClass238_40, arg4);
			if (local36 == null) {
				return null;
			}
			if (local36.anInt5662 < 13) {
				local36.method4920();
			}
			local24 = arg0.method8161(local36, 2055, Static344.anInt7754, 64, 768);
			Static424.aClass69_43.method1917(local18, local24);
		}
		local24 = local24.method6609((byte) 2, 2055, true);
		if (arg3 != 0) {
			local24.a(arg3);
		}
		if (arg2 != 0) {
			local24.FA(arg2);
		}
		if (arg5 != 0) {
			local24.VA(arg5);
		}
		if (arg1 != 0) {
			local24.H(0, arg1, 0);
		}
		return local24;
	}
}
