import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static363 {

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(CI)I")
	public static int method5197(@OriginalArg(0) char arg0) {
		return arg0 >= '\u0000' && arg0 < Class100_Sub1_Sub1.anIntArray604.length ? Class100_Sub1_Sub1.anIntArray604[arg0] : -1;
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "([I[I[IZLclient!wka;)V")
	public static void method5199(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) Class19_Sub1_Sub3_Sub2 arg3) {
		for (@Pc(16) int local16 = 0; local16 < arg2.length; local16++) {
			@Pc(22) int local22 = arg2[local16];
			@Pc(26) int local26 = arg0[local16];
			@Pc(30) int local30 = arg1[local16];
			@Pc(32) int local32 = 0;
			while (local26 != 0 && local32 < arg3.aClass100_Sub1_Sub1Array3.length) {
				if ((local26 & 0x1) != 0) {
					if (local22 == -1) {
						arg3.aClass100_Sub1_Sub1Array3[local32] = null;
					} else {
						@Pc(53) Class26 local53 = Static59.aClass177_1.method4259(local22);
						@Pc(56) int local56 = local53.anInt767;
						@Pc(61) Class100_Sub1_Sub1 local61 = arg3.aClass100_Sub1_Sub1Array3[local32];
						if (local61 != null && local61.method8963()) {
							if (local22 == local61.method8976()) {
								if (local56 == 0) {
									local61 = arg3.aClass100_Sub1_Sub1Array3[local32] = null;
								} else if (local56 == 1) {
									local61.method8958();
									local61.anInt10755 = local30;
								} else if (local56 == 2) {
									local61.method8957();
								}
							} else if (local53.anInt768 >= local61.method8977().anInt768) {
								local61 = arg3.aClass100_Sub1_Sub1Array3[local32] = null;
							}
						}
						if (local61 == null || !local61.method8963()) {
							local61 = arg3.aClass100_Sub1_Sub1Array3[local32] = new Class100_Sub1_Sub1(arg3);
							local61.method8962(local22);
							local61.anInt10755 = local30;
						}
					}
				}
				local32++;
				local26 >>>= 0x1;
			}
		}
	}
}
