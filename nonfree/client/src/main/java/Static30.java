import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static30 {

	@OriginalMember(owner = "client!c", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString30;

	@OriginalMember(owner = "client!c", name = "h", descriptor = "Lclient!tk;")
	public static Class159 aClass159_2;

	@OriginalMember(owner = "client!c", name = "a", descriptor = "I")
	public static int anInt726 = -1;

	@OriginalMember(owner = "client!c", name = "d", descriptor = "I")
	public static int anInt728 = 0;

	@OriginalMember(owner = "client!c", name = "j", descriptor = "I")
	public static volatile int anInt733 = 0;

	@OriginalMember(owner = "client!c", name = "b", descriptor = "(I)V")
	public static void method506() {
		for (@Pc(7) int local7 = 0; local7 < 5; local7++) {
			Static134.aBooleanArray8[local7] = false;
		}
		Static115.anInt2342 = -1;
		Static176.anInt3474 = 0;
		Static151.anInt4072 = 0;
		anInt726 = -1;
		Static172.anInt3428 = 5;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;B)V")
	public static void method507(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2) {
		Static197.anInt3907 = arg0;
		Static20.aString18 = arg2;
		Static31.aString31 = arg1;
		if (Static20.aString18.equals("") || Static31.aString31.equals("")) {
			Static130.anInt2600 = 3;
		} else if (Static11.anInt2977 == -1) {
			Static169.anInt3385 = 0;
			Static260.anInt5233 = 0;
			Static130.anInt2600 = -3;
			Static293.anInt5678 = 1;
			@Pc(46) Class8_Sub2 local46 = new Class8_Sub2(128);
			local46.method2340(10);
			local46.method2330((int) (Math.random() * 9.9999999E7D));
			local46.method2378(Static31.method513(Static20.aString18));
			local46.method2330((int) (Math.random() * 9.9999999E7D));
			local46.method2331(Static31.aString31);
			local46.method2330((int) (Math.random() * 9.9999999E7D));
			local46.method2343(Static102.aBigInteger1, Static297.aBigInteger2);
			Static66.aClass8_Sub2_Sub1_4.anInt2955 = 0;
			Static66.aClass8_Sub2_Sub1_4.method2340(24);
			Static66.aClass8_Sub2_Sub1_4.method2340(local46.anInt2955 + 2);
			Static66.aClass8_Sub2_Sub1_4.method2333(544);
			Static66.aClass8_Sub2_Sub1_4.method2380(local46.anInt2955, local46.aByteArray24);
		} else {
			Static254.method3799();
		}
	}
}
