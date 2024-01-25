import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static273 {

	@OriginalMember(owner = "client!po", name = "c", descriptor = "Lclient!us;")
	public static final Class234 aClass234_93 = new Class234(72, 3);

	@OriginalMember(owner = "client!po", name = "g", descriptor = "Lclient!ef;")
	public static final Class68 aClass68_12 = new Class68(13, 17);

	@OriginalMember(owner = "client!po", name = "h", descriptor = "Lclient!dk;")
	public static final Class57 aClass57_74 = new Class57("Loaded config", "Konfig geladen.", "Fichiers config chargés", "Config carregada");

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(IJ)V")
	public static void method4272(@OriginalArg(1) long arg0) {
		@Pc(7) int local7 = Static71.anInt1429;
		@Pc(14) int local14 = Static268.anInt4726;
		@Pc(22) int local22;
		@Pc(30) int local30;
		if (Static76.anInt1623 != local7) {
			local22 = local7 - Static76.anInt1623;
			local30 = (int) ((long) local22 * arg0 / 320L);
			if (local22 <= 0) {
				if (local30 == 0) {
					local30 = -1;
				} else if (local22 > local30) {
					local30 = local22;
				}
			} else if (local30 == 0) {
				local30 = 1;
			} else if (local30 > local22) {
				local30 = local22;
			}
			Static76.anInt1623 += local30;
		}
		if (!Static164.aClass154_Sub1_1.aBoolean466) {
			Static279.aFloat67 += (float) arg0 * Static75.aFloat11 / 40.0F * 8.0F;
			Static352.aFloat68 += (float) arg0 * Static37.aFloat7 / 40.0F * 8.0F;
		}
		if (local14 != Static104.anInt2066) {
			local22 = local14 - Static104.anInt2066;
			local30 = (int) (arg0 * (long) local22 / 320L);
			if (local22 > 0) {
				if (local30 == 0) {
					local30 = 1;
				} else if (local22 < local30) {
					local30 = local22;
				}
			} else if (local30 == 0) {
				local30 = -1;
			} else if (local22 > local30) {
				local30 = local22;
			}
			Static104.anInt2066 += local30;
		}
		Static251.method4080();
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(II)V")
	public static void method4273(@OriginalArg(0) int arg0) {
		Static169.anInt2957 = arg0;
		Static103.aClass139_21.method3075();
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(Z)V")
	public static void method4274() {
		Static229.method3783(Static37.aClass244_12);
		Static23.aClass3_Sub5_Sub1_1.method2791(Static200.method3135());
		Static23.aClass3_Sub5_Sub1_1.method2749(Static199.anInt3567);
		Static23.aClass3_Sub5_Sub1_1.method2749(Static207.anInt2251);
		Static23.aClass3_Sub5_Sub1_1.method2791(Static164.aClass154_Sub1_1.anInt6058);
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(BIIII)V")
	public static void method4276(@OriginalArg(2) int arg0, @OriginalArg(4) int arg1) {
		Static221.anInt3917 = 0;
		Static26.anInt345 = 0;
		Static272.anInt4750 = arg0;
		Static365.anInt6140 = arg1;
	}
}
