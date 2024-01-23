import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static171 {

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "[I")
	public static int[] anIntArray486;

	@OriginalMember(owner = "client!rh", name = "f", descriptor = "I")
	public static int anInt3703;

	@OriginalMember(owner = "client!rh", name = "e", descriptor = "[S")
	public static short[] aShortArray50 = new short[500];

	@OriginalMember(owner = "client!rh", name = "h", descriptor = "[J")
	public static long[] aLongArray8 = new long[32];

	@OriginalMember(owner = "client!rh", name = "j", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1271 = Static200.method3116("oder benutzen Sie eine andere Welt)3");

	@OriginalMember(owner = "client!rh", name = "l", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1272 = Static200.method3116("W-=hlen Sie eine Welt");

	@OriginalMember(owner = "client!rh", name = "m", descriptor = "I")
	public static int anInt3707 = 1;

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(BI)Lclient!tg;")
	public static Class1_Sub1_Sub24 method2785(@OriginalArg(1) int arg0) {
		@Pc(10) Class1_Sub1_Sub24 local10 = (Class1_Sub1_Sub24) Static95.aClass39_16.method1161((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static31.aClass7_9.method3242(1, arg0);
		local10 = new Class1_Sub1_Sub24();
		if (local20 != null) {
			local10.method3004(new Class1_Sub9(local20), arg0);
		}
		Static95.aClass39_16.method1152((long) arg0, local10);
		return local10;
	}
}
