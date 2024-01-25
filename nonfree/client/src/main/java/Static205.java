import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static205 {

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "Lclient!tq;")
	public static Class191 aClass191_135;

	@OriginalMember(owner = "client!mq", name = "c", descriptor = "I")
	public static int anInt3972;

	@OriginalMember(owner = "client!mq", name = "d", descriptor = "I")
	public static int anInt3973;

	@OriginalMember(owner = "client!mq", name = "e", descriptor = "Lclient!bm;")
	public static Class22 aClass22_2;

	@OriginalMember(owner = "client!mq", name = "g", descriptor = "[S")
	public static final short[] aShortArray71 = new short[] { 10, 49, 20, 50, 30, 2, 47, 9 };

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(Lclient!qm;B)V")
	public static void method3669(@OriginalArg(0) Class62_Sub1_Sub2_Sub1 arg0) {
		if (Static117.anInt2590 >= 400) {
			return;
		}
		@Pc(19) Class186 local19 = arg0.aClass186_1;
		if (local19.anIntArray432 != null) {
			local19 = local19.method5206();
			if (local19 == null) {
				return;
			}
		}
		if (!local19.aBoolean529) {
			return;
		}
		@Pc(36) String local36 = local19.aString58;
		if (local19.anInt5944 != 0) {
			@Pc(55) String local55 = Static41.anInt830 == 1 ? Static276.aClass93_101.method2819(Static21.anInt455) : Static198.aClass93_77.method2819(Static21.anInt455);
			local36 = local36 + Static81.method1819(Static41.aClass62_Sub1_Sub2_Sub2_2.anInt5387, local19.anInt5944) + " (" + local55 + local19.anInt5944 + ")";
		}
		if (Static262.aBoolean479) {
			@Pc(90) Class2_Sub11_Sub21 local90 = Static133.anInt2765 == -1 ? null : Static2.method57(Static133.anInt2765);
			if ((Static326.anInt6614 & 0x2) != 0) {
				if (local90 == null || local19.method5211(Static133.anInt2765, local90.anInt6866) != local90.anInt6866) {
					Static53.method1208(0, Static149.aString25 + " -> <col=ffff00>" + local36, Static273.anInt5579, Static165.aString29, (long) arg0.anInt5328, 0, 18);
				}
				return;
			}
			return;
		}
		@Pc(133) String[] local133 = local19.aStringArray54;
		if (Static141.aBoolean251) {
			local133 = Static106.method2334(local133);
		}
		@Pc(143) int local143;
		if (local133 != null) {
			for (local143 = 4; local143 >= 0; local143--) {
				if (local133[local143] != null && (Static41.anInt830 != 0 || !local133[local143].equalsIgnoreCase(Static42.aClass93_12.method2819(Static21.anInt455)))) {
					@Pc(165) byte local165 = 0;
					if (local143 == 0) {
						local165 = 59;
					}
					@Pc(174) int local174 = Static83.anInt1810;
					if (local143 == 1) {
						local165 = 51;
					}
					if (local143 == 2) {
						local165 = 60;
					}
					if (local143 == 3) {
						local165 = 8;
					}
					if (local19.anInt5965 == local143) {
						local174 = local19.anInt5975;
					}
					if (local143 == 4) {
						local165 = 4;
					}
					if (local19.anInt5971 == local143) {
						local174 = local19.anInt5940;
					}
					Static53.method1208(0, "<col=ffff00>" + local36, local174, local133[local143], (long) arg0.anInt5328, 0, local165);
				}
			}
		}
		if (Static41.anInt830 == 0 && local133 != null) {
			for (local143 = 4; local143 >= 0; local143--) {
				if (local133[local143] != null && local133[local143].equalsIgnoreCase(Static42.aClass93_12.method2819(Static21.anInt455))) {
					@Pc(264) short local264 = 0;
					if (local19.anInt5944 > Static41.aClass62_Sub1_Sub2_Sub2_2.anInt5387) {
						local264 = 2000;
					}
					@Pc(273) short local273 = 0;
					if (local143 == 0) {
						local273 = 59;
					}
					if (local143 == 1) {
						local273 = 51;
					}
					if (local143 == 2) {
						local273 = 60;
					}
					if (local143 == 3) {
						local273 = 8;
					}
					if (local143 == 4) {
						local273 = 4;
					}
					if (local273 != 0) {
						local273 += local264;
					}
					Static53.method1208(0, "<col=ffff00>" + local36, local19.anInt5966, local133[local143], (long) arg0.anInt5328, 0, local273);
				}
			}
		}
		Static53.method1208(0, "<col=ffff00>" + local36, Static303.anInt6089, Static70.aClass93_23.method2819(Static21.anInt455), (long) arg0.anInt5328, 0, 1010);
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(II[III)V")
	public static void method3670(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3) {
		arg3--;
		@Pc(13) int local13 = arg1 - 1;
		@Pc(16) int local16 = local13 - 7;
		while (local16 > arg3) {
			@Pc(20) int local20 = arg3 + 1;
			arg2[local20] = arg0;
			@Pc(25) int local25 = local20 + 1;
			arg2[local25] = arg0;
			@Pc(30) int local30 = local25 + 1;
			arg2[local30] = arg0;
			@Pc(35) int local35 = local30 + 1;
			arg2[local35] = arg0;
			@Pc(40) int local40 = local35 + 1;
			arg2[local40] = arg0;
			@Pc(45) int local45 = local40 + 1;
			arg2[local45] = arg0;
			@Pc(50) int local50 = local45 + 1;
			arg2[local50] = arg0;
			arg3 = local50 + 1;
			arg2[arg3] = arg0;
		}
		while (arg3 < local13) {
			arg3++;
			arg2[arg3] = arg0;
		}
	}
}
