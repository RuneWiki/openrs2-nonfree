import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static36 {

	@OriginalMember(owner = "client!df", name = "k", descriptor = "Lclient!u;")
	public static Class76 aClass76_32;

	@OriginalMember(owner = "client!df", name = "g", descriptor = "Lclient!ad;")
	public static Class4 aClass4_3 = new Class4();

	@OriginalMember(owner = "client!df", name = "i", descriptor = "Lclient!f;")
	public static Class1_Sub9_Sub1 aClass1_Sub9_Sub1_1 = new Class1_Sub9_Sub1(5000);

	@OriginalMember(owner = "client!df", name = "j", descriptor = "Lclient!rf;")
	public static Class70 aClass70_390 = Static49.method1293("Untersuchen");

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(ILclient!h;)V")
	public static void method918(@OriginalArg(1) Applet_Sub1 arg0) {
		if (Static63.anInt1966 != 1) {
			return;
		}
		if (Static170.anInt4392 >= 280 && Static170.anInt4392 <= 294 && Static15.anInt450 >= 4 && Static15.anInt450 <= 18) {
			Static86.method1913(0, 0);
			return;
		}
		if (Static170.anInt4392 >= 295 && Static170.anInt4392 <= 360 && Static15.anInt450 >= 4 && Static15.anInt450 <= 18) {
			Static86.method1913(0, 1);
			return;
		}
		if (Static170.anInt4392 >= 390 && Static170.anInt4392 <= 404 && Static15.anInt450 >= 4 && Static15.anInt450 <= 18) {
			Static86.method1913(1, 0);
			return;
		}
		if (Static170.anInt4392 >= 405 && Static170.anInt4392 <= 470 && Static15.anInt450 >= 4 && Static15.anInt450 <= 18) {
			Static86.method1913(1, 1);
			return;
		}
		if (Static170.anInt4392 >= 500 && Static170.anInt4392 <= 514 && Static15.anInt450 >= 4 && Static15.anInt450 <= 18) {
			Static86.method1913(2, 0);
			return;
		}
		if (Static170.anInt4392 >= 515 && Static170.anInt4392 <= 580 && Static15.anInt450 >= 4 && Static15.anInt450 <= 18) {
			Static86.method1913(2, 1);
			return;
		}
		if (Static170.anInt4392 >= 610 && Static170.anInt4392 <= 624 && Static15.anInt450 >= 4 && Static15.anInt450 <= 18) {
			Static86.method1913(3, 0);
			return;
		}
		if (Static170.anInt4392 >= 625 && Static170.anInt4392 <= 690 && Static15.anInt450 >= 4 && Static15.anInt450 <= 18) {
			Static86.method1913(3, 1);
			return;
		}
		if (Static170.anInt4392 >= 708 && Static15.anInt450 >= 4 && Static170.anInt4392 <= 758 && Static15.anInt450 <= 20) {
			Static89.aBoolean102 = false;
			Static54.aClass1_Sub1_Sub1_Sub4_6.method3031(0, 0);
			Static168.aClass1_Sub1_Sub1_Sub4_8.method3031(382, 0);
			Static66.aClass1_Sub1_Sub1_Sub3_1.method2618(382 - Static66.aClass1_Sub1_Sub1_Sub3_1.anInt3504 / 2, 18);
			return;
		}
		if (Static132.anInt3443 == -1) {
			return;
		}
		@Pc(290) Class12 local290 = Static24.aClass12Array1[Static132.anInt3443];
		if (Static133.aBoolean136 == local290.aBoolean22) {
			@Pc(310) byte[] local310 = Static160.method3210(new Class70[] { local290.aClass70_209, Static75.aClass70_734 }).method2926();
			Static101.aString4 = new String(local310, 0, local310.length);
			if (Static35.anInt2016 != 0) {
				Static35.anInt2016 = 0;
				Static158.anInt4152 = 43594;
				Static58.anInt1874 = 43594;
				Static3.anInt172 = 443;
			}
			Static26.anInt708 = local290.anInt595;
			Static89.aBoolean102 = false;
			Static54.aClass1_Sub1_Sub1_Sub4_6.method3031(0, 0);
			Static168.aClass1_Sub1_Sub1_Sub4_8.method3031(382, 0);
			Static66.aClass1_Sub1_Sub1_Sub3_1.method2618(382 - Static66.aClass1_Sub1_Sub1_Sub3_1.anInt3504 / 2, 18);
			return;
		}
		@Pc(407) Class70 local407 = Static160.method3210(new Class70[] { Static7.aClass70_93, local290.aClass70_209, Static75.aClass70_734, Static35.aClass70_630, Static11.aClass70_131, Static34.method873(Static79.aBoolean91 ? 1 : 0), Static79.aClass70_804, Static34.method873(Static19.anInt535), Static78.aClass70_793, Static34.method873(Static130.anInt3423) });
		try {
			arg0.getAppletContext().showDocument(local407.method2897(), "_self");
			return;
		} catch (@Pc(416) Exception local416) {
			return;
		}
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(III)V")
	public static void method919(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(22) int local22;
		if (Static22.anInt596 != arg1) {
			Static167.anIntArray417 = new int[arg1];
			for (local22 = 0; local22 < arg1; local22++) {
				Static167.anIntArray417[local22] = (local22 << 12) / arg1;
			}
			Static28.anInt833 = arg1 - 1;
			Static22.anInt596 = arg1;
		}
		if (Static181.anInt4508 == arg0) {
			return;
		}
		Static160.anIntArray399 = new int[arg0];
		for (local22 = 0; local22 < arg0; local22++) {
			Static160.anIntArray399[local22] = (local22 << 12) / arg0;
		}
		Static14.anInt436 = arg0 - 1;
		Static181.anInt4508 = arg0;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(IIIIIIII)V")
	public static void method920(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(3) Class64 local3 = new Class64();
		local3.anInt3451 = arg2 / 128;
		local3.anInt3444 = arg3 / 128;
		local3.anInt3455 = arg4 / 128;
		local3.anInt3463 = arg5 / 128;
		local3.anInt3456 = arg1;
		local3.anInt3447 = arg2;
		local3.anInt3461 = arg3;
		local3.anInt3449 = arg4;
		local3.anInt3448 = arg5;
		local3.anInt3453 = arg6;
		local3.anInt3458 = arg7;
		Static78.aClass64ArrayArray1[arg0][Static78.anIntArray238[arg0]++] = local3;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(I)V")
	public static void method921() {
		aClass1_Sub9_Sub1_1 = null;
		aClass4_3 = null;
		aClass76_32 = null;
		aClass70_390 = null;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(ZILclient!u;ZIII)V")
	public static void method922(@OriginalArg(1) int arg0, @OriginalArg(2) Class76 arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		Static47.anInt1655 = arg3;
		Static143.aClass76_111 = arg1;
		Static28.anInt834 = 2;
		Static184.anInt4567 = arg2;
		Static160.anInt4192 = 1;
		Static143.aBoolean142 = false;
		Static144.anInt3804 = arg0;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(B)V")
	public static void method923() {
		for (@Pc(10) Class1_Sub1_Sub4_Sub7 local10 = (Class1_Sub1_Sub4_Sub7) Static144.aClass4_14.method174(); local10 != null; local10 = (Class1_Sub1_Sub4_Sub7) Static144.aClass4_14.method181()) {
			if (local10.anInt4016 != Static56.anInt1784 || local10.anInt4009 < Static47.anInt1654) {
				local10.method3499();
			} else if (local10.anInt4013 <= Static47.anInt1654) {
				if (local10.anInt4005 > 0) {
					@Pc(41) Class1_Sub1_Sub4_Sub2_Sub2 local41 = Static165.aClass1_Sub1_Sub4_Sub2_Sub2Array1[local10.anInt4005 - 1];
					if (local41 != null && local41.anInt2030 >= 0 && local41.anInt2030 < 13312 && local41.anInt2001 >= 0 && local41.anInt2001 < 13312) {
						local10.method3070(Static156.method3142(local41.anInt2030, local10.anInt4016, local41.anInt2001) - local10.anInt4002, local41.anInt2001, Static47.anInt1654, local41.anInt2030);
					}
				}
				if (local10.anInt4005 < 0) {
					@Pc(96) int local96 = -local10.anInt4005 - 1;
					@Pc(101) Class1_Sub1_Sub4_Sub2_Sub1 local101;
					if (local96 == Static177.anInt4484) {
						local101 = Static52.aClass1_Sub1_Sub4_Sub2_Sub1_1;
					} else {
						local101 = Static113.aClass1_Sub1_Sub4_Sub2_Sub1Array1[local96];
					}
					if (local101 != null && local101.anInt2030 >= 0 && local101.anInt2030 < 13312 && local101.anInt2001 >= 0 && local101.anInt2001 < 13312) {
						local10.method3070(Static156.method3142(local101.anInt2030, local10.anInt4016, local101.anInt2001) - local10.anInt4002, local101.anInt2001, Static47.anInt1654, local101.anInt2030);
					}
				}
				local10.method3071(Static72.anInt2243);
				Static134.method2577(Static56.anInt1784, (int) local10.aDouble3, (int) local10.aDouble4, (int) local10.aDouble6, 60, local10, local10.anInt4003, -1L, false);
			}
		}
	}

	@OriginalMember(owner = "client!df", name = "b", descriptor = "(III)Lclient!n;")
	public static Class54 method924(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub17 local7 = Static90.aClass1_Sub17ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass54_1;
	}
}
