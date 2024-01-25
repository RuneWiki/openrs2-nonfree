import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static130 {

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(ILclient!vg;)V")
	public static void method2540(@OriginalArg(1) Class11_Sub1_Sub1_Sub2 arg0) {
		@Pc(5) boolean local5 = false;
		if (Static325.anInt5888 == arg0.anInt3274 || arg0.anInt3258 == -1 || arg0.anInt3232 != 0) {
			local5 = true;
		} else {
			@Pc(26) Class149 local26 = Static185.aClass303_1.method7201(arg0.anInt3258);
			if (local26.aBoolean379 || arg0.anInt3225 + 1 > local26.anIntArray306[arg0.anInt3263]) {
				local5 = true;
			}
		}
		if (local5) {
			@Pc(54) int local54 = arg0.anInt3274 - arg0.anInt3220;
			@Pc(60) int local60 = Static325.anInt5888 - arg0.anInt3220;
			@Pc(72) int local72 = arg0.anInt3209 * 512 + arg0.method2778() * 256;
			@Pc(84) int local84 = arg0.anInt3261 * 512 + arg0.method2778() * 256;
			@Pc(95) int local95 = arg0.anInt3287 * 512 + arg0.method2778() * 256;
			@Pc(106) int local106 = arg0.anInt3291 * 512 + arg0.method2778() * 256;
			arg0.anInt9925 = (local95 * local60 + local72 * (local54 - local60)) / local54;
			arg0.anInt9929 = (local84 * (local54 - local60) + local106 * local60) / local54;
		}
		arg0.anInt3295 = 0;
		if (arg0.anInt3289 == 0) {
			arg0.method2759(8192, false);
		}
		if (arg0.anInt3289 == 1) {
			arg0.method2759(12288, false);
		}
		if (arg0.anInt3289 == 2) {
			arg0.method2759(0, false);
		}
		if (arg0.anInt3289 == 3) {
			arg0.method2759(4096, false);
		}
	}
}
