import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static452 {

	@OriginalMember(owner = "client!pda", name = "n", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray4;

	@OriginalMember(owner = "client!pda", name = "r", descriptor = "I")
	public static int anInt7747;

	@OriginalMember(owner = "client!pda", name = "k", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray53 = new String[] { "en", "de", "fr", "pt", "nl" };

	@OriginalMember(owner = "client!pda", name = "o", descriptor = "Lclient!vl;")
	public static final Class376 aClass376_108 = new Class376(28, 4);

	@OriginalMember(owner = "client!pda", name = "q", descriptor = "I")
	public static int anInt7746 = -1;

	@OriginalMember(owner = "client!pda", name = "a", descriptor = "(IZ)V")
	public static void method6501(@OriginalArg(0) int arg0) {
		if (arg0 != -1 && Static89.aBooleanArray8[arg0]) {
			Static280.aClass143_73.method3124(arg0);
			Static562.aClass208ArrayArray3[arg0] = null;
			Static384.aClass208ArrayArray2[arg0] = null;
			Static89.aBooleanArray8[arg0] = false;
		}
	}
}
