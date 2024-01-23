import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static18 {

	@OriginalMember(owner = "client!bd", name = "w", descriptor = "[Z")
	public static boolean[] aBooleanArray1;

	@OriginalMember(owner = "client!bd", name = "b", descriptor = "Lclient!ic;")
	public static Class58 aClass58_1 = new Class58(64);

	@OriginalMember(owner = "client!bd", name = "o", descriptor = "Ljava/lang/String;")
	public static String aString24 = "Please wait...";

	@OriginalMember(owner = "client!bd", name = "t", descriptor = "[I")
	public static int[] anIntArray50 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!bd", name = "b", descriptor = "(BLclient!ql;)Lclient!ch;")
	public static Class25_Sub1 method333(@OriginalArg(1) Class1_Sub13 arg0) {
		return new Class25_Sub1(arg0.method1798(), arg0.method1798(), arg0.method1798(), arg0.method1798(), arg0.method1773(), arg0.method1772());
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(Lclient!hc;[Lclient!q;Z)V")
	public static void method334(@OriginalArg(0) Class51 arg0, @OriginalArg(1) Class1_Sub2_Sub4_Sub1[] arg1) {
		Static227.aClass51_75 = arg0;
		Static98.aClass1_Sub2_Sub4_Sub1Array1 = arg1;
		Static167.aBooleanArray14 = new boolean[Static98.aClass1_Sub2_Sub4_Sub1Array1.length];
		Static203.aClass140_12.method4010();
		@Pc(21) int local21 = Static227.aClass51_75.method1866("details");
		@Pc(26) int[] local26 = Static227.aClass51_75.method1865(local21);
		for (@Pc(35) int local35 = 0; local35 < local26.length; local35++) {
			Static203.aClass140_12.method4011(Static140.method2545(local26[local35], new Class1_Sub13(Static227.aClass51_75.method1874(local21, local26[local35]))), (long) local26[local35]);
		}
	}
}
