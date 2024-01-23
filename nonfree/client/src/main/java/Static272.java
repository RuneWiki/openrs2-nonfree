import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static272 {

	@OriginalMember(owner = "client!uk", name = "e", descriptor = "Lclient!ak;")
	public static Class7 aClass7_218;

	@OriginalMember(owner = "client!uk", name = "f", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray33 = new String[5];

	@OriginalMember(owner = "client!uk", name = "b", descriptor = "(I)V")
	public static void method4178() {
		while (true) {
			if (Static63.aClass1_Sub18_Sub1_1.method3125(Static292.anInt5802) >= 11) {
				@Pc(14) int local14 = Static63.aClass1_Sub18_Sub1_1.method3129(11);
				if (local14 != 2047) {
					@Pc(21) boolean local21 = false;
					if (Static77.aClass6_Sub6_Sub2Array1[local14] == null) {
						local21 = true;
						Static77.aClass6_Sub6_Sub2Array1[local14] = new Class6_Sub6_Sub2();
						if (Static130.aClass1_Sub18Array1[local14] != null) {
							Static77.aClass6_Sub6_Sub2Array1[local14].method3516(Static130.aClass1_Sub18Array1[local14]);
						}
					}
					Static143.anIntArray331[Static241.anInt4977++] = local14;
					@Pc(57) Class6_Sub6_Sub2 local57 = Static77.aClass6_Sub6_Sub2Array1[local14];
					local57.anInt4519 = Static261.anInt5259;
					@Pc(67) int local67 = Static43.anIntArray129[Static63.aClass1_Sub18_Sub1_1.method3129(3)];
					if (local21) {
						local57.anInt4579 = local57.anInt4511 = local67;
					}
					@Pc(81) int local81 = Static63.aClass1_Sub18_Sub1_1.method3129(1);
					if (local81 == 1) {
						Static294.anIntArray687[Static101.anInt1926++] = local14;
					}
					@Pc(100) int local100 = Static63.aClass1_Sub18_Sub1_1.method3129(5);
					@Pc(105) int local105 = Static63.aClass1_Sub18_Sub1_1.method3129(1);
					if (local100 > 15) {
						local100 -= 32;
					}
					@Pc(116) int local116 = Static63.aClass1_Sub18_Sub1_1.method3129(5);
					if (local116 > 15) {
						local116 -= 32;
					}
					local57.method3519(Static28.aClass6_Sub6_Sub2_1.anIntArray516[0] + local116, local100 + Static28.aClass6_Sub6_Sub2_1.anIntArray519[0], local105 == 1);
					continue;
				}
			}
			Static63.aClass1_Sub18_Sub1_1.method3132();
			return;
		}
	}
}
