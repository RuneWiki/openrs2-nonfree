import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static404 {

	@OriginalMember(owner = "client!nn", name = "k", descriptor = "I")
	public static int anInt7039;

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(III)I")
	public static int method6211(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(15) int local15 = arg0 >>> 31;
		return (local15 + arg0) / arg1 - local15;
	}

	@OriginalMember(owner = "client!nn", name = "b", descriptor = "(B)V")
	public static void method6212() {
		if (Static310.aClass6_Sub2_Sub2_1 != null) {
			Static310.aClass6_Sub2_Sub2_1 = null;
			Static15.method206(Static587.anInt9342, Static69.anInt919, Static421.anInt7230, Static145.anInt3045);
		}
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(I)V")
	public static void method6214() {
		@Pc(15) Class6_Sub9 local15 = (Class6_Sub9) Static518.aClass340_65.method8124();
		@Pc(29) boolean local29 = Static637.aClass381_13 != null || Static102.anInt2058 > 0;
		@Pc(33) int local33 = local15.method7137();
		@Pc(39) int local39 = local15.method7139();
		if (local29) {
			Static673.anInt10331 = 1;
		}
		if (local29) {
			Static47.aClass6_Sub2_Sub11_1 = Static197.aClass6_Sub2_Sub11_2;
		} else {
			Static444.method6881(Static197.aClass6_Sub2_Sub11_2, local39, local33);
		}
	}

	@OriginalMember(owner = "client!nn", name = "b", descriptor = "(I)V")
	public static void method6215() {
		if (Static687.aClass6_Sub44_33.aClass7_Sub24_2.method7501() != 2) {
			return;
		}
		@Pc(20) byte local20 = (byte) (Static227.anInt4418 - 4 & 0xFF);
		@Pc(24) int local24 = Static227.anInt4418 % Static29.anInt380;
		@Pc(32) int local32;
		for (@Pc(26) int local26 = 0; local26 < 4; local26++) {
			for (local32 = 0; local32 < Static327.anInt5650; local32++) {
				Static333.aByteArrayArrayArray15[local26][local24][local32] = local20;
			}
		}
		if (Static504.anInt8428 == 3) {
			return;
		}
		for (local32 = 0; local32 < 2; local32++) {
			Static451.anIntArray492[local32] = -1000000;
			Static39.anIntArray39[local32] = 1000000;
			Static568.anIntArray660[local32] = 0;
			Static236.anIntArray235[local32] = 1000000;
			Static224.anIntArray222[local32] = 0;
		}
		@Pc(102) int local102 = Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1.anInt9048;
		@Pc(105) int local105 = Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1.anInt9057;
		@Pc(121) int local121;
		if (Static526.anInt8626 != 1 && Static126.anInt2529 == -1) {
			local121 = Static248.method4318(Static365.anInt6155, Static504.anInt8428, Static475.anInt8090);
			if (local121 - Static406.anInt7076 < 3200 && (Static272.aByteArrayArrayArray2[Static504.anInt8428][Static475.anInt8090 >> 9][Static365.anInt6155 >> 9] & 0x4) != 0) {
				Static258.method4504(Static334.aClass243ArrayArrayArray2, false, 1, Static475.anInt8090 >> 9, Static365.anInt6155 >> 9);
				return;
			}
			return;
		}
		if (Static526.anInt8626 != 1) {
			local105 = Static16.anInt232;
			local102 = Static126.anInt2529;
		}
		if ((Static272.aByteArrayArrayArray2[Static504.anInt8428][local102 >> 9][local105 >> 9] & 0x4) != 0) {
			Static258.method4504(Static334.aClass243ArrayArrayArray2, false, 0, local102 >> 9, local105 >> 9);
		}
		if (Static337.anInt5759 >= 2560) {
			return;
		}
		local121 = Static475.anInt8090 >> 9;
		@Pc(211) int local211 = Static365.anInt6155 >> 9;
		@Pc(215) int local215 = local102 >> 9;
		@Pc(219) int local219 = local105 >> 9;
		@Pc(227) int local227;
		if (local215 <= local121) {
			local227 = local121 - local215;
		} else {
			local227 = local215 - local121;
		}
		@Pc(245) int local245;
		if (local211 < local219) {
			local245 = local219 - local211;
		} else {
			local245 = local211 - local219;
		}
		if (local227 == 0 && local245 == 0 || local227 <= -Static29.anInt380 || local227 >= Static29.anInt380 || local245 <= -Static327.anInt5650 || local245 >= Static327.anInt5650) {
			Static550.method7785((Throwable) null, "RC: " + local121 + "," + local211 + " " + local215 + "," + local219 + " " + Static50.anInt606 + "," + anInt7039);
			return;
		}
		@Pc(343) int local343;
		@Pc(345) int local345;
		if (local245 < local227) {
			local343 = local245 * 65536 / local227;
			local345 = 32768;
			while (local121 != local215) {
				if (local215 > local121) {
					local121++;
				} else if (local215 < local121) {
					local121--;
				}
				if ((Static272.aByteArrayArrayArray2[Static504.anInt8428][local121][local211] & 0x4) != 0) {
					Static258.method4504(Static334.aClass243ArrayArrayArray2, false, 1, local121, local211);
					return;
				}
				local345 += local343;
				if (local345 >= 65536) {
					if (local211 < local219) {
						local211++;
					} else if (local219 < local211) {
						local211--;
					}
					local345 -= 65536;
					if ((Static272.aByteArrayArrayArray2[Static504.anInt8428][local121][local211] & 0x4) != 0) {
						Static258.method4504(Static334.aClass243ArrayArrayArray2, false, 1, local121, local211);
						return;
					}
				}
			}
			return;
		}
		local343 = local227 * 65536 / local245;
		local345 = 32768;
		while (local211 != local219) {
			if (local219 > local211) {
				local211++;
			} else if (local211 > local219) {
				local211--;
			}
			if ((Static272.aByteArrayArrayArray2[Static504.anInt8428][local121][local211] & 0x4) != 0) {
				Static258.method4504(Static334.aClass243ArrayArrayArray2, false, 1, local121, local211);
				return;
			}
			local345 += local343;
			if (local345 >= 65536) {
				if (local121 < local215) {
					local121++;
				} else if (local121 > local215) {
					local121--;
				}
				local345 -= 65536;
				if ((Static272.aByteArrayArrayArray2[Static504.anInt8428][local121][local211] & 0x4) != 0) {
					Static258.method4504(Static334.aClass243ArrayArrayArray2, false, 1, local121, local211);
					return;
				}
			}
		}
	}
}
