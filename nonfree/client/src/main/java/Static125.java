import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static125 {

	@OriginalMember(owner = "client!na", name = "H", descriptor = "[Lclient!jc;")
	public static Class47[] aClass47Array9;

	@OriginalMember(owner = "client!na", name = "K", descriptor = "I")
	public static int anInt2637;

	@OriginalMember(owner = "client!na", name = "Q", descriptor = "[I")
	public static int[] anIntArray290;

	@OriginalMember(owner = "client!na", name = "N", descriptor = "Lclient!dc;")
	private static final Class20 aClass20_964 = Static161.method2452("Account locked as we suspect it has been stolen)3");

	@OriginalMember(owner = "client!na", name = "J", descriptor = "Lclient!dc;")
	public static Class20 aClass20_963 = aClass20_964;

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(IIZ)V")
	public static void method1962(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static37.method1027(arg0)) {
			Static54.method940(Static155.aClass69ArrayArray1[arg0], arg1);
		}
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(Lclient!kh;IIIIIIZ)V")
	public static void method1964(@OriginalArg(0) Class57 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		@Pc(3) int local3 = arg0.anIntArray227.length;
		@Pc(13) int local13;
		@Pc(20) int local20;
		@Pc(27) int local27;
		@Pc(37) int local37;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			local13 = arg0.anIntArray227[local5] - Static37.anInt1357;
			local20 = arg0.anIntArray228[local5] - Static117.anInt2448;
			local27 = arg0.anIntArray224[local5] - Static132.anInt3725;
			local37 = local27 * arg3 + local13 * arg4 >> 16;
			@Pc(47) int local47 = local27 * arg4 - local13 * arg3 >> 16;
			@Pc(59) int local59 = local20 * arg2 - local47 * arg1 >> 16;
			@Pc(69) int local69 = local20 * arg1 + local47 * arg2 >> 16;
			if (local69 < 50) {
				return;
			}
			if (arg0.anIntArray226 != null) {
				Static102.anIntArray225[local5] = local37;
				Static102.anIntArray218[local5] = local59;
				Static102.anIntArray220[local5] = local69;
			}
			Static102.anIntArray230[local5] = Static149.anInt3059 + (local37 << 9) / local69;
			Static102.anIntArray222[local5] = Static149.anInt3063 + (local59 << 9) / local69;
		}
		Static149.anInt3062 = 0;
		local3 = arg0.anIntArray217.length;
		for (local13 = 0; local13 < local3; local13++) {
			local20 = arg0.anIntArray217[local13];
			local27 = arg0.anIntArray223[local13];
			local37 = arg0.anIntArray216[local13];
			@Pc(142) int local142 = Static102.anIntArray230[local20];
			@Pc(146) int local146 = Static102.anIntArray230[local27];
			@Pc(150) int local150 = Static102.anIntArray230[local37];
			@Pc(154) int local154 = Static102.anIntArray222[local20];
			@Pc(158) int local158 = Static102.anIntArray222[local27];
			@Pc(162) int local162 = Static102.anIntArray222[local37];
			if ((local142 - local146) * (local162 - local158) - (local154 - local158) * (local150 - local146) > 0) {
				if (Static85.aBoolean86 && Static10.method213(Static66.anInt1447 + Static149.anInt3059, Static63.anInt1386 + Static149.anInt3063, local154, local158, local162, local142, local146, local150)) {
					Static97.anInt2043 = arg5;
					Static98.anInt2089 = arg6;
				}
				if (!arg7) {
					Static149.aBoolean135 = false;
					if (local142 < 0 || local146 < 0 || local150 < 0 || local142 > Static149.anInt3060 || local146 > Static149.anInt3060 || local150 > Static149.anInt3060) {
						Static149.aBoolean135 = true;
					}
					if (arg0.anIntArray226 == null || arg0.anIntArray226[local13] == -1) {
						if (arg0.anIntArray219[local13] != 12345678) {
							Static149.method2282(local154, local158, local162, local142, local146, local150, arg0.anIntArray219[local13], arg0.anIntArray229[local13], arg0.anIntArray221[local13]);
						}
					} else if (Static157.aBoolean140) {
						@Pc(369) int local369 = Static149.anInterface1_10.method2489(arg0.anIntArray226[local13]);
						Static149.method2282(local154, local158, local162, local142, local146, local150, Static147.method2261(local369, arg0.anIntArray219[local13]), Static147.method2261(local369, arg0.anIntArray229[local13]), Static147.method2261(local369, arg0.anIntArray221[local13]));
					} else if (arg0.aBoolean94) {
						Static149.method2276(local154, local158, local162, local142, local146, local150, arg0.anIntArray219[local13], arg0.anIntArray229[local13], arg0.anIntArray221[local13], Static102.anIntArray225[0], Static102.anIntArray225[1], Static102.anIntArray225[3], Static102.anIntArray218[0], Static102.anIntArray218[1], Static102.anIntArray218[3], Static102.anIntArray220[0], Static102.anIntArray220[1], Static102.anIntArray220[3], arg0.anIntArray226[local13]);
					} else {
						Static149.method2276(local154, local158, local162, local142, local146, local150, arg0.anIntArray219[local13], arg0.anIntArray229[local13], arg0.anIntArray221[local13], Static102.anIntArray225[local20], Static102.anIntArray225[local27], Static102.anIntArray225[local37], Static102.anIntArray218[local20], Static102.anIntArray218[local27], Static102.anIntArray218[local37], Static102.anIntArray220[local20], Static102.anIntArray220[local27], Static102.anIntArray220[local37], arg0.anIntArray226[local13]);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(BIII)I")
	public static int method1967(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 > 243) {
			arg2 >>= 0x4;
		} else if (arg0 > 217) {
			arg2 >>= 0x3;
		} else if (arg0 > 192) {
			arg2 >>= 0x2;
		} else if (arg0 > 179) {
			arg2 >>= 0x1;
		}
		return (arg0 >> 1) + (arg1 >> 2 << 10) + (arg2 >> 5 << 7);
	}
}
