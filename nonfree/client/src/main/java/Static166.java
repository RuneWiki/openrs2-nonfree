import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static166 {

	@OriginalMember(owner = "client!vb", name = "rb", descriptor = "Lclient!ah;")
	public static Class7 aClass7_65;

	@OriginalMember(owner = "client!vb", name = "yb", descriptor = "Lclient!mf;")
	public static Class30 aClass30_2;

	@OriginalMember(owner = "client!vb", name = "zb", descriptor = "Lclient!gf;")
	public static Class33 aClass33_14;

	@OriginalMember(owner = "client!vb", name = "eb", descriptor = "I")
	public static int anInt4029 = 0;

	@OriginalMember(owner = "client!vb", name = "fb", descriptor = "Lclient!ea;")
	public static Class23 aClass23_16 = new Class23();

	@OriginalMember(owner = "client!vb", name = "hb", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1405 = Static170.method3101(" Sekunde(Xn(Y -Ubertragen)3");

	@OriginalMember(owner = "client!vb", name = "Ab", descriptor = "[I")
	public static int[] anIntArray675 = new int[100];

	@OriginalMember(owner = "client!vb", name = "d", descriptor = "(Z)V")
	public static void method3061() {
		anIntArray675 = null;
		aClass23_16 = null;
		aClass30_2 = null;
		aClass28_1405 = null;
		aClass33_14 = null;
		aClass7_65 = null;
	}

	@OriginalMember(owner = "client!vb", name = "f", descriptor = "(I)V")
	public static void method3062() {
		Static156.aClass3_Sub3_Sub2_2.method1930();
		Static75.aClass7_32 = null;
		Static8.anInt1209 = 1;
	}

	@OriginalMember(owner = "client!vb", name = "g", descriptor = "(I)V")
	public static void method3063() {
		Static51.aClass3_Sub8_Sub1_2.method1559(91);
		for (@Pc(20) Class3_Sub7 local20 = (Class3_Sub7) Static119.aClass87_11.method3203(); local20 != null; local20 = (Class3_Sub7) Static119.aClass87_11.method3199()) {
			if (local20.anInt1547 == 0) {
				Static160.method2984(true, local20);
			}
		}
		if (Static175.aClass33_15 != null) {
			Static16.method534(Static175.aClass33_15);
			Static175.aClass33_15 = null;
		}
	}

	@OriginalMember(owner = "client!vb", name = "c", descriptor = "(B)V")
	public static void method3064() {
		for (@Pc(4) Class3_Sub25 local4 = (Class3_Sub25) Static24.aClass23_3.method858(); local4 != null; local4 = (Class3_Sub25) Static24.aClass23_3.method861()) {
			if (local4.anInt4182 > 0) {
				local4.anInt4182--;
			}
			if (local4.anInt4182 != 0) {
				if (local4.anInt4179 > 0) {
					local4.anInt4179--;
				}
				if (local4.anInt4179 == 0 && local4.anInt4177 >= 1 && local4.anInt4168 >= 1 && local4.anInt4177 <= 102 && local4.anInt4168 <= 102 && (local4.anInt4170 < 0 || Static135.method2644(local4.anInt4171, local4.anInt4170))) {
					Static19.method577(local4.anInt4173, local4.anInt4168, local4.anInt4181, local4.anInt4171, local4.anInt4177, local4.anInt4180, local4.anInt4170);
					local4.anInt4179 = -1;
					if (local4.anInt4175 == local4.anInt4170 && local4.anInt4175 == -1) {
						local4.method3167();
					} else if (local4.anInt4170 == local4.anInt4175 && local4.anInt4180 == local4.anInt4174 && local4.anInt4169 == local4.anInt4171) {
						local4.method3167();
					}
				}
			} else if (local4.anInt4175 < 0 || Static135.method2644(local4.anInt4169, local4.anInt4175)) {
				Static19.method577(local4.anInt4173, local4.anInt4168, local4.anInt4181, local4.anInt4169, local4.anInt4177, local4.anInt4174, local4.anInt4175);
				local4.method3167();
			}
		}
	}
}
