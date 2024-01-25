import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static398 {

	@OriginalMember(owner = "client!pda", name = "a", descriptor = "Z")
	public static boolean aBoolean548 = true;

	@OriginalMember(owner = "client!pda", name = "a", descriptor = "(B)V")
	public static void method5824() {
		if (Static483.aClass288_2 != null) {
			Static483.aClass288_2.method6796();
		}
		if (Static172.aClass288_1 != null) {
			Static172.aClass288_1.method6796();
		}
	}

	@OriginalMember(owner = "client!pda", name = "a", descriptor = "(Lclient!lk;I)V")
	public static void method5825(@OriginalArg(0) Class203 arg0) {
		@Pc(15) Class203 local15 = Static415.method7487(arg0);
		@Pc(20) int local20;
		@Pc(23) int local23;
		if (local15 == null) {
			local20 = Static318.anInt5754;
			local23 = Static447.anInt7372;
		} else {
			local20 = local15.anInt5513;
			local23 = local15.anInt5476;
		}
		Static159.method2856(local20, local23, arg0, false);
		Static294.method4662(local20, local23, arg0);
	}

	@OriginalMember(owner = "client!pda", name = "a", descriptor = "(I)V")
	public static void method5826() {
		for (@Pc(7) int local7 = 0; local7 < Static321.anInt5791; local7++) {
			@Pc(13) int local13 = Static4.anIntArray7[local7];
			@Pc(21) Class9_Sub1_Sub1_Sub2_Sub1 local21 = ((Class3_Sub39) Static243.aClass310_16.method6601((long) local13)).aClass9_Sub1_Sub1_Sub2_Sub1_2;
			@Pc(27) int local27 = Static187.aClass3_Sub11_Sub1_1.method3118();
			if ((local27 & 0x10) != 0) {
				local27 += Static187.aClass3_Sub11_Sub1_1.method3118() << 8;
			}
			if ((local27 & 0x40) != 0) {
				local21.anInt515 = Static187.aClass3_Sub11_Sub1_1.method3115();
				local21.anInt509 = Static187.aClass3_Sub11_Sub1_1.method3139();
			}
			@Pc(71) int local71;
			@Pc(75) int local75;
			if ((local27 & 0x1) != 0) {
				local71 = Static187.aClass3_Sub11_Sub1_1.method3138();
				local75 = Static187.aClass3_Sub11_Sub1_1.method3120();
				local21.method5575(local75, Static305.anInt5560, local71);
				local21.anInt6431 = Static305.anInt5560 + 300;
				local21.anInt6460 = Static187.aClass3_Sub11_Sub1_1.method3099();
			}
			if ((local27 & 0x800) != 0) {
				local71 = Static187.aClass3_Sub11_Sub1_1.method3117();
				local21.anInt6446 = Static187.aClass3_Sub11_Sub1_1.method3099();
				local21.anInt6406 = Static187.aClass3_Sub11_Sub1_1.method3120();
				local21.anInt6413 = local71 & 0x7FFF;
				local21.aBoolean526 = (local71 & 0x8000) != 0;
				local21.anInt6442 = Static305.anInt5560 + local21.anInt6413 + local21.anInt6446;
			}
			if ((local27 & 0x2000) != 0) {
				local21.aByte91 = Static187.aClass3_Sub11_Sub1_1.method3078();
				local21.aByte90 = Static187.aClass3_Sub11_Sub1_1.method3096();
				local21.aByte92 = Static187.aClass3_Sub11_Sub1_1.method3096();
				local21.aByte89 = (byte) Static187.aClass3_Sub11_Sub1_1.method3099();
				local21.anInt6456 = Static305.anInt5560 + Static187.aClass3_Sub11_Sub1_1.method3115();
				local21.anInt6388 = Static305.anInt5560 + Static187.aClass3_Sub11_Sub1_1.method3117();
			}
			if ((local27 & 0x200) != 0) {
				local71 = Static187.aClass3_Sub11_Sub1_1.method3120();
				@Pc(193) int[] local193 = new int[local71];
				@Pc(196) int[] local196 = new int[local71];
				@Pc(199) int[] local199 = new int[local71];
				for (@Pc(201) int local201 = 0; local201 < local71; local201++) {
					@Pc(207) int local207 = Static187.aClass3_Sub11_Sub1_1.method3109();
					if (local207 == 65535) {
						local207 = -1;
					}
					local193[local201] = local207;
					local196[local201] = Static187.aClass3_Sub11_Sub1_1.method3120();
					local199[local201] = Static187.aClass3_Sub11_Sub1_1.method3117();
				}
				Static235.method3971(local196, local21, local199, local193);
			}
			if ((local27 & 0x400) != 0) {
				local71 = Static187.aClass3_Sub11_Sub1_1.method3138();
				local75 = Static187.aClass3_Sub11_Sub1_1.method3120();
				local21.method5575(local75, Static305.anInt5560, local71);
			}
			@Pc(285) int local285;
			if ((local27 & 0x4) != 0) {
				local71 = Static187.aClass3_Sub11_Sub1_1.method3139();
				if (local71 == 65535) {
					local71 = -1;
				}
				local75 = Static187.aClass3_Sub11_Sub1_1.method3116();
				local285 = Static187.aClass3_Sub11_Sub1_1.method3120();
				local21.method5566(local75, false, local285, local71);
			}
			if ((local27 & 0x8) != 0) {
				local21.anInt6463 = Static187.aClass3_Sub11_Sub1_1.method3115();
				if (local21.anInt6463 == 65535) {
					local21.anInt6463 = -1;
				}
			}
			if ((local27 & 0x2) != 0) {
				if (local21.aClass294_1.method6428()) {
					Static321.method5002(local21);
				}
				local21.method425(Static510.aClass284_2.method6281(Static187.aClass3_Sub11_Sub1_1.method3117()));
				local21.method5565(local21.aClass294_1.anInt7615);
				local21.anInt6383 = local21.aClass294_1.anInt7589 << 3;
				if (local21.aClass294_1.method6428()) {
					Static238.method3980(local21.aByte126, null, local21.anIntArray518[0], 0, local21, null, local21.anIntArray517[0]);
				}
			}
			if ((local27 & 0x20) != 0) {
				@Pc(379) int[] local379 = new int[4];
				for (local75 = 0; local75 < 4; local75++) {
					local379[local75] = Static187.aClass3_Sub11_Sub1_1.method3117();
					if (local379[local75] == 65535) {
						local379[local75] = -1;
					}
				}
				local285 = Static187.aClass3_Sub11_Sub1_1.method3099();
				Static369.method5494(local21, local379, local285);
			}
			if ((local27 & 0x100) != 0) {
				local71 = Static187.aClass3_Sub11_Sub1_1.method3115();
				local75 = Static187.aClass3_Sub11_Sub1_1.method3105();
				if (local71 == 65535) {
					local71 = -1;
				}
				local285 = Static187.aClass3_Sub11_Sub1_1.method3118();
				local21.method5566(local75, true, local285, local71);
			}
			if ((local27 & 0x1000) != 0) {
				local21.anInt6450 = Static187.aClass3_Sub11_Sub1_1.method3096();
				local21.anInt6449 = Static187.aClass3_Sub11_Sub1_1.method3123();
				local21.anInt6389 = Static187.aClass3_Sub11_Sub1_1.method3096();
				local21.anInt6416 = Static187.aClass3_Sub11_Sub1_1.method3121();
				local21.anInt6430 = Static187.aClass3_Sub11_Sub1_1.method3109() + Static305.anInt5560;
				local21.anInt6421 = Static187.aClass3_Sub11_Sub1_1.method3115() + Static305.anInt5560;
				local21.anInt6417 = Static187.aClass3_Sub11_Sub1_1.method3099();
				local21.anInt6468 = 1;
				local21.anInt6389 += local21.anIntArray518[0];
				local21.anInt6449 += local21.anIntArray517[0];
				local21.anInt6450 += local21.anIntArray518[0];
				local21.anInt6416 += local21.anIntArray517[0];
				local21.anInt6469 = 0;
			}
			if ((local27 & 0x80) != 0) {
				local21.aString93 = Static187.aClass3_Sub11_Sub1_1.method3133();
				local21.anInt6414 = 100;
			}
		}
	}
}
