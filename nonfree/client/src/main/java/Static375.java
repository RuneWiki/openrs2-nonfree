import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static375 {

	@OriginalMember(owner = "client!sv", name = "b", descriptor = "Lclient!ho;")
	public static final Class98 aClass98_17 = new Class98(12, 0, 1, 0);

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(I)V")
	public static void method4999() {
		if (!Static12.aBoolean18) {
			return;
		}
		while (true) {
			while (Static168.anInt3258 < Static392.aClass78_Sub1Array1.length) {
				@Pc(30) Class78_Sub1 local30 = Static392.aClass78_Sub1Array1[Static168.anInt3258];
				if (local30 != null && local30.anInt3887 == -1) {
					if (Static7.aClass4_Sub42_3 == null) {
						Static7.aClass4_Sub42_3 = Static402.aClass256_1.method5479(local30.aString38);
					}
					@Pc(53) int local53 = Static7.aClass4_Sub42_3.anInt6883;
					if (local53 == -1) {
						return;
					}
					Static168.anInt3258++;
					Static7.aClass4_Sub42_3 = null;
					local30.anInt3887 = local53;
				} else {
					Static168.anInt3258++;
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "([I[ILclient!lh;I[I)V")
	public static void method5000(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) Class16_Sub1_Sub5_Sub1 arg2, @OriginalArg(4) int[] arg3) {
		for (@Pc(8) int local8 = 0; local8 < arg3.length; local8++) {
			@Pc(14) int local14 = arg3[local8];
			@Pc(18) int local18 = arg0[local8];
			@Pc(22) int local22 = arg1[local8];
			@Pc(24) int local24 = 0;
			while (local18 != 0 && local24 < arg2.aClass165Array3.length) {
				if ((local18 & 0x1) != 0) {
					if (local14 == -1) {
						arg2.aClass165Array3[local24] = null;
					} else {
						@Pc(48) Class138 local48 = Static182.aClass55_1.method1397(local14);
						@Pc(51) int local51 = local48.anInt4406;
						@Pc(56) Class165 local56 = arg2.aClass165Array3[local24];
						if (local56 != null) {
							if (local56.anInt5139 == local14) {
								if (local51 == 0) {
									local56 = arg2.aClass165Array3[local24] = null;
								} else if (local51 == 1) {
									local56.anInt5138 = 0;
									local56.anInt5142 = 0;
									local56.anInt5140 = 1;
									local56.anInt5143 = 0;
									local56.anInt5141 = local22;
									Static15.method156(arg2.anInt6893, 0, arg2.aByte82, arg2.anInt6892, local48, arg2 == Static1.aClass16_Sub1_Sub5_Sub1_1);
								} else if (local51 == 2) {
									local56.anInt5143 = 0;
								}
							} else if (local48.anInt4413 >= Static182.aClass55_1.method1397(local56.anInt5139).anInt4413) {
								local56 = arg2.aClass165Array3[local24] = null;
							}
						}
						if (local56 == null) {
							local56 = arg2.aClass165Array3[local24] = new Class165();
							local56.anInt5138 = 0;
							local56.anInt5143 = 0;
							local56.anInt5139 = local14;
							local56.anInt5142 = 0;
							local56.anInt5140 = 1;
							local56.anInt5141 = local22;
							Static15.method156(arg2.anInt6893, 0, arg2.aByte82, arg2.anInt6892, local48, arg2 == Static1.aClass16_Sub1_Sub5_Sub1_1);
						}
					}
				}
				local24++;
				local18 >>>= 0x1;
			}
		}
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(IIIIII)V")
	public static void method5001(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg3 > Static168.anInt3256 || arg1 < Static376.anInt6287) {
			return;
		}
		@Pc(16) boolean local16;
		if (Static354.anInt6186 > arg4) {
			local16 = false;
			arg4 = Static354.anInt6186;
		} else if (arg4 > Static208.anInt2656) {
			arg4 = Static208.anInt2656;
			local16 = false;
		} else {
			local16 = true;
		}
		@Pc(38) boolean local38;
		if (arg0 < Static354.anInt6186) {
			arg0 = Static354.anInt6186;
			local38 = false;
		} else if (Static208.anInt2656 < arg0) {
			arg0 = Static208.anInt2656;
			local38 = false;
		} else {
			local38 = true;
		}
		if (Static376.anInt6287 > arg3) {
			arg3 = Static376.anInt6287;
		} else {
			Static251.method3640(arg4, arg2, arg0, Static96.anIntArrayArray21[arg3++]);
		}
		if (arg1 > Static168.anInt3256) {
			arg1 = Static168.anInt3256;
		} else {
			Static251.method3640(arg4, arg2, arg0, Static96.anIntArrayArray21[arg1--]);
		}
		@Pc(97) int local97;
		if (local16 && local38) {
			for (local97 = arg3; local97 <= arg1; local97++) {
				@Pc(103) int[] local103 = Static96.anIntArrayArray21[local97];
				local103[arg4] = local103[arg0] = arg2;
			}
		} else if (local16) {
			for (local97 = arg3; local97 <= arg1; local97++) {
				Static96.anIntArrayArray21[local97][arg4] = arg2;
			}
		} else if (local38) {
			for (local97 = arg3; local97 <= arg1; local97++) {
				Static96.anIntArrayArray21[local97][arg0] = arg2;
			}
		}
	}
}
