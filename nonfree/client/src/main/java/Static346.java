import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static346 {

	@OriginalMember(owner = "client!ks", name = "v", descriptor = "Lclient!jba;")
	public static final Class190 aClass190_1 = new Class190();

	@OriginalMember(owner = "client!ks", name = "q", descriptor = "Lclient!os;")
	public static final Class281 aClass281_13 = new Class281(13, 3);

	@OriginalMember(owner = "client!ks", name = "s", descriptor = "Z")
	public static boolean aBoolean453 = false;

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(III)Z")
	public static boolean method4802(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class81 local8 = Static148.aClass153_3.method3342(arg0);
		if (arg1 == 11) {
			arg1 = 10;
		}
		if (arg1 >= 5 && arg1 <= 8) {
			arg1 = 4;
		}
		return local8.method1641(arg1);
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(BLclient!oh;)Lclient!oh;")
	public static Class273 method4804(@OriginalArg(1) Class273 arg0) {
		@Pc(12) Class273 local12 = Static91.method1399(arg0);
		if (local12 == null) {
			local12 = arg0.aClass273_13;
		}
		return local12;
	}
}
