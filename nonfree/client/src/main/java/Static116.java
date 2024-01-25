import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static116 {

	@OriginalMember(owner = "client!ft", name = "f", descriptor = "Lclient!ig;")
	public static Class12 aClass12_3;

	@OriginalMember(owner = "client!ft", name = "p", descriptor = "Z")
	public static boolean aBoolean157 = false;

	@OriginalMember(owner = "client!ft", name = "q", descriptor = "[J")
	public static final long[] aLongArray3 = new long[32];

	@OriginalMember(owner = "client!ft", name = "s", descriptor = "Lclient!bg;")
	public static final Class25 aClass25_26 = new Class25(36, 2);

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(Lclient!eh;)V")
	public static void method1889(@OriginalArg(0) Class66 arg0) {
		if (Static208.anInt3623 >= 65535) {
			return;
		}
		@Pc(6) Class6_Sub6 local6 = arg0.aClass6_Sub6_1;
		Static304.aClass66Array1[Static208.anInt3623] = arg0;
		Static198.aBooleanArray18[Static208.anInt3623] = false;
		Static208.anInt3623++;
		@Pc(21) int local21 = arg0.anInt1662;
		if (arg0.aBoolean141) {
			local21 = 0;
		}
		@Pc(29) int local29 = arg0.anInt1662;
		if (arg0.aBoolean140) {
			local29 = Static268.anInt4600 - 1;
		}
		for (@Pc(38) int local38 = local21; local38 <= local29; local38++) {
			@Pc(41) int local41 = 0;
			@Pc(53) int local53 = local6.method1169() + Static25.anInt7191 - local6.method1162() >> Static301.anInt2759;
			if (local53 < 0) {
				local41 = -local53;
				local53 = 0;
			}
			@Pc(73) int local73 = local6.method1169() + local6.method1162() - Static25.anInt7191 >> Static301.anInt2759;
			if (local73 >= Static364.anInt6134) {
				local73 = Static364.anInt6134 - 1;
			}
			for (@Pc(82) int local82 = local53; local82 <= local73; local82++) {
				@Pc(89) short local89 = arg0.aShortArray29[local41++];
				@Pc(105) int local105 = (local6.method1163() + Static25.anInt7191 - local6.method1162() >> Static301.anInt2759) + (local89 >>> 8);
				@Pc(113) int local113 = local105 + (local89 & 0xFF) - 1;
				if (local105 < 0) {
					local105 = 0;
				}
				if (local113 >= Static401.anInt6621) {
					local113 = Static401.anInt6621 - 1;
				}
				for (@Pc(126) int local126 = local105; local126 <= local113; local126++) {
					@Pc(135) long local135 = Static267.aLongArrayArrayArray1[local38][local126][local82];
					if ((local135 & 0xFFFFL) == 0L) {
						Static267.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static208.anInt3623;
					} else if ((local135 & 0xFFFF0000L) == 0L) {
						Static267.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static208.anInt3623 << 16;
					} else if ((local135 & 0xFFFF00000000L) == 0L) {
						Static267.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static208.anInt3623 << 32;
					} else if ((local135 & 0xFFFF000000000000L) == 0L) {
						Static267.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static208.anInt3623 << 48;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ft", name = "c", descriptor = "(B)V")
	public static void method1890() {
		Static307.aClass28_42.method3583(((float) Static8.aClass173_Sub1_1.anInt4416 * 0.1F + 0.7F) * 1.1523438F);
		Static307.aClass28_42.method3529(Static215.anInt3736, 0.69921875F, 1.2F, -50.0F, -60.0F, -50.0F);
		Static307.aClass28_42.method3535(Static414.anInt6927, -1, 256);
		Static307.aClass28_42.method3502(Static35.aClass133_1);
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(III)V")
	public static void method1892(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static298.method4373(Static257.aClass25_65);
		Static449.aClass6_Sub15_Sub1_2.method3117(arg1);
		Static449.aClass6_Sub15_Sub1_2.method3107(arg0);
	}
}
