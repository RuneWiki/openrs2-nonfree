import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static496 {

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(B[Ljava/lang/String;[SII)V")
	public static void method6743(@OriginalArg(1) String[] arg0, @OriginalArg(2) short[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg2 >= arg3) {
			return;
		}
		@Pc(18) int local18 = (arg2 + arg3) / 2;
		@Pc(20) int local20 = arg2;
		@Pc(24) String local24 = arg0[local18];
		arg0[local18] = arg0[arg3];
		arg0[arg3] = local24;
		@Pc(38) short local38 = arg1[local18];
		arg1[local18] = arg1[arg3];
		arg1[arg3] = local38;
		for (@Pc(50) int local50 = arg2; local50 < arg3; local50++) {
			if (local24 == null || arg0[local50] != null && (local50 & 0x1) > arg0[local50].compareTo(local24)) {
				@Pc(71) String local71 = arg0[local50];
				arg0[local50] = arg0[local20];
				arg0[local20] = local71;
				@Pc(85) short local85 = arg1[local50];
				arg1[local50] = arg1[local20];
				arg1[local20++] = local85;
			}
		}
		arg0[arg3] = arg0[local20];
		arg0[local20] = local24;
		arg1[arg3] = arg1[local20];
		arg1[local20] = local38;
		method6743(arg0, arg1, arg2, local20 - 1);
		method6743(arg0, arg1, local20 + 1, arg3);
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "()V")
	public static void method6744() {
		Static179.method2671(Static388.anInt7032);
	}
}
