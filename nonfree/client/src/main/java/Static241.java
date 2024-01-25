import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static241 {

	@OriginalMember(owner = "client!pm", name = "d", descriptor = "Lclient!ir;")
	public static Class100 aClass100_97;

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray12 = new boolean[][] { new boolean[4], { false, true, true, false }, { true, false, true, false }, { true, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { true, true, false, false }, new boolean[4], { false, true, false, true }, new boolean[4] };

	@OriginalMember(owner = "client!pm", name = "b", descriptor = "Ljava/lang/String;")
	public static String aString179 = "glow3:";

	@OriginalMember(owner = "client!pm", name = "f", descriptor = "[I")
	public static final int[] anIntArray391 = new int[] { 4, 4, 1, 2, 6, 4, 2, 48, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(IIILclient!on;)V")
	public static void method4148(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class5_Sub3 arg3) {
		if (Static256.aClass45ArrayArrayArray2[arg0][arg1][arg2] == null) {
			Static128.method2212(arg0, arg1, arg2);
		}
		Static256.aClass45ArrayArrayArray2[arg0][arg1][arg2].aClass5_Sub3_1 = arg3;
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(Lclient!ir;I)V")
	public static void method4150(@OriginalArg(0) Class100 arg0) {
		Static170.aClass100_122 = arg0;
	}
}
