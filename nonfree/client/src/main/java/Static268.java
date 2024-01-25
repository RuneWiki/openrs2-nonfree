import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static268 {

	@OriginalMember(owner = "client!jha", name = "db", descriptor = "[I")
	public static int[] anIntArray287;

	@OriginalMember(owner = "client!jha", name = "gb", descriptor = "I")
	public static int anInt5234;

	@OriginalMember(owner = "client!jha", name = "q", descriptor = "Lclient!st;")
	public static final Class314 aClass314_81 = new Class314(78, -1);

	@OriginalMember(owner = "client!jha", name = "I", descriptor = "I")
	public static int anInt5214 = -1;

	@OriginalMember(owner = "client!jha", name = "eb", descriptor = "I")
	public static int anInt5233 = 0;

	@OriginalMember(owner = "client!jha", name = "fb", descriptor = "Lclient!qi;")
	public static final Class282 aClass282_4 = new Class282(16);

	@OriginalMember(owner = "client!jha", name = "b", descriptor = "(B)V")
	public static void method4479() {
		if (Static32.aClass3_Sub41_3.aClass7_Sub8_2.method3974() != 2) {
			return;
		}
		@Pc(21) byte local21 = (byte) (Static609.anInt9804 - 4 & 0xFF);
		@Pc(25) int local25 = Static609.anInt9804 % Static399.anInt7121;
		@Pc(31) int local31;
		for (@Pc(27) int local27 = 0; local27 < 4; local27++) {
			for (local31 = 0; local31 < Static24.anInt345; local31++) {
				Static171.aByteArrayArrayArray10[local27][local25][local31] = local21;
			}
		}
		if (Static65.anInt1298 == 3) {
			return;
		}
		for (local31 = 0; local31 < 2; local31++) {
			Static134.anIntArray177[local31] = -1000000;
			Static76.anIntArray107[local31] = 1000000;
			Static91.anIntArray118[local31] = 0;
			Static313.anIntArray333[local31] = 1000000;
			Static217.anIntArray244[local31] = 0;
		}
		@Pc(93) int local93 = Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1.anInt10152;
		@Pc(96) int local96 = Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1.anInt10158;
		@Pc(110) int local110;
		if (Static471.anInt8064 != 1 && Static68.anInt1361 == -1) {
			local110 = Static594.method8211(Static419.anInt7345, Static522.anInt8849, Static65.anInt1298);
			if (local110 - Static13.anInt232 < 3200 && (Static546.aByteArrayArrayArray18[Static65.anInt1298][Static419.anInt7345 >> 9][Static522.anInt8849 >> 9] & 0x4) != 0) {
				Static571.method8267(Static419.anInt7345 >> 9, 1, Static522.anInt8849 >> 9, Static567.aClass351ArrayArrayArray4, false);
				return;
			}
			return;
		}
		if (Static471.anInt8064 != 1) {
			local93 = Static68.anInt1361;
			local96 = Static189.anInt3565;
		}
		if ((Static546.aByteArrayArrayArray18[Static65.anInt1298][local93 >> 9][local96 >> 9] & 0x4) != 0) {
			Static571.method8267(local93 >> 9, 0, local96 >> 9, Static567.aClass351ArrayArrayArray4, false);
		}
		if (Static253.anInt4961 >= 2560) {
			return;
		}
		local110 = Static419.anInt7345 >> 9;
		@Pc(197) int local197 = Static522.anInt8849 >> 9;
		@Pc(201) int local201 = local93 >> 9;
		@Pc(205) int local205 = local96 >> 9;
		@Pc(213) int local213;
		if (local201 > local110) {
			local213 = local201 - local110;
		} else {
			local213 = local110 - local201;
		}
		@Pc(230) int local230;
		if (local197 >= local205) {
			local230 = local197 - local205;
		} else {
			local230 = local205 - local197;
		}
		if (local213 == 0 && local230 == 0 || local213 <= -Static399.anInt7121 || local213 >= Static399.anInt7121 || -Static24.anInt345 >= local230 || Static24.anInt345 <= local230) {
			Static296.method5075((Throwable) null, "RC: " + local110 + "," + local197 + " " + local201 + "," + local205 + " " + Static427.anInt7462 + "," + Static22.anInt329);
			return;
		}
		@Pc(307) int local307;
		@Pc(309) int local309;
		if (local230 < local213) {
			local307 = local230 * 65536 / local213;
			local309 = 32768;
			while (local110 != local201) {
				if (local201 > local110) {
					local110++;
				} else if (local201 < local110) {
					local110--;
				}
				if ((Static546.aByteArrayArrayArray18[Static65.anInt1298][local110][local197] & 0x4) != 0) {
					Static571.method8267(local110, 1, local197, Static567.aClass351ArrayArrayArray4, false);
					return;
				}
				local309 += local307;
				if (local309 >= 65536) {
					if (local197 < local205) {
						local197++;
					} else if (local197 > local205) {
						local197--;
					}
					local309 -= 65536;
					if ((Static546.aByteArrayArrayArray18[Static65.anInt1298][local110][local197] & 0x4) != 0) {
						Static571.method8267(local110, 1, local197, Static567.aClass351ArrayArrayArray4, false);
						return;
					}
				}
			}
			return;
		}
		local307 = local213 * 65536 / local230;
		local309 = 32768;
		while (local197 != local205) {
			if (local197 < local205) {
				local197++;
			} else if (local197 > local205) {
				local197--;
			}
			if ((Static546.aByteArrayArrayArray18[Static65.anInt1298][local110][local197] & 0x4) != 0) {
				Static571.method8267(local110, 1, local197, Static567.aClass351ArrayArrayArray4, false);
				return;
			}
			local309 += local307;
			if (local309 >= 65536) {
				if (local201 > local110) {
					local110++;
				} else if (local201 < local110) {
					local110--;
				}
				local309 -= 65536;
				if ((Static546.aByteArrayArrayArray18[Static65.anInt1298][local110][local197] & 0x4) != 0) {
					Static571.method8267(local110, 1, local197, Static567.aClass351ArrayArrayArray4, false);
					return;
				}
			}
		}
	}
}
