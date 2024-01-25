import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static80 {

	@OriginalMember(owner = "client!fb", name = "e", descriptor = "[I")
	public static final int[] anIntArray671 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

	@OriginalMember(owner = "client!fb", name = "i", descriptor = "Z")
	public static boolean aBoolean551 = false;

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(I[Ljava/lang/String;[SII)V")
	public static void method5798(@OriginalArg(1) String[] arg0, @OriginalArg(2) short[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg3 >= arg2) {
			return;
		}
		@Pc(15) int local15 = (arg3 + arg2) / 2;
		@Pc(17) int local17 = arg3;
		@Pc(21) String local21 = arg0[local15];
		arg0[local15] = arg0[arg2];
		arg0[arg2] = local21;
		@Pc(35) short local35 = arg1[local15];
		arg1[local15] = arg1[arg2];
		arg1[arg2] = local35;
		for (@Pc(47) int local47 = arg3; local47 < arg2; local47++) {
			if (local21 == null || arg0[local47] != null && arg0[local47].compareTo(local21) < (local47 & 0x1)) {
				@Pc(68) String local68 = arg0[local47];
				arg0[local47] = arg0[local17];
				arg0[local17] = local68;
				@Pc(82) short local82 = arg1[local47];
				arg1[local47] = arg1[local17];
				arg1[local17++] = local82;
			}
		}
		arg0[arg2] = arg0[local17];
		arg0[local17] = local21;
		arg1[arg2] = arg1[local17];
		arg1[local17] = local35;
		method5798(arg0, arg1, local17 - 1, arg3);
		method5798(arg0, arg1, arg2, local17 + 1);
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(CB)Z")
	public static boolean method5799(@OriginalArg(0) char arg0) {
		if (Character.isISOControl(arg0)) {
			return false;
		} else if (Static282.method2953(arg0)) {
			return true;
		} else {
			@Pc(18) char[] local18 = Static214.aCharArray4;
			for (@Pc(28) int local28 = 0; local28 < local18.length; local28++) {
				@Pc(34) char local34 = local18[local28];
				if (local34 == arg0) {
					return true;
				}
			}
			@Pc(54) char[] local54 = Static77.aCharArray2;
			for (@Pc(56) int local56 = 0; local56 < local54.length; local56++) {
				@Pc(62) char local62 = local54[local56];
				if (local62 == arg0) {
					return true;
				}
			}
			return false;
		}
	}
}
