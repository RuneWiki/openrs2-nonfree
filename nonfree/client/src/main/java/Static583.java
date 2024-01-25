import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static583 {

	@OriginalMember(owner = "client!tf", name = "s", descriptor = "Lclient!lga;")
	public static Class223 aClass223_113;

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "Lclient!wo;")
	public static final Class396 aClass396_1 = new Class396();

	@OriginalMember(owner = "client!tf", name = "o", descriptor = "I")
	public static int anInt9303 = 0;

	@OriginalMember(owner = "client!tf", name = "p", descriptor = "I")
	public static int anInt9304 = 0;

	@OriginalMember(owner = "client!tf", name = "c", descriptor = "(B)I")
	public static int method8123() {
		@Pc(11) Class359 local11 = Static535.aClass359_24;
		synchronized (Static535.aClass359_24) {
			return Static535.aClass359_24.method8514();
		}
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(Lclient!ft;IILjava/lang/String;)Lclient!vn;")
	public static Class380 method8132(@OriginalArg(0) Class122 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) String arg2) {
		return Static591.method8212(arg2, arg1, "openjs", arg0);
	}
}
