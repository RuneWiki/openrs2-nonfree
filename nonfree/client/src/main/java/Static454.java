import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static454 {

	@OriginalMember(owner = "client!wu", name = "J", descriptor = "Lclient!f;")
	public static Class3 aClass3_25;

	@OriginalMember(owner = "client!wu", name = "I", descriptor = "Lclient!er;")
	public static final Class69 aClass69_72 = new Class69(20);

	@OriginalMember(owner = "client!wu", name = "Q", descriptor = "Lclient!jb;")
	public static Class126 aClass126_17 = null;

	@OriginalMember(owner = "client!wu", name = "R", descriptor = "J")
	public static long aLong224 = -1L;

	@OriginalMember(owner = "client!wu", name = "S", descriptor = "I")
	public static int anInt7591 = -1;

	@OriginalMember(owner = "client!wu", name = "c", descriptor = "(III)I")
	public static int method5850(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = 1;
		while (arg1 > 1) {
			if ((arg1 & 0x1) != 0) {
				local7 *= arg0;
			}
			arg1 >>= 0x1;
			arg0 *= arg0;
		}
		if (arg1 == 1) {
			return local7 * arg0;
		} else {
			return local7;
		}
	}

	@OriginalMember(owner = "client!wu", name = "d", descriptor = "(III)I")
	public static int method5851(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(48) int local48 = Static380.method5186(arg1 - 1, arg0 + -1) + Static380.method5186(arg1 - 1, arg0 + 1) + Static380.method5186(arg1 + 1, arg0 + -1) + Static380.method5186(arg1 + 1, arg0 - -1);
		@Pc(78) int local78 = Static380.method5186(arg1, arg0 - 1) + Static380.method5186(arg1, arg0 + 1) + Static380.method5186(arg1 + -1, arg0) + Static380.method5186(arg1 + 1, arg0);
		@Pc(83) int local83 = Static380.method5186(arg1, arg0);
		return local83 / 4 + local48 / 16 + local78 / 8;
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(IIIBIII)V")
	public static void method5852(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static414.anInt7043 <= arg5 && arg4 <= Static198.anInt3778 && arg3 >= Static388.anInt6740 && arg1 <= Static387.anInt6727) {
			if (arg2 == 1) {
				Static82.method1416(arg5, arg0, arg1, arg3, arg4);
			} else {
				Static54.method5866(arg3, arg2, arg1, arg0, arg4, arg5);
			}
		} else if (arg2 == 1) {
			Static341.method4736(arg3, arg5, arg0, arg4, arg1);
		} else {
			Static60.method1180(arg0, arg2, arg1, arg5, arg4, arg3);
		}
	}
}
