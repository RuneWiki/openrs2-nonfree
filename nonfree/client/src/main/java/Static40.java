import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static40 {

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "Lclient!sh;")
	public static final Class211 aClass211_18 = new Class211(90, 12);

	@OriginalMember(owner = "client!cb", name = "c", descriptor = "Z")
	public static boolean aBoolean70 = false;

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(ILclient!es;)Z")
	public static boolean method624(@OriginalArg(1) Class73 arg0) {
		return arg0 == Static233.aClass73_4 || Static351.aClass73_6 == arg0 || Static93.aClass73_1 == arg0;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(I)V")
	public static void method625() {
		if (Static142.anInt2665 == 10 || Static142.anInt2665 == 28) {
			Static156.method2349(Static133.anInt2471 >> 10, 5000, Static256.anInt4409 >> 10);
		} else {
			@Pc(26) int local26 = Static321.aClass25_Sub1_Sub1_Sub1_2.anIntArray296[0] >> 3;
			@Pc(33) int local33 = Static321.aClass25_Sub1_Sub1_Sub1_2.anIntArray295[0] >> 3;
			if (local26 >= 0 && Static92.anInt1675 >> 3 > local26 && local33 >= 0 && Static262.anInt6340 >> 3 > local33) {
				Static156.method2349(local33, 5000, local26);
			} else {
				Static156.method2349(Static262.anInt6340 >> 4, 0, Static92.anInt1675 >> 4);
			}
		}
		Static185.method2659();
		Static261.method4026();
		Static34.method524();
		Static73.method1166();
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(ILclient!je;Lclient!tq;IIILclient!us;II)V")
	public static void method627(@OriginalArg(0) int arg0, @OriginalArg(1) Class117 arg1, @OriginalArg(2) Class164 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class34 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(15) Class97 local15 = Static16.aClass249_1.method5522(arg7);
		if (local15 == null || !local15.aBoolean182 || !local15.method1857(Static230.aClass72_3)) {
			return;
		}
		@Pc(35) int local35;
		if (local15.anIntArray289 != null) {
			@Pc(33) int[] local33 = new int[local15.anIntArray289.length];
			@Pc(47) int local47;
			for (local35 = 0; local35 < local33.length / 2; local35++) {
				if (Static323.anInt5463 == 4) {
					local47 = (int) Static386.aFloat82 & 0x3FFF;
				} else {
					local47 = (int) Static386.aFloat82 + Static246.anInt4136 & 0x3FFF;
				}
				@Pc(58) int local58 = Class13.anIntArray20[local47];
				@Pc(62) int local62 = Class13.anIntArray21[local47];
				if (Static323.anInt5463 != 4) {
					local58 = local58 * 256 / (Static205.anInt3600 + 256);
					local62 = local62 * 256 / (Static205.anInt3600 + 256);
				}
				local33[local35 * 2] = (local62 * (arg4 + local15.anIntArray289[local35 * 2] * 4) + local58 * (arg6 + local15.anIntArray289[local35 * 2 + 1] * 4) >> 15) + arg1.anInt3074 / 2 + arg3;
				local33[local35 * 2 + 1] = arg1.anInt3071 / 2 + arg0 - (local62 * (local15.anIntArray289[local35 * 2 - -1] * 4 + arg6) + -(local58 * (arg4 - -(local15.anIntArray289[local35 * 2] * 4))) >> 15);
			}
			Static106.method1501(arg2, local33, local15.anInt2272, arg1.anIntArray361, arg1.anIntArray360);
			for (local47 = 0; local47 < local33.length / 2 - 1; local47++) {
				arg2.method5339(local33[local47 * 2], local33[local47 * 2 + 1], local33[(local47 + 1) * 2], local33[(local47 + 1) * 2 + 1], local15.anInt2265, arg5, arg3, arg0);
			}
			arg2.method5339(local33[local33.length - 2], local33[local33.length - 1], local33[0], local33[1], local15.anInt2265, arg5, arg3, arg0);
		}
		@Pc(268) Class51 local268 = null;
		if (local15.anInt2268 != -1) {
			local268 = local15.method1856(false, arg2);
			if (local268 != null) {
				Static159.method2374(arg1, arg4, local268, arg5, arg0, arg3, arg6);
			}
		}
		if (local15.aString22 == null) {
			return;
		}
		local35 = 0;
		if (local268 != null) {
			local35 = local268.method4681();
		}
		@Pc(301) Class137 local301 = Static227.aClass137_6;
		@Pc(303) Class110 local303 = Static302.aClass110_8;
		if (local15.anInt2266 == 1) {
			local301 = Static334.aClass137_7;
			local303 = Static75.aClass110_1;
		}
		if (local15.anInt2266 == 2) {
			local303 = Static102.aClass110_3;
			local301 = Static101.aClass137_2;
		}
		Static306.method4559(arg3, arg4, local15.aString22, local301, arg1, local303, arg6, arg5, local15.anInt2299, arg0, local35);
		return;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(III)V")
	public static void method628(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class161 local13 = Static364.aClass161ArrayArray3[arg0][arg1];
		if (local13 != null) {
			Static385.anInt6259 = local13.anInt3900;
			Static385.anInt6258 = local13.anInt3896;
			Static325.anInt5480 = local13.anInt3905;
		}
		Static261.method4026();
	}
}
