import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static209 {

	@OriginalMember(owner = "client!haa", name = "l", descriptor = "Lclient!c;")
	public static final Class51 aClass51_36 = new Class51(3, 2);

	@OriginalMember(owner = "client!haa", name = "v", descriptor = "Lclient!ho;")
	public static final Class160 aClass160_283 = new Class160(21, -1);

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(Lclient!iu;Z)Z")
	public static boolean method9481(@OriginalArg(0) Class4_Sub3_Sub3 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(7) boolean local7 = Static258.aClass159Array1 == Static346.aClass159Array2;
		@Pc(9) int local9 = 0;
		@Pc(11) short local11 = 0;
		@Pc(13) byte local13 = 0;
		arg0.method8782();
		if (arg0.aShort108 < 0 || arg0.aShort109 < 0 || arg0.aShort107 >= Static654.anInt10715 || arg0.aShort110 >= Static180.anInt2928) {
			return false;
		}
		@Pc(41) short local41 = 0;
		@Pc(48) int local48;
		for (@Pc(44) int local44 = arg0.aShort108; local44 <= arg0.aShort107; local44++) {
			for (local48 = arg0.aShort109; local48 <= arg0.aShort110; local48++) {
				@Pc(55) Class89 local55 = Static289.method4810(arg0.aByte146, local44, local48);
				if (local55 != null) {
					@Pc(61) Class58 local61 = Static159.method2263(arg0);
					@Pc(64) Class58 local64 = local55.aClass58_2;
					if (local64 == null) {
						local55.aClass58_2 = local61;
					} else {
						while (local64.aClass58_1 != null) {
							local64 = local64.aClass58_1;
						}
						local64.aClass58_1 = local61;
					}
					if (local7 && (Static200.anIntArrayArray59[local44][local48] & 0xFF000000) != 0) {
						local9 = Static200.anIntArrayArray59[local44][local48];
						local11 = Static587.aShortArrayArray4[local44][local48];
						local13 = Static690.aByteArrayArray33[local44][local48];
					}
					if (!arg1 && local55.aClass4_Sub3_Sub2_1 != null && local55.aClass4_Sub3_Sub2_1.aShort123 > local41) {
						local41 = local55.aClass4_Sub3_Sub2_1.aShort123;
					}
				}
			}
		}
		if (local7 && (local9 & 0xFF000000) != 0) {
			for (local48 = arg0.aShort108; local48 <= arg0.aShort107; local48++) {
				for (@Pc(159) int local159 = arg0.aShort109; local159 <= arg0.aShort110; local159++) {
					if ((Static200.anIntArrayArray59[local48][local159] & 0xFF000000) == 0) {
						Static200.anIntArrayArray59[local48][local159] = local9;
						Static587.aShortArrayArray4[local48][local159] = local11;
						Static690.aByteArrayArray33[local48][local159] = local13;
					}
				}
			}
		}
		if (arg1) {
			Static95.aClass4_Sub3_Sub3Array1[Static380.anInt6702++] = arg0;
		} else {
			local48 = Static258.aClass159Array1 == Static346.aClass159Array2 ? 1 : 0;
			if (!arg0.method9489()) {
				arg0.aClass4_Sub3_25 = Static170.aClass4_Sub3Array3[local48];
				Static170.aClass4_Sub3Array3[local48] = arg0;
			} else if (arg0.method9476()) {
				arg0.aClass4_Sub3_25 = Static111.aClass4_Sub3Array2[local48];
				Static111.aClass4_Sub3Array2[local48] = arg0;
			} else {
				arg0.aClass4_Sub3_25 = Static664.aClass4_Sub3Array5[local48];
				Static664.aClass4_Sub3Array5[local48] = arg0;
				Static282.aBoolean384 = true;
			}
		}
		if (arg1) {
			arg0.anInt11182 -= local41;
		}
		return true;
	}
}
