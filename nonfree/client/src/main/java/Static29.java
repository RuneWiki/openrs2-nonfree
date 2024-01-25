import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static29 {

	@OriginalMember(owner = "client!bn", name = "b", descriptor = "[I")
	public static int[] anIntArray38;

	@OriginalMember(owner = "client!bn", name = "d", descriptor = "I")
	public static int anInt728 = -1;

	@OriginalMember(owner = "client!bn", name = "h", descriptor = "I")
	public static int anInt732 = 0;

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(IIIZI)V")
	public static void method588(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg0;
		@Pc(12) int local12 = -arg0;
		@Pc(14) int local14 = -1;
		@Pc(23) int local23 = Static312.method5334(Static19.anInt533, Static4.anInt75, arg1 + arg0);
		@Pc(32) int local32 = Static312.method5334(Static19.anInt533, Static4.anInt75, arg1 - arg0);
		Static162.method1731(local23, Static196.anIntArrayArray37[arg3], local32, arg2);
		while (local7 < local9) {
			local14 += 2;
			local12 += local14;
			@Pc(60) int local60;
			@Pc(64) int local64;
			@Pc(87) int local87;
			@Pc(95) int local95;
			if (local12 > 0) {
				local9--;
				local12 -= local9 << 1;
				local60 = arg3 - local9;
				local64 = local9 + arg3;
				if (local64 >= Static236.anInt4721 && Static73.anInt1425 >= local60) {
					local87 = Static312.method5334(Static19.anInt533, Static4.anInt75, arg1 + local7);
					local95 = Static312.method5334(Static19.anInt533, Static4.anInt75, arg1 - local7);
					if (Static73.anInt1425 >= local64) {
						Static162.method1731(local87, Static196.anIntArrayArray37[local64], local95, arg2);
					}
					if (local60 >= Static236.anInt4721) {
						Static162.method1731(local87, Static196.anIntArrayArray37[local60], local95, arg2);
					}
				}
			}
			local7++;
			local60 = arg3 - local7;
			local64 = local7 + arg3;
			if (Static236.anInt4721 <= local64 && Static73.anInt1425 >= local60) {
				local87 = Static312.method5334(Static19.anInt533, Static4.anInt75, local9 + arg1);
				local95 = Static312.method5334(Static19.anInt533, Static4.anInt75, arg1 - local9);
				if (Static73.anInt1425 >= local64) {
					Static162.method1731(local87, Static196.anIntArrayArray37[local64], local95, arg2);
				}
				if (Static236.anInt4721 <= local60) {
					Static162.method1731(local87, Static196.anIntArrayArray37[local60], local95, arg2);
				}
			}
		}
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(IIII)I")
	public static int method589(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg2 & 0x3;
		if (local7 == 0) {
			return arg1;
		} else if (local7 == 1) {
			return arg0;
		} else if (local7 == 2) {
			return 7 - arg1;
		} else {
			return 7 - arg0;
		}
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(BIIIIII)V")
	public static void method590(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(10) int local10 = arg4 - arg0;
		@Pc(15) int local15 = arg3 + arg0;
		for (@Pc(17) int local17 = arg3; local17 < local15; local17++) {
			Static162.method1731(arg2, Static196.anIntArrayArray37[local17], arg1, arg5);
		}
		@Pc(40) int local40 = arg2 - arg0;
		@Pc(44) int local44 = arg1 + arg0;
		for (@Pc(46) int local46 = arg4; local46 > local10; local46--) {
			Static162.method1731(arg2, Static196.anIntArrayArray37[local46], arg1, arg5);
		}
		for (@Pc(66) int local66 = local15; local66 <= local10; local66++) {
			@Pc(72) int[] local72 = Static196.anIntArrayArray37[local66];
			Static162.method1731(local44, local72, arg1, arg5);
			Static162.method1731(arg2, local72, local40, arg5);
		}
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(Lclient!p;I)V")
	public static void method592(@OriginalArg(0) Class8_Sub6 arg0) {
		arg0.aClass5_Sub4_Sub4_1 = null;
		if (Static167.anInt3453 < 20) {
			Static69.aClass65_4.method1458(arg0);
			Static167.anInt3453++;
		}
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(BIILclient!kg;)V")
	public static void method593(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class5_Sub4_Sub4_Sub1 arg2) {
		@Pc(9) int local9;
		@Pc(13) int local13;
		@Pc(20) int local20;
		if ((arg1 & 0x8) != 0) {
			local9 = Static20.aClass3_Sub4_Sub2_1.method3675();
			local13 = Static20.aClass3_Sub4_Sub2_1.method3617();
			@Pc(17) int local17 = Static20.aClass3_Sub4_Sub2_1.method3617();
			local20 = Static20.aClass3_Sub4_Sub2_1.anInt4268;
			@Pc(31) boolean local31 = (local9 & 0x8000) != 0;
			if (arg2.aString126 != null && arg2.aClass174_1 != null) {
				@Pc(39) boolean local39 = false;
				if (local13 <= 1) {
					if (!local31 && (Static284.aBoolean376 && !Static161.aBoolean170 || Static160.aBoolean168)) {
						local39 = true;
					} else if (Static323.method5295(arg2.aString126)) {
						local39 = true;
					}
				}
				if (!local39 && Static172.anInt3608 == 0) {
					Static226.aClass3_Sub4_4.anInt4268 = 0;
					Static20.aClass3_Sub4_Sub2_1.method3651(local17, Static226.aClass3_Sub4_4.aByteArray70);
					Static226.aClass3_Sub4_4.anInt4268 = 0;
					@Pc(80) int local80 = -1;
					@Pc(99) String local99;
					if (local31) {
						local9 &= 0x7FFF;
						@Pc(90) Class21 local90 = Static72.method1112(Static226.aClass3_Sub4_4);
						local80 = local90.anInt580;
						local99 = local90.aClass3_Sub7_Sub9_1.method2266(Static226.aClass3_Sub4_4);
					} else {
						local99 = Static339.method4906(Static237.method4025(Static340.method5564(Static226.aClass3_Sub4_4)));
					}
					arg2.aString180 = local99.trim();
					arg2.anInt4939 = local9 & 0xFF;
					arg2.anInt4900 = 150;
					arg2.anInt4913 = local9 >> 8;
					@Pc(140) int local140;
					if (local13 == 1 || local13 == 2) {
						local140 = local31 ? 17 : 1;
					} else {
						local140 = local31 ? 17 : 2;
					}
					if (local13 == 2) {
						Static232.method3992(null, local99, "<img=1>" + arg2.method2677(), local80, local140, 0, "<img=1>" + arg2.method2680());
					} else if (local13 == 1) {
						Static232.method3992(null, local99, "<img=0>" + arg2.method2677(), local80, local140, 0, "<img=0>" + arg2.method2680());
					} else {
						Static232.method3992(null, local99, arg2.method2677(), local80, local140, 0, arg2.method2680());
					}
				}
			}
			Static20.aClass3_Sub4_Sub2_1.anInt4268 = local17 + local20;
		}
		if ((arg1 & 0x200) != 0) {
			local9 = Static20.aClass3_Sub4_Sub2_1.method3633();
			local13 = Static20.aClass3_Sub4_Sub2_1.method3643();
			arg2.method4207(local13, Static51.anInt1101, local9);
		}
		if ((arg1 & 0x10) != 0) {
			arg2.anInt4942 = Static20.aClass3_Sub4_Sub2_1.method3640();
			if (arg2.anInt4942 == 65535) {
				arg2.anInt4942 = -1;
			}
		}
		@Pc(299) int local299;
		if ((arg1 & 0x1000) != 0) {
			local9 = Static20.aClass3_Sub4_Sub2_1.method3643();
			@Pc(285) int[] local285 = new int[local9];
			@Pc(288) int[] local288 = new int[local9];
			@Pc(291) int[] local291 = new int[local9];
			for (@Pc(293) int local293 = 0; local293 < local9; local293++) {
				local299 = Static20.aClass3_Sub4_Sub2_1.method3640();
				if (local299 == 65535) {
					local299 = -1;
				}
				local285[local293] = local299;
				local288[local293] = Static20.aClass3_Sub4_Sub2_1.method3648();
				local291[local293] = Static20.aClass3_Sub4_Sub2_1.method3675();
			}
			Static186.method2537(local291, arg2, local288, local285);
		}
		if ((arg1 & 0x1) != 0) {
			local9 = Static20.aClass3_Sub4_Sub2_1.method3672();
			@Pc(352) byte[] local352 = new byte[local9];
			@Pc(357) Class3_Sub4 local357 = new Class3_Sub4(local352);
			Static20.aClass3_Sub4_Sub2_1.method3651(local9, local352);
			Static109.aClass3_Sub4Array1[arg0] = local357;
			arg2.method2678(local357);
		}
		if ((arg1 & 0x800) != 0) {
			local9 = Static20.aClass3_Sub4_Sub2_1.method3675();
			if (local9 == 65535) {
				local9 = -1;
			}
			local13 = Static20.aClass3_Sub4_Sub2_1.method3623();
			@Pc(395) boolean local395 = true;
			@Pc(461) Class131 local461;
			if (local9 != -1 && arg2.anInt4910 != -1) {
				@Pc(411) Class2 local411;
				if (arg2.anInt4910 == local9) {
					local411 = Static155.method1566(local9);
					if (local411.aBoolean5 && local411.anInt22 != -1) {
						local461 = Static343.method5604(local411.anInt22);
						local299 = local461.anInt3986;
						if (local299 == 0) {
							local395 = false;
						} else if (local299 == 1) {
							local395 = true;
						} else if (local299 == 2) {
							local395 = false;
							arg2.anInt4937 = 0;
						}
					}
				} else {
					local411 = Static155.method1566(local9);
					@Pc(416) Class2 local416 = Static155.method1566(arg2.anInt4910);
					if (local411.anInt22 != -1 && local416.anInt22 != -1) {
						@Pc(431) Class131 local431 = Static343.method5604(local411.anInt22);
						@Pc(436) Class131 local436 = Static343.method5604(local416.anInt22);
						if (local431.anInt3993 < local436.anInt3993) {
							local395 = false;
						}
					}
				}
			}
			if (local395) {
				arg2.anInt4910 = local9;
				arg2.anInt4906 = local13 >> 16;
				arg2.anInt4891 = 0;
				arg2.anInt4930 = 1;
				arg2.anInt4926 = Static51.anInt1101 + (local13 & 0xFFFF);
				arg2.anInt4887 = 0;
				if (arg2.anInt4926 > Static51.anInt1101) {
					arg2.anInt4887 = -1;
				}
				if (arg2.anInt4910 != -1 && Static51.anInt1101 == arg2.anInt4926) {
					local20 = Static155.method1566(arg2.anInt4910).anInt22;
					if (local20 != -1) {
						local461 = Static343.method5604(local20);
						if (local461 != null && local461.anIntArray335 != null) {
							Static161.method2570(0, arg2 == Static349.aClass5_Sub4_Sub4_Sub1_2, arg2.anInt5905, local461, arg2.anInt5901);
						}
					}
				}
			}
		}
		if ((arg1 & 0x2) != 0) {
			arg2.anInt4904 = Static20.aClass3_Sub4_Sub2_1.method3640();
			arg2.anInt4882 = Static20.aClass3_Sub4_Sub2_1.method3638();
		}
		if ((arg1 & 0x40) != 0) {
			local9 = Static20.aClass3_Sub4_Sub2_1.method3675();
			if (local9 == 65535) {
				local9 = -1;
			}
			local13 = Static20.aClass3_Sub4_Sub2_1.method3648();
			Static140.method2288(local13, arg2, local9);
		}
		if ((arg1 & 0x20) != 0) {
			arg2.aString180 = Static20.aClass3_Sub4_Sub2_1.method3671();
			if (arg2.aString180.charAt(0) == '~') {
				arg2.aString180 = arg2.aString180.substring(1);
				Static306.method5148(0, 2, arg2.aString180, arg2.method2677(), arg2.method2680());
			} else if (Static349.aClass5_Sub4_Sub4_Sub1_2 == arg2) {
				Static306.method5148(0, 2, arg2.aString180, arg2.method2677(), arg2.method2680());
			}
			arg2.anInt4939 = 0;
			arg2.anInt4900 = 150;
			arg2.anInt4913 = 0;
		}
		if ((arg1 & 0x80) != 0) {
			local9 = Static20.aClass3_Sub4_Sub2_1.method3633();
			local13 = Static20.aClass3_Sub4_Sub2_1.method3648();
			arg2.method4207(local13, Static51.anInt1101, local9);
			arg2.anInt4938 = Static51.anInt1101 + 300;
			arg2.anInt4945 = Static20.aClass3_Sub4_Sub2_1.method3643();
		}
		if ((arg1 & 0x400) != 0) {
			local9 = Static20.aClass3_Sub4_Sub2_1.method3640();
			arg2.anInt4894 = Static20.aClass3_Sub4_Sub2_1.method3672();
			arg2.anInt4886 = Static20.aClass3_Sub4_Sub2_1.method3643();
			arg2.anInt4909 = local9 & 0x7FFF;
			arg2.aBoolean283 = (local9 & 0x8000) != 0;
			arg2.anInt4940 = arg2.anInt4894 + arg2.anInt4909 + Static51.anInt1101;
		}
		if ((arg1 & 0x100) == 0) {
			return;
		}
		arg2.anInt4905 = Static20.aClass3_Sub4_Sub2_1.method3617();
		arg2.anInt4943 = Static20.aClass3_Sub4_Sub2_1.method3643();
		arg2.anInt4920 = Static20.aClass3_Sub4_Sub2_1.method3648();
		arg2.anInt4924 = Static20.aClass3_Sub4_Sub2_1.method3643();
		arg2.anInt4936 = Static20.aClass3_Sub4_Sub2_1.method3640() + Static51.anInt1101;
		arg2.anInt4889 = Static20.aClass3_Sub4_Sub2_1.method3640() + Static51.anInt1101;
		arg2.anInt4916 = Static20.aClass3_Sub4_Sub2_1.method3643();
		arg2.anInt4958 = 1;
		arg2.anInt4954 = 0;
	}
}
