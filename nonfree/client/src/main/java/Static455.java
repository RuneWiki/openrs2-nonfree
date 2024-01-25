import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static455 {

	@OriginalMember(owner = "client!rg", name = "b", descriptor = "Z")
	public static boolean aBoolean611;

	@OriginalMember(owner = "client!rg", name = "f", descriptor = "F")
	public static float aFloat191;

	@OriginalMember(owner = "client!rg", name = "k", descriptor = "Lclient!ut;")
	public static Class4_Sub35_Sub1 aClass4_Sub35_Sub1_1;

	@OriginalMember(owner = "client!rg", name = "e", descriptor = "[I")
	public static final int[] anIntArray504 = new int[4];

	@OriginalMember(owner = "client!rg", name = "h", descriptor = "[Lclient!am;")
	public static final Class4_Sub3[] aClass4_Sub3Array6 = new Class4_Sub3[8];

	@OriginalMember(owner = "client!rg", name = "j", descriptor = "I")
	public static int anInt8657 = 0;

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(I)V")
	public static void method6675() {
		Static104.aClient3.method1518();
		Static566.method8002();
		Static531.anInt9752 = 0;
		Static79.aClass90_29 = null;
		Static595.aClass90_154 = null;
		Static528.aClass90_133 = null;
		Static549.aClass4_Sub13_Sub2_2.anInt9170 = 0;
		Static388.anInt7599 = 0;
		Static129.method2315();
		Static341.anInt6580 = 0;
		Static377.aString148 = null;
		Static523.aClass210Array1 = null;
		Static270.anInt5671 = 0;
		Static66.anInt1737 = 0;
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(IIBII)V")
	public static void method6676(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg3 > arg1) {
			Static238.method3886(Static442.anIntArrayArray48[arg2], arg3, arg0, arg1);
		} else {
			Static238.method3886(Static442.anIntArrayArray48[arg2], arg1, arg0, arg3);
		}
	}
}
