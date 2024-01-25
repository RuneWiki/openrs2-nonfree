import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static450 {

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "Lclient!o;")
	public static Class137 aClass137_23;

	@OriginalMember(owner = "client!wm", name = "f", descriptor = "Lclient!qs;")
	public static Class211 aClass211_92;

	@OriginalMember(owner = "client!wm", name = "e", descriptor = "Z")
	public static boolean aBoolean515 = true;

	@OriginalMember(owner = "client!wm", name = "h", descriptor = "[Lclient!eb;")
	public static final Class67[] aClass67Array1 = new Class67[6];

	@OriginalMember(owner = "client!wm", name = "i", descriptor = "I")
	public static int anInt7890 = 0;

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(IBII)I")
	public static int method6116(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(13) int local13 = 255 - arg0;
		@Pc(31) int local31 = ((arg1 & 0xFF00FF) * arg0 & 0xFF00FF00 | arg0 * (arg1 & 0xFF00) & 0xFF0000) >>> 8;
		return local31 + (((arg2 & 0xFF00FF) * local13 & 0xFF00FF00 | local13 * (arg2 & 0xFF00) & 0xFF0000) >>> 8);
	}
}
