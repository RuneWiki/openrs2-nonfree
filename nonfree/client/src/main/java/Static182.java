import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static182 {

	@OriginalMember(owner = "client!gea", name = "z", descriptor = "Ljava/lang/String;")
	public static String aString27;

	@OriginalMember(owner = "client!gea", name = "w", descriptor = "[I")
	public static final int[] anIntArray232 = new int[1];

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(Lclient!qq;I)Lclient!qq;")
	public static Class4_Sub3_Sub4 method2909(@OriginalArg(0) Class4_Sub3_Sub4 arg0) {
		@Pc(14) Class4_Sub3_Sub4 local14 = arg0 == null ? new Class4_Sub3_Sub4() : new Class4_Sub3_Sub4(arg0);
		local14.method6786();
		return local14;
	}

	@OriginalMember(owner = "client!gea", name = "b", descriptor = "(Z)V")
	public static void method2910() {
		@Pc(16) byte[] local16;
		if (Static41.anObject1 == null) {
			@Pc(9) Class16_Sub2_Sub1 local9 = new Class16_Sub2_Sub1();
			local16 = local9.method6447();
			Static41.anObject1 = Static621.method8352(local16);
		}
		if (Static583.anObject18 == null) {
			@Pc(31) Class16_Sub1_Sub2 local31 = new Class16_Sub1_Sub2();
			local16 = local31.method1896();
			Static583.anObject18 = Static621.method8352(local16);
		}
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(IIZ)V")
	public static void method2912(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(10) Class4_Sub54 local10 = Static473.method6525(arg0, arg1);
		if (local10 != null) {
			for (@Pc(15) int local15 = 0; local15 < local10.anIntArray723.length; local15++) {
				local10.anIntArray723[local15] = -1;
				local10.anIntArray721[local15] = 0;
			}
		}
	}
}
