import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static142 {

	@OriginalMember(owner = "client!in", name = "p", descriptor = "Lclient!go;")
	public static Class82 aClass82_6;

	@OriginalMember(owner = "client!in", name = "r", descriptor = "[I")
	public static final int[] anIntArray246 = new int[1000];

	@OriginalMember(owner = "client!in", name = "v", descriptor = "[I")
	public static final int[] anIntArray248 = new int[13];

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(IIILclient!rc;)J")
	public static long method2731(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Interface8 arg2) {
		@Pc(13) long local13 = 4194304L;
		@Pc(15) long local15 = 2147483648L;
		@Pc(17) long local17 = Long.MIN_VALUE;
		@Pc(23) Class74 local23 = Static228.method4210(arg2.method5502());
		@Pc(44) long local44 = (long) ((arg2.method5503() | 0x10000) << 14 | arg0 << 7 | arg1 | arg2.method5501() << 20);
		if (local23.anInt2086 == 0) {
			local44 |= local17;
		}
		if (local23.lb == 1) {
			local44 |= local13;
		}
		if (local23.aBoolean196) {
			local44 |= local15;
		}
		return local44 | (long) arg2.method5502() << 32;
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(IB[SI[Ljava/lang/String;)V")
	public static void method2732(@OriginalArg(0) int arg0, @OriginalArg(2) short[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String[] arg3) {
		if (arg2 <= arg0) {
			return;
		}
		@Pc(14) int local14 = (arg0 + arg2) / 2;
		@Pc(16) int local16 = arg0;
		@Pc(20) String local20 = arg3[local14];
		arg3[local14] = arg3[arg2];
		arg3[arg2] = local20;
		@Pc(34) short local34 = arg1[local14];
		arg1[local14] = arg1[arg2];
		arg1[arg2] = local34;
		for (@Pc(46) int local46 = arg0; local46 < arg2; local46++) {
			if (local20 == null || arg3[local46] != null && (local46 & 0x1) > arg3[local46].compareTo(local20)) {
				@Pc(67) String local67 = arg3[local46];
				arg3[local46] = arg3[local16];
				arg3[local16] = local67;
				@Pc(81) short local81 = arg1[local46];
				arg1[local46] = arg1[local16];
				arg1[local16++] = local81;
			}
		}
		arg3[arg2] = arg3[local16];
		arg3[local16] = local20;
		arg1[arg2] = arg1[local16];
		arg1[local16] = local34;
		method2732(arg0, arg1, local16 - 1, arg3);
		method2732(local16 + 1, arg1, arg2, arg3);
	}
}
