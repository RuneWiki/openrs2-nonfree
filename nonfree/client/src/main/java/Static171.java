import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static171 {

	@OriginalMember(owner = "client!sa", name = "f", descriptor = "[I")
	public static int[] anIntArray327;

	@OriginalMember(owner = "client!sa", name = "b", descriptor = "Z")
	public static boolean aBoolean164 = true;

	@OriginalMember(owner = "client!sa", name = "c", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_1012 = Static181.method2795("Das ist eine Mitglieder)2Welt(Q");

	@OriginalMember(owner = "client!sa", name = "e", descriptor = "I")
	public static int anInt3530 = 0;

	@OriginalMember(owner = "client!sa", name = "h", descriptor = "Lclient!qe;")
	public static Class83 aClass83_1013 = null;

	@OriginalMember(owner = "client!sa", name = "i", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_1014 = Static181.method2795("<col=00ff80>");

	@OriginalMember(owner = "client!sa", name = "j", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_1015 = Static181.method2795(":duelstake:");

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IBIIIII)I")
	public static int method2651(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = arg1 & 0x3;
		if ((arg4 & 0x1) == 1) {
			@Pc(16) int local16 = arg5;
			arg5 = arg2;
			arg2 = local16;
		}
		if (local7 == 0) {
			return arg3;
		} else if (local7 == 1) {
			return 1 + 7 - arg5 - arg0;
		} else if (local7 == 2) {
			return 1 + 7 - arg2 - arg3;
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(I[[I)V")
	public static void method2653(@OriginalArg(1) int[][] arg0) {
		Static14.anIntArrayArray18 = arg0;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(BI)I")
	public static int method2654(@OriginalArg(1) int arg0) {
		return arg0 >>> 7;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIIBIII)V")
	public static void method2655(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg3 - arg2 >= Static209.anInt4155 && Static36.anInt940 >= arg2 + arg3 && Static147.anInt4074 <= arg1 - arg2 && arg2 + arg1 <= Static61.anInt1501) {
			Static102.method1757(arg4, arg0, arg3, arg2, arg1, arg5);
		} else {
			Static190.method2867(arg2, arg0, arg1, arg3, arg5, arg4);
		}
	}
}
