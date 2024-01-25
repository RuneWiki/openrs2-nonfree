import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static168 {

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(IIIIII)V")
	public static void method3085(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 > Static530.anInt9437 || Static290.anInt5903 > arg1) {
			return;
		}
		@Pc(20) boolean local20;
		if (arg2 < Static486.anInt8866) {
			local20 = false;
			arg2 = Static486.anInt8866;
		} else if (Static214.anInt3975 >= arg2) {
			local20 = true;
		} else {
			local20 = false;
			arg2 = Static214.anInt3975;
		}
		@Pc(49) boolean local49;
		if (Static486.anInt8866 > arg3) {
			local49 = false;
			arg3 = Static486.anInt8866;
		} else if (Static214.anInt3975 < arg3) {
			arg3 = Static214.anInt3975;
			local49 = false;
		} else {
			local49 = true;
		}
		if (Static290.anInt5903 > arg0) {
			arg0 = Static290.anInt5903;
		} else {
			Static306.method5239(Static46.anIntArrayArray4[arg0++], arg3, arg4, arg2);
		}
		if (Static530.anInt9437 >= arg1) {
			Static306.method5239(Static46.anIntArrayArray4[arg1--], arg3, arg4, arg2);
		} else {
			arg1 = Static530.anInt9437;
		}
		@Pc(111) int local111;
		if (local20 && local49) {
			for (local111 = arg0; local111 <= arg1; local111++) {
				@Pc(157) int[] local157 = Static46.anIntArrayArray4[local111];
				local157[arg2] = local157[arg3] = arg4;
			}
		} else if (local20) {
			for (local111 = arg0; local111 <= arg1; local111++) {
				Static46.anIntArrayArray4[local111][arg2] = arg4;
			}
		} else if (local49) {
			for (local111 = arg0; local111 <= arg1; local111++) {
				Static46.anIntArrayArray4[local111][arg3] = arg4;
			}
		}
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "([[BILclient!js;)V")
	public static void method3086(@OriginalArg(0) byte[][] arg0, @OriginalArg(2) Class179_Sub1 arg1) {
		for (@Pc(11) int local11 = 0; local11 < arg1.anInt4634; local11++) {
			Static390.method6204();
			for (@Pc(19) int local19 = 0; local19 < Static428.anInt8046 >> 3; local19++) {
				for (@Pc(23) int local23 = 0; local23 < Static119.anInt2717 >> 3; local23++) {
					@Pc(33) int local33 = Static160.anIntArrayArrayArray4[local11][local19][local23];
					if (local33 != -1) {
						@Pc(43) int local43 = local33 >> 24 & 0x3;
						if (!arg1.aBoolean331 || local43 == 0) {
							@Pc(54) int local54 = local33 >> 1 & 0x3;
							@Pc(60) int local60 = local33 >> 14 & 0x3FF;
							@Pc(66) int local66 = local33 >> 3 & 0x7FF;
							@Pc(76) int local76 = local66 / 8 + (local60 / 8 << 8);
							for (@Pc(78) int local78 = 0; local78 < Static75.anIntArray18.length; local78++) {
								if (local76 == Static75.anIntArray18[local78] && arg0[local78] != null) {
									arg1.method4075(local19 * 8, (local60 & 0x7) * 8, Static86.aClass111Array1, arg0[local78], local54, Static440.aClass44_12, (local66 & 0x7) * 8, local43, local11, local23 * 8);
									break;
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(ILclient!r;IZ)V")
	public static void method3087(@OriginalArg(0) int arg0, @OriginalArg(1) Class44 arg1, @OriginalArg(2) int arg2) {
		Static458.aClass44_13 = arg1;
		Static442.aClass112ArrayArray1 = new Class112[arg2][arg0];
		if (Static425.anIntArray419 != null) {
			Static243.aClass36_6 = Static236.method3797(Static425.anIntArray419[0], Static425.anIntArray419[2], Static425.anIntArray419[1], Static425.anIntArray419[5], Static425.anIntArray419[4], Static425.anIntArray419[3]);
		}
		Static211.aClass112_5 = new Class112();
		Static167.method3084();
	}
}
