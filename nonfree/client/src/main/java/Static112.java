import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static112 {

	@OriginalMember(owner = "client!hn", name = "l", descriptor = "I")
	public static int anInt5406 = 0;

	@OriginalMember(owner = "client!hn", name = "m", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray37 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

	@OriginalMember(owner = "client!hn", name = "b", descriptor = "(I)V")
	public static void method4413() {
		Static13.aClass26_2.method511();
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(IIIZ)Ljava/lang/String;")
	public static String method4414(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return Integer.toString(arg0, 10);
		}
		@Pc(46) int local46 = 2;
		for (@Pc(50) int local50 = arg0 / 10; local50 != 0; local50 /= 10) {
			local46++;
		}
		@Pc(65) char[] local65 = new char[local46];
		local65[0] = '+';
		for (@Pc(73) int local73 = local46 - 1; local73 > 0; local73--) {
			@Pc(78) int local78 = arg0;
			arg0 /= 10;
			@Pc(89) int local89 = local78 - arg0 * 10;
			if (local89 >= 10) {
				local65[local73] = (char) (local89 + 87);
			} else {
				local65[local73] = (char) (local89 + 48);
			}
		}
		return new String(local65);
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(ZI)V")
	public static void method4415(@OriginalArg(0) boolean arg0) {
		if (arg0 != Static222.aBoolean302) {
			Static222.aBoolean302 = arg0;
			Static54.method884();
		}
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(IIIIII)V")
	public static void method4416(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static99.method1656(Static220.anIntArrayArray36[arg3], arg2, arg1 - arg4, arg4 + arg1);
		@Pc(20) int local20 = 0;
		@Pc(22) int local22 = arg0;
		@Pc(26) int local26 = arg4 * arg4;
		@Pc(34) int local34 = arg0 * arg0;
		@Pc(38) int local38 = local26 << 1;
		@Pc(42) int local42 = arg0 << 1;
		@Pc(46) int local46 = local34 << 1;
		@Pc(54) int local54 = local34 - local38 * (local42 - 1);
		@Pc(63) int local63 = local46 + (1 - local42) * local26;
		@Pc(67) int local67 = local26 << 2;
		@Pc(75) int local75 = local46 * 3;
		@Pc(83) int local83 = local38 * ((arg0 << 1) - 3);
		@Pc(87) int local87 = local34 << 2;
		@Pc(93) int local93 = local87;
		@Pc(99) int local99 = (arg0 - 1) * local67;
		while (local22 > 0) {
			if (local63 < 0) {
				while (local63 < 0) {
					local20++;
					local63 += local75;
					local54 += local93;
					local93 += local87;
					local75 += local87;
				}
			}
			local22--;
			if (local54 < 0) {
				local54 += local93;
				local63 += local75;
				local75 += local87;
				local93 += local87;
				local20++;
			}
			@Pc(150) int local150 = arg3 - local22;
			local63 += -local99;
			@Pc(159) int local159 = arg1 + local20;
			local99 -= local67;
			@Pc(167) int local167 = local22 + arg3;
			local54 += -local83;
			local83 -= local67;
			@Pc(181) int local181 = arg1 - local20;
			Static99.method1656(Static220.anIntArrayArray36[local150], arg2, local181, local159);
			Static99.method1656(Static220.anIntArrayArray36[local167], arg2, local181, local159);
		}
	}
}
