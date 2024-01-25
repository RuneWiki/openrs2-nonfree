import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static529 {

	@OriginalMember(owner = "client!wc", name = "f", descriptor = "Lclient!rw;")
	public static Class263 aClass263_1;

	@OriginalMember(owner = "client!wc", name = "g", descriptor = "Ljava/lang/Object;")
	public static Object anObject18;

	@OriginalMember(owner = "client!wc", name = "i", descriptor = "[[B")
	public static byte[][] aByteArrayArray32;

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "[Lclient!vv;")
	public static final Class307[] aClass307Array1 = new Class307[32];

	@OriginalMember(owner = "client!wc", name = "c", descriptor = "[[I")
	public static final int[][] anIntArrayArray114 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };

	@OriginalMember(owner = "client!wc", name = "h", descriptor = "Lclient!im;")
	public static final Class140 aClass140_144 = new Class140(50, 1);

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIB)Z")
	public static boolean method7331(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x84080) != 0;
	}

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "(I)V")
	public static void method7333() {
		@Pc(1) Class313 local1 = Static286.aClass313_31;
		synchronized (Static286.aClass313_31) {
			Static286.aClass313_31.method7400();
		}
	}

	@OriginalMember(owner = "client!wc", name = "c", descriptor = "(I)V")
	public static void method7334() {
		for (@Pc(11) int local11 = 0; local11 < Static482.anInt7992; local11++) {
			@Pc(17) Class35 local17 = Static527.aClass35Array1[local11];
			@Pc(19) boolean local19 = false;
			@Pc(231) int local231;
			if (local17.aClass1_Sub16_Sub2_1 == null) {
				local17.anInt937--;
				if ((local17.aByte1 == 2 ? -1500 : -10) <= local17.anInt937) {
					if (local17.aByte1 == 1 && local17.aClass159_1 == null) {
						local17.aClass159_1 = Static554.method4066(Static361.aClass171_109, local17.anInt943, 0);
						if (local17.aClass159_1 == null) {
							continue;
						}
						local17.anInt937 += local17.aClass159_1.method4068();
					} else if (local17.aByte1 == 2 && (local17.aClass1_Sub27_1 == null || local17.aClass1_Sub37_Sub1_1 == null)) {
						if (local17.aClass1_Sub27_1 == null) {
							local17.aClass1_Sub27_1 = Static239.method4141(Static546.aClass171_60, local17.anInt943);
						}
						if (local17.aClass1_Sub27_1 == null) {
							continue;
						}
						if (local17.aClass1_Sub37_Sub1_1 == null) {
							local17.aClass1_Sub37_Sub1_1 = local17.aClass1_Sub27_1.method4140(new int[] { 22050 });
							if (local17.aClass1_Sub37_Sub1_1 == null) {
								continue;
							}
						}
					}
					if (local17.anInt937 < 0) {
						if (local17.anInt938 == 0) {
							local231 = local17.anInt944 * Static544.aClass1_Sub22_Sub1_1.anInt5444 >> 8;
						} else {
							@Pc(137) int local137 = local17.anInt938 >> 24 & 0x3;
							if (local137 == Static63.aClass49_Sub2_Sub2_Sub1_1.aByte98) {
								@Pc(148) int local148 = (local17.anInt938 & 0xFF) << 9;
								@Pc(155) int local155 = local17.anInt938 >> 16 & 0xFF;
								@Pc(165) int local165 = (local155 << 9) + 256 - Static63.aClass49_Sub2_Sub2_Sub1_1.anInt7137;
								if (local165 < 0) {
									local165 = -local165;
								}
								@Pc(180) int local180 = local17.anInt938 >> 8 & 0xFF;
								@Pc(189) int local189 = (local180 << 9) + (256 - Static63.aClass49_Sub2_Sub2_Sub1_1.anInt7141);
								if (local189 < 0) {
									local189 = -local189;
								}
								@Pc(204) int local204 = local165 + local189 - 512;
								if (local148 < local204) {
									local17.anInt937 = -99999;
									continue;
								}
								if (local204 < 0) {
									local204 = 0;
								}
								local231 = (local148 - local204) * Static544.aClass1_Sub22_Sub1_1.anInt5431 * local17.anInt944 / local148 >> 8;
							} else {
								local231 = 0;
							}
						}
						if (local231 > 0) {
							@Pc(249) Class1_Sub37_Sub1 local249 = null;
							if (local17.aByte1 == 1) {
								local249 = local17.aClass159_1.method4069().method6539(Static473.aClass28_1);
							} else if (local17.aByte1 == 2) {
								local249 = local17.aClass1_Sub37_Sub1_1;
							}
							@Pc(275) Class1_Sub16_Sub2 local275 = local17.aClass1_Sub16_Sub2_1 = Static555.method4088(local249, local231);
							local275.method4083(local17.anInt941 - 1);
							Static411.aClass1_Sub16_Sub1_2.method2236(local275);
						}
					}
				} else {
					local19 = true;
				}
			} else if (!local17.aClass1_Sub16_Sub2_1.method7527()) {
				local19 = true;
			}
			if (local19) {
				Static482.anInt7992--;
				for (local231 = local11; local231 < Static482.anInt7992; local231++) {
					Static527.aClass35Array1[local231] = Static527.aClass35Array1[local231 + 1];
				}
				local11--;
			}
		}
		if (Static316.aBoolean424 && !Static220.method3804()) {
			if (Static544.aClass1_Sub22_Sub1_1.anInt5439 != 0 && Static507.anInt8581 != -1) {
				Static71.method1273(Static235.aClass171_78, Static544.aClass1_Sub22_Sub1_1.anInt5439, Static507.anInt8581);
			}
			Static316.aBoolean424 = false;
		} else if (Static544.aClass1_Sub22_Sub1_1.anInt5439 != 0 && Static507.anInt8581 != -1 && !Static220.method3804()) {
			Static144.method2331(Static165.aClass296_149);
			Static455.aClass1_Sub6_Sub2_2.method3948(Static507.anInt8581);
			Static507.anInt8581 = -1;
		}
	}
}
