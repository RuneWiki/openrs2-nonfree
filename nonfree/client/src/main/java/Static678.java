import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static678 {

	@OriginalMember(owner = "client!za", name = "m", descriptor = "Lclient!rfa;")
	public static Class3 aClass3_4;

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(I)V")
	public static void method9178() {
		@Pc(7) short local7 = 1024;
		@Pc(9) short local9 = 3072;
		if (Static487.aBoolean565) {
			if (Static523.aBoolean613) {
				local7 = 2048;
			}
			local9 = 4096;
		}
		if ((float) local7 > Static132.aFloat14) {
			Static132.aFloat14 = (float) local7;
		}
		while (Static228.aFloat26 >= 16384.0F) {
			Static228.aFloat26 -= 16384.0F;
		}
		if ((float) local9 < Static132.aFloat14) {
			Static132.aFloat14 = (float) local9;
		}
		while (Static228.aFloat26 < 0.0F) {
			Static228.aFloat26 += 16384.0F;
		}
		@Pc(57) int local57 = Static162.anInt2757 >> 9;
		@Pc(61) int local61 = Static674.anInt9799 >> 9;
		@Pc(67) int local67 = Static284.method4118(Static162.anInt2757, Static253.anInt4353, Static674.anInt9799);
		@Pc(69) int local69 = 0;
		@Pc(95) int local95;
		if (local57 > 3 && local61 > 3 && local57 < Static491.anInt9856 - 4 && local61 < Static393.anInt6574 - 4) {
			for (local95 = local57 - 4; local95 <= local57 + 4; local95++) {
				for (@Pc(101) int local101 = local61 - 4; local101 <= local61 + 4; local101++) {
					@Pc(105) int local105 = Static253.anInt4353;
					if (local105 < 3 && Static250.method3635(local95, local101)) {
						local105++;
					}
					@Pc(116) int local116 = 0;
					if (Static577.aClass310_Sub1_2.aByteArrayArrayArray15 != null && Static577.aClass310_Sub1_2.aByteArrayArrayArray15[local105] != null) {
						local116 = (Static577.aClass310_Sub1_2.aByteArrayArrayArray15[local105][local95][local101] & 0xFF) * 8 << 2;
					}
					if (Static289.aClass12Array3 != null && Static289.aClass12Array3[local105] != null) {
						@Pc(158) int local158 = local67 + local116 - Static289.aClass12Array3[local105].method7846(local95, local101);
						if (local158 > local69) {
							local69 = local158;
						}
					}
				}
			}
		}
		local95 = (local69 >> 2) * 1536;
		if (local95 > 786432) {
			local95 = 786432;
		}
		if (local95 < 262144) {
			local95 = 262144;
		}
		if (Static536.anInt8763 < local95) {
			Static536.anInt8763 += (local95 - Static536.anInt8763) / 24;
		} else if (Static536.anInt8763 > local95) {
			Static536.anInt8763 += (local95 - Static536.anInt8763) / 80;
		}
	}

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(II)V")
	public static void method9179(@OriginalArg(0) int arg0) {
		@Pc(14) Class6_Sub4_Sub18 local14 = Static565.method7924((long) arg0, 3);
		local14.method7979();
	}

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(IIB)I")
	public static int method9180(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(25) byte local25;
		if (arg1 > 20000) {
			Static216.method3141();
			local25 = 4;
		} else if (arg1 > 10000) {
			local25 = 3;
			Static478.method6996();
		} else if (arg1 <= 5000) {
			Static489.method7094();
			local25 = 1;
		} else {
			local25 = 2;
			Static551.method7237();
		}
		if (arg0 != Static96.aClass6_Sub22_7.aClass29_Sub16_2.method5742()) {
			Static96.aClass6_Sub22_7.method2358(Static96.aClass6_Sub22_7.aClass29_Sub16_1, arg0);
			Static646.method8805(arg0, false);
		}
		Static633.method8698();
		return local25;
	}
}
