import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static372 {

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(III)V")
	public static void method5544(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) Class5_Sub1_Sub18 local14 = Static123.method1827((long) arg1 << 32 | (long) arg0, 19);
		local14.method7444();
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(B)V")
	public static void method5545() {
		if (Static68.method5675(Static652.anInt10664)) {
			if (Static4.aClass389_16.aClass50_2 == null) {
				Static411.method6060(5, -3);
			} else {
				Static411.method6060(7, -3);
			}
		} else if (Static652.anInt10664 == 5 || Static652.anInt10664 == 6) {
			Static411.method6060(3, -3);
		} else if (Static652.anInt10664 == 13) {
			Static411.method6060(3, -3);
		}
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(IZIII)V")
	public static void method5546(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (!arg1 && arg0 == Static549.anInt8709 && arg3 == Static228.anInt3937 && (Static8.anInt112 == Static324.anInt5529 || Static577.aClass5_Sub19_25.aClass17_Sub27_1.method9058() == 1)) {
			return;
		}
		Static228.anInt3937 = arg3;
		Static8.anInt112 = Static324.anInt5529;
		Static549.anInt8709 = arg0;
		if (Static577.aClass5_Sub19_25.aClass17_Sub27_1.method9058() == 1) {
			Static8.anInt112 = 0;
		}
		Static411.method6060(arg2, -3);
		Static636.method8809(true, Static273.aClass100_6, Static85.aClass196_38, Static184.aClass131_13.method3168(Static375.anInt7800), Static414.aClass70_6);
		@Pc(73) int local73 = Static315.anInt5380;
		Static315.anInt5380 = (Static549.anInt8709 - (Static271.anInt4910 >> 4)) * 8;
		@Pc(84) int local84 = Static290.anInt5128;
		Static290.anInt5128 = (Static228.anInt3937 - (Static613.anInt9909 >> 4)) * 8;
		Static396.aClass5_Sub1_Sub16_3 = Static491.method677(Static549.anInt8709 * 8, Static228.anInt3937 * 8);
		Static311.aClass396_3 = null;
		@Pc(107) int local107 = Static315.anInt5380 - local73;
		@Pc(112) int local112 = Static290.anInt5128 - local84;
		@Pc(117) int local117;
		@Pc(130) int local130;
		@Pc(261) int local261;
		if (arg2 == 12) {
			for (local117 = 0; local117 < Static259.anInt4657; local117++) {
				@Pc(123) Class5_Sub9 local123 = Static591.aClass5_Sub9Array1[local117];
				if (local123 != null) {
					@Pc(128) Class4_Sub1_Sub1_Sub2_Sub2 local128 = local123.aClass4_Sub1_Sub1_Sub2_Sub2_1;
					for (local130 = 0; local130 < 10; local130++) {
						local128.anIntArray405[local130] -= local107;
						local128.anIntArray404[local130] -= local112;
					}
					local128.anInt9805 -= local107 * 512;
					local128.anInt9803 -= local112 * 512;
				}
			}
		} else {
			@Pc(188) boolean local188 = false;
			Static438.anInt7239 = 0;
			@Pc(196) int local196 = (Static271.anInt4910 - 1) * 512;
			@Pc(202) int local202 = Static613.anInt9909 * 512 - 512;
			for (local130 = 0; local130 < Static259.anInt4657; local130++) {
				@Pc(210) Class5_Sub9 local210 = Static591.aClass5_Sub9Array1[local130];
				if (local210 != null) {
					@Pc(215) Class4_Sub1_Sub1_Sub2_Sub2 local215 = local210.aClass4_Sub1_Sub1_Sub2_Sub2_1;
					local215.anInt9803 -= local112 * 512;
					local215.anInt9805 -= local107 * 512;
					if (local215.anInt9805 >= 0 && local215.anInt9805 <= local196 && local215.anInt9803 >= 0 && local202 >= local215.anInt9803) {
						@Pc(259) boolean local259 = true;
						for (local261 = 0; local261 < 10; local261++) {
							local215.anIntArray405[local261] -= local107;
							local215.anIntArray404[local261] -= local112;
							if (local215.anIntArray405[local261] < 0 || local215.anIntArray405[local261] >= Static271.anInt4910 || local215.anIntArray404[local261] < 0 || local215.anIntArray404[local261] >= Static613.anInt9909) {
								local259 = false;
							}
						}
						if (local259) {
							Static558.anIntArray500[Static438.anInt7239++] = local215.anInt6843;
						} else {
							local215.method5947((Class105) null);
							local188 = true;
							local210.method9222();
						}
					} else {
						local215.method5947((Class105) null);
						local210.method9222();
						local188 = true;
					}
				}
			}
			if (local188) {
				Static259.anInt4657 = Static677.aClass306_37.method6939();
				Static677.aClass306_37.method6938(Static591.aClass5_Sub9Array1);
			}
		}
		for (local117 = 0; local117 < 2048; local117++) {
			@Pc(397) Class4_Sub1_Sub1_Sub2_Sub1 local397 = Static574.aClass4_Sub1_Sub1_Sub2_Sub1Array1[local117];
			if (local397 != null) {
				for (local130 = 0; local130 < 10; local130++) {
					local397.anIntArray405[local130] -= local107;
					local397.anIntArray404[local130] -= local112;
				}
				local397.anInt9803 -= local112 * 512;
				local397.anInt9805 -= local107 * 512;
			}
		}
		@Pc(453) Class212[] local453 = Static8.aClass212Array1;
		for (local130 = 0; local130 < local453.length; local130++) {
			@Pc(461) Class212 local461 = local453[local130];
			if (local461 != null) {
				local461.anInt5366 -= local107 * 512;
				local461.anInt5374 -= local112 * 512;
			}
		}
		@Pc(491) Class5_Sub50 local491;
		for (local491 = (Class5_Sub50) Static631.aClass20_71.method378(); local491 != null; local491 = (Class5_Sub50) Static631.aClass20_71.method366()) {
			local491.anInt8723 -= local112;
			local491.anInt8721 -= local107;
			if (Static139.anInt2749 != 4 && (local491.anInt8721 < 0 || local491.anInt8723 < 0 || local491.anInt8721 >= Static271.anInt4910 || Static613.anInt9909 <= local491.anInt8723)) {
				local491.method9222();
			}
		}
		for (local491 = (Class5_Sub50) Static227.aClass20_61.method378(); local491 != null; local491 = (Class5_Sub50) Static227.aClass20_61.method366()) {
			local491.anInt8721 -= local107;
			local491.anInt8723 -= local112;
			if (Static139.anInt2749 != 4 && (local491.anInt8721 < 0 || local491.anInt8723 < 0 || local491.anInt8721 >= Static271.anInt4910 || Static613.anInt9909 <= local491.anInt8723)) {
				local491.method9222();
			}
		}
		if (Static139.anInt2749 != 4) {
			for (@Pc(634) Class5_Sub53 local634 = (Class5_Sub53) Static248.aClass306_18.method6941(); local634 != null; local634 = (Class5_Sub53) Static248.aClass306_18.method6940()) {
				@Pc(642) int local642 = (int) (local634.aLong312 & 0x3FFFL);
				local261 = local642 - Static315.anInt5380;
				@Pc(655) int local655 = (int) (local634.aLong312 >> 14 & 0x3FFFL);
				@Pc(659) int local659 = local655 - Static290.anInt5128;
				if (local261 < 0 || local659 < 0 || Static271.anInt4910 <= local261 || local659 >= Static613.anInt9909) {
					local634.method9222();
				}
			}
		}
		if (Static19.anInt250 != 0) {
			Static405.anInt10904 -= local112;
			Static19.anInt250 -= local107;
		}
		Static321.method4909();
		if (arg2 != 12) {
			Static141.anInt2764 -= local107 * 512;
			Static578.anInt9023 -= local112;
			Static239.anInt4140 -= local107;
			Static282.anInt5028 -= local107;
			Static282.anInt5025 -= local112 * 512;
			Static352.anInt5799 -= local112;
			if (Math.abs(local107) > Static271.anInt4910 || Math.abs(local112) > Static613.anInt9909) {
				Static8.method134();
			}
		} else if (Static426.anInt7111 == 4) {
			Static488.anInt7900 -= local107 * 512;
			Static343.anInt5712 -= local112 * 512;
			Static334.anInt9969 -= local112 * 512;
			Static620.anInt8145 -= local107 * 512;
		} else {
			Static426.anInt7111 = 1;
			Static417.anInt7039 = -1;
			Static227.anInt9451 = -1;
		}
		Static34.method557(109);
		Static124.method1849();
		Static146.aClass20_10.method374();
		Static419.aClass20_35.method374();
		Static151.aClass387_2.method9014();
		Static526.method7162();
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(IB)Z")
	public static boolean method5547(@OriginalArg(0) int arg0) {
		return arg0 == 11 || arg0 == 12 || arg0 == 13;
	}
}
