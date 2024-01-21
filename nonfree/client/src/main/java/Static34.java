import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static34 {

	@OriginalMember(owner = "client!dh", name = "f", descriptor = "[Lclient!cd;")
	public static Class10[] aClass10Array5;

	@OriginalMember(owner = "client!dh", name = "c", descriptor = "Lclient!cd;")
	public static Class10 aClass10_402 = Static51.method932("Okay");

	@OriginalMember(owner = "client!dh", name = "p", descriptor = "J")
	public static long aLong30 = 0L;

	@OriginalMember(owner = "client!dh", name = "t", descriptor = "Lclient!cf;")
	public static Class12 aClass12_4 = new Class12();

	@OriginalMember(owner = "client!dh", name = "u", descriptor = "Lclient!sa;")
	public static Class72 aClass72_8 = new Class72(64);

	@OriginalMember(owner = "client!dh", name = "x", descriptor = "Lclient!cd;")
	public static Class10 aClass10_403 = Static51.method932("<img=0>");

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(Z)V")
	public static void method678() {
		aClass10_402 = null;
		aClass72_8 = null;
		aClass10Array5 = null;
		aClass12_4 = null;
		aClass10_403 = null;
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(III)I")
	public static int method680(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == -1) {
			return 12345678;
		}
		arg1 = arg1 * (arg0 & 0x7F) / 128;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return arg1 + (arg0 & 0xFF80);
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(ILclient!ac;III)V")
	public static void method681(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub1_Sub2 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static46.anInt1135 >= 400) {
			return;
		}
		if (arg1.anIntArray5 != null) {
			arg1 = arg1.method57();
		}
		if (arg1 == null || !arg1.aBoolean4) {
			return;
		}
		@Pc(26) Class10 local26 = arg1.aClass10_48;
		if (arg1.anInt78 != 0) {
			local26 = Static3.method36(new Class10[] { local26, Static146.method2272(Static119.aClass2_Sub1_Sub3_Sub2_Sub1_1.anInt1348, arg1.anInt78), Static52.aClass10_568, Static132.aClass10_1272, Static164.method2485(arg1.anInt78), Static162.aClass10_1518 });
		}
		if (Static44.anInt1023 == 1) {
			Static144.method2257(arg0, arg2, 9, Static151.aClass10_1426, Static3.method36(new Class10[] { Static163.aClass10_1521, Static88.aClass10_604, local26 }), arg3);
		} else if (!Static69.aBoolean74) {
			@Pc(89) Class10[] local89 = arg1.aClass10Array1;
			if (Static157.aBoolean150) {
				local89 = Static157.method2404(local89);
			}
			@Pc(99) int local99;
			if (local89 != null) {
				for (local99 = 4; local99 >= 0; local99--) {
					if (local89[local99] != null && !local89[local99].method343(Static119.aClass10_1168)) {
						@Pc(118) byte local118 = 0;
						if (local99 == 0) {
							local118 = 19;
						}
						if (local99 == 1) {
							local118 = 7;
						}
						if (local99 == 2) {
							local118 = 16;
						}
						if (local99 == 3) {
							local118 = 58;
						}
						if (local99 == 4) {
							local118 = 29;
						}
						Static144.method2257(arg0, arg2, local118, local89[local99], Static3.method36(new Class10[] { Static50.aClass10_559, local26 }), arg3);
					}
				}
			}
			if (local89 != null) {
				for (local99 = 4; local99 >= 0; local99--) {
					if (local89[local99] != null && local89[local99].method343(Static119.aClass10_1168)) {
						@Pc(196) short local196 = 0;
						if (Static119.aClass2_Sub1_Sub3_Sub2_Sub1_1.anInt1348 < arg1.anInt78) {
							local196 = 2000;
						}
						@Pc(205) int local205 = 0;
						if (local99 == 0) {
							local205 = local196 + 19;
						}
						if (local99 == 1) {
							local205 = local196 + 7;
						}
						if (local99 == 2) {
							local205 = local196 + 16;
						}
						if (local99 == 3) {
							local205 = local196 + 58;
						}
						if (local99 == 4) {
							local205 = local196 + 29;
						}
						Static144.method2257(arg0, arg2, local205, local89[local99], Static3.method36(new Class10[] { Static50.aClass10_559, local26 }), arg3);
					}
				}
			}
			Static144.method2257(arg0, arg2, 1005, Static142.aClass10_1386, Static3.method36(new Class10[] { Static50.aClass10_559, local26 }), arg3);
			return;
		} else if ((Static147.anInt3804 & 0x2) == 2) {
			Static144.method2257(arg0, arg2, 34, Static111.aClass10_1098, Static3.method36(new Class10[] { Static121.aClass10_1190, Static88.aClass10_604, local26 }), arg3);
			return;
		}
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(BILclient!cd;)V")
	public static void method684(@OriginalArg(1) int arg0, @OriginalArg(2) Class10 arg1) {
		Static141.aClass2_Sub11_Sub1_3.method1495(111);
		Static141.aClass2_Sub11_Sub1_3.method1439(arg0);
		Static141.aClass2_Sub11_Sub1_3.method1440(arg1.method363());
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(ZI)Lclient!p;")
	public static Class2_Sub1_Sub13 method686(@OriginalArg(1) int arg0) {
		@Pc(10) Class2_Sub1_Sub13 local10 = (Class2_Sub1_Sub13) Static168.aClass72_26.method2259((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25 = Static61.aClass29_68.method1030(arg0, 5);
		local10 = new Class2_Sub1_Sub13();
		if (local25 != null) {
			local10.method1923(new Class2_Sub11(local25));
		}
		Static168.aClass72_26.method2254(local10, (long) arg0);
		return local10;
	}
}
