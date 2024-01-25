import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static375 {

	@OriginalMember(owner = "client!su", name = "g", descriptor = "I")
	public static int anInt6612;

	@OriginalMember(owner = "client!su", name = "b", descriptor = "[I")
	public static final int[] anIntArray472 = new int[8];

	@OriginalMember(owner = "client!su", name = "e", descriptor = "Z")
	public static boolean aBoolean456 = false;

	@OriginalMember(owner = "client!su", name = "f", descriptor = "[I")
	public static final int[] anIntArray473 = new int[4096];

	@OriginalMember(owner = "client!su", name = "h", descriptor = "I")
	public static int anInt6613 = 0;

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;IZ)V")
	public static void method5178(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		Static230.aString42 = arg1;
		Static177.anInt3622 = arg2;
		Static242.aString45 = arg0;
		if (Static230.aString42.equals("") || Static242.aString45.equals("")) {
			Static287.anInt5252 = 3;
		} else if (Static379.anInt2076 == -1) {
			Static161.anInt3447 = 0;
			Static287.anInt5252 = -3;
			Static123.anInt2661 = 0;
			Static151.anInt3305 = 1;
			@Pc(39) Class3_Sub2 local39 = new Class3_Sub2(128);
			local39.method6001(10);
			local39.method6008((int) (Math.random() * 9.9999999E7D));
			local39.method5990(Static353.method4997(Static230.aString42));
			local39.method6008((int) (Math.random() * 9.9999999E7D));
			local39.method6033(Static242.aString45);
			local39.method6008((int) (Math.random() * 9.9999999E7D));
			local39.method6036(Static259.aBigInteger1, Static454.aBigInteger2);
			Static302.aClass3_Sub2_Sub2_2.anInt7620 = 0;
			Static302.aClass3_Sub2_Sub2_2.method6001(Static410.aClass49_10.anInt1611);
			Static302.aClass3_Sub2_Sub2_2.method6001(local39.anInt7620 + 2);
			Static302.aClass3_Sub2_Sub2_2.method6045(583);
			Static302.aClass3_Sub2_Sub2_2.method6026(local39.anInt7620, local39.aByteArray95);
		} else {
			Static82.method1419();
		}
	}
}
