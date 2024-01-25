import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static437 {

	@OriginalMember(owner = "client!vp", name = "d", descriptor = "Lclient!vl;")
	public static Class263 aClass263_33;

	@OriginalMember(owner = "client!vp", name = "f", descriptor = "I")
	public static int anInt6906;

	@OriginalMember(owner = "client!vp", name = "b", descriptor = "Lclient!eh;")
	public static final Class67 aClass67_263 = new Class67(4, -2);

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(ILclient!jp;I)V")
	public static void method5493(@OriginalArg(1) Class1_Sub19_Sub2 arg0, @OriginalArg(2) int arg1) {
		@Pc(17) boolean local17 = arg0.method2946(1) == 1;
		if (local17) {
			Static438.anIntArray496[Static398.anInt6391++] = arg1;
		}
		@Pc(32) int local32 = arg0.method2946(2);
		@Pc(36) Class11_Sub1_Sub3_Sub2 local36 = Static399.aClass11_Sub1_Sub3_Sub2Array1[arg1];
		if (local32 != 0) {
			@Pc(149) int local149;
			@Pc(154) int local154;
			@Pc(159) int local159;
			if (local32 == 1) {
				local149 = arg0.method2946(3);
				local154 = local36.anIntArray246[0];
				local159 = local36.anIntArray247[0];
				if (local149 == 0) {
					local154--;
					local159--;
				} else if (local149 == 1) {
					local159--;
				} else if (local149 == 2) {
					local159--;
					local154++;
				} else if (local149 == 3) {
					local154--;
				} else if (local149 == 4) {
					local154++;
				} else if (local149 == 5) {
					local159++;
					local154--;
				} else if (local149 == 6) {
					local159++;
				} else if (local149 == 7) {
					local159++;
					local154++;
				}
				if (local17) {
					local36.anInt3384 = local154;
					local36.anInt3365 = local159;
					local36.aBoolean327 = true;
				} else {
					local36.method2651(local154, Static348.aByteArray79[arg1], local159);
				}
			} else if (local32 == 2) {
				local149 = arg0.method2946(4);
				local154 = local36.anIntArray246[0];
				local159 = local36.anIntArray247[0];
				if (local149 == 0) {
					local159 -= 2;
					local154 -= 2;
				} else if (local149 == 1) {
					local159 -= 2;
					local154--;
				} else if (local149 == 2) {
					local159 -= 2;
				} else if (local149 == 3) {
					local159 -= 2;
					local154++;
				} else if (local149 == 4) {
					local159 -= 2;
					local154 += 2;
				} else if (local149 == 5) {
					local159--;
					local154 -= 2;
				} else if (local149 == 6) {
					local159--;
					local154 += 2;
				} else if (local149 == 7) {
					local154 -= 2;
				} else if (local149 == 8) {
					local154 += 2;
				} else if (local149 == 9) {
					local154 -= 2;
					local159++;
				} else if (local149 == 10) {
					local159++;
					local154 += 2;
				} else if (local149 == 11) {
					local154 -= 2;
					local159 += 2;
				} else if (local149 == 12) {
					local154--;
					local159 += 2;
				} else if (local149 == 13) {
					local159 += 2;
				} else if (local149 == 14) {
					local159 += 2;
					local154++;
				} else if (local149 == 15) {
					local159 += 2;
					local154 += 2;
				}
				if (local17) {
					local36.aBoolean327 = true;
					local36.anInt3365 = local159;
					local36.anInt3384 = local154;
				} else {
					local36.method2651(local154, Static348.aByteArray79[arg1], local159);
				}
			} else {
				local149 = arg0.method2946(1);
				@Pc(426) int local426;
				@Pc(436) int local436;
				@Pc(448) int local448;
				@Pc(455) int local455;
				if (local149 == 0) {
					local154 = arg0.method2946(12);
					local159 = local154 >> 10;
					local426 = local154 >> 5 & 0x1F;
					if (local426 > 15) {
						local426 -= 32;
					}
					local436 = local154 & 0x1F;
					if (local436 > 15) {
						local436 -= 32;
					}
					local448 = local36.anIntArray246[0] + local426;
					local455 = local436 + local36.anIntArray247[0];
					if (local17) {
						local36.aBoolean327 = true;
						local36.anInt3384 = local448;
						local36.anInt3365 = local455;
					} else {
						local36.method2651(local448, Static348.aByteArray79[arg1], local455);
					}
					local36.aByte90 = (byte) (local36.aByte90 + local159 & 0x3);
					if (arg1 == Static220.anInt4038) {
						Static390.anInt6272 = local36.aByte90;
					}
				} else {
					local154 = arg0.method2946(30);
					local159 = local154 >> 28;
					local426 = local154 >> 14 & 0x3FFF;
					local436 = local154 & 0x3FFF;
					local448 = (local36.anIntArray246[0] + Static315.anInt5207 + local426 & 0x3FFF) - Static315.anInt5207;
					local455 = (local36.anIntArray247[0] + Static47.anInt676 + local436 & 0x3FFF) - Static47.anInt676;
					if (local17) {
						local36.anInt3384 = local448;
						local36.anInt3365 = local455;
						local36.aBoolean327 = true;
					} else {
						local36.method2651(local448, Static348.aByteArray79[arg1], local455);
					}
					local36.aByte90 = (byte) (local36.aByte90 + local159 & 0x3);
					if (arg1 == Static220.anInt4038) {
						Static390.anInt6272 = local36.aByte90;
					}
				}
			}
		} else if (local17) {
			local36.aBoolean327 = false;
		} else if (arg1 == Static220.anInt4038) {
			throw new RuntimeException("s:lr");
		} else {
			@Pc(64) Class70 local64 = Static393.aClass70Array1[arg1] = new Class70();
			local64.anInt1299 = (local36.anIntArray247[0] + Static47.anInt676 >> 6) + (local36.anIntArray246[0] + Static315.anInt5207 >> 6 << 14) + (local36.aByte90 << 28);
			if (local36.anInt3361 == -1) {
				local64.anInt1295 = local36.aClass41_7.method704();
			} else {
				local64.anInt1295 = local36.anInt3361;
			}
			local64.aBoolean150 = local36.aBoolean328;
			local64.anInt1296 = local36.anInt3318;
			if (local36.anInt3366 > 0) {
				Static303.method4047(local36);
			}
			Static399.aClass11_Sub1_Sub3_Sub2Array1[arg1] = null;
			if (arg0.method2946(1) != 0) {
				Static220.method3160(arg1, arg0);
			}
		}
	}
}
