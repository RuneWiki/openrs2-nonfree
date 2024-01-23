import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static217 {

	@OriginalMember(owner = "client!pl", name = "g", descriptor = "[I")
	public static int[] anIntArray457 = new int[5];

	@OriginalMember(owner = "client!pl", name = "u", descriptor = "Lclient!ui;")
	public static Class175 aClass175_34 = new Class175(200);

	@OriginalMember(owner = "client!pl", name = "C", descriptor = "[I")
	public static int[] anIntArray458 = new int[] { 2047, 16383, 65535 };

	@OriginalMember(owner = "client!pl", name = "O", descriptor = "Z")
	public static boolean aBoolean369 = false;

	@OriginalMember(owner = "client!pl", name = "P", descriptor = "[J")
	public static long[] aLongArray9 = new long[100];

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(IIII)I")
	public static int method3521(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 > 243) {
			arg0 >>= 0x4;
		} else if (arg1 > 217) {
			arg0 >>= 0x3;
		} else if (arg1 > 192) {
			arg0 >>= 0x2;
		} else if (arg1 > 179) {
			arg0 >>= 0x1;
		}
		return (arg1 >> 1) + (arg0 >> 5 << 7) + (arg2 >> 2 << 10);
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(III)I")
	public static int method3524(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = arg0 + arg1 * 57;
		@Pc(15) int local15 = local9 << 13 ^ local9;
		@Pc(29) int local29 = (local15 * local15 * 15731 + 789221) * local15 + 1376312589 & Integer.MAX_VALUE;
		return local29 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(Lclient!nm;IB)Lclient!oh;")
	public static Class57 method3525(@OriginalArg(0) Class119 arg0, @OriginalArg(1) int arg1) {
		return Static219.method3548(arg0, arg1) ? Static276.method4230() : null;
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(IBIIII)V")
	public static void method3526(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static218.anInt4086 < arg2 || Static231.anInt4333 > arg1) {
			return;
		}
		@Pc(27) boolean local27;
		if (arg0 < Static188.anInt3598) {
			local27 = false;
			arg0 = Static188.anInt3598;
		} else if (Static289.anInt5245 >= arg0) {
			local27 = true;
		} else {
			local27 = false;
			arg0 = Static289.anInt5245;
		}
		@Pc(50) boolean local50;
		if (Static188.anInt3598 > arg4) {
			arg4 = Static188.anInt3598;
			local50 = false;
		} else if (Static289.anInt5245 < arg4) {
			local50 = false;
			arg4 = Static289.anInt5245;
		} else {
			local50 = true;
		}
		if (Static231.anInt4333 <= arg2) {
			Static103.method1978(arg3, arg4, arg0, Static40.anIntArrayArray6[arg2++]);
		} else {
			arg2 = Static231.anInt4333;
		}
		if (arg1 > Static218.anInt4086) {
			arg1 = Static218.anInt4086;
		} else {
			Static103.method1978(arg3, arg4, arg0, Static40.anIntArrayArray6[arg1--]);
		}
		@Pc(109) int local109;
		if (local27 && local50) {
			for (local109 = arg2; local109 <= arg1; local109++) {
				@Pc(120) int[] local120 = Static40.anIntArrayArray6[local109];
				local120[arg0] = local120[arg4] = arg3;
			}
		} else if (local27) {
			for (local109 = arg2; local109 <= arg1; local109++) {
				Static40.anIntArrayArray6[local109][arg0] = arg3;
			}
		} else if (local50) {
			for (local109 = arg2; local109 <= arg1; local109++) {
				Static40.anIntArrayArray6[local109][arg4] = arg3;
			}
		}
	}
}
