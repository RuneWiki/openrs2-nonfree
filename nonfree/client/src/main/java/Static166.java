import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static166 {

	@OriginalMember(owner = "client!ge", name = "O", descriptor = "Lclient!wp;")
	public static final Class363 aClass363_90 = new Class363(41, 3);

	@OriginalMember(owner = "client!ge", name = "P", descriptor = "[I")
	public static final int[] anIntArray197 = new int[2];

	@OriginalMember(owner = "client!ge", name = "U", descriptor = "I")
	public static final int anInt3524 = 1339;

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "(IBI)V")
	public static void method2908(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class2_Sub3_Sub13 local13 = Static382.method5650(7, arg0);
		local13.method6098();
		local13.anInt7258 = arg1;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IILjava/lang/String;)V")
	public static void method2909(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		@Pc(12) int local12 = Static376.anInt6647;
		@Pc(14) int[] local14 = Static557.anIntArray665;
		@Pc(16) boolean local16 = false;
		for (@Pc(18) int local18 = 0; local18 < local12; local18++) {
			@Pc(26) Class6_Sub1_Sub1_Sub1_Sub2 local26 = Static136.aClass6_Sub1_Sub1_Sub1_Sub2Array1[local14[local18]];
			if (local26 != null && Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2 != local26 && local26.aString67 != null && local26.aString67.equalsIgnoreCase(arg1)) {
				@Pc(51) Class2_Sub42 local51;
				if (arg0 == 1) {
					local51 = Static249.method3910(Static273.aClass286_90, Static400.aClass145_2);
					local51.aClass2_Sub15_Sub2_2.method4329(local14[local18]);
					local51.aClass2_Sub15_Sub2_2.method4333(0);
					Static531.method7296(local51);
				} else if (arg0 == 4) {
					local51 = Static249.method3910(Static242.aClass286_76, Static400.aClass145_2);
					local51.aClass2_Sub15_Sub2_2.method4290(local14[local18]);
					local51.aClass2_Sub15_Sub2_2.method4336(0);
					Static531.method7296(local51);
				} else if (arg0 == 5) {
					local51 = Static249.method3910(Static543.aClass286_154, Static400.aClass145_2);
					local51.aClass2_Sub15_Sub2_2.method4329(local14[local18]);
					local51.aClass2_Sub15_Sub2_2.method4349(0);
					Static531.method7296(local51);
				} else if (arg0 == 6) {
					local51 = Static249.method3910(Static47.aClass286_15, Static400.aClass145_2);
					local51.aClass2_Sub15_Sub2_2.method4349(0);
					local51.aClass2_Sub15_Sub2_2.method4329(local14[local18]);
					Static531.method7296(local51);
				} else if (arg0 == 7) {
					local51 = Static249.method3910(Static273.aClass286_89, Static400.aClass145_2);
					local51.aClass2_Sub15_Sub2_2.method4342(0);
					local51.aClass2_Sub15_Sub2_2.method4329(local14[local18]);
					Static531.method7296(local51);
				}
				local16 = true;
				break;
			}
		}
		if (!local16) {
			Static52.method905(Static290.aClass198_23.method4365(Static52.anInt1264) + arg1);
		}
	}
}
