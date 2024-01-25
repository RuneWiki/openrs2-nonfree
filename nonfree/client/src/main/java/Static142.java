import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static142 {

	@OriginalMember(owner = "client!gq", name = "M", descriptor = "Lclient!ic;")
	public static Class113 aClass113_47;

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(IBI)I")
	public static int method1875(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 > 22050) {
			arg0 = arg1;
			arg1 = 22050;
		}
		while (arg1 != 0) {
			@Pc(32) int local32 = arg0 % arg1;
			arg0 = arg1;
			arg1 = local32;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!gq", name = "b", descriptor = "(I)V")
	public static void method1877() {
		Static313.anInt5206 = -1;
		Static174.anInt2859 = -1;
		Static345.anInt5644 = 0;
		Static313.anInt5202 = -1;
	}
}
