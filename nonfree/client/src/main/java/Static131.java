import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static131 {

	@OriginalMember(owner = "client!jc", name = "A", descriptor = "I")
	public static int anInt2542;

	@OriginalMember(owner = "client!jc", name = "D", descriptor = "Lclient!wf;")
	public static Class189 aClass189_8;

	@OriginalMember(owner = "client!jc", name = "G", descriptor = "Lclient!cc;")
	public static Class26 aClass26_25 = new Class26(64);

	@OriginalMember(owner = "client!jc", name = "R", descriptor = "I")
	public static int anInt2553 = 100;

	@OriginalMember(owner = "client!jc", name = "S", descriptor = "Z")
	public static boolean aBoolean175 = false;

	@OriginalMember(owner = "client!jc", name = "d", descriptor = "(I)Lclient!gb;")
	public static Class63_Sub1 method1992() {
		Static233.anInt3224 = 0;
		return Static110.method1778();
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(II)V")
	public static void method1995(@OriginalArg(1) int arg0) {
		@Pc(6) Class4_Sub3_Sub9 local6 = Static43.method2329(8, arg0);
		local6.method1519();
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(CZ)Z")
	public static boolean method1997(@OriginalArg(0) char arg0) {
		return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}

	@OriginalMember(owner = "client!jc", name = "e", descriptor = "(B)I")
	public static int method1998() {
		if ((double) Static121.aFloat69 == 3.0D) {
			return 37;
		} else if ((double) Static121.aFloat69 == 4.0D) {
			return 50;
		} else if ((double) Static121.aFloat69 == 6.0D) {
			return 75;
		} else if ((double) Static121.aFloat69 == 8.0D) {
			return 100;
		} else {
			return 200;
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIIIIIIIIIZ)V")
	public static void method1999(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(7) int local7;
		@Pc(12) int local12;
		for (local7 = 0; local7 < 104; local7++) {
			for (local12 = 0; local12 < 104; local12++) {
				Static292.anIntArrayArray48[local7][local12] = 0;
				Static16.anIntArrayArray9[local7][local12] = 99999999;
			}
		}
		Static292.anIntArrayArray48[arg2][arg4] = 99;
		Static16.anIntArrayArray9[arg2][arg4] = 0;
		local7 = arg2;
		local12 = arg4;
		@Pc(55) byte local55 = 0;
		Static237.anIntArray479[0] = arg2;
		@Pc(62) int local62 = local55 + 1;
		Static141.anIntArray653[0] = arg4;
		@Pc(66) int local66 = 0;
		@Pc(68) boolean local68 = false;
		@Pc(73) int[][] local73 = Static296.aClass30Array1[Static281.anInt5335].anIntArrayArray6;
		@Pc(200) int local200;
		@Pc(244) int local244;
		label322: while (local66 != local62) {
			local12 = Static141.anIntArray653[local66];
			local7 = Static237.anIntArray479[local66];
			local66 = local66 + 1 & 0xFFF;
			if (local7 == arg1 && local12 == arg6) {
				local68 = true;
				break;
			}
			if (arg0 != 0) {
				if ((arg0 < 5 || arg0 == 10) && Static296.aClass30Array1[Static281.anInt5335].method574(arg6, arg9, local12, local7, arg1, arg8, arg0 - 1)) {
					local68 = true;
					break;
				}
				if (arg0 < 10 && Static296.aClass30Array1[Static281.anInt5335].method577(arg1, local7, arg6, local12, arg0 - 1, arg9, arg8)) {
					local68 = true;
					break;
				}
			}
			if (arg3 != 0 && arg5 != 0 && Static296.aClass30Array1[Static281.anInt5335].method570(local12, arg7, arg8, arg6, arg1, arg5, arg3, local7)) {
				local68 = true;
				break;
			}
			local200 = Static16.anIntArrayArray9[local7][local12] + 1;
			if (local7 > 0 && Static292.anIntArrayArray48[local7 - 1][local12] == 0 && (local73[local7 - 1][local12] & 0x2C010E) == 0 && (local73[local7 - 1][arg8 + local12 - 1] & 0x2C0138) == 0) {
				local244 = 1;
				while (true) {
					if (arg8 - 1 <= local244) {
						Static237.anIntArray479[local62] = local7 - 1;
						Static141.anIntArray653[local62] = local12;
						Static292.anIntArrayArray48[local7 - 1][local12] = 2;
						Static16.anIntArrayArray9[local7 - 1][local12] = local200;
						local62 = local62 + 1 & 0xFFF;
						break;
					}
					if ((local73[local7 - 1][local244 + local12] & 0x2C013E) != 0) {
						break;
					}
					local244++;
				}
			}
			if (local7 < 102 && Static292.anIntArrayArray48[local7 + 1][local12] == 0 && (local73[local7 + arg8][local12] & 0x2C0183) == 0 && (local73[local7 + arg8][local12 + arg8 - 1] & 0x2C01E0) == 0) {
				local244 = 1;
				while (true) {
					if (arg8 - 1 <= local244) {
						Static237.anIntArray479[local62] = local7 + 1;
						Static141.anIntArray653[local62] = local12;
						local62 = local62 + 1 & 0xFFF;
						Static292.anIntArrayArray48[local7 + 1][local12] = 8;
						Static16.anIntArrayArray9[local7 + 1][local12] = local200;
						break;
					}
					if ((local73[arg8 + local7][local12 + local244] & 0x2C01E3) != 0) {
						break;
					}
					local244++;
				}
			}
			if (local12 > 0 && Static292.anIntArrayArray48[local7][local12 - 1] == 0 && (local73[local7][local12 - 1] & 0x2C010E) == 0 && (local73[arg8 + local7 - 1][local12 - 1] & 0x2C0183) == 0) {
				local244 = 1;
				while (true) {
					if (local244 >= arg8 - 1) {
						Static237.anIntArray479[local62] = local7;
						Static141.anIntArray653[local62] = local12 - 1;
						Static292.anIntArrayArray48[local7][local12 - 1] = 1;
						local62 = local62 + 1 & 0xFFF;
						Static16.anIntArrayArray9[local7][local12 - 1] = local200;
						break;
					}
					if ((local73[local244 + local7][local12 - 1] & 0x2C018F) != 0) {
						break;
					}
					local244++;
				}
			}
			if (local12 < 102 && Static292.anIntArrayArray48[local7][local12 + 1] == 0 && (local73[local7][local12 + arg8] & 0x2C0138) == 0 && (local73[local7 + arg8 - 1][arg8 + local12] & 0x2C01E0) == 0) {
				local244 = 1;
				while (true) {
					if (local244 >= arg8 - 1) {
						Static237.anIntArray479[local62] = local7;
						Static141.anIntArray653[local62] = local12 + 1;
						Static292.anIntArrayArray48[local7][local12 + 1] = 4;
						Static16.anIntArrayArray9[local7][local12 + 1] = local200;
						local62 = local62 + 1 & 0xFFF;
						break;
					}
					if ((local73[local7 + local244][arg8 + local12] & 0x2C01F8) != 0) {
						break;
					}
					local244++;
				}
			}
			if (local7 > 0 && local12 > 0 && Static292.anIntArrayArray48[local7 - 1][local12 - 1] == 0 && (local73[local7 - 1][local12 - 1] & 0x2C010E) == 0) {
				local244 = 1;
				while (true) {
					if (arg8 <= local244) {
						Static237.anIntArray479[local62] = local7 - 1;
						Static141.anIntArray653[local62] = local12 - 1;
						Static292.anIntArrayArray48[local7 - 1][local12 - 1] = 3;
						local62 = local62 + 1 & 0xFFF;
						Static16.anIntArrayArray9[local7 - 1][local12 - 1] = local200;
						break;
					}
					if ((local73[local7 - 1][local12 + local244 - 1] & 0x2C013E) != 0 || (local73[local244 + local7 - 1][local12 - 1] & 0x2C018F) != 0) {
						break;
					}
					local244++;
				}
			}
			if (local7 < 102 && local12 > 0 && Static292.anIntArrayArray48[local7 + 1][local12 - 1] == 0 && (local73[local7 + arg8][local12 - 1] & 0x2C0183) == 0) {
				local244 = 1;
				while (true) {
					if (arg8 <= local244) {
						Static237.anIntArray479[local62] = local7 + 1;
						Static141.anIntArray653[local62] = local12 - 1;
						local62 = local62 + 1 & 0xFFF;
						Static292.anIntArrayArray48[local7 + 1][local12 - 1] = 9;
						Static16.anIntArrayArray9[local7 + 1][local12 - 1] = local200;
						break;
					}
					if ((local73[local7 + arg8][local12 + local244 - 1] & 0x2C01E3) != 0 || (local73[local244 + local7][local12 - 1] & 0x2C018F) != 0) {
						break;
					}
					local244++;
				}
			}
			if (local7 > 0 && local12 < 102 && Static292.anIntArrayArray48[local7 - 1][local12 + 1] == 0 && (local73[local7 - 1][arg8 + local12] & 0x2C0138) == 0) {
				local244 = 1;
				while (true) {
					if (arg8 <= local244) {
						Static237.anIntArray479[local62] = local7 - 1;
						Static141.anIntArray653[local62] = local12 + 1;
						Static292.anIntArrayArray48[local7 - 1][local12 + 1] = 6;
						local62 = local62 + 1 & 0xFFF;
						Static16.anIntArrayArray9[local7 - 1][local12 + 1] = local200;
						break;
					}
					if ((local73[local7 - 1][local12 + local244] & 0x2C013E) != 0 || (local73[local7 + local244 - 1][local12 + arg8] & 0x2C01F8) != 0) {
						break;
					}
					local244++;
				}
			}
			if (local7 < 102 && local12 < 102 && Static292.anIntArrayArray48[local7 + 1][local12 + 1] == 0 && (local73[arg8 + local7][arg8 + local12] & 0x2C01E0) == 0) {
				for (local244 = 1; local244 < arg8; local244++) {
					if ((local73[local7 + local244][arg8 + local12] & 0x2C01F8) != 0 || (local73[local7 + arg8][local12 + local244] & 0x2C01E3) != 0) {
						continue label322;
					}
				}
				Static237.anIntArray479[local62] = local7 + 1;
				Static141.anIntArray653[local62] = local12 + 1;
				Static292.anIntArrayArray48[local7 + 1][local12 + 1] = 12;
				local62 = local62 + 1 & 0xFFF;
				Static16.anIntArrayArray9[local7 + 1][local12 + 1] = local200;
			}
		}
		if (!local68) {
			local200 = 1000;
			local244 = 100;
			for (@Pc(1090) int local1090 = arg1 - 10; local1090 <= arg1 + 10; local1090++) {
				for (@Pc(1100) int local1100 = arg6 - 10; local1100 <= arg6 + 10; local1100++) {
					if (local1090 >= 0 && local1100 >= 0 && local1090 < 104 && local1100 < 104 && Static16.anIntArrayArray9[local1090][local1100] < 100) {
						@Pc(1129) int local1129 = 0;
						if (arg1 > local1090) {
							local1129 = arg1 - local1090;
						} else if (arg3 + arg1 - 1 < local1090) {
							local1129 = local1090 + 1 - arg1 - arg3;
						}
						@Pc(1164) int local1164 = 0;
						if (local1100 < arg6) {
							local1164 = arg6 - local1100;
						} else if (local1100 > arg6 + arg5 - 1) {
							local1164 = local1100 + 1 - arg6 - arg5;
						}
						@Pc(1208) int local1208 = local1129 * local1129 + local1164 * local1164;
						if (local1208 < local200 || local1208 == local200 && local244 > Static16.anIntArrayArray9[local1090][local1100]) {
							local7 = local1090;
							local200 = local1208;
							local12 = local1100;
							local244 = Static16.anIntArrayArray9[local1090][local1100];
						}
					}
				}
			}
			if (local200 == 1000) {
				return;
			}
			if (arg2 == local7 && arg4 == local12) {
				return;
			}
		}
		Static105.aBoolean147 = false;
		Static102.anInt2140 = local12;
		Static239.anInt4507 = local7;
	}

	@OriginalMember(owner = "client!jc", name = "f", descriptor = "(B)[Lclient!uj;")
	public static Class4_Sub3_Sub14[] method2001() {
		@Pc(4) Class4_Sub3_Sub14[] local4 = new Class4_Sub3_Sub14[Static143.anInt2748];
		for (@Pc(18) int local18 = 0; local18 < Static143.anInt2748; local18++) {
			@Pc(29) byte[] local29 = Static230.aByteArrayArray36[local18];
			@Pc(37) int local37 = Static110.anIntArray185[local18] * Static301.anIntArray643[local18];
			@Pc(40) int[] local40 = new int[local37];
			for (@Pc(42) int local42 = 0; local42 < local37; local42++) {
				local40[local42] = Static58.anIntArray85[local29[local42] & 0xFF];
			}
			if (Static94.aBoolean138) {
				local4[local18] = new Class4_Sub3_Sub14_Sub2(Static47.anInt889, Static105.anInt2162, Static195.anIntArray402[local18], Static187.anIntArray391[local18], Static110.anIntArray185[local18], Static301.anIntArray643[local18], local40);
			} else {
				local4[local18] = new Class4_Sub3_Sub14_Sub1(Static47.anInt889, Static105.anInt2162, Static195.anIntArray402[local18], Static187.anIntArray391[local18], Static110.anIntArray185[local18], Static301.anIntArray643[local18], local40);
			}
		}
		Static304.method4707();
		return local4;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Z)V")
	public static void method2002() {
		Static110.aClass4_Sub10_Sub1_1.method4687(86);
		Static110.aClass4_Sub10_Sub1_1.method4618(Static35.method557());
		Static110.aClass4_Sub10_Sub1_1.method4668(Static31.anInt526);
		Static110.aClass4_Sub10_Sub1_1.method4668(Static40.anInt690);
		Static110.aClass4_Sub10_Sub1_1.method4618(Static55.anInt1125);
	}
}
