import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static136 {

	@OriginalMember(owner = "client!ke", name = "i", descriptor = "Lclient!lc;")
	public static Class98 aClass98_81;

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "Ljava/lang/String;")
	public static String aString88 = "Drop";

	@OriginalMember(owner = "client!ke", name = "b", descriptor = "Z")
	public static boolean aBoolean187 = false;

	@OriginalMember(owner = "client!ke", name = "c", descriptor = "[I")
	public static int[] anIntArray250 = new int[2500];

	@OriginalMember(owner = "client!ke", name = "g", descriptor = "[I")
	public static int[] anIntArray251 = new int[500];

	@OriginalMember(owner = "client!ke", name = "h", descriptor = "I")
	public static int anInt2804 = 0;

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(I)V")
	public static void method2177() {
		anIntArray251 = null;
		aString88 = null;
		anIntArray250 = null;
		aClass98_81 = null;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(Lclient!lc;Lclient!lc;BLclient!lc;)V")
	public static void method2178(@OriginalArg(0) Class98 arg0, @OriginalArg(1) Class98 arg1, @OriginalArg(3) Class98 arg2) {
		Static251.aClass98_143 = arg2;
		Static242.aClass98_149 = arg0;
		Static271.aClass98_159 = arg1;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIII)I")
	public static int method2179(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg0 & 0x3;
		if (local3 == 0) {
			return arg2;
		} else if (local3 == 1) {
			return 7 - arg1;
		} else if (local3 == 2) {
			return 7 - arg2;
		} else {
			return arg1;
		}
	}

	@OriginalMember(owner = "client!ke", name = "b", descriptor = "(I)V")
	public static void method2180() {
		Static34.aClass4_Sub2_Sub1Array2 = null;
		Static111.aClass4_Sub2_Sub1_3 = null;
		Static61.aClass4_Sub2_Sub1Array5 = null;
		Static240.aClass4_Sub2_Sub1_Sub1Array7 = null;
		Static39.aClass4_Sub2_Sub1Array12 = null;
		Static1.aClass4_Sub2_Sub1Array1 = null;
		Static88.aClass59Array2 = null;
		Static16.aClass4_Sub2_Sub12_Sub1_1 = null;
		Static254.aClass4_Sub2_Sub1Array11 = null;
		Static251.aClass4_Sub2_Sub1_9 = null;
		Static104.aClass4_Sub2_Sub1Array7 = null;
		Static55.aClass4_Sub2_Sub1Array4 = null;
		Static79.aClass4_Sub2_Sub12_2 = null;
		Static278.aClass4_Sub2_Sub1Array13 = null;
		Static10.aClass59Array1 = null;
		Static289.aClass4_Sub2_Sub12_3 = null;
		Static49.aClass4_Sub2_Sub12_1 = null;
		Static124.aClass4_Sub2_Sub1Array8 = null;
		Static81.aClass4_Sub2_Sub1Array10 = null;
	}
}
