import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static112 {

	@OriginalMember(owner = "client!ng", name = "ic", descriptor = "I")
	public static int anInt2716;

	@OriginalMember(owner = "client!ng", name = "nc", descriptor = "Lclient!jc;")
	public static Class38 aClass38_4;

	@OriginalMember(owner = "client!ng", name = "dc", descriptor = "Lclient!ai;")
	public static Class6 aClass6_778 = Static38.method685("Nehmen");

	@OriginalMember(owner = "client!ng", name = "gc", descriptor = "I")
	public static int anInt2714 = 1;

	@OriginalMember(owner = "client!ng", name = "jc", descriptor = "I")
	public static int anInt2717 = 0;

	@OriginalMember(owner = "client!ng", name = "kc", descriptor = "Lclient!vb;")
	public static Class84 aClass84_7 = new Class84();

	@OriginalMember(owner = "client!ng", name = "lc", descriptor = "I")
	public static int anInt2718 = 0;

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(Lclient!wa;I)V")
	public static void method1807(@OriginalArg(0) Class87 arg0) {
		@Pc(2) int local2 = arg0.anInt4101;
		if (local2 == 324) {
			if (Static60.anInt1424 == -1) {
				Static107.anInt2563 = arg0.anInt4135;
				Static60.anInt1424 = arg0.anInt4129;
			}
			if (Static144.aClass55_2.aBoolean102) {
				arg0.anInt4129 = Static60.anInt1424;
			} else {
				arg0.anInt4129 = Static107.anInt2563;
			}
		} else if (local2 == 325) {
			if (Static60.anInt1424 == -1) {
				Static107.anInt2563 = arg0.anInt4135;
				Static60.anInt1424 = arg0.anInt4129;
			}
			if (Static144.aClass55_2.aBoolean102) {
				arg0.anInt4129 = Static107.anInt2563;
			} else {
				arg0.anInt4129 = Static60.anInt1424;
			}
		} else if (local2 == 327) {
			arg0.anInt4081 = 150;
			arg0.anInt4126 = (int) (Math.sin((double) Static107.anInt2559 / 40.0D) * 256.0D) & 0x7FF;
			arg0.anInt4071 = -1;
			arg0.anInt4090 = 5;
		} else if (local2 == 328) {
			if (Static131.aClass2_Sub3_Sub5_Sub1_Sub1_1.aClass6_244 == null) {
				arg0.anInt4071 = 0;
			} else {
				arg0.anInt4081 = 150;
				arg0.anInt4126 = (int) (Math.sin((double) Static107.anInt2559 / 40.0D) * 256.0D) & 0x7FF;
				arg0.anInt4090 = 5;
				arg0.anInt4071 = ((int) Static131.aClass2_Sub3_Sub5_Sub1_Sub1_1.aClass6_244.method129() << 11) + 2047;
				arg0.anInt4119 = Static131.aClass2_Sub3_Sub5_Sub1_Sub1_1.anInt2665;
				arg0.anInt4132 = Static131.aClass2_Sub3_Sub5_Sub1_Sub1_1.anInt2657;
			}
		}
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(ILclient!dh;II)V")
	public static void method1808(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub3_Sub5_Sub1_Sub1 arg1, @OriginalArg(2) int arg2) {
		if ((arg0 & 0x100) != 0) {
			arg1.anInt2671 = Static64.aClass2_Sub13_Sub1_1.method1409();
			arg1.anInt2666 = Static64.aClass2_Sub13_Sub1_1.method1436();
			arg1.anInt2678 = Static64.aClass2_Sub13_Sub1_1.method1402();
			arg1.anInt2677 = Static64.aClass2_Sub13_Sub1_1.method1441();
			arg1.anInt2690 = Static64.aClass2_Sub13_Sub1_1.method1430() + Static107.anInt2559;
			arg1.anInt2696 = Static64.aClass2_Sub13_Sub1_1.method1415() + Static107.anInt2559;
			arg1.anInt2691 = Static64.aClass2_Sub13_Sub1_1.method1409();
			arg1.anInt2687 = 1;
			arg1.anInt2694 = 0;
		}
		@Pc(70) int local70;
		@Pc(74) int local74;
		if ((arg0 & 0x80) != 0) {
			local70 = Static64.aClass2_Sub13_Sub1_1.method1415();
			local74 = Static64.aClass2_Sub13_Sub1_1.method1402();
			if (local70 == 65535) {
				local70 = -1;
			}
			Static56.method1800(local74, local70, arg1);
		}
		if ((arg0 & 0x1) != 0) {
			arg1.anInt2702 = Static64.aClass2_Sub13_Sub1_1.method1397();
			arg1.anInt2709 = Static64.aClass2_Sub13_Sub1_1.method1415();
		}
		if ((arg0 & 0x400) != 0) {
			arg1.anInt2708 = Static64.aClass2_Sub13_Sub1_1.method1430();
			local70 = Static64.aClass2_Sub13_Sub1_1.method1432();
			if (arg1.anInt2708 == 65535) {
				arg1.anInt2708 = -1;
			}
			arg1.anInt2673 = local70 >> 16;
			arg1.anInt2661 = 0;
			arg1.anInt2711 = Static107.anInt2559 + (local70 & 0xFFFF);
			arg1.anInt2663 = 0;
			if (arg1.anInt2711 > Static107.anInt2559) {
				arg1.anInt2663 = -1;
			}
		}
		if ((arg0 & 0x20) != 0) {
			local70 = Static64.aClass2_Sub13_Sub1_1.method1397();
			local74 = Static64.aClass2_Sub13_Sub1_1.method1441();
			@Pc(164) int local164 = Static64.aClass2_Sub13_Sub1_1.method1436();
			@Pc(167) int local167 = Static64.aClass2_Sub13_Sub1_1.anInt2154;
			if (arg1.aClass6_244 != null && arg1.aClass55_1 != null) {
				@Pc(178) long local178 = arg1.aClass6_244.method129();
				@Pc(180) boolean local180 = false;
				if (local74 <= 1) {
					for (@Pc(185) int local185 = 0; local185 < Static68.anInt1729; local185++) {
						if (local178 == Static138.aLongArray6[local185]) {
							local180 = true;
							break;
						}
					}
				}
				if (!local180 && anInt2717 == 0) {
					Static68.aClass2_Sub13_2.anInt2154 = 0;
					Static64.aClass2_Sub13_Sub1_1.method1448(local164, Static68.aClass2_Sub13_2.aByteArray14);
					Static68.aClass2_Sub13_2.anInt2154 = 0;
					@Pc(236) Class6 local236 = Static175.method2510(Static133.method2091(Static68.aClass2_Sub13_2).method110());
					arg1.aClass6_776 = local236.method135();
					arg1.anInt2675 = local70 & 0xFF;
					arg1.anInt2701 = 150;
					arg1.anInt2705 = local70 >> 8;
					if (local74 == 2 || local74 == 3) {
						Static6.method932(1, local236, Static58.method956(new Class6[] { Static152.aClass6_1037, arg1.aClass6_244 }));
					} else if (local74 == 1) {
						Static6.method932(1, local236, Static58.method956(new Class6[] { Static76.aClass6_576, arg1.aClass6_244 }));
					} else {
						Static6.method932(2, local236, arg1.aClass6_244);
					}
				}
			}
			Static64.aClass2_Sub13_Sub1_1.anInt2154 = local164 + local167;
		}
		if ((arg0 & 0x40) != 0) {
			arg1.anInt2699 = Static64.aClass2_Sub13_Sub1_1.method1430();
			if (arg1.anInt2699 == 65535) {
				arg1.anInt2699 = -1;
			}
		}
		if ((arg0 & 0x2) != 0) {
			local70 = Static64.aClass2_Sub13_Sub1_1.method1402();
			local74 = Static64.aClass2_Sub13_Sub1_1.method1441();
			arg1.method1802(local74, Static107.anInt2559, local70);
			arg1.anInt2686 = Static107.anInt2559 + 300;
			arg1.anInt2704 = Static64.aClass2_Sub13_Sub1_1.method1436();
			arg1.anInt2670 = Static64.aClass2_Sub13_Sub1_1.method1409();
		}
		if ((arg0 & 0x200) != 0) {
			local70 = Static64.aClass2_Sub13_Sub1_1.method1441();
			local74 = Static64.aClass2_Sub13_Sub1_1.method1409();
			arg1.method1802(local74, Static107.anInt2559, local70);
			arg1.anInt2686 = Static107.anInt2559 + 300;
			arg1.anInt2704 = Static64.aClass2_Sub13_Sub1_1.method1441();
			arg1.anInt2670 = Static64.aClass2_Sub13_Sub1_1.method1436();
		}
		if ((arg0 & 0x8) != 0) {
			local70 = Static64.aClass2_Sub13_Sub1_1.method1436();
			@Pc(424) byte[] local424 = new byte[local70];
			@Pc(429) Class2_Sub13 local429 = new Class2_Sub13(local424);
			Static64.aClass2_Sub13_Sub1_1.method1448(local70, local424);
			Static46.aClass2_Sub13Array1[arg2] = local429;
			arg1.method592(local429);
		}
		if ((arg0 & 0x4) == 0) {
			return;
		}
		arg1.aClass6_776 = Static64.aClass2_Sub13_Sub1_1.method1399();
		if (arg1.aClass6_776.method128(0) == 126) {
			arg1.aClass6_776 = arg1.aClass6_776.method119(1);
			Static6.method932(2, arg1.aClass6_776, arg1.aClass6_244);
		} else if (Static131.aClass2_Sub3_Sub5_Sub1_Sub1_1 == arg1) {
			Static6.method932(2, arg1.aClass6_776, arg1.aClass6_244);
		}
		arg1.anInt2705 = 0;
		arg1.anInt2701 = 150;
		arg1.anInt2675 = 0;
	}

	@OriginalMember(owner = "client!ng", name = "g", descriptor = "(I)V")
	public static void method1809() {
		aClass38_4 = null;
		aClass6_778 = null;
		aClass84_7 = null;
	}
}
