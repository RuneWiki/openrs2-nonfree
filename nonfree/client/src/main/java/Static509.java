import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static509 {

	@OriginalMember(owner = "client!sb", name = "j", descriptor = "Lclient!vfa;")
	public static Class357 aClass357_9 = null;

	@OriginalMember(owner = "client!sb", name = "k", descriptor = "Lclient!mha;")
	public static final Class228 aClass228_9 = new Class228(1, 2);

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(DZ)V")
	public static void method7364(@OriginalArg(0) double arg0) {
		if (Static366.aDouble20 == arg0) {
			return;
		}
		for (@Pc(7) int local7 = 0; local7 < 256; local7++) {
			@Pc(19) int local19 = (int) (Math.pow((double) local7 / 255.0D, arg0) * 255.0D);
			Static75.anIntArray101[local7] = local19 <= 255 ? local19 : 255;
		}
		Static366.aDouble20 = arg0;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(BZZII)I")
	public static int method7366(@OriginalArg(1) boolean arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2) {
		@Pc(15) Class5_Sub37 local15 = Static498.method7299(false, arg1);
		if (local15 == null) {
			return 0;
		}
		@Pc(21) int local21 = 0;
		for (@Pc(23) int local23 = 0; local23 < local15.anIntArray552.length; local23++) {
			if (local15.anIntArray552[local23] >= 0 && local15.anIntArray552[local23] < Static479.aClass348_1.anInt9563) {
				@Pc(45) Class329 local45 = Static479.aClass348_1.method8197(local15.anIntArray552[local23]);
				@Pc(55) int local55 = local45.method7763(Static246.aClass258_1.method6202(arg2).anInt6315, arg2);
				if (arg0) {
					local21 += local15.anIntArray553[local23] * local55;
				} else {
					local21 += local55;
				}
			}
		}
		return local21;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(IB)Z")
	public static boolean method7367(@OriginalArg(0) int arg0) {
		return arg0 == 3 || arg0 == 7 || arg0 == 10;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lclient!fb;Z)Z")
	public static boolean method7368(@OriginalArg(0) Class14_Sub1_Sub1 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(6) boolean local6 = Static299.aClass40Array1 == Static327.aClass40Array2;
		@Pc(8) int local8 = 0;
		@Pc(10) short local10 = 0;
		@Pc(12) byte local12 = 0;
		arg0.method4226();
		if (arg0.aShort74 < 0 || arg0.aShort71 < 0 || arg0.aShort73 >= Static129.anInt6336 || arg0.aShort72 >= Static150.anInt2400) {
			return false;
		}
		@Pc(33) short local33 = 0;
		@Pc(40) int local40;
		for (@Pc(36) int local36 = arg0.aShort74; local36 <= arg0.aShort73; local36++) {
			for (local40 = arg0.aShort71; local40 <= arg0.aShort72; local40++) {
				@Pc(47) Class156 local47 = Static503.method3567(arg0.aByte125, local36, local40);
				if (local47 != null) {
					@Pc(53) Class66 local53 = Static278.method4174(arg0);
					@Pc(56) Class66 local56 = local47.aClass66_2;
					if (local56 == null) {
						local47.aClass66_2 = local53;
					} else {
						while (local56.aClass66_1 != null) {
							local56 = local56.aClass66_1;
						}
						local56.aClass66_1 = local53;
					}
					if (local6 && (Static413.anIntArrayArray37[local36][local40] & 0xFF000000) != 0) {
						local8 = Static413.anIntArrayArray37[local36][local40];
						local10 = Static402.aShortArrayArray19[local36][local40];
						local12 = Static423.aByteArrayArray17[local36][local40];
					}
					if (!arg1 && local47.aClass14_Sub1_Sub5_1 != null && local47.aClass14_Sub1_Sub5_1.aShort102 > local33) {
						local33 = local47.aClass14_Sub1_Sub5_1.aShort102;
					}
				}
			}
		}
		if (local6 && (local8 & 0xFF000000) != 0) {
			for (local40 = arg0.aShort74; local40 <= arg0.aShort73; local40++) {
				for (@Pc(136) int local136 = arg0.aShort71; local136 <= arg0.aShort72; local136++) {
					if ((Static413.anIntArrayArray37[local40][local136] & 0xFF000000) == 0) {
						Static413.anIntArrayArray37[local40][local136] = local8;
						Static402.aShortArrayArray19[local40][local136] = local10;
						Static423.aByteArrayArray17[local40][local136] = local12;
					}
				}
			}
		}
		if (arg1) {
			Static53.aClass14_Sub1_Sub1Array1[Static594.anInt9723++] = arg0;
		} else {
			local40 = Static299.aClass40Array1 == Static327.aClass40Array2 ? 1 : 0;
			if (!arg0.method7998()) {
				arg0.aClass14_Sub1_22 = Static469.aClass14_Sub1Array5[local40];
				Static469.aClass14_Sub1Array5[local40] = arg0;
			} else if (arg0.method7987()) {
				arg0.aClass14_Sub1_22 = Static151.aClass14_Sub1Array1[local40];
				Static151.aClass14_Sub1Array1[local40] = arg0;
			} else {
				arg0.aClass14_Sub1_22 = Static250.aClass14_Sub1Array2[local40];
				Static250.aClass14_Sub1Array2[local40] = arg0;
				Static367.aBoolean541 = true;
			}
		}
		if (arg1) {
			arg0.anInt9321 -= local33;
		}
		return true;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(III)Z")
	public static boolean method7369(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 >= 1000 && arg0 < 1000) {
			return true;
		} else if (arg1 >= 1000 || arg0 >= 1000) {
			return arg1 >= 1000 && arg0 >= 1000;
		} else if (Static134.method1997(arg0)) {
			return true;
		} else {
			return !Static134.method1997(arg1);
		}
	}
}
