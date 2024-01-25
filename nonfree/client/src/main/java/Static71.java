import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static71 {

	@OriginalMember(owner = "client!cga", name = "h", descriptor = "Ljava/lang/Object;")
	public static Object anObject1;

	// $FF: synthetic field
	@OriginalMember(owner = "client!cga", name = "k", descriptor = "Ljava/lang/Class;")
	private static Class aClass4;

	@OriginalMember(owner = "client!cga", name = "f", descriptor = "Lclient!gia;")
	public static final Class136 aClass136_1 = new Class136("WIP", 2);

	@OriginalMember(owner = "client!cga", name = "a", descriptor = "(Lclient!kn;ILclient!rfa;I)V")
	public static void method941(@OriginalArg(0) Class212 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class60_Sub1 arg2) {
		if (Static74.anInt1034 >= 50 || (arg0 == null || arg0.anIntArrayArray31 == null || arg1 >= arg0.anIntArrayArray31.length || arg0.anIntArrayArray31[arg1] == null)) {
			return;
		}
		@Pc(42) int local42 = arg0.anIntArrayArray31[arg1][0];
		@Pc(53) int local53 = local42 >> 8;
		@Pc(59) int local59 = local42 >> 5 & 0x7;
		@Pc(63) int local63 = local42 & 0x1F;
		@Pc(80) int local80;
		if (arg0.anIntArrayArray31[arg1].length > 1) {
			local80 = (int) (Math.random() * (double) arg0.anIntArrayArray31[arg1].length);
			if (local80 > 0) {
				local53 = arg0.anIntArrayArray31[arg1][local80];
			}
		}
		local80 = 256;
		if (arg0.anIntArray321 != null && arg0.anIntArray320 != null) {
			local80 = (int) (Math.random() * (double) (arg0.anIntArray320[arg1] - arg0.anIntArray321[arg1])) + arg0.anIntArray321[arg1];
		}
		@Pc(131) int local131 = arg0.anIntArray323 == null ? 255 : arg0.anIntArray323[arg1];
		if (local63 == 0) {
			if (arg2 == Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1) {
				if (arg0.aBoolean415) {
					Static503.method7340(0, false, local53, local59, local80, local131);
					return;
				}
				Static241.method4231(local80, local53, local131, 0, local59);
			}
		} else if (Static687.aClass6_Sub44_33.aClass7_Sub13_1.method3338() != 0) {
			@Pc(175) int local175 = arg2.anInt9048 - 256 >> 9;
			@Pc(182) int local182 = arg2.anInt9057 - 256 >> 9;
			@Pc(205) int local205 = Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1 == arg2 ? 0 : (local175 << 16) + ((arg2.aByte135 << 24) + (local182 << 8) + local63);
			Static534.aClass124Array6[Static74.anInt1034++] = new Class124((byte) (arg0.aBoolean415 ? 2 : 1), local53, local59, 0, local131, local205, local80, arg2);
		}
	}

	@OriginalMember(owner = "client!cga", name = "a", descriptor = "(IIIIIIBI)V")
	public static void method942(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		if (arg0 < 0 || arg5 < 0 || Static29.anInt380 - 1 <= arg0 || Static327.anInt5650 - 1 <= arg5) {
			return;
		}
		if (Static334.aClass243ArrayArrayArray2 == null) {
			return;
		}
		@Pc(50) Interface23 local50;
		if (arg4 == 0) {
			local50 = (Interface23) Static593.method8225(arg2, arg0, arg5);
			@Pc(56) Interface23 local56 = (Interface23) Static553.method7848(arg2, arg0, arg5);
			if (local50 != null && arg3 != 2) {
				if (local50 instanceof Class60_Sub1_Sub3_Sub2) {
					((Class60_Sub1_Sub3_Sub2) local50).aClass240_4.method5915(arg1);
				} else {
					Static171.method3328(arg6, local50.method7934(), arg1, arg3, arg4, arg0, arg5, arg2);
				}
			}
			if (local56 != null) {
				if (local56 instanceof Class60_Sub1_Sub3_Sub2) {
					((Class60_Sub1_Sub3_Sub2) local56).aClass240_4.method5915(arg1);
					return;
				}
				Static171.method3328(arg6, local56.method7934(), arg1, arg3, arg4, arg0, arg5, arg2);
				return;
			}
			return;
		}
		if (arg4 == 1) {
			local50 = (Interface23) Static382.method5910(arg2, arg0, arg5);
			if (local50 != null) {
				if (local50 instanceof Class60_Sub1_Sub5_Sub1) {
					((Class60_Sub1_Sub5_Sub1) local50).aClass240_3.method5915(arg1);
					return;
				}
				@Pc(148) int local148 = local50.method7934();
				if (arg3 != 4 && arg3 != 5) {
					if (arg3 == 6) {
						Static171.method3328(arg6 + 4, local148, arg1, 4, arg4, arg0, arg5, arg2);
					} else if (arg3 == 7) {
						Static171.method3328((arg6 + 2 & 0x3) + 4, local148, arg1, 4, arg4, arg0, arg5, arg2);
						return;
					} else if (arg3 == 8) {
						Static171.method3328(arg6 + 4, local148, arg1, 4, arg4, arg0, arg5, arg2);
						Static171.method3328((arg6 + 2 & 0x3) + 4, local148, arg1, 4, arg4, arg0, arg5, arg2);
						return;
					}
					return;
				}
				Static171.method3328(arg6, local148, arg1, 4, arg4, arg0, arg5, arg2);
				return;
			}
			return;
		}
		if (arg4 != 2) {
			if (arg4 == 3) {
				local50 = (Interface23) Static64.method787(arg2, arg0, arg5);
				if (local50 != null) {
					if (local50 instanceof Class60_Sub1_Sub2_Sub1) {
						((Class60_Sub1_Sub2_Sub1) local50).aClass240_1.method5915(arg1);
						return;
					}
					Static171.method3328(arg6, local50.method7934(), arg1, arg3, arg4, arg0, arg5, arg2);
					return;
				}
			}
			return;
		}
		local50 = (Interface23) Static122.method2204(arg2, arg0, arg5, aClass4 == null ? (aClass4 = Class55.a("rt")) : aClass4);
		if (local50 == null) {
			return;
		}
		if (arg3 == 11) {
			arg3 = 10;
		}
		if (!(local50 instanceof Class60_Sub1_Sub1_Sub4)) {
			Static171.method3328(arg6, local50.method7934(), arg1, arg3, arg4, arg0, arg5, arg2);
			return;
		}
		((Class60_Sub1_Sub1_Sub4) local50).aClass240_2.method5915(arg1);
		return;
	}
}
