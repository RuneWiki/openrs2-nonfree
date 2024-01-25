import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static61 {

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "[[[Lclient!lo;")
	public static Class217[][][] aClass217ArrayArrayArray6;

	@OriginalMember(owner = "client!cc", name = "e", descriptor = "I")
	public static int anInt9888;

	@OriginalMember(owner = "client!cc", name = "h", descriptor = "Lclient!ni;")
	public static Class246 aClass246_7;

	@OriginalMember(owner = "client!cc", name = "d", descriptor = "I")
	public static int anInt9887 = -1;

	@OriginalMember(owner = "client!cc", name = "f", descriptor = "Lclient!cb;")
	public static final Class46 aClass46_105 = new Class46(28, -1);

	@OriginalMember(owner = "client!cc", name = "g", descriptor = "I")
	public static int anInt9889 = 0;

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lclient!ha;I)V")
	public static void method8506(@OriginalArg(0) Class133 arg0) {
		if (Static588.aClass330_59.method7912() == 0) {
			return;
		}
		@Pc(54) Class5_Sub14 local54;
		if (Static97.aClass5_Sub25_8.aClass6_Sub11_1.method3988() == 0) {
			for (local54 = (Class5_Sub14) Static588.aClass330_59.method7908(); local54 != null; local54 = (Class5_Sub14) Static588.aClass330_59.method7914()) {
				Static643.aClass275_2.method6643(false, false, Static602.aClass55_16, local54.anInt1717, arg0, local54.anInt1715, local54.anInt1719, local54.anInt1714, arg0, local54.aBoolean121 ? Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2.aClass248_1 : null, local54.anInt1712);
				local54.method9047();
			}
			Static472.method6995();
			return;
		}
		if (Static600.aClass133_15 == null) {
			@Pc(24) Canvas local24 = new Canvas();
			local24.setSize(36, 32);
			Static600.aClass133_15 = Static173.method2688(Static5.aClass207_2, local24, 0, 0, Static31.anInterface3_1);
			Static368.aClass55_11 = Static600.aClass133_15.method7255(Static285.method4512(Static313.anInt5371, Static40.aClass207_73), Static649.method2892(Static441.aClass207_89, Static313.anInt5371));
		}
		for (local54 = (Class5_Sub14) Static588.aClass330_59.method7908(); local54 != null; local54 = (Class5_Sub14) Static588.aClass330_59.method7914()) {
			Static643.aClass275_2.method6643(false, false, Static368.aClass55_11, local54.anInt1717, arg0, local54.anInt1715, local54.anInt1719, local54.anInt1714, Static600.aClass133_15, local54.aBoolean121 ? Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2.aClass248_1 : null, local54.anInt1712);
			local54.method9047();
		}
	}
}
