import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static192 {

	@OriginalMember(owner = "client!tg", name = "N", descriptor = "Lclient!vb;")
	public static Class7_Sub1 aClass7_Sub1_27;

	@OriginalMember(owner = "client!tg", name = "Q", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray11;

	@OriginalMember(owner = "client!tg", name = "J", descriptor = "I")
	public static int anInt4108 = 0;

	@OriginalMember(owner = "client!tg", name = "M", descriptor = "Lclient!kh;")
	private static Class60 aClass60_1388 = Static200.method3116("You can(Wt add yourself to your own friend list)3");

	@OriginalMember(owner = "client!tg", name = "T", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1389 = aClass60_1388;

	@OriginalMember(owner = "client!tg", name = "U", descriptor = "I")
	public static int anInt4115 = 0;

	@OriginalMember(owner = "client!tg", name = "ab", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1390 = Static200.method3116("<br>(X100(U(Y");

	@OriginalMember(owner = "client!tg", name = "bb", descriptor = "I")
	public static int anInt4121 = 0;

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "([BIII)I")
	public static int method3003(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) int local8 = -1;
		for (@Pc(14) int local14 = arg1; local14 < arg2; local14++) {
			local8 = Class91.anIntArray503[(local8 ^ arg0[local14]) & 0xFF] ^ local8 >>> 8;
		}
		return ~local8;
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(BIIII)V")
	public static void method3005(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static41.anInt971 < 100) {
			Static134.method2226();
		}
		Static76.method1363(arg3, arg2, arg3 + arg0, arg1 + arg2);
		@Pc(31) int local31;
		@Pc(42) int local42;
		if (Static41.anInt971 < 100) {
			local31 = arg0 / 2 + arg3;
			local42 = arg2 + arg1 / 2 - 38;
			Static76.method1367(arg3, arg2, arg0, arg1, 0);
			Static76.method1374(local31 - 152, local42, 304, 34, 9179409);
			Static76.method1374(local31 - 151, local42 + 1, 302, 32, 0);
			Static76.method1367(local31 - 150, local42 + 2, Static41.anInt971 * 3, 30, 9179409);
			Static76.method1367(local31 + Static41.anInt971 * 3 - 150, local42 + 2, 300 - Static41.anInt971 * 3, 30, 0);
			Static176.aClass1_Sub1_Sub14_2.method3314(Static40.aClass60_305, local31, local42 + 20, 16777215, -1);
			return;
		}
		Static63.anInt1581 = (int) ((double) (arg1 * 2) / Static82.aDouble2);
		local31 = Static1.anInt42 - (int) ((double) arg1 / Static82.aDouble2);
		@Pc(133) int local133 = Static138.anInt3087 - (int) ((double) arg0 / Static82.aDouble2);
		Static11.anInt4742 = Static138.anInt3087 - (int) ((double) arg0 / Static82.aDouble2);
		Static91.anInt2142 = (int) ((double) (arg0 * 2) / Static82.aDouble2);
		Static38.anInt878 = Static1.anInt42 - (int) ((double) arg1 / Static82.aDouble2);
		local42 = Static138.anInt3087 + (int) ((double) arg0 / Static82.aDouble2);
		@Pc(174) int local174 = (int) ((double) arg1 / Static82.aDouble2) + Static1.anInt42;
		Static134.method2229(local42, arg2, local174, arg2 + arg1, arg3, local31, arg3 + arg0, local133);
		Static143.method2458(local42, arg2, arg0 + arg3, local133, arg3, local31, local174, arg2 + arg1);
		if (Static216.anInt4616 > 0) {
			Static216.anInt4616--;
		}
		if (!Static9.aBoolean249) {
			return;
		}
		@Pc(222) int local222 = arg0 + arg3 - 5;
		@Pc(228) int local228 = arg1 + arg2 - 8;
		Static49.aClass1_Sub1_Sub14_3.method3308(Static34.method611(new Class60[] { Static31.aClass60_264, Static40.method681(Static35.anInt837) }), local222, local228, 16776960, -1);
		@Pc(249) int local249 = local228 - 15;
		@Pc(251) Runtime local251 = Runtime.getRuntime();
		@Pc(253) int local253 = 16776960;
		@Pc(262) int local262 = (int) ((local251.totalMemory() - local251.freeMemory()) / 1024L);
		if (local262 > 65536) {
			local253 = 16711680;
		}
		Static49.aClass1_Sub1_Sub14_3.method3308(Static34.method611(new Class60[] { Static200.aClass60_1461, Static40.method681(local262), Static59.aClass60_464 }), local222, local249, local253, -1);
		local228 = local249 - 15;
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(IZ)V")
	public static void method3006() {
		Static148.anIntArray653 = new int[104];
		Static125.anIntArray357 = new int[104];
		Static30.anInt722 = 99;
		Static160.anIntArray459 = new int[104];
		Static163.anIntArray464 = new int[104];
		Static80.anIntArray222 = new int[104];
		Static36.anIntArrayArrayArray22 = new int[4][105][105];
		Static100.aByteArrayArrayArray3 = new byte[4][104][104];
		Static108.aByteArrayArrayArray4 = new byte[4][104][104];
		Static201.aByteArrayArrayArray12 = new byte[4][105][105];
		Static66.aByteArrayArrayArray1 = new byte[4][104][104];
		Static173.aByteArrayArrayArray8 = new byte[4][104][104];
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(ZB)V")
	public static void method3008() {
		@Pc(12) byte[][] local12 = Static27.aByteArrayArray2;
		@Pc(17) int local17 = local12.length;
		@Pc(43) int local43;
		@Pc(32) int local32;
		for (@Pc(19) int local19 = 0; local19 < local17; local19++) {
			local32 = (Static193.anIntArray536[local19] & 0xFF) * 64 - Static163.anInt3587;
			local43 = (Static193.anIntArray536[local19] >> 8) * 64 - Static128.anInt2813;
			@Pc(47) byte[] local47 = local12[local19];
			if (local47 != null) {
				Static84.method1044();
				Static106.method1833(local32, local43, (Static36.anInt3891 - 6) * 8, Static134.anInt2900 * 8 - 48, Static153.aClass3Array1, local47);
			}
		}
		for (local43 = 0; local43 < local17; local43++) {
			local32 = (Static193.anIntArray536[local43] >> 8) * 64 - Static128.anInt2813;
			@Pc(93) byte[] local93 = local12[local43];
			@Pc(103) int local103 = (Static193.anIntArray536[local43] & 0xFF) * 64 - Static163.anInt3587;
			if (local93 == null && Static36.anInt3891 < 800) {
				Static84.method1044();
				for (@Pc(114) int local114 = 0; local114 < 4; local114++) {
					Static72.method1313(local114, local103, 64, local32, 64);
				}
			}
		}
	}
}
