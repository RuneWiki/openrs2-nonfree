import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!BSWTKMFD")
public final class Class5 {

	@OriginalMember(owner = "client!BSWTKMFD", name = "a", descriptor = "Z")
	private static boolean aBoolean11 = true;

	@OriginalMember(owner = "client!BSWTKMFD", name = "b", descriptor = "I")
	private static int anInt23 = 7;

	@OriginalMember(owner = "client!BSWTKMFD", name = "a", descriptor = "(IIII)I")
	public static int method42(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(8) int local8 = arg1 & 0x3;
			if (local8 == 0) {
				return arg2;
			} else if (local8 == 1) {
				return arg0;
			} else if (local8 == 2) {
				return 7 - arg2;
			} else {
				return 7 - arg0;
			}
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("83307, " + arg0 + ", " + arg1 + ", " + 3 + ", " + arg2 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BSWTKMFD", name = "a", descriptor = "(ZIII)I")
	public static int method43(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(11) int local11 = arg2 & 0x3;
			if (local11 == 0) {
				return arg1;
			} else if (local11 == 1) {
				return 7 - arg0;
			} else if (local11 == 2) {
				return 7 - arg1;
			} else {
				return arg0;
			}
		} catch (@Pc(32) RuntimeException local32) {
			signlink.reporterror("3631, " + true + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local32.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BSWTKMFD", name = "a", descriptor = "(IIIIIII)I")
	public static int method44(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if ((arg4 & 0x1) == 1) {
				@Pc(10) int local10 = arg1;
				arg1 = arg3;
				arg3 = local10;
			}
			@Pc(18) int local18 = arg5 & 0x3;
			if (local18 == 0) {
				return arg0;
			} else if (local18 == 1) {
				return arg2;
			} else if (local18 == 2) {
				return 7 + 1 - arg0 - arg1;
			} else {
				return 7 + 1 - arg2 - arg3;
			}
		} catch (@Pc(47) RuntimeException local47) {
			signlink.reporterror("73504, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 498 + ", " + arg4 + ", " + arg5 + ", " + local47.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BSWTKMFD", name = "b", descriptor = "(IIIIIII)I")
	public static int method45(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if ((arg4 & 0x1) == 1) {
				@Pc(6) int local6 = arg5;
				arg5 = arg1;
				arg1 = local6;
			}
			@Pc(14) int local14 = arg2 & 0x3;
			if (local14 == 0) {
				return arg3;
			} else if (local14 == 1) {
				return 7 + 1 - arg0 - arg5;
			} else if (local14 == 2) {
				return 7 + 1 - arg3 - arg1;
			} else {
				return arg0;
			}
		} catch (@Pc(47) RuntimeException local47) {
			signlink.reporterror("66259, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 634 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local47.toString());
			throw new RuntimeException();
		}
	}
}
