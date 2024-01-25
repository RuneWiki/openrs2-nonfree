import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static161 {

	@OriginalMember(owner = "client!ks", name = "U", descriptor = "I")
	public static int anInt3358;

	@OriginalMember(owner = "client!ks", name = "Y", descriptor = "Lclient!o;")
	public static Class1_Sub30 aClass1_Sub30_1;

	@OriginalMember(owner = "client!ks", name = "W", descriptor = "Ljava/lang/String;")
	public static String aString123 = " has logged in.";

	@OriginalMember(owner = "client!ks", name = "c", descriptor = "(II)V")
	public static void method2849(@OriginalArg(1) int arg0) {
		@Pc(12) Class1_Sub2_Sub15 local12 = Static17.method307(8, arg0);
		local12.method4782();
	}

	@OriginalMember(owner = "client!ks", name = "g", descriptor = "(I)V")
	public static void method2852() {
		while (true) {
			if (Static142.aClass1_Sub21_Sub2_1.method5755(Static237.anInt4904) >= 11) {
				@Pc(14) int local14 = Static142.aClass1_Sub21_Sub2_1.method5756(11);
				if (local14 != 2047) {
					@Pc(19) boolean local19 = false;
					if (Static202.aClass10_Sub1_Sub2_Sub2Array1[local14] == null) {
						Static202.aClass10_Sub1_Sub2_Sub2Array1[local14] = new Class10_Sub1_Sub2_Sub2();
						Static202.aClass10_Sub1_Sub2_Sub2Array1[local14].anInt4036 = local14;
						local19 = true;
						if (Static83.aClass1_Sub21Array1[local14] != null) {
							Static202.aClass10_Sub1_Sub2_Sub2Array1[local14].method3421(Static83.aClass1_Sub21Array1[local14]);
						}
					}
					Static212.anIntArray415[Static167.anInt3454++] = local14;
					@Pc(60) Class10_Sub1_Sub2_Sub2 local60 = Static202.aClass10_Sub1_Sub2_Sub2Array1[local14];
					local60.anInt4071 = Static282.anInt3516;
					@Pc(68) int local68 = Static142.aClass1_Sub21_Sub2_1.method5756(5);
					if (local68 > 15) {
						local68 -= 32;
					}
					@Pc(77) int local77 = Static142.aClass1_Sub21_Sub2_1.method5756(1);
					if (local77 == 1) {
						Static312.anIntArray623[Static62.anInt6674++] = local14;
					}
					@Pc(93) int local93 = Static142.aClass1_Sub21_Sub2_1.method5756(5);
					if (local93 > 15) {
						local93 -= 32;
					}
					@Pc(106) int local106 = Static125.anIntArray254[Static142.aClass1_Sub21_Sub2_1.method5756(3)];
					@Pc(111) int local111 = Static142.aClass1_Sub21_Sub2_1.method5756(1);
					if (local19) {
						local60.method3415(local106);
					}
					local60.method3420(Static127.aClass10_Sub1_Sub2_Sub2_1.anIntArray388[0] + local68, Static127.anInt2487, local111 == 1, Static127.aClass10_Sub1_Sub2_Sub2_1.anIntArray387[0] + local93);
					continue;
				}
			}
			Static142.aClass1_Sub21_Sub2_1.method5759();
			return;
		}
	}
}
