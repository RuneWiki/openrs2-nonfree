import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static394 {

	@OriginalMember(owner = "client!tk", name = "d", descriptor = "Lclient!ni;")
	public static final Class163 aClass163_171 = new Class163(40, 7);

	@OriginalMember(owner = "client!tk", name = "j", descriptor = "Lclient!of;")
	public static final Class174 aClass174_190 = new Class174("Opened title screen", "Titelbild geöffnet.", "Écran-titre ouvert", "Tela título aberta");

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(ILclient!qa;)V")
	public static void method5441(@OriginalArg(1) Class167 arg0) {
		if (Static249.aClass193_35.method4520() == 0) {
			return;
		}
		@Pc(56) Class3_Sub44 local56;
		if (Static402.anInt6656 == 0) {
			for (local56 = (Class3_Sub44) Static249.aClass193_35.method4519(); local56 != null; local56 = (Class3_Sub44) Static249.aClass193_35.method4525()) {
				Static158.aClass272_1.method6272(arg0, Static275.aClass18_3, local56.anInt6954, local56.anInt6957, local56.aBoolean471 ? Static203.aClass1_Sub2_Sub6_Sub2_1.aClass198_1 : null, arg0, local56.anInt6961, local56.anInt6956, false, false, local56.anInt6959);
				local56.method6288();
			}
			Static174.method2784();
			return;
		}
		if (Static148.aClass167_6 == null) {
			@Pc(26) Canvas local26 = new Canvas();
			local26.setSize(36, 32);
			Static148.aClass167_6 = Static331.method6026(Static32.aClass51_1, 0, local26, Static203.anInterface7_5, 0);
			Static434.aClass18_4 = Static148.aClass167_6.method5995(Static398.method5469(Static351.aClass250_88, Static200.anInt3583), Static467.method3627(Static8.aClass250_2, Static200.anInt3583));
		}
		for (local56 = (Class3_Sub44) Static249.aClass193_35.method4519(); local56 != null; local56 = (Class3_Sub44) Static249.aClass193_35.method4525()) {
			Static158.aClass272_1.method6272(arg0, Static434.aClass18_4, local56.anInt6954, local56.anInt6957, local56.aBoolean471 ? Static203.aClass1_Sub2_Sub6_Sub2_1.aClass198_1 : null, Static148.aClass167_6, local56.anInt6961, local56.anInt6956, false, false, local56.anInt6959);
			local56.method6288();
		}
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;B)Ljava/lang/String;")
	public static String method5443(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2) {
		for (@Pc(14) int local14 = arg2.indexOf(arg0); local14 != -1; local14 = arg2.indexOf(arg0, arg1.length() + local14)) {
			arg2 = arg2.substring(0, local14) + arg1 + arg2.substring(local14 + arg0.length());
		}
		return arg2;
	}
}
