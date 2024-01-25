import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static187 {

	@OriginalMember(owner = "client!mf", name = "t", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray43;

	@OriginalMember(owner = "client!mf", name = "m", descriptor = "Lclient!fi;")
	public static final Class66 aClass66_106 = new Class66(8);

	@OriginalMember(owner = "client!mf", name = "r", descriptor = "Lclient!ro;")
	public static final Class176 aClass176_10 = new Class176();

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lclient!bk;B)Lclient!qn;")
	public static Class29_Sub3 method5592(@OriginalArg(0) Class5_Sub1 arg0) {
		return new Class29_Sub3(arg0.method1834(), arg0.method1834(), arg0.method1834(), arg0.method1834(), arg0.method1834(), arg0.method1834(), arg0.method1834(), arg0.method1834(), arg0.method1843(), arg0.method1832());
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIZIII)V")
	public static void method5593(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 < 1) {
			arg0 = 1;
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
		@Pc(49) int local49 = local23 * (Static90.aShort53 - Static330.aShort28) / 100 + Static330.aShort28;
		if (local49 < Static280.aShort72) {
			local49 = Static280.aShort72;
		} else if (Static222.aShort54 < local49) {
			local49 = Static222.aShort54;
		}
		@Pc(75) int local75 = arg2 * local49 * 512 / (arg0 * 334);
		@Pc(116) int local116;
		@Pc(122) int local122;
		@Pc(87) short local87;
		if (local75 < Static323.aShort84) {
			local87 = Static323.aShort84;
			local49 = arg0 * 334 * local87 / (arg2 * 512);
			if (local49 > Static222.aShort54) {
				local49 = Static222.aShort54;
				local116 = arg2 * local49 * 512 / (local87 * 334);
				local122 = (arg0 - local116) / 2;
				if (arg1) {
					Static15.aClass59_1.method4810();
					Static15.aClass59_1.method4835(arg3, arg4, arg2, local122, -16777216);
					Static15.aClass59_1.method4835(arg3, arg4 + arg0 - local122, arg2, local122, -16777216);
				}
				arg4 += local122;
				arg0 -= local122 * 2;
			}
		} else if (local75 > Static64.aShort21) {
			local87 = Static64.aShort21;
			local49 = arg0 * local87 * 334 / (arg2 * 512);
			if (Static280.aShort72 > local49) {
				local49 = Static280.aShort72;
				local116 = local87 * 334 * arg0 / (local49 * 512);
				local122 = (arg2 - local116) / 2;
				if (arg1) {
					Static15.aClass59_1.method4810();
					Static15.aClass59_1.method4835(arg3, arg4, local122, arg0, -16777216);
					Static15.aClass59_1.method4835(arg2 + arg3 - local122, arg4, local122, arg0, -16777216);
				}
				arg3 += local122;
				arg2 -= local122 * 2;
			}
		}
		Static21.anInt6208 = arg4;
		Static192.anInt3804 = (short) arg2;
		Static309.anInt5915 = (short) arg0;
		Static17.anInt5994 = arg3;
		Static306.anInt5899 = arg2 * local49 / 334;
	}
}
