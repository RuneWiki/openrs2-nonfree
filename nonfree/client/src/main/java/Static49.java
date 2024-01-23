import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static49 {

	@OriginalMember(owner = "client!dd", name = "L", descriptor = "Z")
	public static boolean aBoolean84;

	@OriginalMember(owner = "client!dd", name = "S", descriptor = "I")
	public static int anInt1235;

	@OriginalMember(owner = "client!dd", name = "K", descriptor = "I")
	public static int anInt1230 = 0;

	@OriginalMember(owner = "client!dd", name = "U", descriptor = "Z")
	public static boolean aBoolean87 = true;

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(IZ)Z")
	public static boolean method913(@OriginalArg(0) int arg0) {
		@Pc(33) int local33;
		@Pc(35) int local35;
		@Pc(75) int local75;
		@Pc(79) int local79;
		if (Static274.aClass2_Sub8_Sub1_Sub1_4 == null) {
			if (Static116.aBoolean184 || Static58.aClass2_Sub8_Sub1_6 == null) {
				Static274.aClass2_Sub8_Sub1_Sub1_4 = new Class2_Sub8_Sub1_Sub1(512, 512);
			} else {
				Static274.aClass2_Sub8_Sub1_Sub1_4 = (Class2_Sub8_Sub1_Sub1) Static58.aClass2_Sub8_Sub1_6;
			}
			@Pc(30) int[] local30 = Static274.aClass2_Sub8_Sub1_Sub1_4.anIntArray340;
			local33 = local30.length;
			for (local35 = 0; local35 < local33; local35++) {
				local30[local35] = 1;
			}
			for (local35 = 1; local35 < 103; local35++) {
				local75 = (103 - local35) * 4 * 512 + 24628;
				for (local79 = 1; local79 < 103; local79++) {
					if ((Static13.aByteArrayArrayArray2[arg0][local79][local35] & 0x18) == 0) {
						Static222.method3676(local30, local75, arg0, local79, local35);
					}
					if (arg0 < 3 && (Static13.aByteArrayArrayArray2[arg0 + 1][local79][local35] & 0x8) != 0) {
						Static222.method3676(local30, local75, arg0 + 1, local79, local35);
					}
					local75 += 4;
				}
			}
			Static277.anInt5481 = 0;
			for (local35 = 0; local35 < 104; local35++) {
				for (local75 = 0; local75 < 104; local75++) {
					@Pc(166) long local166 = Static202.method2141(arg0, local35 + 0, local75);
					if (local166 == 0L) {
						local166 = Static166.method3026(arg0, local35 + 0, local75);
					}
					if (local166 == 0L) {
						local166 = Static160.method4114(arg0, local35 + 0, local75);
					}
					if (local166 == 0L) {
						local166 = Static89.method1579(arg0, local35 + 0, local75);
					}
					if (local166 != 0L) {
						@Pc(223) Class146 local223 = Static10.method158((int) (local166 >>> 32) & Integer.MAX_VALUE);
						if (!local223.aBoolean312 || Static108.aBoolean163) {
							@Pc(231) int local231 = local223.anInt4723;
							if (local223.anIntArray467 != null) {
								for (@Pc(237) int local237 = 0; local237 < local223.anIntArray467.length; local237++) {
									if (local223.anIntArray467[local237] != -1) {
										@Pc(260) Class146 local260 = Static10.method158(local223.anIntArray467[local237]);
										if (local260.anInt4723 >= 0) {
											local231 = local260.anInt4723;
										}
									}
								}
							}
							if (local231 >= 0) {
								@Pc(276) boolean local276 = false;
								@Pc(280) Class10 local280 = Static48.method890(local231);
								if (local280 != null && local280.aBoolean16) {
									local276 = true;
								}
								@Pc(292) int local292 = local75;
								@Pc(296) int local296 = local35;
								if (local276) {
									@Pc(304) int[][] local304 = Static89.aClass154Array1[arg0].anIntArrayArray32;
									for (@Pc(306) int local306 = 0; local306 < 10; local306++) {
										@Pc(314) int local314 = (int) (Math.random() * 4.0D);
										if (local314 == 0 && local296 > 0 && local35 - 3 < local296 && (local304[local296 - 1][local292] & 0x2C0108) == 0) {
											local296--;
										}
										if (local314 == 1 && local296 < 103 && local35 + 3 > local296 && (local304[local296 + 1][local292] & 0x2C0180) == 0) {
											local296++;
										}
										if (local314 == 2 && local292 > 0 && local292 > local75 - 3 && (local304[local296][local292 - 1] & 0x2C0102) == 0) {
											local292--;
										}
										if (local314 == 3 && local292 < 103 && local292 < local75 + 3 && (local304[local296][local292 + 1] & 0x2C0120) == 0) {
											local292++;
										}
									}
								}
								Static120.anIntArray234[Static277.anInt5481] = local223.anInt4724;
								Static81.anIntArray166[Static277.anInt5481] = local296;
								Static263.anIntArray494[Static277.anInt5481] = local292;
								Static277.anInt5481++;
							}
						}
					}
				}
			}
		}
		Static274.aClass2_Sub8_Sub1_Sub1_4.method2787();
		local33 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
		@Pc(497) int local497 = ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (((int) (Math.random() * 20.0D)) + 238 - 10 << 16) + (int) (Math.random() * 20.0D) + 238 - 10;
		for (local35 = 1; local35 < 103; local35++) {
			for (local75 = 1; local75 < 103; local75++) {
				if ((Static13.aByteArrayArrayArray2[arg0][local75][local35] & 0x18) == 0 && !Static130.method2395(local33, local75, local497, arg0, local35)) {
					if (Static116.aBoolean184) {
						Static77.anIntArray163 = null;
					} else {
						Static179.aClass3_1.method4441();
					}
					return false;
				}
				if (arg0 < 3 && (Static13.aByteArrayArrayArray2[arg0 + 1][local75][local35] & 0x8) != 0 && !Static130.method2395(local33, local75, local497, arg0 + 1, local35)) {
					if (Static116.aBoolean184) {
						Static77.anIntArray163 = null;
					} else {
						Static179.aClass3_1.method4441();
					}
					return false;
				}
			}
		}
		if (Static116.aBoolean184) {
			@Pc(614) int[] local614 = Static274.aClass2_Sub8_Sub1_Sub1_4.anIntArray340;
			local75 = local614.length;
			for (local79 = 0; local79 < local75; local79++) {
				if (local614[local79] == 0) {
					local614[local79] = 1;
				}
			}
			Static58.aClass2_Sub8_Sub1_6 = new Class2_Sub8_Sub1_Sub2(Static274.aClass2_Sub8_Sub1_Sub1_4);
		} else {
			Static58.aClass2_Sub8_Sub1_6 = Static274.aClass2_Sub8_Sub1_Sub1_4;
		}
		if (Static116.aBoolean184) {
			Static77.anIntArray163 = null;
		} else {
			Static179.aClass3_1.method4441();
		}
		Static274.aClass2_Sub8_Sub1_Sub1_4 = null;
		return true;
	}

	@OriginalMember(owner = "client!dd", name = "g", descriptor = "(I)V")
	public static void method914() {
		Static291.aClass157_43.method4033();
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(ILclient!g;III)V")
	public static void method915(@OriginalArg(0) int arg0, @OriginalArg(1) Class56 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static116.aBoolean184) {
			Static111.method1895(arg0, arg2, arg0 + arg1.anInt2057, arg1.anInt2031 + arg2);
		}
		if (Static180.anInt3906 >= 3) {
			if (Static116.aBoolean184) {
				@Pc(25) Class2_Sub8_Sub1 local25 = arg1.method1555(false);
				if (local25 != null) {
					local25.method4364(arg0, arg2);
				}
			} else {
				Static77.method1449(arg0, arg2, arg1.anIntArray181, arg1.anIntArray176);
			}
		} else if (Static116.aBoolean184) {
			((Class2_Sub8_Sub1_Sub2) Static229.aClass2_Sub8_Sub1_11).method4378(arg0, arg2, arg1.anInt2057, arg1.anInt2031, Static229.aClass2_Sub8_Sub1_11.anInt5514 / 2, Static229.aClass2_Sub8_Sub1_11.anInt5517 / 2, (int) Static239.aFloat51, 256, (Class2_Sub8_Sub1_Sub2) arg1.method1555(false));
		} else {
			((Class2_Sub8_Sub1_Sub1) Static229.aClass2_Sub8_Sub1_11).method2771(arg0, arg2, arg1.anInt2057, arg1.anInt2031, Static229.aClass2_Sub8_Sub1_11.anInt5514 / 2, Static229.aClass2_Sub8_Sub1_11.anInt5517 / 2, (int) Static239.aFloat51, arg1.anIntArray181, arg1.anIntArray176);
		}
		Static214.aBooleanArray19[arg3] = true;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(IB)V")
	public static void method916() {
		Static291.aClass157_43.method4034(5);
	}

	@OriginalMember(owner = "client!dd", name = "c", descriptor = "(II)I")
	public static int method917(@OriginalArg(1) int arg0) {
		return arg0 & 0x7F;
	}
}
