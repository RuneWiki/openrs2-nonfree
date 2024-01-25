import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static116 {

	@OriginalMember(owner = "client!he", name = "h", descriptor = "I")
	public static int anInt2536;

	@OriginalMember(owner = "client!he", name = "m", descriptor = "[I")
	public static int[] anIntArray190;

	@OriginalMember(owner = "client!he", name = "b", descriptor = "Lclient!jn;")
	public static final Class106 aClass106_88 = new Class106("Loaded world list data", "Liste der Welten geladen", "Liste des serveurs chargée", "Dados da lista de mundos carregados");

	@OriginalMember(owner = "client!he", name = "g", descriptor = "I")
	public static int anInt2535 = 0;

	@OriginalMember(owner = "client!he", name = "i", descriptor = "Lclient!bn;")
	public static final Class18 aClass18_84 = new Class18(56, 4);

	@OriginalMember(owner = "client!he", name = "j", descriptor = "Lclient!vq;")
	public static final Class217 aClass217_88 = new Class217(45, -2);

	@OriginalMember(owner = "client!he", name = "k", descriptor = "I")
	public static int anInt2537 = 0;

	@OriginalMember(owner = "client!he", name = "l", descriptor = "[S")
	public static final short[] aShortArray58 = new short[] { -10304, 9104, -1, -1, -1 };

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(III)V")
	public static void method2434(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) Class1_Sub4_Sub17 local14 = Static132.method2717(arg0, 6);
		local14.method3480();
		local14.anInt3727 = arg1;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(IIII)I")
	public static int method2436(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == arg1) {
			return arg1;
		}
		@Pc(18) int local18 = 128 - arg0;
		@Pc(32) int local32 = (arg1 & 0x7F) * local18 + arg0 * (arg2 & 0x7F) >> 7;
		@Pc(46) int local46 = (arg2 & 0x380) * arg0 + local18 * (arg1 & 0x380) >> 7;
		@Pc(60) int local60 = arg0 * (arg2 & 0xFC00) + (arg1 & 0xFC00) * local18 >> 7;
		return local46 & 0x380 | local60 & 0xFC00 | local32 & 0x7F;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(JI)V")
	public static void method2437(@OriginalArg(0) long arg0) {
		@Pc(7) int local7 = Static78.anInt1750;
		@Pc(19) int local19;
		@Pc(27) int local27;
		if (Static98.anInt2254 != local7) {
			local19 = local7 - Static98.anInt2254;
			local27 = (int) ((long) local19 * arg0 / 320L);
			if (local19 > 0) {
				if (local27 == 0) {
					local27 = 1;
				} else if (local19 < local27) {
					local27 = local19;
				}
			} else if (local27 == 0) {
				local27 = -1;
			} else if (local19 > local27) {
				local27 = local19;
			}
			Static98.anInt2254 += local27;
		}
		@Pc(65) int local65 = Static138.anInt2972;
		if (!Static41.aBoolean62) {
			Static332.aFloat62 += (float) arg0 * Static118.aFloat22 / 40.0F * 8.0F;
			Static357.aFloat76 += (float) arg0 * Static294.aFloat58 / 40.0F * 8.0F;
		}
		if (Static53.anInt1374 != local65) {
			local19 = local65 - Static53.anInt1374;
			local27 = (int) (arg0 * (long) local19 / 320L);
			if (local19 > 0) {
				if (local27 == 0) {
					local27 = 1;
				} else if (local19 < local27) {
					local27 = local19;
				}
			} else if (local27 == 0) {
				local27 = -1;
			} else if (local27 < local19) {
				local27 = local19;
			}
			Static53.anInt1374 += local27;
		}
		Static177.method3440();
	}
}
