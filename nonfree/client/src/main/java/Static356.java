import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static356 {

	@OriginalMember(owner = "client!se", name = "k", descriptor = "Lclient!ff;")
	public static Class81 aClass81_160;

	@OriginalMember(owner = "client!se", name = "c", descriptor = "Lclient!jp;")
	public static final Class129 aClass129_54 = new Class129(4);

	@OriginalMember(owner = "client!se", name = "m", descriptor = "[I")
	public static final int[] anIntArray422 = new int[1000];

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/String;")
	public static String method4993(@OriginalArg(1) String arg0) {
		@Pc(14) String local14 = Static106.method1650(Static41.method777(arg0));
		if (local14 == null) {
			local14 = "";
		}
		return local14;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(III)V")
	public static void method4996(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class2_Sub2_Sub2 local8 = Static15.method236(arg1, 5);
		local8.method434();
		local8.anInt657 = arg0;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(IZ)I")
	public static int method4997(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(IIZBZ)V")
	public static void method4998(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) boolean arg3) {
		if (!arg3 && Static447.anInt4685 == arg0 && arg1 == Static190.anInt3756 && (Static179.anInt6503 == Static301.anInt5383 || Static399.aClass167_Sub1_1.method4528(Static281.anInt5126))) {
			return;
		}
		Static179.anInt6503 = Static301.anInt5383;
		Static190.anInt3756 = arg1;
		Static447.anInt4685 = arg0;
		if (Static399.aClass167_Sub1_1.method4528(Static281.anInt5126)) {
			Static179.anInt6503 = 0;
		}
		if (arg2) {
			Static446.method6043(28);
		} else {
			Static446.method6043(25);
		}
		Static32.method437(Static345.aClass256_76.method5720(Static272.anInt7537), Static184.aClass56_2, true);
		@Pc(67) int local67 = Static173.anInt3340;
		@Pc(69) int local69 = Static379.anInt6721;
		Static173.anInt3340 = (Static447.anInt4685 - (Static81.anInt1950 >> 4)) * 8;
		Static379.anInt6721 = (Static190.anInt3756 - (Static171.anInt3288 >> 4)) * 8;
		Static3.aClass2_Sub2_Sub11_1 = Static169.method2542(Static447.anInt4685 * 8, Static190.anInt3756 * 8);
		Static269.aClass201_3 = null;
		@Pc(102) int local102 = Static173.anInt3340 - local67;
		@Pc(107) int local107 = Static379.anInt6721 - local69;
		@Pc(117) int local117;
		@Pc(125) int local125;
		if (arg2) {
			Static391.anInt6867 = 0;
			local117 = Static81.anInt1950 * 128 - 128;
			@Pc(123) int local123 = (Static171.anInt3288 - 1) * 128;
			for (local125 = 0; local125 < 32768; local125++) {
				@Pc(131) Class4_Sub2_Sub2_Sub2 local131 = Static4.aClass4_Sub2_Sub2_Sub2Array1[local125];
				if (local131 != null) {
					local131.anInt7111 -= local107 * 128;
					local131.anInt7117 -= local102 * 128;
					if (local131.anInt7117 >= 0 && local131.anInt7117 <= local117 && local131.anInt7111 >= 0 && local131.anInt7111 <= local123) {
						@Pc(179) boolean local179 = true;
						for (@Pc(181) int local181 = 0; local181 < 10; local181++) {
							local131.anIntArray436[local181] -= local102;
							local131.anIntArray437[local181] -= local107;
							if (local131.anIntArray436[local181] < 0 || Static81.anInt1950 <= local131.anIntArray436[local181] || local131.anIntArray437[local181] < 0 || Static171.anInt3288 <= local131.anIntArray437[local181]) {
								local179 = false;
							}
						}
						if (local179) {
							Static312.anIntArray202[Static391.anInt6867++] = local125;
						} else {
							Static4.aClass4_Sub2_Sub2_Sub2Array1[local125].method5135(null);
							Static4.aClass4_Sub2_Sub2_Sub2Array1[local125] = null;
						}
					} else {
						Static4.aClass4_Sub2_Sub2_Sub2Array1[local125].method5135(null);
						Static4.aClass4_Sub2_Sub2_Sub2Array1[local125] = null;
					}
				}
			}
		} else {
			for (local117 = 0; local117 < 32768; local117++) {
				@Pc(286) Class4_Sub2_Sub2_Sub2 local286 = Static4.aClass4_Sub2_Sub2_Sub2Array1[local117];
				if (local286 != null) {
					for (local125 = 0; local125 < 10; local125++) {
						local286.anIntArray436[local125] -= local102;
						local286.anIntArray437[local125] -= local107;
					}
					local286.anInt7111 -= local107 * 128;
					local286.anInt7117 -= local102 * 128;
				}
			}
		}
		for (local117 = 0; local117 < 2048; local117++) {
			@Pc(342) Class4_Sub2_Sub2_Sub1 local342 = Static129.aClass4_Sub2_Sub2_Sub1Array27[local117];
			if (local342 != null) {
				for (local125 = 0; local125 < 10; local125++) {
					local342.anIntArray436[local125] -= local102;
					local342.anIntArray437[local125] -= local107;
				}
				local342.anInt7117 -= local102 * 128;
				local342.anInt7111 -= local107 * 128;
			}
		}
		@Pc(392) Class233[] local392 = Static2.aClass233Array1;
		for (local125 = 0; local125 < local392.length; local125++) {
			@Pc(400) Class233 local400 = local392[local125];
			if (local400 != null) {
				local400.anInt6829 -= local102 * 128;
				local400.anInt6824 -= local107 * 128;
			}
		}
		Static68.method1272(local107, local102);
		for (@Pc(436) Class2_Sub10 local436 = (Class2_Sub10) Static222.aClass265_32.method6005(); local436 != null; local436 = (Class2_Sub10) Static222.aClass265_32.method6001()) {
			local436.anInt1387 -= local107;
			local436.anInt1383 -= local102;
			if (Static200.anInt7590 != 3 && (local436.anInt1383 < 0 || local436.anInt1387 < 0 || local436.anInt1383 >= Static81.anInt1950 || Static171.anInt3288 <= local436.anInt1387)) {
				local436.method6072();
			}
		}
		if (Static425.anInt5530 != 0) {
			Static425.anInt5530 -= local102;
			Static176.anInt3417 -= local107;
		}
		Static189.method2981();
		if (arg2) {
			Static361.anInt6359 -= local107;
			Static293.anInt5621 -= local107 * 128;
			Static451.anInt1568 -= local102;
			Static225.anInt4310 -= local102 * 128;
			Static164.anInt3205 -= local102;
			Static142.anInt2719 -= local107;
			if (Math.abs(local102) > Static81.anInt1950 || Math.abs(local107) > Static171.anInt3288) {
				Static272.method5841();
			}
		} else if (Static65.anInt7824 == 4) {
			Static349.anInt6145 -= local102 * 128;
			Static177.anInt3430 -= local107 * 128;
			Static352.anInt7237 -= local107 * 128;
			Static422.anInt7372 -= local102 * 128;
		} else {
			Static65.anInt7824 = 1;
		}
		Static407.method5519();
		Static210.method3244();
		Static422.aClass265_51.method6003();
		Static411.aClass265_50.method6003();
		Static316.aClass184_4.method4216();
		Static362.method5048();
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(ZI)I")
	public static int method4999(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}
}
