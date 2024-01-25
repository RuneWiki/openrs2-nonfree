import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static252 {

	@OriginalMember(owner = "client!jaa", name = "l", descriptor = "Lclient!eaa;")
	public static Class80 aClass80_3;

	@OriginalMember(owner = "client!jaa", name = "m", descriptor = "Lclient!d;")
	public static Interface6 anInterface6_14;

	@OriginalMember(owner = "client!jaa", name = "n", descriptor = "Lclient!mr;")
	public static Class226 aClass226_3;

	@OriginalMember(owner = "client!jaa", name = "h", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray22 = new String[100];

	@OriginalMember(owner = "client!jaa", name = "p", descriptor = "Lclient!g;")
	public static final Class113 aClass113_2 = new Class113("LIVE", 0);

	@OriginalMember(owner = "client!jaa", name = "t", descriptor = "[I")
	public static int[] anIntArray275 = new int[1];

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(IIIBI)V")
	public static void method3508(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(12) int local12 = 0; local12 < Static385.anInt6044; local12++) {
			@Pc(18) Rectangle local18 = Class2_Sub2_Sub10.aRectangleArray1[local12];
			if (arg1 < local18.width + local18.x && arg1 + arg0 > local18.x && arg3 < local18.height + local18.y && local18.y < arg2 + arg3) {
				Static69.aBooleanArray25[local12] = true;
			}
		}
		Static170.method7976(arg0 + arg1, arg3 + arg2, arg1, arg3);
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "([Lclient!paa;IB)V")
	public static void method3509(@OriginalArg(0) Class261[] arg0, @OriginalArg(1) int arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			@Pc(13) Class261 local13 = arg0[local7];
			if (local13 != null && local13.anInt6631 == arg1 && !Static76.method1080(local13)) {
				if (local13.anInt6635 == 0) {
					method3509(arg0, local13.anInt6614);
					if (local13.aClass261Array2 != null) {
						method3509(local13.aClass261Array2, local13.anInt6614);
					}
					@Pc(50) Class2_Sub9 local50 = (Class2_Sub9) Static606.aClass118_47.method2595((long) local13.anInt6614);
					if (local50 != null) {
						Static564.method7730(local50.anInt2171);
					}
				}
				if (local13.anInt6635 == 6 && local13.anInt6578 != -1) {
					@Pc(72) Class81 local72 = Static540.aClass173_2.method3791(local13.anInt6578);
					if (local72 != null) {
						local13.anInt6597 += Static544.anInt9305;
						@Pc(83) int local83 = local13.anInt6581;
						while (local13.anInt6597 > local72.anIntArray151[local13.anInt6581]) {
							local13.anInt6597 -= local72.anIntArray151[local13.anInt6581];
							local13.anInt6581++;
							if (local72.anIntArray149.length <= local13.anInt6581) {
								local13.anInt6581 -= local72.anInt2150;
								if (local13.anInt6581 < 0 || local72.anIntArray149.length <= local13.anInt6581) {
									local13.anInt6581 = 0;
								}
							}
							local13.anInt6636 = local13.anInt6581 + 1;
							if (local72.anIntArray149.length <= local13.anInt6636) {
								local13.anInt6636 -= local72.anInt2150;
								if (local13.anInt6636 < 0 || local72.anIntArray149.length <= local13.anInt6636) {
									local13.anInt6636 = -1;
								}
							}
							Static624.method8351(local13);
						}
						if (local13.anInt6581 != local83) {
							Static350.method4702(local13.anInt6581, local72);
						}
					}
				}
			}
		}
	}
}
