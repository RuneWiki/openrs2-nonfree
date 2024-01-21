import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!UBZWFZFP")
public final class Class37 {

	@OriginalMember(owner = "client!UBZWFZFP", name = "a", descriptor = "I")
	private static int anInt608 = -4;

	@OriginalMember(owner = "client!UBZWFZFP", name = "a", descriptor = "(IIBI)I")
	public static int method431(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
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
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("50304, " + arg0 + ", " + arg1 + ", " + -27 + ", " + arg2 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UBZWFZFP", name = "a", descriptor = "(IIII)I")
	public static int method432(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(12) int local12 = arg0 & 0x3;
			if (local12 == 0) {
				return arg1;
			} else if (local12 == 1) {
				return 7 - arg2;
			} else if (local12 == 2) {
				return 7 - arg1;
			} else {
				return arg2;
			}
		} catch (@Pc(33) RuntimeException local33) {
			signlink.reporterror("37224, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -111 + ", " + local33.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UBZWFZFP", name = "a", descriptor = "(IIIIIII)I")
	public static int method433(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		try {
			if ((arg0 & 0x1) == 1) {
				@Pc(6) int local6 = arg1;
				arg1 = arg4;
				arg4 = local6;
			}
			@Pc(14) int local14 = arg2 & 0x3;
			if (local14 == 0) {
				return arg5;
			} else if (local14 == 1) {
				return arg3;
			} else if (local14 == 2) {
				return 7 + 1 - arg5 - arg1;
			} else {
				return 7 + 1 - arg3 - arg4;
			}
		} catch (@Pc(52) RuntimeException local52) {
			signlink.reporterror("57093, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + 0 + ", " + arg5 + ", " + local52.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UBZWFZFP", name = "b", descriptor = "(IIIIIII)I")
	public static int method434(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		try {
			if ((arg1 & 0x1) == 1) {
				@Pc(6) int local6 = arg4;
				arg4 = arg5;
				arg5 = local6;
			}
			@Pc(14) int local14 = arg0 & 0x3;
			while (arg3 >= 0) {
				anInt608 = -414;
			}
			if (local14 == 0) {
				return arg6;
			} else if (local14 == 1) {
				return 7 + 1 - arg2 - arg4;
			} else if (local14 == 2) {
				return 7 + 1 - arg6 - arg5;
			} else {
				return arg2;
			}
		} catch (@Pc(49) RuntimeException local49) {
			signlink.reporterror("81582, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local49.toString());
			throw new RuntimeException();
		}
	}
}
