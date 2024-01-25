import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static39 {

	@OriginalMember(owner = "client!bd", name = "L", descriptor = "F")
	public static float aFloat7;

	@OriginalMember(owner = "client!bd", name = "E", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray1;

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(Lclient!bla;IIIII)V")
	public static void method583(@OriginalArg(0) Class19_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg2;
		@Pc(7) int local7 = arg2 + arg4;
		@Pc(11) int local11 = arg3 - 1;
		@Pc(15) int local15 = arg3 + arg5;
		for (@Pc(17) int local17 = arg1; local17 <= arg1 + 1; local17++) {
			if (local17 != Static241.anInt4521) {
				for (@Pc(23) int local23 = local3; local23 <= local7; local23++) {
					if (local23 >= 0 && local23 < Static509.anInt8656) {
						for (@Pc(35) int local35 = local11; local35 <= local15; local35++) {
							if (local35 >= 0 && local35 < Static164.anInt3059 && (!local1 || local23 >= local7 || local35 >= local15 || local35 < arg3 && local23 != arg2)) {
								@Pc(77) Class262 local77 = Static584.aClass262ArrayArrayArray2[local17][local23][local35];
								if (local77 != null) {
									@Pc(163) int local163 = (Static639.aClass313Array2[local17].method9095(local35, local23) + Static639.aClass313Array2[local17].method9095(local35, local23 + 1) + Static639.aClass313Array2[local17].method9095(local35 + 1, local23) + Static639.aClass313Array2[local17].method9095(local35 + 1, local23 + 1)) / 4 - (Static639.aClass313Array2[arg1].method9095(arg3, arg2) + Static639.aClass313Array2[arg1].method9095(arg3, arg2 + 1) + Static639.aClass313Array2[arg1].method9095(arg3 + 1, arg2) + Static639.aClass313Array2[arg1].method9095(arg3 + 1, arg2 + 1)) / 4;
									@Pc(166) Class19_Sub1_Sub2 local166 = local77.aClass19_Sub1_Sub2_2;
									@Pc(169) Class19_Sub1_Sub2 local169 = local77.aClass19_Sub1_Sub2_1;
									if (local166 != null && local166.method9368()) {
										arg0.method9373(local1, (local23 - arg2) * Static495.anInt8508 + (1 - arg4) * Static198.anInt3490, Static626.aClass67_16, local163, local166, (local35 - arg3) * Static495.anInt8508 + (1 - arg5) * Static198.anInt3490);
									}
									if (local169 != null && local169.method9368()) {
										arg0.method9373(local1, (local23 - arg2) * Static495.anInt8508 + (1 - arg4) * Static198.anInt3490, Static626.aClass67_16, local163, local169, (local35 - arg3) * Static495.anInt8508 + (1 - arg5) * Static198.anInt3490);
									}
									for (@Pc(250) Class343 local250 = local77.aClass343_2; local250 != null; local250 = local250.aClass343_4) {
										@Pc(254) Class19_Sub1_Sub3 local254 = local250.aClass19_Sub1_Sub3_1;
										if (local254 != null && local254.method9368() && (local23 == local254.aShort121 || local23 == local3) && (local35 == local254.aShort124 || local35 == local11)) {
											@Pc(294) int local294 = local254.aShort123 + 1 - local254.aShort121;
											@Pc(302) int local302 = local254.aShort122 + 1 - local254.aShort124;
											arg0.method9373(local1, (local254.aShort121 - arg2) * Static495.anInt8508 + (local294 - arg4) * Static198.anInt3490, Static626.aClass67_16, local163, local254, (local254.aShort124 - arg3) * Static495.anInt8508 + (local302 - arg5) * Static198.anInt3490);
										}
									}
								}
							}
						}
					}
				}
				local3--;
				local1 = false;
			}
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "([Ljava/lang/String;Z[SII)V")
	public static void method584(@OriginalArg(0) String[] arg0, @OriginalArg(2) short[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg2 >= arg3) {
			return;
		}
		@Pc(18) int local18 = (arg3 + arg2) / 2;
		@Pc(20) int local20 = arg2;
		@Pc(24) String local24 = arg0[local18];
		arg0[local18] = arg0[arg3];
		arg0[arg3] = local24;
		@Pc(38) short local38 = arg1[local18];
		arg1[local18] = arg1[arg3];
		arg1[arg3] = local38;
		for (@Pc(50) int local50 = arg2; local50 < arg3; local50++) {
			if (local24 == null || arg0[local50] != null && (local50 & 0x1) > arg0[local50].compareTo(local24)) {
				@Pc(83) String local83 = arg0[local50];
				arg0[local50] = arg0[local20];
				arg0[local20] = local83;
				@Pc(97) short local97 = arg1[local50];
				arg1[local50] = arg1[local20];
				arg1[local20++] = local97;
			}
		}
		arg0[arg3] = arg0[local20];
		arg0[local20] = local24;
		arg1[arg3] = arg1[local20];
		arg1[local20] = local38;
		method584(arg0, arg1, arg2, local20 - 1);
		method584(arg0, arg1, local20 + 1, arg3);
	}

	@OriginalMember(owner = "client!bd", name = "d", descriptor = "(B)V")
	public static void method586() {
		if (Static131.anInt2468 <= 0) {
			Static140.aString44 = "";
			return;
		}
		@Pc(11) int local11 = 0;
		for (@Pc(13) int local13 = 0; local13 < Static527.aStringArray34.length; local13++) {
			if (Static527.aStringArray34[local13].indexOf("--> ") != -1) {
				local11++;
				if (local11 == Static131.anInt2468) {
					Static140.aString44 = Static527.aStringArray34[local13].substring(Static527.aStringArray34[local13].indexOf(">") + 2);
					break;
				}
			}
		}
	}
}
