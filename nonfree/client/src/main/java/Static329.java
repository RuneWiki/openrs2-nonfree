import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static329 {

	@OriginalMember(owner = "client!m", name = "L", descriptor = "Lclient!tm;")
	public static final Class337 aClass337_51 = new Class337(31, 11);

	@OriginalMember(owner = "client!m", name = "Q", descriptor = "Lclient!wk;")
	public static final Class376 aClass376_8 = new Class376(2, 7);

	@OriginalMember(owner = "client!m", name = "R", descriptor = "[B")
	public static final byte[] aByteArray25 = new byte[520];

	@OriginalMember(owner = "client!m", name = "S", descriptor = "[I")
	public static final int[] anIntArray166 = new int[32];

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(IIII)I")
	public static int method2411(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if ((Static305.aByteArrayArrayArray18[arg2][arg0][arg1] & 0x8) == 0) {
			return arg2 <= 0 || (Static305.aByteArrayArrayArray18[1][arg0][arg1] & 0x2) == 0 ? arg2 : arg2 - 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "([Ljava/lang/String;III[S)V")
	public static void method2414(@OriginalArg(0) String[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) short[] arg3) {
		if (arg2 >= arg1) {
			return;
		}
		@Pc(14) int local14 = (arg1 + arg2) / 2;
		@Pc(16) int local16 = arg2;
		@Pc(20) String local20 = arg0[local14];
		arg0[local14] = arg0[arg1];
		arg0[arg1] = local20;
		@Pc(34) short local34 = arg3[local14];
		arg3[local14] = arg3[arg1];
		arg3[arg1] = local34;
		for (@Pc(46) int local46 = arg2; local46 < arg1; local46++) {
			if (local20 == null || arg0[local46] != null && arg0[local46].compareTo(local20) < (local46 & 0x1)) {
				@Pc(67) String local67 = arg0[local46];
				arg0[local46] = arg0[local16];
				arg0[local16] = local67;
				@Pc(81) short local81 = arg3[local46];
				arg3[local46] = arg3[local16];
				arg3[local16++] = local81;
			}
		}
		arg0[arg1] = arg0[local16];
		arg0[local16] = local20;
		arg3[arg1] = arg3[local16];
		arg3[local16] = local34;
		method2414(arg0, local16 - 1, arg2, arg3);
		method2414(arg0, arg1, local16 + 1, arg3);
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(Lclient!mw;ILclient!ha;)I")
	public static int method2415(@OriginalArg(0) Class239 arg0, @OriginalArg(2) Class133 arg1) {
		if (arg0.anInt5970 != -1) {
			return arg0.anInt5970;
		}
		if (arg0.anInt5979 != -1) {
			@Pc(18) Class145 local18 = arg1.anInterface3_12.method4656(arg0.anInt5979);
			if (!local18.aBoolean291) {
				return local18.aShort61;
			}
		}
		return arg0.anInt5977;
	}
}
