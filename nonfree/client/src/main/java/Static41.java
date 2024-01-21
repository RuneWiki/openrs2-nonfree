import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static41 {

	@OriginalMember(owner = "client!ed", name = "s", descriptor = "[Lclient!rf;")
	public static Class4_Sub1_Sub7_Sub2[] aClass4_Sub1_Sub7_Sub2Array3;

	@OriginalMember(owner = "client!ed", name = "t", descriptor = "J")
	public static long aLong34;

	@OriginalMember(owner = "client!ed", name = "q", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_364 = Static177.method3050("me");

	@OriginalMember(owner = "client!ed", name = "x", descriptor = "I")
	public static int anInt1058 = 1;

	@OriginalMember(owner = "client!ed", name = "A", descriptor = "I")
	public static int anInt1060 = 0;

	@OriginalMember(owner = "client!ed", name = "C", descriptor = "I")
	public static int anInt1061 = 0;

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIII)V")
	public static void method706(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) Class4_Sub7 local7 = Static28.aClass4_Sub7ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		@Pc(13) Class65 local13 = local7.aClass65_1;
		if (local13 != null) {
			local13.anInt2976 = local13.anInt2976 * arg3 / 16;
			local13.anInt2984 = local13.anInt2984 * arg3 / 16;
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIILclient!nh;)[Lclient!sc;")
	public static Class4_Sub1_Sub7_Sub3[] method707(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class62 arg2) {
		return Static141.method2417(arg2, arg1, arg0) ? Static59.method1123() : null;
	}

	@OriginalMember(owner = "client!ed", name = "d", descriptor = "(I)I")
	public static int method709() {
		return 6;
	}

	@OriginalMember(owner = "client!ed", name = "b", descriptor = "(IIII)I")
	public static int method710(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg2 & 0x3;
		if (local3 == 0) {
			return arg1;
		} else if (local3 == 1) {
			return 7 - arg0;
		} else if (local3 == 2) {
			return 7 - arg1;
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!ed", name = "e", descriptor = "(B)V")
	public static void method711() {
		@Pc(5) int local5 = Static4.aClass4_Sub1_Sub7_Sub1_Sub1_5.method903(Static61.aClass46_595);
		@Pc(15) int local15;
		for (@Pc(7) int local7 = 0; local7 < Static3.anInt86; local7++) {
			local15 = Static4.aClass4_Sub1_Sub7_Sub1_Sub1_5.method903(Static180.method3091(local7));
			if (local5 < local15) {
				local5 = local15;
			}
		}
		local5 += 8;
		Static163.anInt3720 = Static3.anInt86 * 15 + 22;
		Static64.aBoolean76 = true;
		local15 = Static3.anInt86 * 15 + 21;
		Static185.anInt4084 = local5;
		@Pc(55) int local55 = Static73.anInt1877;
		@Pc(61) int local61 = Static28.anInt747 - local5 / 2;
		if (local55 + local15 > 503) {
			local55 = 503 - local15;
		}
		if (local61 + local5 > 765) {
			local61 = 765 - local5;
		}
		if (local61 < 0) {
			local61 = 0;
		}
		if (local55 < 0) {
			local55 = 0;
		}
		Static9.anInt327 = local61;
		Static148.anInt3380 = local55;
	}

	@OriginalMember(owner = "client!ed", name = "e", descriptor = "(I)V")
	public static void method712() {
		Static90.aClass4_Sub11_Sub1_1.method1285(156);
		for (@Pc(18) Class4_Sub14 local18 = (Class4_Sub14) Static106.aClass20_5.method504(); local18 != null; local18 = (Class4_Sub14) Static106.aClass20_5.method498()) {
			if (local18.anInt2444 == 0) {
				Static91.method1801(local18, true);
			}
		}
		if (Static84.aClass1_54 != null) {
			Static3.method21(Static84.aClass1_54);
			Static84.aClass1_54 = null;
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lclient!h;IIIIIII)V")
	public static void method713(@OriginalArg(0) Class4_Sub11 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(29) int local29;
		if (arg6 < 0 || arg6 >= 104 || arg5 < 0 || arg5 >= 104) {
			while (true) {
				local29 = arg0.method1253();
				if (local29 == 0) {
					break;
				}
				if (local29 == 1) {
					arg0.method1253();
					break;
				}
				if (local29 <= 49) {
					arg0.method1253();
				}
			}
			return;
		}
		Static53.aByteArrayArrayArray2[arg3][arg6][arg5] = 0;
		while (true) {
			local29 = arg0.method1253();
			if (local29 == 0) {
				if (arg3 == 0) {
					Static112.anIntArrayArrayArray42[0][arg6][arg5] = -Static129.method2281(arg6 + arg4 + 932731, arg5 + 556238 + arg1) * 8;
				} else {
					Static112.anIntArrayArrayArray42[arg3][arg6][arg5] = Static112.anIntArrayArrayArray42[arg3 - 1][arg6][arg5] - 240;
				}
				break;
			}
			if (local29 == 1) {
				@Pc(126) int local126 = arg0.method1253();
				if (local126 == 1) {
					local126 = 0;
				}
				if (arg3 == 0) {
					Static112.anIntArrayArrayArray42[0][arg6][arg5] = -local126 * 8;
				} else {
					Static112.anIntArrayArrayArray42[arg3][arg6][arg5] = Static112.anIntArrayArrayArray42[arg3 - 1][arg6][arg5] - local126 * 8;
				}
				break;
			}
			if (local29 <= 49) {
				Static125.aByteArrayArrayArray5[arg3][arg6][arg5] = arg0.method1241();
				Static63.aByteArrayArrayArray4[arg3][arg6][arg5] = (byte) ((local29 - 2) / 4);
				Static166.aByteArrayArrayArray8[arg3][arg6][arg5] = (byte) (local29 + arg2 - 2 & 0x3);
			} else if (local29 <= 81) {
				Static53.aByteArrayArrayArray2[arg3][arg6][arg5] = (byte) (local29 - 49);
			} else {
				Static130.aByteArrayArrayArray6[arg3][arg6][arg5] = (byte) (local29 - 81);
			}
		}
	}
}
