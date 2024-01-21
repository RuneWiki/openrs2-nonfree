import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static130 {

	@OriginalMember(owner = "client!wb", name = "S", descriptor = "I")
	public static int anInt2777;

	@OriginalMember(owner = "client!wb", name = "U", descriptor = "Lclient!dc;")
	public static Class17_Sub1 aClass17_Sub1_20;

	@OriginalMember(owner = "client!wb", name = "B", descriptor = "Lclient!v;")
	public static Class76 aClass76_1304 = Static134.method2017("gr-Un:");

	@OriginalMember(owner = "client!wb", name = "G", descriptor = "I")
	public static int anInt2771 = 0;

	@OriginalMember(owner = "client!wb", name = "J", descriptor = "Lclient!v;")
	public static Class76 aClass76_1305 = Static134.method2017("titlebox");

	@OriginalMember(owner = "client!wb", name = "Q", descriptor = "Lclient!v;")
	private static Class76 aClass76_1309 = Static134.method2017("Examine");

	@OriginalMember(owner = "client!wb", name = "K", descriptor = "Lclient!v;")
	public static Class76 aClass76_1306 = aClass76_1309;

	@OriginalMember(owner = "client!wb", name = "L", descriptor = "Lclient!v;")
	private static Class76 aClass76_1307 = Static134.method2017("Location");

	@OriginalMember(owner = "client!wb", name = "N", descriptor = "Lclient!v;")
	public static Class76 aClass76_1308 = aClass76_1307;

	@OriginalMember(owner = "client!wb", name = "T", descriptor = "Lclient!v;")
	private static Class76 aClass76_1311 = Static134.method2017("and choose the (Wcreate account(W");

	@OriginalMember(owner = "client!wb", name = "R", descriptor = "Lclient!v;")
	public static Class76 aClass76_1310 = aClass76_1311;

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lclient!ne;IIIIIII)V")
	public static void method1945(@OriginalArg(0) Class4_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		@Pc(43) int local43;
		if (arg6 < 0 || arg6 >= 104 || arg3 < 0 || arg3 >= 104) {
			while (true) {
				local43 = arg0.method599();
				if (local43 == 0) {
					return;
				}
				if (local43 == 1) {
					arg0.method599();
					return;
				}
				if (local43 <= 49) {
					arg0.method599();
				}
			}
			return;
		}
		Static62.aByteArrayArrayArray4[arg4][arg6][arg3] = 0;
		while (true) {
			local43 = arg0.method599();
			if (local43 == 0) {
				if (arg4 == 0) {
					Static66.anIntArrayArrayArray3[0][arg6][arg3] = -Static26.method372(arg1 + arg3 + 556238, arg5 + (932731 - -arg6)) * 8;
					return;
				} else {
					Static66.anIntArrayArrayArray3[arg4][arg6][arg3] = Static66.anIntArrayArrayArray3[arg4 - 1][arg6][arg3] - 240;
					return;
				}
			}
			if (local43 == 1) {
				@Pc(103) int local103 = arg0.method599();
				if (local103 == 1) {
					local103 = 0;
				}
				if (arg4 != 0) {
					Static66.anIntArrayArrayArray3[arg4][arg6][arg3] = Static66.anIntArrayArrayArray3[arg4 - 1][arg6][arg3] - local103 * 8;
					return;
				}
				Static66.anIntArrayArrayArray3[0][arg6][arg3] = -local103 * 8;
				return;
			}
			if (local43 <= 49) {
				Static31.aByteArrayArrayArray3[arg4][arg6][arg3] = arg0.method579();
				Static129.aByteArrayArrayArray7[arg4][arg6][arg3] = (byte) ((local43 - 2) / 4);
				Static24.aByteArrayArrayArray1[arg4][arg6][arg3] = (byte) (arg2 + local43 - 2 & 0x3);
			} else if (local43 <= 81) {
				Static62.aByteArrayArrayArray4[arg4][arg6][arg3] = (byte) (local43 - 49);
			} else {
				Static31.aByteArrayArrayArray2[arg4][arg6][arg3] = (byte) (local43 - 81);
			}
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lclient!mb;BLclient!mb;)V")
	public static void method1946(@OriginalArg(0) Class4_Sub4_Sub5_Sub3_Sub1 arg0, @OriginalArg(2) Class4_Sub4_Sub5_Sub3_Sub1 arg1) {
		if (Static103.aBoolean137) {
			Static28.method376(arg0, arg1);
			return;
		}
		if (Static39.anInt1113 == 0 || Static39.anInt1113 == 5) {
			arg0.method1311(Static55.aClass76_618, 382, 225, 16777215, -1);
			Static46.method1832(230, 233, 304, 34, 9179409);
			Static46.method1832(231, 234, 302, 32, 0);
			Static46.method1823(232, 235, Static88.anInt2089 * 3, 30, 9179409);
			Static46.method1823(Static88.anInt2089 * 3 + 232, 235, 300 - Static88.anInt2089 * 3, 30, 0);
			arg0.method1311(Static111.aClass76_1155, 382, 256, 16777215, -1);
		}
		@Pc(105) short local105;
		@Pc(113) int local113;
		if (Static39.anInt1113 == 20) {
			Static120.aClass4_Sub4_Sub5_Sub4_6.method1836(382 - Static120.aClass4_Sub4_Sub5_Sub4_6.anInt2607 / 2, 271 - Static120.aClass4_Sub4_Sub5_Sub4_6.anInt2612 / 2);
			local105 = 211;
			arg0.method1311(Static111.aClass76_1154, 382, 211, 16776960, 0);
			local113 = local105 + 15;
			arg0.method1311(Static111.aClass76_1151, 382, 226, 16776960, 0);
			@Pc(121) int local121 = local113 + 15;
			arg0.method1311(Static111.aClass76_1156, 382, 241, 16776960, 0);
			@Pc(129) int local129 = local121 + 15;
			@Pc(130) int local130 = local129 + 10;
			arg0.method1334(Static59.method1017(new Class76[] { Static105.aClass76_1102, Static83.method1328(Static111.aClass76_1146) }), 272, 266, 16777215, 0);
			@Pc(150) int local150 = local130 + 15;
			arg0.method1334(Static59.method1017(new Class76[] { Static79.aClass76_367, Static111.aClass76_1145.method1873() }), 274, 281, 16777215, 0);
			@Pc(171) int local171 = local150 + 15;
		}
		if (Static39.anInt1113 == 10) {
			Static120.aClass4_Sub4_Sub5_Sub4_6.method1836(202, 171);
			if (Static60.anInt1571 == 0) {
				local105 = 251;
				arg0.method1311(Static40.aClass76_482, 382, 251, 16776960, 0);
				Static42.aClass4_Sub4_Sub5_Sub4_4.method1836(229, 271);
				arg0.method1327(Static54.aClass76_1197, 229, 271, 144, 40, 16777215, 0, 1, 1, 0);
				local113 = local105 + 30;
				Static42.aClass4_Sub4_Sub5_Sub4_4.method1836(389, 271);
				arg0.method1327(Static1.aClass76_2, 389, 271, 144, 40, 16777215, 0, 1, 1, 0);
			} else if (Static60.anInt1571 == 2) {
				local105 = 211;
				arg0.method1311(Static111.aClass76_1154, 382, 211, 16776960, 0);
				local113 = local105 + 15;
				arg0.method1311(Static111.aClass76_1151, 382, 226, 16776960, 0);
				local113 += 15;
				arg0.method1311(Static111.aClass76_1156, 382, 241, 16776960, 0);
				local113 += 15;
				local113 += 10;
				arg0.method1334(Static59.method1017(new Class76[] { Static105.aClass76_1102, Static83.method1328(Static111.aClass76_1146), Static1.anInt4 == 0 & Static78.anInt1981 % 40 < 20 ? Static94.aClass76_980 : Static111.aClass76_1153 }), 272, 266, 16777215, 0);
				local113 += 15;
				arg0.method1334(Static59.method1017(new Class76[] { Static79.aClass76_367, Static111.aClass76_1145.method1873(), Static78.anInt1981 % 40 < 20 & Static1.anInt4 == 1 ? Static94.aClass76_980 : Static111.aClass76_1153 }), 274, 281, 16777215, 0);
				Static42.aClass4_Sub4_Sub5_Sub4_4.method1836(229, 301);
				local113 += 15;
				arg0.method1311(Static75.aClass76_829, 302, 326, 16777215, 0);
				Static42.aClass4_Sub4_Sub5_Sub4_4.method1836(389, 301);
				arg0.method1311(Static117.aClass76_1204, 462, 326, 16777215, 0);
			} else if (Static60.anInt1571 == 3) {
				arg0.method1311(Static123.aClass76_1259, 382, 211, 16776960, 0);
				local105 = 236;
				arg0.method1311(Static90.aClass76_944, 382, 236, 16777215, 0);
				local113 = local105 + 15;
				arg0.method1311(Static50.aClass76_569, 382, 251, 16777215, 0);
				local113 += 15;
				arg0.method1311(aClass76_1310, 382, 266, 16777215, 0);
				local113 += 15;
				arg0.method1311(Static102.aClass76_1073, 382, 281, 16777215, 0);
				Static42.aClass4_Sub4_Sub5_Sub4_4.method1836(309, 301);
				arg0.method1311(Static117.aClass76_1204, 382, 326, 16777215, 0);
				local113 += 15;
			}
		}
		if (Static38.anInt1092 != 1) {
			if (Static63.anInt1643 > 0) {
				Static121.method1840(Static63.anInt1643);
				Static63.anInt1643 = 0;
			}
			Static6.method82();
		}
		Static66.aClass4_Sub4_Sub5_Sub4Array6[Static85.aBoolean124 ? 1 : 0].method1836(725, 463);
		if (Static39.anInt1113 > 5 && Static132.anInt2821 != 2 && Static55.anInt1445 == 0) {
			if (Static36.aClass4_Sub4_Sub5_Sub4_3 == null) {
				Static36.aClass4_Sub4_Sub5_Sub4_3 = Static24.method353(Static111.aClass76_1153, Static40.aClass76_486, Static3.aClass17_Sub1_17);
			} else {
				Static36.aClass4_Sub4_Sub5_Sub4_3.method1836(5, 463);
				arg0.method1311(Static59.method1017(new Class76[] { Static124.aClass76_1265, Static23.aClass76_204, Static63.method1092(Static28.anInt591) }), 55, 478, 16777215, 0);
				if (Static79.aClass22_2 == null) {
					arg1.method1311(Static125.aClass76_1284, 55, 492, 16777215, 0);
				} else {
					arg1.method1311(Static21.aClass76_199, 55, 492, 16777215, 0);
				}
			}
		}
		try {
			@Pc(627) Graphics local627 = Static1.aCanvas1.getGraphics();
			Static118.aClass43_1.method1908(local627);
		} catch (@Pc(635) Exception local635) {
			Static1.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(III)V")
	public static void method1947(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) long local15 = (long) (arg0 + (arg1 << 16));
		@Pc(21) Class4_Sub4_Sub16 local21 = (Class4_Sub4_Sub16) Static35.aClass28_2.method770(local15);
		if (local21 != null) {
			Static31.aClass83_1.method2020(local21);
		}
	}

	@OriginalMember(owner = "client!wb", name = "e", descriptor = "(I)V")
	public static void method1949() {
		aClass76_1306 = null;
		aClass76_1308 = null;
		aClass76_1307 = null;
		aClass76_1305 = null;
		aClass17_Sub1_20 = null;
		aClass76_1311 = null;
		aClass76_1309 = null;
		aClass76_1310 = null;
		aClass76_1304 = null;
	}
}
