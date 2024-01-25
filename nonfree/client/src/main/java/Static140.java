import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static140 {

	@OriginalMember(owner = "client!fi", name = "s", descriptor = "Lclient!xa;")
	public static Class37 aClass37_39;

	@OriginalMember(owner = "client!fi", name = "j", descriptor = "I")
	public static int anInt9492 = 0;

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(IJ)V")
	public static void method7699(@OriginalArg(1) long arg0) {
		@Pc(6) Class3_Sub9 local6 = Static464.method7107();
		local6.aClass3_Sub7_Sub1_1.method6494(Static261.aClass33_36.anInt1080);
		local6.aClass3_Sub7_Sub1_1.method6533(arg0);
		local6.aClass3_Sub7_Sub1_1.method6494(Static126.anInt2904);
		Static230.method3933(local6);
		Static309.anInt6178 = -3;
		Static149.anInt2868 = 0;
		Static138.anInt3230 = 0;
		Static526.anInt9591 = 1;
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method7701(@OriginalArg(1) String arg0) {
		if (!arg0.equals("")) {
			@Pc(21) Class3_Sub9 local21 = Static587.method8316(Static187.aClass40_2, Static413.aClass230_80);
			local21.aClass3_Sub7_Sub1_1.method6494(Static85.method1894(arg0));
			local21.aClass3_Sub7_Sub1_1.method6516(arg0);
			Static230.method3933(local21);
		}
	}
}
