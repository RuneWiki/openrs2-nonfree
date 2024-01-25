import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static224 {

	@OriginalMember(owner = "client!jh", name = "t", descriptor = "I")
	public static int anInt4840;

	@OriginalMember(owner = "client!jh", name = "r", descriptor = "Lclient!ea;")
	public static final Class67 aClass67_68 = new Class67("Initialised native registry", "Registry initialisiert", "Registre natif initialisé", "Inicializando registro nativo");

	@OriginalMember(owner = "client!jh", name = "u", descriptor = "Lclient!ig;")
	public static final Class133 aClass133_82 = new Class133(14, 12);

	@OriginalMember(owner = "client!jh", name = "v", descriptor = "Lclient!ea;")
	public static final Class67 aClass67_69 = new Class67("Loaded title screen", "Titelbild geladen.", "Écran-titre chargé", "Tela título carregada");

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(I)V")
	public static void method4060() {
		Static318.anInt5230 = 0;
		@Pc(11) int local11 = Static90.aClass3_Sub27_Sub1_1.method7566();
		@Pc(15) int local15 = Static90.aClass3_Sub27_Sub1_1.method7548();
		@Pc(19) int local19 = Static90.aClass3_Sub27_Sub1_1.method7591();
		@Pc(37) boolean local37 = Static90.aClass3_Sub27_Sub1_1.method7580() == 1;
		Static347.method5529();
		Static520.method7395(local15);
		@Pc(50) int local50 = (Static35.anInt921 - Static90.aClass3_Sub27_Sub1_1.anInt9191) / 16;
		Static523.anIntArrayArray87 = new int[local50][4];
		@Pc(60) int local60;
		for (@Pc(56) int local56 = 0; local56 < local50; local56++) {
			for (local60 = 0; local60 < 4; local60++) {
				Static523.anIntArrayArray87[local56][local60] = Static90.aClass3_Sub27_Sub1_1.method7549();
			}
		}
		Static165.anIntArray376 = null;
		Static112.anIntArray658 = new int[local50];
		Static330.anIntArray546 = new int[local50];
		Static521.aByteArrayArray29 = null;
		Static467.anIntArray715 = new int[local50];
		Static28.anIntArray129 = new int[local50];
		Static457.aByteArrayArray25 = new byte[local50][];
		Static75.anIntArray738 = new int[local50];
		Static326.aByteArrayArray16 = new byte[local50][];
		Static343.aByteArrayArray18 = new byte[local50][];
		Static328.aByteArrayArray17 = new byte[local50][];
		local50 = 0;
		for (local60 = (local19 - (Static118.anInt2527 >> 4)) / 8; local60 <= ((Static118.anInt2527 >> 4) + local19) / 8; local60++) {
			for (@Pc(135) int local135 = (local11 - (Static549.anInt9482 >> 4)) / 8; local135 <= ((Static549.anInt9482 >> 4) + local11) / 8; local135++) {
				Static467.anIntArray715[local50] = (local60 << 8) + local135;
				Static112.anIntArray658[local50] = Static307.aClass161_51.method4240("m" + local60 + "_" + local135);
				Static330.anIntArray546[local50] = Static307.aClass161_51.method4240("l" + local60 + "_" + local135);
				Static28.anIntArray129[local50] = Static307.aClass161_51.method4240("um" + local60 + "_" + local135);
				Static75.anIntArray738[local50] = Static307.aClass161_51.method4240("ul" + local60 + "_" + local135);
				local50++;
			}
		}
		Static49.method1038(local11, local19, 10, local37);
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(III)I")
	public static int method4061(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg0 == 4 || arg0 == 5 ? Static283.anIntArray514[arg1 & 0x3] : 256;
	}
}
