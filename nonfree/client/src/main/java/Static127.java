import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static127 {

	@OriginalMember(owner = "client!vf", name = "d", descriptor = "Lclient!c;")
	public static Class10 aClass10_15;

	@OriginalMember(owner = "client!vf", name = "f", descriptor = "Lclient!t;")
	public static Class10_Sub1 aClass10_Sub1_8;

	@OriginalMember(owner = "client!vf", name = "j", descriptor = "Lclient!ke;")
	public static Class43 aClass43_3;

	@OriginalMember(owner = "client!vf", name = "c", descriptor = "Lclient!od;")
	private static Class60 aClass60_420 = Static41.method597("To create a new account you need to");

	@OriginalMember(owner = "client!vf", name = "g", descriptor = "I")
	public static int anInt1133 = 0;

	@OriginalMember(owner = "client!vf", name = "m", descriptor = "Lclient!od;")
	public static Class60 aClass60_421 = aClass60_420;

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(BLclient!be;II)V")
	public static void method630(@OriginalArg(1) Class4_Sub3_Sub1_Sub2_Sub1 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) int local16;
		@Pc(20) int local20;
		if ((arg2 & 0x4) != 0) {
			local16 = Static96.aClass4_Sub9_Sub1_2.method816();
			local20 = Static96.aClass4_Sub9_Sub1_2.method795();
			@Pc(24) int local24 = Static96.aClass4_Sub9_Sub1_2.method795();
			@Pc(27) int local27 = Static96.aClass4_Sub9_Sub1_2.anInt1312;
			if (arg0.aClass60_139 != null && arg0.aClass49_1 != null) {
				@Pc(38) long local38 = arg0.aClass60_139.method1325();
				@Pc(40) boolean local40 = false;
				if (local20 <= 1) {
					for (@Pc(47) int local47 = 0; local47 < Static59.anInt1560; local47++) {
						if (local38 == Static26.aLongArray3[local47]) {
							local40 = true;
							break;
						}
					}
				}
				if (!local40 && Static109.anInt2594 == 0) {
					Static71.aClass4_Sub9_3.anInt1312 = 0;
					Static96.aClass4_Sub9_Sub1_2.method821(Static71.aClass4_Sub9_3.aByteArray6, local24);
					Static71.aClass4_Sub9_3.anInt1312 = 0;
					@Pc(94) Class60 local94 = Static93.method1199(Static9.method123(Static71.aClass4_Sub9_3).method1337());
					arg0.aClass60_506 = local94.method1334();
					arg0.anInt1393 = 150;
					arg0.anInt1444 = local16 & 0xFF;
					arg0.anInt1430 = local16 >> 8;
					if (local20 == 2 || local20 == 3) {
						Static90.method1469(1, Static12.method1761(new Class60[] { Static103.aClass60_963, arg0.aClass60_139 }), local94);
					} else if (local20 == 1) {
						Static90.method1469(1, Static12.method1761(new Class60[] { Static7.aClass60_51, arg0.aClass60_139 }), local94);
					} else {
						Static90.method1469(2, arg0.aClass60_139, local94);
					}
				}
			}
			Static96.aClass4_Sub9_Sub1_2.anInt1312 = local24 + local27;
		}
		if ((arg2 & 0x200) != 0) {
			arg0.anInt1400 = Static96.aClass4_Sub9_Sub1_2.method798();
			arg0.anInt1404 = Static96.aClass4_Sub9_Sub1_2.method773();
			arg0.anInt1427 = Static96.aClass4_Sub9_Sub1_2.method798();
			arg0.anInt1417 = Static96.aClass4_Sub9_Sub1_2.method798();
			arg0.anInt1425 = Static96.aClass4_Sub9_Sub1_2.method802() + Static118.anInt2741;
			arg0.anInt1446 = Static96.aClass4_Sub9_Sub1_2.method816() + Static118.anInt2741;
			arg0.anInt1441 = Static96.aClass4_Sub9_Sub1_2.method773();
			arg0.anInt1433 = 1;
			arg0.anInt1396 = 0;
		}
		if ((arg2 & 0x20) != 0) {
			local16 = Static96.aClass4_Sub9_Sub1_2.method773();
			@Pc(233) byte[] local233 = new byte[local16];
			@Pc(238) Class4_Sub9 local238 = new Class4_Sub9(local233);
			Static96.aClass4_Sub9_Sub1_2.method790(local16, local233);
			Static65.aClass4_Sub9Array1[arg1] = local238;
			arg0.method218(local238);
		}
		if ((arg2 & 0x400) != 0) {
			arg0.anInt1416 = Static96.aClass4_Sub9_Sub1_2.method771();
			local16 = Static96.aClass4_Sub9_Sub1_2.method813();
			arg0.anInt1432 = local16 >> 16;
			arg0.anInt1436 = (local16 & 0xFFFF) + Static118.anInt2741;
			arg0.anInt1420 = 0;
			arg0.anInt1431 = 0;
			if (Static118.anInt2741 < arg0.anInt1436) {
				arg0.anInt1431 = -1;
			}
			if (arg0.anInt1416 == 65535) {
				arg0.anInt1416 = -1;
			}
		}
		if ((arg2 & 0x100) != 0) {
			local16 = Static96.aClass4_Sub9_Sub1_2.method798();
			local20 = Static96.aClass4_Sub9_Sub1_2.method773();
			arg0.method854(Static118.anInt2741, local20, local16);
			arg0.anInt1392 = Static118.anInt2741 + 300;
			arg0.anInt1412 = Static96.aClass4_Sub9_Sub1_2.method795();
			arg0.anInt1443 = Static96.aClass4_Sub9_Sub1_2.method798();
		}
		if ((arg2 & 0x80) != 0) {
			arg0.aClass60_506 = Static96.aClass4_Sub9_Sub1_2.method776();
			if (arg0.aClass60_506.method1338(0) == 126) {
				arg0.aClass60_506 = arg0.aClass60_506.method1315(1);
				Static90.method1469(2, arg0.aClass60_139, arg0.aClass60_506);
			} else if (Static65.aClass4_Sub3_Sub1_Sub2_Sub1_1 == arg0) {
				Static90.method1469(2, arg0.aClass60_139, arg0.aClass60_506);
			}
			arg0.anInt1444 = 0;
			arg0.anInt1430 = 0;
			arg0.anInt1393 = 150;
		}
		if ((arg2 & 0x1) != 0) {
			arg0.anInt1382 = Static96.aClass4_Sub9_Sub1_2.method816();
			arg0.anInt1413 = Static96.aClass4_Sub9_Sub1_2.method771();
		}
		if ((arg2 & 0x10) != 0) {
			local16 = Static96.aClass4_Sub9_Sub1_2.method798();
			local20 = Static96.aClass4_Sub9_Sub1_2.method773();
			arg0.method854(Static118.anInt2741, local20, local16);
			arg0.anInt1392 = Static118.anInt2741 + 300;
			arg0.anInt1412 = Static96.aClass4_Sub9_Sub1_2.method773();
			arg0.anInt1443 = Static96.aClass4_Sub9_Sub1_2.method773();
		}
		if ((arg2 & 0x8) != 0) {
			arg0.anInt1438 = Static96.aClass4_Sub9_Sub1_2.method771();
			if (arg0.anInt1438 == 65535) {
				arg0.anInt1438 = -1;
			}
		}
		if ((arg2 & 0x40) == 0) {
			return;
		}
		local16 = Static96.aClass4_Sub9_Sub1_2.method771();
		local20 = Static96.aClass4_Sub9_Sub1_2.method795();
		if (local16 == 65535) {
			local16 = -1;
		}
		Static83.method1336(local16, local20, arg0);
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(II)Lclient!sf;")
	public static Class4_Sub3_Sub14 method631(@OriginalArg(1) int arg0) {
		@Pc(10) Class4_Sub3_Sub14 local10 = (Class4_Sub3_Sub14) Static128.aClass12_28.method289((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(29) byte[] local29 = Static105.aClass10_27.method1774(4, arg0);
		local10 = new Class4_Sub3_Sub14();
		if (local29 != null) {
			local10.method1759(arg0, new Class4_Sub9(local29));
		}
		local10.method1756();
		Static128.aClass12_28.method290(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(Z)V")
	public static void method633() {
		aClass60_421 = null;
		aClass43_3 = null;
		aClass10_Sub1_8 = null;
		aClass60_420 = null;
		aClass10_15 = null;
	}

	@OriginalMember(owner = "client!vf", name = "b", descriptor = "(II)I")
	public static int method634(@OriginalArg(1) int arg0) {
		@Pc(9) int local9 = (arg0 & 0x55555555) + ((arg0 & 0xAAAAAAAB) >>> 1);
		@Pc(24) int local24 = (local9 & 0x33333333) + ((local9 & 0xCCCCCCCF) >>> 2);
		@Pc(32) int local32 = local24 + (local24 >>> 4) & 0xF0F0F0F;
		@Pc(46) int local46 = local32 + (local32 >>> 8);
		@Pc(52) int local52 = local46 + (local46 >>> 16);
		return local52 & 0xFF;
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(I)V")
	public static void method636() {
		@Pc(13) Object local13 = Static72.anObject4;
		synchronized (Static72.anObject4) {
			if (Static32.anInt941 != 0) {
				Static32.anInt941 = 1;
				try {
					Static72.anObject4.wait();
				} catch (@Pc(23) InterruptedException local23) {
				}
			}
		}
	}

	@OriginalMember(owner = "client!vf", name = "c", descriptor = "(II)Lclient!od;")
	public static Class60 method637(@OriginalArg(0) int arg0) {
		return Static12.method1761(new Class60[] { Static65.method1051(arg0 >> 24 & 0xFF), Static15.aClass60_1033, Static65.method1051(arg0 >> 16 & 0xFF), Static15.aClass60_1033, Static65.method1051(arg0 >> 8 & 0xFF), Static15.aClass60_1033, Static65.method1051(arg0 & 0xFF) });
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIIII)V")
	public static void method638(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(10) Class4_Sub24 local10 = (Class4_Sub24) Static16.aClass45_2.method982(); local10 != null; local10 = (Class4_Sub24) Static16.aClass45_2.method986()) {
			if (local10.anInt2946 != -1 || local10.anIntArray346 != null) {
				@Pc(22) int local22 = 0;
				if (arg3 > local10.anInt2945) {
					local22 = arg3 - local10.anInt2945;
				} else if (local10.anInt2937 > arg3) {
					local22 = local10.anInt2937 - arg3;
				}
				if (arg2 > local10.anInt2947) {
					local22 += arg2 - local10.anInt2947;
				} else if (local10.anInt2938 > arg2) {
					local22 += local10.anInt2938 - arg2;
				}
				if (local22 - 64 > local10.anInt2940 || Static120.anInt2754 == 0 || arg0 != local10.anInt2943) {
					if (local10.aClass4_Sub1_Sub2_2 != null) {
						Static109.aClass4_Sub1_Sub3_1.method972(local10.aClass4_Sub1_Sub2_2);
						local10.aClass4_Sub1_Sub2_2 = null;
					}
					if (local10.aClass4_Sub1_Sub2_3 != null) {
						Static109.aClass4_Sub1_Sub3_1.method972(local10.aClass4_Sub1_Sub2_3);
						local10.aClass4_Sub1_Sub2_3 = null;
					}
				} else {
					local22 -= 64;
					if (local22 < 0) {
						local22 = 0;
					}
					@Pc(130) int local130 = (local10.anInt2940 - local22) * Static120.anInt2754 / local10.anInt2940;
					if (local10.aClass4_Sub1_Sub2_2 != null) {
						local10.aClass4_Sub1_Sub2_2.method938(local130);
					} else if (local10.anInt2946 >= 0) {
						@Pc(145) Class9 local145 = Static135.method224(Static116.aClass10_Sub1_19, local10.anInt2946, 0);
						if (local145 != null) {
							@Pc(152) Class4_Sub6_Sub1 local152 = local145.method225().method1638(Static40.aClass63_1);
							@Pc(157) Class4_Sub1_Sub2 local157 = Static137.method937(local152, local130);
							local157.method899(-1);
							Static109.aClass4_Sub1_Sub3_1.method967(local157);
							local10.aClass4_Sub1_Sub2_2 = local157;
						}
					}
					if (local10.aClass4_Sub1_Sub2_3 != null) {
						local10.aClass4_Sub1_Sub2_3.method938(local130);
						if (!local10.aClass4_Sub1_Sub2_3.method1992()) {
							local10.aClass4_Sub1_Sub2_3 = null;
						}
					} else if (local10.anIntArray346 != null && (local10.anInt2939 -= arg1) <= 0) {
						@Pc(211) int local211 = (int) ((double) local10.anIntArray346.length * Math.random());
						@Pc(219) Class9 local219 = Static135.method224(Static116.aClass10_Sub1_19, local10.anIntArray346[local211], 0);
						if (local219 != null) {
							@Pc(226) Class4_Sub6_Sub1 local226 = local219.method225().method1638(Static40.aClass63_1);
							@Pc(231) Class4_Sub1_Sub2 local231 = Static137.method937(local226, local130);
							local231.method899(0);
							Static109.aClass4_Sub1_Sub3_1.method967(local231);
							local10.anInt2939 = local10.anInt2941 + (int) (Math.random() * (double) (local10.anInt2949 - local10.anInt2941));
							local10.aClass4_Sub1_Sub2_3 = local231;
						}
					}
				}
			}
		}
	}
}
