import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static353 {

	@OriginalMember(owner = "client!wn", name = "b", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray5;

	@OriginalMember(owner = "client!wn", name = "e", descriptor = "J")
	public static long aLong82;

	@OriginalMember(owner = "client!wn", name = "k", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray27;

	@OriginalMember(owner = "client!wn", name = "c", descriptor = "Z")
	public static boolean aBoolean166 = false;

	@OriginalMember(owner = "client!wn", name = "i", descriptor = "I")
	public static int anInt2411 = -2;

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(IIIII)V")
	public static void method2004(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg2 >= arg3) {
			Static282.method4681(arg0, arg3, Static323.anIntArrayArray55[arg1], arg2);
		} else {
			Static282.method4681(arg0, arg2, Static323.anIntArrayArray55[arg1], arg3);
		}
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(Z)V")
	public static void method2007() {
		@Pc(1) Class103 local1 = Static299.aClass103_61;
		synchronized (Static299.aClass103_61) {
			Static299.aClass103_61.method2684();
		}
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(IIILclient!be;)V")
	public static void method2008(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class22_Sub1 arg3) {
		if (Static229.aClass49ArrayArrayArray6[arg0][arg1][arg2] == null) {
			Static248.method4274(arg0, arg1, arg2);
		}
		Static229.aClass49ArrayArrayArray6[arg0][arg1][arg2].aClass22_Sub1_1 = arg3;
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(Lclient!rk;I)V")
	public static void method2009(@OriginalArg(0) Class180 arg0) {
		Static86.aClass180_24 = arg0;
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(IB)Lclient!jn;")
	public static Class114 method2010(@OriginalArg(0) int arg0) {
		@Pc(15) Class114 local15 = (Class114) Static21.aClass103_1.method2682((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(25) byte[] local25 = Static54.aClass180_17.method4560(arg0, 30);
		local15 = new Class114();
		if (local25 != null) {
			local15.method3003(new Class7_Sub3(local25), arg0);
		}
		Static21.aClass103_1.method2687(local15, (long) arg0);
		return local15;
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(IBLclient!rk;I)Lclient!vm;")
	public static Class208 method2012(@OriginalArg(2) Class180 arg0, @OriginalArg(3) int arg1) {
		@Pc(17) byte[] local17 = arg0.method4560(0, arg1);
		return local17 == null ? null : new Class208(local17);
	}
}
