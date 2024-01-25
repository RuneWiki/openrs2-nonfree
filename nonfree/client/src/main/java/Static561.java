import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static561 {

	@OriginalMember(owner = "client!su", name = "b", descriptor = "Z")
	public static final boolean aBoolean672 = false;

	@OriginalMember(owner = "client!su", name = "k", descriptor = "Lclient!hj;")
	public static final Class151 aClass151_188 = new Class151(90, 4);

	@OriginalMember(owner = "client!su", name = "r", descriptor = "I")
	public static int anInt8624 = 0;

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(IBZII)V")
	public static void method7434(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (!arg1 && arg2 == Static564.anInt8658 && Static390.anInt5705 == arg3 && (Static296.anInt4684 == Static431.anInt6799 || Static124.aClass4_Sub20_4.aClass8_Sub3_1.method2884() == 1)) {
			return;
		}
		Static390.anInt5705 = arg3;
		Static431.anInt6799 = Static296.anInt4684;
		Static564.anInt8658 = arg2;
		if (Static124.aClass4_Sub20_4.aClass8_Sub3_1.method2884() == 1) {
			Static431.anInt6799 = 0;
		}
		Static53.method1256(arg0);
		Static460.method6416(Static279.aClass179_12.method4066(Static164.anInt2984), Static636.aClass31_14, Static582.aClass33_13, true, Static189.aClass56_5);
		@Pc(58) int local58 = Static445.anInt6949;
		Static445.anInt6949 = (Static564.anInt8658 - (Static224.anInt3557 >> 4)) * 8;
		@Pc(69) int local69 = Static321.anInt5000;
		Static321.anInt5000 = (Static390.anInt5705 - (Static267.anInt4309 >> 4)) * 8;
		Static656.aClass4_Sub5_Sub3_3 = Static154.method468(Static564.anInt8658 * 8, Static390.anInt5705 * 8);
		Static545.aClass225_3 = null;
		@Pc(93) int local93 = Static445.anInt6949 - local58;
		@Pc(98) int local98 = Static321.anInt5000 - local69;
		@Pc(105) int local105;
		@Pc(118) int local118;
		@Pc(228) int local228;
		@Pc(178) int local178;
		if (arg0 == 11) {
			for (local105 = 0; local105 < Static15.anInt1571; local105++) {
				@Pc(111) Class4_Sub45 local111 = Static238.aClass4_Sub45Array1[local105];
				if (local111 != null) {
					@Pc(116) Class3_Sub1_Sub2_Sub2_Sub2 local116 = local111.aClass3_Sub1_Sub2_Sub2_Sub2_2;
					for (local118 = 0; local118 < 10; local118++) {
						local116.anIntArray693[local118] -= local93;
						local116.anIntArray694[local118] -= local98;
					}
					local116.anInt9925 -= local93 * 512;
					local116.anInt9917 -= local98 * 512;
				}
			}
		} else {
			Static105.anInt2131 = 0;
			@Pc(166) boolean local166 = false;
			@Pc(172) int local172 = Static224.anInt3557 * 512 - 512;
			local178 = (Static267.anInt4309 - 1) * 512;
			for (local118 = 0; local118 < Static15.anInt1571; local118++) {
				@Pc(186) Class4_Sub45 local186 = Static238.aClass4_Sub45Array1[local118];
				if (local186 != null) {
					@Pc(191) Class3_Sub1_Sub2_Sub2_Sub2 local191 = local186.aClass3_Sub1_Sub2_Sub2_Sub2_2;
					local191.anInt9925 -= local93 * 512;
					local191.anInt9917 -= local98 * 512;
					if (local191.anInt9925 >= 0 && local172 >= local191.anInt9925 && local191.anInt9917 >= 0 && local178 >= local191.anInt9917) {
						@Pc(226) boolean local226 = true;
						for (local228 = 0; local228 < 10; local228++) {
							local191.anIntArray693[local228] -= local93;
							local191.anIntArray694[local228] -= local98;
							if (local191.anIntArray693[local228] < 0 || Static224.anInt3557 <= local191.anIntArray693[local228] || local191.anIntArray694[local228] < 0 || Static267.anInt4309 <= local191.anIntArray694[local228]) {
								local226 = false;
							}
						}
						if (local226) {
							Static526.anIntArray558[Static105.anInt2131++] = local191.anInt9961;
						} else {
							local191.method8537((Class345) null);
							local186.method9000();
							local166 = true;
						}
					} else {
						local191.method8537((Class345) null);
						local166 = true;
						local186.method9000();
					}
				}
			}
			if (local166) {
				Static15.anInt1571 = Static597.aClass66_41.method1990();
				Static597.aClass66_41.method1986(Static238.aClass4_Sub45Array1);
			}
		}
		for (local105 = 0; local105 < 2048; local105++) {
			@Pc(345) Class3_Sub1_Sub2_Sub2_Sub1 local345 = Static180.aClass3_Sub1_Sub2_Sub2_Sub1Array20[local105];
			if (local345 != null) {
				for (local178 = 0; local178 < 10; local178++) {
					local345.anIntArray693[local178] -= local93;
					local345.anIntArray694[local178] -= local98;
				}
				local345.anInt9917 -= local98 * 512;
				local345.anInt9925 -= local93 * 512;
			}
		}
		@Pc(393) Class82[] local393 = Static9.aClass82Array41;
		for (local178 = 0; local178 < local393.length; local178++) {
			@Pc(401) Class82 local401 = local393[local178];
			if (local401 != null) {
				local401.anInt2227 -= local93 * 512;
				local401.anInt2233 -= local98 * 512;
			}
		}
		@Pc(429) Class4_Sub27 local429;
		for (local429 = (Class4_Sub27) Static26.aClass163_13.method3639(); local429 != null; local429 = (Class4_Sub27) Static26.aClass163_13.method3640()) {
			local429.anInt4666 -= local98;
			local429.anInt4663 -= local93;
			if (Static124.anInt2310 != 4 && (local429.anInt4663 < 0 || local429.anInt4666 < 0 || Static224.anInt3557 <= local429.anInt4663 || Static267.anInt4309 <= local429.anInt4666)) {
				local429.method9000();
			}
		}
		for (local429 = (Class4_Sub27) Static450.aClass163_49.method3639(); local429 != null; local429 = (Class4_Sub27) Static450.aClass163_49.method3640()) {
			local429.anInt4663 -= local93;
			local429.anInt4666 -= local98;
			if (Static124.anInt2310 != 4 && (local429.anInt4663 < 0 || local429.anInt4666 < 0 || local429.anInt4663 >= Static224.anInt3557 || local429.anInt4666 >= Static267.anInt4309)) {
				local429.method9000();
			}
		}
		if (Static124.anInt2310 != 4) {
			for (@Pc(531) Class4_Sub7 local531 = (Class4_Sub7) Static406.aClass66_28.method1992(); local531 != null; local531 = (Class4_Sub7) Static406.aClass66_28.method1984()) {
				@Pc(539) int local539 = (int) (local531.aLong307 & 0x3FFFL);
				@Pc(543) int local543 = local539 - Static445.anInt6949;
				local228 = (int) (local531.aLong307 >> 14 & 0x3FFFL);
				@Pc(556) int local556 = local228 - Static321.anInt5000;
				if (local543 < 0 || local556 < 0 || local543 >= Static224.anInt3557 || local556 >= Static267.anInt4309) {
					local531.method9000();
				}
			}
		}
		if (Static78.anInt1643 != 0) {
			Static78.anInt1643 -= local93;
			Static110.anInt2183 -= local98;
		}
		Static515.method6978();
		if (arg0 != 11) {
			Static611.anInt9382 -= local93 * 512;
			Static414.anInt5950 -= local98;
			Static402.anInt5849 -= local98;
			Static537.anInt8321 -= local93;
			Static652.anInt10283 -= local98 * 512;
			Static260.anInt8169 -= local93;
			if (Math.abs(local93) > Static224.anInt3557 || Math.abs(local98) > Static267.anInt4309) {
				Static568.method7522();
			}
		} else if (Static259.anInt4200 == 4) {
			Static443.anInt6913 -= local93 * 512;
			Static149.anInt2728 -= local98 * 512;
			Static11.anInt171 -= local93 * 512;
			Static27.anInt610 -= local98 * 512;
		} else {
			Static259.anInt4200 = 1;
			Static286.anInt4563 = -1;
			Static77.anInt1632 = -1;
		}
		Static519.method7020();
		Static67.method1453();
		Static153.aClass163_19.method3643();
		Static473.aClass163_57.method3643();
		Static505.aClass236_6.method4953();
		Static618.method8323();
	}

	@OriginalMember(owner = "client!su", name = "d", descriptor = "(I)V")
	public static void method7441() {
		if (Static649.anApplet2 == null) {
			return;
		}
		try {
			@Pc(10) String local10 = Static649.anApplet2.getParameter("cookiehost");
			@Pc(18) int local18 = (int) (Static429.method5935() / 86400000L) - 11745;
			@Pc(30) String local30 = "usrdob=" + local18 + "; version=1; path=/; domain=" + local10;
			Static684.method6377(Static649.anApplet2, "document.cookie=\"" + local30 + "\"");
		} catch (@Pc(44) Throwable local44) {
		}
	}
}
