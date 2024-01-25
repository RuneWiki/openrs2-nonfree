import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static149 {

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "[Lclient!ov;")
	public static Class186[] aClass186Array1;

	@OriginalMember(owner = "client!hf", name = "e", descriptor = "Lclient!wg;")
	public static Class265 aClass265_4;

	@OriginalMember(owner = "client!hf", name = "d", descriptor = "I")
	public static int anInt2625 = 0;

	@OriginalMember(owner = "client!hf", name = "f", descriptor = "[I")
	public static final int[] anIntArray206 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@OriginalMember(owner = "client!hf", name = "i", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray2 = new boolean[][] { new boolean[4], { false, true, true, false }, { true, false, true, false }, { true, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { true, true, false, false }, new boolean[4], { false, true, false, true }, new boolean[4] };

	@OriginalMember(owner = "client!hf", name = "k", descriptor = "I")
	public static final int anInt2626 = 205;

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIIII)V")
	public static void method2160(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class2_Sub5_Sub11 local8 = Static316.method4316(8, arg0);
		local8.method3098();
		local8.anInt3911 = arg2;
		local8.anInt3906 = arg3;
		local8.anInt3916 = arg1;
	}
}
