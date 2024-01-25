import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static159 {

	@OriginalMember(owner = "client!ib", name = "e", descriptor = "[[I")
	public static final int[][] anIntArrayArray30 = new int[128][128];

	@OriginalMember(owner = "client!ib", name = "i", descriptor = "Lclient!gk;")
	public static final Class83 aClass83_67 = new Class83("Loading core fonts - ", "Lade Schriftarten - ", "Chargement des polices - ", "Carregando fontes principais - ");

	@OriginalMember(owner = "client!ib", name = "u", descriptor = "F")
	public static float aFloat108 = 1.0F;

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IZ)I")
	public static int method2696(@OriginalArg(0) int arg0) {
		@Pc(12) int local12 = arg0 >>> 1;
		@Pc(18) int local18 = local12 | local12 >>> 1;
		@Pc(24) int local24 = local18 | local18 >>> 2;
		@Pc(30) int local30 = local24 | local24 >>> 4;
		@Pc(36) int local36 = local30 | local30 >>> 8;
		@Pc(42) int local42 = local36 | local36 >>> 16;
		return ~local42 & arg0;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(B)V")
	public static void method2701() {
		if (Static424.aClass49_2 != null) {
			Static424.aClass49_2.method2069();
		}
		if (Static291.aClass49_1 != null) {
			Static291.aClass49_1.method2069();
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(Lclient!cw;IB)V")
	public static void method2702(@OriginalArg(0) Class4_Sub12_Sub1 arg0, @OriginalArg(1) int arg1) {
		@Pc(17) boolean local17 = arg0.method1143(1) == 1;
		if (local17) {
			Static388.anIntArray497[Static441.anInt7199++] = arg1;
		}
		@Pc(32) int local32 = arg0.method1143(2);
		@Pc(36) Class16_Sub1_Sub5_Sub1 local36 = Static267.aClass16_Sub1_Sub5_Sub1Array1[arg1];
		if (local32 != 0) {
			@Pc(155) int local155;
			@Pc(160) int local160;
			@Pc(165) int local165;
			if (local32 == 1) {
				local155 = arg0.method1143(3);
				local160 = local36.anIntArray426[0];
				local165 = local36.anIntArray427[0];
				if (local155 == 0) {
					local160--;
					local165--;
				} else if (local155 == 1) {
					local165--;
				} else if (local155 == 2) {
					local165--;
					local160++;
				} else if (local155 == 3) {
					local160--;
				} else if (local155 == 4) {
					local160++;
				} else if (local155 == 5) {
					local160--;
					local165++;
				} else if (local155 == 6) {
					local165++;
				} else if (local155 == 7) {
					local160++;
					local165++;
				}
				if (local17) {
					local36.aBoolean401 = true;
					local36.anInt4335 = local160;
					local36.anInt4317 = local165;
				} else {
					local36.method3423(Static411.aByteArray95[arg1], local165, local160);
				}
			} else if (local32 == 2) {
				local155 = arg0.method1143(4);
				local160 = local36.anIntArray426[0];
				local165 = local36.anIntArray427[0];
				if (local155 == 0) {
					local165 -= 2;
					local160 -= 2;
				} else if (local155 == 1) {
					local165 -= 2;
					local160--;
				} else if (local155 == 2) {
					local165 -= 2;
				} else if (local155 == 3) {
					local160++;
					local165 -= 2;
				} else if (local155 == 4) {
					local160 += 2;
					local165 -= 2;
				} else if (local155 == 5) {
					local165--;
					local160 -= 2;
				} else if (local155 == 6) {
					local160 += 2;
					local165--;
				} else if (local155 == 7) {
					local160 -= 2;
				} else if (local155 == 8) {
					local160 += 2;
				} else if (local155 == 9) {
					local165++;
					local160 -= 2;
				} else if (local155 == 10) {
					local160 += 2;
					local165++;
				} else if (local155 == 11) {
					local160 -= 2;
					local165 += 2;
				} else if (local155 == 12) {
					local160--;
					local165 += 2;
				} else if (local155 == 13) {
					local165 += 2;
				} else if (local155 == 14) {
					local165 += 2;
					local160++;
				} else if (local155 == 15) {
					local165 += 2;
					local160 += 2;
				}
				if (local17) {
					local36.anInt4335 = local160;
					local36.aBoolean401 = true;
					local36.anInt4317 = local165;
				} else {
					local36.method3423(Static411.aByteArray95[arg1], local165, local160);
				}
			} else {
				local155 = arg0.method1143(1);
				@Pc(427) int local427;
				@Pc(435) int local435;
				@Pc(449) int local449;
				@Pc(457) int local457;
				if (local155 == 0) {
					local160 = arg0.method1143(12);
					local165 = local160 >> 10;
					local427 = local160 >> 5 & 0x1F;
					if (local427 > 15) {
						local427 -= 32;
					}
					local435 = local160 & 0x1F;
					if (local435 > 15) {
						local435 -= 32;
					}
					local449 = local36.anIntArray426[0] + local427;
					local457 = local36.anIntArray427[0] + local435;
					if (local17) {
						local36.anInt4317 = local457;
						local36.aBoolean401 = true;
						local36.anInt4335 = local449;
					} else {
						local36.method3423(Static411.aByteArray95[arg1], local457, local449);
					}
					local36.aByte82 = (byte) (local36.aByte82 + local165 & 0x3);
					if (Static207.anInt5452 == arg1) {
						Static263.anInt4963 = local36.aByte82;
					}
				} else {
					local160 = arg0.method1143(30);
					local165 = local160 >> 28;
					local427 = local160 >> 14 & 0x3FFF;
					local435 = local160 & 0x3FFF;
					local449 = (local427 + Static180.anInt3453 + local36.anIntArray426[0] & 0x3FFF) - Static180.anInt3453;
					local457 = (Static86.anInt1771 + local36.anIntArray427[0] + local435 & 0x3FFF) - Static86.anInt1771;
					if (local17) {
						local36.anInt4335 = local449;
						local36.aBoolean401 = true;
						local36.anInt4317 = local457;
					} else {
						local36.method3423(Static411.aByteArray95[arg1], local457, local449);
					}
					local36.aByte82 = (byte) (local36.aByte82 + local165 & 0x3);
					if (arg1 == Static207.anInt5452) {
						Static263.anInt4963 = local36.aByte82;
					}
				}
			}
		} else if (local17) {
			local36.aBoolean401 = false;
		} else if (Static207.anInt5452 == arg1) {
			throw new RuntimeException("s:lr");
		} else {
			@Pc(64) Class253 local64 = Static306.aClass253Array1[arg1] = new Class253();
			local64.anInt6949 = (local36.anIntArray427[0] + Static86.anInt1771 >> 6) + (local36.aByte82 << 28) + (Static180.anInt3453 + local36.anIntArray426[0] >> 6 << 14);
			if (local36.anInt4323 == -1) {
				local64.anInt6947 = local36.aClass35_7.method811();
			} else {
				local64.anInt6947 = local36.anInt4323;
			}
			local64.anInt6946 = local36.anInt6034;
			local64.aBoolean648 = local36.aBoolean400;
			if (local36.anInt4334 > 0) {
				Static349.method4705(local36);
			}
			Static267.aClass16_Sub1_Sub5_Sub1Array1[arg1] = null;
			if (arg0.method1143(1) != 0) {
				Static409.method5490(arg0, arg1);
			}
		}
	}
}
