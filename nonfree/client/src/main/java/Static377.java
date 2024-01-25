import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static377 {

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(IIB)Z")
	public static boolean method3900(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x400) != 0;
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(III)Z")
	public static boolean method3901(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x10) != 0;
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(IBI)Z")
	public static boolean method3902(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (method3913(arg1, arg0) | method3904(arg0, arg1) | method3912(arg0, arg1)) & method3923(arg1, arg0);
	}

	@OriginalMember(owner = "client!ni", name = "b", descriptor = "(III)Z")
	public static boolean method3903(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x4000) != 0;
	}

	@OriginalMember(owner = "client!ni", name = "c", descriptor = "(III)Z")
	public static boolean method3904(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x22) != 0;
	}

	@OriginalMember(owner = "client!ni", name = "b", descriptor = "(IIB)Z")
	public static boolean method3905(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return false;
	}

	@OriginalMember(owner = "client!ni", name = "c", descriptor = "(IIB)Z")
	public static boolean method3906(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x2080) != 0;
	}

	@OriginalMember(owner = "client!ni", name = "d", descriptor = "(III)Z")
	public static boolean method3907(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x180) != 0;
	}

	@OriginalMember(owner = "client!ni", name = "e", descriptor = "(III)Z")
	public static boolean method3908(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x18) != 0 | (arg0 & 0x220) == 544;
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(BII)Z")
	public static boolean method3909(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (method3900(arg0, arg1)) {
			return method3906(arg0, arg1) | (arg0 & 0x5800) != 0 | method3911(arg1, arg0) ? true : (method3908(arg0, arg1) | method3920(arg1, arg0)) & (arg1 & 0x37) == 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ni", name = "d", descriptor = "(IIB)Z")
	public static boolean method3910(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return method3913(arg1, arg0) | (arg0 & 0x38000) != 0 || method3902(arg0, arg1);
	}

	@OriginalMember(owner = "client!ni", name = "f", descriptor = "(III)Z")
	public static boolean method3911(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x100) != 0;
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(IZI)Z")
	public static boolean method3912(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x34) != 0;
	}

	@OriginalMember(owner = "client!ni", name = "g", descriptor = "(III)Z")
	public static boolean method3913(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x21) != 0;
	}

	@OriginalMember(owner = "client!ni", name = "h", descriptor = "(III)Z")
	public static boolean method3914(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if ((arg1 & 0x8000) != 0 | method3908(arg1, arg0) || method3921(arg1, arg0)) {
			return true;
		} else {
			return (arg0 & 0x37) == 0 && method3909(arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!ni", name = "i", descriptor = "(III)Z")
	public static boolean method3915(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return method3904(arg1, arg0) | (arg1 & 0x38000) != 0 || method3902(arg1, arg0);
	}

	@OriginalMember(owner = "client!ni", name = "b", descriptor = "(IZI)Z")
	public static boolean method3916(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x20000) != 0 | method3911(arg1, arg0) || method3909(arg0, arg1);
	}

	@OriginalMember(owner = "client!ni", name = "b", descriptor = "(IBI)Z")
	public static boolean method3917(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return method3912(arg0, arg1) | (arg0 & 0x38000) != 0 || method3902(arg0, arg1);
	}

	@OriginalMember(owner = "client!ni", name = "j", descriptor = "(III)Z")
	public static boolean method3918(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return method3903(arg1, arg0) | (arg0 & 0x400) != 0 || method3909(arg0, arg1);
	}

	@OriginalMember(owner = "client!ni", name = "k", descriptor = "(III)Z")
	public static boolean method3919(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x400) != 0;
	}

	@OriginalMember(owner = "client!ni", name = "l", descriptor = "(III)Z")
	private static boolean method3920(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x8000) != 0;
	}

	@OriginalMember(owner = "client!ni", name = "c", descriptor = "(IBI)Z")
	public static boolean method3921(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (method3908(arg0, arg1) | (arg0 & 0x1000) != 0 | method3920(arg1, arg0)) & method3928(arg1, arg0);
	}

	@OriginalMember(owner = "client!ni", name = "m", descriptor = "(III)Z")
	public static boolean method3922(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x400) != 0;
	}

	@OriginalMember(owner = "client!ni", name = "n", descriptor = "(III)Z")
	public static boolean method3923(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x400) != 0;
	}

	@OriginalMember(owner = "client!ni", name = "c", descriptor = "(IZI)Z")
	public static boolean method3924(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x20) != 0;
	}

	@OriginalMember(owner = "client!ni", name = "o", descriptor = "(III)Z")
	public static boolean method3925(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return method3905(arg0, arg1) || method3926(arg0, arg1);
	}

	@OriginalMember(owner = "client!ni", name = "p", descriptor = "(III)Z")
	public static boolean method3926(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return method3905(arg0, arg1) & method3919(arg0, arg1);
	}

	@OriginalMember(owner = "client!ni", name = "d", descriptor = "(IBI)Z")
	public static boolean method3927(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x30000) != 0 | method3901(arg1, arg0) || method3909(arg0, arg1) || method3930(arg0, arg1);
	}

	@OriginalMember(owner = "client!ni", name = "q", descriptor = "(III)Z")
	public static boolean method3928(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x400) != 0 && (arg0 & 0x37) != 0;
	}

	@OriginalMember(owner = "client!ni", name = "b", descriptor = "(BII)Z")
	public static boolean method3929(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return method3906(arg1, arg0) || method3909(arg1, arg0);
	}

	@OriginalMember(owner = "client!ni", name = "r", descriptor = "(III)Z")
	public static boolean method3930(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return method3901(arg1, arg0) & method3922(arg0, arg1);
	}
}
