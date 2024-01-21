import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!PFTTLTVY")
public final class Class30 {

	@OriginalMember(owner = "client!PFTTLTVY", name = "b", descriptor = "Z")
	private static boolean aBoolean132;

	@OriginalMember(owner = "client!PFTTLTVY", name = "a", descriptor = "I")
	private static int anInt425 = 96;

	@OriginalMember(owner = "client!PFTTLTVY", name = "a", descriptor = "(IIII)I")
	public static int method331(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(7) int local7 = arg2 & 0x3;
			if (local7 == 0) {
				return arg1;
			} else if (local7 == 1) {
				return arg0;
			} else if (local7 == 2) {
				return 7 - arg1;
			} else {
				return 7 - arg0;
			}
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("38161, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 0 + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PFTTLTVY", name = "a", descriptor = "(IIZI)I")
	public static int method332(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
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
		} catch (@Pc(32) RuntimeException local32) {
			signlink.reporterror("74524, " + arg0 + ", " + arg1 + ", " + true + ", " + arg2 + ", " + local32.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PFTTLTVY", name = "a", descriptor = "(IIIIIBI)I")
	public static int method333(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte arg5, @OriginalArg(6) int arg6) {
		try {
			if ((arg0 & 0x1) == 1) {
				@Pc(6) int local6 = arg1;
				arg1 = arg3;
				arg3 = local6;
			}
			@Pc(14) int local14 = arg6 & 0x3;
			if (arg5 != 6) {
				aBoolean132 = !aBoolean132;
			}
			if (local14 == 0) {
				return arg4;
			} else if (local14 == 1) {
				return arg2;
			} else if (local14 == 2) {
				return 7 + 1 - arg4 - arg1;
			} else {
				return 7 + 1 - arg2 - arg3;
			}
		} catch (@Pc(52) RuntimeException local52) {
			signlink.reporterror("12898, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local52.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PFTTLTVY", name = "a", descriptor = "(ZIIIIII)I")
	public static int method334(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if ((arg2 & 0x1) == 1) {
				@Pc(6) int local6 = arg3;
				arg3 = arg5;
				arg5 = local6;
			}
			@Pc(14) int local14 = arg0 & 0x3;
			if (local14 == 0) {
				return arg1;
			} else if (local14 == 1) {
				return 7 + 1 - arg4 - arg3;
			} else if (local14 == 2) {
				return 7 + 1 - arg1 - arg5;
			} else {
				return arg4;
			}
		} catch (@Pc(47) RuntimeException local47) {
			signlink.reporterror("16113, " + true + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local47.toString());
			throw new RuntimeException();
		}
	}
}
