import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static342 {

	@OriginalMember(owner = "client!qv", name = "s", descriptor = "I")
	public static int anInt6261;

	@OriginalMember(owner = "client!qv", name = "cb", descriptor = "I")
	public static int anInt6292;

	@OriginalMember(owner = "client!qv", name = "g", descriptor = "Lclient!nk;")
	public static final Class177 aClass177_88 = new Class177(47, 7);

	@OriginalMember(owner = "client!qv", name = "y", descriptor = "I")
	public static int anInt6266 = 0;

	@OriginalMember(owner = "client!qv", name = "D", descriptor = "I")
	public static int anInt6271 = 0;

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(Lclient!ch;BLclient!ap;II)V")
	public static void method4807(@OriginalArg(0) Class30_Sub1_Sub1_Sub2 arg0, @OriginalArg(2) Class1_Sub3_Sub1 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(13) int local13;
		@Pc(17) int local17;
		if ((arg3 & 0x2) != 0) {
			local13 = arg1.method1168();
			local17 = arg1.method1210();
			arg0.method950(local13, Static187.anInt3975, local17);
			arg0.anInt1237 = Static187.anInt3975 + 300;
			arg0.anInt1290 = arg1.method1170();
		}
		@Pc(35) byte local35 = -1;
		if ((arg3 & 0x40) != 0) {
			Static5.aByteArray1[arg2] = arg1.method1189();
		}
		if ((arg3 & 0x200) != 0) {
			local35 = arg1.method1212();
		}
		if ((arg3 & 0x10000) != 0) {
			arg0.aByte31 = arg1.method1220();
			arg0.aByte30 = arg1.method1212();
			arg0.aByte29 = arg1.method1212();
			arg0.aByte28 = (byte) arg1.method1171();
			arg0.anInt1258 = Static187.anInt3975 + arg1.method1207();
			arg0.anInt1310 = Static187.anInt3975 + arg1.method1207();
		}
		if ((arg3 & 0x20000) != 0) {
			local13 = arg1.method1218();
			@Pc(114) int[] local114 = new int[local13];
			@Pc(117) int[] local117 = new int[local13];
			@Pc(120) int[] local120 = new int[local13];
			for (@Pc(122) int local122 = 0; local122 < local13; local122++) {
				@Pc(128) int local128 = arg1.method1177();
				if (local128 == 65535) {
					local128 = -1;
				}
				local114[local122] = local128;
				local117[local122] = arg1.method1218();
				local120[local122] = arg1.method1217();
			}
			Static118.method2019(local117, arg0, local114, local120);
		}
		if ((arg3 & 0x2000) != 0) {
			arg0.aString7 = arg1.method1201();
			if (arg0.aString7.charAt(0) == '~') {
				arg0.aString7 = arg0.aString7.substring(1);
				Static227.method3471(arg0.method965(), 0, arg0.aString7, 2, arg0.method962());
			} else if (Static429.aClass30_Sub1_Sub1_Sub2_2 == arg0) {
				Static227.method3471(arg0.method965(), 0, arg0.aString7, 2, arg0.method962());
			}
			arg0.anInt1311 = 0;
			arg0.anInt1288 = 0;
			arg0.anInt1238 = 150;
		}
		if ((arg3 & 0x4000) != 0) {
			arg0.anInt1285 = arg1.method1212();
			arg0.anInt1312 = arg1.method1220();
			arg0.anInt1259 = arg1.method1189();
			arg0.anInt1272 = arg1.method1193();
			arg0.anInt1305 = arg1.method1225() + Static187.anInt3975;
			arg0.anInt1300 = arg1.method1207() + Static187.anInt3975;
			arg0.anInt1291 = arg1.method1171();
			arg0.anInt1315 = 0;
			if (arg0.aBoolean83) {
				arg0.anInt1285 += arg0.anInt1342;
				arg0.anInt1272 += arg0.anInt1327;
				arg0.anInt1312 += arg0.anInt1327;
				arg0.anInt1259 += arg0.anInt1342;
				arg0.anInt1314 = 0;
			} else {
				arg0.anInt1259 += arg0.anIntArray130[0];
				arg0.anInt1285 += arg0.anIntArray130[0];
				arg0.anInt1314 = 1;
				arg0.anInt1312 += arg0.anIntArray129[0];
				arg0.anInt1272 += arg0.anIntArray129[0];
			}
		}
		if ((arg3 & 0x1000) != 0) {
			arg0.aBoolean85 = arg1.method1170() == 1;
		}
		@Pc(381) int local381;
		if ((arg3 & 0x100) != 0) {
			local13 = Static187.anInt3975;
			local17 = arg1.method1168();
			local381 = arg1.method1171();
			arg0.method950(local17, local13, local381);
		}
		if ((arg3 & 0x4) != 0) {
			local13 = arg1.method1177();
			if (local13 == 65535) {
				local13 = -1;
			}
			local17 = arg1.method1170();
			Static294.method4272(local13, local17, arg0);
		}
		if ((arg3 & 0x1) != 0) {
			local13 = arg1.method1225();
			local17 = arg1.method1171();
			local381 = arg1.method1171();
			@Pc(431) int local431 = arg1.anInt1710;
			@Pc(439) boolean local439 = (local13 & 0x8000) != 0;
			if (arg0.aString9 != null && arg0.aClass210_1 != null) {
				@Pc(447) boolean local447 = false;
				if (local17 <= 1) {
					if (!local439 && (Static400.aBoolean463 && !Static223.aBoolean279 || Static11.aBoolean7)) {
						local447 = true;
					} else if (Static64.method1237(arg0.aString9)) {
						local447 = true;
					}
				}
				if (!local447 && Static362.anInt6659 == 0) {
					Static314.aClass1_Sub3_7.anInt1710 = 0;
					arg1.method1216(Static314.aClass1_Sub3_7.aByteArray14, local381);
					Static314.aClass1_Sub3_7.anInt1710 = 0;
					@Pc(488) int local488 = -1;
					@Pc(507) String local507;
					if (local439) {
						local13 &= 0x7FFF;
						@Pc(498) Class199 local498 = Static337.method4742(Static314.aClass1_Sub3_7);
						local488 = local498.anInt5845;
						local507 = local498.aClass1_Sub1_Sub13_1.method4838(Static314.aClass1_Sub3_7);
					} else {
						local507 = Static116.method1885(Static220.method3425(Static314.aClass1_Sub3_7));
					}
					arg0.aString7 = local507.trim();
					arg0.anInt1288 = local13 >> 8;
					arg0.anInt1238 = 150;
					arg0.anInt1311 = local13 & 0xFF;
					@Pc(544) int local544;
					if (local17 == 1 || local17 == 2) {
						local544 = local439 ? 17 : 1;
					} else {
						local544 = local439 ? 17 : 2;
					}
					if (local17 == 2) {
						Static118.method2011(null, 0, local507, "<img=1>" + arg0.method965(), local544, local488, "<img=1>" + arg0.method962());
					} else if (local17 == 1) {
						Static118.method2011(null, 0, local507, "<img=0>" + arg0.method965(), local544, local488, "<img=0>" + arg0.method962());
					} else {
						Static118.method2011(null, 0, local507, arg0.method965(), local544, local488, arg0.method962());
					}
				}
			}
			arg1.anInt1710 = local381 + local431;
		}
		if ((arg3 & 0x80) != 0) {
			arg0.anInt1318 = arg1.method1207();
			if (arg0.anInt1314 == 0) {
				arg0.method941(arg0.anInt1318);
				arg0.anInt1318 = -1;
			}
		}
		if ((arg3 & 0x8000) != 0) {
			local13 = arg1.method1177();
			if (local13 == 65535) {
				local13 = -1;
			}
			local17 = arg1.method1188();
			local381 = arg1.method1218();
			arg0.method956(false, local13, local381, local17);
		}
		if ((arg3 & 0x40000) != 0) {
			local13 = arg1.method1177();
			local17 = arg1.method1186();
			if (local13 == 65535) {
				local13 = -1;
			}
			local381 = arg1.method1210();
			arg0.method956(true, local13, local381, local17);
		}
		if ((arg3 & 0x20) != 0) {
			local13 = arg1.method1207();
			if (local13 == 65535) {
				local13 = -1;
			}
			arg0.anInt1243 = local13;
		}
		if ((arg3 & 0x10) != 0) {
			local13 = arg1.method1218();
			@Pc(751) byte[] local751 = new byte[local13];
			@Pc(756) Class1_Sub3 local756 = new Class1_Sub3(local751);
			arg1.method1216(local751, local13);
			Static43.aClass1_Sub3Array1[arg2] = local756;
			arg0.method964(local756);
		}
		if ((arg3 & 0x800) != 0) {
			local13 = arg1.method1225();
			arg0.anInt1276 = arg1.method1218();
			arg0.anInt1241 = arg1.method1171();
			arg0.anInt1280 = local13 & 0x7FFF;
			arg0.aBoolean80 = (local13 & 0x8000) != 0;
			arg0.anInt1307 = arg0.anInt1276 + arg0.anInt1280 + Static187.anInt3975;
		}
		if (!arg0.aBoolean83) {
			return;
		}
		if (local35 == 127) {
			arg0.method958(arg0.anInt1327, arg0.anInt1342);
			return;
		}
		@Pc(836) byte local836;
		if (local35 == -1) {
			local836 = Static5.aByteArray1[arg2];
		} else {
			local836 = local35;
		}
		arg0.method963(local836, arg0.anInt1327, arg0.anInt1342);
	}

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(I)V")
	public static void method4808() {
		@Pc(5) Class128 local5 = null;
		try {
			@Pc(11) Class157 local11 = Static150.aClass183_3.method4157("3", false);
			while (local11.anInt4667 == 0) {
				Static289.method4249(1L);
			}
			if (local11.anInt4667 == 2) {
				throw new RuntimeException("Error opening file");
			}
			local5 = (Class128) local11.anObject13;
			@Pc(39) byte[] local39 = new byte[(int) local5.method3092()];
			if (local39.length == 0) {
				Static323.aString56 = "";
				Static413.aString63 = "";
			} else {
				@Pc(58) int local58;
				for (@Pc(47) int local47 = 0; local47 < local39.length; local47 += local58) {
					local58 = local5.method3093(local39.length - local47, local47, local39);
					if (local58 == -1) {
						throw new IOException("EOF");
					}
				}
				@Pc(79) Class1_Sub3 local79 = new Class1_Sub3(local39);
				@Pc(83) int local83 = local79.method1171();
				if (local83 > 50) {
					throw new RuntimeException("Bad length");
				}
				local79.anInt1710 = local83 + 1;
				if (!local79.method1176()) {
					throw new RuntimeException("Invalid CRC");
				}
				local79.anInt1710 = 1;
				@Pc(112) int local112 = local79.method1171();
				if (local112 != 0) {
					throw new RuntimeException("Invalid version " + local112);
				}
				Static323.aString56 = local79.method1213();
				Static413.aString63 = local79.method1213();
			}
		} catch (@Pc(143) Exception local143) {
			Static323.aString56 = "";
			Static413.aString63 = "";
		}
		try {
			if (local5 != null) {
				local5.method3091();
			}
		} catch (@Pc(154) Exception local154) {
		}
	}

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(IILclient!za;IIIIII)V")
	public static void method4809(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class106 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(16) Interface5 local16 = (Interface5) Static232.method3536(arg7, arg4, arg3);
		@Pc(25) Class192 local25;
		@Pc(33) int local33;
		@Pc(37) int local37;
		@Pc(43) int local43;
		if (local16 != null) {
			local25 = Static455.aClass161_4.method3628(local16.method5730());
			local33 = local16.method5729() & 0x3;
			local37 = local16.method5727();
			if (local25.anInt5683 == -1) {
				local43 = arg0;
				if (local25.anInt5666 > 0) {
					local43 = arg5;
				}
				if (local37 == 0 || local37 == 2) {
					if (local33 == 0) {
						arg2.method5936(arg6, arg1, 4, local43);
					} else if (local33 == 1) {
						arg2.method5951(local43, 4, arg1, arg6);
					} else if (local33 == 2) {
						arg2.method5936(arg6, arg1 + 3, 4, local43);
					} else if (local33 == 3) {
						arg2.method5951(local43, 4, arg1, arg6 + 3);
					}
				}
				if (local37 == 3) {
					if (local33 == 0) {
						arg2.method5941(arg6, 1, arg1, 1, local43);
					} else if (local33 == 1) {
						arg2.method5941(arg6, 1, arg1 + 3, 1, local43);
					} else if (local33 == 2) {
						arg2.method5941(arg6 + 3, 1, arg1 + 3, 1, local43);
					} else if (local33 == 3) {
						arg2.method5941(arg6 + 3, 1, arg1, 1, local43);
					}
				}
				if (local37 == 2) {
					if (local33 == 0) {
						arg2.method5951(local43, 4, arg1, arg6);
					} else if (local33 == 1) {
						arg2.method5936(arg6, arg1 + 3, 4, local43);
					} else if (local33 == 2) {
						arg2.method5951(local43, 4, arg1, arg6 + 3);
					} else if (local33 == 3) {
						arg2.method5936(arg6, arg1, 4, local43);
					}
				}
			} else {
				Static353.method5673(local25, local33, arg1, arg2, arg6);
			}
		}
		local16 = (Interface5) Static461.method5974(arg7, arg4, arg3, jg.class);
		if (local16 != null) {
			local25 = Static455.aClass161_4.method3628(local16.method5730());
			local33 = local16.method5729() & 0x3;
			local37 = local16.method5727();
			if (local25.anInt5683 != -1) {
				Static353.method5673(local25, local33, arg1, arg2, arg6);
			} else if (local37 == 9) {
				local43 = -1118482;
				if (local25.anInt5666 > 0) {
					local43 = -1179648;
				}
				if (local33 == 0 || local33 == 2) {
					arg2.method5981(local43, arg6 + 3, arg1 + 3, arg6, arg1);
				} else {
					arg2.method5981(local43, arg6, arg1 + 3, arg6 + 3, arg1);
				}
			}
		}
		local16 = (Interface5) Static454.method6163(arg7, arg4, arg3);
		if (local16 == null) {
			return;
		}
		local25 = Static455.aClass161_4.method3628(local16.method5730());
		local33 = local16.method5729() & 0x3;
		if (local25.anInt5683 != -1) {
			Static353.method5673(local25, local33, arg1, arg2, arg6);
			return;
		}
	}

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(ILclient!ou;I)V")
	public static void method4810(@OriginalArg(1) Class30_Sub1_Sub1 arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = -1;
		@Pc(9) int local9 = 0;
		if (arg0.anInt1305 > Static187.anInt3975) {
			Static370.method5157(arg0);
		} else if (arg0.anInt1300 >= Static187.anInt3975) {
			Static204.method3269(arg0);
		} else {
			Static132.method2164(false, arg0);
			local7 = Static115.anInt2565;
			local9 = Static285.anInt5407;
		}
		if (arg0.anInt7490 < 128 || arg0.anInt7488 < 128 || (Static209.anInt4283 - 1) * 128 <= arg0.anInt7490 || arg0.anInt7488 >= (Static211.anInt4295 - 1) * 128) {
			local9 = 0;
			arg0.anInt1305 = 0;
			arg0.anInt1303 = -1;
			arg0.anInt1249 = -1;
			arg0.anInt1300 = 0;
			arg0.anInt1279 = -1;
			local7 = -1;
			arg0.anInt7490 = arg0.anIntArray130[0] * 128 + arg0.method944() * 64;
			arg0.anInt7488 = arg0.anIntArray129[0] * 128 + arg0.method944() * 64;
			arg0.method939();
		}
		if (Static429.aClass30_Sub1_Sub1_Sub2_2 == arg0 && (arg0.anInt7490 < 1536 || arg0.anInt7488 < 1536 || arg0.anInt7490 >= Static209.anInt4283 * 128 - 1536 || (Static211.anInt4295 - 12) * 128 <= arg0.anInt7488)) {
			arg0.anInt1305 = 0;
			arg0.anInt1303 = -1;
			arg0.anInt1249 = -1;
			arg0.anInt1279 = -1;
			local9 = 0;
			local7 = -1;
			arg0.anInt1300 = 0;
			arg0.anInt7490 = arg0.anIntArray130[0] * 128 + arg0.method944() * 64;
			arg0.anInt7488 = arg0.anIntArray129[0] * 128 + arg0.method944() * 64;
			arg0.method939();
		}
		@Pc(206) int local206 = Static61.method1146(arg0);
		Static130.method2136(local206, arg0, local9, local7);
		Static161.method2662(arg0);
	}

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method4815(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (Static323.anInt5975 >= 100 && !Static346.aBoolean406 || Static323.anInt5975 >= 200) {
			Static192.method3105(Static25.aClass158_11.method3594(Static365.anInt6682));
			return;
		}
		@Pc(27) String local27 = Static311.method4474(arg0);
		if (local27 == null) {
			return;
		}
		@Pc(69) String local69;
		for (@Pc(32) int local32 = 0; local32 < Static323.anInt5975; local32++) {
			@Pc(39) String local39 = Static311.method4474(Static169.aStringArray24[local32]);
			if (local39 != null && local39.equals(local27)) {
				Static192.method3105(arg0 + Static234.aClass158_121.method3594(Static365.anInt6682));
				return;
			}
			if (Static318.aStringArray37[local32] != null) {
				local69 = Static311.method4474(Static318.aStringArray37[local32]);
				if (local69 != null && local69.equals(local27)) {
					Static192.method3105(arg0 + Static234.aClass158_121.method3594(Static365.anInt6682));
					return;
				}
			}
		}
		for (@Pc(97) int local97 = 0; local97 < Static223.anInt4457; local97++) {
			local69 = Static311.method4474(Static406.aStringArray30[local97]);
			if (local69 != null && local69.equals(local27)) {
				Static192.method3105(Static177.aClass158_98.method3594(Static365.anInt6682) + arg0 + Static98.aClass158_55.method3594(Static365.anInt6682));
				return;
			}
			if (Static244.aStringArray31[local97] != null) {
				@Pc(141) String local141 = Static311.method4474(Static244.aStringArray31[local97]);
				if (local141 != null && local141.equals(local27)) {
					Static192.method3105(Static177.aClass158_98.method3594(Static365.anInt6682) + arg0 + Static98.aClass158_55.method3594(Static365.anInt6682));
					return;
				}
			}
		}
		if (Static311.method4474(Static429.aClass30_Sub1_Sub1_Sub2_2.aString9).equals(local27)) {
			Static192.method3105(Static309.aClass158_207.method3594(Static365.anInt6682));
		} else {
			Static32.method677(Static218.aClass177_56);
			Static433.aClass1_Sub3_Sub1_11.method1208(Static146.method2347(arg0));
			Static433.aClass1_Sub3_Sub1_11.method1190(arg0);
		}
	}
}
