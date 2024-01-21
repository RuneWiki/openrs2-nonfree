import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static80 {

	@OriginalMember(owner = "client!ja", name = "F", descriptor = "I")
	public static int anInt2008;

	@OriginalMember(owner = "client!ja", name = "H", descriptor = "J")
	public static long aLong73;

	@OriginalMember(owner = "client!ja", name = "B", descriptor = "Z")
	public static boolean aBoolean89 = true;

	@OriginalMember(owner = "client!ja", name = "L", descriptor = "Lclient!oe;")
	public static final Class66 aClass66_32 = new Class66(64);

	@OriginalMember(owner = "client!ja", name = "N", descriptor = "[[B")
	public static final byte[][] aByteArrayArray8 = new byte[1000][];

	@OriginalMember(owner = "client!ja", name = "O", descriptor = "I")
	public static int anInt2012 = -1;

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(II)Lclient!ai;")
	public static Class4_Sub1_Sub3 method1603(@OriginalArg(1) int arg0) {
		@Pc(10) Class4_Sub1_Sub3 local10 = (Class4_Sub1_Sub3) Static27.aClass66_12.method2225((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static163.aClass62_43.method2878(3, arg0);
		local10 = new Class4_Sub1_Sub3();
		if (local20 != null) {
			local10.method183(new Class4_Sub11(local20));
		}
		Static27.aClass66_12.method2222(local10, (long) arg0);
		return local10;
	}
}
