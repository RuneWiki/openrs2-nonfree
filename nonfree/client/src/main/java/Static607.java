import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static607 {

	@OriginalMember(owner = "client!vl", name = "c", descriptor = "F")
	public static float aFloat195;

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "Lclient!kr;")
	public static final Class194 aClass194_297 = new Class194(76, -2);

	@OriginalMember(owner = "client!vl", name = "f", descriptor = "I")
	public static int anInt9800 = 0;

	@OriginalMember(owner = "client!vl", name = "g", descriptor = "Z")
	public static boolean aBoolean749 = false;

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(Lclient!ob;Lclient!ob;I)V")
	public static void method8328(@OriginalArg(0) Class3_Sub7 arg0, @OriginalArg(1) Class3_Sub7 arg1) {
		if (arg1.aClass3_Sub7_64 != null) {
			arg1.method7907();
		}
		arg1.aClass3_Sub7_63 = arg0.aClass3_Sub7_63;
		arg1.aClass3_Sub7_64 = arg0;
		arg1.aClass3_Sub7_64.aClass3_Sub7_63 = arg1;
		arg1.aClass3_Sub7_63.aClass3_Sub7_64 = arg1;
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(B)V")
	public static void method8329() {
		@Pc(21) byte[] local21;
		if (Static52.anObject3 == null) {
			@Pc(14) Class223_Sub2_Sub1 local14 = new Class223_Sub2_Sub1();
			local21 = local14.method6889();
			Static52.anObject3 = Static176.method2904(local21);
		}
		if (Static125.anObject10 == null) {
			@Pc(32) Class223_Sub1_Sub2 local32 = new Class223_Sub1_Sub2();
			local21 = local32.method6931();
			Static125.anObject10 = Static176.method2904(local21);
		}
	}
}
