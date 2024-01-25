import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static137 {

	@OriginalMember(owner = "client!ed", name = "i", descriptor = "Lclient!up;")
	public static Class375 aClass375_1;

	@OriginalMember(owner = "client!ed", name = "b", descriptor = "I")
	public static int anInt2537;

	@OriginalMember(owner = "client!ed", name = "g", descriptor = "I")
	public static int anInt2539;

	@OriginalMember(owner = "client!ed", name = "c", descriptor = "I")
	public static int anInt2533 = -1;

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lclient!qfa;Z)Z")
	public static boolean method2240(@OriginalArg(0) Class19_Sub1_Sub3 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(7) boolean local7 = Static639.aClass313Array2 == Static711.aClass313Array3;
		@Pc(9) int local9 = 0;
		@Pc(11) short local11 = 0;
		@Pc(13) byte local13 = 0;
		arg0.method8182();
		if (arg0.aShort121 < 0 || arg0.aShort124 < 0 || arg0.aShort123 >= Static509.anInt8656 || arg0.aShort122 >= Static164.anInt3059) {
			return false;
		}
		@Pc(41) short local41 = 0;
		@Pc(48) int local48;
		for (@Pc(44) int local44 = arg0.aShort121; local44 <= arg0.aShort123; local44++) {
			for (local48 = arg0.aShort124; local48 <= arg0.aShort122; local48++) {
				@Pc(55) Class262 local55 = Static512.method7319(arg0.aByte146, local44, local48);
				if (local55 != null) {
					@Pc(61) Class343 local61 = Static263.method4075(arg0);
					@Pc(64) Class343 local64 = local55.aClass343_2;
					if (local64 == null) {
						local55.aClass343_2 = local61;
					} else {
						while (local64.aClass343_4 != null) {
							local64 = local64.aClass343_4;
						}
						local64.aClass343_4 = local61;
					}
					if (local7 && (Static283.anIntArrayArray26[local44][local48] & 0xFF000000) != 0) {
						local9 = Static283.anIntArrayArray26[local44][local48];
						local11 = Static235.aShortArrayArray2[local44][local48];
						local13 = Static242.aByteArrayArray6[local44][local48];
					}
					if (!arg1 && local55.aClass19_Sub1_Sub5_1 != null && local55.aClass19_Sub1_Sub5_1.aShort128 > local41) {
						local41 = local55.aClass19_Sub1_Sub5_1.aShort128;
					}
				}
			}
		}
		if (local7 && (local9 & 0xFF000000) != 0) {
			for (local48 = arg0.aShort121; local48 <= arg0.aShort123; local48++) {
				for (@Pc(159) int local159 = arg0.aShort124; local159 <= arg0.aShort122; local159++) {
					if ((Static283.anIntArrayArray26[local48][local159] & 0xFF000000) == 0) {
						Static283.anIntArrayArray26[local48][local159] = local9;
						Static235.aShortArrayArray2[local48][local159] = local11;
						Static242.aByteArrayArray6[local48][local159] = local13;
					}
				}
			}
		}
		if (arg1) {
			Static339.aClass19_Sub1_Sub3Array1[Static612.anInt9915++] = arg0;
		} else {
			local48 = Static639.aClass313Array2 == Static711.aClass313Array3 ? 1 : 0;
			if (!arg0.method9366()) {
				arg0.aClass19_Sub1_25 = Static634.aClass19_Sub1Array4[local48];
				Static634.aClass19_Sub1Array4[local48] = arg0;
			} else if (arg0.method9360()) {
				arg0.aClass19_Sub1_25 = Static358.aClass19_Sub1Array2[local48];
				Static358.aClass19_Sub1Array2[local48] = arg0;
			} else {
				arg0.aClass19_Sub1_25 = Static660.aClass19_Sub1Array5[local48];
				Static660.aClass19_Sub1Array5[local48] = arg0;
				Static70.aBoolean89 = true;
			}
		}
		if (arg1) {
			arg0.anInt11208 -= local41;
		}
		return true;
	}

	@OriginalMember(owner = "client!ed", name = "c", descriptor = "(I)Z")
	public static boolean method2243() {
		if (Static178.anInt3225 == 3) {
			return Static319.anInt10907 == 0 && Static556.anInt9262 == 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lclient!rba;I)Lclient!mj;")
	public static Class130_Sub1 method2245(@OriginalArg(0) Class3_Sub28 arg0) {
		return new Class130_Sub1(arg0.method5281(), arg0.method5281(), arg0.method5281(), arg0.method5281(), arg0.method5281(), arg0.method5281(), arg0.method5281(), arg0.method5281(), arg0.method5307(), arg0.method5322(-75));
	}
}
