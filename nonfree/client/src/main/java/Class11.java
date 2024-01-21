import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!GNGTCMOJ")
public final class Class11 {

	@OriginalMember(owner = "client!GNGTCMOJ", name = "a", descriptor = "I")
	private static int anInt102 = 8;

	@OriginalMember(owner = "client!GNGTCMOJ", name = "b", descriptor = "I")
	private static int anInt103 = 3;

	@OriginalMember(owner = "client!GNGTCMOJ", name = "a", descriptor = "(IIII)I")
	public static int method80(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(3) int local3 = arg1 & 0x3;
			if (local3 == 0) {
				return arg2;
			} else if (local3 == 1) {
				return arg0;
			} else if (local3 == 2) {
				return 7 - arg2;
			} else {
				return 7 - arg0;
			}
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("85967, " + arg0 + ", " + -195 + ", " + arg1 + ", " + arg2 + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GNGTCMOJ", name = "b", descriptor = "(IIII)I")
	public static int method81(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(3) int local3 = arg2 & 0x3;
			if (local3 == 0) {
				return arg0;
			} else if (local3 == 1) {
				return 7 - arg1;
			} else if (local3 == 2) {
				return 7 - arg0;
			} else {
				return arg1;
			}
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("90226, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 3 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GNGTCMOJ", name = "a", descriptor = "(IIIIIII)I")
	public static int method82(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		try {
			if ((arg1 & 0x1) == 1) {
				@Pc(6) int local6 = arg0;
				arg0 = arg2;
				arg2 = local6;
			}
			@Pc(14) int local14 = arg3 & 0x3;
			if (arg5 != anInt103) {
				return anInt103;
			} else if (local14 == 0) {
				return arg4;
			} else if (local14 == 1) {
				return arg6;
			} else if (local14 == 2) {
				return 7 + 1 - arg4 - arg0;
			} else {
				return 7 + 1 - arg6 - arg2;
			}
		} catch (@Pc(48) RuntimeException local48) {
			signlink.reporterror("26737, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local48.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GNGTCMOJ", name = "b", descriptor = "(IIIIIII)I")
	public static int method83(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		try {
			if ((arg0 & 0x1) == 1) {
				@Pc(6) int local6 = arg5;
				arg5 = arg1;
				arg1 = local6;
			}
			@Pc(14) int local14 = arg2 & 0x3;
			if (local14 == 0) {
				return arg4;
			} else if (local14 == 1) {
				return 7 + 1 - arg3 - arg5;
			} else if (local14 == 2) {
				return 7 + 1 - arg4 - arg1;
			} else {
				return arg3;
			}
		} catch (@Pc(52) RuntimeException local52) {
			signlink.reporterror("8383, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + -588 + ", " + local52.toString());
			throw new RuntimeException();
		}
	}
}
