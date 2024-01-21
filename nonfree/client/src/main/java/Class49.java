import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!XGXKDVNG")
public final class Class49 {

	@OriginalMember(owner = "client!XGXKDVNG", name = "a", descriptor = "I")
	private static int anInt760 = -13325;

	@OriginalMember(owner = "client!XGXKDVNG", name = "b", descriptor = "Z")
	private static boolean aBoolean177 = true;

	@OriginalMember(owner = "client!XGXKDVNG", name = "a", descriptor = "(IIII)I")
	public static int method542(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(11) int local11 = arg2 & 0x3;
			if (local11 == 0) {
				return arg1;
			} else if (local11 == 1) {
				return arg0;
			} else if (local11 == 2) {
				return 7 - arg1;
			} else {
				return 7 - arg0;
			}
		} catch (@Pc(32) RuntimeException local32) {
			signlink.reporterror("59606, " + arg0 + ", " + 0 + ", " + arg1 + ", " + arg2 + ", " + local32.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XGXKDVNG", name = "b", descriptor = "(IIII)I")
	public static int method543(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(11) int local11 = arg1 & 0x3;
			if (local11 == 0) {
				return arg0;
			} else if (local11 == 1) {
				return 7 - arg2;
			} else if (local11 == 2) {
				return 7 - arg0;
			} else {
				return arg2;
			}
		} catch (@Pc(32) RuntimeException local32) {
			signlink.reporterror("29874, " + arg0 + ", " + 7 + ", " + arg1 + ", " + arg2 + ", " + local32.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XGXKDVNG", name = "a", descriptor = "(IIIIIII)I")
	public static int method544(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		try {
			@Pc(3) boolean local3 = false;
			if ((arg6 & 0x1) == 1) {
				@Pc(10) int local10 = arg0;
				arg0 = arg5;
				arg5 = local10;
			}
			@Pc(18) int local18 = arg2 & 0x3;
			if (local18 == 0) {
				return arg4;
			} else if (local18 == 1) {
				return arg1;
			} else if (local18 == 2) {
				return 7 + 1 - arg4 - arg0;
			} else {
				return 7 + 1 - arg1 - arg5;
			}
		} catch (@Pc(47) RuntimeException local47) {
			signlink.reporterror("80833, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local47.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XGXKDVNG", name = "a", descriptor = "(IIIIIZI)I")
	public static int method545(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		try {
			if ((arg2 & 0x1) == 1) {
				@Pc(10) int local10 = arg5;
				arg5 = arg4;
				arg4 = local10;
			}
			@Pc(18) int local18 = arg3 & 0x3;
			if (local18 == 0) {
				return arg1;
			} else if (local18 == 1) {
				return 7 + 1 - arg0 - arg5;
			} else if (local18 == 2) {
				return 7 + 1 - arg1 - arg4;
			} else {
				return arg0;
			}
		} catch (@Pc(47) RuntimeException local47) {
			signlink.reporterror("48745, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + false + ", " + arg5 + ", " + local47.toString());
			throw new RuntimeException();
		}
	}
}
