import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static180 {

	@OriginalMember(owner = "client!mo", name = "e", descriptor = "I")
	public static int anInt3907;

	@OriginalMember(owner = "client!mo", name = "k", descriptor = "Lclient!jj;")
	public static Class87 aClass87_5;

	@OriginalMember(owner = "client!mo", name = "d", descriptor = "I")
	public static int anInt3906 = 0;

	@OriginalMember(owner = "client!mo", name = "g", descriptor = "[F")
	public static float[] aFloatArray9 = new float[4];

	@OriginalMember(owner = "client!mo", name = "l", descriptor = "Ljava/lang/String;")
	public static String aString130 = "You can't add yourself to your own friend list.";

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(II)Lclient!qg;")
	public static Class2_Sub8_Sub20 method3211(@OriginalArg(1) int arg0) {
		@Pc(10) Class2_Sub8_Sub20 local10 = (Class2_Sub8_Sub20) Static19.aClass106_1.method2986((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(28) byte[] local28;
		if (arg0 >= 32768) {
			local28 = Static130.aClass42_36.method1256(0, arg0 & 0x7FFF);
		} else {
			local28 = Static118.aClass42_31.method1256(0, arg0);
		}
		local10 = new Class2_Sub8_Sub20();
		if (local28 != null) {
			local10.method3740(new Class2_Sub16(local28));
		}
		if (arg0 >= 32768) {
			local10.method3736();
		}
		Static19.aClass106_1.method2990((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(ZI)V")
	public static void method3212(@OriginalArg(1) int arg0) {
		@Pc(8) Class2_Sub8_Sub10 local8 = Static92.method1633(3, arg0);
		local8.method2043();
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(IIIIIIII)V")
	public static void method3213(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg4 < 0 || arg5 < 0 || arg4 >= 103 || arg5 >= 103) {
			return;
		}
		@Pc(39) int local39;
		if (arg0 == 0) {
			@Pc(28) Class122 local28 = Static27.method4363(arg2, arg4, arg5);
			if (local28 != null) {
				local39 = (int) (local28.aLong142 >>> 32) & Integer.MAX_VALUE;
				if (arg6 == 2) {
					local28.aClass15_3 = new Class15_Sub4(local39, 2, arg3 + 4, arg2, arg4, arg5, arg1, false, local28.aClass15_3);
					local28.aClass15_2 = new Class15_Sub4(local39, 2, arg3 + 1 & 0x3, arg2, arg4, arg5, arg1, false, local28.aClass15_2);
				} else {
					local28.aClass15_3 = new Class15_Sub4(local39, arg6, arg3, arg2, arg4, arg5, arg1, false, local28.aClass15_3);
				}
			}
		}
		if (arg0 == 1) {
			@Pc(105) Class147 local105 = Static249.method3906(arg2, arg4, arg5);
			if (local105 != null) {
				local39 = Integer.MAX_VALUE & (int) (local105.aLong178 >>> 32);
				if (arg6 == 4 || arg6 == 5) {
					local105.aClass15_5 = new Class15_Sub4(local39, 4, arg3, arg2, arg4, arg5, arg1, false, local105.aClass15_5);
				} else if (arg6 == 6) {
					local105.aClass15_5 = new Class15_Sub4(local39, 4, arg3 + 4, arg2, arg4, arg5, arg1, false, local105.aClass15_5);
				} else if (arg6 == 7) {
					local105.aClass15_5 = new Class15_Sub4(local39, 4, (arg3 + 2 & 0x3) + 4, arg2, arg4, arg5, arg1, false, local105.aClass15_5);
				} else if (arg6 == 8) {
					local105.aClass15_5 = new Class15_Sub4(local39, 4, arg3 + 4, arg2, arg4, arg5, arg1, false, local105.aClass15_5);
					local105.aClass15_4 = new Class15_Sub4(local39, 4, (arg3 + 2 & 0x3) + 4, arg2, arg4, arg5, arg1, false, local105.aClass15_4);
				}
			}
		}
		if (arg0 == 2) {
			if (arg6 == 11) {
				arg6 = 10;
			}
			@Pc(247) Class170 local247 = Static278.method4341(arg2, arg4, arg5);
			if (local247 != null) {
				local247.aClass15_9 = new Class15_Sub4(Integer.MAX_VALUE & (int) (local247.aLong195 >>> 32), arg6, arg3, arg2, arg4, arg5, arg1, false, local247.aClass15_9);
			}
		}
		if (arg0 == 3) {
			@Pc(283) Class191 local283 = Static191.method3296(arg2, arg4, arg5);
			if (local283 != null) {
				local283.aClass15_10 = new Class15_Sub4(Integer.MAX_VALUE & (int) (local283.aLong209 >>> 32), 22, arg3, arg2, arg4, arg5, arg1, false, local283.aClass15_10);
			}
		}
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(IJ)V")
	public static void method3214(@OriginalArg(1) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(3) InterruptedException local3) {
		}
	}

	@OriginalMember(owner = "client!mo", name = "b", descriptor = "(IIIIIIII)V")
	public static void method3216(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (Static268.method4233(arg2)) {
			Static42.method805(Static262.aClass56ArrayArray1[arg2], -1, arg4, arg5, arg3, arg1, arg0, arg6);
		}
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(I)V")
	public static void method3217() {
		while (true) {
			if (Static91.aClass2_Sub16_Sub1_1.method2201(Static218.anInt4451) >= 27) {
				@Pc(18) int local18 = Static91.aClass2_Sub16_Sub1_1.method2202(15);
				if (local18 != 32767) {
					@Pc(25) boolean local25 = false;
					if (Static35.aClass15_Sub2_Sub1Array2[local18] == null) {
						Static35.aClass15_Sub2_Sub1Array2[local18] = new Class15_Sub2_Sub1();
						local25 = true;
					}
					@Pc(41) Class15_Sub2_Sub1 local41 = Static35.aClass15_Sub2_Sub1Array2[local18];
					Static89.anIntArray194[Static57.anInt1448++] = local18;
					local41.anInt5378 = Static268.anInt5236;
					if (local41.aClass188_1 != null && local41.aClass188_1.method4608()) {
						Static38.method717(local41);
					}
					@Pc(71) int local71 = Static91.aClass2_Sub16_Sub1_1.method2202(5);
					@Pc(76) int local76 = Static91.aClass2_Sub16_Sub1_1.method2202(1);
					if (local71 > 15) {
						local71 -= 32;
					}
					if (local76 == 1) {
						Static132.anIntArray303[Static222.anInt4523++] = local18;
					}
					local41.method633(Static60.method1158(Static91.aClass2_Sub16_Sub1_1.method2202(14)));
					@Pc(108) int local108 = Static91.aClass2_Sub16_Sub1_1.method2202(5);
					if (local108 > 15) {
						local108 -= 32;
					}
					@Pc(121) int local121 = Static75.anIntArray158[Static91.aClass2_Sub16_Sub1_1.method2202(3)];
					if (local25) {
						local41.anInt5313 = local41.anInt5373 = local121;
					}
					@Pc(134) int local134 = Static91.aClass2_Sub16_Sub1_1.method2202(1);
					local41.method4285(local41.aClass188_1.anInt5867);
					local41.anInt5338 = local41.aClass188_1.anInt5849;
					local41.anInt5307 = local41.aClass188_1.anInt5856;
					if (local41.anInt5307 == 0) {
						local41.anInt5373 = 0;
					}
					local41.method4287(Static22.aClass15_Sub2_Sub2_1.anIntArray516[0] + local71, Static22.aClass15_Sub2_Sub2_1.anIntArray518[0] + local108, local134 == 1, local41.method4286());
					if (local41.aClass188_1.method4608()) {
						Static256.method4029(null, Static32.anInt876, local41.anIntArray518[0], 0, local41.anIntArray516[0], local41, null, 0);
					}
					continue;
				}
			}
			Static91.aClass2_Sub16_Sub1_1.method2205();
			return;
		}
	}
}
