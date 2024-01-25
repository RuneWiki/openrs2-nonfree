import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static246 {

	@OriginalMember(owner = "client!ke", name = "Gb", descriptor = "Lclient!saa;")
	public static Class257 aClass257_2;

	@OriginalMember(owner = "client!ke", name = "Fb", descriptor = "I")
	public static int anInt4485 = 0;

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIIIBI)V")
	public static void method3898(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg0;
		@Pc(13) int local13 = arg3 * arg3;
		@Pc(17) int local17 = arg0 * arg0;
		@Pc(21) int local21 = local17 << 1;
		@Pc(25) int local25 = local13 << 1;
		@Pc(29) int local29 = arg0 << 1;
		@Pc(43) int local43 = (1 - local29) * local13 + local21;
		@Pc(52) int local52 = local17 - (local29 - 1) * local25;
		@Pc(56) int local56 = local13 << 2;
		@Pc(60) int local60 = local17 << 2;
		@Pc(68) int local68 = local21 * 3;
		@Pc(76) int local76 = local25 * ((arg0 << 1) - 3);
		@Pc(82) int local82 = local60;
		@Pc(88) int local88 = local56 * (arg0 - 1);
		Static403.method6377(arg1, Static130.anIntArrayArray89[arg2], arg3 + arg4, -arg3 + arg4);
		while (local9 > 0) {
			if (local43 < 0) {
				while (local43 < 0) {
					local43 += local68;
					local52 += local82;
					local7++;
					local82 += local60;
					local68 += local60;
				}
			}
			if (local52 < 0) {
				local43 += local68;
				local52 += local82;
				local82 += local60;
				local7++;
				local68 += local60;
			}
			local52 += -local76;
			local43 += -local88;
			local76 -= local56;
			local88 -= local56;
			local9--;
			@Pc(174) int local174 = arg2 - local9;
			@Pc(178) int local178 = arg2 + local9;
			@Pc(182) int local182 = local7 + arg4;
			@Pc(186) int local186 = arg4 - local7;
			Static403.method6377(arg1, Static130.anIntArrayArray89[local174], local182, local186);
			Static403.method6377(arg1, Static130.anIntArrayArray89[local178], local182, local186);
		}
	}

	@OriginalMember(owner = "client!ke", name = "p", descriptor = "(II)Z")
	public static boolean method3900(@OriginalArg(1) int arg0) {
		return arg0 == 3 || arg0 == 7 || arg0 == 10;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(IBIZI)V")
	public static void method3901(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		if (Static266.anInt4923 == 0) {
			Static499.method7335(false);
		} else {
			Static397.anInt7574 = Static266.anInt4923;
			Static233.method6719(0);
		}
		Static174.aBoolean252 = arg2;
		Static83.anInt1711 = arg1;
		Static471.anInt8455 = arg0;
		Static201.method367(arg3);
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(BZ)V")
	public static void method3903(@OriginalArg(1) boolean arg0) {
		if (arg0) {
			if (Static387.anInt7341 != -1) {
				Static277.method4362(Static387.anInt7341);
			}
			for (@Pc(14) Class2_Sub9 local14 = (Class2_Sub9) Static110.aClass127_21.method3203(); local14 != null; local14 = (Class2_Sub9) Static110.aClass127_21.method3212()) {
				if (!local14.method7799()) {
					local14 = (Class2_Sub9) Static110.aClass127_21.method3203();
					if (local14 == null) {
						break;
					}
				}
				Static368.method5870(true, local14, false);
			}
			Static387.anInt7341 = -1;
			Static110.aClass127_21 = new Class127(8);
			Static266.method4290();
			Static387.anInt7341 = Static467.anInt8408;
			Static191.method6947(false);
			Static190.method3102();
			Static258.method4039(Static387.anInt7341);
		}
		Static243.aBoolean332 = true;
	}
}
