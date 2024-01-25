import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static327 {

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "Lclient!uu;")
	public static Class230_Sub1 aClass230_Sub1_1;

	@OriginalMember(owner = "client!qi", name = "c", descriptor = "Lclient!hh;")
	public static Class109 aClass109_74;

	@OriginalMember(owner = "client!qi", name = "b", descriptor = "Lclient!vp;")
	public static final Class254 aClass254_111 = new Class254(48, -1);

	@OriginalMember(owner = "client!qi", name = "f", descriptor = "Lclient!dq;")
	public static final Class60 aClass60_14 = new Class60(4, 5);

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(IILclient!qf;)V")
	public static void method4735(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub14_Sub2 arg1) {
		@Pc(22) boolean local22 = arg1.method4557(1) == 1;
		if (local22) {
			Static21.anIntArray24[Static204.anInt3633++] = arg0;
		}
		@Pc(37) int local37 = arg1.method4557(2);
		@Pc(41) Class47_Sub1_Sub5_Sub2 local41 = Static362.aClass47_Sub1_Sub5_Sub2Array1[arg0];
		if (local37 != 0) {
			@Pc(160) int local160;
			@Pc(165) int local165;
			@Pc(170) int local170;
			if (local37 == 1) {
				local160 = arg1.method4557(3);
				local165 = local41.anIntArray407[0];
				local170 = local41.anIntArray408[0];
				if (local160 == 0) {
					local165--;
					local170--;
				} else if (local160 == 1) {
					local170--;
				} else if (local160 == 2) {
					local165++;
					local170--;
				} else if (local160 == 3) {
					local165--;
				} else if (local160 == 4) {
					local165++;
				} else if (local160 == 5) {
					local170++;
					local165--;
				} else if (local160 == 6) {
					local170++;
				} else if (local160 == 7) {
					local170++;
					local165++;
				}
				if (local22) {
					local41.aBoolean436 = true;
					local41.anInt5436 = local170;
					local41.anInt5428 = local165;
				} else {
					local41.method4334(local170, local165, Static282.aByteArray57[arg0]);
				}
			} else if (local37 == 2) {
				local160 = arg1.method4557(4);
				local165 = local41.anIntArray407[0];
				local170 = local41.anIntArray408[0];
				if (local160 == 0) {
					local165 -= 2;
					local170 -= 2;
				} else if (local160 == 1) {
					local165--;
					local170 -= 2;
				} else if (local160 == 2) {
					local170 -= 2;
				} else if (local160 == 3) {
					local170 -= 2;
					local165++;
				} else if (local160 == 4) {
					local165 += 2;
					local170 -= 2;
				} else if (local160 == 5) {
					local170--;
					local165 -= 2;
				} else if (local160 == 6) {
					local165 += 2;
					local170--;
				} else if (local160 == 7) {
					local165 -= 2;
				} else if (local160 == 8) {
					local165 += 2;
				} else if (local160 == 9) {
					local165 -= 2;
					local170++;
				} else if (local160 == 10) {
					local170++;
					local165 += 2;
				} else if (local160 == 11) {
					local165 -= 2;
					local170 += 2;
				} else if (local160 == 12) {
					local170 += 2;
					local165--;
				} else if (local160 == 13) {
					local170 += 2;
				} else if (local160 == 14) {
					local165++;
					local170 += 2;
				} else if (local160 == 15) {
					local165 += 2;
					local170 += 2;
				}
				if (local22) {
					local41.anInt5428 = local165;
					local41.aBoolean436 = true;
					local41.anInt5436 = local170;
				} else {
					local41.method4334(local170, local165, Static282.aByteArray57[arg0]);
				}
			} else {
				local160 = arg1.method4557(1);
				@Pc(439) int local439;
				@Pc(447) int local447;
				@Pc(460) int local460;
				@Pc(467) int local467;
				if (local160 == 0) {
					local165 = arg1.method4557(12);
					local170 = local165 >> 10;
					local439 = local165 >> 5 & 0x1F;
					if (local439 > 15) {
						local439 -= 32;
					}
					local447 = local165 & 0x1F;
					if (local447 > 15) {
						local447 -= 32;
					}
					local460 = local41.anIntArray407[0] + local439;
					local467 = local447 + local41.anIntArray408[0];
					if (local22) {
						local41.anInt5428 = local460;
						local41.aBoolean436 = true;
						local41.anInt5436 = local467;
					} else {
						local41.method4334(local467, local460, Static282.aByteArray57[arg0]);
					}
					local41.aByte97 = (byte) (local41.aByte97 + local170 & 0x3);
					if (arg0 == Static179.anInt3373) {
						Static1.anInt41 = local41.aByte97;
					}
				} else {
					local165 = arg1.method4557(30);
					local170 = local165 >> 28;
					local439 = local165 >> 14 & 0x3FFF;
					local447 = local165 & 0x3FFF;
					local460 = (local41.anIntArray407[0] + Static190.anInt3507 + local439 & 0x3FFF) - Static190.anInt3507;
					local467 = (local41.anIntArray408[0] + Static331.anInt6034 + local447 & 0x3FFF) - Static331.anInt6034;
					if (local22) {
						local41.anInt5428 = local460;
						local41.anInt5436 = local467;
						local41.aBoolean436 = true;
					} else {
						local41.method4334(local467, local460, Static282.aByteArray57[arg0]);
					}
					local41.aByte97 = (byte) (local41.aByte97 + local170 & 0x3);
					if (arg0 == Static179.anInt3373) {
						Static1.anInt41 = local41.aByte97;
					}
				}
			}
		} else if (local22) {
			local41.aBoolean436 = false;
		} else if (Static179.anInt3373 == arg0) {
			throw new RuntimeException("s:lr");
		} else {
			@Pc(72) Class144 local72 = Static212.aClass144Array1[arg0] = new Class144();
			local72.anInt3835 = (Static331.anInt6034 + local41.anIntArray408[0] >> 6) + (local41.anIntArray407[0] + Static190.anInt3507 >> 6 << 14) + (local41.aByte97 << 28);
			if (local41.anInt5440 == -1) {
				local72.anInt3832 = local41.aClass134_7.method3097();
			} else {
				local72.anInt3832 = local41.anInt5440;
			}
			local72.aBoolean307 = local41.aBoolean438;
			local72.anInt3830 = local41.anInt5378;
			if (local41.anInt5441 > 0) {
				Static121.method1887(local41);
			}
			Static362.aClass47_Sub1_Sub5_Sub2Array1[arg0] = null;
			if (arg1.method4557(1) != 0) {
				Static180.method3094(arg0, arg1);
			}
		}
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(Lclient!tn;I)V")
	public static void method4736(@OriginalArg(0) Class229 arg0) {
		if (arg0.anInt6863 == 5 && arg0.anInt6918 != -1) {
			Static94.method1466(Static447.aClass121_11, arg0);
		}
	}
}
