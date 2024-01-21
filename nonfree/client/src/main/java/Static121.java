import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static121 {

	@OriginalMember(owner = "client!va", name = "z", descriptor = "Lclient!ue;")
	public static Class1_Sub2_Sub2_Sub4 aClass1_Sub2_Sub2_Sub4_20;

	@OriginalMember(owner = "client!va", name = "E", descriptor = "Lclient!oc;")
	public static Class56 aClass56_91;

	@OriginalMember(owner = "client!va", name = "x", descriptor = "Lclient!p;")
	public static Class63 aClass63_26 = new Class63(64);

	@OriginalMember(owner = "client!va", name = "B", descriptor = "I")
	public static int anInt2875 = 99;

	@OriginalMember(owner = "client!va", name = "F", descriptor = "Lclient!fc;")
	public static Class25 aClass25_1392 = Static78.method1313("Abbrechen");

	@OriginalMember(owner = "client!va", name = "G", descriptor = "Lclient!fc;")
	public static Class25 aClass25_1393 = Static78.method1313("oder benutzen Sie eine andere Welt)3");

	@OriginalMember(owner = "client!va", name = "H", descriptor = "I")
	public static int anInt2877 = 0;

	@OriginalMember(owner = "client!va", name = "c", descriptor = "(I)V")
	public static void method1991() {
		aClass56_91 = null;
		aClass25_1393 = null;
		aClass25_1392 = null;
		aClass63_26 = null;
		aClass1_Sub2_Sub2_Sub4_20 = null;
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(ZZ)V")
	public static void method1992(@OriginalArg(1) boolean arg0) {
		Static106.method1722();
		Static3.anInt56++;
		if (Static3.anInt56 < 50 && !arg0) {
			return;
		}
		Static3.anInt56 = 0;
		if (Static25.aBoolean22 || Static100.aClass77_5 == null) {
			return;
		}
		Static68.aClass1_Sub5_Sub1_2.method688(10);
		try {
			Static100.aClass77_5.method1904(Static68.aClass1_Sub5_Sub1_2.anInt792, Static68.aClass1_Sub5_Sub1_2.aByteArray13);
			Static68.aClass1_Sub5_Sub1_2.anInt792 = 0;
		} catch (@Pc(43) IOException local43) {
			Static25.aBoolean22 = true;
		}
	}
}
