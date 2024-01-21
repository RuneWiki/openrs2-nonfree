import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static160 {

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "I")
	public static int anInt2779;

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "[[I")
	public static int[][] anIntArrayArray22;

	@OriginalMember(owner = "client!rc", name = "e", descriptor = "[I")
	public static int[] anIntArray328;

	@OriginalMember(owner = "client!rc", name = "f", descriptor = "Lclient!oc;")
	private static final Class65 aClass65_1613 = Static118.method2249("Unexpected server response)3");

	@OriginalMember(owner = "client!rc", name = "d", descriptor = "Lclient!oc;")
	public static Class65 aClass65_1612 = aClass65_1613;

	@OriginalMember(owner = "client!rc", name = "g", descriptor = "I")
	public static int anInt2781 = 0;

	@OriginalMember(owner = "client!rc", name = "j", descriptor = "I")
	public static volatile int anInt2784 = 0;

	@OriginalMember(owner = "client!rc", name = "k", descriptor = "I")
	public static int anInt2785 = 1;

	@OriginalMember(owner = "client!rc", name = "l", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_1614 = Static118.method2249("Sie befinden sich in einem Mitglieder)2Gebiet(Q");

	@OriginalMember(owner = "client!rc", name = "n", descriptor = "I")
	public static int anInt2787 = 1;

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(IB)I")
	public static int method2103(@OriginalArg(0) int arg0) {
		@Pc(7) Class1_Sub2_Sub17 local7 = Static119.method2256(arg0);
		@Pc(10) int local10 = local7.anInt3263;
		@Pc(13) int local13 = local7.anInt3259;
		@Pc(16) int local16 = local7.anInt3257;
		@Pc(23) int local23 = Class1_Sub24.anIntArray464[local13 - local16];
		return local23 & Static135.anIntArray379[local10] >> local16;
	}
}
