import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static340 {

	@OriginalMember(owner = "client!ne", name = "L", descriptor = "Lclient!laa;")
	public static final Class179 aClass179_9 = new Class179(13, 0, 1, 0);

	@OriginalMember(owner = "client!ne", name = "R", descriptor = "Lclient!laa;")
	public static final Class179 aClass179_10 = new Class179(11, 0, 1, 2);

	@OriginalMember(owner = "client!ne", name = "T", descriptor = "Z")
	public static boolean aBoolean452 = false;

	@OriginalMember(owner = "client!ne", name = "U", descriptor = "Lclient!ql;")
	public static final Class6_Sub12_Sub2 aClass6_Sub12_Sub2_1 = new Class6_Sub12_Sub2(5000);

	@OriginalMember(owner = "client!ne", name = "i", descriptor = "(I)V")
	public static void method5216() {
		@Pc(7) int local7 = Static333.anInt6355;
		@Pc(9) int[] local9 = Static354.anIntArray461;
		for (@Pc(11) int local11 = 0; local11 < local7; local11++) {
			@Pc(19) Class15_Sub2_Sub4_Sub2 local19 = Static551.aClass15_Sub2_Sub4_Sub2Array1[local9[local11]];
			if (local19 != null && local19.anInt8994 > 0) {
				local19.anInt8994--;
				if (local19.anInt8994 == 0) {
					local19.aString81 = null;
				}
			}
		}
		for (@Pc(49) int local49 = 0; local49 < Static429.anInt7650; local49++) {
			@Pc(56) long local56 = (long) Static46.anIntArray36[local49];
			@Pc(62) Class6_Sub49 local62 = (Class6_Sub49) Static251.aClass234_29.method5464(local56);
			if (local62 != null) {
				@Pc(67) Class15_Sub2_Sub4_Sub1 local67 = local62.aClass15_Sub2_Sub4_Sub1_2;
				if (local67.anInt8994 > 0) {
					local67.anInt8994--;
					if (local67.anInt8994 == 0) {
						local67.aString81 = null;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIFI[FIIZFIIFI)V")
	public static void method5218(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) float arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) float arg10, @OriginalArg(12) int arg11) {
		@Pc(5) int local5 = arg6 - arg0;
		@Pc(9) int local9 = arg8 - arg9;
		@Pc(13) int local13 = arg11 - arg3;
		@Pc(38) float local38 = arg4[0] * (float) local5 + arg4[1] * (float) local9 + arg4[2] * (float) local13;
		@Pc(59) float local59 = arg4[5] * (float) local13 + (float) local5 * arg4[3] + arg4[4] * (float) local9;
		@Pc(97) float local97 = arg4[8] * (float) local13 + (float) local9 * arg4[7] + arg4[6] * (float) local5;
		@Pc(115) float local115;
		@Pc(109) float local109;
		if (arg1 == 0) {
			local109 = arg7 + 0.5F - local97;
			local115 = arg2 + local38 + 0.5F;
		} else if (arg1 == 1) {
			local115 = local38 + arg2 + 0.5F;
			local109 = local97 + arg7 + 0.5F;
		} else if (arg1 == 2) {
			local115 = arg2 + 0.5F - local38;
			local109 = arg10 + 0.5F - local59;
		} else if (arg1 == 3) {
			local109 = arg10 + 0.5F - local59;
			local115 = local38 + arg2 + 0.5F;
		} else if (arg1 == 4) {
			local109 = arg10 + 0.5F - local59;
			local115 = local97 + arg7 + 0.5F;
		} else {
			local109 = arg10 + 0.5F - local59;
			local115 = arg7 + 0.5F - local97;
		}
		@Pc(218) float local218;
		if (arg5 == 1) {
			local218 = local115;
			local115 = -local109;
			local109 = local218;
		} else if (arg5 == 2) {
			local115 = -local115;
			local109 = -local109;
		} else if (arg5 == 3) {
			local218 = local115;
			local115 = local109;
			local109 = -local218;
		}
		Static194.aFloat89 = local115;
		Static565.aFloat207 = local109;
	}

	@OriginalMember(owner = "client!ne", name = "d", descriptor = "(III)Z")
	public static boolean method5221(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x400) != 0;
	}
}
