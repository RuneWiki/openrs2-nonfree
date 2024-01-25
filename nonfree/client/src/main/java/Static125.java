import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static125 {

	@OriginalMember(owner = "client!hs", name = "I", descriptor = "Lclient!of;")
	public static Class40 aClass40_4;

	@OriginalMember(owner = "client!hs", name = "u", descriptor = "I")
	public static int anInt2322 = 0;

	@OriginalMember(owner = "client!hs", name = "v", descriptor = "[Z")
	public static final boolean[] aBooleanArray21 = new boolean[100];

	@OriginalMember(owner = "client!hs", name = "D", descriptor = "Z")
	public static boolean aBoolean198 = true;

	@OriginalMember(owner = "client!hs", name = "E", descriptor = "[I")
	public static final int[] anIntArray307 = new int[50];

	@OriginalMember(owner = "client!hs", name = "H", descriptor = "I")
	public static int anInt2331 = -1;

	@OriginalMember(owner = "client!hs", name = "K", descriptor = "Ljava/lang/String;")
	public static String aString93 = "Connection lost.";

	@OriginalMember(owner = "client!hs", name = "c", descriptor = "(II)V")
	public static void method2482(@OriginalArg(0) int arg0) {
		@Pc(8) Class6_Sub2_Sub8 local8 = Static239.method5786(11, arg0);
		local8.method2645();
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(Lclient!ja;ZI[Lclient!c;IIIIZI[BI)V")
	public static void method2483(@OriginalArg(0) Class81 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class27[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) boolean arg7, @OriginalArg(9) int arg8, @OriginalArg(10) byte[] arg9, @OriginalArg(11) int arg10) {
		@Pc(26) Class6_Sub10 local26 = new Class6_Sub10(arg9);
		@Pc(28) int local28 = -1;
		while (true) {
			@Pc(32) int local32 = local26.method4010();
			if (local32 == 0) {
				return;
			}
			local28 += local32;
			@Pc(43) int local43 = 0;
			while (true) {
				@Pc(47) int local47 = local26.method4017();
				if (local47 == 0) {
					break;
				}
				local43 += local47 - 1;
				@Pc(62) int local62 = local43 & 0x3F;
				@Pc(68) int local68 = local43 >> 6 & 0x3F;
				@Pc(72) int local72 = local43 >> 12;
				@Pc(76) int local76 = local26.method3972();
				@Pc(80) int local80 = local76 >> 2;
				@Pc(84) int local84 = local76 & 0x3;
				if (local72 == arg6 && arg1 <= local68 && local68 < arg1 + 8 && local62 >= arg5 && local62 < arg5 + 8) {
					@Pc(115) Class66 local115 = Static196.method3622(local28);
					@Pc(133) int local133 = arg4 + Static313.method5294(local62 & 0x7, local84, local68 & 0x7, arg10, local115.lb, local115.anInt1489);
					@Pc(150) int local150 = arg3 + Static87.method1482(local62 & 0x7, local115.anInt1489, local68 & 0x7, arg10, local115.lb, local84);
					if (local133 > 0 && local150 > 0 && local133 < Static153.anInt2883 - 1 && Static246.anInt4606 - 1 > local150) {
						@Pc(173) Class27 local173 = null;
						if (!arg7) {
							@Pc(177) int local177 = arg8;
							if ((Static265.aByteArrayArrayArray11[1][local133][local150] & 0x2) == 2) {
								local177 = arg8 - 1;
							}
							if (local177 >= 0) {
								local173 = arg2[local177];
							}
						}
						Static96.method1743(local28, local133, arg8, arg7, local150, arg8, -1, true, local80, local84 + arg10 & 0x3, arg0, local173);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(IIBLclient!qo;)V")
	public static void method2484(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class44_Sub4_Sub4_Sub1 arg2) {
		if ((arg0 & 0x40) != 0) {
			arg2.aString219 = Static142.aClass6_Sub10_Sub1_3.method4023();
			if (arg2.aString219.charAt(0) == '~') {
				arg2.aString219 = arg2.aString219.substring(1);
				Static247.method4080(2, arg2.method4480(), arg2.aString219, arg2.method4483(), 0);
			} else if (Static253.aClass44_Sub4_Sub4_Sub1_1 == arg2) {
				Static247.method4080(2, arg2.method4480(), arg2.aString219, arg2.method4483(), 0);
			}
			arg2.anInt5125 = 0;
			arg2.anInt5123 = 0;
			arg2.anInt5106 = 150;
		}
		if ((arg0 & 0x20) != 0) {
			arg2.anInt5135 = Static142.aClass6_Sub10_Sub1_3.method3995();
			arg2.anInt5110 = Static142.aClass6_Sub10_Sub1_3.method4021();
		}
		@Pc(101) int local101;
		@Pc(118) int local118;
		if ((arg0 & 0x200) != 0) {
			local101 = Static142.aClass6_Sub10_Sub1_3.method4011();
			@Pc(104) int[] local104 = new int[local101];
			@Pc(107) int[] local107 = new int[local101];
			@Pc(110) int[] local110 = new int[local101];
			for (@Pc(112) int local112 = 0; local112 < local101; local112++) {
				local118 = Static142.aClass6_Sub10_Sub1_3.method3989();
				if (local118 == 65535) {
					local118 = -1;
				}
				local104[local112] = local118;
				local107[local112] = Static142.aClass6_Sub10_Sub1_3.method3980();
				local110[local112] = Static142.aClass6_Sub10_Sub1_3.method3995();
			}
			Static346.method5708(arg2, local104, local107, local110);
		}
		if ((arg0 & 0x800) != 0) {
			arg2.anInt5109 = Static142.aClass6_Sub10_Sub1_3.method3977();
			arg2.anInt5097 = Static142.aClass6_Sub10_Sub1_3.method3977();
			arg2.anInt5102 = Static142.aClass6_Sub10_Sub1_3.method4011();
			arg2.anInt5087 = Static142.aClass6_Sub10_Sub1_3.method3980();
			arg2.anInt5084 = Static142.aClass6_Sub10_Sub1_3.method3995() + Static76.anInt2853;
			arg2.anInt5134 = Static142.aClass6_Sub10_Sub1_3.method3994() + Static76.anInt2853;
			arg2.anInt5143 = Static142.aClass6_Sub10_Sub1_3.method3980();
			arg2.anInt5156 = 1;
			arg2.anInt5158 = 0;
		}
		@Pc(225) int local225;
		if ((arg0 & 0x4) != 0) {
			local101 = Static142.aClass6_Sub10_Sub1_3.method4021();
			if (local101 == 65535) {
				local101 = -1;
			}
			local225 = Static142.aClass6_Sub10_Sub1_3.method3980();
			Static238.method4704(local101, local225, arg2);
		}
		if ((arg0 & 0x1000) != 0) {
			local101 = Static142.aClass6_Sub10_Sub1_3.method4017();
			local225 = Static142.aClass6_Sub10_Sub1_3.method3972();
			arg2.method4703(local225, Static76.anInt2853, local101);
		}
		if ((arg0 & 0x100) != 0) {
			local101 = Static142.aClass6_Sub10_Sub1_3.method3995();
			arg2.anInt5113 = Static142.aClass6_Sub10_Sub1_3.method3980();
			arg2.anInt5124 = Static142.aClass6_Sub10_Sub1_3.method3972();
			arg2.anInt5085 = local101 & 0x7FFF;
			arg2.aBoolean356 = (local101 & 0x8000) != 0;
			arg2.anInt5093 = arg2.anInt5085 + Static76.anInt2853 + arg2.anInt5113;
		}
		if ((arg0 & 0x1) != 0) {
			local101 = Static142.aClass6_Sub10_Sub1_3.method3977();
			@Pc(310) byte[] local310 = new byte[local101];
			@Pc(315) Class6_Sub10 local315 = new Class6_Sub10(local310);
			Static142.aClass6_Sub10_Sub1_3.method3974(local310, local101);
			Static132.aClass6_Sub10Array1[arg1] = local315;
			arg2.method4478(local315);
		}
		@Pc(353) int local353;
		if ((arg0 & 0x2) != 0) {
			local101 = Static142.aClass6_Sub10_Sub1_3.method4021();
			local225 = Static142.aClass6_Sub10_Sub1_3.method4011();
			@Pc(350) int local350 = Static142.aClass6_Sub10_Sub1_3.method3980();
			local353 = Static142.aClass6_Sub10_Sub1_3.anInt4188;
			@Pc(361) boolean local361 = (local101 & 0x8000) != 0;
			if (arg2.aString207 != null && arg2.aClass21_2 != null) {
				@Pc(369) boolean local369 = false;
				if (local225 <= 1) {
					if (!local361 && (Static78.aBoolean95 && !Static344.aBoolean415 || Static281.aBoolean368)) {
						local369 = true;
					} else if (Static137.method2628(arg2.aString207)) {
						local369 = true;
					}
				}
				if (!local369 && Static260.anInt4772 == 0) {
					Static305.aClass6_Sub10_7.anInt4188 = 0;
					Static142.aClass6_Sub10_Sub1_3.method3986(local350, Static305.aClass6_Sub10_7.aByteArray67);
					Static305.aClass6_Sub10_7.anInt4188 = 0;
					@Pc(410) int local410 = -1;
					@Pc(429) String local429;
					if (local361) {
						local101 &= 0x7FFF;
						@Pc(420) Class184 local420 = Static266.method4504(Static305.aClass6_Sub10_7);
						local410 = local420.anInt5404;
						local429 = local420.aClass6_Sub2_Sub7_1.method2150(Static305.aClass6_Sub10_7);
					} else {
						local429 = Static86.method1477(Static118.method2411(Static344.method5644(Static305.aClass6_Sub10_7)));
					}
					arg2.aString219 = local429.trim();
					arg2.anInt5123 = local101 >> 8;
					arg2.anInt5125 = local101 & 0xFF;
					arg2.anInt5106 = 150;
					@Pc(468) int local468;
					if (local225 == 1 || local225 == 2) {
						local468 = local361 ? 17 : 1;
					} else {
						local468 = local361 ? 17 : 2;
					}
					if (local225 == 2) {
						Static156.method5548(null, "<img=1>" + arg2.method4483(), local468, local410, 0, local429, "<img=1>" + arg2.method4480());
					} else if (local225 == 1) {
						Static156.method5548(null, "<img=0>" + arg2.method4483(), local468, local410, 0, local429, "<img=0>" + arg2.method4480());
					} else {
						Static156.method5548(null, arg2.method4483(), local468, local410, 0, local429, arg2.method4480());
					}
				}
			}
			Static142.aClass6_Sub10_Sub1_3.anInt4188 = local353 + local350;
		}
		if ((arg0 & 0x400) != 0) {
			local101 = Static142.aClass6_Sub10_Sub1_3.method4021();
			if (local101 == 65535) {
				local101 = -1;
			}
			local225 = Static142.aClass6_Sub10_Sub1_3.method3987();
			@Pc(586) boolean local586 = true;
			@Pc(650) Class24 local650;
			if (local101 != -1 && arg2.anInt5148 != -1) {
				@Pc(601) Class166 local601;
				if (local101 == arg2.anInt5148) {
					local601 = Static62.method999(local101);
					if (local601.aBoolean336 && local601.anInt4753 != -1) {
						local650 = Static209.method3737(local601.anInt4753);
						local118 = local650.anInt574;
						if (local118 == 0) {
							local586 = false;
						} else if (local118 == 1) {
							local586 = true;
						} else if (local118 == 2) {
							arg2.anInt5144 = 0;
							local586 = false;
						}
					}
				} else {
					local601 = Static62.method999(local101);
					@Pc(606) Class166 local606 = Static62.method999(arg2.anInt5148);
					if (local601.anInt4753 != -1 && local606.anInt4753 != -1) {
						@Pc(619) Class24 local619 = Static209.method3737(local601.anInt4753);
						@Pc(624) Class24 local624 = Static209.method3737(local606.anInt4753);
						if (local624.anInt588 > local619.anInt588) {
							local586 = false;
						}
					}
				}
			}
			if (local586) {
				arg2.anInt5139 = local225 >> 16;
				arg2.anInt5122 = 0;
				arg2.anInt5107 = 0;
				arg2.anInt5088 = (local225 & 0xFFFF) + Static76.anInt2853;
				arg2.anInt5147 = 1;
				arg2.anInt5148 = local101;
				if (Static76.anInt2853 < arg2.anInt5088) {
					arg2.anInt5107 = -1;
				}
				if (arg2.anInt5148 != -1 && Static76.anInt2853 == arg2.anInt5088) {
					local353 = Static62.method999(arg2.anInt5148).anInt4753;
					if (local353 != -1) {
						local650 = Static209.method3737(local353);
						if (local650 != null && local650.anIntArray64 != null) {
							Static203.method3667(0, arg2.anInt6339, local650, arg2.anInt6340, Static253.aClass44_Sub4_Sub4_Sub1_1 == arg2);
						}
					}
				}
			}
		}
		if ((arg0 & 0x10) != 0) {
			arg2.anInt5103 = Static142.aClass6_Sub10_Sub1_3.method3989();
			if (arg2.anInt5103 == 65535) {
				arg2.anInt5103 = -1;
			}
		}
		if ((arg0 & 0x8) == 0) {
			return;
		}
		local101 = Static142.aClass6_Sub10_Sub1_3.method4017();
		local225 = Static142.aClass6_Sub10_Sub1_3.method3977();
		arg2.method4703(local225, Static76.anInt2853, local101);
		arg2.anInt5136 = Static76.anInt2853 + 300;
		arg2.anInt5137 = Static142.aClass6_Sub10_Sub1_3.method3980();
	}
}
