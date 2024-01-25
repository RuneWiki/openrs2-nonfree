import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static267 {

	@OriginalMember(owner = "client!nl", name = "c", descriptor = "Lclient!wf;")
	public static Class262 aClass262_2;

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "[I")
	public static final int[] anIntArray321 = new int[1];

	@OriginalMember(owner = "client!nl", name = "e", descriptor = "[Lclient!lh;")
	public static final Class16_Sub1_Sub5_Sub1[] aClass16_Sub1_Sub5_Sub1Array1 = new Class16_Sub1_Sub5_Sub1[2048];

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(BLclient!fd;)V")
	public static void method3829(@OriginalArg(1) Class19_Sub2 arg0) {
		@Pc(12) byte[] local12;
		if (Static109.anObject33 == null) {
			@Pc(5) Class48_Sub1_Sub1 local5 = new Class48_Sub1_Sub1();
			local12 = local5.method3759();
			Static109.anObject33 = Static327.method4416(local12);
		}
		if (Static113.anObject13 == null) {
			@Pc(32) Class48_Sub2_Sub1 local32 = new Class48_Sub2_Sub1();
			local12 = local32.method4412();
			Static113.anObject13 = Static327.method4416(local12);
		}
		@Pc(47) Class47 local47 = arg0.aClass47_1;
		if (local47.method1248() && Static190.anObject19 == null) {
			local12 = Static257.method3710(0.6F, 4.0F, 16.0F, 0.5F, new Class79_Sub1(419684), 4.0F);
			Static190.anObject19 = Static327.method4416(local12);
		}
	}
}
