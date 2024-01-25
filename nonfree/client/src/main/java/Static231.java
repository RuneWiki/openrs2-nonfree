import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static231 {

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "[[F")
	public static final float[][] aFloatArrayArray5 = new float[][] { { -0.333333F, -0.333333F, -0.333333F }, { 0.333333F, -0.333333F, -0.333333F }, { -0.333333F, 0.333333F, -0.333333F }, { 0.333333F, 0.333333F, -0.333333F }, { -0.333333F, -0.333333F, 0.333333F }, { 0.333333F, -0.333333F, 0.333333F }, { -0.333333F, 0.333333F, 0.333333F }, { 0.333333F, 0.333333F, 0.333333F } };

	@OriginalMember(owner = "client!lq", name = "c", descriptor = "Z")
	public static boolean aBoolean259 = false;

	@OriginalMember(owner = "client!lq", name = "d", descriptor = "[I")
	public static final int[] anIntArray337 = new int[2];

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(II)[B")
	public static synchronized byte[] method3611(@OriginalArg(1) int arg0) {
		@Pc(19) byte[] local19;
		if (arg0 == 100 && Static412.anInt6898 > 0) {
			local19 = Static73.aByteArrayArray13[--Static412.anInt6898];
			Static73.aByteArrayArray13[Static412.anInt6898] = null;
			return local19;
		} else if (arg0 == 5000 && Static122.anInt2158 > 0) {
			local19 = Static32.aByteArrayArray7[--Static122.anInt2158];
			Static32.aByteArrayArray7[Static122.anInt2158] = null;
			return local19;
		} else if (arg0 == 30000 && Static303.anInt4989 > 0) {
			local19 = Static178.aByteArrayArray9[--Static303.anInt4989];
			Static178.aByteArrayArray9[Static303.anInt4989] = null;
			return local19;
		} else {
			return new byte[arg0];
		}
	}
}
