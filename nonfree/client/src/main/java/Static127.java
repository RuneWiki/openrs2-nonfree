import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static127 {

	@OriginalMember(owner = "client!gh", name = "L", descriptor = "Lclient!ci;")
	public static Class38 aClass38_26;

	@OriginalMember(owner = "client!gh", name = "B", descriptor = "Lclient!qt;")
	public static final Class212 aClass212_34 = new Class212(36, 0);

	@OriginalMember(owner = "client!gh", name = "J", descriptor = "Lclient!ub;")
	public static final Class252 aClass252_2 = new Class252();

	@OriginalMember(owner = "client!gh", name = "K", descriptor = "Z")
	public static boolean aBoolean176 = false;

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(ILjava/util/Random;I)I")
	public static int method2396(@OriginalArg(1) Random arg0, @OriginalArg(2) int arg1) {
		if (arg1 <= 0) {
			throw new IllegalArgumentException();
		} else if (Static39.method809(arg1)) {
			return (int) ((long) arg1 * ((long) arg0.nextInt() & 0xFFFFFFFFL) >> 32);
		} else {
			@Pc(34) int local34 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg1);
			@Pc(37) int local37;
			do {
				local37 = arg0.nextInt();
			} while (local34 <= local37);
			return Static263.method4248(arg1, local37);
		}
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(IIII)V")
	public static void method2398(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		Static457.aClass4_Sub20_Sub1_5.method4561(arg1);
		Static457.aClass4_Sub20_Sub1_5.method4571(arg0);
		Static457.aClass4_Sub20_Sub1_5.method4558(arg2);
	}

	@OriginalMember(owner = "client!gh", name = "b", descriptor = "(II)Lclient!nj;")
	public static Class71_Sub3 method2399(@OriginalArg(1) int arg0) {
		@Pc(7) Class273[] local7 = Applet_Sub1.aClass273Array2;
		synchronized (Applet_Sub1.aClass273Array2) {
			@Pc(26) Class71_Sub3 local26;
			if (arg0 >= Applet_Sub1.aClass273Array2.length || Applet_Sub1.aClass273Array2[arg0].method6248()) {
				local26 = new Class71_Sub3();
				local26.aClass71_Sub7Array1 = new Class71_Sub7[arg0];
				for (@Pc(50) int local50 = 0; local50 < arg0; local50++) {
					local26.aClass71_Sub7Array1[local50] = new Class71_Sub7();
				}
			} else {
				local26 = (Class71_Sub3) Applet_Sub1.aClass273Array2[arg0].method6242();
				local26.method6187();
				@Pc(35) int local35 = Static86.anIntArray171[arg0]--;
			}
			return local26;
		}
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(I[[[BIBII)V")
	public static void method2401(@OriginalArg(0) int arg0, @OriginalArg(1) byte[][][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static290.anInt5373++;
		Static183.anInt3715 = 0;
		@Pc(14) int local14;
		for (@Pc(7) int local7 = Static97.anInt2097; local7 < Static227.anInt4511; local7++) {
			@Pc(12) Class162[][] local12 = Static294.aClass162ArrayArrayArray2[local7];
			for (local14 = Static440.anInt7506; local14 < Static54.anInt1311; local14++) {
				for (@Pc(17) int local17 = Static412.anInt7172; local17 < Static206.anInt4217; local17++) {
					@Pc(24) Class162 local24 = local12[local14][local17];
					if (local24 != null) {
						if (Static327.aBooleanArrayArray10[local14 + Static120.anInt2511 - Static243.anInt4735][local17 + Static120.anInt2511 - Static140.anInt2891] && (arg1 == null || local7 < arg2 || arg1[local7][local14][local17] != arg3)) {
							local24.aBoolean331 = true;
							local24.aBoolean330 = true;
							if (local24.aClass199_1 == null) {
								local24.aBoolean329 = false;
							} else {
								local24.aBoolean329 = true;
							}
							Static183.anInt3715++;
						} else {
							local24.aBoolean331 = false;
							local24.aBoolean330 = false;
							local24.aByte56 = 0;
							if (local14 >= Static243.anInt4735 - 16 && local14 <= Static243.anInt4735 + 16 && local17 >= Static140.anInt2891 - 16 && local17 <= Static140.anInt2891 + 16 && (local24.aClass11_Sub2_2 != null || local24.aClass11_Sub2_1 != null || local24.aClass11_Sub3_1 != null || local24.aClass11_Sub3_2 != null || local24.aClass11_Sub1_2 != null || local24.aClass199_1 != null)) {
								Static180.aClass32_1.method5960(local24);
							}
						}
					}
				}
			}
		}
		@Pc(145) boolean local145 = Static77.aClass14Array1 == Static389.aClass14Array3;
		for (local14 = Static97.anInt2097; local14 < Static227.anInt4511; local14++) {
			@Pc(161) float local161 = local145 ? 251.5F : 201.5F - (float) local14 * 50.0F - 0.5F;
			if (Static367.aClass30_20.method2052() && local14 >= arg2 && arg1 != null) {
				@Pc(172) int local172 = Static327.aBooleanArrayArray10.length;
				if (Static440.anInt7506 + Static327.aBooleanArrayArray10.length > Static230.anInt4581) {
					local172 -= Static440.anInt7506 + Static327.aBooleanArrayArray10.length - Static230.anInt4581;
				}
				@Pc(192) int local192 = Static327.aBooleanArrayArray10[0].length;
				if (Static412.anInt7172 + Static327.aBooleanArrayArray10[0].length > Static268.anInt5106) {
					local192 -= Static412.anInt7172 + Static327.aBooleanArrayArray10[0].length - Static268.anInt5106;
				}
				@Pc(213) int local213 = Static16.anInt319;
				while (true) {
					if (local213 >= local172) {
						Static180.aClass32_1.method5955(Static389.aClass14Array3[local14], true, local161, local14);
						break;
					}
					@Pc(220) int local220 = local213 + Static440.anInt7506 - Static16.anInt319;
					for (@Pc(222) int local222 = Static214.anInt4396; local222 < local192; local222++) {
						Static262.aBooleanArrayArray9[local213][local222] = false;
						if (Static327.aBooleanArrayArray10[local213][local222]) {
							@Pc(241) int local241 = local222 + Static412.anInt7172 - Static214.anInt4396;
							for (@Pc(243) int local243 = local14; local243 >= 0; local243--) {
								if (Static294.aClass162ArrayArrayArray2[local243][local220][local241] != null && Static294.aClass162ArrayArrayArray2[local243][local220][local241].aByte59 == local14) {
									Static262.aBooleanArrayArray9[local213][local222] = Static294.aClass162ArrayArrayArray2[local243][local220][local241].aBoolean331;
									break;
								}
							}
						}
					}
					local213++;
				}
			} else {
				Static180.aClass32_1.method5955(Static389.aClass14Array3[local14], false, local161, local14);
			}
			Static180.aClass32_1.method5962();
		}
		if (!Static247.method4075(true)) {
			Static247.method4075(false);
		}
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(BIILclient!kj;)Lclient!hu;")
	public static Class4_Sub1_Sub11 method2402(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class131 arg2) {
		@Pc(18) int local18 = arg1 << 8 | arg2.anInt4202;
		@Pc(27) Class4_Sub1_Sub11 local27 = (Class4_Sub1_Sub11) Static54.aClass181_5.method4420((long) local18 << 16);
		if (local27 != null) {
			return local27;
		}
		@Pc(39) byte[] local39 = Static308.aClass38_64.method1031(Static308.aClass38_64.method1029(local18));
		if (local39 == null) {
			local18 = arg2.anInt4202 | arg0 + 65536 << 8;
			local27 = (Class4_Sub1_Sub11) Static54.aClass181_5.method4420((long) local18 << 16);
			if (local27 != null) {
				return local27;
			}
			local39 = Static308.aClass38_64.method1031(Static308.aClass38_64.method1029(local18));
			if (local39 == null) {
				local18 = arg2.anInt4202 | 0xFFFF00;
				local27 = (Class4_Sub1_Sub11) Static54.aClass181_5.method4420((long) local18 << 16);
				if (local27 != null) {
					return local27;
				}
				local39 = Static308.aClass38_64.method1031(Static308.aClass38_64.method1029(local18));
				if (local39 == null) {
					return null;
				} else if (local39.length <= 1) {
					return null;
				} else {
					local27 = Static26.method400(local39);
					local27.aClass131_4 = arg2;
					Static54.aClass181_5.method4421((long) local18 << 16, local27);
					return local27;
				}
			} else if (local39.length <= 1) {
				return null;
			} else {
				local27 = Static26.method400(local39);
				local27.aClass131_4 = arg2;
				Static54.aClass181_5.method4421((long) local18 << 16, local27);
				return local27;
			}
		} else if (local39.length <= 1) {
			return null;
		} else {
			local27 = Static26.method400(local39);
			local27.aClass131_4 = arg2;
			Static54.aClass181_5.method4421((long) local18 << 16, local27);
			return local27;
		}
	}
}
