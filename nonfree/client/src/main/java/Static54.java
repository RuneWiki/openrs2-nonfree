import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static54 {

	@OriginalMember(owner = "client!dg", name = "b", descriptor = "[I")
	public static int[] anIntArray80;

	@OriginalMember(owner = "client!dg", name = "g", descriptor = "Lclient!mo;")
	public static Class143 aClass143_38;

	@OriginalMember(owner = "client!dg", name = "h", descriptor = "Lclient!mo;")
	public static Class143 aClass143_39;

	@OriginalMember(owner = "client!dg", name = "i", descriptor = "I")
	public static int anInt1340;

	@OriginalMember(owner = "client!dg", name = "c", descriptor = "Lclient!bd;")
	public static final Class18 aClass18_4 = new Class18();

	@OriginalMember(owner = "client!dg", name = "d", descriptor = "Z")
	public static boolean aBoolean88 = false;

	@OriginalMember(owner = "client!dg", name = "e", descriptor = "[I")
	public static final int[] anIntArray81 = new int[200];

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(B)V")
	public static void method1260() {
		Static70.method1716();
		Static310.method5377();
		Static131.method1783();
		Static72.method1770();
		Static48.method1172();
		Static256.method4409();
		Static68.method1677();
		Static342.method5833();
		Static162.method3229();
		Static233.method4087();
		Static337.method5801();
		Static314.method5404();
		Static209.method3810();
		Static59.method1340();
		Static305.method5311();
		Static194.method3671();
		Static319.method5483();
		Static179.method3484();
		Static83.method5761();
		Static155.method3049();
		Static304.method5308();
		Static133.method4170();
		Static307.method2746();
		Static124.aClass11_61.method215(5);
		Static321.aClass11_136.method215(5);
		Static47.aClass11_25.method215(5);
		Static234.aClass11_98.method215(5);
		Static10.aClass11_3.method215(5);
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(I[[[BIBII)V")
	public static void method1261(@OriginalArg(0) int arg0, @OriginalArg(1) byte[][][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static238.anInt4659++;
		Static83.anInt6472 = 0;
		@Pc(14) int local14;
		for (@Pc(7) int local7 = Static154.anInt3269; local7 < Static125.anInt2719; local7++) {
			@Pc(12) Class213[][] local12 = Static98.aClass213ArrayArrayArray2[local7];
			for (local14 = Static239.anInt6274; local14 < Static86.anInt2090; local14++) {
				for (@Pc(17) int local17 = Static38.anInt906; local17 < anInt1340; local17++) {
					@Pc(24) Class213 local24 = local12[local14][local17];
					if (local24 != null) {
						if (Static134.aBooleanArrayArray1[local14 + Static312.anInt6032 - Static93.anInt2184][local17 + Static312.anInt6032 - Static18.anInt373] && (arg1 == null || local7 < arg2 || arg1[local7][local14][local17] != arg3)) {
							local24.aBoolean440 = true;
							local24.aBoolean438 = true;
							if (local24.aClass81_4 == null) {
								local24.aBoolean439 = false;
							} else {
								local24.aBoolean439 = true;
							}
							Static83.anInt6472++;
						} else {
							local24.aBoolean440 = false;
							local24.aBoolean438 = false;
							local24.aByte69 = 0;
							if (local14 >= Static93.anInt2184 - 16 && local14 <= Static93.anInt2184 + 16 && local17 >= Static18.anInt373 - 16 && local17 <= Static18.anInt373 + 16 && (local24.aClass10_Sub2_2 != null || local24.aClass10_Sub2_1 != null || local24.aClass10_Sub4_1 != null || local24.aClass10_Sub4_2 != null || local24.aClass10_Sub5_1 != null || local24.aClass81_4 != null)) {
								Static295.aClass57_1.method2411(local24);
							}
						}
					}
				}
			}
		}
		@Pc(145) boolean local145 = Static341.aClass114Array3 == Static158.aClass114Array2;
		for (local14 = Static154.anInt3269; local14 < Static125.anInt2719; local14++) {
			@Pc(161) float local161 = local145 ? 251.5F : 201.5F - (float) local14 * 50.0F - 0.5F;
			if (Static160.aClass46_4.method5160() && local14 >= arg2 && arg1 != null) {
				@Pc(172) int local172 = Static134.aBooleanArrayArray1.length;
				if (Static239.anInt6274 + Static134.aBooleanArrayArray1.length > Static233.anInt4556) {
					local172 -= Static239.anInt6274 + Static134.aBooleanArrayArray1.length - Static233.anInt4556;
				}
				@Pc(192) int local192 = Static134.aBooleanArrayArray1[0].length;
				if (Static38.anInt906 + Static134.aBooleanArrayArray1[0].length > Static180.anInt3712) {
					local192 -= Static38.anInt906 + Static134.aBooleanArrayArray1[0].length - Static180.anInt3712;
				}
				@Pc(213) int local213 = Static74.anInt5349;
				while (true) {
					if (local213 >= local172) {
						Static295.aClass57_1.method2408(Static158.aClass114Array2[local14], local161, local14, true);
						break;
					}
					@Pc(220) int local220 = local213 + Static239.anInt6274 - Static74.anInt5349;
					for (@Pc(222) int local222 = Static92.anInt2167; local222 < local192; local222++) {
						Static272.aBooleanArrayArray4[local213][local222] = false;
						if (Static134.aBooleanArrayArray1[local213][local222]) {
							@Pc(241) int local241 = local222 + Static38.anInt906 - Static92.anInt2167;
							for (@Pc(243) int local243 = local14; local243 >= 0; local243--) {
								if (Static98.aClass213ArrayArrayArray2[local243][local220][local241] != null && Static98.aClass213ArrayArrayArray2[local243][local220][local241].aByte73 == local14) {
									Static272.aBooleanArrayArray4[local213][local222] = Static98.aClass213ArrayArrayArray2[local243][local220][local241].aBoolean440;
									break;
								}
							}
						}
					}
					local213++;
				}
			} else {
				Static295.aClass57_1.method2408(Static158.aClass114Array2[local14], local161, local14, false);
			}
			Static295.aClass57_1.method2407();
		}
		if (!Static275.method4679(true)) {
			Static275.method4679(false);
		}
	}
}
