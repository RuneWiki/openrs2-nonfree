import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static101 {

	@OriginalMember(owner = "client!dj", name = "C", descriptor = "I")
	public static int anInt2723;

	@OriginalMember(owner = "client!dj", name = "o", descriptor = "Lclient!sn;")
	public static final Class313 aClass313_5 = new Class313("LIVE", 0);

	@OriginalMember(owner = "client!dj", name = "z", descriptor = "I")
	public static int anInt2722 = -1;

	@OriginalMember(owner = "client!dj", name = "A", descriptor = "[F")
	public static final float[] aFloatArray36 = new float[4];

	@OriginalMember(owner = "client!dj", name = "B", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray4 = new boolean[][] { new boolean[4], new boolean[4], { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, new boolean[4], new boolean[4], new boolean[4], new boolean[4] };

	@OriginalMember(owner = "client!dj", name = "D", descriptor = "[I")
	public static final int[] anIntArray135 = new int[200];

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(IFFF)F")
	public static float method2305(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		return arg2 + (arg0 - arg2) * arg1;
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(B)Lclient!fd;")
	public static Class98_Sub1 method2307() {
		return Static288.anInt4208 < Static313.aClass98_Sub1Array1.length ? Static313.aClass98_Sub1Array1[Static288.anInt4208++] : null;
	}
}
