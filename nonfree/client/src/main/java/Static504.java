import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static504 {

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "[I")
	public static final int[] anIntArray488 = new int[13];

	@OriginalMember(owner = "client!sd", name = "d", descriptor = "Lclient!tm;")
	public static final Class337 aClass337_144 = new Class337(104, -1);

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lclient!rs;I)V")
	public static void method7543(@OriginalArg(0) Class133_Sub3 arg0) {
		@Pc(22) byte[] local22;
		if (Static406.anObject18 == null) {
			@Pc(15) Class7_Sub1_Sub1 local15 = new Class7_Sub1_Sub1();
			local22 = local15.method148();
			Static406.anObject18 = Static179.method2720(local22);
		}
		if (Static376.anObject14 == null) {
			@Pc(33) Class7_Sub2_Sub1 local33 = new Class7_Sub2_Sub1();
			local22 = local33.method4486();
			Static376.anObject14 = Static179.method2720(local22);
		}
		@Pc(48) Class313 local48 = arg0.aClass313_1;
		if (local48.method7541() && Static273.anObject12 == null) {
			local22 = Static445.method6720(16.0F, 4.0F, new Class136_Sub1(419684), 0.5F, 4.0F, 0.6F);
			Static273.anObject12 = Static179.method2720(local22);
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(II)I")
	public static int method7544(@OriginalArg(0) int arg0) {
		return arg0 >>> 7;
	}
}
