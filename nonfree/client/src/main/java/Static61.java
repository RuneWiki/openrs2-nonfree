import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static61 {

	@OriginalMember(owner = "client!d", name = "B", descriptor = "Lclient!qj;")
	public static Class6_Sub30 aClass6_Sub30_1;

	@OriginalMember(owner = "client!d", name = "N", descriptor = "I")
	public static int anInt1698;

	@OriginalMember(owner = "client!d", name = "u", descriptor = "Lclient!pp;")
	public static final Class198 aClass198_2 = new Class198("", 10);

	@OriginalMember(owner = "client!d", name = "L", descriptor = "I")
	public static int anInt1696 = -1;

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(Lclient!ts;I)V")
	public static void method1335(@OriginalArg(0) Class239 arg0) {
		if (!Static174.aBoolean224) {
			return;
		}
		if (arg0.anObjectArray11 != null) {
			@Pc(18) Class239 local18 = Static251.method5357(Static190.anInt653, Static363.anInt6463);
			if (local18 != null) {
				@Pc(24) Class6_Sub42 local24 = new Class6_Sub42();
				local24.anObjectArray36 = arg0.anObjectArray11;
				local24.aClass239_13 = arg0;
				local24.aClass239_14 = local18;
				Static166.method2744(local24);
			}
		}
		Static403.method5961(Static84.aClass92_32);
		Static109.aClass6_Sub1_Sub1_5.method6461(arg0.anInt6908);
		Static109.aClass6_Sub1_Sub1_5.method6464(arg0.anInt6907);
		Static109.aClass6_Sub1_Sub1_5.method6436(Static76.anInt7824);
		Static109.aClass6_Sub1_Sub1_5.method6457(Static363.anInt6463);
		Static109.aClass6_Sub1_Sub1_5.method6436(Static190.anInt653);
		Static109.aClass6_Sub1_Sub1_5.method6479(arg0.anInt6903);
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method1338(@OriginalArg(1) String arg0) {
		Static247.method3826(arg0, 0, "", 0, "");
	}
}
