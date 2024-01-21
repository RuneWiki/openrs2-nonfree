import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!QMJXCCWI")
public final class Class28 {

	@OriginalMember(owner = "client!QMJXCCWI", name = "a", descriptor = "Z")
	private static boolean aBoolean120;

	@OriginalMember(owner = "client!QMJXCCWI", name = "a", descriptor = "(IZII)I")
	public static int method373(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(11) int local11 = arg1 & 0x3;
			if (local11 == 0) {
				return arg0;
			} else if (local11 == 1) {
				return arg2;
			} else if (local11 == 2) {
				return 7 - arg0;
			} else {
				return 7 - arg2;
			}
		} catch (@Pc(32) RuntimeException local32) {
			signlink.reporterror("30289, " + arg0 + ", " + true + ", " + arg1 + ", " + arg2 + ", " + local32.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QMJXCCWI", name = "a", descriptor = "(IIII)I")
	public static int method374(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(13) int local13 = arg0 & 0x3;
			if (local13 == 0) {
				return arg1;
			} else if (local13 == 1) {
				return 7 - arg2;
			} else if (local13 == 2) {
				return 7 - arg1;
			} else {
				return arg2;
			}
		} catch (@Pc(34) RuntimeException local34) {
			signlink.reporterror("56089, " + arg0 + ", " + -3564 + ", " + arg1 + ", " + arg2 + ", " + local34.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QMJXCCWI", name = "a", descriptor = "(IIIIIII)I")
	public static int method375(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		try {
			if ((arg5 & 0x1) == 1) {
				@Pc(15) int local15 = arg3;
				arg3 = arg2;
				arg2 = local15;
			}
			@Pc(23) int local23 = arg0 & 0x3;
			if (local23 == 0) {
				return arg1;
			} else if (local23 == 1) {
				return arg4;
			} else if (local23 == 2) {
				return 7 + 1 - arg1 - arg3;
			} else {
				return 7 + 1 - arg4 - arg2;
			}
		} catch (@Pc(52) RuntimeException local52) {
			signlink.reporterror("68638, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + 30 + ", " + local52.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QMJXCCWI", name = "b", descriptor = "(IIIIIII)I")
	public static int method376(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if ((arg3 & 0x1) == 1) {
				@Pc(15) int local15 = arg0;
				arg0 = arg5;
				arg5 = local15;
			}
			@Pc(23) int local23 = arg2 & 0x3;
			if (local23 == 0) {
				return arg4;
			} else if (local23 == 1) {
				return 7 + 1 - arg1 - arg0;
			} else if (local23 == 2) {
				return 7 + 1 - arg4 - arg5;
			} else {
				return arg1;
			}
		} catch (@Pc(52) RuntimeException local52) {
			signlink.reporterror("2821, " + 773 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local52.toString());
			throw new RuntimeException();
		}
	}
}
