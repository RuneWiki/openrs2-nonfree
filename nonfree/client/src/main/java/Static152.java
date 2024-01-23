import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static152 {

	@OriginalMember(owner = "client!lm", name = "b", descriptor = "Lclient!gi;")
	public static Class61 aClass61_5;

	@OriginalMember(owner = "client!lm", name = "j", descriptor = "Lclient!jd;")
	public static Class84 aClass84_61;

	@OriginalMember(owner = "client!lm", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString154 = "slide:";

	@OriginalMember(owner = "client!lm", name = "d", descriptor = "Lclient!ii;")
	public static Class79 aClass79_14 = new Class79(8);

	@OriginalMember(owner = "client!lm", name = "e", descriptor = "[I")
	public static int[] anIntArray230 = new int[25];

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(IB)Lclient!se;")
	public static Class155 method2616(@OriginalArg(0) int arg0) {
		@Pc(10) Class155 local10 = (Class155) Static102.aClass46_14.method1074((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(28) byte[] local28 = Static126.aClass84_53.method2127(Static59.method1132(arg0), Static239.method3936(arg0));
		local10 = new Class155();
		local10.anInt4832 = arg0;
		if (local28 != null) {
			local10.method3930(new Class2_Sub26(local28));
		}
		local10.method3933();
		if (local10.anInt4812 != -1) {
			local10.method3919(method2616(local10.anInt4812), method2616(local10.anInt4819));
		}
		if (local10.anInt4862 != -1) {
			local10.method3927(method2616(local10.anInt4810), method2616(local10.anInt4862));
		}
		if (!Static121.aBoolean198 && local10.aBoolean409) {
			local10.aBoolean410 = false;
			local10.aStringArray27 = Static284.aStringArray34;
			local10.aStringArray26 = Static149.aStringArray13;
			local10.anInt4861 = 0;
			local10.aString239 = Static99.aString108;
		}
		Static102.aClass46_14.method1071(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "([Ljava/lang/Object;Z[I)V")
	public static void method2617(@OriginalArg(0) Object[] arg0, @OriginalArg(2) int[] arg1) {
		Static38.method726(arg1, arg0, 0, arg1.length - 1);
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(I)V")
	public static void method2618() {
		Static163.aBoolean277 = true;
	}

	@OriginalMember(owner = "client!lm", name = "b", descriptor = "(IB)I")
	public static int method2620(@OriginalArg(0) int arg0) {
		@Pc(7) Class142 local7 = Static17.method359(arg0);
		@Pc(10) int local10 = local7.anInt4473;
		@Pc(13) int local13 = local7.anInt4478;
		@Pc(16) int local16 = local7.anInt4479;
		@Pc(23) int local23 = Class2_Sub1_Sub7.anIntArray96[local16 - local13];
		return Static249.anIntArray446[local10] >> local13 & local23;
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(II)I")
	public static int method2621(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(Z)V")
	public static void method2622() {
		Static237.aClass46_32.method1079();
	}
}
