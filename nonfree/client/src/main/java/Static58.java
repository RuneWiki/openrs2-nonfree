import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static58 {

	@OriginalMember(owner = "client!ct", name = "M", descriptor = "F")
	public static float aFloat8;

	@OriginalMember(owner = "client!ct", name = "I", descriptor = "Lclient!rn;")
	public static final Class217 aClass217_26 = new Class217(41, 8);

	@OriginalMember(owner = "client!ct", name = "N", descriptor = "I")
	public static int anInt1564 = -1;

	@OriginalMember(owner = "client!ct", name = "P", descriptor = "Lclient!rn;")
	public static final Class217 aClass217_27 = new Class217(80, 6);

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(Lclient!bu;I)V")
	public static void method1218(@OriginalArg(0) Class32 arg0) {
		Static359.anInt6090 = arg0.method807("titlebg");
		Static275.anInt5095 = arg0.method807("logo");
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(IFFF)I")
	public static int method1219(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		@Pc(12) float local12 = arg1 < 0.0F ? -arg1 : arg1;
		@Pc(21) float local21 = arg0 < 0.0F ? -arg0 : arg0;
		@Pc(30) float local30 = arg2 < 0.0F ? -arg2 : arg2;
		if (local12 < local21 && local21 > local30) {
			return arg0 > 0.0F ? 0 : 1;
		} else if (local30 > local12 && local30 > local21) {
			return arg2 > 0.0F ? 2 : 3;
		} else if (arg1 > 0.0F) {
			return 4;
		} else {
			return 5;
		}
	}
}
