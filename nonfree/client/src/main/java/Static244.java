import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static244 {

	@OriginalMember(owner = "client!pl", name = "w", descriptor = "I")
	public static int anInt4998;

	@OriginalMember(owner = "client!pl", name = "g", descriptor = "Lclient!bt;")
	public static final Class21 aClass21_134 = new Class21(5);

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(IBLclient!ge;)V")
	public static void method4552(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub7_Sub2 arg1) {
		@Pc(17) boolean local17 = arg1.method2169(1) == 1;
		if (local17) {
			Static105.anIntArray179[Static30.anInt698++] = arg0;
		}
		@Pc(32) int local32 = arg1.method2169(2);
		@Pc(36) Class11_Sub2_Sub6_Sub1 local36 = Static275.aClass11_Sub2_Sub6_Sub1Array1[arg0];
		if (local32 != 0) {
			@Pc(141) int local141;
			@Pc(146) int local146;
			@Pc(151) int local151;
			if (local32 == 1) {
				local141 = arg1.method2169(3);
				local146 = local36.anIntArray505[0];
				local151 = local36.anIntArray504[0];
				if (local141 == 0) {
					local151--;
					local146--;
				} else if (local141 == 1) {
					local151--;
				} else if (local141 == 2) {
					local146++;
					local151--;
				} else if (local141 == 3) {
					local146--;
				} else if (local141 == 4) {
					local146++;
				} else if (local141 == 5) {
					local151++;
					local146--;
				} else if (local141 == 6) {
					local151++;
				} else if (local141 == 7) {
					local146++;
					local151++;
				}
				if (local17) {
					local36.anInt6691 = local146;
					local36.anInt6684 = local151;
				} else {
					local36.anInt6691 = -1;
					local36.method5856(local151, Static83.aByteArray39[arg0], local146);
				}
			} else if (local32 == 2) {
				local141 = arg1.method2169(4);
				local146 = local36.anIntArray505[0];
				local151 = local36.anIntArray504[0];
				if (local141 == 0) {
					local146 -= 2;
					local151 -= 2;
				} else if (local141 == 1) {
					local151 -= 2;
					local146--;
				} else if (local141 == 2) {
					local151 -= 2;
				} else if (local141 == 3) {
					local146++;
					local151 -= 2;
				} else if (local141 == 4) {
					local151 -= 2;
					local146 += 2;
				} else if (local141 == 5) {
					local146 -= 2;
					local151--;
				} else if (local141 == 6) {
					local146 += 2;
					local151--;
				} else if (local141 == 7) {
					local146 -= 2;
				} else if (local141 == 8) {
					local146 += 2;
				} else if (local141 == 9) {
					local146 -= 2;
					local151++;
				} else if (local141 == 10) {
					local151++;
					local146 += 2;
				} else if (local141 == 11) {
					local151 += 2;
					local146 -= 2;
				} else if (local141 == 12) {
					local151 += 2;
					local146--;
				} else if (local141 == 13) {
					local151 += 2;
				} else if (local141 == 14) {
					local146++;
					local151 += 2;
				} else if (local141 == 15) {
					local151 += 2;
					local146 += 2;
				}
				if (local17) {
					local36.anInt6691 = local146;
					local36.anInt6684 = local151;
				} else {
					local36.anInt6691 = -1;
					local36.method5856(local151, Static83.aByteArray39[arg0], local146);
				}
			} else {
				local141 = arg1.method2169(1);
				@Pc(410) int local410;
				@Pc(418) int local418;
				@Pc(431) int local431;
				@Pc(438) int local438;
				if (local141 == 0) {
					local146 = arg1.method2169(12);
					local151 = local146 >> 10;
					local410 = local146 >> 5 & 0x1F;
					if (local410 > 15) {
						local410 -= 32;
					}
					local418 = local146 & 0x1F;
					if (local418 > 15) {
						local418 -= 32;
					}
					local431 = local410 + local36.anIntArray505[0];
					local438 = local36.anIntArray504[0] + local418;
					if (local17) {
						local36.anInt6691 = local431;
						local36.anInt6684 = local438;
					} else {
						local36.anInt6691 = -1;
						local36.method5856(local438, Static83.aByteArray39[arg0], local431);
					}
					local36.aByte79 = (byte) (local36.aByte79 + local151 & 0x3);
					if (Static352.anInt1802 == arg0) {
						Static284.anInt6477 = local36.aByte79;
					}
				} else {
					local146 = arg1.method2169(30);
					local151 = local146 >> 28;
					local410 = local146 >> 14 & 0x3FFF;
					local418 = local146 & 0x3FFF;
					local431 = (local410 + Static50.anInt1271 + local36.anIntArray505[0] & 0x3FFF) - Static50.anInt1271;
					local438 = (local418 + Static299.anInt4036 + local36.anIntArray504[0] & 0x3FFF) - Static299.anInt4036;
					if (local17) {
						local36.anInt6691 = local431;
						local36.anInt6684 = local438;
					} else {
						local36.anInt6691 = -1;
						local36.method5856(local438, Static83.aByteArray39[arg0], local431);
					}
					local36.aByte79 = (byte) (local36.aByte79 + local151 & 0x3);
					if (arg0 == Static352.anInt1802) {
						Static284.anInt6477 = local36.aByte79;
					}
				}
			}
		} else if (local17) {
			local36.anInt6691 = -1;
		} else if (Static352.anInt1802 == arg0) {
			throw new RuntimeException("s:lr");
		} else {
			Static283.anIntArray422[arg0] = (Static299.anInt4036 + local36.anIntArray504[0] >> 6) + ((local36.aByte79 << 28) + (Static50.anInt1271 + local36.anIntArray505[0] >> 6 << 14));
			if (local36.anInt6697 == -1) {
				Static201.anIntArray312[arg0] = local36.aClass223_7.method6057();
			} else {
				Static201.anIntArray312[arg0] = local36.anInt6697;
			}
			Static168.anIntArray260[arg0] = local36.anInt6736;
			if (local36.anInt6689 > 0) {
				Static83.method1774(local36);
			}
			Static275.aClass11_Sub2_Sub6_Sub1Array1[arg0] = null;
			if (arg1.method2169(1) != 0) {
				Static83.method1777(arg1, arg0);
			}
		}
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(ZB)V")
	public static void method4555(@OriginalArg(0) boolean arg0) {
		if (Static20.aBoolean28 != arg0) {
			Static20.aBoolean28 = arg0;
			Static195.method3643();
		}
	}
}
