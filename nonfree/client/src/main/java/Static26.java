import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static26 {

	@OriginalMember(owner = "client!bf", name = "f", descriptor = "[Lclient!ka;")
	public static Class129[] aClass129Array1;

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "Lclient!cb;")
	public static final Class36 aClass36_1 = new Class36();

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "I")
	public static int anInt345 = 0;

	@OriginalMember(owner = "client!bf", name = "d", descriptor = "[I")
	public static final int[] anIntArray38 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@OriginalMember(owner = "client!bf", name = "e", descriptor = "I")
	public static int anInt347 = 0;

	@OriginalMember(owner = "client!bf", name = "g", descriptor = "Lclient!ck;")
	public static final Class3_Sub5_Sub1 aClass3_Sub5_Sub1_2 = new Class3_Sub5_Sub1(5000);

	@OriginalMember(owner = "client!bf", name = "h", descriptor = "Lclient!bc;")
	public static final Class22 aClass22_3 = new Class22();

	@OriginalMember(owner = "client!bf", name = "i", descriptor = "[C")
	public static final char[] aCharArray1 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIBLclient!dt;Z)V")
	public static void method322(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class62 arg2, @OriginalArg(4) boolean arg3) {
		@Pc(8) int local8 = arg2.anInt1546;
		@Pc(11) int local11 = arg2.anInt1551;
		if (arg2.aByte24 == 0) {
			arg2.anInt1546 = arg2.anInt1541;
		} else if (arg2.aByte24 == 1) {
			arg2.anInt1546 = arg1 - arg2.anInt1541;
		} else if (arg2.aByte24 == 2) {
			arg2.anInt1546 = arg1 * arg2.anInt1541 >> 14;
		}
		if (arg2.aByte22 == 0) {
			arg2.anInt1551 = arg2.anInt1560;
		} else if (arg2.aByte22 == 1) {
			arg2.anInt1551 = arg0 - arg2.anInt1560;
		} else if (arg2.aByte22 == 2) {
			arg2.anInt1551 = arg0 * arg2.anInt1560 >> 14;
		}
		if (arg2.aByte24 == 4) {
			arg2.anInt1546 = arg2.anInt1551 * arg2.anInt1558 / arg2.anInt1539;
		}
		if (arg2.aByte22 == 4) {
			arg2.anInt1551 = arg2.anInt1539 * arg2.anInt1546 / arg2.anInt1558;
		}
		if (Static75.aBoolean129 && (Static48.method915(arg2).anInt6291 != 0 || arg2.anInt1575 == 0)) {
			if (arg2.anInt1551 < 5 && arg2.anInt1546 < 5) {
				arg2.anInt1546 = 5;
				arg2.anInt1551 = 5;
			} else {
				if (arg2.anInt1551 <= 0) {
					arg2.anInt1551 = 5;
				}
				if (arg2.anInt1546 <= 0) {
					arg2.anInt1546 = 5;
				}
			}
		}
		if (arg2.anInt1572 == Static109.anInt2148) {
			Static141.aClass62_9 = arg2;
		}
		if (arg3 && arg2.anObjectArray26 != null && (arg2.anInt1546 != local8 || arg2.anInt1551 != local11)) {
			@Pc(192) Class3_Sub23 local192 = new Class3_Sub23();
			local192.aClass62_11 = arg2;
			local192.anObjectArray31 = arg2.anObjectArray26;
			Static352.aClass138_44.method3053(local192);
		}
	}
}
