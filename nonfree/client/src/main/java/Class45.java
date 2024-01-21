import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!YFQBSABU")
public final class Class45 {

	@OriginalMember(owner = "client!YFQBSABU", name = "a", descriptor = "I")
	private static int anInt739 = 65;

	@OriginalMember(owner = "client!YFQBSABU", name = "b", descriptor = "I")
	private static int anInt740 = 192;

	@OriginalMember(owner = "client!YFQBSABU", name = "a", descriptor = "(ZIII)I")
	public static int method512(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(7) int local7 = arg0 & 0x3;
			if (local7 == 0) {
				return arg1;
			} else if (local7 == 1) {
				return arg2;
			} else if (local7 == 2) {
				return 7 - arg1;
			} else {
				return 7 - arg2;
			}
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("67778, " + true + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YFQBSABU", name = "a", descriptor = "(IIIB)I")
	public static int method513(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		try {
			@Pc(3) int local3 = arg0 & 0x3;
			if (arg3 != 1) {
				return anInt739;
			}
			@Pc(8) boolean local8 = false;
			if (local3 == 0) {
				return arg1;
			} else if (local3 == 1) {
				return 7 - arg2;
			} else if (local3 == 2) {
				return 7 - arg1;
			} else {
				return arg2;
			}
		} catch (@Pc(33) RuntimeException local33) {
			signlink.reporterror("80777, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local33.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YFQBSABU", name = "a", descriptor = "(IIIBIII)I")
	public static int method514(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if ((arg0 & 0x1) == 1) {
				@Pc(6) int local6 = arg1;
				arg1 = arg5;
				arg5 = local6;
			}
			@Pc(14) int local14 = arg3 & 0x3;
			if (local14 == 0) {
				return arg4;
			} else if (local14 == 1) {
				return arg2;
			} else if (local14 == 2) {
				return 7 + 1 - arg4 - arg1;
			} else {
				return 7 + 1 - arg2 - arg5;
			}
		} catch (@Pc(48) RuntimeException local48) {
			signlink.reporterror("11408, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -105 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local48.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YFQBSABU", name = "a", descriptor = "(IIIIIII)I")
	public static int method515(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		try {
			@Pc(3) boolean local3 = false;
			if ((arg5 & 0x1) == 1) {
				@Pc(10) int local10 = arg6;
				arg6 = arg4;
				arg4 = local10;
			}
			@Pc(18) int local18 = arg0 & 0x3;
			if (local18 == 0) {
				return arg3;
			} else if (local18 == 1) {
				return 7 + 1 - arg1 - arg6;
			} else if (local18 == 2) {
				return 7 + 1 - arg3 - arg4;
			} else {
				return arg1;
			}
		} catch (@Pc(47) RuntimeException local47) {
			signlink.reporterror("29043, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local47.toString());
			throw new RuntimeException();
		}
	}
}
