import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static576 {

	@OriginalMember(owner = "client!tj", name = "d", descriptor = "[Lclient!s;")
	public static Class51[] aClass51Array3;

	@OriginalMember(owner = "client!tj", name = "b", descriptor = "I")
	public static int anInt9887 = 1;

	@OriginalMember(owner = "client!tj", name = "e", descriptor = "Lclient!ok;")
	public static final Class262 aClass262_67 = new Class262();

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(IIIII)V")
	public static void method8232(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = arg3;
		@Pc(16) int local16 = -arg3;
		@Pc(18) int local18 = -1;
		Static679.method9323(Static274.anIntArrayArray34[arg1], arg0 - arg3, arg2, arg3 + arg0);
		while (local13 > local11) {
			local18 += 2;
			local16 += local18;
			local11++;
			if (local16 >= 0) {
				local13--;
				local16 -= local13 << 1;
				@Pc(58) int[] local58 = Static274.anIntArrayArray34[arg1 + local13];
				@Pc(64) int[] local64 = Static274.anIntArrayArray34[arg1 - local13];
				@Pc(69) int local69 = arg0 + local11;
				@Pc(74) int local74 = arg0 - local11;
				Static679.method9323(local58, local74, arg2, local69);
				Static679.method9323(local64, local74, arg2, local69);
			}
			@Pc(91) int local91 = arg0 + local13;
			@Pc(96) int local96 = arg0 - local13;
			@Pc(102) int[] local102 = Static274.anIntArrayArray34[local11 + arg1];
			@Pc(109) int[] local109 = Static274.anIntArrayArray34[arg1 - local11];
			Static679.method9323(local102, local96, arg2, local91);
			Static679.method9323(local109, local96, arg2, local91);
		}
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(Lclient!eo;I)V")
	public static void method8234(@OriginalArg(0) Class14_Sub19 arg0) {
		Static454.aClass262_45.method6314(arg0);
		arg0.anInt2685 = arg0.aClass14_Sub29_Sub1_1.anInt7264;
		arg0.aClass14_Sub29_Sub1_1.anInt7264 = 0;
		Static574.anInt9875 += arg0.anInt2685;
	}
}
