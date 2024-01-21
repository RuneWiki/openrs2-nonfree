import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!EPLYBIIS")
public final class Class14 {

	@OriginalMember(owner = "client!EPLYBIIS", name = "a", descriptor = "Z")
	private static boolean aBoolean66;

	@OriginalMember(owner = "client!EPLYBIIS", name = "b", descriptor = "Z")
	private static boolean aBoolean67 = true;

	@OriginalMember(owner = "client!EPLYBIIS", name = "a", descriptor = "(IIBI)I")
	public static int method84(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
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
			signlink.reporterror("14726, " + arg0 + ", " + arg1 + ", " + -57 + ", " + arg2 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EPLYBIIS", name = "a", descriptor = "(IIZI)I")
	public static int method85(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
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
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("14140, " + arg0 + ", " + arg1 + ", " + true + ", " + arg2 + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EPLYBIIS", name = "a", descriptor = "(IIIIIII)I")
	public static int method86(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if ((arg2 & 0x1) == 1) {
				@Pc(14) int local14 = arg5;
				arg5 = arg1;
				arg1 = local14;
			}
			@Pc(22) int local22 = arg4 & 0x3;
			if (local22 == 0) {
				return arg0;
			} else if (local22 == 1) {
				return arg3;
			} else if (local22 == 2) {
				return 7 + 1 - arg0 - arg5;
			} else {
				return 7 + 1 - arg3 - arg1;
			}
		} catch (@Pc(51) RuntimeException local51) {
			signlink.reporterror("94788, " + 0 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local51.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EPLYBIIS", name = "b", descriptor = "(IIIIIII)I")
	public static int method87(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		try {
			if (arg6 != 0) {
				aBoolean67 = !aBoolean67;
			}
			if ((arg5 & 0x1) == 1) {
				@Pc(14) int local14 = arg4;
				arg4 = arg0;
				arg0 = local14;
			}
			@Pc(22) int local22 = arg3 & 0x3;
			if (local22 == 0) {
				return arg2;
			} else if (local22 == 1) {
				return 7 + 1 - arg1 - arg4;
			} else if (local22 == 2) {
				return 7 + 1 - arg2 - arg0;
			} else {
				return arg1;
			}
		} catch (@Pc(51) RuntimeException local51) {
			signlink.reporterror("50734, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local51.toString());
			throw new RuntimeException();
		}
	}
}
