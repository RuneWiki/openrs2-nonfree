import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static260 {

	@OriginalMember(owner = "client!nd", name = "i", descriptor = "I")
	public static int anInt7669;

	@OriginalMember(owner = "client!nd", name = "e", descriptor = "Lclient!dq;")
	public static final Class56 aClass56_274 = new Class56(25, 8);

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(Z)V")
	public static void method6058() {
		Static215.aClass244_33.method5264();
		for (@Pc(13) Class4_Sub30 local13 = (Class4_Sub30) Static41.aClass244_2.method5263(); local13 != null; local13 = (Class4_Sub30) Static41.aClass244_2.method5271()) {
			if (local13.anInt4615 < 1000) {
				local13.method6059();
				Static215.aClass244_33.method5273(local13);
			}
		}
		Static215.aClass244_33.method5270(Static41.aClass244_2);
		@Pc(44) int local44 = -1;
		@Pc(49) Class4_Sub1 local49 = (Class4_Sub1) Static398.aClass244_36.method5263();
		if (local49 != null) {
			local44 = local49.method67();
		}
		if (!Static339.aBoolean390) {
			if (local44 == 0 && (Static443.anInt7447 == 1 && Static351.anInt5841 > 2 || Static285.method3722())) {
				local44 = 2;
			}
			if (local44 == 2 && Static351.anInt5841 > 0 && local49 != null) {
				if (Static11.aClass110_1 == null && Static368.anInt6060 == 0) {
					Static324.method4281(local49.method65(), local49.method64());
				} else {
					Static6.anInt97 = 2;
				}
			}
			if (local44 == 0 && Static351.anInt5841 > 0) {
				Static163.method2289();
			}
			if (Static11.aClass110_1 == null && Static368.anInt6060 == 0) {
				Static6.anInt97 = 0;
				Static254.aClass4_Sub30_1 = null;
				return;
			}
			return;
		}
		@Pc(134) int local134;
		@Pc(138) int local138;
		if (local44 == -1) {
			local134 = Static455.aClass48_1.method1138();
			local138 = Static455.aClass48_1.method1142();
			if (local134 < Static50.anInt816 - 10 || Static128.anInt7338 + Static50.anInt816 + 10 < local134 || Static328.anInt5318 - 10 > local138 || Static30.anInt522 + Static328.anInt5318 + 10 < local138) {
				Static412.method5610();
			}
		}
		if (local44 != 0) {
			return;
		}
		local134 = Static50.anInt816;
		local138 = Static328.anInt5318;
		@Pc(180) int local180 = Static128.anInt7338;
		@Pc(184) int local184 = local49.method65();
		@Pc(188) int local188 = local49.method64();
		@Pc(190) int local190 = -1;
		@Pc(210) int local210;
		for (@Pc(192) int local192 = 0; local192 < Static351.anInt5841; local192++) {
			if (Static265.aBoolean325) {
				local210 = local138 + (Static351.anInt5841 - local192 - 1) * 16 + 33;
				if (local184 > local134 && local184 < local180 + local134 && local188 > local210 - 13 && local188 < local210 + 4) {
					local190 = local192;
				}
			} else {
				local210 = local138 + (-local192 + -1 + Static351.anInt5841) * 16 + 31;
				if (local184 > local134 && local184 < local134 + local180 && local210 - 13 < local188 && local210 + 3 > local188) {
					local190 = local192;
				}
			}
		}
		if (local190 != -1) {
			local210 = 0;
			@Pc(288) Class208 local288 = new Class208(Static41.aClass244_2);
			for (@Pc(293) Class4_Sub30 local293 = (Class4_Sub30) local288.method4290(); local293 != null; local293 = (Class4_Sub30) local288.method4288()) {
				if (local190 == local210) {
					Static428.method5726(local293, local184, local188);
				}
				local210++;
			}
		}
		Static412.method5610();
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(IFI[BLclient!hs;IIFFIFIFI)V")
	public static void method6061(@OriginalArg(1) float arg0, @OriginalArg(3) byte[] arg1, @OriginalArg(4) Class92 arg2, @OriginalArg(5) int arg3, @OriginalArg(7) float arg4, @OriginalArg(8) float arg5, @OriginalArg(9) int arg6, @OriginalArg(10) float arg7, @OriginalArg(12) float arg8) {
		@Pc(12) float[] local12 = new float[16384];
		@Pc(20) int local20;
		@Pc(58) int local58;
		for (@Pc(14) int local14 = 0; local14 < 8; local14++) {
			local20 = arg6;
			arg2.method1755(arg0 / (float) 128, 0, arg5 * 127.0F, local12, arg8 / (float) 16, arg3, arg7 / (float) 128);
			arg8 *= 2.0F;
			arg7 *= 2.0F;
			arg0 *= 2.0F;
			for (local58 = 0; local58 < 16384; local58++) {
				arg1[local20] = (byte) ((float) arg1[local20] + local12[local58]);
				local20++;
			}
			arg5 *= arg4;
		}
		local20 = arg6;
		for (local58 = 0; local58 < 16384; local58++) {
			arg1[local20] = (byte) (arg1[local20] + 127);
			local20++;
		}
	}
}
