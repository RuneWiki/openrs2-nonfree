import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static11 {

	@OriginalMember(owner = "client!aj", name = "f", descriptor = "[I")
	public static int[] anIntArray11;

	@OriginalMember(owner = "client!aj", name = "i", descriptor = "Lclient!it;")
	public static Class122 aClass122_1;

	@OriginalMember(owner = "client!aj", name = "b", descriptor = "Lclient!fr;")
	public static final Class91 aClass91_4 = new Class91(10);

	@OriginalMember(owner = "client!aj", name = "e", descriptor = "Lclient!lo;")
	public static final Class158 aClass158_5 = new Class158("Loading interface scripts - ", "Lade Interface-Skripte - ", "Chargement des interfaces - ", "Carregando interfaces - ");

	@OriginalMember(owner = "client!aj", name = "g", descriptor = "Z")
	public static boolean aBoolean7 = false;

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(IZLjava/lang/String;)V")
	public static void method131(@OriginalArg(1) boolean arg0, @OriginalArg(2) String arg1) {
		if (arg1 == null) {
			return;
		}
		if (Static223.anInt4457 >= 100) {
			Static192.method3105(Static148.aClass158_139.method3594(Static365.anInt6682));
			return;
		}
		@Pc(20) String local20 = Static311.method4474(arg1);
		if (local20 == null) {
			return;
		}
		@Pc(67) String local67;
		for (@Pc(30) int local30 = 0; local30 < Static223.anInt4457; local30++) {
			@Pc(37) String local37 = Static311.method4474(Static406.aStringArray30[local30]);
			if (local37 != null && local37.equals(local20)) {
				Static192.method3105(arg1 + Static403.aClass158_192.method3594(Static365.anInt6682));
				return;
			}
			if (Static244.aStringArray31[local30] != null) {
				local67 = Static311.method4474(Static244.aStringArray31[local30]);
				if (local67 != null && local67.equals(local20)) {
					Static192.method3105(arg1 + Static403.aClass158_192.method3594(Static365.anInt6682));
					return;
				}
			}
		}
		for (@Pc(97) int local97 = 0; local97 < Static323.anInt5975; local97++) {
			local67 = Static311.method4474(Static169.aStringArray24[local97]);
			if (local67 != null && local67.equals(local20)) {
				Static192.method3105(Static242.aClass158_208.method3594(Static365.anInt6682) + arg1 + Static456.aClass158_33.method3594(Static365.anInt6682));
				return;
			}
			if (Static318.aStringArray37[local97] != null) {
				@Pc(139) String local139 = Static311.method4474(Static318.aStringArray37[local97]);
				if (local139 != null && local139.equals(local20)) {
					Static192.method3105(Static242.aClass158_208.method3594(Static365.anInt6682) + arg1 + Static456.aClass158_33.method3594(Static365.anInt6682));
					return;
				}
			}
		}
		if (Static311.method4474(Static429.aClass30_Sub1_Sub1_Sub2_2.aString9).equals(local20)) {
			Static192.method3105(Static41.aClass158_21.method3594(Static365.anInt6682));
		} else {
			Static32.method677(Static329.aClass177_85);
			Static433.aClass1_Sub3_Sub1_11.method1208(Static146.method2347(arg1) + 1);
			Static433.aClass1_Sub3_Sub1_11.method1190(arg1);
			Static433.aClass1_Sub3_Sub1_11.method1208(arg0 ? 1 : 0);
		}
	}
}
