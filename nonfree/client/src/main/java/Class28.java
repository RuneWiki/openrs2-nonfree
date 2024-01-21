import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!OWCLRNAL")
public final class Class28 {

	@OriginalMember(owner = "client!OWCLRNAL", name = "a", descriptor = "I")
	private static int anInt507 = 731;

	@OriginalMember(owner = "client!OWCLRNAL", name = "b", descriptor = "I")
	private static int anInt508 = -276;

	@OriginalMember(owner = "client!OWCLRNAL", name = "a", descriptor = "(BIII)I")
	public static int method411(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
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
			signlink.reporterror("54017, " + -55 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OWCLRNAL", name = "a", descriptor = "(IZII)I")
	public static int method412(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(7) int local7 = arg0 & 0x3;
			if (local7 == 0) {
				return arg2;
			} else if (local7 == 1) {
				return 7 - arg1;
			} else if (local7 == 2) {
				return 7 - arg2;
			} else {
				return arg1;
			}
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("86851, " + arg0 + ", " + true + ", " + arg1 + ", " + arg2 + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OWCLRNAL", name = "a", descriptor = "(IIIIIIZ)I")
	public static int method413(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		try {
			if ((arg1 & 0x1) == 1) {
				@Pc(6) int local6 = arg3;
				arg3 = arg2;
				arg2 = local6;
			}
			@Pc(14) int local14 = arg4 & 0x3;
			if (local14 == 0) {
				return arg5;
			} else if (local14 == 1) {
				return arg0;
			} else if (local14 == 2) {
				return 7 + 1 - arg5 - arg3;
			} else {
				return 7 + 1 - arg0 - arg2;
			}
		} catch (@Pc(47) RuntimeException local47) {
			signlink.reporterror("21241, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + false + ", " + local47.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OWCLRNAL", name = "a", descriptor = "(IIIIIII)I")
	public static int method414(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		try {
			if ((arg5 & 0x1) == 1) {
				@Pc(6) int local6 = arg1;
				arg1 = arg0;
				arg0 = local6;
			}
			@Pc(14) int local14 = arg3 & 0x3;
			@Pc(18) boolean local18 = false;
			if (local14 == 0) {
				return arg6;
			} else if (local14 == 1) {
				return 7 + 1 - arg4 - arg1;
			} else if (local14 == 2) {
				return 7 + 1 - arg6 - arg0;
			} else {
				return arg4;
			}
		} catch (@Pc(47) RuntimeException local47) {
			signlink.reporterror("88020, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local47.toString());
			throw new RuntimeException();
		}
	}
}
