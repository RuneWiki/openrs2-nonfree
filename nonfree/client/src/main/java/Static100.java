import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static100 {

	@OriginalMember(owner = "client!va", name = "vb", descriptor = "I")
	public static int anInt2717;

	@OriginalMember(owner = "client!va", name = "wb", descriptor = "Lclient!cb;")
	public static Class2_Sub1_Sub3_Sub1 aClass2_Sub1_Sub3_Sub1_20;

	@OriginalMember(owner = "client!va", name = "Hb", descriptor = "Lclient!da;")
	public static Class2_Sub1_Sub3_Sub2 aClass2_Sub1_Sub3_Sub2_7;

	@OriginalMember(owner = "client!va", name = "Kb", descriptor = "I")
	public static int anInt2726;

	@OriginalMember(owner = "client!va", name = "Z", descriptor = "Lclient!lc;")
	public static Class31 aClass31_935 = Static56.method1206("null");

	@OriginalMember(owner = "client!va", name = "ib", descriptor = "Lclient!lc;")
	public static Class31 aClass31_937 = Static56.method1206("sideicons");

	@OriginalMember(owner = "client!va", name = "pb", descriptor = "I")
	public static int anInt2712 = 0;

	@OriginalMember(owner = "client!va", name = "Gb", descriptor = "Lclient!lc;")
	public static Class31 aClass31_938 = Static56.method1206("Continue");

	@OriginalMember(owner = "client!va", name = "Wb", descriptor = "I")
	public static int anInt2732 = 0;

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(B)V")
	public static void method1706() {
		aClass2_Sub1_Sub3_Sub2_7 = null;
		aClass31_938 = null;
		aClass31_935 = null;
		aClass2_Sub1_Sub3_Sub1_20 = null;
		aClass31_937 = null;
	}

	@OriginalMember(owner = "client!va", name = "g", descriptor = "(I)V")
	public static void method1707() {
		if (Static87.aClass1_1 == null) {
			return;
		}
		Static16.method512();
		if (Static57.anInt2684 > 0) {
			Static87.aClass1_1.method1041();
			Static57.anInt2684 = 0;
		}
		Static87.aClass1_1.method1047();
		Static87.aClass1_1 = null;
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(IB)I")
	public static int method1710(@OriginalArg(0) int arg0) {
		return (int) (Math.log((double) arg0 * 0.00390625D) * 868.5889638065036D + 0.5D);
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(IJ)V")
	public static void method1713(@OriginalArg(1) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(8) InterruptedException local8) {
		}
	}

	@OriginalMember(owner = "client!va", name = "b", descriptor = "(B)V")
	public static void method1714() {
		@Pc(12) Class12 local12 = Static13.aClass12_1;
		synchronized (Static13.aClass12_1) {
			Static38.anInt1429 = Static66.anInt2173;
			@Pc(20) int local20;
			if (Static79.anInt2303 < 0) {
				for (local20 = 0; local20 < 112; local20++) {
					Static103.aBooleanArray57[local20] = false;
				}
				Static79.anInt2303 = Static95.anInt2569;
			} else {
				while (Static79.anInt2303 != Static95.anInt2569) {
					local20 = Static28.anIntArray141[Static95.anInt2569];
					Static95.anInt2569 = Static95.anInt2569 + 1 & 0x7F;
					if (local20 >= 0) {
						Static103.aBooleanArray57[local20] = true;
					} else {
						Static103.aBooleanArray57[~local20] = false;
					}
				}
			}
			Static66.anInt2173 = Static77.anInt2275;
		}
	}

	@OriginalMember(owner = "client!va", name = "c", descriptor = "(B)V")
	public static void method1715() {
		if (Static3.aClass6_1 != null) {
			Static3.aClass6_1.method1561();
			Static3.aClass6_1 = null;
		}
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(Ljava/awt/Graphics;Lclient!hc;ILclient!hc;)V")
	public static void method1717(@OriginalArg(0) Graphics arg0, @OriginalArg(1) Class2_Sub1_Sub3_Sub3 arg1, @OriginalArg(3) Class2_Sub1_Sub3_Sub3 arg2) {
		Static19.aClass9_8.method861();
		if (Static103.anInt2775 == 0 || Static103.anInt2775 == 5) {
			arg1.method962(Static47.aClass31_617, 180, 54, 16777215);
			Static81.method1635(28, 62, 304, 34, 9179409);
			Static81.method1635(29, 63, 302, 32, 0);
			Static81.method1646(30, 64, Static18.anInt802 * 3, 30, 9179409);
			Static81.method1646(Static18.anInt802 * 3 + 30, 64, 300 - Static18.anInt802 * 3, 30, 0);
			arg1.method962(Static79.aClass31_798, 180, 85, 16777215);
			Static19.aClass9_8.method863(arg0, 171, 202);
		}
		@Pc(93) byte local93;
		@Pc(107) int local107;
		if (Static103.anInt2775 == 20) {
			Static99.aClass2_Sub1_Sub3_Sub1_19.method291(0, 0);
			local93 = 60;
			if (Static58.aClass31_689.method1223() <= 0) {
				arg1.method964(Static58.aClass31_682, 180, 53, 16776960, true);
				local107 = local93 + 30;
			} else {
				arg1.method964(Static58.aClass31_689, 180, 45, 16776960, true);
				arg1.method964(Static58.aClass31_682, 180, 60, 16776960, true);
				local107 = local93 + 30;
			}
			arg1.method959(Static37.method974(new Class31[] { Static57.aClass31_926, Static58.aClass31_687 }), 90, 90, 16777215, true);
			local107 += 15;
			arg1.method959(Static37.method974(new Class31[] { Static50.aClass31_162, Static58.aClass31_690.method1208() }), 92, 105, 16777215, true);
			local107 += 15;
		}
		if (Static103.anInt2775 == 10) {
			Static99.aClass2_Sub1_Sub3_Sub1_19.method291(0, 0);
			if (Static64.anInt607 == 0) {
				local93 = 80;
				arg1.method964(Static61.aClass31_739, 180, 80, 16776960, true);
				local107 = local93 + 30;
				Static16.aClass2_Sub1_Sub3_Sub1_5.method291(27, 100);
				arg1.method964(Static55.aClass31_661, 100, 125, 16777215, true);
				Static16.aClass2_Sub1_Sub3_Sub1_5.method291(187, 100);
				arg1.method964(Static76.aClass31_787, 260, 125, 16777215, true);
			} else if (Static64.anInt607 == 2) {
				local93 = 60;
				if (Static58.aClass31_689.method1223() <= 0) {
					arg1.method964(Static58.aClass31_682, 180, 53, 16776960, true);
					local107 = local93 + 30;
				} else {
					arg1.method964(Static58.aClass31_689, 180, 45, 16776960, true);
					arg1.method964(Static58.aClass31_682, 180, 60, 16776960, true);
					local107 = local93 + 30;
				}
				arg1.method959(Static37.method974(new Class31[] { Static57.aClass31_926, Static58.aClass31_687, Static88.anInt2361 == 0 & Static49.anInt2694 % 40 < 20 ? Static42.aClass31_570 : Static58.aClass31_688 }), 90, 90, 16777215, true);
				local107 += 15;
				arg1.method959(Static37.method974(new Class31[] { Static50.aClass31_162, Static58.aClass31_690.method1208(), Static88.anInt2361 == 1 & Static49.anInt2694 % 40 < 20 ? Static42.aClass31_570 : Static58.aClass31_688 }), 92, 105, 16777215, true);
				local107 += 15;
				Static16.aClass2_Sub1_Sub3_Sub1_5.method291(27, 130);
				arg1.method964(Static60.aClass31_725, 100, 155, 16777215, true);
				Static16.aClass2_Sub1_Sub3_Sub1_5.method291(187, 130);
				arg1.method964(Static95.aClass31_885, 260, 155, 16777215, true);
			} else if (Static64.anInt607 == 3) {
				local93 = 65;
				arg1.method964(Static75.aClass31_785, 180, 40, 16776960, true);
				arg1.method964(Static57.aClass31_929, 180, 65, 16777215, true);
				local107 = local93 + 15;
				arg1.method964(Static65.aClass31_760, 180, 80, 16777215, true);
				local107 += 15;
				arg1.method964(Static106.aClass31_956, 180, 95, 16777215, true);
				local107 += 15;
				arg1.method964(Static90.aClass31_839, 180, 110, 16777215, true);
				local107 += 15;
				Static16.aClass2_Sub1_Sub3_Sub1_5.method291(107, 130);
				arg1.method964(Static95.aClass31_885, 180, 155, 16777215, true);
			}
		}
		Static19.aClass9_8.method863(arg0, 171, 202);
		Static54.method1165();
		Static9.aClass9_2.method863(arg0, 0, 0);
		Static95.aClass9_26.method863(arg0, 0, 637);
		if (!Static49.aBoolean143) {
			return;
		}
		Static49.aBoolean143 = false;
		Static44.aClass9_13.method863(arg0, 0, 128);
		Static54.aClass9_14.method863(arg0, 371, 202);
		Static105.aClass9_27.method863(arg0, 265, 0);
		Static14.aClass9_7.method863(arg0, 265, 562);
		Static76.aClass9_21.method863(arg0, 171, 128);
		Static65.aClass9_17.method863(arg0, 171, 562);
	}
}
