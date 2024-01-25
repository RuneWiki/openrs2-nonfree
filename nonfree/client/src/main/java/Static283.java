import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static283 {

	@OriginalMember(owner = "client!kh", name = "c", descriptor = "I")
	public static int anInt5319 = 0;

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(Ljava/lang/String;IIZI)V")
	public static void method4265(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		Static402.method5686(arg2, arg1, false, null, arg0, arg3);
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(ILclient!oo;)I")
	public static int method4266(@OriginalArg(1) Class3_Sub26_Sub1 arg0) {
		@Pc(10) int local10 = arg0.method5553(2);
		@Pc(20) int local20;
		if (local10 == 0) {
			local20 = 0;
		} else if (local10 == 1) {
			local20 = arg0.method5553(5);
		} else if (local10 == 2) {
			local20 = arg0.method5553(8);
		} else {
			local20 = arg0.method5553(11);
		}
		return local20;
	}
}
