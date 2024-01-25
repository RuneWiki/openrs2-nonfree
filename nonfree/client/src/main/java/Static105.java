import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static105 {

	@OriginalMember(owner = "client!eg", name = "B", descriptor = "I")
	public static int anInt2235;

	@OriginalMember(owner = "client!eg", name = "o", descriptor = "I")
	public static int anInt2227 = 0;

	@OriginalMember(owner = "client!eg", name = "v", descriptor = "Lclient!cea;")
	public static final Class45 aClass45_38 = new Class45("RuneScape is loading - please wait...", "RuneScape wird geladen - bitte warten...", "Chargement de RuneScape en cours - veuillez patienter...", "RuneScape carregando. Aguarde...");

	@OriginalMember(owner = "client!eg", name = "z", descriptor = "Lclient!ui;")
	public static final Class295 aClass295_10 = new Class295();

	@OriginalMember(owner = "client!eg", name = "A", descriptor = "Lclient!cu;")
	public static final Class54 aClass54_7 = new Class54(11, 3);

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(Lclient!qa;)V")
	public static void method2152(@OriginalArg(0) Class4 arg0) {
		for (@Pc(1) int local1 = Static478.anInt8507; local1 < Static63.anInt1587; local1++) {
			for (@Pc(4) int local4 = 0; local4 < Static501.anInt9458; local4++) {
				for (@Pc(7) int local7 = 0; local7 < Static420.anInt7323; local7++) {
					@Pc(16) Class64 local16 = Static263.aClass64ArrayArrayArray3[local1][local4][local7];
					if (local16 != null) {
						@Pc(21) Class20_Sub2 local21 = local16.aClass20_Sub2_1;
						@Pc(24) Class20_Sub2 local24 = local16.aClass20_Sub2_2;
						if (local21 != null && local21.method8038()) {
							Static403.method6416(arg0, local21, local1, local4, local7, 1, 1);
							if (local24 != null && local24.method8038()) {
								Static403.method6416(arg0, local24, local1, local4, local7, 1, 1);
								local24.method8034(false, local21, 0, arg0, 0, 0);
								local24.method8036();
							}
							local21.method8036();
						}
						for (@Pc(70) Class232 local70 = local16.aClass232_2; local70 != null; local70 = local70.aClass232_3) {
							@Pc(74) Class20_Sub1 local74 = local70.aClass20_Sub1_2;
							if (local74 != null && local74.method8038()) {
								Static403.method6416(arg0, local74, local1, local4, local7, local74.aShort126 + 1 - local74.aShort124, local74.aShort125 - local74.aShort123 + 1);
								local74.method8036();
							}
						}
						@Pc(111) Class20_Sub5 local111 = local16.aClass20_Sub5_1;
						if (local111 != null && local111.method8038()) {
							Static124.method2357(arg0, local111, local1, local4, local7);
							local111.method8036();
						}
					}
				}
			}
		}
	}
}
