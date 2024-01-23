import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static193 {

	@OriginalMember(owner = "client!tc", name = "i", descriptor = "[I")
	public static int[] anIntArray712;

	@OriginalMember(owner = "client!tc", name = "b", descriptor = "Lclient!qe;")
	public static Class78 aClass78_758 = Static199.method3560("Lade Sprites )2 ");

	@OriginalMember(owner = "client!tc", name = "e", descriptor = "[Lclient!qe;")
	public static Class78[] aClass78Array34 = new Class78[200];

	@OriginalMember(owner = "client!tc", name = "g", descriptor = "I")
	public static int anInt4451 = 0;

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(B[S[Lclient!qe;)V")
	public static void method3528(@OriginalArg(1) short[] arg0, @OriginalArg(2) Class78[] arg1) {
		Static99.method1701(arg1.length - 1, arg0, arg1, 0);
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!cg;")
	public static RuntimeException_Sub1 method3529(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(12) RuntimeException_Sub1 local12;
		if (arg0 instanceof RuntimeException_Sub1) {
			local12 = (RuntimeException_Sub1) arg0;
			local12.aString1 = local12.aString1 + ' ' + arg1;
		} else {
			local12 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local12;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(III[[[BIBII)V")
	public static void method3530(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[][][] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		Static132.anInt3070++;
		Static23.anInt419 = 0;
		@Pc(9) int local9 = arg6 - 16;
		@Pc(13) int local13 = arg6 + 16;
		@Pc(17) int local17 = arg7 - 16;
		@Pc(21) int local21 = arg7 + 16;
		@Pc(30) int local30;
		@Pc(33) int local33;
		@Pc(184) int local184;
		for (@Pc(23) int local23 = Static43.anInt795; local23 < Static78.anInt1716; local23++) {
			@Pc(28) Class2_Sub12[][] local28 = Static226.aClass2_Sub12ArrayArrayArray3[local23];
			for (local30 = Static66.anInt1312; local30 < Static96.anInt2119; local30++) {
				for (local33 = Static190.anInt4422; local33 < Static100.anInt2197; local33++) {
					@Pc(40) Class2_Sub12 local40 = local28[local30][local33];
					if (local40 != null) {
						if (local40.anInt764 <= Static182.anInt4232 && Static17.aBooleanArrayArray2[local30 + Static125.anInt1642 - Static179.anInt4190][local33 + Static125.anInt1642 - Static11.anInt312] && (arg3 == null || local23 < arg4 || arg3[local23][local30][local33] != arg5)) {
							local40.aBoolean29 = true;
							local40.aBoolean28 = true;
							if (local40.anInt775 > 0) {
								local40.aBoolean30 = true;
							} else {
								local40.aBoolean30 = false;
							}
							Static23.anInt419++;
						} else {
							local40.aBoolean29 = false;
							local40.aBoolean28 = false;
							local40.anInt774 = 0;
							if (local30 >= local9 && local30 <= local13 && local33 >= local17 && local33 <= local21) {
								if (local40.aClass27_1 != null) {
									@Pc(101) Class27 local101 = local40.aClass27_1;
									local101.aClass5_2.method3777(local101.anInt808, local101.anInt808, local101.anInt810, local101.anInt810);
									if (local101.aClass5_3 != null) {
										local101.aClass5_3.method3777(local101.anInt808, local101.anInt808, local101.anInt810, local101.anInt810);
									}
								}
								if (local40.aClass104_1 != null) {
									@Pc(134) Class104 local134 = local40.aClass104_1;
									local134.aClass5_10.method3777(local134.anInt4648, local134.anInt4648, local134.anInt4643, local134.anInt4643);
									if (local134.aClass5_9 != null) {
										local134.aClass5_9.method3777(local134.anInt4648, local134.anInt4648, local134.anInt4643, local134.anInt4643);
									}
								}
								if (local40.aClass106_1 != null) {
									@Pc(167) Class106 local167 = local40.aClass106_1;
									local167.aClass5_11.method3777(local167.anInt4668, local167.anInt4668, local167.anInt4669, local167.anInt4669);
								}
								if (local40.aClass100Array3 != null) {
									for (local184 = 0; local184 < local40.anInt775; local184++) {
										@Pc(190) Class100 local190 = local40.aClass100Array3[local184];
										local190.aClass5_8.method3777(local190.anInt4525, local190.anInt4529, local190.anInt4528, local190.anInt4517);
									}
								}
							}
						}
					}
				}
			}
		}
		@Pc(247) boolean local247 = Static144.anIntArrayArrayArray7 == Static100.anIntArrayArrayArray5;
		@Pc(275) int local275;
		@Pc(280) int local280;
		@Pc(284) int local284;
		@Pc(266) int local266;
		for (local30 = Static43.anInt795; local30 < Static78.anInt1716; local30++) {
			@Pc(254) Class2_Sub12[][] local254 = Static226.aClass2_Sub12ArrayArrayArray3[local30];
			for (@Pc(257) int local257 = -Static125.anInt1642; local257 <= 0; local257++) {
				local184 = Static179.anInt4190 + local257;
				local266 = Static179.anInt4190 - local257;
				if (local184 >= Static66.anInt1312 || local266 < Static96.anInt2119) {
					for (local275 = -Static125.anInt1642; local275 <= 0; local275++) {
						local280 = Static11.anInt312 + local275;
						local284 = Static11.anInt312 - local275;
						@Pc(296) Class2_Sub12 local296;
						if (local184 >= Static66.anInt1312) {
							if (local280 >= Static190.anInt4422) {
								local296 = local254[local184][local280];
								if (local296 != null && local296.aBoolean29) {
									Static80.method1341(local296, true);
								}
							}
							if (local284 < Static100.anInt2197) {
								local296 = local254[local184][local284];
								if (local296 != null && local296.aBoolean29) {
									Static80.method1341(local296, true);
								}
							}
						}
						if (local266 < Static96.anInt2119) {
							if (local280 >= Static190.anInt4422) {
								local296 = local254[local266][local280];
								if (local296 != null && local296.aBoolean29) {
									Static80.method1341(local296, true);
								}
							}
							if (local284 < Static100.anInt2197) {
								local296 = local254[local266][local284];
								if (local296 != null && local296.aBoolean29) {
									Static80.method1341(local296, true);
								}
							}
						}
						if (Static23.anInt419 == 0) {
							if (!local247) {
								Static194.aBoolean191 = false;
							}
							return;
						}
					}
				}
			}
		}
		for (local33 = Static43.anInt795; local33 < Static78.anInt1716; local33++) {
			@Pc(382) Class2_Sub12[][] local382 = Static226.aClass2_Sub12ArrayArrayArray3[local33];
			for (local184 = -Static125.anInt1642; local184 <= 0; local184++) {
				local266 = Static179.anInt4190 + local184;
				local275 = Static179.anInt4190 - local184;
				if (local266 >= Static66.anInt1312 || local275 < Static96.anInt2119) {
					for (local280 = -Static125.anInt1642; local280 <= 0; local280++) {
						local284 = Static11.anInt312 + local280;
						@Pc(412) int local412 = Static11.anInt312 - local280;
						@Pc(424) Class2_Sub12 local424;
						if (local266 >= Static66.anInt1312) {
							if (local284 >= Static190.anInt4422) {
								local424 = local382[local266][local284];
								if (local424 != null && local424.aBoolean29) {
									Static80.method1341(local424, false);
								}
							}
							if (local412 < Static100.anInt2197) {
								local424 = local382[local266][local412];
								if (local424 != null && local424.aBoolean29) {
									Static80.method1341(local424, false);
								}
							}
						}
						if (local275 < Static96.anInt2119) {
							if (local284 >= Static190.anInt4422) {
								local424 = local382[local275][local284];
								if (local424 != null && local424.aBoolean29) {
									Static80.method1341(local424, false);
								}
							}
							if (local412 < Static100.anInt2197) {
								local424 = local382[local275][local412];
								if (local424 != null && local424.aBoolean29) {
									Static80.method1341(local424, false);
								}
							}
						}
						if (Static23.anInt419 == 0) {
							if (!local247) {
								Static194.aBoolean191 = false;
							}
							return;
						}
					}
				}
			}
		}
		Static194.aBoolean191 = false;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(I)[Lclient!gd;")
	public static Class2_Sub3_Sub8[] method3531() {
		@Pc(18) Class2_Sub3_Sub8[] local18 = new Class2_Sub3_Sub8[Static113.anInt2492];
		for (@Pc(20) int local20 = 0; local20 < Static113.anInt2492; local20++) {
			@Pc(29) int local29 = Static113.anIntArray423[local20] * Static131.anIntArray489[local20];
			@Pc(33) byte[] local33 = Static31.aByteArrayArray3[local20];
			@Pc(36) int[] local36 = new int[local29];
			for (@Pc(38) int local38 = 0; local38 < local29; local38++) {
				local36[local38] = Static198.anIntArray725[local33[local38] & 0xFF];
			}
			local18[local20] = new Class2_Sub3_Sub8_Sub1(Static142.anInt3236, Static100.anInt2184, Static186.anIntArray702[local20], Static37.anIntArray108[local20], Static113.anIntArray423[local20], Static131.anIntArray489[local20], local36);
		}
		Static28.method365();
		return local18;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lclient!qe;Z)V")
	public static void method3532(@OriginalArg(0) Class78 arg0) {
		Static171.aClass78_688 = arg0;
		Static110.method1908();
	}
}
