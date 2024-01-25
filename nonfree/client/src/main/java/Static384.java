import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static384 {

	@OriginalMember(owner = "client!nr", name = "n", descriptor = "[Lclient!id;")
	public static final Class142[] aClass142Array1 = new Class142[4];

	@OriginalMember(owner = "client!nr", name = "o", descriptor = "Lclient!mq;")
	public static final Class218 aClass218_88 = new Class218(37, 0);

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(III[Lclient!gaa;ZZ)V")
	public static void method6091(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class108[] arg3, @OriginalArg(5) boolean arg4) {
		for (@Pc(3) int local3 = 0; local3 < arg3.length; local3++) {
			@Pc(9) Class108 local9 = arg3[local3];
			if (local9 != null && local9.anInt4046 == arg0) {
				Static510.method7402(arg4, arg2, local9, arg1);
				Static259.method4852(arg1, arg2, local9);
				if (local9.anInt4084 - local9.anInt4067 < local9.anInt4056) {
					local9.anInt4056 = local9.anInt4084 - local9.anInt4067;
				}
				if (local9.anInt4009 > local9.anInt4035 - local9.anInt4037) {
					local9.anInt4009 = local9.anInt4035 - local9.anInt4037;
				}
				if (local9.anInt4056 < 0) {
					local9.anInt4056 = 0;
				}
				if (local9.anInt4009 < 0) {
					local9.anInt4009 = 0;
				}
				if (local9.anInt4018 == 0) {
					Static62.method1330(arg4, local9);
				}
			}
		}
	}
}
