import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static216 {

	@OriginalMember(owner = "client!ns", name = "k", descriptor = "Lclient!qj;")
	public static Class165 aClass165_65;

	@OriginalMember(owner = "client!ns", name = "d", descriptor = "Z")
	public static boolean aBoolean364 = true;

	@OriginalMember(owner = "client!ns", name = "p", descriptor = "I")
	public static final int anInt4259 = 50;

	@OriginalMember(owner = "client!ns", name = "e", descriptor = "[I")
	public static final int[] anIntArray543 = new int[anInt4259];

	@OriginalMember(owner = "client!ns", name = "h", descriptor = "[I")
	public static final int[] anIntArray544 = new int[anInt4259];

	@OriginalMember(owner = "client!ns", name = "l", descriptor = "[I")
	public static final int[] anIntArray545 = new int[anInt4259];

	@OriginalMember(owner = "client!ns", name = "m", descriptor = "[I")
	public static final int[] anIntArray546 = new int[anInt4259];

	@OriginalMember(owner = "client!ns", name = "n", descriptor = "[I")
	public static final int[] anIntArray547 = new int[anInt4259];

	@OriginalMember(owner = "client!ns", name = "r", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray30 = new String[anInt4259];

	@OriginalMember(owner = "client!ns", name = "s", descriptor = "[I")
	public static final int[] anIntArray548 = new int[anInt4259];

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(ILclient!rg;)Lclient!rg;")
	public static Class177 method3962(@OriginalArg(1) Class177 arg0) {
		if (arg0.anInt5236 != -1) {
			return Static140.method2694(arg0.anInt5236);
		}
		@Pc(25) int local25 = arg0.anInt5219 >>> 16;
		@Pc(30) Class39 local30 = new Class39(Static348.aClass26_20);
		for (@Pc(35) Class1_Sub9 local35 = (Class1_Sub9) local30.method1320(); local35 != null; local35 = (Class1_Sub9) local30.method1321()) {
			if (local25 == local35.anInt1104) {
				return Static140.method2694((int) local35.aLong215);
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(Lclient!jj;B)V")
	public static void method3964(@OriginalArg(0) Class5_Sub3_Sub3 arg0) {
		if (arg0 instanceof Class5_Sub3_Sub3_Sub2) {
			@Pc(16) Class5_Sub3_Sub3_Sub2 local16 = (Class5_Sub3_Sub3_Sub2) arg0;
			if (local16.aClass122_1 != null) {
				Static148.method4537(local16);
			}
		} else if (arg0 instanceof Class5_Sub3_Sub3_Sub1) {
			Static214.method3951((Class5_Sub3_Sub3_Sub1) arg0);
		}
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(B)V")
	public static void method3965() {
		@Pc(1) Class140 local1 = Static44.aClass140_25;
		synchronized (Static44.aClass140_25) {
			Static44.aClass140_25.method3813();
		}
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(IB)V")
	public static void method3966(@OriginalArg(0) int arg0) {
		@Pc(16) Class1_Sub1_Sub2 local16 = Static42.method1000(3, arg0);
		local16.method167();
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(IILjava/lang/String;)V")
	public static void method3967(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		Static248.aClass1_Sub7_Sub1_2.method728(41);
		Static248.aClass1_Sub7_Sub1_2.method3108(Static203.method3794(arg1) + 1);
		Static248.aClass1_Sub7_Sub1_2.method3116(arg0);
		Static248.aClass1_Sub7_Sub1_2.method3124(arg1);
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(IBIIIIII)V")
	public static void method3968(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) int arg4) {
		Static217.method3972(arg1, arg2, arg4, 0, arg0, arg3);
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(IIII)I")
	public static int method3969(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 > arg1) {
			return arg2;
		} else if (arg1 <= arg0) {
			return arg1;
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(IBI)V")
	public static void method3970(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) Class1_Sub1_Sub2 local16 = Static42.method1000(14, arg1);
		local16.method168();
		local16.anInt85 = arg0;
	}

	@OriginalMember(owner = "client!ns", name = "b", descriptor = "(IIII)I")
	public static int method3971(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg0 & 0x3;
		if (local7 == 0) {
			return arg2;
		} else if (local7 == 1) {
			return arg1;
		} else if (local7 == 2) {
			return 7 - arg2;
		} else {
			return 7 - arg1;
		}
	}
}
