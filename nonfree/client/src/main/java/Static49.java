import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static49 {

	@OriginalMember(owner = "client!bn", name = "f", descriptor = "Lclient!tk;")
	public static Class331 aClass331_1;

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(IIBI)I")
	public static int method779(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int local8 = 255 - arg1;
		@Pc(31) int local31 = ((arg2 & 0xFF00) * arg1 & 0xFF0000 | (arg2 & 0xFF00FF) * arg1 & 0xFF00FF00) >>> 8;
		return (((arg0 & 0xFF00) * local8 & 0xFF0000 | (arg0 & 0xFF00FF) * local8 & 0xFF00FF00) >>> 8) + local31;
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(BLclient!wu;)V")
	public static void method782(@OriginalArg(1) Class384 arg0) {
		Static225.anInt3890 = 0;
		Static372.anInt6543 = 0;
		Static310.aClass363_7 = new Class363();
		Static580.aClass14_Sub2_Sub2_Sub1Array13 = new Class14_Sub2_Sub2_Sub1[1024];
		Static270.aClass14_Sub8Array1 = new Class14_Sub8[Static316.anIntArray398[Static210.anInt3641] + 1];
		Static362.anInt6388 = 0;
		Static214.anInt3693 = 0;
		Static69.method1138(arg0);
		Static430.method6460(arg0);
	}
}
