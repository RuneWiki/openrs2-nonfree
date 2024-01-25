import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static180 {

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(IIIII)V")
	public static void method3686(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class3_Sub1_Sub21 local8 = Static57.method8561(arg2, 8);
		local8.method8631();
		local8.anInt10490 = arg1;
		local8.anInt10489 = arg3;
		local8.anInt10491 = arg0;
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(BLclient!fba;ILclient!ha;)V")
	public static void method3687(@OriginalArg(1) Class92 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class33 arg2) {
		@Pc(21) int local21;
		if (Static155.anIntArray206 != null && arg1 <= arg0.aByte39) {
			for (local21 = 0; local21 < Static155.anIntArray206.length; local21++) {
				if (Static155.anIntArray206[local21] != -1000000 && (arg0.anIntArray189[0] <= Static155.anIntArray206[local21] || Static155.anIntArray206[local21] >= arg0.anIntArray189[1] || arg0.anIntArray189[2] <= Static155.anIntArray206[local21] || Static155.anIntArray206[local21] >= arg0.anIntArray189[3]) && (arg0.anIntArray188[0] <= Static453.anIntArray518[local21] || Static453.anIntArray518[local21] >= arg0.anIntArray188[1] || arg0.anIntArray188[2] <= Static453.anIntArray518[local21] || Static453.anIntArray518[local21] >= arg0.anIntArray188[3]) && (Static303.anIntArray359[local21] <= arg0.anIntArray188[0] || arg0.anIntArray188[1] >= Static303.anIntArray359[local21] || Static303.anIntArray359[local21] <= arg0.anIntArray188[2] || arg0.anIntArray188[3] >= Static303.anIntArray359[local21]) && (Static167.anIntArray214[local21] >= arg0.anIntArray187[0] || arg0.anIntArray187[1] <= Static167.anIntArray214[local21] || arg0.anIntArray187[2] <= Static167.anIntArray214[local21] || arg0.anIntArray187[3] <= Static167.anIntArray214[local21]) && (Static485.anIntArray542[local21] <= arg0.anIntArray187[0] || Static485.anIntArray542[local21] <= arg0.anIntArray187[1] || arg0.anIntArray187[2] >= Static485.anIntArray542[local21] || arg0.anIntArray187[3] >= Static485.anIntArray542[local21])) {
					return;
				}
			}
		}
		@Pc(273) int local273;
		@Pc(296) int local296;
		@Pc(310) boolean local310;
		@Pc(342) float local342;
		if (arg0.aByte38 == 1) {
			local21 = Static157.anInt3831 + arg0.aShort27 - Static607.anInt10024;
			if (local21 >= 0 && local21 <= Static157.anInt3831 + Static157.anInt3831) {
				local273 = arg0.aShort30 + Static157.anInt3831 - Static23.anInt369;
				if (local273 < 0) {
					local273 = 0;
				} else if (Static157.anInt3831 + Static157.anInt3831 < local273) {
					return;
				}
				local296 = Static157.anInt3831 + arg0.aShort29 - Static23.anInt369;
				if (local296 > Static157.anInt3831 + Static157.anInt3831) {
					local296 = Static157.anInt3831 + Static157.anInt3831;
				} else if (local296 < 0) {
					return;
				}
				local310 = false;
				while (local273 <= local296) {
					if (Static622.aBooleanArrayArray11[local21][local273++]) {
						local310 = true;
						break;
					}
				}
				if (local310) {
					local342 = Static452.anInt8205 - arg0.anIntArray188[0];
					if (local342 < 0.0F) {
						local342 *= -1.0F;
					}
					if (!local342 < (float) Static625.anInt10332 && (Static415.method6510(0, arg0) && (Static415.method6510(1, arg0) && (Static415.method6510(2, arg0) && Static415.method6510(3, arg0))))) {
						Static14.aClass92Array16[Static476.anInt9172++] = arg0;
					}
				}
			}
		} else if (arg0.aByte38 == 2) {
			local21 = Static157.anInt3831 + arg0.aShort30 - Static23.anInt369;
			if (local21 >= 0 && local21 <= Static157.anInt3831 + Static157.anInt3831) {
				local273 = arg0.aShort27 + Static157.anInt3831 - Static607.anInt10024;
				if (local273 < 0) {
					local273 = 0;
				} else if (local273 > Static157.anInt3831 + Static157.anInt3831) {
					return;
				}
				local296 = Static157.anInt3831 + arg0.aShort28 - Static607.anInt10024;
				if (Static157.anInt3831 + Static157.anInt3831 < local296) {
					local296 = Static157.anInt3831 + Static157.anInt3831;
				} else if (local296 < 0) {
					return;
				}
				local310 = false;
				while (local273 <= local296) {
					if (Static622.aBooleanArrayArray11[local273++][local21]) {
						local310 = true;
						break;
					}
				}
				if (local310) {
					local342 = Static576.anInt9705 - arg0.anIntArray187[0];
					if (local342 < 0.0F) {
						local342 *= -1.0F;
					}
					if (!(local342 < (float) Static625.anInt10332) && (Static415.method6510(0, arg0) && (Static415.method6510(1, arg0) && (Static415.method6510(2, arg0) && Static415.method6510(3, arg0))))) {
						Static14.aClass92Array16[Static476.anInt9172++] = arg0;
					}
				}
			}
		} else if (arg0.aByte38 == 16 || arg0.aByte38 == 8) {
			local21 = Static157.anInt3831 + arg0.aShort27 - Static607.anInt10024;
			if (local21 >= 0 && Static157.anInt3831 + Static157.anInt3831 >= local21) {
				local273 = arg0.aShort30 + Static157.anInt3831 - Static23.anInt369;
				if (local273 >= 0 && Static157.anInt3831 + Static157.anInt3831 >= local273 && Static622.aBooleanArrayArray11[local21][local273]) {
					@Pc(602) float local602 = (float) (Static452.anInt8205 - arg0.anIntArray188[0]);
					if (local602 < 0.0F) {
						local602 *= -1.0F;
					}
					@Pc(619) float local619 = (float) (Static576.anInt9705 - arg0.anIntArray187[0]);
					if (local619 < 0.0F) {
						local619 *= -1.0F;
					}
					if ((!((float) Static625.anInt10332 > local602) || !((float) Static625.anInt10332 > local619)) && (Static415.method6510(0, arg0) && (Static415.method6510(1, arg0) && (Static415.method6510(2, arg0) && Static415.method6510(3, arg0))))) {
						Static14.aClass92Array16[Static476.anInt9172++] = arg0;
					}
				}
			}
		} else if (arg0.aByte38 == 4) {
			@Pc(684) float local684 = (float) (arg0.anIntArray189[0] - Static614.anInt10173);
			if (!(local684 <= (float) Static200.anInt4652)) {
				local273 = arg0.aShort30 + Static157.anInt3831 - Static23.anInt369;
				if (local273 < 0) {
					local273 = 0;
				} else if (Static157.anInt3831 + Static157.anInt3831 < local273) {
					return;
				}
				local296 = arg0.aShort29 + Static157.anInt3831 - Static23.anInt369;
				if (local296 > Static157.anInt3831 + Static157.anInt3831) {
					local296 = Static157.anInt3831 + Static157.anInt3831;
				} else if (local296 < 0) {
					return;
				}
				@Pc(747) int local747 = arg0.aShort27 + Static157.anInt3831 - Static607.anInt10024;
				if (local747 < 0) {
					local747 = 0;
				} else if (local747 > Static157.anInt3831 + Static157.anInt3831) {
					return;
				}
				@Pc(770) int local770 = arg0.aShort28 + Static157.anInt3831 - Static607.anInt10024;
				if (local770 > Static157.anInt3831 + Static157.anInt3831) {
					local770 = Static157.anInt3831 + Static157.anInt3831;
				} else if (local770 < 0) {
					return;
				}
				@Pc(791) boolean local791 = false;
				label283: for (@Pc(793) int local793 = local747; local793 <= local770; local793++) {
					for (@Pc(797) int local797 = local273; local797 <= local296; local797++) {
						if (Static622.aBooleanArrayArray11[local793][local797]) {
							local791 = true;
							break label283;
						}
					}
				}
				if (local791 && (Static415.method6510(0, arg0) && (Static415.method6510(1, arg0) && (Static415.method6510(2, arg0) && Static415.method6510(3, arg0))))) {
					Static14.aClass92Array16[Static476.anInt9172++] = arg0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(I[[I)V")
	public static void method3688(@OriginalArg(1) int[][] arg0) {
		Static104.anIntArrayArray24 = arg0;
	}

	@OriginalMember(owner = "client!gh", name = "b", descriptor = "(BII)Z")
	public static boolean method3689(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static523.method7473(arg0, arg1) || Static289.method4998(arg1, arg0);
	}
}
