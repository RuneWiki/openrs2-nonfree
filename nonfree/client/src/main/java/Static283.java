import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static283 {

	@OriginalMember(owner = "client!jja", name = "O", descriptor = "Lclient!nc;")
	public static final Class243 aClass243_8 = new Class243();

	@OriginalMember(owner = "client!jja", name = "a", descriptor = "(IIII)V")
	public static void method4114(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 == Static212.anInt3677 && arg1 == Static111.anInt2049 && Static276.anInt4714 == arg0) {
			return;
		}
		Static212.anInt3677 = arg2;
		Static276.anInt4714 = arg0;
		Static182.aBoolean246 = true;
		Static111.anInt2049 = arg1;
		@Pc(36) double local36 = -((double) (arg2 * 2) * 3.141592653589793D) / (double) 16384;
		@Pc(46) double local46 = -((double) (arg1 * 2) * 3.141592653589793D) / 16384.0D;
		@Pc(49) double local49 = Math.cos(local46);
		@Pc(52) double local52 = Math.sin(local46);
		@Pc(55) double local55 = Math.cos(local36);
		@Pc(58) double local58 = Math.sin(local36);
		Static157.aDouble11 = local52;
		Static255.aDouble14 = 0.0D;
		Static235.aDouble13 = local55 * -local52;
		Static558.aDouble22 = local55 * local49;
		Static667.aDouble26 = local55;
		Static130.aDouble25 = -local49 * local58;
		Static562.aDouble23 = local49;
		Static300.aDouble16 = local58;
		Static90.aDouble1 = local58 * local52;
	}

	@OriginalMember(owner = "client!jja", name = "a", descriptor = "(Z)V")
	public static void method4115() {
		Static527.aClass325_2.method7323();
	}
}
