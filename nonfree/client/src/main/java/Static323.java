import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static323 {

	@OriginalMember(owner = "client!mfa", name = "U", descriptor = "F")
	public static float aFloat145;

	@OriginalMember(owner = "client!mfa", name = "L", descriptor = "Lclient!ra;")
	public static final Class276 aClass276_84 = new Class276(78, 11);

	@OriginalMember(owner = "client!mfa", name = "Y", descriptor = "Lclient!ra;")
	public static final Class276 aClass276_85 = new Class276(40, 2);

	@OriginalMember(owner = "client!mfa", name = "a", descriptor = "(IIILclient!tc;ILclient!oa;IILclient!fa;)V")
	public static void method5611(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class305 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class15 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class93 arg7) {
		@Pc(8) Class70 local8 = Static44.aClass10_1.method400(arg5);
		if (local8 == null || !local8.aBoolean185 || !local8.method2132(Static588.aClass322_1)) {
			return;
		}
		@Pc(33) int local33;
		if (local8.anIntArray119 != null) {
			@Pc(31) int[] local31 = new int[local8.anIntArray119.length];
			@Pc(44) int local44;
			for (local33 = 0; local33 < local31.length / 2; local33++) {
				if (Static267.anInt5668 == 4) {
					local44 = (int) Static533.aFloat188 & 0x3FFF;
				} else {
					local44 = Static288.anInt5964 + (int) Static533.aFloat188 & 0x3FFF;
				}
				@Pc(56) int local56 = Class2_Sub3.anIntArray620[local44];
				@Pc(60) int local60 = Class2_Sub3.anIntArray621[local44];
				if (Static267.anInt5668 != 4) {
					local60 = local60 * 256 / (Static66.anInt1706 + 256);
					local56 = local56 * 256 / (Static66.anInt1706 + 256);
				}
				local31[local33 * 2] = ((local8.anIntArray119[local33 * 2] * 4 + arg0) * local60 + (arg3 + local8.anIntArray119[local33 * 2 + 1] * 4) * local56 >> 14) + arg2.anInt9242 / 2 + arg6;
				local31[local33 * 2 + 1] = arg2.anInt9160 / 2 + arg1 - (local60 * (local8.anIntArray119[local33 * 2 + 1] * 4 + arg3) - local56 * (local8.anIntArray119[local33 * 2] * 4 + arg0) >> 14);
			}
			Static371.method6065(arg4, local31, local8.anInt2386, arg2.anIntArray599, arg2.anIntArray601);
			for (local44 = 0; local44 < local31.length / 2 - 1; local44++) {
				arg4.method5351(local31[local44 * 2], local31[local44 * 2 + 1], local31[(local44 + 1) * 2], local31[local44 * 2 + 1 + 2], local8.anInt2394, arg7, arg6, arg1);
			}
			arg4.method5351(local31[local31.length - 2], local31[local31.length - 1], local31[0], local31[1], local8.anInt2394, arg7, arg6, arg1);
		}
		@Pc(260) Class37 local260 = null;
		if (local8.anInt2378 != -1) {
			local260 = local8.method2140(arg4, false);
			if (local260 != null) {
				Static353.method5872(local260, arg1, arg7, arg3, arg2, arg0, arg6);
			}
		}
		if (local8.aString30 == null) {
			return;
		}
		local33 = 0;
		if (local260 != null) {
			local33 = local260.b();
		}
		@Pc(297) Class111 local297 = Static598.aClass111_14;
		@Pc(299) Class297 local299 = Static200.aClass297_9;
		if (local8.anInt2382 == 1) {
			local297 = Static137.aClass111_5;
			local299 = Static13.aClass297_2;
		}
		if (local8.anInt2382 == 2) {
			local299 = Static9.aClass297_1;
			local297 = Static162.aClass111_6;
		}
		Static151.method2968(arg3, local297, arg7, arg1, local8.anInt2395, arg0, local299, arg6, local33, arg2, local8.aString30);
		return;
	}
}
