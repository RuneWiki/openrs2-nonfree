import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static218 {

	@OriginalMember(owner = "client!hq", name = "j", descriptor = "F")
	public static float aFloat115;

	@OriginalMember(owner = "client!hq", name = "b", descriptor = "Lclient!st;")
	public static final Class314 aClass314_70 = new Class314(53, 2);

	@OriginalMember(owner = "client!hq", name = "g", descriptor = "Lclient!kr;")
	public static final Class194 aClass194_117 = new Class194(89, 8);

	@OriginalMember(owner = "client!hq", name = "i", descriptor = "[I")
	public static final int[] anIntArray245 = new int[] { -1, -1, 1, 1 };

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(Z)V")
	public static void method3802() {
		Static294.aClass103_32 = null;
		Static617.anInt9920 = -1;
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(BLclient!uv;)V")
	public static void method3805(@OriginalArg(1) Class344 arg0) {
		if (!Static425.aBoolean536) {
			return;
		}
		if (arg0.anObjectArray7 != null) {
			@Pc(23) Class344 local23 = Static258.method4328(Static491.anInt8353, Static260.anInt5074);
			if (local23 != null) {
				@Pc(29) Class3_Sub36 local29 = new Class3_Sub36();
				local29.aClass344_5 = local23;
				local29.aClass344_6 = arg0;
				local29.anObjectArray1 = arg0.anObjectArray7;
				Static400.method6288(local29);
			}
		}
		@Pc(46) Class3_Sub27 local46 = Static59.method1040(Static325.aClass20_2, Static234.aClass314_74);
		local46.aClass3_Sub9_Sub2_2.method5601(arg0.anInt9571);
		local46.aClass3_Sub9_Sub2_2.method5616(arg0.anInt9567);
		local46.aClass3_Sub9_Sub2_2.method5620(Static174.anInt3360);
		local46.aClass3_Sub9_Sub2_2.method5581(Static260.anInt5074);
		local46.aClass3_Sub9_Sub2_2.method5620(arg0.anInt9586);
		local46.aClass3_Sub9_Sub2_2.method5637(Static491.anInt8353);
		Static148.method2572(local46);
	}
}
