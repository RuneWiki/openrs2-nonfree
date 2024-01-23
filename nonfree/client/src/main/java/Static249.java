import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static249 {

	@OriginalMember(owner = "client!sn", name = "g", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray24;

	@OriginalMember(owner = "client!sn", name = "j", descriptor = "I")
	public static int anInt5052;

	@OriginalMember(owner = "client!sn", name = "o", descriptor = "F")
	public static float aFloat146;

	@OriginalMember(owner = "client!sn", name = "b", descriptor = "I")
	public static int anInt5046 = 0;

	@OriginalMember(owner = "client!sn", name = "e", descriptor = "I")
	public static int anInt5049 = 0;

	@OriginalMember(owner = "client!sn", name = "k", descriptor = "Ljava/lang/String;")
	public static String aString167 = "glow2:";

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(Lclient!ak;ILclient!ak;)V")
	public static void method3877(@OriginalArg(0) Class7 arg0, @OriginalArg(2) Class7 arg1) {
		Static275.aClass7_221 = arg1;
		Static276.aClass7_222 = arg0;
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(IIIIBIII)V")
	public static void method3881(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg4 < 1 || arg0 < 1 || arg4 > 102 || arg0 > 102) {
			return;
		}
		@Pc(43) int local43;
		if (!Static39.method718() && (Static242.aByteArrayArrayArray23[0][arg4][arg0] & 0x2) == 0) {
			local43 = arg2;
			if ((Static242.aByteArrayArrayArray23[arg2][arg4][arg0] & 0x8) != 0) {
				local43 = 0;
			}
			if (Static92.anInt1754 != local43) {
				return;
			}
		}
		local43 = arg2;
		if (arg2 < 3 && (Static242.aByteArrayArrayArray23[1][arg4][arg0] & 0x2) == 2) {
			local43 = arg2 + 1;
		}
		Static284.method4341(arg2, arg3, local43, arg0, Static27.aClass2Array1[arg2], arg4);
		if (arg1 >= 0) {
			@Pc(98) boolean local98 = Static287.aBoolean429;
			Static287.aBoolean429 = true;
			Static232.method3822(arg1, false, arg0, arg5, arg4, arg2, Static27.aClass2Array1[arg2], false, local43, arg6);
			Static287.aBoolean429 = local98;
		}
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(B[B)V")
	public static void method3882(@OriginalArg(1) byte[] arg0) {
		@Pc(22) Class1_Sub18 local22 = new Class1_Sub18(arg0);
		local22.anInt3911 = arg0.length - 2;
		Static105.anInt1963 = local22.method3107();
		Static134.anIntArray306 = new int[Static105.anInt1963];
		Static65.aByteArrayArray4 = new byte[Static105.anInt1963][];
		Static235.aBooleanArray21 = new boolean[Static105.anInt1963];
		Static299.aByteArrayArray15 = new byte[Static105.anInt1963][];
		Static227.anIntArray557 = new int[Static105.anInt1963];
		Static49.anIntArray135 = new int[Static105.anInt1963];
		Static113.anIntArray273 = new int[Static105.anInt1963];
		local22.anInt3911 = arg0.length - Static105.anInt1963 * 8 - 7;
		Static214.anInt4248 = local22.method3107();
		Static67.anInt1375 = local22.method3107();
		@Pc(84) int local84 = (local22.method3122() & 0xFF) + 1;
		@Pc(86) int local86;
		for (local86 = 0; local86 < Static105.anInt1963; local86++) {
			Static227.anIntArray557[local86] = local22.method3107();
		}
		for (local86 = 0; local86 < Static105.anInt1963; local86++) {
			Static134.anIntArray306[local86] = local22.method3107();
		}
		for (local86 = 0; local86 < Static105.anInt1963; local86++) {
			Static49.anIntArray135[local86] = local22.method3107();
		}
		for (local86 = 0; local86 < Static105.anInt1963; local86++) {
			Static113.anIntArray273[local86] = local22.method3107();
		}
		local22.anInt3911 = arg0.length + 3 - Static105.anInt1963 * 8 - local84 * 3 - 7;
		Static158.anIntArray366 = new int[local84];
		for (local86 = 1; local86 < local84; local86++) {
			Static158.anIntArray366[local86] = local22.method3109();
			if (Static158.anIntArray366[local86] == 0) {
				Static158.anIntArray366[local86] = 1;
			}
		}
		local22.anInt3911 = 0;
		for (local86 = 0; local86 < Static105.anInt1963; local86++) {
			@Pc(219) int local219 = Static49.anIntArray135[local86];
			@Pc(223) int local223 = Static113.anIntArray273[local86];
			@Pc(227) int local227 = local219 * local223;
			@Pc(230) byte[] local230 = new byte[local227];
			@Pc(233) byte[] local233 = new byte[local227];
			@Pc(235) boolean local235 = false;
			Static299.aByteArrayArray15[local86] = local233;
			Static65.aByteArrayArray4[local86] = local230;
			@Pc(247) int local247 = local22.method3122();
			@Pc(256) int local256;
			if ((local247 & 0x1) == 0) {
				for (local256 = 0; local256 < local227; local256++) {
					local233[local256] = local22.method3082();
				}
				if ((local247 & 0x2) != 0) {
					for (local256 = 0; local256 < local227; local256++) {
						@Pc(377) byte local377 = local230[local256] = local22.method3082();
						local235 |= local377 != -1;
					}
				}
			} else {
				local256 = 0;
				label88: while (true) {
					@Pc(265) int local265;
					if (local256 >= local219) {
						if ((local247 & 0x2) == 0) {
							break;
						}
						local256 = 0;
						while (true) {
							if (local256 >= local219) {
								break label88;
							}
							for (local265 = 0; local265 < local223; local265++) {
								@Pc(319) byte local319 = local230[local265 * local219 + local256] = local22.method3082();
								local235 |= local319 != -1;
							}
							local256++;
						}
					}
					for (local265 = 0; local265 < local223; local265++) {
						local233[local256 + local265 * local219] = local22.method3082();
					}
					local256++;
				}
			}
			Static235.aBooleanArray21[local86] = local235;
		}
	}
}
