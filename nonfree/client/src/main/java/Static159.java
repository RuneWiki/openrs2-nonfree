import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static159 {

	@OriginalMember(owner = "client!m", name = "c", descriptor = "[Lclient!ek;")
	public static Class1_Sub2_Sub2_Sub1[] aClass1_Sub2_Sub2_Sub1Array2;

	@OriginalMember(owner = "client!m", name = "h", descriptor = "Lclient!cg;")
	public static Class24 aClass24_2;

	@OriginalMember(owner = "client!m", name = "k", descriptor = "I")
	public static int anInt2976;

	@OriginalMember(owner = "client!m", name = "m", descriptor = "I")
	public static int anInt2978;

	@OriginalMember(owner = "client!m", name = "o", descriptor = "F")
	public static float aFloat83;

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(Lclient!cd;Lclient!wn;I)Lclient!rc;")
	public static Class1_Sub25 method2474(@OriginalArg(0) Class22 arg0, @OriginalArg(1) Class182 arg1) {
		@Pc(27) long local27 = (long) (arg1.anInt5921 + (arg1.anInt5922 + 1 << 16)) + ((long) arg1.anInt5920 << 32) + ((long) arg1.anInt5919 << 56);
		@Pc(39) Class1_Sub25 local39 = (Class1_Sub25) arg0.method633(local27);
		if (local39 == null) {
			local39 = new Class1_Sub25(arg1.anInt5922, (float) arg1.anInt5921, true, false, arg1.anInt5920);
			arg0.method643(local27, local39);
		}
		return local39;
	}

	@OriginalMember(owner = "client!m", name = "b", descriptor = "(I)V")
	public static void method2477() {
		Static102.aClass31_17.method855();
	}
}
