import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!EWLSABLL")
public final class Class6 {

	@OriginalMember(owner = "client!EWLSABLL", name = "b", descriptor = "Z")
	private static boolean aBoolean39;

	@OriginalMember(owner = "client!EWLSABLL", name = "a", descriptor = "I")
	private static int anInt83 = -25061;

	@OriginalMember(owner = "client!EWLSABLL", name = "a", descriptor = "(IIII)I")
	public static int method81(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			@Pc(3) int local3 = arg3 & 0x3;
			@Pc(7) boolean local7 = false;
			if (local3 == 0) {
				return arg0;
			} else if (local3 == 1) {
				return arg2;
			} else if (local3 == 2) {
				return 7 - arg0;
			} else {
				return 7 - arg2;
			}
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("97961, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EWLSABLL", name = "a", descriptor = "(IIZI)I")
	public static int method82(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(3) int local3 = arg0 & 0x3;
			if (local3 == 0) {
				return arg1;
			} else if (local3 == 1) {
				return 7 - arg2;
			} else if (local3 == 2) {
				return 7 - arg1;
			} else {
				return arg2;
			}
		} catch (@Pc(33) RuntimeException local33) {
			signlink.reporterror("15388, " + arg0 + ", " + arg1 + ", " + true + ", " + arg2 + ", " + local33.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EWLSABLL", name = "a", descriptor = "(IIIIIII)I")
	public static int method83(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		try {
			if ((arg3 & 0x1) == 1) {
				@Pc(6) int local6 = arg2;
				arg2 = arg0;
				arg0 = local6;
			}
			@Pc(14) int local14 = arg5 & 0x3;
			if (local14 == 0) {
				return arg1;
			} else if (local14 == 1) {
				return arg4;
			} else if (local14 == 2) {
				return 7 + 1 - arg1 - arg2;
			} else {
				return 7 + 1 - arg4 - arg0;
			}
		} catch (@Pc(48) RuntimeException local48) {
			signlink.reporterror("61230, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + -40762 + ", " + local48.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EWLSABLL", name = "b", descriptor = "(IIIIIII)I")
	public static int method84(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if ((arg0 & 0x1) == 1) {
				@Pc(14) int local14 = arg5;
				arg5 = arg1;
				arg1 = local14;
			}
			@Pc(22) int local22 = arg4 & 0x3;
			if (local22 == 0) {
				return arg3;
			} else if (local22 == 1) {
				return 7 + 1 - arg2 - arg5;
			} else if (local22 == 2) {
				return 7 + 1 - arg3 - arg1;
			} else {
				return arg2;
			}
		} catch (@Pc(51) RuntimeException local51) {
			signlink.reporterror("3846, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 0 + ", " + arg4 + ", " + arg5 + ", " + local51.toString());
			throw new RuntimeException();
		}
	}
}
