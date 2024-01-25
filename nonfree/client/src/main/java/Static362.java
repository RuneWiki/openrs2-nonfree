import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static362 {

	@OriginalMember(owner = "client!vg", name = "Hb", descriptor = "I")
	public static int anInt6102;

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(IIZIZ)V")
	public static void method5290(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		if (!arg3 && arg2 == Static94.anInt1924 && Static82.anInt1485 == arg0 && (Static130.anInt2658 == Static382.anInt6523 || Static231.method3740())) {
			return;
		}
		Static82.anInt1485 = arg0;
		Static130.anInt2658 = Static382.anInt6523;
		Static94.anInt1924 = arg2;
		if (Static231.method3740()) {
			Static130.anInt2658 = 0;
		}
		if (arg1) {
			Static104.method2180(28);
		} else {
			Static104.method2180(25);
		}
		Static108.method4606(Static319.aClass9_3, true, Static55.aClass32_21.method701(Static107.anInt2498));
		@Pc(59) int local59 = Static28.anInt606;
		Static28.anInt606 = (Static94.anInt1924 - (Static246.anInt4374 >> 4)) * 8;
		@Pc(70) int local70 = Static319.anInt5425;
		Static319.anInt5425 = (Static82.anInt1485 - (Static185.anInt3485 >> 4)) * 8;
		Static48.aClass2_Sub10_Sub8_1 = Static338.method3054(Static94.anInt1924 * 8, Static82.anInt1485 * 8);
		Static47.aClass209_1 = null;
		@Pc(94) int local94 = Static28.anInt606 - local59;
		@Pc(98) int local98 = Static319.anInt5425 - local70;
		@Pc(108) int local108;
		@Pc(116) int local116;
		if (arg1) {
			Static171.anInt3311 = 0;
			local108 = Static246.anInt4374 * 128 - 128;
			@Pc(114) int local114 = (Static185.anInt3485 - 1) * 128;
			for (local116 = 0; local116 < 32768; local116++) {
				@Pc(122) Class1_Sub5_Sub1_Sub2 local122 = Static299.aClass1_Sub5_Sub1_Sub2Array1[local116];
				if (local122 != null) {
					local122.anInt6386 -= local98 * 128;
					local122.anInt6390 -= local94 * 128;
					if (local122.anInt6390 >= 0 && local122.anInt6390 <= local108 && local122.anInt6386 >= 0 && local122.anInt6386 <= local114) {
						@Pc(159) boolean local159 = true;
						for (@Pc(161) int local161 = 0; local161 < 10; local161++) {
							local122.anIntArray1324[local161] -= local94;
							local122.anIntArray1323[local161] -= local98;
							if (local122.anIntArray1324[local161] < 0 || Static246.anInt4374 <= local122.anIntArray1324[local161] || local122.anIntArray1323[local161] < 0 || Static185.anInt3485 <= local122.anIntArray1323[local161]) {
								local159 = false;
							}
						}
						if (local159) {
							Static143.anIntArray583[Static171.anInt3311++] = local116;
						} else {
							Static299.aClass1_Sub5_Sub1_Sub2Array1[local116].method5566(null);
							Static299.aClass1_Sub5_Sub1_Sub2Array1[local116] = null;
						}
					} else {
						Static299.aClass1_Sub5_Sub1_Sub2Array1[local116].method5566(null);
						Static299.aClass1_Sub5_Sub1_Sub2Array1[local116] = null;
					}
				}
			}
		} else {
			for (local108 = 0; local108 < 32768; local108++) {
				@Pc(264) Class1_Sub5_Sub1_Sub2 local264 = Static299.aClass1_Sub5_Sub1_Sub2Array1[local108];
				if (local264 != null) {
					for (local116 = 0; local116 < 10; local116++) {
						local264.anIntArray1324[local116] -= local94;
						local264.anIntArray1323[local116] -= local98;
					}
					local264.anInt6386 -= local98 * 128;
					local264.anInt6390 -= local94 * 128;
				}
			}
		}
		for (local108 = 0; local108 < 2048; local108++) {
			@Pc(318) Class1_Sub5_Sub1_Sub1 local318 = Static125.aClass1_Sub5_Sub1_Sub1Array1[local108];
			if (local318 != null) {
				for (local116 = 0; local116 < 10; local116++) {
					local318.anIntArray1324[local116] -= local94;
					local318.anIntArray1323[local116] -= local98;
				}
				local318.anInt6386 -= local98 * 128;
				local318.anInt6390 -= local94 * 128;
			}
		}
		Static334.method4937(local98, local94);
		for (@Pc(375) Class2_Sub43 local375 = (Class2_Sub43) Static370.aClass30_43.method694(); local375 != null; local375 = (Class2_Sub43) Static370.aClass30_43.method682()) {
			local375.anInt6046 -= local98;
			local375.anInt6039 -= local94;
			if (local375.anInt6039 < 0 || local375.anInt6046 < 0 || Static246.anInt4374 <= local375.anInt6039 || Static185.anInt3485 <= local375.anInt6046) {
				local375.method5617();
			}
		}
		if (Static60.anInt1159 != 0) {
			Static60.anInt1159 -= local94;
			Static358.anInt2084 -= local98;
		}
		Static3.anInt135 = 0;
		if (arg1) {
			Static224.anInt4006 -= local94 * 128;
			Static235.anInt4192 -= local98;
			Static217.anInt3930 -= local94;
			Static51.anInt1057 -= local98 * 128;
			Static139.anInt2784 -= local94;
			Static296.anInt5089 -= local98;
			if (Math.abs(local94) > Static246.anInt4374 || Math.abs(local98) > Static185.anInt3485) {
				Static181.method5324();
			}
		} else if (Static79.anInt4624 == 4) {
			Static295.anInt5082 -= local98 * 128;
			Static28.anInt601 -= local94 * 128;
			Static290.anInt5046 -= local94 * 128;
			Static289.anInt5022 -= local98 * 128;
		} else {
			Static79.anInt4624 = 1;
		}
		Static202.method3430();
		Static51.method869();
		Static261.aClass30_37.method692();
		Static169.aClass30_19.method692();
		Static163.aClass154_4.method3488();
		Static125.method2504();
	}
}
