import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static363 {

	@OriginalMember(owner = "client!mc", name = "c", descriptor = "[I")
	public static int[] anIntArray518;

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "I")
	public static int anInt5849 = 0;

	@OriginalMember(owner = "client!mc", name = "d", descriptor = "[Lclient!vq;")
	public static final Class372[] aClass372Array1 = new Class372[14];

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(ZLclient!wc;)V")
	public static void method5314(@OriginalArg(1) Class28_Sub1_Sub1_Sub1_Sub1 arg0) {
		@Pc(15) Class3_Sub8 local15 = (Class3_Sub8) Static533.aClass83_35.method2368((long) arg0.anInt10762);
		if (local15 == null) {
			Static581.method7253(arg0.anIntArray956[0], arg0.anIntArray955[0], (Class28_Sub1_Sub1_Sub1_Sub2) null, (Class277) null, arg0, 0, arg0.aByte174);
		} else {
			local15.method1055();
		}
	}
}
