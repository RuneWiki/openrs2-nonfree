import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static578 {

	@OriginalMember(owner = "client!td", name = "c", descriptor = "[I")
	public static final int[] anIntArray498 = new int[] { 1, -1, -1, 1 };

	@OriginalMember(owner = "client!td", name = "e", descriptor = "I")
	public static int anInt9567 = -1;

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(II)I")
	public static int method8260(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!td", name = "b", descriptor = "(II)I")
	public static int method8261(@OriginalArg(1) int arg0) {
		@Pc(17) byte local17;
		if (arg0 > 12000) {
			local17 = 4;
			Static354.method5383();
		} else if (arg0 > 5000) {
			local17 = 3;
			Static682.method9410();
		} else if (arg0 > 2000) {
			Static285.method4778();
			local17 = 2;
		} else {
			Static620.method8714();
			local17 = 1;
		}
		if (Static181.aClass14_Sub26_9.aClass43_Sub1_1.method801() != 2) {
			Static181.aClass14_Sub26_9.method5270(2, Static181.aClass14_Sub26_9.aClass43_Sub1_2);
			Static459.method8986(false, 2);
		}
		Static574.method8188();
		return local17;
	}
}
