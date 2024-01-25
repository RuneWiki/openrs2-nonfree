import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static129 {

	@OriginalMember(owner = "client!ev", name = "n", descriptor = "I")
	public static int anInt2624 = -1;

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(IIII)Z")
	public static boolean method2210(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		Static301.aClass209_5.method6358(arg0, arg1, arg2, Static299.anIntArray350);
		@Pc(13) int local13 = Static299.anIntArray350[2];
		if (local13 < 50) {
			return false;
		} else {
			Static299.anIntArray350[1] = Static299.anIntArray350[1] * Static425.anInt7203 / local13 + Static544.anInt8951;
			Static299.anIntArray350[0] = Static465.anInt7899 * Static299.anIntArray350[0] / local13 + Static446.anInt7726;
			Static299.anIntArray350[2] = local13;
			return true;
		}
	}

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(B)V")
	public static void method2211() {
		Static174.aClass12_9.pa(Static50.anInt1272, Static479.aClass1_Sub7_Sub1_1.aBoolean230 ? Static403.anInt6917 + 256 << 2 : -1, 0);
	}

	@OriginalMember(owner = "client!ev", name = "b", descriptor = "(I)[Lclient!rr;")
	public static Class290[] method2218() {
		return new Class290[] { Static187.aClass290_4, Static248.aClass290_2, Static433.aClass290_6 };
	}
}
