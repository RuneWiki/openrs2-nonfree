import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static83 {

	@OriginalMember(owner = "client!ih", name = "b", descriptor = "Ljava/lang/String;")
	public static String aString3;

	@OriginalMember(owner = "client!ih", name = "d", descriptor = "[I")
	public static int[] anIntArray205 = new int[5];

	@OriginalMember(owner = "client!ih", name = "f", descriptor = "[J")
	public static long[] aLongArray6 = new long[100];

	@OriginalMember(owner = "client!ih", name = "i", descriptor = "Lclient!i;")
	public static Class41 aClass41_628 = Static184.method2923("; Max)2Age=");

	@OriginalMember(owner = "client!ih", name = "l", descriptor = "Lclient!i;")
	public static Class41 aClass41_629 = Static184.method2923(" zuerst von Ihrer Freunde)2Liste(Q");

	@OriginalMember(owner = "client!ih", name = "m", descriptor = "Lclient!i;")
	public static Class41 aClass41_630 = Static184.method2923("http:)4)4");

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(Z)V")
	public static void method1494() {
		while (true) {
			if (Static204.aClass2_Sub3_Sub1_3.method222(Static202.anInt1733) >= 11) {
				@Pc(14) int local14 = Static204.aClass2_Sub3_Sub1_3.method219(11);
				if (local14 != 2047) {
					@Pc(21) boolean local21 = false;
					if (Static216.aClass12_Sub3_Sub1Array1[local14] == null) {
						local21 = true;
						Static216.aClass12_Sub3_Sub1Array1[local14] = new Class12_Sub3_Sub1();
						if (Static67.aClass2_Sub3Array1[local14] != null) {
							Static216.aClass12_Sub3_Sub1Array1[local14].method859(Static67.aClass2_Sub3Array1[local14]);
						}
					}
					Static156.anIntArray386[Static50.anInt2126++] = local14;
					@Pc(57) Class12_Sub3_Sub1 local57 = Static216.aClass12_Sub3_Sub1Array1[local14];
					local57.anInt3912 = Static103.anInt2511;
					@Pc(67) int local67 = Static5.anIntArray12[Static204.aClass2_Sub3_Sub1_3.method219(3)];
					if (local21) {
						local57.anInt3947 = local57.anInt3916 = local67;
					}
					@Pc(80) int local80 = Static204.aClass2_Sub3_Sub1_3.method219(1);
					if (local80 == 1) {
						Static124.anIntArray313[Static170.anInt3986++] = local14;
					}
					@Pc(96) int local96 = Static204.aClass2_Sub3_Sub1_3.method219(5);
					if (local96 > 15) {
						local96 -= 32;
					}
					@Pc(105) int local105 = Static204.aClass2_Sub3_Sub1_3.method219(5);
					if (local105 > 15) {
						local105 -= 32;
					}
					@Pc(114) int local114 = Static204.aClass2_Sub3_Sub1_3.method219(1);
					local57.method2722(local114 == 1, Static213.aClass12_Sub3_Sub1_1.anIntArray412[0] + local105, Static213.aClass12_Sub3_Sub1_1.anIntArray414[0] - -local96);
					continue;
				}
			}
			Static204.aClass2_Sub3_Sub1_3.method226();
			return;
		}
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "([IIBIII[BIIII)V")
	public static void method1495(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) byte[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(24) int local24 = (arg2 * (arg6 & 0xFF00FF) & 0xFF00FF00) + ((arg6 & 0xFF00) * arg2 & 0xFF0000) >> 8;
		@Pc(28) int local28 = 256 - arg2;
		for (@Pc(31) int local31 = -arg8; local31 < 0; local31++) {
			for (@Pc(36) int local36 = -arg1; local36 < 0; local36++) {
				if (arg5[arg3++] == 0) {
					arg7++;
				} else {
					@Pc(50) int local50 = arg0[arg7];
					arg0[arg7++] = ((local28 * (local50 & 0xFF00FF) & 0xFF00FF00) + (local28 * (local50 & 0xFF00) & 0xFF0000) >> 8) + local24;
				}
			}
			arg7 += arg4;
			arg3 += arg9;
		}
	}
}
