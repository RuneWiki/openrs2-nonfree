import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static341 {

	@OriginalMember(owner = "client!vr", name = "f", descriptor = "[I")
	public static int[] anIntArray522;

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "[[I")
	public static final int[][] anIntArrayArray64 = new int[][] { { 0, 2 }, { 0, 2 }, { 0, 0, 2 }, { 2, 0, 0 }, { 0, 2, 0 }, { 0, 0, 2 }, { 0, 5, 1, 4 }, { 0, 4, 4, 4 }, { 4, 4, 4, 0 }, { 6, 6, 6, 2, 2, 2 }, { 2, 2, 2, 6, 6, 6 }, { 0, 11, 6, 6, 6, 4 }, { 0, 2 }, { 0, 4, 4, 4 }, { 0, 4, 4, 4 } };

	@OriginalMember(owner = "client!vr", name = "d", descriptor = "I")
	public static int anInt6553 = -50;

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "([Ljava/lang/Object;II[IZ)V")
	public static void method5494(@OriginalArg(0) Object[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		if (arg2 <= arg1) {
			return;
		}
		@Pc(14) int local14 = (arg1 + arg2) / 2;
		@Pc(16) int local16 = arg1;
		@Pc(20) int local20 = arg3[local14];
		arg3[local14] = arg3[arg2];
		arg3[arg2] = local20;
		@Pc(34) Object local34 = arg0[local14];
		arg0[local14] = arg0[arg2];
		arg0[arg2] = local34;
		for (@Pc(46) int local46 = arg1; local46 < arg2; local46++) {
			if ((local46 & 0x1) + local20 > arg3[local46]) {
				@Pc(61) int local61 = arg3[local46];
				arg3[local46] = arg3[local16];
				arg3[local16] = local61;
				@Pc(75) Object local75 = arg0[local46];
				arg0[local46] = arg0[local16];
				arg0[local16++] = local75;
			}
		}
		arg3[arg2] = arg3[local16];
		arg3[local16] = local20;
		arg0[arg2] = arg0[local16];
		arg0[local16] = local34;
		method5494(arg0, arg1, local16 - 1, arg3);
		method5494(arg0, local16 + 1, arg2, arg3);
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;B)I")
	public static int method5495(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2) {
		@Pc(8) int local8 = arg1.length();
		@Pc(11) int local11 = arg2.length();
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		@Pc(17) char local17 = 0;
		@Pc(19) char local19 = 0;
		while (local13 - local17 < local8 || local15 - local19 < local11) {
			if (local13 - local17 >= local8) {
				return -1;
			}
			if (local11 <= local15 - local19) {
				return 1;
			}
			@Pc(68) char local68;
			if (local17 == '\u0000') {
				local68 = arg1.charAt(local13++);
			} else {
				local68 = local17;
			}
			@Pc(84) char local84;
			if (local19 == '\u0000') {
				local84 = arg2.charAt(local15++);
			} else {
				local84 = local19;
			}
			local17 = Static88.method1917(local68);
			local19 = Static88.method1917(local84);
			local68 = Static223.method5333(arg0, local68);
			local84 = Static223.method5333(arg0, local84);
			if (local84 != local68 && Character.toUpperCase(local68) != Character.toUpperCase(local84)) {
				local68 = Character.toLowerCase(local68);
				local84 = Character.toLowerCase(local84);
				if (local68 != local84) {
					return Static259.method2699(local68, arg0) - Static259.method2699(local84, arg0);
				}
			}
		}
		@Pc(143) int local143 = Math.min(local8, local11);
		for (@Pc(145) int local145 = 0; local145 < local143; local145++) {
			if (arg0 == 2) {
				local15 = local11 - local145 - 1;
				local13 = local8 - local145 - 1;
			} else {
				local15 = local145;
				local13 = local145;
			}
			@Pc(176) char local176 = arg1.charAt(local13);
			@Pc(180) char local180 = arg2.charAt(local15);
			if (local176 != local180 && Character.toUpperCase(local176) != Character.toUpperCase(local180)) {
				local176 = Character.toLowerCase(local176);
				local180 = Character.toLowerCase(local180);
				if (local176 != local180) {
					return Static259.method2699(local176, arg0) - Static259.method2699(local180, arg0);
				}
			}
		}
		@Pc(225) int local225 = local8 - local11;
		if (local225 != 0) {
			return local225;
		}
		for (@Pc(234) int local234 = 0; local234 < local143; local234++) {
			@Pc(240) char local240 = arg1.charAt(local234);
			@Pc(244) char local244 = arg2.charAt(local234);
			if (local244 != local240) {
				return Static259.method2699(local240, arg0) - Static259.method2699(local244, arg0);
			}
		}
		return 0;
	}
}
