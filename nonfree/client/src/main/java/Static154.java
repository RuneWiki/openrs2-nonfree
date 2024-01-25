import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static154 {

	@OriginalMember(owner = "client!fj", name = "d", descriptor = "Z")
	public static boolean aBoolean202;

	@OriginalMember(owner = "client!fj", name = "f", descriptor = "Lclient!oj;")
	public static Class5_Sub5_Sub15 aClass5_Sub5_Sub15_3;

	@OriginalMember(owner = "client!fj", name = "m", descriptor = "[I")
	public static final int[] anIntArray157 = new int[1];

	@OriginalMember(owner = "client!fj", name = "b", descriptor = "(II)Lclient!cl;")
	public static Class57 method2245(@OriginalArg(1) int arg0) {
		if (arg0 == 0) {
			if ((double) Static620.aFloat147 == 3.0D) {
				return Static104.aClass57_4;
			}
			if ((double) Static620.aFloat147 == 4.0D) {
				return Static340.aClass57_7;
			}
			if ((double) Static620.aFloat147 == 6.0D) {
				return Static125.aClass57_2;
			}
			if ((double) Static620.aFloat147 >= 8.0D) {
				return Static557.aClass57_9;
			}
		} else if (arg0 == 1) {
			if ((double) Static620.aFloat147 == 3.0D) {
				return Static125.aClass57_2;
			}
			if ((double) Static620.aFloat147 == 4.0D) {
				return Static557.aClass57_9;
			}
			if ((double) Static620.aFloat147 == 6.0D) {
				return Static114.aClass57_5;
			}
			if ((double) Static620.aFloat147 >= 8.0D) {
				return Static396.aClass57_8;
			}
		} else if (arg0 == 2) {
			if ((double) Static620.aFloat147 == 3.0D) {
				return Static114.aClass57_5;
			}
			if ((double) Static620.aFloat147 == 4.0D) {
				return Static396.aClass57_8;
			}
			if ((double) Static620.aFloat147 == 6.0D) {
				return Static101.aClass57_3;
			}
			if ((double) Static620.aFloat147 >= 8.0D) {
				return Static177.aClass57_6;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(IIIBLclient!eu;I)V")
	public static void method2246(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class5_Sub20 arg3, @OriginalArg(5) int arg4) {
		if (arg3.anInt2413 == -1 && arg3.anIntArray145 == null) {
			return;
		}
		@Pc(16) int local16 = 0;
		@Pc(28) int local28 = arg3.anInt2417 * Static97.aClass5_Sub25_8.aClass6_Sub18_4.method5120() >> 8;
		if (arg3.anInt2407 < arg4) {
			local16 = arg4 - arg3.anInt2407;
		} else if (arg4 < arg3.anInt2410) {
			local16 = arg3.anInt2410 - arg4;
		}
		if (arg0 > arg3.anInt2408) {
			local16 += arg0 - arg3.anInt2408;
		} else if (arg0 < arg3.anInt2406) {
			local16 += arg3.anInt2406 - arg0;
		}
		if (arg3.anInt2409 == 0 || local16 - 256 > arg3.anInt2409 || Static97.aClass5_Sub25_8.aClass6_Sub18_4.method5120() == 0 || arg1 != arg3.anInt2418) {
			if (arg3.aClass5_Sub1_Sub4_2 != null) {
				Static26.aClass5_Sub1_Sub2_1.method5052(arg3.aClass5_Sub1_Sub4_2);
				arg3.aClass5_Sub29_2 = null;
				arg3.aClass5_Sub1_Sub4_2 = null;
				arg3.aClass5_Sub37_Sub1_1 = null;
			}
			if (arg3.aClass5_Sub1_Sub4_1 != null) {
				Static26.aClass5_Sub1_Sub2_1.method5052(arg3.aClass5_Sub1_Sub4_1);
				arg3.aClass5_Sub37_Sub1_2 = null;
				arg3.aClass5_Sub29_1 = null;
				arg3.aClass5_Sub1_Sub4_1 = null;
			}
			return;
		}
		local16 -= 256;
		if (local16 < 0) {
			local16 = 0;
		}
		@Pc(167) int local167 = local28 * (arg3.anInt2409 - local16) / arg3.anInt2409;
		Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2.method1018();
		@Pc(173) int local173 = 8192;
		@Pc(184) int local184 = (arg3.anInt2407 + arg3.anInt2410) / 2 - arg4;
		@Pc(195) int local195 = (arg3.anInt2406 + arg3.anInt2408) / 2 - arg0;
		@Pc(218) int local218;
		@Pc(233) int local233;
		if (local184 != 0 || local195 != 0) {
			local218 = -Static491.anInt8292 - (int) (Math.atan2((double) local184, (double) local195) * 2607.5945876176133D) - 4096 & 0x3FFF;
			if (local218 > 8192) {
				local218 = 16384 - local218;
			}
			if (local16 <= 0) {
				local233 = 8192;
			} else if (local16 >= 4096) {
				local233 = 16384;
			} else {
				local233 = local16 * 8192 / 4096 + 8192;
			}
			local173 = local233 * local218 / 8192 + (16384 - local233 >> 1);
		}
		@Pc(331) Class5_Sub1_Sub4 local331;
		if (arg3.aClass5_Sub1_Sub4_2 != null) {
			arg3.aClass5_Sub1_Sub4_2.method7766(local167);
			arg3.aClass5_Sub1_Sub4_2.method7783(local173);
		} else if (arg3.anInt2413 >= 0) {
			local218 = arg3.anInt2405 == 256 && arg3.anInt2414 == 256 ? 256 : Static493.method7230(arg3.anInt2414, arg3.anInt2405);
			if (arg3.aBoolean183) {
				if (arg3.aClass5_Sub29_2 == null) {
					arg3.aClass5_Sub29_2 = Static279.method4459(Static610.aClass207_123, arg3.anInt2413);
				}
				if (arg3.aClass5_Sub29_2 != null) {
					if (arg3.aClass5_Sub37_Sub1_1 == null) {
						arg3.aClass5_Sub37_Sub1_1 = arg3.aClass5_Sub29_2.method4449(new int[] { 22050 });
					}
					if (arg3.aClass5_Sub37_Sub1_1 != null) {
						local331 = Static654.method7784(arg3.aClass5_Sub37_Sub1_1, local218, local167 << 6, local173);
						local331.method7765(-1);
						Static26.aClass5_Sub1_Sub2_1.method5055(local331);
						arg3.aClass5_Sub1_Sub4_2 = local331;
					}
				}
			} else {
				@Pc(348) Class117 local348 = Static648.method2664(Static503.aClass207_106, arg3.anInt2413, 0);
				if (local348 != null) {
					@Pc(355) Class5_Sub37_Sub1 local355 = local348.method2663().method7692(Static73.aClass114_4);
					@Pc(363) Class5_Sub1_Sub4 local363 = Static654.method7784(local355, local218, local167 << 6, local173);
					local363.method7765(-1);
					Static26.aClass5_Sub1_Sub2_1.method5055(local363);
					arg3.aClass5_Sub1_Sub4_2 = local363;
				}
			}
		}
		if (arg3.aClass5_Sub1_Sub4_1 != null) {
			arg3.aClass5_Sub1_Sub4_1.method7766(local167);
			arg3.aClass5_Sub1_Sub4_1.method7783(local173);
			if (!arg3.aClass5_Sub1_Sub4_1.method9048()) {
				arg3.aClass5_Sub1_Sub4_1 = null;
				arg3.aClass5_Sub37_Sub1_2 = null;
				arg3.aClass5_Sub29_1 = null;
			}
		} else if (arg3.anIntArray145 != null && (arg3.anInt2411 -= arg2) <= 0) {
			local218 = arg3.anInt2405 == 256 && arg3.anInt2414 == 256 ? 256 : (int) ((double) (arg3.anInt2405 - arg3.anInt2414) * Math.random()) + arg3.anInt2414;
			if (arg3.aBoolean184) {
				if (arg3.aClass5_Sub29_1 == null) {
					local233 = (int) ((double) arg3.anIntArray145.length * Math.random());
					arg3.aClass5_Sub29_1 = Static279.method4459(Static610.aClass207_123, arg3.anIntArray145[local233]);
				}
				if (arg3.aClass5_Sub29_1 != null) {
					if (arg3.aClass5_Sub37_Sub1_2 == null) {
						arg3.aClass5_Sub37_Sub1_2 = arg3.aClass5_Sub29_1.method4449(new int[] { 22050 });
					}
					if (arg3.aClass5_Sub37_Sub1_2 != null) {
						local331 = Static654.method7784(arg3.aClass5_Sub37_Sub1_2, local218, local167 << 6, local173);
						local331.method7765(0);
						Static26.aClass5_Sub1_Sub2_1.method5055(local331);
						arg3.aClass5_Sub1_Sub4_1 = local331;
						arg3.anInt2411 = (int) (Math.random() * (double) (arg3.anInt2419 - arg3.anInt2421)) + arg3.anInt2421;
						return;
					}
				}
				return;
			}
			local233 = (int) (Math.random() * (double) arg3.anIntArray145.length);
			@Pc(537) Class117 local537 = Static648.method2664(Static503.aClass207_106, arg3.anIntArray145[local233], 0);
			if (local537 != null) {
				@Pc(544) Class5_Sub37_Sub1 local544 = local537.method2663().method7692(Static73.aClass114_4);
				@Pc(552) Class5_Sub1_Sub4 local552 = Static654.method7784(local544, local218, local167 << 6, local173);
				local552.method7765(0);
				Static26.aClass5_Sub1_Sub2_1.method5055(local552);
				arg3.anInt2411 = (int) ((double) (arg3.anInt2419 - arg3.anInt2421) * Math.random()) + arg3.anInt2421;
				arg3.aClass5_Sub1_Sub4_1 = local552;
				return;
			}
		}
	}
}
