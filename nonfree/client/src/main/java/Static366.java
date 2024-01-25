import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static366 {

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIB)Z")
	private static boolean method4963(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x8000) != 0;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(BII)Z")
	public static boolean method4964(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x400) != 0;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IZI)Z")
	public static boolean method4965(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return method4981(arg0, arg1) & method4991(arg1, arg0);
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(III)Z")
	public static boolean method4966(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x2080) != 0;
	}

	@OriginalMember(owner = "client!ta", name = "b", descriptor = "(BII)Z")
	public static boolean method4967(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return method4970(arg1, arg0) & method4980(arg0, arg1);
	}

	@OriginalMember(owner = "client!ta", name = "b", descriptor = "(III)Z")
	public static boolean method4968(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (method4973(arg0, arg1) | method4986(arg1, arg0) | method4989(arg1, arg0)) & method4964(arg0, arg1);
	}

	@OriginalMember(owner = "client!ta", name = "c", descriptor = "(BII)Z")
	public static boolean method4969(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (method4985(arg0, arg1)) {
			return method4966(arg1, arg0) | (arg0 & 0x5800) != 0 | method4987(arg0, arg1) ? true : (method4983(arg0, arg1) | method4963(arg1, arg0)) & (arg1 & 0x37) == 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ta", name = "b", descriptor = "(IIB)Z")
	public static boolean method4970(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x10) != 0;
	}

	@OriginalMember(owner = "client!ta", name = "c", descriptor = "(III)Z")
	public static boolean method4971(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (method4983(arg0, arg1) | (arg0 & 0x8000) != 0 || method4988(arg0, arg1)) {
			return true;
		} else {
			return (arg1 & 0x37) == 0 && method4969(arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!ta", name = "d", descriptor = "(III)Z")
	public static boolean method4972(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return method4981(arg1, arg0) || method4965(arg1, arg0);
	}

	@OriginalMember(owner = "client!ta", name = "d", descriptor = "(BII)Z")
	public static boolean method4973(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x21) != 0;
	}

	@OriginalMember(owner = "client!ta", name = "e", descriptor = "(III)Z")
	public static boolean method4974(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x180) != 0;
	}

	@OriginalMember(owner = "client!ta", name = "f", descriptor = "(III)Z")
	public static boolean method4975(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return method4973(arg1, arg0) | (arg1 & 0x38000) != 0 || method4968(arg1, arg0);
	}

	@OriginalMember(owner = "client!ta", name = "g", descriptor = "(III)Z")
	public static boolean method4976(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x20000) != 0 | method4987(arg0, arg1) || method4969(arg0, arg1);
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIZ)Z")
	public static boolean method4977(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x400) != 0 && (arg0 & 0x37) != 0;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IBI)Z")
	public static boolean method4978(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return method4966(arg1, arg0) || method4969(arg0, arg1);
	}

	@OriginalMember(owner = "client!ta", name = "e", descriptor = "(BII)Z")
	public static boolean method4979(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return method4989(arg1, arg0) | (arg0 & 0x38000) != 0 || method4968(arg0, arg1);
	}

	@OriginalMember(owner = "client!ta", name = "c", descriptor = "(IIB)Z")
	public static boolean method4980(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x400) != 0;
	}

	@OriginalMember(owner = "client!ta", name = "h", descriptor = "(III)Z")
	public static boolean method4981(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return false;
	}

	@OriginalMember(owner = "client!ta", name = "b", descriptor = "(IBI)Z")
	public static boolean method4982(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x20) != 0;
	}

	@OriginalMember(owner = "client!ta", name = "d", descriptor = "(IIB)Z")
	public static boolean method4983(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x220) == 544 | (arg0 & 0x18) != 0;
	}

	@OriginalMember(owner = "client!ta", name = "i", descriptor = "(III)Z")
	public static boolean method4984(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return method4992(arg1, arg0) | (arg0 & 0x400) != 0 || method4969(arg0, arg1);
	}

	@OriginalMember(owner = "client!ta", name = "j", descriptor = "(III)Z")
	public static boolean method4985(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x400) != 0;
	}

	@OriginalMember(owner = "client!ta", name = "e", descriptor = "(IIB)Z")
	public static boolean method4986(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x22) != 0;
	}

	@OriginalMember(owner = "client!ta", name = "k", descriptor = "(III)Z")
	public static boolean method4987(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x100) != 0;
	}

	@OriginalMember(owner = "client!ta", name = "l", descriptor = "(III)Z")
	public static boolean method4988(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (method4983(arg0, arg1) | (arg0 & 0x1000) != 0 | method4963(arg1, arg0)) & method4977(arg1, arg0);
	}

	@OriginalMember(owner = "client!ta", name = "b", descriptor = "(IZI)Z")
	public static boolean method4989(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x34) != 0;
	}

	@OriginalMember(owner = "client!ta", name = "f", descriptor = "(IIB)Z")
	public static boolean method4990(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return method4986(arg1, arg0) | (arg0 & 0x38000) != 0 || method4968(arg0, arg1);
	}

	@OriginalMember(owner = "client!ta", name = "m", descriptor = "(III)Z")
	public static boolean method4991(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x400) != 0;
	}

	@OriginalMember(owner = "client!ta", name = "c", descriptor = "(IZI)Z")
	public static boolean method4992(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x4000) != 0;
	}

	@OriginalMember(owner = "client!ta", name = "n", descriptor = "(III)Z")
	public static boolean method4993(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x30000) != 0 | method4970(arg1, arg0) || method4969(arg0, arg1) || method4967(arg0, arg1);
	}
}
