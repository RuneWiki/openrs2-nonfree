import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static333 {

	@OriginalMember(owner = "client!tf", name = "M", descriptor = "I")
	public static int anInt6164;

	@OriginalMember(owner = "client!tf", name = "Q", descriptor = "Lclient!dd;")
	public static Class50 aClass50_2;

	@OriginalMember(owner = "client!tf", name = "R", descriptor = "I")
	public static int anInt6167;

	@OriginalMember(owner = "client!tf", name = "P", descriptor = "Lclient!ec;")
	public static final Class62 aClass62_221 = new Class62("Starting 3d Library", "Starte 3D-Softwarebibliothek.", "Démarrage de la librairie 3D", "Iniciando biblioteca 3D");

	@OriginalMember(owner = "client!tf", name = "U", descriptor = "I")
	public static int anInt6170 = 0;

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "([[BLclient!kt;B)V")
	public static void method5394(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) Class133_Sub1 arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg1.anInt3960; local3++) {
			Static131.method2293();
			for (@Pc(11) int local11 = 0; local11 < Static89.anInt1891 >> 3; local11++) {
				for (@Pc(15) int local15 = 0; local15 < Static85.anInt1839 >> 3; local15++) {
					@Pc(25) int local25 = Static321.anIntArrayArrayArray9[local3][local11][local15];
					if (local25 != -1) {
						@Pc(35) int local35 = local25 >> 24 & 0x3;
						if (!arg1.aBoolean282 || local35 == 0) {
							@Pc(46) int local46 = local25 >> 1 & 0x3;
							@Pc(52) int local52 = local25 >> 14 & 0x3FF;
							@Pc(58) int local58 = local25 >> 3 & 0x7FF;
							@Pc(69) int local69 = (local52 / 8 << 8) + (local58 / 8);
							for (@Pc(71) int local71 = 0; local71 < Static71.anIntArray118.length; local71++) {
								if (local69 == Static71.anIntArray118[local71] && arg0[local71] != null) {
									arg1.method3481(local15 * 8, local35, Static165.aClass178Array1, local46, arg0[local71], local3, Static383.aClass48_9, local11 * 8, (local58 & 0x7) * 8, (local52 & 0x7) * 8);
									break;
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!tf", name = "c", descriptor = "(I)I")
	public static int method5395() {
		return Static54.anInt1178;
	}
}
