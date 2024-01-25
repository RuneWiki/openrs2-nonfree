import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static327 {

	@OriginalMember(owner = "client!qr", name = "e", descriptor = "I")
	public static int anInt5855;

	@OriginalMember(owner = "client!qr", name = "t", descriptor = "I")
	public static int anInt5866;

	@OriginalMember(owner = "client!qr", name = "u", descriptor = "I")
	public static int anInt5867;

	@OriginalMember(owner = "client!qr", name = "c", descriptor = "Lclient!vj;")
	public static final Class256 aClass256_117 = new Class256("Connecting to update server", "Verbindung mit Update-Server...", "Connexion au serveur de mise à jour en cours", "Conectando ao servidor de atualização");

	@OriginalMember(owner = "client!qr", name = "s", descriptor = "[F")
	public static final float[] aFloatArray27 = new float[4];

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(BI[Lclient!cr;)V")
	public static void method4685(@OriginalArg(1) int arg0, @OriginalArg(2) Class41[] arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg1.length; local3++) {
			@Pc(9) Class41 local9 = arg1[local3];
			if (local9 != null && arg0 == local9.anInt1663 && !Static56.method1129(local9)) {
				if (local9.anInt1642 == 0) {
					method4685(local9.anInt1613, arg1);
					if (local9.aClass41Array1 != null) {
						method4685(local9.anInt1613, local9.aClass41Array1);
					}
					@Pc(43) Class2_Sub25 local43 = (Class2_Sub25) Static398.aClass240_27.method5439((long) local9.anInt1613);
					if (local43 != null) {
						Static416.method5643(local43.anInt4163);
					}
				}
				if (local9.anInt1642 == 6 && local9.anInt1605 != -1) {
					@Pc(65) Class46 local65 = Static9.aClass194_1.method4371(local9.anInt1605);
					if (local65 != null) {
						local9.anInt1640 += Static305.anInt1351;
						while (local65.anIntArray89[local9.anInt1680] < local9.anInt1640) {
							local9.anInt1640 -= local65.anIntArray89[local9.anInt1680];
							local9.anInt1680++;
							if (local9.anInt1680 >= local65.anIntArray90.length) {
								local9.anInt1680 -= local65.anInt1763;
								if (local9.anInt1680 < 0 || local9.anInt1680 >= local65.anIntArray90.length) {
									local9.anInt1680 = 0;
								}
							}
							local9.anInt1645 = local9.anInt1680 + 1;
							if (local9.anInt1645 >= local65.anIntArray90.length) {
								local9.anInt1645 -= local65.anInt1763;
								if (local9.anInt1645 < 0 || local9.anInt1645 >= local65.anIntArray90.length) {
									local9.anInt1645 = -1;
								}
							}
							Static168.method2616(local9);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!qr", name = "c", descriptor = "(I)V")
	public static void method4690() {
		Static372.aClass2_Sub26_2 = new Class2_Sub26(Static63.aClass256_32.method5720(Static272.anInt7537), "", Static217.anInt490, 1010, -1, 0L, 0, 0, true, false);
	}
}
