import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static213 {

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "Lclient!nb;")
	public static Class118 aClass118_1;

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "[I")
	public static int[] anIntArray437 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

	@OriginalMember(owner = "client!pc", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString148 = "Loading defaults - ";

	@OriginalMember(owner = "client!pc", name = "d", descriptor = "I")
	public static int anInt4350 = -1;

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IILclient!th;)V")
	public static void method3557(@OriginalArg(0) int arg0, @OriginalArg(2) Class15_Sub2_Sub2 arg1) {
		@Pc(6) Class2_Sub31 local6 = (Class2_Sub31) Static304.aClass101_26.method2867((long) arg0);
		if (local6 == null) {
			Static256.method4029(null, Static32.anInt876, arg1.anIntArray518[0], arg0, arg1.anIntArray516[0], null, arg1, 0);
		} else {
			local6.method4640();
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IILjava/lang/String;)V")
	public static void method3559(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		Static211.aClass2_Sub16_Sub1_2.method2198(224);
		Static211.aClass2_Sub16_Sub1_2.method2168(Static223.method3684(arg1) + 1);
		Static211.aClass2_Sub16_Sub1_2.method2168(arg0);
		Static211.aClass2_Sub16_Sub1_2.method2153(arg1);
	}
}
