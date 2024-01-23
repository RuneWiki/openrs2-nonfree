import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static116 {

	@OriginalMember(owner = "client!jj", name = "f", descriptor = "[I")
	public static int[] anIntArray217 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

	@OriginalMember(owner = "client!jj", name = "i", descriptor = "[I")
	public static int[] anIntArray219 = new int[4096];

	@OriginalMember(owner = "client!jj", name = "j", descriptor = "I")
	public static int anInt3022 = -1;

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(II)V")
	public static void method2304(@OriginalArg(1) int arg0) {
		Static122.aClass1_Sub2_Sub11_2 = (Class1_Sub2_Sub11) Static203.aClass140_12.method4014((long) arg0);
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(I)V")
	public static void method2306() {
		Static242.aClass79_36.method2487();
	}

	@OriginalMember(owner = "client!jj", name = "b", descriptor = "(I)V")
	public static void method2307() {
		for (@Pc(3) int local3 = 0; local3 < 5; local3++) {
			Static125.aBooleanArray8[local3] = false;
		}
		Static99.anInt2713 = -1;
		Static10.anInt384 = 0;
		Static187.anInt4200 = -1;
		Static61.anInt1682 = 5;
		Static38.anInt1012 = 0;
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(IIBII)V")
	public static void method2308(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(11) int local11 = 0; local11 < Static255.anInt5426; local11++) {
			if (Static67.anIntArray143[local11] + Static141.anIntArray178[local11] > arg3 && Static141.anIntArray178[local11] < arg1 + arg3 && Static76.anIntArray156[local11] + Static165.anIntArray291[local11] > arg2 && Static165.anIntArray291[local11] < arg2 + arg0) {
				Static186.aBooleanArray17[local11] = true;
			}
		}
	}
}
