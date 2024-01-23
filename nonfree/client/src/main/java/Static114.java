import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static114 {

	@OriginalMember(owner = "client!lg", name = "I", descriptor = "[I")
	public static int[] anIntArray330;

	@OriginalMember(owner = "client!lg", name = "U", descriptor = "Lclient!me;")
	public static Class66 aClass66_2;

	@OriginalMember(owner = "client!lg", name = "J", descriptor = "Lclient!kh;")
	private static Class60 aClass60_861 = Static200.method3116(" is already on your friend list)3");

	@OriginalMember(owner = "client!lg", name = "L", descriptor = "Z")
	public static boolean aBoolean142 = false;

	@OriginalMember(owner = "client!lg", name = "T", descriptor = "Lclient!kh;")
	private static Class60 aClass60_865 = Static200.method3116("Please use a different world)3");

	@OriginalMember(owner = "client!lg", name = "M", descriptor = "Lclient!kh;")
	public static Class60 aClass60_862 = aClass60_865;

	@OriginalMember(owner = "client!lg", name = "N", descriptor = "I")
	public static int anInt2615 = 0;

	@OriginalMember(owner = "client!lg", name = "P", descriptor = "[B")
	public static byte[] aByteArray35 = new byte[520];

	@OriginalMember(owner = "client!lg", name = "Q", descriptor = "I")
	public static int anInt2617 = 0;

	@OriginalMember(owner = "client!lg", name = "R", descriptor = "Lclient!kh;")
	public static Class60 aClass60_863 = Static200.method3116("Ein kostenloses Spielkonto erstellen)3");

	@OriginalMember(owner = "client!lg", name = "S", descriptor = "Lclient!kh;")
	public static Class60 aClass60_864 = aClass60_861;

	@OriginalMember(owner = "client!lg", name = "V", descriptor = "Lclient!kh;")
	public static Class60 aClass60_866 = Static200.method3116("Benutzen Sie die (WPasswort -=ndern(W Option");

	@OriginalMember(owner = "client!lg", name = "X", descriptor = "[J")
	public static long[] aLongArray6 = new long[32];

	@OriginalMember(owner = "client!lg", name = "Y", descriptor = "Lclient!kh;")
	public static Class60 aClass60_867 = aClass60_865;

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(II)Lclient!kh;")
	public static Class60 method1966(@OriginalArg(1) int arg0) {
		return Static52.aClass60Array8[arg0].method1835() > 0 ? Static34.method611(new Class60[] { Static23.aClass60Array17[arg0], Static61.aClass60_476, Static52.aClass60Array8[arg0] }) : Static23.aClass60Array17[arg0];
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(IJ[IB)Lclient!kh;")
	public static Class60 method1968(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int[] arg2) {
		if (Static44.anInterface4_1 != null) {
			@Pc(17) Class60 local17 = Static44.anInterface4_1.method2192(arg2, arg0, arg1);
			if (local17 != null) {
				return local17;
			}
		}
		return arg0 == 5 ? Static144.method2484(arg1).method1812() : Static135.method2254(arg1);
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(III[[[BIBII)V")
	public static void method1969(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[][][] arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		Static7.anInt189++;
		Static5.anInt113 = 0;
		@Pc(9) int local9 = arg4 - 16;
		@Pc(13) int local13 = arg4 + 16;
		@Pc(17) int local17 = arg5 - 16;
		@Pc(21) int local21 = arg5 + 16;
		@Pc(30) int local30;
		@Pc(33) int local33;
		@Pc(100) int local100;
		for (@Pc(23) int local23 = Static200.anInt4271; local23 < Static55.anInt1475; local23++) {
			@Pc(28) Class1_Sub22[][] local28 = Static100.aClass1_Sub22ArrayArrayArray3[local23];
			for (local30 = Static68.anInt1688; local30 < Static186.anInt3977; local30++) {
				for (local33 = Static140.anInt3131; local33 < Static12.anInt346; local33++) {
					@Pc(40) Class1_Sub22 local40 = local28[local30][local33];
					if (local40 != null) {
						if (local40.anInt3362 <= Static69.anInt1709 && Static86.aBooleanArrayArray1[local30 + Static39.anInt884 - Static36.anInt3886][local33 + Static39.anInt884 - Static201.anInt4281] && (arg3 == null || local23 < 0 || arg3[local23][local30][local33] != 0)) {
							local40.aBoolean186 = true;
							local40.aBoolean187 = true;
							if (local40.anInt3358 > 0) {
								local40.aBoolean188 = true;
							} else {
								local40.aBoolean188 = false;
							}
							Static5.anInt113++;
						} else {
							local40.aBoolean186 = false;
							local40.aBoolean187 = false;
							local40.anInt3364 = 0;
							if (local40.aClass29Array3 != null && local30 >= local9 && local30 <= local13 && local33 >= local17 && local33 <= local21) {
								for (local100 = 0; local100 < local40.anInt3358; local100++) {
									@Pc(106) Class29 local106 = local40.aClass29Array3[local100];
									local106.aClass9_3.method2901((local106.anInt1423 + (local106.anInt1431 - local106.anInt1423 >> 1)) * 128 + 64, (local106.anInt1437 + (local106.anInt1430 - local106.anInt1437 >> 1)) * 128 + 64);
								}
							}
						}
					}
				}
			}
		}
		@Pc(183) boolean local183 = Static138.anIntArrayArrayArray17 == Static68.anIntArrayArrayArray10;
		@Pc(211) int local211;
		@Pc(216) int local216;
		@Pc(220) int local220;
		@Pc(202) int local202;
		for (local30 = Static200.anInt4271; local30 < Static55.anInt1475; local30++) {
			@Pc(190) Class1_Sub22[][] local190 = Static100.aClass1_Sub22ArrayArrayArray3[local30];
			for (@Pc(193) int local193 = -Static39.anInt884; local193 <= 0; local193++) {
				local100 = Static36.anInt3886 + local193;
				local202 = Static36.anInt3886 - local193;
				if (local100 >= Static68.anInt1688 || local202 < Static186.anInt3977) {
					for (local211 = -Static39.anInt884; local211 <= 0; local211++) {
						local216 = Static201.anInt4281 + local211;
						local220 = Static201.anInt4281 - local211;
						@Pc(232) Class1_Sub22 local232;
						if (local100 >= Static68.anInt1688) {
							if (local216 >= Static140.anInt3131) {
								local232 = local190[local100][local216];
								if (local232 != null && local232.aBoolean186) {
									Static67.method1206(local232, true);
								}
							}
							if (local220 < Static12.anInt346) {
								local232 = local190[local100][local220];
								if (local232 != null && local232.aBoolean186) {
									Static67.method1206(local232, true);
								}
							}
						}
						if (local202 < Static186.anInt3977) {
							if (local216 >= Static140.anInt3131) {
								local232 = local190[local202][local216];
								if (local232 != null && local232.aBoolean186) {
									Static67.method1206(local232, true);
								}
							}
							if (local220 < Static12.anInt346) {
								local232 = local190[local202][local220];
								if (local232 != null && local232.aBoolean186) {
									Static67.method1206(local232, true);
								}
							}
						}
						if (Static5.anInt113 == 0) {
							if (!local183) {
								Static71.aBoolean92 = false;
							}
							return;
						}
					}
				}
			}
		}
		for (local33 = Static200.anInt4271; local33 < Static55.anInt1475; local33++) {
			@Pc(318) Class1_Sub22[][] local318 = Static100.aClass1_Sub22ArrayArrayArray3[local33];
			for (local100 = -Static39.anInt884; local100 <= 0; local100++) {
				local202 = Static36.anInt3886 + local100;
				local211 = Static36.anInt3886 - local100;
				if (local202 >= Static68.anInt1688 || local211 < Static186.anInt3977) {
					for (local216 = -Static39.anInt884; local216 <= 0; local216++) {
						local220 = Static201.anInt4281 + local216;
						@Pc(348) int local348 = Static201.anInt4281 - local216;
						@Pc(360) Class1_Sub22 local360;
						if (local202 >= Static68.anInt1688) {
							if (local220 >= Static140.anInt3131) {
								local360 = local318[local202][local220];
								if (local360 != null && local360.aBoolean186) {
									Static67.method1206(local360, false);
								}
							}
							if (local348 < Static12.anInt346) {
								local360 = local318[local202][local348];
								if (local360 != null && local360.aBoolean186) {
									Static67.method1206(local360, false);
								}
							}
						}
						if (local211 < Static186.anInt3977) {
							if (local220 >= Static140.anInt3131) {
								local360 = local318[local211][local220];
								if (local360 != null && local360.aBoolean186) {
									Static67.method1206(local360, false);
								}
							}
							if (local348 < Static12.anInt346) {
								local360 = local318[local211][local348];
								if (local360 != null && local360.aBoolean186) {
									Static67.method1206(local360, false);
								}
							}
						}
						if (Static5.anInt113 == 0) {
							if (!local183) {
								Static71.aBoolean92 = false;
							}
							return;
						}
					}
				}
			}
		}
		Static71.aBoolean92 = false;
	}
}
