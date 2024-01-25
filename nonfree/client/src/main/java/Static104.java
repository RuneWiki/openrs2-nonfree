import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static104 {

	@OriginalMember(owner = "client!eu", name = "c", descriptor = "Lclient!ac;")
	public static Class3 aClass3_5;

	@OriginalMember(owner = "client!eu", name = "b", descriptor = "Lclient!ri;")
	public static final Class214 aClass214_249 = new Class214(95, 6);

	@OriginalMember(owner = "client!eu", name = "d", descriptor = "I")
	public static int anInt7242 = 0;

	@OriginalMember(owner = "client!eu", name = "f", descriptor = "Lclient!ng;")
	public static final Class167 aClass167_99 = new Class167(4);

	@OriginalMember(owner = "client!eu", name = "g", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray8 = new boolean[][] { new boolean[4], new boolean[4], { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, new boolean[4], new boolean[4], new boolean[4], new boolean[4] };

	@OriginalMember(owner = "client!eu", name = "h", descriptor = "[Lclient!gr;")
	public static Class98[] aClass98Array2 = new Class98[50];

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(FFFII)F")
	public static float method5470(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3) {
		@Pc(12) float[] local12 = Static395.aFloatArrayArray19[arg3];
		return local12[2] * arg0 + arg1 * local12[1] + arg2 * local12[0];
	}

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(Z)V")
	public static void method5472() {
		Static350.aClass167_83.method3390();
	}
}
