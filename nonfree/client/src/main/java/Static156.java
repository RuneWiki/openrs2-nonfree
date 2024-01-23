import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static156 {

	@OriginalMember(owner = "client!mb", name = "l", descriptor = "I")
	public static int anInt3157;

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "Lclient!gd;")
	public static Class61 aClass61_26 = new Class61(100);

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "[I")
	public static int[] anIntArray249 = new int[14];

	@OriginalMember(owner = "client!mb", name = "g", descriptor = "I")
	public static int anInt3156 = 0;

	@OriginalMember(owner = "client!mb", name = "h", descriptor = "[Lclient!wf;")
	public static Class8_Sub1_Sub22[] aClass8_Sub1_Sub22Array2 = new Class8_Sub1_Sub22[14];

	@OriginalMember(owner = "client!mb", name = "i", descriptor = "[I")
	public static int[] anIntArray250 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!mb", name = "j", descriptor = "Ljava/lang/String;")
	public static String aString106 = "wishes to trade with you.";

	@OriginalMember(owner = "client!mb", name = "k", descriptor = "[I")
	public static int[] anIntArray251 = new int[128];

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(I)V")
	public static void method2486() {
		if (Static89.aClass82_1 != null) {
			@Pc(10) Class82 local10 = Static89.aClass82_1;
			synchronized (Static89.aClass82_1) {
				Static89.aClass82_1 = null;
			}
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IB)Lclient!fb;")
	public static Class52 method2488(@OriginalArg(0) int arg0) {
		@Pc(6) Class52 local6 = (Class52) Static120.aClass61_20.method1384((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(28) byte[] local28 = Static133.aClass132_46.method3194(34, arg0);
		local6 = new Class52();
		if (local28 != null) {
			local6.method1146(new Class8_Sub2(local28), arg0);
		}
		Static120.aClass61_20.method1377((long) arg0, local6);
		return local6;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(DB)V")
	public static void method2489(@OriginalArg(0) double arg0) {
		if (arg0 == Static120.aDouble1) {
			return;
		}
		for (@Pc(12) int local12 = 0; local12 < 256; local12++) {
			@Pc(25) int local25 = (int) (Math.pow((double) local12 / 255.0D, arg0) * 255.0D);
			Static178.anIntArray264[local12] = local25 <= 255 ? local25 : 255;
		}
		Static120.aDouble1 = arg0;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lclient!pk;I)V")
	public static void method2490(@OriginalArg(0) Class132 arg0) {
		Static135.aClass132_48 = arg0;
	}
}
