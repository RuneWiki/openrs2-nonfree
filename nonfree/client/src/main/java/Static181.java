import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static181 {

	@OriginalMember(owner = "client!jf", name = "g", descriptor = "[I")
	public static int[] anIntArray293;

	@OriginalMember(owner = "client!jf", name = "m", descriptor = "Lclient!rj;")
	public static Class209 aClass209_2;

	@OriginalMember(owner = "client!jf", name = "n", descriptor = "I")
	public static int anInt3301;

	@OriginalMember(owner = "client!jf", name = "j", descriptor = "Lclient!hn;")
	public static final Class107 aClass107_111 = new Class107(107, -1);

	@OriginalMember(owner = "client!jf", name = "l", descriptor = "Lclient!hn;")
	public static final Class107 aClass107_112 = new Class107(101, 5);

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(B)V")
	public static void method2869() {
		if (Static90.anInt1905 == 5) {
			Static90.anInt1905 = 6;
		}
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(ILclient!ul;)V")
	public static void method2870(@OriginalArg(1) Class246 arg0) {
		Static123.anInt2496 = arg0.method5478("titlebg");
		Static238.anInt4357 = arg0.method5478("logo");
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(IILclient!cl;Lclient!ah;I)V")
	public static void method2871(@OriginalArg(0) int arg0, @OriginalArg(2) Class31_Sub2_Sub1_Sub1 arg1, @OriginalArg(3) Class1_Sub5_Sub1 arg2, @OriginalArg(4) int arg3) {
		@Pc(7) byte local7 = -1;
		if ((arg0 & 0x800) != 0) {
			arg1.aString72 = arg2.method5401();
			if (arg1.aString72.charAt(0) == '~') {
				arg1.aString72 = arg1.aString72.substring(1);
				Static378.method3527(arg1.aString72, 0, arg1.method1191(), arg1.method1186(), 2);
			} else if (arg1 == Static452.aClass31_Sub2_Sub1_Sub1_2) {
				Static378.method3527(arg1.aString72, 0, arg1.method1191(), arg1.method1186(), 2);
			}
			arg1.anInt7344 = 0;
			arg1.anInt7304 = 0;
			arg1.anInt7313 = 150;
		}
		if ((arg0 & 0x200) != 0) {
			local7 = arg2.method5354();
		}
		@Pc(89) int local89;
		@Pc(93) int local93;
		@Pc(97) int local97;
		if ((arg0 & 0x2) != 0) {
			local89 = arg2.method5362();
			local93 = arg2.method5374();
			local97 = arg2.method5383();
			@Pc(100) int local100 = arg2.anInt6475;
			@Pc(111) boolean local111 = (local89 & 0x8000) != 0;
			if (arg1.aString10 != null && arg1.aClass60_1 != null) {
				@Pc(119) boolean local119 = false;
				if (local93 <= 1) {
					if (!local111 && (Static47.aBoolean48 && !Static217.aBoolean286 || Static139.aBoolean166)) {
						local119 = true;
					} else if (Static343.method5736(arg1.aString10)) {
						local119 = true;
					}
				}
				if (!local119 && Static452.anInt7259 == 0) {
					Static98.aClass1_Sub5_2.anInt6475 = 0;
					arg2.method5382(local97, Static98.aClass1_Sub5_2.aByteArray89);
					Static98.aClass1_Sub5_2.anInt6475 = 0;
					@Pc(160) int local160 = -1;
					@Pc(179) String local179;
					if (local111) {
						local89 &= 0x7FFF;
						@Pc(170) Class46 local170 = Static405.method5432(Static98.aClass1_Sub5_2);
						local160 = local170.anInt1509;
						local179 = local170.aClass1_Sub2_Sub17_1.method5152(Static98.aClass1_Sub5_2);
					} else {
						local179 = Static200.method3250(Static303.method4357(Static98.aClass1_Sub5_2));
					}
					arg1.aString72 = local179.trim();
					arg1.anInt7304 = local89 & 0xFF;
					arg1.anInt7344 = local89 >> 8;
					arg1.anInt7313 = 150;
					@Pc(218) int local218;
					if (local93 == 1 || local93 == 2) {
						local218 = local111 ? 17 : 1;
					} else {
						local218 = local111 ? 17 : 2;
					}
					if (local93 == 2) {
						Static452.method5933("<img=1>" + arg1.method1191(), "<img=1>" + arg1.method1186(), local179, local218, null, local160, 0);
					} else if (local93 == 1) {
						Static452.method5933("<img=0>" + arg1.method1191(), "<img=0>" + arg1.method1186(), local179, local218, null, local160, 0);
					} else {
						Static452.method5933(arg1.method1191(), arg1.method1186(), local179, local218, null, local160, 0);
					}
				}
			}
			arg2.anInt6475 = local100 + local97;
		}
		if ((arg0 & 0x1) != 0) {
			local89 = arg2.method5361();
			local93 = arg2.method5411();
			arg1.method5995(local93, local89, Static378.anInt4244);
			arg1.anInt7340 = Static378.anInt4244 + 300;
			arg1.anInt7366 = arg2.method5374();
		}
		if ((arg0 & 0x1000) != 0) {
			local89 = Static378.anInt4244;
			local93 = arg2.method5361();
			local97 = arg2.method5383();
			arg1.method5995(local97, local93, local89);
		}
		if ((arg0 & 0x4) != 0) {
			local89 = arg2.method5398();
			if (local89 == 65535) {
				local89 = -1;
			}
			arg1.anInt7372 = local89;
		}
		if ((arg0 & 0x2000) != 0) {
			local89 = arg2.method5398();
			if (local89 == 65535) {
				local89 = -1;
			}
			local93 = arg2.method5407();
			local97 = arg2.method5374();
			arg1.method5993(local93, local97, false, local89);
		}
		if ((arg0 & 0x10) != 0) {
			Static144.aByteArray49[arg3] = arg2.method5416();
		}
		if ((arg0 & 0x10000) != 0) {
			local89 = arg2.method5400();
			if (local89 == 65535) {
				local89 = -1;
			}
			local93 = arg2.method5387();
			local97 = arg2.method5383();
			arg1.method5993(local93, local97, true, local89);
		}
		if ((arg0 & 0x8000) != 0) {
			arg1.aBoolean70 = arg2.method5374() == 1;
		}
		if ((arg0 & 0x20) != 0) {
			local89 = arg2.method5362();
			if (local89 == 65535) {
				local89 = -1;
			}
			local93 = arg2.method5383();
			Static149.method5328(arg1, local93, local89);
		}
		if ((arg0 & 0x80) != 0) {
			local89 = arg2.method5374();
			@Pc(502) byte[] local502 = new byte[local89];
			@Pc(507) Class1_Sub5 local507 = new Class1_Sub5(local502);
			arg2.method5403(local502, local89);
			Static164.aClass1_Sub5Array1[arg3] = local507;
			arg1.method1188(local507);
		}
		if ((arg0 & 0x100) != 0) {
			local89 = arg2.method5398();
			arg1.anInt7330 = arg2.method5366();
			arg1.anInt7325 = arg2.method5383();
			arg1.aBoolean504 = (local89 & 0x8000) != 0;
			arg1.anInt7352 = local89 & 0x7FFF;
			arg1.anInt7348 = Static378.anInt4244 + arg1.anInt7352 + arg1.anInt7330;
		}
		if ((arg0 & 0x40000) != 0) {
			arg1.aByte102 = arg2.method5414();
			arg1.aByte104 = arg2.method5414();
			arg1.aByte105 = arg2.method5414();
			arg1.aByte103 = (byte) arg2.method5383();
			arg1.anInt7360 = Static378.anInt4244 + arg2.method5362();
			arg1.anInt7339 = Static378.anInt4244 + arg2.method5363();
		}
		if ((arg0 & 0x40) != 0) {
			arg1.anInt1293 = arg2.method5362();
			if (arg1.anInt7378 == 0) {
				arg1.method5981(arg1.anInt1293);
				arg1.anInt1293 = -1;
			}
		}
		if ((arg0 & 0x4000) != 0) {
			arg1.anInt7353 = arg2.method5379();
			arg1.anInt7324 = arg2.method5354();
			arg1.anInt7358 = arg2.method5416();
			arg1.anInt7308 = arg2.method5379();
			arg1.anInt7351 = arg2.method5363() + Static378.anInt4244;
			arg1.anInt7312 = arg2.method5363() + Static378.anInt4244;
			arg1.anInt7362 = arg2.method5411();
			arg1.anInt7379 = 0;
			if (arg1.aBoolean72) {
				arg1.anInt7324 += arg1.anInt1306;
				arg1.anInt7308 += arg1.anInt1306;
				arg1.anInt7353 += arg1.anInt1295;
				arg1.anInt7378 = 0;
				arg1.anInt7358 += arg1.anInt1295;
			} else {
				arg1.anInt7378 = 1;
				arg1.anInt7353 += arg1.anIntArray658[0];
				arg1.anInt7324 += arg1.anIntArray657[0];
				arg1.anInt7308 += arg1.anIntArray657[0];
				arg1.anInt7358 += arg1.anIntArray658[0];
			}
		}
		if ((arg0 & 0x20000) != 0) {
			local93 = arg2.method5366();
			@Pc(771) int[] local771 = new int[local93];
			@Pc(774) int[] local774 = new int[local93];
			@Pc(777) int[] local777 = new int[local93];
			for (@Pc(779) int local779 = 0; local779 < local93; local779++) {
				@Pc(785) int local785 = arg2.method5363();
				if (local785 == 65535) {
					local785 = -1;
				}
				local771[local779] = local785;
				local774[local779] = arg2.method5411();
				local777[local779] = arg2.method5400();
			}
			Static35.method5802(local774, local771, local777, arg1);
		}
		if (!arg1.aBoolean72) {
			return;
		}
		if (local7 == 127) {
			arg1.method1185(arg1.anInt1306, arg1.anInt1295);
			return;
		}
		@Pc(840) byte local840;
		if (local7 == -1) {
			local840 = Static144.aByteArray49[arg3];
		} else {
			local840 = local7;
		}
		arg1.method1189(arg1.anInt1306, local840, arg1.anInt1295);
	}
}
