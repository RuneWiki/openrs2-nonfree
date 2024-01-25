import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static520 {

	@OriginalMember(owner = "client!sh", name = "i", descriptor = "[I")
	public static int[] anIntArray677;

	@OriginalMember(owner = "client!sh", name = "n", descriptor = "Lclient!wn;")
	public static Class381 aClass381_1;

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(IIIII)V")
	public static void method7461(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(5) int local5 = Static262.anInt4375;
		@Pc(7) int local7 = Static624.anInt10117;
		if (Static144.aBoolean196) {
			local5 += Static577.method8147();
			local7 += Static601.method8395();
		}
		@Pc(28) Class44 local28;
		if (Static472.anInt7920 == 1) {
			local28 = Static92.aClass44Array17[Static372.anInt6544 / 100];
			local28.method5312(local5 - 8, local7 + -8);
			Static354.method5603(local28.method5313() + local5 - 8, local5 + -8, local28.method5325() + local7 - 8, local7 + -8);
		}
		if (Static472.anInt7920 == 2) {
			local28 = Static92.aClass44Array17[Static372.anInt6544 / 100 + 4];
			local28.method5312(local5 - 8, local7 + -8);
			Static354.method5603(local5 + local28.method5313() - 8, local5 + -8, local7 + local28.method5325() - 8, local7 + -8);
		}
		Static190.method675();
	}
}
