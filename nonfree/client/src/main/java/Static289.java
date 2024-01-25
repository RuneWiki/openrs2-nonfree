import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static289 {

	@OriginalMember(owner = "client!kea", name = "h", descriptor = "Lclient!kr;")
	public static Class20 aClass20_14;

	@OriginalMember(owner = "client!kea", name = "m", descriptor = "I")
	public static int anInt5431 = 0;

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(B)V")
	public static void method4523() {
		for (@Pc(18) Class2_Sub29 local18 = (Class2_Sub29) Static581.aClass222_41.method5474(); local18 != null; local18 = (Class2_Sub29) Static581.aClass222_41.method5472()) {
			if (local18.aClass52_Sub1_1.method1227()) {
				Static621.method8440(local18.anInt5430);
			} else {
				local18.aClass52_Sub1_1.method1232();
				try {
					local18.aClass52_Sub1_1.method1218();
				} catch (@Pc(41) Exception local41) {
					Static420.method6396("TV: " + local18.anInt5430, local41);
					Static621.method8440(local18.anInt5430);
				}
				if (!local18.aBoolean418 && !local18.aBoolean415) {
					@Pc(67) Class2_Sub16_Sub1 local67 = local18.aClass52_Sub1_1.method1228();
					if (local67 != null) {
						@Pc(73) Class2_Sub2_Sub4 local73 = local67.method1731();
						if (local73 != null) {
							local73.method5444(local18.anInt5432);
							Static1.aClass2_Sub2_Sub2_6.method1044(local73);
							local18.aBoolean418 = true;
						}
					}
				}
			}
		}
	}
}
