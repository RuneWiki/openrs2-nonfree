import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static504 {

	@OriginalMember(owner = "client!ru", name = "E", descriptor = "I")
	public static int anInt8542;

	@OriginalMember(owner = "client!ru", name = "I", descriptor = "I")
	public static int anInt8544;

	@OriginalMember(owner = "client!ru", name = "J", descriptor = "Lclient!ofa;")
	public static Class117 aClass117_7;

	@OriginalMember(owner = "client!ru", name = "G", descriptor = "Z")
	public static boolean aBoolean704 = false;

	@OriginalMember(owner = "client!ru", name = "H", descriptor = "Z")
	public static volatile boolean aBoolean705 = true;

	@OriginalMember(owner = "client!ru", name = "e", descriptor = "(I)[Lclient!nha;")
	public static Class244[] method7359() {
		return new Class244[] { Static603.aClass244_1, Static603.aClass244_2, Static603.aClass244_3, Static603.aClass244_4, Static603.aClass244_5, Static603.aClass244_6, Static603.aClass244_7, Static603.aClass244_8, Static603.aClass244_9, Static603.aClass244_10, Static603.aClass244_11, Static603.aClass244_12 };
	}

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "([Ljava/lang/String;III[S)V")
	public static void method7360(@OriginalArg(0) String[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) short[] arg3) {
		if (arg2 >= arg1) {
			return;
		}
		@Pc(10) int local10 = (arg1 + arg2) / 2;
		@Pc(12) int local12 = arg2;
		@Pc(16) String local16 = arg0[local10];
		arg0[local10] = arg0[arg1];
		arg0[arg1] = local16;
		@Pc(30) short local30 = arg3[local10];
		arg3[local10] = arg3[arg1];
		arg3[arg1] = local30;
		for (@Pc(42) int local42 = arg2; local42 < arg1; local42++) {
			if (local16 == null || arg0[local42] != null && (local42 & 0x1) > arg0[local42].compareTo(local16)) {
				@Pc(67) String local67 = arg0[local42];
				arg0[local42] = arg0[local12];
				arg0[local12] = local67;
				@Pc(81) short local81 = arg3[local42];
				arg3[local42] = arg3[local12];
				arg3[local12++] = local81;
			}
		}
		arg0[arg1] = arg0[local12];
		arg0[local12] = local16;
		arg3[arg1] = arg3[local12];
		arg3[local12] = local30;
		method7360(arg0, local12 - 1, arg2, arg3);
		method7360(arg0, arg1, local12 + 1, arg3);
	}
}
