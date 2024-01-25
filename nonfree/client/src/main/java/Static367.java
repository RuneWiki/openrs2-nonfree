import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static367 {

	@OriginalMember(owner = "client!oca", name = "f", descriptor = "F")
	public static float aFloat152;

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "(B)V")
	public static void method6023() {
		Static183.aClass211_23.method5535();
	}

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "(Lclient!pe;I[ILclient!pe;)V")
	public static void method6024(@OriginalArg(0) Class254 arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) Class254 arg2) {
		Static181.aClass254_57 = arg2;
		Static16.aClass254_7 = arg0;
		if (arg1 != null) {
			Static500.anIntArray611 = arg1;
		}
	}

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "(III)Lclient!dda;")
	public static Class3_Sub4_Sub6 method6025(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(15) Class3_Sub4_Sub6 local15 = (Class3_Sub4_Sub6) Static474.aClass25_35.method946((long) arg1 | (long) arg0 << 32);
		if (local15 == null) {
			local15 = new Class3_Sub4_Sub6(arg0, arg1);
			Static474.aClass25_35.method945(local15, local15.aLong262);
		}
		return local15;
	}

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "(I)I")
	public static int method6026() {
		return Static468.anInt8769;
	}
}
