import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static29 {

	@OriginalMember(owner = "client!de", name = "o", descriptor = "Lclient!c;")
	public static Class10 aClass10_28;

	@OriginalMember(owner = "client!de", name = "h", descriptor = "Lclient!dd;")
	public static Class17 aClass17_3 = new Class17(50);

	@OriginalMember(owner = "client!de", name = "m", descriptor = "Lclient!ai;")
	public static Class6 aClass6_204 = Static38.method685(" Sekunde(Xn(Y -Ubertragen)3");

	@OriginalMember(owner = "client!de", name = "n", descriptor = "I")
	public static final int anInt745 = 20;

	@OriginalMember(owner = "client!de", name = "p", descriptor = "Z")
	public static boolean aBoolean31 = false;

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(II)Lclient!ai;")
	public static Class6 method517(@OriginalArg(0) int arg0) {
		return Static134.aClass6Array17[arg0].method107() <= 0 ? Static103.aClass6Array13[arg0] : Static58.method956(new Class6[] { Static103.aClass6Array13[arg0], Static52.aClass6_404, Static134.aClass6Array17[arg0] });
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(ILclient!ic;IZZI)V")
	public static void method518(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub3_Sub8 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) int arg4) {
		if (Static122.anInt2842 >= 50 || (arg1.anIntArray112 == null || arg1.anIntArray112.length <= arg0)) {
			return;
		}
		@Pc(27) int local27 = arg1.anIntArray112[arg0];
		if (local27 == 0) {
			return;
		}
		@Pc(37) int local37 = local27 >> 8;
		@Pc(43) int local43 = local27 >> 4 & 0x7;
		@Pc(47) int local47 = local27 & 0xF;
		if (local47 == 0) {
			if (arg3) {
				Static117.method1874(0, local43, local37);
			}
		} else if (Static107.anInt2566 != 0) {
			@Pc(69) int local69 = (arg2 - 64) / 128;
			@Pc(75) int local75 = (arg4 - 64) / 128;
			Static162.anIntArray377[Static122.anInt2842] = local37;
			Static158.anIntArray360[Static122.anInt2842] = local43;
			Static143.anIntArray297[Static122.anInt2842] = 0;
			Static126.aClass86Array1[Static122.anInt2842] = null;
			Static152.anIntArray350[Static122.anInt2842] = local47 + (local69 << 8) + (local75 << 16);
			Static122.anInt2842++;
		}
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(I)V")
	public static void method519() {
		aClass17_3 = null;
		aClass10_28 = null;
		aClass6_204 = null;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(III)I")
	public static int method520(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class2_Sub17 local8 = (Class2_Sub17) Static89.aClass16_7.method479((long) arg0);
		if (local8 == null) {
			return 0;
		} else if (arg1 == -1) {
			return 0;
		} else {
			@Pc(30) int local30 = 0;
			for (@Pc(32) int local32 = 0; local32 < local8.anIntArray239.length; local32++) {
				if (local8.anIntArray240[local32] == arg1) {
					local30 += local8.anIntArray239[local32];
				}
			}
			return local30;
		}
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(IIIIIIII)V")
	public static void method521(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg2 < 1 || arg6 < 1 || arg2 > 102 || arg6 > 102) {
			return;
		}
		if (Static113.aBoolean112 && arg3 != Static36.anInt1020) {
			return;
		}
		@Pc(41) int local41 = 0;
		if (arg5 == 0) {
			local41 = Static30.aClass44_1.method1247(arg3, arg2, arg6);
		}
		if (arg5 == 1) {
			local41 = Static30.aClass44_1.method1282(arg3, arg2, arg6);
		}
		if (arg5 == 2) {
			local41 = Static30.aClass44_1.method1255(arg3, arg2, arg6);
		}
		if (arg5 == 3) {
			local41 = Static30.aClass44_1.method1264(arg3, arg2, arg6);
		}
		@Pc(105) int local105;
		if (local41 != 0) {
			@Pc(98) int local98 = local41 >> 14 & 0x7FFF;
			local105 = Static30.aClass44_1.method1272(arg3, arg2, arg6, local41);
			@Pc(109) int local109 = local105 & 0x1F;
			@Pc(115) int local115 = local105 >> 6 & 0x3;
			@Pc(126) Class2_Sub3_Sub6 local126;
			if (arg5 == 0) {
				Static30.aClass44_1.method1265(arg3, arg2, arg6);
				local126 = Static163.method2609(local98);
				if (local126.anInt1192 != 0) {
					Static51.aClass48Array1[arg3].method1475(local115, local126.aBoolean48, arg6, local109, arg2);
				}
			}
			if (arg5 == 1) {
				Static30.aClass44_1.method1285(arg3, arg2, arg6);
			}
			if (arg5 == 2) {
				Static30.aClass44_1.method1280(arg3, arg2, arg6);
				local126 = Static163.method2609(local98);
				if (local126.anInt1205 + arg2 > 103 || local126.anInt1205 + arg6 > 103 || local126.anInt1195 + arg2 > 103 || arg6 + local126.anInt1195 > 103) {
					return;
				}
				if (local126.anInt1192 != 0) {
					Static51.aClass48Array1[arg3].method1477(local126.anInt1195, arg2, local126.anInt1205, local115, arg6, local126.aBoolean48);
				}
			}
			if (arg5 == 3) {
				Static30.aClass44_1.method1243(arg3, arg2, arg6);
				local126 = Static163.method2609(local98);
				if (local126.anInt1192 == 1) {
					Static51.aClass48Array1[arg3].method1479(arg2, arg6);
				}
			}
		}
		if (arg0 < 0) {
			return;
		}
		local105 = arg3;
		if (arg3 < 3 && (Static164.aByteArrayArrayArray7[1][arg2][arg6] & 0x2) == 2) {
			local105 = arg3 + 1;
		}
		Static144.method2226(arg1, local105, arg6, arg4, arg2, Static30.aClass44_1, arg3, arg0, Static51.aClass48Array1[arg3]);
		return;
	}
}
