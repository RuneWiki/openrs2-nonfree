import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static282 {

	@OriginalMember(owner = "client!lf", name = "j", descriptor = "Lclient!cga;")
	public static final Class47 aClass47_84 = new Class47(54, 2);

	@OriginalMember(owner = "client!lf", name = "q", descriptor = "Lclient!pw;")
	public static final Class261 aClass261_7 = new Class261("", 12);

	@OriginalMember(owner = "client!lf", name = "v", descriptor = "Lclient!hm;")
	public static final Class136 aClass136_60 = new Class136(8);

	@OriginalMember(owner = "client!lf", name = "x", descriptor = "Lclient!qf;")
	public static final Class6_Sub21_Sub2 aClass6_Sub21_Sub2_1 = new Class6_Sub21_Sub2(7500);

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(ILclient!pfa;I)Lclient!jv;")
	public static Class6_Sub28 method4635(@OriginalArg(0) int arg0, @OriginalArg(1) Class251 arg1) {
		@Pc(17) byte[] local17 = arg1.method5761(arg0);
		return local17 == null ? null : new Class6_Sub28(local17);
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(Ljava/lang/String;ZZILclient!qj;)V")
	public static void method4636(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) Class272 arg3) {
		if (!arg2) {
			Static358.method5423(arg0, arg3, 3);
			return;
		}
		@Pc(25) String local25;
		if (Static426.aString72.startsWith("win") && arg3.aBoolean511) {
			local25 = null;
			if (Static249.anApplet1 != null) {
				local25 = Static249.anApplet1.getParameter("haveie6");
			}
			if (local25 == null || !local25.equals("1")) {
				@Pc(43) Class331 local43 = Static358.method5423(arg0, arg3, 0);
				Static464.aClass331_10 = local43;
				Static482.aString85 = arg0;
				Static596.aClass272_6 = arg3;
				return;
			}
		}
		if (Static426.aString72.startsWith("mac")) {
			local25 = null;
			if (Static249.anApplet1 != null) {
				local25 = Static249.anApplet1.getParameter("havefirefox");
			}
			if (local25 != null && local25.equals("1") && arg1) {
				Static358.method5423(arg0, arg3, 1);
				return;
			}
		}
		Static358.method5423(arg0, arg3, 2);
	}
}
