import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static50 {

	@OriginalMember(owner = "client!ch", name = "m", descriptor = "[[I")
	public static int[][] anIntArrayArray8;

	@OriginalMember(owner = "client!ch", name = "b", descriptor = "I")
	public static int anInt855 = 0;

	@OriginalMember(owner = "client!ch", name = "d", descriptor = "Lclient!sl;")
	public static final Class215 aClass215_11 = new Class215(69, 0);

	@OriginalMember(owner = "client!ch", name = "f", descriptor = "F")
	public static float aFloat28 = 0.0F;

	@OriginalMember(owner = "client!ch", name = "g", descriptor = "Lclient!gk;")
	public static final Class83 aClass83_27 = new Class83("Loading defaults - ", "Lade Standardeinstellungen - ", "Chargement des paramètres par défaut - ", "Carregando padrões - ");

	@OriginalMember(owner = "client!ch", name = "h", descriptor = "[I")
	public static final int[] anIntArray50 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!ch", name = "n", descriptor = "I")
	public static int anInt862 = 0;

	@OriginalMember(owner = "client!ch", name = "c", descriptor = "(I)V")
	public static void method813() {
		if (Static122.aClass19_16 == null) {
			return;
		}
		Static18.aClass84_2.method2310();
		Static85.method1541();
		Static277.method3932();
		Static246.method3601();
		Static316.method4217();
		Static351.method4759();
		if (Static10.aClass242_1 != null) {
			Static10.aClass242_1.method5253();
		}
		Static44.method759();
		Static409.method5485();
		Static298.method4086();
		Static33.method633(false);
		Static356.method4834();
		for (@Pc(45) int local45 = 0; local45 < 2048; local45++) {
			@Pc(51) Class16_Sub1_Sub5_Sub1 local51 = Static267.aClass16_Sub1_Sub5_Sub1Array1[local45];
			if (local51 != null) {
				local51.aClass4_Sub23_3 = null;
				for (@Pc(58) int local58 = 0; local58 < local51.aClass110Array3.length; local58++) {
					local51.aClass110Array3[local58] = null;
				}
			}
		}
		for (@Pc(83) int local83 = 0; local83 < Static143.aClass16_Sub1_Sub5_Sub2Array1.length; local83++) {
			@Pc(89) Class16_Sub1_Sub5_Sub2 local89 = Static143.aClass16_Sub1_Sub5_Sub2Array1[local83];
			if (local89 != null) {
				for (@Pc(93) int local93 = 0; local93 < local89.aClass110Array3.length; local93++) {
					local89.aClass110Array3[local93] = null;
				}
			}
		}
		Static122.aClass19_16.method4267();
		Static122.aClass19_16 = null;
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIIIIII)V")
	public static void method814(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) Class136 local3 = new Class136();
		local3.anInt4365 = arg1 >> Static231.anInt4434;
		local3.anInt4363 = arg2 >> Static231.anInt4434;
		local3.anInt4354 = arg3 >> Static231.anInt4434;
		local3.anInt4357 = arg4 >> Static231.anInt4434;
		local3.anInt4360 = arg0;
		local3.anInt4355 = arg1;
		local3.anInt4370 = arg2;
		local3.anInt4359 = arg3;
		local3.anInt4356 = arg4;
		local3.anInt4368 = arg5;
		local3.anInt4361 = arg6;
		Static91.aClass136Array2[Static93.anInt1878++] = local3;
	}
}
