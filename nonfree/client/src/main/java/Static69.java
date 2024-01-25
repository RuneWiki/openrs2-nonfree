import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static69 {

	@OriginalMember(owner = "client!cd", name = "F", descriptor = "F")
	public static float aFloat12;

	@OriginalMember(owner = "client!cd", name = "K", descriptor = "I")
	public static int anInt1350 = -1;

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "(II)Lclient!mha;")
	public static Class234_Sub1 method1289(@OriginalArg(1) int arg0) {
		return Static302.aBoolean414 && Static401.anInt7422 <= arg0 && Static585.anInt10166 >= arg0 ? Static4.aClass234_Sub1Array1[arg0 - Static401.anInt7422] : null;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(BLclient!ol;)Lclient!wca;")
	public static Class384 method1290(@OriginalArg(1) Class2_Sub8 arg0) {
		@Pc(12) int local12 = arg0.method5172();
		return new Class384(local12);
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lclient!km;Z)Z")
	public static boolean method1291(@OriginalArg(0) Class15_Sub3_Sub3 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(6) boolean local6 = Static245.aClass18Array14 == Static93.aClass18Array33;
		@Pc(8) int local8 = 0;
		@Pc(10) short local10 = 0;
		@Pc(12) byte local12 = 0;
		arg0.method5328();
		if (arg0.aShort62 < 0 || arg0.aShort64 < 0 || arg0.aShort63 >= Static585.anInt10170 || arg0.aShort65 >= Static202.anInt4238) {
			return false;
		}
		@Pc(33) short local33 = 0;
		@Pc(40) int local40;
		for (@Pc(36) int local36 = arg0.aShort62; local36 <= arg0.aShort63; local36++) {
			for (local40 = arg0.aShort64; local40 <= arg0.aShort65; local40++) {
				@Pc(47) Class291 local47 = Static654.method9606(arg0.aByte142, local36, local40);
				if (local47 != null) {
					@Pc(53) Class27 local53 = Static603.method9045(arg0);
					@Pc(56) Class27 local56 = local47.aClass27_3;
					if (local56 == null) {
						local47.aClass27_3 = local53;
					} else {
						while (local56.aClass27_1 != null) {
							local56 = local56.aClass27_1;
						}
						local56.aClass27_1 = local53;
					}
					if (local6 && (Static503.anIntArrayArray38[local36][local40] & 0xFF000000) != 0) {
						local8 = Static503.anIntArrayArray38[local36][local40];
						local10 = Static141.aShortArrayArray7[local36][local40];
						local12 = Static669.aByteArrayArray27[local36][local40];
					}
					if (!arg1 && local47.aClass15_Sub3_Sub5_1 != null && local47.aClass15_Sub3_Sub5_1.aShort74 > local33) {
						local33 = local47.aClass15_Sub3_Sub5_1.aShort74;
					}
				}
			}
		}
		if (local6 && (local8 & 0xFF000000) != 0) {
			for (local40 = arg0.aShort62; local40 <= arg0.aShort63; local40++) {
				for (@Pc(136) int local136 = arg0.aShort64; local136 <= arg0.aShort65; local136++) {
					if ((Static503.anIntArrayArray38[local40][local136] & 0xFF000000) == 0) {
						Static503.anIntArrayArray38[local40][local136] = local8;
						Static141.aShortArrayArray7[local40][local136] = local10;
						Static669.aByteArrayArray27[local40][local136] = local12;
					}
				}
			}
		}
		if (arg1) {
			Static212.aClass15_Sub3_Sub3Array1[Static533.anInt9353++] = arg0;
		} else {
			local40 = Static245.aClass18Array14 == Static93.aClass18Array33 ? 1 : 0;
			if (!arg0.method9425()) {
				arg0.aClass15_Sub3_23 = Static98.aClass15_Sub3Array2[local40];
				Static98.aClass15_Sub3Array2[local40] = arg0;
			} else if (arg0.method9434()) {
				arg0.aClass15_Sub3_23 = Static440.aClass15_Sub3Array4[local40];
				Static440.aClass15_Sub3Array4[local40] = arg0;
			} else {
				arg0.aClass15_Sub3_23 = Static603.aClass15_Sub3Array5[local40];
				Static603.aClass15_Sub3Array5[local40] = arg0;
				Static207.aBoolean327 = true;
			}
		}
		if (arg1) {
			arg0.anInt11029 -= local33;
		}
		return true;
	}

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "(IBI)Z")
	public static boolean method1292(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x84080) != 0;
	}
}
