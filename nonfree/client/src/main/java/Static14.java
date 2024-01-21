import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static14 {

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_97 = Static81.method1507("(Udns");

	@OriginalMember(owner = "client!bc", name = "m", descriptor = "Lclient!dj;")
	private static final Class24 aClass24_101 = Static81.method1507("scroll:");

	@OriginalMember(owner = "client!bc", name = "c", descriptor = "Lclient!dj;")
	public static Class24 aClass24_98 = aClass24_101;

	@OriginalMember(owner = "client!bc", name = "d", descriptor = "Lclient!dj;")
	private static final Class24 aClass24_99 = Static81.method1507("Players");

	@OriginalMember(owner = "client!bc", name = "i", descriptor = "Lclient!dj;")
	public static Class24 aClass24_100 = aClass24_99;

	@OriginalMember(owner = "client!bc", name = "x", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_102 = aClass24_101;

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIIII)V")
	public static void method308(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static63.anInt1608 <= arg3 && Static63.anInt1595 >= arg3) {
			@Pc(23) int local23 = Static177.method3022(Static13.anInt308, arg0, Static52.anInt1338);
			@Pc(29) int local29 = Static177.method3022(Static13.anInt308, arg2, Static52.anInt1338);
			Static5.method106(arg3, arg1, local23, local29);
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "([Lclient!vc;II)V")
	public static void method309(@OriginalArg(0) Class98[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0.length; local3++) {
			@Pc(9) Class98 local9 = arg0[local3];
			if (local9 != null && local9.anInt4424 == arg1 && (!local9.aBoolean211 || !Static49.method906(local9))) {
				if (local9.anInt4373 == 0) {
					if (!local9.aBoolean211 && Static49.method906(local9) && local9 != Static200.aClass98_20) {
						continue;
					}
					method309(arg0, local9.anInt4357);
					if (local9.aClass98Array3 != null) {
						method309(local9.aClass98Array3, local9.anInt4357);
					}
					@Pc(64) Class1_Sub11 local64 = (Class1_Sub11) Static115.aClass57_25.method1872((long) local9.anInt4357);
					if (local64 != null) {
						Static1.method49(local64.anInt2169);
					}
				}
				if (local9.anInt4373 == 6) {
					@Pc(93) int local93;
					if (local9.anInt4390 != -1 || local9.anInt4411 != -1) {
						@Pc(88) boolean local88 = Static17.method391(local9);
						if (local88) {
							local93 = local9.anInt4411;
						} else {
							local93 = local9.anInt4390;
						}
						if (local93 != -1) {
							@Pc(106) Class1_Sub2_Sub22 local106 = Static85.method2622(local93);
							if (local106 != null) {
								local9.anInt4384 += Static92.anInt2138;
								while (local9.anInt4384 > local106.anIntArray344[local9.anInt4359]) {
									local9.anInt4384 -= local106.anIntArray344[local9.anInt4359];
									local9.anInt4359++;
									if (local9.anInt4359 >= local106.anIntArray346.length) {
										local9.anInt4359 -= local106.anInt4005;
										if (local9.anInt4359 < 0 || local106.anIntArray346.length <= local9.anInt4359) {
											local9.anInt4359 = 0;
										}
									}
									Static199.method2199(local9);
								}
							}
						}
					}
					if (local9.anInt4394 != 0 && !local9.aBoolean211) {
						@Pc(186) int local186 = local9.anInt4394 >> 16;
						@Pc(190) int local190 = local186 * Static92.anInt2138;
						local93 = local9.anInt4394 << 16 >> 16;
						local9.anInt4353 = local190 + local9.anInt4353 & 0x7FF;
						local93 *= Static92.anInt2138;
						local9.anInt4378 = local93 + local9.anInt4378 & 0x7FF;
						Static199.method2199(local9);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(II)Lclient!wh;")
	public static Class1_Sub2_Sub25 method311(@OriginalArg(1) int arg0) {
		@Pc(14) Class1_Sub2_Sub25 local14 = (Class1_Sub2_Sub25) Static47.aClass86_17.method2816((long) arg0);
		if (local14 != null) {
			return local14;
		}
		local14 = Static147.method2534(Static192.aClass69_36, arg0, Static116.aClass69_27);
		if (local14 != null) {
			Static47.aClass86_17.method2821(local14, (long) arg0);
		}
		return local14;
	}
}
