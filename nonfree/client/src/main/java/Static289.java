import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static289 {

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(IIIII)V")
	public static void method4065(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = arg2;
		@Pc(16) int local16 = -arg2;
		@Pc(18) int local18 = -1;
		@Pc(26) int local26 = Static112.method1759(arg3 + arg2, Static235.anInt3970, Static151.anInt2683);
		@Pc(35) int local35 = Static112.method1759(arg3 - arg2, Static235.anInt3970, Static151.anInt2683);
		Static455.method6536(local26, local35, arg0, Static503.anIntArrayArray12[arg1]);
		while (local11 < local13) {
			local18 += 2;
			local16 += local18;
			@Pc(64) int local64;
			@Pc(68) int local68;
			@Pc(85) int local85;
			@Pc(94) int local94;
			if (local16 > 0) {
				local13--;
				local16 -= local13 << 1;
				local64 = arg1 - local13;
				local68 = local13 + arg1;
				if (local68 >= Static134.anInt2364 && local64 <= Static60.anInt971) {
					local85 = Static112.method1759(arg3 + local11, Static235.anInt3970, Static151.anInt2683);
					local94 = Static112.method1759(arg3 - local11, Static235.anInt3970, Static151.anInt2683);
					if (Static60.anInt971 >= local68) {
						Static455.method6536(local85, local94, arg0, Static503.anIntArrayArray12[local68]);
					}
					if (Static134.anInt2364 <= local64) {
						Static455.method6536(local85, local94, arg0, Static503.anIntArrayArray12[local64]);
					}
				}
			}
			local11++;
			local64 = arg1 - local11;
			local68 = local11 + arg1;
			if (local68 >= Static134.anInt2364 && Static60.anInt971 >= local64) {
				local85 = Static112.method1759(local13 + arg3, Static235.anInt3970, Static151.anInt2683);
				local94 = Static112.method1759(arg3 - local13, Static235.anInt3970, Static151.anInt2683);
				if (local68 <= Static60.anInt971) {
					Static455.method6536(local85, local94, arg0, Static503.anIntArrayArray12[local68]);
				}
				if (local64 >= Static134.anInt2364) {
					Static455.method6536(local85, local94, arg0, Static503.anIntArrayArray12[local64]);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(IBI)Lclient!sl;")
	public static Class295 method4066(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class295 local12 = new Class295();
		local12.anInt7934 = -1;
		local12.anInt7940 = arg1 + 6;
		local12.anInt7938 = -1;
		local12.anInt7932 = arg0 + 6;
		local12.anIntArrayArray80 = new int[local12.anInt7940][local12.anInt7932];
		local12.method6550();
		return local12;
	}
}
