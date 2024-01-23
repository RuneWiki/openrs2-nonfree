import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static226 {

	@OriginalMember(owner = "client!wi", name = "b", descriptor = "I")
	public static int anInt4897;

	@OriginalMember(owner = "client!wi", name = "e", descriptor = "[Lclient!uj;")
	public static Class79[] aClass79Array8;

	@OriginalMember(owner = "client!wi", name = "i", descriptor = "Lclient!oe;")
	public static Class72 aClass72_286;

	@OriginalMember(owner = "client!wi", name = "k", descriptor = "[[[Lclient!df;")
	public static Class2_Sub12[][][] aClass2_Sub12ArrayArrayArray3;

	@OriginalMember(owner = "client!wi", name = "m", descriptor = "[I")
	public static int[] anIntArray794;

	@OriginalMember(owner = "client!wi", name = "n", descriptor = "Lclient!je;")
	public static Class52 aClass52_1;

	@OriginalMember(owner = "client!wi", name = "q", descriptor = "I")
	public static int anInt4902;

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "Lclient!mj;")
	public static Class64 aClass64_16 = null;

	@OriginalMember(owner = "client!wi", name = "u", descriptor = "Lclient!qe;")
	private static Class78 aClass78_874 = Static199.method3560("Connecting to update server");

	@OriginalMember(owner = "client!wi", name = "c", descriptor = "Lclient!qe;")
	public static Class78 aClass78_869 = aClass78_874;

	@OriginalMember(owner = "client!wi", name = "d", descriptor = "Z")
	public static boolean aBoolean213 = false;

	@OriginalMember(owner = "client!wi", name = "p", descriptor = "Lclient!qe;")
	private static Class78 aClass78_872 = Static199.method3560("Loaded interfaces");

	@OriginalMember(owner = "client!wi", name = "f", descriptor = "Lclient!qe;")
	public static Class78 aClass78_870 = aClass78_872;

	@OriginalMember(owner = "client!wi", name = "h", descriptor = "Lclient!qe;")
	private static Class78 aClass78_871 = Static199.method3560("level)2");

	@OriginalMember(owner = "client!wi", name = "j", descriptor = "I")
	public static volatile int anInt4899 = 0;

	@OriginalMember(owner = "client!wi", name = "o", descriptor = "I")
	public static int anInt4901 = 0;

	@OriginalMember(owner = "client!wi", name = "r", descriptor = "Lclient!qe;")
	public static Class78 aClass78_873 = aClass78_871;

	@OriginalMember(owner = "client!wi", name = "s", descriptor = "I")
	public static int anInt4903 = 0;

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(ZI)[B")
	public static synchronized byte[] method3973(@OriginalArg(1) int arg0) {
		@Pc(16) byte[] local16;
		if (arg0 == 100 && Static200.anInt4499 > 0) {
			local16 = Static155.aByteArrayArray11[--Static200.anInt4499];
			Static155.aByteArrayArray11[Static200.anInt4499] = null;
			return local16;
		} else if (arg0 == 5000 && Static91.anInt2019 > 0) {
			local16 = Static35.aByteArrayArray5[--Static91.anInt2019];
			Static35.aByteArrayArray5[Static91.anInt2019] = null;
			return local16;
		} else if (arg0 == 30000 && Static113.anInt2487 > 0) {
			local16 = Static159.aByteArrayArray13[--Static113.anInt2487];
			Static159.aByteArrayArray13[Static113.anInt2487] = null;
			return local16;
		} else {
			return new byte[arg0];
		}
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(B)V")
	public static void method3974() {
		if (!Static202.aBoolean194) {
			Static138.anInt3182 = 1;
			Static79.aShortArray53[0] = 1006;
			Static32.aClass78Array30[0] = Static20.aClass78_72;
			Static57.aClass78Array6[0] = Static73.aClass78_352;
		}
		if (Static166.anInt1143 != -1) {
			Static95.method1664(Static166.anInt1143);
		}
		for (@Pc(29) int local29 = 0; local29 < Static109.anInt2416; local29++) {
			if (Static165.aBooleanArray111[local29]) {
				Static84.aBooleanArray57[local29] = true;
			}
			Static162.aBooleanArray108[local29] = Static165.aBooleanArray111[local29];
			Static165.aBooleanArray111[local29] = false;
		}
		Static68.aClass64_6 = null;
		Static16.anInt4869 = Static123.anInt2808;
		Static93.anInt2055 = -1;
		Static28.anInt499 = -1;
		if (Static166.anInt1143 != -1) {
			Static109.anInt2416 = 0;
			Static185.method3423(0, 0, Static134.anInt3131, Static166.anInt1143, Static30.anInt546, 0, 0, -1);
		}
		Static217.method3756();
		Static104.method1799();
		if (Static202.aBoolean194) {
			Static171.method3139();
		} else if (Static28.anInt499 != -1) {
			Static156.method2804(Static93.anInt2055, Static28.anInt499);
		}
		if (Static89.anInt1998 == 3) {
			for (@Pc(98) int local98 = 0; local98 < Static109.anInt2416; local98++) {
				if (Static162.aBooleanArray108[local98]) {
					Static217.method3749(Static123.anIntArray461[local98], Static56.anIntArray160[local98], Static202.anIntArray728[local98], Static92.anIntArray363[local98], 16711935, 128);
				} else if (Static84.aBooleanArray57[local98]) {
					Static217.method3749(Static123.anIntArray461[local98], Static56.anIntArray160[local98], Static202.anIntArray728[local98], Static92.anIntArray363[local98], 16711680, 128);
				}
			}
		}
		Static82.method1352(Static31.aClass5_Sub2_Sub2_1.anInt1849, Static31.aClass5_Sub2_Sub2_1.anInt1827, Static44.anInt797, Static137.anInt3136);
		Static44.anInt797 = 0;
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(Z)V")
	public static void method3975() {
		for (@Pc(8) Class2_Sub3_Sub2 local8 = (Class2_Sub3_Sub2) Static225.aClass44_62.method1359(); local8 != null; local8 = (Class2_Sub3_Sub2) Static225.aClass44_62.method1356()) {
			@Pc(19) Class5_Sub4 local19 = local8.aClass5_Sub4_1;
			if (Static137.anInt3136 != local19.anInt2486 || Static123.anInt2808 > local19.anInt2481) {
				local8.method3986();
			} else if (Static123.anInt2808 >= local19.anInt2470) {
				if (local19.anInt2472 > 0) {
					@Pc(52) Class5_Sub2_Sub1 local52 = Static95.aClass5_Sub2_Sub1Array1[local19.anInt2472 - 1];
					if (local52 != null && local52.anInt1849 >= 0 && local52.anInt1849 < 13312 && local52.anInt1827 >= 0 && local52.anInt1827 < 13312) {
						local19.method1930(Static123.anInt2808, Static208.method3667(local52.anInt1849, local19.anInt2486, local52.anInt1827) - local19.anInt2476, local52.anInt1827, local52.anInt1849);
					}
				}
				if (local19.anInt2472 < 0) {
					@Pc(105) int local105 = -local19.anInt2472 - 1;
					@Pc(112) Class5_Sub2_Sub2 local112;
					if (Static195.anInt4463 == local105) {
						local112 = Static31.aClass5_Sub2_Sub2_1;
					} else {
						local112 = Static213.aClass5_Sub2_Sub2Array3[local105];
					}
					if (local112 != null && local112.anInt1849 >= 0 && local112.anInt1849 < 13312 && local112.anInt1827 >= 0 && local112.anInt1827 < 13312) {
						local19.method1930(Static123.anInt2808, Static208.method3667(local112.anInt1849, local19.anInt2486, local112.anInt1827) - local19.anInt2476, local112.anInt1827, local112.anInt1849);
					}
				}
				local19.method1931(Static44.anInt797);
				Static183.method3367(Static137.anInt3136, (int) local19.aDouble7, (int) local19.aDouble4, (int) local19.aDouble9, 60, local19, local19.anInt2491, -1L, false);
			}
		}
	}
}
