import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static369 {

	@OriginalMember(owner = "client!nd", name = "n", descriptor = "Lclient!qe;")
	public static final Class274 aClass274_107 = new Class274(116, 2);

	@OriginalMember(owner = "client!nd", name = "t", descriptor = "[I")
	public static final int[] anIntArray441 = new int[4096];

	@OriginalMember(owner = "client!nd", name = "u", descriptor = "[I")
	public static final int[] anIntArray442 = new int[3];

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(BILclient!rca;)V")
	public static void method5568(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub34_Sub2 arg1) {
		@Pc(17) boolean local17 = arg1.method6925(1) == 1;
		if (local17) {
			Static108.anIntArray194[Static387.anInt6972++] = arg0;
		}
		@Pc(40) int local40 = arg1.method6925(2);
		@Pc(44) Class11_Sub1_Sub1_Sub2_Sub1 local44 = Static572.aClass11_Sub1_Sub1_Sub2_Sub1Array1[arg0];
		if (local40 != 0) {
			@Pc(156) int local156;
			@Pc(161) int local161;
			@Pc(166) int local166;
			if (local40 == 1) {
				local156 = arg1.method6925(3);
				local161 = local44.anIntArray232[0];
				local166 = local44.anIntArray233[0];
				if (local156 == 0) {
					local166--;
					local161--;
				} else if (local156 == 1) {
					local166--;
				} else if (local156 == 2) {
					local166--;
					local161++;
				} else if (local156 == 3) {
					local161--;
				} else if (local156 == 4) {
					local161++;
				} else if (local156 == 5) {
					local166++;
					local161--;
				} else if (local156 == 6) {
					local166++;
				} else if (local156 == 7) {
					local166++;
					local161++;
				}
				if (local17) {
					local44.anInt569 = local166;
					local44.anInt545 = local161;
					local44.aBoolean44 = true;
				} else {
					local44.method430(Static99.aByteArray24[arg0], local161, local166);
				}
			} else if (local40 == 2) {
				local156 = arg1.method6925(4);
				local161 = local44.anIntArray232[0];
				local166 = local44.anIntArray233[0];
				if (local156 == 0) {
					local161 -= 2;
					local166 -= 2;
				} else if (local156 == 1) {
					local161--;
					local166 -= 2;
				} else if (local156 == 2) {
					local166 -= 2;
				} else if (local156 == 3) {
					local161++;
					local166 -= 2;
				} else if (local156 == 4) {
					local161 += 2;
					local166 -= 2;
				} else if (local156 == 5) {
					local166--;
					local161 -= 2;
				} else if (local156 == 6) {
					local161 += 2;
					local166--;
				} else if (local156 == 7) {
					local161 -= 2;
				} else if (local156 == 8) {
					local161 += 2;
				} else if (local156 == 9) {
					local166++;
					local161 -= 2;
				} else if (local156 == 10) {
					local161 += 2;
					local166++;
				} else if (local156 == 11) {
					local166 += 2;
					local161 -= 2;
				} else if (local156 == 12) {
					local166 += 2;
					local161--;
				} else if (local156 == 13) {
					local166 += 2;
				} else if (local156 == 14) {
					local166 += 2;
					local161++;
				} else if (local156 == 15) {
					local166 += 2;
					local161 += 2;
				}
				if (local17) {
					local44.anInt545 = local161;
					local44.aBoolean44 = true;
					local44.anInt569 = local166;
				} else {
					local44.method430(Static99.aByteArray24[arg0], local161, local166);
				}
			} else {
				local156 = arg1.method6925(1);
				@Pc(423) int local423;
				@Pc(433) int local433;
				@Pc(444) int local444;
				@Pc(451) int local451;
				if (local156 == 0) {
					local161 = arg1.method6925(12);
					local166 = local161 >> 10;
					local423 = local161 >> 5 & 0x1F;
					if (local423 > 15) {
						local423 -= 32;
					}
					local433 = local161 & 0x1F;
					if (local433 > 15) {
						local433 -= 32;
					}
					local444 = local44.anIntArray232[0] + local423;
					local451 = local433 + local44.anIntArray233[0];
					if (local17) {
						local44.aBoolean44 = true;
						local44.anInt569 = local451;
						local44.anInt545 = local444;
					} else {
						local44.method430(Static99.aByteArray24[arg0], local444, local451);
					}
					local44.aByte124 = local44.aByte125 = (byte) (local166 + local44.aByte124 & 0x3);
					if (Static471.method6782(local451, local444)) {
						local44.aByte125++;
					}
					if (arg0 == Static182.anInt4021) {
						if (local44.aByte124 != Static16.anInt308) {
							Static445.aBoolean594 = true;
						}
						Static16.anInt308 = local44.aByte124;
					}
				} else {
					local161 = arg1.method6925(30);
					local166 = local161 >> 28;
					local423 = local161 >> 14 & 0x3FFF;
					local433 = local161 & 0x3FFF;
					local444 = (local423 + local44.anIntArray232[0] + Static451.anInt7933 & 0x3FFF) - Static451.anInt7933;
					local451 = (Static470.anInt8063 + local44.anIntArray233[0] + local433 & 0x3FFF) - Static470.anInt8063;
					if (local17) {
						local44.anInt545 = local444;
						local44.aBoolean44 = true;
						local44.anInt569 = local451;
					} else {
						local44.method430(Static99.aByteArray24[arg0], local444, local451);
					}
					local44.aByte124 = local44.aByte125 = (byte) (local44.aByte124 + local166 & 0x3);
					if (Static471.method6782(local451, local444)) {
						local44.aByte125++;
					}
					if (arg0 == Static182.anInt4021) {
						Static16.anInt308 = local44.aByte124;
					}
				}
			}
		} else if (local17) {
			local44.aBoolean44 = false;
		} else if (Static182.anInt4021 == arg0) {
			throw new RuntimeException("s:lr");
		} else {
			@Pc(71) Class85 local71 = Static428.aClass85Array1[arg0] = new Class85();
			local71.anInt2173 = (Static470.anInt8063 + local44.anIntArray233[0] >> 6) + (local44.aByte124 << 28) + (local44.anIntArray232[0] + Static451.anInt7933 >> 6 << 14);
			if (local44.anInt568 == -1) {
				local71.anInt2176 = local44.aClass82_7.method1815();
			} else {
				local71.anInt2176 = local44.anInt568;
			}
			local71.anInt2171 = local44.anInt3278;
			local71.aBoolean181 = local44.aBoolean47;
			if (local44.anInt553 > 0) {
				Static104.method1770(local44);
			}
			Static572.aClass11_Sub1_Sub1_Sub2_Sub1Array1[arg0] = null;
			if (arg1.method6925(1) != 0) {
				Static600.method8237(arg0, arg1);
			}
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lclient!rca;IZ)V")
	public static void method5569(@OriginalArg(0) Class2_Sub34_Sub2 arg0, @OriginalArg(1) int arg1) {
		Static358.aBoolean485 = false;
		Static387.anInt6972 = 0;
		Static211.method6036(arg0);
		Static57.method1063(arg0);
		if (Static358.aBoolean485) {
			System.out.println("---endgpp---");
		}
		if (arg0.anInt8188 != arg1) {
			throw new RuntimeException("gpi1 pos:" + arg0.anInt8188 + " psize:" + arg1);
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIILjava/lang/String;)V")
	public static void method5571(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) String arg5) {
		Static278.method4448(null, -1, arg0, arg5, arg4, arg3, arg1, arg2);
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lclient!wc;I)V")
	public static void method5572(@OriginalArg(0) Class2_Sub5_Sub20 arg0) {
		if (Static642.aBoolean757) {
			return;
		}
		arg0.method8599();
		Static90.anInt1824--;
		if (!arg0.aBoolean744) {
			@Pc(82) long local82 = arg0.aLong277;
			@Pc(88) Class2_Sub5_Sub2 local88;
			for (local88 = (Class2_Sub5_Sub2) Static294.aClass222_18.method5468(local82); local88 != null && !local88.aString8.equals(arg0.aString101); local88 = (Class2_Sub5_Sub2) Static294.aClass222_18.method5475()) {
			}
			if (local88 != null && local88.method859(arg0)) {
				Static215.method3732(local88);
			}
			return;
		}
		for (@Pc(28) Class2_Sub5_Sub2 local28 = (Class2_Sub5_Sub2) Static61.aClass175_2.method4280(); local28 != null; local28 = (Class2_Sub5_Sub2) Static61.aClass175_2.method4288()) {
			if (local28.aString8.equals(arg0.aString101)) {
				@Pc(37) boolean local37 = false;
				for (@Pc(45) Class2_Sub5_Sub20 local45 = (Class2_Sub5_Sub20) local28.aClass175_1.method4280(); local45 != null; local45 = (Class2_Sub5_Sub20) local28.aClass175_1.method4288()) {
					if (local45 == arg0) {
						local37 = true;
						if (local28.method859(arg0)) {
							Static215.method3732(local28);
						}
						break;
					}
				}
				if (local37) {
					return;
				}
			}
		}
	}
}
