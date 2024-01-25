import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static336 {

	@OriginalMember(owner = "client!ob", name = "e", descriptor = "Lclient!kda;")
	public static Class160 aClass160_72;

	@OriginalMember(owner = "client!ob", name = "k", descriptor = "F")
	public static float aFloat123;

	@OriginalMember(owner = "client!ob", name = "g", descriptor = "I")
	public static int anInt6301 = 0;

	@OriginalMember(owner = "client!ob", name = "h", descriptor = "Lclient!h;")
	public static final Class114 aClass114_121 = new Class114("skill: ", "Fertigkeit: ", "compétence ", "habilidade: ");

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(FIII[FBIIIIF)V")
	public static void method5471(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) float arg9) {
		@Pc(5) int local5 = arg6 - arg1;
		@Pc(13) int local13 = arg2 - arg7;
		@Pc(17) int local17 = arg5 - arg3;
		@Pc(38) float local38 = arg4[2] * (float) local17 + arg4[0] * (float) local5 + (float) local13 * arg4[1];
		@Pc(59) float local59 = (float) local13 * arg4[4] + (float) local5 * arg4[3] + (float) local17 * arg4[5];
		@Pc(88) float local88 = (float) local5 * arg4[6] + arg4[7] * (float) local13 + arg4[8] * (float) local17;
		@Pc(99) float local99 = (float) Math.atan2((double) local38, (double) local88) / 6.2831855F + 0.5F;
		if (arg9 != 1.0F) {
			local99 *= arg9;
		}
		@Pc(113) float local113 = arg0 + local59 + 0.5F;
		@Pc(118) float local118;
		if (arg8 == 1) {
			local118 = local99;
			local99 = -local113;
			local113 = local118;
		} else if (arg8 == 2) {
			local99 = -local99;
			local113 = -local113;
		} else if (arg8 == 3) {
			local118 = local99;
			local99 = local113;
			local113 = -local118;
		}
		Static312.aFloat114 = local113;
		Static265.aFloat102 = local99;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(III)V")
	public static void method5472(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(20) boolean local20 = Static313.aClass206ArrayArrayArray2[0][arg1][arg2] != null && Static313.aClass206ArrayArrayArray2[0][arg1][arg2].aClass206_1 != null;
		for (@Pc(22) int local22 = arg0; local22 >= 0; local22--) {
			if (Static313.aClass206ArrayArrayArray2[local22][arg1][arg2] == null) {
				@Pc(46) Class206 local46 = Static313.aClass206ArrayArrayArray2[local22][arg1][arg2] = new Class206(local22, arg1, arg2);
				if (local20) {
					local46.aByte70++;
				}
			}
		}
	}
}
