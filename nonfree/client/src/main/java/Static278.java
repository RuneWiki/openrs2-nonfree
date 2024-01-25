import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static278 {

	@OriginalMember(owner = "client!nh", name = "g", descriptor = "I")
	public static int anInt4347;

	@OriginalMember(owner = "client!nh", name = "i", descriptor = "[Lclient!o;")
	public static Class49[] aClass49Array10;

	@OriginalMember(owner = "client!nh", name = "e", descriptor = "Lclient!jp;")
	public static final Class129 aClass129_107 = new Class129(68, -1);

	@OriginalMember(owner = "client!nh", name = "m", descriptor = "Lclient!pu;")
	public static final Class198 aClass198_74 = new Class198("wave:", "welle:", "ondulation:", "onda:");

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(III)V")
	public static void method3455(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class5_Sub2_Sub9 local8 = Static72.method1073(5, arg0);
		local8.method3026();
		local8.anInt3818 = arg1;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(Ljava/lang/String;Z)V")
	public static void method3459(@OriginalArg(0) String arg0) {
		Static452.aString74 = arg0;
		if (Static7.aClass93_1.anApplet1 == null) {
			return;
		}
		try {
			@Pc(14) String local14 = Static7.aClass93_1.anApplet1.getParameter("cookieprefix");
			@Pc(19) String local19 = Static7.aClass93_1.anApplet1.getParameter("cookiehost");
			@Pc(34) String local34 = local14 + "settings=" + arg0 + "; version=1; path=/; domain=" + local19;
			if (arg0.length() == 0) {
				local34 = local34 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				local34 = local34 + "; Expires=" + Static38.method3836(Static446.method5903() + 94608000000L) + "; Max-Age=" + 94608000L;
			}
			Static471.method4681(Static7.aClass93_1.anApplet1, "document.cookie=\"" + local34 + "\"");
		} catch (@Pc(83) Throwable local83) {
		}
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method3460(@OriginalArg(0) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(18) int local18 = 0; local18 < local8; local18++) {
			local10 = (local10 << 5) + (arg0.charAt(local18) - local10);
		}
		return local10;
	}
}
