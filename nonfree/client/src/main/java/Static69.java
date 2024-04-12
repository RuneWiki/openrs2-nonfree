import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static69 {

	@OriginalMember(owner = "client!od", name = "c", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray9;

	@OriginalMember(owner = "client!od", name = "z", descriptor = "I")
	public static int anInt1832;

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(I)V", line = 25)
	public static void method1219() {
		Class44.aClass40_527 = null;
		Class44.aClass40_528 = null;
		Class44.aClass40_529 = null;
		aByteArrayArrayArray9 = null;
		Class44.aClass43Array1 = null;
		Class44.aClass40_530 = null;
	}

	@OriginalMember(owner = "client!od", name = "e", descriptor = "(I)V", line = 217)
	public static void method1227() {
		for (@Pc(3) int local3 = 0; local3 < Class41.anInt1800; local3++) {
			@Pc(9) int local9 = Class2_Sub2_Sub13.anIntArray326[local3];
			@Pc(13) Class2_Sub2_Sub12_Sub1_Sub2 local13 = Class3.aClass2_Sub2_Sub12_Sub1_Sub2Array1[local9];
			if (local13 != null) {
				Static83.method1468(local13, local13.aClass2_Sub2_Sub7_1.anInt758);
			}
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(II)Z", line = 270)
	public static boolean method1228(@OriginalArg(0) int arg0) {
		if (arg0 < 32) {
			return false;
		} else if (arg0 == 127) {
			return false;
		} else {
			return arg0 < 129 || arg0 > 159;
		}
	}

	@OriginalMember(owner = "client!od", name = "f", descriptor = "(I)V", line = 330)
	public static void method1230() {
		Static2.aClass45_2.method1476();
		Static96.anIntArray548 = Static6.method175(Static96.anIntArray548);
	}
}
