import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static181 {

	@OriginalMember(owner = "client!pf", name = "q", descriptor = "[Z")
	public static boolean[] aBooleanArray16 = new boolean[100];

	@OriginalMember(owner = "client!pf", name = "u", descriptor = "I")
	public static int anInt4153 = 0;

	@OriginalMember(owner = "client!pf", name = "y", descriptor = "[[B")
	public static byte[][] aByteArrayArray9 = new byte[1000][];

	@OriginalMember(owner = "client!pf", name = "z", descriptor = "Ljava/lang/String;")
	public static String aString279 = "cyan:";

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(II)V")
	public static void method3120(@OriginalArg(1) int arg0) {
		@Pc(4) Class1_Sub2_Sub18 local4 = Static13.method232(arg0, 11);
		local4.method3805();
	}

	@OriginalMember(owner = "client!pf", name = "f", descriptor = "(I)V")
	public static void method3122() {
		Static171.aClass1_Sub13_Sub1_3.method1825(91);
		Static171.aClass1_Sub13_Sub1_3.method1766(Static110.method2246());
		Static171.aClass1_Sub13_Sub1_3.method1789(Static200.anInt4411);
		Static171.aClass1_Sub13_Sub1_3.method1789(Static251.anInt5352);
		Static171.aClass1_Sub13_Sub1_3.method1766(Static44.anInt1342);
	}

	@OriginalMember(owner = "client!pf", name = "g", descriptor = "(I)V")
	public static void method3123() {
		Static13.aClass79_1.method2487();
		Static150.aClass79_23.method2487();
		Static17.aClass79_2.method2487();
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(Lclient!hc;II)Z")
	public static boolean method3124(@OriginalArg(0) Class51 arg0, @OriginalArg(2) int arg1) {
		@Pc(8) byte[] local8 = arg0.method1863(arg1);
		if (local8 == null) {
			return false;
		} else {
			Static257.method4148(local8);
			return true;
		}
	}
}
