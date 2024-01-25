import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static123 {

	@OriginalMember(owner = "client!ej", name = "b", descriptor = "(B)V")
	public static void method2518() {
		Static117.aClass14_8 = null;
		Static317.aClass14_17 = null;
		Static348.aClass14Array12 = null;
		Static60.aClass14_4 = null;
		Static83.aClass14_6 = null;
		Static591.aClass14_34 = null;
		Static70.aClass14_5 = null;
		Static377.aClass14_19 = null;
		Static138.aClass14_9 = null;
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(I[B)V")
	public static void method2520(@OriginalArg(1) byte[] arg0) {
		@Pc(13) Class3_Sub11 local13 = new Class3_Sub11(arg0);
		while (true) {
			@Pc(17) int local17;
			@Pc(43) int local43;
			@Pc(38) int local38;
			label45: do {
				while (true) {
					while (true) {
						local17 = local13.method5175();
						if (local17 == 0) {
							return;
						}
						if (local17 == 1) {
							@Pc(107) int[] local107 = Static122.anIntArray123 = new int[6];
							local107[0] = local13.method5198();
							local107[1] = local13.method5198();
							local107[2] = local13.method5198();
							local107[3] = local13.method5198();
							local107[4] = local13.method5198();
							local107[5] = local13.method5198();
						} else {
							if (local17 != 4) {
								continue label45;
							}
							local38 = local13.method5175();
							Static587.anIntArray630 = new int[local38];
							for (local43 = 0; local43 < local38; local43++) {
								Static587.anIntArray630[local43] = local13.method5198();
								if (Static587.anIntArray630[local43] == 65535) {
									Static587.anIntArray630[local43] = -1;
								}
							}
						}
					}
				}
			} while (local17 != 5);
			local38 = local13.method5175();
			Static199.anIntArray198 = new int[local38];
			for (local43 = 0; local43 < local38; local43++) {
				Static199.anIntArray198[local43] = local13.method5198();
				if (Static199.anIntArray198[local43] == 65535) {
					Static199.anIntArray198[local43] = -1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(III)I")
	public static int method2522(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(11) int local11 = arg0 >> 31 & arg1 - 1;
		return local11 + ((arg0 >>> 31) + arg0) % arg1;
	}
}
