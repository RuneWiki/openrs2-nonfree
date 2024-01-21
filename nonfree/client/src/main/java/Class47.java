import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!YPGIYMSL")
public final class Class47 {

	@OriginalMember(owner = "client!YPGIYMSL", name = "a", descriptor = "Z")
	private static boolean aBoolean187;

	@OriginalMember(owner = "client!YPGIYMSL", name = "a", descriptor = "(IZII)I")
	public static int method532(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			@Pc(3) int local3 = arg3 & 0x3;
			if (!arg1) {
				return 1;
			} else if (local3 == 0) {
				return arg0;
			} else if (local3 == 1) {
				return arg2;
			} else if (local3 == 2) {
				return 7 - arg0;
			} else {
				return 7 - arg2;
			}
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("51043, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YPGIYMSL", name = "b", descriptor = "(IZII)I")
	public static int method533(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			@Pc(3) int local3 = arg0 & 0x3;
			if (arg1) {
				return 0;
			} else if (local3 == 0) {
				return arg2;
			} else if (local3 == 1) {
				return 7 - arg3;
			} else if (local3 == 2) {
				return 7 - arg2;
			} else {
				return arg3;
			}
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("97602, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YPGIYMSL", name = "a", descriptor = "(IIIIIII)I")
	public static int method534(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if ((arg4 & 0x1) == 1) {
				@Pc(6) int local6 = arg1;
				arg1 = arg3;
				arg3 = local6;
			}
			@Pc(14) int local14 = arg2 & 0x3;
			if (local14 == 0) {
				return arg0;
			} else if (local14 == 1) {
				return arg5;
			} else if (local14 == 2) {
				return 7 - arg0 - (arg1 - 1);
			} else {
				return 7 - arg5 - (arg3 - 1);
			}
		} catch (@Pc(56) RuntimeException local56) {
			signlink.reporterror("67789, " + arg0 + ", " + arg1 + ", " + 9 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local56.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YPGIYMSL", name = "a", descriptor = "(IZIIIII)I")
	public static int method535(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		try {
			if (!arg1) {
				aBoolean187 = !aBoolean187;
			}
			if ((arg5 & 0x1) == 1) {
				@Pc(14) int local14 = arg6;
				arg6 = arg3;
				arg3 = local14;
			}
			@Pc(22) int local22 = arg0 & 0x3;
			if (local22 == 0) {
				return arg2;
			} else if (local22 == 1) {
				return 7 - arg4 - (arg6 - 1);
			} else if (local22 == 2) {
				return 7 - arg2 - (arg3 - 1);
			} else {
				return arg4;
			}
		} catch (@Pc(51) RuntimeException local51) {
			signlink.reporterror("7313, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local51.toString());
			throw new RuntimeException();
		}
	}
}
