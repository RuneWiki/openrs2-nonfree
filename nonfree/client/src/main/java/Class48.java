import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!YZFMUVTK")
public final class Class48 {

	@OriginalMember(owner = "client!YZFMUVTK", name = "a", descriptor = "I")
	private static int anInt789;

	static {
		aBoolean183 = true;
	}

	@OriginalMember(owner = "client!YZFMUVTK", name = "a", descriptor = "(IIII)I")
	public static int method563(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(3) int local3 = arg2 & 0x3;
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
			signlink.reporterror("69412, " + arg0 + ", " + arg1 + ", " + -874 + ", " + arg2 + ", " + local34.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YZFMUVTK", name = "b", descriptor = "(IIII)I")
	public static int method564(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			@Pc(3) int local3 = arg0 & 0x3;
			if (arg2 != 0) {
				return 4;
			} else if (local3 == 0) {
				return arg1;
			} else if (local3 == 1) {
				return 7 - arg3;
			} else if (local3 == 2) {
				return 7 - arg1;
			} else {
				return arg3;
			}
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("34505, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YZFMUVTK", name = "a", descriptor = "(IIIIIII)I")
	public static int method565(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		try {
			if ((arg5 & 0x1) == 1) {
				@Pc(6) int local6 = arg0;
				arg0 = arg4;
				arg4 = local6;
			}
			@Pc(14) int local14 = arg3 & 0x3;
			if (local14 == 0) {
				return arg1;
			} else if (local14 == 1) {
				return arg2;
			} else if (local14 == 2) {
				return 7 + 1 - arg1 - arg0;
			} else {
				return 7 + 1 - arg2 - arg4;
			}
		} catch (@Pc(51) RuntimeException local51) {
			signlink.reporterror("26329, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + 0 + ", " + local51.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YZFMUVTK", name = "a", descriptor = "(IIIIIIB)I")
	public static int method566(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		try {
			if ((arg4 & 0x1) == 1) {
				@Pc(6) int local6 = arg3;
				arg3 = arg2;
				arg2 = local6;
			}
			@Pc(14) int local14 = arg5 & 0x3;
			if (local14 == 0) {
				return arg1;
			} else if (local14 == 1) {
				return 7 + 1 - arg0 - arg3;
			} else if (local14 == 2) {
				return 7 + 1 - arg1 - arg2;
			} else {
				return arg0;
			}
		} catch (@Pc(48) RuntimeException local48) {
			signlink.reporterror("53080, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + -19 + ", " + local48.toString());
			throw new RuntimeException();
		}
	}
}
