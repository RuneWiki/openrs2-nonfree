import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static436 {

	@OriginalMember(owner = "client!on", name = "z", descriptor = "I")
	public static int anInt6913;

	@OriginalMember(owner = "client!on", name = "A", descriptor = "[S")
	public static short[] aShortArray104;

	@OriginalMember(owner = "client!on", name = "D", descriptor = "Lclient!aca;")
	public static final Class3_Sub2 aClass3_Sub2_1 = new Class3_Sub2(0, 0);

	@OriginalMember(owner = "client!on", name = "G", descriptor = "J")
	public static long aLong220 = -1L;

	@OriginalMember(owner = "client!on", name = "H", descriptor = "I")
	public static int anInt6915 = 0;

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(Lclient!nb;Z)Z")
	public static boolean method6231(@OriginalArg(0) Class28_Sub1_Sub1 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(6) boolean local6 = Static121.aClass21Array2 == Static108.aClass21Array1;
		@Pc(8) int local8 = 0;
		@Pc(10) short local10 = 0;
		@Pc(12) byte local12 = 0;
		arg0.method9299();
		if (arg0.aShort125 < 0 || arg0.aShort123 < 0 || arg0.aShort124 >= Static146.anInt2951 || arg0.aShort122 >= Static602.anInt9668) {
			return false;
		}
		@Pc(33) short local33 = 0;
		@Pc(40) int local40;
		for (@Pc(36) int local36 = arg0.aShort125; local36 <= arg0.aShort124; local36++) {
			for (local40 = arg0.aShort123; local40 <= arg0.aShort122; local40++) {
				@Pc(47) Class164 local47 = Static408.method5789(arg0.aByte174, local36, local40);
				if (local47 != null) {
					@Pc(53) Class125 local53 = Static110.method2081(arg0);
					@Pc(56) Class125 local56 = local47.aClass125_2;
					if (local56 == null) {
						local47.aClass125_2 = local53;
					} else {
						while (local56.aClass125_1 != null) {
							local56 = local56.aClass125_1;
						}
						local56.aClass125_1 = local53;
					}
					if (local6 && (Static101.anIntArrayArray14[local36][local40] & 0xFF000000) != 0) {
						local8 = Static101.anIntArrayArray14[local36][local40];
						local10 = Static495.aShortArrayArray28[local36][local40];
						local12 = Static62.aByteArrayArray5[local36][local40];
					}
					if (!arg1 && local47.aClass28_Sub1_Sub3_1 != null && local47.aClass28_Sub1_Sub3_1.aShort92 > local33) {
						local33 = local47.aClass28_Sub1_Sub3_1.aShort92;
					}
				}
			}
		}
		if (local6 && (local8 & 0xFF000000) != 0) {
			for (local40 = arg0.aShort125; local40 <= arg0.aShort124; local40++) {
				for (@Pc(136) int local136 = arg0.aShort123; local136 <= arg0.aShort122; local136++) {
					if ((Static101.anIntArrayArray14[local40][local136] & 0xFF000000) == 0) {
						Static101.anIntArrayArray14[local40][local136] = local8;
						Static495.aShortArrayArray28[local40][local136] = local10;
						Static62.aByteArrayArray5[local40][local136] = local12;
					}
				}
			}
		}
		if (arg1) {
			Static443.aClass28_Sub1_Sub1Array1[Static77.anInt1423++] = arg0;
		} else {
			local40 = Static121.aClass21Array2 == Static108.aClass21Array1 ? 1 : 0;
			if (!arg0.method9281()) {
				arg0.aClass28_Sub1_23 = Static198.aClass28_Sub1Array37[local40];
				Static198.aClass28_Sub1Array37[local40] = arg0;
			} else if (arg0.method9287()) {
				arg0.aClass28_Sub1_23 = Static38.aClass28_Sub1Array5[local40];
				Static38.aClass28_Sub1Array5[local40] = arg0;
			} else {
				arg0.aClass28_Sub1_23 = Static539.aClass28_Sub1Array26[local40];
				Static539.aClass28_Sub1Array26[local40] = arg0;
				Static27.aBoolean42 = true;
			}
		}
		if (arg1) {
			arg0.anInt10722 -= local33;
		}
		return true;
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(II)I")
	public static int method6232(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static101.anIntArrayArray14 == null ? 0 : Static101.anIntArrayArray14[arg0][arg1] & 0xFFFFFF;
	}
}
