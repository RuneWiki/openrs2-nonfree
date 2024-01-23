import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static156 {

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "Lclient!oe;")
	public static Class72 aClass72_215;

	@OriginalMember(owner = "client!pd", name = "h", descriptor = "I")
	public static int anInt3604;

	@OriginalMember(owner = "client!pd", name = "d", descriptor = "[I")
	public static int[] anIntArray597 = new int[1000];

	@OriginalMember(owner = "client!pd", name = "e", descriptor = "Lclient!qe;")
	public static Class78 aClass78_644 = Static199.method3560("Untersuchen");

	@OriginalMember(owner = "client!pd", name = "f", descriptor = "Lclient!mj;")
	public static Class64 aClass64_12 = null;

	@OriginalMember(owner = "client!pd", name = "g", descriptor = "[I")
	public static int[] anIntArray598 = new int[2048];

	@OriginalMember(owner = "client!pd", name = "k", descriptor = "Lclient!qe;")
	public static Class78 aClass78_645 = Static199.method3560("<col=40ff00>");

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(I[B)V")
	public static void method2803(@OriginalArg(1) byte[] arg0) {
		@Pc(4) Class2_Sub23 local4 = new Class2_Sub23(arg0);
		local4.anInt2703 = arg0.length - 2;
		Static113.anInt2492 = local4.method2095();
		Static37.anIntArray108 = new int[Static113.anInt2492];
		Static113.anIntArray423 = new int[Static113.anInt2492];
		Static186.anIntArray702 = new int[Static113.anInt2492];
		Static131.aBooleanArray90 = new boolean[Static113.anInt2492];
		Static31.aByteArrayArray3 = new byte[Static113.anInt2492][];
		Static131.anIntArray489 = new int[Static113.anInt2492];
		Static33.aByteArrayArray4 = new byte[Static113.anInt2492][];
		local4.anInt2703 = arg0.length - Static113.anInt2492 * 8 - 7;
		Static142.anInt3236 = local4.method2095();
		Static100.anInt2184 = local4.method2095();
		@Pc(66) int local66 = (local4.method2122() & 0xFF) + 1;
		for (@Pc(68) int local68 = 0; local68 < Static113.anInt2492; local68++) {
			Static186.anIntArray702[local68] = local4.method2095();
		}
		for (@Pc(81) int local81 = 0; local81 < Static113.anInt2492; local81++) {
			Static37.anIntArray108[local81] = local4.method2095();
		}
		for (@Pc(98) int local98 = 0; local98 < Static113.anInt2492; local98++) {
			Static113.anIntArray423[local98] = local4.method2095();
		}
		for (@Pc(111) int local111 = 0; local111 < Static113.anInt2492; local111++) {
			Static131.anIntArray489[local111] = local4.method2095();
		}
		local4.anInt2703 = arg0.length - (local66 - 1) * 3 - Static113.anInt2492 * 8 - 7;
		Static198.anIntArray725 = new int[local66];
		for (@Pc(149) int local149 = 1; local149 < local66; local149++) {
			Static198.anIntArray725[local149] = local4.method2091();
			if (Static198.anIntArray725[local149] == 0) {
				Static198.anIntArray725[local149] = 1;
			}
		}
		local4.anInt2703 = 0;
		for (@Pc(176) int local176 = 0; local176 < Static113.anInt2492; local176++) {
			@Pc(181) int local181 = Static113.anIntArray423[local176];
			@Pc(185) int local185 = Static131.anIntArray489[local176];
			@Pc(189) int local189 = local185 * local181;
			@Pc(192) byte[] local192 = new byte[local189];
			@Pc(195) byte[] local195 = new byte[local189];
			Static31.aByteArrayArray3[local176] = local192;
			Static33.aByteArrayArray4[local176] = local195;
			@Pc(205) boolean local205 = false;
			@Pc(209) int local209 = local4.method2122();
			@Pc(215) int local215;
			@Pc(236) int local236;
			if ((local209 & 0x1) == 0) {
				for (local215 = 0; local215 < local189; local215++) {
					local192[local215] = local4.method2114();
				}
				if ((local209 & 0x2) != 0) {
					for (local236 = 0; local236 < local189; local236++) {
						@Pc(245) byte local245 = local195[local236] = local4.method2114();
						local205 |= local245 != -1;
					}
				}
			} else {
				local215 = 0;
				label96: while (true) {
					if (local215 >= local181) {
						if ((local209 & 0x2) == 0) {
							break;
						}
						local236 = 0;
						while (true) {
							if (local181 <= local236) {
								break label96;
							}
							for (@Pc(306) int local306 = 0; local306 < local185; local306++) {
								@Pc(319) byte local319 = local195[local181 * local306 + local236] = local4.method2114();
								local205 |= local319 != -1;
							}
							local236++;
						}
					}
					for (local236 = 0; local236 < local185; local236++) {
						local192[local215 + local181 * local236] = local4.method2114();
					}
					local215++;
				}
			}
			Static131.aBooleanArray90[local176] = local205;
		}
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(III)V")
	public static void method2804(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static138.anInt3182 < 2 && Static121.anInt4906 == 0 && !Static125.aBoolean60) {
			return;
		}
		@Pc(32) Class78 local32;
		if (Static121.anInt4906 == 1 && Static138.anInt3182 < 2) {
			local32 = Static94.method1640(new Class78[] { Static173.aClass78_690, Static25.aClass78_88, Static203.aClass78_808, Static199.aClass78_790 });
		} else if (Static125.aBoolean60 && Static138.anInt3182 < 2) {
			local32 = Static94.method1640(new Class78[] { Static69.aClass78_317, Static25.aClass78_88, Static19.aClass78_60, Static199.aClass78_790 });
		} else {
			local32 = Static18.method263(Static138.anInt3182 - 1);
		}
		if (Static138.anInt3182 > 2) {
			local32 = Static94.method1640(new Class78[] { local32, Static181.aClass78_731, Static19.method268(Static138.anInt3182 - 2), Static62.aClass78_301 });
		}
		@Pc(122) int local122 = Static75.aClass2_Sub3_Sub7_1.method889(local32, arg1 + 4, arg0 + 15, Static5.aRandom1, Static109.anInt2419);
		Static169.method3108(arg1 + 4, arg0, Static75.aClass2_Sub3_Sub7_1.method883(local32) + local122, 15);
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(JI)V")
	public static void method2805(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Static174.method3165(arg0 - 1L);
			Static174.method3165(1L);
		} else {
			Static174.method3165(arg0);
		}
	}
}
