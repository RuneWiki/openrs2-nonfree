import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static308 {

	@OriginalMember(owner = "client!lh", name = "k", descriptor = "[Lclient!f;")
	public static Class39[] aClass39Array10;

	@OriginalMember(owner = "client!lh", name = "g", descriptor = "Lclient!wp;")
	public static final Class363 aClass363_149 = new Class363(39, 12);

	@OriginalMember(owner = "client!lh", name = "l", descriptor = "[I")
	public static final int[] anIntArray407 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(IB)V")
	public static void method4595(@OriginalArg(0) int arg0) {
		Static135.anInt2838 = arg0;
		@Pc(7) Class313 local7 = Static6.aClass313_3;
		synchronized (Static6.aClass313_3) {
			Static6.aClass313_3.method6977();
		}
		local7 = Static30.aClass313_7;
		synchronized (Static30.aClass313_7) {
			Static30.aClass313_7.method6977();
		}
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(I)V")
	public static void method4597() {
		Static2.aClass196ArrayArray1 = new Class196[Static136.aClass259_54.method5962()][];
		Static348.aClass196ArrayArray2 = new Class196[Static136.aClass259_54.method5962()][];
		Static418.aBooleanArray28 = new boolean[Static136.aClass259_54.method5962()];
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(III)Lclient!vf;")
	public static Class346 method4598(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static389.aClass346ArrayArrayArray2[arg0][arg1][arg2] == null) {
			@Pc(28) boolean local28 = Static389.aClass346ArrayArrayArray2[0][arg1][arg2] != null && Static389.aClass346ArrayArrayArray2[0][arg1][arg2].aClass346_1 != null;
			if (local28 && arg0 >= Static89.anInt8689 - 1) {
				return null;
			}
			Static384.method7164(arg0, arg1, arg2);
		}
		return Static389.aClass346ArrayArrayArray2[arg0][arg1][arg2];
	}
}
