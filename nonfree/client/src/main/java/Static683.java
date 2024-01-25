import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static683 {

	@OriginalMember(owner = "client!vka", name = "j", descriptor = "Lclient!hfa;")
	public static final Class152 aClass152_9 = new Class152(1, 2);

	@OriginalMember(owner = "client!vka", name = "a", descriptor = "(IIBI)I")
	public static int method9206(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg2 & 0x3;
		if (local3 == 0) {
			return arg0;
		} else if (local3 == 1) {
			return arg1;
		} else if (local3 == 2) {
			return 7 - arg0;
		} else {
			return 7 - arg1;
		}
	}

	@OriginalMember(owner = "client!vka", name = "a", descriptor = "(IIII)V")
	public static void method9209(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static392.aByteArrayArrayArray16 = new byte[4][arg0][arg1];
	}
}
