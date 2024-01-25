import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static284 {

	@OriginalMember(owner = "client!jka", name = "b", descriptor = "I")
	public static int anInt4535;

	@OriginalMember(owner = "client!jka", name = "c", descriptor = "D")
	public static double aDouble20;

	@OriginalMember(owner = "client!jka", name = "f", descriptor = "Z")
	public static boolean aBoolean342;

	@OriginalMember(owner = "client!jka", name = "a", descriptor = "(ZILclient!kq;)V")
	public static void method4095(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class199 arg1) {
		@Pc(15) int local15 = arg1.anInt5023 == 0 ? arg1.anInt5035 : arg1.anInt5023;
		@Pc(24) int local24 = arg1.anInt4981 == 0 ? arg1.anInt4994 : arg1.anInt4981;
		Static655.method8734(local15, local24, arg1.anInt5041, arg0, Static392.aClass199ArrayArray2[arg1.anInt5041 >> 16]);
		if (arg1.aClass199Array1 != null) {
			Static655.method8734(local15, local24, arg1.anInt5041, arg0, arg1.aClass199Array1);
		}
		@Pc(61) Class4_Sub28 local61 = (Class4_Sub28) Static242.aClass66_17.method1994((long) arg1.anInt5041);
		if (local61 != null) {
			Static196.method3045(local24, local15, arg0, local61.anInt4697);
		}
	}

	@OriginalMember(owner = "client!jka", name = "a", descriptor = "(FFIFFZFF)F")
	public static float method4096(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(6) float arg5, @OriginalArg(7) float arg6) {
		@Pc(7) float local7 = 0.0F;
		@Pc(11) float local11 = arg6 - arg4;
		@Pc(16) float local16 = arg5 - arg3;
		@Pc(25) float local25 = arg1 - arg0;
		@Pc(27) float local27 = 0.0F;
		@Pc(29) float local29 = 0.0F;
		@Pc(31) float local31 = 0.0F;
		while (local7 < 1.1F) {
			@Pc(39) float local39 = arg4 + local7 * local11;
			@Pc(45) float local45 = local16 * local7 + arg3;
			@Pc(51) float local51 = arg0 + local25 * local7;
			@Pc(56) int local56 = (int) local39 >> 9;
			@Pc(61) int local61 = (int) local51 >> 9;
			if (local56 > 0 && local61 > 0 && Static224.anInt3557 > local56 && local61 < Static267.anInt4309) {
				@Pc(84) int local84 = Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4.aByte141;
				if (local84 < 3 && (Static47.aByteArrayArrayArray3[1][local56][local61] & 0x2) != 0) {
					local84++;
				}
				@Pc(108) int local108 = Static655.aClass42Array5[local84].method7453((int) local39, (int) local51);
				if (local45 > (float) local108) {
					if (arg2 >= 2) {
						return local7 + method4096(local31, local51, arg2 + -1, local29, local27, local45, local39) * 0.1F - 0.1F;
					}
					return local7;
				}
			}
			local7 += 0.1F;
			local31 = local51;
			local27 = local39;
			local29 = local45;
		}
		return -1.0F;
	}

	@OriginalMember(owner = "client!jka", name = "a", descriptor = "(I)V")
	public static void method4097() {
		if (Static143.anInt2618 != -1) {
			Static408.method5157(-1, Static143.anInt2618, -1, false);
			Static143.anInt2618 = -1;
		}
	}

	@OriginalMember(owner = "client!jka", name = "b", descriptor = "(I)V")
	public static void method4098() {
		Static89.anImage2 = null;
		Static250.aFont1 = null;
	}

	@OriginalMember(owner = "client!jka", name = "a", descriptor = "(IIBI)Z")
	public static boolean method4099(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(14) Interface20 local14 = (Interface20) Static572.method7588(arg2, arg1, arg0);
		@Pc(16) boolean local16 = true;
		if (local14 != null) {
			local16 = Static307.method7789(local14) & true;
		}
		local14 = (Interface20) Static130.method2321(arg2, arg1, arg0, qb.class);
		if (local14 != null) {
			local16 &= Static307.method7789(local14);
		}
		local14 = (Interface20) Static191.method2972(arg2, arg1, arg0);
		if (local14 != null) {
			local16 &= Static307.method7789(local14);
		}
		return local16;
	}
}
