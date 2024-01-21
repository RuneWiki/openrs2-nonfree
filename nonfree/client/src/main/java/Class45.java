import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!XNQMQYFY")
public final class Class45 {

	@OriginalMember(owner = "client!XNQMQYFY", name = "a", descriptor = "I")
	private static int anInt803 = -558;

	@OriginalMember(owner = "client!XNQMQYFY", name = "b", descriptor = "I")
	private static int anInt804 = 6;

	@OriginalMember(owner = "client!XNQMQYFY", name = "c", descriptor = "I")
	private static int anInt805 = -13936;

	@OriginalMember(owner = "client!XNQMQYFY", name = "a", descriptor = "(IIZI)I")
	public static int method546(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
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
			signlink.reporterror("84618, " + arg0 + ", " + arg1 + ", " + true + ", " + arg2 + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XNQMQYFY", name = "a", descriptor = "(IIII)I")
	public static int method547(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			if (anInt804 != 6) {
				return anInt803;
			}
			@Pc(8) int local8 = arg0 & 0x3;
			if (local8 == 0) {
				return arg1;
			} else if (local8 == 1) {
				return 7 - arg2;
			} else if (local8 == 2) {
				return 7 - arg1;
			} else {
				return arg2;
			}
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("50689, " + arg0 + ", " + arg1 + ", " + 6 + ", " + arg2 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XNQMQYFY", name = "a", descriptor = "(IIIIIII)I")
	public static int method548(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		try {
			if (arg5 != anInt805) {
				return 3;
			}
			if ((arg1 & 0x1) == 1) {
				@Pc(11) int local11 = arg2;
				arg2 = arg0;
				arg0 = local11;
			}
			@Pc(19) int local19 = arg3 & 0x3;
			if (local19 == 0) {
				return arg6;
			} else if (local19 == 1) {
				return arg4;
			} else if (local19 == 2) {
				return 7 + 1 - arg6 - arg2;
			} else {
				return 7 + 1 - arg4 - arg0;
			}
		} catch (@Pc(48) RuntimeException local48) {
			signlink.reporterror("11787, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local48.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XNQMQYFY", name = "b", descriptor = "(IIIIIII)I")
	public static int method549(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if ((arg5 & 0x1) == 1) {
				@Pc(11) int local11 = arg3;
				arg3 = arg2;
				arg2 = local11;
			}
			@Pc(19) int local19 = arg4 & 0x3;
			if (local19 == 0) {
				return arg1;
			} else if (local19 == 1) {
				return 7 + 1 - arg0 - arg3;
			} else if (local19 == 2) {
				return 7 + 1 - arg1 - arg2;
			} else {
				return arg0;
			}
		} catch (@Pc(48) RuntimeException local48) {
			signlink.reporterror("9757, " + arg0 + ", " + 350 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local48.toString());
			throw new RuntimeException();
		}
	}
}
