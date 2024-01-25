import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static160 {

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "[I")
	public static int[] anIntArray201;

	@OriginalMember(owner = "client!gh", name = "b", descriptor = "Lclient!pd;")
	public static final Class247 aClass247_4 = new Class247();

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(IIIB)I")
	public static int method2951(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static133.aClass59Array3 == null) {
			return 0;
		}
		@Pc(16) int local16 = arg1 >> 9;
		@Pc(20) int local20 = arg0 >> 9;
		if (local16 < 0 || local20 < 0 || local16 > Static473.anInt8075 - 1 || local20 > Static165.anInt6749 - 1) {
			return 0;
		}
		@Pc(45) int local45 = arg2;
		if (arg2 < 3 && (Static154.aByteArrayArrayArray4[1][local16][local20] & 0x2) != 0) {
			local45 = arg2 + 1;
		}
		return Static133.aClass59Array3[local45].sa(arg1, arg0);
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(III)Z")
	public static boolean method2952(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return false;
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "([SII[Ljava/lang/String;I)V")
	public static void method2954(@OriginalArg(0) short[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String[] arg2, @OriginalArg(4) int arg3) {
		if (arg3 <= arg1) {
			return;
		}
		@Pc(14) int local14 = (arg1 + arg3) / 2;
		@Pc(16) int local16 = arg1;
		@Pc(20) String local20 = arg2[local14];
		arg2[local14] = arg2[arg3];
		arg2[arg3] = local20;
		@Pc(34) short local34 = arg0[local14];
		arg0[local14] = arg0[arg3];
		arg0[arg3] = local34;
		for (@Pc(46) int local46 = arg1; local46 < arg3; local46++) {
			if (local20 == null || arg2[local46] != null && (local46 & 0x1) > arg2[local46].compareTo(local20)) {
				@Pc(67) String local67 = arg2[local46];
				arg2[local46] = arg2[local16];
				arg2[local16] = local67;
				@Pc(81) short local81 = arg0[local46];
				arg0[local46] = arg0[local16];
				arg0[local16++] = local81;
			}
		}
		arg2[arg3] = arg2[local16];
		arg2[local16] = local20;
		arg0[arg3] = arg0[local16];
		arg0[local16] = local34;
		method2954(arg0, arg1, arg2, local16 - 1);
		method2954(arg0, local16 + 1, arg2, arg3);
	}
}
