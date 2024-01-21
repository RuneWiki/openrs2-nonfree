import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static60 {

	@OriginalMember(owner = "client!k", name = "Hb", descriptor = "I")
	public static int anInt1447;

	@OriginalMember(owner = "client!k", name = "ub", descriptor = "Lclient!af;")
	private static Class5 aClass5_756 = Static45.method1937("Enter your username (V password)3");

	@OriginalMember(owner = "client!k", name = "wb", descriptor = "Lclient!af;")
	public static Class5 aClass5_757 = Static45.method1937("Benutzeroberfl-=che geladen)3");

	@OriginalMember(owner = "client!k", name = "xb", descriptor = "I")
	public static int anInt1441 = 1;

	@OriginalMember(owner = "client!k", name = "Bb", descriptor = "Lclient!af;")
	public static Class5 aClass5_758 = Static45.method1937("oder ung-Ultiges Passwort)3");

	@OriginalMember(owner = "client!k", name = "Cb", descriptor = "Z")
	public static boolean aBoolean41 = false;

	@OriginalMember(owner = "client!k", name = "Gb", descriptor = "Lclient!af;")
	private static Class5 aClass5_759 = Static45.method1937(" has logged in)3");

	@OriginalMember(owner = "client!k", name = "Kb", descriptor = "Lclient!af;")
	public static Class5 aClass5_760 = aClass5_756;

	@OriginalMember(owner = "client!k", name = "Ob", descriptor = "Lclient!af;")
	private static Class5 aClass5_764 = Static45.method1937("Your account is already logged in)3");

	@OriginalMember(owner = "client!k", name = "Lb", descriptor = "Lclient!af;")
	public static Class5 aClass5_761 = aClass5_764;

	@OriginalMember(owner = "client!k", name = "Mb", descriptor = "Lclient!af;")
	private static Class5 aClass5_762 = Static45.method1937("Press (Wrecover a locked account(W on front page)3");

	@OriginalMember(owner = "client!k", name = "Nb", descriptor = "Lclient!af;")
	public static Class5 aClass5_763 = aClass5_762;

	@OriginalMember(owner = "client!k", name = "Pb", descriptor = "Lclient!af;")
	public static Class5 aClass5_765 = aClass5_759;

	@OriginalMember(owner = "client!k", name = "a", descriptor = "([Lclient!bf;[I[IIII)V")
	public static void method1088(@OriginalArg(0) Class9[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg3 >= arg4) {
			return;
		}
		@Pc(17) int local17 = arg3 - 1;
		@Pc(21) int local21 = arg4 + 1;
		@Pc(28) int local28 = (arg3 + arg4) / 2;
		@Pc(32) Class9 local32 = arg0[local28];
		arg0[local28] = arg0[arg3];
		arg0[arg3] = local32;
		while (local21 > local17) {
			@Pc(46) boolean local46 = true;
			@Pc(49) int local49;
			@Pc(86) int local86;
			@Pc(77) int local77;
			do {
				local21--;
				for (local49 = 0; local49 < 4; local49++) {
					if (arg2[local49] == 2) {
						local77 = local32.anInt344;
						local86 = arg0[local21].anInt344;
					} else if (arg2[local49] == 1) {
						local77 = local32.anInt343;
						local86 = arg0[local21].anInt343;
						if (local86 == -1 && arg1[local49] == 1) {
							local86 = 2001;
						}
						if (local77 == -1 && arg1[local49] == 1) {
							local77 = 2001;
						}
					} else if (arg2[local49] == 3) {
						local77 = local32.aBoolean7 ? 1 : 0;
						local86 = arg0[local21].aBoolean7 ? 1 : 0;
					} else {
						local86 = arg0[local21].anInt346;
						local77 = local32.anInt346;
					}
					if (local86 != local77) {
						if ((arg1[local49] != 1 || local86 <= local77) && (arg1[local49] != 0 || local77 <= local86)) {
							local46 = false;
						}
						break;
					}
					if (local49 == 3) {
						local46 = false;
					}
				}
			} while (local46);
			local46 = true;
			do {
				local17++;
				for (local49 = 0; local49 < 4; local49++) {
					if (arg2[local49] == 2) {
						local77 = local32.anInt344;
						local86 = arg0[local17].anInt344;
					} else if (arg2[local49] == 1) {
						local77 = local32.anInt343;
						local86 = arg0[local17].anInt343;
						if (local77 == -1 && arg1[local49] == 1) {
							local77 = 2001;
						}
						if (local86 == -1 && arg1[local49] == 1) {
							local86 = 2001;
						}
					} else if (arg2[local49] == 3) {
						local86 = arg0[local17].aBoolean7 ? 1 : 0;
						local77 = local32.aBoolean7 ? 1 : 0;
					} else {
						local86 = arg0[local17].anInt346;
						local77 = local32.anInt346;
					}
					if (local77 != local86) {
						if ((arg1[local49] != 1 || local77 <= local86) && (arg1[local49] != 0 || local77 >= local86)) {
							local46 = false;
						}
						break;
					}
					if (local49 == 3) {
						local46 = false;
					}
				}
			} while (local46);
			if (local21 > local17) {
				@Pc(341) Class9 local341 = arg0[local17];
				arg0[local17] = arg0[local21];
				arg0[local21] = local341;
			}
		}
		method1088(arg0, arg1, arg2, arg3, local21);
		method1088(arg0, arg1, arg2, local21 + 1, arg4);
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(III)I")
	public static int method1089(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14 = arg1 + arg0 * 57;
		@Pc(20) int local20 = local14 ^ local14 << 13;
		@Pc(34) int local34 = (local20 * local20 * 15731 + 789221) * local20 + 1376312589 & Integer.MAX_VALUE;
		return local34 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!k", name = "e", descriptor = "(I)V")
	public static void method1091() {
		aClass5_765 = null;
		aClass5_758 = null;
		aClass5_761 = null;
		aClass5_756 = null;
		aClass5_757 = null;
		aClass5_763 = null;
		aClass5_764 = null;
		aClass5_762 = null;
		aClass5_759 = null;
		aClass5_760 = null;
	}
}
