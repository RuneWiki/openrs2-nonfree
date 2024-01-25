import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static218 {

	@OriginalMember(owner = "client!np", name = "p", descriptor = "I")
	public static int anInt4223;

	@OriginalMember(owner = "client!np", name = "t", descriptor = "[I")
	public static int[] anIntArray332;

	@OriginalMember(owner = "client!np", name = "n", descriptor = "[I")
	public static final int[] anIntArray331 = new int[32];

	@OriginalMember(owner = "client!np", name = "o", descriptor = "Z")
	public static boolean aBoolean373 = false;

	@OriginalMember(owner = "client!np", name = "q", descriptor = "Lclient!lg;")
	public static final Class119 aClass119_129 = new Class119(30);

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(Lclient!dg;I)Lclient!s;")
	public static Class175 method3877(@OriginalArg(0) Class2_Sub10 arg0) {
		@Pc(7) Class175 local7 = new Class175();
		local7.anInt5656 = arg0.method4464();
		local7.aClass2_Sub11_Sub3_1 = Static10.method374(local7.anInt5656);
		return local7;
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(II)Lclient!ro;")
	public static Class2_Sub11_Sub17 method3878(@OriginalArg(0) int arg0) {
		@Pc(10) Class2_Sub11_Sub17 local10 = (Class2_Sub11_Sub17) Static23.aClass179_1.method5092((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25 = Static192.aClass191_122.method5459(5, arg0);
		local10 = new Class2_Sub11_Sub17();
		if (local25 != null) {
			local10.method5014(new Class2_Sub10(local25));
		}
		Static23.aClass179_1.method5085(local10, (long) arg0);
		return local10;
	}
}
