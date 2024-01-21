import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static147 {

	@OriginalMember(owner = "client!q", name = "r", descriptor = "Lclient!ab;")
	public static final Class1_Sub3 aClass1_Sub3_1 = new Class1_Sub3(0, 0);

	@OriginalMember(owner = "client!q", name = "t", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_2003 = Static118.method2249("0(U");

	@OriginalMember(owner = "client!q", name = "u", descriptor = "Lclient!v;")
	public static Class91 aClass91_15 = new Class91();

	@OriginalMember(owner = "client!q", name = "w", descriptor = "[B")
	public static final byte[] aByteArray41 = new byte[] { 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };

	@OriginalMember(owner = "client!q", name = "B", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_2004 = Static118.method2249(" )2> <col=ff9040>");

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(III)V")
	public static void method2646(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class1_Sub2_Sub17 local7 = Static119.method2256(arg0);
		@Pc(10) int local10 = local7.anInt3259;
		@Pc(13) int local13 = local7.anInt3257;
		@Pc(16) int local16 = local7.anInt3263;
		@Pc(22) int local22 = Class1_Sub24.anIntArray464[local10 - local13];
		if (arg1 < 0 || arg1 > local22) {
			arg1 = 0;
		}
		local22 <<= local13;
		Static135.anIntArray379[local16] = local22 & arg1 << local13 | Static135.anIntArray379[local16] & ~local22;
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(II)I")
	public static int method2647(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}
}
