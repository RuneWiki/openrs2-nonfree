import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static411 {

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "F")
	public static float aFloat177;

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(BI)V")
	public static void method5767() {
		Static172.aClass326_14.method7241(5);
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(Lclient!nu;II[I)V")
	public static void method5771(@OriginalArg(0) Class20_Sub2_Sub4_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2) {
		@Pc(10) boolean local10;
		@Pc(12) int local12;
		if (arg0.anIntArray429 != null) {
			local10 = true;
			for (local12 = 0; local12 < arg0.anIntArray429.length; local12++) {
				if (arg2[local12] != arg0.anIntArray429[local12]) {
					local10 = false;
					break;
				}
			}
			if (local10 && arg0.anInt6438 != -1) {
				@Pc(47) Class131 local47 = Static594.aClass311_2.method7009(arg0.anInt6438);
				@Pc(50) int local50 = local47.anInt3742;
				if (local50 == 1) {
					arg0.anInt6447 = 0;
					arg0.anInt6455 = arg1;
					arg0.anInt6420 = 1;
					arg0.anInt6392 = 0;
					arg0.anInt6441 = 0;
					Static171.method2603(arg0.anInt6392, arg0.anInt8796, local47, arg0.anInt8795, arg0.aByte116, false);
				}
				if (local50 == 2) {
					arg0.anInt6441 = 0;
				}
			}
		}
		local10 = true;
		for (local12 = 0; local12 < arg2.length; local12++) {
			if (arg2[local12] != -1) {
				local10 = false;
			}
			if (arg0.anIntArray429 == null || arg0.anIntArray429[local12] == -1 || Static594.aClass311_2.method7009(arg2[local12]).anInt3734 >= Static594.aClass311_2.method7009(arg0.anIntArray429[local12]).anInt3734) {
				arg0.anInt6455 = arg1;
				arg0.anIntArray429 = arg2;
				arg0.anInt6466 = arg0.anInt6469;
			}
		}
		if (local10) {
			arg0.anInt6455 = arg1;
			arg0.anInt6466 = arg0.anInt6469;
			arg0.anIntArray429 = arg2;
		}
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(IB)I")
	public static int method5777(@OriginalArg(0) int arg0) {
		return arg0 & 0x7F;
	}
}
