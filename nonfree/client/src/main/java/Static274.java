import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static274 {

	@OriginalMember(owner = "client!o", name = "l", descriptor = "Lclient!bm;")
	public static Class28 aClass28_11;

	@OriginalMember(owner = "client!o", name = "n", descriptor = "Lclient!kl;")
	public static final Class142 aClass142_89 = new Class142(7, 0, 1, 1);

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(Lclient!em;Z)V")
	public static void method4056(@OriginalArg(0) Class68 arg0) {
		if (!Static385.aBoolean441) {
			return;
		}
		if (arg0.anObjectArray19 != null) {
			@Pc(18) Class68 local18 = Static259.method3899(Static154.anInt3161, Static142.anInt3047);
			if (local18 != null) {
				@Pc(24) Class2_Sub30 local24 = new Class2_Sub30();
				local24.aClass68_12 = arg0;
				local24.aClass68_13 = local18;
				local24.anObjectArray35 = arg0.anObjectArray19;
				Static168.method2731(local24);
			}
		}
		Static159.method2586(Static345.aClass54_87);
		Static424.aClass2_Sub23_Sub2_1.method5506(arg0.anInt2229);
		Static424.aClass2_Sub23_Sub2_1.method5498(Static142.anInt3047);
		Static424.aClass2_Sub23_Sub2_1.method5470(arg0.anInt2215);
		Static424.aClass2_Sub23_Sub2_1.method5502(Static154.anInt3161);
		Static424.aClass2_Sub23_Sub2_1.method5470(Static423.anInt7418);
		Static424.aClass2_Sub23_Sub2_1.method5507(arg0.anInt2208);
	}
}
