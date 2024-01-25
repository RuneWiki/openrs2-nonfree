import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static442 {

	@OriginalMember(owner = "client!ou", name = "l", descriptor = "Lclient!qia;")
	public static Class6_Sub46 aClass6_Sub46_2;

	@OriginalMember(owner = "client!ou", name = "k", descriptor = "I")
	public static int anInt7704;

	@OriginalMember(owner = "client!ou", name = "j", descriptor = "Z")
	public static boolean aBoolean581 = false;

	@OriginalMember(owner = "client!ou", name = "o", descriptor = "Lclient!sb;")
	public static final Class322 aClass322_133 = new Class322(107, 5);

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(IBII)V")
	public static void method6873(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 == Static35.anInt464 && Static500.anInt8393 == arg0 && Static150.anInt3123 == arg2) {
			return;
		}
		Static429.aBoolean549 = true;
		Static150.anInt3123 = arg2;
		Static35.anInt464 = arg1;
		Static500.anInt8393 = arg0;
		@Pc(36) double local36 = -((double) (arg1 * 2) * 3.141592653589793D) / 16384.0D;
		@Pc(46) double local46 = -((double) (arg0 * 2) * 3.141592653589793D) / 16384.0D;
		@Pc(49) double local49 = Math.cos(local46);
		@Pc(52) double local52 = Math.sin(local46);
		@Pc(55) double local55 = Math.cos(local36);
		@Pc(58) double local58 = Math.sin(local36);
		Static410.aDouble27 = local52 * local58;
		Static41.aDouble4 = local58 * -local49;
		Static517.aDouble44 = 0.0D;
		Static494.aDouble18 = local55 * -local52;
		Static522.aDouble46 = local49;
		Static480.aDouble55 = local55 * local49;
		Static427.aDouble29 = local52;
		Static277.aDouble21 = local58;
		Static526.aDouble47 = local55;
	}
}
