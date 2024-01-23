import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static24 {

	@OriginalMember(owner = "client!bm", name = "b", descriptor = "I")
	public static int anInt489;

	@OriginalMember(owner = "client!bm", name = "d", descriptor = "[Lclient!td;")
	public static Class140_Sub1[] aClass140_Sub1Array1;

	@OriginalMember(owner = "client!bm", name = "e", descriptor = "Lclient!lm;")
	public static Class96 aClass96_1;

	@OriginalMember(owner = "client!bm", name = "c", descriptor = "I")
	public static int anInt490 = 0;

	@OriginalMember(owner = "client!bm", name = "f", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray3 = new String[500];

	@OriginalMember(owner = "client!bm", name = "h", descriptor = "Z")
	public static boolean aBoolean27 = false;

	@OriginalMember(owner = "client!bm", name = "k", descriptor = "Ljava/lang/String;")
	public static String aString15 = null;

	@OriginalMember(owner = "client!bm", name = "l", descriptor = "[I")
	public static int[] anIntArray50 = new int[14];

	@OriginalMember(owner = "client!bm", name = "m", descriptor = "[I")
	public static int[] anIntArray51 = new int[] { 4, 4, 1, 2, 6, 4, 2, 48, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

	@OriginalMember(owner = "client!bm", name = "n", descriptor = "I")
	public static int anInt494 = -1;

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(ID)V")
	public static void method402(@OriginalArg(1) double arg0) {
		if (Static183.aDouble1 == arg0) {
			return;
		}
		for (@Pc(8) int local8 = 0; local8 < 256; local8++) {
			@Pc(23) int local23 = (int) (Math.pow((double) local8 / 255.0D, arg0) * 255.0D);
			Static218.anIntArray495[local8] = local23 <= 255 ? local23 : 255;
		}
		Static183.aDouble1 = arg0;
	}
}
