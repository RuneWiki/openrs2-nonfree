import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static262 {

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(BLclient!nk;)V", line = 7)
	public static void method4887(@OriginalArg(1) Class161 arg0) {
		if (arg0.anInt4266 != Class60.anInt1736) {
			return;
		}
		if (Static17.aClass11_Sub5_Sub2_Sub1_3.aString41 == null) {
			arg0.anInt4306 = 0;
			arg0.anInt4230 = 0;
			return;
		}
		arg0.anInt4313 = 150;
		arg0.anInt4267 = (int) (Math.sin((double) Class83.anInt2345 / 40.0D) * 256.0D) & 0x7FF;
		arg0.anInt4306 = Class11_Sub3_Sub2.anInt4220;
		arg0.anInt4281 = 5;
		arg0.anInt4230 = Static253.method4652(Static17.aClass11_Sub5_Sub2_Sub1_3.aString41);
		arg0.anInt4309 = Static17.aClass11_Sub5_Sub2_Sub1_3.anInt4585;
		arg0.anInt4241 = Static17.aClass11_Sub5_Sub2_Sub1_3.anInt4617;
		arg0.anInt4276 = 0;
		arg0.anInt4292 = Static17.aClass11_Sub5_Sub2_Sub1_3.anInt4577;
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(Z)V", line = 39)
	public static void method4888() {
		for (@Pc(3) int local3 = 0; local3 < Static334.aByteArrayArrayArray16.length; local3++) {
			for (@Pc(12) int local12 = 0; local12 < Static334.aByteArrayArrayArray16[0].length; local12++) {
				for (@Pc(16) int local16 = 0; local16 < Static334.aByteArrayArrayArray16[0][0].length; local16++) {
					Static334.aByteArrayArrayArray16[local3][local12][local16] = 0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(II)V", line = 184)
	public static void method4894(@OriginalArg(1) int arg0) {
		@Pc(1) Class2_Sub2_Sub4 local1 = null;
		for (@Pc(3) int local3 = 1; local3 < arg0; local3++) {
			@Pc(8) Class6 local8 = Static307.aClass6Array3[local3];
			if (local8 != null) {
				for (@Pc(12) int local12 = 0; local12 < Static196.anInt3769; local12++) {
					for (@Pc(15) int local15 = 0; local15 < Static68.anInt1682; local15++) {
						local1 = local8.method5731(local15, local12, local1);
						if (local1 != null) {
							@Pc(28) int local28 = local15 << Static299.anInt6017;
							@Pc(32) int local32 = local12 << Static299.anInt6017;
							for (@Pc(36) int local36 = local3 - 1; local36 >= 0; local36--) {
								@Pc(41) Class6 local41 = Static307.aClass6Array3[local36];
								if (local41 != null) {
									@Pc(53) int local53 = local8.method5720(local15, local12) - local41.method5720(local15, local12);
									@Pc(67) int local67 = local8.method5720(local15 + 1, local12) - local41.method5720(local15 + 1, local12);
									@Pc(85) int local85 = local8.method5720(local15 + 1, local12 + 1) - local41.method5720(local15 + 1, local12 + 1);
									@Pc(99) int local99 = local8.method5720(local15, local12 + 1) - local41.method5720(local15, local12 + 1);
									local41.method5726(local1, local28, (local53 + local67 + local85 + local99) / 4, local32);
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(IIII)V", line = 255)
	public static void method4895(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) Class67 local7 = Static307.aClass67ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		@Pc(13) Class11_Sub3 local13 = local7.aClass11_Sub3_2;
		@Pc(16) Class11_Sub3 local16 = local7.aClass11_Sub3_3;
		if (local13 != null) {
			local13.anInt6335 = local13.anInt6335 * arg3 / 16;
			local13.anInt6338 = local13.anInt6338 * arg3 / 16;
		}
		if (local16 != null) {
			local16.anInt6335 = local16.anInt6335 * arg3 / 16;
			local16.anInt6338 = local16.anInt6338 * arg3 / 16;
		}
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(ILclient!r;)V", line = 277)
	public static void method4896(@OriginalArg(1) Class197 arg0) {
		Static266.aClass197_73 = arg0;
	}
}
