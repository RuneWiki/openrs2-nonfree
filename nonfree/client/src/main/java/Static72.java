import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static72 {

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

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIIII)I", line = 43)
	public static int method1326(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(12) int local12 = 65536 - Class2_Sub2_Sub2_Sub1.anIntArray58[arg0 * 1024 / arg2] >> 688514529;
		return ((65536 - local12) * arg1 >> 16) + (local12 * arg3 >> 16);
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(I)V", line = 75)
	public static void method1328() {
		Class47.aClass2_Sub3_Sub1_4 = null;
		aClass48_7 = null;
		Class47.aClass40_557 = null;
		Class47.aClass40_556 = null;
		aClass24_1 = null;
		aClass45_27 = null;
		aClass45_28 = null;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lclient!ud;Lclient!ud;I)V", line = 92)
	public static void method1329(@OriginalArg(0) Class5 arg0, @OriginalArg(1) Class5 arg1) {
		Static49.aClass5_18 = arg0;
		Static84.aClass5_28 = arg1;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(B)V", line = 163)
	public static void method1331() {
		if (Class2_Sub2_Sub12_Sub5.anInt2030 != 1) {
			return;
		}
		if (Class24.anInt2500 >= 6 && Class24.anInt2500 <= 106 && Class56.anInt2133 >= 467 && Class56.anInt2133 <= 499) {
			Class30.aBoolean95 = true;
			Class2_Sub2_Sub4.anInt583 = (Class2_Sub2_Sub4.anInt583 + 1) % 4;
			Class41.aBoolean144 = true;
			Class47.aClass2_Sub3_Sub1_4.method1736(132);
			Class47.aClass2_Sub3_Sub1_4.method1703(Class2_Sub2_Sub4.anInt583);
			Class47.aClass2_Sub3_Sub1_4.method1703(Class63.anInt2515);
			Class47.aClass2_Sub3_Sub1_4.method1703(Class62.anInt2491);
		}
		if (Class24.anInt2500 >= 135 && Class24.anInt2500 <= 235 && Class56.anInt2133 >= 467 && Class56.anInt2133 <= 499) {
			Class41.aBoolean144 = true;
			Class30.aBoolean95 = true;
			Class63.anInt2515 = (Class63.anInt2515 + 1) % 3;
			Class47.aClass2_Sub3_Sub1_4.method1736(132);
			Class47.aClass2_Sub3_Sub1_4.method1703(Class2_Sub2_Sub4.anInt583);
			Class47.aClass2_Sub3_Sub1_4.method1703(Class63.anInt2515);
			Class47.aClass2_Sub3_Sub1_4.method1703(Class62.anInt2491);
		}
		if (Class24.anInt2500 >= 273 && Class24.anInt2500 <= 373 && Class56.anInt2133 >= 467 && Class56.anInt2133 <= 499) {
			Class62.anInt2491 = (Class62.anInt2491 + 1) % 3;
			Class30.aBoolean95 = true;
			Class41.aBoolean144 = true;
			Class47.aClass2_Sub3_Sub1_4.method1736(132);
			Class47.aClass2_Sub3_Sub1_4.method1703(Class2_Sub2_Sub4.anInt583);
			Class47.aClass2_Sub3_Sub1_4.method1703(Class63.anInt2515);
			Class47.aClass2_Sub3_Sub1_4.method1703(Class62.anInt2491);
		}
		if (Class24.anInt2500 < 412 || Class24.anInt2500 > 512 || Class56.anInt2133 < 467 || Class56.anInt2133 > 499) {
			return;
		}
		if (Class2_Sub3.anInt2585 != -1) {
			Static53.method989(0, Class34.aClass40_445, Class59.aClass40_628);
			return;
		}
		Static55.method998();
		if (Class2_Sub6.anInt808 != -1) {
			Class2_Sub2_Sub12_Sub1_Sub1.aBoolean103 = false;
			Class34.aClass40_448 = Class34.aClass40_445;
			Class44.anInt1826 = Class2_Sub3.anInt2585 = Class2_Sub6.anInt808;
			return;
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(BLjava/awt/Graphics;)V", line = 262)
	public static void method1333(@OriginalArg(1) Graphics arg0) {
		Static2.aClass45_2.method1474(arg0, 4, 4);
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(I[Lclient!o;)Lclient!o;", line = 277)
	public static Class40 method1334(@OriginalArg(1) Class40[] arg0) {
		if (arg0.length < 2) {
			throw new IllegalArgumentException();
		}
		return Static89.method1563(arg0, arg0.length);
	}
}
