import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static115 {

	@OriginalMember(owner = "client!en", name = "k", descriptor = "Lclient!th;")
	public static Class283 aClass283_2;

	@OriginalMember(owner = "client!en", name = "h", descriptor = "I")
	public static int anInt2354 = 0;

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(ILclient!fu;I)Lclient!de;")
	public static Class63 method1965(@OriginalArg(0) int arg0, @OriginalArg(1) Class49_Sub2 arg1) {
		@Pc(15) Class63 local15;
		if (Static406.aClass63_2 == null) {
			local15 = new Class63();
		} else {
			local15 = Static406.aClass63_2;
			Static406.aClass63_2 = Static406.aClass63_2.aClass63_1;
			local15.aClass63_1 = null;
			Static415.anInt7308--;
		}
		local15.anInt1607 = arg0;
		local15.aClass49_Sub2_1 = arg1;
		return local15;
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(I)V")
	public static void method1967() {
		for (@Pc(6) Class1_Sub50 local6 = (Class1_Sub50) Static193.aClass37_79.method977(); local6 != null; local6 = (Class1_Sub50) Static193.aClass37_79.method971()) {
			if (Static242.aClass255ArrayArrayArray2 == null) {
				local6.method7525();
			} else {
				@Pc(32) int local32;
				@Pc(252) Class49_Sub1 local252;
				@Pc(288) Class49_Sub1_Sub2 local288;
				@Pc(197) Class49_Sub3 local197;
				@Pc(51) Class49_Sub5 local51;
				@Pc(96) Class49_Sub2 local96;
				@Pc(233) Class49_Sub3_Sub3 local233;
				@Pc(70) Class49_Sub5_Sub2 local70;
				if (Static436.anInt6850 >= local6.anInt8765) {
					local32 = Static280.anIntArray530[local6.anInt8769];
					if (local32 == 0) {
						local252 = Static453.method6441(local6.anInt8774, local6.anInt8767, local6.anInt8771);
						if (local252 instanceof Class49_Sub1_Sub2) {
							Static459.method6491(local6.anInt8774, local6.anInt8767, local6.anInt8771);
							local288 = (Class49_Sub1_Sub2) local252;
							if (local288.aClass49_Sub1_1 != null) {
								Static533.method7380(local6.anInt8774, local6.anInt8767, local6.anInt8771, local288.aClass49_Sub1_1, null);
							}
						}
					} else if (local32 == 1) {
						local197 = Static53.method1029(local6.anInt8774, local6.anInt8767, local6.anInt8771);
						if (local197 instanceof Class49_Sub3_Sub3) {
							Static531.method7353(local6.anInt8774, local6.anInt8767, local6.anInt8771);
							local233 = (Class49_Sub3_Sub3) local197;
							if (local233.aClass49_Sub3_3 != null) {
								Static256.method4325(local6.anInt8774, local6.anInt8767, local6.anInt8771, local233.aClass49_Sub3_3, null);
							}
						}
					} else if (local32 == 2) {
						local96 = Static156.method2467(local6.anInt8774, local6.anInt8767, local6.anInt8771, vaa.class);
						if (local96 instanceof Class49_Sub2_Sub3) {
							Static273.method4469(local6.anInt8774, local6.anInt8767, local6.anInt8771, vaa.class);
							@Pc(461) Class49_Sub2_Sub3 local461 = (Class49_Sub2_Sub3) local96;
							if (local461.aClass49_Sub2_2 != null) {
								Static468.method6558(local461.aClass49_Sub2_2, false);
							}
						}
					} else if (local32 == 3) {
						local51 = Static117.method1983(local6.anInt8774, local6.anInt8767, local6.anInt8771);
						if (local51 instanceof Class49_Sub5_Sub2) {
							Static494.method6739(local6.anInt8774, local6.anInt8767, local6.anInt8771);
							local70 = (Class49_Sub5_Sub2) local51;
							if (local70.aClass49_Sub5_1 != null) {
								Static140.method2292(local6.anInt8774, local6.anInt8767, local6.anInt8771, local70.aClass49_Sub5_1);
							}
						}
					}
					local6.method7525();
				} else if (Static436.anInt6850 == local6.anInt8760) {
					local32 = Static280.anIntArray530[local6.anInt8769];
					if (local32 == 0) {
						local252 = Static453.method6441(local6.anInt8774, local6.anInt8767, local6.anInt8771);
						if (local252 instanceof Class49_Sub1_Sub2) {
							local6.method7525();
						} else if (Static291.method4698(local6.anInt8774, local6.anInt8767, local6.anInt8771) == null) {
							local288 = new Class49_Sub1_Sub2(local6.anInt8769, local6.anInt8773, local6.anInt8757, local6.anInt8766, local6.anInt8768, local252);
							Static533.method7380(local6.anInt8774, local6.anInt8767, local6.anInt8771, local288, null);
						} else {
							local6.method7525();
						}
					} else if (local32 == 1) {
						local197 = Static53.method1029(local6.anInt8774, local6.anInt8767, local6.anInt8771);
						if (local197 instanceof Class49_Sub3_Sub3) {
							local6.method7525();
						} else if (Static325.method5036(local6.anInt8774, local6.anInt8767, local6.anInt8771) == null) {
							local233 = new Class49_Sub3_Sub3(local6.anInt8769, local6.anInt8773, local6.anInt8757, local6.anInt8766, local6.anInt8768, local197);
							Static256.method4325(local6.anInt8774, local6.anInt8767, local6.anInt8771, local233, null);
						} else {
							local6.method7525();
						}
					} else if (local32 == 2) {
						local96 = Static156.method2467(local6.anInt8774, local6.anInt8767, local6.anInt8771, vaa.class);
						if (local96 instanceof Class49_Sub2_Sub3) {
							local6.method7525();
						} else {
							Static273.method4469(local6.anInt8774, local6.anInt8767, local6.anInt8771, vaa.class);
							@Pc(125) Class36 local125 = Static308.aClass96_4.method2274(local6.anInt8761);
							@Pc(141) int local141;
							@Pc(138) int local138;
							if (local6.anInt8773 == 1 || local6.anInt8773 == 3) {
								local141 = local125.anInt947;
								local138 = local125.anInt975;
							} else {
								local138 = local125.anInt947;
								local141 = local125.anInt975;
							}
							@Pc(183) Class49_Sub2_Sub3 local183 = new Class49_Sub2_Sub3(local6.anInt8769, local6.anInt8773, local6.anInt8774, local6.anInt8757, local6.anInt8766, local6.anInt8768, local6.anInt8767, local6.anInt8767 + local141 - 1, local6.anInt8771, local138 + local6.anInt8771 - 1, local96);
							Static468.method6558(local183, false);
						}
					} else if (local32 == 3) {
						local51 = Static117.method1983(local6.anInt8774, local6.anInt8767, local6.anInt8771);
						if (local51 instanceof Class49_Sub5_Sub2) {
							local6.method7525();
						} else {
							local70 = new Class49_Sub5_Sub2(local6.anInt8757, local6.anInt8766, local6.anInt8768, local51);
							Static140.method2292(local6.anInt8774, local6.anInt8767, local6.anInt8771, local70);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "([IILclient!re;II[I)Lclient!cb;")
	public static Class40_Sub1 method1974(@OriginalArg(0) int[] arg0, @OriginalArg(2) Class122_Sub2 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4) {
		@Pc(26) int local26;
		@Pc(36) int local36;
		@Pc(38) int local38;
		if (!arg1.method5618(Static431.aClass264_15, Static526.aClass292_15)) {
			@Pc(72) int[] local72 = new int[arg3 * arg2];
			for (local26 = 0; local26 < arg3; local26++) {
				local36 = arg2 * local26 + arg4[local26];
				for (local38 = 0; local38 < arg0[local26]; local38++) {
					local72[local36++] = -16777216;
				}
			}
			return new Class40_Sub1(arg1, arg2, arg3, local72);
		}
		@Pc(24) byte[] local24 = new byte[arg2 * arg3];
		for (local26 = 0; local26 < arg3; local26++) {
			local36 = local26 * arg2 + arg4[local26];
			for (local38 = 0; local38 < arg0[local26]; local38++) {
				local24[local36++] = -1;
			}
		}
		return new Class40_Sub1(arg1, arg2, arg3, local24);
	}
}
