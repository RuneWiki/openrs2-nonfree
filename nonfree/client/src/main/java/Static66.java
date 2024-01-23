import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static66 {

	@OriginalMember(owner = "client!el", name = "u", descriptor = "[I")
	public static int[] anIntArray109;

	@OriginalMember(owner = "client!el", name = "x", descriptor = "I")
	public static int anInt1366;

	@OriginalMember(owner = "client!el", name = "z", descriptor = "I")
	public static int anInt1367;

	@OriginalMember(owner = "client!el", name = "d", descriptor = "Lclient!mi;")
	public static Class112 aClass112_3 = new Class112(16);

	@OriginalMember(owner = "client!el", name = "p", descriptor = "Z")
	public static boolean aBoolean133 = false;

	@OriginalMember(owner = "client!el", name = "s", descriptor = "Lclient!mi;")
	public static Class112 aClass112_4 = new Class112(128);

	@OriginalMember(owner = "client!el", name = "t", descriptor = "[I")
	public static int[] anIntArray108 = new int[5];

	@OriginalMember(owner = "client!el", name = "v", descriptor = "Lclient!mi;")
	public static Class112 aClass112_5 = new Class112(64);

	@OriginalMember(owner = "client!el", name = "w", descriptor = "Z")
	public static boolean aBoolean134 = false;

	@OriginalMember(owner = "client!el", name = "y", descriptor = "[J")
	public static long[] aLongArray5 = new long[500];

	@OriginalMember(owner = "client!el", name = "A", descriptor = "Z")
	public static boolean aBoolean135 = false;

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!mj;")
	public static RuntimeException_Sub1 method1152(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(12) RuntimeException_Sub1 local12;
		if (arg0 instanceof RuntimeException_Sub1) {
			local12 = (RuntimeException_Sub1) arg0;
			local12.aString110 = local12.aString110 + ' ' + arg1;
		} else {
			local12 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local12;
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(Lclient!nm;II)Lclient!ad;")
	public static Class1_Sub3 method1153(@OriginalArg(0) Class119 arg0, @OriginalArg(1) int arg1) {
		@Pc(14) byte[] local14 = arg0.method3244(arg1);
		return local14 == null ? null : new Class1_Sub3(local14);
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(IZ)V")
	public static void method1154(@OriginalArg(1) boolean arg0) {
		@Pc(6) Class1_Sub28 local6;
		for (local6 = (Class1_Sub28) Static236.aClass96_22.method2340(); local6 != null; local6 = (Class1_Sub28) Static236.aClass96_22.method2342()) {
			if (local6.aClass1_Sub7_Sub1_2 != null) {
				Static173.aClass1_Sub7_Sub3_1.method3613(local6.aClass1_Sub7_Sub1_2);
				local6.aClass1_Sub7_Sub1_2 = null;
			}
			if (local6.aClass1_Sub7_Sub1_3 != null) {
				Static173.aClass1_Sub7_Sub3_1.method3613(local6.aClass1_Sub7_Sub1_3);
				local6.aClass1_Sub7_Sub1_3 = null;
			}
			local6.method4573();
		}
		if (!arg0) {
			return;
		}
		for (local6 = (Class1_Sub28) Static28.aClass96_2.method2340(); local6 != null; local6 = (Class1_Sub28) Static28.aClass96_2.method2342()) {
			if (local6.aClass1_Sub7_Sub1_2 != null) {
				Static173.aClass1_Sub7_Sub3_1.method3613(local6.aClass1_Sub7_Sub1_2);
				local6.aClass1_Sub7_Sub1_2 = null;
			}
			local6.method4573();
		}
		for (local6 = (Class1_Sub28) Static4.aClass86_3.method2134(); local6 != null; local6 = (Class1_Sub28) Static4.aClass86_3.method2141()) {
			if (local6.aClass1_Sub7_Sub1_2 != null) {
				Static173.aClass1_Sub7_Sub3_1.method3613(local6.aClass1_Sub7_Sub1_2);
				local6.aClass1_Sub7_Sub1_2 = null;
			}
			local6.method4573();
		}
	}
}
