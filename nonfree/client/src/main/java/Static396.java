import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static396 {

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(III)Z")
	public static boolean method2141(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x400) != 0 && (arg1 & 0x37) != 0;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(BII)Z")
	public static boolean method2142(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x400) != 0;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(IBI)Z")
	public static boolean method2143(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x38000) != 0 | method2151(arg1, arg0) || method2168(arg0, arg1);
	}

	@OriginalMember(owner = "client!ga", name = "b", descriptor = "(III)Z")
	public static boolean method2144(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x220) == 544 | (arg1 & 0x18) != 0;
	}

	@OriginalMember(owner = "client!ga", name = "c", descriptor = "(III)Z")
	public static boolean method2145(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return method2161(arg1, arg0) & method2164(arg0, arg1);
	}

	@OriginalMember(owner = "client!ga", name = "d", descriptor = "(III)Z")
	public static boolean method2146(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x400) != 0;
	}

	@OriginalMember(owner = "client!ga", name = "e", descriptor = "(III)Z")
	public static boolean method2147(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (method2142(arg0, arg1)) {
			return (arg1 & 0x5800) != 0 | method2152(arg0, arg1) | method2159(arg1, arg0) ? true : (arg0 & 0x37) == 0 & (method2144(arg0, arg1) | method2149(arg0, arg1));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIB)Z")
	public static boolean method2148(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x30000) != 0 | method2161(arg0, arg1) || method2147(arg1, arg0) || method2145(arg1, arg0);
	}

	@OriginalMember(owner = "client!ga", name = "b", descriptor = "(BII)Z")
	private static boolean method2149(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x8000) != 0;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(ZII)Z")
	public static boolean method2150(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return method2159(arg0, arg1) | (arg0 & 0x20000) != 0 || method2147(arg1, arg0);
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIZ)Z")
	public static boolean method2151(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x21) != 0;
	}

	@OriginalMember(owner = "client!ga", name = "b", descriptor = "(IBI)Z")
	public static boolean method2152(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x2080) != 0;
	}

	@OriginalMember(owner = "client!ga", name = "f", descriptor = "(III)Z")
	public static boolean method2153(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x38000) != 0 | method2155(arg0, arg1) || method2168(arg1, arg0);
	}

	@OriginalMember(owner = "client!ga", name = "b", descriptor = "(IIB)Z")
	public static boolean method2154(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return method2163(arg0, arg1) & method2146(arg0, arg1);
	}

	@OriginalMember(owner = "client!ga", name = "c", descriptor = "(IBI)Z")
	public static boolean method2155(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x34) != 0;
	}

	@OriginalMember(owner = "client!ga", name = "b", descriptor = "(IIZ)Z")
	public static boolean method2156(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x38000) != 0 | method2157(arg1, arg0) || method2168(arg0, arg1);
	}

	@OriginalMember(owner = "client!ga", name = "g", descriptor = "(III)Z")
	public static boolean method2157(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x22) != 0;
	}

	@OriginalMember(owner = "client!ga", name = "h", descriptor = "(III)Z")
	public static boolean method2158(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x400) != 0;
	}

	@OriginalMember(owner = "client!ga", name = "i", descriptor = "(III)Z")
	public static boolean method2159(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x100) != 0;
	}

	@OriginalMember(owner = "client!ga", name = "j", descriptor = "(III)Z")
	public static boolean method2160(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if ((arg0 & 0x8000) != 0 | method2144(arg1, arg0) || method2170(arg0, arg1)) {
			return true;
		} else {
			return (arg1 & 0x37) == 0 && method2147(arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!ga", name = "k", descriptor = "(III)Z")
	public static boolean method2161(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x10) != 0;
	}

	@OriginalMember(owner = "client!ga", name = "l", descriptor = "(III)Z")
	public static boolean method2162(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x180) != 0;
	}

	@OriginalMember(owner = "client!ga", name = "c", descriptor = "(BII)Z")
	public static boolean method2163(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return false;
	}

	@OriginalMember(owner = "client!ga", name = "m", descriptor = "(III)Z")
	public static boolean method2164(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x400) != 0;
	}

	@OriginalMember(owner = "client!ga", name = "n", descriptor = "(III)Z")
	public static boolean method2165(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return method2152(arg0, arg1) || method2147(arg0, arg1);
	}

	@OriginalMember(owner = "client!ga", name = "o", descriptor = "(III)Z")
	public static boolean method2166(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x20) != 0;
	}

	@OriginalMember(owner = "client!ga", name = "c", descriptor = "(IIB)Z")
	public static boolean method2167(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x400) != 0 | method2171(arg1, arg0) || method2147(arg0, arg1);
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(IZI)Z")
	public static boolean method2168(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (method2151(arg1, arg0) | method2157(arg1, arg0) | method2155(arg1, arg0)) & method2158(arg0, arg1);
	}

	@OriginalMember(owner = "client!ga", name = "p", descriptor = "(III)Z")
	public static boolean method2169(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return method2163(arg0, arg1) || method2154(arg0, arg1);
	}

	@OriginalMember(owner = "client!ga", name = "d", descriptor = "(IBI)Z")
	public static boolean method2170(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (method2144(arg1, arg0) | (arg0 & 0x1000) != 0 | method2149(arg1, arg0)) & method2141(arg0, arg1);
	}

	@OriginalMember(owner = "client!ga", name = "q", descriptor = "(III)Z")
	public static boolean method2171(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x4000) != 0;
	}
}
