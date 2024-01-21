import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static53 {

	@OriginalMember(owner = "client!jd", name = "l", descriptor = "I")
	public static int anInt1737;

	@OriginalMember(owner = "client!jd", name = "v", descriptor = "I")
	public static int anInt1745;

	@OriginalMember(owner = "client!jd", name = "y", descriptor = "I")
	public static int anInt1747;

	@OriginalMember(owner = "client!jd", name = "z", descriptor = "Lclient!af;")
	public static Class7 aClass7_3;

	@OriginalMember(owner = "client!jd", name = "g", descriptor = "Lclient!ad;")
	public static Class5 aClass5_14 = new Class5();

	@OriginalMember(owner = "client!jd", name = "n", descriptor = "I")
	public static int anInt1739 = 0;

	@OriginalMember(owner = "client!jd", name = "o", descriptor = "Lclient!qf;")
	public static Class60 aClass60_768 = Static59.method1195("Sprites geladen)3");

	@OriginalMember(owner = "client!jd", name = "r", descriptor = "I")
	public static int anInt1742 = 0;

	@OriginalMember(owner = "client!jd", name = "s", descriptor = "I")
	public static int anInt1743 = 0;

	@OriginalMember(owner = "client!jd", name = "t", descriptor = "I")
	public static int anInt1744 = 0;

	@OriginalMember(owner = "client!jd", name = "u", descriptor = "Lclient!qf;")
	public static Class60 aClass60_769 = Static59.method1195("Fps:");

	@OriginalMember(owner = "client!jd", name = "w", descriptor = "Lclient!qf;")
	private static Class60 aClass60_770 = Static59.method1195(" from your friend list first");

	@OriginalMember(owner = "client!jd", name = "x", descriptor = "I")
	public static int anInt1746 = 0;

	@OriginalMember(owner = "client!jd", name = "A", descriptor = "Lclient!qf;")
	public static Class60 aClass60_771 = aClass60_770;

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(I)V")
	public static void method1131() {
		Static27.aClass16_24.method1668();
		Static7.method274();
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(III)I")
	public static int method1132(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = 0;
		while (arg0 > 0) {
			local12 = local12 << 1 | arg1 & 0x1;
			arg1 >>>= 0x1;
			arg0--;
		}
		return local12;
	}

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "(I)V")
	public static void method1133() {
		aClass7_3 = null;
		aClass60_769 = null;
		aClass60_770 = null;
		aClass60_768 = null;
		aClass60_771 = null;
		aClass5_14 = null;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(Z)V")
	public static void method1134() {
		try {
			@Pc(6) Graphics local6 = Static2.aCanvas1.getGraphics();
			Static113.aClass16_72.method1664(553, 205, local6);
		} catch (@Pc(19) Exception local19) {
			Static2.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(Lclient!md;I)V")
	public static void method1135(@OriginalArg(0) Class3_Sub1_Sub1_Sub3 arg0) {
		arg0.anInt1486 = arg0.anInt1539;
		if (arg0.anInt1497 == 0) {
			arg0.anInt1498 = 0;
			return;
		}
		if (arg0.anInt1538 != -1 && arg0.anInt1521 == 0) {
			@Pc(32) Class3_Sub1_Sub14 local32 = Static109.method2054(arg0.anInt1538);
			if (arg0.anInt1491 > 0 && local32.anInt2476 == 0) {
				arg0.anInt1498++;
				return;
			}
			if (arg0.anInt1491 <= 0 && local32.anInt2466 == 0) {
				arg0.anInt1498++;
				return;
			}
		}
		@Pc(67) int local67 = arg0.anInt1524;
		@Pc(70) int local70 = arg0.anInt1494;
		@Pc(85) int local85 = arg0.anInt1532 * 64 + arg0.anIntArray184[arg0.anInt1497 - 1] * 128;
		@Pc(100) int local100 = arg0.anIntArray181[arg0.anInt1497 - 1] * 128 + arg0.anInt1532 * 64;
		if (local85 - local67 > 256 || local85 - local67 < -256 || local100 - local70 > 256 || local100 - local70 < -256) {
			arg0.anInt1494 = local100;
			arg0.anInt1524 = local85;
			return;
		}
		if (local67 < local85) {
			if (local100 > local70) {
				arg0.anInt1501 = 1280;
			} else if (local100 < local70) {
				arg0.anInt1501 = 1792;
			} else {
				arg0.anInt1501 = 1536;
			}
		} else if (local67 <= local85) {
			if (local70 < local100) {
				arg0.anInt1501 = 1024;
			} else if (local100 < local70) {
				arg0.anInt1501 = 0;
			}
		} else if (local70 < local100) {
			arg0.anInt1501 = 768;
		} else if (local70 > local100) {
			arg0.anInt1501 = 256;
		} else {
			arg0.anInt1501 = 512;
		}
		@Pc(223) int local223 = arg0.anInt1501 - arg0.anInt1525 & 0x7FF;
		if (local223 > 1024) {
			local223 -= 2048;
		}
		@Pc(235) int local235 = arg0.anInt1520;
		if (local223 >= -256 && local223 <= 256) {
			local235 = arg0.anInt1511;
		} else if (local223 >= 256 && local223 < 768) {
			local235 = arg0.anInt1490;
		} else if (local223 >= -768 && local223 <= -256) {
			local235 = arg0.anInt1492;
		}
		if (local235 == -1) {
			local235 = arg0.anInt1511;
		}
		@Pc(276) int local276 = 4;
		arg0.anInt1486 = local235;
		@Pc(281) boolean local281 = true;
		if (arg0 instanceof Class3_Sub1_Sub1_Sub3_Sub2) {
			local281 = ((Class3_Sub1_Sub1_Sub3_Sub2) arg0).aClass3_Sub1_Sub16_1.aBoolean113;
		}
		if (local281) {
			if (arg0.anInt1525 != arg0.anInt1501 && arg0.anInt1523 == -1 && arg0.anInt1503 != 0) {
				local276 = 2;
			}
			if (arg0.anInt1497 > 2) {
				local276 = 6;
			}
			if (arg0.anInt1497 > 3) {
				local276 = 8;
			}
			if (arg0.anInt1498 > 0 && arg0.anInt1497 > 1) {
				local276 = 8;
				arg0.anInt1498--;
			}
		} else {
			if (arg0.anInt1497 > 1) {
				local276 = 6;
			}
			if (arg0.anInt1497 > 2) {
				local276 = 8;
			}
			if (arg0.anInt1498 > 0 && arg0.anInt1497 > 1) {
				local276 = 8;
				arg0.anInt1498--;
			}
		}
		if (arg0.aBooleanArray39[arg0.anInt1497 - 1]) {
			local276 <<= 0x1;
		}
		if (local67 < local85) {
			arg0.anInt1524 += local276;
			if (arg0.anInt1524 > local85) {
				arg0.anInt1524 = local85;
			}
		} else if (local67 > local85) {
			arg0.anInt1524 -= local276;
			if (local85 > arg0.anInt1524) {
				arg0.anInt1524 = local85;
			}
		}
		if (local276 >= 8 && arg0.anInt1511 == arg0.anInt1486 && arg0.anInt1522 != -1) {
			arg0.anInt1486 = arg0.anInt1522;
		}
		if (local100 > local70) {
			arg0.anInt1494 += local276;
			if (local100 < arg0.anInt1494) {
				arg0.anInt1494 = local100;
			}
		} else if (local70 > local100) {
			arg0.anInt1494 -= local276;
			if (local100 > arg0.anInt1494) {
				arg0.anInt1494 = local100;
			}
		}
		if (arg0.anInt1524 != local85 || local100 != arg0.anInt1494) {
			return;
		}
		arg0.anInt1497--;
		if (arg0.anInt1491 > 0) {
			arg0.anInt1491--;
			return;
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(II)V")
	public static void method1136() {
		Static104.anInt3013 = 0;
		Static64.anInt2048 = 2;
		Static66.aClass25_21 = null;
		Static72.anInt2244 = -1;
		Static104.anInt3014 = 1;
		Static35.aBoolean36 = false;
		Static93.anInt2670 = -1;
	}
}
