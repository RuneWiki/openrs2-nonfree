import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static275 {

	@OriginalMember(owner = "client!u", name = "a", descriptor = "[S")
	public static short[] aShortArray84 = new short[256];

	@OriginalMember(owner = "client!u", name = "b", descriptor = "I")
	public static int anInt5043 = 0;

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(II)Lclient!vn;")
	public static Class183 method4210(@OriginalArg(0) int arg0) {
		@Pc(10) Class183 local10 = (Class183) Static146.aClass175_26.method4295((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25 = Static129.aClass119_48.method3235(Static284.method4292(arg0), Static104.method1986(arg0));
		local10 = new Class183();
		local10.anInt5451 = arg0;
		if (local25 != null) {
			local10.method4522(new Class1_Sub13(local25));
		}
		local10.method4514();
		Static146.aClass175_26.method4285(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(Lclient!kl;I)V")
	public static void method4211(@OriginalArg(0) Class11_Sub4_Sub1 arg0) {
		@Pc(17) Class1_Sub28 local17 = (Class1_Sub28) Static4.aClass86_3.method2136(Static282.method4276(arg0.aString99));
		if (local17 == null) {
			return;
		}
		if (local17.aClass1_Sub7_Sub1_2 != null) {
			Static173.aClass1_Sub7_Sub3_1.method3613(local17.aClass1_Sub7_Sub1_2);
			local17.aClass1_Sub7_Sub1_2 = null;
		}
		local17.method4573();
	}
}
