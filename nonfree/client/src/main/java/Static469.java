import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static469 {

	@OriginalMember(owner = "client!pn", name = "d", descriptor = "Lclient!uq;")
	public static Class362 aClass362_104;

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "[I")
	public static final int[] anIntArray406 = new int[8];

	@OriginalMember(owner = "client!pn", name = "i", descriptor = "S")
	public static short aShort65 = 256;

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(BIZII)V")
	public static void method6284(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (!arg1 && arg2 == Static55.anInt1158 && arg0 == Static586.anInt9541 && (Static570.anInt9192 == Static566.anInt9142 || Static336.aClass3_Sub41_18.aClass14_Sub25_1.method6576() == 1)) {
			return;
		}
		Static586.anInt9541 = arg0;
		Static566.anInt9142 = Static570.anInt9192;
		Static55.anInt1158 = arg2;
		if (Static336.aClass3_Sub41_18.aClass14_Sub25_1.method6576() == 1) {
			Static566.anInt9142 = 0;
		}
		Static279.method4069(arg3);
		Static651.method8742(true, Static114.aClass84_12.method1729(Static654.anInt10668), Static119.aClass95_4, Static513.aClass91_12, Static184.aClass67_3);
		@Pc(64) int local64 = Static534.anInt8358;
		Static534.anInt8358 = (Static55.anInt1158 - (Static98.anInt361 >> 4)) * 8;
		@Pc(75) int local75 = Static402.anInt6661;
		Static402.anInt6661 = (Static586.anInt9541 - (Static438.anInt7120 >> 4)) * 8;
		Static194.aClass3_Sub5_Sub4_1 = Static671.method7626(Static55.anInt1158 * 8, Static586.anInt9541 * 8);
		Static406.aClass392_1 = null;
		@Pc(108) int local108 = Static534.anInt8358 - local64;
		@Pc(113) int local113 = Static402.anInt6661 - local75;
		@Pc(118) int local118;
		@Pc(131) int local131;
		@Pc(247) int local247;
		@Pc(193) int local193;
		if (arg3 == 11) {
			for (local118 = 0; local118 < Static331.anInt5501; local118++) {
				@Pc(124) Class3_Sub52 local124 = Static129.aClass3_Sub52Array3[local118];
				if (local124 != null) {
					@Pc(129) Class34_Sub1_Sub1_Sub2_Sub2 local129 = local124.aClass34_Sub1_Sub1_Sub2_Sub2_2;
					for (local131 = 0; local131 < 10; local131++) {
						local129.anIntArray529[local131] -= local108;
						local129.anIntArray528[local131] -= local113;
					}
					local129.anInt9614 -= local108 * 512;
					local129.anInt9619 -= local113 * 512;
				}
			}
		} else {
			@Pc(179) boolean local179 = false;
			Static52.anInt1140 = 0;
			@Pc(187) int local187 = Static98.anInt361 * 512 - 512;
			local193 = Static438.anInt7120 * 512 - 512;
			for (local131 = 0; local131 < Static331.anInt5501; local131++) {
				@Pc(201) Class3_Sub52 local201 = Static129.aClass3_Sub52Array3[local131];
				if (local201 != null) {
					@Pc(206) Class34_Sub1_Sub1_Sub2_Sub2 local206 = local201.aClass34_Sub1_Sub1_Sub2_Sub2_2;
					local206.anInt9619 -= local113 * 512;
					local206.anInt9614 -= local108 * 512;
					if (local206.anInt9614 >= 0 && local187 >= local206.anInt9614 && local206.anInt9619 >= 0 && local193 >= local206.anInt9619) {
						@Pc(245) boolean local245 = true;
						for (local247 = 0; local247 < 10; local247++) {
							local206.anIntArray529[local247] -= local108;
							local206.anIntArray528[local247] -= local113;
							if (local206.anIntArray529[local247] < 0 || local206.anIntArray529[local247] >= Static98.anInt361 || local206.anIntArray528[local247] < 0 || local206.anIntArray528[local247] >= Static438.anInt7120) {
								local245 = false;
							}
						}
						if (local245) {
							Static603.anIntArray537[Static52.anInt1140++] = local206.anInt9671;
						} else {
							local206.method7886((Class261) null);
							local201.method9034();
							local179 = true;
						}
					} else {
						local206.method7886((Class261) null);
						local201.method9034();
						local179 = true;
					}
				}
			}
			if (local179) {
				Static331.anInt5501 = Static105.aClass333_11.method7486();
				Static105.aClass333_11.method7483(Static129.aClass3_Sub52Array3);
			}
		}
		for (local118 = 0; local118 < 2048; local118++) {
			@Pc(359) Class34_Sub1_Sub1_Sub2_Sub1 local359 = Static506.aClass34_Sub1_Sub1_Sub2_Sub1Array1[local118];
			if (local359 != null) {
				for (local193 = 0; local193 < 10; local193++) {
					local359.anIntArray529[local193] -= local108;
					local359.anIntArray528[local193] -= local113;
				}
				local359.anInt9619 -= local113 * 512;
				local359.anInt9614 -= local108 * 512;
			}
		}
		@Pc(411) Class252[] local411 = Static171.aClass252Array1;
		for (local193 = 0; local193 < local411.length; local193++) {
			@Pc(419) Class252 local419 = local411[local193];
			if (local419 != null) {
				local419.anInt6674 -= local108 * 512;
				local419.anInt6676 -= local113 * 512;
			}
		}
		@Pc(451) Class3_Sub33 local451;
		for (local451 = (Class3_Sub33) Static346.aClass302_39.method6603(); local451 != null; local451 = (Class3_Sub33) Static346.aClass302_39.method6605()) {
			local451.anInt5170 -= local113;
			local451.anInt5169 -= local108;
			if (Static447.anInt7216 != 4 && (local451.anInt5169 < 0 || local451.anInt5170 < 0 || local451.anInt5169 >= Static98.anInt361 || Static438.anInt7120 <= local451.anInt5170)) {
				local451.method9034();
			}
		}
		for (local451 = (Class3_Sub33) Static153.aClass302_15.method6603(); local451 != null; local451 = (Class3_Sub33) Static153.aClass302_15.method6605()) {
			local451.anInt5169 -= local108;
			local451.anInt5170 -= local113;
			if (Static447.anInt7216 != 4 && (local451.anInt5169 < 0 || local451.anInt5170 < 0 || local451.anInt5169 >= Static98.anInt361 || local451.anInt5170 >= Static438.anInt7120)) {
				local451.method9034();
			}
		}
		if (Static447.anInt7216 != 4) {
			for (@Pc(556) Class3_Sub20 local556 = (Class3_Sub20) Static462.aClass333_29.method7490(); local556 != null; local556 = (Class3_Sub20) Static462.aClass333_29.method7487()) {
				@Pc(564) int local564 = (int) (local556.aLong313 & 0x3FFFL);
				@Pc(568) int local568 = local564 - Static534.anInt8358;
				local247 = (int) (local556.aLong313 >> 14 & 0x3FFFL);
				@Pc(581) int local581 = local247 - Static402.anInt6661;
				if (local568 < 0 || local581 < 0 || local568 >= Static98.anInt361 || Static438.anInt7120 <= local581) {
					local556.method9034();
				}
			}
		}
		if (Static622.anInt10293 != 0) {
			Static643.anInt10566 -= local113;
			Static622.anInt10293 -= local108;
		}
		Static101.method1642();
		if (arg3 != 11) {
			Static178.anInt3269 -= local108;
			Static564.anInt9117 -= local113 * 512;
			Static370.anInt6266 -= local108 * 512;
			Static93.anInt1931 -= local108;
			Static362.anInt6197 -= local113;
			Static76.anInt1481 -= local113;
			if (Math.abs(local108) > Static98.anInt361 || Math.abs(local113) > Static438.anInt7120) {
				Static451.method6102();
			}
		} else if (Static451.anInt7263 == 4) {
			Static365.anInt6231 -= local108 * 512;
			Static434.anInt7081 -= local113 * 512;
			Static82.anInt1511 -= local108 * 512;
			Static8.anInt108 -= local113 * 512;
		} else {
			Static468.anInt7425 = -1;
			Static351.anInt6038 = -1;
			Static451.anInt7263 = 1;
		}
		Static120.method1815();
		Static443.method6041();
		Static204.aClass302_20.method6614();
		Static29.aClass302_3.method6614();
		Static111.aClass317_1.method6896();
		Static163.method2593();
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "([BIIIII)V")
	public static void method6285(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		if (arg1 >= arg2) {
			return;
		}
		@Pc(24) int local24 = arg2 - arg1 >> 2;
		arg3 += arg1;
		while (true) {
			local24--;
			if (local24 < 0) {
				local24 = arg2 - arg1 & 0x3;
				while (true) {
					local24--;
					if (local24 < 0) {
						return;
					}
					arg0[arg3++] = 1;
				}
			}
			@Pc(33) int local33 = arg3 + 1;
			arg0[arg3] = 1;
			@Pc(38) int local38 = local33 + 1;
			arg0[local33] = 1;
			@Pc(43) int local43 = local38 + 1;
			arg0[local38] = 1;
			arg3 = local43 + 1;
			arg0[local43] = 1;
		}
	}

	@OriginalMember(owner = "client!pn", name = "b", descriptor = "(B)V")
	public static void method6287() {
		if (Static6.anInt84 <= 0) {
			Static89.aString26 = "";
			return;
		}
		@Pc(13) int local13 = 0;
		for (@Pc(15) int local15 = 0; local15 < Static239.aStringArray27.length; local15++) {
			if (Static239.aStringArray27[local15].indexOf("--> ") != -1) {
				local13++;
				if (local13 == Static6.anInt84) {
					Static89.aString26 = Static239.aStringArray27[local15].substring(Static239.aStringArray27[local15].indexOf(">") + 2);
					break;
				}
			}
		}
	}
}
