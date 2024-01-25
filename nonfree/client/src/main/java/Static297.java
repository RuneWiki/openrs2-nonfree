import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static297 {

	@OriginalMember(owner = "client!ov", name = "v", descriptor = "[[Lclient!uu;")
	public static Class247[][] aClass247ArrayArray2;

	@OriginalMember(owner = "client!ov", name = "o", descriptor = "Ljava/lang/String;")
	public static String aString52 = "";

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(I)V")
	public static void method4069() {
		Static3.aClass4_Sub12_Sub1_5.anInt2997 = 0;
		Static410.anInt6735 = 0;
		Static380.aClass22_294 = null;
		Static316.aClass22_257 = null;
		Static188.anInt5353 = 0;
		Static300.aClass22_246 = null;
		Static35.aClass22_42 = null;
		Static146.aClass4_Sub12_Sub1_3.anInt2997 = 0;
		Static454.anInt4075 = 0;
		Static103.method1816();
		Static199.method3148();
		for (@Pc(33) int local33 = 0; local33 < 2048; local33++) {
			Static267.aClass16_Sub1_Sub5_Sub1Array1[local33] = null;
		}
		Static1.aClass16_Sub1_Sub5_Sub1_1 = null;
		for (@Pc(47) int local47 = 0; local47 < Static143.aClass16_Sub1_Sub5_Sub2Array1.length; local47++) {
			@Pc(53) Class16_Sub1_Sub5_Sub2 local53 = Static143.aClass16_Sub1_Sub5_Sub2Array1[local47];
			if (local53 != null) {
				local53.anInt6034 = -1;
			}
		}
		Static66.method4403();
		Static111.anInt2386 = 1;
		Static187.method2932(30);
		for (@Pc(72) int local72 = 0; local72 < 100; local72++) {
			Static416.aBooleanArray21[local72] = true;
		}
		Static1.method5();
		Static419.aLong212 = 0L;
		Static178.aClass4_Sub42_2 = null;
	}

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(Lclient!jj;IIIII)V")
	public static void method4070(@OriginalArg(0) Class120 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg0.anInt5351 = 0;
		@Pc(7) int local7;
		label56: for (@Pc(4) int local4 = arg2; local4 <= arg4; local4++) {
			label54: for (local7 = arg3; local7 <= arg5; local7++) {
				@Pc(16) long local16 = Static444.aLongArrayArrayArray2[arg1][local4][local7];
				@Pc(18) long local18 = 0L;
				while (true) {
					label49: while (true) {
						if (local18 > 48L) {
							continue label54;
						}
						@Pc(27) int local27 = (int) (local16 >>> (int) local18 & 0xFFFFL);
						if (local27 <= 0) {
							continue label54;
						}
						@Pc(35) Class191 local35 = Static106.aClass191Array1[local27 - 1];
						for (@Pc(37) int local37 = 0; local37 < arg0.anInt5351; local37++) {
							if (arg0.aClass4_Sub21Array3[local37] == local35.aClass4_Sub21_2) {
								local18 += 16L;
								continue label49;
							}
						}
						arg0.aClass4_Sub21Array3[arg0.anInt5351++] = local35.aClass4_Sub21_2;
						if (arg0.anInt5351 == 4) {
							break label56;
						}
						local18 += 16L;
					}
				}
			}
		}
		for (local7 = arg0.anInt5351; local7 < 4; local7++) {
			arg0.aClass4_Sub21Array3[local7] = null;
		}
	}

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(IIBIIIII)V")
	public static void method4071(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg5 < 0 || arg6 < 0 || Static326.anInt5666 - 1 <= arg5 || arg6 >= Static283.anInt5187 - 1) {
			return;
		}
		if (Static202.aClass164ArrayArrayArray5 == null) {
			return;
		}
		@Pc(67) Interface6 local67;
		if (arg3 != 0) {
			if (arg3 != 1) {
				if (arg3 == 2) {
					local67 = (Interface6) Static36.method648(arg0, arg5, arg6, f.class);
					if (local67 != null) {
						if (arg4 == 11) {
							arg4 = 10;
						}
						if (!(local67 instanceof Class16_Sub1_Sub4)) {
							Static27.method524(arg0, arg5, arg4, arg2, arg1, local67.method5350(), arg6, arg3);
							return;
						}
						((Class16_Sub1_Sub4) local67).aClass23_2.method587(arg2);
						return;
					}
				} else if (arg3 == 3) {
					local67 = (Interface6) Static117.method2096(arg0, arg5, arg6);
					if (local67 == null) {
						return;
					}
					if (!(local67 instanceof Class16_Sub4_Sub2)) {
						Static27.method524(arg0, arg5, arg4, arg2, arg1, local67.method5350(), arg6, arg3);
						return;
					}
					((Class16_Sub4_Sub2) local67).aClass23_1.method587(arg2);
				} else {
					return;
				}
				return;
			}
			local67 = (Interface6) Static54.method918(arg0, arg5, arg6);
			if (local67 != null) {
				if (!(local67 instanceof Class16_Sub2_Sub3)) {
					@Pc(148) int local148 = local67.method5350();
					if (arg4 != 4 && arg4 != 5) {
						if (arg4 == 6) {
							Static27.method524(arg0, arg5, 4, arg2, arg1 + 4, local148, arg6, arg3);
							return;
						}
						if (arg4 == 7) {
							Static27.method524(arg0, arg5, 4, arg2, (arg1 + 2 & 0x3) + 4, local148, arg6, arg3);
						} else if (arg4 == 8) {
							Static27.method524(arg0, arg5, 4, arg2, arg1 + 4, local148, arg6, arg3);
							Static27.method524(arg0, arg5, 4, arg2, (arg1 + 2 & 0x3) + 4, local148, arg6, arg3);
							return;
						}
						return;
					}
					Static27.method524(arg0, arg5, 4, arg2, arg1, local148, arg6, arg3);
					return;
				}
				((Class16_Sub2_Sub3) local67).aClass23_3.method587(arg2);
				return;
			}
			return;
		}
		local67 = (Interface6) Static227.method3449(arg0, arg5, arg6);
		@Pc(256) Interface6 local256 = (Interface6) Static136.method2344(arg0, arg5, arg6);
		if (local67 != null && arg4 != 2) {
			if (local67 instanceof Class16_Sub5_Sub3) {
				((Class16_Sub5_Sub3) local67).aClass23_4.method587(arg2);
			} else {
				Static27.method524(arg0, arg5, arg4, arg2, arg1, local67.method5350(), arg6, arg3);
			}
		}
		if (local256 == null) {
			return;
		}
		if (local256 instanceof Class16_Sub5_Sub3) {
			((Class16_Sub5_Sub3) local256).aClass23_4.method587(arg2);
			return;
		}
		Static27.method524(arg0, arg5, arg4, arg2, arg1, local256.method5350(), arg6, arg3);
		return;
	}
}
