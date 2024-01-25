import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static131 {

	@OriginalMember(owner = "client!em", name = "O", descriptor = "Lclient!qt;")
	public static final Class294 aClass294_2 = new Class294();

	@OriginalMember(owner = "client!em", name = "Q", descriptor = "[I")
	public static int[] anIntArray174 = new int[2];

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(Lclient!vfa;Z)V")
	public static void method1982(@OriginalArg(0) Class357 arg0) {
		if (!Static202.aBoolean295) {
			return;
		}
		if (arg0.anObjectArray18 != null) {
			@Pc(18) Class357 local18 = Static318.method4971(Static402.anInt9331, Static343.anInt5922);
			if (local18 != null) {
				@Pc(24) Class5_Sub9 local24 = new Class5_Sub9();
				local24.aClass357_2 = arg0;
				local24.anObjectArray1 = arg0.anObjectArray18;
				local24.aClass357_3 = local18;
				Static82.method1317(local24);
			}
		}
		@Pc(45) Class5_Sub40 local45 = Static25.method507(Static98.aClass208_2, Static268.aClass181_41);
		local45.aClass5_Sub12_Sub2_2.method8622(arg0.anInt9804);
		local45.aClass5_Sub12_Sub2_2.method8596(Static343.anInt5922);
		local45.aClass5_Sub12_Sub2_2.method8596(arg0.anInt9871);
		local45.aClass5_Sub12_Sub2_2.method8611(Static402.anInt9331);
		local45.aClass5_Sub12_Sub2_2.method8604(arg0.anInt9846);
		local45.aClass5_Sub12_Sub2_2.method8605(Static288.anInt4696);
		Static612.method8496(local45);
	}
}
