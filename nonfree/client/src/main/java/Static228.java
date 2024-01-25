import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static228 {

	@OriginalMember(owner = "client!hl", name = "s", descriptor = "Lclient!wia;")
	public static final Class387 aClass387_45 = new Class387(35, -1);

	@OriginalMember(owner = "client!hl", name = "A", descriptor = "I")
	public static int anInt3709 = 0;

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(IIIIZII)I")
	public static int method3236(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(3) int local3 = arg1 & 0x3;
		if ((arg4 & 0x1) == 1) {
			@Pc(10) int local10 = arg3;
			arg3 = arg2;
			arg2 = local10;
		}
		if (local3 == 0) {
			return arg0;
		} else if (local3 == 1) {
			return 1 + 7 - arg3 - arg5;
		} else if (local3 == 2) {
			return 1 + 7 - arg2 - arg0;
		} else {
			return arg5;
		}
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "()V")
	public static void method3237() {
		for (@Pc(1) int local1 = 0; local1 < Static476.aClass334Array1.length; local1++) {
			Static476.aClass334Array1[local1].method8348();
		}
		Static476.aClass334Array1 = null;
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method3239(@OriginalArg(1) String arg0) {
		return arg0.length() + 1;
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "([BB)V")
	public static void method3240(@OriginalArg(0) byte[] arg0) {
		@Pc(15) Class5_Sub23 local15 = new Class5_Sub23(arg0);
		while (true) {
			@Pc(19) int local19;
			@Pc(52) int local52;
			@Pc(47) int local47;
			label45: do {
				while (true) {
					while (true) {
						local19 = local15.method8529();
						if (local19 == 0) {
							return;
						}
						if (local19 == 1) {
							@Pc(134) int[] local134 = Static124.anIntArray105 = new int[6];
							local134[0] = local15.method8519();
							local134[1] = local15.method8519();
							local134[2] = local15.method8519();
							local134[3] = local15.method8519();
							local134[4] = local15.method8519();
							local134[5] = local15.method8519();
						} else {
							if (local19 != 4) {
								continue label45;
							}
							local47 = local15.method8529();
							Static211.anIntArray199 = new int[local47];
							for (local52 = 0; local52 < local47; local52++) {
								Static211.anIntArray199[local52] = local15.method8519();
								if (Static211.anIntArray199[local52] == 65535) {
									Static211.anIntArray199[local52] = -1;
								}
							}
						}
					}
				}
			} while (local19 != 5);
			local47 = local15.method8529();
			Static110.anIntArray98 = new int[local47];
			for (local52 = 0; local52 < local47; local52++) {
				Static110.anIntArray98[local52] = local15.method8519();
				if (Static110.anIntArray98[local52] == 65535) {
					Static110.anIntArray98[local52] = -1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(II)I")
	public static int method3242(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = arg0 >>> 1;
		@Pc(13) int local13 = local7 | local7 >>> 1;
		@Pc(19) int local19 = local13 | local13 >>> 2;
		@Pc(25) int local25 = local19 | local19 >>> 4;
		@Pc(31) int local31 = local25 | local25 >>> 8;
		@Pc(44) int local44 = local31 | local31 >>> 16;
		return arg0 & ~local44;
	}
}
