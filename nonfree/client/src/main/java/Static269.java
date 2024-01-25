import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static269 {

	@OriginalMember(owner = "client!r", name = "d", descriptor = "[[B")
	public static byte[][] aByteArrayArray17;

	@OriginalMember(owner = "client!r", name = "a", descriptor = "I")
	public static int anInt5158 = 0;

	@OriginalMember(owner = "client!r", name = "c", descriptor = "[I")
	public static final int[] anIntArray394 = new int[1000];

	@OriginalMember(owner = "client!r", name = "g", descriptor = "I")
	public static int anInt5162 = 0;

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public static int method4544(@OriginalArg(0) String arg0) {
		return Static200.method5054(arg0, 10);
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(III)V")
	public static void method4545(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class5_Sub9_Sub16 local13 = Static239.method4052(5, arg0);
		local13.method4140();
		local13.anInt4723 = arg1;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IB)I")
	public static int method4546(@OriginalArg(0) int arg0) {
		if (Static95.aClass68_23 != null) {
			Static95.aClass68_23.method1994();
			Static95.aClass68_23 = null;
		}
		Static138.anInt2775++;
		if (Static138.anInt2775 > 4) {
			Static333.anInt4627 = 0;
			Static138.anInt2775 = 0;
			return arg0;
		}
		Static333.anInt4627 = 0;
		if (Static134.anInt2748 == Static162.anInt3270) {
			Static162.anInt3270 = Static108.anInt2320;
		} else {
			Static162.anInt3270 = Static134.anInt2748;
		}
		return -1;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIZZ)V")
	public static void method4548(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) boolean arg4) {
		Static12.anInt378 = arg0;
		Static248.anInt4822 = arg1;
		Static98.anInt2185 = arg2;
		Static275.aClass51ArrayArrayArray3 = new Class51[4][Static12.anInt378][Static248.anInt4822];
		Static262.aClass3Array3 = new Class3[4];
		if (arg3) {
			Static147.aClass51ArrayArrayArray2 = new Class51[1][Static12.anInt378][Static248.anInt4822];
			Static267.anIntArrayArray40 = new int[Static12.anInt378][Static248.anInt4822];
			Static93.aClass3Array1 = new Class3[1];
		} else {
			Static147.aClass51ArrayArrayArray2 = null;
			Static267.anIntArrayArray40 = null;
			Static93.aClass3Array1 = null;
		}
		if (arg4) {
			Static318.anIntArrayArrayArray19 = new int[4][arg0][arg1];
			Static233.aClass5_Sub13_Sub1Array3 = new Class5_Sub13_Sub1[255];
			Static105.aBooleanArray7 = new boolean[255];
			Static132.anInt2864 = 0;
		} else {
			Static318.anIntArrayArrayArray19 = null;
			Static233.aClass5_Sub13_Sub1Array3 = null;
			Static105.aBooleanArray7 = null;
			Static132.anInt2864 = 0;
		}
		Static164.method3036(false);
		Static225.aClass183Array1 = new Class183[500];
		Static5.anInt176 = 0;
		Static237.aClass183Array2 = new Class183[500];
		Static250.anInt4854 = 0;
		Static200.anIntArrayArrayArray16 = new int[4][Static12.anInt378 + 1][Static248.anInt4822 + 1];
		Static108.aClass25_Sub1Array3 = new Class25_Sub1[5000];
		Static77.anInt1849 = 0;
		Static240.aBooleanArrayArray31 = new boolean[Static98.anInt2185 + Static98.anInt2185 + 1][Static98.anInt2185 + Static98.anInt2185 + 1];
		Static187.aBooleanArrayArray43 = new boolean[Static98.anInt2185 + Static98.anInt2185 + 2][Static98.anInt2185 + Static98.anInt2185 + 2];
		Static134.aClass28_1 = null;
	}
}
