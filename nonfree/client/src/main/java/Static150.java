import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static150 {

	@OriginalMember(owner = "client!ml", name = "d", descriptor = "Lclient!d;")
	public static Class28 aClass28_5;

	@OriginalMember(owner = "client!ml", name = "l", descriptor = "Lclient!hc;")
	public static Class51 aClass51_57;

	@OriginalMember(owner = "client!ml", name = "u", descriptor = "[[[Lclient!jd;")
	public static Class1_Sub16[][][] aClass1_Sub16ArrayArrayArray5;

	@OriginalMember(owner = "client!ml", name = "e", descriptor = "Lclient!se;")
	public static Class122 aClass122_13 = null;

	@OriginalMember(owner = "client!ml", name = "j", descriptor = "Lclient!lc;")
	public static Class79 aClass79_23 = new Class79(50);

	@OriginalMember(owner = "client!ml", name = "k", descriptor = "Ljava/util/zip/CRC32;")
	public static CRC32 aCRC32_3 = new CRC32();

	@OriginalMember(owner = "client!ml", name = "m", descriptor = "Ljava/lang/String;")
	public static String aString251 = "";

	@OriginalMember(owner = "client!ml", name = "n", descriptor = "Ljava/lang/String;")
	public static String aString252 = "Allocated memory";

	@OriginalMember(owner = "client!ml", name = "o", descriptor = "I")
	public static int anInt3860 = 100;

	@OriginalMember(owner = "client!ml", name = "w", descriptor = "I")
	public static int anInt3861 = 50;

	@OriginalMember(owner = "client!ml", name = "p", descriptor = "[I")
	public static int[] anIntArray284 = new int[anInt3861];

	@OriginalMember(owner = "client!ml", name = "q", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray31 = new String[anInt3861];

	@OriginalMember(owner = "client!ml", name = "r", descriptor = "[I")
	public static int[] anIntArray285 = new int[anInt3861];

	@OriginalMember(owner = "client!ml", name = "s", descriptor = "[I")
	public static int[] anIntArray286 = new int[anInt3861];

	@OriginalMember(owner = "client!ml", name = "t", descriptor = "[I")
	public static int[] anIntArray287 = new int[anInt3861];

	@OriginalMember(owner = "client!ml", name = "v", descriptor = "[I")
	public static int[] anIntArray288 = new int[anInt3861];

	@OriginalMember(owner = "client!ml", name = "x", descriptor = "[J")
	public static long[] aLongArray23 = new long[100];

	@OriginalMember(owner = "client!ml", name = "y", descriptor = "[I")
	public static int[] anIntArray289 = new int[anInt3861];

	@OriginalMember(owner = "client!ml", name = "z", descriptor = "[I")
	public static int[] anIntArray290 = new int[anInt3861];

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIIIIZIIIIII)V")
	public static void method2865(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) boolean arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6, @OriginalArg(9) int arg7, @OriginalArg(11) int arg8) {
		@Pc(5) int local5 = arg0 - arg8;
		@Pc(9) int local9 = arg5 - arg2;
		@Pc(11) int local11 = -1;
		if (Static168.anInt3925 > 0) {
			if (Static19.anInt681 > 10) {
				local11 = (10 + 10 - Static19.anInt681) * 5;
			} else {
				local11 = Static19.anInt681 * 5;
			}
		}
		@Pc(44) int local44 = 983040 / arg7;
		@Pc(48) int local48 = 983040 / arg1;
		for (@Pc(51) int local51 = -local44; local51 < local44 + local5; local51++) {
			@Pc(61) int local61 = arg7 * local51 >> 16;
			@Pc(71) int local71 = (local51 + 1) * arg7 >> 16;
			@Pc(76) int local76 = local71 - local61;
			if (local76 > 0) {
				local61 += arg4;
				@Pc(95) int local95 = local51 + arg8 >> 6;
				if (local95 >= 0 && local95 <= Static228.anIntArrayArrayArray12.length - 1) {
					@Pc(116) int[][] local116 = Static228.anIntArrayArrayArray12[local95];
					for (@Pc(119) int local119 = -local48; local119 < local9 + local48; local119++) {
						@Pc(129) int local129 = arg1 * local119 >> 16;
						@Pc(139) int local139 = arg1 * (local119 + 1) >> 16;
						@Pc(144) int local144 = local139 - local129;
						if (local144 > 0) {
							local129 += arg6;
							@Pc(160) int local160 = arg2 + local119 >> 6;
							if (local160 >= 0 && local116.length - 1 >= local160 && local116[local160] != null) {
								@Pc(197) int local197 = ((local119 + arg2 & 0x3F) << 6) + (arg8 + local51 & 0x3F);
								@Pc(203) int local203 = local116[local160][local197];
								if (local203 != 0) {
									@Pc(211) Class31 local211 = Static77.method1518(local203 - 1);
									if (!Static167.aBooleanArray14[local211.anInt1338]) {
										if (local11 != -1 && local211.anInt1338 == Static94.anInt4236) {
											@Pc(227) Class1_Sub22 local227 = new Class1_Sub22();
											local227.anInt4150 = local129;
											local227.anInt4154 = local61;
											local227.anInt4156 = local211.anInt1338;
											Static250.aClass3_23.method28(local227);
										} else {
											Static98.aClass1_Sub2_Sub4_Sub1Array1[local211.anInt1338].method892(local61 - 7, local129 + -7);
										}
									}
								}
							}
						}
					}
				}
			}
		}
		for (@Pc(280) Class1_Sub22 local280 = (Class1_Sub22) Static250.aClass3_23.method30(); local280 != null; local280 = (Class1_Sub22) Static250.aClass3_23.method33()) {
			Static189.method3202(local280.anInt4154, local280.anInt4150, 15, local11);
			Static189.method3202(local280.anInt4154, local280.anInt4150, 13, local11);
			Static189.method3202(local280.anInt4154, local280.anInt4150, 11, local11);
			Static189.method3202(local280.anInt4154, local280.anInt4150, 9, local11);
			Static98.aClass1_Sub2_Sub4_Sub1Array1[local280.anInt4156].method892(local280.anInt4154 - 7, local280.anInt4150 + -7);
		}
		Static250.aClass3_23.method29();
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(Z)V")
	public static void method2866() {
		Static26.aClass79_4.method2487();
	}
}
