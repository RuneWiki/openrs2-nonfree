import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static281 {

	@OriginalMember(owner = "client!qa", name = "d", descriptor = "Lclient!ui;")
	public static Class230 aClass230_67;

	@OriginalMember(owner = "client!qa", name = "g", descriptor = "Lclient!o;")
	public static final Class169 aClass169_264 = new Class169("Loaded interface scripts", "Interface-Skripte geladen", "Interfaces chargées", "Interfaces carregadas");

	@OriginalMember(owner = "client!qa", name = "j", descriptor = "Lclient!tl;")
	public static final Class227 aClass227_37 = new Class227(4);

	@OriginalMember(owner = "client!qa", name = "m", descriptor = "I")
	public static int anInt4884 = 0;

	@OriginalMember(owner = "client!qa", name = "n", descriptor = "S")
	public static short aShort73 = 32767;

	@OriginalMember(owner = "client!qa", name = "o", descriptor = "I")
	public static int anInt4885 = 0;

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIIIIB)V")
	public static void method4291(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(7) int local7 = arg5 - 334;
		if (local7 < 0) {
			local7 = 0;
		} else if (local7 > 100) {
			local7 = 100;
		}
		@Pc(34) int local34 = local7 * (Static390.aShort98 - Static249.aShort67) / 100 + Static249.aShort67;
		@Pc(40) int local40 = arg0 * local34 >> 8;
		@Pc(46) int local46 = 16384 - arg3 & 0x3FFF;
		@Pc(53) int local53 = 16384 - arg2 & 0x3FFF;
		@Pc(55) int local55 = 0;
		@Pc(57) int local57 = 0;
		@Pc(59) int local59 = local40;
		if (local46 != 0) {
			local57 = -local40 * Class13.anIntArray20[local46] >> 15;
			local59 = local40 * Class13.anIntArray21[local46] >> 15;
		}
		if (local53 != 0) {
			local55 = local59 * Class13.anIntArray20[local53] >> 15;
			local59 = Class13.anIntArray21[local53] * local59 >> 15;
		}
		Static155.anInt2834 = arg2;
		Static133.anInt2471 = arg4 - local59;
		Static256.anInt4409 = arg1 - local55;
		Static311.anInt5293 = arg3;
		Static337.anInt5598 = arg6 - local57;
		Static11.anInt3597 = 0;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIII)V")
	public static void method4294(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg1 << 3;
		@Pc(15) int local15 = arg0 << 3;
		Static386.aFloat82 = local7;
		Static19.aFloat1 = local15;
		if (Static323.anInt5463 == 2) {
			Static155.anInt2834 = local7;
			Static311.anInt5293 = local15;
			Static11.anInt3597 = 0;
		}
		Static227.method4202();
		Static187.aBoolean292 = true;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIII)I")
	public static int method4296(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (Static229.aClass42Array3 == null) {
			return 0;
		} else if (arg0 < 3) {
			@Pc(14) int local14 = arg1 >> 7;
			@Pc(18) int local18 = arg4 >> 7;
			if (arg3 < 0 || arg2 < 0 || Static92.anInt1675 - 1 < arg3 || arg2 > Static262.anInt6340 - 1) {
				return 0;
			} else if (local14 >= 1 && local18 >= 1 && Static92.anInt1675 - 1 >= local14 && Static262.anInt6340 - 1 >= local18) {
				@Pc(84) boolean local84 = (Static373.aByteArrayArrayArray16[1][arg1 >> 7][arg4 >> 7] & 0x2) != 0;
				@Pc(112) boolean local112;
				@Pc(128) boolean local128;
				if ((arg1 & 0x7F) == 0) {
					local112 = (Static373.aByteArrayArrayArray16[1][local14 - 1][arg4 >> 7] & 0x2) != 0;
					local128 = (Static373.aByteArrayArrayArray16[1][local14][arg4 >> 7] & 0x2) != 0;
					if (local128 != local112) {
						local84 = (Static373.aByteArrayArrayArray16[1][arg3][arg2] & 0x2) != 0;
					}
				}
				if ((arg4 & 0x7F) == 0) {
					local112 = (Static373.aByteArrayArrayArray16[1][arg1 >> 7][local18 - 1] & 0x2) != 0;
					local128 = (Static373.aByteArrayArrayArray16[1][arg1 >> 7][local18] & 0x2) != 0;
					if (local128 != local112) {
						local84 = (Static373.aByteArrayArrayArray16[1][arg3][arg2] & 0x2) != 0;
					}
				}
				if (local84) {
					arg0++;
				}
				return Static229.aClass42Array3[arg0].method3043(arg1, arg4);
			} else {
				return 0;
			}
		} else {
			return Static229.aClass42Array3[arg0].method3043(arg1, arg4);
		}
	}
}
