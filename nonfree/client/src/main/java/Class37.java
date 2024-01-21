import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!TECGIKEQ")
public final class Class37 {

	@OriginalMember(owner = "client!TECGIKEQ", name = "a", descriptor = "I")
	private static int anInt587;

	@OriginalMember(owner = "client!TECGIKEQ", name = "b", descriptor = "Z")
	private static boolean aBoolean151;

	@OriginalMember(owner = "client!TECGIKEQ", name = "c", descriptor = "Z")
	private static boolean aBoolean152 = true;

	@OriginalMember(owner = "client!TECGIKEQ", name = "d", descriptor = "B")
	private static byte aByte24 = 6;

	@OriginalMember(owner = "client!TECGIKEQ", name = "a", descriptor = "(IIII)I")
	public static int method443(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(3) int local3 = arg0 & 0x3;
			if (local3 == 0) {
				return arg1;
			} else if (local3 == 1) {
				return arg2;
			} else if (local3 == 2) {
				return 7 - arg1;
			} else {
				return 7 - arg2;
			}
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("50765, " + -698 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TECGIKEQ", name = "a", descriptor = "(IIBI)I")
	public static int method444(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(12) int local12 = arg2 & 0x3;
			if (local12 == 0) {
				return arg0;
			} else if (local12 == 1) {
				return 7 - arg1;
			} else if (local12 == 2) {
				return 7 - arg0;
			} else {
				return arg1;
			}
		} catch (@Pc(33) RuntimeException local33) {
			signlink.reporterror("21377, " + arg0 + ", " + arg1 + ", " + 77 + ", " + arg2 + ", " + local33.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TECGIKEQ", name = "a", descriptor = "(IBIIIII)I")
	public static int method445(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if ((arg1 & 0x1) == 1) {
				@Pc(6) int local6 = arg4;
				arg4 = arg2;
				arg2 = local6;
			}
			@Pc(14) int local14 = arg5 & 0x3;
			if (aByte24 != 6) {
				aBoolean152 = !aBoolean152;
			}
			if (local14 == 0) {
				return arg0;
			} else if (local14 == 1) {
				return arg3;
			} else if (local14 == 2) {
				return 7 + 1 - arg0 - arg4;
			} else {
				return 7 + 1 - arg3 - arg2;
			}
		} catch (@Pc(52) RuntimeException local52) {
			signlink.reporterror("38083, " + arg0 + ", " + 6 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local52.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TECGIKEQ", name = "a", descriptor = "(IIIIIII)I")
	public static int method446(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if ((arg1 & 0x1) == 1) {
				@Pc(6) int local6 = arg5;
				arg5 = arg4;
				arg4 = local6;
			}
			@Pc(14) int local14 = arg3 & 0x3;
			if (local14 == 0) {
				return arg2;
			} else if (local14 == 1) {
				return 7 + 1 - arg0 - arg5;
			} else if (local14 == 2) {
				return 7 + 1 - arg2 - arg4;
			} else {
				return arg0;
			}
		} catch (@Pc(47) RuntimeException local47) {
			signlink.reporterror("42443, " + arg0 + ", " + 0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local47.toString());
			throw new RuntimeException();
		}
	}
}
