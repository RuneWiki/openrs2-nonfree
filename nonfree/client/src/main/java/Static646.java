import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static646 {

	@OriginalMember(owner = "client!vt", name = "b", descriptor = "Lclient!sv;")
	public static final Class341 aClass341_111 = new Class341(80, 12);

	@OriginalMember(owner = "client!vt", name = "c", descriptor = "Lclient!in;")
	public static final Class169 aClass169_259 = new Class169(108, -1);

	@OriginalMember(owner = "client!vt", name = "d", descriptor = "Lclient!bw;")
	public static final Class42 aClass42_4 = new Class42(128);

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(ILclient!kja;I)V")
	public static void method9527(@OriginalArg(1) Class2_Sub8_Sub2 arg0, @OriginalArg(2) int arg1) {
		@Pc(17) boolean local17 = arg0.method5233(1) == 1;
		if (local17) {
			Static257.anIntArray250[Static318.anInt5798++] = arg1;
		}
		@Pc(32) int local32 = arg0.method5233(2);
		@Pc(36) Class15_Sub3_Sub3_Sub1_Sub1 local36 = Static28.aClass15_Sub3_Sub3_Sub1_Sub1Array1[arg1];
		if (local32 != 0) {
			@Pc(151) int local151;
			@Pc(156) int local156;
			@Pc(161) int local161;
			if (local32 == 1) {
				local151 = arg0.method5233(3);
				local156 = local36.anIntArray189[0];
				local161 = local36.anIntArray188[0];
				if (local151 == 0) {
					local161--;
					local156--;
				} else if (local151 == 1) {
					local161--;
				} else if (local151 == 2) {
					local156++;
					local161--;
				} else if (local151 == 3) {
					local156--;
				} else if (local151 == 4) {
					local156++;
				} else if (local151 == 5) {
					local161++;
					local156--;
				} else if (local151 == 6) {
					local161++;
				} else if (local151 == 7) {
					local156++;
					local161++;
				}
				if (local17) {
					local36.anInt2401 = local161;
					local36.aBoolean174 = true;
					local36.anInt2375 = local156;
				} else {
					local36.method2220(local161, Static15.aByteArray6[arg1], local156);
				}
			} else if (local32 == 2) {
				local151 = arg0.method5233(4);
				local156 = local36.anIntArray189[0];
				local161 = local36.anIntArray188[0];
				if (local151 == 0) {
					local161 -= 2;
					local156 -= 2;
				} else if (local151 == 1) {
					local161 -= 2;
					local156--;
				} else if (local151 == 2) {
					local161 -= 2;
				} else if (local151 == 3) {
					local156++;
					local161 -= 2;
				} else if (local151 == 4) {
					local161 -= 2;
					local156 += 2;
				} else if (local151 == 5) {
					local161--;
					local156 -= 2;
				} else if (local151 == 6) {
					local156 += 2;
					local161--;
				} else if (local151 == 7) {
					local156 -= 2;
				} else if (local151 == 8) {
					local156 += 2;
				} else if (local151 == 9) {
					local156 -= 2;
					local161++;
				} else if (local151 == 10) {
					local156 += 2;
					local161++;
				} else if (local151 == 11) {
					local156 -= 2;
					local161 += 2;
				} else if (local151 == 12) {
					local161 += 2;
					local156--;
				} else if (local151 == 13) {
					local161 += 2;
				} else if (local151 == 14) {
					local161 += 2;
					local156++;
				} else if (local151 == 15) {
					local161 += 2;
					local156 += 2;
				}
				if (local17) {
					local36.aBoolean174 = true;
					local36.anInt2401 = local161;
					local36.anInt2375 = local156;
				} else {
					local36.method2220(local161, Static15.aByteArray6[arg1], local156);
				}
			} else {
				local151 = arg0.method5233(1);
				@Pc(417) int local417;
				@Pc(425) int local425;
				@Pc(436) int local436;
				@Pc(443) int local443;
				if (local151 == 0) {
					local156 = arg0.method5233(12);
					local161 = local156 >> 10;
					local417 = local156 >> 5 & 0x1F;
					if (local417 > 15) {
						local417 -= 32;
					}
					local425 = local156 & 0x1F;
					if (local425 > 15) {
						local425 -= 32;
					}
					local436 = local417 + local36.anIntArray189[0];
					local443 = local36.anIntArray188[0] + local425;
					if (local17) {
						local36.anInt2401 = local443;
						local36.aBoolean174 = true;
						local36.anInt2375 = local436;
					} else {
						local36.method2220(local443, Static15.aByteArray6[arg1], local436);
					}
					local36.aByte142 = local36.aByte141 = (byte) (local36.aByte142 + local161 & 0x3);
					if (Static45.method947(local436, local443)) {
						local36.aByte141++;
					}
					if (Static659.anInt11273 == arg1) {
						if (Static547.anInt9550 != local36.aByte142) {
							Static207.aBoolean327 = true;
						}
						Static547.anInt9550 = local36.aByte142;
					}
				} else {
					local156 = arg0.method5233(30);
					local161 = local156 >> 28;
					local417 = local156 >> 14 & 0x3FFF;
					local425 = local156 & 0x3FFF;
					local436 = (local36.anIntArray189[0] + Static640.anInt11085 + local417 & 0x3FFF) - Static640.anInt11085;
					local443 = (local425 + local36.anIntArray188[0] + Static490.anInt8763 & 0x3FFF) - Static490.anInt8763;
					if (local17) {
						local36.anInt2375 = local436;
						local36.anInt2401 = local443;
						local36.aBoolean174 = true;
					} else {
						local36.method2220(local443, Static15.aByteArray6[arg1], local436);
					}
					local36.aByte142 = local36.aByte141 = (byte) (local161 + local36.aByte142 & 0x3);
					if (Static45.method947(local436, local443)) {
						local36.aByte141++;
					}
					if (Static659.anInt11273 == arg1) {
						Static547.anInt9550 = local36.aByte142;
					}
				}
			}
		} else if (local17) {
			local36.aBoolean174 = false;
		} else if (Static659.anInt11273 == arg1) {
			throw new RuntimeException("s:lr");
		} else {
			@Pc(60) Class245 local60 = Static221.aClass245Array1[arg1] = new Class245();
			local60.anInt7390 = (local36.anIntArray188[0] + Static490.anInt8763 >> 6) + (local36.aByte142 << 28) + (local36.anIntArray189[0] + Static640.anInt11085 >> 6 << 14);
			if (local36.anInt2376 == -1) {
				local60.anInt7393 = local36.aClass106_7.method3290();
			} else {
				local60.anInt7393 = local36.anInt2376;
			}
			local60.anInt7392 = local36.anInt3979;
			local60.aBoolean554 = local36.aBoolean173;
			local60.aBoolean555 = local36.aBoolean172;
			if (local36.anInt2390 > 0) {
				Static179.method3533(local36);
			}
			Static28.aClass15_Sub3_Sub3_Sub1_Sub1Array1[arg1] = null;
			if (arg0.method5233(1) != 0) {
				Static238.method4269(arg0, arg1);
			}
		}
	}
}
