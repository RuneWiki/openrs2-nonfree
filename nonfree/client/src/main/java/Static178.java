import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static178 {

	@OriginalMember(owner = "client!hb", name = "j", descriptor = "Lclient!cb;")
	public static final Class40 aClass40_158 = new Class40(5, 4);

	@OriginalMember(owner = "client!hb", name = "k", descriptor = "Lclient!jj;")
	public static final Class160 aClass160_95 = new Class160(37, -1);

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(III)Lclient!bg;")
	public static Class29_Sub1 method5953(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class9 local7 = Static208.aClass9ArrayArrayArray3[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass29_Sub1_2;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IBI)V")
	public static void method5955(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(11) int local11 = Static338.aClass146_7.method3173(Static141.aClass104_69.method2145(Static470.anInt7957));
		@Pc(24) int local24;
		for (@Pc(16) Class6_Sub48 local16 = (Class6_Sub48) Static445.aClass275_162.method6366(); local16 != null; local16 = (Class6_Sub48) Static445.aClass275_162.method6364()) {
			local24 = Static479.method7871(local16);
			if (local11 < local24) {
				local11 = local24;
			}
		}
		local11 += 8;
		local24 = Static374.anInt6451 * 16 + 21;
		@Pc(50) int local50 = arg0 - local11 / 2;
		if (Static502.anInt8364 < local50 + local11) {
			local50 = Static502.anInt8364 - local11;
		}
		if (local50 < 0) {
			local50 = 0;
		}
		@Pc(70) int local70 = arg1;
		if (local24 + arg1 > Static476.anInt8045) {
			local70 = Static476.anInt8045 - local24;
		}
		Static83.anInt1402 = local50;
		if (local70 < 0) {
			local70 = 0;
		}
		Static519.anInt8950 = Static374.anInt6451 * 16 + (Static206.aBoolean233 ? 26 : 22);
		Static353.anInt6216 = local11;
		Static377.anInt6491 = local70;
		Static330.aBoolean415 = true;
	}
}
