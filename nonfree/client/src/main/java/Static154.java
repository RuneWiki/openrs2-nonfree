import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static154 {

	@OriginalMember(owner = "client!td", name = "T", descriptor = "I")
	public static int anInt3325;

	@OriginalMember(owner = "client!td", name = "Y", descriptor = "[I")
	public static int[] anIntArray354;

	@OriginalMember(owner = "client!td", name = "q", descriptor = "Lclient!sa;")
	public static Class72 aClass72_25 = new Class72(64);

	@OriginalMember(owner = "client!td", name = "x", descriptor = "I")
	public static int anInt3314 = 0;

	@OriginalMember(owner = "client!td", name = "S", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1448 = Static51.method932("<img=0>");

	@OriginalMember(owner = "client!td", name = "U", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1449 = Static51.method932("Suche nach Updates )2 ");

	@OriginalMember(owner = "client!td", name = "V", descriptor = "I")
	public static int anInt3326 = -1;

	@OriginalMember(owner = "client!td", name = "W", descriptor = "[I")
	public static int[] anIntArray353 = new int[32];

	@OriginalMember(owner = "client!td", name = "X", descriptor = "[[I")
	public static int[][] anIntArrayArray36 = new int[][] { { 1, 1 }, { -1, 1 }, { 1, -1 }, { -1, -1 } };

	@OriginalMember(owner = "client!td", name = "b", descriptor = "(B)V")
	public static void method2384() {
		aClass72_25 = null;
		aClass10_1449 = null;
		anIntArrayArray36 = null;
		anIntArray353 = null;
		aClass10_1448 = null;
		anIntArray354 = null;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(Lclient!fa;I)V")
	public static void method2385(@OriginalArg(0) Class23 arg0) {
		@Pc(11) int local11 = arg0.anInt1088;
		if (local11 == 324) {
			if (Static6.anInt173 == -1) {
				Static68.anInt1626 = arg0.anInt1026;
				Static6.anInt173 = arg0.anInt1033;
			}
			if (Static12.aClass74_1.aBoolean141) {
				arg0.anInt1033 = Static6.anInt173;
			} else {
				arg0.anInt1033 = Static68.anInt1626;
			}
		} else if (local11 == 325) {
			if (Static6.anInt173 == -1) {
				Static68.anInt1626 = arg0.anInt1026;
				Static6.anInt173 = arg0.anInt1033;
			}
			if (Static12.aClass74_1.aBoolean141) {
				arg0.anInt1033 = Static68.anInt1626;
			} else {
				arg0.anInt1033 = Static6.anInt173;
			}
		} else if (local11 == 327) {
			arg0.anInt1058 = 150;
			arg0.anInt1044 = (int) (Math.sin((double) Static14.anInt386 / 40.0D) * 256.0D) & 0x7FF;
			arg0.anInt1093 = 5;
			arg0.anInt1034 = 0;
		} else if (local11 == 328) {
			arg0.anInt1058 = 150;
			arg0.anInt1044 = (int) (Math.sin((double) Static14.anInt386 / 40.0D) * 256.0D) & 0x7FF;
			arg0.anInt1093 = 5;
			arg0.anInt1034 = 1;
		}
	}
}
