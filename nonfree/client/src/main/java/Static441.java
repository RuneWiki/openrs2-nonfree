import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static441 {

	@OriginalMember(owner = "client!pn", name = "b", descriptor = "I")
	public static int anInt7979;

	@OriginalMember(owner = "client!pn", name = "j", descriptor = "Lclient!ea;")
	public static final Class73 aClass73_141 = new Class73(4, 6);

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(IIZII)V")
	public static void method6730(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (!arg1 && arg2 == Static300.anInt6134 && arg0 == Static484.anInt8559 && (Static86.anInt10575 == Static213.anInt4581 || Static87.aClass6_Sub33_6.aClass14_Sub3_2.method819() == 1)) {
			return;
		}
		Static300.anInt6134 = arg2;
		Static213.anInt4581 = Static86.anInt10575;
		Static484.anInt8559 = arg0;
		if (Static87.aClass6_Sub33_6.aClass14_Sub3_2.method819() == 1) {
			Static213.anInt4581 = 0;
		}
		Static119.method2558(arg3);
		Static52.method1637(Static184.aClass213_5, Static359.aClass34_7, true, Static467.aClass5_13, Static536.aClass316_14.method7577(Static638.anInt10709));
		@Pc(62) int local62 = Static477.anInt8412;
		Static477.anInt8412 = (Static300.anInt6134 - (Static306.anInt6176 >> 4)) * 8;
		@Pc(72) int local72 = Static227.anInt5049;
		Static227.anInt5049 = (Static484.anInt8559 - (Static108.anInt2930 >> 4)) * 8;
		Static457.aClass6_Sub5_Sub13_3 = Static491.method6573(Static300.anInt6134 * 8, Static484.anInt8559 * 8);
		Static511.aClass374_3 = null;
		@Pc(96) int local96 = Static477.anInt8412 - local62;
		@Pc(101) int local101 = Static227.anInt5049 - local72;
		@Pc(108) int local108;
		@Pc(121) int local121;
		@Pc(257) int local257;
		@Pc(185) int local185;
		if (arg3 == 11) {
			for (local108 = 0; local108 < Static337.anInt6701; local108++) {
				@Pc(114) Class6_Sub42 local114 = Static303.aClass6_Sub42Array1[local108];
				if (local114 != null) {
					@Pc(119) Class9_Sub4_Sub2_Sub1_Sub1 local119 = local114.aClass9_Sub4_Sub2_Sub1_Sub1_1;
					for (local121 = 0; local121 < 10; local121++) {
						local119.anIntArray197[local121] -= local96;
						local119.anIntArray198[local121] -= local101;
					}
					local119.anInt10357 -= local101 * 512;
					local119.anInt10360 -= local96 * 512;
				}
			}
		} else {
			Static288.anInt5977 = 0;
			@Pc(173) boolean local173 = false;
			@Pc(179) int local179 = (Static306.anInt6176 - 1) * 512;
			local185 = (Static108.anInt2930 - 1) * 512;
			for (local121 = 0; local121 < Static337.anInt6701; local121++) {
				@Pc(193) Class6_Sub42 local193 = Static303.aClass6_Sub42Array1[local121];
				if (local193 != null) {
					@Pc(198) Class9_Sub4_Sub2_Sub1_Sub1 local198 = local193.aClass9_Sub4_Sub2_Sub1_Sub1_1;
					local198.anInt10360 -= local96 * 512;
					local198.anInt10357 -= local101 * 512;
					if (local198.anInt10360 >= 0 && local198.anInt10360 <= local179 && local198.anInt10357 >= 0 && local185 >= local198.anInt10357) {
						@Pc(255) boolean local255 = true;
						for (local257 = 0; local257 < 10; local257++) {
							local198.anIntArray197[local257] -= local96;
							local198.anIntArray198[local257] -= local101;
							if (local198.anIntArray197[local257] < 0 || Static306.anInt6176 <= local198.anIntArray197[local257] || local198.anIntArray198[local257] < 0 || Static108.anInt2930 <= local198.anIntArray198[local257]) {
								local255 = false;
							}
						}
						if (local255) {
							Static562.anIntArray508[Static288.anInt5977++] = local198.anInt4299;
						} else {
							local198.method1994((Class158) null);
							local193.method8792();
							local173 = true;
						}
					} else {
						local198.method1994((Class158) null);
						local193.method8792();
						local173 = true;
					}
				}
			}
			if (local173) {
				Static337.anInt6701 = Static461.aClass380_35.method8756();
				Static461.aClass380_35.method8749(Static303.aClass6_Sub42Array1);
			}
		}
		for (local108 = 0; local108 < 2048; local108++) {
			@Pc(357) Class9_Sub4_Sub2_Sub1_Sub2 local357 = Static643.aClass9_Sub4_Sub2_Sub1_Sub2Array1[local108];
			if (local357 != null) {
				for (local185 = 0; local185 < 10; local185++) {
					local357.anIntArray197[local185] -= local96;
					local357.anIntArray198[local185] -= local101;
				}
				local357.anInt10357 -= local101 * 512;
				local357.anInt10360 -= local96 * 512;
			}
		}
		@Pc(409) Class50[] local409 = Static189.aClass50Array1;
		for (local185 = 0; local185 < local409.length; local185++) {
			@Pc(417) Class50 local417 = local409[local185];
			if (local417 != null) {
				local417.anInt2404 -= local96 * 512;
				local417.anInt2415 -= local101 * 512;
			}
		}
		@Pc(449) Class6_Sub36 local449;
		for (local449 = (Class6_Sub36) Static354.aClass163_40.method4966(); local449 != null; local449 = (Class6_Sub36) Static354.aClass163_40.method4965()) {
			local449.anInt7720 -= local96;
			local449.anInt7721 -= local101;
			if (Static643.anInt10750 != 4 && (local449.anInt7720 < 0 || local449.anInt7721 < 0 || local449.anInt7720 >= Static306.anInt6176 || Static108.anInt2930 <= local449.anInt7721)) {
				local449.method8792();
			}
		}
		for (local449 = (Class6_Sub36) Static122.aClass163_15.method4966(); local449 != null; local449 = (Class6_Sub36) Static122.aClass163_15.method4965()) {
			local449.anInt7721 -= local101;
			local449.anInt7720 -= local96;
			if (Static643.anInt10750 != 4 && (local449.anInt7720 < 0 || local449.anInt7721 < 0 || Static306.anInt6176 <= local449.anInt7720 || Static108.anInt2930 <= local449.anInt7721)) {
				local449.method8792();
			}
		}
		if (Static643.anInt10750 != 4) {
			for (@Pc(557) Class6_Sub47 local557 = (Class6_Sub47) Static283.aClass380_37.method8755(); local557 != null; local557 = (Class6_Sub47) Static283.aClass380_37.method8752()) {
				@Pc(565) int local565 = (int) (local557.aLong278 & 0x3FFFL);
				@Pc(570) int local570 = local565 - Static477.anInt8412;
				local257 = (int) (local557.aLong278 >> 14 & 0x3FFFL);
				@Pc(583) int local583 = local257 - Static227.anInt5049;
				if (local570 < 0 || local583 < 0 || Static306.anInt6176 <= local570 || Static108.anInt2930 <= local583) {
					local557.method8792();
				}
			}
		}
		if (Static473.anInt8390 != 0) {
			Static445.anInt8080 -= local101;
			Static473.anInt8390 -= local96;
		}
		Static392.method6202();
		if (arg3 != 11) {
			Static340.anInt6769 -= local101;
			Static18.anInt621 -= local96;
			Static617.anInt10422 -= local96;
			Static187.anInt4085 -= local101;
			Static259.anInt6990 -= local101 * 512;
			Static184.anInt4048 -= local96 * 512;
			if (Math.abs(local96) > Static306.anInt6176 || Math.abs(local101) > Static108.anInt2930) {
				Static638.method8737();
			}
		} else if (Static554.anInt9497 == 4) {
			Static387.anInt7286 -= local101 * 512;
			Static260.anInt5570 -= local101 * 512;
			Static369.anInt7056 -= local96 * 512;
			Static150.anInt3512 -= local96 * 512;
		} else {
			Static594.anInt10048 = -1;
			Static214.anInt4587 = -1;
			Static554.anInt9497 = 1;
		}
		Static393.method6210();
		Static485.method7134();
		Static158.aClass163_20.method4970();
		Static493.aClass163_51.method4970();
		Static482.aClass234_12.method6091();
		Static256.method4521();
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;I)V")
	public static void method6731(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		Static326.anInt6465 = arg2;
		Static554.anInt9496 = 2;
		Static581.method8051(false, arg1, arg0);
	}
}
