import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static367 {

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "([Ljava/lang/String;[SZ)V")
	public static void method4817(@OriginalArg(0) String[] arg0, @OriginalArg(1) short[] arg1) {
		Static398.method5065(arg0.length - 1, arg0, arg1, 0);
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(IZLclient!nf;)V")
	public static void method4818(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub13_Sub2 arg1) {
		@Pc(17) boolean local17 = arg1.method3615(1) == 1;
		if (local17) {
			Static151.anIntArray209[Static250.anInt4042++] = arg0;
		}
		@Pc(32) int local32 = arg1.method3615(2);
		@Pc(36) Class3_Sub4_Sub1_Sub2 local36 = Static152.aClass3_Sub4_Sub1_Sub2Array1[arg0];
		if (local32 != 0) {
			@Pc(146) int local146;
			@Pc(151) int local151;
			@Pc(156) int local156;
			if (local32 == 1) {
				local146 = arg1.method3615(3);
				local151 = local36.anIntArray425[0];
				local156 = local36.anIntArray424[0];
				if (local146 == 0) {
					local151--;
					local156--;
				} else if (local146 == 1) {
					local156--;
				} else if (local146 == 2) {
					local156--;
					local151++;
				} else if (local146 == 3) {
					local151--;
				} else if (local146 == 4) {
					local151++;
				} else if (local146 == 5) {
					local156++;
					local151--;
				} else if (local146 == 6) {
					local156++;
				} else if (local146 == 7) {
					local151++;
					local156++;
				}
				if (local17) {
					local36.anInt4999 = local151;
					local36.aBoolean357 = true;
					local36.anInt4994 = local156;
				} else {
					local36.method4021(local151, local156, Static288.aByteArray59[arg0]);
				}
			} else if (local32 == 2) {
				local146 = arg1.method3615(4);
				local151 = local36.anIntArray425[0];
				local156 = local36.anIntArray424[0];
				if (local146 == 0) {
					local151 -= 2;
					local156 -= 2;
				} else if (local146 == 1) {
					local156 -= 2;
					local151--;
				} else if (local146 == 2) {
					local156 -= 2;
				} else if (local146 == 3) {
					local151++;
					local156 -= 2;
				} else if (local146 == 4) {
					local156 -= 2;
					local151 += 2;
				} else if (local146 == 5) {
					local151 -= 2;
					local156--;
				} else if (local146 == 6) {
					local156--;
					local151 += 2;
				} else if (local146 == 7) {
					local151 -= 2;
				} else if (local146 == 8) {
					local151 += 2;
				} else if (local146 == 9) {
					local156++;
					local151 -= 2;
				} else if (local146 == 10) {
					local151 += 2;
					local156++;
				} else if (local146 == 11) {
					local151 -= 2;
					local156 += 2;
				} else if (local146 == 12) {
					local156 += 2;
					local151--;
				} else if (local146 == 13) {
					local156 += 2;
				} else if (local146 == 14) {
					local156 += 2;
					local151++;
				} else if (local146 == 15) {
					local156 += 2;
					local151 += 2;
				}
				if (local17) {
					local36.aBoolean357 = true;
					local36.anInt4994 = local156;
					local36.anInt4999 = local151;
				} else {
					local36.method4021(local151, local156, Static288.aByteArray59[arg0]);
				}
			} else {
				local146 = arg1.method3615(1);
				@Pc(422) int local422;
				@Pc(432) int local432;
				@Pc(446) int local446;
				@Pc(453) int local453;
				if (local146 == 0) {
					local151 = arg1.method3615(12);
					local156 = local151 >> 10;
					local422 = local151 >> 5 & 0x1F;
					if (local422 > 15) {
						local422 -= 32;
					}
					local432 = local151 & 0x1F;
					if (local432 > 15) {
						local432 -= 32;
					}
					local446 = local36.anIntArray425[0] + local422;
					local453 = local432 + local36.anIntArray424[0];
					if (local17) {
						local36.aBoolean357 = true;
						local36.anInt4999 = local446;
						local36.anInt4994 = local453;
					} else {
						local36.method4021(local446, local453, Static288.aByteArray59[arg0]);
					}
					local36.aByte91 = (byte) (local156 + local36.aByte91 & 0x3);
					if (Static201.anInt3383 == arg0) {
						Static61.anInt1129 = local36.aByte91;
					}
				} else {
					local151 = arg1.method3615(30);
					local156 = local151 >> 28;
					local422 = local151 >> 14 & 0x3FFF;
					local432 = local151 & 0x3FFF;
					local446 = (local422 + Static275.anInt4506 + local36.anIntArray425[0] & 0x3FFF) - Static275.anInt4506;
					local453 = (local432 + Static209.anInt3497 + local36.anIntArray424[0] & 0x3FFF) - Static209.anInt3497;
					if (local17) {
						local36.aBoolean357 = true;
						local36.anInt4999 = local446;
						local36.anInt4994 = local453;
					} else {
						local36.method4021(local446, local453, Static288.aByteArray59[arg0]);
					}
					local36.aByte91 = (byte) (local156 + local36.aByte91 & 0x3);
					if (arg0 == Static201.anInt3383) {
						Static61.anInt1129 = local36.aByte91;
					}
				}
			}
		} else if (local17) {
			local36.aBoolean357 = false;
		} else if (arg0 == Static201.anInt3383) {
			throw new RuntimeException("s:lr");
		} else {
			@Pc(64) Class68 local64 = Static428.aClass68Array1[arg0] = new Class68();
			local64.anInt1866 = (Static209.anInt3497 + local36.anIntArray424[0] >> 6) + (local36.anIntArray425[0] + Static275.anInt4506 >> 6 << 14) + (local36.aByte91 << 28);
			if (local36.anInt4980 == -1) {
				local64.anInt1864 = local36.aClass12_7.method177();
			} else {
				local64.anInt1864 = local36.anInt4980;
			}
			local64.aBoolean131 = local36.aBoolean358;
			local64.anInt1868 = local36.anInt4936;
			if (local36.anInt5013 > 0) {
				Static142.method2090(local36);
			}
			Static152.aClass3_Sub4_Sub1_Sub2Array1[arg0] = null;
			if (arg1.method3615(1) != 0) {
				Static32.method478(arg1, arg0);
			}
		}
	}
}
