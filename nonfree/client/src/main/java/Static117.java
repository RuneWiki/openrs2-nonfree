import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static117 {

	@OriginalMember(owner = "client!hj", name = "k", descriptor = "I")
	public static int anInt2213;

	@OriginalMember(owner = "client!hj", name = "o", descriptor = "Lclient!dp;")
	public static Class53 aClass53_65;

	@OriginalMember(owner = "client!hj", name = "n", descriptor = "I")
	public static int anInt2215 = -1;

	@OriginalMember(owner = "client!hj", name = "p", descriptor = "Ljava/lang/String;")
	public static String aString89 = "Checking for updates - ";

	@OriginalMember(owner = "client!hj", name = "r", descriptor = "F")
	public static float aFloat58 = 0.0F;

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lclient!ri;I)V")
	public static void method2380(@OriginalArg(0) Class44_Sub4_Sub4_Sub2 arg0) {
		if (Static256.anInt4749 >= 400) {
			return;
		}
		@Pc(12) Class18 local12 = arg0.aClass18_1;
		if (local12.anIntArray37 != null) {
			local12 = local12.method369();
			if (local12 == null) {
				return;
			}
		}
		if (!local12.aBoolean34) {
			return;
		}
		@Pc(29) String local29 = local12.aString21;
		if (local12.anInt420 != 0) {
			@Pc(44) String local44 = Static105.anInt1941 == 1 ? Static84.aString55 : Static299.aString255;
			local29 = local29 + Static304.method5214(local12.anInt420, Static253.aClass44_Sub4_Sub4_Sub1_1.anInt4907) + " (" + local44 + local12.anInt420 + ")";
		}
		if (Static14.anInt257 == 1) {
			Static52.method870(0, Static165.aString287, 2, 0, Static71.anInt1345, Static237.aString188 + " -> <col=ffff00>" + local29, (long) arg0.anInt5127);
		} else if (Static79.aBoolean97) {
			@Pc(336) Class6_Sub2_Sub13 local336 = Static221.anInt4061 == -1 ? null : Static219.method3902(Static221.anInt4061);
			if ((Static288.anInt5432 & 0x2) != 0 && (local336 == null || local12.method367(Static221.anInt4061, local336.anInt3777) != local336.anInt3777)) {
				Static52.method870(0, Static312.aString270, 38, 0, Static1.anInt38, Static303.aString264 + " -> <col=ffff00>" + local29, (long) arg0.anInt5127);
			}
		} else {
			@Pc(107) String[] local107 = local12.aStringArray2;
			if (Static303.aBoolean387) {
				local107 = Static353.method5804(local107);
			}
			@Pc(117) int local117;
			if (local107 != null) {
				for (local117 = 4; local117 >= 0; local117--) {
					if (local107[local117] != null && (Static105.anInt1941 != 0 || !local107[local117].equalsIgnoreCase(Static108.aString77))) {
						@Pc(136) byte local136 = 0;
						if (local117 == 0) {
							local136 = 43;
						}
						@Pc(142) int local142 = Static284.anInt5376;
						if (local117 == 1) {
							local136 = 45;
						}
						if (local117 == 2) {
							local136 = 59;
						}
						if (local117 == 3) {
							local136 = 31;
						}
						if (local117 == 4) {
							local136 = 46;
						}
						if (local12.anInt406 == local117) {
							local142 = local12.anInt405;
						}
						if (local117 == local12.anInt392) {
							local142 = local12.anInt421;
						}
						Static52.method870(0, local107[local117], local136, 0, local142, "<col=ffff00>" + local29, (long) arg0.anInt5127);
					}
				}
			}
			if (Static105.anInt1941 == 0 && local107 != null) {
				for (local117 = 4; local117 >= 0; local117--) {
					if (local107[local117] != null && local107[local117].equalsIgnoreCase(Static108.aString77)) {
						@Pc(226) short local226 = 0;
						if (local12.anInt420 > Static253.aClass44_Sub4_Sub4_Sub1_1.anInt4907) {
							local226 = 2000;
						}
						@Pc(239) short local239 = 0;
						if (local117 == 0) {
							local239 = 43;
						}
						if (local117 == 1) {
							local239 = 45;
						}
						if (local117 == 2) {
							local239 = 59;
						}
						if (local117 == 3) {
							local239 = 31;
						}
						if (local117 == 4) {
							local239 = 46;
						}
						if (local239 != 0) {
							local239 += local226;
						}
						Static52.method870(0, local107[local117], local239, 0, local12.anInt422, "<col=ffff00>" + local29, (long) arg0.anInt5127);
					}
				}
			}
			Static52.method870(0, Static153.aString126, 1008, 0, Static148.anInt2741, "<col=ffff00>" + local29, (long) arg0.anInt5127);
		}
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(III)V")
	public static void method2381(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(21) int local21;
		if (Static299.anInt5659 != arg1) {
			Static18.anIntArray32 = new int[arg1];
			for (local21 = 0; local21 < arg1; local21++) {
				Static18.anIntArray32[local21] = (local21 << 12) / arg1;
			}
			Static299.anInt5659 = arg1;
			Static75.anInt1394 = arg1 * 32;
			Static76.anInt2850 = arg1 - 1;
		}
		if (Static273.anInt6145 == arg0) {
			return;
		}
		if (Static299.anInt5659 == arg0) {
			Static273.anIntArray703 = Static18.anIntArray32;
		} else {
			Static273.anIntArray703 = new int[arg0];
			for (local21 = 0; local21 < arg0; local21++) {
				Static273.anIntArray703[local21] = (local21 << 12) / arg0;
			}
		}
		Static113.anInt2099 = arg0 - 1;
		Static273.anInt6145 = arg0;
	}

	@OriginalMember(owner = "client!hj", name = "c", descriptor = "(B)V")
	public static void method2382() {
		Static232.aClass70_77.method1399();
	}
}
