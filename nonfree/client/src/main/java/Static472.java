import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static472 {

	@OriginalMember(owner = "client!pw", name = "k", descriptor = "Lclient!gga;")
	public static Class124 aClass124_101;

	@OriginalMember(owner = "client!pw", name = "d", descriptor = "Lclient!pw;")
	public static final Class290 aClass290_2 = new Class290();

	@OriginalMember(owner = "client!pw", name = "g", descriptor = "Lclient!pw;")
	public static final Class290 aClass290_5 = new Class290();

	@OriginalMember(owner = "client!pw", name = "e", descriptor = "Lclient!pw;")
	public static final Class290 aClass290_3 = new Class290();

	@OriginalMember(owner = "client!pw", name = "f", descriptor = "Lclient!pw;")
	public static final Class290 aClass290_4 = new Class290();

	@OriginalMember(owner = "client!pw", name = "h", descriptor = "Lclient!ss;")
	public static final Class340 aClass340_10 = new Class340("", 12);

	@OriginalMember(owner = "client!pw", name = "i", descriptor = "Lclient!hl;")
	public static final Class148 aClass148_17 = new Class148(2, 2);

	@OriginalMember(owner = "client!pw", name = "j", descriptor = "I")
	public static int anInt8440 = -1;

	@OriginalMember(owner = "client!pw", name = "a", descriptor = "(III)Z")
	public static boolean method7523(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x20) != 0;
	}

	@OriginalMember(owner = "client!pw", name = "b", descriptor = "(III)Z")
	public static boolean method7524(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0 | Static404.method6631(arg1, arg0) || Static318.method5257(arg0, arg1);
	}
}
