import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static298 {

	@OriginalMember(owner = "client!mi", name = "b", descriptor = "Lclient!dn;")
	public static Class69 aClass69_59;

	@OriginalMember(owner = "client!mi", name = "c", descriptor = "[I")
	public static final int[] anIntArray455 = new int[13];

	@OriginalMember(owner = "client!mi", name = "g", descriptor = "Lclient!sc;")
	public static final Class263 aClass263_4 = new Class263();

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "([Lclient!et;II)V")
	public static void method5307(@OriginalArg(0) Class91[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			@Pc(13) Class91 local13 = arg0[local7];
			if (local13 != null) {
				if (local13.anInt2452 == 0) {
					if (local13.lb != null) {
						method5307(local13.lb, arg1);
					}
					@Pc(37) Class1_Sub35 local37 = (Class1_Sub35) Static362.aClass230_45.method6144((long) local13.anInt2368);
					if (local37 != null) {
						Static120.method7553(local37.anInt5502, arg1);
					}
				}
				@Pc(53) Class1_Sub10 local53;
				if (arg1 == 0 && local13.anObjectArray15 != null) {
					local53 = new Class1_Sub10();
					local53.aClass91_2 = local13;
					local53.anObjectArray4 = local13.anObjectArray15;
					Static173.method3207(local53);
				}
				if (arg1 == 1 && local13.anObjectArray26 != null) {
					if (local13.anInt2395 >= 0) {
						@Pc(76) Class91 local76 = Static384.method6156(local13.anInt2368);
						if (local76 == null || local76.lb == null || local76.lb.length <= local13.anInt2395 || local76.lb[local13.anInt2395] != local13) {
							continue;
						}
					}
					local53 = new Class1_Sub10();
					local53.aClass91_2 = local13;
					local53.anObjectArray4 = local13.anObjectArray26;
					Static173.method3207(local53);
				}
			}
		}
	}
}
