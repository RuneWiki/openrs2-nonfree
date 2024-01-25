import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static35 {

	@OriginalMember(owner = "client!bn", name = "f", descriptor = "I")
	public static int anInt570;

	@OriginalMember(owner = "client!bn", name = "k", descriptor = "Lclient!kg;")
	public static final Class146 aClass146_16 = new Class146(80, -1);

	@OriginalMember(owner = "client!bn", name = "n", descriptor = "[B")
	public static final byte[] aByteArray2 = new byte[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

	@OriginalMember(owner = "client!bn", name = "s", descriptor = "I")
	public static int anInt575 = 0;

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(I)V")
	public static void method465() {
		Static172.aClass135_4.B(Static309.aFloat57 * ((float) Static413.aClass49_Sub1_1.anInt3220 * 0.1F + 0.7F));
		Static172.aClass135_4.T(Static34.anInt2152, Static214.aFloat44, Static131.aFloat25, (float) (Static33.anInt535 << 0), (float) (Static151.anInt2740 << 0), (float) (Static280.anInt4635 << 0));
		Static172.aClass135_4.method5347(Static374.aClass3_5);
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(II)V")
	public static void method468(@OriginalArg(0) int arg0) {
		if (Static241.anInt4046 == arg0) {
			return;
		}
		Static337.anInt5497 = Static282.anInt4644 = Static429.anIntArray530[arg0];
		Static157.method2230();
		Static184.anIntArrayArrayArray3 = new int[4][Static337.anInt5497 >> 3][Static282.anInt4644 >> 3];
		Static401.anIntArrayArray57 = new int[Static337.anInt5497][Static282.anInt4644];
		Static138.anIntArrayArray30 = new int[Static337.anInt5497][Static282.anInt4644];
		for (@Pc(44) int local44 = 0; local44 < 4; local44++) {
			Static409.aClass128Array1[local44] = Static49.method641(Static337.anInt5497, Static282.anInt4644);
		}
		Static267.aByteArrayArrayArray14 = new byte[4][Static337.anInt5497][Static282.anInt4644];
		Static193.method1144(Static282.anInt4644, Static337.anInt5497);
		Static165.method2303(Static39.aClass135_1, Static282.anInt4644 >> 3, Static337.anInt5497 >> 3);
		Static241.anInt4046 = arg0;
	}
}
