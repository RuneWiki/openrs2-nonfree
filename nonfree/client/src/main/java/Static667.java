import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static667 {

	@OriginalMember(owner = "client!wk", name = "b", descriptor = "Z")
	public static boolean aBoolean904;

	@OriginalMember(owner = "client!wk", name = "e", descriptor = "F")
	public static float aFloat214;

	@OriginalMember(owner = "client!wk", name = "l", descriptor = "I")
	public static int anInt10686;

	@OriginalMember(owner = "client!wk", name = "m", descriptor = "Lclient!pj;")
	public static Class278 aClass278_1;

	@OriginalMember(owner = "client!wk", name = "n", descriptor = "Ljava/lang/String;")
	public static String aString121;

	@OriginalMember(owner = "client!wk", name = "k", descriptor = "Lclient!uw;")
	public static final Class359 aClass359_249 = new Class359(38, 7);

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(IIII)I")
	public static int method8878(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(21) int local21 = (arg2 * (arg0 & 0xFF00FF) & 0xFF00FF00 | (arg0 & 0xFF00) * arg2 & 0xFF0000) >>> 8;
		@Pc(26) int local26 = 255 - arg2;
		return local21 + (((arg1 & 0xFF00FF) * local26 & 0xFF00FF00 | local26 * (arg1 & 0xFF00) & 0xFF0000) >>> 8);
	}
}
