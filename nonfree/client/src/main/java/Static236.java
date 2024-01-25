import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static236 {

	@OriginalMember(owner = "client!jd", name = "A", descriptor = "Lclient!jba;")
	public static Class83 aClass83_3;

	@OriginalMember(owner = "client!jd", name = "G", descriptor = "Lclient!pu;")
	public static Class270 aClass270_51;

	@OriginalMember(owner = "client!jd", name = "F", descriptor = "Z")
	public static boolean aBoolean332 = false;

	@OriginalMember(owner = "client!jd", name = "d", descriptor = "(II)V")
	public static void method3579(@OriginalArg(0) int arg0) {
		@Pc(8) Class1_Sub6_Sub16 local8 = Static212.method3332(12, arg0);
		local8.method6593();
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(Lclient!rk;II)V")
	public static void method3580(@OriginalArg(0) Class290 arg0, @OriginalArg(2) int arg1) {
		if (Static507.anInt8646 >= 50 || (arg0 == null || arg0.anIntArrayArray172 == null || arg0.anIntArrayArray172.length <= arg1 || arg0.anIntArrayArray172[arg1] == null)) {
			return;
		}
		@Pc(30) int local30 = arg0.anIntArrayArray172[arg1][0];
		@Pc(34) int local34 = local30 >> 8;
		if (arg0.anIntArrayArray172[arg1].length > 1) {
			@Pc(53) int local53 = (int) (Math.random() * (double) arg0.anIntArrayArray172[arg1].length);
			if (local53 > 0) {
				local34 = arg0.anIntArrayArray172[arg1][local53];
			}
		}
		@Pc(74) int local74 = local30 >> 5 & 0x7;
		if (arg0.aBoolean600) {
			Static255.method3727(0, false, 255, local74, local34);
		} else {
			Static159.method2289(local34, local74, 0, 255);
		}
	}
}
