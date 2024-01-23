import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static140 {

	@OriginalMember(owner = "client!kb", name = "m", descriptor = "Lclient!fg;")
	public static Class1_Sub2_Sub6 aClass1_Sub2_Sub6_3;

	@OriginalMember(owner = "client!kb", name = "n", descriptor = "[I")
	public static int[] anIntArray464;

	@OriginalMember(owner = "client!kb", name = "s", descriptor = "I")
	public static int anInt5206;

	@OriginalMember(owner = "client!kb", name = "u", descriptor = "I")
	public static int anInt5208;

	@OriginalMember(owner = "client!kb", name = "p", descriptor = "Z")
	public static boolean aBoolean355 = false;

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(II[I[II)V")
	public static void method4446(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		if (arg1 <= arg0) {
			return;
		}
		@Pc(21) int local21 = (arg1 + arg0) / 2;
		@Pc(25) int local25 = arg2[local21];
		arg2[local21] = arg2[arg1];
		arg2[arg1] = local25;
		@Pc(39) int local39 = arg3[local21];
		arg3[local21] = arg3[arg1];
		@Pc(47) int local47 = arg0;
		arg3[arg1] = local39;
		for (@Pc(53) int local53 = arg0; local53 < arg1; local53++) {
			if ((local53 & 0x1) + local25 < arg2[local53]) {
				@Pc(78) int local78 = arg2[local53];
				arg2[local53] = arg2[local47];
				arg2[local47] = local78;
				@Pc(92) int local92 = arg3[local53];
				arg3[local53] = arg3[local47];
				arg3[local47++] = local92;
			}
		}
		arg2[arg1] = arg2[local47];
		arg2[local47] = local25;
		arg3[arg1] = arg3[local47];
		arg3[local47] = local39;
		method4446(arg0, local47 - 1, arg2, arg3);
		method4446(local47 + 1, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(ILclient!ng;BILclient!ua;)V")
	public static void method4447(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub2_Sub12 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class175 arg3) {
		@Pc(25) int local25;
		if (arg3.anIntArray453 != null) {
			@Pc(18) boolean local18 = false;
			@Pc(23) int[] local23 = new int[arg3.anIntArray453.length];
			for (local25 = 0; local25 < local23.length / 2; local25++) {
				@Pc(41) int local41 = arg3.anIntArray453[local25 * 2] + arg1.anInt3598;
				@Pc(54) int local54 = arg1.anInt3593 - arg3.anIntArray453[local25 * 2 + 1];
				@Pc(75) int local75 = local23[local25 * 2] = Static109.anInt4241 + (Static109.anInt4239 - Static109.anInt4241) * (local41 - Static109.anInt4240) / (Static109.anInt4238 - Static109.anInt4240);
				@Pc(99) int local99 = local23[local25 * 2 + 1] = Static109.anInt4235 + (Static109.anInt4236 - Static109.anInt4235) * (local54 - Static109.anInt4237) / (Static109.anInt4242 - Static109.anInt4237);
				if (local75 > Static109.anInt4241 && local75 < Static109.anInt4239 && Static109.anInt4235 < local99 && local99 < Static109.anInt4236) {
					local18 = true;
				}
			}
			if (!local18) {
				return;
			}
			Static147.method2495(local23, arg3.anInt5014, arg3.anInt5014 >>> 24);
			for (local25 = 0; local25 < local23.length / 2 - 1; local25++) {
				Static25.method405(local23[local25 * 2], local23[local25 * 2 + 1], local23[(local25 + 1) * 2], local23[(local25 + 1) * 2 + 1], arg3.anInt5007, arg3.anInt5007 >>> 24);
			}
			Static25.method405(local23[local23.length - 2], local23[local23.length - 1], local23[0], local23[1], arg3.anInt5007, arg3.anInt5007 >>> 24);
		} else if (arg1.aBoolean244) {
			return;
		}
		@Pc(209) Class1_Sub27 local209 = new Class1_Sub27(arg1);
		@Pc(211) Class23_Sub1 local211 = null;
		if (arg3.anInt5031 != -1) {
			if (arg1.aBoolean245 && arg3.anInt5015 != -1) {
				local211 = (Class23_Sub1) arg3.method4293(true, true);
			} else {
				local211 = (Class23_Sub1) arg3.method4293(true, false);
			}
			if (local211 != null) {
				if (Static124.anInt5509 > 0 && (Static45.anInt929 != -1 && Static45.anInt929 == arg1.anInt3591 || Static27.anInt483 != -1 && Static27.anInt483 == arg3.anInt5011)) {
					if (Static200.anInt3847 <= 50) {
						local25 = Static200.anInt3847 * 3;
					} else {
						local25 = 300 - Static200.anInt3847 * 3;
					}
					Static25.method391(arg1.anInt3599, arg1.anInt3600, local211.anInt4473 / 2 + 7, 16776960, local25);
					Static25.method391(arg1.anInt3599, arg1.anInt3600, local211.anInt4473 / 2 + 5, 16776960, local25);
					Static25.method391(arg1.anInt3599, arg1.anInt3600, local211.anInt4473 / 2 + 3, 16776960, local25);
					Static25.method391(arg1.anInt3599, arg1.anInt3600, local211.anInt4473 / 2 + 1, 16776960, local25);
					Static25.method391(arg1.anInt3599, arg1.anInt3600, local211.anInt4473 / 2, 16776960, local25);
				}
				local211.method3909(arg1.anInt3599 - (local211.anInt4473 >> 1), -(local211.anInt4469 >> 1) + arg1.anInt3600);
				local209.anInt4710 = (local211.anInt4473 >> 1) + arg1.anInt3599 + arg2;
				local209.anInt4715 = (local211.anInt4469 >> 1) + arg1.anInt3600 + arg0;
				local209.anInt4714 = arg2 + arg1.anInt3599 - (local211.anInt4473 >> 1);
				local209.anInt4709 = arg1.anInt3600 + arg0 - (local211.anInt4469 >> 1);
			}
		}
		if (arg3.aString291 != null) {
			if (local211 == null) {
				Static244.method3819(arg0, 0, true, arg3, local209, arg1, arg2);
			} else {
				Static244.method3819(arg0, (local211.anInt4469 >> 1) + 5, false, arg3, local209, arg1, arg2);
			}
		}
		if (local209.method4089(Static247.anInt4467, Static222.anInt4105) && arg3.aStringArray37 != null) {
			if (arg3.aStringArray37[4] != null) {
				Static309.method4707(arg3.anInt5011, -1, arg3.aString292, arg3.aStringArray37[4], (short) 1008, (long) arg1.anInt3591, 0);
			}
			if (arg3.aStringArray37[3] != null) {
				Static309.method4707(arg3.anInt5011, -1, arg3.aString292, arg3.aStringArray37[3], (short) 1003, (long) arg1.anInt3591, 0);
			}
			if (arg3.aStringArray37[2] != null) {
				Static309.method4707(arg3.anInt5011, -1, arg3.aString292, arg3.aStringArray37[2], (short) 1011, (long) arg1.anInt3591, 0);
			}
			if (arg3.aStringArray37[1] != null) {
				Static309.method4707(arg3.anInt5011, -1, arg3.aString292, arg3.aStringArray37[1], (short) 1005, (long) arg1.anInt3591, 0);
			}
			if (arg3.aStringArray37[0] != null) {
				Static309.method4707(arg3.anInt5011, -1, arg3.aString292, arg3.aStringArray37[0], (short) 1007, (long) arg1.anInt3591, 0);
			}
		}
		Static71.aClass59_17.method1706(local209);
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(ZI)V")
	public static void method4450(@OriginalArg(0) boolean arg0) {
		if (Static250.aBoolean310 != arg0) {
			Static250.aBoolean310 = arg0;
			Static151.method2555();
		}
	}
}
