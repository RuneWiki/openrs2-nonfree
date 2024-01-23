import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static104 {

	@OriginalMember(owner = "client!ka", name = "D", descriptor = "Lclient!vb;")
	public static Class70_Sub1 aClass70_Sub1_28;

	@OriginalMember(owner = "client!ka", name = "E", descriptor = "F")
	public static float aFloat2;

	@OriginalMember(owner = "client!ka", name = "u", descriptor = "I")
	public static int anInt2295 = 1;

	@OriginalMember(owner = "client!ka", name = "v", descriptor = "I")
	public static int anInt2296 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!ka", name = "B", descriptor = "Lclient!gd;")
	public static Class1_Sub11 aClass1_Sub11_1 = new Class1_Sub11(0, 0);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(II)Lclient!kj;")
	public static Class1_Sub2_Sub12 method1766(@OriginalArg(0) int arg0) {
		@Pc(10) Class1_Sub2_Sub12 local10 = (Class1_Sub2_Sub12) Static167.aClass123_10.method3640((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static81.aClass70_22.method3509(arg0, 26);
		local10 = new Class1_Sub2_Sub12();
		if (local20 != null) {
			local10.method1879(new Class1_Sub16(local20));
		}
		Static167.aClass123_10.method3644(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(BI)V")
	public static void method1767(@OriginalArg(1) int arg0) {
		Static10.anInt227 = 1000 / arg0;
	}

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "(III)J")
	public static long method1769(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub7 local7 = Static22.aClass1_Sub7ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null || local7.aClass65_1 == null ? 0L : local7.aClass65_1.aLong85;
	}

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "(IZ)Lclient!ia;")
	public static Class51 method1770(@OriginalArg(0) int arg0) {
		return Static150.method2574(new Class51[] { Static27.method511(arg0 >> 24 & 0xFF), Static65.aClass51_472, Static27.method511(arg0 >> 16 & 0xFF), Static65.aClass51_472, Static27.method511(arg0 >> 8 & 0xFF), Static65.aClass51_472, Static27.method511(arg0 & 0xFF) });
	}
}
