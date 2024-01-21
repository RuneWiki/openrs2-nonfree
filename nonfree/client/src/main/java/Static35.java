import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static35 {

	@OriginalMember(owner = "client!ff", name = "D", descriptor = "Lclient!fd;")
	public static Class24 aClass24_9;

	@OriginalMember(owner = "client!ff", name = "L", descriptor = "[I")
	public static int[] anIntArray95;

	@OriginalMember(owner = "client!ff", name = "A", descriptor = "Lclient!je;")
	public static Class40 aClass40_488 = Static69.method1231("oder benutzen Sie eine andere Welt)3");

	@OriginalMember(owner = "client!ff", name = "C", descriptor = "Lclient!je;")
	public static Class40 aClass40_489 = Static69.method1231("Ung-Ultige Verbindung mit einem Anmelde)2Server)3");

	@OriginalMember(owner = "client!ff", name = "F", descriptor = "Lclient!je;")
	public static Class40 aClass40_490 = Static69.method1231("Cabbage");

	@OriginalMember(owner = "client!ff", name = "G", descriptor = "I")
	public static int anInt825 = 0;

	@OriginalMember(owner = "client!ff", name = "H", descriptor = "I")
	public static int anInt826 = 0;

	@OriginalMember(owner = "client!ff", name = "I", descriptor = "Lclient!je;")
	public static Class40 aClass40_491 = Static69.method1231("Bitte entfernen Sie ");

	@OriginalMember(owner = "client!ff", name = "N", descriptor = "[I")
	public static int[] anIntArray96 = new int[2000];

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(II)I")
	public static int method530(@OriginalArg(1) int arg0) {
		@Pc(4) int local4 = arg0 - 1;
		@Pc(10) int local10 = local4 | local4 >>> 1;
		@Pc(16) int local16 = local10 | local10 >>> 2;
		@Pc(26) int local26 = local16 | local16 >>> 4;
		@Pc(32) int local32 = local26 | local26 >>> 8;
		@Pc(38) int local38 = local32 | local32 >>> 16;
		return local38 + 1;
	}

	@OriginalMember(owner = "client!ff", name = "c", descriptor = "(I)V")
	public static void method531() {
		Static54.aClass55_42.method1413();
	}

	@OriginalMember(owner = "client!ff", name = "c", descriptor = "(B)V")
	public static void method532() {
		aClass40_489 = null;
		anIntArray96 = null;
		aClass40_490 = null;
		anIntArray95 = null;
		aClass24_9 = null;
		aClass40_488 = null;
		aClass40_491 = null;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(ZII[BI[Lclient!ee;I)V")
	public static void method533(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class20[] arg4, @OriginalArg(6) int arg5) {
		@Pc(15) int local15;
		for (@Pc(7) int local7 = 0; local7 < 4; local7++) {
			for (@Pc(11) int local11 = 0; local11 < 64; local11++) {
				for (local15 = 0; local15 < 64; local15++) {
					if (arg1 + local11 > 0 && arg1 + local11 < 103 && local15 + arg0 > 0 && arg0 + local15 < 103) {
						arg4[local7].anIntArrayArray8[local11 + arg1][arg0 + local15] &= 0xFEFFFFFF;
					}
				}
			}
		}
		@Pc(92) Class2_Sub9 local92 = new Class2_Sub9(arg2);
		for (local15 = 0; local15 < 4; local15++) {
			for (@Pc(98) int local98 = 0; local98 < 64; local98++) {
				for (@Pc(102) int local102 = 0; local102 < 64; local102++) {
					Static102.method1799(arg5, local92, 0, arg1 + local98, arg3, local15, local102 + arg0);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(BIIIIII)I")
	public static int method534(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if ((arg5 & 0x1) == 1) {
			@Pc(8) int local8 = arg0;
			arg0 = arg4;
			arg4 = local8;
		}
		@Pc(21) int local21 = arg2 & 0x3;
		if (local21 == 0) {
			return arg1;
		} else if (local21 == 1) {
			return 1 + 7 - arg0 - arg3;
		} else if (local21 == 2) {
			return 1 + 7 - arg4 - arg1;
		} else {
			return arg3;
		}
	}
}
