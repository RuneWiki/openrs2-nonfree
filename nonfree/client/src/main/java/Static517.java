import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static517 {

	@OriginalMember(owner = "client!si", name = "a", descriptor = "Lclient!hu;")
	public static Class21 aClass21_30;

	@OriginalMember(owner = "client!si", name = "c", descriptor = "Lclient!oh;")
	public static Class237 aClass237_125;

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(Lclient!ha;B)V")
	public static void method7402(@OriginalArg(0) Class16 arg0) {
		if (Static123.aClass43_20.method1430() == 0) {
			return;
		}
		@Pc(28) Class8_Sub21 local28;
		if (Static155.aClass8_Sub25_6.aClass36_Sub19_2.method6358() == 0) {
			for (local28 = (Class8_Sub21) Static123.aClass43_20.method1422(); local28 != null; local28 = (Class8_Sub21) Static123.aClass43_20.method1426()) {
				Static497.aClass258_21.method6644(local28.anInt3595, local28.anInt3596, local28.anInt3597, Static87.aClass27_21, arg0, local28.anInt3594, false, local28.aBoolean262 ? Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2.aClass337_1 : null, arg0, local28.anInt3598, false);
				local28.method8640();
			}
			Static121.method2707();
			return;
		}
		if (Static323.aClass16_13 == null) {
			@Pc(75) Canvas local75 = new Canvas();
			local75.setSize(36, 32);
			Static323.aClass16_13 = Static508.method7342(Static118.anInterface2_10, 0, Static636.aClass237_150, 0, local75);
			Static484.aClass27_16 = Static323.aClass16_13.method6088(Static288.method3439(Static264.aClass237_69, Static241.anInt5385), Static647.method3297(Static630.aClass237_149, Static241.anInt5385));
		}
		for (local28 = (Class8_Sub21) Static123.aClass43_20.method1422(); local28 != null; local28 = (Class8_Sub21) Static123.aClass43_20.method1426()) {
			Static497.aClass258_21.method6644(local28.anInt3595, local28.anInt3596, local28.anInt3597, Static484.aClass27_16, arg0, local28.anInt3594, false, local28.aBoolean262 ? Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2.aClass337_1 : null, Static323.aClass16_13, local28.anInt3598, false);
			local28.method8640();
		}
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "([II[I[ILclient!efa;)V")
	public static void method7403(@OriginalArg(0) int[] arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) Class15_Sub1_Sub2_Sub2_Sub1 arg3) {
		for (@Pc(7) int local7 = 0; local7 < arg1.length; local7++) {
			@Pc(13) int local13 = arg1[local7];
			@Pc(17) int local17 = arg0[local7];
			@Pc(21) int local21 = arg2[local7];
			@Pc(23) int local23 = 0;
			while (local17 != 0 && local23 < arg3.aClass96Array3.length) {
				if ((local17 & 0x1) != 0) {
					if (local13 == -1) {
						arg3.aClass96Array3[local23] = null;
					} else {
						@Pc(44) Class97 local44 = Static28.aClass220_1.method5670(local13);
						@Pc(47) int local47 = local44.anInt3603;
						@Pc(52) Class96 local52 = arg3.aClass96Array3[local23];
						if (local52 != null) {
							if (local13 == local52.anInt3579) {
								if (local47 == 0) {
									local52 = arg3.aClass96Array3[local23] = null;
								} else if (local47 == 1) {
									local52.anInt3585 = 0;
									local52.anInt3587 = local21;
									local52.anInt3581 = 0;
									local52.anInt3584 = 1;
									local52.anInt3586 = 0;
									if (!arg3.aBoolean583) {
										Static522.method7447(arg3, local44, 0);
									}
								} else if (local47 == 2) {
									local52.anInt3585 = 0;
								}
							} else if (local44.anInt3613 >= Static28.aClass220_1.method5670(local52.anInt3579).anInt3613) {
								local52 = arg3.aClass96Array3[local23] = null;
							}
						}
						if (local52 == null) {
							local52 = arg3.aClass96Array3[local23] = new Class96();
							local52.anInt3585 = 0;
							local52.anInt3579 = local13;
							local52.anInt3581 = 0;
							local52.anInt3587 = local21;
							local52.anInt3584 = 1;
							local52.anInt3586 = 0;
							if (!arg3.aBoolean583) {
								Static522.method7447(arg3, local44, 0);
							}
						}
					}
				}
				local23++;
				local17 >>>= 0x1;
			}
		}
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(BLjava/lang/String;)I")
	public static int method7404(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return -1;
		}
		for (@Pc(9) int local9 = 0; local9 < Static530.anInt9157; local9++) {
			if (arg0.equalsIgnoreCase(Static54.aStringArray6[local9])) {
				return local9;
			}
		}
		return -1;
	}
}
