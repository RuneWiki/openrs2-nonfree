import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static194 {

	@OriginalMember(owner = "client!ml", name = "w", descriptor = "[I")
	public static final int[] anIntArray356 = new int[] { 2, 2, 4, 0, 1, 8, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0 };

	@OriginalMember(owner = "client!ml", name = "K", descriptor = "Ljava/lang/String;")
	public static String aString143 = "Unable to find ";

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(II)Lclient!om;")
	public static Class4_Sub1_Sub16 method3524(@OriginalArg(0) int arg0) {
		@Pc(10) Class154 local10 = Static181.aClass154_64;
		@Pc(19) Class4_Sub1_Sub16 local19;
		synchronized (Static181.aClass154_64) {
			local19 = (Class4_Sub1_Sub16) Static181.aClass154_64.method4222((long) arg0);
			if (local19 == null) {
				local19 = new Class4_Sub1_Sub16(arg0);
				Static181.aClass154_64.method4221((long) arg0, local19);
			}
		}
		synchronized (local19) {
			return local19.method3939() ? local19 : null;
		}
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(IILclient!fd;I)V")
	public static void method3525(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class72 arg2) {
		if (arg2.aByte33 == 0) {
			arg2.anInt1861 = arg2.anInt1796;
		} else if (arg2.aByte33 == 1) {
			arg2.anInt1861 = (arg1 - arg2.anInt1829) / 2 + arg2.anInt1796;
		} else if (arg2.aByte33 == 2) {
			arg2.anInt1861 = arg1 - arg2.anInt1829 - arg2.anInt1796;
		} else if (arg2.aByte33 == 3) {
			arg2.anInt1861 = arg1 * arg2.anInt1796 >> 14;
		} else if (arg2.aByte33 == 4) {
			arg2.anInt1861 = (arg1 - arg2.anInt1829) / 2 + (arg1 * arg2.anInt1796 >> 14);
		} else {
			arg2.anInt1861 = arg1 - arg2.anInt1829 - (arg1 * arg2.anInt1796 >> 14);
		}
		if (arg2.aByte34 == 0) {
			arg2.anInt1854 = arg2.anInt1805;
		} else if (arg2.aByte34 == 1) {
			arg2.anInt1854 = (arg0 - arg2.anInt1806) / 2 + arg2.anInt1805;
		} else if (arg2.aByte34 == 2) {
			arg2.anInt1854 = arg0 - arg2.anInt1805 - arg2.anInt1806;
		} else if (arg2.aByte34 == 3) {
			arg2.anInt1854 = arg0 * arg2.anInt1805 >> 14;
		} else if (arg2.aByte34 == 4) {
			arg2.anInt1854 = (arg0 - arg2.anInt1806) / 2 + (arg0 * arg2.anInt1805 >> 14);
		} else {
			arg2.anInt1854 = arg0 - (arg0 * arg2.anInt1805 >> 14) - arg2.anInt1806;
		}
		if (!Static93.aBoolean179) {
			return;
		}
		if (Static46.method876(arg2).anInt269 == 0 && arg2.anInt1825 != 0) {
			return;
		}
		if (arg2.anInt1854 < 0) {
			arg2.anInt1854 = 0;
		} else if (arg2.anInt1854 + arg2.anInt1806 > arg0) {
			arg2.anInt1854 = arg0 - arg2.anInt1806;
		}
		if (arg2.anInt1861 < 0) {
			arg2.anInt1861 = 0;
			return;
		}
		if (arg2.anInt1861 + arg2.anInt1829 > arg1) {
			arg2.anInt1861 = arg1 - arg2.anInt1829;
			return;
		}
	}

	@OriginalMember(owner = "client!ml", name = "b", descriptor = "(B)V")
	public static void method3526() {
		for (@Pc(15) int local15 = 0; local15 < Static104.anInt6829; local15++) {
			@Pc(21) int local21 = Static49.anIntArray122[local15];
			@Pc(25) Class2_Sub2_Sub1_Sub2 local25 = Static101.aClass2_Sub2_Sub1_Sub2Array6[local21];
			@Pc(29) int local29 = Static200.aClass4_Sub7_Sub1_2.method2380();
			if ((local29 & 0x40) != 0) {
				local29 += Static200.aClass4_Sub7_Sub1_2.method2380() << 8;
			}
			@Pc(52) int local52;
			@Pc(56) int local56;
			if ((local29 & 0x2) != 0) {
				local52 = Static200.aClass4_Sub7_Sub1_2.method2413();
				local56 = Static200.aClass4_Sub7_Sub1_2.method2361();
				local25.method5424(local56, Static342.anInt6706, local52);
			}
			if ((local29 & 0x10) != 0) {
				local25.aString243 = Static200.aClass4_Sub7_Sub1_2.method2379();
				local25.anInt6497 = 100;
			}
			if ((local29 & 0x8) != 0) {
				local52 = Static200.aClass4_Sub7_Sub1_2.method2364();
				if (local52 == 65535) {
					local52 = -1;
				}
				local56 = Static200.aClass4_Sub7_Sub1_2.method2361();
				Static351.method5648(local52, local25, local56);
			}
			if ((local29 & 0x20) != 0) {
				local52 = Static200.aClass4_Sub7_Sub1_2.method2413();
				local56 = Static200.aClass4_Sub7_Sub1_2.method2374();
				local25.method5424(local56, Static342.anInt6706, local52);
				local25.anInt6488 = Static342.anInt6706 + 300;
				local25.anInt6496 = Static200.aClass4_Sub7_Sub1_2.method2417();
			}
			if ((local29 & 0x200) != 0) {
				local25.anInt6539 = Static200.aClass4_Sub7_Sub1_2.method2404();
				local25.anInt6478 = Static200.aClass4_Sub7_Sub1_2.method2386();
			}
			@Pc(202) int local202;
			if ((local29 & 0x4) != 0) {
				local52 = Static200.aClass4_Sub7_Sub1_2.method2404();
				local56 = Static200.aClass4_Sub7_Sub1_2.method2389();
				if (local52 == 65535) {
					local52 = -1;
				}
				@Pc(170) boolean local170 = true;
				@Pc(199) Class116 local199;
				if (local52 != -1 && local25.anInt6482 != -1) {
					@Pc(187) Class156 local187;
					if (local25.anInt6482 == local52) {
						local187 = Static244.method4224(local52);
						if (local187.aBoolean432 && local187.anInt5127 != -1) {
							local199 = Static340.method5560(local187.anInt5127);
							local202 = local199.anInt3739;
							if (local202 == 0) {
								local170 = false;
							} else if (local202 == 1) {
								local170 = true;
							} else if (local202 == 2) {
								local170 = false;
								local25.anInt6505 = 0;
							}
						}
					} else {
						local187 = Static244.method4224(local52);
						@Pc(234) Class156 local234 = Static244.method4224(local25.anInt6482);
						if (local187.anInt5127 != -1 && local234.anInt5127 != -1) {
							@Pc(247) Class116 local247 = Static340.method5560(local187.anInt5127);
							@Pc(252) Class116 local252 = Static340.method5560(local234.anInt5127);
							if (local247.anInt3749 < local252.anInt3749) {
								local170 = false;
							}
						}
					}
				}
				if (local170) {
					local25.anInt6521 = Static342.anInt6706 + (local56 & 0xFFFF);
					local25.anInt6531 = local56 >> 16;
					local25.anInt6492 = 0;
					local25.anInt6482 = local52;
					local25.anInt6525 = 0;
					local25.anInt6512 = 1;
					if (Static342.anInt6706 < local25.anInt6521) {
						local25.anInt6492 = -1;
					}
					if (local25.anInt6482 != -1 && local25.anInt6521 == Static342.anInt6706) {
						@Pc(311) int local311 = Static244.method4224(local25.anInt6482).anInt5127;
						if (local311 != -1) {
							local199 = Static340.method5560(local311);
							if (local199 != null && local199.anIntArray330 != null) {
								Static291.method4975(false, local199, 0, local25.anInt6465, local25.anInt6466);
							}
						}
					}
				}
			}
			if ((local29 & 0x400) != 0) {
				local52 = Static200.aClass4_Sub7_Sub1_2.method2386();
				local25.anInt6511 = Static200.aClass4_Sub7_Sub1_2.method2417();
				local25.anInt6495 = Static200.aClass4_Sub7_Sub1_2.method2380();
				local25.aBoolean566 = (local52 & 0x8000) != 0;
				local25.anInt6502 = local52 & 0x7FFF;
				local25.anInt6507 = local25.anInt6511 + Static342.anInt6706 + local25.anInt6502;
			}
			if ((local29 & 0x1) != 0) {
				local25.anInt6479 = Static200.aClass4_Sub7_Sub1_2.method2386();
				if (local25.anInt6479 == 65535) {
					local25.anInt6479 = -1;
				}
			}
			if ((local29 & 0x80) != 0) {
				if (local25.aClass34_1.method734()) {
					Static235.method5579(local25);
				}
				local25.method5445(Static165.method2927(Static200.aClass4_Sub7_Sub1_2.method2394()));
				local25.method5433(local25.aClass34_1.anInt842);
				local25.anInt6514 = local25.aClass34_1.anInt852 << 3;
				if (local25.aClass34_1.method734()) {
					Static55.method1013(0, local25.anIntArray517[0], local25.anIntArray518[0], local25, null, Static279.anInt5645, null);
				}
			}
			if ((local29 & 0x100) != 0) {
				local52 = Static200.aClass4_Sub7_Sub1_2.method2380();
				@Pc(462) int[] local462 = new int[local52];
				@Pc(465) int[] local465 = new int[local52];
				@Pc(468) int[] local468 = new int[local52];
				for (@Pc(470) int local470 = 0; local470 < local52; local470++) {
					local202 = Static200.aClass4_Sub7_Sub1_2.method2404();
					if (local202 == 65535) {
						local202 = -1;
					}
					local462[local470] = local202;
					local465[local470] = Static200.aClass4_Sub7_Sub1_2.method2417();
					local468[local470] = Static200.aClass4_Sub7_Sub1_2.method2394();
				}
				Static162.method3123(local468, local25, local462, local465);
			}
		}
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(IB)V")
	public static void method3528() {
		@Pc(1) Class154 local1 = Static319.aClass154_99;
		synchronized (Static319.aClass154_99) {
			Static319.aClass154_99.method4220(5);
		}
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(ILclient!tq;)Ljava/lang/String;")
	public static String method3529(@OriginalArg(1) Class4_Sub7 arg0) {
		return Static117.method2098(arg0);
	}
}
