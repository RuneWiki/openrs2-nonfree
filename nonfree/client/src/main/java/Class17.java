import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!GYWJXMKQ")
public final class Class17 {

	@OriginalMember(owner = "client!GYWJXMKQ", name = "a", descriptor = "I")
	private static int anInt258 = 19;

	@OriginalMember(owner = "client!GYWJXMKQ", name = "b", descriptor = "I")
	private static int anInt259 = 104;

	@OriginalMember(owner = "client!GYWJXMKQ", name = "c", descriptor = "I")
	private static int anInt260 = -76;

	@OriginalMember(owner = "client!GYWJXMKQ", name = "d", descriptor = "I")
	private static int anInt261 = -47865;

	@OriginalMember(owner = "client!GYWJXMKQ", name = "a", descriptor = "(IIII)I")
	public static int method202(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
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
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("74124, " + arg0 + ", " + arg1 + ", " + 38653 + ", " + arg2 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GYWJXMKQ", name = "b", descriptor = "(IIII)I")
	public static int method203(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(7) int local7 = arg0 & 0x3;
			if (local7 == 0) {
				return arg2;
			} else if (local7 == 1) {
				return 7 - arg1;
			} else if (local7 == 2) {
				return 7 - arg2;
			} else {
				return arg1;
			}
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("3819, " + arg0 + ", " + arg1 + ", " + 0 + ", " + arg2 + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GYWJXMKQ", name = "a", descriptor = "(IIZIII)I")
	public static int method204(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(12) int local12 = arg0 & 0x3;
			if (local12 == 0) {
				return arg4;
			} else if (local12 == 1) {
				return arg2;
			} else if (local12 == 2) {
				return 7 + 1 - arg4 - arg3;
			} else {
				return 7 + 1 - arg2 - arg1;
			}
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("21182, " + arg0 + ", " + arg1 + ", " + true + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local41.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GYWJXMKQ", name = "a", descriptor = "(IIIIII)I")
	public static int method205(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			@Pc(7) int local7 = arg4 & 0x3;
			if (local7 == 0) {
				return arg3;
			} else if (local7 == 1) {
				return 7 + 1 - arg0 - arg2;
			} else if (local7 == 2) {
				return 7 + 1 - arg3 - arg1;
			} else {
				return arg0;
			}
		} catch (@Pc(36) RuntimeException local36) {
			signlink.reporterror("83134, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + -76 + ", " + local36.toString());
			throw new RuntimeException();
		}
	}
}
