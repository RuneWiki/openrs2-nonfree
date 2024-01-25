import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static291 {

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "F")
	public static float aFloat120;

	@OriginalMember(owner = "client!ld", name = "c", descriptor = "I")
	public static int anInt5360;

	@OriginalMember(owner = "client!ld", name = "e", descriptor = "I")
	public static int anInt5362;

	@OriginalMember(owner = "client!ld", name = "f", descriptor = "Lclient!ga;")
	public static Class111 aClass111_67;

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(B)V")
	public static void method4573() {
		for (@Pc(3) int local3 = 0; local3 < Static480.anInt8097; local3++) {
			@Pc(9) int local9 = Static542.anIntArray599[local3];
			@Pc(18) Class1_Sub39 local18 = (Class1_Sub39) Static131.aClass356_32.method7796((long) local9);
			if (local18 != null) {
				@Pc(23) Class20_Sub2_Sub4_Sub1_Sub2 local23 = local18.aClass20_Sub2_Sub4_Sub1_Sub2_2;
				Static441.method6335(local23, local23.aClass162_1.anInt4408);
			}
		}
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIIIIZ)V")
	public static void method4575(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) boolean arg4) {
		if ((arg4 ? Static479.aClass1_Sub7_Sub1_1.anInt3102 : Static479.aClass1_Sub7_Sub1_1.anInt3096) != 0 && arg2 != 0 && Static113.anInt2286 < 50 && arg0 != -1) {
			Static450.aClass177Array1[Static113.anInt2286++] = new Class177((byte) (arg4 ? 3 : 2), arg0, arg2, arg1, arg3, 0);
		}
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(Lclient!jd;Z)V")
	public static void method4576(@OriginalArg(0) Class1_Sub20_Sub1 arg0) {
		arg0.method3927();
		@Pc(10) int local10 = 0;
		@Pc(18) int local18;
		@Pc(49) int local49;
		for (@Pc(12) int local12 = 0; local12 < Static60.anInt1505; local12++) {
			local18 = Static346.anIntArray413[local12];
			if ((Static436.aByteArray80[local18] & 0x1) == 0) {
				if (local10 > 0) {
					Static436.aByteArray80[local18] = (byte) (Static436.aByteArray80[local18] | 0x2);
					local10--;
				} else {
					local49 = arg0.method3924(1);
					if (local49 == 0) {
						local10 = Static169.method2583(arg0);
						Static436.aByteArray80[local18] = (byte) (Static436.aByteArray80[local18] | 0x2);
					} else {
						Static557.method7517(arg0, local18);
					}
				}
			}
		}
		arg0.method3932();
		if (local10 != 0) {
			throw new RuntimeException("nsn0");
		}
		arg0.method3927();
		@Pc(127) int local127;
		for (local18 = 0; local18 < Static60.anInt1505; local18++) {
			local49 = Static346.anIntArray413[local18];
			if ((Static436.aByteArray80[local49] & 0x1) != 0) {
				if (local10 > 0) {
					Static436.aByteArray80[local49] = (byte) (Static436.aByteArray80[local49] | 0x2);
					local10--;
				} else {
					local127 = arg0.method3924(1);
					if (local127 == 0) {
						local10 = Static169.method2583(arg0);
						Static436.aByteArray80[local49] = (byte) (Static436.aByteArray80[local49] | 0x2);
					} else {
						Static557.method7517(arg0, local49);
					}
				}
			}
		}
		arg0.method3932();
		if (local10 != 0) {
			throw new RuntimeException("nsn1");
		}
		arg0.method3927();
		@Pc(209) int local209;
		for (local49 = 0; local49 < Static167.anInt3037; local49++) {
			local127 = Static244.anIntArray281[local49];
			if ((Static436.aByteArray80[local127] & 0x1) != 0) {
				if (local10 > 0) {
					Static436.aByteArray80[local127] = (byte) (Static436.aByteArray80[local127] | 0x2);
					local10--;
				} else {
					local209 = arg0.method3924(1);
					if (local209 == 0) {
						local10 = Static169.method2583(arg0);
						Static436.aByteArray80[local127] = (byte) (Static436.aByteArray80[local127] | 0x2);
					} else if (Static569.method7668(local127, arg0)) {
						Static436.aByteArray80[local127] = (byte) (Static436.aByteArray80[local127] | 0x2);
					}
				}
			}
		}
		arg0.method3932();
		if (local10 != 0) {
			throw new RuntimeException("nsn2");
		}
		arg0.method3927();
		for (local127 = 0; local127 < Static167.anInt3037; local127++) {
			local209 = Static244.anIntArray281[local127];
			if ((Static436.aByteArray80[local209] & 0x1) == 0) {
				if (local10 > 0) {
					Static436.aByteArray80[local209] = (byte) (Static436.aByteArray80[local209] | 0x2);
					local10--;
				} else {
					@Pc(304) int local304 = arg0.method3924(1);
					if (local304 == 0) {
						local10 = Static169.method2583(arg0);
						Static436.aByteArray80[local209] = (byte) (Static436.aByteArray80[local209] | 0x2);
					} else if (Static569.method7668(local209, arg0)) {
						Static436.aByteArray80[local209] = (byte) (Static436.aByteArray80[local209] | 0x2);
					}
				}
			}
		}
		arg0.method3932();
		if (local10 != 0) {
			throw new RuntimeException("nsn3");
		}
		Static167.anInt3037 = 0;
		Static60.anInt1505 = 0;
		for (local209 = 1; local209 < 2048; local209++) {
			Static436.aByteArray80[local209] = (byte) (Static436.aByteArray80[local209] >> 1);
			@Pc(373) Class20_Sub2_Sub4_Sub1_Sub1 local373 = Static230.aClass20_Sub2_Sub4_Sub1_Sub1Array6[local209];
			if (local373 == null) {
				Static244.anIntArray281[Static167.anInt3037++] = local209;
			} else {
				Static346.anIntArray413[Static60.anInt1505++] = local209;
			}
		}
	}
}
