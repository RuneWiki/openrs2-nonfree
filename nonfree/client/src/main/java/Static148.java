import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static148 {

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "I")
	public static int anInt3025;

	@OriginalMember(owner = "client!kn", name = "d", descriptor = "I")
	public static int anInt3027;

	@OriginalMember(owner = "client!kn", name = "e", descriptor = "Lclient!ah;")
	public static Class6 aClass6_5;

	@OriginalMember(owner = "client!kn", name = "i", descriptor = "[B")
	public static byte[] aByteArray91;

	@OriginalMember(owner = "client!kn", name = "m", descriptor = "Lclient!nm;")
	public static Class119 aClass119_59;

	@OriginalMember(owner = "client!kn", name = "c", descriptor = "F")
	public static float aFloat64 = 0.0F;

	@OriginalMember(owner = "client!kn", name = "f", descriptor = "[I")
	public static int[] anIntArray258 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

	@OriginalMember(owner = "client!kn", name = "g", descriptor = "I")
	public static int anInt3028 = 0;

	@OriginalMember(owner = "client!kn", name = "n", descriptor = "I")
	public static int anInt3033 = -1;

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(II)V")
	public static void method2588(@OriginalArg(1) int arg0) {
		Static73.anInt1575 = 100;
		Static48.anInt1079 = -1;
		Static225.anInt4217 = arg0;
		Static145.anInt2809 = 3;
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	public static void method2589(@OriginalArg(0) Component arg0) {
		arg0.removeKeyListener(Static94.aClass138_1);
		arg0.removeFocusListener(Static94.aClass138_1);
		Static310.anInt5532 = -1;
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(I)I")
	public static int method2590() {
		return ((Static167.anInt638 == 0 ? 0 : 1) << 22) + ((Static147.anInt5168 & 0x3) << 11) + ((Static142.aBoolean243 ? 1 : 0) << 9) + ((Static271.aBoolean476 ? 1 : 0) << 7) + ((Static286.aBoolean488 ? 1 : 0) << 6) + ((Static41.aBoolean79 ? 1 : 0) << 5) + ((Static128.aBoolean223 ? 1 : 0) << 4) + (Static153.anInt2340 & 0x7) + ((Static252.aBoolean432 ? 1 : 0) << 3) + ((Static174.aBoolean528 ? 1 : 0) << 8) + ((Static294.aBoolean109 ? 1 : 0) << 10) - (-((Static69.aBoolean146 ? 1 : 0) << 13) - ((Static43.aBoolean88 ? 1 : 0) << 15)) + ((Static222.aBoolean379 ? 1 : 0) << 16) + (Static19.anInt422 << 17) + ((Static230.aBoolean388 ? 1 : 0) << 19) + ((Static253.anInt4650 == 0 ? 0 : 1) << 20) + ((Static172.anInt3363 == 0 ? 0 : 1) << 21) + (Static52.method967() << 23);
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(BILclient!si;I)V")
	public static void method2592(@OriginalArg(1) int arg0, @OriginalArg(2) Class157 arg1, @OriginalArg(3) int arg2) {
		if (arg1.aByte15 == 0) {
			arg1.anInt4729 = arg1.anInt4738;
		} else if (arg1.aByte15 == 1) {
			arg1.anInt4729 = (arg0 - arg1.anInt4680) / 2 + arg1.anInt4738;
		} else if (arg1.aByte15 == 2) {
			arg1.anInt4729 = arg0 - arg1.anInt4680 - arg1.anInt4738;
		} else if (arg1.aByte15 == 3) {
			arg1.anInt4729 = arg0 * arg1.anInt4738 >> 14;
		} else if (arg1.aByte15 == 4) {
			arg1.anInt4729 = (arg0 * arg1.anInt4738 >> 14) + (arg0 - arg1.anInt4680) / 2;
		} else {
			arg1.anInt4729 = arg0 - (arg0 * arg1.anInt4738 >> 14) - arg1.anInt4680;
		}
		if (arg1.aByte16 == 0) {
			arg1.anInt4715 = arg1.anInt4744;
		} else if (arg1.aByte16 == 1) {
			arg1.anInt4715 = arg1.anInt4744 + (arg2 - arg1.anInt4689) / 2;
		} else if (arg1.aByte16 == 2) {
			arg1.anInt4715 = arg2 - arg1.anInt4689 - arg1.anInt4744;
		} else if (arg1.aByte16 == 3) {
			arg1.anInt4715 = arg1.anInt4744 * arg2 >> 14;
		} else if (arg1.aByte16 == 4) {
			arg1.anInt4715 = (arg2 - arg1.anInt4689) / 2 + (arg2 * arg1.anInt4744 >> 14);
		} else {
			arg1.anInt4715 = arg2 - (arg1.anInt4744 * arg2 >> 14) - arg1.anInt4689;
		}
		if (!Static26.aBoolean54 || Static42.method777(arg1).anInt1322 == 0 && arg1.anInt4748 != 0) {
			return;
		}
		if (arg1.anInt4729 < 0) {
			arg1.anInt4729 = 0;
		} else if (arg0 < arg1.anInt4680 + arg1.anInt4729) {
			arg1.anInt4729 = arg0 - arg1.anInt4680;
		}
		if (arg1.anInt4715 < 0) {
			arg1.anInt4715 = 0;
		} else if (arg1.anInt4689 + arg1.anInt4715 > arg2) {
			arg1.anInt4715 = arg2 - arg1.anInt4689;
		}
	}
}
