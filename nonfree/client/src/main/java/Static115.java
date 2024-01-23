import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static115 {

	@OriginalMember(owner = "client!ii", name = "J", descriptor = "Lclient!si;")
	public static Class157 aClass157_10;

	@OriginalMember(owner = "client!ii", name = "O", descriptor = "Lclient!ui;")
	public static Class175 aClass175_18 = new Class175(64);

	@OriginalMember(owner = "client!ii", name = "V", descriptor = "[I")
	public static int[] anIntArray168 = new int[] { 2, 2, 4, 0, 1, 8, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0 };

	@OriginalMember(owner = "client!ii", name = "W", descriptor = "Ljava/lang/String;")
	public static String aString81 = "Prepared sound engine";

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(ILclient!nm;IIIIZ)V")
	public static void method2105(@OriginalArg(1) Class119 arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2) {
		Static118.anInt2421 = arg2;
		Static167.aClass119_12 = arg0;
		Static289.anInt5257 = 0;
		Static63.anInt1315 = 1;
		Static101.anInt2158 = arg1;
		Static1.aBoolean6 = false;
		Static87.anInt1879 = 2;
	}

	@OriginalMember(owner = "client!ii", name = "f", descriptor = "(I)V")
	public static void method2106() {
		if (Static28.aBoolean56) {
			return;
		}
		Static167.aBoolean68 = true;
		if (Static240.aBoolean404) {
			Static148.aFloat64 = (int) Static148.aFloat64 + 191 & 0xFFFFFF80;
		} else {
			Static273.aFloat91 += (24.0F - Static273.aFloat91) / 2.0F;
		}
		Static28.aBoolean56 = true;
	}

	@OriginalMember(owner = "client!ii", name = "f", descriptor = "(B)Z")
	public static boolean method2107() {
		@Pc(6) Class138 local6 = Static94.aClass138_1;
		synchronized (Static94.aClass138_1) {
			if (Static89.anInt1900 == Static43.anInt981) {
				return false;
			} else {
				Static100.anInt5565 = Static274.anIntArray557[Static43.anInt981];
				Static264.aChar4 = Static144.aCharArray4[Static43.anInt981];
				Static43.anInt981 = Static43.anInt981 + 1 & 0x7F;
				return true;
			}
		}
	}

	@OriginalMember(owner = "client!ii", name = "g", descriptor = "(I)Z")
	public static boolean method2108() {
		return Static71.aBoolean165 ? true : Static252.aBoolean432;
	}
}
