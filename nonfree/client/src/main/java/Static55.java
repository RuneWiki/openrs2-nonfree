import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static55 {

	@OriginalMember(owner = "client!dg", name = "e", descriptor = "Lclient!fd;")
	public static Class72 aClass72_4;

	@OriginalMember(owner = "client!dg", name = "g", descriptor = "Lclient!am;")
	public static Class11 aClass11_22;

	@OriginalMember(owner = "client!dg", name = "k", descriptor = "I")
	public static int anInt1221;

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "I")
	public static int anInt1214 = 0;

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(IZ)V")
	public static void method1008(@OriginalArg(0) int arg0) {
		for (@Pc(21) Class4 local21 = Static18.aClass198_2.method5268(); local21 != null; local21 = Static18.aClass198_2.method5263()) {
			if ((local21.aLong259 >> 48 & 0xFFFFL) == (long) arg0) {
				local21.method5667();
			}
		}
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(I)V")
	public static void method1009() {
		Static129.aClass4_Sub13_Sub3_1.method4890();
		Static74.aClass11_38 = null;
		Static177.anInt5898 = 1;
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "([BB)[B")
	public static byte[] method1011(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(11) byte[] local11 = new byte[arg0.length];
			Static363.method4761(arg0, 0, local11, 0, arg0.length);
			return local11;
		}
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIIILclient!ur;Lclient!c;ILclient!ds;)V")
	public static void method1013(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class2_Sub2_Sub1_Sub2 arg3, @OriginalArg(5) Class2_Sub2_Sub1_Sub1 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class56 arg6) {
		@Pc(7) Class4_Sub37 local7 = new Class4_Sub37();
		local7.anInt6033 = arg2 * 128;
		local7.anInt6024 = arg1 * 128;
		local7.anInt6019 = arg5;
		if (arg6 != null) {
			local7.aClass56_1 = arg6;
			@Pc(136) int local136 = arg6.anInt1313;
			@Pc(139) int local139 = arg6.anInt1330;
			if (arg0 == 1 || arg0 == 3) {
				local139 = arg6.anInt1313;
				local136 = arg6.anInt1330;
			}
			local7.anInt6030 = arg6.anInt1328;
			local7.anInt6023 = arg6.anInt1342;
			local7.anInt6022 = (local136 + arg2) * 128;
			local7.anInt6021 = arg6.anInt1334;
			local7.anInt6029 = arg6.anInt1317;
			local7.anInt6026 = (local139 + arg1) * 128;
			local7.anInt6028 = arg6.anInt1314 * 128;
			local7.anIntArray492 = arg6.anIntArray152;
			if (arg6.anIntArray151 != null) {
				local7.aBoolean527 = true;
				local7.method5070();
			}
			if (local7.anIntArray492 != null) {
				local7.anInt6025 = local7.anInt6023 + (int) ((double) (local7.anInt6029 - local7.anInt6023) * Math.random());
			}
			Static307.aClass130_81.method3510(local7);
		} else if (arg3 != null) {
			local7.aClass2_Sub2_Sub1_Sub2_1 = arg3;
			@Pc(82) Class34 local82 = arg3.aClass34_1;
			if (local82.anIntArray108 != null) {
				local7.aBoolean527 = true;
				local82 = local82.method748();
			}
			if (local82 != null) {
				local7.anInt6022 = (local82.anInt842 + arg2) * 128;
				local7.anInt6026 = (local82.anInt842 + arg1) * 128;
				local7.anInt6030 = Static125.method5100(arg3);
				local7.anInt6028 = local82.anInt861 * 128;
				local7.anInt6021 = local82.anInt848;
			}
			Static182.aClass130_85.method3510(local7);
		} else if (arg4 != null) {
			local7.aClass2_Sub2_Sub1_Sub1_2 = arg4;
			local7.anInt6022 = (arg2 + arg4.method5425()) * 128;
			local7.anInt6026 = (arg1 + arg4.method5425()) * 128;
			local7.anInt6030 = Static225.method3867(arg4);
			local7.anInt6028 = arg4.anInt730 * 128;
			local7.anInt6021 = arg4.anInt725;
			Static124.aClass198_23.method5267((long) arg4.anInt6535, local7);
			return;
		}
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(BILclient!c;I)V")
	public static void method1014(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub2_Sub1_Sub1 arg1, @OriginalArg(3) int arg2) {
		@Pc(20) int local20;
		if ((arg0 & 0x800) != 0) {
			local20 = Static200.aClass4_Sub7_Sub1_2.method2394();
			arg1.anInt6511 = Static200.aClass4_Sub7_Sub1_2.method2417();
			arg1.anInt6495 = Static200.aClass4_Sub7_Sub1_2.method2374();
			arg1.aBoolean566 = (local20 & 0x8000) != 0;
			arg1.anInt6502 = local20 & 0x7FFF;
			arg1.anInt6507 = arg1.anInt6511 + arg1.anInt6502 + Static342.anInt6706;
		}
		@Pc(75) int local75;
		if ((arg0 & 0x1) != 0) {
			local20 = Static200.aClass4_Sub7_Sub1_2.method2413();
			local75 = Static200.aClass4_Sub7_Sub1_2.method2380();
			arg1.method5424(local75, Static342.anInt6706, local20);
			arg1.anInt6488 = Static342.anInt6706 + 300;
			arg1.anInt6496 = Static200.aClass4_Sub7_Sub1_2.method2361();
		}
		if ((arg0 & 0x80) != 0) {
			arg1.anInt6539 = Static200.aClass4_Sub7_Sub1_2.method2404();
			arg1.anInt6478 = Static200.aClass4_Sub7_Sub1_2.method2364();
		}
		if ((arg0 & 0x100) != 0) {
			local20 = Static200.aClass4_Sub7_Sub1_2.method2413();
			local75 = Static200.aClass4_Sub7_Sub1_2.method2374();
			arg1.method5424(local75, Static342.anInt6706, local20);
		}
		@Pc(304) int local304;
		@Pc(222) int local222;
		if ((arg0 & 0x1000) != 0) {
			local20 = Static200.aClass4_Sub7_Sub1_2.method2364();
			if (local20 == 65535) {
				local20 = -1;
			}
			local75 = Static200.aClass4_Sub7_Sub1_2.method2378();
			@Pc(149) boolean local149 = true;
			@Pc(219) Class116 local219;
			if (local20 != -1 && arg1.anInt6482 != -1) {
				@Pc(165) Class156 local165;
				if (local20 == arg1.anInt6482) {
					local165 = Static244.method4224(local20);
					if (local165.aBoolean432 && local165.anInt5127 != -1) {
						local219 = Static340.method5560(local165.anInt5127);
						local222 = local219.anInt3739;
						if (local222 == 0) {
							local149 = false;
						} else if (local222 == 1) {
							local149 = true;
						} else if (local222 == 2) {
							local149 = false;
							arg1.anInt6505 = 0;
						}
					}
				} else {
					local165 = Static244.method4224(local20);
					@Pc(170) Class156 local170 = Static244.method4224(arg1.anInt6482);
					if (local165.anInt5127 != -1 && local170.anInt5127 != -1) {
						@Pc(183) Class116 local183 = Static340.method5560(local165.anInt5127);
						@Pc(188) Class116 local188 = Static340.method5560(local170.anInt5127);
						if (local188.anInt3749 > local183.anInt3749) {
							local149 = false;
						}
					}
				}
			}
			if (local149) {
				arg1.anInt6521 = (local75 & 0xFFFF) + Static342.anInt6706;
				arg1.anInt6525 = 0;
				arg1.anInt6482 = local20;
				arg1.anInt6512 = 1;
				arg1.anInt6531 = local75 >> 16;
				arg1.anInt6492 = 0;
				if (Static342.anInt6706 < arg1.anInt6521) {
					arg1.anInt6492 = -1;
				}
				if (arg1.anInt6482 != -1 && arg1.anInt6521 == Static342.anInt6706) {
					local304 = Static244.method4224(arg1.anInt6482).anInt5127;
					if (local304 != -1) {
						local219 = Static340.method5560(local304);
						if (local219 != null && local219.anIntArray330 != null) {
							Static291.method4975(Static110.aClass2_Sub2_Sub1_Sub1_1 == arg1, local219, 0, arg1.anInt6465, arg1.anInt6466);
						}
					}
				}
			}
		}
		if ((arg0 & 0x4) != 0) {
			local20 = Static200.aClass4_Sub7_Sub1_2.method2364();
			if (local20 == 65535) {
				local20 = -1;
			}
			local75 = Static200.aClass4_Sub7_Sub1_2.method2380();
			Static241.method4164(arg1, local20, local75);
		}
		if ((arg0 & 0x20) != 0) {
			arg1.anInt6479 = Static200.aClass4_Sub7_Sub1_2.method2394();
			if (arg1.anInt6479 == 65535) {
				arg1.anInt6479 = -1;
			}
		}
		if ((arg0 & 0x200) != 0) {
			arg1.anInt6475 = Static200.aClass4_Sub7_Sub1_2.method2417();
			arg1.anInt6529 = Static200.aClass4_Sub7_Sub1_2.method2417();
			arg1.anInt6481 = Static200.aClass4_Sub7_Sub1_2.method2374();
			arg1.anInt6486 = Static200.aClass4_Sub7_Sub1_2.method2374();
			arg1.anInt6484 = Static200.aClass4_Sub7_Sub1_2.method2404() + Static342.anInt6706;
			arg1.anInt6491 = Static200.aClass4_Sub7_Sub1_2.method2364() + Static342.anInt6706;
			arg1.anInt6519 = Static200.aClass4_Sub7_Sub1_2.method2374();
			arg1.anInt6551 = 0;
			arg1.anInt6547 = 1;
		}
		if ((arg0 & 0x2) != 0) {
			local20 = Static200.aClass4_Sub7_Sub1_2.method2374();
			@Pc(447) byte[] local447 = new byte[local20];
			@Pc(452) Class4_Sub7 local452 = new Class4_Sub7(local447);
			Static200.aClass4_Sub7_Sub1_2.method2403(local447, local20);
			Static349.aClass4_Sub7Array1[arg2] = local452;
			arg1.method653(local452);
		}
		if ((arg0 & 0x400) != 0) {
			local20 = Static200.aClass4_Sub7_Sub1_2.method2374();
			@Pc(484) int[] local484 = new int[local20];
			@Pc(487) int[] local487 = new int[local20];
			@Pc(490) int[] local490 = new int[local20];
			for (@Pc(492) int local492 = 0; local492 < local20; local492++) {
				local222 = Static200.aClass4_Sub7_Sub1_2.method2364();
				if (local222 == 65535) {
					local222 = -1;
				}
				local484[local492] = local222;
				local487[local492] = Static200.aClass4_Sub7_Sub1_2.method2417();
				local490[local492] = Static200.aClass4_Sub7_Sub1_2.method2394();
			}
			Static98.method5509(local487, local490, local484, arg1);
		}
		if ((arg0 & 0x10) != 0) {
			local20 = Static200.aClass4_Sub7_Sub1_2.method2364();
			local75 = Static200.aClass4_Sub7_Sub1_2.method2374();
			@Pc(551) int local551 = Static200.aClass4_Sub7_Sub1_2.method2380();
			local304 = Static200.aClass4_Sub7_Sub1_2.anInt2667;
			@Pc(565) boolean local565 = (local20 & 0x8000) != 0;
			if (arg1.aString22 != null && arg1.aClass148_4 != null) {
				@Pc(573) boolean local573 = false;
				if (local75 <= 1) {
					if (!local565 && (Static289.aBoolean516 && !Static248.aBoolean439 || Static337.aBoolean514)) {
						local573 = true;
					} else if (Static83.method1465(arg1.aString22)) {
						local573 = true;
					}
				}
				if (!local573 && Static113.anInt6467 == 0) {
					Static213.aClass4_Sub7_5.anInt2667 = 0;
					Static200.aClass4_Sub7_Sub1_2.method2381(Static213.aClass4_Sub7_5.aByteArray42, local551);
					Static213.aClass4_Sub7_5.anInt2667 = 0;
					@Pc(614) int local614 = -1;
					@Pc(637) String local637;
					if (local565) {
						local20 &= 0x7FFF;
						@Pc(626) Class179 local626 = Static123.method2464(Static213.aClass4_Sub7_5);
						local614 = local626.anInt5624;
						local637 = local626.aClass4_Sub1_Sub10_1.method2625(Static213.aClass4_Sub7_5);
					} else {
						local637 = Static150.method5471(Static82.method1449(Static194.method3529(Static213.aClass4_Sub7_5)));
					}
					arg1.aString243 = local637.trim();
					arg1.anInt6538 = local20 & 0xFF;
					arg1.anInt6497 = 150;
					arg1.anInt6506 = local20 >> 8;
					@Pc(678) int local678;
					if (local75 == 1 || local75 == 2) {
						local678 = local565 ? 17 : 1;
					} else {
						local678 = local565 ? 17 : 2;
					}
					if (local75 == 2) {
						Static107.method5706("<img=1>" + arg1.method652(), local637, 0, local678, "<img=1>" + arg1.method656(), local614, null);
					} else if (local75 == 1) {
						Static107.method5706("<img=0>" + arg1.method652(), local637, 0, local678, "<img=0>" + arg1.method656(), local614, null);
					} else {
						Static107.method5706(arg1.method652(), local637, 0, local678, arg1.method656(), local614, null);
					}
				}
			}
			Static200.aClass4_Sub7_Sub1_2.anInt2667 = local304 + local551;
		}
		if ((arg0 & 0x40) == 0) {
			return;
		}
		arg1.aString243 = Static200.aClass4_Sub7_Sub1_2.method2379();
		if (arg1.aString243.charAt(0) == '~') {
			arg1.aString243 = arg1.aString243.substring(1);
			Static5.method214(2, 0, arg1.aString243, arg1.method656(), arg1.method652());
		} else if (arg1 == Static110.aClass2_Sub2_Sub1_Sub1_1) {
			Static5.method214(2, 0, arg1.aString243, arg1.method656(), arg1.method652());
		}
		arg1.anInt6538 = 0;
		arg1.anInt6506 = 0;
		arg1.anInt6497 = 150;
	}
}
