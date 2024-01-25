import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static357 {

	@OriginalMember(owner = "client!lv", name = "t", descriptor = "[Lclient!pl;")
	public static Class280[] aClass280Array1;

	@OriginalMember(owner = "client!lv", name = "r", descriptor = "Lclient!rn;")
	public static final Class305 aClass305_53 = new Class305(49, -1);

	@OriginalMember(owner = "client!lv", name = "s", descriptor = "Lclient!rn;")
	public static final Class305 aClass305_54 = new Class305(23, 2);

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method5361(@OriginalArg(0) String arg0) {
		@Pc(11) String local11 = Static359.method5415(Static202.method3282(arg0));
		if (local11 == null) {
			local11 = "";
		}
		return local11;
	}

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(III)V")
	public static void method5362(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class5_Sub21 local12 = Static64.method905(Static263.aClass49_1, Static377.aClass305_56);
		local12.aClass5_Sub41_Sub2_1.method7809(arg0);
		local12.aClass5_Sub41_Sub2_1.method7806(arg1);
		Static495.method7092(local12);
	}
}
