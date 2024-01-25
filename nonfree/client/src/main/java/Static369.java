import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static369 {

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(III)Z")
	public static boolean method5928(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x180) != 0;
	}

	@OriginalMember(owner = "client!wo", name = "b", descriptor = "(III)Z")
	public static boolean method5929(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x400) != 0;
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(IBI)Z")
	public static boolean method5930(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return method5951(arg0, arg1) | (arg0 & 0x38000) != 0 || method5933(arg0, arg1);
	}

	@OriginalMember(owner = "client!wo", name = "c", descriptor = "(III)Z")
	public static boolean method5931(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x10) != 0;
	}

	@OriginalMember(owner = "client!wo", name = "b", descriptor = "(IBI)Z")
	public static boolean method5932(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x400) != 0 && (arg1 & 0x37) != 0;
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(BII)Z")
	public static boolean method5933(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (method5949(arg1, arg0) | method5934(arg1, arg0) | method5951(arg0, arg1)) & method5929(arg0, arg1);
	}

	@OriginalMember(owner = "client!wo", name = "c", descriptor = "(IBI)Z")
	public static boolean method5934(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x22) != 0;
	}

	@OriginalMember(owner = "client!wo", name = "d", descriptor = "(III)Z")
	public static boolean method5935(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if ((arg1 & 0x8000) != 0 | method5943(arg1, arg0) || method5947(arg0, arg1)) {
			return true;
		} else {
			return (arg0 & 0x37) == 0 && method5957(arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!wo", name = "e", descriptor = "(III)Z")
	public static boolean method5936(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x20) != 0;
	}

	@OriginalMember(owner = "client!wo", name = "f", descriptor = "(III)Z")
	public static boolean method5937(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x100) != 0;
	}

	@OriginalMember(owner = "client!wo", name = "g", descriptor = "(III)Z")
	public static boolean method5938(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return method5949(arg1, arg0) | (arg0 & 0x38000) != 0 || method5933(arg0, arg1);
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(IIZ)Z")
	public static boolean method5939(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x2080) != 0;
	}

	@OriginalMember(owner = "client!wo", name = "b", descriptor = "(IIZ)Z")
	public static boolean method5940(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return method5958(arg0, arg1) || method5941(arg0, arg1);
	}

	@OriginalMember(owner = "client!wo", name = "h", descriptor = "(III)Z")
	public static boolean method5941(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return method5958(arg0, arg1) & method5948(arg1, arg0);
	}

	@OriginalMember(owner = "client!wo", name = "i", descriptor = "(III)Z")
	public static boolean method5942(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return method5931(arg1, arg0) & method5944(arg0, arg1);
	}

	@OriginalMember(owner = "client!wo", name = "b", descriptor = "(BII)Z")
	public static boolean method5943(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x220) == 544 | (arg0 & 0x18) != 0;
	}

	@OriginalMember(owner = "client!wo", name = "j", descriptor = "(III)Z")
	public static boolean method5944(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x400) != 0;
	}

	@OriginalMember(owner = "client!wo", name = "k", descriptor = "(III)Z")
	public static boolean method5945(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x30000) != 0 | method5931(arg1, arg0) || method5957(arg0, arg1) || method5942(arg0, arg1);
	}

	@OriginalMember(owner = "client!wo", name = "c", descriptor = "(BII)Z")
	public static boolean method5946(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x400) != 0 | method5950(arg1, arg0) || method5957(arg1, arg0);
	}

	@OriginalMember(owner = "client!wo", name = "l", descriptor = "(III)Z")
	public static boolean method5947(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (method5943(arg1, arg0) | (arg1 & 0x1000) != 0 | method5956(arg1, arg0)) & method5932(arg1, arg0);
	}

	@OriginalMember(owner = "client!wo", name = "m", descriptor = "(III)Z")
	public static boolean method5948(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x400) != 0;
	}

	@OriginalMember(owner = "client!wo", name = "d", descriptor = "(IBI)Z")
	public static boolean method5949(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x21) != 0;
	}

	@OriginalMember(owner = "client!wo", name = "n", descriptor = "(III)Z")
	public static boolean method5950(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x4000) != 0;
	}

	@OriginalMember(owner = "client!wo", name = "o", descriptor = "(III)Z")
	public static boolean method5951(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x34) != 0;
	}

	@OriginalMember(owner = "client!wo", name = "p", descriptor = "(III)Z")
	public static boolean method5952(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x20000) != 0 | method5937(arg1, arg0) || method5957(arg1, arg0);
	}

	@OriginalMember(owner = "client!wo", name = "e", descriptor = "(IBI)Z")
	public static boolean method5953(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return method5939(arg1, arg0) || method5957(arg0, arg1);
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(ZII)Z")
	public static boolean method5954(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x400) != 0;
	}

	@OriginalMember(owner = "client!wo", name = "q", descriptor = "(III)Z")
	public static boolean method5955(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return method5934(arg1, arg0) | (arg0 & 0x38000) != 0 || method5933(arg0, arg1);
	}

	@OriginalMember(owner = "client!wo", name = "d", descriptor = "(BII)Z")
	private static boolean method5956(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x8000) != 0;
	}

	@OriginalMember(owner = "client!wo", name = "r", descriptor = "(III)Z")
	public static boolean method5957(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (method5954(arg1, arg0)) {
			return method5939(arg1, arg0) | (arg1 & 0x5800) != 0 | method5937(arg0, arg1) ? true : (method5943(arg1, arg0) | method5956(arg1, arg0)) & (arg0 & 0x37) == 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!wo", name = "s", descriptor = "(III)Z")
	public static boolean method5958(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return false;
	}
}
