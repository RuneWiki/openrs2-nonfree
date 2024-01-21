import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static80 {

	@OriginalMember(owner = "client!qc", name = "d", descriptor = "I")
	public static int anInt1914;

	@OriginalMember(owner = "client!qc", name = "e", descriptor = "Lclient!p;")
	public static Class45 aClass45_27;

	@OriginalMember(owner = "client!qc", name = "h", descriptor = "Lclient!wd;")
	public static Class24 aClass24_1;

	@OriginalMember(owner = "client!qc", name = "q", descriptor = "Lclient!p;")
	public static Class45 aClass45_28;

	@OriginalMember(owner = "client!qc", name = "x", descriptor = "Lclient!qd;")
	public static Class48 aClass48_7;

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "I")
	public static int anInt1911 = 0;

	@OriginalMember(owner = "client!qc", name = "g", descriptor = "Lclient!wc;")
	public static Class2_Sub3_Sub1 aClass2_Sub3_Sub1_4 = new Class2_Sub3_Sub1(5000);

	@OriginalMember(owner = "client!qc", name = "j", descriptor = "I")
	public static int anInt1917 = 0;

	@OriginalMember(owner = "client!qc", name = "k", descriptor = "Lclient!o;")
	public static Class40 aClass40_556 = Static13.method257(" (Xskill)2");

	@OriginalMember(owner = "client!qc", name = "n", descriptor = "I")
	public static int anInt1919 = 0;

	@OriginalMember(owner = "client!qc", name = "y", descriptor = "Lclient!o;")
	public static Class40 aClass40_557 = Static13.method257(")3");

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIIII)I")
	public static int method1326(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(12) int local12 = 65536 - Class2_Sub2_Sub2_Sub1.anIntArray58[arg0 * 1024 / arg2] >> 688514529;
		return ((65536 - local12) * arg1 >> 16) + (local12 * arg3 >> 16);
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(I)V")
	public static void method1328() {
		aClass2_Sub3_Sub1_4 = null;
		aClass48_7 = null;
		aClass40_557 = null;
		aClass40_556 = null;
		aClass24_1 = null;
		aClass45_27 = null;
		aClass45_28 = null;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lclient!ud;Lclient!ud;I)V")
	public static void method1329(@OriginalArg(0) Class5 arg0, @OriginalArg(1) Class5 arg1) {
		Static54.aClass5_18 = arg0;
		Static92.aClass5_28 = arg1;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(B)V")
	public static void method1331() {
		if (Static86.anInt2030 != 1) {
			return;
		}
		if (Static107.anInt2500 >= 6 && Static107.anInt2500 <= 106 && Static90.anInt2133 >= 467 && Static90.anInt2133 <= 499) {
			Static52.aBoolean95 = true;
			Static23.anInt583 = (Static23.anInt583 + 1) % 4;
			Static73.aBoolean144 = true;
			aClass2_Sub3_Sub1_4.method1736(132);
			aClass2_Sub3_Sub1_4.method1703(Static23.anInt583);
			aClass2_Sub3_Sub1_4.method1703(Static104.anInt2515);
			aClass2_Sub3_Sub1_4.method1703(Static103.anInt2491);
		}
		if (Static107.anInt2500 >= 135 && Static107.anInt2500 <= 235 && Static90.anInt2133 >= 467 && Static90.anInt2133 <= 499) {
			Static73.aBoolean144 = true;
			Static52.aBoolean95 = true;
			Static104.anInt2515 = (Static104.anInt2515 + 1) % 3;
			aClass2_Sub3_Sub1_4.method1736(132);
			aClass2_Sub3_Sub1_4.method1703(Static23.anInt583);
			aClass2_Sub3_Sub1_4.method1703(Static104.anInt2515);
			aClass2_Sub3_Sub1_4.method1703(Static103.anInt2491);
		}
		if (Static107.anInt2500 >= 273 && Static107.anInt2500 <= 373 && Static90.anInt2133 >= 467 && Static90.anInt2133 <= 499) {
			Static103.anInt2491 = (Static103.anInt2491 + 1) % 3;
			Static52.aBoolean95 = true;
			Static73.aBoolean144 = true;
			aClass2_Sub3_Sub1_4.method1736(132);
			aClass2_Sub3_Sub1_4.method1703(Static23.anInt583);
			aClass2_Sub3_Sub1_4.method1703(Static104.anInt2515);
			aClass2_Sub3_Sub1_4.method1703(Static103.anInt2491);
		}
		if (Static107.anInt2500 < 412 || Static107.anInt2500 > 512 || Static90.anInt2133 < 467 || Static90.anInt2133 > 499) {
			return;
		}
		if (Static22.anInt2585 != -1) {
			Static58.method989(0, Static61.aClass40_445, Static94.aClass40_628);
			return;
		}
		Static60.method998();
		if (Static34.anInt808 != -1) {
			Static54.aBoolean103 = false;
			Static61.aClass40_448 = Static61.aClass40_445;
			Static75.anInt1826 = Static22.anInt2585 = Static34.anInt808;
			return;
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(BLjava/awt/Graphics;)V")
	public static void method1333(@OriginalArg(1) Graphics arg0) {
		Static2.aClass45_2.method1474(arg0, 4, 4);
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(I[Lclient!o;)Lclient!o;")
	public static Class40 method1334(@OriginalArg(1) Class40[] arg0) {
		if (arg0.length < 2) {
			throw new IllegalArgumentException();
		}
		return Static97.method1563(arg0, arg0.length);
	}
}
