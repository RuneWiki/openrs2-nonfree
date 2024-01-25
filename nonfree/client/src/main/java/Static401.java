import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static401 {

	@OriginalMember(owner = "client!pg", name = "L", descriptor = "I")
	public static int anInt7845 = 0;

	@OriginalMember(owner = "client!pg", name = "b", descriptor = "(IBI)V")
	public static void method6481(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) Class3_Sub4_Sub6 local16 = Static367.method6025(14, arg1);
		local16.method1898();
		local16.anInt1945 = arg0;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(I[SI[Ljava/lang/String;I)V")
	public static void method6482(@OriginalArg(0) int arg0, @OriginalArg(1) short[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String[] arg3) {
		if (arg2 >= arg0) {
			return;
		}
		@Pc(12) int local12 = (arg2 + arg0) / 2;
		@Pc(14) int local14 = arg2;
		@Pc(18) String local18 = arg3[local12];
		arg3[local12] = arg3[arg0];
		arg3[arg0] = local18;
		@Pc(32) short local32 = arg1[local12];
		arg1[local12] = arg1[arg0];
		arg1[arg0] = local32;
		for (@Pc(44) int local44 = arg2; local44 < arg0; local44++) {
			if (local18 == null || arg3[local44] != null && (local44 & 0x1) > arg3[local44].compareTo(local18)) {
				@Pc(64) String local64 = arg3[local44];
				arg3[local44] = arg3[local14];
				arg3[local14] = local64;
				@Pc(78) short local78 = arg1[local44];
				arg1[local44] = arg1[local14];
				arg1[local14++] = local78;
			}
		}
		arg3[arg0] = arg3[local14];
		arg3[local14] = local18;
		arg1[arg0] = arg1[local14];
		arg1[local14] = local32;
		method6482(local14 - 1, arg1, arg2, arg3);
		method6482(arg0, arg1, local14 + 1, arg3);
	}
}
