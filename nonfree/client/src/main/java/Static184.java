import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static184 {

	@OriginalMember(owner = "client!wb", name = "e", descriptor = "[I")
	public static int[] anIntArray449;

	@OriginalMember(owner = "client!wb", name = "c", descriptor = "Z")
	public static boolean aBoolean317 = false;

	@OriginalMember(owner = "client!wb", name = "d", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1413 = Static161.method2971("Fps:");

	@OriginalMember(owner = "client!wb", name = "g", descriptor = "I")
	public static int anInt4077 = 0;

	@OriginalMember(owner = "client!wb", name = "h", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1414 = Static161.method2971("Einloggen");

	@OriginalMember(owner = "client!wb", name = "j", descriptor = "I")
	public static volatile int anInt4079 = 0;

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(B)V")
	public static void method2990() {
		anIntArray449 = null;
		aClass13_1414 = null;
		aClass13_1413 = null;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(II)V")
	public static void method2991(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static171.method2892(arg0)) {
			return;
		}
		@Pc(18) Class20[] local18 = Static145.aClass20ArrayArray1[arg0];
		for (@Pc(20) int local20 = 0; local20 < local18.length; local20++) {
			@Pc(26) Class20 local26 = local18[local20];
			if (local26.anObjectArray2 != null) {
				@Pc(33) Class1_Sub23 local33 = new Class1_Sub23();
				local33.aClass20_13 = local26;
				local33.anObjectArray29 = local26.anObjectArray2;
				Static41.method1066(2000000, local33);
			}
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(III)I")
	public static int method2992(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) int local16 = arg0 - 1 & arg1 >> 31;
		return local16 + ((arg1 >>> 31) + arg1) % arg0;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lclient!ag;I)V")
	public static void method2993(@OriginalArg(0) Class4 arg0) {
		Static54.aClass4_48 = arg0;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(BI)Lclient!ee;")
	public static Class1_Sub2_Sub6 method2994(@OriginalArg(1) int arg0) {
		@Pc(6) Class1_Sub2_Sub6 local6 = (Class1_Sub2_Sub6) Static35.aClass47_8.method1999((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(20) byte[] local20 = Static43.aClass4_42.method2243(10, arg0);
		local6 = new Class1_Sub2_Sub6();
		local6.anInt1306 = arg0;
		if (local20 != null) {
			local6.method1059(new Class1_Sub8(local20));
		}
		local6.method1070();
		if (local6.anInt1303 != -1) {
			local6.method1069(method2994(local6.anInt1324), method2994(local6.anInt1303));
		}
		if (!Static48.aBoolean111 && local6.aBoolean88) {
			local6.aClass13_463 = Static5.aClass13_49;
			local6.aClass13Array9 = null;
			local6.aClass13Array8 = null;
			local6.aBoolean89 = false;
			local6.anInt1329 = 0;
		}
		Static35.aClass47_8.method1998(local6, (long) arg0);
		return local6;
	}
}
