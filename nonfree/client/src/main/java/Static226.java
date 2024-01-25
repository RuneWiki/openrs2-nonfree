import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static226 {

	@OriginalMember(owner = "client!le", name = "o", descriptor = "F")
	public static float aFloat37;

	@OriginalMember(owner = "client!le", name = "n", descriptor = "Lclient!rb;")
	public static final Class211 aClass211_87 = new Class211(47, 2);

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IZI)Z")
	public static boolean method2967(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static320.method4350(arg1, arg0) | (arg0 & 0x70000) != 0 || Static255.method3255(arg0, arg1);
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(Z)[Lclient!tp;")
	public static Class236[] method2968() {
		return new Class236[] { Static167.aClass236_1, Static167.aClass236_2, Static167.aClass236_3, Static167.aClass236_4, Static167.aClass236_5, Static167.aClass236_6, Static167.aClass236_7, Static167.aClass236_8, Static167.aClass236_9, Static167.aClass236_10, Static167.aClass236_11, Static167.aClass236_12 };
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(III)I")
	public static int method2969(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return arg0 == 4 || arg0 == 5 ? Static454.anIntArray644[arg1 & 0x3] : 256;
	}

	@OriginalMember(owner = "client!le", name = "c", descriptor = "(I)V")
	public static void method2970() {
		Static29.method451(Static223.aClass102_201);
		Static456.aClass2_Sub13_Sub2_2.method3602(Static284.method3772());
		Static456.aClass2_Sub13_Sub2_2.method3568(Static141.anInt2513);
		Static456.aClass2_Sub13_Sub2_2.method3568(Static314.anInt5426);
		Static456.aClass2_Sub13_Sub2_2.method3602(Static2.aClass148_Sub1_1.anInt3796);
	}
}
