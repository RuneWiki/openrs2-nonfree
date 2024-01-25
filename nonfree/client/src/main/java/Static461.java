import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static461 {

	@OriginalMember(owner = "client!qf", name = "r", descriptor = "I")
	public static int anInt8259;

	@OriginalMember(owner = "client!qf", name = "s", descriptor = "F")
	public static float aFloat161;

	@OriginalMember(owner = "client!qf", name = "t", descriptor = "I")
	public static int anInt8260;

	@OriginalMember(owner = "client!qf", name = "u", descriptor = "Lclient!ea;")
	public static Class73 aClass73_148;

	@OriginalMember(owner = "client!qf", name = "v", descriptor = "Lclient!uaa;")
	public static Class333 aClass333_11;

	@OriginalMember(owner = "client!qf", name = "g", descriptor = "Lclient!wr;")
	public static final Class380 aClass380_35 = new Class380(64);

	@OriginalMember(owner = "client!qf", name = "k", descriptor = "S")
	public static short aShort98 = 32767;

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(I[S[Ljava/lang/String;II)V")
	public static void method6935(@OriginalArg(1) short[] arg0, @OriginalArg(2) String[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg3 >= arg2) {
			return;
		}
		@Pc(14) int local14 = (arg2 + arg3) / 2;
		@Pc(16) int local16 = arg3;
		@Pc(20) String local20 = arg1[local14];
		arg1[local14] = arg1[arg2];
		arg1[arg2] = local20;
		@Pc(34) short local34 = arg0[local14];
		arg0[local14] = arg0[arg2];
		arg0[arg2] = local34;
		for (@Pc(46) int local46 = arg3; local46 < arg2; local46++) {
			if (local20 == null || arg1[local46] != null && (local46 & 0x1) > arg1[local46].compareTo(local20)) {
				@Pc(71) String local71 = arg1[local46];
				arg1[local46] = arg1[local16];
				arg1[local16] = local71;
				@Pc(85) short local85 = arg0[local46];
				arg0[local46] = arg0[local16];
				arg0[local16++] = local85;
			}
		}
		arg1[arg2] = arg1[local16];
		arg1[local16] = local20;
		arg0[arg2] = arg0[local16];
		arg0[local16] = local34;
		method6935(arg0, arg1, local16 - 1, arg3);
		method6935(arg0, arg1, arg2, local16 + 1);
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIIII)V")
	public static void method6936(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static188.anInt4107 = arg3;
		Static34.anInt3509 = arg0;
		Static363.anInt9493 = arg2;
		Static497.anInt8648 = arg1;
	}
}
