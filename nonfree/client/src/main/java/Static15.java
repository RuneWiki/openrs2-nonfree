import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static15 {

	@OriginalMember(owner = "client!bd", name = "r", descriptor = "Lclient!oe;")
	public static Class1_Sub2_Sub2_Sub3 aClass1_Sub2_Sub2_Sub3_1;

	@OriginalMember(owner = "client!bd", name = "v", descriptor = "Lclient!tf;")
	public static Interface3 anInterface3_1;

	@OriginalMember(owner = "client!bd", name = "y", descriptor = "I")
	public static int anInt309;

	@OriginalMember(owner = "client!bd", name = "A", descriptor = "Lclient!ud;")
	public static Class82_Sub1 aClass82_Sub1_5;

	@OriginalMember(owner = "client!bd", name = "n", descriptor = "Lclient!tg;")
	private static Class81 aClass81_133 = Static120.method2057("Service unavailable)3");

	@OriginalMember(owner = "client!bd", name = "o", descriptor = "Lclient!tg;")
	public static Class81 aClass81_134 = aClass81_133;

	@OriginalMember(owner = "client!bd", name = "q", descriptor = "[I")
	public static int[] anIntArray12 = new int[32];

	@OriginalMember(owner = "client!bd", name = "s", descriptor = "Lclient!tg;")
	private static Class81 aClass81_135 = Static120.method2057(" more options");

	@OriginalMember(owner = "client!bd", name = "z", descriptor = "Lclient!tg;")
	public static Class81 aClass81_136 = aClass81_135;

	@OriginalMember(owner = "client!bd", name = "b", descriptor = "(B)V")
	public static void method229() {
		aClass81_136 = null;
		aClass81_135 = null;
		anInterface3_1 = null;
		aClass81_134 = null;
		anIntArray12 = null;
		aClass1_Sub2_Sub2_Sub3_1 = null;
		aClass82_Sub1_5 = null;
		aClass81_133 = null;
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(IIIIIII)I")
	public static int method230(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(3) int local3 = arg2 & 0x3;
		if ((arg4 & 0x1) == 1) {
			@Pc(10) int local10 = arg3;
			arg3 = arg1;
			arg1 = local10;
		}
		if (local3 == 0) {
			return arg5;
		} else if (local3 == 1) {
			return 8 - arg3 - arg0;
		} else if (local3 == 2) {
			return 8 - arg5 - arg1;
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(BILclient!vb;I)[Lclient!sc;")
	public static Class1_Sub2_Sub2_Sub4[] method231(@OriginalArg(1) int arg0, @OriginalArg(2) Class82 arg1, @OriginalArg(3) int arg2) {
		return Static83.method1391(arg1, arg0, arg2) ? Static36.method743() : null;
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(ILclient!vb;I)[Lclient!sc;")
	public static Class1_Sub2_Sub2_Sub4[] method232(@OriginalArg(0) int arg0, @OriginalArg(1) Class82 arg1) {
		return Static113.method1997(arg0, arg1) ? Static36.method743() : null;
	}
}
