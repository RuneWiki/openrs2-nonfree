import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static30 {

	@OriginalMember(owner = "client!baa", name = "h", descriptor = "I")
	public static int anInt607;

	@OriginalMember(owner = "client!baa", name = "i", descriptor = "F")
	public static float aFloat8;

	@OriginalMember(owner = "client!baa", name = "m", descriptor = "Lclient!aha;")
	public static Class15_Sub1 aClass15_Sub1_1;

	@OriginalMember(owner = "client!baa", name = "n", descriptor = "J")
	public static long aLong19;

	@OriginalMember(owner = "client!baa", name = "b", descriptor = "(I)Z")
	public static boolean method608() {
		try {
			if (Static571.anInt9391 == 2) {
				if (Static388.aClass5_Sub45_2 == null) {
					Static388.aClass5_Sub45_2 = Static658.method8039(Static166.aClass384_43, Static474.anInt7949, Static198.anInt3546);
					if (Static388.aClass5_Sub45_2 == null) {
						return false;
					}
				}
				if (Static80.aClass173_1 == null) {
					Static80.aClass173_1 = new Class173(Static276.aClass384_126, Static186.aClass384_47);
				}
				@Pc(29) Class5_Sub16_Sub1 local29 = Static275.aClass5_Sub16_Sub1_5;
				if (Static583.aClass5_Sub16_Sub1_6 != null) {
					local29 = Static583.aClass5_Sub16_Sub1_6;
				}
				if (local29.method2587(Static388.aClass5_Sub45_2, Static80.aClass173_1, Static79.aClass384_111)) {
					Static275.aClass5_Sub16_Sub1_5 = local29;
					Static275.aClass5_Sub16_Sub1_5.method2584();
					@Pc(59) int local59;
					if (Static598.anInt9770 <= 0) {
						Static571.anInt9391 = 0;
						Static275.aClass5_Sub16_Sub1_5.method2567(Static210.anInt3640);
						for (local59 = 0; local59 < Static68.anIntArray95.length; local59++) {
							Static275.aClass5_Sub16_Sub1_5.method2576(local59, Static68.anIntArray95[local59]);
							Static68.anIntArray95[local59] = 255;
						}
					} else {
						Static571.anInt9391 = 3;
						Static275.aClass5_Sub16_Sub1_5.method2567(Static210.anInt3640 >= Static598.anInt9770 ? Static598.anInt9770 : Static210.anInt3640);
						for (local59 = 0; local59 < Static68.anIntArray95.length; local59++) {
							Static275.aClass5_Sub16_Sub1_5.method2576(local59, Static68.anIntArray95[local59]);
							Static68.anIntArray95[local59] = 255;
						}
					}
					if (Static583.aClass5_Sub16_Sub1_6 == null) {
						if (aLong19 <= 0L) {
							Static275.aClass5_Sub16_Sub1_5.method2570(Static388.aClass5_Sub45_2, Static617.aBoolean818);
						} else {
							Static275.aClass5_Sub16_Sub1_5.method2580(Static617.aBoolean818, Static388.aClass5_Sub45_2, aLong19);
						}
					}
					if (Static477.aClass63_3 != null) {
						Static477.aClass63_3.method3498(Static275.aClass5_Sub16_Sub1_5);
					}
					Static388.aClass5_Sub45_2 = null;
					aLong19 = 0L;
					Static583.aClass5_Sub16_Sub1_6 = null;
					Static166.aClass384_43 = null;
					Static80.aClass173_1 = null;
					return true;
				}
			}
		} catch (@Pc(165) Exception local165) {
			local165.printStackTrace();
			Static275.aClass5_Sub16_Sub1_5.method2574();
			Static388.aClass5_Sub45_2 = null;
			Static571.anInt9391 = 0;
			Static80.aClass173_1 = null;
			Static583.aClass5_Sub16_Sub1_6 = null;
			Static166.aClass384_43 = null;
		}
		return false;
	}

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "(IIII)I")
	public static int method611(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 == arg0) {
			return arg0;
		}
		@Pc(17) int local17 = 128 - arg1;
		@Pc(31) int local31 = arg1 * (arg2 & 0x7F) + local17 * (arg0 & 0x7F) >> 7;
		@Pc(46) int local46 = local17 * (arg0 & 0x380) + (arg2 & 0x380) * arg1 >> 7;
		@Pc(61) int local61 = local17 * (arg0 & 0xFC00) + (arg2 & 0xFC00) * arg1 >> 7;
		return local31 & 0x7F | local46 & 0x380 | local61 & 0xFC00;
	}
}
