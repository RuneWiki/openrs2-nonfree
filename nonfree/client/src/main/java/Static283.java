import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static283 {

	@OriginalMember(owner = "client!laa", name = "g", descriptor = "I")
	public static int anInt5218;

	@OriginalMember(owner = "client!laa", name = "b", descriptor = "Lclient!fc;")
	public static final Class98 aClass98_73 = new Class98(95, -2);

	@OriginalMember(owner = "client!laa", name = "j", descriptor = "Lclient!of;")
	public static final Class230 aClass230_32 = new Class230(9, 7);

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(Lclient!jr;B)Lclient!ki;")
	public static Class65_Sub2 method4313(@OriginalArg(0) Class6_Sub12 arg0) {
		@Pc(7) Class65 local7 = Static4.method73(arg0);
		@Pc(19) int local19 = arg0.method6015();
		@Pc(23) int local23 = arg0.method6015();
		return new Class65_Sub2(local7.aClass114_6, local7.aClass72_6, local7.anInt4922, local7.anInt4923, local7.anInt4919, local7.anInt4916, local7.anInt4917, local19, local23);
	}

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(ZZ)Z")
	public static boolean method4314(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(ZLjava/lang/String;ZLclient!tt;Z)V")
	public static void method4315(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class313 arg3) {
		if (!arg0) {
			Static172.method2702(arg3, 3, arg1);
			return;
		}
		@Pc(19) String local19;
		if (Static508.aString77.startsWith("win") && arg3.aBoolean569) {
			local19 = null;
			if (Static198.anApplet1 != null) {
				local19 = Static198.anApplet1.getParameter("haveie6");
			}
			if (local19 == null || !local19.equals("1")) {
				@Pc(37) Class224 local37 = Static172.method2702(arg3, 0, arg1);
				Static9.aClass313_1 = arg3;
				Static40.aClass224_12 = local37;
				Static122.aString14 = arg1;
				return;
			}
		}
		if (Static508.aString77.startsWith("mac")) {
			local19 = null;
			if (Static198.anApplet1 != null) {
				local19 = Static198.anApplet1.getParameter("havefirefox");
			}
			if (local19 != null && local19.equals("1") && arg2) {
				Static172.method2702(arg3, 1, arg1);
				return;
			}
		}
		Static172.method2702(arg3, 2, arg1);
	}
}
