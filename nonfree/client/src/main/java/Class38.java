import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!TXHUSZZJ")
public final class Class38 {

	@OriginalMember(owner = "client!TXHUSZZJ", name = "a", descriptor = "I")
	private static int anInt726 = 850;

	@OriginalMember(owner = "client!TXHUSZZJ", name = "b", descriptor = "I")
	private static int anInt727 = 1;

	@OriginalMember(owner = "client!TXHUSZZJ", name = "a", descriptor = "(IIIZ)I")
	public static int method500(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(3) int local3 = arg0 & 0x3;
			if (local3 == 0) {
				return arg1;
			} else if (local3 == 1) {
				return arg2;
			} else if (local3 == 2) {
				return 7 - arg1;
			} else {
				return 7 - arg2;
			}
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("2265, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + false + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TXHUSZZJ", name = "a", descriptor = "(IIII)I")
	public static int method501(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(16) int local16 = arg1 & 0x3;
			if (local16 == 0) {
				return arg0;
			} else if (local16 == 1) {
				return 7 - arg2;
			} else if (local16 == 2) {
				return 7 - arg0;
			} else {
				return arg2;
			}
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("76372, " + arg0 + ", " + arg1 + ", " + 7 + ", " + arg2 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TXHUSZZJ", name = "a", descriptor = "(IIIIIII)I")
	public static int method502(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		try {
			if ((arg0 & 0x1) == 1) {
				@Pc(10) int local10 = arg3;
				arg3 = arg2;
				arg2 = local10;
			}
			@Pc(18) int local18 = arg4 & 0x3;
			if (local18 == 0) {
				return arg5;
			} else if (local18 == 1) {
				return arg1;
			} else if (local18 == 2) {
				return 7 + 1 - arg5 - arg3;
			} else {
				return 7 + 1 - arg1 - arg2;
			}
		} catch (@Pc(47) RuntimeException local47) {
			signlink.reporterror("84022, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + 0 + ", " + arg5 + ", " + local47.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TXHUSZZJ", name = "a", descriptor = "(IIZIIII)I")
	public static int method503(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if ((arg4 & 0x1) == 1) {
				@Pc(10) int local10 = arg0;
				arg0 = arg2;
				arg2 = local10;
			}
			@Pc(18) int local18 = arg1 & 0x3;
			if (local18 == 0) {
				return arg5;
			} else if (local18 == 1) {
				return 7 + 1 - arg3 - arg0;
			} else if (local18 == 2) {
				return 7 + 1 - arg5 - arg2;
			} else {
				return arg3;
			}
		} catch (@Pc(47) RuntimeException local47) {
			signlink.reporterror("28052, " + arg0 + ", " + arg1 + ", " + true + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local47.toString());
			throw new RuntimeException();
		}
	}
}
