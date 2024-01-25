import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static407 {

	@OriginalMember(owner = "client!ul", name = "K", descriptor = "[Lclient!f;")
	public static Class78[] aClass78Array13;

	@OriginalMember(owner = "client!ul", name = "L", descriptor = "Lclient!ia;")
	public static Class43 aClass43_4;

	@OriginalMember(owner = "client!ul", name = "F", descriptor = "Lclient!vp;")
	public static final Class254 aClass254_134 = new Class254(19, 7);

	@OriginalMember(owner = "client!ul", name = "J", descriptor = "Lclient!ao;")
	public static final Class12 aClass12_351 = new Class12(2, 8);

	@OriginalMember(owner = "client!ul", name = "M", descriptor = "[I")
	public static final int[] anIntArray531 = new int[13];

	@OriginalMember(owner = "client!ul", name = "N", descriptor = "I")
	public static int anInt7191 = 0;

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "([SI[Ljava/lang/String;II)V")
	public static void method5529(@OriginalArg(0) short[] arg0, @OriginalArg(2) String[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg2 <= arg3) {
			return;
		}
		@Pc(10) int local10 = (arg3 + arg2) / 2;
		@Pc(12) int local12 = arg3;
		@Pc(16) String local16 = arg1[local10];
		arg1[local10] = arg1[arg2];
		arg1[arg2] = local16;
		@Pc(30) short local30 = arg0[local10];
		arg0[local10] = arg0[arg2];
		arg0[arg2] = local30;
		for (@Pc(42) int local42 = arg3; local42 < arg2; local42++) {
			if (local16 == null || arg1[local42] != null && arg1[local42].compareTo(local16) < (local42 & 0x1)) {
				@Pc(63) String local63 = arg1[local42];
				arg1[local42] = arg1[local12];
				arg1[local12] = local63;
				@Pc(77) short local77 = arg0[local42];
				arg0[local42] = arg0[local12];
				arg0[local12++] = local77;
			}
		}
		arg1[arg2] = arg1[local12];
		arg1[local12] = local16;
		arg0[arg2] = arg0[local12];
		arg0[local12] = local30;
		method5529(arg0, arg1, local12 - 1, arg3);
		method5529(arg0, arg1, arg2, local12 + 1);
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(III)Z")
	public static boolean method5534(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x800) != 0;
	}
}
