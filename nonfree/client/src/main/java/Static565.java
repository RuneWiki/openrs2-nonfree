import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static565 {

	@OriginalMember(owner = "client!wg", name = "l", descriptor = "Lclient!q;")
	public static Class34 aClass34_11;

	@OriginalMember(owner = "client!wg", name = "h", descriptor = "Lclient!nn;")
	public static final Class216 aClass216_16 = new Class216(10, 6);

	@OriginalMember(owner = "client!wg", name = "k", descriptor = "Lclient!cb;")
	public static final Class40 aClass40_196 = new Class40(16, 6);

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(IILclient!fa;Lclient!fca;Lclient!oa;IIII)V")
	public static void method7741(@OriginalArg(0) int arg0, @OriginalArg(2) Class16 arg1, @OriginalArg(3) Class97 arg2, @OriginalArg(4) Class121 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(14) Class179 local14 = Static474.aClass276_4.method6396(arg4);
		if (local14 == null || !local14.aBoolean285 || !local14.method3962(Static505.aClass30_1)) {
			return;
		}
		@Pc(34) int local34;
		if (local14.anIntArray449 != null) {
			@Pc(32) int[] local32 = new int[local14.anIntArray449.length];
			@Pc(48) int local48;
			for (local34 = 0; local34 < local32.length / 2; local34++) {
				if (Static354.anInt6233 == 4) {
					local48 = (int) Static399.aFloat167 & 0x3FFF;
				} else {
					local48 = Static574.anInt6272 + (int) Static399.aFloat167 & 0x3FFF;
				}
				@Pc(59) int local59 = Class138.anIntArray392[local48];
				@Pc(63) int local63 = Class138.anIntArray393[local48];
				if (Static354.anInt6233 != 4) {
					local59 = local59 * 256 / (Static291.anInt4749 + 256);
					local63 = local63 * 256 / (Static291.anInt4749 + 256);
				}
				local32[local34 * 2] = arg6 + arg2.anInt2340 / 2 + (local59 * (local14.anIntArray449[local34 * 2 + 1] * 4 + arg0) + local63 * (local14.anIntArray449[local34 * 2] * 4 + arg5) >> 14);
				local32[local34 * 2 + 1] = arg2.anInt2305 / 2 + arg7 - ((arg0 + local14.anIntArray449[local34 * 2 + 1] * 4) * local63 - (local14.anIntArray449[local34 * 2] * 4 + arg5) * local59 >> 14);
			}
			Static233.method3419(arg3, local32, local14.anInt4578, arg2.anIntArray290, arg2.anIntArray287);
			for (local48 = 0; local48 < local32.length / 2 - 1; local48++) {
				arg3.method7098(local32[local48 * 2], local32[local48 * 2 + 1], local32[local48 * 2 + 2], local32[(local48 + 1) * 2 + 1], local14.anInt4586, arg1, arg6, arg7);
			}
			arg3.method7098(local32[local32.length - 2], local32[local32.length - 1], local32[0], local32[1], local14.anInt4586, arg1, arg6, arg7);
		}
		@Pc(263) Class4 local263 = null;
		if (local14.anInt4581 != -1) {
			local263 = local14.method3964(arg3, false);
			if (local263 != null) {
				Static518.method2902(arg0, arg5, arg6, arg7, arg1, arg2, local263);
			}
		}
		if (local14.aString63 == null) {
			return;
		}
		local34 = 0;
		if (local263 != null) {
			local34 = local263.b();
		}
		@Pc(297) Class56 local297 = Static43.aClass56_1;
		@Pc(299) Class146 local299 = Static383.aClass146_9;
		if (local14.anInt4595 == 1) {
			local299 = Static340.aClass146_8;
			local297 = Static85.aClass56_2;
		}
		if (local14.anInt4595 == 2) {
			local297 = Static408.aClass56_4;
			local299 = Static338.aClass146_7;
		}
		Static453.method6446(arg5, local297, arg2, local14.anInt4575, local299, local14.aString63, arg7, local34, arg1, arg0, arg6);
		return;
	}
}
