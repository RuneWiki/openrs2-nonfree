import java.applet.Applet;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static41 {

	@OriginalMember(owner = "client!bfa", name = "b", descriptor = "Ljava/applet/Applet;")
	public static Applet anApplet1;

	@OriginalMember(owner = "client!bfa", name = "g", descriptor = "Lclient!qfa;")
	public static final Class307 aClass307_11 = new Class307(32);

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "(I)V")
	public static void method1162() {
		for (@Pc(12) Class9_Sub10 local12 = (Class9_Sub10) Static295.aClass319_5.method7197(); local12 != null; local12 = (Class9_Sub10) Static295.aClass319_5.method7197()) {
			Static678.method9036(local12);
		}
		@Pc(42) int local42;
		@Pc(41) int local41;
		if (Static580.aClass3_Sub22_24.aClass21_Sub15_2.method5064() == 1) {
			local42 = 0;
			local41 = 3;
		} else {
			local41 = Static606.anInt9196;
			local42 = Static606.anInt9196;
		}
		@Pc(60) int local60;
		if (Static103.anInt2245 == 3) {
			for (local60 = local42; local60 <= local41; local60++) {
				Static85.method1857(local60);
			}
			Static85.method1863();
			return;
		}
		Static85.method1866();
		for (local60 = local42; local60 <= local41; local60++) {
			Static85.method1876();
			Static85.method1860(local60);
			Static85.method1857(local60);
		}
		Static85.method1875();
		Static85.method1863();
	}

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "(IZII)V")
	public static void method1163(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		if (Static55.aClass313_7.method7104((long) arg0) != null) {
			return;
		}
		if (Static127.aBoolean164) {
			@Pc(33) Class3_Sub50 local33 = new Class3_Sub50(arg0, new Class253_Sub1(4096, Static57.aClass182_11, arg0), arg2, arg1);
			local33.aClass253_Sub1_1.method7296(Static175.aStringArray16[Static456.anInt7118]);
			Static55.aClass313_7.method7107((long) arg0, local33);
		} else {
			Static624.method6748(arg1, arg0);
		}
	}
}
