import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static475 {

	@OriginalMember(owner = "client!tt", name = "Wc", descriptor = "F")
	public static float aFloat250;

	@OriginalMember(owner = "client!tt", name = "Tc", descriptor = "[I")
	public static final int[] anIntArray735 = new int[13];

	@OriginalMember(owner = "client!tt", name = "Xc", descriptor = "Z")
	public static boolean aBoolean634 = false;

	@OriginalMember(owner = "client!tt", name = "i", descriptor = "(B)V")
	public static void method7089() {
		Static353.method5566((long) Static223.anInt4829, Static121.aClass5_7);
		if (Static422.anInt8667 != -1) {
			Static323.method5179(Static422.anInt8667);
		}
		for (@Pc(18) int local18 = 0; local18 < Static489.anInt8712; local18++) {
			if (Static125.aBooleanArray12[local18]) {
				Static302.aBooleanArray29[local18] = true;
			}
			Static280.aBooleanArray28[local18] = Static125.aBooleanArray12[local18];
			Static125.aBooleanArray12[local18] = false;
		}
		Static441.anInt8034 = Static223.anInt4829;
		if (Static121.aClass5_7.method7462()) {
			Static199.aBoolean327 = true;
		}
		if (Static422.anInt8667 != -1) {
			Static489.anInt8712 = 0;
			Static356.method5586();
		}
		Static121.aClass5_7.F();
		Static319.method5146(Static121.aClass5_7);
		@Pc(65) int local65 = Static56.method1147();
		if (local65 == -1) {
			local65 = Static7.anInt488;
		}
		if (local65 == -1) {
			local65 = Static395.anInt7316;
		}
		Static234.method4162(local65);
		Static276.anInt5695 = 0;
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(BLclient!eca;)I")
	public static int method7097(@OriginalArg(1) Class6_Sub1_Sub2_Sub1 arg0) {
		@Pc(8) int local8 = arg0.anInt2300;
		@Pc(12) Class73 local12 = arg0.method7088();
		if (arg0.aBoolean630) {
			local8 = arg0.anInt2310;
		} else if (arg0.anInt8534 == local12.anInt2434 || local12.anInt2412 == arg0.anInt8534 || local12.anInt2425 == arg0.anInt8534 || local12.anInt2439 == arg0.anInt8534) {
			local8 = arg0.anInt2304;
		} else if (local12.anInt2417 == arg0.anInt8534 || arg0.anInt8534 == local12.anInt2407 || local12.anInt2403 == arg0.anInt8534 || local12.anInt2419 == arg0.anInt8534) {
			local8 = arg0.anInt2314;
		}
		return local8;
	}
}
