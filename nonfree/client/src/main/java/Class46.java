import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!XPCGXWBX")
public final class Class46 {

	@OriginalMember(owner = "client!XPCGXWBX", name = "b", descriptor = "Z")
	private static boolean aBoolean180;

	@OriginalMember(owner = "client!XPCGXWBX", name = "a", descriptor = "I")
	private static int anInt768 = -426;

	@OriginalMember(owner = "client!XPCGXWBX", name = "a", descriptor = "(IBII)I")
	public static int method524(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(3) int local3 = arg1 & 0x3;
			if (local3 == 0) {
				return arg0;
			} else if (local3 == 1) {
				return arg2;
			} else if (local3 == 2) {
				return 7 - arg0;
			} else {
				return 7 - arg2;
			}
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("62216, " + arg0 + ", " + 94 + ", " + arg1 + ", " + arg2 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XPCGXWBX", name = "a", descriptor = "(IIII)I")
	public static int method525(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(3) int local3 = arg2 & 0x3;
			if (local3 == 0) {
				return arg0;
			} else if (local3 == 1) {
				return 7 - arg1;
			} else if (local3 == 2) {
				return 7 - arg0;
			} else {
				return arg1;
			}
		} catch (@Pc(33) RuntimeException local33) {
			signlink.reporterror("23380, " + 7 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local33.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XPCGXWBX", name = "a", descriptor = "(IIIIIII)I")
	public static int method526(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		try {
			if ((arg0 & 0x1) == 1) {
				@Pc(10) int local10 = arg5;
				arg5 = arg4;
				arg4 = local10;
			}
			@Pc(18) int local18 = arg3 & 0x3;
			if (local18 == 0) {
				return arg1;
			} else if (local18 == 1) {
				return arg2;
			} else if (local18 == 2) {
				return 7 + 1 - arg1 - arg5;
			} else {
				return 7 + 1 - arg2 - arg4;
			}
		} catch (@Pc(47) RuntimeException local47) {
			signlink.reporterror("30176, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + 0 + ", " + arg5 + ", " + local47.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XPCGXWBX", name = "b", descriptor = "(IIIIIII)I")
	public static int method527(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		try {
			if ((arg4 & 0x1) == 1) {
				@Pc(6) int local6 = arg2;
				arg2 = arg5;
				arg5 = local6;
			}
			@Pc(14) int local14 = arg3 & 0x3;
			if (local14 == 0) {
				return arg1;
			} else if (local14 == 1) {
				return 7 + 1 - arg0 - arg2;
			} else if (local14 == 2) {
				return 7 + 1 - arg1 - arg5;
			} else {
				return arg0;
			}
		} catch (@Pc(47) RuntimeException local47) {
			signlink.reporterror("4462, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + 0 + ", " + local47.toString());
			throw new RuntimeException();
		}
	}
}
