import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static79 {

	@OriginalMember(owner = "client!er", name = "t", descriptor = "Lclient!tq;")
	public static Class191 aClass191_52;

	@OriginalMember(owner = "client!er", name = "A", descriptor = "I")
	public static int anInt1748;

	@OriginalMember(owner = "client!er", name = "b", descriptor = "Lclient!iq;")
	public static final Class93 aClass93_25 = new Class93("Loaded sprites", "Sprites geladen.", "Sprites chargés", "Sprites carregados");

	@OriginalMember(owner = "client!er", name = "d", descriptor = "I")
	public static int anInt1737 = 0;

	@OriginalMember(owner = "client!er", name = "v", descriptor = "[J")
	public static final long[] aLongArray2 = new long[32];

	@OriginalMember(owner = "client!er", name = "w", descriptor = "I")
	public static int anInt1746 = 1;

	@OriginalMember(owner = "client!er", name = "y", descriptor = "I")
	public static int anInt1747 = 0;

	@OriginalMember(owner = "client!er", name = "z", descriptor = "Lclient!iq;")
	public static final Class93 aClass93_26 = new Class93("Connecting to update server", "Verbindung mit Update-Server...", "Connexion au serveur de mise à jour en cours", "Conectando ao servidor de atualização");

	@OriginalMember(owner = "client!er", name = "B", descriptor = "Lclient!iq;")
	public static final Class93 aClass93_27 = new Class93("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ");

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(Lclient!fj;I)I")
	public static int method1812(@OriginalArg(0) Class62_Sub1_Sub2 arg0) {
		if (arg0.anInt5294 == 0) {
			return 0;
		}
		@Pc(34) int local34;
		@Pc(41) int local41;
		if (arg0.anInt5292 != -1 && arg0.anInt5292 < 32768) {
			@Pc(25) Class62_Sub1_Sub2_Sub1 local25 = Static37.aClass62_Sub1_Sub2_Sub1Array1[arg0.anInt5292];
			if (local25 != null) {
				local34 = arg0.anInt5289 - local25.anInt5289;
				local41 = arg0.anInt5280 - local25.anInt5280;
				if (local34 != 0 || local41 != 0) {
					arg0.method4776((int) (Math.atan2((double) local34, (double) local41) * 2607.5945876176133D) & 0x3FFF);
				}
			}
		}
		@Pc(74) int local74;
		if (arg0.anInt5292 >= 32768) {
			local74 = arg0.anInt5292 - 32768;
			if (local74 == Static40.anInt797) {
				local74 = 2047;
			}
			@Pc(83) Class62_Sub1_Sub2_Sub2 local83 = Static129.aClass62_Sub1_Sub2_Sub2Array1[local74];
			if (local83 != null) {
				local41 = arg0.anInt5289 - local83.anInt5289;
				@Pc(98) int local98 = arg0.anInt5280 - local83.anInt5280;
				if (local41 != 0 || local98 != 0) {
					arg0.method4776((int) (Math.atan2((double) local41, (double) local98) * 2607.5945876176133D) & 0x3FFF);
				}
			}
		}
		if ((arg0.anInt5323 != 0 || arg0.anInt5346 != 0) && (arg0.anInt5372 == 0 || arg0.anInt5366 > 0)) {
			local74 = arg0.anInt5289 - (arg0.anInt5323 - Static138.anInt2879 - Static138.anInt2879) * 64;
			local34 = arg0.anInt5280 - (arg0.anInt5346 - Static342.anInt6864 - Static342.anInt6864) * 64;
			if (local74 != 0 || local34 != 0) {
				arg0.method4776((int) (Math.atan2((double) local74, (double) local34) * 2607.5945876176133D) & 0x3FFF);
			}
			arg0.anInt5323 = 0;
			arg0.anInt5346 = 0;
		}
		return arg0.method4768();
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(Lclient!tq;B)V")
	public static void method1814(@OriginalArg(0) Class191 arg0) {
		Static78.aClass191_51 = arg0;
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(BIZIZII)V")
	public static void method1816(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg0 >= arg2) {
			return;
		}
		@Pc(19) int local19 = (arg0 + arg2) / 2;
		@Pc(21) int local21 = arg0;
		@Pc(25) Class20_Sub1 local25 = Static303.aClass20_Sub1Array3[local19];
		Static303.aClass20_Sub1Array3[local19] = Static303.aClass20_Sub1Array3[arg2];
		Static303.aClass20_Sub1Array3[arg2] = local25;
		for (@Pc(37) int local37 = arg0; local37 < arg2; local37++) {
			if (Static95.method5548(local25, arg4, arg5, Static303.aClass20_Sub1Array3[local37], arg1, arg3) <= 0) {
				@Pc(57) Class20_Sub1 local57 = Static303.aClass20_Sub1Array3[local37];
				Static303.aClass20_Sub1Array3[local37] = Static303.aClass20_Sub1Array3[local21];
				Static303.aClass20_Sub1Array3[local21++] = local57;
			}
		}
		Static303.aClass20_Sub1Array3[arg2] = Static303.aClass20_Sub1Array3[local21];
		Static303.aClass20_Sub1Array3[local21] = local25;
		method1816(arg0, arg1, local21 - 1, arg3, arg4, arg5);
		method1816(local21 + 1, arg1, arg2, arg3, arg4, arg5);
	}
}
