import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static322 {

	@OriginalMember(owner = "client!qd", name = "g", descriptor = "I")
	public static int anInt5579;

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(IIII)V")
	public static void method4341(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) Class164 local7 = Static202.aClass164ArrayArrayArray5[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		@Pc(13) Class16_Sub2 local13 = local7.aClass16_Sub2_2;
		@Pc(16) Class16_Sub2 local16 = local7.aClass16_Sub2_3;
		if (local13 != null) {
			local13.anInt4550 = local13.anInt4550 * arg3 / (0x10 << Static231.anInt4434 - 7);
			local13.anInt4551 = local13.anInt4551 * arg3 / (0x10 << Static231.anInt4434 - 7);
		}
		if (local16 != null) {
			local16.anInt4550 = local16.anInt4550 * arg3 / (0x10 << Static231.anInt4434 - 7);
			local16.anInt4551 = local16.anInt4551 * arg3 / (0x10 << Static231.anInt4434 - 7);
		}
	}
}
