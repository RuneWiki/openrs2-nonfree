import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static429 {

	@OriginalMember(owner = "client!vg", name = "o", descriptor = "I")
	public static int anInt7148;

	@OriginalMember(owner = "client!vg", name = "w", descriptor = "Lclient!o;")
	public static Class49 aClass49_24;

	@OriginalMember(owner = "client!vg", name = "c", descriptor = "Lclient!pu;")
	public static final Class198 aClass198_120 = new Class198("flash3:", "blinken3:", "clignotant3:", "brilho3:");

	@OriginalMember(owner = "client!vg", name = "p", descriptor = "Lclient!pu;")
	public static final Class198 aClass198_121 = new Class198("Loaded config", "Konfig geladen.", "Fichiers config chargés", "Config carregada");

	@OriginalMember(owner = "client!vg", name = "u", descriptor = "Lclient!jp;")
	public static final Class129 aClass129_187 = new Class129(81, -1);

	@OriginalMember(owner = "client!vg", name = "v", descriptor = "Lclient!pu;")
	public static final Class198 aClass198_122 = new Class198("Starting 3D Library", "Starte 3D-Softwarebibliothek.", "Démarrage de la librairie 3D", "Iniciando biblioteca 3D");

	@OriginalMember(owner = "client!vg", name = "f", descriptor = "(I)[Lclient!nj;")
	public static Class172[] method5668() {
		return new Class172[] { Static293.aClass172_3, Static229.aClass172_1, Static257.aClass172_2 };
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(Lclient!fh;ILclient!gt;I)V")
	public static void method5669(@OriginalArg(0) Class5_Sub15 arg0, @OriginalArg(2) Class93 arg1, @OriginalArg(3) int arg2) {
		@Pc(14) Class5_Sub47 local14 = new Class5_Sub47();
		local14.anInt7453 = arg0.method5539();
		local14.anInt7449 = arg0.method5603();
		local14.anIntArray508 = new int[local14.anInt7453];
		local14.anIntArray509 = new int[local14.anInt7453];
		local14.anIntArray506 = new int[local14.anInt7453];
		local14.aByteArrayArrayArray17 = new byte[local14.anInt7453][][];
		local14.aClass268Array1 = new Class268[local14.anInt7453];
		local14.aClass268Array2 = new Class268[local14.anInt7453];
		for (@Pc(56) int local56 = 0; local56 < local14.anInt7453; local56++) {
			try {
				@Pc(62) int local62 = arg0.method5539();
				@Pc(78) String local78;
				@Pc(82) String local82;
				@Pc(84) int local84;
				if (local62 == 0 || local62 == 1 || local62 == 2) {
					local78 = arg0.method5549();
					local82 = arg0.method5549();
					local84 = 0;
					if (local62 == 1) {
						local84 = arg0.method5603();
					}
					local14.anIntArray506[local56] = local62;
					local14.anIntArray508[local56] = local84;
					local14.aClass268Array1[local56] = arg1.method2093(Static227.method2991(local78), local82);
				} else if (local62 == 3 || local62 == 4) {
					local78 = arg0.method5549();
					local82 = arg0.method5549();
					local84 = arg0.method5539();
					@Pc(143) String[] local143 = new String[local84];
					for (@Pc(145) int local145 = 0; local145 < local84; local145++) {
						local143[local145] = arg0.method5549();
					}
					@Pc(164) byte[][] local164 = new byte[local84][];
					@Pc(177) int local177;
					if (local62 == 3) {
						for (@Pc(171) int local171 = 0; local171 < local84; local171++) {
							local177 = arg0.method5603();
							local164[local171] = new byte[local177];
							arg0.method5540(local177, local164[local171]);
						}
					}
					local14.anIntArray506[local56] = local62;
					@Pc(202) Class[] local202 = new Class[local84];
					for (local177 = 0; local177 < local84; local177++) {
						local202[local177] = Static227.method2991(local143[local177]);
					}
					local14.aClass268Array2[local56] = arg1.method2091(local82, local202, Static227.method2991(local78));
					local14.aByteArrayArrayArray17[local56] = local164;
				}
			} catch (@Pc(239) ClassNotFoundException local239) {
				local14.anIntArray509[local56] = -1;
			} catch (@Pc(246) SecurityException local246) {
				local14.anIntArray509[local56] = -2;
			} catch (@Pc(253) NullPointerException local253) {
				local14.anIntArray509[local56] = -3;
			} catch (@Pc(260) Exception local260) {
				local14.anIntArray509[local56] = -4;
			} catch (@Pc(267) Throwable local267) {
				local14.anIntArray509[local56] = -5;
			}
		}
		Static430.aClass177_47.method3615(local14);
	}
}
