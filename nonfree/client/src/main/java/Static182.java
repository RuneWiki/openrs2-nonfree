import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static182 {

	@OriginalMember(owner = "client!iv", name = "j", descriptor = "I")
	public static int anInt3626;

	@OriginalMember(owner = "client!iv", name = "c", descriptor = "Lclient!ef;")
	public static final Class61 aClass61_3 = new Class61(2, 4, 4, 0);

	@OriginalMember(owner = "client!iv", name = "h", descriptor = "I")
	public static int anInt3624 = 0;

	@OriginalMember(owner = "client!iv", name = "l", descriptor = "[Lclient!nd;")
	public static final Class161[] aClass161Array1 = new Class161[4];

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(III)Z")
	public static boolean method2886(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x400) != 0;
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(IILclient!ea;IILclient!mq;IILclient!qa;)V")
	public static void method2887(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class58 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class156 arg5, @OriginalArg(6) int arg6, @OriginalArg(8) Class172 arg7) {
		@Pc(12) Class90 local12 = Static168.aClass171_3.method3940(arg4);
		if (local12 == null || !local12.aBoolean241 || !local12.method2034(Static85.aClass49_1)) {
			return;
		}
		@Pc(34) int local34;
		if (local12.anIntArray162 != null) {
			@Pc(32) int[] local32 = new int[local12.anIntArray162.length];
			@Pc(45) int local45;
			for (local34 = 0; local34 < local32.length / 2; local34++) {
				if (Static161.anInt3316 == 4) {
					local45 = (int) Static252.aFloat47 & 0x3FFF;
				} else {
					local45 = Static20.anInt696 + (int) Static252.aFloat47 & 0x3FFF;
				}
				@Pc(55) int local55 = Class3_Sub2_Sub17.anIntArray289[local45];
				@Pc(59) int local59 = Class3_Sub2_Sub17.anIntArray290[local45];
				if (Static161.anInt3316 != 4) {
					local59 = local59 * 256 / (Static341.anInt5790 + 256);
					local55 = local55 * 256 / (Static341.anInt5790 + 256);
				}
				local32[local34 * 2] = ((local12.anIntArray162[local34 * 2 + 1] * 4 + arg0) * local55 + (arg6 + local12.anIntArray162[local34 * 2] * 4) * local59 >> 15) + arg5.anInt4853 / 2 + arg1;
				local32[local34 * 2 + 1] = arg3 + arg5.anInt4823 / 2 - ((local12.anIntArray162[local34 * 2 + 1] * 4 + arg0) * local59 - (arg6 + local12.anIntArray162[local34 * 2] * 4) * local55 >> 15);
			}
			Static211.method3257(arg7, local32, local12.anInt2729, arg5.anIntArray315, arg5.anIntArray314);
			for (local45 = 0; local45 < local32.length / 2 - 1; local45++) {
				arg7.method5498(local32[local45 * 2], local32[local45 * 2 + 1], local32[(local45 + 1) * 2], local32[(local45 + 1) * 2 + 1], local12.anInt2706, arg2, arg1, arg3);
			}
			arg7.method5498(local32[local32.length - 2], local32[local32.length - 1], local32[0], local32[1], local12.anInt2706, arg2, arg1, arg3);
		}
		@Pc(268) Class8 local268 = null;
		if (local12.anInt2704 != -1) {
			local268 = local12.method2033(arg7, false);
			if (local268 != null) {
				Static290.method4095(arg1, arg2, arg5, arg6, arg3, local268, arg0);
			}
		}
		if (local12.aString18 == null) {
			return;
		}
		local34 = 0;
		if (local268 != null) {
			local34 = local268.qa();
		}
		@Pc(301) Class59 local301 = Static271.aClass59_2;
		@Pc(303) Class70 local303 = Static309.aClass70_28;
		if (local12.anInt2702 == 1) {
			local301 = Static299.aClass59_3;
			local303 = Static391.aClass70_32;
		}
		if (local12.anInt2702 == 2) {
			local303 = Static269.aClass70_27;
			local301 = Static321.aClass59_4;
		}
		Static116.method4225(local12.aString18, arg0, local12.anInt2715, arg5, local303, arg2, local301, arg3, arg1, local34, arg6);
		return;
	}

	@OriginalMember(owner = "client!iv", name = "b", descriptor = "(III)I")
	public static int method2888(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) int local15 = arg1 + arg0 * 57;
		@Pc(21) int local21 = local15 ^ local15 << 13;
		@Pc(35) int local35 = (local21 * 15731 * local21 + 789221) * local21 + 1376312589 & Integer.MAX_VALUE;
		return local35 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(IIIII)V")
	public static void method2889(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg0 < arg3) {
			Static412.method5293(Static262.anIntArrayArray31[arg2], arg1, arg0, arg3);
		} else {
			Static412.method5293(Static262.anIntArrayArray31[arg2], arg1, arg3, arg0);
		}
	}
}
