import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static373 {

	@OriginalMember(owner = "client!si", name = "J", descriptor = "Lclient!um;")
	public static Class243 aClass243_217;

	@OriginalMember(owner = "client!si", name = "Q", descriptor = "F")
	public static float aFloat147;

	@OriginalMember(owner = "client!si", name = "P", descriptor = "Lclient!jp;")
	public static final Class129 aClass129_166 = new Class129(90, 1);

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(IJLclient!za;)V")
	public static void method4882(@OriginalArg(1) long arg0, @OriginalArg(2) Class200 arg1) {
		Static287.anInt4471 = Static48.anInt889;
		Static399.anInt6517 = 0;
		Static48.anInt889 = 0;
		@Pc(14) long local14 = Static446.method5903();
		for (@Pc(19) Class88_Sub6 local19 = (Class88_Sub6) Static348.aClass107_11.method2326(); local19 != null; local19 = (Class88_Sub6) Static348.aClass107_11.method2327()) {
			if (local19.method5046(arg1, arg0)) {
				Static399.anInt6517++;
			}
		}
		if (Static103.aBoolean120 && arg0 % 100L == 0L) {
			System.out.println("Particle system count: " + Static348.aClass107_11.method2325() + ", running: " + Static399.anInt6517 + ". Particles: " + Static48.anInt889 + ". Time taken: " + (Static446.method5903() - local14) + "ms");
		}
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(IIIIIII)V")
	public static void method4883(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) Class247 local3 = new Class247();
		local3.anInt7101 = arg1 >> Static419.anInt6980;
		local3.anInt7096 = arg2 >> Static419.anInt6980;
		local3.anInt7097 = arg3 >> Static419.anInt6980;
		local3.anInt7113 = arg4 >> Static419.anInt6980;
		local3.anInt7106 = arg0;
		local3.anInt7102 = arg1;
		local3.anInt7108 = arg2;
		local3.anInt7098 = arg3;
		local3.anInt7112 = arg4;
		local3.anInt7109 = arg5;
		local3.anInt7103 = arg6;
		Static243.aClass247Array1[Static188.anInt3158++] = local3;
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(Lclient!uu;Z)V")
	public static void method4885(@OriginalArg(0) Class5_Sub15_Sub2 arg0) {
		@Pc(7) int local7 = 0;
		arg0.method5605();
		@Pc(18) int local18;
		@Pc(46) int local46;
		for (@Pc(12) int local12 = 0; local12 < Static31.anInt622; local12++) {
			local18 = Static334.anIntArray387[local12];
			if ((Static56.aByteArray9[local18] & 0x1) == 0) {
				if (local7 > 0) {
					local7--;
					Static56.aByteArray9[local18] = (byte) (Static56.aByteArray9[local18] | 0x2);
				} else {
					local46 = arg0.method5610(1);
					if (local46 == 0) {
						local7 = Static202.method2689(arg0);
						Static56.aByteArray9[local18] = (byte) (Static56.aByteArray9[local18] | 0x2);
					} else {
						Static421.method5521(arg0, local18);
					}
				}
			}
		}
		arg0.method5612();
		if (local7 != 0) {
			throw new RuntimeException("nsn0");
		}
		arg0.method5605();
		@Pc(124) int local124;
		for (local18 = 0; local18 < Static31.anInt622; local18++) {
			local46 = Static334.anIntArray387[local18];
			if ((Static56.aByteArray9[local46] & 0x1) != 0) {
				if (local7 > 0) {
					Static56.aByteArray9[local46] = (byte) (Static56.aByteArray9[local46] | 0x2);
					local7--;
				} else {
					local124 = arg0.method5610(1);
					if (local124 == 0) {
						local7 = Static202.method2689(arg0);
						Static56.aByteArray9[local46] = (byte) (Static56.aByteArray9[local46] | 0x2);
					} else {
						Static421.method5521(arg0, local46);
					}
				}
			}
		}
		arg0.method5612();
		if (local7 != 0) {
			throw new RuntimeException("nsn1");
		}
		arg0.method5605();
		@Pc(211) int local211;
		for (local46 = 0; local46 < Static288.anInt4491; local46++) {
			local124 = Static62.anIntArray49[local46];
			if ((Static56.aByteArray9[local124] & 0x1) != 0) {
				if (local7 > 0) {
					local7--;
					Static56.aByteArray9[local124] = (byte) (Static56.aByteArray9[local124] | 0x2);
				} else {
					local211 = arg0.method5610(1);
					if (local211 == 0) {
						local7 = Static202.method2689(arg0);
						Static56.aByteArray9[local124] = (byte) (Static56.aByteArray9[local124] | 0x2);
					} else if (Static136.method6009(arg0, local124)) {
						Static56.aByteArray9[local124] = (byte) (Static56.aByteArray9[local124] | 0x2);
					}
				}
			}
		}
		arg0.method5612();
		if (local7 != 0) {
			throw new RuntimeException("nsn2");
		}
		arg0.method5605();
		for (local124 = 0; local124 < Static288.anInt4491; local124++) {
			local211 = Static62.anIntArray49[local124];
			if ((Static56.aByteArray9[local211] & 0x1) == 0) {
				if (local7 > 0) {
					Static56.aByteArray9[local211] = (byte) (Static56.aByteArray9[local211] | 0x2);
					local7--;
				} else {
					@Pc(301) int local301 = arg0.method5610(1);
					if (local301 == 0) {
						local7 = Static202.method2689(arg0);
						Static56.aByteArray9[local211] = (byte) (Static56.aByteArray9[local211] | 0x2);
					} else if (Static136.method6009(arg0, local211)) {
						Static56.aByteArray9[local211] = (byte) (Static56.aByteArray9[local211] | 0x2);
					}
				}
			}
		}
		arg0.method5612();
		if (local7 != 0) {
			throw new RuntimeException("nsn3");
		}
		Static31.anInt622 = 0;
		Static288.anInt4491 = 0;
		for (local211 = 1; local211 < 2048; local211++) {
			Static56.aByteArray9[local211] = (byte) (Static56.aByteArray9[local211] >> 1);
			@Pc(369) Class2_Sub1_Sub3_Sub2 local369 = Static359.aClass2_Sub1_Sub3_Sub2Array1[local211];
			if (local369 == null) {
				Static62.anIntArray49[Static288.anInt4491++] = local211;
			} else {
				Static334.anIntArray387[Static31.anInt622++] = local211;
			}
		}
	}
}
