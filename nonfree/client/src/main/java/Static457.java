import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static457 {

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(IZILclient!wca;Lclient!pa;Lclient!qa;III)V")
	public static void method6975(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class310 arg2, @OriginalArg(4) Class209 arg3, @OriginalArg(5) Class39 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(10) Class182 local10 = Static387.aClass56_4.method1680(arg1);
		if (local10 == null || !local10.aBoolean397 || !local10.method4598(Static84.aClass302_1)) {
			return;
		}
		@Pc(36) int local36;
		if (local10.anIntArray468 != null) {
			@Pc(34) int[] local34 = new int[local10.anIntArray468.length];
			@Pc(48) int local48;
			for (local36 = 0; local36 < local34.length / 2; local36++) {
				if (Static427.anInt7875 == 4) {
					local48 = (int) Static161.aFloat56 & 0x3FFF;
				} else {
					local48 = (int) Static161.aFloat56 + Static87.anInt1767 & 0x3FFF;
				}
				@Pc(62) int local62 = Class125.anIntArray381[local48];
				@Pc(66) int local66 = Class125.anIntArray382[local48];
				if (Static427.anInt7875 != 4) {
					local62 = local62 * 256 / (Static3.anInt111 + 256);
					local66 = local66 * 256 / (Static3.anInt111 + 256);
				}
				local34[local36 * 2] = arg2.anInt9163 / 2 + arg7 + ((local10.anIntArray468[local36 * 2] * 4 + arg0) * local66 + local62 * (arg6 + local10.anIntArray468[local36 * 2 - -1] * 4) >> 15);
				local34[local36 * 2 + 1] = arg2.anInt9198 / 2 + arg5 - (local66 * (arg6 + local10.anIntArray468[local36 * 2 + 1] * 4) - (arg0 + local10.anIntArray468[local36 * 2] * 4) * local62 >> 15);
			}
			Static506.method7424(arg4, local34, local10.anInt5341, arg2.anIntArray705, arg2.anIntArray704);
			for (local48 = 0; local48 < local34.length / 2 - 1; local48++) {
				arg4.method6032(local34[local48 * 2], local34[local48 * 2 + 1], local34[local48 * 2 + 2], local34[local48 * 2 + 1 + 2], local10.anInt5325, arg3, arg7, arg5);
			}
			arg4.method6032(local34[local34.length - 2], local34[local34.length - 1], local34[0], local34[1], local10.anInt5325, arg3, arg7, arg5);
		}
		@Pc(265) Class35 local265 = null;
		if (local10.anInt5350 != -1) {
			local265 = local10.method4604(arg4, false);
			if (local265 != null) {
				Static426.method6571(arg6, arg7, local265, arg0, arg2, arg5, arg3);
			}
		}
		if (local10.aString118 == null) {
			return;
		}
		local36 = 0;
		if (local265 != null) {
			local36 = local265.la();
		}
		@Pc(298) Class47 local298 = Static301.aClass47_3;
		@Pc(300) Class52 local300 = Static182.aClass52_7;
		if (local10.anInt5326 == 1) {
			local300 = Static124.aClass52_6;
			local298 = Static477.aClass47_4;
		}
		if (local10.anInt5326 == 2) {
			local298 = Static175.aClass47_1;
			local300 = Static188.aClass52_2;
		}
		Static88.method1685(arg6, local36, arg0, arg5, local10.aString118, local300, arg7, local298, arg3, arg2, local10.anInt5351);
		return;
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(BI)V")
	public static void method6976(@OriginalArg(1) int arg0) {
		@Pc(8) Class2_Sub13_Sub15 local8 = Static370.method5893(arg0, 3);
		local8.method6974();
	}
}
