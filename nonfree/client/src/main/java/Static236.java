import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static236 {

	@OriginalMember(owner = "client!pf", name = "f", descriptor = "[Z")
	public static boolean[] aBooleanArray23;

	@OriginalMember(owner = "client!pf", name = "b", descriptor = "I")
	public static int anInt4721 = 0;

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(Z)V")
	public static void method4018() {
		@Pc(5) Class198 local5 = Static336.aClass198_61;
		synchronized (Static336.aClass198_61) {
			Static336.aClass198_61.method5230();
		}
		local5 = Static182.aClass198_31;
		synchronized (Static182.aClass198_31) {
			Static182.aClass198_31.method5230();
		}
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIIIBII)I")
	public static int method4019(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if ((arg0 & 0x1) == 1) {
			@Pc(6) int local6 = arg3;
			arg3 = arg5;
			arg5 = local6;
		}
		@Pc(23) int local23 = arg1 & 0x3;
		if (local23 == 0) {
			return arg4;
		} else if (local23 == 1) {
			return 7 + 1 - arg2 - arg3;
		} else if (local23 == 2) {
			return 1 + 7 - arg5 - arg4;
		} else {
			return arg2;
		}
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(B)V")
	public static void method4020() {
		Static126.aClass57_14 = null;
		Static329.aClass57_24 = null;
		Static336.aClass57_26 = null;
		Static248.aClass57_16 = null;
		Static34.aClass57_4 = null;
		Static354.aClass57_27 = null;
		Static40.aClass57_25 = null;
		Static132.aClass57_9 = null;
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(II)V")
	public static void method4021() {
		Static313.aClass198_55.method5243(5);
	}

	@OriginalMember(owner = "client!pf", name = "b", descriptor = "(II)V")
	public static void method4022() {
		Static18.aClass198_7.method5243(5);
	}
}
