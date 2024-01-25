import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static168 {

	@OriginalMember(owner = "client!gea", name = "b", descriptor = "Lclient!dc;")
	public static final Class70 aClass70_8 = new Class70();

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(IIBI)V")
	public static void method2199(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(17) Class75 local17 = Static268.aClass75ArrayArray1[arg0][arg1];
		Static244.method3470(local17 == null ? Static135.aClass75_5 : local17, arg2);
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "([FII)[F")
	public static float[] method2200(@OriginalArg(0) float[] arg0, @OriginalArg(2) int arg1) {
		@Pc(11) float[] local11 = new float[arg1];
		Static598.method4263(arg0, 0, local11, 0, arg1);
		return local11;
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(I)V")
	public static void method2201() {
		@Pc(7) int local7 = Static84.anInt9548;
		@Pc(9) int[] local9 = Static520.anIntArray555;
		for (@Pc(19) int local19 = 0; local19 < local7; local19++) {
			@Pc(27) Class12_Sub2_Sub1_Sub4_Sub1 local27 = Static520.aClass12_Sub2_Sub1_Sub4_Sub1Array1[local9[local19]];
			if (local27 != null) {
				Static364.method5140(local27.method6777(), local27);
			}
		}
	}
}
