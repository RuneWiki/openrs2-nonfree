import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static48 {

	@OriginalMember(owner = "client!bp", name = "c", descriptor = "[I")
	public static int[] anIntArray589;

	@OriginalMember(owner = "client!bp", name = "g", descriptor = "Lclient!rp;")
	public static Class298 aClass298_12;

	@OriginalMember(owner = "client!bp", name = "b", descriptor = "Lclient!st;")
	public static final Class314 aClass314_139 = new Class314(56, 7);

	@OriginalMember(owner = "client!bp", name = "e", descriptor = "Z")
	public static boolean aBoolean705 = false;

	@OriginalMember(owner = "client!bp", name = "f", descriptor = "Lclient!mba;")
	public static Class216 aClass216_69 = new Class216();

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(Lclient!dw;I)V")
	public static void method8023(@OriginalArg(0) Class82_Sub1 arg0) {
		@Pc(12) byte[] local12;
		if (Static292.anObject14 == null) {
			@Pc(5) Class223_Sub2_Sub2 local5 = new Class223_Sub2_Sub2();
			local12 = local5.method6905();
			Static292.anObject14 = Static176.method2904(local12);
		}
		if (Static337.anObject17 == null) {
			@Pc(27) Class223_Sub1_Sub1 local27 = new Class223_Sub1_Sub1();
			local12 = local27.method5755();
			Static337.anObject17 = Static176.method2904(local12);
		}
		@Pc(42) Class79 local42 = arg0.aClass79_1;
		if (local42.method1821() && Static574.anObject22 == null) {
			local12 = Static455.method6749(4.0F, 0.5F, 16.0F, 4.0F, new Class80_Sub1(419684), 0.6F);
			Static574.anObject22 = Static176.method2904(local12);
		}
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(B)V")
	public static void method8027() {
		if (Static470.aClass82_13 != null) {
			Static470.aClass82_13.method6133();
			Static470.aClass82_13 = null;
			Static521.aClass63_14 = null;
		}
	}
}
