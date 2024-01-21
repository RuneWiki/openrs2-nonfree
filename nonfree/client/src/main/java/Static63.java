import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static63 {

	@OriginalMember(owner = "client!h", name = "P", descriptor = "[[S")
	public static short[][] aShortArrayArray6;

	@OriginalMember(owner = "client!h", name = "S", descriptor = "Lclient!fd;")
	public static Class20 aClass20_5;

	@OriginalMember(owner = "client!h", name = "Y", descriptor = "[Lclient!ba;")
	public static Class1_Sub2_Sub1_Sub3[] aClass1_Sub2_Sub1_Sub3Array8;

	@OriginalMember(owner = "client!h", name = "T", descriptor = "I")
	public static int anInt1919 = -1;

	@OriginalMember(owner = "client!h", name = "U", descriptor = "[I")
	public static int[] anIntArray196 = new int[32];

	@OriginalMember(owner = "client!h", name = "X", descriptor = "[I")
	public static int[] anIntArray197 = new int[4000];

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIII)V")
	public static void method1431(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(12) int local12 = 0; local12 < Static125.anInt3241; local12++) {
			if (arg1 < Static132.anIntArray330[local12] + Static181.anIntArray448[local12] && arg2 + arg1 > Static181.anIntArray448[local12] && arg3 < Static26.anIntArray111[local12] + Static123.anIntArray308[local12] && Static123.anIntArray308[local12] < arg0 + arg3) {
				Static28.aBooleanArray19[local12] = true;
			}
		}
	}

	@OriginalMember(owner = "client!h", name = "e", descriptor = "(I)V")
	public static void method1432() {
		aClass20_5 = null;
		anIntArray197 = null;
		anIntArray196 = null;
		aClass1_Sub2_Sub1_Sub3Array8 = null;
		aShortArrayArray6 = null;
	}
}
