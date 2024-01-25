import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static259 {

	@OriginalMember(owner = "client!qb", name = "q", descriptor = "Lclient!al;")
	public static final Class11 aClass11_112 = new Class11(2);

	@OriginalMember(owner = "client!qb", name = "U", descriptor = "I")
	public static int anInt4951 = 16777215;

	@OriginalMember(owner = "client!qb", name = "Z", descriptor = "Lclient!al;")
	public static final Class11 aClass11_113 = new Class11(5);

	@OriginalMember(owner = "client!qb", name = "qb", descriptor = "[I")
	public static final int[] anIntArray452 = new int[128];

	@OriginalMember(owner = "client!qb", name = "wb", descriptor = "Ljava/lang/String;")
	public static String aString186 = "Please wait...";

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lclient!e;Z)V")
	public static void method4440(@OriginalArg(0) Class46 arg0) {
		if (Static228.aClass18_26.method447() == 0) {
			return;
		}
		@Pc(62) Class14_Sub7 local62;
		if (Static67.anInt1615 == 0 || Static67.anInt1615 == 2) {
			for (local62 = (Class14_Sub7) Static228.aClass18_26.method459(); local62 != null; local62 = (Class14_Sub7) Static228.aClass18_26.method453()) {
				Static82.method2032(Static170.aClass30_6, local62.anInt903, local62.aBoolean48 ? Static173.aClass10_Sub3_Sub3_Sub2_1.aClass83_4 : null, arg0, arg0, false, local62.anInt912, local62.anInt910, local62.anInt904, false, local62.anInt909);
				local62.method5986();
			}
			Static7.method206();
			return;
		}
		if (Static41.aClass46_3 == null) {
			@Pc(32) Canvas local32 = new Canvas();
			local32.setSize(36, 32);
			Static41.aClass46_3 = Static65.method5095(Static220.anInterface2_4, Static105.aClass15_2, local32, 0, 0);
			Static236.aClass30_2 = Static41.aClass46_3.method5093(Static307.method2744(Static291.anInt5610, Static332.aClass143_111), Static368.method5805(Static348.aClass143_98, Static291.anInt5610));
		}
		for (local62 = (Class14_Sub7) Static228.aClass18_26.method459(); local62 != null; local62 = (Class14_Sub7) Static228.aClass18_26.method453()) {
			Static82.method2032(Static236.aClass30_2, local62.anInt903, local62.aBoolean48 ? Static173.aClass10_Sub3_Sub3_Sub2_1.aClass83_4 : null, arg0, Static41.aClass46_3, false, local62.anInt912, local62.anInt910, local62.anInt904, false, local62.anInt909);
			local62.method5986();
		}
	}
}
