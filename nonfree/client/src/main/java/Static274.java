import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static274 {

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "I")
	public static int anInt5201 = 0;

	@OriginalMember(owner = "client!kk", name = "c", descriptor = "[I")
	public static final int[] anIntArray449 = new int[1];

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(Lclient!hfa;IZ)V")
	public static void method4403(@OriginalArg(0) Class10_Sub1_Sub2_Sub1 arg0, @OriginalArg(2) boolean arg1) {
		if (Static300.anInt5730 >= 400) {
			return;
		}
		@Pc(12) Class54 local12 = arg0.aClass54_1;
		if (local12.anIntArray150 != null) {
			local12 = local12.method1118(Static511.aClass335_2);
			if (local12 == null) {
				return;
			}
		}
		if (!local12.aBoolean95) {
			return;
		}
		@Pc(30) String local30 = local12.aString15;
		if (local12.anInt1279 != 0) {
			@Pc(49) String local49 = Static27.aClass263_1 == Static538.aClass263_5 ? Static275.aClass198_29.method4407(Static56.anInt953) : Static275.aClass198_27.method4407(Static56.anInt953);
			local30 = local30 + Static498.method7097(local12.anInt1279, Static129.aClass10_Sub1_Sub2_Sub2_1.anInt8575) + " (" + local49 + local12.anInt1279 + ")";
		}
		if (Static524.aBoolean617 && !arg1) {
			@Pc(94) Class59 local94 = Static466.anInt7871 == -1 ? null : Static53.aClass152_1.method3679(Static466.anInt7871);
			if ((Static360.anInt6361 & 0x2) != 0 && (local94 == null || local12.method1114(local94.anInt1575, Static466.anInt7871) != local94.anInt1575)) {
				Static100.method7901(0, false, true, Static238.aString94 + " -> <col=ffff00>" + local30, (long) arg0.anInt8531, 57, 0, -1, Static178.anInt3780, Static404.aString82);
			}
		}
		if (!arg1) {
			@Pc(141) String[] local141 = local12.aStringArray4;
			if (Static314.aBoolean669) {
				local141 = Static159.method3157(local141);
			}
			@Pc(151) int local151;
			if (local141 != null) {
				for (local151 = 4; local151 >= 0; local151--) {
					if (local141[local151] != null && (local12.aByte19 == 0 || !local141[local151].equalsIgnoreCase(Static275.aClass198_22.method4407(Static56.anInt953)))) {
						@Pc(174) byte local174 = 0;
						@Pc(176) int local176 = Static349.anInt6115;
						if (local151 == 0) {
							local174 = 48;
						}
						if (local151 == 1) {
							local174 = 15;
						}
						if (local151 == 2) {
							local174 = 22;
						}
						if (local151 == 3) {
							local174 = 46;
						}
						if (local151 == local12.anInt1271) {
							local176 = local12.anInt1266;
						}
						if (local151 == 4) {
							local174 = 59;
						}
						if (local12.anInt1289 == local151) {
							local176 = local12.anInt1285;
						}
						Static100.method7901(0, false, true, "<col=ffff00>" + local30, (long) arg0.anInt8531, local174, 0, -1, local141[local151].equalsIgnoreCase(Static275.aClass198_22.method4407(Static56.anInt953)) ? local12.anInt1268 : local176, local141[local151]);
					}
				}
			}
			if (local12.aByte19 == 1 && local141 != null) {
				for (local151 = 4; local151 >= 0; local151--) {
					if (local141[local151] != null && local141[local151].equalsIgnoreCase(Static275.aClass198_22.method4407(Static56.anInt953))) {
						@Pc(291) short local291 = 0;
						if (local12.anInt1279 > Static129.aClass10_Sub1_Sub2_Sub2_1.anInt8575) {
							local291 = 2000;
						}
						@Pc(304) short local304 = 0;
						if (local151 == 0) {
							local304 = 48;
						}
						if (local151 == 1) {
							local304 = 15;
						}
						if (local151 == 2) {
							local304 = 22;
						}
						if (local151 == 3) {
							local304 = 46;
						}
						if (local151 == 4) {
							local304 = 59;
						}
						if (local304 != 0) {
							local304 += local291;
						}
						Static100.method7901(0, false, true, "<col=ffff00>" + local30, (long) arg0.anInt8531, local304, 0, -1, local12.anInt1268, local141[local151]);
					}
				}
			}
		}
		Static100.method7901(0, arg1, true, "<col=ffff00>" + local30, (long) arg0.anInt8531, 1003, 0, -1, Static93.anInt2380, Static275.aClass198_21.method4407(Static56.anInt953));
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(BI)V")
	public static void method4405(@OriginalArg(1) int arg0) {
		if (arg0 == Static547.anInt6934) {
			return;
		}
		Static38.anInt740 = Static38.anInt741 = Static464.anIntArray643[arg0];
		Static289.method4565();
		Static246.anIntArrayArray54 = new int[Static38.anInt740][Static38.anInt741];
		Static459.anIntArrayArray67 = new int[Static38.anInt740][Static38.anInt741];
		Static536.anIntArrayArrayArray22 = new int[4][Static38.anInt740 >> 3][Static38.anInt741 >> 3];
		for (@Pc(40) int local40 = 0; local40 < 4; local40++) {
			Static15.aClass84Array1[local40] = Static424.method6074(Static38.anInt740, Static38.anInt741);
		}
		Static567.aByteArrayArrayArray21 = new byte[4][Static38.anInt740][Static38.anInt741];
		Static34.method7576(Static38.anInt741, Static38.anInt740);
		Static584.method7912(Static38.anInt740 >> 3, Static38.anInt741 >> 3, Static185.aClass66_14);
		Static547.anInt6934 = arg0;
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(Lclient!gba;IB)I")
	public static int method4406(@OriginalArg(0) Class115 arg0, @OriginalArg(1) int arg1) {
		if (!Static69.method1233(arg0).method4967(arg1) && arg0.anObjectArray26 == null) {
			return -1;
		} else if (arg0.anIntArray313 == null || arg0.anIntArray313.length <= arg1) {
			return -1;
		} else {
			return arg0.anIntArray313[arg1];
		}
	}
}
