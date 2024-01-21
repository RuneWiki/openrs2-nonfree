import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!CEOKPAKZ")
public final class Class3 {

	@OriginalMember(owner = "client!CEOKPAKZ", name = "a", descriptor = "I")
	private static int anInt127;

	@OriginalMember(owner = "client!CEOKPAKZ", name = "b", descriptor = "Z")
	private static boolean aBoolean20 = true;

	@OriginalMember(owner = "client!CEOKPAKZ", name = "a", descriptor = "(IIIB)I")
	public static int method29(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(3) int local3 = arg0 & 0x3;
			if (local3 == 0) {
				return arg2;
			} else if (local3 == 1) {
				return arg1;
			} else if (local3 == 2) {
				return 7 - arg2;
			} else {
				return 7 - arg1;
			}
		} catch (@Pc(33) RuntimeException local33) {
			signlink.reporterror("32700, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 5 + ", " + local33.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CEOKPAKZ", name = "a", descriptor = "(IIII)I")
	public static int method30(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(3) int local3 = arg1 & 0x3;
			if (local3 == 0) {
				return arg2;
			} else if (local3 == 1) {
				return 7 - arg0;
			} else if (local3 == 2) {
				return 7 - arg2;
			} else {
				return arg0;
			}
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("83142, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -443 + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CEOKPAKZ", name = "a", descriptor = "(IIIIII)I")
	public static int method31(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(3) int local3 = arg3 & 0x3;
			if (local3 == 0) {
				return arg2;
			} else if (local3 == 1) {
				return arg4;
			} else if (local3 == 2) {
				return 7 + 1 - arg2 - arg0;
			} else {
				return 7 + 1 - arg4 - arg1;
			}
		} catch (@Pc(36) RuntimeException local36) {
			signlink.reporterror("78526, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + -794 + ", " + arg4 + ", " + local36.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CEOKPAKZ", name = "a", descriptor = "(IIBIII)I")
	public static int method32(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(3) int local3 = arg3 & 0x3;
			if (local3 == 0) {
				return arg1;
			} else if (local3 == 1) {
				return 7 + 1 - arg4 - arg2;
			} else if (local3 == 2) {
				return 7 + 1 - arg1 - arg0;
			} else {
				return arg4;
			}
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("33039, " + arg0 + ", " + arg1 + ", " + 7 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}
}
