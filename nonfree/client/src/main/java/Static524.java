import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static524 {

	@OriginalMember(owner = "client!qja", name = "h", descriptor = "I")
	public static int anInt8917 = -2;

	@OriginalMember(owner = "client!qja", name = "a", descriptor = "(IIII)Z")
	public static boolean method7458(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		Static512.aClass181_11.method6360(arg1, arg0, arg2, Static193.anIntArray174);
		@Pc(20) int local20 = Static193.anIntArray174[2];
		if (local20 < 50) {
			return false;
		} else {
			Static193.anIntArray174[1] = Static372.anInt6367 * Static193.anIntArray174[1] / local20 + Static58.anInt920;
			Static193.anIntArray174[0] = Static74.anInt1138 + Static432.anInt7597 * Static193.anIntArray174[0] / local20;
			Static193.anIntArray174[2] = local20;
			return true;
		}
	}

	@OriginalMember(owner = "client!qja", name = "a", descriptor = "(IBZII)V")
	public static void method7459(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static334.anInt5845 == 4) {
			Static587.anInt9587 = -1;
			Static334.anInt5845 = 0;
		}
		if (!arg1 && Static82.anInt1266 == arg2 && arg0 == Static650.anInt10443 && (Static712.anInt11117 == Static715.anInt7793 || Static713.aClass3_Sub55_31.aClass15_Sub25_1.method8268() == 1)) {
			return;
		}
		Static650.anInt10443 = arg0;
		Static715.anInt7793 = Static712.anInt11117;
		Static82.anInt1266 = arg2;
		if (Static713.aClass3_Sub55_31.aClass15_Sub25_1.method8268() == 1) {
			Static715.anInt7793 = 0;
		}
		Static638.method8657(arg3);
		Static52.method679(Static488.aClass67_12, Static687.aClass330_13, Static476.aClass279_12.method6992(Static141.anInt2658), true, Static418.aClass44_32);
		@Pc(93) int local93 = Static714.anInt11156;
		@Pc(95) int local95 = Static339.anInt5859;
		Static714.anInt11156 = (Static82.anInt1266 - (Static362.anInt8653 >> 4)) * 8;
		Static339.anInt5859 = (Static650.anInt10443 - (Static206.anInt11291 >> 4)) * 8;
		Static614.aClass3_Sub4_Sub19_3 = Static654.method6893(Static82.anInt1266 * 8, Static650.anInt10443 * 8);
		Static254.aClass108_1 = null;
		@Pc(128) int local128 = Static714.anInt11156 - local93;
		@Pc(133) int local133 = Static339.anInt5859 - local95;
		@Pc(140) int local140;
		@Pc(153) int local153;
		@Pc(294) int local294;
		@Pc(231) int local231;
		if (arg3 == 12) {
			for (local140 = 0; local140 < Static32.anInt518; local140++) {
				@Pc(146) Class3_Sub13 local146 = Static95.aClass3_Sub13Array1[local140];
				if (local146 != null) {
					@Pc(151) Class19_Sub1_Sub3_Sub2_Sub1 local151 = local146.aClass19_Sub1_Sub3_Sub2_Sub1_2;
					for (local153 = 0; local153 < local151.anIntArray430.length; local153++) {
						local151.anIntArray430[local153] -= local128;
						local151.lb[local153] -= local133;
					}
					local151.anInt11204 -= local128 * 512;
					local151.anInt11211 -= local133 * 512;
				}
			}
		} else {
			Static337.anInt5854 = 0;
			@Pc(219) boolean local219 = false;
			@Pc(225) int local225 = Static362.anInt8653 * 512 - 512;
			local231 = (Static206.anInt11291 - 1) * 512;
			for (local153 = 0; local153 < Static32.anInt518; local153++) {
				@Pc(239) Class3_Sub13 local239 = Static95.aClass3_Sub13Array1[local153];
				if (local239 != null) {
					@Pc(244) Class19_Sub1_Sub3_Sub2_Sub1 local244 = local239.aClass19_Sub1_Sub3_Sub2_Sub1_2;
					local244.anInt11211 -= local133 * 512;
					local244.anInt11204 -= local128 * 512;
					if (local244.anInt11204 >= 0 && local244.anInt11204 <= local225 && local244.anInt11211 >= 0 && local231 >= local244.anInt11211) {
						@Pc(292) boolean local292 = true;
						for (local294 = 0; local294 < local244.anIntArray430.length; local294++) {
							local244.anIntArray430[local294] -= local128;
							local244.lb[local294] -= local133;
							if (local244.anIntArray430[local294] < 0 || local244.anIntArray430[local294] >= Static362.anInt8653 || local244.lb[local294] < 0 || Static206.anInt11291 <= local244.lb[local294]) {
								local292 = false;
							}
						}
						if (local292) {
							Static101.anIntArray95[Static337.anInt5854++] = local244.anInt7796;
						} else {
							local244.method3434((Class18) null);
							local219 = true;
							local239.method9446();
						}
					} else {
						local244.method3434((Class18) null);
						local239.method9446();
						local219 = true;
					}
				}
			}
			if (local219) {
				Static32.anInt518 = Static612.aClass136_44.method3504();
				Static612.aClass136_44.method3502(Static95.aClass3_Sub13Array1);
			}
		}
		for (local140 = 0; local140 < 2048; local140++) {
			@Pc(424) Class19_Sub1_Sub3_Sub2_Sub2 local424 = Static681.aClass19_Sub1_Sub3_Sub2_Sub2Array1[local140];
			if (local424 != null) {
				for (local231 = 0; local231 < local424.anIntArray430.length; local231++) {
					local424.anIntArray430[local231] -= local128;
					local424.lb[local231] -= local133;
				}
				local424.anInt11204 -= local128 * 512;
				local424.anInt11211 -= local133 * 512;
			}
		}
		@Pc(480) Class387[] local480 = Static672.aClass387Array1;
		for (local231 = 0; local231 < local480.length; local231++) {
			@Pc(488) Class387 local488 = local480[local231];
			if (local488 != null) {
				local488.anInt10805 -= local128 * 512;
				local488.anInt10808 -= local133 * 512;
			}
		}
		@Pc(522) Class3_Sub53 local522;
		for (local522 = (Class3_Sub53) Static423.aClass357_43.method8391(); local522 != null; local522 = (Class3_Sub53) Static423.aClass357_43.method8392()) {
			local522.anInt10319 -= local128;
			local522.anInt10317 -= local133;
			if (Static231.anInt4426 != 4 && (local522.anInt10319 < 0 || local522.anInt10317 < 0 || local522.anInt10319 >= Static362.anInt8653 || local522.anInt10317 >= Static206.anInt11291)) {
				local522.method9446();
			}
		}
		for (local522 = (Class3_Sub53) Static3.aClass357_1.method8391(); local522 != null; local522 = (Class3_Sub53) Static3.aClass357_1.method8392()) {
			local522.anInt10317 -= local133;
			local522.anInt10319 -= local128;
			if (Static231.anInt4426 != 4 && (local522.anInt10319 < 0 || local522.anInt10317 < 0 || Static362.anInt8653 <= local522.anInt10319 || Static206.anInt11291 <= local522.anInt10317)) {
				local522.method9446();
			}
		}
		if (Static231.anInt4426 != 4) {
			for (@Pc(673) Class3_Sub20 local673 = (Class3_Sub20) Static46.aClass136_5.method3509(); local673 != null; local673 = (Class3_Sub20) Static46.aClass136_5.method3506()) {
				@Pc(681) int local681 = (int) (local673.aLong382 & 0x3FFFL);
				@Pc(686) int local686 = local681 - Static714.anInt11156;
				local294 = (int) (local673.aLong382 >> 14 & 0x3FFFL);
				@Pc(698) int local698 = local294 - Static339.anInt5859;
				if (local686 < 0 || local698 < 0 || local686 >= Static362.anInt8653 || local698 >= Static206.anInt11291) {
					local673.method9446();
				}
			}
		}
		if (Static482.anInt8391 != 0) {
			Static493.anInt8491 -= local133;
			Static482.anInt8391 -= local128;
		}
		Static453.method6737();
		if (arg3 != 12) {
			Static624.anInt10064 -= local128;
			Static71.anInt1112 -= local133;
			Static161.anInt2963 -= local128;
			Static235.anInt4471 -= local133 * 512;
			Static393.anInt7056 -= local133;
			Static173.anInt3144 -= local128 * 512;
			if (Math.abs(local128) > Static362.anInt8653 || Math.abs(local133) > Static206.anInt11291) {
				Static538.method6234();
			}
		} else if (Static175.anInt10579 == 4) {
			Static680.anInt10754 -= local128 * 512;
			Static599.anInt9774 -= local128 * 512;
			Static46.anInt795 -= local133 * 512;
			Static270.anInt4887 -= local133 * 512;
		} else {
			Static573.anInt9429 = -1;
			Static283.anInt5140 = -1;
			Static175.anInt10579 = 1;
		}
		Static499.method7199();
		Static82.method1060();
		Static59.aClass136_6.method3505();
		Static358.aClass357_33.method8403();
		Static209.aClass66_3.method1379();
		Static698.method9143();
	}
}
