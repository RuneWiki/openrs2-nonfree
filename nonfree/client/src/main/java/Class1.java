import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!AOGMWZWE")
public final class Class1 {

	@OriginalMember(owner = "client!AOGMWZWE", name = "a", descriptor = "I")
	private static int anInt1 = 1;

	@OriginalMember(owner = "client!AOGMWZWE", name = "a", descriptor = "(IIBI)I")
	public static int method1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
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
			signlink.reporterror("8273, " + arg0 + ", " + arg1 + ", " + -68 + ", " + arg2 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AOGMWZWE", name = "a", descriptor = "(IIII)I")
	public static int method2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			if (arg1 != -17707) {
				return anInt1;
			}
			@Pc(8) int local8 = arg0 & 0x3;
			if (local8 == 0) {
				return arg2;
			} else if (local8 == 1) {
				return 7 - arg3;
			} else if (local8 == 2) {
				return 7 - arg2;
			} else {
				return arg3;
			}
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("89215, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AOGMWZWE", name = "a", descriptor = "(IIIBIII)I")
	public static int method3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if ((arg3 & 0x1) == 1) {
				@Pc(6) int local6 = arg0;
				arg0 = arg2;
				arg2 = local6;
			}
			@Pc(14) int local14 = arg5 & 0x3;
			if (local14 == 0) {
				return arg4;
			} else if (local14 == 1) {
				return arg1;
			} else if (local14 == 2) {
				return 7 + 1 - arg4 - arg0;
			} else {
				return 7 + 1 - arg1 - arg2;
			}
		} catch (@Pc(48) RuntimeException local48) {
			signlink.reporterror("61540, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 101 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local48.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AOGMWZWE", name = "a", descriptor = "(IIZIIII)I")
	public static int method4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if ((arg0 & 0x1) == 1) {
				@Pc(10) int local10 = arg2;
				arg2 = arg5;
				arg5 = local10;
			}
			@Pc(18) int local18 = arg3 & 0x3;
			if (local18 == 0) {
				return arg1;
			} else if (local18 == 1) {
				return 7 + 1 - arg4 - arg2;
			} else if (local18 == 2) {
				return 7 + 1 - arg1 - arg5;
			} else {
				return arg4;
			}
		} catch (@Pc(47) RuntimeException local47) {
			signlink.reporterror("9887, " + arg0 + ", " + arg1 + ", " + true + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local47.toString());
			throw new RuntimeException();
		}
	}
}
