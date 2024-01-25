import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static664 {

	@OriginalMember(owner = "client!wia", name = "a", descriptor = "(ILclient!ft;I[I)V")
	public static void method8873(@OriginalArg(1) Class28_Sub1_Sub4_Sub2_Sub1 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		@Pc(6) boolean local6;
		@Pc(8) int local8;
		if (arg0.anIntArray305 != null) {
			local6 = true;
			for (local8 = 0; local8 < arg0.anIntArray305.length; local8++) {
				if (arg2[local8] != arg0.anIntArray305[local8]) {
					local6 = false;
					break;
				}
			}
			if (local6 && arg0.anInt5482 != -1) {
				@Pc(44) Class175 local44 = Static591.aClass66_2.method1768(arg0.anInt5482);
				@Pc(47) int local47 = local44.anInt5022;
				if (local47 == 1) {
					arg0.anInt5456 = 1;
					arg0.anInt5453 = 0;
					arg0.anInt5504 = 0;
					arg0.anInt5498 = 0;
					arg0.anInt5475 = arg1;
					if (!arg0.aBoolean468) {
						Static146.method2653(arg0.anInt5498, local44, arg0);
					}
				}
				if (local47 == 2) {
					arg0.anInt5453 = 0;
				}
			}
		}
		local6 = true;
		for (local8 = 0; local8 < arg2.length; local8++) {
			if (arg2[local8] != -1) {
				local6 = false;
			}
			if (arg0.anIntArray305 == null || arg0.anIntArray305[local8] == -1 || Static591.aClass66_2.method1768(arg2[local8]).anInt5018 >= Static591.aClass66_2.method1768(arg0.anIntArray305[local8]).anInt5018) {
				arg0.anIntArray305 = arg2;
				arg0.anInt5475 = arg1;
				arg0.anInt5525 = arg0.anInt5524;
			}
		}
		if (local6) {
			arg0.anIntArray305 = arg2;
			arg0.anInt5475 = arg1;
			arg0.anInt5525 = arg0.anInt5524;
		}
	}
}
