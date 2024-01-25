import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static459 {

	// $FF: synthetic field
	@OriginalMember(owner = "client!po", name = "b", descriptor = "Ljava/lang/Class;")
	private static Class aClass22;

	@OriginalMember(owner = "client!po", name = "e", descriptor = "I")
	public static int anInt7835 = 0;

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(I[I)Ljava/lang/String;")
	public static String method6733(@OriginalArg(1) int[] arg0) {
		@Pc(9) StringBuffer local9 = new StringBuffer();
		@Pc(20) int local20 = Static463.anInt7896;
		for (@Pc(22) int local22 = 0; local22 < arg0.length; local22++) {
			@Pc(31) Class82 local31 = Static218.aClass20_1.method345(arg0[local22]);
			if (local31.anInt1565 != -1) {
				@Pc(43) Class134 local43 = (Class134) Static533.aClass391_50.method9275((long) local31.anInt1565);
				if (local43 == null) {
					@Pc(51) Class173 local51 = Static684.method3655(Static345.aClass208_78, local31.anInt1565, 0);
					if (local51 != null) {
						local43 = Static457.aClass57_11.method7654(local51, true);
						Static533.aClass391_50.method9273((long) local31.anInt1565, local43, 1);
					}
				}
				if (local43 != null) {
					Static494.aClass134Array13[local20] = local43;
					local9.append(" <img=").append(local20).append(">");
					local20++;
				}
			}
		}
		return local9.toString();
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(IIIIIBII)V")
	public static void method6734(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg4 < 0 || arg5 < 0 || Static544.anInt9261 - 1 <= arg4 || Static282.anInt4887 - 1 <= arg5 || Static260.aClass174ArrayArrayArray2 == null) {
			return;
		}
		@Pc(50) Interface16 local50;
		if (arg0 == 0) {
			local50 = (Interface16) Static87.method1318(arg2, arg4, arg5);
			@Pc(268) Interface16 local268 = (Interface16) Static640.method8943(arg2, arg4, arg5);
			if (local50 != null && arg3 != 2) {
				if (local50 instanceof Class8_Sub1_Sub4_Sub1) {
					((Class8_Sub1_Sub4_Sub1) local50).aClass246_4.method5628(arg6);
				} else {
					Static220.method3148(arg0, arg6, arg4, arg2, arg3, arg5, arg1, local50.method8089());
				}
			}
			if (local268 == null) {
				return;
			}
			if (local268 instanceof Class8_Sub1_Sub4_Sub1) {
				((Class8_Sub1_Sub4_Sub1) local268).aClass246_4.method5628(arg6);
				return;
			}
			Static220.method3148(arg0, arg6, arg4, arg2, arg3, arg5, arg1, local268.method8089());
		} else if (arg0 == 1) {
			local50 = (Interface16) Static532.method7888(arg2, arg4, arg5);
			if (local50 != null) {
				if (local50 instanceof Class8_Sub1_Sub2_Sub1) {
					((Class8_Sub1_Sub2_Sub1) local50).aClass246_2.method5628(arg6);
					return;
				}
				@Pc(61) int local61 = local50.method8089();
				if (arg3 == 4 || arg3 == 5) {
					Static220.method3148(arg0, arg6, arg4, arg2, 4, arg5, arg1, local61);
				} else if (arg3 == 6) {
					Static220.method3148(arg0, arg6, arg4, arg2, 4, arg5, arg1 + 4, local61);
					return;
				} else if (arg3 == 7) {
					Static220.method3148(arg0, arg6, arg4, arg2, 4, arg5, (arg1 + 2 & 0x3) + 4, local61);
					return;
				} else if (arg3 == 8) {
					Static220.method3148(arg0, arg6, arg4, arg2, 4, arg5, arg1 + 4, local61);
					Static220.method3148(arg0, arg6, arg4, arg2, 4, arg5, (arg1 + 2 & 0x3) + 4, local61);
					return;
				}
				return;
			}
			return;
		} else if (arg0 == 2) {
			local50 = (Interface16) Static465.method5496(arg2, arg4, arg5, aClass22 == null ? (aClass22 = Class281.a("nda")) : aClass22);
			if (local50 != null) {
				if (arg3 == 11) {
					arg3 = 10;
				}
				if (local50 instanceof Class8_Sub1_Sub3_Sub3) {
					((Class8_Sub1_Sub3_Sub3) local50).aClass246_3.method5628(arg6);
					return;
				}
				Static220.method3148(arg0, arg6, arg4, arg2, arg3, arg5, arg1, local50.method8089());
				return;
			}
			return;
		} else if (arg0 == 3) {
			local50 = (Interface16) Static209.method3036(arg2, arg4, arg5);
			if (local50 != null) {
				if (!(local50 instanceof Class8_Sub1_Sub1_Sub2)) {
					Static220.method3148(arg0, arg6, arg4, arg2, arg3, arg5, arg1, local50.method8089());
					return;
				}
				((Class8_Sub1_Sub1_Sub2) local50).aClass246_1.method5628(arg6);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(B)V")
	public static void method6735() {
		if (!Static672.aBoolean792) {
			Static258.aBoolean347 = true;
			Static672.aBoolean792 = true;
			Static10.aFloat3 += (24.0F - Static10.aFloat3) / 2.0F;
		}
	}
}
