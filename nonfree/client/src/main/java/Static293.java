import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static293 {

	@OriginalMember(owner = "client!tf", name = "N", descriptor = "Lclient!lm;")
	public static Class134 aClass134_130;

	@OriginalMember(owner = "client!tf", name = "L", descriptor = "I")
	public static int anInt5898 = 1;

	@OriginalMember(owner = "client!tf", name = "P", descriptor = "[[I")
	public static final int[][] anIntArrayArray46 = new int[][] { { 0, 2 }, { 0, 2 }, { 0, 0, 2 }, { 2, 0, 0 }, { 0, 2, 0 }, { 0, 0, 2 }, { 0, 5, 1, 4 }, { 0, 4, 4, 4 }, { 4, 4, 4, 0 }, { 6, 6, 6, 2, 2, 2 }, { 2, 2, 2, 6, 6, 6 }, { 0, 11, 6, 6, 6, 4 }, { 0, 2 }, { 0, 4, 4, 4 }, { 0, 4, 4, 4 } };

	@OriginalMember(owner = "client!tf", name = "Q", descriptor = "[I")
	public static final int[] anIntArray569 = new int[50];

	@OriginalMember(owner = "client!tf", name = "R", descriptor = "Ljava/lang/String;")
	public static String aString232 = "Loading config - ";

	@OriginalMember(owner = "client!tf", name = "c", descriptor = "(III)Lclient!e;")
	public static Class10_Sub2 method5136(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class83 local7 = Static347.aClass83ArrayArrayArray3[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass10_Sub2_2;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(ZZ)V")
	public static void method5137(@OriginalArg(1) boolean arg0) {
		@Pc(19) byte[][] local19;
		if (arg0) {
			local19 = Static153.aByteArrayArray8;
		} else {
			local19 = Static242.aByteArrayArray15;
		}
		@Pc(26) int local26 = Static41.aByteArrayArray4.length;
		for (@Pc(28) int local28 = 0; local28 < local26; local28++) {
			@Pc(34) byte[] local34 = local19[local28];
			if (local34 != null) {
				@Pc(46) int local46 = (Static146.anIntArray446[local28] >> 8) * 64 - Static92.anInt1755;
				@Pc(56) int local56 = (Static146.anIntArray446[local28] & 0xFF) * 64 - Static98.anInt1911;
				Static310.method5336();
				Static91.method1442(Static313.aClass17Array1, local56, local46, local34, Static217.aClass105_5, arg0);
			}
		}
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(Lclient!ri;III[Z)Z")
	public static boolean method5138(@OriginalArg(0) Class1_Sub2_Sub5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		@Pc(1) boolean local1 = false;
		if (Static263.aClass12Array2 != Static81.aClass12Array1) {
			@Pc(11) int local11 = Static278.aClass12Array3[arg1].method2698(arg2, arg3);
			for (@Pc(13) int local13 = 0; local13 <= arg1; local13++) {
				@Pc(18) Class12 local18 = Static278.aClass12Array3[local13];
				if (local18 != null) {
					@Pc(27) int local27 = local11 - local18.method2698(arg2, arg3);
					if (arg4 != null) {
						arg4[local13] = local18.method2702(arg0, arg2, local27, arg3);
						if (!arg4[local13]) {
							continue;
						}
					}
					local18.method2696(arg0, arg2, local27, arg3);
					local1 = true;
				}
			}
		}
		return local1;
	}
}
