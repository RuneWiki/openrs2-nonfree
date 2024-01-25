import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static367 {

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(IBI)Z")
	public static boolean method2727(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x400) != 0;
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(IIZ)Z")
	public static boolean method2728(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return method2754(arg0, arg1) | (arg0 & 0x38000) != 0 || method2737(arg1, arg0);
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(III)Z")
	public static boolean method2729(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return method2753(arg1, arg0) & method2727(arg1, arg0);
	}

	@OriginalMember(owner = "client!kq", name = "b", descriptor = "(IBI)Z")
	public static boolean method2730(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return method2756(arg1, arg0) | (arg1 & 0x20000) != 0 || method2740(arg0, arg1);
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(BII)Z")
	public static boolean method2731(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return false;
	}

	@OriginalMember(owner = "client!kq", name = "b", descriptor = "(BII)Z")
	public static boolean method2732(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x20) != 0;
	}

	@OriginalMember(owner = "client!kq", name = "b", descriptor = "(III)Z")
	public static boolean method2733(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return method2731(arg0, arg1) || method2743(arg0, arg1);
	}

	@OriginalMember(owner = "client!kq", name = "c", descriptor = "(BII)Z")
	public static boolean method2734(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x400) != 0;
	}

	@OriginalMember(owner = "client!kq", name = "c", descriptor = "(III)Z")
	public static boolean method2735(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return method2748(arg1, arg0) || method2740(arg0, arg1);
	}

	@OriginalMember(owner = "client!kq", name = "d", descriptor = "(III)Z")
	public static boolean method2736(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x38000) != 0 | method2755(arg0, arg1) || method2737(arg0, arg1);
	}

	@OriginalMember(owner = "client!kq", name = "c", descriptor = "(IBI)Z")
	public static boolean method2737(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (method2746(arg0, arg1) | method2755(arg0, arg1) | method2754(arg1, arg0)) & method2750(arg1, arg0);
	}

	@OriginalMember(owner = "client!kq", name = "e", descriptor = "(III)Z")
	public static boolean method2738(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (method2757(arg1, arg0) | (arg1 & 0x1000) != 0 | method2745(arg1, arg0)) & method2752(arg1, arg0);
	}

	@OriginalMember(owner = "client!kq", name = "f", descriptor = "(III)Z")
	public static boolean method2739(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return method2741(arg0, arg1) | (arg1 & 0x400) != 0 || method2740(arg0, arg1);
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(IIB)Z")
	public static boolean method2740(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (method2734(arg1, arg0)) {
			return method2748(arg1, arg0) | (arg1 & 0x5800) != 0 | method2756(arg1, arg0) ? true : (arg0 & 0x37) == 0 & (method2757(arg1, arg0) | method2745(arg1, arg0));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!kq", name = "d", descriptor = "(IBI)Z")
	public static boolean method2741(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x4000) != 0;
	}

	@OriginalMember(owner = "client!kq", name = "d", descriptor = "(BII)Z")
	public static boolean method2742(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x180) != 0;
	}

	@OriginalMember(owner = "client!kq", name = "b", descriptor = "(IIZ)Z")
	public static boolean method2743(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return method2731(arg0, arg1) & method2751(arg0, arg1);
	}

	@OriginalMember(owner = "client!kq", name = "g", descriptor = "(III)Z")
	public static boolean method2744(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x30000) != 0 | method2753(arg0, arg1) || method2740(arg1, arg0) || method2729(arg1, arg0);
	}

	@OriginalMember(owner = "client!kq", name = "h", descriptor = "(III)Z")
	private static boolean method2745(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x8000) != 0;
	}

	@OriginalMember(owner = "client!kq", name = "i", descriptor = "(III)Z")
	public static boolean method2746(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x21) != 0;
	}

	@OriginalMember(owner = "client!kq", name = "e", descriptor = "(BII)Z")
	public static boolean method2747(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return method2746(arg0, arg1) | (arg1 & 0x38000) != 0 || method2737(arg0, arg1);
	}

	@OriginalMember(owner = "client!kq", name = "f", descriptor = "(BII)Z")
	public static boolean method2748(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x2080) != 0;
	}

	@OriginalMember(owner = "client!kq", name = "e", descriptor = "(IBI)Z")
	public static boolean method2749(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if ((arg0 & 0x8000) != 0 | method2757(arg0, arg1) || method2738(arg1, arg0)) {
			return true;
		} else {
			return (arg1 & 0x37) == 0 && method2740(arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!kq", name = "f", descriptor = "(IBI)Z")
	public static boolean method2750(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x400) != 0;
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(IZI)Z")
	public static boolean method2751(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x400) != 0;
	}

	@OriginalMember(owner = "client!kq", name = "c", descriptor = "(IIZ)Z")
	public static boolean method2752(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x400) != 0 && (arg1 & 0x37) != 0;
	}

	@OriginalMember(owner = "client!kq", name = "j", descriptor = "(III)Z")
	public static boolean method2753(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x10) != 0;
	}

	@OriginalMember(owner = "client!kq", name = "k", descriptor = "(III)Z")
	public static boolean method2754(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x34) != 0;
	}

	@OriginalMember(owner = "client!kq", name = "g", descriptor = "(IBI)Z")
	public static boolean method2755(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x22) != 0;
	}

	@OriginalMember(owner = "client!kq", name = "b", descriptor = "(IIB)Z")
	public static boolean method2756(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x100) != 0;
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(ZII)Z")
	public static boolean method2757(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x18) != 0 | (arg0 & 0x220) == 544;
	}
}
