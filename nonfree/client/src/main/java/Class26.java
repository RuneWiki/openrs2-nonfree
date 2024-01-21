import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!OWEOYNVX")
public final class Class26 {

	@OriginalMember(owner = "client!OWEOYNVX", name = "a", descriptor = "(IIII)I")
	public static int method263(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			@Pc(3) int local3 = arg2 & 0x3;
			@Pc(7) boolean local7 = false;
			if (local3 == 0) {
				return arg0;
			} else if (local3 == 1) {
				return arg3;
			} else if (local3 == 2) {
				return 7 - arg0;
			} else {
				return 7 - arg3;
			}
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("97433, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OWEOYNVX", name = "a", descriptor = "(IIZI)I")
	public static int method264(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(3) int local3 = arg1 & 0x3;
			if (local3 == 0) {
				return arg2;
			} else if (local3 == 1) {
				return 7 - arg0;
			} else if (local3 == 2) {
				return 7 - arg2;
			} else {
				return arg0;
			}
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("85264, " + arg0 + ", " + arg1 + ", " + false + ", " + arg2 + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OWEOYNVX", name = "a", descriptor = "(IIIIIII)I")
	public static int method265(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if ((arg3 & 0x1) == 1) {
				@Pc(15) int local15 = arg5;
				arg5 = arg1;
				arg1 = local15;
			}
			@Pc(23) int local23 = arg4 & 0x3;
			if (local23 == 0) {
				return arg0;
			} else if (local23 == 1) {
				return arg2;
			} else if (local23 == 2) {
				return 7 + 1 - arg0 - arg5;
			} else {
				return 7 + 1 - arg2 - arg1;
			}
		} catch (@Pc(52) RuntimeException local52) {
			signlink.reporterror("87347, " + arg0 + ", " + arg1 + ", " + 0 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local52.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OWEOYNVX", name = "a", descriptor = "(IIIIIZI)I")
	public static int method266(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		try {
			if ((arg4 & 0x1) == 1) {
				@Pc(10) int local10 = arg3;
				arg3 = arg0;
				arg0 = local10;
			}
			@Pc(18) int local18 = arg1 & 0x3;
			if (local18 == 0) {
				return arg5;
			} else if (local18 == 1) {
				return 7 + 1 - arg2 - arg3;
			} else if (local18 == 2) {
				return 7 + 1 - arg5 - arg0;
			} else {
				return arg2;
			}
		} catch (@Pc(47) RuntimeException local47) {
			signlink.reporterror("48428, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + true + ", " + arg5 + ", " + local47.toString());
			throw new RuntimeException();
		}
	}
}
