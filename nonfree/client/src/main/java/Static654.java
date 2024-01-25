import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static654 {

	@OriginalMember(owner = "client!wd", name = "r", descriptor = "Lclient!wia;")
	public static Class386 aClass386_138;

	@OriginalMember(owner = "client!wd", name = "u", descriptor = "I")
	public static int anInt10919;

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(BLclient!ha;)V")
	public static void method9083(@OriginalArg(1) Class137 arg0) {
		if (Static231.aClass262_20.method6322() == 0) {
			return;
		}
		@Pc(62) Class14_Sub47 local62;
		if (Static56.aClass14_Sub22_5.aClass21_Sub21_2.method7541() == 0) {
			for (local62 = (Class14_Sub47) Static231.aClass262_20.method6318(); local62 != null; local62 = (Class14_Sub47) Static231.aClass262_20.method6311()) {
				Static175.aClass247_2.method5960(arg0, local62.aBoolean625 ? Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2.aClass325_1 : null, local62.anInt8769, local62.anInt8772, local62.anInt8773, local62.anInt8775, Static294.aClass38_9, arg0, false, local62.anInt8770, false);
				local62.method9315();
			}
			Static31.method720();
			return;
		}
		if (Static246.aClass137_25 == null) {
			@Pc(32) Canvas local32 = new Canvas();
			local32.setSize(36, 32);
			Static246.aClass137_25 = Static473.method6864(0, Static55.aClass386_16, Static526.anInterface3_10, local32, 0);
			Static531.aClass38_11 = Static246.aClass137_25.method7870(Static512.method7464(Static329.aClass386_78, Static45.anInt1109), Static688.method8628(Static666.aClass386_141, Static45.anInt1109));
		}
		for (local62 = (Class14_Sub47) Static231.aClass262_20.method6318(); local62 != null; local62 = (Class14_Sub47) Static231.aClass262_20.method6311()) {
			Static175.aClass247_2.method5960(Static246.aClass137_25, local62.aBoolean625 ? Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2.aClass325_1 : null, local62.anInt8769, local62.anInt8772, local62.anInt8773, local62.anInt8775, Static531.aClass38_11, arg0, false, local62.anInt8770, false);
			local62.method9315();
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lclient!jga;B)Ljava/lang/String;")
	public static String method9084(@OriginalArg(0) Class14_Sub3_Sub11 arg0) {
		if (arg0.aString57 == null || arg0.aString57.length() == 0) {
			return arg0.aString58 == null || arg0.aString58.length() <= 0 ? arg0.aString56 : arg0.aString56 + Static514.aClass303_34.method7473(Static232.anInt4258) + arg0.aString58;
		} else if (arg0.aString58 == null || arg0.aString58.length() <= 0) {
			return arg0.aString56 + Static514.aClass303_34.method7473(Static232.anInt4258) + arg0.aString57;
		} else {
			return arg0.aString56 + Static514.aClass303_34.method7473(Static232.anInt4258) + arg0.aString58 + Static514.aClass303_34.method7473(Static232.anInt4258) + arg0.aString57;
		}
	}
}
