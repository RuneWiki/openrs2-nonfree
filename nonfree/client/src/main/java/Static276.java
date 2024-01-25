import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static276 {

	@OriginalMember(owner = "client!qc", name = "u", descriptor = "Lclient!ch;")
	public static final Class32 aClass32_74 = new Class32("Loaded fonts", "Schriftsätze geladen.", "Polices chargées", "Fontes carregadas");

	@OriginalMember(owner = "client!qc", name = "B", descriptor = "Lclient!ap;")
	public static final Class11 aClass11_74 = new Class11(67, 2);

	@OriginalMember(owner = "client!qc", name = "C", descriptor = "[C")
	public static final char[] aCharArray4 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

	@OriginalMember(owner = "client!qc", name = "D", descriptor = "[Lclient!ju;")
	public static final Class130[] aClass130Array1 = new Class130[50];

	@OriginalMember(owner = "client!qc", name = "E", descriptor = "I")
	public static int anInt4757 = 0;

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(IBLclient!is;Lclient!kk;)V")
	public static void method4199(@OriginalArg(0) int arg0, @OriginalArg(2) Class111 arg1, @OriginalArg(3) Class2_Sub16 arg2) {
		@Pc(9) Class2_Sub35 local9 = new Class2_Sub35();
		local9.anInt4889 = arg2.method5350();
		local9.anInt4888 = arg2.method5346();
		local9.anIntArray955 = new int[local9.anInt4889];
		local9.anIntArray953 = new int[local9.anInt4889];
		local9.anIntArray954 = new int[local9.anInt4889];
		local9.aClass182Array1 = new Class182[local9.anInt4889];
		local9.aByteArrayArrayArray17 = new byte[local9.anInt4889][][];
		local9.aClass182Array2 = new Class182[local9.anInt4889];
		for (@Pc(59) int local59 = 0; local59 < local9.anInt4889; local59++) {
			try {
				@Pc(65) int local65 = arg2.method5350();
				@Pc(77) String local77;
				@Pc(81) String local81;
				@Pc(83) int local83;
				if (local65 == 0 || local65 == 1 || local65 == 2) {
					local77 = arg2.method5364();
					local81 = arg2.method5364();
					local83 = 0;
					if (local65 == 1) {
						local83 = arg2.method5346();
					}
					local9.anIntArray953[local59] = local65;
					local9.anIntArray954[local59] = local83;
					local9.aClass182Array2[local59] = arg1.method2796(local81, Static200.method3360(local77));
				} else if (local65 == 3 || local65 == 4) {
					local77 = arg2.method5364();
					local81 = arg2.method5364();
					local83 = arg2.method5350();
					@Pc(140) String[] local140 = new String[local83];
					for (@Pc(142) int local142 = 0; local142 < local83; local142++) {
						local140[local142] = arg2.method5364();
					}
					@Pc(157) byte[][] local157 = new byte[local83][];
					@Pc(170) int local170;
					if (local65 == 3) {
						for (@Pc(164) int local164 = 0; local164 < local83; local164++) {
							local170 = arg2.method5346();
							local157[local164] = new byte[local170];
							arg2.method5357(local170, local157[local164]);
						}
					}
					local9.anIntArray953[local59] = local65;
					@Pc(195) Class[] local195 = new Class[local83];
					for (local170 = 0; local170 < local83; local170++) {
						local195[local170] = Static200.method3360(local140[local170]);
					}
					local9.aClass182Array1[local59] = arg1.method2802(Static200.method3360(local77), local195, local81);
					local9.aByteArrayArrayArray17[local59] = local157;
				}
			} catch (@Pc(230) ClassNotFoundException local230) {
				local9.anIntArray955[local59] = -1;
			} catch (@Pc(237) SecurityException local237) {
				local9.anIntArray955[local59] = -2;
			} catch (@Pc(244) NullPointerException local244) {
				local9.anIntArray955[local59] = -3;
			} catch (@Pc(251) Exception local251) {
				local9.anIntArray955[local59] = -4;
			} catch (@Pc(258) Throwable local258) {
				local9.anIntArray955[local59] = -5;
			}
		}
		Static121.aClass30_17.method685(local9);
	}
}
