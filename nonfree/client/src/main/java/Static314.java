import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static314 {

	@OriginalMember(owner = "client!lf", name = "F", descriptor = "I")
	public static int anInt6404 = 0;

	@OriginalMember(owner = "client!lf", name = "K", descriptor = "Lclient!qi;")
	public static final Class275 aClass275_4 = new Class275(9, 2);

	@OriginalMember(owner = "client!lf", name = "O", descriptor = "Lclient!mq;")
	public static final Class218 aClass218_77 = new Class218(98, 0);

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "([IZ[ILclient!dv;[I)V")
	public static void method5349(@OriginalArg(0) int[] arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) Class2_Sub3_Sub1_Sub2_Sub1 arg2, @OriginalArg(4) int[] arg3) {
		for (@Pc(12) int local12 = 0; local12 < arg0.length; local12++) {
			@Pc(18) int local18 = arg0[local12];
			@Pc(22) int local22 = arg3[local12];
			@Pc(26) int local26 = arg1[local12];
			for (@Pc(28) int local28 = 0; local22 != 0 && local28 < arg2.aClass98Array3.length; local28++) {
				if ((local22 & 0x1) != 0) {
					if (local18 == -1) {
						arg2.aClass98Array3[local28] = null;
					} else {
						@Pc(42) Class290 local42 = Static618.aClass222_2.method5867(local18);
						@Pc(45) int local45 = local42.anInt8682;
						@Pc(50) Class98 local50 = arg2.aClass98Array3[local28];
						if (local50 != null) {
							if (local50.anInt3718 == local18) {
								if (local45 == 0) {
									local50 = arg2.aClass98Array3[local28] = null;
								} else if (local45 == 1) {
									local50.anInt3714 = 0;
									local50.anInt3711 = 0;
									local50.anInt3712 = local26;
									local50.anInt3717 = 0;
									local50.anInt3713 = 1;
									if (!arg2.aBoolean533) {
										Static349.method5726(0, local42, arg2);
									}
								} else if (local45 == 2) {
									local50.anInt3717 = 0;
								}
							} else if (local42.anInt8688 >= Static618.aClass222_2.method5867(local50.anInt3718).anInt8688) {
								local50 = arg2.aClass98Array3[local28] = null;
							}
						}
						if (local50 == null) {
							local50 = arg2.aClass98Array3[local28] = new Class98();
							local50.anInt3717 = 0;
							local50.anInt3714 = 0;
							local50.anInt3713 = 1;
							local50.anInt3718 = local18;
							local50.anInt3712 = local26;
							local50.anInt3711 = 0;
							if (!arg2.aBoolean533) {
								Static349.method5726(0, local42, arg2);
							}
						}
					}
				}
				local22 >>>= 0x1;
			}
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(ZII)V")
	public static void method5350(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static565.anInt9608 != 0) {
			if (arg0 < 0) {
				for (@Pc(11) int local11 = 0; local11 < 16; local11++) {
					Static102.anIntArray598[local11] = arg1;
				}
			} else {
				Static102.anIntArray598[arg0] = arg1;
			}
		}
		Static522.aClass3_Sub7_Sub5_4.method6021(arg0, arg1);
	}

	@OriginalMember(owner = "client!lf", name = "f", descriptor = "(I)V")
	public static void method5351() {
		if (!Static17.aBoolean20) {
			return;
		}
		while (true) {
			while (Static408.anInt7671 < Static199.aClass153_Sub1Array1.length) {
				@Pc(30) Class153_Sub1 local30 = Static199.aClass153_Sub1Array1[Static408.anInt7671];
				if (local30 != null && local30.anInt5585 == -1) {
					if (Static412.aClass3_Sub14_2 == null) {
						Static412.aClass3_Sub14_2 = Static231.aClass282_1.method6996(local30.aString52);
					}
					@Pc(53) int local53 = Static412.aClass3_Sub14_2.anInt1404;
					if (local53 == -1) {
						return;
					}
					local30.anInt5585 = local53;
					Static408.anInt7671++;
					Static412.aClass3_Sub14_2 = null;
				} else {
					Static408.anInt7671++;
				}
			}
			return;
		}
	}
}
