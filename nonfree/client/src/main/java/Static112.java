import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static112 {

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "[Lclient!ke;")
	public static Class1_Sub2_Sub4[] aClass1_Sub2_Sub4Array10;

	@OriginalMember(owner = "client!jf", name = "g", descriptor = "I")
	public static int anInt2953;

	@OriginalMember(owner = "client!jf", name = "h", descriptor = "I")
	public static int anInt2954;

	@OriginalMember(owner = "client!jf", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString189 = "yellow:";

	@OriginalMember(owner = "client!jf", name = "d", descriptor = "Z")
	public static boolean aBoolean162 = false;

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(Z)V")
	public static void method2258() {
		for (@Pc(8) int local8 = 0; local8 < 100; local8++) {
			Static198.aBooleanArray19[local8] = true;
		}
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIZ)V")
	public static void method2259(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class20 local7 = Static222.method3674(arg1);
		@Pc(10) int local10 = local7.anInt906;
		@Pc(13) int local13 = local7.anInt911;
		@Pc(16) int local16 = local7.anInt905;
		@Pc(22) int local22 = Class142.anIntArray460[local16 - local10];
		if (arg0 < 0 || local22 < arg0) {
			arg0 = 0;
		}
		local22 <<= local10;
		Static46.method963(~local22 & Static36.anIntArray57[local13] | arg0 << local10 & local22, local13);
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(II)Lclient!lh;")
	public static Class82 method2260(@OriginalArg(1) int arg0) {
		@Pc(14) Class82 local14 = (Class82) Static63.aClass79_9.method2483((long) arg0);
		if (local14 != null) {
			return local14;
		}
		@Pc(24) byte[] local24 = Static147.aClass51_50.method1874(30, arg0);
		local14 = new Class82();
		if (local24 != null) {
			local14.method2505(arg0, new Class1_Sub13(local24));
		}
		Static63.aClass79_9.method2486(local14, (long) arg0);
		return local14;
	}
}
