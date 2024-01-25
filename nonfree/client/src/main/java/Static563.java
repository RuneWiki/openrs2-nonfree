import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static563 {

	@OriginalMember(owner = "client!tw", name = "d", descriptor = "I")
	public static int anInt9268;

	@OriginalMember(owner = "client!tw", name = "g", descriptor = "[[[Z")
	public static boolean[][][] aBooleanArrayArrayArray2;

	@OriginalMember(owner = "client!tw", name = "n", descriptor = "F")
	public static float aFloat194;

	@OriginalMember(owner = "client!tw", name = "p", descriptor = "F")
	public static float aFloat195;

	@OriginalMember(owner = "client!tw", name = "k", descriptor = "Lclient!kaa;")
	public static final Class181 aClass181_83 = new Class181(25, -1);

	@OriginalMember(owner = "client!tw", name = "o", descriptor = "Lclient!kaa;")
	public static final Class181 aClass181_84 = new Class181(79, -1);

	@OriginalMember(owner = "client!tw", name = "q", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray16 = new boolean[][] { new boolean[13], { false, false, true, true, true, true, true, false, false, false, false, false, true }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { false, true, true, true, true, true, false, false, false, false, false, false, true }, { false, true, true, true, true, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, false, true, true, true, true, true, true, false, false, true, true, false }, { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true } };

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "(BLclient!wu;Lclient!wu;Lclient!wu;Lclient!wu;)V")
	public static void method7912(@OriginalArg(1) Class384 arg0, @OriginalArg(2) Class384 arg1, @OriginalArg(3) Class384 arg2, @OriginalArg(4) Class384 arg3) {
		Static345.aClass384_87 = arg0;
		Static42.aClass384_21 = arg3;
		Static270.aClass384_70 = arg2;
		Static441.aClass357ArrayArray1 = new Class357[Static42.aClass384_21.method8865()][];
		Static128.aBooleanArray12 = new boolean[Static42.aClass384_21.method8865()];
	}

	@OriginalMember(owner = "client!tw", name = "b", descriptor = "(III)Z")
	public static boolean method7913(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static620.method8539(arg1, arg0) | (arg1 & 0x800) != 0 || Static194.method3065(arg1, arg0);
	}
}
