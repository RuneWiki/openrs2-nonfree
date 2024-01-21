import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static207 {

	@OriginalMember(owner = "client!vi", name = "r", descriptor = "I")
	public static int anInt4078;

	@OriginalMember(owner = "client!vi", name = "y", descriptor = "Z")
	public static boolean aBoolean188;

	@OriginalMember(owner = "client!vi", name = "z", descriptor = "I")
	public static int anInt4082;

	@OriginalMember(owner = "client!vi", name = "o", descriptor = "Lclient!qe;")
	private static final Class83 aClass83_1181 = Static181.method2795("Create a free account");

	@OriginalMember(owner = "client!vi", name = "s", descriptor = "[I")
	public static final int[] anIntArray402 = new int[32768];

	@OriginalMember(owner = "client!vi", name = "t", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_1182 = Static181.method2795(" )2>");

	@OriginalMember(owner = "client!vi", name = "v", descriptor = "[I")
	public static final int[] anIntArray403 = new int[2000];

	@OriginalMember(owner = "client!vi", name = "B", descriptor = "Lclient!qe;")
	public static Class83 aClass83_1183 = aClass83_1181;

	@OriginalMember(owner = "client!vi", name = "C", descriptor = "I")
	public static int anInt4084 = 0;

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "([BB)V")
	public static void method3117(@OriginalArg(0) byte[] arg0) {
		@Pc(10) Class2_Sub3 local10 = new Class2_Sub3(arg0);
		local10.anInt340 = arg0.length - 2;
		Static200.anInt3968 = local10.method269();
		Static163.anIntArray314 = new int[Static200.anInt3968];
		Static124.anIntArray251 = new int[Static200.anInt3968];
		Static151.aByteArrayArray14 = new byte[Static200.anInt3968][];
		Static131.anIntArray284 = new int[Static200.anInt3968];
		Static28.anIntArray61 = new int[Static200.anInt3968];
		local10.anInt340 = arg0.length - Static200.anInt3968 * 8 - 7;
		Static21.anInt570 = local10.method269();
		Static9.anInt226 = local10.method269();
		@Pc(65) int local65 = (local10.method260() & 0xFF) + 1;
		for (@Pc(67) int local67 = 0; local67 < Static200.anInt3968; local67++) {
			Static28.anIntArray61[local67] = local10.method269();
		}
		for (@Pc(85) int local85 = 0; local85 < Static200.anInt3968; local85++) {
			Static124.anIntArray251[local85] = local10.method269();
		}
		for (@Pc(103) int local103 = 0; local103 < Static200.anInt3968; local103++) {
			Static163.anIntArray314[local103] = local10.method269();
		}
		for (@Pc(117) int local117 = 0; local117 < Static200.anInt3968; local117++) {
			Static131.anIntArray284[local117] = local10.method269();
		}
		local10.anInt340 = arg0.length - Static200.anInt3968 * 8 - (local65 - 1) * 3 - 7;
		Static153.anIntArray317 = new int[local65];
		for (@Pc(152) int local152 = 1; local152 < local65; local152++) {
			Static153.anIntArray317[local152] = local10.method261();
			if (Static153.anIntArray317[local152] == 0) {
				Static153.anIntArray317[local152] = 1;
			}
		}
		local10.anInt340 = 0;
		for (@Pc(181) int local181 = 0; local181 < Static200.anInt3968; local181++) {
			@Pc(187) int local187 = Static163.anIntArray314[local181];
			@Pc(191) int local191 = Static131.anIntArray284[local181];
			@Pc(195) int local195 = local191 * local187;
			@Pc(198) byte[] local198 = new byte[local195];
			Static151.aByteArrayArray14[local181] = local198;
			@Pc(206) int local206 = local10.method260();
			@Pc(213) int local213;
			if (local206 == 0) {
				for (local213 = 0; local213 < local195; local213++) {
					local198[local213] = local10.method221();
				}
			} else if (local206 == 1) {
				for (local213 = 0; local213 < local187; local213++) {
					for (@Pc(236) int local236 = 0; local236 < local191; local236++) {
						local198[local236 * local187 + local213] = local10.method221();
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(B)V")
	public static void method3118() {
		Static14.aByteArrayArrayArray40 = null;
		Static124.anIntArray249 = null;
		Static57.aByteArrayArrayArray23 = null;
		Static103.anIntArray236 = null;
		Static61.anIntArrayArrayArray4 = null;
		Static25.anIntArray391 = null;
		Static153.anIntArray315 = null;
		Static171.anIntArray327 = null;
		Static67.aByteArrayArrayArray28 = null;
		Static110.aByteArrayArrayArray46 = null;
		Static10.aByteArrayArrayArray8 = null;
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(II[Lclient!ae;)V")
	public static void method3119(@OriginalArg(0) int arg0, @OriginalArg(2) Class5[] arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg1.length; local3++) {
			@Pc(9) Class5 local9 = arg1[local3];
			if (local9 != null && local9.anInt132 == arg0 && (!local9.aBoolean7 || !Static29.method604(local9))) {
				if (local9.anInt130 == 0) {
					if (!local9.aBoolean7 && Static29.method604(local9) && Static135.aClass5_16 != local9) {
						continue;
					}
					method3119(local9.anInt159, arg1);
					if (local9.aClass5Array1 != null) {
						method3119(local9.anInt159, local9.aClass5Array1);
					}
					@Pc(57) Class2_Sub13 local57 = (Class2_Sub13) Static33.aClass63_3.method2110((long) local9.anInt159);
					if (local57 != null) {
						Static213.method3231(local57.anInt1869);
					}
				}
				if (local9.anInt130 == 6) {
					@Pc(87) int local87;
					if (local9.anInt164 != -1 || local9.anInt119 != -1) {
						@Pc(82) boolean local82 = Static60.method1674(local9);
						if (local82) {
							local87 = local9.anInt119;
						} else {
							local87 = local9.anInt164;
						}
						if (local87 != -1) {
							@Pc(99) Class2_Sub2_Sub16 local99 = Static213.method3229(local87);
							if (local99 != null) {
								local9.anInt139 += Static57.anInt1427;
								while (local99.anIntArray229[local9.anInt169] < local9.anInt139) {
									local9.anInt139 -= local99.anIntArray229[local9.anInt169];
									local9.anInt169++;
									if (local99.anIntArray232.length <= local9.anInt169) {
										local9.anInt169 -= local99.anInt2341;
										if (local9.anInt169 < 0 || local99.anIntArray232.length <= local9.anInt169) {
											local9.anInt169 = 0;
										}
									}
									Static121.method2085(local9);
								}
							}
						}
					}
					if (local9.anInt103 != 0 && !local9.aBoolean7) {
						@Pc(186) int local186 = local9.anInt103 >> 16;
						@Pc(190) int local190 = local186 * Static57.anInt1427;
						local9.anInt152 = local190 + local9.anInt152 & 0x7FF;
						local87 = local9.anInt103 << 16 >> 16;
						local87 *= Static57.anInt1427;
						local9.anInt171 = local87 + local9.anInt171 & 0x7FF;
						Static121.method2085(local9);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(ZI)V")
	public static void method3120(@OriginalArg(1) int arg0) {
		Static127.anInt2806 = arg0;
		Static206.anInt4068 = 50;
	}
}
