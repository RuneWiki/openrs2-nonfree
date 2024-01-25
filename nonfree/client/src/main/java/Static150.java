import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static150 {

	@OriginalMember(owner = "client!et", name = "Z", descriptor = "I")
	public static int anInt2796;

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(I[B)V")
	public static void method2436(@OriginalArg(1) byte[] arg0) {
		@Pc(10) Class3_Sub4 local10 = new Class3_Sub4(arg0);
		while (true) {
			while (true) {
				while (true) {
					@Pc(19) int local19 = local10.method7954();
					if (local19 == 0) {
						return;
					}
					if (local19 == 1) {
						@Pc(114) int[] local114 = Static212.anIntArray206 = new int[6];
						local114[0] = local10.method7951();
						local114[1] = local10.method7951();
						local114[2] = local10.method7951();
						local114[3] = local10.method7951();
						local114[4] = local10.method7951();
						local114[5] = local10.method7951();
					} else {
						@Pc(41) int local41;
						@Pc(36) int local36;
						if (local19 == 4) {
							local36 = local10.method7954();
							Static398.anIntArray346 = new int[local36];
							for (local41 = 0; local41 < local36; local41++) {
								Static398.anIntArray346[local41] = local10.method7951();
								if (Static398.anIntArray346[local41] == 65535) {
									Static398.anIntArray346[local41] = -1;
								}
							}
						} else if (local19 == 5) {
							local36 = local10.method7954();
							Static464.anIntArray402 = new int[local36];
							for (local41 = 0; local41 < local36; local41++) {
								Static464.anIntArray402[local41] = local10.method7951();
								if (Static464.anIntArray402[local41] == 65535) {
									Static464.anIntArray402[local41] = -1;
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(III)I")
	public static int method2437(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 == 1 || arg1 == 3 ? Static498.anIntArray631[arg0 & 0x3] : Static180.anIntArray168[arg0 & 0x3];
	}
}
