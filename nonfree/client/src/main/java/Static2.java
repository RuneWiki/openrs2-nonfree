import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static2 {

	@OriginalMember(owner = "client!aa", name = "Q", descriptor = "Lclient!i;")
	public static Class41 aClass41_16 = Static184.method2923("null");

	@OriginalMember(owner = "client!aa", name = "W", descriptor = "Lclient!i;")
	public static Class41 aClass41_17 = Static184.method2923("<col=ff7000>");

	@OriginalMember(owner = "client!aa", name = "Y", descriptor = "Lclient!i;")
	private static Class41 aClass41_18 = Static184.method2923("Started 3d library");

	@OriginalMember(owner = "client!aa", name = "Z", descriptor = "Lclient!i;")
	public static Class41 aClass41_19 = Static184.method2923(")1p");

	@OriginalMember(owner = "client!aa", name = "bb", descriptor = "Lclient!i;")
	public static Class41 aClass41_20 = Static184.method2923("Ung-Ultiges Anmelde)2Paket)3");

	@OriginalMember(owner = "client!aa", name = "cb", descriptor = "Lclient!i;")
	public static Class41 aClass41_21 = aClass41_18;

	@OriginalMember(owner = "client!aa", name = "db", descriptor = "I")
	public static int anInt70 = -1;

	@OriginalMember(owner = "client!aa", name = "d", descriptor = "(B)V")
	public static void method51() {
		Static204.aClass2_Sub3_Sub1_3.method225();
		@Pc(13) int local13 = Static204.aClass2_Sub3_Sub1_3.method219(8);
		@Pc(18) int local18;
		if (Static50.anInt2134 > local13) {
			for (local18 = local13; local18 < Static50.anInt2134; local18++) {
				Static48.anIntArray131[Static198.anInt4444++] = Static23.anIntArray47[local18];
			}
		}
		if (local13 > Static50.anInt2134) {
			throw new RuntimeException("gnpov1");
		}
		Static50.anInt2134 = 0;
		for (local18 = 0; local18 < local13; local18++) {
			@Pc(60) int local60 = Static23.anIntArray47[local18];
			@Pc(64) Class12_Sub3_Sub2 local64 = Static199.aClass12_Sub3_Sub2Array1[local60];
			@Pc(69) int local69 = Static204.aClass2_Sub3_Sub1_3.method219(1);
			if (local69 == 0) {
				Static23.anIntArray47[Static50.anInt2134++] = local60;
				local64.anInt3912 = Static103.anInt2511;
			} else {
				@Pc(92) int local92 = Static204.aClass2_Sub3_Sub1_3.method219(2);
				if (local92 == 0) {
					Static23.anIntArray47[Static50.anInt2134++] = local60;
					local64.anInt3912 = Static103.anInt2511;
					Static124.anIntArray313[Static170.anInt3986++] = local60;
				} else {
					@Pc(134) int local134;
					@Pc(144) int local144;
					if (local92 == 1) {
						Static23.anIntArray47[Static50.anInt2134++] = local60;
						local64.anInt3912 = Static103.anInt2511;
						local134 = Static204.aClass2_Sub3_Sub1_3.method219(3);
						local64.method2724(false, local134);
						local144 = Static204.aClass2_Sub3_Sub1_3.method219(1);
						if (local144 == 1) {
							Static124.anIntArray313[Static170.anInt3986++] = local60;
						}
					} else if (local92 == 2) {
						Static23.anIntArray47[Static50.anInt2134++] = local60;
						local64.anInt3912 = Static103.anInt2511;
						local134 = Static204.aClass2_Sub3_Sub1_3.method219(3);
						local64.method2724(true, local134);
						local144 = Static204.aClass2_Sub3_Sub1_3.method219(3);
						local64.method2724(true, local144);
						@Pc(198) int local198 = Static204.aClass2_Sub3_Sub1_3.method219(1);
						if (local198 == 1) {
							Static124.anIntArray313[Static170.anInt3986++] = local60;
						}
					} else if (local92 == 3) {
						Static48.anIntArray131[Static198.anInt4444++] = local60;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(Lclient!q;B)V")
	public static void method52(@OriginalArg(0) Class80 arg0) {
		@Pc(7) Class80 local7 = Static181.method2898(arg0);
		@Pc(19) int local19;
		@Pc(21) int local21;
		if (local7 == null) {
			local19 = Static197.anInt4442;
			local21 = Static130.anInt3906;
		} else {
			local21 = local7.anInt3660;
			local19 = local7.anInt3635;
		}
		Static176.method2836(arg0, local19, local21);
	}
}
