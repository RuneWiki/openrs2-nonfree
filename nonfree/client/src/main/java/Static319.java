import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static319 {

	@OriginalMember(owner = "client!mda", name = "w", descriptor = "I")
	public static int anInt6594;

	@OriginalMember(owner = "client!mda", name = "b", descriptor = "Lclient!ki;")
	public static final Class183 aClass183_40 = new Class183();

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "(Lclient!mca;Z)Z")
	public static boolean method5520(@OriginalArg(0) Class2_Sub2 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(6) boolean local6 = Static224.aClass4Array3 == Static495.aClass4Array4;
		@Pc(8) int local8 = 0;
		@Pc(10) short local10 = 0;
		@Pc(12) byte local12 = 0;
		arg0.method7630();
		if (arg0.aShort120 < 0 || arg0.aShort122 < 0 || arg0.aShort121 >= Static223.anInt4520 || arg0.aShort123 >= Static416.anInt10065) {
			return false;
		}
		@Pc(33) short local33 = 0;
		@Pc(40) int local40;
		for (@Pc(36) int local36 = arg0.aShort120; local36 <= arg0.aShort121; local36++) {
			for (local40 = arg0.aShort122; local40 <= arg0.aShort123; local40++) {
				@Pc(47) Class125 local47 = Static188.method3288(arg0.aByte103, local36, local40);
				if (local47 != null) {
					@Pc(51) int local51 = 0;
					if (local36 > arg0.aShort120) {
						local51++;
					}
					if (local36 < arg0.aShort121) {
						local51 += 4;
					}
					if (local40 > arg0.aShort122) {
						local51 += 8;
					}
					if (local40 < arg0.aShort123) {
						local51 += 2;
					}
					@Pc(76) Class302 local76 = Static204.method3396(arg0, local51);
					@Pc(79) Class302 local79 = local47.aClass302_1;
					if (local79 == null) {
						local47.aClass302_1 = local76;
					} else {
						while (local79.aClass302_2 != null) {
							local79 = local79.aClass302_2;
						}
						local79.aClass302_2 = local76;
					}
					local47.aByte33 = (byte) (local47.aByte33 | local51);
					if (local6 && (Static343.anIntArrayArray58[local36][local40] & 0xFF000000) != 0) {
						local8 = Static343.anIntArrayArray58[local36][local40];
						local10 = Static171.aShortArrayArray6[local36][local40];
						local12 = Static67.aByteArrayArray32[local36][local40];
					}
					if (local47.aClass2_Sub1_1 != null && local47.aClass2_Sub1_1.aShort128 > local33) {
						local33 = local47.aClass2_Sub1_1.aShort128;
					}
				}
			}
		}
		if (local6 && (local8 & 0xFF000000) != 0) {
			for (local40 = arg0.aShort120; local40 <= arg0.aShort121; local40++) {
				for (@Pc(164) int local164 = arg0.aShort122; local164 <= arg0.aShort123; local164++) {
					if ((Static343.anIntArrayArray58[local40][local164] & 0xFF000000) == 0) {
						Static343.anIntArrayArray58[local40][local164] = local8;
						Static171.aShortArrayArray6[local40][local164] = local10;
						Static67.aByteArrayArray32[local40][local164] = local12;
					}
				}
			}
		}
		if (arg1) {
			Static377.aClass2_Sub2Array2[Static7.anInt303++] = arg0;
		}
		if (arg1) {
			arg0.anInt9400 -= local33;
		}
		return true;
	}
}
