import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static153 {

	@OriginalMember(owner = "client!qf", name = "c", descriptor = "[[B")
	public static byte[][] aByteArrayArray33;

	@OriginalMember(owner = "client!qf", name = "g", descriptor = "Lclient!da;")
	public static Class14 aClass14_3;

	@OriginalMember(owner = "client!qf", name = "i", descriptor = "[Lclient!oc;")
	public static Class65[] aClass65Array48;

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "J")
	public static long aLong117 = 0L;

	@OriginalMember(owner = "client!qf", name = "k", descriptor = "Lclient!oc;")
	private static final Class65 aClass65_2025 = Static118.method2249("Location");

	@OriginalMember(owner = "client!qf", name = "b", descriptor = "Lclient!oc;")
	public static Class65 aClass65_2023 = aClass65_2025;

	@OriginalMember(owner = "client!qf", name = "n", descriptor = "Lclient!oc;")
	private static final Class65 aClass65_2027 = Static118.method2249("Service unavailable)3");

	@OriginalMember(owner = "client!qf", name = "d", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_2024 = aClass65_2027;

	@OriginalMember(owner = "client!qf", name = "e", descriptor = "Z")
	public static boolean aBoolean141 = false;

	@OriginalMember(owner = "client!qf", name = "h", descriptor = "D")
	public static double aDouble10 = -1.0D;

	@OriginalMember(owner = "client!qf", name = "l", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_2026 = Static118.method2249("<col=00ff80>");

	@OriginalMember(owner = "client!qf", name = "m", descriptor = "I")
	public static int anInt3525 = 0;

	@OriginalMember(owner = "client!qf", name = "o", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_2028 = Static118.method2249("gelb:");

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(IBIII)V")
	public static void method2676(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg2 <= arg0) {
			Static51.method893(arg3, Static40.anIntArrayArray11[arg1], arg0, arg2);
		} else {
			Static51.method893(arg3, Static40.anIntArrayArray11[arg1], arg2, arg0);
		}
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(ZLclient!wd;)I")
	public static int method2677(@OriginalArg(1) Class97 arg0) {
		@Pc(22) Class1_Sub21 local22 = (Class1_Sub21) Static81.aClass99_5.method3292(((long) arg0.anInt4376 << 32) + (long) arg0.anInt4330);
		return local22 == null ? arg0.anInt4344 : local22.anInt3504;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(III)I")
	public static int method2678(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == -1) {
			return 12345678;
		}
		arg0 = (arg1 & 0x7F) * arg0 >> 7;
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return (arg1 & 0xFF80) + arg0;
	}

	@OriginalMember(owner = "client!qf", name = "b", descriptor = "(III)Lclient!lf;")
	public static Class54 method2679(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub7 local7 = Static83.aClass1_Sub7ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		}
		for (@Pc(13) int local13 = 0; local13 < local7.anInt1677; local13++) {
			@Pc(19) Class54 local19 = local7.aClass54Array2[local13];
			if ((local19.aLong83 >> 29 & 0x3L) == 2L && local19.anInt2639 == arg1 && local19.anInt2632 == arg2) {
				return local19;
			}
		}
		return null;
	}
}
