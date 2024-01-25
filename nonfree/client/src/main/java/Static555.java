import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static555 {

	@OriginalMember(owner = "client!vd", name = "d", descriptor = "F")
	public static float aFloat220;

	@OriginalMember(owner = "client!vd", name = "g", descriptor = "F")
	public static float aFloat221;

	@OriginalMember(owner = "client!vd", name = "i", descriptor = "Lclient!lk;")
	public static Class203 aClass203_139;

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "Lclient!ju;")
	public static final Class173 aClass173_8 = new Class173("LIVE", 0);

	@OriginalMember(owner = "client!vd", name = "e", descriptor = "Lclient!te;")
	public static final Class318 aClass318_8 = new Class318("", 10);

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(Lclient!lk;IIIILclient!ua;Lclient!f;I)V")
	public static void method7393(@OriginalArg(0) Class203 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class146 arg4, @OriginalArg(6) Class46 arg5, @OriginalArg(7) int arg6) {
		if (arg5 == null) {
			return;
		}
		@Pc(16) int local16;
		if (Static446.anInt7363 == 4) {
			local16 = (int) Static439.aFloat151 & 0x3FFF;
		} else {
			local16 = Static278.anInt5101 + (int) Static439.aFloat151 & 0x3FFF;
		}
		@Pc(35) int local35 = Math.max(arg0.anInt5513 / 2, arg0.anInt5476 / 2) + 10;
		@Pc(43) int local43 = arg1 * arg1 + arg3 * arg3;
		if (local43 > local35 * local35) {
			return;
		}
		@Pc(57) int local57 = Class3_Sub17.anIntArray175[local16];
		@Pc(66) int local66 = Class3_Sub17.anIntArray177[local16];
		if (Static446.anInt7363 != 4) {
			local66 = local66 * 256 / (Static435.anInt7196 + 256);
			local57 = local57 * 256 / (Static435.anInt7196 + 256);
		}
		@Pc(97) int local97 = local66 * arg3 + local57 * arg1 >> 14;
		@Pc(108) int local108 = local66 * arg1 - local57 * arg3 >> 14;
		arg5.method7610(local97 + arg6 + arg0.anInt5513 / 2 - arg5.A() / 2, -local108 + arg2 - -(arg0.anInt5476 / 2) - arg5.ca() / 2, arg4, arg6, arg2);
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIIIIII)Z")
	public static boolean method7394(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (!Static32.aBoolean54) {
			return false;
		} else if (Static151.anInt3128 < 100) {
			return false;
		} else {
			@Pc(36) int local36;
			@Pc(40) int local40;
			if (arg5 != arg0 || arg1 != arg2) {
				for (local36 = arg0; local36 <= arg5; local36++) {
					for (local40 = arg1; local40 <= arg2; local40++) {
						if (-Static3.anInt50 == Static429.anIntArrayArrayArray14[arg4][local36][local40]) {
							return false;
						}
					}
				}
				local40 = (arg0 << Static458.anInt7508) + 1;
				@Pc(107) int local107 = (arg1 << Static458.anInt7508) + 2;
				if (Static518.method6898(Static511.anInt8116 * (arg5 + 1 - arg0), arg3, Static29.aClass139Array6[arg4].method6889(arg0, arg1), local107, local40, (arg2 + 1 - arg1) * Static511.anInt8116)) {
					Static145.anInt3068++;
					return true;
				} else {
					return false;
				}
			} else if (Static477.method6554(arg0, arg4, arg1)) {
				local36 = arg0 << Static458.anInt7508;
				local40 = arg1 << Static458.anInt7508;
				if (Static518.method6898(Static511.anInt8116, arg3, Static29.aClass139Array6[arg4].method6889(arg0, arg1), local40, local36, Static511.anInt8116)) {
					Static145.anInt3068++;
					return true;
				} else {
					return false;
				}
			} else {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(II)V")
	public static void method7396(@OriginalArg(0) int arg0) {
		if (Static375.anInt6351 == 0) {
			Static142.aClass3_Sub6_Sub3_1.method2118(arg0);
		} else {
			Static478.anInt7778 = arg0;
		}
	}
}
