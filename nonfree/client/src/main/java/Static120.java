import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static120 {

	@OriginalMember(owner = "client!fp", name = "j", descriptor = "I")
	public static int anInt2211;

	@OriginalMember(owner = "client!fp", name = "l", descriptor = "Lclient!dk;")
	public static Class54 aClass54_36;

	@OriginalMember(owner = "client!fp", name = "p", descriptor = "I")
	public static int anInt2214;

	@OriginalMember(owner = "client!fp", name = "i", descriptor = "I")
	public static int anInt2210 = -1;

	@OriginalMember(owner = "client!fp", name = "m", descriptor = "[I")
	public static int[] anIntArray171 = new int[2];

	@OriginalMember(owner = "client!fp", name = "o", descriptor = "Lclient!kc;")
	public static final Class134 aClass134_41 = new Class134("Loaded title screen", "Titelbild geladen.", "Écran-titre chargé", "Tela título carregada");

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(IIIII)V")
	public static void method1800(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static456.aClass2_Sub13_Sub2_2.anInt4347 = 0;
		Static456.aClass2_Sub13_Sub2_2.method3602(Static167.aClass236_7.anInt6448);
		Static456.aClass2_Sub13_Sub2_2.method3602(arg1);
		Static456.aClass2_Sub13_Sub2_2.method3602(arg0);
		Static456.aClass2_Sub13_Sub2_2.method3568(arg2);
		Static456.aClass2_Sub13_Sub2_2.method3568(arg3);
		Static310.anInt5372 = -3;
		Static116.anInt2153 = 0;
		Static128.anInt2309 = 1;
		Static183.anInt3120 = 0;
	}

	@OriginalMember(owner = "client!fp", name = "c", descriptor = "(I)[Lclient!tv;")
	public static Class238[] method1802() {
		if (Static308.aClass238Array1 == null) {
			@Pc(16) Class238[] local16 = Static125.method1836(Static79.aClass183_2);
			@Pc(20) Class238[] local20 = new Class238[local16.length];
			@Pc(22) int local22 = 0;
			@Pc(76) int local76;
			@Pc(82) Class238 local82;
			label63: for (@Pc(24) int local24 = 0; local24 < local16.length; local24++) {
				@Pc(30) Class238 local30 = local16[local24];
				if ((local30.anInt6534 <= 0 || local30.anInt6534 >= 24) && local30.anInt6531 >= 800 && local30.anInt6530 >= 600 && (Static177.anInt3052 >= 96 || Static288.anInt4743 != 0 || local30.anInt6531 <= 1024 && local30.anInt6530 <= 768)) {
					for (local76 = 0; local76 < local22; local76++) {
						local82 = local20[local76];
						if (local30.anInt6531 == local82.anInt6531 && local30.anInt6530 == local82.anInt6530) {
							if (local82.anInt6534 < local30.anInt6534) {
								local20[local76] = local30;
							}
							continue label63;
						}
					}
					local20[local22] = local30;
					local22++;
				}
			}
			Static308.aClass238Array1 = new Class238[local22];
			Static464.method1963(local20, 0, Static308.aClass238Array1, 0, local22);
			@Pc(134) int[] local134 = new int[Static308.aClass238Array1.length];
			for (local76 = 0; local76 < Static308.aClass238Array1.length; local76++) {
				local82 = Static308.aClass238Array1[local76];
				local134[local76] = local82.anInt6530 * local82.anInt6531;
			}
			Static107.method1658(Static308.aClass238Array1, local134);
		}
		return Static308.aClass238Array1;
	}
}
