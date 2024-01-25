import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static23 {

	@OriginalMember(owner = "client!av", name = "w", descriptor = "I")
	public static int anInt504;

	@OriginalMember(owner = "client!av", name = "m", descriptor = "Lclient!jp;")
	public static final Class129 aClass129_11 = new Class129(47, -2);

	@OriginalMember(owner = "client!av", name = "q", descriptor = "Z")
	public static boolean aBoolean42 = false;

	@OriginalMember(owner = "client!av", name = "t", descriptor = "Lclient!pu;")
	public static final Class198 aClass198_7 = new Class198("Loaded interface scripts", "Interface-Skripte geladen", "Interfaces chargées", "Interfaces carregadas");

	@OriginalMember(owner = "client!av", name = "v", descriptor = "Lclient!ne;")
	public static final Class170 aClass170_1 = new Class170("WTQA", 2);

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(Lclient!pv;IZ)V")
	public static void method402(@OriginalArg(0) Class2_Sub1_Sub3_Sub1 arg0, @OriginalArg(2) boolean arg1) {
		if (Static18.anInt395 >= 400) {
			return;
		}
		@Pc(19) Class131 local19 = arg0.aClass131_1;
		if (local19.anIntArray209 != null) {
			local19 = local19.method2781(Static408.aClass39_1);
			if (local19 == null) {
				return;
			}
		}
		if (!local19.aBoolean224) {
			return;
		}
		@Pc(37) String local37 = local19.aString39;
		if (local19.anInt3462 != 0) {
			@Pc(58) String local58 = Static217.aClass197_2 == Static369.aClass197_4 ? Static435.aClass198_124.method4012(Static38.anInt4834) : Static218.aClass198_80.method4012(Static38.anInt4834);
			local37 = local37 + Static431.method5697(Static220.aClass2_Sub1_Sub3_Sub2_1.anInt6228, local19.anInt3462) + " (" + local58 + local19.anInt3462 + ")";
		}
		if (!Static423.aBoolean478) {
			if (!arg1) {
				@Pc(88) String[] local88 = local19.aStringArray24;
				if (Static40.aBoolean60) {
					local88 = Static421.method5525(local88);
				}
				@Pc(98) int local98;
				if (local88 != null) {
					for (local98 = 4; local98 >= 0; local98--) {
						if (local88[local98] != null && (local19.aByte33 == 0 || !local88[local98].equalsIgnoreCase(Static381.aClass198_66.method4012(Static38.anInt4834)))) {
							@Pc(118) byte local118 = 0;
							@Pc(120) int local120 = Static307.anInt4786;
							if (local98 == 0) {
								local118 = 51;
							}
							if (local98 == 1) {
								local118 = 44;
							}
							if (local98 == 2) {
								local118 = 16;
							}
							if (local98 == 3) {
								local118 = 57;
							}
							if (local98 == 4) {
								local118 = 58;
							}
							if (local19.anInt3492 == local98) {
								local120 = local19.anInt3490;
							}
							if (local19.anInt3477 == local98) {
								local120 = local19.anInt3485;
							}
							Static450.method5939((long) arg0.anInt6126, -1, 0, true, local118, local88[local98], local88[local98].equalsIgnoreCase(Static381.aClass198_66.method4012(Static38.anInt4834)) ? local19.anInt3457 : local120, false, 0, "<col=ffff00>" + local37);
						}
					}
				}
				if (local19.aByte33 == 1 && local88 != null) {
					for (local98 = 4; local98 >= 0; local98--) {
						if (local88[local98] != null && local88[local98].equalsIgnoreCase(Static381.aClass198_66.method4012(Static38.anInt4834))) {
							@Pc(238) short local238 = 0;
							if (local19.anInt3462 > Static220.aClass2_Sub1_Sub3_Sub2_1.anInt6228) {
								local238 = 2000;
							}
							@Pc(247) short local247 = 0;
							if (local98 == 0) {
								local247 = 51;
							}
							if (local98 == 1) {
								local247 = 44;
							}
							if (local98 == 2) {
								local247 = 16;
							}
							if (local98 == 3) {
								local247 = 57;
							}
							if (local98 == 4) {
								local247 = 58;
							}
							if (local247 != 0) {
								local247 += local238;
							}
							Static450.method5939((long) arg0.anInt6126, -1, 0, true, local247, local88[local98], local19.anInt3457, false, 0, "<col=ffff00>" + local37);
						}
					}
				}
			}
			Static450.method5939((long) arg0.anInt6126, -1, 0, true, 1012, Static301.aClass198_83.method4012(Static38.anInt4834), Static407.anInt6817, arg1, 0, "<col=ffff00>" + local37);
		} else if (!arg1) {
			@Pc(358) Class166 local358 = Static154.anInt6464 == -1 ? null : Static1.aClass33_3.method788(Static154.anInt6464);
			if ((Static277.anInt4336 & 0x2) != 0) {
				if (local358 == null || local19.method2786(local358.anInt4273, Static154.anInt6464) != local358.anInt4273) {
					Static450.method5939((long) arg0.anInt6126, -1, 0, true, 11, Static240.aString73, Static360.anInt5869, false, 0, Static21.aString3 + " -> <col=ffff00>" + local37);
				}
				return;
			}
		}
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(ZIII)I")
	public static int method403(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 == arg0) {
			return arg1;
		}
		@Pc(17) int local17 = 128 - arg2;
		@Pc(31) int local31 = arg2 * (arg0 & 0x7F) + local17 * (arg1 & 0x7F) >> 7;
		@Pc(50) int local50 = arg2 * (arg0 & 0x380) + (arg1 & 0x380) * local17 >> 7;
		@Pc(64) int local64 = (arg0 & 0xFC00) * arg2 + (arg1 & 0xFC00) * local17 >> 7;
		return local64 & 0xFC00 | local50 & 0x380 | local31 & 0x7F;
	}
}
