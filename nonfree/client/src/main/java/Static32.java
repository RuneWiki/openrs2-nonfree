import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static32 {

	@OriginalMember(owner = "client!de", name = "f", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray2;

	@OriginalMember(owner = "client!de", name = "l", descriptor = "[[B")
	public static byte[][] aByteArrayArray4;

	@OriginalMember(owner = "client!de", name = "a", descriptor = "J")
	public static long aLong31 = 0L;

	@OriginalMember(owner = "client!de", name = "b", descriptor = "Lclient!kb;")
	private static Class46 aClass46_236 = Static65.method1172("Could not complete login)3");

	@OriginalMember(owner = "client!de", name = "c", descriptor = "Lclient!kb;")
	private static Class46 aClass46_237 = Static65.method1172("flash1:");

	@OriginalMember(owner = "client!de", name = "d", descriptor = "Lclient!kb;")
	public static Class46 aClass46_238 = aClass46_237;

	@OriginalMember(owner = "client!de", name = "g", descriptor = "Lclient!kb;")
	public static Class46 aClass46_239 = aClass46_237;

	@OriginalMember(owner = "client!de", name = "i", descriptor = "I")
	public static int anInt911 = 0;

	@OriginalMember(owner = "client!de", name = "j", descriptor = "[Lclient!kb;")
	public static Class46[] aClass46Array5 = new Class46[500];

	@OriginalMember(owner = "client!de", name = "k", descriptor = "Lclient!kb;")
	public static Class46 aClass46_240 = aClass46_236;

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(IIII)Lclient!id;")
	public static Class3_Sub12 method575(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) Class3_Sub12 local3 = new Class3_Sub12();
		local3.anInt1763 = arg2;
		local3.anInt1766 = arg0;
		Static129.aClass54_10.method1603((long) arg1, local3);
		Static172.method2727(arg0);
		Static170.method2713(arg0);
		@Pc(29) Class33 local29 = Static179.method2873(arg1);
		if (local29 != null) {
			Static142.method2373(local29);
		}
		if (Static71.aClass33_7 != null) {
			Static142.method2373(Static71.aClass33_7);
			Static71.aClass33_7 = null;
		}
		Static87.anInt2129 = 0;
		Static105.aBoolean103 = false;
		Static66.method1174(Static163.anInt3620, Static56.anInt1516, Static33.anInt924, Static39.anInt3979);
		if (Static85.anInt674 != -1) {
			Static169.method2711(Static85.anInt674, 1);
		}
		return local3;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(I)V")
	public static void method576() {
		aClass46_239 = null;
		aByteArrayArrayArray2 = null;
		aClass46_236 = null;
		aByteArrayArray4 = null;
		aClass46_240 = null;
		aClass46Array5 = null;
		aClass46_238 = null;
		aClass46_237 = null;
	}

	@OriginalMember(owner = "client!de", name = "b", descriptor = "(I)V")
	public static void method577() {
		Static15.aClass57_3.method1715();
	}
}
