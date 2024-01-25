import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static8 {

	@OriginalMember(owner = "client!ai", name = "x", descriptor = "Z")
	public static boolean aBoolean8;

	@OriginalMember(owner = "client!ai", name = "N", descriptor = "I")
	public static int anInt242;

	@OriginalMember(owner = "client!ai", name = "O", descriptor = "Lclient!mu;")
	public static Class167 aClass167_1;

	@OriginalMember(owner = "client!ai", name = "b", descriptor = "I")
	public static int anInt223 = 0;

	@OriginalMember(owner = "client!ai", name = "p", descriptor = "Lclient!wj;")
	public static final Class265 aClass265_1 = new Class265(1, -2);

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(ILjava/lang/String;IILjava/lang/String;ILjava/lang/String;Ljava/lang/String;)V")
	public static void method202(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) String arg4, @OriginalArg(6) String arg5, @OriginalArg(7) String arg6) {
		for (@Pc(15) int local15 = 99; local15 > 0; local15--) {
			Static267.anIntArray630[local15] = Static267.anIntArray630[local15 - 1];
			Static416.anIntArray588[local15] = Static416.anIntArray588[local15 - 1];
			Static12.aStringArray1[local15] = Static12.aStringArray1[local15 - 1];
			Static150.aStringArray30[local15] = Static150.aStringArray30[local15 - 1];
			Static341.aStringArray15[local15] = Static341.aStringArray15[local15 - 1];
			Static353.aStringArray44[local15] = Static353.aStringArray44[local15 - 1];
			Static370.anIntArray540[local15] = Static370.anIntArray540[local15 - 1];
		}
		Static267.anIntArray630[0] = arg2;
		Static416.anIntArray588[0] = arg3;
		Static12.aStringArray1[0] = arg4;
		Static150.aStringArray30[0] = arg1;
		Static341.aStringArray15[0] = arg6;
		Static353.aStringArray44[0] = arg5;
		Static58.anInt1319 = Static37.anInt715;
		Static39.anInt730++;
		Static370.anIntArray540[0] = arg0;
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(B)V")
	public static void method203() {
		@Pc(13) int local13 = Static450.aByteArrayArray63.length;
		for (@Pc(15) int local15 = 0; local15 < local13; local15++) {
			if (Static450.aByteArrayArray63[local15] != null) {
				@Pc(23) int local23 = -1;
				for (@Pc(25) int local25 = 0; local25 < Static101.anInt2403; local25++) {
					if (Static307.anIntArray442[local25] == Static334.anIntArray494[local15]) {
						local23 = local25;
						break;
					}
				}
				if (local23 == -1) {
					Static307.anIntArray442[Static101.anInt2403] = Static334.anIntArray494[local15];
					local23 = Static101.anInt2403++;
				}
				@Pc(68) Class2_Sub23 local68 = new Class2_Sub23(Static450.aByteArrayArray63[local15]);
				@Pc(70) int local70 = 0;
				while (local68.anInt6952 < Static450.aByteArrayArray63[local15].length && local70 < 511 && Static62.anInt1371 < 1023) {
					@Pc(89) int local89 = local23 | local70++ << 6;
					@Pc(93) int local93 = local68.method5500();
					@Pc(97) int local97 = local93 >> 14;
					@Pc(103) int local103 = local93 >> 7 & 0x3F;
					@Pc(107) int local107 = local93 & 0x3F;
					@Pc(120) int local120 = (Static334.anIntArray494[local15] >> 8) * 64 + local103 - Static48.anInt962;
					@Pc(132) int local132 = local107 + (Static334.anIntArray494[local15] & 0xFF) * 64 - Static324.anInt5624;
					@Pc(139) Class65 local139 = Static219.aClass76_2.method1888(local68.method5500());
					if (Static174.aClass3_Sub2_Sub1_Sub1Array1[local89] == null && (local139.lb & 0x1) > 0 && Static427.anInt7117 == local97 && local120 >= 0 && Static229.anInt4427 > local120 + local139.anInt2128 && local132 >= 0 && local139.anInt2128 + local132 < Static379.anInt6422) {
						Static174.aClass3_Sub2_Sub1_Sub1Array1[local89] = new Class3_Sub2_Sub1_Sub1();
						Static174.aClass3_Sub2_Sub1_Sub1Array1[local89].anInt6137 = local89;
						@Pc(195) Class3_Sub2_Sub1_Sub1 local195 = Static174.aClass3_Sub2_Sub1_Sub1Array1[local89];
						Static173.anIntArray307[Static62.anInt1371++] = local89;
						local195.anInt6130 = Static131.anInt2821;
						local195.method1426(local139);
						local195.method4929(local195.aClass65_1.anInt2128);
						local195.anInt6138 = local195.aClass65_1.anInt2139 << 3;
						if (local195.anInt6138 == 0) {
							local195.method4921(0);
						} else {
							local195.method4921(local195.aClass65_1.aByte25 + 4 << 11 & 0x3ED0);
						}
						local195.method1433(local120, local132, true, local97, local195.method4935());
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(III)V")
	public static void method204(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class106 local7 = Static440.aClass106ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		if (local7.aClass3_Sub3_1 != null) {
			local7.aClass3_Sub3_1 = null;
		}
		if (local7.aClass3_Sub3_2 != null) {
			local7.aClass3_Sub3_2 = null;
		}
	}
}
