import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static545 {

	@OriginalMember(owner = "client!tga", name = "m", descriptor = "Lclient!client;")
	public static client aClient1;

	@OriginalMember(owner = "client!tga", name = "k", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray34 = new String[200];

	@OriginalMember(owner = "client!tga", name = "r", descriptor = "Lclient!ea;")
	public static final Class73 aClass73_162 = new Class73(93, 6);

	@OriginalMember(owner = "client!tga", name = "b", descriptor = "(I)V")
	public static void method7683() {
		Static241.aClass94_21.method2964();
	}

	@OriginalMember(owner = "client!tga", name = "a", descriptor = "(ZZLjava/lang/String;ZLclient!fl;)V")
	public static void method7684(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) String arg2, @OriginalArg(4) Class104 arg3) {
		if (!arg0) {
			Static516.method7390(arg2, arg3, 3);
			return;
		}
		@Pc(18) String local18;
		if (Static161.aString38.startsWith("win") && arg3.aBoolean290) {
			local18 = null;
			if (Static635.anApplet2 != null) {
				local18 = Static635.anApplet2.getParameter("haveie6");
			}
			if (local18 == null || !local18.equals("1")) {
				@Pc(36) Class159 local36 = Static516.method7390(arg2, arg3, 0);
				Static618.aClass104_6 = arg3;
				Static208.aClass159_3 = local36;
				Static66.aString14 = arg2;
				return;
			}
		}
		if (Static161.aString38.startsWith("mac")) {
			local18 = null;
			if (Static635.anApplet2 != null) {
				local18 = Static635.anApplet2.getParameter("havefirefox");
			}
			if (local18 != null && local18.equals("1") && arg1) {
				Static516.method7390(arg2, arg3, 1);
				return;
			}
		}
		Static516.method7390(arg2, arg3, 2);
	}
}
