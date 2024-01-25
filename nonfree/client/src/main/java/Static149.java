import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static149 {

	@OriginalMember(owner = "client!hh", name = "I", descriptor = "Lclient!dq;")
	public static Class56 aClass56_102 = null;

	@OriginalMember(owner = "client!hh", name = "J", descriptor = "[I")
	public static final int[] anIntArray226 = new int[4096];

	@OriginalMember(owner = "client!hh", name = "K", descriptor = "Z")
	public static final boolean aBoolean186 = false;

	@OriginalMember(owner = "client!hh", name = "O", descriptor = "Z")
	public static boolean aBoolean187 = false;

	@OriginalMember(owner = "client!hh", name = "g", descriptor = "(I)V")
	public static void method2106() {
		Static56.aClass4_Sub9_Sub2_1.method5076();
		@Pc(13) int local13 = Static56.aClass4_Sub9_Sub2_1.method5071(8);
		@Pc(22) int local22;
		if (local13 < Static148.anInt2692) {
			for (local22 = local13; local22 < Static148.anInt2692; local22++) {
				Static10.anIntArray6[Static252.anInt4173++] = Static106.anIntArray150[local22];
			}
		}
		if (Static148.anInt2692 < local13) {
			throw new RuntimeException("gnpov1");
		}
		Static148.anInt2692 = 0;
		for (local22 = 0; local22 < local13; local22++) {
			@Pc(60) int local60 = Static106.anIntArray150[local22];
			@Pc(64) Class8_Sub3_Sub1_Sub2 local64 = Static367.aClass8_Sub3_Sub1_Sub2Array1[local60];
			@Pc(69) int local69 = Static56.aClass4_Sub9_Sub2_1.method5071(1);
			if (local69 == 0) {
				Static106.anIntArray150[Static148.anInt2692++] = local60;
				local64.anInt7354 = Static265.anInt4371;
			} else {
				@Pc(92) int local92 = Static56.aClass4_Sub9_Sub2_1.method5071(2);
				if (local92 == 0) {
					Static106.anIntArray150[Static148.anInt2692++] = local60;
					local64.anInt7354 = Static265.anInt4371;
					Static351.anIntArray459[Static119.anInt5695++] = local60;
				} else {
					@Pc(134) int local134;
					@Pc(144) int local144;
					if (local92 == 1) {
						Static106.anIntArray150[Static148.anInt2692++] = local60;
						local64.anInt7354 = Static265.anInt4371;
						local134 = Static56.aClass4_Sub9_Sub2_1.method5071(3);
						local64.method5908(local134, 1);
						local144 = Static56.aClass4_Sub9_Sub2_1.method5071(1);
						if (local144 == 1) {
							Static351.anIntArray459[Static119.anInt5695++] = local60;
						}
					} else if (local92 == 2) {
						Static106.anIntArray150[Static148.anInt2692++] = local60;
						local64.anInt7354 = Static265.anInt4371;
						if (Static56.aClass4_Sub9_Sub2_1.method5071(1) == 1) {
							local134 = Static56.aClass4_Sub9_Sub2_1.method5071(3);
							local64.method5908(local134, 2);
							local144 = Static56.aClass4_Sub9_Sub2_1.method5071(3);
							local64.method5908(local144, 2);
						} else {
							local134 = Static56.aClass4_Sub9_Sub2_1.method5071(3);
							local64.method5908(local134, 0);
						}
						local134 = Static56.aClass4_Sub9_Sub2_1.method5071(1);
						if (local134 == 1) {
							Static351.anIntArray459[Static119.anInt5695++] = local60;
						}
					} else if (local92 == 3) {
						Static10.anIntArray6[Static252.anInt4173++] = local60;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(BZ[B)V")
	public static void method2108(@OriginalArg(1) boolean arg0, @OriginalArg(2) byte[] arg1) {
		if (Static305.aClass4_Sub9_8 == null) {
			Static305.aClass4_Sub9_8 = new Class4_Sub9(20000);
		}
		Static305.aClass4_Sub9_8.method5052(arg1.length, arg1);
		if (!arg0) {
			return;
		}
		Static265.method3490(Static305.aClass4_Sub9_8.aByteArray81);
		Static360.aClass176_Sub1Array2 = new Class176_Sub1[Static275.anInt4587];
		@Pc(31) int local31 = 0;
		for (@Pc(33) int local33 = Static137.anInt2495; local33 <= Static338.anInt5506; local33++) {
			@Pc(39) Class176_Sub1 local39 = Static252.method3320(local33);
			if (local39 != null) {
				Static360.aClass176_Sub1Array2[local31++] = local39;
			}
		}
		Static99.aBoolean126 = false;
		Static386.aLong194 = Static266.method3498();
		Static305.aClass4_Sub9_8 = null;
	}

	@OriginalMember(owner = "client!hh", name = "c", descriptor = "(B)V")
	public static void method2109() {
		Static438.anInt2796 = 0;
		for (@Pc(13) int local13 = 0; local13 < 2048; local13++) {
			Static384.aClass4_Sub9Array1[local13] = null;
			Static37.aByteArray6[local13] = 1;
			Static302.aClass272Array1[local13] = null;
		}
	}
}
