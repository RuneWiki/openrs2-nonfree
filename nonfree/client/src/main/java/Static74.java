import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static74 {

	@OriginalMember(owner = "client!ep", name = "y", descriptor = "I")
	public static int anInt1551;

	@OriginalMember(owner = "client!ep", name = "B", descriptor = "I")
	public static int anInt1553 = -1;

	@OriginalMember(owner = "client!ep", name = "H", descriptor = "I")
	public static int anInt1559 = 0;

	@OriginalMember(owner = "client!ep", name = "L", descriptor = "I")
	public static int anInt1562 = 2;

	@OriginalMember(owner = "client!ep", name = "Q", descriptor = "Lclient!tj;")
	public static Class193 aClass193_3 = null;

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(ZZZII)V")
	public static void method1291(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static215.method3989(0, arg1, Static157.aClass127_Sub1Array1.length - 1, arg2, arg0, arg3);
		Static340.anInt6563 = 0;
		Static101.aClass1_Sub34_1 = null;
	}

	@OriginalMember(owner = "client!ep", name = "e", descriptor = "(I)V")
	public static void method1292() {
		Static16.method298(25);
		Static13.method191();
		System.gc();
	}

	@OriginalMember(owner = "client!ep", name = "f", descriptor = "(I)V")
	public static void method1293() {
		if (Static88.aClass105_6 != null) {
			Static88.aClass105_6.method4299();
			Static54.aClass29_1 = null;
			Static88.aClass105_6 = null;
		}
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(IZLclient!n;I)V")
	public static void method1294(@OriginalArg(0) int arg0, @OriginalArg(2) Class10_Sub1_Sub2_Sub2 arg1, @OriginalArg(3) int arg2) {
		@Pc(9) int local9;
		@Pc(13) int local13;
		if ((arg0 & 0x8) != 0) {
			local9 = Static142.aClass1_Sub21_Sub2_1.method5699();
			local13 = Static142.aClass1_Sub21_Sub2_1.method5743();
			arg1.method3405(local13, local9, Static282.anInt3516);
			arg1.anInt4048 = Static282.anInt3516 + 300;
			arg1.anInt4007 = Static142.aClass1_Sub21_Sub2_1.method5727();
		}
		@Pc(58) int local58;
		if ((arg0 & 0x100) != 0) {
			local9 = Static142.aClass1_Sub21_Sub2_1.method5743();
			@Pc(44) int[] local44 = new int[local9];
			@Pc(47) int[] local47 = new int[local9];
			@Pc(50) int[] local50 = new int[local9];
			for (@Pc(52) int local52 = 0; local52 < local9; local52++) {
				local58 = Static142.aClass1_Sub21_Sub2_1.method5728();
				if (local58 == 65535) {
					local58 = -1;
				}
				local44[local52] = local58;
				local47[local52] = Static142.aClass1_Sub21_Sub2_1.method5743();
				local50[local52] = Static142.aClass1_Sub21_Sub2_1.method5733();
			}
			Static145.method2599(arg1, local50, local44, local47);
		}
		if ((arg0 & 0x400) != 0) {
			local9 = Static142.aClass1_Sub21_Sub2_1.method5728();
			arg1.anInt4017 = Static142.aClass1_Sub21_Sub2_1.method5720();
			arg1.anInt4025 = Static142.aClass1_Sub21_Sub2_1.method5727();
			arg1.aBoolean309 = (local9 & 0x8000) != 0;
			arg1.anInt4065 = local9 & 0x7FFF;
			arg1.anInt4045 = Static282.anInt3516 + arg1.anInt4065 + arg1.anInt4017;
		}
		if ((arg0 & 0x800) != 0) {
			local9 = Static142.aClass1_Sub21_Sub2_1.method5699();
			local13 = Static142.aClass1_Sub21_Sub2_1.method5720();
			arg1.method3405(local13, local9, Static282.anInt3516);
		}
		if ((arg0 & 0x1) != 0) {
			local9 = Static142.aClass1_Sub21_Sub2_1.method5746();
			@Pc(175) byte[] local175 = new byte[local9];
			@Pc(180) Class1_Sub21 local180 = new Class1_Sub21(local175);
			Static142.aClass1_Sub21_Sub2_1.method5730(local175, local9);
			Static83.aClass1_Sub21Array1[arg2] = local180;
			arg1.method3421(local180);
		}
		if ((arg0 & 0x200) != 0) {
			arg1.anInt4040 = Static142.aClass1_Sub21_Sub2_1.method5727();
			arg1.anInt4022 = Static142.aClass1_Sub21_Sub2_1.method5746();
			arg1.anInt4057 = Static142.aClass1_Sub21_Sub2_1.method5746();
			arg1.anInt4008 = Static142.aClass1_Sub21_Sub2_1.method5746();
			arg1.anInt4073 = Static142.aClass1_Sub21_Sub2_1.method5712() + Static282.anInt3516;
			arg1.anInt4054 = Static142.aClass1_Sub21_Sub2_1.method5728() + Static282.anInt3516;
			arg1.anInt4031 = Static142.aClass1_Sub21_Sub2_1.method5746();
			arg1.anInt4085 = 0;
			arg1.anInt4088 = 1;
		}
		if ((arg0 & 0x40) != 0) {
			arg1.anInt4061 = Static142.aClass1_Sub21_Sub2_1.method5712();
			if (arg1.anInt4061 == 65535) {
				arg1.anInt4061 = -1;
			}
		}
		if ((arg0 & 0x4) != 0) {
			arg1.aString150 = Static142.aClass1_Sub21_Sub2_1.method5701();
			if (arg1.aString150.charAt(0) == '~') {
				arg1.aString150 = arg1.aString150.substring(1);
				Static306.method5295(2, 0, arg1.method3419(), arg1.aString150, arg1.method3424());
			} else if (Static127.aClass10_Sub1_Sub2_Sub2_1 == arg1) {
				Static306.method5295(2, 0, arg1.method3419(), arg1.aString150, arg1.method3424());
			}
			arg1.anInt4032 = 0;
			arg1.anInt4043 = 150;
			arg1.anInt4055 = 0;
		}
		@Pc(349) int local349;
		if ((arg0 & 0x80) != 0) {
			local9 = Static142.aClass1_Sub21_Sub2_1.method5733();
			local13 = Static142.aClass1_Sub21_Sub2_1.method5746();
			@Pc(346) int local346 = Static142.aClass1_Sub21_Sub2_1.method5746();
			local349 = Static142.aClass1_Sub21_Sub2_1.anInt6611;
			@Pc(360) boolean local360 = (local9 & 0x8000) != 0;
			if (arg1.aString152 != null && arg1.aClass136_1 != null) {
				@Pc(368) boolean local368 = false;
				if (local13 <= 1) {
					if (!local360 && (Static49.aBoolean438 && !Static152.aBoolean243 || Static339.aBoolean541)) {
						local368 = true;
					} else if (Static109.method1757(arg1.aString152)) {
						local368 = true;
					}
				}
				if (!local368 && Static327.anInt6425 == 0) {
					Static117.aClass1_Sub21_2.anInt6611 = 0;
					Static142.aClass1_Sub21_Sub2_1.method5725(Static117.aClass1_Sub21_2.aByteArray82, local346);
					Static117.aClass1_Sub21_2.anInt6611 = 0;
					@Pc(411) int local411 = -1;
					@Pc(421) String local421;
					if (local360) {
						local9 &= 0x7FFF;
						@Pc(431) Class131 local431 = Static305.method5284(Static117.aClass1_Sub21_2);
						local411 = local431.anInt3546;
						local421 = local431.aClass1_Sub2_Sub2_1.method880(Static117.aClass1_Sub21_2);
					} else {
						local421 = Static214.method3965(Static355.method5868(Static303.method5264(Static117.aClass1_Sub21_2)));
					}
					arg1.aString150 = local421.trim();
					arg1.anInt4043 = 150;
					arg1.anInt4032 = local9 >> 8;
					arg1.anInt4055 = local9 & 0xFF;
					@Pc(473) int local473;
					if (local13 == 1 || local13 == 2) {
						local473 = local360 ? 17 : 1;
					} else {
						local473 = local360 ? 17 : 2;
					}
					if (local13 == 2) {
						Static110.method1761(null, local473, local421, local411, 0, "<img=1>" + arg1.method3419(), "<img=1>" + arg1.method3424());
					} else if (local13 == 1) {
						Static110.method1761(null, local473, local421, local411, 0, "<img=0>" + arg1.method3419(), "<img=0>" + arg1.method3424());
					} else {
						Static110.method1761(null, local473, local421, local411, 0, arg1.method3419(), arg1.method3424());
					}
				}
			}
			Static142.aClass1_Sub21_Sub2_1.anInt6611 = local346 + local349;
		}
		if ((arg0 & 0x10) != 0) {
			local9 = Static142.aClass1_Sub21_Sub2_1.method5712();
			if (local9 == 65535) {
				local9 = -1;
			}
			local13 = Static142.aClass1_Sub21_Sub2_1.method5720();
			Static222.method4091(arg1, local9, local13);
		}
		if ((arg0 & 0x1000) != 0) {
			local9 = Static142.aClass1_Sub21_Sub2_1.method5715();
			if (local9 == 65535) {
				local9 = -1;
			}
			local13 = Static142.aClass1_Sub21_Sub2_1.method5716();
			@Pc(621) boolean local621 = true;
			@Pc(649) Class177 local649;
			if (local9 != -1 && arg1.anInt4058 != -1) {
				@Pc(637) Class162 local637;
				if (arg1.anInt4058 == local9) {
					local637 = Static264.method4763(local9);
					if (local637.aBoolean394 && local637.anInt4910 != -1) {
						local649 = Static354.method5863(local637.anInt4910);
						local58 = local649.anInt5420;
						if (local58 == 0) {
							local621 = false;
						} else if (local58 == 1) {
							local621 = true;
						} else if (local58 == 2) {
							local621 = false;
							arg1.anInt4010 = 0;
						}
					}
				} else {
					local637 = Static264.method4763(local9);
					@Pc(684) Class162 local684 = Static264.method4763(arg1.anInt4058);
					if (local637.anInt4910 != -1 && local684.anInt4910 != -1) {
						@Pc(698) Class177 local698 = Static354.method5863(local637.anInt4910);
						@Pc(703) Class177 local703 = Static354.method5863(local684.anInt4910);
						if (local703.anInt5417 > local698.anInt5417) {
							local621 = false;
						}
					}
				}
			}
			if (local621) {
				arg1.anInt4018 = 1;
				arg1.anInt4058 = local9;
				arg1.anInt4070 = local13 >> 16;
				arg1.anInt4076 = Static282.anInt3516 + (local13 & 0xFFFF);
				arg1.anInt4013 = 0;
				arg1.anInt4038 = 0;
				if (arg1.anInt4076 > Static282.anInt3516) {
					arg1.anInt4038 = -1;
				}
				if (arg1.anInt4058 != -1 && Static282.anInt3516 == arg1.anInt4076) {
					local349 = Static264.method4763(arg1.anInt4058).anInt4910;
					if (local349 != -1) {
						local649 = Static354.method5863(local349);
						if (local649 != null && local649.anIntArray529 != null) {
							Static351.method3417(arg1.anInt6726, arg1 == Static127.aClass10_Sub1_Sub2_Sub2_1, arg1.anInt6728, 0, local649);
						}
					}
				}
			}
		}
		if ((arg0 & 0x20) != 0) {
			arg1.anInt4015 = Static142.aClass1_Sub21_Sub2_1.method5728();
			arg1.anInt4053 = Static142.aClass1_Sub21_Sub2_1.method5733();
		}
	}

	@OriginalMember(owner = "client!ep", name = "g", descriptor = "(I)V")
	public static void method1295() {
		for (@Pc(7) int local7 = 0; local7 < 100; local7++) {
			Static19.aBooleanArray1[local7] = true;
		}
	}
}
