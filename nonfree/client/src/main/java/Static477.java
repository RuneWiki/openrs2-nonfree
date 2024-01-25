import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static477 {

	@OriginalMember(owner = "client!rd", name = "u", descriptor = "Lclient!pea;")
	public static Interface16 anInterface16_1;

	@OriginalMember(owner = "client!rd", name = "v", descriptor = "Lclient!it;")
	public static Class28 aClass28_28;

	@OriginalMember(owner = "client!rd", name = "z", descriptor = "Lclient!ew;")
	public static final Class98 aClass98_37 = new Class98("", 13);

	@OriginalMember(owner = "client!rd", name = "A", descriptor = "Lclient!raa;")
	public static Class295 aClass295_16 = null;

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(III)I")
	public static int method7047(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(18) int local18;
		if (arg0 < arg1) {
			local18 = arg0;
			arg0 = arg1;
			arg1 = local18;
		}
		while (arg1 != 0) {
			local18 = arg0 % arg1;
			arg0 = arg1;
			arg1 = local18;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(I[B)V")
	public static void method7048(@OriginalArg(1) byte[] arg0) {
		@Pc(14) Class5_Sub22 local14 = new Class5_Sub22(arg0);
		while (true) {
			@Pc(18) int local18;
			@Pc(41) int local41;
			@Pc(36) int local36;
			label45: do {
				while (true) {
					while (true) {
						local18 = local14.method5966();
						if (local18 == 0) {
							return;
						}
						if (local18 == 1) {
							@Pc(111) int[] local111 = Static224.anIntArray214 = new int[6];
							local111[0] = local14.method5968();
							local111[1] = local14.method5968();
							local111[2] = local14.method5968();
							local111[3] = local14.method5968();
							local111[4] = local14.method5968();
							local111[5] = local14.method5968();
						} else {
							if (local18 != 4) {
								continue label45;
							}
							local36 = local14.method5966();
							Static177.anIntArray174 = new int[local36];
							for (local41 = 0; local41 < local36; local41++) {
								Static177.anIntArray174[local41] = local14.method5968();
								if (Static177.anIntArray174[local41] == 65535) {
									Static177.anIntArray174[local41] = -1;
								}
							}
						}
					}
				}
			} while (local18 != 5);
			local36 = local14.method5966();
			Static112.anIntArray128 = new int[local36];
			for (local41 = 0; local41 < local36; local41++) {
				Static112.anIntArray128[local41] = local14.method5968();
				if (Static112.anIntArray128[local41] == 65535) {
					Static112.anIntArray128[local41] = -1;
				}
			}
		}
	}
}
