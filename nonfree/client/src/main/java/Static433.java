import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static433 {

	@OriginalMember(owner = "client!oia", name = "a", descriptor = "[Lclient!qn;")
	public static Class298[] aClass298Array6;

	@OriginalMember(owner = "client!oia", name = "a", descriptor = "(III)I")
	public static int method7308(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10;
		if (arg0 > arg1) {
			local10 = arg1;
			arg1 = arg0;
			arg0 = local10;
		}
		while (arg0 != 0) {
			local10 = arg1 % arg0;
			arg1 = arg0;
			arg0 = local10;
		}
		return arg1;
	}

	@OriginalMember(owner = "client!oia", name = "a", descriptor = "(Lclient!dt;BI)V")
	public static void method7310(@OriginalArg(0) Class3_Sub4 arg0, @OriginalArg(2) int arg1) {
		if (Static34.aClass152_1 == null) {
			return;
		}
		try {
			Static34.aClass152_1.method3506(0L);
			Static34.aClass152_1.method3499(arg0.aByteArray90, 24, arg1);
		} catch (@Pc(22) Exception local22) {
		}
	}

	@OriginalMember(owner = "client!oia", name = "a", descriptor = "(I)V")
	public static void method7311() {
		Static16.aClass295_67.method6464();
	}
}
