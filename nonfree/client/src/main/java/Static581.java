import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static581 {

	@OriginalMember(owner = "client!uv", name = "H", descriptor = "Lclient!cc;")
	public static Class47 aClass47_1;

	@OriginalMember(owner = "client!uv", name = "y", descriptor = "Lclient!ln;")
	public static final Class216 aClass216_17 = new Class216(12, 0, 1, 0);

	@OriginalMember(owner = "client!uv", name = "C", descriptor = "I")
	public static int anInt9774 = -2;

	@OriginalMember(owner = "client!uv", name = "c", descriptor = "(I)V")
	public static void method8402() {
		Static274.anInt4914 = 0;
		Static290.anInt5061 = Static302.anInt5267;
		Static517.aClass34Array5 = new Class34[500];
		Static41.aClass34Array2 = new Class34[500];
		Static519.anIntArrayArrayArray13 = new int[Static68.anInt1380][Static357.anInt5961 + 1][Static429.anInt7422 + 1];
		Static8.aClass34Array4 = new Class34[1000];
		Static239.anInt4416 = 0;
		Static108.aClass34Array3 = new Class34[2000];
		Static333.anInt5654 = 0;
		Static10.anInt222 = Static302.anInt5267;
		Static633.aBoolean755 = false;
		Static368.anInt6139 = 0;
		if (Static517.aClass133_13 instanceof oa) {
			Static437.aBoolean537 = false;
		} else {
			Static437.aBoolean537 = true;
		}
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(IIIII)V")
	public static void method8405(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(5) int local5 = Static158.anInt2675;
		@Pc(7) int local7 = Static397.anInt6609;
		if (Static428.aBoolean526) {
			local5 += Static584.method8436();
			local7 += Static88.method1487();
		}
		@Pc(30) Class28 local30;
		if (Static158.anInt2674 == 1) {
			local30 = Static386.aClass28Array18[Static173.anInt3107 / 100];
			local30.method4040(local5 - 8, local7 + -8);
			Static562.method5062(local7 - 8, local7 - (-local30.method4042() + 8), local30.method4035() + local5 - 8, local5 + -8);
		}
		if (Static158.anInt2674 == 2) {
			local30 = Static386.aClass28Array18[Static173.anInt3107 / 100 + 4];
			local30.method4040(local5 - 8, local7 + -8);
			Static562.method5062(local7 - 8, local30.method4042() + local7 + -8, local5 + local30.method4035() - 8, local5 + -8);
		}
		Static33.method523();
	}
}
