import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!KFSVUSRG")
public final class Class21 {

	@OriginalMember(owner = "client!KFSVUSRG", name = "b", descriptor = "Z")
	private static boolean aBoolean72;

	@OriginalMember(owner = "client!KFSVUSRG", name = "a", descriptor = "I")
	private static int anInt404 = 519;

	@OriginalMember(owner = "client!KFSVUSRG", name = "a", descriptor = "(IIII)I")
	public static int method227(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(7) int local7 = arg2 & 0x3;
			if (local7 == 0) {
				return arg1;
			} else if (local7 == 1) {
				return arg0;
			} else if (local7 == 2) {
				return 7 - arg1;
			} else {
				return 7 - arg0;
			}
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("65286, " + arg0 + ", " + -13 + ", " + arg1 + ", " + arg2 + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KFSVUSRG", name = "a", descriptor = "(IZII)I")
	public static int method228(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
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
			signlink.reporterror("6765, " + arg0 + ", " + true + ", " + arg1 + ", " + arg2 + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KFSVUSRG", name = "a", descriptor = "(IIIIIBI)I")
	public static int method229(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		try {
			if ((arg0 & 0x1) == 1) {
				@Pc(15) int local15 = arg2;
				arg2 = arg5;
				arg5 = local15;
			}
			@Pc(23) int local23 = arg4 & 0x3;
			if (local23 == 0) {
				return arg1;
			} else if (local23 == 1) {
				return arg3;
			} else if (local23 == 2) {
				return 7 + 1 - arg1 - arg2;
			} else {
				return 7 + 1 - arg3 - arg5;
			}
		} catch (@Pc(52) RuntimeException local52) {
			signlink.reporterror("28690, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + -106 + ", " + arg5 + ", " + local52.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KFSVUSRG", name = "a", descriptor = "(IIIIIII)I")
	public static int method230(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if ((arg1 & 0x1) == 1) {
				@Pc(15) int local15 = arg5;
				arg5 = arg3;
				arg3 = local15;
			}
			@Pc(23) int local23 = arg2 & 0x3;
			if (local23 == 0) {
				return arg0;
			} else if (local23 == 1) {
				return 7 + 1 - arg4 - arg5;
			} else if (local23 == 2) {
				return 7 + 1 - arg0 - arg3;
			} else {
				return arg4;
			}
		} catch (@Pc(52) RuntimeException local52) {
			signlink.reporterror("46613, " + arg0 + ", " + 4 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local52.toString());
			throw new RuntimeException();
		}
	}
}
