import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static337 {

	@OriginalMember(owner = "client!vq", name = "o", descriptor = "I")
	public static int anInt6349;

	@OriginalMember(owner = "client!vq", name = "p", descriptor = "Lclient!bn;")
	public static Class24 aClass24_6;

	@OriginalMember(owner = "client!vq", name = "q", descriptor = "Lclient!nm;")
	public static Class138 aClass138_10;

	@OriginalMember(owner = "client!vq", name = "j", descriptor = "[I")
	public static final int[] anIntArray548 = new int[50];

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/String;")
	public static String method5620(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(17) int local17 = 0; local17 < local8; local17++) {
			@Pc(23) char local23 = arg0.charAt(local17);
			if (local23 == '<' || local23 == '>') {
				local10 += 3;
			}
		}
		@Pc(43) StringBuffer local43 = new StringBuffer(local10 + local8);
		for (@Pc(45) int local45 = 0; local45 < local8; local45++) {
			@Pc(51) char local51 = arg0.charAt(local45);
			if (local51 == '<') {
				local43.append("<lt>");
			} else if (local51 == '>') {
				local43.append("<gt>");
			} else {
				local43.append(local51);
			}
		}
		return local43.toString();
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(I[[[BIBII)V")
	public static void method5622(@OriginalArg(0) int arg0, @OriginalArg(1) byte[][][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static22.anInt574++;
		Static319.anInt6052 = 0;
		@Pc(14) int local14;
		for (@Pc(7) int local7 = Static131.anInt2706; local7 < Static248.anInt4820; local7++) {
			@Pc(12) Class51[][] local12 = Static138.aClass51ArrayArrayArray1[local7];
			for (local14 = Static266.anInt5098; local14 < Static271.anInt5206; local14++) {
				for (@Pc(17) int local17 = Static233.anInt4557; local17 < Static166.anInt3360; local17++) {
					@Pc(24) Class51 local24 = local12[local14][local17];
					if (local24 != null) {
						if (Static240.aBooleanArrayArray31[local14 + Static98.anInt2185 - Static210.anInt5625][local17 + Static98.anInt2185 - Static103.anInt2249] && (arg1 == null || local7 < arg2 || arg1[local7][local14][local17] != arg3)) {
							local24.aBoolean92 = true;
							local24.aBoolean94 = true;
							if (local24.aClass103_1 == null) {
								local24.aBoolean93 = false;
							} else {
								local24.aBoolean93 = true;
							}
							Static319.anInt6052++;
						} else {
							local24.aBoolean92 = false;
							local24.aBoolean94 = false;
							local24.aByte10 = 0;
							if (local14 >= Static210.anInt5625 - 16 && local14 <= Static210.anInt5625 + 16 && local17 >= Static103.anInt2249 - 16 && local17 <= Static103.anInt2249 + 16 && (local24.aClass25_Sub2_1 != null || local24.aClass25_Sub2_2 != null || local24.aClass25_Sub3_2 != null || local24.aClass25_Sub3_1 != null || local24.aClass25_Sub4_1 != null || local24.aClass103_1 != null)) {
								Static134.aClass28_1.method5717(local24);
							}
						}
					}
				}
			}
		}
		@Pc(145) boolean local145 = Static93.aClass3Array1 == Static130.aClass3Array2;
		for (local14 = Static131.anInt2706; local14 < Static248.anInt4820; local14++) {
			@Pc(161) float local161 = local145 ? 202.0F : 201.5F - (float) local14 * 50.0F - 0.5F;
			if (Static98.aClass59_3.method4862() && local14 >= arg2 && arg1 != null) {
				@Pc(172) int local172 = Static240.aBooleanArrayArray31.length;
				if (Static266.anInt5098 + Static240.aBooleanArrayArray31.length > Static12.anInt378) {
					local172 -= Static266.anInt5098 + Static240.aBooleanArrayArray31.length - Static12.anInt378;
				}
				@Pc(192) int local192 = Static240.aBooleanArrayArray31[0].length;
				if (Static233.anInt4557 + Static240.aBooleanArrayArray31[0].length > Static248.anInt4822) {
					local192 -= Static233.anInt4557 + Static240.aBooleanArrayArray31[0].length - Static248.anInt4822;
				}
				@Pc(213) int local213 = Static20.anInt552;
				while (true) {
					if (local213 >= local172) {
						Static134.aClass28_1.method5712(local14, local161, Static130.aClass3Array2[local14], true);
						break;
					}
					@Pc(220) int local220 = local213 + Static266.anInt5098 - Static20.anInt552;
					for (@Pc(222) int local222 = Static320.anInt6059; local222 < local192; local222++) {
						Static187.aBooleanArrayArray43[local213][local222] = false;
						if (Static240.aBooleanArrayArray31[local213][local222]) {
							@Pc(241) int local241 = local222 + Static233.anInt4557 - Static320.anInt6059;
							for (@Pc(243) int local243 = local14; local243 >= 0; local243--) {
								if (Static138.aClass51ArrayArrayArray1[local243][local220][local241] != null && Static138.aClass51ArrayArrayArray1[local243][local220][local241].aByte9 == local14) {
									Static187.aBooleanArrayArray43[local213][local222] = Static138.aClass51ArrayArrayArray1[local243][local220][local241].aBoolean92;
									break;
								}
							}
						}
					}
					local213++;
				}
			} else {
				Static134.aClass28_1.method5712(local14, local161, Static130.aClass3Array2[local14], false);
			}
			Static134.aClass28_1.method5716();
		}
		if (!Static63.method1320(true)) {
			Static63.method1320(false);
		}
	}
}
