import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static24 {

	@OriginalMember(owner = "client!ar", name = "i", descriptor = "[I")
	public static final int[] anIntArray59 = new int[] { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(III)Z")
	public static boolean method446(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x100) != 0;
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(Lclient!vj;I)Lclient!wia;")
	public static Class69 method447(@OriginalArg(0) Class2_Sub22 arg0) {
		@Pc(10) Class361 local10 = Static108.method1608()[arg0.method8547()];
		@Pc(17) Class306 local17 = Static366.method4960()[arg0.method8547()];
		@Pc(23) int local23 = arg0.method8526();
		@Pc(32) int local32 = arg0.method8526();
		@Pc(36) int local36 = arg0.method8546();
		@Pc(40) int local40 = arg0.method8546();
		@Pc(44) int local44 = arg0.method8526();
		@Pc(48) int local48 = arg0.method8542();
		@Pc(52) int local52 = arg0.method8542();
		return new Class69(local10, local17, local23, local32, local36, local40, local44, local48, local52);
	}
}
