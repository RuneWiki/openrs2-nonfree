import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static160 {

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "F")
	public static float aFloat84;

	@OriginalMember(owner = "client!ma", name = "c", descriptor = "Lclient!wj;")
	public static Class179 aClass179_2;

	@OriginalMember(owner = "client!ma", name = "o", descriptor = "Ljava/lang/String;")
	public static String aString103;

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "Z")
	public static boolean aBoolean222 = true;

	@OriginalMember(owner = "client!ma", name = "g", descriptor = "I")
	public static int anInt2983 = 0;

	@OriginalMember(owner = "client!ma", name = "j", descriptor = "Z")
	public static boolean aBoolean223 = true;

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(IZ)I")
	public static int method2479(@OriginalArg(0) int arg0) {
		return arg0 >>> 7;
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(ILclient!ak;I)[Lclient!rg;")
	public static Class48_Sub2[] method2480(@OriginalArg(1) Class7 arg0, @OriginalArg(2) int arg1) {
		return Static126.method1947(arg0, arg1) ? Static164.method2496() : null;
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(IB)Lclient!vh;")
	public static Class1_Sub2_Sub21 method2481(@OriginalArg(0) int arg0) {
		@Pc(12) Class1_Sub2_Sub21 local12 = (Class1_Sub2_Sub21) Static8.aClass64_1.method1471((long) arg0);
		if (local12 != null) {
			return local12;
		}
		@Pc(26) byte[] local26 = Static170.aClass7_140.method253(arg0, 26);
		local12 = new Class1_Sub2_Sub21();
		if (local26 != null) {
			local12.method4320(new Class1_Sub18(local26));
		}
		Static8.aClass64_1.method1466(local12, (long) arg0);
		return local12;
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(ZJ)V")
	public static void method2482(@OriginalArg(1) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(9) InterruptedException local9) {
		}
	}
}
