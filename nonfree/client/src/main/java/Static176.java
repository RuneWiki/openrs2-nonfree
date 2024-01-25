import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static176 {

	@OriginalMember(owner = "client!il", name = "B", descriptor = "[I")
	public static int[] anIntArray270;

	@OriginalMember(owner = "client!il", name = "C", descriptor = "[I")
	public static final int[] anIntArray271 = new int[2];

	@OriginalMember(owner = "client!il", name = "b", descriptor = "(II)I")
	public static int method2750(@OriginalArg(0) int arg0) {
		if (Static372.aClass161_6 != null) {
			Static372.aClass161_6.method3764();
			Static372.aClass161_6 = null;
		}
		Static172.anInt3165++;
		if (Static172.anInt3165 > 4) {
			Static172.anInt3165 = 0;
			Static237.anInt4241 = 0;
			return arg0;
		}
		Static237.anInt4241 = 0;
		if (Static320.anInt5611 == Static231.anInt4160) {
			Static231.anInt4160 = Static194.anInt3509;
		} else {
			Static231.anInt4160 = Static320.anInt5611;
		}
		return -1;
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(III)V")
	public static void method2751(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class211 local7 = Static268.aClass211ArrayArrayArray4[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		if (local7.aClass26_Sub3_3 != null) {
			local7.aClass26_Sub3_3 = null;
		}
		if (local7.aClass26_Sub3_2 != null) {
			local7.aClass26_Sub3_2 = null;
		}
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(Lclient!bt;Z)Z")
	public static boolean method2753(@OriginalArg(0) Class26_Sub2 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(6) boolean local6 = Static92.aClass136Array1 == Static160.aClass136Array2;
		@Pc(8) int local8 = 0;
		@Pc(10) byte local10 = 0;
		@Pc(12) byte local12 = 0;
		arg0.method5524();
		if (arg0.aShort93 < 0 || arg0.aShort94 < 0 || arg0.aShort92 >= Static377.anInt6467 || arg0.aShort95 >= Static378.anInt6480) {
			return false;
		}
		@Pc(38) int local38;
		for (@Pc(34) int local34 = arg0.aShort93; local34 <= arg0.aShort92; local34++) {
			for (local38 = arg0.aShort94; local38 <= arg0.aShort95; local38++) {
				@Pc(45) Class211 local45 = Static197.method3007(arg0.aByte95, local34, local38);
				if (local45 != null) {
					@Pc(49) int local49 = 0;
					if (local34 > arg0.aShort93) {
						local49++;
					}
					if (local34 < arg0.aShort92) {
						local49 += 4;
					}
					if (local38 > arg0.aShort94) {
						local49 += 8;
					}
					if (local38 < arg0.aShort95) {
						local49 += 2;
					}
					@Pc(74) Class125 local74 = Static366.method4341(local49, arg0);
					@Pc(77) Class125 local77 = local45.aClass125_3;
					if (local77 == null) {
						local45.aClass125_3 = local74;
					} else {
						while (local77.aClass125_1 != null) {
							local77 = local77.aClass125_1;
						}
						local77.aClass125_1 = local74;
					}
					local45.aByte74 = (byte) (local45.aByte74 | local49);
					if (local6 && (Static51.anIntArrayArray28[local34][local38] & 0xFF000000) != 0) {
						local8 = Static51.anIntArrayArray28[local34][local38];
						local10 = Static242.aByteArrayArray83[local34][local38];
						local12 = Static403.aByteArrayArray135[local34][local38];
					}
				}
			}
		}
		if (local6 && (local8 & 0xFF000000) != 0) {
			for (local38 = arg0.aShort93; local38 <= arg0.aShort92; local38++) {
				for (@Pc(150) int local150 = arg0.aShort94; local150 <= arg0.aShort95; local150++) {
					if ((Static51.anIntArrayArray28[local38][local150] & 0xFF000000) == 0) {
						Static51.anIntArrayArray28[local38][local150] = local8;
						Static242.aByteArrayArray83[local38][local150] = local10;
						Static403.aByteArrayArray135[local38][local150] = local12;
					}
				}
			}
		}
		if (arg1) {
			Static455.aClass26_Sub2Array5[Static22.anInt3913++] = arg0;
		}
		return true;
	}
}
