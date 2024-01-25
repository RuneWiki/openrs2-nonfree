import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static335 {

	@OriginalMember(owner = "client!kk", name = "T", descriptor = "Lclient!nca;")
	public static Class254 aClass254_99;

	@OriginalMember(owner = "client!kk", name = "Q", descriptor = "J")
	public static long aLong166;

	@OriginalMember(owner = "client!kk", name = "H", descriptor = "Lclient!tda;")
	public static final Class349 aClass349_80 = new Class349(74, 4);

	@OriginalMember(owner = "client!kk", name = "M", descriptor = "I")
	public static int anInt5132 = -1;

	@OriginalMember(owner = "client!kk", name = "V", descriptor = "Z")
	public static final boolean aBoolean439 = false;

	@OriginalMember(owner = "client!kk", name = "W", descriptor = "Lclient!os;")
	public static final Class281 aClass281_12 = new Class281(4, 16);

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(ZLclient!ha;)V")
	public static void method4655(@OriginalArg(1) Class145 arg0) {
		if (Static221.aClass60_73.method1230() == 0) {
			return;
		}
		@Pc(21) Class2_Sub8 local21;
		if (Static650.aClass2_Sub30_29.aClass11_Sub20_2.method4863() == 0) {
			for (local21 = (Class2_Sub8) Static221.aClass60_73.method1226(7); local21 != null; local21 = (Class2_Sub8) Static221.aClass60_73.method1228()) {
				Static543.aClass37_2.method608(local21.anInt914, Static435.aClass68_11, local21.anInt917, local21.anInt918, false, false, local21.aBoolean116 ? Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2.aClass116_1 : null, arg0, arg0, local21.anInt916, local21.anInt915);
				local21.method9872();
			}
			Static668.method9110(-61);
			return;
		}
		if (Static614.aClass145_15 == null) {
			@Pc(75) Canvas local75 = new Canvas();
			local75.setSize(36, 32);
			Static614.aClass145_15 = Static150.method2167(Static179.anInterface3_1, local75, 0, 0, Static554.aClass254_136);
			Static98.aClass68_4 = Static614.aClass145_15.method9707(Static154.method2200(aClass254_99, Static609.anInt9447), Static737.method8363(Static117.aClass254_47, Static609.anInt9447), true);
		}
		for (local21 = (Class2_Sub8) Static221.aClass60_73.method1226(7); local21 != null; local21 = (Class2_Sub8) Static221.aClass60_73.method1228()) {
			Static543.aClass37_2.method608(local21.anInt914, Static98.aClass68_4, local21.anInt917, local21.anInt918, false, false, local21.aBoolean116 ? Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2.aClass116_1 : null, arg0, Static614.aClass145_15, local21.anInt916, local21.anInt915);
			local21.method9872();
		}
	}
}
