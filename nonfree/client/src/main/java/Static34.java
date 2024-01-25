import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static34 {

	@OriginalMember(owner = "client!bp", name = "k", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame1;

	@OriginalMember(owner = "client!bp", name = "e", descriptor = "Lclient!wf;")
	public static final Class244 aClass244_11 = new Class244(69, 3);

	@OriginalMember(owner = "client!bp", name = "i", descriptor = "Lclient!vp;")
	public static final Class240 aClass240_9 = new Class240("", 16);

	@OriginalMember(owner = "client!bp", name = "j", descriptor = "I")
	public static int anInt590 = 0;

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(ZII[IIII[IIIBIILclient!ee;I)I")
	public static int method529(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) Class67 arg12, @OriginalArg(14) int arg13) {
		for (@Pc(7) int local7 = 0; local7 < 128; local7++) {
			for (@Pc(31) int local31 = 0; local31 < 128; local31++) {
				Static221.anIntArrayArray38[local7][local31] = 0;
				Static389.anIntArrayArray60[local7][local31] = 99999999;
			}
		}
		@Pc(76) boolean local76;
		if (arg10 == 1) {
			local76 = Static221.method3681(arg12, arg9, arg1, arg8, arg11, arg4, arg5, arg2, arg13, arg6);
		} else if (arg10 == 2) {
			local76 = Static14.method185(arg9, arg1, arg5, arg12, arg4, arg6, arg2, arg8, arg13, arg11);
		} else {
			local76 = Static329.method5027(arg2, arg12, arg13, arg4, arg6, arg8, arg5, arg11, arg1, arg10, arg9);
		}
		@Pc(111) int local111 = arg4 - 64;
		@Pc(115) int local115 = arg13 - 64;
		@Pc(117) int local117 = Static274.anInt4765;
		@Pc(119) int local119 = Static319.anInt5443;
		@Pc(125) int local125;
		@Pc(127) int local127;
		@Pc(134) int local134;
		if (!local76) {
			if (!arg0) {
				return -1;
			}
			local125 = Integer.MAX_VALUE;
			local127 = Integer.MAX_VALUE;
			for (local134 = arg1 - 10; local134 <= arg1 + 10; local134++) {
				for (@Pc(141) int local141 = arg6 - 10; local141 <= arg6 + 10; local141++) {
					@Pc(147) int local147 = local134 - local111;
					@Pc(152) int local152 = local141 - local115;
					if (local147 >= 0 && local152 >= 0 && local147 < 128 && local152 < 128 && Static389.anIntArrayArray60[local147][local152] < 100) {
						@Pc(179) int local179 = 0;
						if (local134 < arg1) {
							local179 = arg1 - local134;
						} else if (arg2 + arg1 - 1 < local134) {
							local179 = local134 + 1 - arg2 - arg1;
						}
						@Pc(215) int local215 = 0;
						if (local141 < arg6) {
							local215 = arg6 - local141;
						} else if (arg8 + arg6 - 1 < local141) {
							local215 = local141 + 1 - arg8 - arg6;
						}
						@Pc(258) int local258 = local215 * local215 + local179 * local179;
						if (local125 > local258 || local125 == local258 && local127 > Static389.anIntArrayArray60[local147][local152]) {
							local127 = Static389.anIntArrayArray60[local147][local152];
							local117 = local134;
							local119 = local141;
							local125 = local258;
						}
					}
				}
			}
			if (~local125 == Integer.MIN_VALUE) {
				return -1;
			}
		}
		if (arg4 == local117 && arg13 == local119) {
			return 0;
		}
		@Pc(334) byte local334 = 0;
		Static136.anIntArray274[0] = local117;
		local125 = local334 + 1;
		Static269.anIntArray524[0] = local119;
		@Pc(356) int local356;
		local127 = local356 = Static221.anIntArrayArray38[local117 - local111][local119 - local115];
		while (local117 != arg4 || local119 != arg13) {
			if (local127 != local356) {
				local356 = local127;
				Static136.anIntArray274[local125] = local117;
				Static269.anIntArray524[local125++] = local119;
			}
			if ((local127 & 0x2) != 0) {
				local117++;
			} else if ((local127 & 0x8) != 0) {
				local117--;
			}
			if ((local127 & 0x1) != 0) {
				local119++;
			} else if ((local127 & 0x4) != 0) {
				local119--;
			}
			local127 = Static221.anIntArrayArray38[local117 - local111][local119 - local115];
		}
		local134 = 0;
		while (local125-- > 0) {
			arg3[local134] = Static136.anIntArray274[local125];
			arg7[local134++] = Static269.anIntArray524[local125];
			if (local134 >= arg3.length) {
				break;
			}
		}
		return local134;
	}
}
