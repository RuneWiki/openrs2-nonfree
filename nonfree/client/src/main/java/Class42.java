import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!VBKBPIQQ")
public final class Class42 {

	@OriginalMember(owner = "client!VBKBPIQQ", name = "a", descriptor = "I")
	private static int anInt720 = 313;

	@OriginalMember(owner = "client!VBKBPIQQ", name = "a", descriptor = "(IIII)I")
	public static int method505(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(8) int local8 = arg2 & 0x3;
			if (local8 == 0) {
				return arg0;
			} else if (local8 == 1) {
				return arg1;
			} else if (local8 == 2) {
				return 7 - arg0;
			} else {
				return 7 - arg1;
			}
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("71092, " + 13489 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VBKBPIQQ", name = "b", descriptor = "(IIII)I")
	public static int method506(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(7) int local7 = arg0 & 0x3;
			if (local7 == 0) {
				return arg2;
			} else if (local7 == 1) {
				return 7 - arg1;
			} else if (local7 == 2) {
				return 7 - arg2;
			} else {
				return arg1;
			}
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("73879, " + arg0 + ", " + -211 + ", " + arg1 + ", " + arg2 + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VBKBPIQQ", name = "a", descriptor = "(IIIIIZI)I")
	public static int method507(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		try {
			if ((arg3 & 0x1) == 1) {
				@Pc(10) int local10 = arg0;
				arg0 = arg4;
				arg4 = local10;
			}
			@Pc(18) int local18 = arg5 & 0x3;
			if (local18 == 0) {
				return arg1;
			} else if (local18 == 1) {
				return arg2;
			} else if (local18 == 2) {
				return 7 + 1 - arg1 - arg0;
			} else {
				return 7 + 1 - arg2 - arg4;
			}
		} catch (@Pc(47) RuntimeException local47) {
			signlink.reporterror("19768, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + true + ", " + arg5 + ", " + local47.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VBKBPIQQ", name = "a", descriptor = "(IIIIIII)I")
	public static int method508(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		try {
			if ((arg1 & 0x1) == 1) {
				@Pc(6) int local6 = arg3;
				arg3 = arg5;
				arg5 = local6;
			}
			@Pc(14) int local14 = arg4 & 0x3;
			if (local14 == 0) {
				return arg0;
			} else if (local14 == 1) {
				return 7 + 1 - arg2 - arg3;
			} else if (local14 == 2) {
				return 7 + 1 - arg0 - arg5;
			} else {
				return arg2;
			}
		} catch (@Pc(47) RuntimeException local47) {
			signlink.reporterror("37777, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + -881 + ", " + arg5 + ", " + local47.toString());
			throw new RuntimeException();
		}
	}
}
