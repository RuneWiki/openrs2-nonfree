import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static510 {

	@OriginalMember(owner = "client!rb", name = "x", descriptor = "Lclient!tm;")
	public static final Class338 aClass338_126 = new Class338();

	@OriginalMember(owner = "client!rb", name = "y", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray3 = new boolean[][] { new boolean[13], { false, false, true, true, true, true, true, false, false, false, false, false, true }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { false, true, true, true, true, true, false, false, false, false, false, false, true }, { false, true, true, true, true, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, false, true, true, true, true, true, true, false, false, true, true, false }, { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true } };

	@OriginalMember(owner = "client!rb", name = "z", descriptor = "I")
	public static int anInt4841 = 0;

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(BILclient!or;I)V")
	public static void method4481(@OriginalArg(1) int arg0, @OriginalArg(2) Class260 arg1, @OriginalArg(3) int arg2) {
		if (Static624.aBoolean698) {
			@Pc(17) Class322 local17 = Static311.anInt5146 == -1 ? null : Static467.aClass367_1.method8812(Static311.anInt5146);
			if (Static79.method1526(arg1).method7065() && (Static173.anInt3449 & 0x20) != 0 && (local17 == null || arg1.method6243(local17.anInt9033, Static311.anInt5146) != local17.anInt9033)) {
				Static303.method4660(false, Static90.aString119, false, arg1.anInt6964, Static103.aString17 + " -> " + arg1.aString75, true, arg1.anInt6985, 8, (long) (arg1.anInt6985 << 0 | arg1.anInt6930), arg1.anInt6930, Static463.anInt7620, 0L);
			}
		}
		@Pc(84) String local84;
		for (@Pc(77) int local77 = 9; local77 >= 5; local77--) {
			local84 = Static214.method3726(arg1, local77);
			if (local84 != null) {
				Static303.method4660(false, local84, false, arg1.anInt6964, arg1.aString75, true, arg1.anInt6985, 1001, (long) (arg1.anInt6985 << 0 | arg1.anInt6930), arg1.anInt6930, Static217.method3757(arg1, local77), (long) (local77 + 1));
			}
		}
		local84 = Static301.method4631(arg1);
		if (local84 != null) {
			Static303.method4660(false, local84, false, arg1.anInt6964, arg1.aString75, true, arg1.anInt6985, 18, (long) (arg1.anInt6930 | arg1.anInt6985 << 0), arg1.anInt6930, arg1.anInt7010, 0L);
		}
		for (@Pc(170) int local170 = 4; local170 >= 0; local170--) {
			@Pc(177) String local177 = Static214.method3726(arg1, local170);
			if (local177 != null) {
				Static303.method4660(false, local177, false, arg1.anInt6964, arg1.aString75, true, arg1.anInt6985, 30, (long) (arg1.anInt6985 << 0 | arg1.anInt6930), arg1.anInt6930, Static217.method3757(arg1, local170), (long) (local170 + 1));
			}
		}
		if (!Static79.method1526(arg1).method7068()) {
			return;
		}
		if (arg1.aString71 == null) {
			Static303.method4660(false, Static601.aClass346_12.method8440(Static609.anInt9834), false, arg1.anInt6964, "", true, arg1.anInt6985, 19, (long) (arg1.anInt6930 | arg1.anInt6985 << 0), arg1.anInt6930, -1, 0L);
		} else {
			Static303.method4660(false, arg1.aString71, false, arg1.anInt6964, "", true, arg1.anInt6985, 19, (long) (arg1.anInt6930 | arg1.anInt6985 << 0), arg1.anInt6930, -1, 0L);
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(I)V")
	public static void method4482() {
		Static514.anInt8261 = -1;
		Static184.anInt3729 = 0;
		Static276.anInt4810 = -1;
		Static661.anInt10551 = -1;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(IIIIIIIII)Z")
	public static boolean method4484(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg4 < arg0 + arg2 && arg2 < arg6 + arg4) {
			return arg7 < arg1 + arg3 && arg1 < arg5 + arg7;
		} else {
			return false;
		}
	}
}
