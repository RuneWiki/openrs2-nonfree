import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!KTYXNKDN")
public final class Class18 {

	@OriginalMember(owner = "client!KTYXNKDN", name = "a", descriptor = "Z")
	private static boolean aBoolean85 = true;

	@OriginalMember(owner = "client!KTYXNKDN", name = "b", descriptor = "I")
	private static int anInt373 = 4;

	@OriginalMember(owner = "client!KTYXNKDN", name = "a", descriptor = "(IZII)I")
	public static int method169(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
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
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("83766, " + arg0 + ", " + false + ", " + arg1 + ", " + arg2 + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KTYXNKDN", name = "a", descriptor = "(IIII)I")
	public static int method170(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			if (arg1 != anInt373) {
				return anInt373;
			}
			@Pc(8) int local8 = arg0 & 0x3;
			if (local8 == 0) {
				return arg2;
			} else if (local8 == 1) {
				return 7 - arg3;
			} else if (local8 == 2) {
				return 7 - arg2;
			} else {
				return arg3;
			}
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("37396, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KTYXNKDN", name = "a", descriptor = "(IIIZIII)I")
	public static int method171(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if ((arg4 & 0x1) == 1) {
				@Pc(6) int local6 = arg1;
				arg1 = arg5;
				arg5 = local6;
			}
			@Pc(14) int local14 = arg0 & 0x3;
			if (local14 == 0) {
				return arg3;
			} else if (local14 == 1) {
				return arg2;
			} else if (local14 == 2) {
				return 7 + 1 - arg3 - arg1;
			} else {
				return 7 + 1 - arg2 - arg5;
			}
		} catch (@Pc(51) RuntimeException local51) {
			signlink.reporterror("55187, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + false + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local51.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KTYXNKDN", name = "b", descriptor = "(IIIZIII)I")
	public static int method172(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if ((arg3 & 0x1) == 1) {
				@Pc(10) int local10 = arg0;
				arg0 = arg2;
				arg2 = local10;
			}
			@Pc(18) int local18 = arg4 & 0x3;
			if (local18 == 0) {
				return arg1;
			} else if (local18 == 1) {
				return 7 + 1 - arg5 - arg0;
			} else if (local18 == 2) {
				return 7 + 1 - arg1 - arg2;
			} else {
				return arg5;
			}
		} catch (@Pc(47) RuntimeException local47) {
			signlink.reporterror("69004, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + false + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local47.toString());
			throw new RuntimeException();
		}
	}
}
