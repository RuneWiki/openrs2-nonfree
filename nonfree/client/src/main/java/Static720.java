import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static720 {

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "Lclient!nv;")
	public static Class264 aClass264_1;

	@OriginalMember(owner = "client!wp", name = "e", descriptor = "Lclient!bka;")
	public static Class9 aClass9_36;

	@OriginalMember(owner = "client!wp", name = "h", descriptor = "F")
	public static float aFloat201;

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(I)Z")
	public static boolean method9401() {
		@Pc(10) Class3_Sub9 local10 = (Class3_Sub9) Static42.aClass357_3.method8391();
		if (local10 == null) {
			return false;
		}
		for (@Pc(25) int local25 = 0; local25 < local10.anInt698; local25++) {
			if (local10.aClass201Array2[local25] != null && local10.aClass201Array2[local25].anInt5729 == 0) {
				return false;
			}
			if (local10.aClass201Array1[local25] != null && local10.aClass201Array1[local25].anInt5729 == 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(Lclient!d;BLclient!ha;)V")
	public static void method9403(@OriginalArg(0) Interface2 arg0, @OriginalArg(2) Class67 arg1) {
		if (Static654.aClass3_Sub4_Sub19_2 == null) {
			return;
		}
		if (Static193.anInt3390 < 10) {
			if (!Static654.aClass221_126.method5094(Static654.aClass3_Sub4_Sub19_2.aString118)) {
				Static193.anInt3390 = Static556.aClass221_140.method5069(Static654.aClass3_Sub4_Sub19_2.aString118) / 10;
				return;
			}
			Static51.method672();
			Static193.anInt3390 = 10;
		}
		if (Static193.anInt3390 == 10) {
			Static654.anInt8150 = Static654.aClass3_Sub4_Sub19_2.anInt9086 >> 6 << 6;
			Static654.anInt8153 = Static654.aClass3_Sub4_Sub19_2.anInt9088 >> 6 << 6;
			Static654.anInt8155 = (Static654.aClass3_Sub4_Sub19_2.anInt9087 >> 6 << 6) + 64 - Static654.anInt8153;
			Static654.anInt8148 = (Static654.aClass3_Sub4_Sub19_2.anInt9095 >> 6 << 6) + 64 - Static654.anInt8150;
			@Pc(86) int[] local86 = new int[3];
			@Pc(88) int local88 = -1;
			@Pc(90) int local90 = -1;
			if (Static654.aClass3_Sub4_Sub19_2.method7611(Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2.aByte146, Static339.anInt5859 + (Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2.anInt11211 >> 9), local86, (Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2.anInt11204 >> 9) + Static714.anInt11156)) {
				local88 = local86[1] - Static654.anInt8153;
				local90 = local86[2] - Static654.anInt8150;
			}
			if (!Static179.aBoolean265 && local88 >= 0 && local88 < Static654.anInt8155 && local90 >= 0 && Static654.anInt8148 > local90) {
				local88 += (int) (Math.random() * 10.0D) - 5;
				local90 += (int) (Math.random() * 10.0D) - 5;
				Static481.anInt8380 = local88;
				Static442.anInt10084 = local90;
			} else if (Static693.anInt10866 == -1 || Static673.anInt10658 == -1) {
				Static654.aClass3_Sub4_Sub19_2.method7607(Static654.aClass3_Sub4_Sub19_2.anInt9099 >> 14 & 0x3FFF, 117, local86, Static654.aClass3_Sub4_Sub19_2.anInt9099 & 0x3FFF);
				Static481.anInt8380 = local86[1] - Static654.anInt8153;
				Static442.anInt10084 = local86[2] - Static654.anInt8150;
			} else {
				Static654.aClass3_Sub4_Sub19_2.method7607(Static693.anInt10866, 49, local86, Static673.anInt10658);
				Static673.anInt10658 = -1;
				Static693.anInt10866 = -1;
				if (local86 != null) {
					Static481.anInt8380 = local86[1] - Static654.anInt8153;
					Static442.anInt10084 = local86[2] - Static654.anInt8150;
				}
				Static179.aBoolean265 = false;
			}
			if (Static654.aClass3_Sub4_Sub19_2.anInt9091 == 37) {
				Static654.aFloat160 = 3.0F;
				Static654.aFloat159 = 3.0F;
			} else if (Static654.aClass3_Sub4_Sub19_2.anInt9091 == 50) {
				Static654.aFloat160 = 4.0F;
				Static654.aFloat159 = 4.0F;
			} else if (Static654.aClass3_Sub4_Sub19_2.anInt9091 == 75) {
				Static654.aFloat160 = 6.0F;
				Static654.aFloat159 = 6.0F;
			} else if (Static654.aClass3_Sub4_Sub19_2.anInt9091 == 100) {
				Static654.aFloat160 = 8.0F;
				Static654.aFloat159 = 8.0F;
			} else if (Static654.aClass3_Sub4_Sub19_2.anInt9091 == 200) {
				Static654.aFloat160 = 16.0F;
				Static654.aFloat159 = 16.0F;
			} else {
				Static654.aFloat160 = 8.0F;
				Static654.aFloat159 = 8.0F;
			}
			Static654.anInt8142 = (int) Static654.aFloat160 >> 1;
			Static654.aByteArrayArrayArray18 = Static4.method42(Static654.anInt8142);
			Static276.method4222(0);
			Static654.method6899();
			Static335.aClass357_28 = new Class357();
			Static654.anInt8141 += (int) (Math.random() * 5.0D) - 2;
			if (Static654.anInt8141 < -8) {
				Static654.anInt8141 = -8;
			}
			if (Static654.anInt8141 > 8) {
				Static654.anInt8141 = 8;
			}
			Static654.anInt8143 += (int) (Math.random() * 5.0D) - 2;
			if (Static654.anInt8143 < -16) {
				Static654.anInt8143 = -16;
			}
			if (Static654.anInt8143 > 16) {
				Static654.anInt8143 = 16;
			}
			Static654.method6878(arg0, Static654.anInt8141 >> 2 << 10, Static654.anInt8143 >> 1);
			Static654.aClass98_4.method2446(256, 1024);
			Static654.aClass405_2.method9357(256, 256);
			Static654.aClass323_4.method7799(4096);
			Static135.aClass248_1.method6078(256);
			Static193.anInt3390 = 20;
		} else if (Static193.anInt3390 == 20) {
			Static550.method3528(true);
			Static654.method6876(arg1, Static654.anInt8141, Static654.anInt8143);
			Static193.anInt3390 = 60;
			Static550.method3528(true);
			Static588.method8089();
		} else if (Static193.anInt3390 == 60) {
			if (Static654.aClass221_126.method5079(Static654.aClass3_Sub4_Sub19_2.aString118 + "_staticelements")) {
				if (!Static654.aClass221_126.method5094(Static654.aClass3_Sub4_Sub19_2.aString118 + "_staticelements")) {
					return;
				}
				Static654.aClass108_3 = Static705.method9211(Static654.aClass221_126, Static312.aBoolean458, Static654.aClass3_Sub4_Sub19_2.aString118 + "_staticelements");
			} else {
				Static654.aClass108_3 = new Class108(0);
			}
			Static654.method6884();
			Static193.anInt3390 = 70;
			Static550.method3528(true);
			Static588.method8089();
		} else if (Static193.anInt3390 == 70) {
			Static702.aClass38_8 = new Class38(arg1, 11, true, Static67.aCanvas1);
			Static193.anInt3390 = 73;
			Static550.method3528(true);
			Static588.method8089();
		} else if (Static193.anInt3390 == 73) {
			Static281.aClass38_4 = new Class38(arg1, 12, true, Static67.aCanvas1);
			Static193.anInt3390 = 76;
			Static550.method3528(true);
			Static588.method8089();
		} else if (Static193.anInt3390 == 76) {
			Static11.aClass38_1 = new Class38(arg1, 14, true, Static67.aCanvas1);
			Static193.anInt3390 = 79;
			Static550.method3528(true);
			Static588.method8089();
		} else if (Static193.anInt3390 == 79) {
			Static288.aClass38_5 = new Class38(arg1, 17, true, Static67.aCanvas1);
			Static193.anInt3390 = 82;
			Static550.method3528(true);
			Static588.method8089();
		} else if (Static193.anInt3390 == 82) {
			Static155.aClass38_3 = new Class38(arg1, 19, true, Static67.aCanvas1);
			Static193.anInt3390 = 85;
			Static550.method3528(true);
			Static588.method8089();
		} else if (Static193.anInt3390 == 85) {
			Static687.aClass38_7 = new Class38(arg1, 22, true, Static67.aCanvas1);
			Static193.anInt3390 = 88;
			Static550.method3528(true);
			Static588.method8089();
		} else if (Static193.anInt3390 == 88) {
			Static419.aClass38_6 = new Class38(arg1, 26, true, Static67.aCanvas1);
			Static193.anInt3390 = 91;
			Static550.method3528(true);
			Static588.method8089();
		} else {
			Static23.aClass38_2 = new Class38(arg1, 30, true, Static67.aCanvas1);
			Static193.anInt3390 = 100;
			Static550.method3528(true);
			Static588.method8089();
			System.gc();
		}
	}
}
