import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static148 {

	@OriginalMember(owner = "client!jj", name = "Xb", descriptor = "Lclient!ge;")
	public static Class69 aClass69_4;

	@OriginalMember(owner = "client!jj", name = "cc", descriptor = "Ljava/lang/String;")
	public static String aString201;

	@OriginalMember(owner = "client!jj", name = "bb", descriptor = "Lclient!ad;")
	public static final Class4 aClass4_8 = new Class4();

	@OriginalMember(owner = "client!jj", name = "Tb", descriptor = "Lclient!ho;")
	public static final Class1_Sub16 aClass1_Sub16_3 = new Class1_Sub16(0, 0);

	@OriginalMember(owner = "client!jj", name = "Zb", descriptor = "Ljava/lang/String;")
	public static String aString200 = " is already on your ignore list.";

	@OriginalMember(owner = "client!jj", name = "fc", descriptor = "[I")
	public static final int[] anIntArray636 = new int[50];

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(ZLclient!jj;IIIIIILclient!jj;I)V")
	public static void method4530(@OriginalArg(1) Class5_Sub3_Sub3 arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) int arg4, @OriginalArg(8) Class5_Sub3_Sub3 arg5, @OriginalArg(9) int arg6) {
		@Pc(7) int local7 = arg0.method4542();
		if (local7 == -1) {
			return;
		}
		@Pc(21) Class90 local21 = (Class90) Static243.aClass140_127.method3816((long) local7);
		if (local21 == null) {
			@Pc(28) Class138[] local28 = Static363.method3773(Static297.aClass165_88, local7);
			if (local28 == null) {
				return;
			}
			local21 = Static34.aClass2_6.method3322(local28[0]);
			Static243.aClass140_127.method3817((long) local7, local21);
		}
		Static217.method3972(arg6 >> 1, arg4 >> 1, 0, arg5.method4541() * 64, arg5.anInt5050, arg5.anInt5047);
		@Pc(73) int local73 = arg3 + Static87.anIntArray215[0] - 18;
		@Pc(81) int local81 = local73 + arg1 / 4 * 18;
		@Pc(92) int local92 = arg2 + Static87.anIntArray215[1] - 54 - 16;
		@Pc(100) int local100 = local92 + arg1 % 4 * 18;
		local21.method5454(local81, local100);
		if (arg0 == arg5) {
			Static34.aClass2_6.method3269(-256, local100 - 1, 18, local81 - 1, 18);
		}
		@Pc(126) Class15_Sub7 local126 = Static53.method1169();
		local126.anInt4720 = local81 + 16;
		local126.anInt4718 = local100 + 16;
		local126.anInt4717 = local81;
		local126.aClass5_Sub3_Sub3_1 = arg0;
		local126.anInt4719 = local100;
		Static233.aClass175_5.method4672(local126);
	}

	@OriginalMember(owner = "client!jj", name = "b", descriptor = "(III)V")
	public static void method4534(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(20) boolean local20 = Static138.aClass204ArrayArrayArray1[0][arg1][arg2] != null && Static138.aClass204ArrayArrayArray1[0][arg1][arg2].aClass204_1 != null;
		for (@Pc(22) int local22 = arg0; local22 >= 0; local22--) {
			if (Static138.aClass204ArrayArrayArray1[local22][arg1][arg2] == null) {
				@Pc(46) Class204 local46 = Static138.aClass204ArrayArrayArray1[local22][arg1][arg2] = new Class204(local22, arg1, arg2);
				if (local20) {
					local46.aByte64++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!jj", name = "c", descriptor = "(I)V")
	public static void method4536() {
		if (Static210.aClass174_2 != null) {
			Static210.aClass174_2.method5515();
		}
		if (Static108.aClass174_1 != null) {
			Static108.aClass174_1.method5515();
		}
		Static32.method869(Static337.aBoolean564);
		Static210.aClass174_2 = Static123.method2196(22050, 0, Static180.aClass110_6, Static261.aCanvas4);
		Static210.aClass174_2.method5521(Static299.aClass1_Sub6_Sub1_3);
		Static108.aClass174_1 = Static123.method2196(2048, 1, Static180.aClass110_6, Static261.aCanvas4);
		Static108.aClass174_1.method5521(Static170.aClass1_Sub6_Sub4_2);
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(BLclient!ql;)V")
	public static void method4537(@OriginalArg(1) Class5_Sub3_Sub3_Sub2 arg0) {
		if (Static277.anInt6207 >= 400) {
			return;
		}
		@Pc(16) Class122 local16 = arg0.aClass122_1;
		if (local16.anIntArray451 != null) {
			local16 = local16.method3573();
			if (local16 == null) {
				return;
			}
		}
		if (!local16.aBoolean322) {
			return;
		}
		@Pc(33) String local33 = local16.aString152;
		if (local16.anInt3826 != 0) {
			@Pc(43) String local43 = Static341.anInt2259 == 1 ? Static1.aString2 : Static62.aString53;
			local33 = local33 + Static262.method4605(Static130.aClass5_Sub3_Sub3_Sub1_1.anInt3330, local16.anInt3826) + " (" + local43 + local16.anInt3826 + ")";
		}
		if (Static243.anInt4739 == 1) {
			Static164.method3162(Static320.anInt6136, 0, Static285.aString222 + " -> <col=ffff00>" + local33, (long) arg0.anInt4920, 16, 0, Static313.aString241);
		} else if (Static89.aBoolean156) {
			@Pc(83) Class1_Sub1_Sub18 local83 = Static21.anInt502 == -1 ? null : Static305.method5149(Static21.anInt502);
			if ((Static95.anInt1903 & 0x2) != 0) {
				if (local83 == null || local16.method3569(Static21.anInt502, local83.anInt5480) != local83.anInt5480) {
					Static164.method3162(Static181.anInt3761, 0, Static144.aString113 + " -> <col=ffff00>" + local33, (long) arg0.anInt4920, 31, 0, Static21.aString15);
				}
				return;
			}
		} else {
			@Pc(133) String[] local133 = local16.aStringArray26;
			if (Static67.aBoolean153) {
				local133 = Static347.method4029(local133);
			}
			@Pc(143) int local143;
			if (local133 != null) {
				for (local143 = 4; local143 >= 0; local143--) {
					if (local133[local143] != null && (Static341.anInt2259 != 0 || !local133[local143].equalsIgnoreCase(Static302.aString192))) {
						@Pc(159) byte local159 = 0;
						@Pc(161) int local161 = Static57.anInt1269;
						if (local143 == 0) {
							local159 = 33;
						}
						if (local143 == 1) {
							local159 = 50;
						}
						if (local143 == 2) {
							local159 = 49;
						}
						if (local143 == 3) {
							local159 = 28;
						}
						if (local143 == local16.anInt3825) {
							local161 = local16.anInt3798;
						}
						if (local143 == 4) {
							local159 = 1;
						}
						if (local16.anInt3791 == local143) {
							local161 = local16.anInt3827;
						}
						Static164.method3162(local161, 0, "<col=ffff00>" + local33, (long) arg0.anInt4920, local159, 0, local133[local143]);
					}
				}
			}
			if (Static341.anInt2259 == 0 && local133 != null) {
				for (local143 = 4; local143 >= 0; local143--) {
					if (local133[local143] != null && local133[local143].equalsIgnoreCase(Static302.aString192)) {
						@Pc(254) short local254 = 0;
						if (Static130.aClass5_Sub3_Sub3_Sub1_1.anInt3330 < local16.anInt3826) {
							local254 = 2000;
						}
						@Pc(263) short local263 = 0;
						if (local143 == 0) {
							local263 = 33;
						}
						if (local143 == 1) {
							local263 = 50;
						}
						if (local143 == 2) {
							local263 = 49;
						}
						if (local143 == 3) {
							local263 = 28;
						}
						if (local143 == 4) {
							local263 = 1;
						}
						if (local263 != 0) {
							local263 += local254;
						}
						Static164.method3162(local16.anInt3822, 0, "<col=ffff00>" + local33, (long) arg0.anInt4920, local263, 0, local133[local143]);
					}
				}
			}
			Static164.method3162(Static338.anInt6420, 0, "<col=ffff00>" + local33, (long) arg0.anInt4920, 1010, 0, Static206.aString167);
		}
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(B)Z")
	public static boolean method4540() {
		try {
			return Static328.method5504();
		} catch (@Pc(14) IOException local14) {
			Static306.method5162();
			return true;
		} catch (@Pc(19) Exception local19) {
			@Pc(60) String local60 = "T2 - " + Static351.anInt6505 + "," + Static28.anInt732 + "," + Static322.anInt6152 + " - " + Static230.anInt4529 + "," + (Static182.anInt3775 + Static130.aClass5_Sub3_Sub3_Sub1_1.anIntArray638[0]) + "," + (Static161.anInt3315 + Static130.aClass5_Sub3_Sub3_Sub1_1.anIntArray637[0]) + " - ";
			for (@Pc(62) int local62 = 0; Static230.anInt4529 > local62 && local62 < 50; local62++) {
				local60 = local60 + Static232.aClass1_Sub7_Sub1_4.aByteArray58[local62] + ",";
			}
			Static152.method2899(local60, local19);
			Static55.method1208();
			return true;
		}
	}
}
