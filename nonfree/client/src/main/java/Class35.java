import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!RBJNNTUF")
public final class Class35 {

	@OriginalMember(owner = "client!RBJNNTUF", name = "a", descriptor = "I")
	private static int anInt569;

	@OriginalMember(owner = "client!RBJNNTUF", name = "a", descriptor = "(IIII)I")
	public static int method384(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
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
		} catch (@Pc(32) RuntimeException local32) {
			signlink.reporterror("35807, " + 7 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local32.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RBJNNTUF", name = "a", descriptor = "(IZII)I")
	public static int method385(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(3) int local3 = arg0 & 0x3;
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
			signlink.reporterror("46824, " + arg0 + ", " + false + ", " + arg1 + ", " + arg2 + ", " + local33.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RBJNNTUF", name = "a", descriptor = "(IIIIIBI)I")
	public static int method386(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		try {
			if ((arg4 & 0x1) == 1) {
				@Pc(6) int local6 = arg1;
				arg1 = arg5;
				arg5 = local6;
			}
			@Pc(14) int local14 = arg2 & 0x3;
			if (local14 == 0) {
				return arg0;
			} else if (local14 == 1) {
				return arg3;
			} else if (local14 == 2) {
				return 7 + 1 - arg0 - arg1;
			} else {
				return 7 + 1 - arg3 - arg5;
			}
		} catch (@Pc(53) RuntimeException local53) {
			signlink.reporterror("68948, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + 60 + ", " + arg5 + ", " + local53.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RBJNNTUF", name = "a", descriptor = "(ZIIIIII)I")
	public static int method387(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if ((arg4 & 0x1) == 1) {
				@Pc(6) int local6 = arg1;
				arg1 = arg2;
				arg2 = local6;
			}
			@Pc(14) int local14 = arg0 & 0x3;
			if (local14 == 0) {
				return arg5;
			} else if (local14 == 1) {
				return 7 + 1 - arg3 - arg1;
			} else if (local14 == 2) {
				return 7 + 1 - arg5 - arg2;
			} else {
				return arg3;
			}
		} catch (@Pc(52) RuntimeException local52) {
			signlink.reporterror("673, " + true + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local52.toString());
			throw new RuntimeException();
		}
	}
}
