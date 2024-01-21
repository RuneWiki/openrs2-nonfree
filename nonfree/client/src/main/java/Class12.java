import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!FPWTEYKY")
public final class Class12 {

	@OriginalMember(owner = "client!FPWTEYKY", name = "a", descriptor = "I")
	private static int anInt141;

	@OriginalMember(owner = "client!FPWTEYKY", name = "c", descriptor = "B")
	private static byte aByte10 = 15;

	@OriginalMember(owner = "client!FPWTEYKY", name = "d", descriptor = "I")
	private static int anInt142 = -224;

	@OriginalMember(owner = "client!FPWTEYKY", name = "a", descriptor = "(IBII)I")
	public static int method139(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			@Pc(4) boolean local4 = false;
			@Pc(16) int local16 = arg2 & 0x3;
			if (local16 == 0) {
				return arg0;
			} else if (local16 == 1) {
				return arg3;
			} else if (local16 == 2) {
				return 7 - arg0;
			} else {
				return 7 - arg3;
			}
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("96486, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FPWTEYKY", name = "a", descriptor = "(IIII)I")
	public static int method140(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(13) int local13 = arg1 & 0x3;
			if (local13 == 0) {
				return arg2;
			} else if (local13 == 1) {
				return 7 - arg0;
			} else if (local13 == 2) {
				return 7 - arg2;
			} else {
				return arg0;
			}
		} catch (@Pc(34) RuntimeException local34) {
			signlink.reporterror("3107, " + arg0 + ", " + -750 + ", " + arg1 + ", " + arg2 + ", " + local34.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FPWTEYKY", name = "a", descriptor = "(IIIIIZI)I")
	public static int method141(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		try {
			if ((arg0 & 0x1) == 1) {
				@Pc(6) int local6 = arg2;
				arg2 = arg5;
				arg5 = local6;
			}
			@Pc(14) int local14 = arg1 & 0x3;
			if (local14 == 0) {
				return arg3;
			} else if (local14 == 1) {
				return arg4;
			} else if (local14 == 2) {
				return 7 + 1 - arg3 - arg2;
			} else {
				return 7 + 1 - arg4 - arg5;
			}
		} catch (@Pc(47) RuntimeException local47) {
			signlink.reporterror("7650, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + false + ", " + arg5 + ", " + local47.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FPWTEYKY", name = "a", descriptor = "(IIIIBII)I")
	public static int method142(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if (aByte10 != 15) {
				anInt141 = 123;
			}
			if ((arg3 & 0x1) == 1) {
				@Pc(11) int local11 = arg5;
				arg5 = arg4;
				arg4 = local11;
			}
			@Pc(19) int local19 = arg2 & 0x3;
			if (local19 == 0) {
				return arg1;
			} else if (local19 == 1) {
				return 7 + 1 - arg0 - arg5;
			} else if (local19 == 2) {
				return 7 + 1 - arg1 - arg4;
			} else {
				return arg0;
			}
		} catch (@Pc(48) RuntimeException local48) {
			signlink.reporterror("9627, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 15 + ", " + arg4 + ", " + arg5 + ", " + local48.toString());
			throw new RuntimeException();
		}
	}
}
