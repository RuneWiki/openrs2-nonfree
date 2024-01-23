import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static132 {

	@OriginalMember(owner = "client!md", name = "a", descriptor = "Lclient!wh;")
	public static Class114 aClass114_1 = Static65.method1213();

	@OriginalMember(owner = "client!md", name = "b", descriptor = "Lclient!sc;")
	public static Class107 aClass107_767 = Static231.method3737("Bitte entfernen Sie ");

	@OriginalMember(owner = "client!md", name = "f", descriptor = "Lclient!sc;")
	public static Class107 aClass107_768 = Static231.method3737("<col=ff9040>");

	@OriginalMember(owner = "client!md", name = "h", descriptor = "Lclient!sc;")
	public static Class107 aClass107_769 = Static231.method3737("; Max)2Age=");

	@OriginalMember(owner = "client!md", name = "j", descriptor = "[Z")
	public static boolean[] aBooleanArray19 = new boolean[112];

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(IIBI)V")
	public static void method2195(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(62) Class107 local62 = Static149.method2437(new Class107[] { Static189.aClass107_1101, Static115.method2001(arg1), Static176.aClass107_1038, Static115.method2001(arg2 >> 6), Static176.aClass107_1038, Static115.method2001(arg0 >> 6), Static176.aClass107_1038, Static115.method2001(arg2 & 0x3F), Static176.aClass107_1038, Static115.method2001(arg0 & 0x3F) });
		local62.method3067();
		Static23.method419(local62);
	}
}
