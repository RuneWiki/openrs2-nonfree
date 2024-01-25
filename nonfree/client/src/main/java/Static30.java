import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static30 {

	@OriginalMember(owner = "client!bd", name = "c", descriptor = "F")
	public static float aFloat51;

	@OriginalMember(owner = "client!bd", name = "d", descriptor = "Lclient!kda;")
	public static Class160 aClass160_4;

	@OriginalMember(owner = "client!bd", name = "j", descriptor = "I")
	public static int anInt1206;

	@OriginalMember(owner = "client!bd", name = "l", descriptor = "Lclient!lt;")
	public static final Class185 aClass185_2 = new Class185("LIVE", 0);

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(IIIIBII)V")
	public static void method1221(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static163.anInt3580 = arg1;
		Static423.anInt8967 = arg2;
		Static470.anInt6523 = arg0;
		Static208.anInt4353 = arg5;
		Static536.anInt9311 = arg3;
		Static59.anInt1655 = arg4;
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(I)Z")
	public static boolean method1222() {
		return Static267.anInt5167 > 0;
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(BIIIIZ)V")
	public static void method1225(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		if (arg3 < 1) {
			arg3 = 1;
		}
		if (arg1 < 1) {
			arg1 = 1;
		}
		@Pc(19) int local19 = arg3 - 334;
		if (local19 < 0) {
			local19 = 0;
		} else if (local19 > 100) {
			local19 = 100;
		}
		@Pc(45) int local45 = local19 * (Static99.aShort34 - Static243.aShort76) / 100 + Static243.aShort76;
		if (Static535.aShort126 > local45) {
			local45 = Static535.aShort126;
		} else if (local45 > Static113.aShort42) {
			local45 = Static113.aShort42;
		}
		@Pc(78) int local78 = local45 * 512 * arg3 / (arg1 * 334);
		@Pc(112) int local112;
		@Pc(119) int local119;
		@Pc(83) short local83;
		if (Static323.aShort97 > local78) {
			local83 = Static323.aShort97;
			local45 = arg1 * local83 * 334 / (arg3 * 512);
			if (local45 > Static113.aShort42) {
				local45 = Static113.aShort42;
				local112 = local45 * arg3 * 512 / (local83 * 334);
				local119 = (arg1 - local112) / 2;
				if (arg4) {
					Static478.aClass9_10.n();
					Static478.aClass9_10.method7632(arg0, -16777216, local119, arg3, arg2);
					Static478.aClass9_10.method7632(arg1 + arg0 - local119, -16777216, local119, arg3, arg2);
				}
				arg0 += local119;
				arg1 -= local119 * 2;
			}
		} else if (local78 > Static195.aShort68) {
			local83 = Static195.aShort68;
			local45 = local83 * 334 * arg1 / (arg3 * 512);
			if (Static535.aShort126 > local45) {
				local45 = Static535.aShort126;
				local112 = arg1 * 334 * local83 / (local45 * 512);
				local119 = (arg3 - local112) / 2;
				if (arg4) {
					Static478.aClass9_10.n();
					Static478.aClass9_10.method7632(arg0, -16777216, arg1, local119, arg2);
					Static478.aClass9_10.method7632(arg0, -16777216, arg1, local119, arg3 + arg2 - local119);
				}
				arg3 -= local119 * 2;
				arg2 += local119;
			}
		}
		Static158.anInt3486 = arg2;
		Static353.anInt6444 = (short) arg3;
		Static267.anInt5173 = local45 * arg3 / 334;
		Static120.anInt2874 = arg0;
		Static501.anInt8516 = (short) arg1;
	}
}
