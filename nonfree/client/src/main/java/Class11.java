import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!EGPGCXBS")
public final class Class11 {

	@OriginalMember(owner = "client!EGPGCXBS", name = "a", descriptor = "I")
	private static int anInt129 = 5;

	@OriginalMember(owner = "client!EGPGCXBS", name = "b", descriptor = "I")
	private static int anInt130 = -470;

	@OriginalMember(owner = "client!EGPGCXBS", name = "c", descriptor = "I")
	private static int anInt131 = 5;

	@OriginalMember(owner = "client!EGPGCXBS", name = "a", descriptor = "(IBII)I")
	public static int method137(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
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
			signlink.reporterror("60345, " + arg0 + ", " + 6 + ", " + arg1 + ", " + arg2 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EGPGCXBS", name = "a", descriptor = "(IIII)I")
	public static int method138(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(3) int local3 = arg2 & 0x3;
			if (local3 == 0) {
				return arg1;
			} else if (local3 == 1) {
				return 7 - arg0;
			} else if (local3 == 2) {
				return 7 - arg1;
			} else {
				return arg0;
			}
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("95624, " + arg0 + ", " + 0 + ", " + arg1 + ", " + arg2 + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EGPGCXBS", name = "a", descriptor = "(IIIIII)I")
	public static int method139(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		try {
			if (arg2 != anInt131) {
				return anInt129;
			}
			@Pc(8) int local8 = arg0 & 0x3;
			if (local8 == 0) {
				return arg3;
			} else if (local8 == 1) {
				return arg5;
			} else if (local8 == 2) {
				return 7 + 1 - arg3 - arg1;
			} else {
				return 7 + 1 - arg5 - arg4;
			}
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("88238, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EGPGCXBS", name = "a", descriptor = "(IIZIII)I")
	public static int method140(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(12) int local12 = arg2 & 0x3;
			if (local12 == 0) {
				return arg4;
			} else if (local12 == 1) {
				return 7 + 1 - arg1 - arg3;
			} else if (local12 == 2) {
				return 7 + 1 - arg4 - arg0;
			} else {
				return arg1;
			}
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("90020, " + arg0 + ", " + arg1 + ", " + true + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local41.toString());
			throw new RuntimeException();
		}
	}
}
