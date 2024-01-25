import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static310 {

	@OriginalMember(owner = "client!to", name = "f", descriptor = "I")
	public static int anInt6021 = 0;

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(II)V")
	public static void method5112(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class128 local7 = Static273.aClass128ArrayArrayArray4[0][arg0][arg1];
		for (@Pc(9) int local9 = 0; local9 < 3; local9++) {
			@Pc(28) Class128 local28 = Static273.aClass128ArrayArrayArray4[local9][arg0][arg1] = Static273.aClass128ArrayArrayArray4[local9 + 1][arg0][arg1];
			if (local28 != null) {
				local28.aByte47--;
				for (@Pc(40) Class117 local40 = local28.aClass117_2; local40 != null; local40 = local40.aClass117_1) {
					@Pc(44) Class8_Sub1 local44 = local40.aClass8_Sub1_1;
					if (local44.aShort98 == arg0 && local44.aShort97 == arg1) {
						local44.aByte77--;
					}
				}
			}
		}
		if (Static273.aClass128ArrayArrayArray4[0][arg0][arg1] == null) {
			Static273.aClass128ArrayArrayArray4[0][arg0][arg1] = new Class128(0, arg0, arg1);
			Static273.aClass128ArrayArrayArray4[0][arg0][arg1].aByte49 = 1;
		}
		Static273.aClass128ArrayArrayArray4[0][arg0][arg1].aClass128_1 = local7;
		Static273.aClass128ArrayArrayArray4[3][arg0][arg1] = null;
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(Lclient!fa;I)I")
	public static int method5113(@OriginalArg(0) Class8_Sub1_Sub2_Sub1 arg0) {
		@Pc(8) int local8 = arg0.anInt2350;
		@Pc(20) Class40 local20 = arg0.method4347();
		if (arg0.aBoolean371) {
			local8 = arg0.anInt2357;
		} else if (local20.anInt1443 == arg0.anInt4937 || arg0.anInt4937 == local20.anInt1450 || local20.anInt1452 == arg0.anInt4937 || local20.anInt1466 == arg0.anInt4937) {
			local8 = arg0.anInt2372;
		} else if (local20.anInt1472 == arg0.anInt4937 || local20.anInt1461 == arg0.anInt4937 || local20.anInt1438 == arg0.anInt4937 || local20.anInt1478 == arg0.anInt4937) {
			local8 = arg0.anInt2360;
		}
		return local8;
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "([IBI)V")
	public static void method5116(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(15) int local15 = 31; local15 > 0; local15--) {
			@Pc(21) int local21 = local15 * 36;
			for (@Pc(23) int local23 = 35; local23 > 0; local23--) {
				if (arg0[local23 + local21] == 0 && arg0[local23 + local21 - 1 - 36] != 0) {
					arg0[local23 + local21] = arg1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(IJ)V")
	public static void method5117(@OriginalArg(1) long arg0) {
		Static15.aClass4_Sub11_Sub1_2.anInt3768 = 0;
		Static15.aClass4_Sub11_Sub1_2.method3434(21);
		Static15.aClass4_Sub11_Sub1_2.method3435(arg0);
		Static166.anInt3583 = 0;
		Static288.anInt5640 = -3;
		Static222.anInt4518 = 1;
		Static122.anInt2882 = 0;
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(BZ)V")
	public static void method5118(@OriginalArg(1) boolean arg0) {
		Static319.method5250();
		if (Static139.anInt3199 != 30 && Static139.anInt3199 != 25) {
			return;
		}
		Static165.anInt3518++;
		if (Static165.anInt3518 < 50 && !arg0) {
			return;
		}
		Static165.anInt3518 = 0;
		if (!Static357.aBoolean490 && Static155.aClass114_3 != null) {
			Static15.aClass4_Sub11_Sub1_2.method706(156);
			try {
				Static155.aClass114_3.method3163(Static15.aClass4_Sub11_Sub1_2.aByteArray55, Static15.aClass4_Sub11_Sub1_2.anInt3768);
				Static15.aClass4_Sub11_Sub1_2.anInt3768 = 0;
			} catch (@Pc(51) IOException local51) {
				Static357.aBoolean490 = true;
			}
		}
		Static319.method5250();
	}
}
