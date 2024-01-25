import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static444 {

	@OriginalMember(owner = "client!pea", name = "y", descriptor = "[[B")
	public static byte[][] aByteArrayArray23;

	@OriginalMember(owner = "client!pea", name = "o", descriptor = "[I")
	public static final int[] anIntArray461 = new int[8];

	@OriginalMember(owner = "client!pea", name = "v", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray54 = new String[200];

	@OriginalMember(owner = "client!pea", name = "u", descriptor = "Lclient!el;")
	public static final Class109 aClass109_164 = new Class109(125, 3);

	@OriginalMember(owner = "client!pea", name = "n", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray55 = new String[] { "en", "de", "fr", "pt", "nl" };

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(BII)I")
	public static int method6611(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg1 == 1 || arg1 == 3 ? Static31.anIntArray31[arg0 & 0x3] : Static62.anIntArray50[arg0 & 0x3];
	}

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(FI)F")
	public static float method6613(@OriginalArg(0) float arg0) {
		return (arg0 * (arg0 * 6.0F - 15.0F) + 10.0F) * arg0 * arg0 * arg0;
	}
}
