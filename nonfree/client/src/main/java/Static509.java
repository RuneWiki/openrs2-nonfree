import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static509 {

	@OriginalMember(owner = "client!tg", name = "G", descriptor = "Lclient!q;")
	public static Class68 aClass68_7;

	@OriginalMember(owner = "client!tg", name = "M", descriptor = "[I")
	public static int[] anIntArray604;

	@OriginalMember(owner = "client!tg", name = "D", descriptor = "Lclient!bga;")
	public static Applet_Sub1 anApplet_Sub1_1 = null;

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(III)I")
	public static int method7071(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) int local16 = arg1 >> 31 & arg0 - 1;
		return local16 + ((arg1 >>> 31) + arg1) % arg0;
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(Lclient!kp;B)Ljava/lang/String;")
	public static String method7072(@OriginalArg(0) Class196 arg0) {
		if (Static67.method1102(arg0).method5420() == 0) {
			return null;
		} else if (arg0.aString39 == null || arg0.aString39.trim().length() == 0) {
			return Static298.aBoolean425 ? "Hidden-use" : null;
		} else {
			return arg0.aString39;
		}
	}
}
