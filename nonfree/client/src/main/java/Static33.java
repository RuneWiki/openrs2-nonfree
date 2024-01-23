import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static33 {

	@OriginalMember(owner = "client!ci", name = "F", descriptor = "I")
	public static int anInt571;

	@OriginalMember(owner = "client!ci", name = "H", descriptor = "[[B")
	public static byte[][] aByteArrayArray4;

	@OriginalMember(owner = "client!ci", name = "J", descriptor = "Lclient!rd;")
	public static Class72_Sub1 aClass72_Sub1_3;

	@OriginalMember(owner = "client!ci", name = "y", descriptor = "I")
	public static int anInt566 = 0;

	@OriginalMember(owner = "client!ci", name = "A", descriptor = "Lclient!qe;")
	public static Class78 aClass78_103 = Static199.method3560(")2");

	@OriginalMember(owner = "client!ci", name = "B", descriptor = "I")
	public static int anInt568 = 0;

	@OriginalMember(owner = "client!ci", name = "I", descriptor = "I")
	public static int anInt573 = 0;

	@OriginalMember(owner = "client!ci", name = "c", descriptor = "(B)V")
	public static void method420() {
		@Pc(7) Class36 local7 = Static10.aClass36_1;
		synchronized (Static10.aClass36_1) {
			Static35.anInt581++;
			Static126.anInt2867 = Static182.anInt4234;
			@Pc(23) int local23;
			if (Static213.anInt2032 >= 0) {
				while (Static213.anInt2032 != anInt566) {
					local23 = Static27.anIntArray86[anInt566];
					anInt566 = anInt566 + 1 & 0x7F;
					if (local23 < 0) {
						Static121.aBooleanArray133[~local23] = false;
					} else {
						Static121.aBooleanArray133[local23] = true;
					}
				}
			} else {
				for (local23 = 0; local23 < 112; local23++) {
					Static121.aBooleanArray133[local23] = false;
				}
				Static213.anInt2032 = anInt566;
			}
			Static182.anInt4234 = Static50.anInt906;
		}
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(ZLclient!oe;)V")
	public static void method421(@OriginalArg(1) Class72 arg0) {
		Static194.anInt4455 = arg0.method3190(Static89.aClass78_433);
		Static8.anInt266 = arg0.method3190(Static98.aClass78_472);
		Static154.anInt3545 = arg0.method3190(Static198.aClass78_785);
		Static187.anInt4357 = arg0.method3190(Static119.aClass78_561);
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(III)I")
	public static int method422(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(45) int local45 = Static128.method2310(arg1 + 45365, 4, arg0 + 91923) + (Static128.method2310(arg1 + 10294, 2, arg0 + 37821) - 128 >> 1) + (Static128.method2310(arg1, 1, arg0) + -128 >> 2) - 128;
		local45 = (int) ((double) local45 * 0.3D) + 35;
		if (local45 < 10) {
			local45 = 10;
		} else if (local45 > 60) {
			local45 = 60;
		}
		return local45;
	}
}
