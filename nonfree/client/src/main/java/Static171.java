import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static171 {

	@OriginalMember(owner = "client!gi", name = "n", descriptor = "Lclient!om;")
	public static Class246 aClass246_84;

	@OriginalMember(owner = "client!gi", name = "m", descriptor = "J")
	public static long aLong97 = 0L;

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(IILclient!r;IIII)Lclient!da;")
	public static Class57 method2975(@OriginalArg(0) int arg0, @OriginalArg(2) Class43 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(6) long local6 = (long) arg2;
		@Pc(14) Class57 local14 = (Class57) Static294.aClass10_31.method250(local6);
		if (local14 == null) {
			@Pc(24) Class226 local24 = Static519.method6916(arg2, Static384.aClass246_184);
			if (local24 == null) {
				return null;
			}
			if (local24.anInt6103 < 13) {
				local24.method5296();
			}
			local14 = arg1.method7178(local24, 2055, Static397.anInt6803, 64, 768);
			Static294.aClass10_31.method254(local14, local6);
		}
		local14 = local14.method7522((byte) 2, 2055, true);
		if (arg3 != 0) {
			local14.M(arg3);
		}
		if (arg0 != 0) {
			local14.MA(arg0);
		}
		if (arg5 != 0) {
			local14.W(arg5);
		}
		if (arg4 != 0) {
			local14.oa(0, arg4, 0);
		}
		return local14;
	}
}
