import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static149 {

	@OriginalMember(owner = "client!hg", name = "D", descriptor = "[I")
	public static final int[] anIntArray247 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

	@OriginalMember(owner = "client!hg", name = "J", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray30 = new String[] { "en", "de", "fr", "pt", "nl" };

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public static boolean method2259(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(11) int local11 = 0; local11 < Static87.anInt1697; local11++) {
			if (arg0.equalsIgnoreCase(Static349.aStringArray14[local11])) {
				return true;
			}
			if (arg0.equalsIgnoreCase(Static329.aStringArray45[local11])) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(ZZIII)V")
	public static void method2261(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (!arg1 && arg2 == Static13.anInt330 && Static138.anInt2346 == arg3 && (Static424.anInt7348 == Static152.anInt2600 || Static389.aClass128_Sub1_1.method2984(Static285.anInt7839))) {
			return;
		}
		Static138.anInt2346 = arg3;
		Static13.anInt330 = arg2;
		Static424.anInt7348 = Static152.anInt2600;
		if (Static389.aClass128_Sub1_1.method2984(Static285.anInt7839)) {
			Static424.anInt7348 = 0;
		}
		if (arg0) {
			Static455.method4431(28);
		} else {
			Static455.method4431(25);
		}
		Static289.method4079(Static372.aClass129_6, Static364.aClass84_84.method1678(Static167.anInt3118), true);
		@Pc(63) int local63 = Static437.anInt7555;
		Static437.anInt7555 = (Static13.anInt330 - (Static135.anInt2314 >> 4)) * 8;
		@Pc(74) int local74 = Static134.anInt5502;
		Static134.anInt5502 = (Static138.anInt2346 - (Static352.anInt6022 >> 4)) * 8;
		Static324.aClass1_Sub2_Sub12_3 = Static7.method2273(Static13.anInt330 * 8, Static138.anInt2346 * 8);
		Static208.aClass222_3 = null;
		@Pc(97) int local97 = Static437.anInt7555 - local63;
		@Pc(102) int local102 = Static134.anInt5502 - local74;
		@Pc(112) int local112;
		@Pc(120) int local120;
		if (arg0) {
			Static288.anInt5039 = 0;
			local112 = Static135.anInt2314 * 128 - 128;
			@Pc(118) int local118 = (Static352.anInt6022 - 1) * 128;
			for (local120 = 0; local120 < 32768; local120++) {
				@Pc(126) Class26_Sub2_Sub2_Sub2 local126 = Static410.aClass26_Sub2_Sub2_Sub2Array1[local120];
				if (local126 != null) {
					local126.anInt7068 -= local97 * 128;
					local126.anInt7065 -= local102 * 128;
					if (local126.anInt7068 >= 0 && local112 >= local126.anInt7068 && local126.anInt7065 >= 0 && local118 >= local126.anInt7065) {
						@Pc(167) boolean local167 = true;
						for (@Pc(169) int local169 = 0; local169 < 10; local169++) {
							local126.anIntArray590[local169] -= local97;
							local126.anIntArray589[local169] -= local102;
							if (local126.anIntArray590[local169] < 0 || Static135.anInt2314 <= local126.anIntArray590[local169] || local126.anIntArray589[local169] < 0 || local126.anIntArray589[local169] >= Static352.anInt6022) {
								local167 = false;
							}
						}
						if (local167) {
							Static212.anIntArray28[Static288.anInt5039++] = local120;
						} else {
							Static410.aClass26_Sub2_Sub2_Sub2Array1[local120].method5546(null);
							Static410.aClass26_Sub2_Sub2_Sub2Array1[local120] = null;
						}
					} else {
						Static410.aClass26_Sub2_Sub2_Sub2Array1[local120].method5546(null);
						Static410.aClass26_Sub2_Sub2_Sub2Array1[local120] = null;
					}
				}
			}
		} else {
			for (local112 = 0; local112 < 32768; local112++) {
				@Pc(268) Class26_Sub2_Sub2_Sub2 local268 = Static410.aClass26_Sub2_Sub2_Sub2Array1[local112];
				if (local268 != null) {
					for (local120 = 0; local120 < 10; local120++) {
						local268.anIntArray590[local120] -= local97;
						local268.anIntArray589[local120] -= local102;
					}
					local268.anInt7068 -= local97 * 128;
					local268.anInt7065 -= local102 * 128;
				}
			}
		}
		for (local112 = 0; local112 < 2048; local112++) {
			@Pc(322) Class26_Sub2_Sub2_Sub1 local322 = Static311.aClass26_Sub2_Sub2_Sub1Array1[local112];
			if (local322 != null) {
				for (local120 = 0; local120 < 10; local120++) {
					local322.anIntArray590[local120] -= local97;
					local322.anIntArray589[local120] -= local102;
				}
				local322.anInt7068 -= local97 * 128;
				local322.anInt7065 -= local102 * 128;
			}
		}
		@Pc(372) Class3[] local372 = Static444.aClass3Array1;
		for (local120 = 0; local120 < local372.length; local120++) {
			@Pc(380) Class3 local380 = local372[local120];
			if (local380 != null) {
				local380.anInt172 -= local102 * 128;
				local380.anInt168 -= local97 * 128;
			}
		}
		Static175.method2734(local97, local102);
		for (@Pc(412) Class1_Sub19 local412 = (Class1_Sub19) Static225.aClass266_35.method6000(); local412 != null; local412 = (Class1_Sub19) Static225.aClass266_35.method5994()) {
			local412.anInt3387 -= local97;
			local412.anInt3386 -= local102;
			if (Static12.anInt325 != 3 && (local412.anInt3387 < 0 || local412.anInt3386 < 0 || local412.anInt3387 >= Static135.anInt2314 || Static352.anInt6022 <= local412.anInt3386)) {
				local412.method6071();
			}
		}
		if (Static270.anInt4850 != 0) {
			Static3.anInt169 -= local102;
			Static270.anInt4850 -= local97;
		}
		Static12.method298();
		if (arg0) {
			Static402.anInt6941 -= local102 * 128;
			Static91.anInt1741 -= local97;
			Static139.anInt2356 -= local102;
			Static282.anInt4980 -= local102;
			Static306.anInt5497 -= local97 * 128;
			Static307.anInt5523 -= local97;
			if (Math.abs(local97) > Static135.anInt2314 || Math.abs(local102) > Static352.anInt6022) {
				Static215.method3267();
			}
		} else if (Static310.anInt5540 == 4) {
			Static220.anInt3977 -= local97 * 128;
			Static356.anInt6062 -= local97 * 128;
			Static202.anInt3669 -= local102 * 128;
			Static57.anInt1180 -= local102 * 128;
		} else {
			Static310.anInt5540 = 1;
		}
		Static180.method2776();
		Static209.method6067();
		Static136.aClass266_16.method6004();
		Static193.aClass266_10.method6004();
		Static129.aClass188_2.method4529();
		Static42.method685();
	}
}
