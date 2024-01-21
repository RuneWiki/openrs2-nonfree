import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static107 {

	@OriginalMember(owner = "client!vb", name = "ub", descriptor = "Lclient!u;")
	public static Class8_Sub1 aClass8_Sub1_23;

	@OriginalMember(owner = "client!vb", name = "xb", descriptor = "Lclient!e;")
	public static Class2_Sub1_Sub2_Sub2 aClass2_Sub1_Sub2_Sub2_28;

	@OriginalMember(owner = "client!vb", name = "Cb", descriptor = "[I")
	public static int[] anIntArray338;

	@OriginalMember(owner = "client!vb", name = "Db", descriptor = "I")
	public static int anInt2700;

	@OriginalMember(owner = "client!vb", name = "tb", descriptor = "[Lclient!a;")
	public static Class1[] aClass1Array28 = new Class1[100];

	@OriginalMember(owner = "client!vb", name = "vb", descriptor = "J")
	public static long aLong89 = 0L;

	@OriginalMember(owner = "client!vb", name = "zb", descriptor = "Lclient!a;")
	public static Class1 aClass1_2859 = Static94.method1596("@cya@");

	@OriginalMember(owner = "client!vb", name = "Hb", descriptor = "Lclient!a;")
	private static Class1 aClass1_2861 = Static94.method1596(" from your friend list first");

	@OriginalMember(owner = "client!vb", name = "Bb", descriptor = "Lclient!a;")
	public static Class1 aClass1_2860 = aClass1_2861;

	@OriginalMember(owner = "client!vb", name = "Gb", descriptor = "I")
	public static int anInt2703 = 0;

	@OriginalMember(owner = "client!vb", name = "Ib", descriptor = "Lclient!a;")
	public static Class1 aClass1_2862 = Static94.method1596("Bitte versuchen Sie)1");

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(II)Z")
	public static boolean method1776(@OriginalArg(1) int arg0) {
		if (!Static113.method1524(arg0)) {
			return false;
		}
		@Pc(15) Class2_Sub1_Sub14[] local15 = Static98.aClass2_Sub1_Sub14ArrayArray1[arg0];
		@Pc(22) boolean local22 = false;
		for (@Pc(24) int local24 = 0; local24 < local15.length; local24++) {
			@Pc(30) Class2_Sub1_Sub14 local30 = local15[local24];
			if (local30 != null && local30.anInt2192 == 6) {
				@Pc(56) int local56;
				if (local30.anInt2182 != -1 || local30.anInt2178 != -1) {
					@Pc(51) boolean local51 = Static96.method1632(local30);
					if (local51) {
						local56 = local30.anInt2178;
					} else {
						local56 = local30.anInt2182;
					}
					if (local56 != -1) {
						@Pc(69) Class2_Sub1_Sub9 local69 = Static4.method192(local56);
						local30.anInt2183 += Static8.anInt509;
						label50: while (true) {
							do {
								do {
									if (local69.anIntArray144[local30.anInt2179] >= local30.anInt2183) {
										break label50;
									}
									local22 = true;
									local30.anInt2183 -= local69.anIntArray144[local30.anInt2179];
									local30.anInt2179++;
								} while (local30.anInt2179 < local69.anIntArray147.length);
								local30.anInt2179 -= local69.anInt1444;
							} while (local30.anInt2179 >= 0 && local30.anInt2179 < local69.anIntArray147.length);
							local30.anInt2179 = 0;
						}
					}
				}
				if (local30.anInt2210 != 0) {
					local22 = true;
					@Pc(149) int local149 = local30.anInt2210 >> 16;
					local56 = local30.anInt2210 << 16 >> 16;
					@Pc(160) int local160 = local149 * Static8.anInt509;
					local30.anInt2195 = local160 + local30.anInt2195 & 0x7FF;
					local56 *= Static8.anInt509;
					local30.anInt2181 = local30.anInt2181 + local56 & 0x7FF;
				}
			}
		}
		return local22;
	}

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "(B)V")
	public static void method1779() {
		aClass1_2862 = null;
		aClass1Array28 = null;
		aClass2_Sub1_Sub2_Sub2_28 = null;
		aClass8_Sub1_23 = null;
		aClass1_2861 = null;
		anIntArray338 = null;
		aClass1_2859 = null;
		aClass1_2860 = null;
	}
}
