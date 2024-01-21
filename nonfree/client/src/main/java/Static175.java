import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static175 {

	@OriginalMember(owner = "client!vc", name = "d", descriptor = "Z")
	public static boolean aBoolean114;

	@OriginalMember(owner = "client!vc", name = "e", descriptor = "Lclient!vb;")
	public static Class82 aClass82_51;

	@OriginalMember(owner = "client!vc", name = "f", descriptor = "I")
	public static int anInt2851;

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "[I")
	public static int[] anIntArray307 = new int[100];

	@OriginalMember(owner = "client!vc", name = "c", descriptor = "Lclient!tg;")
	public static Class81 aClass81_1026 = Static120.method2057(")4lang)4de");

	@OriginalMember(owner = "client!vc", name = "i", descriptor = "[I")
	public static int[] anIntArray308 = new int[50];

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IILclient!gh;II)V")
	public static void method2237(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub2_Sub1_Sub3_Sub1 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static43.aClass1_Sub2_Sub1_Sub3_Sub1_1 == arg1 || Static118.anInt2616 >= 400) {
			return;
		}
		@Pc(54) Class81 local54;
		if (arg1.anInt1537 == 0) {
			local54 = Static127.method2169(new Class81[] { arg1.aClass81_518, Static86.method1474(arg1.anInt1526, Static43.aClass1_Sub2_Sub1_Sub3_Sub1_1.anInt1526), Static27.aClass81_252, Static139.aClass81_1075, Static149.method2548(arg1.anInt1526), Static38.aClass81_354 });
		} else {
			local54 = Static127.method2169(new Class81[] { arg1.aClass81_518, Static27.aClass81_252, Static65.aClass81_546, Static149.method2548(arg1.anInt1537), Static38.aClass81_354 });
		}
		@Pc(92) int local92;
		if (Static164.anInt3767 == 1) {
			method2242(Static7.aClass81_79, Static127.method2169(new Class81[] { Static132.aClass81_1033, Static19.aClass81_162, local54 }), arg3, (short) 37, arg2, (long) arg0);
		} else if (!Static184.aBoolean172) {
			for (local92 = 7; local92 >= 0; local92--) {
				if (Static170.aClass81Array21[local92] != null) {
					@Pc(100) short local100 = 0;
					if (Static170.aClass81Array21[local92].method2811(Static81.aClass81_636)) {
						if (Static43.aClass1_Sub2_Sub1_Sub3_Sub1_1.anInt1526 < arg1.anInt1526) {
							local100 = 2000;
						}
						if (Static43.aClass1_Sub2_Sub1_Sub3_Sub1_1.anInt1529 != 0 && arg1.anInt1529 != 0) {
							if (Static43.aClass1_Sub2_Sub1_Sub3_Sub1_1.anInt1529 == arg1.anInt1529) {
								local100 = 2000;
							} else {
								local100 = 0;
							}
						}
					} else if (Static81.aBooleanArray8[local92]) {
						local100 = 2000;
					}
					@Pc(159) short local159 = Static11.aShortArray3[local92];
					@Pc(164) short local164 = (short) (local159 + local100);
					method2242(Static170.aClass81Array21[local92], Static127.method2169(new Class81[] { Static29.aClass81_254, local54 }), arg3, local164, arg2, (long) arg0);
				}
			}
		} else if ((Static93.anInt2064 & 0x8) == 8) {
			method2242(Static14.aClass81_127, Static127.method2169(new Class81[] { Static74.aClass81_617, Static19.aClass81_162, local54 }), arg3, (short) 23, arg2, (long) arg0);
		}
		for (local92 = 0; local92 < Static118.anInt2616; local92++) {
			if (Static49.aShortArray11[local92] == 42) {
				Static152.aClass81Array19[local92] = Static127.method2169(new Class81[] { Static29.aClass81_254, local54 });
				return;
			}
		}
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(ILclient!tg;Lclient!ka;)I")
	public static int method2238(@OriginalArg(1) Class81 arg0, @OriginalArg(2) Class1_Sub8 arg1) {
		@Pc(2) int local2 = arg1.anInt446;
		arg1.method354(arg0.anInt3691);
		arg1.anInt446 += Static105.aClass63_1.method2152(arg1.aByteArray3, arg0.anInt3691, arg0.aByteArray41, 0, arg1.anInt446);
		return arg1.anInt446 - local2;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(I)V")
	public static void method2239() {
		anIntArray307 = null;
		anIntArray308 = null;
		aClass81_1026 = null;
		aClass82_51 = null;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lclient!tg;ILclient!tg;ISIJ)V")
	public static void method2242(@OriginalArg(0) Class81 arg0, @OriginalArg(2) Class81 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) short arg3, @OriginalArg(5) int arg4, @OriginalArg(6) long arg5) {
		if (Static149.aBoolean145 || Static118.anInt2616 >= 500) {
			return;
		}
		Static35.aClass81Array2[Static118.anInt2616] = arg0;
		Static152.aClass81Array19[Static118.anInt2616] = arg1;
		Static49.aShortArray11[Static118.anInt2616] = arg3;
		Static65.aLongArray1[Static118.anInt2616] = arg5;
		Static144.anIntArray334[Static118.anInt2616] = arg4;
		Static24.anIntArray35[Static118.anInt2616] = arg2;
		Static118.anInt2616++;
	}
}
