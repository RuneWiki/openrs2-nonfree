import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!MWBCSNDC")
public final class Class22 {

	@OriginalMember(owner = "client!MWBCSNDC", name = "a", descriptor = "I")
	private static int anInt449 = 1;

	@OriginalMember(owner = "client!MWBCSNDC", name = "a", descriptor = "(IIII)I")
	public static int method254(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(3) int local3 = arg2 & 0x3;
			if (local3 == 0) {
				return arg0;
			} else if (local3 == 1) {
				return arg1;
			} else if (local3 == 2) {
				return 7 - arg0;
			} else {
				return 7 - arg1;
			}
		} catch (@Pc(33) RuntimeException local33) {
			signlink.reporterror("65278, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 0 + ", " + local33.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MWBCSNDC", name = "b", descriptor = "(IIII)I")
	public static int method255(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(3) int local3 = arg1 & 0x3;
			if (anInt449 != 1) {
				return 1;
			} else if (local3 == 0) {
				return arg0;
			} else if (local3 == 1) {
				return 7 - arg2;
			} else if (local3 == 2) {
				return 7 - arg0;
			} else {
				return arg2;
			}
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("53828, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 1 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MWBCSNDC", name = "a", descriptor = "(IIZIIII)I")
	public static int method256(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if ((arg4 & 0x1) == 1) {
				@Pc(6) int local6 = arg1;
				arg1 = arg3;
				arg3 = local6;
			}
			@Pc(14) int local14 = arg2 & 0x3;
			if (local14 == 0) {
				return arg5;
			} else if (local14 == 1) {
				return arg0;
			} else if (local14 == 2) {
				return 7 + 1 - arg5 - arg1;
			} else {
				return 7 + 1 - arg0 - arg3;
			}
		} catch (@Pc(47) RuntimeException local47) {
			signlink.reporterror("71627, " + arg0 + ", " + arg1 + ", " + true + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local47.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MWBCSNDC", name = "a", descriptor = "(IIBIIII)I")
	public static int method257(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		try {
			@Pc(6) boolean local6 = false;
			if ((arg4 & 0x1) == 1) {
				@Pc(22) int local22 = arg0;
				arg0 = arg6;
				arg6 = local22;
			}
			@Pc(30) int local30 = arg3 & 0x3;
			if (local30 == 0) {
				return arg5;
			} else if (local30 == 1) {
				return 7 + 1 - arg1 - arg0;
			} else if (local30 == 2) {
				return 7 + 1 - arg5 - arg6;
			} else {
				return arg1;
			}
		} catch (@Pc(59) RuntimeException local59) {
			signlink.reporterror("33224, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local59.toString());
			throw new RuntimeException();
		}
	}
}
