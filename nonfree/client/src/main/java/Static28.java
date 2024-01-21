import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static28 {

	@OriginalMember(owner = "client!fa", name = "i", descriptor = "Lclient!uc;")
	public static Class3_Sub1_Sub4_Sub3 aClass3_Sub1_Sub4_Sub3_10;

	@OriginalMember(owner = "client!fa", name = "v", descriptor = "Lclient!ia;")
	public static Class37 aClass37_1;

	@OriginalMember(owner = "client!fa", name = "x", descriptor = "[I")
	public static int[] anIntArray82;

	@OriginalMember(owner = "client!fa", name = "f", descriptor = "Lclient!ad;")
	private static Class4 aClass4_406 = Static75.method1216("Close");

	@OriginalMember(owner = "client!fa", name = "b", descriptor = "Lclient!ad;")
	public static Class4 aClass4_405 = aClass4_406;

	@OriginalMember(owner = "client!fa", name = "h", descriptor = "Lclient!ad;")
	public static Class4 aClass4_407 = Static75.method1216(")1");

	@OriginalMember(owner = "client!fa", name = "j", descriptor = "Lclient!ad;")
	public static Class4 aClass4_408 = Static75.method1216("Ladevorgang )2 bitte warten Sie)3");

	@OriginalMember(owner = "client!fa", name = "k", descriptor = "Ljava/math/BigInteger;")
	public static BigInteger aBigInteger1 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@OriginalMember(owner = "client!fa", name = "l", descriptor = "Lclient!ad;")
	public static Class4 aClass4_409 = Static75.method1216("Die Adresse dieses Computers wurde gesperrt)1");

	@OriginalMember(owner = "client!fa", name = "m", descriptor = "I")
	public static int anInt868 = 0;

	@OriginalMember(owner = "client!fa", name = "n", descriptor = "I")
	public static int anInt869 = 0;

	@OriginalMember(owner = "client!fa", name = "y", descriptor = "Lclient!ad;")
	private static Class4 aClass4_413 = Static75.method1216("Private chat");

	@OriginalMember(owner = "client!fa", name = "p", descriptor = "Lclient!ad;")
	public static Class4 aClass4_410 = aClass4_413;

	@OriginalMember(owner = "client!fa", name = "r", descriptor = "Lclient!ad;")
	public static Class4 aClass4_411 = Static75.method1216("Fallen lassen");

	@OriginalMember(owner = "client!fa", name = "s", descriptor = "Lclient!ad;")
	public static Class4 aClass4_412 = Static75.method1216("Icons redrawn");

	@OriginalMember(owner = "client!fa", name = "u", descriptor = "[I")
	public static int[] anIntArray81 = new int[] { 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800 };

	@OriginalMember(owner = "client!fa", name = "A", descriptor = "Lclient!ad;")
	public static Class4 aClass4_414 = Static75.method1216("Maximale Anmelde)2Versuche -Uberschritten)3");

	@OriginalMember(owner = "client!fa", name = "C", descriptor = "Z")
	public static boolean aBoolean53 = false;

	@OriginalMember(owner = "client!fa", name = "D", descriptor = "Lclient!hd;")
	public static Class34 aClass34_3 = new Class34(4096);

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(I)V")
	public static void method587() {
		Static52.aClass20_5 = new Class20();
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(IB)Lclient!ad;")
	public static Class4 method588(@OriginalArg(0) int arg0) {
		return arg0 < 999999999 ? Static93.method1632(arg0) : Static38.aClass4_1577;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(IIBILclient!gb;III)V")
	public static void method589(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class3_Sub4 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(34) int local34;
		if (arg5 < 0 || arg5 >= 104 || arg4 < 0 || arg4 >= 104) {
			while (true) {
				local34 = arg3.method446();
				if (local34 == 0) {
					break;
				}
				if (local34 == 1) {
					arg3.method446();
					break;
				}
				if (local34 <= 49) {
					arg3.method446();
				}
			}
			return;
		}
		Static11.aByteArrayArrayArray55[arg1][arg5][arg4] = 0;
		while (true) {
			local34 = arg3.method446();
			if (local34 == 0) {
				if (arg1 == 0) {
					Static38.anIntArrayArrayArray36[0][arg5][arg4] = -Static90.method1915(arg6 + arg5 + 932731, arg0 + 556238 + arg4) * 8;
				} else {
					Static38.anIntArrayArrayArray36[arg1][arg5][arg4] = Static38.anIntArrayArrayArray36[arg1 - 1][arg5][arg4] - 240;
				}
				break;
			}
			if (local34 == 1) {
				@Pc(94) int local94 = arg3.method446();
				if (local94 == 1) {
					local94 = 0;
				}
				if (arg1 == 0) {
					Static38.anIntArrayArrayArray36[0][arg5][arg4] = -local94 * 8;
				} else {
					Static38.anIntArrayArrayArray36[arg1][arg5][arg4] = Static38.anIntArrayArrayArray36[arg1 - 1][arg5][arg4] - local94 * 8;
				}
				break;
			}
			if (local34 <= 49) {
				Static98.aByteArrayArrayArray42[arg1][arg5][arg4] = arg3.method434();
				Static92.aByteArrayArrayArray36[arg1][arg5][arg4] = (byte) ((local34 - 2) / 4);
				Static66.aByteArrayArrayArray25[arg1][arg5][arg4] = (byte) (local34 + arg2 - 2 & 0x3);
			} else if (local34 <= 81) {
				Static11.aByteArrayArrayArray55[arg1][arg5][arg4] = (byte) (local34 - 49);
			} else {
				Static92.aByteArrayArrayArray35[arg1][arg5][arg4] = (byte) (local34 - 81);
			}
		}
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(ZI)V")
	public static void method590(@OriginalArg(1) int arg0) {
		if (arg0 == -1 || !Static30.aBooleanArray6[arg0]) {
			return;
		}
		Static6.aClass64_10.method1616(arg0);
		if (Static104.aClass3_Sub1_Sub14ArrayArray1[arg0] == null) {
			return;
		}
		@Pc(29) boolean local29 = true;
		for (@Pc(31) int local31 = 0; local31 < Static104.aClass3_Sub1_Sub14ArrayArray1[arg0].length; local31++) {
			if (Static104.aClass3_Sub1_Sub14ArrayArray1[arg0][local31] != null) {
				if (Static104.aClass3_Sub1_Sub14ArrayArray1[arg0][local31].anInt2128 == 2) {
					local29 = false;
				} else {
					Static104.aClass3_Sub1_Sub14ArrayArray1[arg0][local31] = null;
				}
			}
		}
		if (local29) {
			Static104.aClass3_Sub1_Sub14ArrayArray1[arg0] = null;
		}
		Static30.aBooleanArray6[arg0] = false;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(B)V")
	public static void method591() {
		for (@Pc(15) int local15 = -1; local15 < Static11.anInt2841; local15++) {
			@Pc(24) int local24;
			if (local15 == -1) {
				local24 = 2047;
			} else {
				local24 = Static92.anIntArray270[local15];
			}
			@Pc(32) Class3_Sub1_Sub1_Sub1_Sub2 local32 = Static7.aClass3_Sub1_Sub1_Sub1_Sub2Array1[local24];
			if (local32 != null) {
				Static24.method465(local32, 1);
			}
		}
	}

	@OriginalMember(owner = "client!fa", name = "b", descriptor = "(I)V")
	public static void method592() {
		if (!Static81.aBoolean147) {
			return;
		}
		Static21.anIntArray36 = null;
		Static27.aClass3_Sub1_Sub4_Sub3Array2 = null;
		Static95.aClass25_118 = null;
		Static43.aClass25_54 = null;
		anIntArray82 = null;
		Static101.anIntArray311 = null;
		Static85.anIntArray260 = null;
		Static86.aClass3_Sub1_Sub4_Sub2_33 = null;
		Static18.aClass25_25 = null;
		Static49.aClass3_Sub1_Sub4_Sub3_16 = null;
		Static112.aClass3_Sub1_Sub4_Sub3_47 = null;
		Static8.aClass25_19 = null;
		Static89.aClass25_105 = null;
		Static82.aClass3_Sub1_Sub4_Sub2_31 = null;
		Static34.aClass25_47 = null;
		Static21.aClass25_26 = null;
		Static13.aClass25_22 = null;
		Static86.anIntArray262 = null;
		Static16.anIntArray34 = null;
		Static11.aClass25_155 = null;
		Static51.anIntArray174 = null;
		Static100.anIntArray304 = null;
		Static67.method1111();
		Static70.method1137(true);
		Static81.aBoolean147 = false;
	}

	@OriginalMember(owner = "client!fa", name = "c", descriptor = "(I)V")
	public static void method593() {
		aClass4_412 = null;
		anIntArray82 = null;
		anIntArray81 = null;
		aClass4_414 = null;
		aClass4_413 = null;
		aClass4_406 = null;
		aClass37_1 = null;
		aClass4_407 = null;
		aClass4_408 = null;
		aBigInteger1 = null;
		aClass4_410 = null;
		aClass4_411 = null;
		aClass34_3 = null;
		aClass4_405 = null;
		aClass3_Sub1_Sub4_Sub3_10 = null;
		aClass4_409 = null;
	}
}
