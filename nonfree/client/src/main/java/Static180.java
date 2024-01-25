import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static180 {

	@OriginalMember(owner = "client!it", name = "a", descriptor = "I")
	public static int anInt2931;

	@OriginalMember(owner = "client!it", name = "d", descriptor = "Lclient!cv;")
	public static Class44 aClass44_2;

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(II)Z")
	public static boolean method2400(@OriginalArg(0) int arg0) {
		return arg0 >= 4 && arg0 <= 8;
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(ILjava/lang/String;ILjava/lang/String;)V")
	public static void method2402(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		Static405.anInt6545 = arg1;
		Static90.aString12 = arg0;
		Static108.aString15 = arg2;
		if (Static108.aString15.equals("") || Static90.aString12.equals("")) {
			Static418.anInt6790 = 3;
		} else if (Static62.anInt1112 == -1) {
			Static291.anInt4798 = 0;
			Static418.anInt6790 = -3;
			Static218.anInt5614 = 0;
			Static144.anInt2432 = 1;
			@Pc(42) Class1_Sub11 local42 = new Class1_Sub11(128);
			local42.method4445(10);
			local42.method4450((int) (Math.random() * 9.9999999E7D));
			local42.method4446(Static86.method1266(Static108.aString15));
			local42.method4450((int) (Math.random() * 9.9999999E7D));
			local42.method4453(Static90.aString12);
			local42.method4450((int) (Math.random() * 9.9999999E7D));
			local42.method4455(Static230.aBigInteger3, Static272.aBigInteger2);
			Static75.aClass1_Sub11_Sub1_1.anInt5766 = 0;
			Static75.aClass1_Sub11_Sub1_1.method4445(Static335.aClass62_10.anInt1569);
			Static75.aClass1_Sub11_Sub1_1.method4445(local42.anInt5766 + 2);
			Static75.aClass1_Sub11_Sub1_1.method4448(589);
			Static75.aClass1_Sub11_Sub1_1.method4480(local42.aByteArray64, local42.anInt5766);
		} else {
			Static17.method269();
		}
	}
}
