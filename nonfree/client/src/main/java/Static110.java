import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static110 {

	@OriginalMember(owner = "client!nb", name = "d", descriptor = "Lclient!j;")
	public static Class41 aClass41_1;

	@OriginalMember(owner = "client!nb", name = "g", descriptor = "[Lclient!sc;")
	public static Class1_Sub2_Sub2_Sub4[] aClass1_Sub2_Sub2_Sub4Array8;

	@OriginalMember(owner = "client!nb", name = "l", descriptor = "Z")
	public static boolean aBoolean104;

	@OriginalMember(owner = "client!nb", name = "m", descriptor = "I")
	public static int anInt2512;

	@OriginalMember(owner = "client!nb", name = "p", descriptor = "Lclient!vb;")
	public static Class82 aClass82_41;

	@OriginalMember(owner = "client!nb", name = "r", descriptor = "Lclient!na;")
	public static Class1_Sub2_Sub2_Sub2_Sub1 aClass1_Sub2_Sub2_Sub2_Sub1_3;

	@OriginalMember(owner = "client!nb", name = "n", descriptor = "Lclient!tg;")
	private static Class81 aClass81_911 = Static120.method2057("go back to the main RuneScape webpage");

	@OriginalMember(owner = "client!nb", name = "e", descriptor = "Lclient!tg;")
	public static Class81 aClass81_909 = aClass81_911;

	@OriginalMember(owner = "client!nb", name = "i", descriptor = "Lclient!tg;")
	public static Class81 aClass81_910 = Static120.method2057("jolt");

	@OriginalMember(owner = "client!nb", name = "j", descriptor = "[[S")
	public static short[][] aShortArrayArray3 = new short[][] { new short[0], new short[0], new short[0], new short[0], new short[0] };

	@OriginalMember(owner = "client!nb", name = "q", descriptor = "I")
	public static int anInt2514 = -1;

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(III)I")
	public static int method1953(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = 1;
		while (arg1 > 1) {
			if ((arg1 & 0x1) != 0) {
				local7 *= arg0;
			}
			arg1 >>= 0x1;
			arg0 *= arg0;
		}
		if (arg1 == 1) {
			return arg0 * local7;
		} else {
			return local7;
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(I)V")
	public static void method1954() {
		aClass81_910 = null;
		aClass81_911 = null;
		aClass81_909 = null;
		aClass1_Sub2_Sub2_Sub4Array8 = null;
		aShortArrayArray3 = null;
		aClass82_41 = null;
		aClass1_Sub2_Sub2_Sub2_Sub1_3 = null;
		aClass41_1 = null;
	}

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "(I)V")
	public static void method1955() {
		for (@Pc(3) int local3 = 0; local3 < Static77.anInt1829; local3++) {
			@Pc(9) int local9 = Static90.anIntArray221[local3];
			@Pc(13) Class1_Sub2_Sub1_Sub3_Sub1 local13 = Static51.aClass1_Sub2_Sub1_Sub3_Sub1Array1[local9];
			@Pc(17) int local17 = Static21.aClass1_Sub8_Sub1_1.method336();
			if ((local17 & 0x8) != 0) {
				local17 += Static21.aClass1_Sub8_Sub1_1.method336() << 8;
			}
			Static89.method3073(local9, local13, local17);
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(ILclient!ud;BBIZI)V")
	public static void method1956(@OriginalArg(0) int arg0, @OriginalArg(1) Class82_Sub1 arg1, @OriginalArg(3) byte arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		@Pc(11) long local11 = (long) (arg3 + (arg5 << 16));
		@Pc(21) Class1_Sub2_Sub10 local21 = (Class1_Sub2_Sub10) Static9.aClass5_3.method134(local11);
		if (local21 != null) {
			return;
		}
		local21 = (Class1_Sub2_Sub10) Static187.aClass5_13.method134(local11);
		if (local21 != null) {
			return;
		}
		local21 = (Class1_Sub2_Sub10) Static71.aClass5_5.method134(local11);
		if (local21 == null) {
			if (!arg4) {
				local21 = (Class1_Sub2_Sub10) Static153.aClass5_10.method134(local11);
				if (local21 != null) {
					return;
				}
			}
			local21 = new Class1_Sub2_Sub10();
			local21.anInt1758 = arg0;
			local21.aClass82_Sub1_9 = arg1;
			local21.aByte2 = arg2;
			if (arg4) {
				Static9.aClass5_3.method138(local21, local11);
				Static66.anInt1658++;
			} else {
				Static2.aClass71_1.method2254(local21);
				Static71.aClass5_5.method138(local21, local11);
				Static117.anInt4121++;
			}
		} else if (arg4) {
			local21.method3072();
			Static9.aClass5_3.method138(local21, local11);
			Static66.anInt1658++;
			Static117.anInt4121--;
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIIIILclient!fb;IJZ)Z")
	public static boolean method1957(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class1_Sub2_Sub1 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) long arg7, @OriginalArg(8) boolean arg8) {
		if (arg5 == null) {
			return true;
		}
		@Pc(7) int local7 = arg1 - arg4;
		@Pc(11) int local11 = arg2 - arg4;
		@Pc(15) int local15 = arg1 + arg4;
		@Pc(19) int local19 = arg2 + arg4;
		if (arg8) {
			if (arg6 > 640 && arg6 < 1408) {
				local19 += 128;
			}
			if (arg6 > 1152 && arg6 < 1920) {
				local15 += 128;
			}
			if (arg6 > 1664 || arg6 < 384) {
				local11 -= 128;
			}
			if (arg6 > 128 && arg6 < 896) {
				local7 -= 128;
			}
		}
		local7 /= 128;
		local11 /= 128;
		local15 /= 128;
		local19 /= 128;
		return Static122.method2151(arg0, local7, local11, local15 + 1 - local7, local19 - local11 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7);
	}
}
