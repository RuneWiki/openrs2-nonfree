import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static198 {

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "Lclient!mm;")
	public static Class210 aClass210_2;

	@OriginalMember(owner = "client!hl", name = "d", descriptor = "I")
	public static int anInt4276;

	@OriginalMember(owner = "client!hl", name = "f", descriptor = "I")
	public static int anInt4278;

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(IIII)I")
	public static int method3444(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg1 / arg0;
		@Pc(13) int local13 = arg1 & arg0 - 1;
		@Pc(17) int local17 = arg2 / arg0;
		@Pc(23) int local23 = arg0 - 1 & arg2;
		@Pc(28) int local28 = Static129.method2400(local17, local7);
		@Pc(35) int local35 = Static129.method2400(local17, local7 + 1);
		@Pc(42) int local42 = Static129.method2400(local17 + 1, local7);
		@Pc(51) int local51 = Static129.method2400(local17 + 1, local7 - -1);
		@Pc(58) int local58 = Static204.method3502(arg0, local35, local28, local13);
		@Pc(65) int local65 = Static204.method3502(arg0, local51, local42, local13);
		return Static204.method3502(arg0, local65, local58, local23);
	}
}
