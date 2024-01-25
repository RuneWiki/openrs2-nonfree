import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static138 {

	@OriginalMember(owner = "client!f", name = "g", descriptor = "I")
	public static int anInt3526;

	@OriginalMember(owner = "client!f", name = "d", descriptor = "Lclient!mq;")
	public static final Class218 aClass218_38 = new Class218(118, 0);

	@OriginalMember(owner = "client!f", name = "h", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray4 = new boolean[][] { { true, true, true, true, true, true, true, true, true, true, true, true, true }, { true, true, true, false, false, false, true, true, false, false, false, false, true }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, true, false, false, false, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { false, true, true, true, true, true, true, true, false, false, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, true, true, false, false, false, false, false, false, false, true, true, false }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13] };

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(Lclient!lea;I)V")
	public static void method3125(@OriginalArg(0) Class2_Sub3_Sub1_Sub2_Sub2 arg0) {
		@Pc(11) Class3_Sub25 local11 = (Class3_Sub25) Static470.aClass307_42.method7424((long) arg0.anInt6289);
		if (local11 == null) {
			Static493.method7238(arg0.anIntArray378[0], arg0, arg0.anIntArray377[0], arg0.aByte128, null, 0, null);
		} else {
			local11.method3944();
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(IIIII)V")
	public static void method3127(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Static226.anIntArrayArray49 != null) {
			Static226.anIntArrayArray49[arg0][arg1] = arg2 | 0xFF000000;
		}
		if (Static453.aShortArrayArray18 != null) {
			Static453.aShortArrayArray18[arg0][arg1] = (short) arg3;
		}
		if (Static256.aByteArrayArray10 != null) {
			Static256.aByteArrayArray10[arg0][arg1] = (byte) arg4;
		}
	}
}
