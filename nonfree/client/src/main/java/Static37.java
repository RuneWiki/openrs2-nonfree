import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static37 {

	@OriginalMember(owner = "client!bt", name = "g", descriptor = "I")
	public static int anInt653;

	@OriginalMember(owner = "client!bt", name = "j", descriptor = "Lclient!po;")
	public static Class196 aClass196_1;

	@OriginalMember(owner = "client!bt", name = "d", descriptor = "[I")
	public static final int[] anIntArray54 = new int[200];

	@OriginalMember(owner = "client!bt", name = "h", descriptor = "I")
	public static int anInt654 = 0;

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(Lclient!mv;Z)Z")
	public static boolean method529(@OriginalArg(0) Class26_Sub2 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(6) boolean local6 = Static244.aClass165Array8 == Static28.aClass165Array1;
		@Pc(8) int local8 = 0;
		@Pc(10) short local10 = 0;
		@Pc(12) byte local12 = 0;
		arg0.method5694();
		if (arg0.aShort105 < 0 || arg0.aShort103 < 0 || arg0.aShort104 >= Static264.anInt4480 || arg0.aShort102 >= Static295.anInt4910) {
			return false;
		}
		@Pc(38) int local38;
		for (@Pc(34) int local34 = arg0.aShort105; local34 <= arg0.aShort104; local34++) {
			for (local38 = arg0.aShort103; local38 <= arg0.aShort102; local38++) {
				@Pc(45) Class223 local45 = Static165.method2394(arg0.aByte102, local34, local38);
				if (local45 != null) {
					@Pc(49) int local49 = 0;
					if (local34 > arg0.aShort105) {
						local49++;
					}
					if (local34 < arg0.aShort104) {
						local49 += 4;
					}
					if (local38 > arg0.aShort103) {
						local49 += 8;
					}
					if (local38 < arg0.aShort102) {
						local49 += 2;
					}
					@Pc(74) Class270 local74 = Static235.method3210(arg0, local49);
					@Pc(77) Class270 local77 = local45.aClass270_1;
					if (local77 == null) {
						local45.aClass270_1 = local74;
					} else {
						while (local77.aClass270_3 != null) {
							local77 = local77.aClass270_3;
						}
						local77.aClass270_3 = local74;
					}
					local45.aByte69 = (byte) (local45.aByte69 | local49);
					if (local6 && (Static268.anIntArrayArray39[local34][local38] & 0xFF000000) != 0) {
						local8 = Static268.anIntArrayArray39[local34][local38];
						local10 = Static373.aShortArrayArray6[local34][local38];
						local12 = Static46.aByteArrayArray3[local34][local38];
					}
				}
			}
		}
		if (local6 && (local8 & 0xFF000000) != 0) {
			for (local38 = arg0.aShort105; local38 <= arg0.aShort104; local38++) {
				for (@Pc(150) int local150 = arg0.aShort103; local150 <= arg0.aShort102; local150++) {
					if ((Static268.anIntArrayArray39[local38][local150] & 0xFF000000) == 0) {
						Static268.anIntArrayArray39[local38][local150] = local8;
						Static373.aShortArrayArray6[local38][local150] = local10;
						Static46.aByteArrayArray3[local38][local150] = local12;
					}
				}
			}
		}
		if (arg1) {
			Static49.aClass26_Sub2Array1[Static135.anInt5022++] = arg0;
		}
		return true;
	}
}
