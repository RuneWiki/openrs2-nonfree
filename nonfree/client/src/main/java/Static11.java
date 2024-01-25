import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static11 {

	@OriginalMember(owner = "client!af", name = "k", descriptor = "Z")
	public static boolean aBoolean11 = false;

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(Lclient!co;I)Lclient!ck;")
	public static Class52_Sub1 method320(@OriginalArg(0) Class5_Sub3 arg0) {
		return new Class52_Sub1(arg0.method4212(), arg0.method4212(), arg0.method4212(), arg0.method4212(), arg0.method4182(), arg0.method4182(), arg0.method4220());
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(III[FBIIIFI)V")
	public static void method321(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) float arg7, @OriginalArg(9) int arg8) {
		@Pc(9) int local9 = arg4 - arg6;
		@Pc(17) int local17 = arg5 - arg0;
		@Pc(21) int local21 = arg2 - arg1;
		@Pc(42) float local42 = arg3[0] * (float) local9 + arg3[1] * (float) local17 + (float) local21 * arg3[2];
		@Pc(63) float local63 = arg3[4] * (float) local17 + arg3[3] * (float) local9 + arg3[5] * (float) local21;
		@Pc(84) float local84 = (float) local9 * arg3[6] + (float) local17 * arg3[7] + arg3[8] * (float) local21;
		@Pc(99) float local99 = (float) Math.sqrt((double) (local84 * local84 + local63 * local63 + local42 * local42));
		@Pc(110) float local110 = (float) Math.atan2((double) local42, (double) local84) / 6.2831855F + 0.5F;
		@Pc(123) float local123 = arg7 + (float) Math.asin((double) (local63 / local99)) / 3.1415927F + 0.5F;
		@Pc(144) float local144;
		if (arg8 == 1) {
			local144 = local110;
			local110 = -local123;
			local123 = local144;
		} else if (arg8 == 2) {
			local110 = -local110;
			local123 = -local123;
		} else if (arg8 == 3) {
			local144 = local110;
			local110 = local123;
			local123 = -local144;
		}
		Static230.aFloat182 = local110;
		Static452.aFloat327 = local123;
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(IIIIII)V")
	public static void method323(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg1 > Static492.anInt8451 || Static4.anInt6709 > arg0) {
			return;
		}
		@Pc(25) boolean local25;
		if (arg2 < Static398.anInt7144) {
			local25 = false;
			arg2 = Static398.anInt7144;
		} else if (arg2 <= Static71.anInt4958) {
			local25 = true;
		} else {
			arg2 = Static71.anInt4958;
			local25 = false;
		}
		@Pc(48) boolean local48;
		if (arg4 < Static398.anInt7144) {
			arg4 = Static398.anInt7144;
			local48 = false;
		} else if (arg4 <= Static71.anInt4958) {
			local48 = true;
		} else {
			local48 = false;
			arg4 = Static71.anInt4958;
		}
		if (arg1 >= Static4.anInt6709) {
			Static321.method5153(arg3, arg2, Static352.anIntArrayArray51[arg1++], arg4);
		} else {
			arg1 = Static4.anInt6709;
		}
		if (Static492.anInt8451 >= arg0) {
			Static321.method5153(arg3, arg2, Static352.anIntArrayArray51[arg0--], arg4);
		} else {
			arg0 = Static492.anInt8451;
		}
		@Pc(106) int local106;
		if (local25 && local48) {
			for (local106 = arg1; local106 <= arg0; local106++) {
				@Pc(148) int[] local148 = Static352.anIntArrayArray51[local106];
				local148[arg2] = local148[arg4] = arg3;
			}
		} else if (local25) {
			for (local106 = arg1; local106 <= arg0; local106++) {
				Static352.anIntArrayArray51[local106][arg2] = arg3;
			}
		} else if (local48) {
			for (local106 = arg1; local106 <= arg0; local106++) {
				Static352.anIntArrayArray51[local106][arg4] = arg3;
			}
		}
	}
}
