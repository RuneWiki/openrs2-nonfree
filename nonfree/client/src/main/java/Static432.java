import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static432 {

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "F")
	public static float aFloat115;

	@OriginalMember(owner = "client!nm", name = "b", descriptor = "Lclient!rh;")
	public static final Class323 aClass323_4 = new Class323();

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(Lclient!kg;Z)Z")
	public static boolean method6282(@OriginalArg(0) Class4_Sub2_Sub1 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(7) boolean local7 = Static158.aClass133Array4 == Static685.aClass133Array5;
		@Pc(9) int local9 = 0;
		@Pc(11) short local11 = 0;
		@Pc(13) byte local13 = 0;
		arg0.method8985();
		if (arg0.aShort130 < 0 || arg0.aShort127 < 0 || arg0.aShort128 >= Static372.anInt5930 || arg0.aShort129 >= Static545.anInt8590) {
			return false;
		}
		@Pc(41) short local41 = 0;
		@Pc(48) int local48;
		for (@Pc(44) int local44 = arg0.aShort130; local44 <= arg0.aShort128; local44++) {
			for (local48 = arg0.aShort127; local48 <= arg0.aShort129; local48++) {
				@Pc(55) Class311 local55 = Static582.method8090(arg0.aByte133, local44, local48);
				if (local55 != null) {
					@Pc(61) Class142 local61 = Static191.method2738(arg0);
					@Pc(64) Class142 local64 = local55.aClass142_2;
					if (local64 == null) {
						local55.aClass142_2 = local61;
					} else {
						while (local64.aClass142_1 != null) {
							local64 = local64.aClass142_1;
						}
						local64.aClass142_1 = local61;
					}
					if (local7 && (Static217.anIntArrayArray28[local44][local48] & 0xFF000000) != 0) {
						local9 = Static217.anIntArrayArray28[local44][local48];
						local11 = Static651.aShortArrayArray6[local44][local48];
						local13 = Static314.aByteArrayArray9[local44][local48];
					}
					if (!arg1 && local55.aClass4_Sub2_Sub2_1 != null && local55.aClass4_Sub2_Sub2_1.aShort86 > local41) {
						local41 = local55.aClass4_Sub2_Sub2_1.aShort86;
					}
				}
			}
		}
		if (local7 && (local9 & 0xFF000000) != 0) {
			for (local48 = arg0.aShort130; local48 <= arg0.aShort128; local48++) {
				for (@Pc(159) int local159 = arg0.aShort127; local159 <= arg0.aShort129; local159++) {
					if ((Static217.anIntArrayArray28[local48][local159] & 0xFF000000) == 0) {
						Static217.anIntArrayArray28[local48][local159] = local9;
						Static651.aShortArrayArray6[local48][local159] = local11;
						Static314.aByteArrayArray9[local48][local159] = local13;
					}
				}
			}
		}
		if (arg1) {
			Static505.aClass4_Sub2_Sub1Array1[Static240.anInt10693++] = arg0;
		} else {
			local48 = Static158.aClass133Array4 == Static685.aClass133Array5 ? 1 : 0;
			if (!arg0.method8970()) {
				arg0.aClass4_Sub2_25 = Static699.aClass4_Sub2Array6[local48];
				Static699.aClass4_Sub2Array6[local48] = arg0;
			} else if (arg0.method8976()) {
				arg0.aClass4_Sub2_25 = Static161.aClass4_Sub2Array1[local48];
				Static161.aClass4_Sub2Array1[local48] = arg0;
			} else {
				arg0.aClass4_Sub2_25 = Static594.aClass4_Sub2Array5[local48];
				Static594.aClass4_Sub2Array5[local48] = arg0;
				Static415.aBoolean615 = true;
			}
		}
		if (arg1) {
			arg0.anInt10234 -= local41;
		}
		return true;
	}
}
