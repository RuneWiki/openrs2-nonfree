import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!CDEJWOSB")
public final class Class5 {

	@OriginalMember(owner = "client!CDEJWOSB", name = "a", descriptor = "I")
	private static int anInt22 = -12499;

	@OriginalMember(owner = "client!CDEJWOSB", name = "b", descriptor = "I")
	private static int anInt23 = -192;

	@OriginalMember(owner = "client!CDEJWOSB", name = "a", descriptor = "(IIIZ)I")
	public static int method25(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(3) int local3 = arg0 & 0x3;
			if (local3 == 0) {
				return arg2;
			} else if (local3 == 1) {
				return arg1;
			} else if (local3 == 2) {
				return 7 - arg2;
			} else {
				return 7 - arg1;
			}
		} catch (@Pc(33) RuntimeException local33) {
			signlink.reporterror("92720, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + false + ", " + local33.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CDEJWOSB", name = "a", descriptor = "(IIII)I")
	public static int method26(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(7) int local7 = arg1 & 0x3;
			if (local7 == 0) {
				return arg0;
			} else if (local7 == 1) {
				return 7 - arg2;
			} else if (local7 == 2) {
				return 7 - arg0;
			} else {
				return arg2;
			}
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("51053, " + arg0 + ", " + arg1 + ", " + -383 + ", " + arg2 + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CDEJWOSB", name = "a", descriptor = "(IIIBII)I")
	public static int method27(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(8) int local8 = arg0 & 0x3;
			if (local8 == 0) {
				return arg2;
			} else if (local8 == 1) {
				return arg3;
			} else if (local8 == 2) {
				return 7 + 1 - arg2 - arg4;
			} else {
				return 7 + 1 - arg3 - arg1;
			}
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("92592, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 113 + ", " + arg3 + ", " + arg4 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CDEJWOSB", name = "a", descriptor = "(IIIIII)I")
	public static int method28(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(3) int local3 = arg2 & 0x3;
			if (local3 == 0) {
				return arg0;
			} else if (local3 == 1) {
				return 7 + 1 - arg4 - arg3;
			} else if (local3 == 2) {
				return 7 + 1 - arg0 - arg1;
			} else {
				return arg4;
			}
		} catch (@Pc(36) RuntimeException local36) {
			signlink.reporterror("62488, " + -433 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local36.toString());
			throw new RuntimeException();
		}
	}
}
