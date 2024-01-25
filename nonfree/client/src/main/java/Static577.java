import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static577 {

	@OriginalMember(owner = "client!tj", name = "D", descriptor = "Lclient!mc;")
	public static Class235 aClass235_1;

	@OriginalMember(owner = "client!tj", name = "F", descriptor = "I")
	public static int anInt9150 = -1;

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(I)Lclient!waa;")
	public static Class31_Sub1 method7765() {
		return Static491.aClass31_Sub1Array7.length > Static67.anInt9118 ? Static491.aClass31_Sub1Array7[Static67.anInt9118++] : null;
	}

	@OriginalMember(owner = "client!tj", name = "b", descriptor = "(Z)V")
	public static void method7767() {
		Static355.aClass16_6.method8134(Static623.aFloat188, Static587.aFloat192, Static530.aFloat189);
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(ZII)Lclient!jq;")
	public static Class3_Sub29 method7771(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		@Pc(21) long local21 = (long) (arg1 | (arg0 ? Integer.MIN_VALUE : 0));
		return (Class3_Sub29) Static106.aClass62_11.method1682(local21);
	}

	@OriginalMember(owner = "client!tj", name = "c", descriptor = "(B)V")
	public static void method7773() {
		@Pc(9) int[] local9 = new int[Static237.aClass371_2.anInt9754];
		@Pc(11) int local11 = 0;
		for (@Pc(13) int local13 = 0; local13 < Static237.aClass371_2.anInt9754; local13++) {
			@Pc(20) Class146 local20 = Static237.aClass371_2.method8305(local13);
			if (local20.anInt3671 >= 0 || local20.anInt3674 >= 0) {
				local9[local11++] = local13;
			}
		}
		Static623.anIntArray557 = new int[local11];
		for (@Pc(51) int local51 = 0; local51 < local11; local51++) {
			Static623.anIntArray557[local51] = local9[local51];
		}
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "([I[I[IBLclient!fl;)V")
	public static void method7774(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) Class23_Sub2_Sub1_Sub2_Sub1 arg3) {
		for (@Pc(3) int local3 = 0; local3 < arg1.length; local3++) {
			@Pc(9) int local9 = arg1[local3];
			@Pc(13) int local13 = arg2[local3];
			@Pc(17) int local17 = arg0[local3];
			@Pc(19) int local19 = 0;
			while (local13 != 0 && arg3.aClass140Array3.length > local19) {
				if ((local13 & 0x1) != 0) {
					if (local9 == -1) {
						arg3.aClass140Array3[local19] = null;
					} else {
						@Pc(36) Class48 local36 = Static483.aClass373_2.method8323(local9);
						@Pc(39) int local39 = local36.anInt1546;
						@Pc(44) Class140 local44 = arg3.aClass140Array3[local19];
						if (local44 != null) {
							if (local9 == local44.anInt3493) {
								if (local39 == 0) {
									local44 = arg3.aClass140Array3[local19] = null;
								} else if (local39 == 1) {
									local44.anInt3496 = 0;
									local44.anInt3497 = 1;
									local44.anInt3495 = local17;
									local44.anInt3494 = 0;
									local44.anInt3492 = 0;
									if (!arg3.aBoolean747) {
										Static4.method49(arg3, local36, 0);
									}
								} else if (local39 == 2) {
									local44.anInt3496 = 0;
								}
							} else if (local36.anInt1550 >= Static483.aClass373_2.method8323(local44.anInt3493).anInt1550) {
								local44 = arg3.aClass140Array3[local19] = null;
							}
						}
						if (local44 == null) {
							local44 = arg3.aClass140Array3[local19] = new Class140();
							local44.anInt3496 = 0;
							local44.anInt3492 = 0;
							local44.anInt3497 = 1;
							local44.anInt3495 = local17;
							local44.anInt3494 = 0;
							local44.anInt3493 = local9;
							if (!arg3.aBoolean747) {
								Static4.method49(arg3, local36, 0);
							}
						}
					}
				}
				local19++;
				local13 >>>= 0x1;
			}
		}
	}
}
