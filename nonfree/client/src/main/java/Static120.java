import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static120 {

	@OriginalMember(owner = "client!hk", name = "J", descriptor = "[I")
	public static final int[] anIntArray247 = new int[] { 0, 0, 0, 64, 128, 128, 128, 64, 64, 96, 32, 32, 64 };

	@OriginalMember(owner = "client!hk", name = "c", descriptor = "(Z)V")
	public static void method2526() {
		if (Static72.aString15.length() == 0) {
			return;
		}
		Static224.method4040("--> " + Static72.aString15);
		Static28.method5507(Static72.aString15, false);
		Static168.anInt6695 = 0;
		Static161.anInt3459 = 0;
		Static72.aString15 = "";
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(II)I")
	public static int method2527(@OriginalArg(1) int arg0) {
		return arg0 >>> 7;
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(IZIIZZII)V")
	public static void method2528(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (!arg1 && arg3 == Static103.anInt2592 && arg2 == Static36.anInt1007 && (Static263.anInt6816 == arg5 || Static76.method1750())) {
			return;
		}
		Static36.anInt1007 = arg2;
		Static103.anInt2592 = arg3;
		Static263.anInt6816 = arg5;
		if (Static76.method1750()) {
			Static263.anInt6816 = 0;
		}
		if (arg4) {
			Static243.method5095(28);
		} else {
			Static243.method5095(25);
		}
		Static3.method124(true, Static341.aClass159_23.method4311(Static180.anInt3835), Static238.aClass51_6);
		@Pc(55) int local55 = Static286.anInt6699;
		Static286.anInt6699 = (Static103.anInt2592 - (Static350.anInt6637 >> 4)) * 8;
		@Pc(65) int local65 = Static136.anInt3193;
		Static136.anInt3193 = (Static36.anInt1007 - (Static105.anInt2647 >> 4)) * 8;
		Static233.aClass4_Sub4_Sub11_2 = Static54.method4174(Static103.anInt2592 * 8, Static36.anInt1007 * 8);
		Static24.aClass137_1 = null;
		@Pc(88) int local88 = Static286.anInt6699 - local55;
		@Pc(93) int local93 = Static136.anInt3193 - local65;
		@Pc(97) int local97;
		@Pc(107) int local107;
		if (arg4) {
			Static145.anInt3273 = 0;
			local97 = Static350.anInt6637 * 128 - 128;
			@Pc(169) int local169 = Static105.anInt2647 * 128 - 128;
			for (local107 = 0; local107 < 32768; local107++) {
				@Pc(177) Class8_Sub1_Sub2_Sub2 local177 = Static169.aClass8_Sub1_Sub2_Sub2Array1[local107];
				if (local177 != null) {
					local177.anInt6702 -= local93 * 128;
					local177.anInt6701 -= local88 * 128;
					if (local177.anInt6701 >= 0 && local177.anInt6701 <= local97 && local177.anInt6702 >= 0 && local177.anInt6702 <= local169) {
						@Pc(222) boolean local222 = true;
						for (@Pc(224) int local224 = 0; local224 < 10; local224++) {
							local177.anIntArray415[local224] -= local88;
							local177.anIntArray416[local224] -= local93;
							if (local177.anIntArray415[local224] < 0 || Static350.anInt6637 <= local177.anIntArray415[local224] || local177.anIntArray416[local224] < 0 || Static105.anInt2647 <= local177.anIntArray416[local224]) {
								local222 = false;
							}
						}
						if (local222) {
							Static354.anIntArray510[Static145.anInt3273++] = local107;
						} else {
							Static169.aClass8_Sub1_Sub2_Sub2Array1[local107].method4356(null);
							Static169.aClass8_Sub1_Sub2_Sub2Array1[local107] = null;
						}
					} else {
						Static169.aClass8_Sub1_Sub2_Sub2Array1[local107].method4356(null);
						Static169.aClass8_Sub1_Sub2_Sub2Array1[local107] = null;
					}
				}
			}
		} else {
			for (local97 = 0; local97 < 32768; local97++) {
				@Pc(103) Class8_Sub1_Sub2_Sub2 local103 = Static169.aClass8_Sub1_Sub2_Sub2Array1[local97];
				if (local103 != null) {
					for (local107 = 0; local107 < 10; local107++) {
						local103.anIntArray415[local107] -= local88;
						local103.anIntArray416[local107] -= local93;
					}
					local103.anInt6701 -= local88 * 128;
					local103.anInt6702 -= local93 * 128;
				}
			}
		}
		for (local97 = 0; local97 < 2048; local97++) {
			@Pc(328) Class8_Sub1_Sub2_Sub1 local328 = Static327.aClass8_Sub1_Sub2_Sub1Array1[local97];
			if (local328 != null) {
				for (local107 = 0; local107 < 10; local107++) {
					local328.anIntArray415[local107] -= local88;
					local328.anIntArray416[local107] -= local93;
				}
				local328.anInt6701 -= local88 * 128;
				local328.anInt6702 -= local93 * 128;
			}
		}
		Static12.anInt267 = arg5;
		Static158.aClass8_Sub1_Sub2_Sub1_1.method2084(Static12.anInt267, arg6, false, arg0);
		Static292.method4889(local93, local88);
		for (@Pc(394) Class4_Sub32 local394 = (Class4_Sub32) Static82.aClass116_11.method3270(); local394 != null; local394 = (Class4_Sub32) Static82.aClass116_11.method3272()) {
			local394.anInt4726 -= local88;
			local394.anInt4722 -= local93;
			if (local394.anInt4726 < 0 || local394.anInt4722 < 0 || Static350.anInt6637 <= local394.anInt4726 || Static105.anInt2647 <= local394.anInt4722) {
				local394.method5687();
			}
		}
		if (Static18.anInt369 != 0) {
			Static39.anInt1027 -= local93;
			Static18.anInt369 -= local88;
		}
		Static187.anInt3921 = 0;
		if (arg4) {
			Static124.anInt2958 -= local93;
			Static237.anInt6655 -= local88;
			Static129.anInt3039 -= local93 * 128;
			Static240.anInt4829 -= local88 * 128;
			Static63.anInt1629 -= local88;
			Static74.anInt1924 -= local93;
			if (Math.abs(local88) > Static350.anInt6637 || Math.abs(local93) > Static105.anInt2647) {
				Static244.method4316();
			}
		} else if (Static353.anInt2640 == 4) {
			Static64.anInt1662 -= local88 * 128;
			Static354.anInt6740 -= local93 * 128;
			Static207.anInt4327 -= local93 * 128;
			Static193.anInt4286 -= local88 * 128;
		} else {
			Static353.anInt2640 = 1;
		}
		Static335.method5408();
		Static294.method4911();
		Static337.aClass116_46.method3273();
		Static321.aClass116_41.method3273();
		Static283.aClass32_10.method851();
		Static322.method2267();
	}
}
