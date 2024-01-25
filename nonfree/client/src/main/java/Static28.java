import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static28 {

	@OriginalMember(owner = "client!at", name = "t", descriptor = "D")
	public static double aDouble1;

	@OriginalMember(owner = "client!at", name = "u", descriptor = "I")
	public static int anInt387;

	@OriginalMember(owner = "client!at", name = "w", descriptor = "I")
	public static int anInt388;

	@OriginalMember(owner = "client!at", name = "a", descriptor = "Z")
	public static boolean aBoolean15 = false;

	@OriginalMember(owner = "client!at", name = "x", descriptor = "I")
	public static int anInt389 = 0;

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(III)V")
	public static void method374(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class5_Sub2_Sub4 local13 = Static257.method3597(16, (long) arg0);
		local13.method2438();
		local13.anInt2749 = arg1;
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(IIIIIIII)V")
	public static void method376(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg2 >= Static361.anInt6317 && Static651.anInt10267 >= arg3 && Static128.anInt2200 <= arg0 && arg6 <= Static380.anInt6585) {
			Static290.method8320(arg2, arg3, arg1, arg0, arg6, arg4, arg5);
		} else {
			Static352.method5233(arg2, arg6, arg4, arg1, arg3, arg0, arg5);
		}
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "([[BLclient!bg;I)V")
	public static void method378(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) Class34_Sub1 arg1) {
		@Pc(12) int[] local12 = new int[] { -1, 0, 0, 0, 0 };
		@Pc(15) int local15 = arg0.length;
		@Pc(36) int local36;
		for (@Pc(17) int local17 = 0; local17 < local15; local17++) {
			@Pc(23) byte[] local23 = arg0[local17];
			if (local23 != null) {
				@Pc(30) Class5_Sub15 local30 = new Class5_Sub15(local23);
				local36 = Static249.anIntArray245[local17] >> 8;
				@Pc(42) int local42 = Static249.anIntArray245[local17] & 0xFF;
				@Pc(49) int local49 = local36 * 64 - Static454.anInt7910;
				@Pc(56) int local56 = local42 * 64 - Static48.anInt750;
				Static491.method7177();
				arg1.method524(Static48.anInt750, local30, local49, Static454.anInt7910, local56, Static137.aClass234Array1);
				arg1.method541(Static563.aClass143_13, local49, local30, local12, local56);
				if (!arg1.aBoolean26 && Static216.anInt3459 / 8 == local36 && Static544.anInt8919 / 8 == local42 && local12[0] != -1) {
					Static366.aClass116_2 = Static117.aClass64_1.method1294(local12[0], local12[3], local12[2], Static1.aClass286_5, local12[1]);
					Static635.anInt10119 = local12[4];
				}
			}
		}
		for (@Pc(126) int local126 = 0; local126 < local15; local126++) {
			@Pc(139) int local139 = (Static249.anIntArray245[local126] >> 8) * 64 - Static454.anInt7910;
			local36 = (Static249.anIntArray245[local126] & 0xFF) * 64 - Static48.anInt750;
			@Pc(154) byte[] local154 = arg0[local126];
			if (local154 == null && Static544.anInt8919 < 800) {
				Static491.method7177();
				arg1.method522(local36, local139);
			}
		}
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(Lclient!aa;IILclient!qda;IIILclient!wq;)V")
	public static void method380(@OriginalArg(0) Class1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class59 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) Class394 arg6) {
		if (arg3 == null) {
			return;
		}
		@Pc(16) int local16;
		if (Static133.anInt2254 == 4) {
			local16 = (int) Static495.aFloat161 & 0x3FFF;
		} else {
			local16 = Static538.anInt8846 + (int) Static495.aFloat161 & 0x3FFF;
		}
		@Pc(34) int local34 = Math.max(arg6.anInt10536 / 2, arg6.anInt10532 / 2) + 10;
		@Pc(43) int local43 = arg4 * arg4 + arg1 * arg1;
		if (local43 > local34 * local34) {
			return;
		}
		@Pc(53) int local53 = Class242.anIntArray384[local16];
		@Pc(57) int local57 = Class242.anIntArray383[local16];
		if (Static133.anInt2254 != 4) {
			local57 = local57 * 256 / (Static342.anInt6178 + 256);
			local53 = local53 * 256 / (Static342.anInt6178 + 256);
		}
		@Pc(88) int local88 = local57 * arg4 + local53 * arg1 >> 14;
		@Pc(98) int local98 = local57 * arg1 - arg4 * local53 >> 14;
		arg3.method8072(arg5 + arg6.anInt10536 / 2 + local88 - arg3.method8053() / 2, -local98 + arg6.anInt10532 / 2 + arg2 - arg3.method8064() / 2, arg0, arg5, arg2);
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "()V")
	public static void method383() {
		for (@Pc(1) int local1 = 0; local1 < Static89.anInt1482; local1++) {
			@Pc(6) Class41_Sub1_Sub1 local6 = Static545.aClass41_Sub1_Sub1Array1[local1];
			Static243.method3479(local6, true);
			Static545.aClass41_Sub1_Sub1Array1[local1] = null;
		}
		Static89.anInt1482 = 0;
	}
}
