import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!KZRWVGKU")
public final class Class20 {

	@OriginalMember(owner = "client!KZRWVGKU", name = "a", descriptor = "I")
	private static int anInt396 = -107;

	@OriginalMember(owner = "client!KZRWVGKU", name = "c", descriptor = "I")
	private static int anInt397;

	static {
		aBoolean93 = true;
		anInt397 = 44965;
	}

	@OriginalMember(owner = "client!KZRWVGKU", name = "a", descriptor = "(IIII)I")
	public static int method244(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			@Pc(3) int local3 = arg3 & 0x3;
			while (arg2 >= 0) {
			}
			if (local3 == 0) {
				return arg1;
			} else if (local3 == 1) {
				return arg0;
			} else if (local3 == 2) {
				return 7 - arg1;
			} else {
				return 7 - arg0;
			}
		} catch (@Pc(34) RuntimeException local34) {
			signlink.reporterror("81084, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local34.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KZRWVGKU", name = "b", descriptor = "(IIII)I")
	public static int method245(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(3) int local3 = arg0 & 0x3;
			if (local3 == 0) {
				return arg2;
			} else if (local3 == 1) {
				return 7 - arg1;
			} else if (local3 == 2) {
				return 7 - arg2;
			} else {
				return arg1;
			}
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("88821, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 426 + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KZRWVGKU", name = "a", descriptor = "(IIIIIII)I")
	public static int method246(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if ((arg3 & 0x1) == 1) {
				@Pc(6) int local6 = arg4;
				arg4 = arg2;
				arg2 = local6;
			}
			@Pc(14) int local14 = arg5 & 0x3;
			if (local14 == 0) {
				return arg1;
			} else if (local14 == 1) {
				return arg0;
			} else if (local14 == 2) {
				return 7 + 1 - arg1 - arg4;
			} else {
				return 7 + 1 - arg0 - arg2;
			}
		} catch (@Pc(47) RuntimeException local47) {
			signlink.reporterror("76626, " + arg0 + ", " + -407 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local47.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KZRWVGKU", name = "b", descriptor = "(IIIIIII)I")
	public static int method247(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if ((arg4 & 0x1) == 1) {
				@Pc(14) int local14 = arg3;
				arg3 = arg0;
				arg0 = local14;
			}
			@Pc(22) int local22 = arg2 & 0x3;
			if (local22 == 0) {
				return arg1;
			} else if (local22 == 1) {
				return 7 + 1 - arg5 - arg3;
			} else if (local22 == 2) {
				return 7 + 1 - arg1 - arg0;
			} else {
				return arg5;
			}
		} catch (@Pc(51) RuntimeException local51) {
			signlink.reporterror("345, " + 8 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local51.toString());
			throw new RuntimeException();
		}
	}
}
