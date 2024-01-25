import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static306 {

	@OriginalMember(owner = "client!mr", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString51 = null;

	@OriginalMember(owner = "client!mr", name = "f", descriptor = "[B")
	public static final byte[] aByteArray91 = new byte[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

	@OriginalMember(owner = "client!mr", name = "j", descriptor = "[I")
	public static int[] anIntArray564 = new int[2];

	@OriginalMember(owner = "client!mr", name = "l", descriptor = "[I")
	public static final int[] anIntArray565 = new int[1000];

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(IZ)V")
	public static void method4837(@OriginalArg(1) boolean arg0) {
		if (arg0 && Static118.aClass1_Sub1_Sub5_2 != null) {
			Static299.anInt5549 = Static118.aClass1_Sub1_Sub5_2.anInt3147;
		} else {
			Static299.anInt5549 = -1;
		}
		Static442.aClass37_83 = null;
		Static287.aClass156_13 = null;
		Static118.aClass1_Sub1_Sub5_2 = null;
		Static385.anInt6975 = 0;
		Static118.method831();
		Static118.aClass37_11.method967();
		Static210.aClass226_6 = null;
		Static351.anInt6257 = -1;
		Static268.aClass226_7 = null;
		Static89.aClass226_2 = null;
		Static470.aClass226_8 = null;
		Static24.aClass226_1 = null;
		Static340.anInt6093 = -1;
		Static97.aClass226_3 = null;
		Static234.aClass2_27 = null;
		Static534.aClass226_9 = null;
		Static333.aClass226_10 = null;
		Static118.aClass53_2 = null;
		if (Static118.aClass272_2 != null) {
			Static118.aClass272_2.method6381();
			Static118.aClass272_2.method6378(64, 128);
		}
		if (Static118.aClass257_3 != null) {
			Static118.aClass257_3.method6138(64, 64);
		}
		if (Static118.aClass96_2 != null) {
			Static118.aClass96_2.method2273(64);
		}
		Static37.aClass247_1.method5891(64);
	}

	@OriginalMember(owner = "client!mr", name = "b", descriptor = "(B)V")
	public static void method4839() {
		Static326.aClass156Array2 = null;
		Static347.method5282(0, 0, -1, Static350.anInt6255, Static83.anInt1567, Static170.anInt3050, 0, 0);
		if (Static326.aClass156Array2 != null) {
			Static449.method6412(Static83.anInt1567, -1412584499, 0, Static51.anInt1017, Static296.anInt4449, Static350.anInt6255, Static197.aClass156_16.anInt4679, 0, Static326.aClass156Array2);
			Static326.aClass156Array2 = null;
		}
	}

	@OriginalMember(owner = "client!mr", name = "c", descriptor = "(B)I")
	public static int method4842() {
		if (Static193.aFrame8 == null) {
			return Static359.aBoolean458 ? 2 : 1;
		} else {
			return 3;
		}
	}
}
