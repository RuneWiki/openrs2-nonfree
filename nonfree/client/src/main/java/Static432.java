import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static432 {

	@OriginalMember(owner = "client!pi", name = "B", descriptor = "Lclient!qaa;")
	public static final Class269 aClass269_74 = new Class269(19, -1);

	@OriginalMember(owner = "client!pi", name = "E", descriptor = "I")
	public static int anInt7737 = -1;

	@OriginalMember(owner = "client!pi", name = "c", descriptor = "(I)V")
	public static void method6473() {
		Static140.method2666(Static404.aClass2_Sub13_2.aClass33_Sub23_1.method7252() == 1);
		Static473.aClass39_4 = Static455.method6667(22050, Static375.aClass359_4, Static147.aCanvas5, 0);
		Static487.method6991(Static149.method7701(null));
		Static262.aClass39_2 = Static455.method6667(2048, Static375.aClass359_4, Static147.aCanvas5, 1);
		Static1.aClass2_Sub2_Sub2_6 = new Class2_Sub2_Sub2();
		Static262.aClass39_2.method2884(Static1.aClass2_Sub2_Sub2_6);
		Static460.aClass101_2 = new Class101(22050, Static66.anInt1396);
		Static15.method320();
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(IIIIIII)V")
	public static void method6474(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(6) int arg3) {
		@Pc(5) Class60[] local5 = Static388.aClass60Array1;
		for (@Pc(12) int local12 = 0; local12 < local5.length; local12++) {
			@Pc(17) Class60 local17 = local5[local12];
			if (local17 != null && local17.anInt1599 == 2) {
				Static304.method4695(local17.anInt1607, local17.anInt1602, arg3 >> 1, local17.anInt1601 * 2, local17.anInt1600, arg0 >> 1);
				if (Static269.anIntArray354[0] > -1 && Static325.anInt5888 % 20 < 10) {
					@Pc(61) Class20 local61 = Static409.aClass20Array9[local17.anInt1605];
					@Pc(69) int local69 = Static269.anIntArray354[0] + arg1 - 12;
					@Pc(77) int local77 = Static269.anIntArray354[1] + arg2 - 28;
					local61.method4582(local69, local77);
					Static233.method3884(local77 + local61.method4576(), local77, local69, local61.method4588() + local69);
				}
			}
		}
	}
}
