import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static227 {

	@OriginalMember(owner = "client!lm", name = "I", descriptor = "[I")
	public static final int[] anIntArray292 = new int[14];

	@OriginalMember(owner = "client!lm", name = "J", descriptor = "[I")
	public static int[] anIntArray293 = new int[1];

	@OriginalMember(owner = "client!lm", name = "K", descriptor = "[I")
	public static final int[] anIntArray294 = new int[100];

	@OriginalMember(owner = "client!lm", name = "M", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray17 = new String[100];

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(Lclient!jj;III)V")
	public static void method3448(@OriginalArg(0) Class120 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) long local7 = Static444.aLongArrayArrayArray2[arg1][arg2][arg3];
		@Pc(9) long local9 = 0L;
		arg0.anInt5351 = 0;
		@Pc(21) int local21;
		while (local9 <= 48L) {
			local21 = (int) (local7 >> (int) local9 & 0xFFFFL);
			if (local21 <= 0) {
				break;
			}
			arg0.aClass4_Sub21Array3[arg0.anInt5351++] = Static106.aClass191Array1[local21 - 1].aClass4_Sub21_2;
			local9 += 16L;
		}
		for (local21 = arg0.anInt5351; local21 < 4; local21++) {
			arg0.aClass4_Sub21Array3[local21] = null;
		}
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(III)Lclient!rb;")
	public static Class16_Sub5 method3449(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class164 local7 = Static202.aClass164ArrayArrayArray5[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass16_Sub5_3;
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(IIIIB)I")
	public static int method3450(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(21) int local21 = 65536 - Class50_Sub1.anIntArray224[arg0 * 8192 / arg1] >> 1;
		return (arg3 * local21 >> 16) + ((65536 - local21) * arg2 >> 16);
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(IBII)V")
	public static void method3451(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg1 << 3;
		@Pc(11) int local11 = arg0 << 3;
		if (Static111.anInt2386 == 2) {
			Static136.anInt2790 = local7;
			Static431.anInt7074 = local11;
			Static103.anInt2070 = 0;
		}
		Static368.aFloat192 = local7;
		Static164.aFloat142 = local11;
		Static269.method3855();
		Static251.aBoolean429 = true;
	}
}
