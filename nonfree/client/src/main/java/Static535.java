import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static535 {

	@OriginalMember(owner = "client!um", name = "c", descriptor = "Lclient!wp;")
	public static Class361 aClass361_16;

	@OriginalMember(owner = "client!um", name = "d", descriptor = "I")
	public static int anInt8569;

	@OriginalMember(owner = "client!um", name = "e", descriptor = "[I")
	public static int[] anIntArray564;

	@OriginalMember(owner = "client!um", name = "g", descriptor = "Lclient!tf;")
	public static Class322 aClass322_147;

	@OriginalMember(owner = "client!um", name = "h", descriptor = "I")
	public static int anInt8571;

	@OriginalMember(owner = "client!um", name = "f", descriptor = "I")
	public static int anInt8570 = 0;

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(B[J[Ljava/lang/Object;)V")
	public static void method7131(@OriginalArg(1) long[] arg0, @OriginalArg(2) Object[] arg1) {
		Static573.method7706(arg1, arg0.length - 1, 0, arg0);
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(Lclient!vj;I)V")
	public static void method7132(@OriginalArg(0) Class45_Sub3 arg0) {
		@Pc(12) byte[] local12;
		if (Static260.anObject9 == null) {
			@Pc(5) Class2_Sub1_Sub1 local5 = new Class2_Sub1_Sub1();
			local12 = local5.method39();
			Static260.anObject9 = Static258.method6206(local12);
		}
		if (Static255.anObject8 == null) {
			@Pc(32) Class2_Sub2_Sub1 local32 = new Class2_Sub2_Sub1();
			local12 = local32.method6148();
			Static255.anObject8 = Static258.method6206(local12);
		}
		@Pc(47) Class146 local47 = arg0.aClass146_1;
		if (local47.method3529() && Static376.anObject14 == null) {
			local12 = Static282.method4209(4.0F, new Class182_Sub1(419684), 4.0F, 16.0F, 0.6F, 0.5F);
			Static376.anObject14 = Static258.method6206(local12);
		}
	}
}
