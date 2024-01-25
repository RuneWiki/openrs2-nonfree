import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static268 {

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(Lclient!kd;[III)V")
	public static void method4784(@OriginalArg(0) Class20_Sub2_Sub2_Sub1_Sub2 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2) {
		@Pc(6) boolean local6;
		@Pc(8) int local8;
		if (arg0.anIntArray327 != null) {
			local6 = true;
			for (local8 = 0; local8 < arg0.anIntArray327.length; local8++) {
				if (arg1[local8] != arg0.anIntArray327[local8]) {
					local6 = false;
					break;
				}
			}
			if (local6 && arg0.anInt5549 != -1) {
				@Pc(44) Class21 local44 = Static294.aClass373_2.method8738(arg0.anInt5549);
				@Pc(47) int local47 = local44.anInt351;
				if (local47 == 1) {
					arg0.anInt5546 = 1;
					arg0.anInt5566 = 0;
					arg0.anInt5502 = 0;
					arg0.anInt5503 = 0;
					arg0.anInt5516 = arg2;
					if (!arg0.aBoolean377) {
						Static558.method8052(arg0.anInt5503, arg0, local44);
					}
				}
				if (local47 == 2) {
					arg0.anInt5566 = 0;
				}
			}
		}
		local6 = true;
		for (local8 = 0; local8 < arg1.length; local8++) {
			if (arg1[local8] != -1) {
				local6 = false;
			}
			if (arg0.anIntArray327 == null || arg0.anIntArray327[local8] == -1 || Static294.aClass373_2.method8738(arg1[local8]).anInt355 >= Static294.aClass373_2.method8738(arg0.anIntArray327[local8]).anInt355) {
				arg0.anInt5516 = arg2;
				arg0.anInt5576 = arg0.anInt5574;
				arg0.anIntArray327 = arg1;
			}
		}
		if (local6) {
			arg0.anIntArray327 = arg1;
			arg0.anInt5576 = arg0.anInt5574;
			arg0.anInt5516 = arg2;
		}
	}
}
