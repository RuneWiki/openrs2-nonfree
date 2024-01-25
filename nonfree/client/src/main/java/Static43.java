import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static43 {

	@OriginalMember(owner = "client!cm", name = "A", descriptor = "[Lclient!td;")
	public static Class193[] aClass193Array1;

	@OriginalMember(owner = "client!cm", name = "N", descriptor = "Lclient!vd;")
	public static Class205 aClass205_3;

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(II)I")
	public static int method1081(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return 0;
		}
		@Pc(21) Class14_Sub37 local21 = (Class14_Sub37) Static316.aClass25_15.method691((long) arg0);
		if (local21 == null) {
			return Static66.method1651(arg0).anInt5243;
		}
		@Pc(30) int local30 = 0;
		for (@Pc(32) int local32 = 0; local32 < local21.anIntArray614.length; local32++) {
			if (local21.anIntArray614[local32] == -1) {
				local30++;
			}
		}
		return local30 + Static66.method1651(arg0).anInt5243 - local21.anIntArray614.length;
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(II[J[Ljava/lang/Object;I)V")
	public static void method1083(@OriginalArg(1) int arg0, @OriginalArg(2) long[] arg1, @OriginalArg(3) Object[] arg2, @OriginalArg(4) int arg3) {
		if (arg3 >= arg0) {
			return;
		}
		@Pc(10) int local10 = (arg3 + arg0) / 2;
		@Pc(12) int local12 = arg3;
		@Pc(16) long local16 = arg1[local10];
		arg1[local10] = arg1[arg0];
		arg1[arg0] = local16;
		@Pc(30) Object local30 = arg2[local10];
		arg2[local10] = arg2[arg0];
		arg2[arg0] = local30;
		for (@Pc(42) int local42 = arg3; local42 < arg0; local42++) {
			if (arg1[local42] < (long) (local42 & 0x1) + local16) {
				@Pc(63) long local63 = arg1[local42];
				arg1[local42] = arg1[local12];
				arg1[local12] = local63;
				@Pc(77) Object local77 = arg2[local42];
				arg2[local42] = arg2[local12];
				arg2[local12++] = local77;
			}
		}
		arg1[arg0] = arg1[local12];
		arg1[local12] = local16;
		arg2[arg0] = arg2[local12];
		arg2[local12] = local30;
		method1083(local12 - 1, arg1, arg2, arg3);
		method1083(arg0, arg1, arg2, local12 + 1);
	}
}
