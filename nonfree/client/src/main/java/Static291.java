import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static291 {

	@OriginalMember(owner = "client!qf", name = "z", descriptor = "I")
	public static int anInt5149;

	@OriginalMember(owner = "client!qf", name = "m", descriptor = "Lclient!sq;")
	public static final Class214 aClass214_29 = new Class214(32);

	@OriginalMember(owner = "client!qf", name = "n", descriptor = "Lclient!ms;")
	public static Class155 aClass155_28 = null;

	@OriginalMember(owner = "client!qf", name = "v", descriptor = "I")
	public static int anInt5148 = -1;

	@OriginalMember(owner = "client!qf", name = "w", descriptor = "Lclient!cs;")
	public static final Class41 aClass41_157 = new Class41(30, 11);

	@OriginalMember(owner = "client!qf", name = "y", descriptor = "Lclient!mq;")
	public static final Class154 aClass154_41 = new Class154(4);

	@OriginalMember(owner = "client!qf", name = "A", descriptor = "Z")
	public static boolean aBoolean382 = false;

	@OriginalMember(owner = "client!qf", name = "B", descriptor = "I")
	public static int anInt5150 = 0;

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(ZIIII)V")
	public static void method4429(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static313.anInt5542 <= arg1 && arg1 <= Static345.anInt6084) {
			@Pc(19) int local19 = Static355.method5388(Static332.anInt5823, arg2, Static202.anInt3722);
			@Pc(25) int local25 = Static355.method5388(Static332.anInt5823, arg3, Static202.anInt3722);
			Static279.method4311(arg0, arg1, local25, local19);
		}
	}
}
