import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static198 {

	@OriginalMember(owner = "client!og", name = "a", descriptor = "Lclient!th;")
	public static Class168 aClass168_146;

	@OriginalMember(owner = "client!og", name = "b", descriptor = "Z")
	public static boolean aBoolean268;

	@OriginalMember(owner = "client!og", name = "c", descriptor = "[Lclient!ml;")
	public static Class1_Sub3_Sub13[] aClass1_Sub3_Sub13Array10;

	@OriginalMember(owner = "client!og", name = "g", descriptor = "Z")
	public static boolean aBoolean269 = false;

	@OriginalMember(owner = "client!og", name = "h", descriptor = "[I")
	public static int[] anIntArray388 = new int[256];

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(BD)V")
	public static void method3184(@OriginalArg(1) double arg0) {
		if (Static121.aDouble9 == arg0) {
			return;
		}
		for (@Pc(18) int local18 = 0; local18 < 256; local18++) {
			@Pc(33) int local33 = (int) (Math.pow((double) local18 / 255.0D, arg0) * 255.0D);
			anIntArray388[local18] = local33 <= 255 ? local33 : 255;
		}
		Static121.aDouble9 = arg0;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(II)Ljava/lang/String;")
	public static String method3185(@OriginalArg(0) int arg0) {
		return arg0 < 999999999 ? Integer.toString(arg0) : "*";
	}
}
