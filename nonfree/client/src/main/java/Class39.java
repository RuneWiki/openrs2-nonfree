import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!RGOEUNSS")
public final class Class39 {

	@OriginalMember(owner = "client!RGOEUNSS", name = "a", descriptor = "Z")
	private static boolean aBoolean189;

	@OriginalMember(owner = "client!RGOEUNSS", name = "b", descriptor = "B")
	private static byte aByte27 = 71;

	@OriginalMember(owner = "client!RGOEUNSS", name = "a", descriptor = "(IBII)I")
	public static int method451(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			if (aByte27 != 71) {
				return 0;
			}
			@Pc(8) int local8 = arg0 & 0x3;
			if (local8 == 0) {
				return arg2;
			} else if (local8 == 1) {
				return arg1;
			} else if (local8 == 2) {
				return 7 - arg2;
			} else {
				return 7 - arg1;
			}
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("73721, " + arg0 + ", " + 71 + ", " + arg1 + ", " + arg2 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RGOEUNSS", name = "a", descriptor = "(IIII)I")
	public static int method452(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			@Pc(3) boolean local3 = false;
			@Pc(7) int local7 = arg2 & 0x3;
			if (local7 == 0) {
				return arg0;
			} else if (local7 == 1) {
				return 7 - arg1;
			} else if (local7 == 2) {
				return 7 - arg0;
			} else {
				return arg1;
			}
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("67486, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RGOEUNSS", name = "a", descriptor = "(IIIIIII)I")
	public static int method453(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		try {
			if ((arg0 & 0x1) == 1) {
				@Pc(6) int local6 = arg1;
				arg1 = arg4;
				arg4 = local6;
			}
			@Pc(14) int local14 = arg5 & 0x3;
			if (local14 == 0) {
				return arg2;
			} else if (local14 == 1) {
				return arg3;
			} else if (local14 == 2) {
				return 7 + 1 - arg2 - arg1;
			} else {
				return 7 + 1 - arg3 - arg4;
			}
		} catch (@Pc(51) RuntimeException local51) {
			signlink.reporterror("24093, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + 0 + ", " + local51.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RGOEUNSS", name = "a", descriptor = "(ZIIIIII)I")
	public static int method454(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if ((arg4 & 0x1) == 1) {
				@Pc(6) int local6 = arg2;
				arg2 = arg0;
				arg0 = local6;
			}
			@Pc(14) int local14 = arg1 & 0x3;
			if (local14 == 0) {
				return arg5;
			} else if (local14 == 1) {
				return 7 + 1 - arg3 - arg2;
			} else if (local14 == 2) {
				return 7 + 1 - arg5 - arg0;
			} else {
				return arg3;
			}
		} catch (@Pc(47) RuntimeException local47) {
			signlink.reporterror("14043, " + false + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local47.toString());
			throw new RuntimeException();
		}
	}
}
