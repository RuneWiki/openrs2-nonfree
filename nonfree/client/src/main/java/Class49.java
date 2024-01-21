import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!XSVEHPAI")
public final class Class49 {

	@OriginalMember(owner = "client!XSVEHPAI", name = "a", descriptor = "Z")
	private static boolean aBoolean186 = true;

	@OriginalMember(owner = "client!XSVEHPAI", name = "b", descriptor = "I")
	private static int anInt809 = -128;

	@OriginalMember(owner = "client!XSVEHPAI", name = "a", descriptor = "(IIBI)I")
	public static int method541(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(13) int local13 = arg1 & 0x3;
			if (local13 == 0) {
				return arg2;
			} else if (local13 == 1) {
				return arg0;
			} else if (local13 == 2) {
				return 7 - arg2;
			} else {
				return 7 - arg0;
			}
		} catch (@Pc(34) RuntimeException local34) {
			signlink.reporterror("50015, " + arg0 + ", " + arg1 + ", " + -49 + ", " + arg2 + ", " + local34.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XSVEHPAI", name = "a", descriptor = "(IIII)I")
	public static int method542(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			if (arg3 >= 0) {
				for (@Pc(3) int local3 = 1; local3 > 0; local3++) {
				}
			}
			@Pc(12) int local12 = arg0 & 0x3;
			if (local12 == 0) {
				return arg2;
			} else if (local12 == 1) {
				return 7 - arg1;
			} else if (local12 == 2) {
				return 7 - arg2;
			} else {
				return arg1;
			}
		} catch (@Pc(33) RuntimeException local33) {
			signlink.reporterror("90903, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local33.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XSVEHPAI", name = "a", descriptor = "(IIIIIII)I")
	public static int method543(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if ((arg4 & 0x1) == 1) {
				@Pc(6) int local6 = arg1;
				arg1 = arg3;
				arg3 = local6;
			}
			@Pc(14) int local14 = arg2 & 0x3;
			if (local14 == 0) {
				return arg0;
			} else if (local14 == 1) {
				return arg5;
			} else if (local14 == 2) {
				return 7 + 1 - arg0 - arg1;
			} else {
				return 7 + 1 - arg5 - arg3;
			}
		} catch (@Pc(49) RuntimeException local49) {
			signlink.reporterror("74089, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + -128 + ", " + arg4 + ", " + arg5 + ", " + local49.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XSVEHPAI", name = "a", descriptor = "(ZIIIIII)I")
	public static int method544(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		try {
			if (arg0) {
				aBoolean186 = !aBoolean186;
			}
			if ((arg3 & 0x1) == 1) {
				@Pc(14) int local14 = arg4;
				arg4 = arg6;
				arg6 = local14;
			}
			@Pc(22) int local22 = arg1 & 0x3;
			if (local22 == 0) {
				return arg2;
			} else if (local22 == 1) {
				return 7 + 1 - arg5 - arg4;
			} else if (local22 == 2) {
				return 7 + 1 - arg2 - arg6;
			} else {
				return arg5;
			}
		} catch (@Pc(51) RuntimeException local51) {
			signlink.reporterror("98531, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local51.toString());
			throw new RuntimeException();
		}
	}
}
