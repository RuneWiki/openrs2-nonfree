import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static130 {

	@OriginalMember(owner = "client!en", name = "vb", descriptor = "I")
	public static int anInt2298;

	@OriginalMember(owner = "client!en", name = "gb", descriptor = "[[I")
	public static final int[][] anIntArrayArray18 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } };

	@OriginalMember(owner = "client!en", name = "i", descriptor = "(I)V")
	public static void method2062() {
		Static567.method7826(Static58.aClass6_Sub17_Sub1_1.aBoolean600);
		Static139.aClass6_Sub15_Sub3_1 = new Class6_Sub15_Sub3();
		Static139.aClass6_Sub15_Sub3_1.method6648();
		Static431.aClass189_2 = Static26.method357(22050, Static77.aCanvas1, Static174.aClass313_24, 0);
		Static431.aClass189_2.method4937(Static139.aClass6_Sub15_Sub3_1);
		Static336.method5161(Static35.aClass248_8, Static492.aClass248_96, Static139.aClass6_Sub15_Sub3_1, Static460.aClass248_89);
		Static271.aClass189_1 = Static26.method357(2048, Static77.aCanvas1, Static174.aClass313_24, 1);
		Static204.aClass6_Sub15_Sub1_1 = new Class6_Sub15_Sub1();
		Static271.aClass189_1.method4937(Static204.aClass6_Sub15_Sub1_1);
		Static446.aClass96_1 = new Class96(22050, Static313.anInt6055);
		Static17.anInt235 = Static262.aClass248_36.method5777("scape main");
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(ZIIIIII)V")
	public static void method2064(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static478.anInt8409 = arg2;
		Static450.anInt7954 = arg1;
		Static427.anInt7589 = arg4;
		Static577.anInt9916 = arg5;
		Static274.anInt4850 = arg3;
		if (arg0 && Static274.anInt4850 >= 100) {
			Static208.anInt3949 = Static478.anInt8409 * 512 + 256;
			Static378.anInt6923 = Static577.anInt9916 * 512 + 256;
			Static12.anInt183 = Static37.method631(Static208.anInt3949, Static378.anInt6923, Static391.anInt7128) - Static427.anInt7589;
		}
		Static60.anInt1008 = 2;
	}
}
