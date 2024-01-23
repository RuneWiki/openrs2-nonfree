import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static120 {

	@OriginalMember(owner = "client!md", name = "W", descriptor = "[I")
	public static int[] anIntArray310;

	@OriginalMember(owner = "client!md", name = "X", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray15;

	@OriginalMember(owner = "client!md", name = "Y", descriptor = "I")
	public static int anInt2898;

	@OriginalMember(owner = "client!md", name = "ab", descriptor = "Lclient!q;")
	public static Class80 aClass80_11;

	@OriginalMember(owner = "client!md", name = "S", descriptor = "I")
	public static int anInt2895 = -1;

	@OriginalMember(owner = "client!md", name = "U", descriptor = "[I")
	public static int[] anIntArray309 = new int[] { 2, 2, 4, 0, 1, 8, 0, 0, 0, 0, 2 };

	@OriginalMember(owner = "client!md", name = "eb", descriptor = "Lclient!i;")
	public static Class41 aClass41_821 = Static184.method2923("Ihr Spielkonto wird bereits benutzt)3");

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(Lclient!cg;IIIIII)Lclient!cg;")
	public static Class12_Sub2 method2028(@OriginalArg(0) Class12_Sub2 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(8) long local8 = (long) arg3;
		@Pc(14) Class12_Sub2 local14 = (Class12_Sub2) Static94.aClass16_6.method437(local8);
		if (local14 == null) {
			@Pc(21) Class12_Sub6 local21 = Static72.method1336(Static207.aClass15_Sub1_130, arg3);
			if (local21 == null) {
				return null;
			}
			local14 = local21.method1315(64, 768, -50, -10, -50);
			Static94.aClass16_6.method432(local8, local14);
		}
		@Pc(41) int local41 = arg0.method1863();
		@Pc(44) int local44 = arg0.method1865();
		@Pc(47) int local47 = arg0.method1855();
		@Pc(50) int local50 = arg0.method1867();
		local14 = local14.method1854(true, true);
		if (arg4 != 0) {
			local14.method1857(arg4);
		}
		@Pc(66) Class12_Sub2_Sub1 local66 = (Class12_Sub2_Sub1) local14;
		if (arg5 != Static212.method3261(local41 + arg2, arg1 + local47, Static134.anInt3147) || Static212.method3261(local44 + arg2, local50 + arg1, Static134.anInt3147) != arg5) {
			for (@Pc(100) int local100 = 0; local100 < local66.anInt2632; local100++) {
				local66.anIntArray276[local100] += Static212.method3261(arg2 + local66.anIntArray269[local100], local66.anIntArray277[local100] - -arg1, Static134.anInt3147) - arg5;
			}
			local66.aBoolean140 = false;
		}
		return local14;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(Lclient!nb;I)V")
	public static void method2029(@OriginalArg(0) Class15 arg0) {
		Static28.aClass15_2 = arg0;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(IJ)V")
	private static void method2031(@OriginalArg(1) long arg0) {
		if (arg0 != 0L) {
			Static131.aClass2_Sub3_Sub1_2.method221(58);
			Static131.aClass2_Sub3_Sub1_2.method190(arg0);
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(BLclient!i;)Z")
	public static boolean method2032(@OriginalArg(1) Class41 arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(11) int local11 = 0; local11 < Static131.anInt2996; local11++) {
			if (arg0.method1413(Static21.aClass41Array71[local11])) {
				return true;
			}
		}
		return arg0.method1413(Static213.aClass12_Sub3_Sub1_1.aClass41_362);
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(BLclient!de;I)V")
	public static void method2033(@OriginalArg(1) Class2_Sub5 arg0, @OriginalArg(2) int arg1) {
		@Pc(4) Object[] local4 = arg0.anObjectArray3;
		@Pc(14) int local14 = (Integer) local4[0];
		@Pc(18) Class2_Sub2_Sub28 local18 = Static54.method1058(local14);
		if (local18 == null) {
			return;
		}
		@Pc(23) int local23 = 0;
		@Pc(37) int local37 = 0;
		Static204.anInt4552 = 0;
		@Pc(41) int local41 = -1;
		@Pc(44) int[] local44 = local18.anIntArray500;
		@Pc(46) byte local46 = -1;
		@Pc(49) int[] local49 = local18.anIntArray499;
		@Pc(63) int local63;
		@Pc(76) int local76;
		try {
			Static215.anIntArray489 = new int[local18.anInt4796];
			Static138.aClass41Array49 = new Class41[local18.anInt4792];
			@Pc(59) int local59 = 0;
			@Pc(61) int local61 = 0;
			for (local63 = 1; local63 < local4.length; local63++) {
				if (local4[local63] instanceof Integer) {
					local76 = (Integer) local4[local63];
					if (local76 == -2147483647) {
						local76 = arg0.anInt950;
					}
					if (local76 == -2147483646) {
						local76 = arg0.anInt947;
					}
					if (local76 == -2147483645) {
						local76 = arg0.aClass80_3 == null ? -1 : arg0.aClass80_3.anInt3661;
					}
					if (local76 == -2147483644) {
						local76 = arg0.anInt942;
					}
					if (local76 == -2147483643) {
						local76 = arg0.aClass80_3 == null ? -1 : arg0.aClass80_3.anInt3649;
					}
					if (local76 == -2147483642) {
						local76 = arg0.aClass80_2 == null ? -1 : arg0.aClass80_2.anInt3661;
					}
					if (local76 == -2147483641) {
						local76 = arg0.aClass80_2 == null ? -1 : arg0.aClass80_2.anInt3649;
					}
					if (local76 == -2147483640) {
						local76 = arg0.anInt944;
					}
					if (local76 == -2147483639) {
						local76 = arg0.anInt948;
					}
					Static215.anIntArray489[local61++] = local76;
				} else if (local4[local63] instanceof Class41) {
					@Pc(183) Class41 local183 = (Class41) local4[local63];
					if (local183.method1386(Static171.aClass41_1060)) {
						local183 = arg0.aClass41_265;
					}
					Static138.aClass41Array49[local59++] = local183;
				}
			}
			local76 = 0;
			label2552: while (true) {
				local76++;
				if (arg1 < local76) {
					throw new RuntimeException("slow");
				}
				local41++;
				@Pc(225) int local225 = local49[local41];
				@Pc(633) int local633;
				@Pc(779) int local779;
				@Pc(658) int local658;
				@Pc(785) int local785;
				@Pc(593) Class41 local593;
				if (local225 < 100) {
					if (local225 == 0) {
						Static94.anIntArray231[local23++] = local44[local41];
						continue;
					}
					@Pc(246) int local246;
					if (local225 == 1) {
						local246 = local44[local41];
						Static94.anIntArray231[local23++] = Static99.anIntArray243[local246];
						continue;
					}
					if (local225 == 2) {
						local246 = local44[local41];
						local23--;
						Static99.anIntArray243[local246] = Static94.anIntArray231[local23];
						continue;
					}
					if (local225 == 3) {
						Static153.aClass41Array53[local37++] = local18.aClass41Array73[local41];
						continue;
					}
					if (local225 == 6) {
						local41 += local44[local41];
						continue;
					}
					if (local225 == 7) {
						local23 -= 2;
						if (Static94.anIntArray231[local23] != Static94.anIntArray231[local23 + 1]) {
							local41 += local44[local41];
						}
						continue;
					}
					if (local225 == 8) {
						local23 -= 2;
						if (Static94.anIntArray231[local23 + 1] == Static94.anIntArray231[local23]) {
							local41 += local44[local41];
						}
						continue;
					}
					if (local225 == 9) {
						local23 -= 2;
						if (Static94.anIntArray231[local23 + 1] > Static94.anIntArray231[local23]) {
							local41 += local44[local41];
						}
						continue;
					}
					if (local225 == 10) {
						local23 -= 2;
						if (Static94.anIntArray231[local23] > Static94.anIntArray231[local23 + 1]) {
							local41 += local44[local41];
						}
						continue;
					}
					if (local225 == 21) {
						if (Static204.anInt4552 == 0) {
							return;
						}
						@Pc(414) Class64 local414 = Static70.aClass64Array1[--Static204.anInt4552];
						Static138.aClass41Array49 = local414.aClass41Array43;
						Static215.anIntArray489 = local414.anIntArray314;
						local18 = local414.aClass2_Sub2_Sub28_1;
						local41 = local414.anInt2958;
						local44 = local18.anIntArray500;
						local49 = local18.anIntArray499;
						continue;
					}
					if (local225 == 25) {
						local246 = local44[local41];
						Static94.anIntArray231[local23++] = Static127.method2070(local246);
						continue;
					}
					if (local225 == 27) {
						local246 = local44[local41];
						local23--;
						Static95.method1666(local246, Static94.anIntArray231[local23]);
						continue;
					}
					if (local225 == 31) {
						local23 -= 2;
						if (Static94.anIntArray231[local23 + 1] >= Static94.anIntArray231[local23]) {
							local41 += local44[local41];
						}
						continue;
					}
					if (local225 == 32) {
						local23 -= 2;
						if (Static94.anIntArray231[local23] >= Static94.anIntArray231[local23 + 1]) {
							local41 += local44[local41];
						}
						continue;
					}
					if (local225 == 33) {
						Static94.anIntArray231[local23++] = Static215.anIntArray489[local44[local41]];
						continue;
					}
					@Pc(535) int local535;
					if (local225 == 34) {
						local535 = local44[local41];
						local23--;
						Static215.anIntArray489[local535] = Static94.anIntArray231[local23];
						continue;
					}
					if (local225 == 35) {
						Static153.aClass41Array53[local37++] = Static138.aClass41Array49[local44[local41]];
						continue;
					}
					if (local225 == 36) {
						local535 = local44[local41];
						local37--;
						Static138.aClass41Array49[local535] = Static153.aClass41Array53[local37];
						continue;
					}
					if (local225 == 37) {
						local246 = local44[local41];
						local37 -= local246;
						local593 = Static148.method2317(local246, Static153.aClass41Array53, local37);
						Static153.aClass41Array53[local37++] = local593;
						continue;
					}
					if (local225 == 38) {
						local23--;
						continue;
					}
					if (local225 == 39) {
						local37--;
						continue;
					}
					if (local225 == 40) {
						local246 = local44[local41];
						@Pc(623) Class2_Sub2_Sub28 local623 = Static54.method1058(local246);
						@Pc(627) Class41[] local627 = new Class41[local623.anInt4792];
						@Pc(631) int[] local631 = new int[local623.anInt4796];
						for (local633 = 0; local633 < local623.anInt4794; local633++) {
							local631[local633] = Static94.anIntArray231[local633 + local23 - local623.anInt4794];
						}
						for (local658 = 0; local658 < local623.anInt4793; local658++) {
							local627[local658] = Static153.aClass41Array53[local658 + local37 - local623.anInt4793];
						}
						local23 -= local623.anInt4794;
						local37 -= local623.anInt4793;
						@Pc(691) Class64 local691 = new Class64();
						local691.aClass2_Sub2_Sub28_1 = local18;
						local691.aClass41Array43 = Static138.aClass41Array49;
						local691.anInt2958 = local41;
						local691.anIntArray314 = Static215.anIntArray489;
						if (Static204.anInt4552 >= Static70.aClass64Array1.length) {
							throw new RuntimeException();
						}
						local18 = local623;
						local41 = -1;
						Static70.aClass64Array1[Static204.anInt4552++] = local691;
						local49 = local623.anIntArray499;
						Static215.anIntArray489 = local631;
						local44 = local623.anIntArray500;
						Static138.aClass41Array49 = local627;
						continue;
					}
					if (local225 == 42) {
						Static94.anIntArray231[local23++] = Static105.anIntArray252[local44[local41]];
						continue;
					}
					if (local225 == 43) {
						local535 = local44[local41];
						local23--;
						Static105.anIntArray252[local535] = Static94.anIntArray231[local23];
						continue;
					}
					if (local225 == 44) {
						local246 = local44[local41] >> 16;
						local23--;
						local779 = Static94.anIntArray231[local23];
						local785 = local44[local41] & 0xFFFF;
						if (local779 >= 0 && local779 <= 5000) {
							Static83.anIntArray205[local246] = local779;
							@Pc(800) byte local800 = -1;
							if (local785 == 105) {
								local800 = 0;
							}
							local633 = 0;
							while (true) {
								if (local633 >= local779) {
									continue label2552;
								}
								Static15.anIntArrayArray2[local246][local633] = local800;
								local633++;
							}
						}
						throw new RuntimeException();
					}
					if (local225 == 45) {
						local246 = local44[local41];
						local23--;
						local785 = Static94.anIntArray231[local23];
						if (local785 >= 0 && Static83.anIntArray205[local246] > local785) {
							Static94.anIntArray231[local23++] = Static15.anIntArrayArray2[local246][local785];
							continue;
						}
						throw new RuntimeException();
					}
					if (local225 == 46) {
						local23 -= 2;
						local785 = Static94.anIntArray231[local23];
						local246 = local44[local41];
						if (local785 >= 0 && local785 < Static83.anIntArray205[local246]) {
							Static15.anIntArrayArray2[local246][local785] = Static94.anIntArray231[local23 + 1];
							continue;
						}
						throw new RuntimeException();
					}
					if (local225 == 47) {
						@Pc(905) Class41 local905 = Static6.aClass41Array3[local44[local41]];
						if (local905 == null) {
							local905 = Static13.aClass41_81;
						}
						Static153.aClass41Array53[local37++] = local905;
						continue;
					}
					if (local225 == 48) {
						local535 = local44[local41];
						local37--;
						Static6.aClass41Array3[local535] = Static153.aClass41Array53[local37];
						continue;
					}
					if (local225 == 51) {
						@Pc(944) Class70 local944 = local18.aClass70Array1[local44[local41]];
						local23--;
						@Pc(954) Class2_Sub23 local954 = (Class2_Sub23) local944.method2205((long) Static94.anIntArray231[local23]);
						if (local954 != null) {
							local41 += local954.anInt3983;
						}
						continue;
					}
				}
				@Pc(972) boolean local972;
				if (local44[local41] == 1) {
					local972 = true;
				} else {
					local972 = false;
				}
				@Pc(1124) Class80 local1124;
				@Pc(1001) int local1001;
				@Pc(1032) int local1032;
				@Pc(1011) Class80 local1011;
				@Pc(1193) Class80 local1193;
				if (local225 < 300) {
					if (local225 == 100) {
						local23 -= 3;
						local785 = Static94.anIntArray231[local23];
						local779 = Static94.anIntArray231[local23 + 1];
						local1001 = Static94.anIntArray231[local23 + 2];
						if (local779 == 0) {
							throw new RuntimeException();
						}
						local1011 = Static212.method3256(local785);
						if (local1011.aClass80Array1 == null) {
							local1011.aClass80Array1 = new Class80[local1001 + 1];
						}
						if (local1001 >= local1011.aClass80Array1.length) {
							@Pc(1030) Class80[] local1030 = new Class80[local1001 + 1];
							for (local1032 = 0; local1032 < local1011.aClass80Array1.length; local1032++) {
								local1030[local1032] = local1011.aClass80Array1[local1032];
							}
							local1011.aClass80Array1 = local1030;
						}
						if (local1001 > 0 && local1011.aClass80Array1[local1001 - 1] == null) {
							throw new RuntimeException("Gap at:" + (local1001 - 1));
						}
						@Pc(1079) Class80 local1079 = new Class80();
						local1079.aBoolean215 = true;
						local1079.anInt3649 = local1001;
						local1079.anInt3640 = local779;
						local1079.anInt3697 = local1079.anInt3661 = local1011.anInt3661;
						local1011.aClass80Array1[local1001] = local1079;
						if (local972) {
							Static179.aClass80_14 = local1079;
						} else {
							Static114.aClass80_10 = local1079;
						}
						Static176.method2833(local1011);
						continue;
					}
					@Pc(1145) Class80 local1145;
					if (local225 == 101) {
						local1124 = local972 ? Static179.aClass80_14 : Static114.aClass80_10;
						if (local1124.anInt3649 == -1) {
							if (local972) {
								throw new RuntimeException("Tried to .cc_delete static .active-component!");
							}
							throw new RuntimeException("Tried to cc_delete static active-component!");
						}
						local1145 = Static212.method3256(local1124.anInt3661);
						local1145.aClass80Array1[local1124.anInt3649] = null;
						Static176.method2833(local1145);
						continue;
					}
					if (local225 == 102) {
						local23--;
						local1124 = Static212.method3256(Static94.anIntArray231[local23]);
						local1124.aClass80Array1 = null;
						Static176.method2833(local1124);
						continue;
					}
					if (local225 == 200) {
						local23 -= 2;
						local779 = Static94.anIntArray231[local23 + 1];
						local785 = Static94.anIntArray231[local23];
						local1193 = Static34.method675(local779, local785);
						if (local1193 != null && local779 != -1) {
							Static94.anIntArray231[local23++] = 1;
							if (local972) {
								Static179.aClass80_14 = local1193;
							} else {
								Static114.aClass80_10 = local1193;
							}
							continue;
						}
						Static94.anIntArray231[local23++] = 0;
						continue;
					}
					if (local225 == 201) {
						local23--;
						local785 = Static94.anIntArray231[local23];
						local1145 = Static212.method3256(local785);
						if (local1145 == null) {
							Static94.anIntArray231[local23++] = 0;
						} else {
							Static94.anIntArray231[local23++] = 1;
							if (local972) {
								Static179.aClass80_14 = local1145;
							} else {
								Static114.aClass80_10 = local1145;
							}
						}
						continue;
					}
				} else if (local225 < 500) {
					if (local225 == 403) {
						local23 -= 2;
						local785 = Static94.anIntArray231[local23];
						if (local785 >= 7) {
							local785 -= 7;
						}
						local779 = Static94.anIntArray231[local23 + 1];
						Static213.aClass12_Sub3_Sub1_1.aClass91_1.method2935(local785, local779);
						continue;
					}
					if (local225 == 404) {
						local23 -= 2;
						local779 = Static94.anIntArray231[local23 + 1];
						local785 = Static94.anIntArray231[local23];
						Static213.aClass12_Sub3_Sub1_1.aClass91_1.method2932(local779, local785);
						continue;
					}
					if (local225 == 410) {
						local23--;
						@Pc(9472) boolean local9472 = Static94.anIntArray231[local23] != 0;
						Static213.aClass12_Sub3_Sub1_1.aClass91_1.method2934(local9472);
						continue;
					}
				} else if (local225 >= 1000 && local225 < 1100 || local225 >= 2000 && local225 < 2100) {
					if (local225 < 2000) {
						local1124 = local972 ? Static179.aClass80_14 : Static114.aClass80_10;
					} else {
						local225 -= 1000;
						local23--;
						local1124 = Static212.method3256(Static94.anIntArray231[local23]);
					}
					if (local225 == 1000) {
						local1124.aByte11 = 0;
						local23 -= 2;
						local1124.anInt3627 = local1124.anInt3641 = Static94.anIntArray231[local23];
						local1124.aByte13 = 0;
						local1124.anInt3671 = local1124.anInt3702 = Static94.anIntArray231[local23 + 1];
						Static176.method2833(local1124);
						continue;
					}
					if (local225 == 1001) {
						local1124.aByte14 = 0;
						local23 -= 2;
						local1124.anInt3635 = local1124.anInt3696 = Static94.anIntArray231[local23];
						local1124.anInt3678 = 0;
						local1124.aByte12 = 0;
						local1124.anInt3660 = local1124.anInt3658 = Static94.anIntArray231[local23 + 1];
						local1124.anInt3657 = 0;
						Static176.method2833(local1124);
						if (local1124.anInt3640 == 0) {
							Static96.method1670(false, local1124);
						}
						Static2.method52(local1124);
						continue;
					}
					if (local225 == 1003) {
						local23--;
						@Pc(9266) boolean local9266 = Static94.anIntArray231[local23] == 1;
						if (local1124.aBoolean212 != local9266) {
							local1124.aBoolean212 = local9266;
							Static176.method2833(local1124);
						}
						continue;
					}
					if (local225 == 1004) {
						local23 -= 4;
						local1124.anInt3641 = Static94.anIntArray231[local23];
						local1124.anInt3702 = Static94.anIntArray231[local23 + 1];
						local779 = Static94.anIntArray231[local23 + 2];
						local1001 = Static94.anIntArray231[local23 + 3];
						if (local1001 < 0) {
							local1001 = 0;
						} else if (local1001 > 2) {
							local1001 = 2;
						}
						local1124.aByte13 = (byte) (local1001 + 3);
						if (local779 < 0) {
							local779 = 0;
						} else if (local779 > 2) {
							local779 = 2;
						}
						local1124.aByte11 = (byte) (local779 + 3);
						Static176.method2833(local1124);
						Static2.method52(local1124);
						continue;
					}
					if (local225 == 1005) {
						local1124.aByte11 = 2;
						local23 -= 2;
						local1124.anInt3641 = Static94.anIntArray231[local23];
						local1124.aByte13 = 2;
						local1124.anInt3702 = Static94.anIntArray231[local23 + 1];
						Static176.method2833(local1124);
						if (local1124.anInt3640 == 0) {
							Static96.method1670(false, local1124);
						}
						Static2.method52(local1124);
						continue;
					}
				} else {
					@Pc(1566) Class41 local1566;
					if (local225 >= 1100 && local225 < 1200 || !(local225 < 2100 || local225 >= 2200)) {
						if (local225 >= 2000) {
							local23--;
							local1124 = Static212.method3256(Static94.anIntArray231[local23]);
							local225 -= 1000;
						} else {
							local1124 = local972 ? Static179.aClass80_14 : Static114.aClass80_10;
						}
						if (local225 == 1100) {
							local23 -= 2;
							local1124.anInt3642 = Static94.anIntArray231[local23];
							if (local1124.anInt3637 - local1124.anInt3635 < local1124.anInt3642) {
								local1124.anInt3642 = local1124.anInt3637 - local1124.anInt3635;
							}
							if (local1124.anInt3642 < 0) {
								local1124.anInt3642 = 0;
							}
							local1124.anInt3655 = Static94.anIntArray231[local23 + 1];
							if (local1124.anInt3655 > local1124.anInt3632 - local1124.anInt3660) {
								local1124.anInt3655 = local1124.anInt3632 - local1124.anInt3660;
							}
							if (local1124.anInt3655 < 0) {
								local1124.anInt3655 = 0;
							}
							Static176.method2833(local1124);
							continue;
						}
						if (local225 == 1101) {
							local23--;
							local1124.anInt3654 = Static94.anIntArray231[local23];
							Static176.method2833(local1124);
							continue;
						}
						if (local225 == 1102) {
							local23--;
							local1124.aBoolean227 = Static94.anIntArray231[local23] == 1;
							Static176.method2833(local1124);
							continue;
						}
						if (local225 == 1103) {
							local23--;
							local1124.anInt3684 = Static94.anIntArray231[local23];
							Static176.method2833(local1124);
							continue;
						}
						if (local225 == 1104) {
							local23--;
							local1124.anInt3692 = Static94.anIntArray231[local23];
							Static176.method2833(local1124);
							continue;
						}
						if (local225 == 1105) {
							local23--;
							local1124.anInt3680 = Static94.anIntArray231[local23];
							Static176.method2833(local1124);
							continue;
						}
						if (local225 == 1106) {
							local23--;
							local1124.anInt3669 = Static94.anIntArray231[local23];
							Static176.method2833(local1124);
							continue;
						}
						if (local225 == 1107) {
							local23--;
							local1124.aBoolean216 = Static94.anIntArray231[local23] == 1;
							Static176.method2833(local1124);
							continue;
						}
						if (local225 == 1108) {
							local1124.anInt3665 = 1;
							local23--;
							local1124.anInt3651 = Static94.anIntArray231[local23];
							Static176.method2833(local1124);
							continue;
						}
						if (local225 == 1109) {
							local23 -= 6;
							local1124.anInt3626 = Static94.anIntArray231[local23];
							local1124.anInt3693 = Static94.anIntArray231[local23 + 1];
							local1124.anInt3674 = Static94.anIntArray231[local23 + 2];
							local1124.anInt3700 = Static94.anIntArray231[local23 + 3];
							local1124.anInt3704 = Static94.anIntArray231[local23 + 4];
							local1124.anInt3686 = Static94.anIntArray231[local23 + 5];
							Static176.method2833(local1124);
							continue;
						}
						if (local225 == 1110) {
							local23--;
							local779 = Static94.anIntArray231[local23];
							if (local1124.anInt3647 != local779) {
								local1124.anInt3687 = 0;
								local1124.anInt3647 = local779;
								local1124.anInt3634 = 0;
								Static176.method2833(local1124);
							}
							continue;
						}
						if (local225 == 1111) {
							local23--;
							local1124.aBoolean214 = Static94.anIntArray231[local23] == 1;
							Static176.method2833(local1124);
							continue;
						}
						if (local225 == 1112) {
							local37--;
							local1566 = Static153.aClass41Array53[local37];
							if (!local1566.method1386(local1124.aClass41_979)) {
								local1124.aClass41_979 = local1566;
								Static176.method2833(local1124);
							}
							continue;
						}
						if (local225 == 1113) {
							local23--;
							local1124.anInt3675 = Static94.anIntArray231[local23];
							Static176.method2833(local1124);
							continue;
						}
						if (local225 == 1114) {
							local23 -= 3;
							local1124.anInt3683 = Static94.anIntArray231[local23];
							local1124.anInt3679 = Static94.anIntArray231[local23 + 1];
							local1124.anInt3644 = Static94.anIntArray231[local23 + 2];
							Static176.method2833(local1124);
							continue;
						}
						if (local225 == 1115) {
							local23--;
							local1124.aBoolean218 = Static94.anIntArray231[local23] == 1;
							Static176.method2833(local1124);
							continue;
						}
						if (local225 == 1116) {
							local23--;
							local1124.anInt3664 = Static94.anIntArray231[local23];
							Static176.method2833(local1124);
							continue;
						}
						if (local225 == 1117) {
							local23--;
							local1124.anInt3663 = Static94.anIntArray231[local23];
							Static176.method2833(local1124);
							continue;
						}
						if (local225 == 1118) {
							local23--;
							local1124.aBoolean213 = Static94.anIntArray231[local23] == 1;
							Static176.method2833(local1124);
							continue;
						}
						if (local225 == 1119) {
							local23--;
							local1124.aBoolean225 = Static94.anIntArray231[local23] == 1;
							Static176.method2833(local1124);
							continue;
						}
						if (local225 == 1120) {
							local23 -= 2;
							local1124.anInt3637 = Static94.anIntArray231[local23];
							local1124.anInt3632 = Static94.anIntArray231[local23 + 1];
							Static176.method2833(local1124);
							if (local1124.anInt3640 == 0) {
								Static96.method1670(false, local1124);
							}
							continue;
						}
						if (local225 == 1121) {
							Static176.method2833(local1124);
							local23--;
							continue;
						}
						if (local225 == 1122) {
							local23--;
							local1124.aBoolean223 = Static94.anIntArray231[local23] == 1;
							Static176.method2833(local1124);
							continue;
						}
					} else if (local225 >= 1200 && local225 < 1300 || local225 >= 2200 && local225 < 2300) {
						if (local225 >= 2000) {
							local225 -= 1000;
							local23--;
							local1124 = Static212.method3256(Static94.anIntArray231[local23]);
						} else {
							local1124 = local972 ? Static179.aClass80_14 : Static114.aClass80_10;
						}
						Static176.method2833(local1124);
						if (local225 == 1200 || local225 == 1205) {
							local23 -= 2;
							local1001 = Static94.anIntArray231[local23 + 1];
							local779 = Static94.anIntArray231[local23];
							if (local779 == -1) {
								local1124.anInt3645 = -1;
								local1124.anInt3651 = -1;
								local1124.anInt3665 = 1;
							} else {
								local1124.anInt3645 = local779;
								local1124.anInt3685 = local1001;
								@Pc(1380) Class2_Sub2_Sub15 local1380 = Static63.method1158(local779);
								local1124.anInt3626 = local1380.anInt3125;
								local1124.anInt3700 = local1380.anInt3121;
								local1124.anInt3693 = local1380.anInt3119;
								if (local225 == 1205) {
									local1124.aBoolean220 = false;
								} else {
									local1124.aBoolean220 = true;
								}
								local1124.anInt3674 = local1380.anInt3122;
								local1124.anInt3704 = local1380.anInt3102;
								local1124.anInt3686 = local1380.anInt3136;
								if (local1124.anInt3678 > 0) {
									local1124.anInt3686 = local1124.anInt3686 * 32 / local1124.anInt3678;
								} else if (local1124.anInt3696 > 0) {
									local1124.anInt3686 = local1124.anInt3686 * 32 / local1124.anInt3696;
								}
							}
							continue;
						}
						if (local225 == 1201) {
							local1124.anInt3665 = 2;
							local23--;
							local1124.anInt3651 = Static94.anIntArray231[local23];
							continue;
						}
						if (local225 == 1202) {
							local1124.anInt3665 = 3;
							local1124.anInt3651 = Static213.aClass12_Sub3_Sub1_1.aClass91_1.method2927();
							continue;
						}
						if (local225 == 1203) {
							local1124.anInt3665 = 6;
							local23--;
							local1124.anInt3651 = Static94.anIntArray231[local23];
							continue;
						}
						if (local225 == 1204) {
							local1124.anInt3665 = 5;
							local23--;
							local1124.anInt3651 = Static94.anIntArray231[local23];
							continue;
						}
					} else if ((local225 < 1300 || local225 >= 1400) && (local225 < 2300 || local225 >= 2400)) {
						if (local225 >= 1400 && local225 < 1500 || local225 >= 2400 && local225 < 2500) {
							@Pc(1540) int[] local1540 = null;
							if (local225 < 2000) {
								local1124 = local972 ? Static179.aClass80_14 : Static114.aClass80_10;
							} else {
								local23--;
								local1124 = Static212.method3256(Static94.anIntArray231[local23]);
								local225 -= 1000;
							}
							local37--;
							local1566 = Static153.aClass41Array53[local37];
							if (local1566.method1393() > 0 && local1566.method1388(local1566.method1393() - 1) == 89) {
								local23--;
								local633 = Static94.anIntArray231[local23];
								if (local633 > 0) {
									local1540 = new int[local633];
									while (local633-- > 0) {
										local23--;
										local1540[local633] = Static94.anIntArray231[local23];
									}
								}
								local1566 = local1566.method1412(0, local1566.method1393() - 1);
							}
							@Pc(1627) Object[] local1627 = new Object[local1566.method1393() + 1];
							for (local658 = local1627.length - 1; local658 >= 1; local658--) {
								if (local1566.method1388(local658 - 1) == 115) {
									local37--;
									local1627[local658] = Static153.aClass41Array53[local37];
								} else {
									local23--;
									local1627[local658] = Integer.valueOf(Static94.anIntArray231[local23]);
								}
							}
							local23--;
							local1032 = Static94.anIntArray231[local23];
							if (local1032 == -1) {
								local1627 = null;
							} else {
								local1627[0] = Integer.valueOf(local1032);
							}
							if (local225 == 1417) {
								local1124.anObjectArray22 = local1627;
							}
							if (local225 == 1403) {
								local1124.anObjectArray4 = local1627;
							}
							if (local225 == 1421) {
								local1124.anObjectArray6 = local1627;
							}
							if (local225 == 1407) {
								local1124.anObjectArray23 = local1627;
								local1124.anIntArray388 = local1540;
							}
							if (local225 == 1408) {
								local1124.anObjectArray21 = local1627;
							}
							if (local225 == 1412) {
								local1124.anObjectArray29 = local1627;
							}
							if (local225 == 1418) {
								local1124.anObjectArray30 = local1627;
							}
							if (local225 == 1405) {
								local1124.anObjectArray20 = local1627;
							}
							if (local225 == 1402) {
								local1124.anObjectArray8 = local1627;
							}
							if (local225 == 1420) {
								local1124.anObjectArray24 = local1627;
							}
							if (local225 == 1400) {
								local1124.anObjectArray25 = local1627;
							}
							if (local225 == 1425) {
								local1124.anObjectArray28 = local1627;
							}
							if (local225 == 1404) {
								local1124.anObjectArray17 = local1627;
							}
							if (local225 == 1427) {
								local1124.anObjectArray10 = local1627;
							}
							if (local225 == 1423) {
								local1124.anObjectArray11 = local1627;
							}
							if (local225 == 1401) {
								local1124.anObjectArray27 = local1627;
							}
							if (local225 == 1422) {
								local1124.anObjectArray15 = local1627;
							}
							if (local225 == 1409) {
								local1124.anObjectArray7 = local1627;
							}
							if (local225 == 1419) {
								local1124.anObjectArray5 = local1627;
							}
							if (local225 == 1414) {
								local1124.anObjectArray14 = local1627;
								local1124.anIntArray379 = local1540;
							}
							if (local225 == 1406) {
								local1124.anObjectArray13 = local1627;
							}
							local1124.aBoolean219 = true;
							if (local225 == 1411) {
								local1124.anObjectArray18 = local1627;
							}
							if (local225 == 1415) {
								local1124.anIntArray383 = local1540;
								local1124.anObjectArray19 = local1627;
							}
							if (local225 == 1416) {
								local1124.anObjectArray16 = local1627;
							}
							if (local225 == 1424) {
								local1124.anObjectArray26 = local1627;
							}
							if (local225 == 1410) {
								local1124.anObjectArray9 = local1627;
							}
							continue;
						}
						if (local225 < 1600) {
							local1124 = local972 ? Static179.aClass80_14 : Static114.aClass80_10;
							if (local225 == 1500) {
								Static94.anIntArray231[local23++] = local1124.anInt3627;
								continue;
							}
							if (local225 == 1501) {
								Static94.anIntArray231[local23++] = local1124.anInt3671;
								continue;
							}
							if (local225 == 1502) {
								Static94.anIntArray231[local23++] = local1124.anInt3635;
								continue;
							}
							if (local225 == 1503) {
								Static94.anIntArray231[local23++] = local1124.anInt3660;
								continue;
							}
							if (local225 == 1504) {
								Static94.anIntArray231[local23++] = local1124.aBoolean212 ? 1 : 0;
								continue;
							}
							if (local225 == 1505) {
								Static94.anIntArray231[local23++] = local1124.anInt3697;
								continue;
							}
						} else if (local225 < 1700) {
							local1124 = local972 ? Static179.aClass80_14 : Static114.aClass80_10;
							if (local225 == 1600) {
								Static94.anIntArray231[local23++] = local1124.anInt3642;
								continue;
							}
							if (local225 == 1601) {
								Static94.anIntArray231[local23++] = local1124.anInt3655;
								continue;
							}
							if (local225 == 1602) {
								Static153.aClass41Array53[local37++] = local1124.aClass41_979;
								continue;
							}
							if (local225 == 1603) {
								Static94.anIntArray231[local23++] = local1124.anInt3637;
								continue;
							}
							if (local225 == 1604) {
								Static94.anIntArray231[local23++] = local1124.anInt3632;
								continue;
							}
							if (local225 == 1605) {
								Static94.anIntArray231[local23++] = local1124.anInt3686;
								continue;
							}
							if (local225 == 1606) {
								Static94.anIntArray231[local23++] = local1124.anInt3674;
								continue;
							}
							if (local225 == 1607) {
								Static94.anIntArray231[local23++] = local1124.anInt3704;
								continue;
							}
							if (local225 == 1608) {
								Static94.anIntArray231[local23++] = local1124.anInt3700;
								continue;
							}
							if (local225 == 1609) {
								Static94.anIntArray231[local23++] = local1124.anInt3684;
								continue;
							}
						} else if (local225 < 1800) {
							local1124 = local972 ? Static179.aClass80_14 : Static114.aClass80_10;
							if (local225 == 1700) {
								Static94.anIntArray231[local23++] = local1124.anInt3645;
								continue;
							}
							if (local225 == 1701) {
								if (local1124.anInt3645 == -1) {
									Static94.anIntArray231[local23++] = 0;
								} else {
									Static94.anIntArray231[local23++] = local1124.anInt3685;
								}
								continue;
							}
							if (local225 == 1702) {
								Static94.anIntArray231[local23++] = local1124.anInt3649;
								continue;
							}
						} else if (local225 < 1900) {
							local1124 = local972 ? Static179.aClass80_14 : Static114.aClass80_10;
							if (local225 == 1800) {
								Static94.anIntArray231[local23++] = Static76.method598(Static70.method1287(local1124));
								continue;
							}
							if (local225 == 1801) {
								local23--;
								local779 = Static94.anIntArray231[local23];
								local779--;
								if (local1124.aClass41Array55 != null && local1124.aClass41Array55.length > local779 && local1124.aClass41Array55[local779] != null) {
									Static153.aClass41Array53[local37++] = local1124.aClass41Array55[local779];
									continue;
								}
								Static153.aClass41Array53[local37++] = Static71.aClass41_579;
								continue;
							}
							if (local225 == 1802) {
								if (local1124.aClass41_982 == null) {
									Static153.aClass41Array53[local37++] = Static71.aClass41_579;
								} else {
									Static153.aClass41Array53[local37++] = local1124.aClass41_982;
								}
								continue;
							}
						} else if (local225 < 2600) {
							local23--;
							local1124 = Static212.method3256(Static94.anIntArray231[local23]);
							if (local225 == 2500) {
								Static94.anIntArray231[local23++] = local1124.anInt3627;
								continue;
							}
							if (local225 == 2501) {
								Static94.anIntArray231[local23++] = local1124.anInt3671;
								continue;
							}
							if (local225 == 2502) {
								Static94.anIntArray231[local23++] = local1124.anInt3635;
								continue;
							}
							if (local225 == 2503) {
								Static94.anIntArray231[local23++] = local1124.anInt3660;
								continue;
							}
							if (local225 == 2504) {
								Static94.anIntArray231[local23++] = local1124.aBoolean212 ? 1 : 0;
								continue;
							}
							if (local225 == 2505) {
								Static94.anIntArray231[local23++] = local1124.anInt3697;
								continue;
							}
						} else if (local225 < 2700) {
							local23--;
							local1124 = Static212.method3256(Static94.anIntArray231[local23]);
							if (local225 == 2600) {
								Static94.anIntArray231[local23++] = local1124.anInt3642;
								continue;
							}
							if (local225 == 2601) {
								Static94.anIntArray231[local23++] = local1124.anInt3655;
								continue;
							}
							if (local225 == 2602) {
								Static153.aClass41Array53[local37++] = local1124.aClass41_979;
								continue;
							}
							if (local225 == 2603) {
								Static94.anIntArray231[local23++] = local1124.anInt3637;
								continue;
							}
							if (local225 == 2604) {
								Static94.anIntArray231[local23++] = local1124.anInt3632;
								continue;
							}
							if (local225 == 2605) {
								Static94.anIntArray231[local23++] = local1124.anInt3686;
								continue;
							}
							if (local225 == 2606) {
								Static94.anIntArray231[local23++] = local1124.anInt3674;
								continue;
							}
							if (local225 == 2607) {
								Static94.anIntArray231[local23++] = local1124.anInt3704;
								continue;
							}
							if (local225 == 2608) {
								Static94.anIntArray231[local23++] = local1124.anInt3700;
								continue;
							}
							if (local225 == 2609) {
								Static94.anIntArray231[local23++] = local1124.anInt3684;
								continue;
							}
						} else if (local225 < 2800) {
							if (local225 == 2700) {
								local23--;
								local1124 = Static212.method3256(Static94.anIntArray231[local23]);
								Static94.anIntArray231[local23++] = local1124.anInt3645;
								continue;
							}
							if (local225 == 2701) {
								local23--;
								local1124 = Static212.method3256(Static94.anIntArray231[local23]);
								if (local1124.anInt3645 == -1) {
									Static94.anIntArray231[local23++] = 0;
								} else {
									Static94.anIntArray231[local23++] = local1124.anInt3685;
								}
								continue;
							}
							if (local225 == 2702) {
								local23--;
								local785 = Static94.anIntArray231[local23];
								@Pc(8346) Class2_Sub21 local8346 = (Class2_Sub21) Static113.aClass70_8.method2205((long) local785);
								if (local8346 == null) {
									Static94.anIntArray231[local23++] = 0;
								} else {
									Static94.anIntArray231[local23++] = 1;
								}
								continue;
							}
							if (local225 == 2703) {
								local23--;
								local1124 = Static212.method3256(Static94.anIntArray231[local23]);
								if (local1124.aClass80Array1 == null) {
									Static94.anIntArray231[local23++] = 0;
									continue;
								}
								local779 = local1124.aClass80Array1.length;
								for (local1001 = 0; local1001 < local1124.aClass80Array1.length; local1001++) {
									if (local1124.aClass80Array1[local1001] == null) {
										local779 = local1001;
										break;
									}
								}
								Static94.anIntArray231[local23++] = local779;
								continue;
							}
							if (local225 == 2704 || local225 == 2705) {
								local23 -= 2;
								local785 = Static94.anIntArray231[local23];
								local779 = Static94.anIntArray231[local23 + 1];
								@Pc(8438) Class2_Sub21 local8438 = (Class2_Sub21) Static113.aClass70_8.method2205((long) local785);
								if (local8438 != null && local8438.anInt3435 == local779) {
									Static94.anIntArray231[local23++] = 1;
									continue;
								}
								Static94.anIntArray231[local23++] = 0;
								continue;
							}
						} else if (local225 < 2900) {
							local23--;
							local1124 = Static212.method3256(Static94.anIntArray231[local23]);
							if (local225 == 2800) {
								Static94.anIntArray231[local23++] = Static76.method598(Static70.method1287(local1124));
								continue;
							}
							if (local225 == 2801) {
								local23--;
								local779 = Static94.anIntArray231[local23];
								local779--;
								if (local1124.aClass41Array55 != null && local1124.aClass41Array55.length > local779 && local1124.aClass41Array55[local779] != null) {
									Static153.aClass41Array53[local37++] = local1124.aClass41Array55[local779];
									continue;
								}
								Static153.aClass41Array53[local37++] = Static71.aClass41_579;
								continue;
							}
							if (local225 == 2802) {
								if (local1124.aClass41_982 == null) {
									Static153.aClass41Array53[local37++] = Static71.aClass41_579;
								} else {
									Static153.aClass41Array53[local37++] = local1124.aClass41_982;
								}
								continue;
							}
						} else if (local225 < 3200) {
							if (local225 == 3100) {
								local37--;
								local593 = Static153.aClass41Array53[local37];
								Static198.method3075(local593, 0, Static71.aClass41_579);
								continue;
							}
							if (local225 == 3101) {
								local23 -= 2;
								Static200.method3113(Static94.anIntArray231[local23], Static94.anIntArray231[local23 + 1], Static213.aClass12_Sub3_Sub1_1);
								continue;
							}
							if (local225 == 3103) {
								Static27.method1631();
								continue;
							}
							if (local225 == 3104) {
								local37--;
								local593 = Static153.aClass41Array53[local37];
								local779 = 0;
								if (local593.method1410()) {
									local779 = local593.method1392();
								}
								Static131.aClass2_Sub3_Sub1_2.method221(152);
								Static131.aClass2_Sub3_Sub1_2.method200(local779);
								continue;
							}
							if (local225 == 3105) {
								local37--;
								local593 = Static153.aClass41Array53[local37];
								Static131.aClass2_Sub3_Sub1_2.method221(54);
								Static131.aClass2_Sub3_Sub1_2.method190(local593.method1419());
								continue;
							}
							if (local225 == 3106) {
								local37--;
								local593 = Static153.aClass41Array53[local37];
								Static131.aClass2_Sub3_Sub1_2.method221(60);
								Static131.aClass2_Sub3_Sub1_2.method208(local593.method1393() + 1);
								Static131.aClass2_Sub3_Sub1_2.method198(local593);
								continue;
							}
							if (local225 == 3107) {
								local23--;
								local785 = Static94.anIntArray231[local23];
								local37--;
								local1566 = Static153.aClass41Array53[local37];
								Static16.method306(local1566, local785);
								continue;
							}
							if (local225 == 3108) {
								local23 -= 3;
								local785 = Static94.anIntArray231[local23];
								local779 = Static94.anIntArray231[local23 + 1];
								local1001 = Static94.anIntArray231[local23 + 2];
								local1011 = Static212.method3256(local1001);
								Static70.method1289(local785, local779, local1011);
								continue;
							}
							if (local225 == 3109) {
								local23 -= 2;
								local785 = Static94.anIntArray231[local23];
								local779 = Static94.anIntArray231[local23 + 1];
								local1193 = local972 ? Static179.aClass80_14 : Static114.aClass80_10;
								Static70.method1289(local785, local779, local1193);
								continue;
							}
							if (local225 == 3110) {
								local23--;
								local785 = Static94.anIntArray231[local23];
								Static131.aClass2_Sub3_Sub1_2.method221(194);
								Static131.aClass2_Sub3_Sub1_2.method167(local785);
								continue;
							}
						} else if (local225 < 3300) {
							if (local225 == 3200) {
								local23 -= 3;
								Static80.method1467(Static94.anIntArray231[local23 + 1], Static94.anIntArray231[local23 + 2], Static94.anIntArray231[local23]);
								continue;
							}
							if (local225 == 3201) {
								local23--;
								Static102.method1754(Static94.anIntArray231[local23]);
								continue;
							}
							if (local225 == 3202) {
								local23 -= 2;
								Static4.method84(Static94.anIntArray231[local23], Static94.anIntArray231[local23 + 1]);
								continue;
							}
						} else if (local225 < 3400) {
							if (local225 == 3300) {
								Static94.anIntArray231[local23++] = Static103.anInt2511;
								continue;
							}
							if (local225 == 3301) {
								local23 -= 2;
								local779 = Static94.anIntArray231[local23 + 1];
								local785 = Static94.anIntArray231[local23];
								Static94.anIntArray231[local23++] = Static36.method694(local779, local785);
								continue;
							}
							if (local225 == 3302) {
								local23 -= 2;
								local785 = Static94.anIntArray231[local23];
								local779 = Static94.anIntArray231[local23 + 1];
								Static94.anIntArray231[local23++] = Static95.method1658(local785, local779);
								continue;
							}
							if (local225 == 3303) {
								local23 -= 2;
								local779 = Static94.anIntArray231[local23 + 1];
								local785 = Static94.anIntArray231[local23];
								Static94.anIntArray231[local23++] = Static218.method3310(local785, local779);
								continue;
							}
							if (local225 == 3304) {
								local23--;
								local785 = Static94.anIntArray231[local23];
								Static94.anIntArray231[local23++] = Static60.method3312(local785).anInt2445;
								continue;
							}
							if (local225 == 3305) {
								local23--;
								local785 = Static94.anIntArray231[local23];
								Static94.anIntArray231[local23++] = Static92.anIntArray228[local785];
								continue;
							}
							if (local225 == 3306) {
								local23--;
								local785 = Static94.anIntArray231[local23];
								Static94.anIntArray231[local23++] = Static192.anIntArray452[local785];
								continue;
							}
							if (local225 == 3307) {
								local23--;
								local785 = Static94.anIntArray231[local23];
								Static94.anIntArray231[local23++] = Static160.anIntArray398[local785];
								continue;
							}
							if (local225 == 3308) {
								local785 = Static134.anInt3147;
								local1001 = (Static213.aClass12_Sub3_Sub1_1.anInt3949 >> 7) + Static168.anInt3899;
								local779 = Static198.anInt4451 + (Static213.aClass12_Sub3_Sub1_1.anInt3961 >> 7);
								Static94.anIntArray231[local23++] = local1001 + (local779 << 14) + (local785 << 28);
								continue;
							}
							if (local225 == 3309) {
								local23--;
								local785 = Static94.anIntArray231[local23];
								Static94.anIntArray231[local23++] = local785 >> 14 & 0x3FFF;
								continue;
							}
							if (local225 == 3310) {
								local23--;
								local785 = Static94.anIntArray231[local23];
								Static94.anIntArray231[local23++] = local785 >> 28;
								continue;
							}
							if (local225 == 3311) {
								local23--;
								local785 = Static94.anIntArray231[local23];
								Static94.anIntArray231[local23++] = local785 & 0x3FFF;
								continue;
							}
							if (local225 == 3312) {
								Static94.anIntArray231[local23++] = Static60.aBoolean291 ? 1 : 0;
								continue;
							}
							if (local225 == 3313) {
								local23 -= 2;
								local779 = Static94.anIntArray231[local23 + 1];
								local785 = Static94.anIntArray231[local23] + 32768;
								Static94.anIntArray231[local23++] = Static36.method694(local779, local785);
								continue;
							}
							if (local225 == 3314) {
								local23 -= 2;
								local785 = Static94.anIntArray231[local23] + 32768;
								local779 = Static94.anIntArray231[local23 + 1];
								Static94.anIntArray231[local23++] = Static95.method1658(local785, local779);
								continue;
							}
							if (local225 == 3315) {
								local23 -= 2;
								local785 = Static94.anIntArray231[local23] + 32768;
								local779 = Static94.anIntArray231[local23 + 1];
								Static94.anIntArray231[local23++] = Static218.method3310(local785, local779);
								continue;
							}
							if (local225 == 3316) {
								if (Static60.anInt4780 < 2) {
									Static94.anIntArray231[local23++] = 0;
								} else {
									Static94.anIntArray231[local23++] = Static60.anInt4780;
								}
								continue;
							}
							if (local225 == 3317) {
								Static94.anIntArray231[local23++] = Static100.anInt2441;
								continue;
							}
							if (local225 == 3318) {
								Static94.anIntArray231[local23++] = Static26.anInt662;
								continue;
							}
							if (local225 == 3321) {
								Static94.anIntArray231[local23++] = Static213.anInt4716;
								continue;
							}
							if (local225 == 3322) {
								Static94.anIntArray231[local23++] = Static175.anInt4104;
								continue;
							}
							if (local225 == 3323) {
								if (Static27.anInt2299 >= 5 && Static27.anInt2299 <= 9) {
									Static94.anIntArray231[local23++] = 1;
									continue;
								}
								Static94.anIntArray231[local23++] = 0;
								continue;
							}
							if (local225 == 3324) {
								if (Static27.anInt2299 >= 5 && Static27.anInt2299 <= 9) {
									Static94.anIntArray231[local23++] = Static27.anInt2299;
									continue;
								}
								Static94.anIntArray231[local23++] = 0;
								continue;
							}
							if (local225 == 3325) {
								if (Static5.anInt277 > 0) {
									Static94.anIntArray231[local23++] = 1;
								} else {
									Static94.anIntArray231[local23++] = 0;
								}
								continue;
							}
							if (local225 == 3326) {
								Static94.anIntArray231[local23++] = Static213.aClass12_Sub3_Sub1_1.anInt1203;
								continue;
							}
							if (local225 == 3327) {
								Static94.anIntArray231[local23++] = Static213.aClass12_Sub3_Sub1_1.aClass91_1.aBoolean263 ? 1 : 0;
								continue;
							}
							if (local225 == 3328) {
								Static94.anIntArray231[local23++] = Static211.anInt4700;
								continue;
							}
							if (local225 == 3329) {
								Static94.anIntArray231[local23++] = Static158.anInt3725;
								continue;
							}
						} else if (local225 < 3500) {
							if (local225 == 3400) {
								local23 -= 2;
								local785 = Static94.anIntArray231[local23];
								local779 = Static94.anIntArray231[local23 + 1];
								@Pc(7414) Class2_Sub2_Sub6 local7414 = Static150.method2351(local785);
								Static153.aClass41Array53[local37++] = local7414.method902(local779);
								continue;
							}
							if (local225 == 3408) {
								local23 -= 4;
								local779 = Static94.anIntArray231[local23 + 1];
								local1001 = Static94.anIntArray231[local23 + 2];
								local633 = Static94.anIntArray231[local23 + 3];
								local785 = Static94.anIntArray231[local23];
								@Pc(7454) Class2_Sub2_Sub6 local7454 = Static150.method2351(local1001);
								if (local785 == local7454.anInt1287 && local779 == local7454.anInt1293) {
									if (local779 == 115) {
										Static153.aClass41Array53[local37++] = local7454.method902(local633);
									} else {
										Static94.anIntArray231[local23++] = local7454.method898(local633);
									}
									continue;
								}
								if (local779 == 115) {
									Static153.aClass41Array53[local37++] = Static13.aClass41_81;
								} else {
									Static94.anIntArray231[local23++] = 0;
								}
								continue;
							}
						} else if (local225 < 3700) {
							if (local225 == 3600) {
								if (Static101.anInt2450 == 0) {
									Static94.anIntArray231[local23++] = -2;
								} else if (Static101.anInt2450 == 1) {
									Static94.anIntArray231[local23++] = -1;
								} else {
									Static94.anIntArray231[local23++] = Static131.anInt2996;
								}
								continue;
							}
							if (local225 == 3601) {
								local23--;
								local785 = Static94.anIntArray231[local23];
								if (Static101.anInt2450 == 2 && local785 < Static131.anInt2996) {
									Static153.aClass41Array53[local37++] = Static21.aClass41Array71[local785];
									continue;
								}
								Static153.aClass41Array53[local37++] = Static71.aClass41_579;
								continue;
							}
							if (local225 == 3602) {
								local23--;
								local785 = Static94.anIntArray231[local23];
								if (Static101.anInt2450 == 2 && local785 < Static131.anInt2996) {
									Static94.anIntArray231[local23++] = Static145.anIntArray341[local785];
									continue;
								}
								Static94.anIntArray231[local23++] = 0;
								continue;
							}
							if (local225 == 3603) {
								local23--;
								local785 = Static94.anIntArray231[local23];
								if (Static101.anInt2450 == 2 && local785 < Static131.anInt2996) {
									Static94.anIntArray231[local23++] = Static42.anIntArray11[local785];
									continue;
								}
								Static94.anIntArray231[local23++] = 0;
								continue;
							}
							if (local225 == 3604) {
								local37--;
								local593 = Static153.aClass41Array53[local37];
								local23--;
								local779 = Static94.anIntArray231[local23];
								Static153.method2491(local593, local779);
								continue;
							}
							if (local225 == 3605) {
								local37--;
								local593 = Static153.aClass41Array53[local37];
								Static11.method288(local593.method1419());
								continue;
							}
							if (local225 == 3606) {
								local37--;
								local593 = Static153.aClass41Array53[local37];
								Static100.method1724(local593.method1419());
								continue;
							}
							if (local225 == 3607) {
								local37--;
								local593 = Static153.aClass41Array53[local37];
								Static10.method279(local593.method1419());
								continue;
							}
							if (local225 == 3608) {
								local37--;
								local593 = Static153.aClass41Array53[local37];
								Static131.method2085(local593.method1419());
								continue;
							}
							if (local225 == 3609) {
								local37--;
								local593 = Static153.aClass41Array53[local37];
								if (local593.method1408(Static159.aClass41_1001) || local593.method1408(Static147.aClass41_927)) {
									local593 = local593.method1424(7);
								}
								Static94.anIntArray231[local23++] = method2032(local593) ? 1 : 0;
								continue;
							}
							if (local225 == 3610) {
								local23--;
								local785 = Static94.anIntArray231[local23];
								if (Static101.anInt2450 == 2 && Static131.anInt2996 > local785) {
									Static153.aClass41Array53[local37++] = Static151.aClass41Array51[local785];
									continue;
								}
								Static153.aClass41Array53[local37++] = Static71.aClass41_579;
								continue;
							}
							if (local225 == 3611) {
								if (Static197.aClass41_1170 == null) {
									Static153.aClass41Array53[local37++] = Static71.aClass41_579;
								} else {
									Static153.aClass41Array53[local37++] = Static197.aClass41_1170.method1403();
								}
								continue;
							}
							if (local225 == 3612) {
								if (Static197.aClass41_1170 == null) {
									Static94.anIntArray231[local23++] = 0;
								} else {
									Static94.anIntArray231[local23++] = Static43.anInt1296;
								}
								continue;
							}
							if (local225 == 3613) {
								local23--;
								local785 = Static94.anIntArray231[local23];
								if (Static197.aClass41_1170 != null && Static43.anInt1296 > local785) {
									Static153.aClass41Array53[local37++] = Static77.aClass2_Sub10Array1[local785].aClass41_532.method1403();
									continue;
								}
								Static153.aClass41Array53[local37++] = Static71.aClass41_579;
								continue;
							}
							if (local225 == 3614) {
								local23--;
								local785 = Static94.anIntArray231[local23];
								if (Static197.aClass41_1170 != null && Static43.anInt1296 > local785) {
									Static94.anIntArray231[local23++] = Static77.aClass2_Sub10Array1[local785].anInt1691;
									continue;
								}
								Static94.anIntArray231[local23++] = 0;
								continue;
							}
							if (local225 == 3615) {
								local23--;
								local785 = Static94.anIntArray231[local23];
								if (Static197.aClass41_1170 != null && Static43.anInt1296 > local785) {
									Static94.anIntArray231[local23++] = Static77.aClass2_Sub10Array1[local785].aByte2;
									continue;
								}
								Static94.anIntArray231[local23++] = 0;
								continue;
							}
							if (local225 == 3616) {
								Static94.anIntArray231[local23++] = Static152.aByte10;
								continue;
							}
							if (local225 == 3617) {
								local37--;
								local593 = Static153.aClass41Array53[local37];
								Static88.method1556(local593);
								continue;
							}
							if (local225 == 3618) {
								Static94.anIntArray231[local23++] = Static128.aByte7;
								continue;
							}
							if (local225 == 3619) {
								local37--;
								local593 = Static153.aClass41Array53[local37];
								method2031(local593.method1419());
								continue;
							}
							if (local225 == 3620) {
								Static220.method3333();
								continue;
							}
							if (local225 == 3621) {
								if (Static101.anInt2450 == 0) {
									Static94.anIntArray231[local23++] = -1;
								} else {
									Static94.anIntArray231[local23++] = Static60.anInt4785;
								}
								continue;
							}
							if (local225 == 3622) {
								local23--;
								local785 = Static94.anIntArray231[local23];
								if (Static101.anInt2450 != 0 && local785 < Static60.anInt4785) {
									Static153.aClass41Array53[local37++] = Static176.method2837(Static83.aLongArray6[local785]).method1403();
									continue;
								}
								Static153.aClass41Array53[local37++] = Static71.aClass41_579;
								continue;
							}
							if (local225 == 3623) {
								local37--;
								local593 = Static153.aClass41Array53[local37];
								if (local593.method1408(Static159.aClass41_1001) || local593.method1408(Static147.aClass41_927)) {
									local593 = local593.method1424(7);
								}
								Static94.anIntArray231[local23++] = Static147.method2314(local593) ? 1 : 0;
								continue;
							}
							if (local225 == 3624) {
								local23--;
								local785 = Static94.anIntArray231[local23];
								if (Static77.aClass2_Sub10Array1 != null && Static43.anInt1296 > local785 && Static77.aClass2_Sub10Array1[local785].aClass41_532.method1413(Static213.aClass12_Sub3_Sub1_1.aClass41_362)) {
									Static94.anIntArray231[local23++] = 1;
									continue;
								}
								Static94.anIntArray231[local23++] = 0;
								continue;
							}
							if (local225 == 3625) {
								if (Static199.aClass41_1186 == null) {
									Static153.aClass41Array53[local37++] = Static71.aClass41_579;
								} else {
									Static153.aClass41Array53[local37++] = Static199.aClass41_1186.method1403();
								}
								continue;
							}
							if (local225 == 3626) {
								local23--;
								local785 = Static94.anIntArray231[local23];
								if (Static197.aClass41_1170 != null && Static43.anInt1296 > local785) {
									Static153.aClass41Array53[local37++] = Static77.aClass2_Sub10Array1[local785].aClass41_530;
									continue;
								}
								Static153.aClass41Array53[local37++] = Static71.aClass41_579;
								continue;
							}
							if (local225 == 3627) {
								local23--;
								local785 = Static94.anIntArray231[local23];
								if (Static101.anInt2450 == 2 && local785 >= 0 && local785 < Static131.anInt2996) {
									Static94.anIntArray231[local23++] = Static54.aBooleanArray5[local785] ? 1 : 0;
									continue;
								}
								Static94.anIntArray231[local23++] = 0;
								continue;
							}
							if (local225 == 3628) {
								local37--;
								local593 = Static153.aClass41Array53[local37];
								if (local593.method1408(Static159.aClass41_1001) || local593.method1408(Static147.aClass41_927)) {
									local593 = local593.method1424(7);
								}
								Static94.anIntArray231[local23++] = Static106.method1818(local593);
								continue;
							}
						} else if (local225 < 4000) {
							if (local225 == 3903) {
								local23--;
								local785 = Static94.anIntArray231[local23];
								Static94.anIntArray231[local23++] = Static8.aClass61Array1[local785].method1956();
								continue;
							}
							if (local225 == 3904) {
								local23--;
								local785 = Static94.anIntArray231[local23];
								Static94.anIntArray231[local23++] = Static8.aClass61Array1[local785].anInt2792;
								continue;
							}
							if (local225 == 3905) {
								local23--;
								local785 = Static94.anIntArray231[local23];
								Static94.anIntArray231[local23++] = Static8.aClass61Array1[local785].anInt2791;
								continue;
							}
							if (local225 == 3906) {
								local23--;
								local785 = Static94.anIntArray231[local23];
								Static94.anIntArray231[local23++] = Static8.aClass61Array1[local785].anInt2788;
								continue;
							}
							if (local225 == 3907) {
								local23--;
								local785 = Static94.anIntArray231[local23];
								Static94.anIntArray231[local23++] = Static8.aClass61Array1[local785].anInt2793;
								continue;
							}
							if (local225 == 3908) {
								local23--;
								local785 = Static94.anIntArray231[local23];
								Static94.anIntArray231[local23++] = Static8.aClass61Array1[local785].anInt2795;
								continue;
							}
							if (local225 == 3910) {
								local23--;
								local785 = Static94.anIntArray231[local23];
								local779 = Static8.aClass61Array1[local785].method1960();
								Static94.anIntArray231[local23++] = local779 == 0 ? 1 : 0;
								continue;
							}
							if (local225 == 3911) {
								local23--;
								local785 = Static94.anIntArray231[local23];
								local779 = Static8.aClass61Array1[local785].method1960();
								Static94.anIntArray231[local23++] = local779 == 2 ? 1 : 0;
								continue;
							}
							if (local225 == 3912) {
								local23--;
								local785 = Static94.anIntArray231[local23];
								local779 = Static8.aClass61Array1[local785].method1960();
								Static94.anIntArray231[local23++] = local779 == 5 ? 1 : 0;
								continue;
							}
							if (local225 == 3913) {
								local23--;
								local785 = Static94.anIntArray231[local23];
								local779 = Static8.aClass61Array1[local785].method1960();
								Static94.anIntArray231[local23++] = local779 == 1 ? 1 : 0;
								continue;
							}
						} else if (local225 < 4100) {
							if (local225 == 4000) {
								local23 -= 2;
								local785 = Static94.anIntArray231[local23];
								local779 = Static94.anIntArray231[local23 + 1];
								Static94.anIntArray231[local23++] = local785 + local779;
								continue;
							}
							if (local225 == 4001) {
								local23 -= 2;
								local785 = Static94.anIntArray231[local23];
								local779 = Static94.anIntArray231[local23 + 1];
								Static94.anIntArray231[local23++] = local785 - local779;
								continue;
							}
							if (local225 == 4002) {
								local23 -= 2;
								local779 = Static94.anIntArray231[local23 + 1];
								local785 = Static94.anIntArray231[local23];
								Static94.anIntArray231[local23++] = local785 * local779;
								continue;
							}
							if (local225 == 4003) {
								local23 -= 2;
								local785 = Static94.anIntArray231[local23];
								local779 = Static94.anIntArray231[local23 + 1];
								Static94.anIntArray231[local23++] = local785 / local779;
								continue;
							}
							if (local225 == 4004) {
								local23--;
								local785 = Static94.anIntArray231[local23];
								Static94.anIntArray231[local23++] = (int) (Math.random() * (double) local785);
								continue;
							}
							if (local225 == 4005) {
								local23--;
								local785 = Static94.anIntArray231[local23];
								Static94.anIntArray231[local23++] = (int) ((double) (local785 + 1) * Math.random());
								continue;
							}
							if (local225 == 4006) {
								local23 -= 5;
								local785 = Static94.anIntArray231[local23];
								local779 = Static94.anIntArray231[local23 + 1];
								local1001 = Static94.anIntArray231[local23 + 2];
								local633 = Static94.anIntArray231[local23 + 3];
								local658 = Static94.anIntArray231[local23 + 4];
								Static94.anIntArray231[local23++] = local785 + (local658 - local1001) * (-local785 + local779) / (local633 - local1001);
								continue;
							}
							@Pc(3814) long local3814;
							@Pc(3819) long local3819;
							if (local225 == 4007) {
								local23 -= 2;
								local3814 = Static94.anIntArray231[local23 + 1];
								local3819 = Static94.anIntArray231[local23];
								Static94.anIntArray231[local23++] = (int) (local3814 * local3819 / 100L + local3819);
								continue;
							}
							if (local225 == 4008) {
								local23 -= 2;
								local785 = Static94.anIntArray231[local23];
								local779 = Static94.anIntArray231[local23 + 1];
								Static94.anIntArray231[local23++] = 0x1 << local779 | local785;
								continue;
							}
							if (local225 == 4009) {
								local23 -= 2;
								local779 = Static94.anIntArray231[local23 + 1];
								local785 = Static94.anIntArray231[local23];
								Static94.anIntArray231[local23++] = local785 & -(0x1 << local779) - 1;
								continue;
							}
							if (local225 == 4010) {
								local23 -= 2;
								local779 = Static94.anIntArray231[local23 + 1];
								local785 = Static94.anIntArray231[local23];
								Static94.anIntArray231[local23++] = (local785 & 0x1 << local779) == 0 ? 0 : 1;
								continue;
							}
							if (local225 == 4011) {
								local23 -= 2;
								local779 = Static94.anIntArray231[local23 + 1];
								local785 = Static94.anIntArray231[local23];
								Static94.anIntArray231[local23++] = local785 % local779;
								continue;
							}
							if (local225 == 4012) {
								local23 -= 2;
								local785 = Static94.anIntArray231[local23];
								local779 = Static94.anIntArray231[local23 + 1];
								if (local785 == 0) {
									Static94.anIntArray231[local23++] = 0;
								} else {
									Static94.anIntArray231[local23++] = (int) Math.pow((double) local785, (double) local779);
								}
								continue;
							}
							if (local225 == 4013) {
								local23 -= 2;
								local785 = Static94.anIntArray231[local23];
								local779 = Static94.anIntArray231[local23 + 1];
								if (local785 == 0) {
									Static94.anIntArray231[local23++] = 0;
								} else if (local779 == 0) {
									Static94.anIntArray231[local23++] = Integer.MAX_VALUE;
								} else {
									Static94.anIntArray231[local23++] = (int) Math.pow((double) local785, 1.0D / (double) local779);
								}
								continue;
							}
							if (local225 == 4014) {
								local23 -= 2;
								local779 = Static94.anIntArray231[local23 + 1];
								local785 = Static94.anIntArray231[local23];
								Static94.anIntArray231[local23++] = local779 & local785;
								continue;
							}
							if (local225 == 4015) {
								local23 -= 2;
								local779 = Static94.anIntArray231[local23 + 1];
								local785 = Static94.anIntArray231[local23];
								Static94.anIntArray231[local23++] = local785 | local779;
								continue;
							}
							if (local225 == 4016) {
								local23 -= 2;
								local785 = Static94.anIntArray231[local23];
								local779 = Static94.anIntArray231[local23 + 1];
								Static94.anIntArray231[local23++] = local785 < local779 ? local785 : local779;
								continue;
							}
							if (local225 == 4017) {
								local23 -= 2;
								local785 = Static94.anIntArray231[local23];
								local779 = Static94.anIntArray231[local23 + 1];
								Static94.anIntArray231[local23++] = local785 <= local779 ? local779 : local785;
								continue;
							}
							if (local225 == 4018) {
								local23 -= 3;
								local3819 = Static94.anIntArray231[local23];
								local3814 = Static94.anIntArray231[local23 + 1];
								@Pc(4159) long local4159 = (long) Static94.anIntArray231[local23 + 2];
								Static94.anIntArray231[local23++] = (int) (local4159 * local3819 / local3814);
								continue;
							}
						} else if (local225 >= 4200) {
							@Pc(4465) Class2_Sub2_Sub1 local4465;
							if (local225 < 4300) {
								if (local225 == 4200) {
									local23--;
									local785 = Static94.anIntArray231[local23];
									Static153.aClass41Array53[local37++] = Static63.method1158(local785).aClass41_858;
									continue;
								}
								@Pc(4215) Class2_Sub2_Sub15 local4215;
								if (local225 == 4201) {
									local23 -= 2;
									local785 = Static94.anIntArray231[local23];
									local779 = Static94.anIntArray231[local23 + 1];
									local4215 = Static63.method1158(local785);
									if (local779 >= 1 && local779 <= 5 && local4215.aClass41Array46[local779 - 1] != null) {
										Static153.aClass41Array53[local37++] = local4215.aClass41Array46[local779 - 1];
										continue;
									}
									Static153.aClass41Array53[local37++] = Static71.aClass41_579;
									continue;
								}
								if (local225 == 4202) {
									local23 -= 2;
									local779 = Static94.anIntArray231[local23 + 1];
									local785 = Static94.anIntArray231[local23];
									local4215 = Static63.method1158(local785);
									if (local779 >= 1 && local779 <= 5 && local4215.aClass41Array47[local779 - 1] != null) {
										Static153.aClass41Array53[local37++] = local4215.aClass41Array47[local779 - 1];
										continue;
									}
									Static153.aClass41Array53[local37++] = Static71.aClass41_579;
									continue;
								}
								if (local225 == 4203) {
									local23--;
									local785 = Static94.anIntArray231[local23];
									Static94.anIntArray231[local23++] = Static63.method1158(local785).anInt3108;
									continue;
								}
								if (local225 == 4204) {
									local23--;
									local785 = Static94.anIntArray231[local23];
									Static94.anIntArray231[local23++] = Static63.method1158(local785).anInt3106 == 1 ? 1 : 0;
									continue;
								}
								@Pc(4358) Class2_Sub2_Sub15 local4358;
								if (local225 == 4205) {
									local23--;
									local785 = Static94.anIntArray231[local23];
									local4358 = Static63.method1158(local785);
									if (local4358.anInt3117 == -1 && local4358.anInt3097 >= 0) {
										Static94.anIntArray231[local23++] = local4358.anInt3097;
										continue;
									}
									Static94.anIntArray231[local23++] = local785;
									continue;
								}
								if (local225 == 4206) {
									local23--;
									local785 = Static94.anIntArray231[local23];
									local4358 = Static63.method1158(local785);
									if (local4358.anInt3117 >= 0 && local4358.anInt3097 >= 0) {
										Static94.anIntArray231[local23++] = local4358.anInt3097;
										continue;
									}
									Static94.anIntArray231[local23++] = local785;
									continue;
								}
								if (local225 == 4207) {
									local23--;
									local785 = Static94.anIntArray231[local23];
									Static94.anIntArray231[local23++] = Static63.method1158(local785).aBoolean179 ? 1 : 0;
									continue;
								}
								if (local225 == 4208) {
									local23 -= 2;
									local779 = Static94.anIntArray231[local23 + 1];
									local785 = Static94.anIntArray231[local23];
									local4465 = Static191.method3025(local779);
									if (local4465.method78()) {
										Static153.aClass41Array53[local37++] = Static63.method1158(local785).method2141(local4465.aClass41_38, local779);
									} else {
										Static94.anIntArray231[local23++] = Static63.method1158(local785).method2142(local779, local4465.anInt114);
									}
									continue;
								}
								if (local225 == 4210) {
									local23--;
									local779 = Static94.anIntArray231[local23];
									local37--;
									local593 = Static153.aClass41Array53[local37];
									Static62.method1148(local779 == 1, local593);
									Static94.anIntArray231[local23++] = Static180.anInt4180;
									continue;
								}
								if (local225 == 4211) {
									if (Static60.aShortArray162 != null && Static180.anInt4180 > Static102.anInt2493) {
										Static94.anIntArray231[local23++] = Static60.aShortArray162[Static102.anInt2493++] & 0xFFFF;
										continue;
									}
									Static94.anIntArray231[local23++] = -1;
									continue;
								}
								if (local225 == 4212) {
									Static102.anInt2493 = 0;
									continue;
								}
							} else if (local225 < 4400) {
								if (local225 == 4300) {
									local23 -= 2;
									local785 = Static94.anIntArray231[local23];
									local779 = Static94.anIntArray231[local23 + 1];
									local4465 = Static191.method3025(local779);
									if (local4465.method78()) {
										Static153.aClass41Array53[local37++] = Static132.method2097(local785).method1900(local779, local4465.aClass41_38);
									} else {
										Static94.anIntArray231[local23++] = Static132.method2097(local785).method1894(local4465.anInt114, local779);
									}
									continue;
								}
							} else if (local225 >= 4500) {
								if (local225 >= 4600) {
									if (local225 < 5100) {
										if (local225 == 5000) {
											Static94.anIntArray231[local23++] = Static60.anInt4778;
											continue;
										}
										if (local225 == 5001) {
											local23 -= 3;
											Static60.anInt4778 = Static94.anIntArray231[local23];
											Static9.anInt341 = Static94.anIntArray231[local23 + 1];
											Static113.anInt2749 = Static94.anIntArray231[local23 + 2];
											Static131.aClass2_Sub3_Sub1_2.method221(115);
											Static131.aClass2_Sub3_Sub1_2.method208(Static60.anInt4778);
											Static131.aClass2_Sub3_Sub1_2.method208(Static9.anInt341);
											Static131.aClass2_Sub3_Sub1_2.method208(Static113.anInt2749);
											continue;
										}
										if (local225 == 5002) {
											local23 -= 2;
											local779 = Static94.anIntArray231[local23];
											local37--;
											local593 = Static153.aClass41Array53[local37];
											local1001 = Static94.anIntArray231[local23 + 1];
											Static131.aClass2_Sub3_Sub1_2.method221(99);
											Static131.aClass2_Sub3_Sub1_2.method190(local593.method1419());
											Static131.aClass2_Sub3_Sub1_2.method208(local779 - 1);
											Static131.aClass2_Sub3_Sub1_2.method208(local1001);
											continue;
										}
										if (local225 == 5003) {
											local23--;
											local785 = Static94.anIntArray231[local23];
											local1566 = null;
											if (local785 < 100) {
												local1566 = Static188.aClass41Array68[local785];
											}
											if (local1566 == null) {
												local1566 = Static71.aClass41_579;
											}
											Static153.aClass41Array53[local37++] = local1566;
											continue;
										}
										if (local225 == 5004) {
											local779 = -1;
											local23--;
											local785 = Static94.anIntArray231[local23];
											if (local785 < 100 && Static188.aClass41Array68[local785] != null) {
												local779 = Static171.anIntArray419[local785];
											}
											Static94.anIntArray231[local23++] = local779;
											continue;
										}
										if (local225 == 5005) {
											Static94.anIntArray231[local23++] = Static9.anInt341;
											continue;
										}
										if (local225 == 5008) {
											local37--;
											local593 = Static153.aClass41Array53[local37];
											if (local593.method1408(Static106.aClass41_759)) {
												Static84.method1527(local593);
												continue;
											}
											if (Static60.anInt4780 == 0 && (Static211.anInt4700 == 1 || Static158.anInt3725 == 1)) {
												continue;
											}
											local1566 = local593.method1428();
											@Pc(4846) byte local4846 = 0;
											if (local1566.method1408(Static27.aClass41_681)) {
												local593 = local593.method1424(Static27.aClass41_681.method1393());
												local4846 = 0;
											} else if (local1566.method1408(Static88.aClass41_649)) {
												local4846 = 1;
												local593 = local593.method1424(Static88.aClass41_649.method1393());
											} else if (local1566.method1408(Static123.aClass41_332)) {
												local593 = local593.method1424(Static123.aClass41_332.method1393());
												local4846 = 2;
											} else if (local1566.method1408(Static214.aClass41_1264)) {
												local4846 = 3;
												local593 = local593.method1424(Static214.aClass41_1264.method1393());
											} else if (local1566.method1408(Static206.aClass41_1238)) {
												local593 = local593.method1424(Static206.aClass41_1238.method1393());
												local4846 = 4;
											} else if (local1566.method1408(Static65.aClass41_544)) {
												local593 = local593.method1424(Static65.aClass41_544.method1393());
												local4846 = 5;
											} else if (local1566.method1408(Static35.aClass41_262)) {
												local593 = local593.method1424(Static35.aClass41_262.method1393());
												local4846 = 6;
											} else if (local1566.method1408(Static170.aClass41_1048)) {
												local4846 = 7;
												local593 = local593.method1424(Static170.aClass41_1048.method1393());
											} else if (local1566.method1408(Static36.aClass41_270)) {
												local593 = local593.method1424(Static36.aClass41_270.method1393());
												local4846 = 8;
											} else if (local1566.method1408(Static176.aClass41_1086)) {
												local593 = local593.method1424(Static176.aClass41_1086.method1393());
												local4846 = 9;
											} else if (local1566.method1408(Static145.aClass41_918)) {
												local4846 = 10;
												local593 = local593.method1424(Static145.aClass41_918.method1393());
											} else if (local1566.method1408(Static170.aClass41_1055)) {
												local593 = local593.method1424(Static170.aClass41_1055.method1393());
												local4846 = 11;
											} else if (Static111.anInt2675 != 0) {
												if (local1566.method1408(Static27.aClass41_679)) {
													local4846 = 0;
													local593 = local593.method1424(Static27.aClass41_679.method1393());
												} else if (local1566.method1408(Static88.aClass41_652)) {
													local593 = local593.method1424(Static88.aClass41_652.method1393());
													local4846 = 1;
												} else if (local1566.method1408(Static123.aClass41_330)) {
													local4846 = 2;
													local593 = local593.method1424(Static123.aClass41_330.method1393());
												} else if (local1566.method1408(Static214.aClass41_1263)) {
													local4846 = 3;
													local593 = local593.method1424(Static214.aClass41_1263.method1393());
												} else if (local1566.method1408(Static206.aClass41_1239)) {
													local593 = local593.method1424(Static206.aClass41_1239.method1393());
													local4846 = 4;
												} else if (local1566.method1408(Static65.aClass41_543)) {
													local593 = local593.method1424(Static65.aClass41_543.method1393());
													local4846 = 5;
												} else if (local1566.method1408(Static35.aClass41_258)) {
													local593 = local593.method1424(Static35.aClass41_258.method1393());
													local4846 = 6;
												} else if (local1566.method1408(Static170.aClass41_1049)) {
													local4846 = 7;
													local593 = local593.method1424(Static170.aClass41_1049.method1393());
												} else if (local1566.method1408(Static36.aClass41_266)) {
													local593 = local593.method1424(Static36.aClass41_266.method1393());
													local4846 = 8;
												} else if (local1566.method1408(Static176.aClass41_1083)) {
													local593 = local593.method1424(Static176.aClass41_1083.method1393());
													local4846 = 9;
												} else if (local1566.method1408(Static145.aClass41_917)) {
													local4846 = 10;
													local593 = local593.method1424(Static145.aClass41_917.method1393());
												} else if (local1566.method1408(Static170.aClass41_1052)) {
													local593 = local593.method1424(Static170.aClass41_1052.method1393());
													local4846 = 11;
												}
											}
											local1566 = local593.method1428();
											@Pc(5236) byte local5236 = 0;
											if (local1566.method1408(Static52.aClass41_429)) {
												local5236 = 1;
												local593 = local593.method1424(Static52.aClass41_429.method1393());
											} else if (local1566.method1408(Static33.aClass41_234)) {
												local593 = local593.method1424(Static33.aClass41_234.method1393());
												local5236 = 2;
											} else if (local1566.method1408(Static63.aClass41_523)) {
												local5236 = 3;
												local593 = local593.method1424(Static63.aClass41_523.method1393());
											} else if (local1566.method1408(Static16.aClass41_98)) {
												local5236 = 4;
												local593 = local593.method1424(Static16.aClass41_98.method1393());
											} else if (local1566.method1408(Static191.aClass41_1154)) {
												local593 = local593.method1424(Static191.aClass41_1154.method1393());
												local5236 = 5;
											} else if (Static111.anInt2675 != 0) {
												if (local1566.method1408(Static52.aClass41_431)) {
													local5236 = 1;
													local593 = local593.method1424(Static52.aClass41_431.method1393());
												} else if (local1566.method1408(Static33.aClass41_235)) {
													local593 = local593.method1424(Static33.aClass41_235.method1393());
													local5236 = 2;
												} else if (local1566.method1408(Static63.aClass41_526)) {
													local593 = local593.method1424(Static63.aClass41_526.method1393());
													local5236 = 3;
												} else if (local1566.method1408(Static16.aClass41_99)) {
													local5236 = 4;
													local593 = local593.method1424(Static16.aClass41_99.method1393());
												} else if (local1566.method1408(Static191.aClass41_1153)) {
													local5236 = 5;
													local593 = local593.method1424(Static191.aClass41_1153.method1393());
												}
											}
											Static131.aClass2_Sub3_Sub1_2.method221(189);
											Static131.aClass2_Sub3_Sub1_2.method208(0);
											local658 = Static131.aClass2_Sub3_Sub1_2.anInt239;
											Static131.aClass2_Sub3_Sub1_2.method208(local4846);
											Static131.aClass2_Sub3_Sub1_2.method208(local5236);
											Static154.method2517(Static131.aClass2_Sub3_Sub1_2, local593);
											Static131.aClass2_Sub3_Sub1_2.method203(Static131.aClass2_Sub3_Sub1_2.anInt239 - local658);
											continue;
										}
										if (local225 == 5009) {
											local37 -= 2;
											local593 = Static153.aClass41Array53[local37];
											local1566 = Static153.aClass41Array53[local37 + 1];
											if (Static60.anInt4780 != 0 || Static211.anInt4700 != 1 && Static158.anInt3725 != 1) {
												Static131.aClass2_Sub3_Sub1_2.method221(80);
												Static131.aClass2_Sub3_Sub1_2.method208(0);
												local1001 = Static131.aClass2_Sub3_Sub1_2.anInt239;
												Static131.aClass2_Sub3_Sub1_2.method190(local593.method1419());
												Static154.method2517(Static131.aClass2_Sub3_Sub1_2, local1566);
												Static131.aClass2_Sub3_Sub1_2.method203(Static131.aClass2_Sub3_Sub1_2.anInt239 - local1001);
											}
											continue;
										}
										if (local225 == 5010) {
											local23--;
											local785 = Static94.anIntArray231[local23];
											local1566 = null;
											if (local785 < 100) {
												local1566 = Static107.aClass41Array35[local785];
											}
											if (local1566 == null) {
												local1566 = Static71.aClass41_579;
											}
											Static153.aClass41Array53[local37++] = local1566;
											continue;
										}
										if (local225 == 5011) {
											local1566 = null;
											local23--;
											local785 = Static94.anIntArray231[local23];
											if (local785 < 100) {
												local1566 = Static202.aClass41Array25[local785];
											}
											if (local1566 == null) {
												local1566 = Static71.aClass41_579;
											}
											Static153.aClass41Array53[local37++] = local1566;
											continue;
										}
										if (local225 == 5012) {
											local779 = -1;
											local23--;
											local785 = Static94.anIntArray231[local23];
											if (local785 < 100) {
												local779 = Static118.anIntArray305[local785];
											}
											Static94.anIntArray231[local23++] = local779;
											continue;
										}
										if (local225 == 5015) {
											if (Static213.aClass12_Sub3_Sub1_1 == null || Static213.aClass12_Sub3_Sub1_1.aClass41_362 == null) {
												local593 = Static185.aClass41_1117;
											} else {
												local593 = Static213.aClass12_Sub3_Sub1_1.aClass41_362;
											}
											Static153.aClass41Array53[local37++] = local593;
											continue;
										}
										if (local225 == 5016) {
											Static94.anIntArray231[local23++] = Static113.anInt2749;
											continue;
										}
										if (local225 == 5017) {
											Static94.anIntArray231[local23++] = Static32.anInt845;
											continue;
										}
										if (local225 == 5050) {
											local23--;
											local785 = Static94.anIntArray231[local23];
											Static153.aClass41Array53[local37++] = Static101.method1730(local785).aClass41_748;
											continue;
										}
										@Pc(5658) Class2_Sub2_Sub11 local5658;
										if (local225 == 5051) {
											local23--;
											local785 = Static94.anIntArray231[local23];
											local5658 = Static101.method1730(local785);
											if (local5658.anIntArray248 == null) {
												Static94.anIntArray231[local23++] = 0;
											} else {
												Static94.anIntArray231[local23++] = local5658.anIntArray248.length;
											}
											continue;
										}
										if (local225 == 5052) {
											local23 -= 2;
											local785 = Static94.anIntArray231[local23];
											local779 = Static94.anIntArray231[local23 + 1];
											@Pc(5695) Class2_Sub2_Sub11 local5695 = Static101.method1730(local785);
											local633 = local5695.anIntArray248[local779];
											Static94.anIntArray231[local23++] = local633;
											continue;
										}
										if (local225 == 5053) {
											local23--;
											local785 = Static94.anIntArray231[local23];
											local5658 = Static101.method1730(local785);
											if (local5658.anIntArray250 == null) {
												Static94.anIntArray231[local23++] = 0;
											} else {
												Static94.anIntArray231[local23++] = local5658.anIntArray250.length;
											}
											continue;
										}
										if (local225 == 5054) {
											local23 -= 2;
											local785 = Static94.anIntArray231[local23];
											local779 = Static94.anIntArray231[local23 + 1];
											Static94.anIntArray231[local23++] = Static101.method1730(local785).anIntArray250[local779];
											continue;
										}
										if (local225 == 5055) {
											local23--;
											local785 = Static94.anIntArray231[local23];
											Static153.aClass41Array53[local37++] = Static151.method2358(local785).method2895();
											continue;
										}
										if (local225 == 5056) {
											local23--;
											local785 = Static94.anIntArray231[local23];
											@Pc(5799) Class2_Sub2_Sub20 local5799 = Static151.method2358(local785);
											if (local5799.anIntArray436 == null) {
												Static94.anIntArray231[local23++] = 0;
											} else {
												Static94.anIntArray231[local23++] = local5799.anIntArray436.length;
											}
											continue;
										}
										if (local225 == 5057) {
											local23 -= 2;
											local779 = Static94.anIntArray231[local23 + 1];
											local785 = Static94.anIntArray231[local23];
											Static94.anIntArray231[local23++] = Static151.method2358(local785).anIntArray436[local779];
											continue;
										}
										if (local225 == 5058) {
											Static14.aClass94_1 = new Class94();
											local23--;
											Static14.aClass94_1.anInt4376 = Static94.anIntArray231[local23];
											Static14.aClass94_1.aClass2_Sub2_Sub20_1 = Static151.method2358(Static14.aClass94_1.anInt4376);
											Static14.aClass94_1.anIntArray453 = new int[Static14.aClass94_1.aClass2_Sub2_Sub20_1.method2892()];
											continue;
										}
										if (local225 == 5059) {
											Static131.aClass2_Sub3_Sub1_2.method221(197);
											Static131.aClass2_Sub3_Sub1_2.method208(0);
											local785 = Static131.aClass2_Sub3_Sub1_2.anInt239;
											Static131.aClass2_Sub3_Sub1_2.method208(0);
											Static131.aClass2_Sub3_Sub1_2.method167(Static14.aClass94_1.anInt4376);
											Static14.aClass94_1.aClass2_Sub2_Sub20_1.method2899(Static131.aClass2_Sub3_Sub1_2, Static14.aClass94_1.anIntArray453);
											Static131.aClass2_Sub3_Sub1_2.method203(Static131.aClass2_Sub3_Sub1_2.anInt239 - local785);
											continue;
										}
										if (local225 == 5060) {
											local37--;
											local593 = Static153.aClass41Array53[local37];
											Static131.aClass2_Sub3_Sub1_2.method221(242);
											Static131.aClass2_Sub3_Sub1_2.method208(0);
											local779 = Static131.aClass2_Sub3_Sub1_2.anInt239;
											Static131.aClass2_Sub3_Sub1_2.method190(local593.method1419());
											Static131.aClass2_Sub3_Sub1_2.method167(Static14.aClass94_1.anInt4376);
											Static14.aClass94_1.aClass2_Sub2_Sub20_1.method2899(Static131.aClass2_Sub3_Sub1_2, Static14.aClass94_1.anIntArray453);
											Static131.aClass2_Sub3_Sub1_2.method203(Static131.aClass2_Sub3_Sub1_2.anInt239 - local779);
											continue;
										}
										if (local225 == 5061) {
											Static131.aClass2_Sub3_Sub1_2.method221(197);
											Static131.aClass2_Sub3_Sub1_2.method208(0);
											local785 = Static131.aClass2_Sub3_Sub1_2.anInt239;
											Static131.aClass2_Sub3_Sub1_2.method208(1);
											Static131.aClass2_Sub3_Sub1_2.method167(Static14.aClass94_1.anInt4376);
											Static14.aClass94_1.aClass2_Sub2_Sub20_1.method2899(Static131.aClass2_Sub3_Sub1_2, Static14.aClass94_1.anIntArray453);
											Static131.aClass2_Sub3_Sub1_2.method203(Static131.aClass2_Sub3_Sub1_2.anInt239 - local785);
											continue;
										}
										if (local225 == 5062) {
											local23 -= 2;
											local779 = Static94.anIntArray231[local23 + 1];
											local785 = Static94.anIntArray231[local23];
											Static94.anIntArray231[local23++] = Static101.method1730(local785).anIntArray249[local779];
											continue;
										}
										if (local225 == 5063) {
											local23 -= 2;
											local779 = Static94.anIntArray231[local23 + 1];
											local785 = Static94.anIntArray231[local23];
											Static94.anIntArray231[local23++] = Static101.method1730(local785).anIntArray251[local779];
											continue;
										}
										if (local225 == 5064) {
											local23 -= 2;
											local785 = Static94.anIntArray231[local23];
											local779 = Static94.anIntArray231[local23 + 1];
											if (local779 == -1) {
												Static94.anIntArray231[local23++] = -1;
											} else {
												Static94.anIntArray231[local23++] = Static101.method1730(local785).method1772(local779);
											}
											continue;
										}
										if (local225 == 5065) {
											local23 -= 2;
											local785 = Static94.anIntArray231[local23];
											local779 = Static94.anIntArray231[local23 + 1];
											if (local779 == -1) {
												Static94.anIntArray231[local23++] = -1;
											} else {
												Static94.anIntArray231[local23++] = Static101.method1730(local785).method1768(local779);
											}
											continue;
										}
										if (local225 == 5066) {
											local23--;
											local785 = Static94.anIntArray231[local23];
											Static94.anIntArray231[local23++] = Static151.method2358(local785).method2892();
											continue;
										}
										if (local225 == 5067) {
											local23 -= 2;
											local785 = Static94.anIntArray231[local23];
											local779 = Static94.anIntArray231[local23 + 1];
											local1001 = Static151.method2358(local785).method2890(local779);
											Static94.anIntArray231[local23++] = local1001;
											continue;
										}
										if (local225 == 5068) {
											local23 -= 2;
											local779 = Static94.anIntArray231[local23 + 1];
											local785 = Static94.anIntArray231[local23];
											Static14.aClass94_1.anIntArray453[local785] = local779;
											continue;
										}
										if (local225 == 5069) {
											local23 -= 2;
											local785 = Static94.anIntArray231[local23];
											local779 = Static94.anIntArray231[local23 + 1];
											Static14.aClass94_1.anIntArray453[local785] = local779;
											continue;
										}
										if (local225 == 5070) {
											local23 -= 3;
											local785 = Static94.anIntArray231[local23];
											local779 = Static94.anIntArray231[local23 + 1];
											local1001 = Static94.anIntArray231[local23 + 2];
											@Pc(6261) Class2_Sub2_Sub20 local6261 = Static151.method2358(local785);
											if (local6261.method2890(local779) != 0) {
												throw new RuntimeException("bad command");
											}
											Static94.anIntArray231[local23++] = local6261.method2897(local1001, local779);
											continue;
										}
									} else if (local225 < 5200) {
										if (local225 == 5100) {
											if (Static219.aBooleanArray25[86]) {
												Static94.anIntArray231[local23++] = 1;
											} else {
												Static94.anIntArray231[local23++] = 0;
											}
											continue;
										}
										if (local225 == 5101) {
											if (Static219.aBooleanArray25[82]) {
												Static94.anIntArray231[local23++] = 1;
											} else {
												Static94.anIntArray231[local23++] = 0;
											}
											continue;
										}
										if (local225 == 5102) {
											if (Static219.aBooleanArray25[81]) {
												Static94.anIntArray231[local23++] = 1;
											} else {
												Static94.anIntArray231[local23++] = 0;
											}
											continue;
										}
									} else if (local225 < 5300) {
										if (local225 == 5200) {
											local23--;
											Static39.method821(Static94.anIntArray231[local23]);
											continue;
										}
										if (local225 == 5201) {
											Static94.anIntArray231[local23++] = Static89.method1563();
											continue;
										}
										if (local225 == 5202) {
											local23--;
											Static75.method2628(Static94.anIntArray231[local23]);
											continue;
										}
										if (local225 == 5203) {
											local37--;
											Static115.method2743(Static153.aClass41Array53[local37]);
											continue;
										}
										if (local225 == 5204) {
											Static153.aClass41Array53[local37 - 1] = Static196.method3068(Static153.aClass41Array53[local37 - 1]);
											continue;
										}
										if (local225 == 5205) {
											local37--;
											Static97.method1682(Static153.aClass41Array53[local37]);
											continue;
										}
									} else if (local225 >= 5400) {
										if (local225 < 5500) {
											if (local225 == 5400) {
												local37 -= 2;
												local593 = Static153.aClass41Array53[local37];
												local1566 = Static153.aClass41Array53[local37 + 1];
												local23--;
												local1001 = Static94.anIntArray231[local23];
												Static131.aClass2_Sub3_Sub1_2.method221(85);
												Static131.aClass2_Sub3_Sub1_2.method208(Static14.method296(local593) + Static14.method296(local1566) + 1);
												Static131.aClass2_Sub3_Sub1_2.method198(local593);
												Static131.aClass2_Sub3_Sub1_2.method198(local1566);
												Static131.aClass2_Sub3_Sub1_2.method208(local1001);
												continue;
											}
											if (local225 == 5401) {
												local23 -= 2;
												Static103.aShortArray72[Static94.anIntArray231[local23]] = (short) Static208.method3220(Static94.anIntArray231[local23 + 1]);
												Static6.method238();
												Static180.method2874();
												Static90.method1574();
												Static139.method2206();
												Static93.method1627();
												continue;
											}
										}
									} else if (local225 == 5304) {
										Static94.anIntArray231[local23++] = 0;
										continue;
									}
								} else if (local225 == 4500) {
									local23 -= 2;
									local779 = Static94.anIntArray231[local23 + 1];
									local785 = Static94.anIntArray231[local23];
									local4465 = Static191.method3025(local779);
									if (local4465.method78()) {
										Static153.aClass41Array53[local37++] = Static20.method422(local785).method2570(local4465.aClass41_38, local779);
									} else {
										Static94.anIntArray231[local23++] = Static20.method422(local785).method2572(local4465.anInt114, local779);
									}
									continue;
								}
							} else if (local225 == 4400) {
								local23 -= 2;
								local785 = Static94.anIntArray231[local23];
								local779 = Static94.anIntArray231[local23 + 1];
								local4465 = Static191.method3025(local779);
								if (local4465.method78()) {
									Static153.aClass41Array53[local37++] = Static168.method2705(local785).method2121(local4465.aClass41_38, local779);
								} else {
									Static94.anIntArray231[local23++] = Static168.method2705(local785).method2117(local4465.anInt114, local779);
								}
								continue;
							}
						} else {
							if (local225 == 4100) {
								local37--;
								local593 = Static153.aClass41Array53[local37];
								local23--;
								local779 = Static94.anIntArray231[local23];
								Static153.aClass41Array53[local37++] = Static149.method2324(new Class41[] { local593, Static152.method2471(local779) });
								continue;
							}
							if (local225 == 4101) {
								local37 -= 2;
								local1566 = Static153.aClass41Array53[local37 + 1];
								local593 = Static153.aClass41Array53[local37];
								Static153.aClass41Array53[local37++] = Static149.method2324(new Class41[] { local593, local1566 });
								continue;
							}
							if (local225 == 4102) {
								local37--;
								local593 = Static153.aClass41Array53[local37];
								local23--;
								local779 = Static94.anIntArray231[local23];
								Static153.aClass41Array53[local37++] = Static149.method2324(new Class41[] { local593, Static46.method2855(local779) });
								continue;
							}
							if (local225 == 4103) {
								local37--;
								local593 = Static153.aClass41Array53[local37];
								Static153.aClass41Array53[local37++] = local593.method1428();
								continue;
							}
							if (local225 == 4104) {
								local23--;
								local785 = Static94.anIntArray231[local23];
								@Pc(6778) long local6778 = ((long) local785 + 11745L) * 86400000L;
								Static20.aCalendar1.setTime(new Date(local6778));
								local633 = Static20.aCalendar1.get(5);
								local658 = Static20.aCalendar1.get(2);
								local1032 = Static20.aCalendar1.get(1);
								Static153.aClass41Array53[local37++] = Static149.method2324(new Class41[] { Static152.method2471(local633), Static105.aClass41_754, Static48.aClass41Array18[local658], Static105.aClass41_754, Static152.method2471(local1032) });
								continue;
							}
							if (local225 == 4105) {
								local37 -= 2;
								local593 = Static153.aClass41Array53[local37];
								local1566 = Static153.aClass41Array53[local37 + 1];
								if (Static213.aClass12_Sub3_Sub1_1.aClass91_1 != null && Static213.aClass12_Sub3_Sub1_1.aClass91_1.aBoolean263) {
									Static153.aClass41Array53[local37++] = local1566;
									continue;
								}
								Static153.aClass41Array53[local37++] = local593;
								continue;
							}
							if (local225 == 4106) {
								local23--;
								local785 = Static94.anIntArray231[local23];
								Static153.aClass41Array53[local37++] = Static152.method2471(local785);
								continue;
							}
							if (local225 == 4107) {
								local37 -= 2;
								Static94.anIntArray231[local23++] = Static153.aClass41Array53[local37].method1416(Static153.aClass41Array53[local37 + 1]);
								continue;
							}
							@Pc(6938) Class2_Sub2_Sub4_Sub1_Sub1 local6938;
							@Pc(6933) byte[] local6933;
							if (local225 == 4108) {
								local23 -= 2;
								local779 = Static94.anIntArray231[local23];
								local37--;
								local593 = Static153.aClass41Array53[local37];
								local1001 = Static94.anIntArray231[local23 + 1];
								local6933 = Static85.aClass15_Sub1_56.method387(0, local1001);
								local6938 = new Class2_Sub2_Sub4_Sub1_Sub1(local6933);
								local6938.method779(Static32.aClass60Array8, null);
								Static94.anIntArray231[local23++] = local6938.method793(local593, local779);
								continue;
							}
							if (local225 == 4109) {
								local23 -= 2;
								local37--;
								local593 = Static153.aClass41Array53[local37];
								local1001 = Static94.anIntArray231[local23 + 1];
								local779 = Static94.anIntArray231[local23];
								local6933 = Static85.aClass15_Sub1_56.method387(0, local1001);
								local6938 = new Class2_Sub2_Sub4_Sub1_Sub1(local6933);
								local6938.method779(Static32.aClass60Array8, null);
								Static94.anIntArray231[local23++] = local6938.method786(local593, local779);
								continue;
							}
							if (local225 == 4110) {
								local37 -= 2;
								local1566 = Static153.aClass41Array53[local37 + 1];
								local593 = Static153.aClass41Array53[local37];
								local23--;
								if (Static94.anIntArray231[local23] == 1) {
									Static153.aClass41Array53[local37++] = local593;
								} else {
									Static153.aClass41Array53[local37++] = local1566;
								}
								continue;
							}
							if (local225 == 4111) {
								local37--;
								local593 = Static153.aClass41Array53[local37];
								Static153.aClass41Array53[local37++] = Static24.method792(local593);
								continue;
							}
							if (local225 == 4112) {
								local23--;
								local779 = Static94.anIntArray231[local23];
								local37--;
								local593 = Static153.aClass41Array53[local37];
								if (local779 == -1) {
									throw new RuntimeException("null char");
								}
								Static153.aClass41Array53[local37++] = local593.method1407(local779);
								continue;
							}
							if (local225 == 4113) {
								local23--;
								local785 = Static94.anIntArray231[local23];
								Static94.anIntArray231[local23++] = Static196.method3065(local785) ? 1 : 0;
								continue;
							}
							if (local225 == 4114) {
								local23--;
								local785 = Static94.anIntArray231[local23];
								Static94.anIntArray231[local23++] = Static100.method1729(local785) ? 1 : 0;
								continue;
							}
							if (local225 == 4115) {
								local23--;
								local785 = Static94.anIntArray231[local23];
								Static94.anIntArray231[local23++] = Static95.method1657(local785) ? 1 : 0;
								continue;
							}
							if (local225 == 4116) {
								local23--;
								local785 = Static94.anIntArray231[local23];
								Static94.anIntArray231[local23++] = Static4.method85(local785) ? 1 : 0;
								continue;
							}
							if (local225 == 4117) {
								local37--;
								local593 = Static153.aClass41Array53[local37];
								if (local593 == null) {
									Static94.anIntArray231[local23++] = 0;
								} else {
									Static94.anIntArray231[local23++] = local593.method1393();
								}
								continue;
							}
							if (local225 == 4118) {
								local23 -= 2;
								local37--;
								local593 = Static153.aClass41Array53[local37];
								local1001 = Static94.anIntArray231[local23 + 1];
								local779 = Static94.anIntArray231[local23];
								Static153.aClass41Array53[local37++] = local593.method1412(local779, local1001);
								continue;
							}
							if (local225 == 4119) {
								local37--;
								local593 = Static153.aClass41Array53[local37];
								local1566 = Static148.method2319(local593.method1393());
								@Pc(7249) boolean local7249 = false;
								for (local633 = 0; local593.method1393() > local633; local633++) {
									local658 = local593.method1388(local633);
									if (local658 == 60) {
										local7249 = true;
									} else if (local658 == 62) {
										local7249 = false;
									} else if (!local7249) {
										local1566.method1427(local658);
									}
								}
								local1566.method1418();
								Static153.aClass41Array53[local37++] = local1566;
								continue;
							}
							if (local225 == 4120) {
								local23 -= 2;
								local37--;
								local593 = Static153.aClass41Array53[local37];
								local779 = Static94.anIntArray231[local23];
								local1001 = Static94.anIntArray231[local23 + 1];
								Static94.anIntArray231[local23++] = local593.method1383(local779, local1001);
								continue;
							}
							if (local225 == 4121) {
								local37 -= 2;
								local1566 = Static153.aClass41Array53[local37 + 1];
								local23--;
								local1001 = Static94.anIntArray231[local23];
								local593 = Static153.aClass41Array53[local37];
								Static94.anIntArray231[local23++] = local593.method1423(local1001, local1566);
								continue;
							}
							if (local225 == 4122) {
								local23--;
								local785 = Static94.anIntArray231[local23];
								Static94.anIntArray231[local23++] = Static19.method348(local785);
								continue;
							}
							if (local225 == 4123) {
								local23--;
								local785 = Static94.anIntArray231[local23];
								Static94.anIntArray231[local23++] = Static8.method257(local785);
								continue;
							}
						}
					} else {
						if (local225 < 2000) {
							local1124 = local972 ? Static179.aClass80_14 : Static114.aClass80_10;
						} else {
							local23--;
							local1124 = Static212.method3256(Static94.anIntArray231[local23]);
							local225 -= 1000;
						}
						if (local225 == 1300) {
							local23--;
							local779 = Static94.anIntArray231[local23] - 1;
							if (local779 >= 0 && local779 <= 9) {
								local37--;
								local1124.method2550(Static153.aClass41Array53[local37], local779);
								continue;
							}
							local37--;
							continue;
						}
						if (local225 == 1301) {
							local23 -= 2;
							local779 = Static94.anIntArray231[local23];
							local1001 = Static94.anIntArray231[local23 + 1];
							local1124.aClass80_12 = Static34.method675(local1001, local779);
							continue;
						}
						if (local225 == 1302) {
							local23--;
							local1124.aBoolean217 = Static94.anIntArray231[local23] == 1;
							continue;
						}
						if (local225 == 1303) {
							local23--;
							local1124.anInt3653 = Static94.anIntArray231[local23];
							continue;
						}
						if (local225 == 1304) {
							local23--;
							local1124.anInt3681 = Static94.anIntArray231[local23];
							continue;
						}
						if (local225 == 1305) {
							local37--;
							local1124.aClass41_982 = Static153.aClass41Array53[local37];
							continue;
						}
						if (local225 == 1306) {
							local37--;
							local1124.aClass41_985 = Static153.aClass41Array53[local37];
							continue;
						}
						if (local225 == 1307) {
							local1124.aClass41Array55 = null;
							continue;
						}
					}
				}
				throw new IllegalStateException();
			}
		} catch (@Pc(9484) Exception local9484) {
			if (local18.aClass41_1288 == null) {
				if (Static101.anInt2449 != 0) {
					Static198.method3075(Static160.aClass41_1002, 0, Static71.aClass41_579);
				}
				Static196.method3064("CS2 - scr:" + local18.aLong150 + " op:" + local46, local9484);
			} else {
				@Pc(9491) Class41 local9491 = Static148.method2319(30);
				local9491.method1405(Static141.aClass41_899).method1405(local18.aClass41_1288);
				for (local63 = Static204.anInt4552 - 1; local63 >= 0; local63--) {
					local9491.method1405(Static20.aClass41_130).method1405(Static70.aClass64Array1[local63].aClass2_Sub2_Sub28_1.aClass41_1288);
				}
				if (local46 == 40) {
					local76 = local44[local41];
					local9491.method1405(Static119.aClass41_814).method1405(Static152.method2471(local76));
				}
				if (Static101.anInt2449 != 0) {
					Static198.method3075(Static149.method2324(new Class41[] { Static17.aClass41_109, local18.aClass41_1288 }), 0, Static71.aClass41_579);
				}
				Static196.method3064("CS2 - scr:" + local18.aLong150 + " op:" + local46 + new String(local9491.method1402()), local9484);
			}
		}
	}
}
