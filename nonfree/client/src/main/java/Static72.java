import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static72 {

	@OriginalMember(owner = "client!co", name = "e", descriptor = "F")
	public static float aFloat8;

	@OriginalMember(owner = "client!co", name = "d", descriptor = "I")
	public static int anInt1537 = 0;

	@OriginalMember(owner = "client!co", name = "f", descriptor = "[Lclient!hea;")
	public static final Class138[] aClass138Array1 = new Class138[100];

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(Lclient!eh;Z)Lclient!vn;")
	public static Class52 method1294(@OriginalArg(0) Class4_Sub9 arg0) {
		@Pc(15) Class297 local15 = Static192.method3526()[arg0.method6015()];
		@Pc(26) Class58 local26 = Static458.method6443()[arg0.method6015()];
		@Pc(30) int local30 = arg0.method6003();
		@Pc(34) int local34 = arg0.method6003();
		@Pc(38) int local38 = arg0.method5982();
		@Pc(42) int local42 = arg0.method5982();
		@Pc(46) int local46 = arg0.method6003();
		@Pc(50) int local50 = arg0.method6026();
		@Pc(54) int local54 = arg0.method6026();
		return new Class52(local15, local26, local30, local34, local38, local42, local46, local50, local54);
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(II)V")
	public static void method1295(@OriginalArg(0) int arg0) {
		if (arg0 == 37) {
			Static392.aFloat187 = 3.0F;
		} else if (arg0 == 50) {
			Static392.aFloat187 = 4.0F;
		} else if (arg0 == 75) {
			Static392.aFloat187 = 6.0F;
		} else if (arg0 == 100) {
			Static392.aFloat187 = 8.0F;
		} else if (arg0 == 200) {
			Static392.aFloat187 = 16.0F;
		}
		Static70.anInt1454 = -1;
		Static70.anInt1454 = -1;
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(IIILclient!wda;II)V")
	public static void method1296(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class4_Sub51 arg3, @OriginalArg(4) int arg4) {
		if (arg3.anInt9598 == -1 && arg3.anIntArray710 == null) {
			return;
		}
		@Pc(15) int local15 = 0;
		@Pc(23) int local23 = Static189.aClass4_Sub2_Sub1_1.anInt9277 * arg3.anInt9603 >> 8;
		if (arg1 > arg3.anInt9597) {
			local15 = arg1 - arg3.anInt9597;
		} else if (arg1 < arg3.anInt9601) {
			local15 = arg3.anInt9601 - arg1;
		}
		if (arg2 > arg3.anInt9605) {
			local15 += arg2 - arg3.anInt9605;
		} else if (arg2 < arg3.anInt9606) {
			local15 += arg3.anInt9606 - arg2;
		}
		if (arg3.anInt9604 == 0 || arg3.anInt9604 < local15 - 256 || Static189.aClass4_Sub2_Sub1_1.anInt9277 == 0 || arg3.anInt9594 != arg4) {
			if (arg3.aClass4_Sub13_Sub2_3 != null) {
				Static430.aClass4_Sub13_Sub1_1.method2274(arg3.aClass4_Sub13_Sub2_3);
				arg3.aClass4_Sub13_Sub2_3 = null;
				arg3.aClass4_Sub24_3 = null;
				arg3.aClass4_Sub16_Sub1_3 = null;
			}
			if (arg3.aClass4_Sub13_Sub2_4 != null) {
				Static430.aClass4_Sub13_Sub1_1.method2274(arg3.aClass4_Sub13_Sub2_4);
				arg3.aClass4_Sub24_2 = null;
				arg3.aClass4_Sub16_Sub1_4 = null;
				arg3.aClass4_Sub13_Sub2_4 = null;
			}
			return;
		}
		local15 -= 256;
		if (local15 < 0) {
			local15 = 0;
		}
		@Pc(160) int local160 = (arg3.anInt9604 - local15) * local23 / arg3.anInt9604;
		@Pc(233) Class4_Sub13_Sub2 local233;
		if (arg3.aClass4_Sub13_Sub2_3 != null) {
			arg3.aClass4_Sub13_Sub2_3.method3919(local160);
		} else if (arg3.anInt9598 >= 0) {
			if (arg3.aBoolean676) {
				if (arg3.aClass4_Sub24_3 == null) {
					arg3.aClass4_Sub24_3 = Static239.method4066(Static226.aClass31_51, arg3.anInt9598);
				}
				if (arg3.aClass4_Sub24_3 != null) {
					if (arg3.aClass4_Sub16_Sub1_3 == null) {
						arg3.aClass4_Sub16_Sub1_3 = arg3.aClass4_Sub24_3.method4063(new int[] { 22050 });
					}
					if (arg3.aClass4_Sub16_Sub1_3 != null) {
						local233 = Static604.method3905(arg3.aClass4_Sub16_Sub1_3, local160);
						local233.method3914(-1);
						Static430.aClass4_Sub13_Sub1_1.method2272(local233);
						arg3.aClass4_Sub13_Sub2_3 = local233;
					}
				}
			} else {
				@Pc(175) Class277 local175 = Static609.method6077(Static329.aClass31_70, arg3.anInt9598, 0);
				if (local175 != null) {
					@Pc(182) Class4_Sub16_Sub1 local182 = local175.method6080().method2817(Static27.aClass342_1);
					@Pc(187) Class4_Sub13_Sub2 local187 = Static604.method3905(local182, local160);
					local187.method3914(-1);
					Static430.aClass4_Sub13_Sub1_1.method2272(local187);
					arg3.aClass4_Sub13_Sub2_3 = local187;
				}
			}
		}
		if (arg3.aClass4_Sub13_Sub2_4 != null) {
			arg3.aClass4_Sub13_Sub2_4.method3919(local160);
			if (!arg3.aClass4_Sub13_Sub2_4.method8014()) {
				arg3.aClass4_Sub24_2 = null;
				arg3.aClass4_Sub13_Sub2_4 = null;
				arg3.aClass4_Sub16_Sub1_4 = null;
			}
		} else if (arg3.anIntArray710 != null && (arg3.anInt9599 -= arg0) <= 0) {
			@Pc(298) int local298;
			if (arg3.aBoolean677) {
				if (arg3.aClass4_Sub24_2 == null) {
					local298 = (int) ((double) arg3.anIntArray710.length * Math.random());
					arg3.aClass4_Sub24_2 = Static239.method4066(Static226.aClass31_51, arg3.anIntArray710[local298]);
				}
				if (arg3.aClass4_Sub24_2 != null) {
					if (arg3.aClass4_Sub16_Sub1_4 == null) {
						arg3.aClass4_Sub16_Sub1_4 = arg3.aClass4_Sub24_2.method4063(new int[] { 22050 });
					}
					if (arg3.aClass4_Sub16_Sub1_4 != null) {
						local233 = Static604.method3905(arg3.aClass4_Sub16_Sub1_4, local160);
						local233.method3914(0);
						Static430.aClass4_Sub13_Sub1_1.method2272(local233);
						arg3.aClass4_Sub13_Sub2_4 = local233;
						arg3.anInt9599 = (int) ((double) (arg3.anInt9596 - arg3.anInt9600) * Math.random()) + arg3.anInt9600;
						return;
					}
				}
				return;
			}
			local298 = (int) ((double) arg3.anIntArray710.length * Math.random());
			@Pc(373) Class277 local373 = Static609.method6077(Static329.aClass31_70, arg3.anIntArray710[local298], 0);
			if (local373 != null) {
				@Pc(380) Class4_Sub16_Sub1 local380 = local373.method6080().method2817(Static27.aClass342_1);
				@Pc(385) Class4_Sub13_Sub2 local385 = Static604.method3905(local380, local160);
				local385.method3914(0);
				Static430.aClass4_Sub13_Sub1_1.method2272(local385);
				arg3.anInt9599 = (int) ((double) (arg3.anInt9596 - arg3.anInt9600) * Math.random()) + arg3.anInt9600;
				arg3.aClass4_Sub13_Sub2_4 = local385;
				return;
			}
		}
	}
}
