import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static109 {

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "F")
	public static float aFloat58 = 1.0F;

	@OriginalMember(owner = "client!ed", name = "d", descriptor = "Z")
	public static boolean aBoolean213 = false;

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(ILclient!pa;Lclient!qa;BIILclient!mc;II)V")
	public static void method2273(@OriginalArg(0) int arg0, @OriginalArg(1) Class145 arg1, @OriginalArg(2) Class42 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class198 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(12) Class152 local12 = Static293.aClass93_8.method2480(arg7);
		if (local12 == null || !local12.aBoolean379 || !local12.method4026(Static393.aClass31_1)) {
			return;
		}
		@Pc(32) int local32;
		if (local12.anIntArray344 != null) {
			@Pc(30) int[] local30 = new int[local12.anIntArray344.length];
			@Pc(42) int local42;
			for (local32 = 0; local32 < local30.length / 2; local32++) {
				if (Static242.anInt4993 == 4) {
					local42 = (int) Static500.aFloat186 & 0x3FFF;
				} else {
					local42 = Static432.anInt7990 + (int) Static500.aFloat186 & 0x3FFF;
				}
				@Pc(55) int local55 = Class12_Sub1_Sub36.anIntArray667[local42];
				@Pc(59) int local59 = Class12_Sub1_Sub36.anIntArray668[local42];
				if (Static242.anInt4993 != 4) {
					local59 = local59 * 256 / (Static339.anInt6470 + 256);
					local55 = local55 * 256 / (Static339.anInt6470 + 256);
				}
				local30[local32 * 2] = arg5.anInt5762 / 2 + arg6 + (local55 * (local12.anIntArray344[local32 * 2 + 1] * 4 + arg4) + local59 * (arg0 + local12.anIntArray344[local32 * 2] * 4) >> 15);
				local30[local32 * 2 + 1] = arg5.anInt5715 / 2 + arg3 - ((local12.anIntArray344[local32 * 2 + 1] * 4 + arg4) * local59 - (local12.anIntArray344[local32 * 2] * 4 + arg0) * local55 >> 15);
			}
			Static364.method5687(arg2, local30, local12.anInt4735, arg5.anIntArray408, arg5.anIntArray405);
			for (local42 = 0; local42 < local30.length / 2 - 1; local42++) {
				arg2.method5793(local30[local42 * 2], local30[local42 * 2 + 1], local30[local42 * 2 + 2], local30[local42 * 2 + 3], local12.anInt4750, arg1, arg6, arg3);
			}
			arg2.method5793(local30[local30.length - 2], local30[local30.length - 1], local30[0], local30[1], local12.anInt4750, arg1, arg6, arg3);
		}
		@Pc(259) Class84 local259 = null;
		if (local12.anInt4736 != -1) {
			local259 = local12.method4017(false, arg2);
			if (local259 != null) {
				Static294.method4768(arg6, arg0, arg1, arg4, local259, arg5, arg3);
			}
		}
		if (local12.aString44 == null) {
			return;
		}
		local32 = 0;
		if (local259 != null) {
			local32 = local259.la();
		}
		@Pc(293) Class80 local293 = Static340.aClass80_3;
		@Pc(295) Class244 local295 = Static186.aClass244_3;
		if (local12.anInt4756 == 1) {
			local295 = Static267.aClass244_5;
			local293 = Static56.aClass80_2;
		}
		if (local12.anInt4756 == 2) {
			local293 = Static12.aClass80_1;
			local295 = Static445.aClass244_7;
		}
		Static251.method4332(local12.anInt4730, local12.aString44, local295, arg6, arg3, arg4, local32, arg5, local293, arg0, arg1);
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(II)Z")
	public static boolean method2274(@OriginalArg(1) int arg0) {
		return arg0 == 6 || arg0 == 7 || arg0 == 8;
	}
}
