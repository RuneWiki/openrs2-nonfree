import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static579 {

	@OriginalMember(owner = "client!ws", name = "c", descriptor = "Lclient!jo;")
	public static Class168 aClass168_97;

	@OriginalMember(owner = "client!ws", name = "d", descriptor = "I")
	public static int anInt7897;

	@OriginalMember(owner = "client!ws", name = "b", descriptor = "[[B")
	public static final byte[][] aByteArrayArray27 = new byte[50][];

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(Lclient!oa;I)V")
	public static void method6612(@OriginalArg(0) Class9 arg0) {
		if (Static28.aBoolean82) {
			Static477.method7300(arg0);
		} else {
			Static277.method4596(arg0);
		}
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(I)V")
	public static void method6614() {
		@Pc(10) int local10 = Static104.aClass6_Sub6_Sub1_4.method1070(Static5.anInt145);
		if (local10 == 0) {
			Static68.aByteArrayArrayArray4 = null;
			Static188.method3614(0);
		} else if (local10 == 1) {
			Static110.method2274((byte) 0);
			Static188.method3614(512);
			if (Static356.aByteArrayArrayArray17 != null) {
				Static573.method8086();
			}
		} else {
			Static110.method2274((byte) (Static555.anInt9478 - 4 & 0xFF));
			Static188.method3614(2);
		}
		Static380.anInt7115 = Static493.anInt8836;
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(II)V")
	public static void method6616(@OriginalArg(0) int arg0) {
		if (Static463.anInt8569 == 0) {
			Static258.aClass6_Sub10_Sub1_2.method1544(arg0);
		} else {
			Static179.anInt3992 = arg0;
		}
	}
}
