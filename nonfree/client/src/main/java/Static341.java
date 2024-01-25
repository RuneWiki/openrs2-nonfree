import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static341 {

	@OriginalMember(owner = "client!mf", name = "b", descriptor = "I")
	public static int anInt6420 = 0;

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(B)V")
	public static void method5525() {
		for (@Pc(11) Class6_Sub35 local11 = (Class6_Sub35) Static227.aClass128_12.method3556(); local11 != null; local11 = (Class6_Sub35) Static227.aClass128_12.method3555()) {
			if (local11.aClass62_Sub1_1.method8482()) {
				Static366.method5801(local11.anInt7969);
			} else {
				local11.aClass62_Sub1_1.method8487();
				try {
					local11.aClass62_Sub1_1.method8475();
				} catch (@Pc(28) Exception local28) {
					Static619.method8645(local28, "TV: " + local11.anInt7969);
					Static366.method5801(local11.anInt7969);
				}
				if (!local11.aBoolean532 && !local11.aBoolean531) {
					@Pc(54) Class6_Sub13_Sub2 local54 = local11.aClass62_Sub1_1.method8479();
					if (local54 != null) {
						@Pc(60) Class6_Sub3_Sub2 local60 = local54.method3754();
						if (local60 != null) {
							local60.method3688(local11.anInt7971);
							Static196.aClass6_Sub3_Sub1_1.method271(local60);
							local11.aBoolean532 = true;
						}
					}
				}
			}
		}
	}
}
