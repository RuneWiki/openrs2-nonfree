import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static187 {

	@OriginalMember(owner = "client!jm", name = "g", descriptor = "[[S")
	public static short[][] aShortArrayArray4;

	@OriginalMember(owner = "client!jm", name = "h", descriptor = "I")
	public static int anInt3618;

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "Lclient!kl;")
	public static final Class142 aClass142_65 = new Class142(9, 0, 4, 1);

	@OriginalMember(owner = "client!jm", name = "d", descriptor = "Lclient!di;")
	public static final Class54 aClass54_53 = new Class54(66, 2);

	@OriginalMember(owner = "client!jm", name = "f", descriptor = "Lclient!wj;")
	public static final Class265 aClass265_76 = new Class265(108, -2);

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(ILclient!co;)V")
	public static void method2963(@OriginalArg(1) Class3_Sub2_Sub1 arg0) {
		@Pc(9) int local9 = arg0.anInt6181 - Static131.anInt2821;
		@Pc(21) int local21 = arg0.anInt6175 * 128 + arg0.method4935() * 64;
		@Pc(32) int local32 = arg0.anInt6173 * 128 + arg0.method4935() * 64;
		arg0.anInt6203 = 0;
		arg0.anInt6119 += (local21 - arg0.anInt6119) / local9;
		arg0.anInt6121 += (local32 - arg0.anInt6121) / local9;
		if (arg0.anInt6131 == 0) {
			arg0.method4928(8192);
		}
		if (arg0.anInt6131 == 1) {
			arg0.method4928(12288);
		}
		if (arg0.anInt6131 == 2) {
			arg0.method4928(0);
		}
		if (arg0.anInt6131 == 3) {
			arg0.method4928(4096);
		}
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(I)V")
	public static void method2964() {
		Static31.aClass148_3.method3345();
		Static44.aClass47_2.method898();
		Static356.aClass259_2.method5682();
		Static118.aClass165_2.method3803();
		Static219.aClass76_2.method1889();
		Static318.aClass144_6.method3263();
		Static338.aClass12_2.method252();
		Static395.aClass247_2.method5403();
		Static166.aClass6_1.method195();
		Static191.aClass151_1.method3404();
		Static262.aClass51_3.method1143();
		Static258.aClass120_4.method2657();
		Static357.aClass215_4.method4742();
		Static250.aClass78_1.method1964();
		Static186.aClass161_1.method3730();
		Static154.aClass252_1.method5613();
		Static318.aClass131_5.method2953();
		Static418.aClass86_1.method2085();
		Static254.aClass263_1.method5704();
		Static40.aClass84_1.method2054();
		Static352.method4793();
		Static321.method4514();
		Static182.method2925();
		Static114.method2040();
		Static34.aClass171_4.method3934();
		Static450.aClass171_63.method3934();
		Static228.aClass171_37.method3934();
		Static236.aClass171_38.method3934();
		Static168.aClass171_26.method3934();
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(ZIIBZ)V")
	public static void method2965(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3) {
		if (!arg3 && Static455.anInt5548 == arg2 && Static376.anInt6396 == arg1 && (Static427.anInt7117 == Static383.anInt6436 || Static12.aClass79_Sub1_1.method3966(Static399.anInt6653))) {
			return;
		}
		Static376.anInt6396 = arg1;
		Static455.anInt5548 = arg2;
		Static427.anInt7117 = Static383.anInt6436;
		if (Static12.aClass79_Sub1_1.method3966(Static399.anInt6653)) {
			Static427.anInt7117 = 0;
		}
		if (arg0) {
			Static365.method4986(28);
		} else {
			Static365.method4986(25);
		}
		Static452.method5851(Static368.aClass116_4, true, Static99.aClass209_54.method4562(Static388.anInt6533));
		@Pc(59) int local59 = Static48.anInt962;
		Static48.anInt962 = (Static455.anInt5548 - (Static229.anInt4427 >> 4)) * 8;
		@Pc(70) int local70 = Static324.anInt5624;
		Static324.anInt5624 = (Static376.anInt6396 - (Static379.anInt6422 >> 4)) * 8;
		Static389.aClass2_Sub5_Sub12_3 = Static88.method3645(Static455.anInt5548 * 8, Static376.anInt6396 * 8);
		Static322.aClass153_3 = null;
		@Pc(93) int local93 = Static48.anInt962 - local59;
		@Pc(98) int local98 = Static324.anInt5624 - local70;
		@Pc(108) int local108;
		@Pc(116) int local116;
		if (arg0) {
			Static62.anInt1371 = 0;
			local108 = (Static229.anInt4427 - 1) * 128;
			@Pc(114) int local114 = Static379.anInt6422 * 128 - 128;
			for (local116 = 0; local116 < 32768; local116++) {
				@Pc(122) Class3_Sub2_Sub1_Sub1 local122 = Static174.aClass3_Sub2_Sub1_Sub1Array1[local116];
				if (local122 != null) {
					local122.anInt6119 -= local93 * 128;
					local122.anInt6121 -= local98 * 128;
					if (local122.anInt6119 >= 0 && local108 >= local122.anInt6119 && local122.anInt6121 >= 0 && local114 >= local122.anInt6121) {
						@Pc(160) boolean local160 = true;
						for (@Pc(162) int local162 = 0; local162 < 10; local162++) {
							local122.anIntArray525[local162] -= local93;
							local122.anIntArray524[local162] -= local98;
							if (local122.anIntArray525[local162] < 0 || local122.anIntArray525[local162] >= Static229.anInt4427 || local122.anIntArray524[local162] < 0 || Static379.anInt6422 <= local122.anIntArray524[local162]) {
								local160 = false;
							}
						}
						if (local160) {
							Static173.anIntArray307[Static62.anInt1371++] = local116;
						} else {
							Static174.aClass3_Sub2_Sub1_Sub1Array1[local116].method1426(null);
							Static174.aClass3_Sub2_Sub1_Sub1Array1[local116] = null;
						}
					} else {
						Static174.aClass3_Sub2_Sub1_Sub1Array1[local116].method1426(null);
						Static174.aClass3_Sub2_Sub1_Sub1Array1[local116] = null;
					}
				}
			}
		} else {
			for (local108 = 0; local108 < 32768; local108++) {
				@Pc(269) Class3_Sub2_Sub1_Sub1 local269 = Static174.aClass3_Sub2_Sub1_Sub1Array1[local108];
				if (local269 != null) {
					for (local116 = 0; local116 < 10; local116++) {
						local269.anIntArray525[local116] -= local93;
						local269.anIntArray524[local116] -= local98;
					}
					local269.anInt6121 -= local98 * 128;
					local269.anInt6119 -= local93 * 128;
				}
			}
		}
		for (local108 = 0; local108 < 2048; local108++) {
			@Pc(323) Class3_Sub2_Sub1_Sub2 local323 = Static74.aClass3_Sub2_Sub1_Sub2Array1[local108];
			if (local323 != null) {
				for (local116 = 0; local116 < 10; local116++) {
					local323.anIntArray525[local116] -= local93;
					local323.anIntArray524[local116] -= local98;
				}
				local323.anInt6121 -= local98 * 128;
				local323.anInt6119 -= local93 * 128;
			}
		}
		@Pc(373) Class237[] local373 = Static20.aClass237Array1;
		for (local116 = 0; local116 < local373.length; local116++) {
			@Pc(381) Class237 local381 = local373[local116];
			if (local381 != null) {
				local381.anInt6459 -= local93 * 128;
				local381.anInt6458 -= local98 * 128;
			}
		}
		Static221.method3469(local93, local98);
		for (@Pc(423) Class2_Sub11 local423 = (Class2_Sub11) Static362.aClass14_42.method309(); local423 != null; local423 = (Class2_Sub11) Static362.aClass14_42.method311()) {
			local423.anInt1615 -= local98;
			local423.anInt1614 -= local93;
			if (Static402.anInt6692 != 3 && (local423.anInt1614 < 0 || local423.anInt1615 < 0 || Static229.anInt4427 <= local423.anInt1614 || Static379.anInt6422 <= local423.anInt1615)) {
				local423.method5866();
			}
		}
		if (Static66.anInt134 != 0) {
			Static220.anInt4265 -= local98;
			Static66.anInt134 -= local93;
		}
		Static362.method4939();
		if (arg0) {
			Static28.anInt627 -= local98;
			Static364.anInt6270 -= local93 * 128;
			Static23.anInt567 -= local98 * 128;
			Static262.anInt6676 -= local98;
			Static80.anInt7141 -= local93;
			Static233.anInt4506 -= local93;
			if (Math.abs(local93) > Static229.anInt4427 || Math.abs(local98) > Static379.anInt6422) {
				Static277.method4067();
			}
		} else if (Static159.anInt3195 == 4) {
			Static405.anInt6749 -= local93 * 128;
			Static186.anInt3613 -= local98 * 128;
			Static335.anInt941 -= local98 * 128;
			Static290.anInt5208 -= local93 * 128;
		} else {
			Static159.anInt3195 = 1;
		}
		Static22.method462();
		Static154.method2542();
		Static31.aClass14_1.method305();
		Static391.aClass14_36.method305();
		Static116.aClass112_6.method2549();
		Static118.method2094();
	}
}
