import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static120 {

	@OriginalMember(owner = "client!ev", name = "N", descriptor = "I")
	public static int anInt2885;

	@OriginalMember(owner = "client!ev", name = "q", descriptor = "I")
	public static int anInt2874 = 0;

	@OriginalMember(owner = "client!ev", name = "M", descriptor = "I")
	public static final int anInt2884 = 50;

	@OriginalMember(owner = "client!ev", name = "t", descriptor = "[I")
	public static final int[] anIntArray218 = new int[anInt2884];

	@OriginalMember(owner = "client!ev", name = "v", descriptor = "I")
	public static int anInt2877 = -60;

	@OriginalMember(owner = "client!ev", name = "x", descriptor = "[I")
	public static final int[] anIntArray220 = new int[anInt2884];

	@OriginalMember(owner = "client!ev", name = "y", descriptor = "[I")
	public static final int[] anIntArray221 = new int[anInt2884];

	@OriginalMember(owner = "client!ev", name = "A", descriptor = "Z")
	public static boolean aBoolean188 = false;

	@OriginalMember(owner = "client!ev", name = "B", descriptor = "Ljava/lang/String;")
	public static String aString18 = null;

	@OriginalMember(owner = "client!ev", name = "D", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray12 = new String[anInt2884];

	@OriginalMember(owner = "client!ev", name = "F", descriptor = "[I")
	public static final int[] anIntArray222 = new int[anInt2884];

	@OriginalMember(owner = "client!ev", name = "J", descriptor = "I")
	public static int anInt2882 = 0;

	@OriginalMember(owner = "client!ev", name = "L", descriptor = "[I")
	public static final int[] anIntArray223 = new int[anInt2884];

	@OriginalMember(owner = "client!ev", name = "P", descriptor = "[I")
	public static final int[] anIntArray225 = new int[anInt2884];

	@OriginalMember(owner = "client!ev", name = "c", descriptor = "(Z)V")
	public static void method2683() {
		if (Static426.aClass39_7 != null) {
			Static426.aClass39_7.method5057();
		}
		if (Static404.aClass39_9 != null) {
			Static404.aClass39_9.method5057();
		}
	}

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(Lclient!ui;B)I")
	public static int method2684(@OriginalArg(0) Class289 arg0) {
		if (arg0 == Static489.aClass289_10) {
			return 5120;
		} else if (Static489.aClass289_11 == arg0) {
			return 5122;
		} else if (Static489.aClass289_12 == arg0) {
			return 5124;
		} else if (Static489.aClass289_13 == arg0) {
			return 5121;
		} else if (arg0 == Static489.aClass289_14) {
			return 5123;
		} else if (arg0 == Static489.aClass289_15) {
			return 5125;
		} else if (Static489.aClass289_16 == arg0) {
			return 5131;
		} else if (Static489.aClass289_17 == arg0) {
			return 5126;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!ev", name = "c", descriptor = "(II)V")
	public static void method2686(@OriginalArg(0) int arg0) {
		Static340.anInt6354 = arg0;
		@Pc(7) Class316 local7 = Static538.aClass316_64;
		synchronized (Static538.aClass316_64) {
			Static538.aClass316_64.method7794();
		}
	}
}
