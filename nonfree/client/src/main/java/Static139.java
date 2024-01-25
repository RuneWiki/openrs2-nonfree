import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static139 {

	@OriginalMember(owner = "client!fl", name = "g", descriptor = "[Lclient!ha;")
	public static Class84[] aClass84Array4;

	@OriginalMember(owner = "client!fl", name = "w", descriptor = "Lclient!fs;")
	public static Class106 aClass106_1;

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "Lclient!cba;")
	public static final Class45 aClass45_44 = new Class45(11, 2);

	@OriginalMember(owner = "client!fl", name = "r", descriptor = "Lclient!ej;")
	public static final Class88 aClass88_82 = new Class88("glow3:", "leuchten3:", "brillant3:", "brilho3:");

	@OriginalMember(owner = "client!fl", name = "x", descriptor = "[I")
	public static final int[] anIntArray233 = new int[8];

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(IIB)Z")
	public static boolean method2815(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x580) != 0;
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(IIIIB)V")
	public static void method2818(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(13) float local13 = (float) Static2.anInt5920 / (float) Static2.anInt5911;
		@Pc(15) int local15 = arg1;
		@Pc(17) int local17 = arg3;
		if (local13 < 1.0F) {
			local17 = (int) ((float) arg1 * local13);
		} else {
			local15 = (int) ((float) arg3 / local13);
		}
		@Pc(44) int local44 = arg0 - (arg3 - local17) / 2;
		@Pc(52) int local52 = arg2 - (arg1 - local15) / 2;
		Static544.anInt9625 = -1;
		Static404.anInt7598 = Static2.anInt5920 - local44 * Static2.anInt5920 / local17;
		Static153.anInt3358 = local52 * Static2.anInt5911 / local15;
		Static265.anInt5303 = -1;
		Static505.method7495();
	}
}
