import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static568 {

	@OriginalMember(owner = "client!te", name = "Qc", descriptor = "Lclient!dm;")
	public static Class76 aClass76_15;

	@OriginalMember(owner = "client!te", name = "Eb", descriptor = "[I")
	public static final int[] anIntArray497 = new int[200];

	@OriginalMember(owner = "client!te", name = "bc", descriptor = "I")
	public static int anInt9915 = 0;

	@OriginalMember(owner = "client!te", name = "lc", descriptor = "Lclient!in;")
	public static final Class169 aClass169_239 = new Class169(100, 7);

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(IIIII)V")
	public static void method8644(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(13) Class2_Sub1_Sub5 local13 = Static653.method9595(8, (long) arg2);
		local13.method2486();
		local13.anInt2680 = arg0;
		local13.anInt2679 = arg1;
		local13.anInt2674 = arg3;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(BC)Z")
	public static boolean method8647(@OriginalArg(1) char arg0) {
		if (arg0 >= ' ' && arg0 <= '~') {
			return true;
		} else if (arg0 >= ' ' && arg0 <= 'ÿ') {
			return true;
		} else {
			return arg0 == '€' || arg0 == 'Œ' || arg0 == '—' || arg0 == 'œ' || arg0 == 'Ÿ';
		}
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "([I[ILclient!gh;I[I)V")
	public static void method8654(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) Class15_Sub3_Sub3_Sub1_Sub2 arg2, @OriginalArg(4) int[] arg3) {
		for (@Pc(3) int local3 = 0; local3 < arg3.length; local3++) {
			@Pc(9) int local9 = arg3[local3];
			@Pc(13) int local13 = arg1[local3];
			@Pc(17) int local17 = arg0[local3];
			@Pc(19) int local19 = 0;
			while (local13 != 0 && local19 < arg2.aClass171Array3.length) {
				if ((local13 & 0x1) != 0) {
					if (local9 == -1) {
						arg2.aClass171Array3[local19] = null;
					} else {
						@Pc(39) Class178 local39 = Static354.aClass40_2.method1123(local9);
						@Pc(42) int local42 = local39.anInt5129;
						@Pc(47) Class171 local47 = arg2.aClass171Array3[local19];
						if (local47 != null) {
							if (local47.anInt5007 == local9) {
								if (local42 == 0) {
									local47 = arg2.aClass171Array3[local19] = null;
								} else if (local42 == 1) {
									local47.anInt5005 = 0;
									local47.anInt5006 = 0;
									local47.anInt5009 = local17;
									local47.anInt5003 = 0;
									local47.anInt5010 = 1;
									if (!arg2.aBoolean315) {
										Static509.method7938(local39, arg2, 0);
									}
								} else if (local42 == 2) {
									local47.anInt5006 = 0;
								}
							} else if (local39.anInt5138 >= Static354.aClass40_2.method1123(local47.anInt5007).anInt5138) {
								local47 = arg2.aClass171Array3[local19] = null;
							}
						}
						if (local47 == null) {
							local47 = arg2.aClass171Array3[local19] = new Class171();
							local47.anInt5009 = local17;
							local47.anInt5006 = 0;
							local47.anInt5010 = 1;
							local47.anInt5003 = 0;
							local47.anInt5007 = local9;
							local47.anInt5005 = 0;
							if (!arg2.aBoolean315) {
								Static509.method7938(local39, arg2, 0);
							}
						}
					}
				}
				local19++;
				local13 >>>= 0x1;
			}
		}
	}

	@OriginalMember(owner = "client!te", name = "i", descriptor = "(I)V")
	public static void method8664() {
		Static206.aClass2_Sub8_Sub2_1.method5231();
		@Pc(20) int local20 = Static206.aClass2_Sub8_Sub2_1.method5233(8);
		@Pc(25) int local25;
		if (Static532.anInt9330 > local20) {
			for (local25 = local20; local25 < Static532.anInt9330; local25++) {
				Static620.anIntArray562[Static406.anInt7569++] = Static84.anIntArray73[local25];
			}
		}
		if (Static532.anInt9330 < local20) {
			throw new RuntimeException("gnpov1");
		}
		Static532.anInt9330 = 0;
		for (local25 = 0; local25 < local20; local25++) {
			@Pc(63) int local63 = Static84.anIntArray73[local25];
			@Pc(73) Class15_Sub3_Sub3_Sub1_Sub2 local73 = ((Class2_Sub6) Static630.aClass335_29.method8357((long) local63)).aClass15_Sub3_Sub3_Sub1_Sub2_1;
			@Pc(78) int local78 = Static206.aClass2_Sub8_Sub2_1.method5233(1);
			if (local78 == 0) {
				Static84.anIntArray73[Static532.anInt9330++] = local63;
				local73.anInt3999 = Static634.anInt10948;
			} else {
				@Pc(103) int local103 = Static206.aClass2_Sub8_Sub2_1.method5233(2);
				if (local103 == 0) {
					Static84.anIntArray73[Static532.anInt9330++] = local63;
					local73.anInt3999 = Static634.anInt10948;
					Static288.anIntArray268[Static56.anInt1101++] = local63;
				} else {
					@Pc(148) int local148;
					@Pc(158) int local158;
					if (local103 == 1) {
						Static84.anIntArray73[Static532.anInt9330++] = local63;
						local73.anInt3999 = Static634.anInt10948;
						local148 = Static206.aClass2_Sub8_Sub2_1.method5233(3);
						local73.method3697(local148, 1);
						local158 = Static206.aClass2_Sub8_Sub2_1.method5233(1);
						if (local158 == 1) {
							Static288.anIntArray268[Static56.anInt1101++] = local63;
						}
					} else if (local103 == 2) {
						Static84.anIntArray73[Static532.anInt9330++] = local63;
						local73.anInt3999 = Static634.anInt10948;
						if (Static206.aClass2_Sub8_Sub2_1.method5233(1) == 1) {
							local148 = Static206.aClass2_Sub8_Sub2_1.method5233(3);
							local73.method3697(local148, 2);
							local158 = Static206.aClass2_Sub8_Sub2_1.method5233(3);
							local73.method3697(local158, 2);
						} else {
							local148 = Static206.aClass2_Sub8_Sub2_1.method5233(3);
							local73.method3697(local148, 0);
						}
						local148 = Static206.aClass2_Sub8_Sub2_1.method5233(1);
						if (local148 == 1) {
							Static288.anIntArray268[Static56.anInt1101++] = local63;
						}
					} else if (local103 == 3) {
						Static620.anIntArray562[Static406.anInt7569++] = local63;
					}
				}
			}
		}
	}
}
