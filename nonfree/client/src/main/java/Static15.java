import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static15 {

	@OriginalMember(owner = "client!bd", name = "d", descriptor = "I")
	public static int anInt422;

	@OriginalMember(owner = "client!bd", name = "n", descriptor = "I")
	public static int anInt425;

	@OriginalMember(owner = "client!bd", name = "c", descriptor = "Lclient!i;")
	private static Class41 aClass41_89 = Static184.method2923("Too many connections from your address)3");

	@OriginalMember(owner = "client!bd", name = "e", descriptor = "Lclient!i;")
	private static Class41 aClass41_90 = Static184.method2923("Enter your username (V password)3");

	@OriginalMember(owner = "client!bd", name = "f", descriptor = "Lclient!i;")
	public static Class41 aClass41_91 = Static184.method2923("<col=ffffff>");

	@OriginalMember(owner = "client!bd", name = "g", descriptor = "Lclient!i;")
	public static Class41 aClass41_92 = aClass41_90;

	@OriginalMember(owner = "client!bd", name = "h", descriptor = "Lclient!i;")
	public static Class41 aClass41_93 = aClass41_89;

	@OriginalMember(owner = "client!bd", name = "k", descriptor = "Lclient!i;")
	public static Class41 aClass41_94 = Static184.method2923(" Sekunde(Xn(Y -Ubertragen)3");

	@OriginalMember(owner = "client!bd", name = "l", descriptor = "[[I")
	public static int[][] anIntArrayArray2 = new int[5][5000];

	@OriginalMember(owner = "client!bd", name = "m", descriptor = "[[I")
	public static int[][] anIntArrayArray3 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(ILclient!q;)V")
	public static void method302(@OriginalArg(1) Class80 arg0) {
		@Pc(6) int local6 = arg0.anInt3670;
		if (local6 == 324) {
			if (Static50.anInt2131 == -1) {
				Static149.anInt3379 = arg0.anInt3668;
				Static50.anInt2131 = arg0.anInt3680;
			}
			if (Static115.aClass91_3.aBoolean263) {
				arg0.anInt3680 = Static50.anInt2131;
			} else {
				arg0.anInt3680 = Static149.anInt3379;
			}
		} else if (local6 == 325) {
			if (Static50.anInt2131 == -1) {
				Static149.anInt3379 = arg0.anInt3668;
				Static50.anInt2131 = arg0.anInt3680;
			}
			if (Static115.aClass91_3.aBoolean263) {
				arg0.anInt3680 = Static149.anInt3379;
			} else {
				arg0.anInt3680 = Static50.anInt2131;
			}
		} else if (local6 == 327) {
			arg0.anInt3674 = 150;
			arg0.anInt3700 = (int) (Math.sin((double) Static103.anInt2511 / 40.0D) * 256.0D) & 0x7FF;
			arg0.anInt3651 = -1;
			arg0.anInt3665 = 5;
		} else if (local6 == 328) {
			if (Static213.aClass12_Sub3_Sub1_1.aClass41_362 == null) {
				arg0.anInt3651 = 0;
			} else {
				arg0.anInt3674 = 150;
				arg0.anInt3700 = (int) (Math.sin((double) Static103.anInt2511 / 40.0D) * 256.0D) & 0x7FF;
				arg0.anInt3665 = 5;
				arg0.anInt3651 = ((int) Static213.aClass12_Sub3_Sub1_1.aClass41_362.method1419() << 11) + 2047;
				arg0.anInt3647 = Static213.aClass12_Sub3_Sub1_1.anInt3935;
				arg0.anInt3634 = Static213.aClass12_Sub3_Sub1_1.anInt3955;
			}
		}
	}

	@OriginalMember(owner = "client!bd", name = "b", descriptor = "(B)V")
	public static void method303() {
		@Pc(6) int local6 = Static204.aClass2_Sub3_Sub1_3.method219(8);
		if (local6 < Static50.anInt2126) {
			for (@Pc(15) int local15 = local6; local15 < Static50.anInt2126; local15++) {
				Static48.anIntArray131[Static198.anInt4444++] = Static156.anIntArray386[local15];
			}
		}
		if (local6 > Static50.anInt2126) {
			throw new RuntimeException("gppov1");
		}
		Static50.anInt2126 = 0;
		for (@Pc(63) int local63 = 0; local63 < local6; local63++) {
			@Pc(69) int local69 = Static156.anIntArray386[local63];
			@Pc(73) Class12_Sub3_Sub1 local73 = Static216.aClass12_Sub3_Sub1Array1[local69];
			@Pc(78) int local78 = Static204.aClass2_Sub3_Sub1_3.method219(1);
			if (local78 == 0) {
				Static156.anIntArray386[Static50.anInt2126++] = local69;
				local73.anInt3912 = Static103.anInt2511;
			} else {
				@Pc(101) int local101 = Static204.aClass2_Sub3_Sub1_3.method219(2);
				if (local101 == 0) {
					Static156.anIntArray386[Static50.anInt2126++] = local69;
					local73.anInt3912 = Static103.anInt2511;
					Static124.anIntArray313[Static170.anInt3986++] = local69;
				} else {
					@Pc(143) int local143;
					@Pc(153) int local153;
					if (local101 == 1) {
						Static156.anIntArray386[Static50.anInt2126++] = local69;
						local73.anInt3912 = Static103.anInt2511;
						local143 = Static204.aClass2_Sub3_Sub1_3.method219(3);
						local73.method2724(false, local143);
						local153 = Static204.aClass2_Sub3_Sub1_3.method219(1);
						if (local153 == 1) {
							Static124.anIntArray313[Static170.anInt3986++] = local69;
						}
					} else if (local101 == 2) {
						Static156.anIntArray386[Static50.anInt2126++] = local69;
						local73.anInt3912 = Static103.anInt2511;
						local143 = Static204.aClass2_Sub3_Sub1_3.method219(3);
						local73.method2724(true, local143);
						local153 = Static204.aClass2_Sub3_Sub1_3.method219(3);
						local73.method2724(true, local153);
						@Pc(207) int local207 = Static204.aClass2_Sub3_Sub1_3.method219(1);
						if (local207 == 1) {
							Static124.anIntArray313[Static170.anInt3986++] = local69;
						}
					} else if (local101 == 3) {
						Static48.anIntArray131[Static198.anInt4444++] = local69;
					}
				}
			}
		}
	}
}
