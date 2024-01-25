import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static197 {

	@OriginalMember(owner = "client!mk", name = "d", descriptor = "I")
	public static int anInt4049;

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "Z")
	public static boolean aBoolean231 = false;

	@OriginalMember(owner = "client!mk", name = "i", descriptor = "I")
	public static int anInt4053 = 0;

	@OriginalMember(owner = "client!mk", name = "j", descriptor = "I")
	public static int anInt4054 = 2;

	@OriginalMember(owner = "client!mk", name = "m", descriptor = "Ljava/lang/String;")
	public static String aString153 = "Loading...";

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(Z)V")
	public static void method3454(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			Static256.aClass45ArrayArrayArray2 = Static321.aClass45ArrayArrayArray3;
			Static69.aClass22Array1 = Static182.aClass22Array2;
		} else {
			Static256.aClass45ArrayArrayArray2 = Static177.aClass45ArrayArrayArray1;
			Static69.aClass22Array1 = Static355.aClass22Array3;
		}
		Static131.anInt2754 = Static256.aClass45ArrayArrayArray2.length;
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(IIIII)V")
	public static void method3455(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(12) Class3_Sub43 local12 = (Class3_Sub43) Static24.aClass24_29.method609((long) arg1);
		if (local12 == null) {
			local12 = new Class3_Sub43();
			Static24.aClass24_29.method598((long) arg1, local12);
		}
		if (arg3 >= local12.anIntArray560.length) {
			@Pc(34) int[] local34 = new int[arg3 + 1];
			@Pc(39) int[] local39 = new int[arg3 + 1];
			for (@Pc(41) int local41 = 0; local41 < local12.anIntArray560.length; local41++) {
				local34[local41] = local12.anIntArray560[local41];
				local39[local41] = local12.anIntArray559[local41];
			}
			for (@Pc(67) int local67 = local12.anIntArray560.length; local67 < arg3; local67++) {
				local34[local67] = -1;
				local39[local67] = 0;
			}
			local12.anIntArray559 = local39;
			local12.anIntArray560 = local34;
		}
		local12.anIntArray560[arg3] = arg2;
		local12.anIntArray559[arg3] = arg0;
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(III)V")
	public static void method3456(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class3_Sub7_Sub11 local8 = Static116.method2029(arg1, 13);
		local8.method2509();
		local8.anInt3054 = arg0;
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(Lclient!tj;IIIII)V")
	public static void method3458(@OriginalArg(0) Class122 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		arg0.method4768(arg3, arg1, arg4 + arg3, arg1 + arg2);
		arg0.method4801(arg2, arg3, arg1, arg4, -16777216);
		if (Static134.anInt2769 < 100) {
			return;
		}
		@Pc(33) float local33 = (float) Static193.anInt2345 / (float) Static193.anInt2347;
		@Pc(35) int local35 = arg4;
		@Pc(37) int local37 = arg2;
		if (local33 < 1.0F) {
			local37 = (int) (local33 * (float) arg4);
		} else {
			local35 = (int) ((float) arg2 / local33);
		}
		@Pc(64) int local64 = arg3 + (arg4 - local35) / 2;
		@Pc(73) int local73 = arg1 + (arg2 - local37) / 2;
		if (Static72.aClass57_6 == null || Static72.aClass57_6.method5440() != arg4 || Static72.aClass57_6.method5447() != arg2) {
			Static193.method1927(Static193.anInt2349, Static193.anInt2345 + Static193.anInt2354, Static193.anInt2349 - -Static193.anInt2347, Static193.anInt2354, local64, local73, local35 + local64, local73 - -local37);
			Static193.method1915(arg0);
			Static72.aClass57_6 = arg0.method4731(local64, local73, local35, local37, false);
		}
		Static72.aClass57_6.method5448(local64, local73);
		@Pc(122) int local122 = Static12.anInt312 * local35 / Static193.anInt2347;
		@Pc(128) int local128 = local37 * Static20.anInt547 / Static193.anInt2345;
		@Pc(145) int local145 = local64 + local35 * Static78.anInt1560 / Static193.anInt2347;
		@Pc(159) int local159 = local73 + local37 - Static240.anInt4810 * local37 / Static193.anInt2345 - local128;
		@Pc(161) int local161 = -1996554240;
		if (Static309.anInt6133 == 1) {
			local161 = -1996488705;
		}
		arg0.method4732(local145, local159, local122, local128, local161, 1);
		arg0.method4728(local145, local159, local122, local128, local161, 0);
		if (Static13.anInt346 <= 0) {
			return;
		}
		@Pc(194) int local194;
		if (Static277.anInt5533 <= 50) {
			local194 = Static277.anInt5533 * 5;
		} else {
			local194 = 500 - Static277.anInt5533 * 5;
		}
		for (@Pc(208) Class3_Sub5 local208 = (Class3_Sub5) Static193.aClass127_11.method3402(); local208 != null; local208 = (Class3_Sub5) Static193.aClass127_11.method3400()) {
			@Pc(217) Class211 local217 = Static136.method2268(local208.anInt544);
			if (Static22.method433(local217)) {
				@Pc(234) int local234;
				@Pc(246) int local246;
				if (Static276.anInt5510 == local208.anInt544) {
					local234 = local35 * local208.anInt545 / Static193.anInt2347 + local64;
					local246 = local73 + (Static193.anInt2345 - local208.anInt548) * local37 / Static193.anInt2345;
					arg0.method4801(4, local234 - 2, local246 - 2, 4, local194 << 24 | 0xFFFF00);
				} else if (Static309.anInt6134 != -1 && Static309.anInt6134 == local217.anInt6589) {
					local234 = local35 * local208.anInt545 / Static193.anInt2347 + local64;
					local246 = local73 + (Static193.anInt2345 - local208.anInt548) * local37 / Static193.anInt2345;
					arg0.method4801(4, local234 - 2, local246 + -2, 4, local194 << 24 | 0xFFFF00);
				}
			}
		}
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "([Lclient!sj;ZI)V")
	public static void method3459(@OriginalArg(0) Class181[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0.length; local3++) {
			@Pc(9) Class181 local9 = arg0[local3];
			if (local9 != null && local9.anInt5734 == arg1 && (!local9.aBoolean381 || !Static47.method818(local9))) {
				if (local9.anInt5715 == 0) {
					if (!local9.aBoolean381 && Static47.method818(local9) && local9 != Static118.aClass181_22) {
						continue;
					}
					method3459(arg0, local9.anInt5761);
					if (local9.aClass181Array2 != null) {
						method3459(local9.aClass181Array2, local9.anInt5761);
					}
					@Pc(59) Class3_Sub32 local59 = (Class3_Sub32) Static188.aClass24_21.method609((long) local9.anInt5761);
					if (local59 != null) {
						Static350.method5694(local59.anInt4348);
					}
				}
				if (local9.anInt5715 == 6) {
					@Pc(89) int local89;
					if (local9.anInt5741 != -1 || local9.anInt5776 != -1) {
						@Pc(84) boolean local84 = Static203.method3545(local9);
						if (local84) {
							local89 = local9.anInt5776;
						} else {
							local89 = local9.anInt5741;
						}
						if (local89 != -1) {
							@Pc(101) Class131 local101 = Static343.method5604(local89);
							if (local101 != null) {
								local9.anInt5774 += Static347.anInt6759;
								while (local101.anIntArray337[local9.anInt5754] < local9.anInt5774) {
									local9.anInt5774 -= local101.anIntArray337[local9.anInt5754];
									local9.anInt5754++;
									if (local9.anInt5754 >= local101.anIntArray335.length) {
										local9.anInt5754 -= local101.anInt3989;
										if (local9.anInt5754 < 0 || local9.anInt5754 >= local101.anIntArray335.length) {
											local9.anInt5754 = 0;
										}
									}
									local9.anInt5744 = local9.anInt5754 + 1;
									if (local101.anIntArray335.length <= local9.anInt5744) {
										local9.anInt5744 -= local101.anInt3989;
										if (local9.anInt5744 < 0 || local101.anIntArray335.length <= local9.anInt5744) {
											local9.anInt5744 = -1;
										}
									}
									Static316.method5250(local9);
								}
							}
						}
					}
					if (local9.anInt5752 != 0 && !local9.aBoolean381) {
						@Pc(217) int local217 = local9.anInt5752 >> 16;
						@Pc(221) int local221 = local217 * Static347.anInt6759;
						local89 = local9.anInt5752 << 16 >> 16;
						local9.anInt5745 = local221 + local9.anInt5745 & 0x3FFF;
						local89 *= Static347.anInt6759;
						local9.anInt5712 = local89 + local9.anInt5712 & 0x3FFF;
						Static316.method5250(local9);
					}
				}
			}
		}
	}
}
