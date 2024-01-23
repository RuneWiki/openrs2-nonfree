import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static215 {

	@OriginalMember(owner = "client!sf", name = "c", descriptor = "Lclient!hc;")
	public static Class51 aClass51_69;

	@OriginalMember(owner = "client!sf", name = "g", descriptor = "I")
	public static int anInt4738;

	@OriginalMember(owner = "client!sf", name = "e", descriptor = "I")
	public static int anInt4736 = 0;

	@OriginalMember(owner = "client!sf", name = "b", descriptor = "(B)Lclient!ge;")
	public static Class7_Sub1 method3533() {
		@Pc(25) Class7_Sub1 local25 = new Class7_Sub1(Static24.anInt806, Static240.anInt5164, Static202.anIntArray345[0], Static79.anIntArray165[0], Static218.anIntArray382[0], Static233.anIntArray438[0], Static11.aByteArrayArray1[0], Static102.anIntArray201);
		Static259.method4155();
		return local25;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(I)V")
	public static void method3534() {
		for (@Pc(6) Class1_Sub28 local6 = (Class1_Sub28) Static25.aClass3_3.method30(); local6 != null; local6 = (Class1_Sub28) Static25.aClass3_3.method33()) {
			if (local6.aBoolean252) {
				local6.method3671();
			}
		}
		for (@Pc(30) Class1_Sub28 local30 = (Class1_Sub28) Static87.aClass3_10.method30(); local30 != null; local30 = (Class1_Sub28) Static87.aClass3_10.method33()) {
			if (local30.aBoolean252) {
				local30.method3671();
			}
		}
	}
}
