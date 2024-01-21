import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!GSBGVYYO")
public final class Class14 {

	@OriginalMember(owner = "client!GSBGVYYO", name = "a", descriptor = "I")
	private static int anInt329 = 2;

	@OriginalMember(owner = "client!GSBGVYYO", name = "a", descriptor = "(IIII)I")
	public static int method147(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(11) int local11 = arg1 & 0x3;
			if (local11 == 0) {
				return arg0;
			} else if (local11 == 1) {
				return arg2;
			} else if (local11 == 2) {
				return 7 - arg0;
			} else {
				return 7 - arg2;
			}
		} catch (@Pc(32) RuntimeException local32) {
			signlink.reporterror("63716, " + arg0 + ", " + arg1 + ", " + 3 + ", " + arg2 + ", " + local32.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GSBGVYYO", name = "a", descriptor = "(IIZI)I")
	public static int method148(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(3) int local3 = arg2 & 0x3;
			if (local3 == 0) {
				return arg1;
			} else if (local3 == 1) {
				return 7 - arg0;
			} else if (local3 == 2) {
				return 7 - arg1;
			} else {
				return arg0;
			}
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("80989, " + arg0 + ", " + arg1 + ", " + false + ", " + arg2 + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GSBGVYYO", name = "a", descriptor = "(IIIIIII)I")
	public static int method149(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if ((arg1 & 0x1) == 1) {
				@Pc(10) int local10 = arg2;
				arg2 = arg5;
				arg5 = local10;
			}
			@Pc(18) int local18 = arg4 & 0x3;
			if (local18 == 0) {
				return arg3;
			} else if (local18 == 1) {
				return arg0;
			} else if (local18 == 2) {
				return 7 + 1 - arg3 - arg2;
			} else {
				return 7 + 1 - arg0 - arg5;
			}
		} catch (@Pc(47) RuntimeException local47) {
			signlink.reporterror("46909, " + arg0 + ", " + arg1 + ", " + -859 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local47.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GSBGVYYO", name = "b", descriptor = "(IIIIIII)I")
	public static int method150(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		try {
			if ((arg5 & 0x1) == 1) {
				@Pc(6) int local6 = arg0;
				arg0 = arg1;
				arg1 = local6;
			}
			@Pc(14) int local14 = arg4 & 0x3;
			if (local14 == 0) {
				return arg2;
			} else if (local14 == 1) {
				return 7 + 1 - arg3 - arg0;
			} else if (local14 == 2) {
				return 7 + 1 - arg2 - arg1;
			} else {
				return arg3;
			}
		} catch (@Pc(52) RuntimeException local52) {
			signlink.reporterror("92768, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + 0 + ", " + arg5 + ", " + local52.toString());
			throw new RuntimeException();
		}
	}
}
