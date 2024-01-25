import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static159 {

	@OriginalMember(owner = "client!g", name = "e", descriptor = "F")
	public static float aFloat58;

	@OriginalMember(owner = "client!g", name = "i", descriptor = "I")
	public static int anInt2496;

	@OriginalMember(owner = "client!g", name = "c", descriptor = "Lclient!nfa;")
	public static final Class236 aClass236_2 = new Class236(128);

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(IZI)I")
	public static int method2133(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return arg1 == 1 || arg1 == 3 ? Static78.anIntArray137[arg0 & 0x3] : Static510.anIntArray547[arg0 & 0x3];
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(IIIIIIZI)V")
	public static void method2134(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(7) int arg5) {
		if (Static257.aClass2_Sub35_Sub1_1.anInt7505 != 0 && arg2 != 0 && Static276.anInt4784 < 50 && arg0 != -1) {
			Static537.aClass67Array1[Static276.anInt4784++] = new Class67((byte) 2, arg0, arg2, arg5, arg3, arg4, arg1, null);
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(II)Lclient!np;")
	public static Class243 method2136(@OriginalArg(1) int arg0) {
		return arg0 >= 0 && arg0 < 100 ? Static40.aClass243Array1[arg0] : null;
	}
}
