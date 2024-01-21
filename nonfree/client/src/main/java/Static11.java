import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static11 {

	@OriginalMember(owner = "client!b", name = "V", descriptor = "Lclient!kc;")
	public static Class2_Sub1_Sub7_Sub4 aClass2_Sub1_Sub7_Sub4_3;

	@OriginalMember(owner = "client!b", name = "Y", descriptor = "Lclient!kc;")
	public static Class2_Sub1_Sub7_Sub4 aClass2_Sub1_Sub7_Sub4_4;

	@OriginalMember(owner = "client!b", name = "X", descriptor = "Lclient!ob;")
	private static final Class60 aClass60_102 = Static158.method3034("Choose Option");

	@OriginalMember(owner = "client!b", name = "U", descriptor = "Lclient!ob;")
	public static Class60 aClass60_101 = aClass60_102;

	@OriginalMember(owner = "client!b", name = "eb", descriptor = "I")
	public static int anInt384 = 0;

	@OriginalMember(owner = "client!b", name = "fb", descriptor = "[I")
	public static final int[] anIntArray35 = new int[2000];

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(IIILclient!ai;I)V")
	public static void method307(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class2_Sub1_Sub2 arg2, @OriginalArg(4) int arg3) {
		if (Static169.anInt4148 >= 400) {
			return;
		}
		if (arg2.anIntArray32 != null) {
			arg2 = arg2.method273();
		}
		if (arg2 == null || !arg2.aBoolean4) {
			return;
		}
		@Pc(26) Class60 local26 = arg2.aClass60_92;
		if (arg2.anInt337 != 0) {
			local26 = Static193.method3536(new Class60[] { local26, Static149.method2963(Static103.aClass2_Sub1_Sub1_Sub3_Sub1_1.anInt1283, arg2.anInt337), Static181.aClass60_1216, Static18.aClass60_1219, Static72.method1661(arg2.anInt337), Static90.aClass60_720 });
		}
		if (Static29.anInt889 == 1) {
			Static61.method1423(Static193.method3536(new Class60[] { Static162.aClass60_1102, Static4.aClass60_38, local26 }), Static56.aClass60_405, (short) 14, (long) arg1, arg0, arg3);
		} else if (!Static58.aBoolean74) {
			@Pc(149) Class60[] local149 = arg2.aClass60Array4;
			if (Static67.aBoolean87) {
				local149 = Static174.method3268(local149);
			}
			@Pc(159) int local159;
			if (local149 != null) {
				for (local159 = 4; local159 >= 0; local159--) {
					if (local149[local159] != null && (Static143.anInt3755 != 0 || !local149[local159].method2698(Static29.aClass60_210))) {
						@Pc(183) byte local183 = 0;
						if (local159 == 0) {
							local183 = 37;
						}
						if (local159 == 1) {
							local183 = 9;
						}
						if (local159 == 2) {
							local183 = 24;
						}
						if (local159 == 3) {
							local183 = 11;
						}
						if (local159 == 4) {
							local183 = 18;
						}
						Static61.method1423(Static193.method3536(new Class60[] { Static19.aClass60_863, local26 }), local149[local159], local183, (long) arg1, arg0, arg3);
					}
				}
			}
			if (Static143.anInt3755 == 0 && local149 != null) {
				for (local159 = 4; local159 >= 0; local159--) {
					if (local149[local159] != null && local149[local159].method2698(Static29.aClass60_210)) {
						@Pc(257) short local257 = 0;
						if (arg2.anInt337 > Static103.aClass2_Sub1_Sub1_Sub3_Sub1_1.anInt1283) {
							local257 = 2000;
						}
						@Pc(270) short local270 = 0;
						if (local159 == 0) {
							local270 = 37;
						}
						if (local159 == 1) {
							local270 = 9;
						}
						if (local159 == 2) {
							local270 = 24;
						}
						if (local159 == 3) {
							local270 = 11;
						}
						if (local159 == 4) {
							local270 = 18;
						}
						if (local270 != 0) {
							local270 += local257;
						}
						Static61.method1423(Static193.method3536(new Class60[] { Static19.aClass60_863, local26 }), local149[local159], local270, (long) arg1, arg0, arg3);
					}
				}
			}
			Static61.method1423(Static193.method3536(new Class60[] { Static19.aClass60_863, local26 }), Static88.aClass60_704, (short) 1002, (long) arg1, arg0, arg3);
		} else if ((Static101.anInt2923 & 0x2) == 2) {
			Static61.method1423(Static193.method3536(new Class60[] { Static167.aClass60_1132, Static4.aClass60_38, local26 }), Static4.aClass60_35, (short) 32, (long) arg1, arg0, arg3);
			return;
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(IIII)V")
	public static void method309(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) Class2_Sub17 local7 = Static118.aClass2_Sub17ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		@Pc(13) Class26 local13 = local7.aClass26_1;
		if (local13 != null) {
			local13.anInt1771 = local13.anInt1771 * arg3 / 16;
			local13.anInt1770 = local13.anInt1770 * arg3 / 16;
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "([BB)V")
	public static void method310(@OriginalArg(0) byte[] arg0) {
		@Pc(10) Class2_Sub3 local10 = new Class2_Sub3(arg0);
		local10.anInt273 = arg0.length - 2;
		Static176.anInt4297 = local10.method234();
		Static30.anIntArray95 = new int[Static176.anInt4297];
		Static178.anIntArray468 = new int[Static176.anInt4297];
		Static103.anIntArray342 = new int[Static176.anInt4297];
		Static197.aByteArrayArray10 = new byte[Static176.anInt4297][];
		Static30.anIntArray96 = new int[Static176.anInt4297];
		local10.anInt273 = arg0.length - Static176.anInt4297 * 8 - 7;
		Static93.anInt2723 = local10.method234();
		Static175.anInt4257 = local10.method234();
		@Pc(62) int local62 = (local10.method218() & 0xFF) + 1;
		for (@Pc(64) int local64 = 0; local64 < Static176.anInt4297; local64++) {
			Static30.anIntArray96[local64] = local10.method234();
		}
		for (@Pc(87) int local87 = 0; local87 < Static176.anInt4297; local87++) {
			Static30.anIntArray95[local87] = local10.method234();
		}
		for (@Pc(101) int local101 = 0; local101 < Static176.anInt4297; local101++) {
			Static178.anIntArray468[local101] = local10.method234();
		}
		for (@Pc(115) int local115 = 0; local115 < Static176.anInt4297; local115++) {
			Static103.anIntArray342[local115] = local10.method234();
		}
		local10.anInt273 = arg0.length + 3 - Static176.anInt4297 * 8 - local62 * 3 - 7;
		Static16.anIntArray43 = new int[local62];
		for (@Pc(152) int local152 = 1; local152 < local62; local152++) {
			Static16.anIntArray43[local152] = local10.method239();
			if (Static16.anIntArray43[local152] == 0) {
				Static16.anIntArray43[local152] = 1;
			}
		}
		local10.anInt273 = 0;
		for (@Pc(177) int local177 = 0; local177 < Static176.anInt4297; local177++) {
			@Pc(183) int local183 = Static178.anIntArray468[local177];
			@Pc(187) int local187 = Static103.anIntArray342[local177];
			@Pc(191) int local191 = local187 * local183;
			@Pc(194) byte[] local194 = new byte[local191];
			Static197.aByteArrayArray10[local177] = local194;
			@Pc(202) int local202 = local10.method218();
			@Pc(209) int local209;
			if (local202 == 0) {
				for (local209 = 0; local209 < local191; local209++) {
					local194[local209] = local10.method227();
				}
			} else if (local202 == 1) {
				for (local209 = 0; local209 < local183; local209++) {
					for (@Pc(213) int local213 = 0; local213 < local187; local213++) {
						local194[local183 * local213 + local209] = local10.method227();
					}
				}
			}
		}
	}
}
