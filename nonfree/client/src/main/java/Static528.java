import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static528 {

	@OriginalMember(owner = "client!wd", name = "Q", descriptor = "Lclient!se;")
	public static Class265 aClass265_6;

	@OriginalMember(owner = "client!wd", name = "M", descriptor = "I")
	public static int anInt9348 = 0;

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(ILclient!qa;)V")
	public static void method8082(@OriginalArg(1) Class4 arg0) {
		@Pc(12) int local12 = Static513.anInt9093;
		@Pc(14) int local14 = Static276.anInt8648;
		@Pc(16) int local16 = Static324.anInt6120;
		@Pc(20) int local20 = Static336.anInt6244 - 3;
		if (Static198.aClass104_18 == null || Static448.aClass104_24 == null) {
			if (Static46.aClass69_14.method1896(Static221.anInt4329) && Static46.aClass69_14.method1896(Static279.anInt2976)) {
				Static198.aClass104_18 = arg0.method7149(Static547.method1922(Static46.aClass69_14, Static221.anInt4329, 0));
				@Pc(51) Class70 local51 = Static547.method1922(Static46.aClass69_14, Static279.anInt2976, 0);
				Static448.aClass104_24 = arg0.method7149(local51);
				local51.method1913();
				Static508.aClass104_26 = arg0.method7149(local51);
			} else {
				arg0.f(local12, local14, local16, 20, Static99.anInt2113 | 255 - Static56.anInt1415 << 24, 1);
			}
		}
		@Pc(97) int local97;
		@Pc(95) int local95;
		if (Static198.aClass104_18 != null && Static448.aClass104_24 != null) {
			local95 = (local16 - Static448.aClass104_24.c() * 2) / Static198.aClass104_18.c();
			for (local97 = 0; local97 < local95; local97++) {
				Static198.aClass104_18.method7716(Static448.aClass104_24.c() + local12 + Static198.aClass104_18.c() * local97, local14);
			}
			Static448.aClass104_24.method7716(local12, local14);
			Static508.aClass104_26.method7716(local12 + local16 - Static508.aClass104_26.c(), local14);
		}
		Static511.aClass36_4.method7954(Static105.anInt2235 | 0xFF000000, local14 + 14, Static544.aClass45_115.method1474(Static544.anInt7853), local12 + 3, -1);
		arg0.f(local12, local14 + 20, local16, local20 - 20, -Static56.anInt1415 + 255 << 24 | Static99.anInt2113, 1);
		local95 = Static10.aClass99_1.method6618();
		local97 = Static10.aClass99_1.method6619();
		@Pc(180) int local180 = 0;
		@Pc(202) int local202;
		for (@Pc(185) Class1_Sub25 local185 = (Class1_Sub25) Static105.aClass295_10.method7543(); local185 != null; local185 = (Class1_Sub25) Static105.aClass295_10.method7540()) {
			local202 = (Static197.anInt4015 - local180 - 1) * 16 + local14 + 33;
			local180++;
			if (local12 < local95 && local95 < local16 + local12 && local97 > local202 - 13 && local97 < local202 + 4 && local185.aBoolean340) {
				arg0.f(local12, local202 - 12, local16, 16, Static164.anInt3165 | 255 - Static287.anInt7766 << 24, 1);
			}
		}
		if ((Static304.aClass104_21 == null || Static542.aClass104_27 == null || Static296.aClass104_23 == null) && Static46.aClass69_14.method1896(Static441.anInt7710) && Static46.aClass69_14.method1896(Static386.anInt8111) && Static46.aClass69_14.method1896(Static395.anInt6944)) {
			@Pc(278) Class70 local278 = Static547.method1922(Static46.aClass69_14, Static386.anInt8111, 0);
			Static542.aClass104_27 = arg0.method7149(local278);
			local278.method1913();
			Static63.aClass104_7 = arg0.method7149(local278);
			Static304.aClass104_21 = arg0.method7149(Static547.method1922(Static46.aClass69_14, Static441.anInt7710, 0));
			@Pc(303) Class70 local303 = Static547.method1922(Static46.aClass69_14, Static395.anInt6944, 0);
			Static296.aClass104_23 = arg0.method7149(local303);
			local303.method1913();
			Static179.aClass104_16 = arg0.method7149(local303);
		}
		@Pc(373) int local373;
		@Pc(334) int local334;
		if (Static304.aClass104_21 != null && Static542.aClass104_27 != null && Static296.aClass104_23 != null) {
			local202 = (local16 - Static296.aClass104_23.c() * 2) / Static304.aClass104_21.c();
			for (local334 = 0; local334 < local202; local334++) {
				Static304.aClass104_21.method7716(local12 + Static296.aClass104_23.c() + Static304.aClass104_21.c() * local334, local14 + local20 - Static304.aClass104_21.la());
			}
			local373 = (local20 - Static296.aClass104_23.la() - 20) / Static542.aClass104_27.la();
			for (@Pc(375) int local375 = 0; local375 < local373; local375++) {
				Static542.aClass104_27.method7716(local12, local14 + local375 * Static542.aClass104_27.la() + 20);
				Static63.aClass104_7.method7716(local12 + local16 - Static63.aClass104_7.c(), Static542.aClass104_27.la() * local375 + (local14 - -20));
			}
			Static296.aClass104_23.method7716(local12, local14 + local20 - Static296.aClass104_23.la());
			Static179.aClass104_16.method7716(local12 + local16 - Static296.aClass104_23.c(), -Static296.aClass104_23.la() + local20 + local14);
		}
		local180 = 0;
		for (@Pc(443) Class1_Sub25 local443 = (Class1_Sub25) Static105.aClass295_10.method7543(); local443 != null; local443 = (Class1_Sub25) Static105.aClass295_10.method7540()) {
			local334 = (Static197.anInt4015 - local180 - 1) * 16 + local14 + 13 + 20;
			local373 = Static105.anInt2235 | 0xFF000000;
			if (local12 < local95 && local12 + local16 > local95 && local334 - 13 < local97 && local334 + 4 > local97 && local443.aBoolean340) {
				local373 = Static494.anInt8656 | 0xFF000000;
			}
			@Pc(504) int[] local504 = null;
			if (Static337.method5699(local443.anInt4365)) {
				local504 = Static181.aClass316_1.method8107((int) local443.aLong114).anIntArray443;
			} else if (local443.anInt4368 != -1) {
				local504 = Static181.aClass316_1.method8107(local443.anInt4368).anIntArray443;
			} else if (Static459.method7010(local443.anInt4365)) {
				@Pc(538) Class1_Sub41 local538 = (Class1_Sub41) Static362.aClass230_46.method6144((long) local443.aLong114);
				if (local538 != null) {
					@Pc(543) Class20_Sub1_Sub1_Sub2 local543 = local538.aClass20_Sub1_Sub1_Sub2_2;
					@Pc(546) Class283 local546 = local543.aClass283_1;
					if (local546.anIntArray743 != null) {
						local546 = local546.method7368(Static417.aClass10_1);
					}
					if (local546 != null) {
						local504 = local546.anIntArray744;
					}
				}
			} else if (Static456.method6996(local443.anInt4365)) {
				@Pc(580) Class51 local580;
				if (local443.anInt4365 == 1010) {
					local580 = Static398.aClass18_4.method609((int) local443.aLong114);
				} else {
					local580 = Static398.aClass18_4.method609((int) (local443.aLong114 >>> 32 & 0x7FFFFFFFL));
				}
				if (local580.anIntArray108 != null) {
					local580 = local580.method1625(Static417.aClass10_1);
				}
				if (local580 != null) {
					local504 = local580.anIntArray106;
				}
			}
			@Pc(619) String local619 = Static140.method2620(local443);
			if (local504 != null) {
				local619 = local619 + Static19.method550(local504);
			}
			Static511.aClass36_4.method7950(local619, Static204.aClass104Array38, local334, local12 + 3, local373, Static527.anIntArray813);
			local180++;
			if (local443.aBoolean341) {
				Static57.aClass104_6.method7716(local12 + Static270.aClass96_10.method2370(local619) + 5, local334 + -12);
			}
		}
		Static318.method5466(Static336.anInt6244, Static324.anInt6120, Static513.anInt9093, Static276.anInt8648);
	}
}
