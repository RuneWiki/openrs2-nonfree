import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static64 {

	@OriginalMember(owner = "client!dh", name = "I", descriptor = "I")
	public static int anInt1263 = 0;

	@OriginalMember(owner = "client!dh", name = "N", descriptor = "I")
	public static int anInt1268 = 0;

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(ZIB)V")
	public static void method1033(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		@Pc(10) Class1_Sub37 local10 = Static367.method5078(arg0, arg1);
		if (local10 != null) {
			for (@Pc(15) int local15 = 0; local15 < local10.anIntArray589.length; local15++) {
				local10.anIntArray589[local15] = -1;
				local10.anIntArray591[local15] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(I[II[JI)V")
	public static void method1034(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long[] arg3) {
		if (arg2 >= arg0) {
			return;
		}
		@Pc(10) int local10 = (arg0 + arg2) / 2;
		@Pc(12) int local12 = arg2;
		@Pc(16) long local16 = arg3[local10];
		arg3[local10] = arg3[arg0];
		arg3[arg0] = local16;
		@Pc(30) int local30 = arg1[local10];
		arg1[local10] = arg1[arg0];
		arg1[arg0] = local30;
		for (@Pc(42) int local42 = arg2; local42 < arg0; local42++) {
			if ((long) (local42 & 0x1) + local16 > arg3[local42]) {
				@Pc(63) long local63 = arg3[local42];
				arg3[local42] = arg3[local12];
				arg3[local12] = local63;
				@Pc(77) int local77 = arg1[local42];
				arg1[local42] = arg1[local12];
				arg1[local12++] = local77;
			}
		}
		arg3[arg0] = arg3[local12];
		arg3[local12] = local16;
		arg1[arg0] = arg1[local12];
		arg1[local12] = local30;
		method1034(local12 - 1, arg1, arg2, arg3);
		method1034(arg0, arg1, local12 + 1, arg3);
	}
}
