import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static200 {

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "[[[S")
	public static short[][][] aShortArrayArrayArray5;

	@OriginalMember(owner = "client!hca", name = "b", descriptor = "[I")
	public static final int[] anIntArray288 = new int[13];

	@OriginalMember(owner = "client!hca", name = "c", descriptor = "[F")
	public static final float[] aFloatArray36 = new float[4];

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(Z)I")
	public static int method3506() {
		@Pc(12) int local12 = Static410.aClass372_1.method8483();
		if (Static439.aClass372Array1.length - 1 > local12) {
			Static410.aClass372_1 = Static439.aClass372Array1[local12 + 1];
		}
		return 100;
	}
}
