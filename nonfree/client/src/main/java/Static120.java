import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static120 {

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "Lclient!bb;")
	public static Class7 aClass7_4;

	@OriginalMember(owner = "client!ue", name = "f", descriptor = "Lclient!he;")
	public static Class1_Sub10 aClass1_Sub10_13;

	@OriginalMember(owner = "client!ue", name = "c", descriptor = "I")
	public static int anInt2784 = 0;

	@OriginalMember(owner = "client!ue", name = "k", descriptor = "Lclient!sc;")
	private static Class66 aClass66_1615 = Static106.method1849(" more options");

	@OriginalMember(owner = "client!ue", name = "d", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1611 = aClass66_1615;

	@OriginalMember(owner = "client!ue", name = "g", descriptor = "Lclient!sc;")
	private static Class66 aClass66_1613 = Static106.method1849(" has logged out)3");

	@OriginalMember(owner = "client!ue", name = "e", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1612 = aClass66_1613;

	@OriginalMember(owner = "client!ue", name = "i", descriptor = "Lclient!sc;")
	private static Class66 aClass66_1614 = Static106.method1849("Bad session id)3");

	@OriginalMember(owner = "client!ue", name = "j", descriptor = "[I")
	public static int[] anIntArray482 = new int[50];

	@OriginalMember(owner = "client!ue", name = "m", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1616 = aClass66_1614;

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIII)V")
	public static void method1964(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static40.anInt1254 == 0 || arg0 == 0 || Static44.anInt1408 >= 50) {
			return;
		}
		anIntArray482[Static44.anInt1408] = arg2;
		Static47.anIntArray225[Static44.anInt1408] = arg0;
		Static50.anIntArray237[Static44.anInt1408] = arg1;
		Static74.aClass11Array1[Static44.anInt1408] = null;
		Static87.anIntArray388[Static44.anInt1408] = 0;
		Static44.anInt1408++;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(I)V")
	public static void method1965() {
		Static133.aClass1_Sub12_Sub1_3.method1228();
		@Pc(13) int local13 = Static133.aClass1_Sub12_Sub1_3.method1232(8);
		@Pc(22) int local22;
		if (Static33.anInt854 > local13) {
			for (local22 = local13; local22 < Static33.anInt854; local22++) {
				Static101.anIntArray421[Static77.anInt2149++] = Static54.anIntArray248[local22];
			}
		}
		if (local13 > Static33.anInt854) {
			throw new RuntimeException("gnpov1");
		}
		Static33.anInt854 = 0;
		for (local22 = 0; local22 < local13; local22++) {
			@Pc(60) int local60 = Static54.anIntArray248[local22];
			@Pc(64) Class1_Sub1_Sub1_Sub5_Sub1 local64 = Static73.aClass1_Sub1_Sub1_Sub5_Sub1Array3[local60];
			@Pc(69) int local69 = Static133.aClass1_Sub12_Sub1_3.method1232(1);
			if (local69 == 0) {
				Static54.anIntArray248[Static33.anInt854++] = local60;
				local64.anInt1285 = Static22.anInt636;
			} else {
				@Pc(89) int local89 = Static133.aClass1_Sub12_Sub1_3.method1232(2);
				if (local89 == 0) {
					Static54.anIntArray248[Static33.anInt854++] = local60;
					local64.anInt1285 = Static22.anInt636;
					Static44.anIntArray207[Static101.anInt2503++] = local60;
				} else {
					@Pc(134) int local134;
					@Pc(144) int local144;
					if (local89 == 1) {
						Static54.anIntArray248[Static33.anInt854++] = local60;
						local64.anInt1285 = Static22.anInt636;
						local134 = Static133.aClass1_Sub12_Sub1_3.method1232(3);
						local64.method926(false, local134);
						local144 = Static133.aClass1_Sub12_Sub1_3.method1232(1);
						if (local144 == 1) {
							Static44.anIntArray207[Static101.anInt2503++] = local60;
						}
					} else if (local89 == 2) {
						Static54.anIntArray248[Static33.anInt854++] = local60;
						local64.anInt1285 = Static22.anInt636;
						local134 = Static133.aClass1_Sub12_Sub1_3.method1232(3);
						local64.method926(true, local134);
						local144 = Static133.aClass1_Sub12_Sub1_3.method1232(3);
						local64.method926(true, local144);
						@Pc(198) int local198 = Static133.aClass1_Sub12_Sub1_3.method1232(1);
						if (local198 == 1) {
							Static44.anIntArray207[Static101.anInt2503++] = local60;
						}
					} else if (local89 == 3) {
						Static101.anIntArray421[Static77.anInt2149++] = local60;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(Lclient!sf;Lclient!sf;ILclient!sf;Lclient!sf;)V")
	public static void method1966(@OriginalArg(0) Class5 arg0, @OriginalArg(1) Class5 arg1, @OriginalArg(3) Class5 arg2, @OriginalArg(4) Class5 arg3) {
		Static50.aClass5_44 = arg0;
		Static84.aClass5_69 = arg1;
		Static129.aClass5_92 = arg3;
		Static128.aClass5_91 = arg2;
		Static100.aClass1_Sub10ArrayArray1 = new Class1_Sub10[Static128.aClass5_91.method130()][];
		Static50.aBooleanArray9 = new boolean[Static128.aClass5_91.method130()];
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(B)V")
	public static void method1967() {
		anIntArray482 = null;
		aClass7_4 = null;
		aClass66_1611 = null;
		aClass66_1616 = null;
		aClass66_1615 = null;
		aClass66_1614 = null;
		aClass66_1613 = null;
		aClass66_1612 = null;
		aClass1_Sub10_13 = null;
	}
}
