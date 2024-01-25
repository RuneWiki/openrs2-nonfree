import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static62 {

	@OriginalMember(owner = "client!cg", name = "l", descriptor = "I")
	public static int anInt1472;

	@OriginalMember(owner = "client!cg", name = "c", descriptor = "Lclient!ej;")
	public static final Class88 aClass88_36 = new Class88("Stellar Dawn is loading - please wait...", "Mechscape wird geladen - bitte warten...", "Chargement de Mechscape en cours - veuillez patienter...", "Mechscape carregando. Aguarde...");

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(Ljava/lang/String;BI)V")
	public static void method1458(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = Static381.anInt7254;
		@Pc(14) int[] local14 = Static496.anIntArray465;
		@Pc(16) boolean local16 = false;
		for (@Pc(18) int local18 = 0; local18 < local12; local18++) {
			@Pc(26) Class30_Sub1_Sub1_Sub1 local26 = Static90.aClass30_Sub1_Sub1_Sub1Array1[local14[local18]];
			if (local26 != null && Static440.aClass30_Sub1_Sub1_Sub1_2 != local26 && local26.aString6 != null && local26.aString6.equalsIgnoreCase(arg0)) {
				local16 = true;
				if (arg1 == 1) {
					Static332.method5312(Static511.aClass77_88);
					Static383.aClass12_Sub8_Sub2_1.method5230(0);
					Static383.aClass12_Sub8_Sub2_1.method5190(local14[local18]);
				} else if (arg1 == 4) {
					Static332.method5312(Static11.aClass77_1);
					Static383.aClass12_Sub8_Sub2_1.method5197(local14[local18]);
					Static383.aClass12_Sub8_Sub2_1.method5214(0);
				} else if (arg1 == 5) {
					Static332.method5312(Static388.aClass77_67);
					Static383.aClass12_Sub8_Sub2_1.method5182(local14[local18]);
					Static383.aClass12_Sub8_Sub2_1.method5214(0);
				} else if (arg1 == 6) {
					Static332.method5312(Static453.aClass77_77);
					Static383.aClass12_Sub8_Sub2_1.method5197(local14[local18]);
					Static383.aClass12_Sub8_Sub2_1.method5167(0);
				} else if (arg1 == 7) {
					Static332.method5312(Static12.aClass77_2);
					Static383.aClass12_Sub8_Sub2_1.method5182(local14[local18]);
					Static383.aClass12_Sub8_Sub2_1.method5178(0);
				}
				break;
			}
		}
		if (!local16) {
			Static206.method7966(Static283.aClass88_276.method2391(Static345.anInt6495) + arg0);
		}
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(I)V")
	public static void method1459() {
		@Pc(15) Class12_Sub4_Sub1 local15 = Static389.method6156(15, 0);
		local15.method823();
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(ZLclient!mc;)V")
	public static void method1461(@OriginalArg(1) Class198 arg0) {
		if (arg0.anInt5776 == 5 && arg0.anInt5726 != -1) {
			Static349.method5480(Static243.aClass42_4, arg0);
		}
	}
}
