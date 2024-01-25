import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static210 {

	@OriginalMember(owner = "client!kd", name = "u", descriptor = "I")
	public static int anInt3598;

	@OriginalMember(owner = "client!kd", name = "x", descriptor = "I")
	public static int anInt3600;

	@OriginalMember(owner = "client!kd", name = "w", descriptor = "I")
	public static int anInt3599 = 0;

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIFZIIIII)[[I")
	public static int[][] method2976(@OriginalArg(2) float arg0) {
		@Pc(9) int[][] local9 = new int[256][64];
		@Pc(13) Class2_Sub2_Sub28 local13 = new Class2_Sub2_Sub28();
		local13.anInt5844 = 3;
		local13.aBoolean408 = false;
		local13.anInt5840 = (int) (arg0 * 4096.0F);
		local13.anInt5837 = 4;
		local13.anInt5848 = 8;
		local13.method6262();
		Static249.method3443(64, 256);
		for (@Pc(48) int local48 = 0; local48 < 256; local48++) {
			local13.method4641(local48, local9[local48]);
		}
		return local9;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IBLclient!tq;)V")
	public static void method2978(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub17_Sub1 arg1) {
		@Pc(15) boolean local15 = arg1.method5577(1) == 1;
		if (local15) {
			Static18.anIntArray38[Static422.anInt3434++] = arg0;
		}
		@Pc(35) int local35 = arg1.method5577(2);
		@Pc(39) Class11_Sub5_Sub2_Sub1 local39 = Static435.aClass11_Sub5_Sub2_Sub1Array1[arg0];
		if (local35 != 0) {
			@Pc(149) int local149;
			@Pc(154) int local154;
			@Pc(159) int local159;
			if (local35 == 1) {
				local149 = arg1.method5577(3);
				local154 = local39.anIntArray632[0];
				local159 = local39.anIntArray633[0];
				if (local149 == 0) {
					local159--;
					local154--;
				} else if (local149 == 1) {
					local159--;
				} else if (local149 == 2) {
					local154++;
					local159--;
				} else if (local149 == 3) {
					local154--;
				} else if (local149 == 4) {
					local154++;
				} else if (local149 == 5) {
					local154--;
					local159++;
				} else if (local149 == 6) {
					local159++;
				} else if (local149 == 7) {
					local159++;
					local154++;
				}
				if (local15) {
					local39.anInt2406 = local159;
					local39.aBoolean146 = true;
					local39.anInt2409 = local154;
				} else {
					local39.method2102(local159, Static436.aByteArray89[arg0], local154);
				}
			} else if (local35 == 2) {
				local149 = arg1.method5577(4);
				local154 = local39.anIntArray632[0];
				local159 = local39.anIntArray633[0];
				if (local149 == 0) {
					local154 -= 2;
					local159 -= 2;
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
					local154 -= 2;
					local159--;
				} else if (local149 == 6) {
					local154 += 2;
					local159--;
				} else if (local149 == 7) {
					local154 -= 2;
				} else if (local149 == 8) {
					local154 += 2;
				} else if (local149 == 9) {
					local154 -= 2;
					local159++;
				} else if (local149 == 10) {
					local154 += 2;
					local159++;
				} else if (local149 == 11) {
					local159 += 2;
					local154 -= 2;
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
				if (local15) {
					local39.anInt2409 = local154;
					local39.aBoolean146 = true;
					local39.anInt2406 = local159;
				} else {
					local39.method2102(local159, Static436.aByteArray89[arg0], local154);
				}
			} else {
				local149 = arg1.method5577(1);
				@Pc(400) int local400;
				@Pc(410) int local410;
				@Pc(422) int local422;
				@Pc(429) int local429;
				if (local149 == 0) {
					local154 = arg1.method5577(12);
					local159 = local154 >> 10;
					local400 = local154 >> 5 & 0x1F;
					if (local400 > 15) {
						local400 -= 32;
					}
					local410 = local154 & 0x1F;
					if (local410 > 15) {
						local410 -= 32;
					}
					local422 = local39.anIntArray632[0] + local400;
					local429 = local410 + local39.anIntArray633[0];
					if (local15) {
						local39.aBoolean146 = true;
						local39.anInt2409 = local422;
						local39.anInt2406 = local429;
					} else {
						local39.method2102(local429, Static436.aByteArray89[arg0], local422);
					}
					local39.aByte101 = (byte) (local39.aByte101 + local159 & 0x3);
					if (arg0 == Static94.anInt5592) {
						Static204.anInt3498 = local39.aByte101;
					}
				} else {
					local154 = arg1.method5577(30);
					local159 = local154 >> 28;
					local400 = local154 >> 14 & 0x3FFF;
					local410 = local154 & 0x3FFF;
					local422 = (local400 + local39.anIntArray632[0] + Static386.anInt7205 & 0x3FFF) - Static386.anInt7205;
					local429 = (local410 + Static153.anInt2798 + local39.anIntArray633[0] & 0x3FFF) - Static153.anInt2798;
					if (local15) {
						local39.anInt2409 = local422;
						local39.anInt2406 = local429;
						local39.aBoolean146 = true;
					} else {
						local39.method2102(local429, Static436.aByteArray89[arg0], local422);
					}
					local39.aByte101 = (byte) (local39.aByte101 + local159 & 0x3);
					if (arg0 == Static94.anInt5592) {
						Static204.anInt3498 = local39.aByte101;
					}
				}
			}
		} else if (local15) {
			local39.aBoolean146 = false;
		} else if (Static94.anInt5592 == arg0) {
			throw new RuntimeException("s:lr");
		} else {
			@Pc(67) Class175 local67 = Static385.aClass175Array1[arg0] = new Class175();
			local67.anInt4624 = (Static386.anInt7205 + local39.anIntArray632[0] >> 6 << 14) + (local39.aByte101 << 28) + (Static153.anInt2798 - -local39.anIntArray633[0] >> 6);
			if (local39.anInt2418 == -1) {
				local67.anInt4625 = local39.aClass23_7.method461();
			} else {
				local67.anInt4625 = local39.anInt2418;
			}
			local67.aBoolean331 = local39.aBoolean144;
			local67.anInt4622 = local39.anInt7656;
			if (local39.anInt2402 > 0) {
				Static285.method4042(local39);
			}
			Static435.aClass11_Sub5_Sub2_Sub1Array1[arg0] = null;
			if (arg1.method5577(1) != 0) {
				Static328.method4679(arg0, arg1);
			}
		}
	}
}
