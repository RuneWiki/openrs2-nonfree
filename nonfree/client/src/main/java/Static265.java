import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static265 {

	@OriginalMember(owner = "client!qp", name = "g", descriptor = "Lclient!sm;")
	public static Class185 aClass185_7;

	@OriginalMember(owner = "client!qp", name = "b", descriptor = "Lclient!ub;")
	public static final Class198 aClass198_192 = new Class198(50);

	@OriginalMember(owner = "client!qp", name = "h", descriptor = "J")
	public static long aLong161 = 0L;

	@OriginalMember(owner = "client!qp", name = "i", descriptor = "[I")
	public static final int[] anIntArray432 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(I)V")
	public static void method4579() {
		for (@Pc(7) int local7 = 0; local7 < Static2.aByteArrayArrayArray1.length; local7++) {
			for (@Pc(11) int local11 = 0; local11 < Static2.aByteArrayArrayArray1[0].length; local11++) {
				for (@Pc(15) int local15 = 0; local15 < Static2.aByteArrayArrayArray1[0][0].length; local15++) {
					Static2.aByteArrayArrayArray1[local7][local11][local15] = 0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(IIBI)V")
	public static void method4580(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		Static196.anInt6632 = arg0;
		Static116.anInt2757 = arg2;
		Static320.anInt6202 = arg1;
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(BII)V")
	public static void method4581(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static31.anInt797 != arg0) {
			Static339.anIntArray4 = new int[arg0];
			for (@Pc(17) int local17 = 0; local17 < arg0; local17++) {
				Static339.anIntArray4[local17] = (local17 << 12) / arg0;
			}
			Static335.anInt6403 = arg0 - 1;
			Static226.anInt4577 = arg0 * 32;
			Static31.anInt797 = arg0;
		}
		if (Static223.anInt4562 == arg1) {
			return;
		}
		if (Static31.anInt797 == arg1) {
			Static128.anIntArray265 = Static339.anIntArray4;
		} else {
			Static128.anIntArray265 = new int[arg1];
			for (@Pc(64) int local64 = 0; local64 < arg1; local64++) {
				Static128.anIntArray265[local64] = (local64 << 12) / arg1;
			}
		}
		Static223.anInt4562 = arg1;
		Static341.anInt266 = arg1 - 1;
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(IZI)V")
	public static void method4583(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = Static158.aClass8_Sub1_Sub2_Sub1_1.anIntArray415[0];
		@Pc(13) int local13 = Static158.aClass8_Sub1_Sub2_Sub1_1.anIntArray416[0];
		if (Static330.anInt6312 == 1) {
			if (Static81.method2005(local13, arg1, 1, local8, 1, 0, false, -2, 0, arg0)) {
				return;
			}
			Static81.method2005(local13, arg1, 1, local8, 1, 0, false, -3, 0, arg0);
		} else if (Static81.method2005(local13, arg1, 1, local8, 1, 0, false, -3, 0, arg0)) {
			return;
		} else {
			Static81.method2005(local13, arg1, 1, local8, 1, 0, false, -2, 0, arg0);
		}
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(II)I")
	public static int method4584(@OriginalArg(1) int arg0) {
		return arg0 & 0x7F;
	}
}
