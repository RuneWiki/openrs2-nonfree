import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static146 {

	@OriginalMember(owner = "client!lf", name = "X", descriptor = "Lclient!ec;")
	public static Class46 aClass46_25 = new Class46(64);

	@OriginalMember(owner = "client!lf", name = "Y", descriptor = "Ljava/lang/String;")
	public static String aString150 = "yellow:";

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIBZII)V")
	public static void method2584(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg4 < 1) {
			arg4 = 1;
		}
		if (arg3 < 1) {
			arg3 = 1;
		}
		if (Static60.aBoolean106) {
			@Pc(25) int local25 = arg3 - 334;
			if (local25 < 0) {
				local25 = 0;
			} else if (local25 > 100) {
				local25 = 100;
			}
			@Pc(50) int local50 = (Static18.aShort1 - Static50.aShort12) * local25 / 100 + Static50.aShort12;
			if (local50 < Static136.aShort15) {
				local50 = Static136.aShort15;
			} else if (Static41.aShort7 < local50) {
				local50 = Static41.aShort7;
			}
			@Pc(80) int local80 = arg3 * 512 * local50 / (arg4 * 334);
			@Pc(114) int local114;
			@Pc(120) int local120;
			@Pc(85) short local85;
			if (Static47.aShort10 > local80) {
				local85 = Static47.aShort10;
				local50 = local85 * 334 * arg4 / (arg3 * 512);
				if (Static41.aShort7 < local50) {
					local50 = Static41.aShort7;
					local114 = local50 * 512 * arg3 / (local85 * 334);
					local120 = (arg4 - local114) / 2;
					if (arg2) {
						Static94.method1750();
						Static94.method1758(arg1, arg0, local120, arg3, 0);
						Static94.method1758(arg1 + arg4 - local120, arg0, local120, arg3, 0);
					}
					arg1 += local120;
					arg4 -= local120 * 2;
				}
			} else if (local80 > Static156.aShort43) {
				local85 = Static156.aShort43;
				local50 = local85 * 334 * arg4 / (arg3 * 512);
				if (Static136.aShort15 > local50) {
					local50 = Static136.aShort15;
					local114 = local85 * 334 * arg4 / (local50 * 512);
					local120 = (arg3 - local114) / 2;
					if (arg2) {
						Static94.method1750();
						Static94.method1758(arg1, arg0, arg4, local120, 0);
						Static94.method1758(arg1, arg0 + arg3 - local120, arg4, local120, 0);
					}
					arg3 -= local120 * 2;
					arg0 += local120;
				}
			}
			Static289.anInt6018 = arg3 * local50 / 334;
		}
		Static44.anInt1075 = arg0;
		Static34.anInt1962 = (short) arg3;
		Static37.anInt907 = (short) arg4;
		Static86.anInt1914 = arg1;
	}

	@OriginalMember(owner = "client!lf", name = "c", descriptor = "(II)Z")
	public static boolean method2585(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return false;
		}
		@Pc(19) int local19 = Static289.aShortArray93[arg0];
		if (local19 >= 2000) {
			local19 -= 2000;
		}
		return local19 == 1007;
	}
}
