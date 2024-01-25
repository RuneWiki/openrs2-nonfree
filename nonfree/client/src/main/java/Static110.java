import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static110 {

	@OriginalMember(owner = "client!hh", name = "d", descriptor = "Lclient!wo;")
	public static Class216 aClass216_95;

	@OriginalMember(owner = "client!hh", name = "b", descriptor = "[I")
	public static final int[] anIntArray514 = new int[500];

	@OriginalMember(owner = "client!hh", name = "h", descriptor = "[Lclient!hf;")
	public static final Class82[] aClass82Array2 = new Class82[4];

	@OriginalMember(owner = "client!hh", name = "b", descriptor = "(I)V")
	public static void method5407() {
		Static28.aClass87_6.method2477();
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(I[[[BIBII)V")
	public static void method5409(@OriginalArg(0) int arg0, @OriginalArg(1) byte[][][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static146.anInt3198++;
		Static134.anInt2972 = 0;
		@Pc(14) int local14;
		for (@Pc(7) int local7 = Static73.anInt1934; local7 < Static113.anInt2651; local7++) {
			@Pc(12) Class194[][] local12 = Static77.aClass194ArrayArrayArray1[local7];
			for (local14 = Static326.anInt2473; local14 < Static92.anInt3571; local14++) {
				for (@Pc(17) int local17 = Static327.anInt6282; local17 < Static70.anInt1848; local17++) {
					@Pc(24) Class194 local24 = local12[local14][local17];
					if (local24 != null) {
						if (Static253.aBooleanArrayArray6[local14 + Static77.anInt2009 - Static318.anInt6137][local17 + Static77.anInt2009 - Static204.anInt4305] && (arg1 == null || local7 < arg2 || arg1[local7][local14][local17] != arg3)) {
							local24.aBoolean563 = true;
							local24.aBoolean561 = true;
							if (local24.aClass126_2 == null) {
								local24.aBoolean562 = false;
							} else {
								local24.aBoolean562 = true;
							}
							Static134.anInt2972++;
						} else {
							local24.aBoolean563 = false;
							local24.aBoolean561 = false;
							local24.aByte65 = 0;
							if (local14 >= Static318.anInt6137 - 16 && local14 <= Static318.anInt6137 + 16 && local17 >= Static204.anInt4305 - 16 && local17 <= Static204.anInt4305 + 16 && (local24.aClass17_Sub4_1 != null || local24.aClass17_Sub4_2 != null || local24.aClass17_Sub3_1 != null || local24.aClass17_Sub3_2 != null || local24.aClass17_Sub5_1 != null || local24.aClass126_2 != null)) {
								Static231.aClass42_1.method2032(local24);
							}
						}
					}
				}
			}
		}
		@Pc(145) boolean local145 = Static269.aClass53Array2 == Static298.aClass53Array3;
		for (local14 = Static73.anInt1934; local14 < Static113.anInt2651; local14++) {
			@Pc(161) float local161 = local145 ? 251.5F : 201.5F - (float) local14 * 50.0F - 0.5F;
			if (Static20.aClass32_4.method2178() && local14 >= arg2 && arg1 != null) {
				@Pc(172) int local172 = Static253.aBooleanArrayArray6.length;
				if (Static326.anInt2473 + Static253.aBooleanArrayArray6.length > Static242.anInt6744) {
					local172 -= Static326.anInt2473 + Static253.aBooleanArrayArray6.length - Static242.anInt6744;
				}
				@Pc(192) int local192 = Static253.aBooleanArrayArray6[0].length;
				if (Static327.anInt6282 + Static253.aBooleanArrayArray6[0].length > Static315.anInt6124) {
					local192 -= Static327.anInt6282 + Static253.aBooleanArrayArray6[0].length - Static315.anInt6124;
				}
				@Pc(213) int local213 = Static70.anInt1845;
				while (true) {
					if (local213 >= local172) {
						Static231.aClass42_1.method2029(Static298.aClass53Array3[local14], local161, true, local14);
						break;
					}
					@Pc(220) int local220 = local213 + Static326.anInt2473 - Static70.anInt1845;
					for (@Pc(222) int local222 = Static12.anInt432; local222 < local192; local222++) {
						Static203.aBooleanArrayArray4[local213][local222] = false;
						if (Static253.aBooleanArrayArray6[local213][local222]) {
							@Pc(241) int local241 = local222 + Static327.anInt6282 - Static12.anInt432;
							for (@Pc(243) int local243 = local14; local243 >= 0; local243--) {
								if (Static77.aClass194ArrayArrayArray1[local243][local220][local241] != null && Static77.aClass194ArrayArrayArray1[local243][local220][local241].aByte64 == local14) {
									Static203.aBooleanArrayArray4[local213][local222] = Static77.aClass194ArrayArrayArray1[local243][local220][local241].aBoolean563;
									break;
								}
							}
						}
					}
					local213++;
				}
			} else {
				Static231.aClass42_1.method2029(Static298.aClass53Array3[local14], local161, false, local14);
			}
			Static231.aClass42_1.method2031();
		}
		if (!Static327.method5306(true)) {
			Static327.method5306(false);
		}
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(BI)Lclient!bo;")
	public static Class24 method5411(@OriginalArg(1) int arg0) {
		@Pc(5) Class87 local5 = Static22.aClass87_44;
		@Pc(14) Class24 local14;
		synchronized (Static22.aClass87_44) {
			local14 = (Class24) Static22.aClass87_44.method2482((long) arg0);
		}
		if (local14 != null) {
			return local14;
		}
		@Pc(39) byte[] local39 = Static144.aClass216_51.method5648(Static29.method762(arg0), Static7.method275(arg0));
		local14 = new Class24();
		local14.anInt1041 = arg0;
		if (local39 != null) {
			local14.method764(new Class1_Sub8(local39));
		}
		local14.method761();
		@Pc(60) Class87 local60 = Static22.aClass87_44;
		synchronized (Static22.aClass87_44) {
			Static22.aClass87_44.method2481(local14, (long) arg0);
			return local14;
		}
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public static boolean method5414(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(11) int local11 = 0; local11 < Static264.anInt6557; local11++) {
			if (arg0.equalsIgnoreCase(Static12.aStringArray5[local11])) {
				return true;
			}
			if (arg0.equalsIgnoreCase(Static9.aStringArray2[local11])) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(IZI)V")
	public static void method5416(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static279.method4856(arg0)) {
			Static122.method2568(arg1, Static348.aClass12ArrayArray1[arg0]);
		}
	}
}
