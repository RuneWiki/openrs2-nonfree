import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static68 {

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(IZIIIZ)V")
	public static void method1109(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg3 < 1) {
			arg3 = 1;
		}
		if (arg2 < 1) {
			arg2 = 1;
		}
		@Pc(23) int local23 = arg2 - 334;
		if (local23 < 0) {
			local23 = 0;
		} else if (local23 > 100) {
			local23 = 100;
		}
		@Pc(49) int local49 = Static588.aShort123 + (Static547.aShort118 - Static588.aShort123) * local23 / 100;
		if (local49 < Static127.aShort27) {
			local49 = Static127.aShort27;
		} else if (Static37.aShort1 < local49) {
			local49 = Static37.aShort1;
		}
		@Pc(75) int local75 = local49 * 512 * arg2 / (arg3 * 334);
		@Pc(112) int local112;
		@Pc(119) int local119;
		@Pc(83) short local83;
		if (local75 < Static402.aShort86) {
			local83 = Static402.aShort86;
			local49 = local83 * 334 * arg3 / (arg2 * 512);
			if (Static37.aShort1 < local49) {
				local49 = Static37.aShort1;
				local112 = arg2 * 512 * local49 / (local83 * 334);
				local119 = (arg3 - local112) / 2;
				if (arg1) {
					Static417.aClass162_17.JA();
					Static417.aClass162_17.method6885(arg4, -16777216, local119, arg0, arg2);
					Static417.aClass162_17.method6885(arg4, -16777216, local119, arg3 + arg0 - local119, arg2);
				}
				arg0 += local119;
				arg3 -= local119 * 2;
			}
		} else if (local75 > Static398.aShort85) {
			local83 = Static398.aShort85;
			local49 = local83 * 334 * arg3 / (arg2 * 512);
			if (Static127.aShort27 > local49) {
				local49 = Static127.aShort27;
				local112 = arg3 * 334 * local83 / (local49 * 512);
				local119 = (arg2 - local112) / 2;
				if (arg1) {
					Static417.aClass162_17.JA();
					Static417.aClass162_17.method6885(arg4, -16777216, arg3, arg0, local119);
					Static417.aClass162_17.method6885(arg4 + arg2 - local119, -16777216, arg3, arg0, local119);
				}
				arg2 -= local119 * 2;
				arg4 += local119;
			}
		}
		Static219.anInt3189 = arg4;
		Static538.anInt8855 = arg0;
		Static345.anInt5963 = (short) arg2;
		Static516.anInt8249 = (short) arg3;
		Static81.anInt9012 = local49 * arg2 / 334;
	}
}
