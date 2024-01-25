import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static287 {

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(II[SI[Ljava/lang/String;)V")
	public static void method4309(@OriginalArg(0) int arg0, @OriginalArg(2) short[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String[] arg3) {
		if (arg2 >= arg0) {
			return;
		}
		@Pc(10) int local10 = (arg2 + arg0) / 2;
		@Pc(12) int local12 = arg2;
		@Pc(16) String local16 = arg3[local10];
		arg3[local10] = arg3[arg0];
		arg3[arg0] = local16;
		@Pc(30) short local30 = arg1[local10];
		arg1[local10] = arg1[arg0];
		arg1[arg0] = local30;
		for (@Pc(42) int local42 = arg2; local42 < arg0; local42++) {
			if (local16 == null || arg3[local42] != null && (local42 & 0x1) > arg3[local42].compareTo(local16)) {
				@Pc(63) String local63 = arg3[local42];
				arg3[local42] = arg3[local12];
				arg3[local12] = local63;
				@Pc(77) short local77 = arg1[local42];
				arg1[local42] = arg1[local12];
				arg1[local12++] = local77;
			}
		}
		arg3[arg0] = arg3[local12];
		arg3[local12] = local16;
		arg1[arg0] = arg1[local12];
		arg1[local12] = local30;
		method4309(local12 - 1, arg1, arg2, arg3);
		method4309(arg0, arg1, local12 + 1, arg3);
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "([I[[BB[I[B[[BII)I")
	public static int method4310(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[][] arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) byte[][] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(9) int local9 = arg0[arg6];
		@Pc(15) int local15 = local9 + arg2[arg6];
		@Pc(19) int local19 = arg0[arg5];
		@Pc(25) int local25 = arg2[arg5] + local19;
		@Pc(27) int local27 = local9;
		if (local9 < local19) {
			local27 = local19;
		}
		@Pc(38) int local38 = local15;
		if (local15 > local25) {
			local38 = local25;
		}
		@Pc(49) int local49 = arg3[arg6] & 0xFF;
		if (local49 > (arg3[arg5] & 0xFF)) {
			local49 = arg3[arg5] & 0xFF;
		}
		@Pc(66) byte[] local66 = arg1[arg6];
		@Pc(70) byte[] local70 = arg4[arg5];
		@Pc(88) int local88 = local27 - local9;
		@Pc(93) int local93 = local27 - local19;
		for (@Pc(95) int local95 = local27; local95 < local38; local95++) {
			@Pc(107) int local107 = local70[local93++] + local66[local88++];
			if (local107 < local49) {
				local49 = local107;
			}
		}
		return -local49;
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(BZII)Lclient!ri;")
	public static Class284 method4311(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1) {
		@Pc(10) Class215 local10 = null;
		if (Static437.aClass361_5 != null) {
			local10 = new Class215(arg1, Static437.aClass361_5, Static390.aClass361Array1[arg1], 1000000);
		}
		Static449.aClass98_Sub1Array1[arg1] = Static87.aClass308_6.method6726(local10, arg1, Static51.aClass215_7);
		Static449.aClass98_Sub1Array1[arg1].method4618();
		return new Class284(Static449.aClass98_Sub1Array1[arg1], arg0, 1);
	}
}
