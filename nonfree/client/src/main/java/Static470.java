import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static470 {

	@OriginalMember(owner = "client!ro", name = "j", descriptor = "Lclient!mv;")
	public static Class229 aClass229_110;

	@OriginalMember(owner = "client!ro", name = "c", descriptor = "Z")
	public static boolean aBoolean648 = false;

	@OriginalMember(owner = "client!ro", name = "i", descriptor = "I")
	public static final int anInt7538 = Static234.method3333(1600);

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(IF[FBIIIIII)V")
	public static void method6058(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(9) int local9 = arg0 - arg3;
		@Pc(17) int local17 = arg5 - arg7;
		@Pc(21) int local21 = arg6 - arg8;
		@Pc(42) float local42 = arg2[1] * (float) local17 + arg2[0] * (float) local9 + (float) local21 * arg2[2];
		@Pc(63) float local63 = (float) local21 * arg2[5] + arg2[3] * (float) local9 + arg2[4] * (float) local17;
		@Pc(84) float local84 = arg2[7] * (float) local17 + arg2[6] * (float) local9 + arg2[8] * (float) local21;
		@Pc(99) float local99 = (float) Math.sqrt((double) (local63 * local63 + local42 * local42 + local84 * local84));
		@Pc(110) float local110 = (float) Math.atan2((double) local42, (double) local84) / 6.2831855F + 0.5F;
		@Pc(123) float local123 = arg1 + (float) Math.asin((double) (local63 / local99)) / 3.1415927F + 0.5F;
		@Pc(146) float local146;
		if (arg4 == 1) {
			local146 = local110;
			local110 = -local123;
			local123 = local146;
		} else if (arg4 == 2) {
			local123 = -local123;
			local110 = -local110;
		} else if (arg4 == 3) {
			local146 = local110;
			local110 = local123;
			local123 = -local146;
		}
		Static332.aFloat243 = local110;
		Static191.aFloat64 = local123;
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(BI)Lclient!th;")
	public static Class326 method6059(@OriginalArg(1) int arg0) {
		@Pc(18) Class326 local18 = (Class326) Static583.aClass21_96.method324((long) arg0);
		if (local18 != null) {
			return local18;
		}
		@Pc(28) byte[] local28 = Static270.aClass229_64.method4980(0, arg0);
		local18 = new Class326();
		if (local28 != null) {
			local18.method6623(new Class2_Sub7(local28));
		}
		local18.method6621();
		Static583.aClass21_96.method317(local18, (long) arg0);
		return local18;
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(IIIII)Z")
	public static boolean method6060(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if ((Static433.aByteArrayArrayArray15[0][arg2][arg0] & 0x2) != 0) {
			return true;
		} else if ((Static433.aByteArrayArrayArray15[arg3][arg2][arg0] & 0x10) == 0) {
			return Static535.method7029(arg3, arg0, arg2) == arg1;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(IIII)I")
	public static int method6062(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 > 243) {
			arg2 >>= 0x4;
		} else if (arg1 > 217) {
			arg2 >>= 0x3;
		} else if (arg1 > 192) {
			arg2 >>= 0x2;
		} else if (arg1 > 179) {
			arg2 >>= 0x1;
		}
		return (arg1 >> 1) + (arg2 >> 5 << 7) + ((arg0 >> 2 & 0x3F) << 10);
	}
}
