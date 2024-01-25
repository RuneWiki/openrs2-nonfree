import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static143 {

	@OriginalMember(owner = "client!ip", name = "y", descriptor = "Lclient!iq;")
	public static final Class93 aClass93_61 = new Class93("Loading config - ", "Lade Konfiguration - ", "Chargement des fichiers config - ", "Carregando config - ");

	@OriginalMember(owner = "client!ip", name = "O", descriptor = "[I")
	public static final int[] anIntArray245 = new int[] { 2047, 16383, 65535 };

	@OriginalMember(owner = "client!ip", name = "R", descriptor = "Z")
	public static final boolean aBoolean257 = false;

	@OriginalMember(owner = "client!ip", name = "T", descriptor = "Lclient!iq;")
	public static final Class93 aClass93_62 = new Class93("purple:", "lila:", "violet:", "roxo:");

	@OriginalMember(owner = "client!ip", name = "U", descriptor = "I")
	public static int anInt2959 = 0;

	@OriginalMember(owner = "client!ip", name = "h", descriptor = "(I)[Lclient!k;")
	public static Class106[] method2816() {
		if (Static69.aClass106Array1 == null) {
			@Pc(7) Class106[] local7 = Static37.method857(Static177.aClass168_2);
			@Pc(11) Class106[] local11 = new Class106[local7.length];
			@Pc(13) int local13 = 0;
			@Pc(67) int local67;
			@Pc(73) Class106 local73;
			label63: for (@Pc(15) int local15 = 0; local15 < local7.length; local15++) {
				@Pc(21) Class106 local21 = local7[local15];
				if ((local21.anInt3266 <= 0 || local21.anInt3266 >= 24) && local21.anInt3264 >= 800 && local21.anInt3267 >= 600 && (Static339.anInt6736 >= 96 || Static129.anInt2728 != 0 || local21.anInt3264 <= 1024 && local21.anInt3267 <= 768)) {
					for (local67 = 0; local67 < local13; local67++) {
						local73 = local11[local67];
						if (local73.anInt3264 == local21.anInt3264 && local21.anInt3267 == local73.anInt3267) {
							if (local21.anInt3266 > local73.anInt3266) {
								local11[local67] = local21;
							}
							continue label63;
						}
					}
					local11[local13] = local21;
					local13++;
				}
			}
			Static69.aClass106Array1 = new Class106[local13];
			Static359.method686(local11, 0, Static69.aClass106Array1, 0, local13);
			@Pc(133) int[] local133 = new int[Static69.aClass106Array1.length];
			for (local67 = 0; local67 < Static69.aClass106Array1.length; local67++) {
				local73 = Static69.aClass106Array1[local67];
				local133[local67] = local73.anInt3264 * local73.anInt3267;
			}
			Static100.method2240(local133, Static69.aClass106Array1);
		}
		return Static69.aClass106Array1;
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(IB)V")
	public static void method2818(@OriginalArg(0) int arg0) {
		@Pc(8) Class2_Sub11_Sub19 local8 = Static306.method5411(1, arg0);
		local8.method5539();
	}
}
