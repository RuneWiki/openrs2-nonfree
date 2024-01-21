import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!KTWDNTZZ")
public final class Class21 {

	@OriginalMember(owner = "client!KTWDNTZZ", name = "a", descriptor = "Z")
	private static boolean aBoolean76 = true;

	@OriginalMember(owner = "client!KTWDNTZZ", name = "a", descriptor = "(IIIB)I")
	public static int method249(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
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
		} catch (@Pc(34) RuntimeException local34) {
			signlink.reporterror("27535, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 9 + ", " + local34.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KTWDNTZZ", name = "a", descriptor = "(IIII)I")
	public static int method250(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(11) int local11 = arg1 & 0x3;
			if (local11 == 0) {
				return arg2;
			} else if (local11 == 1) {
				return 7 - arg0;
			} else if (local11 == 2) {
				return 7 - arg2;
			} else {
				return arg0;
			}
		} catch (@Pc(32) RuntimeException local32) {
			signlink.reporterror("52056, " + arg0 + ", " + 121 + ", " + arg1 + ", " + arg2 + ", " + local32.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KTWDNTZZ", name = "a", descriptor = "(IIIIIII)I")
	public static int method251(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if ((arg5 & 0x1) == 1) {
				@Pc(6) int local6 = arg4;
				arg4 = arg1;
				arg1 = local6;
			}
			@Pc(14) int local14 = arg3 & 0x3;
			if (local14 == 0) {
				return arg0;
			} else if (local14 == 1) {
				return arg2;
			} else if (local14 == 2) {
				return 7 + 1 - arg0 - arg4;
			} else {
				return 7 + 1 - arg2 - arg1;
			}
		} catch (@Pc(53) RuntimeException local53) {
			signlink.reporterror("95661, " + -18423 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local53.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KTWDNTZZ", name = "b", descriptor = "(IIIIIII)I")
	public static int method252(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if ((arg2 & 0x1) == 1) {
				@Pc(12) int local12 = arg5;
				arg5 = arg4;
				arg4 = local12;
			}
			@Pc(20) int local20 = arg0 & 0x3;
			if (local20 == 0) {
				return arg1;
			} else if (local20 == 1) {
				return 7 + 1 - arg3 - arg5;
			} else if (local20 == 2) {
				return 7 + 1 - arg1 - arg4;
			} else {
				return arg3;
			}
		} catch (@Pc(49) RuntimeException local49) {
			signlink.reporterror("64403, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + -447 + ", " + arg4 + ", " + arg5 + ", " + local49.toString());
			throw new RuntimeException();
		}
	}
}
