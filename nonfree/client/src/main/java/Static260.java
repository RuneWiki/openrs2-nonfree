import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static260 {

	@OriginalMember(owner = "client!ip", name = "A", descriptor = "[[[Lclient!iia;")
	public static Class174[][][] aClass174ArrayArrayArray2;

	@OriginalMember(owner = "client!ip", name = "u", descriptor = "Lclient!wia;")
	public static final Class387 aClass387_48 = new Class387(88, 8);

	@OriginalMember(owner = "client!ip", name = "j", descriptor = "Lclient!um;")
	public static final Class354 aClass354_8 = new Class354("", 15);

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(ILclient!ic;BI)V")
	public static void method3839(@OriginalArg(0) int arg0, @OriginalArg(1) Class8_Sub1_Sub3_Sub2_Sub1 arg1, @OriginalArg(3) int arg2) {
		@Pc(13) int[] local13 = new int[4];
		Static682.method794(local13, 0, local13.length, arg2);
		Static16.method289(arg1, arg0, local13);
	}
}
