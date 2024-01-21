import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!TFOQVWKW")
public final class Class43 {

	@OriginalMember(owner = "client!TFOQVWKW", name = "a", descriptor = "I")
	private static int anInt713 = 1;

	@OriginalMember(owner = "client!TFOQVWKW", name = "a", descriptor = "(IIII)I")
	public static int method401(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
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
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("39117, " + -228 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TFOQVWKW", name = "a", descriptor = "(IIZI)I")
	public static int method402(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(12) int local12 = arg1 & 0x3;
			if (local12 == 0) {
				return arg2;
			} else if (local12 == 1) {
				return 7 - arg0;
			} else if (local12 == 2) {
				return 7 - arg2;
			} else {
				return arg0;
			}
		} catch (@Pc(33) RuntimeException local33) {
			signlink.reporterror("97745, " + arg0 + ", " + arg1 + ", " + true + ", " + arg2 + ", " + local33.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TFOQVWKW", name = "a", descriptor = "(IIIIII)I")
	public static int method403(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(3) int local3 = arg1 & 0x3;
			if (local3 == 0) {
				return arg2;
			} else if (local3 == 1) {
				return arg3;
			} else if (local3 == 2) {
				return 7 + 1 - arg2 - arg4;
			} else {
				return 7 + 1 - arg3 - arg0;
			}
		} catch (@Pc(45) RuntimeException local45) {
			signlink.reporterror("99673, " + 3 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local45.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TFOQVWKW", name = "a", descriptor = "(IIIIBI)I")
	public static int method404(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(3) int local3 = arg1 & 0x3;
			if (local3 == 0) {
				return arg0;
			} else if (local3 == 1) {
				return 7 + 1 - arg4 - arg3;
			} else if (local3 == 2) {
				return 7 + 1 - arg0 - arg2;
			} else {
				return arg4;
			}
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("2329, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + -7 + ", " + arg4 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}
}
