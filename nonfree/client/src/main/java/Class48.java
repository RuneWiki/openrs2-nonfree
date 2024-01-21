import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!YYAQTPDX")
public final class Class48 {

	@OriginalMember(owner = "client!YYAQTPDX", name = "a", descriptor = "I")
	private static int anInt782 = 38245;

	@OriginalMember(owner = "client!YYAQTPDX", name = "b", descriptor = "I")
	private static int anInt783 = -875;

	@OriginalMember(owner = "client!YYAQTPDX", name = "a", descriptor = "(BIII)I")
	public static int method562(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
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
			signlink.reporterror("87747, " + 98 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local34.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YYAQTPDX", name = "a", descriptor = "(IIII)I")
	public static int method563(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(7) int local7 = arg1 & 0x3;
			if (local7 == 0) {
				return arg0;
			} else if (local7 == 1) {
				return 7 - arg2;
			} else if (local7 == 2) {
				return 7 - arg0;
			} else {
				return arg2;
			}
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("86325, " + arg0 + ", " + 0 + ", " + arg1 + ", " + arg2 + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YYAQTPDX", name = "a", descriptor = "(IIIIII)I")
	public static int method564(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			@Pc(3) int local3 = arg4 & 0x3;
			if (local3 == 0) {
				return arg2;
			} else if (local3 == 1) {
				return arg0;
			} else if (local3 == 2) {
				return 7 + 1 - arg2 - arg3;
			} else {
				return 7 + 1 - arg0 - arg1;
			}
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("99703, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + -187 + ", " + local38.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YYAQTPDX", name = "b", descriptor = "(IIIIII)I")
	public static int method565(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(7) int local7 = arg2 & 0x3;
			if (local7 == 0) {
				return arg1;
			} else if (local7 == 1) {
				return 7 + 1 - arg0 - arg3;
			} else if (local7 == 2) {
				return 7 + 1 - arg1 - arg4;
			} else {
				return arg0;
			}
		} catch (@Pc(36) RuntimeException local36) {
			signlink.reporterror("64616, " + arg0 + ", " + arg1 + ", " + 0 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local36.toString());
			throw new RuntimeException();
		}
	}
}
