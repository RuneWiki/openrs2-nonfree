import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static239 {

	@OriginalMember(owner = "client!pa", name = "db", descriptor = "I")
	public static final int anInt4610 = 50;

	@OriginalMember(owner = "client!pa", name = "N", descriptor = "[I")
	public static final int[] anIntArray358 = new int[anInt4610];

	@OriginalMember(owner = "client!pa", name = "Q", descriptor = "[I")
	public static final int[] anIntArray359 = new int[anInt4610];

	@OriginalMember(owner = "client!pa", name = "S", descriptor = "[I")
	public static final int[] anIntArray360 = new int[anInt4610];

	@OriginalMember(owner = "client!pa", name = "U", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray40 = new String[anInt4610];

	@OriginalMember(owner = "client!pa", name = "V", descriptor = "[I")
	public static final int[] anIntArray361 = new int[anInt4610];

	@OriginalMember(owner = "client!pa", name = "X", descriptor = "[I")
	public static final int[] anIntArray362 = new int[anInt4610];

	@OriginalMember(owner = "client!pa", name = "Z", descriptor = "[I")
	public static final int[] anIntArray363 = new int[anInt4610];

	@OriginalMember(owner = "client!pa", name = "ab", descriptor = "[I")
	public static final int[] anIntArray364 = new int[] { 1, -1, -1, 1 };

	@OriginalMember(owner = "client!pa", name = "eb", descriptor = "[I")
	public static final int[] anIntArray366 = new int[3];

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(ZI)I")
	public static int method4131(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}
}
