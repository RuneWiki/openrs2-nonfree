import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static330 {

	@OriginalMember(owner = "client!kha", name = "f", descriptor = "F")
	public static float aFloat70;

	@OriginalMember(owner = "client!kha", name = "d", descriptor = "Z")
	public static boolean aBoolean430 = false;

	@OriginalMember(owner = "client!kha", name = "e", descriptor = "Lclient!fh;")
	public static final Class118 aClass118_14 = new Class118(22);

	@OriginalMember(owner = "client!kha", name = "b", descriptor = "(I)[Lclient!hfa;")
	public static Class152[] method4576() {
		return new Class152[] { Static450.aClass152_4, Static683.aClass152_9, Static468.aClass152_5, Static639.aClass152_7, Static600.aClass152_6, Static661.aClass152_8, Static203.aClass152_3, Static53.aClass152_1, Static199.aClass152_2, Static711.aClass152_10 };
	}

	@OriginalMember(owner = "client!kha", name = "a", descriptor = "(II)I")
	public static int method4577(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = arg0 - 1;
		@Pc(10) int local10 = local4 | local4 >>> 1;
		@Pc(16) int local16 = local10 | local10 >>> 2;
		@Pc(22) int local22 = local16 | local16 >>> 4;
		@Pc(28) int local28 = local22 | local22 >>> 8;
		@Pc(52) int local52 = local28 | local28 >>> 16;
		return local52 + 1;
	}

	@OriginalMember(owner = "client!kha", name = "a", descriptor = "(Z)V")
	public static void method4579() {
		for (@Pc(13) Class2_Sub44 local13 = (Class2_Sub44) Static426.aClass218_29.method5092(); local13 != null; local13 = (Class2_Sub44) Static426.aClass218_29.method5096()) {
			if (local13.aClass156_Sub1_1.method3423()) {
				Static581.method8086(local13.anInt7300);
			} else {
				local13.aClass156_Sub1_1.method3425();
				try {
					local13.aClass156_Sub1_1.method3418();
				} catch (@Pc(32) Exception local32) {
					Static329.method4572("TV: " + local13.anInt7300, local32);
					Static581.method8086(local13.anInt7300);
				}
				if (!local13.aBoolean619 && !local13.aBoolean620) {
					@Pc(62) Class2_Sub12_Sub1 local62 = local13.aClass156_Sub1_1.method3419();
					if (local62 != null) {
						@Pc(68) Class2_Sub23_Sub1 local68 = local62.method1060();
						if (local68 != null) {
							local68.method2423(local13.anInt7301);
							Static130.aClass2_Sub23_Sub3_1.method6795(local68);
							local13.aBoolean619 = true;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!kha", name = "a", descriptor = "(BI)V")
	public static void method4580(@OriginalArg(1) int arg0) {
		Static690.anInt10620 = arg0;
		Static560.aClass221_3 = Static487.aClass221_2;
		Static25.anInt319 = 2;
		@Pc(19) String local19 = null;
		if (Static14.aByteArray1 != null) {
			@Pc(26) Class2_Sub20 local26 = new Class2_Sub20(Static14.aByteArray1);
			local19 = Static580.method8080(local26.method8590());
			Static219.aLong120 = local26.method8590();
		}
		if (local19 == null) {
			Static223.method7019(35);
		} else {
			Static574.method7981(true, false, "", local19);
		}
	}

	@OriginalMember(owner = "client!kha", name = "a", descriptor = "(IIIZIIIIILclient!lka;I)Z")
	public static boolean method4581(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class226 arg8, @OriginalArg(10) int arg9) {
		@Pc(7) int local7 = arg9;
		@Pc(9) int local9 = arg3;
		@Pc(18) int local18 = arg9 - 64;
		@Pc(23) int local23 = arg3 - 64;
		Static313.anIntArrayArray38[64][64] = 99;
		Static171.anIntArrayArray19[64][64] = 0;
		@Pc(37) byte local37 = 0;
		@Pc(46) int local46 = 0;
		Static564.anIntArray640[0] = arg9;
		@Pc(53) int local53 = local37 + 1;
		Static585.anIntArray674[0] = arg3;
		@Pc(58) int[][] local58 = arg8.anIntArrayArray41;
		while (local46 != local53) {
			local7 = Static564.anIntArray640[local46];
			local9 = Static585.anIntArray674[local46];
			@Pc(73) int local73 = local9 - local23;
			@Pc(78) int local78 = local7 - local18;
			local46 = local46 + 1 & 0xFFF;
			@Pc(89) int local89 = local7 - arg8.anInt5905;
			@Pc(95) int local95 = local9 - arg8.anInt5886;
			if (arg1 == -4) {
				if (arg5 == local7 && arg7 == local9) {
					Static653.anInt10222 = local9;
					Static313.anInt4796 = local7;
					return true;
				}
			} else if (arg1 == -3) {
				if (Static397.method5858(2, arg0, local7, 2, arg5, arg2, local9, arg7)) {
					Static313.anInt4796 = local7;
					Static653.anInt10222 = local9;
					return true;
				}
			} else if (arg1 == -2) {
				if (arg8.method5271(arg5, local7, local9, arg4, 2, arg2, arg7, arg0, 2)) {
					Static653.anInt10222 = local9;
					Static313.anInt4796 = local7;
					return true;
				}
			} else if (arg1 == -1) {
				if (arg8.method5273(arg0, arg4, local9, arg5, 2, arg7, arg2, local7)) {
					Static653.anInt10222 = local9;
					Static313.anInt4796 = local7;
					return true;
				}
			} else if (arg1 == 0 || arg1 == 1 || arg1 == 2 || arg1 == 3 || arg1 == 9) {
				if (arg8.method5277(arg6, 2, arg1, arg5, local9, local7, arg7)) {
					Static313.anInt4796 = local7;
					Static653.anInt10222 = local9;
					return true;
				}
			} else if (arg8.method5272(2, arg1, arg6, arg5, arg7, local9, local7)) {
				Static653.anInt10222 = local9;
				Static313.anInt4796 = local7;
				return true;
			}
			@Pc(276) int local276 = Static171.anIntArrayArray19[local78][local73] + 1;
			if (local78 > 0 && Static313.anIntArrayArray38[local78 - 1][local73] == 0 && (local58[local89 - 1][local95] & 0x43A40000) == 0 && (local58[local89 - 1][local95 + 1] & 0x4E240000) == 0) {
				Static564.anIntArray640[local53] = local7 - 1;
				Static585.anIntArray674[local53] = local9;
				Static313.anIntArrayArray38[local78 - 1][local73] = 2;
				local53 = local53 + 1 & 0xFFF;
				Static171.anIntArrayArray19[local78 - 1][local73] = local276;
			}
			if (local78 < 126 && Static313.anIntArrayArray38[local78 + 1][local73] == 0 && (local58[local89 + 2][local95] & 0x60E40000) == 0 && (local58[local89 + 2][local95 + 1] & 0x78240000) == 0) {
				Static564.anIntArray640[local53] = local7 + 1;
				Static585.anIntArray674[local53] = local9;
				Static313.anIntArrayArray38[local78 + 1][local73] = 8;
				local53 = local53 + 1 & 0xFFF;
				Static171.anIntArrayArray19[local78 + 1][local73] = local276;
			}
			if (local73 > 0 && Static313.anIntArrayArray38[local78][local73 - 1] == 0 && (local58[local89][local95 - 1] & 0x43A40000) == 0 && (local58[local89 + 1][local95 - 1] & 0x60E40000) == 0) {
				Static564.anIntArray640[local53] = local7;
				Static585.anIntArray674[local53] = local9 - 1;
				Static313.anIntArrayArray38[local78][local73 - 1] = 1;
				local53 = local53 + 1 & 0xFFF;
				Static171.anIntArrayArray19[local78][local73 - 1] = local276;
			}
			if (local73 < 126 && Static313.anIntArrayArray38[local78][local73 + 1] == 0 && (local58[local89][local95 + 2] & 0x4E240000) == 0 && (local58[local89 + 1][local95 + 2] & 0x78240000) == 0) {
				Static564.anIntArray640[local53] = local7;
				Static585.anIntArray674[local53] = local9 + 1;
				local53 = local53 + 1 & 0xFFF;
				Static313.anIntArrayArray38[local78][local73 + 1] = 4;
				Static171.anIntArrayArray19[local78][local73 + 1] = local276;
			}
			if (local78 > 0 && local73 > 0 && Static313.anIntArrayArray38[local78 - 1][local73 - 1] == 0 && (local58[local89 - 1][local95] & 0x4FA40000) == 0 && (local58[local89 - 1][local95 - 1] & 0x43A40000) == 0 && (local58[local89][local95 - 1] & 0x63E40000) == 0) {
				Static564.anIntArray640[local53] = local7 - 1;
				Static585.anIntArray674[local53] = local9 - 1;
				local53 = local53 + 1 & 0xFFF;
				Static313.anIntArrayArray38[local78 - 1][local73 - 1] = 3;
				Static171.anIntArrayArray19[local78 - 1][local73 - 1] = local276;
			}
			if (local78 < 126 && local73 > 0 && Static313.anIntArrayArray38[local78 + 1][local73 - 1] == 0 && (local58[local89 + 1][local95 - 1] & 0x63E40000) == 0 && (local58[local89 + 2][local95 - 1] & 0x60E40000) == 0 && (local58[local89 + 2][local95] & 0x78E40000) == 0) {
				Static564.anIntArray640[local53] = local7 + 1;
				Static585.anIntArray674[local53] = local9 - 1;
				local53 = local53 + 1 & 0xFFF;
				Static313.anIntArrayArray38[local78 + 1][local73 - 1] = 9;
				Static171.anIntArrayArray19[local78 + 1][local73 - 1] = local276;
			}
			if (local78 > 0 && local73 < 126 && Static313.anIntArrayArray38[local78 - 1][local73 + 1] == 0 && (local58[local89 - 1][local95 + 1] & 0x4FA40000) == 0 && (local58[local89 - 1][local95 + 2] & 0x4E240000) == 0 && (local58[local89][local95 + 2] & 0x7E240000) == 0) {
				Static564.anIntArray640[local53] = local7 - 1;
				Static585.anIntArray674[local53] = local9 + 1;
				Static313.anIntArrayArray38[local78 - 1][local73 + 1] = 6;
				local53 = local53 + 1 & 0xFFF;
				Static171.anIntArrayArray19[local78 - 1][local73 + 1] = local276;
			}
			if (local78 < 126 && local73 < 126 && Static313.anIntArrayArray38[local78 + 1][local73 + 1] == 0 && (local58[local89 + 1][local95 + 2] & 0x7E240000) == 0 && (local58[local89 + 2][local95 + 2] & 0x78240000) == 0 && (local58[local89 + 2][local95 + 1] & 0x78E40000) == 0) {
				Static564.anIntArray640[local53] = local7 + 1;
				Static585.anIntArray674[local53] = local9 + 1;
				Static313.anIntArrayArray38[local78 + 1][local73 + 1] = 12;
				local53 = local53 + 1 & 0xFFF;
				Static171.anIntArrayArray19[local78 + 1][local73 + 1] = local276;
			}
		}
		Static313.anInt4796 = local7;
		Static653.anInt10222 = local9;
		return false;
	}
}
