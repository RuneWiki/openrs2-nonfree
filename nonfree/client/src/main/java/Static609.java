import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static609 {

	@OriginalMember(owner = "client!up", name = "a", descriptor = "Z")
	public static boolean aBoolean848;

	@OriginalMember(owner = "client!up", name = "b", descriptor = "[Lclient!lda;")
	public static final Class210_Sub1[] aClass210_Sub1Array2 = new Class210_Sub1[37];

	@OriginalMember(owner = "client!up", name = "c", descriptor = "Lclient!ut;")
	public static final Class358 aClass358_13 = new Class358();

	@OriginalMember(owner = "client!up", name = "e", descriptor = "Lclient!uw;")
	public static final Class359 aClass359_235 = new Class359(92, 5);

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(I)V")
	public static void method8301() {
		if (Static172.aClass5_Sub50_14.aClass12_Sub13_2.method3075() != 2) {
			return;
		}
		@Pc(21) byte local21 = (byte) (Static349.anInt6360 - 4 & 0xFF);
		@Pc(25) int local25 = Static349.anInt6360 % Static201.anInt3834;
		@Pc(31) int local31;
		for (@Pc(27) int local27 = 0; local27 < 4; local27++) {
			for (local31 = 0; local31 < Static626.anInt10238; local31++) {
				Static104.aByteArrayArrayArray5[local27][local25][local31] = local21;
			}
		}
		if (Static481.anInt8082 == 3) {
			return;
		}
		for (local31 = 0; local31 < 2; local31++) {
			Static416.anIntArray418[local31] = -1000000;
			Static621.anIntArray558[local31] = 1000000;
			Static678.anIntArray612[local31] = 0;
			Static234.anIntArray216[local31] = 1000000;
			Static595.anIntArray539[local31] = 0;
		}
		@Pc(90) int local90 = Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1.anInt10781;
		@Pc(93) int local93 = Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1.anInt10784;
		@Pc(106) int local106;
		if (Static660.anInt10605 != 1 && Static513.anInt8562 == -1) {
			local106 = Static441.method6444(Static481.anInt8082, Static332.anInt6132, Static407.anInt7215);
			if (local106 - Static200.anInt3808 < 3200 && (Static7.aByteArrayArrayArray1[Static481.anInt8082][Static332.anInt6132 >> 9][Static407.anInt7215 >> 9] & 0x4) != 0) {
				Static79.method1036(Static635.aClass226ArrayArrayArray3, false, Static407.anInt7215 >> 9, Static332.anInt6132 >> 9, 1);
				return;
			}
			return;
		}
		if (Static660.anInt10605 != 1) {
			local93 = Static493.anInt8261;
			local90 = Static513.anInt8562;
		}
		if ((Static7.aByteArrayArrayArray1[Static481.anInt8082][local90 >> 9][local93 >> 9] & 0x4) != 0) {
			Static79.method1036(Static635.aClass226ArrayArrayArray3, false, local93 >> 9, local90 >> 9, 0);
		}
		if (Static79.anInt1141 >= 2560) {
			return;
		}
		local106 = Static332.anInt6132 >> 9;
		@Pc(188) int local188 = Static407.anInt7215 >> 9;
		@Pc(192) int local192 = local90 >> 9;
		@Pc(196) int local196 = local93 >> 9;
		@Pc(204) int local204;
		if (local192 <= local106) {
			local204 = local106 - local192;
		} else {
			local204 = local192 - local106;
		}
		@Pc(219) int local219;
		if (local196 > local188) {
			local219 = local196 - local188;
		} else {
			local219 = local188 - local196;
		}
		if (local204 == 0 && local219 == 0 || local204 <= -Static201.anInt3834 || Static201.anInt3834 <= local204 || local219 <= -Static626.anInt10238 || Static626.anInt10238 <= local219) {
			Static234.method3615((Throwable) null, "RC: " + local106 + "," + local188 + " " + local192 + "," + local196 + " " + Static153.anInt3147 + "," + Static201.anInt3839);
			return;
		}
		@Pc(304) int local304;
		@Pc(306) int local306;
		if (local219 < local204) {
			local304 = local219 * 65536 / local204;
			local306 = 32768;
			while (local192 != local106) {
				if (local106 < local192) {
					local106++;
				} else if (local192 < local106) {
					local106--;
				}
				if ((Static7.aByteArrayArrayArray1[Static481.anInt8082][local106][local188] & 0x4) != 0) {
					Static79.method1036(Static635.aClass226ArrayArrayArray3, false, local188, local106, 1);
					return;
				}
				local306 += local304;
				if (local306 >= 65536) {
					if (local188 < local196) {
						local188++;
					} else if (local188 > local196) {
						local188--;
					}
					local306 -= 65536;
					if ((Static7.aByteArrayArrayArray1[Static481.anInt8082][local106][local188] & 0x4) != 0) {
						Static79.method1036(Static635.aClass226ArrayArrayArray3, false, local188, local106, 1);
						return;
					}
				}
			}
			return;
		}
		local304 = local204 * 65536 / local219;
		local306 = 32768;
		while (local196 != local188) {
			if (local196 > local188) {
				local188++;
			} else if (local188 > local196) {
				local188--;
			}
			if ((Static7.aByteArrayArrayArray1[Static481.anInt8082][local106][local188] & 0x4) != 0) {
				Static79.method1036(Static635.aClass226ArrayArrayArray3, false, local188, local106, 1);
				return;
			}
			local306 += local304;
			if (local306 >= 65536) {
				local306 -= 65536;
				if (local192 > local106) {
					local106++;
				} else if (local192 < local106) {
					local106--;
				}
				if ((Static7.aByteArrayArrayArray1[Static481.anInt8082][local106][local188] & 0x4) != 0) {
					Static79.method1036(Static635.aClass226ArrayArrayArray3, false, local188, local106, 1);
					return;
				}
			}
		}
	}
}
