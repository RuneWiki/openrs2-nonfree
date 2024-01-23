import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static220 {

	@OriginalMember(owner = "client!pi", name = "H", descriptor = "[Lclient!sg;")
	public static Class161[] aClass161Array1;

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(IIIIIILclient!io;IJ)Z")
	public static boolean method3439(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class15 arg6, @OriginalArg(8) long arg7) {
		if (arg6 == null) {
			return true;
		} else {
			@Pc(11) int local11 = arg1 * 128 + arg4 * 64;
			@Pc(19) int local19 = arg2 * 128 + arg5 * 64;
			return Static52.method4723(arg0, arg1, arg2, arg4, arg5, local11, local19, arg3, arg6, 0, false, arg7);
		}
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(ILclient!lf;)V")
	public static void method3440(@OriginalArg(1) Class1_Sub14 arg0) {
		if (arg0.aByteArray17.length - arg0.anInt1480 < 1) {
			return;
		}
		@Pc(20) int local20 = arg0.method1378();
		if (local20 < 0 || local20 > 11) {
			return;
		}
		@Pc(56) byte local56;
		if (local20 == 11) {
			local56 = 33;
		} else if (local20 == 10) {
			local56 = 32;
		} else if (local20 == 9) {
			local56 = 31;
		} else if (local20 == 8) {
			local56 = 30;
		} else if (local20 == 7) {
			local56 = 29;
		} else if (local20 == 6) {
			local56 = 28;
		} else if (local20 == 5) {
			local56 = 28;
		} else if (local20 == 4) {
			local56 = 24;
		} else if (local20 == 3) {
			local56 = 23;
		} else if (local20 == 2) {
			local56 = 22;
		} else if (local20 == 1) {
			local56 = 23;
		} else {
			local56 = 19;
		}
		if (arg0.aByteArray17.length - arg0.anInt1480 < local56) {
			return;
		}
		Static184.anInt3503 = arg0.method1378();
		if (Static184.anInt3503 < 1) {
			Static184.anInt3503 = 1;
		} else if (Static184.anInt3503 > 4) {
			Static184.anInt3503 = 4;
		}
		Static303.method4585(arg0.method1378() == 1);
		Static249.aBoolean306 = arg0.method1378() == 1;
		Static239.aBoolean299 = arg0.method1378() == 1;
		Static310.aBoolean382 = arg0.method1378() == 1;
		Static152.aBoolean35 = arg0.method1378() == 1;
		Static94.aBoolean232 = arg0.method1378() == 1;
		Static102.aBoolean113 = arg0.method1378() == 1;
		Static123.aBoolean160 = arg0.method1378() == 1;
		Static192.anInt3641 = arg0.method1378();
		if (Static192.anInt3641 > 2) {
			Static192.anInt3641 = 2;
		}
		if (local20 < 2) {
			Static311.aBoolean384 = arg0.method1378() == 1;
			arg0.method1378();
		} else {
			Static311.aBoolean384 = arg0.method1378() == 1;
		}
		Static187.aBoolean243 = arg0.method1378() == 1;
		Static183.aBoolean241 = arg0.method1378() == 1;
		Static37.anInt771 = arg0.method1378();
		if (Static37.anInt771 > 2) {
			Static37.anInt771 = 2;
		}
		Static111.anInt2296 = Static37.anInt771;
		Static219.aBoolean281 = arg0.method1378() == 1;
		Static64.anInt1228 = arg0.method1378();
		if (Static64.anInt1228 > 127) {
			Static64.anInt1228 = 127;
		}
		Static182.anInt3491 = arg0.method1378();
		Static294.anInt5275 = arg0.method1378();
		if (Static294.anInt5275 > 127) {
			Static294.anInt5275 = 127;
		}
		if (local20 >= 1) {
			Static48.anInt956 = arg0.method1386();
			Static218.anInt1144 = arg0.method1386();
		}
		if (local20 >= 3 && local20 < 6) {
			arg0.method1378();
		}
		if (local20 >= 4) {
			@Pc(372) int local372 = arg0.method1378();
			if (Static207.anInt3958 < 96) {
				local372 = 0;
			}
			Static158.method2721(local372);
		}
		if (local20 >= 5) {
			Static138.anInt2784 = arg0.method1392();
		}
		if (local20 >= 6) {
			Static41.anInt852 = arg0.method1378();
		}
		if (local20 >= 7) {
			Static277.aBoolean341 = arg0.method1378() == 1;
		}
		if (local20 >= 8) {
			Static73.aBoolean87 = arg0.method1378() == 1;
		}
		if (local20 >= 9) {
			Static27.anInt478 = arg0.method1378();
		}
		if (local20 >= 10) {
			Static36.aBoolean28 = arg0.method1378() != 0;
		}
		if (local20 >= 11) {
			Static261.aBoolean326 = arg0.method1378() != 0;
		}
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(BI)Lclient!ac;")
	public static Class4 method3442(@OriginalArg(1) int arg0) {
		@Pc(15) Class4 local15 = (Class4) Static299.aClass187_149.method4527((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(30) byte[] local30 = Static250.aClass121_108.method3115(30, arg0);
		local15 = new Class4();
		if (local30 != null) {
			local15.method22(arg0, new Class1_Sub14(local30));
		}
		Static299.aClass187_149.method4524((long) arg0, local15);
		return local15;
	}

	@OriginalMember(owner = "client!pi", name = "e", descriptor = "(I)V")
	public static void method3443() {
		@Pc(6) int local6 = Static13.aClass1_Sub14_Sub1_1.method1411(8);
		@Pc(19) int local19;
		if (local6 < Static304.anInt5394) {
			for (local19 = local6; local19 < Static304.anInt5394; local19++) {
				Static206.anIntArray315[Static256.anInt4632++] = Static275.anIntArray440[local19];
			}
		}
		if (Static304.anInt5394 < local6) {
			throw new RuntimeException("gppov1");
		}
		Static304.anInt5394 = 0;
		for (local19 = 0; local19 < local6; local19++) {
			@Pc(62) int local62 = Static275.anIntArray440[local19];
			@Pc(66) Class15_Sub5_Sub2 local66 = Static17.aClass15_Sub5_Sub2Array1[local62];
			@Pc(71) int local71 = Static13.aClass1_Sub14_Sub1_1.method1411(1);
			if (local71 == 0) {
				Static275.anIntArray440[Static304.anInt5394++] = local62;
				local66.anInt5563 = Static313.anInt2966;
			} else {
				@Pc(92) int local92 = Static13.aClass1_Sub14_Sub1_1.method1411(2);
				if (local92 == 0) {
					Static275.anIntArray440[Static304.anInt5394++] = local62;
					local66.anInt5563 = Static313.anInt2966;
					Static263.anIntArray425[Static224.anInt4118++] = local62;
				} else {
					@Pc(134) int local134;
					@Pc(144) int local144;
					if (local92 == 1) {
						Static275.anIntArray440[Static304.anInt5394++] = local62;
						local66.anInt5563 = Static313.anInt2966;
						local134 = Static13.aClass1_Sub14_Sub1_1.method1411(3);
						local66.method4689(local134, 1);
						local144 = Static13.aClass1_Sub14_Sub1_1.method1411(1);
						if (local144 == 1) {
							Static263.anIntArray425[Static224.anInt4118++] = local62;
						}
					} else if (local92 == 2) {
						Static275.anIntArray440[Static304.anInt5394++] = local62;
						local66.anInt5563 = Static313.anInt2966;
						if (Static13.aClass1_Sub14_Sub1_1.method1411(1) == 1) {
							local134 = Static13.aClass1_Sub14_Sub1_1.method1411(3);
							local66.method4689(local134, 2);
							local144 = Static13.aClass1_Sub14_Sub1_1.method1411(3);
							local66.method4689(local144, 2);
						} else {
							local134 = Static13.aClass1_Sub14_Sub1_1.method1411(3);
							local66.method4689(local134, 0);
						}
						local134 = Static13.aClass1_Sub14_Sub1_1.method1411(1);
						if (local134 == 1) {
							Static263.anIntArray425[Static224.anInt4118++] = local62;
						}
					} else if (local92 == 3) {
						Static206.anIntArray315[Static256.anInt4632++] = local62;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(IC)C")
	public static char method3444(@OriginalArg(1) char arg0) {
		return arg0 == 'µ' || arg0 == 'ƒ' ? arg0 : Character.toTitleCase(arg0);
	}
}
