import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static359 {

	@OriginalMember(owner = "client!sc", name = "n", descriptor = "I")
	public static int anInt5959 = 0;

	@OriginalMember(owner = "client!sc", name = "r", descriptor = "Lclient!ri;")
	public static final Class214 aClass214_214 = new Class214(0, 8);

	@OriginalMember(owner = "client!sc", name = "z", descriptor = "Lclient!ki;")
	public static final Class137 aClass137_226 = new Class137(14, -1);

	@OriginalMember(owner = "client!sc", name = "A", descriptor = "I")
	public static int anInt5969 = 0;

	@OriginalMember(owner = "client!sc", name = "B", descriptor = "Lclient!ri;")
	public static final Class214 aClass214_215 = new Class214(89, 0);

	@OriginalMember(owner = "client!sc", name = "C", descriptor = "Z")
	public static boolean aBoolean496 = false;

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lclient!ea;IJIILclient!vg;III)V")
	public static void method4648(@OriginalArg(0) Class59 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class250 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(11) int local11 = arg7 * arg7 + arg3 * arg3;
		if ((long) local11 > arg2) {
			return;
		}
		@Pc(38) int local38 = Math.min(arg5.anInt7041 / 2, arg5.anInt6997 / 2);
		if (local11 <= local38 * local38) {
			Static87.method1274(arg0, arg3, arg1, arg7, arg4, arg5, Static406.aClass49Array133[arg6]);
			return;
		}
		local38 -= 10;
		@Pc(66) int local66;
		if (Static100.anInt1781 == 4) {
			local66 = (int) Static95.aFloat27 & 0x3FFF;
		} else {
			local66 = (int) Static95.aFloat27 + Static171.anInt2824 & 0x3FFF;
		}
		@Pc(79) int local79 = Class1_Sub1_Sub25.anIntArray249[local66];
		@Pc(83) int local83 = Class1_Sub1_Sub25.anIntArray248[local66];
		if (Static100.anInt1781 != 4) {
			local79 = local79 * 256 / (Static305.anInt5082 + 256);
			local83 = local83 * 256 / (Static305.anInt5082 + 256);
		}
		@Pc(112) int local112 = local79 * arg7 + arg3 * local83 >> 15;
		@Pc(123) int local123 = arg7 * local83 - arg3 * local79 >> 15;
		@Pc(129) double local129 = Math.atan2((double) local112, (double) local123);
		@Pc(136) int local136 = (int) ((double) local38 * Math.sin(local129));
		@Pc(143) int local143 = (int) ((double) local38 * Math.cos(local129));
		Static185.aClass49Array134[arg6].method5641((float) local136 + (float) arg4 + (float) arg5.anInt7041 / 2.0F, (float) arg1 + (float) arg5.anInt6997 / 2.0F - (float) local143, 4096, (int) (-local129 / 6.283185307179586D * 65535.0D));
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method4649(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (Static266.method2725(arg5)) {
			if (Static11.aClass250ArrayArray1[arg5] == null) {
				Static21.method393(arg4, arg1, Static369.aClass250ArrayArray5[arg5], arg6, arg7, -1, arg3, arg2, arg0);
			} else {
				Static21.method393(arg4, arg1, Static11.aClass250ArrayArray1[arg5], arg6, arg7, -1, arg3, arg2, arg0);
			}
		} else if (arg3 == -1) {
			for (@Pc(15) int local15 = 0; local15 < 100; local15++) {
				Static145.aBooleanArray15[local15] = true;
			}
		} else {
			Static145.aBooleanArray15[arg3] = true;
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(III)I")
	public static int method4650(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return arg0 == 1 || arg0 == 3 ? Static58.anIntArray50[arg1 & 0x3] : Static251.anIntArray214[arg1 & 0x3];
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lclient!kp;ILclient!kp;)V")
	public static void method4651(@OriginalArg(0) Class1 arg0, @OriginalArg(2) Class1 arg1) {
		if (arg0.aClass1_261 != null) {
			arg0.method5617();
		}
		arg0.aClass1_262 = arg1;
		arg0.aClass1_261 = arg1.aClass1_261;
		arg0.aClass1_261.aClass1_262 = arg0;
		arg0.aClass1_262.aClass1_261 = arg0;
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(III)Z")
	public static boolean method4652(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (Static186.method3972(arg0, arg1) | (arg1 & 0x2000) != 0 | Static290.method3790(arg0, arg1)) & Static289.method3776(arg1, arg0);
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIIIIIII)V")
	public static void method4654(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg3 < 0 || arg2 < 0 || Static425.anInt6922 - 1 <= arg3 || arg2 >= Static251.anInt4072 - 1) {
			return;
		}
		if (Static159.aClass82ArrayArrayArray2 == null) {
			return;
		}
		@Pc(46) Interface9 local46;
		if (arg0 == 0) {
			local46 = (Interface9) Static336.method4293(arg5, arg3, arg2);
			@Pc(257) Interface9 local257 = (Interface9) Static195.method2589(arg5, arg3, arg2);
			if (local46 != null && arg1 != 2) {
				if (local46 instanceof Class20_Sub1_Sub1) {
					((Class20_Sub1_Sub1) local46).aClass50_1.method1048(arg4);
				} else {
					Static108.method1514(arg5, arg4, arg1, arg0, arg2, local46.method5124(), arg3, arg6);
				}
			}
			if (local257 != null) {
				if (local257 instanceof Class20_Sub1_Sub1) {
					((Class20_Sub1_Sub1) local257).aClass50_1.method1048(arg4);
				} else {
					Static108.method1514(arg5, arg4, arg1, arg0, arg2, local257.method5124(), arg3, arg6);
				}
			}
		} else if (arg0 == 1) {
			local46 = (Interface9) Static246.method3212(arg5, arg3, arg2);
			if (local46 != null) {
				if (local46 instanceof Class20_Sub4_Sub3) {
					((Class20_Sub4_Sub3) local46).aClass50_4.method1048(arg4);
				} else {
					@Pc(63) int local63 = local46.method5124();
					if (arg1 == 4 || arg1 == 5) {
						Static108.method1514(arg5, arg4, 4, arg0, arg2, local63, arg3, arg6);
					} else if (arg1 == 6) {
						Static108.method1514(arg5, arg4, 4, arg0, arg2, local63, arg3, arg6 + 4);
					} else if (arg1 == 7) {
						Static108.method1514(arg5, arg4, 4, arg0, arg2, local63, arg3, (arg6 + 2 & 0x3) + 4);
					} else if (arg1 == 8) {
						Static108.method1514(arg5, arg4, 4, arg0, arg2, local63, arg3, arg6 + 4);
						Static108.method1514(arg5, arg4, 4, arg0, arg2, local63, arg3, (arg6 + 2 & 0x3) + 4);
					}
				}
			}
		} else if (arg0 == 2) {
			local46 = (Interface9) Static422.method5254(arg5, arg3, arg2, mq.class);
			if (local46 != null) {
				if (arg1 == 11) {
					arg1 = 10;
				}
				if (local46 instanceof Class20_Sub3_Sub6) {
					((Class20_Sub3_Sub6) local46).aClass50_3.method1048(arg4);
				} else {
					Static108.method1514(arg5, arg4, arg1, arg0, arg2, local46.method5124(), arg3, arg6);
				}
			}
		} else if (arg0 == 3) {
			local46 = (Interface9) Static261.method3366(arg5, arg3, arg2);
			if (local46 != null) {
				if (local46 instanceof Class20_Sub2_Sub1) {
					((Class20_Sub2_Sub1) local46).aClass50_2.method1048(arg4);
				} else {
					Static108.method1514(arg5, arg4, arg1, arg0, arg2, local46.method5124(), arg3, arg6);
				}
			}
		}
	}

	@OriginalMember(owner = "client!sc", name = "c", descriptor = "(III)Lclient!vg;")
	public static Class250 method4655(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class250 local7 = Static96.method1379(arg1);
		if (arg0 == -1) {
			return local7;
		} else if (local7 == null || local7.aClass250Array2 == null || arg0 >= local7.aClass250Array2.length) {
			return null;
		} else {
			return local7.aClass250Array2[arg0];
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lclient!oq;I)V")
	public static void method4656(@OriginalArg(0) Class20_Sub3_Sub3_Sub1 arg0) {
		@Pc(19) Class1_Sub42 local19 = (Class1_Sub42) Static374.aClass257_29.method5503((long) arg0.anInt6045);
		if (local19 == null) {
			return;
		}
		if (local19.aClass1_Sub9_Sub1_3 != null) {
			Static155.aClass1_Sub9_Sub2_1.method1038(local19.aClass1_Sub9_Sub1_3);
			local19.aClass1_Sub9_Sub1_3 = null;
		}
		local19.method5617();
	}
}
