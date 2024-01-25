import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static140 {

	@OriginalMember(owner = "client!gu", name = "x", descriptor = "Lclient!iv;")
	public static final Class119 aClass119_60 = new Class119(15, 15);

	@OriginalMember(owner = "client!gu", name = "z", descriptor = "Lclient!iv;")
	public static final Class119 aClass119_61 = new Class119(39, 6);

	@OriginalMember(owner = "client!gu", name = "B", descriptor = "Lclient!pi;")
	public static final Class189 aClass189_91 = new Class189("Loaded interfaces", "Benutzeroberfläche geladen.", "Interfaces chargées", "Interfaces carregadas");

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(IIZIILclient!br;IIIIII[I[II)I")
	public static int method2190(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class29 arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int[] arg11, @OriginalArg(13) int[] arg12, @OriginalArg(14) int arg13) {
		for (@Pc(5) int local5 = 0; local5 < 128; local5++) {
			for (@Pc(8) int local8 = 0; local8 < 128; local8++) {
				Static244.anIntArrayArray30[local5][local8] = 0;
				Static117.anIntArrayArray17[local5][local8] = 99999999;
			}
		}
		@Pc(47) boolean local47;
		if (arg9 == 1) {
			local47 = Static71.method1405(arg5, arg8, arg7, arg1, arg13, arg10, arg0, arg3, arg4, arg6);
		} else if (arg9 == 2) {
			local47 = Static88.method1661(arg5, arg3, arg6, arg7, arg1, arg4, arg0, arg8, arg10, arg13);
		} else {
			local47 = Static185.method2975(arg1, arg4, arg13, arg7, arg6, arg5, arg3, arg0, arg10, arg9, arg8);
		}
		@Pc(85) int local85 = arg1 - 64;
		@Pc(89) int local89 = arg7 - 64;
		@Pc(96) int local96 = Static107.anInt2387;
		@Pc(98) int local98 = Static430.anInt3291;
		@Pc(106) int local106;
		@Pc(108) int local108;
		@Pc(114) int local114;
		if (!local47) {
			if (!arg2) {
				return -1;
			}
			local106 = Integer.MAX_VALUE;
			local108 = Integer.MAX_VALUE;
			for (local114 = arg3 - 10; local114 <= arg3 + 10; local114++) {
				for (@Pc(119) int local119 = arg8 - 10; local119 <= arg8 + 10; local119++) {
					@Pc(125) int local125 = local114 - local85;
					@Pc(130) int local130 = local119 - local89;
					if (local125 >= 0 && local130 >= 0 && local125 < 128 && local130 < 128 && Static117.anIntArrayArray17[local125][local130] < 100) {
						@Pc(155) int local155 = 0;
						if (arg3 > local114) {
							local155 = arg3 - local114;
						} else if (local114 > arg3 + arg6 - 1) {
							local155 = local114 + 1 - arg6 - arg3;
						}
						@Pc(184) int local184 = 0;
						if (arg8 > local119) {
							local184 = arg8 - local119;
						} else if (arg8 + arg4 - 1 < local119) {
							local184 = local119 + 1 - arg8 - arg4;
						}
						@Pc(219) int local219 = local155 * local155 + local184 * local184;
						if (local106 > local219 || local219 == local106 && local108 > Static117.anIntArrayArray17[local125][local130]) {
							local108 = Static117.anIntArrayArray17[local125][local130];
							local98 = local119;
							local106 = local219;
							local96 = local114;
						}
					}
				}
			}
			if (~local106 == Integer.MIN_VALUE) {
				return -1;
			}
		}
		if (local96 == arg1 && local98 == arg7) {
			return 0;
		}
		@Pc(281) byte local281 = 0;
		Static195.anIntArray244[0] = local96;
		local106 = local281 + 1;
		Static368.anIntArray399[0] = local98;
		@Pc(302) int local302;
		local108 = local302 = Static244.anIntArrayArray30[local96 - local85][local98 - local89];
		while (arg1 != local96 || local98 != arg7) {
			if (local108 != local302) {
				local302 = local108;
				Static195.anIntArray244[local106] = local96;
				Static368.anIntArray399[local106++] = local98;
			}
			if ((local108 & 0x1) != 0) {
				local98++;
			} else if ((local108 & 0x4) != 0) {
				local98--;
			}
			if ((local108 & 0x2) != 0) {
				local96++;
			} else if ((local108 & 0x8) != 0) {
				local96--;
			}
			local108 = Static244.anIntArrayArray30[local96 - local85][local98 - local89];
		}
		local114 = 0;
		while (local106-- > 0) {
			arg12[local114] = Static195.anIntArray244[local106];
			arg11[local114++] = Static368.anIntArray399[local106];
			if (local114 >= arg12.length) {
				break;
			}
		}
		return local114;
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(II)I")
	public static int method2192(@OriginalArg(1) int arg0) {
		return arg0 >>> 7;
	}
}
