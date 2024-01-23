import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static118 {

	@OriginalMember(owner = "client!il", name = "t", descriptor = "[[I")
	public static int[][] anIntArrayArray32;

	@OriginalMember(owner = "client!il", name = "r", descriptor = "I")
	public static int anInt2546 = -1;

	@OriginalMember(owner = "client!il", name = "v", descriptor = "I")
	public static int anInt2549 = -1;

	@OriginalMember(owner = "client!il", name = "w", descriptor = "Ljava/lang/String;")
	public static String aString160 = "Unable to find ";

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(IIBLclient!th;)[Lclient!lb;")
	public static Class46_Sub1[] method1907(@OriginalArg(0) int arg0, @OriginalArg(3) Class168 arg1) {
		return Static131.method2257(0, arg1, arg0) ? Static155.method2525() : null;
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(ZIIIIZI)V")
	public static void method1908(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		if (arg3 <= arg1) {
			return;
		}
		@Pc(11) int local11 = (arg1 + arg3) / 2;
		@Pc(13) int local13 = arg1;
		@Pc(17) Class80_Sub1 local17 = Static313.aClass80_Sub1Array2[local11];
		Static313.aClass80_Sub1Array2[local11] = Static313.aClass80_Sub1Array2[arg3];
		Static313.aClass80_Sub1Array2[arg3] = local17;
		for (@Pc(29) int local29 = arg1; local29 < arg3; local29++) {
			if (Static251.method4181(arg4, arg5, Static313.aClass80_Sub1Array2[local29], arg0, arg2, local17) <= 0) {
				@Pc(52) Class80_Sub1 local52 = Static313.aClass80_Sub1Array2[local29];
				Static313.aClass80_Sub1Array2[local29] = Static313.aClass80_Sub1Array2[local13];
				Static313.aClass80_Sub1Array2[local13++] = local52;
			}
		}
		Static313.aClass80_Sub1Array2[arg3] = Static313.aClass80_Sub1Array2[local13];
		Static313.aClass80_Sub1Array2[local13] = local17;
		method1908(arg0, arg1, arg2, local13 - 1, arg4, arg5);
		method1908(arg0, local13 + 1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(IIIIZI)V")
	public static void method1909(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		if (arg0 < 1) {
			arg0 = 1;
		}
		if (arg2 < 1) {
			arg2 = 1;
		}
		if (Static294.aBoolean367) {
			@Pc(24) int local24 = arg0 - 334;
			if (local24 < 0) {
				local24 = 0;
			} else if (local24 > 100) {
				local24 = 100;
			}
			@Pc(50) int local50 = Static114.aShort47 + local24 * (Static10.aShort3 - Static114.aShort47) / 100;
			if (local50 < Static150.aShort55) {
				local50 = Static150.aShort55;
			} else if (local50 > Static145.aShort81) {
				local50 = Static145.aShort81;
			}
			@Pc(72) int local72 = local50 * arg0 * 512 / (arg2 * 334);
			@Pc(114) int local114;
			@Pc(121) int local121;
			@Pc(85) short local85;
			if (Static202.aShort65 > local72) {
				local85 = Static202.aShort65;
				local50 = arg2 * local85 * 334 / (arg0 * 512);
				if (Static145.aShort81 < local50) {
					local50 = Static145.aShort81;
					local114 = local50 * 512 * arg0 / (local85 * 334);
					local121 = (arg2 - local114) / 2;
					if (arg3) {
						Static156.method2538();
						Static156.method2537(arg1, arg4, local121, arg0, 0);
						Static156.method2537(arg2 + arg1 - local121, arg4, local121, arg0, 0);
					}
					arg1 += local121;
					arg2 -= local121 * 2;
				}
			} else if (local72 > Static103.aShort38) {
				local85 = Static103.aShort38;
				local50 = local85 * 334 * arg2 / (arg0 * 512);
				if (local50 < Static150.aShort55) {
					local50 = Static150.aShort55;
					local114 = arg2 * 334 * local85 / (local50 * 512);
					local121 = (arg0 - local114) / 2;
					if (arg3) {
						Static156.method2538();
						Static156.method2537(arg1, arg4, arg2, local121, 0);
						Static156.method2537(arg1, arg4 + arg0 - local121, arg2, local121, 0);
					}
					arg0 -= local121 * 2;
					arg4 += local121;
				}
			}
			Static246.anInt5030 = local50 * arg0 / 334;
		}
		Static173.anInt3886 = arg4;
		Static163.anInt3560 = arg1;
		Static265.anInt5316 = (short) arg2;
		Static313.anInt6270 = (short) arg0;
	}
}
