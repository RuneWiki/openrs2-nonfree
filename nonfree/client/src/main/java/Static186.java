import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static186 {

	@OriginalMember(owner = "client!pl", name = "g", descriptor = "I")
	public static int anInt4188 = 0;

	@OriginalMember(owner = "client!pl", name = "i", descriptor = "Ljava/lang/String;")
	public static String aString280 = "wave2:";

	@OriginalMember(owner = "client!pl", name = "m", descriptor = "[Z")
	public static boolean[] aBooleanArray17 = new boolean[100];

	@OriginalMember(owner = "client!pl", name = "o", descriptor = "Lclient!ic;")
	public static Class58 aClass58_11 = new Class58(128);

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(Lclient!hc;Lclient!hc;ILclient!el;Lclient!hc;)Z")
	public static boolean method3144(@OriginalArg(0) Class51 arg0, @OriginalArg(1) Class51 arg1, @OriginalArg(3) Class1_Sub4_Sub2 arg2, @OriginalArg(4) Class51 arg3) {
		Static82.aClass51_25 = arg0;
		Static13.aClass1_Sub4_Sub2_1 = arg2;
		Static119.aClass51_40 = arg1;
		Static86.aClass51_30 = arg3;
		return true;
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(B)V")
	public static void method3149() {
		Static242.aClass79_36.method2489();
	}
}
