import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static61 {

	@OriginalMember(owner = "client!dp", name = "d", descriptor = "I")
	public static int anInt1325;

	@OriginalMember(owner = "client!dp", name = "j", descriptor = "I")
	public static int anInt1330 = 0;

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(II)V")
	public static void method1384(@OriginalArg(0) int arg0) {
		@Pc(8) Class2_Sub11_Sub19 local8 = Static306.method5411(3, arg0);
		local8.method5539();
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(BLclient!tq;Lclient!tq;)V")
	public static void method1386(@OriginalArg(1) Class191 arg0, @OriginalArg(2) Class191 arg1) {
		Static302.aClass191_190 = arg0;
		Static255.aClass191_165 = arg1;
		Static255.aClass191_165.method5443(36);
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(III)V")
	public static void method1388(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class8 local7 = Static275.aClass8ArrayArrayArray4[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		if (local7.aClass62_Sub4_2 != null) {
			local7.aClass62_Sub4_2 = null;
		}
		if (local7.aClass62_Sub4_1 != null) {
			local7.aClass62_Sub4_1 = null;
		}
	}

	@OriginalMember(owner = "client!dp", name = "b", descriptor = "(IZ)V")
	public static void method1389(@OriginalArg(1) boolean arg0) {
		@Pc(18) byte local18;
		@Pc(16) byte[][] local16;
		if (arg0) {
			local16 = Static341.aByteArrayArray22;
			local18 = 1;
		} else {
			local18 = 4;
			local16 = Static10.aByteArrayArray2;
		}
		@Pc(26) int[] local26 = null;
		for (@Pc(28) int local28 = 0; local28 < local18; local28++) {
			Static166.method3083();
			for (@Pc(33) int local33 = 0; local33 < Static95.anInt6381 >> 3; local33++) {
				for (@Pc(37) int local37 = 0; local37 < Static237.anInt4532 >> 3; local37++) {
					@Pc(41) boolean local41 = false;
					@Pc(49) int local49 = Static136.anIntArrayArrayArray5[local28][local33][local37];
					if (local49 != -1) {
						@Pc(58) int local58 = local49 >> 24 & 0x3;
						if (!arg0 || local58 == 0) {
							@Pc(68) int local68 = local49 >> 1 & 0x3;
							@Pc(74) int local74 = local49 >> 14 & 0x3FF;
							@Pc(80) int local80 = local49 >> 3 & 0x7FF;
							@Pc(91) int local91 = (local74 / 8 << 8) + (local80 / 8);
							for (@Pc(93) int local93 = 0; local93 < Static201.anIntArray310.length; local93++) {
								if (local91 == Static201.anIntArray310[local93] && local16[local93] != null) {
									@Pc(128) int[] local128 = Static266.method4814(arg0, local68, local74, local80, Static169.aClass151Array1, local28, local33 * 8, local37 * 8, local58, Static147.aClass4_2, local16[local93]);
									if (local26 == null && local128 != null) {
										local26 = local128;
									}
									local41 = true;
									break;
								}
							}
						}
					}
					if (!local41) {
						Static344.method5933(local37 * 8, 8, local28, local33 * 8, 8);
					}
				}
			}
		}
		if (local26 == null) {
			Static89.aClass18_1 = null;
		} else {
			Static89.aClass18_1 = Static105.method2327(local26[3], local26[1], local26[0], local26[2]);
			Static82.anInt2744 = local26[4];
		}
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(ZIIIIIII)V")
	public static void method1392(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg3 == arg6) {
			Static220.method3899(arg6, arg0, arg4, arg1, arg5, arg2);
		} else if (Static124.anInt4221 <= arg4 - arg6 && Static96.anInt2180 >= arg4 + arg6 && arg2 - arg3 >= Static228.anInt920 && arg2 + arg3 <= Static307.anInt6214) {
			Static159.method3019(arg0, arg1, arg5, arg3, arg2, arg4, arg6);
		} else {
			Static71.method1641(arg5, arg4, arg2, arg3, arg0, arg6, arg1);
		}
	}
}
