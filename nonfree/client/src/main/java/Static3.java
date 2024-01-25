import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static3 {

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Ljava/lang/String;IIZ)I")
	public static int method83(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		@Pc(28) boolean local28 = false;
		@Pc(30) boolean local30 = false;
		@Pc(32) int local32 = 0;
		@Pc(35) int local35 = arg0.length();
		for (@Pc(45) int local45 = 0; local45 < local35; local45++) {
			@Pc(51) char local51 = arg0.charAt(local45);
			if (local45 == 0) {
				if (local51 == '-') {
					local28 = true;
					continue;
				}
				if (local51 == '+') {
					continue;
				}
			}
			@Pc(78) int local78;
			if (local51 >= '0' && local51 <= '9') {
				local78 = local51 - '0';
			} else if (local51 >= 'A' && local51 <= 'Z') {
				local78 = local51 - '7';
			} else if (local51 >= 'a' && local51 <= 'z') {
				local78 = local51 - 'W';
			} else {
				throw new NumberFormatException();
			}
			if (local78 >= arg1) {
				throw new NumberFormatException();
			}
			if (local28) {
				local78 = -local78;
			}
			@Pc(124) int local124 = local78 + arg1 * local32;
			if (local124 / arg1 != local32) {
				throw new NumberFormatException();
			}
			local30 = true;
			local32 = local124;
		}
		if (!local30) {
			throw new NumberFormatException();
		}
		return local32;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IBLclient!pf;)V")
	public static void method84(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub13_Sub2 arg1) {
		@Pc(17) boolean local17 = arg1.method4257(1) == 1;
		if (local17) {
			Static367.anIntArray779[Static254.anInt4548++] = arg0;
		}
		@Pc(32) int local32 = arg1.method4257(2);
		@Pc(36) Class12_Sub1_Sub2_Sub2 local36 = Static90.aClass12_Sub1_Sub2_Sub2Array1[arg0];
		if (local32 != 0) {
			@Pc(140) int local140;
			@Pc(145) int local145;
			@Pc(150) int local150;
			if (local32 == 1) {
				local140 = arg1.method4257(3);
				local145 = local36.anIntArray659[0];
				local150 = local36.anIntArray658[0];
				if (local140 == 0) {
					local150--;
					local145--;
				} else if (local140 == 1) {
					local150--;
				} else if (local140 == 2) {
					local145++;
					local150--;
				} else if (local140 == 3) {
					local145--;
				} else if (local140 == 4) {
					local145++;
				} else if (local140 == 5) {
					local150++;
					local145--;
				} else if (local140 == 6) {
					local150++;
				} else if (local140 == 7) {
					local145++;
					local150++;
				}
				if (local17) {
					local36.anInt5396 = local145;
					local36.anInt5420 = local150;
				} else {
					local36.anInt5396 = -1;
					local36.method4720(local150, local145, Static258.aByteArray65[arg0]);
				}
			} else if (local32 == 2) {
				local140 = arg1.method4257(4);
				local145 = local36.anIntArray659[0];
				local150 = local36.anIntArray658[0];
				if (local140 == 0) {
					local145 -= 2;
					local150 -= 2;
				} else if (local140 == 1) {
					local145--;
					local150 -= 2;
				} else if (local140 == 2) {
					local150 -= 2;
				} else if (local140 == 3) {
					local145++;
					local150 -= 2;
				} else if (local140 == 4) {
					local145 += 2;
					local150 -= 2;
				} else if (local140 == 5) {
					local150--;
					local145 -= 2;
				} else if (local140 == 6) {
					local150--;
					local145 += 2;
				} else if (local140 == 7) {
					local145 -= 2;
				} else if (local140 == 8) {
					local145 += 2;
				} else if (local140 == 9) {
					local150++;
					local145 -= 2;
				} else if (local140 == 10) {
					local145 += 2;
					local150++;
				} else if (local140 == 11) {
					local150 += 2;
					local145 -= 2;
				} else if (local140 == 12) {
					local145--;
					local150 += 2;
				} else if (local140 == 13) {
					local150 += 2;
				} else if (local140 == 14) {
					local150 += 2;
					local145++;
				} else if (local140 == 15) {
					local150 += 2;
					local145 += 2;
				}
				if (local17) {
					local36.anInt5396 = local145;
					local36.anInt5420 = local150;
				} else {
					local36.anInt5396 = -1;
					local36.method4720(local150, local145, Static258.aByteArray65[arg0]);
				}
			} else {
				local140 = arg1.method4257(1);
				@Pc(409) int local409;
				@Pc(417) int local417;
				@Pc(428) int local428;
				@Pc(435) int local435;
				if (local140 == 0) {
					local145 = arg1.method4257(12);
					local150 = local145 >> 10;
					local409 = local145 >> 5 & 0x1F;
					if (local409 > 15) {
						local409 -= 32;
					}
					local417 = local145 & 0x1F;
					if (local417 > 15) {
						local417 -= 32;
					}
					local428 = local409 + local36.anIntArray659[0];
					local435 = local417 + local36.anIntArray658[0];
					if (local17) {
						local36.anInt5396 = local428;
						local36.anInt5420 = local435;
					} else {
						local36.anInt5396 = -1;
						local36.method4720(local435, local428, Static258.aByteArray65[arg0]);
					}
					local36.aByte74 = (byte) (local36.aByte74 + local150 & 0x3);
					if (Static194.anInt3441 == arg0) {
						Static331.anInt5804 = local36.aByte74;
					}
				} else {
					local145 = arg1.method4257(30);
					local150 = local145 >> 28;
					local409 = local145 >> 14 & 0x3FFF;
					local417 = local145 & 0x3FFF;
					local428 = (local36.anIntArray659[0] + Static376.anInt6607 + local409 & 0x3FFF) - Static376.anInt6607;
					local435 = (local417 + Static133.anInt2474 + local36.anIntArray658[0] & 0x3FFF) - Static133.anInt2474;
					if (local17) {
						local36.anInt5396 = local428;
						local36.anInt5420 = local435;
					} else {
						local36.anInt5396 = -1;
						local36.method4720(local435, local428, Static258.aByteArray65[arg0]);
					}
					local36.aByte74 = (byte) (local36.aByte74 + local150 & 0x3);
					if (Static194.anInt3441 == arg0) {
						Static331.anInt5804 = local36.aByte74;
					}
				}
			}
		} else if (local17) {
			local36.anInt5396 = -1;
		} else if (Static194.anInt3441 == arg0) {
			throw new RuntimeException("s:lr");
		} else {
			Static367.anIntArray780[arg0] = (Static376.anInt6607 + local36.anIntArray659[0] >> 6 << 14) + (local36.aByte74 << 28) + (local36.anIntArray658[0] + Static133.anInt2474 >> 6);
			if (local36.anInt5390 == -1) {
				Static203.anIntArray444[arg0] = local36.aClass32_7.method773();
			} else {
				Static203.anIntArray444[arg0] = local36.anInt5390;
			}
			Static299.anIntArray650[arg0] = local36.anInt5345;
			if (local36.anInt5418 > 0) {
				Static287.method4407(local36);
			}
			Static90.aClass12_Sub1_Sub2_Sub2Array1[arg0] = null;
			if (arg1.method4257(1) != 0) {
				Static166.method2718(arg1, arg0);
			}
		}
	}
}
