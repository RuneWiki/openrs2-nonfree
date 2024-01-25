import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static283 {

	@OriginalMember(owner = "client!ks", name = "E", descriptor = "[Lclient!xa;")
	public static Class66[] aClass66Array7;

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(IZIIBI)V")
	public static void method4648(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 < 1) {
			arg0 = 1;
		}
		if (arg3 < 1) {
			arg3 = 1;
		}
		@Pc(26) int local26 = arg0 - 334;
		if (local26 < 0) {
			local26 = 0;
		} else if (local26 > 100) {
			local26 = 100;
		}
		@Pc(50) int local50 = Static145.aShort32 + (Static225.aShort42 - Static145.aShort32) * local26 / 100;
		if (Static385.aShort75 > local50) {
			local50 = Static385.aShort75;
		} else if (local50 > Static561.aShort27) {
			local50 = Static561.aShort27;
		}
		@Pc(76) int local76 = local50 * 512 * arg0 / (arg3 * 334);
		@Pc(109) int local109;
		@Pc(115) int local115;
		@Pc(84) short local84;
		if (local76 < Static439.aShort84) {
			local84 = Static439.aShort84;
			local50 = arg3 * 334 * local84 / (arg0 * 512);
			if (Static561.aShort27 < local50) {
				local50 = Static561.aShort27;
				local109 = local50 * arg0 * 512 / (local84 * 334);
				local115 = (arg3 - local109) / 2;
				if (arg1) {
					Static323.aClass9_8.F();
					Static323.aClass9_8.method5409(arg0, local115, -16777216, arg2, arg4);
					Static323.aClass9_8.method5409(arg0, local115, -16777216, arg2, arg4 + arg3 - local115);
				}
				arg4 += local115;
				arg3 -= local115 * 2;
			}
		} else if (local76 > Static390.aShort76) {
			local84 = Static390.aShort76;
			local50 = local84 * arg3 * 334 / (arg0 * 512);
			if (Static385.aShort75 > local50) {
				local50 = Static385.aShort75;
				local109 = local84 * 334 * arg3 / (local50 * 512);
				local115 = (arg0 - local109) / 2;
				if (arg1) {
					Static323.aClass9_8.F();
					Static323.aClass9_8.method5409(local115, arg3, -16777216, arg2, arg4);
					Static323.aClass9_8.method5409(local115, arg3, -16777216, arg2 + arg0 - local115, arg4);
				}
				arg0 -= local115 * 2;
				arg2 += local115;
			}
		}
		Static272.anInt5327 = (short) arg3;
		Static386.anInt7239 = arg2;
		Static374.anInt7026 = arg0 * local50 / 334;
		Static512.anInt8696 = arg4;
		Static16.anInt779 = (short) arg0;
	}
}
