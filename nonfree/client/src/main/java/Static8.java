import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static8 {

	@OriginalMember(owner = "client!bb", name = "D", descriptor = "I")
	public static int anInt214;

	@OriginalMember(owner = "client!bb", name = "f", descriptor = "Lclient!gd;")
	public static Class22 aClass22_1 = new Class22(64);

	@OriginalMember(owner = "client!bb", name = "l", descriptor = "Lclient!kc;")
	public static Class36 aClass36_114 = Static14.method2017("Konfig geladen)3");

	@OriginalMember(owner = "client!bb", name = "m", descriptor = "Lclient!kc;")
	public static Class36 aClass36_115 = Static14.method2017("Side panel redrawn");

	@OriginalMember(owner = "client!bb", name = "x", descriptor = "Lclient!kc;")
	public static Class36 aClass36_116 = Static14.method2017(":tradereq:");

	@OriginalMember(owner = "client!bb", name = "y", descriptor = "Lclient!kc;")
	private static Class36 aClass36_117 = Static14.method2017("To play on this world move to a free area first");

	@OriginalMember(owner = "client!bb", name = "z", descriptor = "Lclient!kc;")
	public static Class36 aClass36_118 = Static14.method2017(" )2> @lre@");

	@OriginalMember(owner = "client!bb", name = "A", descriptor = "Lclient!kc;")
	public static Class36 aClass36_119 = Static14.method2017(" weitere Optionen");

	@OriginalMember(owner = "client!bb", name = "B", descriptor = "Lclient!kc;")
	public static Class36 aClass36_120 = aClass36_117;

	@OriginalMember(owner = "client!bb", name = "C", descriptor = "[Lclient!kc;")
	public static Class36[] aClass36Array5 = new Class36[100];

	@OriginalMember(owner = "client!bb", name = "E", descriptor = "Lclient!kc;")
	public static Class36 aClass36_121 = Static14.method2017("Wen m-Ochten Sie hinzuf-Ugen?");

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(IBII)I")
	public static int method174(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 > 179) {
			arg2 /= 2;
		}
		if (arg0 > 192) {
			arg2 /= 2;
		}
		if (arg0 > 217) {
			arg2 /= 2;
		}
		if (arg0 > 243) {
			arg2 /= 2;
		}
		return arg0 / 2 + (arg1 / 4 << 10) + (arg2 / 32 << 7);
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(ILclient!ac;)I")
	public static int method177(@OriginalArg(1) Class3 arg0) {
		@Pc(5) int local5 = 0;
		if (arg0.method926(Static58.aClass36_740, Static20.aClass36_259)) {
			local5++;
		}
		if (arg0.method926(Static107.aClass36_1353, Static20.aClass36_259)) {
			local5++;
		}
		if (arg0.method926(Static113.aClass36_1447, Static20.aClass36_259)) {
			local5++;
		}
		if (arg0.method926(Static62.aClass36_781, Static20.aClass36_259)) {
			local5++;
		}
		if (arg0.method926(Static115.aClass36_881, Static20.aClass36_259)) {
			local5++;
		}
		if (arg0.method926(Static107.aClass36_1354, Static20.aClass36_259)) {
			local5++;
		}
		if (arg0.method926(Static67.aClass36_827, Static20.aClass36_259)) {
			local5++;
		}
		if (arg0.method926(Static89.aClass36_1080, Static20.aClass36_259)) {
			local5++;
		}
		if (arg0.method926(Static10.aClass36_147, Static20.aClass36_259)) {
			local5++;
		}
		if (arg0.method926(Static81.aClass36_977, Static20.aClass36_259)) {
			local5++;
		}
		if (arg0.method926(Static55.aClass36_1326, Static20.aClass36_259)) {
			local5++;
		}
		if (arg0.method926(Static60.aClass36_769, Static20.aClass36_259)) {
			local5++;
		}
		if (arg0.method926(Static73.aClass36_893, Static20.aClass36_259)) {
			local5++;
		}
		if (arg0.method926(Static110.aClass36_1405, Static20.aClass36_259)) {
			local5++;
		}
		if (arg0.method926(Static6.aClass36_86, Static20.aClass36_259)) {
			local5++;
		}
		if (arg0.method926(Static91.aClass36_1129, Static20.aClass36_259)) {
			local5++;
		}
		if (arg0.method926(Static64.aClass36_800, Static20.aClass36_259)) {
			local5++;
		}
		if (arg0.method926(Static80.aClass36_970, Static20.aClass36_259)) {
			local5++;
		}
		if (arg0.method926(Static103.aClass36_1310, Static20.aClass36_259)) {
			local5++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(Z)V")
	public static void method180() {
		for (@Pc(10) Class2_Sub9 local10 = (Class2_Sub9) Static20.aClass8_1.method175(); local10 != null; local10 = (Class2_Sub9) Static20.aClass8_1.method173()) {
			if (local10.aClass2_Sub1_Sub13_1 != null) {
				local10.method836();
			}
		}
	}

	@OriginalMember(owner = "client!bb", name = "e", descriptor = "(I)V")
	public static void method181() {
		Static19.aClass14_38.method1472();
		Static62.anIntArray199 = Static87.method1600(Static62.anIntArray199);
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(BI)V")
	public static void method182(@OriginalArg(1) int arg0) {
		if (Static41.aClass29_1 == null) {
			return;
		}
		if (Static38.anInt969 != 0) {
			if (Static17.aByteArray4 == null) {
				return;
			}
			Static88.anInt2316 = arg0;
		} else if (Static79.anInt2048 >= 0) {
			Static79.anInt2048 = arg0;
			Static41.aClass29_1.method1930(0, arg0);
			return;
		}
	}

	@OriginalMember(owner = "client!bb", name = "f", descriptor = "(I)V")
	public static void method183() {
		aClass36_120 = null;
		aClass36Array5 = null;
		aClass36_121 = null;
		aClass36_118 = null;
		aClass36_114 = null;
		aClass36_117 = null;
		aClass36_115 = null;
		aClass36_116 = null;
		aClass22_1 = null;
		aClass36_119 = null;
	}

	@OriginalMember(owner = "client!bb", name = "g", descriptor = "(I)V")
	public static void method184() {
		@Pc(9) int local9 = Static68.anInt1709 * 128 + 64;
		@Pc(15) int local15 = Static29.anInt823 * 128 + 64;
		@Pc(23) int local23 = Static56.method1044(local15, local9, Static92.anInt2412) - Static25.anInt634;
		if (Static105.anInt2735 < local9) {
			Static105.anInt2735 += Static105.anInt2734 * (local9 - Static105.anInt2735) / 1000 + Static65.anInt1679;
			if (local9 < Static105.anInt2735) {
				Static105.anInt2735 = local9;
			}
		}
		if (local15 > Static59.anInt1588) {
			Static59.anInt1588 += Static65.anInt1679 + Static105.anInt2734 * (local15 - Static59.anInt1588) / 1000;
			if (local15 < Static59.anInt1588) {
				Static59.anInt1588 = local15;
			}
		}
		if (Static105.anInt2735 > local9) {
			Static105.anInt2735 -= Static65.anInt1679 + (Static105.anInt2735 - local9) * Static105.anInt2734 / 1000;
			if (Static105.anInt2735 < local9) {
				Static105.anInt2735 = local9;
			}
		}
		if (Static111.anInt2875 < local23) {
			Static111.anInt2875 += Static65.anInt1679 + Static105.anInt2734 * (local23 - Static111.anInt2875) / 1000;
			if (local23 < Static111.anInt2875) {
				Static111.anInt2875 = local23;
			}
		}
		local9 = Static110.anInt2857 * 128 + 64;
		if (Static59.anInt1588 > local15) {
			Static59.anInt1588 -= Static65.anInt1679 + Static105.anInt2734 * (Static59.anInt1588 - local15) / 1000;
			if (local15 > Static59.anInt1588) {
				Static59.anInt1588 = local15;
			}
		}
		local15 = Static80.anInt2059 * 128 + 64;
		if (local23 < Static111.anInt2875) {
			Static111.anInt2875 -= Static105.anInt2734 * (Static111.anInt2875 - local23) / 1000 + Static65.anInt1679;
			if (local23 > Static111.anInt2875) {
				Static111.anInt2875 = local23;
			}
		}
		local23 = Static56.method1044(local15, local9, Static92.anInt2412) - Static52.anInt1434;
		@Pc(195) int local195 = local23 - Static111.anInt2875;
		@Pc(199) int local199 = local9 - Static105.anInt2735;
		@Pc(203) int local203 = local15 - Static59.anInt1588;
		@Pc(214) int local214 = (int) Math.sqrt((double) (local203 * local203 + local199 * local199));
		@Pc(225) int local225 = (int) (Math.atan2((double) local195, (double) local214) * 325.949D) & 0x7FF;
		if (local225 < 128) {
			local225 = 128;
		}
		if (local225 > 383) {
			local225 = 383;
		}
		@Pc(250) int local250 = (int) (-325.949D * Math.atan2((double) local199, (double) local203)) & 0x7FF;
		if (Static96.anInt2559 < local225) {
			Static96.anInt2559 += Static26.anInt723 * (local225 - Static96.anInt2559) / 1000 + Static9.anInt238;
			if (local225 < Static96.anInt2559) {
				Static96.anInt2559 = local225;
			}
		}
		@Pc(276) int local276 = local250 - Static51.anInt2603;
		if (local276 > 1024) {
			local276 -= 2048;
		}
		if (local276 < -1024) {
			local276 += 2048;
		}
		if (Static96.anInt2559 > local225) {
			Static96.anInt2559 -= Static9.anInt238 + (Static96.anInt2559 - local225) * Static26.anInt723 / 1000;
			if (Static96.anInt2559 < local225) {
				Static96.anInt2559 = local225;
			}
		}
		if (local276 > 0) {
			Static51.anInt2603 += Static9.anInt238 + local276 * Static26.anInt723 / 1000;
			Static51.anInt2603 &= 0x7FF;
		}
		if (local276 < 0) {
			Static51.anInt2603 -= Static26.anInt723 * -local276 / 1000 + Static9.anInt238;
			Static51.anInt2603 &= 0x7FF;
		}
		@Pc(354) int local354 = local250 - Static51.anInt2603;
		if (local354 > 1024) {
			local354 -= 2048;
		}
		if (local354 < -1024) {
			local354 += 2048;
		}
		if (local354 < 0 && local276 > 0 || local354 > 0 && local276 < 0) {
			Static51.anInt2603 = local250;
		}
	}
}
