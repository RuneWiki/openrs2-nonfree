import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!RKBCLNKC")
public final class Class35 {

	@OriginalMember(owner = "client!RKBCLNKC", name = "a", descriptor = "I")
	private static int anInt555;

	@OriginalMember(owner = "client!RKBCLNKC", name = "c", descriptor = "Z")
	private static boolean aBoolean138;

	static {
		aBoolean137 = true;
		aBoolean138 = true;
	}

	@OriginalMember(owner = "client!RKBCLNKC", name = "a", descriptor = "(BIII)I")
	public static int method391(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			@Pc(4) boolean local4 = false;
			@Pc(12) int local12 = arg1 & 0x3;
			if (local12 == 0) {
				return arg2;
			} else if (local12 == 1) {
				return arg3;
			} else if (local12 == 2) {
				return 7 - arg2;
			} else {
				return 7 - arg3;
			}
		} catch (@Pc(33) RuntimeException local33) {
			signlink.reporterror("41348, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local33.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RKBCLNKC", name = "a", descriptor = "(IIIB)I")
	public static int method392(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		try {
			@Pc(4) boolean local4 = false;
			@Pc(16) int local16 = arg2 & 0x3;
			if (local16 == 0) {
				return arg0;
			} else if (local16 == 1) {
				return 7 - arg1;
			} else if (local16 == 2) {
				return 7 - arg0;
			} else {
				return arg1;
			}
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("86268, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RKBCLNKC", name = "a", descriptor = "(IIIIBII)I")
	public static int method393(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if ((arg2 & 0x1) == 1) {
				@Pc(15) int local15 = arg4;
				arg4 = arg1;
				arg1 = local15;
			}
			@Pc(23) int local23 = arg0 & 0x3;
			if (local23 == 0) {
				return arg3;
			} else if (local23 == 1) {
				return arg5;
			} else if (local23 == 2) {
				return 7 + 1 - arg3 - arg4;
			} else {
				return 7 + 1 - arg5 - arg1;
			}
		} catch (@Pc(52) RuntimeException local52) {
			signlink.reporterror("79364, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + -117 + ", " + arg4 + ", " + arg5 + ", " + local52.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RKBCLNKC", name = "a", descriptor = "(IIIIIII)I")
	public static int method394(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if ((arg5 & 0x1) == 1) {
				@Pc(10) int local10 = arg0;
				arg0 = arg4;
				arg4 = local10;
			}
			@Pc(18) int local18 = arg1 & 0x3;
			if (local18 == 0) {
				return arg3;
			} else if (local18 == 1) {
				return 7 + 1 - arg2 - arg0;
			} else if (local18 == 2) {
				return 7 + 1 - arg3 - arg4;
			} else {
				return arg2;
			}
		} catch (@Pc(47) RuntimeException local47) {
			signlink.reporterror("1668, " + arg0 + ", " + arg1 + ", " + 671 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local47.toString());
			throw new RuntimeException();
		}
	}
}
