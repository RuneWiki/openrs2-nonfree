import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static141 {

	@OriginalMember(owner = "client!q", name = "U", descriptor = "I")
	public static int anInt3037;

	@OriginalMember(owner = "client!q", name = "V", descriptor = "Lclient!a;")
	public static Class1_Sub1 aClass1_Sub1_22;

	@OriginalMember(owner = "client!q", name = "W", descriptor = "Lclient!lc;")
	public static Class54 aClass54_13;

	@OriginalMember(owner = "client!q", name = "P", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_1179 = Static120.method1824("<col=ffffff>");

	@OriginalMember(owner = "client!q", name = "Q", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_1180 = Static120.method1824("Das ist eine Mitglieder)2Welt(Q");

	@OriginalMember(owner = "client!q", name = "R", descriptor = "[Lclient!rd;")
	public static final Class80[] aClass80Array20 = new Class80[200];

	@OriginalMember(owner = "client!q", name = "Y", descriptor = "[I")
	public static final int[] anIntArray391 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(IIIILclient!dd;IJIIII)Z")
	public static boolean method2185(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class3_Sub1_Sub5 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) long arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		return arg4 == null ? true : Static158.method2514(arg0, arg7, arg8, arg9 + 1 - arg7, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6);
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(ZII)I")
	public static int method2186(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(11) int local11 = arg0 + arg1 * 57;
		@Pc(17) int local17 = local11 ^ local11 << 13;
		@Pc(31) int local31 = Integer.MAX_VALUE & (local17 * local17 * 15731 + 789221) * local17 + 1376312589;
		return local31 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(IBLjava/util/Random;)I")
	public static int method2188(@OriginalArg(0) int arg0, @OriginalArg(2) Random arg1) {
		if (arg0 <= 0) {
			throw new IllegalArgumentException();
		} else if (Static9.method166(arg0)) {
			return (int) ((long) arg0 * ((long) arg1.nextInt() & 0xFFFFFFFFL) >> 32);
		} else {
			@Pc(34) int local34 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg0);
			@Pc(42) int local42;
			do {
				local42 = arg1.nextInt();
			} while (local42 >= local34);
			return Static13.method236(arg0, local42);
		}
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(IIIJ)Z")
	public static boolean method2189(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long arg3) {
		@Pc(7) Class3_Sub15 local7 = Static185.aClass3_Sub15ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return false;
		} else if (local7.aClass51_1 != null && local7.aClass51_1.aLong69 == arg3) {
			return true;
		} else if (local7.aClass92_1 != null && local7.aClass92_1.aLong149 == arg3) {
			return true;
		} else if (local7.aClass13_1 != null && local7.aClass13_1.aLong16 == arg3) {
			return true;
		} else {
			for (@Pc(46) int local46 = 0; local46 < local7.anInt2014; local46++) {
				if (local7.aClass4Array3[local46].aLong4 == arg3) {
					return true;
				}
			}
			return false;
		}
	}
}
