import java.applet.Applet;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static538 {

	@OriginalMember(owner = "client!sh", name = "c", descriptor = "J")
	public static long aLong66;

	@OriginalMember(owner = "client!sh", name = "e", descriptor = "Lclient!jw;")
	public static Class6_Sub32 aClass6_Sub32_3;

	@OriginalMember(owner = "client!sh", name = "u", descriptor = "Ljava/applet/Applet;")
	public static Applet anApplet3;

	@OriginalMember(owner = "client!sh", name = "b", descriptor = "Lclient!qk;")
	public static final Class289 aClass289_34 = new Class289(21, 3);

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(ILclient!sha;Lclient!ha;)V")
	public static void method1729(@OriginalArg(1) Class321 arg0, @OriginalArg(2) Class132 arg1) {
		@Pc(31) boolean local31 = Static340.aClass121_1.method2646(arg0.anInt9100, arg0.aBoolean660 ? Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2.aClass271_1 : null, arg0.anInt9048, arg0.anInt9032, arg0.anInt9068, arg0.anInt9069 | 0xFF000000, arg1) == null;
		if (local31) {
			Static479.aClass362_55.method8536(new Class6_Sub48(arg0.anInt9048, arg0.anInt9032, arg0.anInt9100, arg0.anInt9069 | 0xFF000000, arg0.anInt9068, arg0.aBoolean660));
			Static293.method4206(arg0);
		}
	}

	@OriginalMember(owner = "client!sh", name = "b", descriptor = "(I)Lclient!ts;")
	public static Class343 method1734() {
		return Static595.method8191();
	}
}
