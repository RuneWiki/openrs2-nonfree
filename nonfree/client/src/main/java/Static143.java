import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static143 {

	@OriginalMember(owner = "client!of", name = "d", descriptor = "Lclient!nb;")
	public static Class15 aClass15_31;

	@OriginalMember(owner = "client!of", name = "c", descriptor = "Lclient!id;")
	public static Class43 aClass43_15 = new Class43(64);

	@OriginalMember(owner = "client!of", name = "e", descriptor = "Lclient!i;")
	private static Class41 aClass41_903 = Static184.method2923("Attack");

	@OriginalMember(owner = "client!of", name = "f", descriptor = "Lclient!i;")
	public static Class41 aClass41_904 = aClass41_903;

	@OriginalMember(owner = "client!of", name = "l", descriptor = "Lclient!i;")
	private static Class41 aClass41_907 = Static184.method2923("Ok");

	@OriginalMember(owner = "client!of", name = "h", descriptor = "Lclient!i;")
	public static Class41 aClass41_905 = aClass41_907;

	@OriginalMember(owner = "client!of", name = "i", descriptor = "I")
	public static volatile int anInt3268 = 0;

	@OriginalMember(owner = "client!of", name = "j", descriptor = "Lclient!i;")
	public static Class41 aClass41_906 = Static184.method2923("p12_full");

	@OriginalMember(owner = "client!of", name = "m", descriptor = "Lclient!i;")
	public static Class41 aClass41_908 = Static184.method2923("Einloggen");

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(ZIII)V")
	public static void method2230(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(4) Class80 local4 = Static34.method675(arg2, arg0);
		if (local4 != null && local4.anObjectArray16 != null) {
			@Pc(13) Class2_Sub5 local13 = new Class2_Sub5();
			local13.aClass80_3 = local4;
			local13.anObjectArray3 = local4.anObjectArray16;
			Static176.method2835(local13);
		}
		Static9.aBoolean16 = true;
		Static31.anInt811 = arg2;
		Static101.anInt2453 = arg1;
		Static15.anInt425 = arg0;
		Static176.method2833(local4);
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(IIII)I")
	public static int method2232(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 > 243) {
			arg2 >>= 0x4;
		} else if (arg1 > 217) {
			arg2 >>= 0x3;
		} else if (arg1 > 192) {
			arg2 >>= 0x2;
		} else if (arg1 > 179) {
			arg2 >>= 0x1;
		}
		return (arg1 >> 1) + (arg0 >> 2 << 10) + (arg2 >> 5 << 7);
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(ZIZ)I")
	public static int method2233() {
		return Static184.anInt4236 + Static179.anInt4160;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(II)V")
	public static void method2234(@OriginalArg(1) int arg0) {
		Static112.method1912();
		Static7.method245();
		@Pc(14) int local14 = Static93.method1626(arg0).anInt4535;
		if (local14 == 0) {
			return;
		}
		@Pc(29) int local29 = Static99.anIntArray243[arg0];
		if (local14 == 1) {
			Static157.anInt3706 = local29;
			if (Static157.anInt3706 == 1) {
				Static155.method2521(0.9F);
			}
			if (Static157.anInt3706 == 2) {
				Static155.method2521(0.8F);
			}
			if (Static157.anInt3706 == 3) {
				Static155.method2521(0.7F);
			}
			if (Static157.anInt3706 == 4) {
				Static155.method2521(0.6F);
			}
			Static180.method2874();
		}
		if (local14 == 3) {
			@Pc(65) short local65 = 0;
			if (local29 == 0) {
				local65 = 255;
			}
			if (local29 == 1) {
				local65 = 192;
			}
			if (local29 == 2) {
				local65 = 128;
			}
			if (local29 == 3) {
				local65 = 64;
			}
			if (local29 == 4) {
				local65 = 0;
			}
			if (Static58.anInt1633 != local65) {
				if (Static58.anInt1633 == 0 && Static2.anInt70 != -1) {
					Static48.method960(Static86.aClass15_Sub1_57, Static2.anInt70, local65);
					Static96.aBoolean127 = false;
				} else if (local65 == 0) {
					Static1.method2636();
					Static96.aBoolean127 = false;
				} else {
					Static90.method1575(local65);
				}
				Static58.anInt1633 = local65;
			}
		}
		if (local14 == 6) {
			Static122.anInt2916 = local29;
		}
		if (local14 == 9) {
			Static140.anInt3231 = local29;
		}
		if (local14 == 4) {
			if (local29 == 0) {
				Static105.anInt2543 = 127;
			}
			if (local29 == 1) {
				Static105.anInt2543 = 96;
			}
			if (local29 == 2) {
				Static105.anInt2543 = 64;
			}
			if (local29 == 3) {
				Static105.anInt2543 = 32;
			}
			if (local29 == 4) {
				Static105.anInt2543 = 0;
			}
		}
		if (local14 == 10) {
			if (local29 == 0) {
				Static198.anInt4450 = 127;
			}
			if (local29 == 1) {
				Static198.anInt4450 = 96;
			}
			if (local29 == 2) {
				Static198.anInt4450 = 64;
			}
			if (local29 == 3) {
				Static198.anInt4450 = 32;
			}
			if (local29 == 4) {
				Static198.anInt4450 = 0;
			}
		}
		if (local14 == 5) {
			Static179.anInt4148 = local29;
		}
	}
}
