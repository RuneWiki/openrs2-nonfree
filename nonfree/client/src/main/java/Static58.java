import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static58 {

	@OriginalMember(owner = "client!kb", name = "d", descriptor = "Lclient!f;")
	public static Class4_Sub7 aClass4_Sub7_12;

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "Lclient!ec;")
	public static Class22 aClass22_446 = Static60.method1113("Spiel)2Engine wird gestartet)3)3)3");

	@OriginalMember(owner = "client!kb", name = "c", descriptor = "Lclient!ec;")
	public static Class22 aClass22_447 = Static60.method1113("(U3");

	@OriginalMember(owner = "client!kb", name = "t", descriptor = "Lclient!ec;")
	private static Class22 aClass22_457 = Static60.method1113("Click to switch");

	@OriginalMember(owner = "client!kb", name = "e", descriptor = "Lclient!ec;")
	public static Class22 aClass22_448 = aClass22_457;

	@OriginalMember(owner = "client!kb", name = "f", descriptor = "Lclient!ec;")
	public static Class22 aClass22_449 = Static60.method1113(" x ");

	@OriginalMember(owner = "client!kb", name = "g", descriptor = "Lclient!ec;")
	public static Class22 aClass22_450 = Static60.method1113("Benutzen Sie bitte eine andere Welt)3");

	@OriginalMember(owner = "client!kb", name = "j", descriptor = "Lclient!ec;")
	public static Class22 aClass22_451 = Static60.method1113("null");

	@OriginalMember(owner = "client!kb", name = "l", descriptor = "Lclient!ec;")
	public static Class22 aClass22_452 = Static60.method1113("runes");

	@OriginalMember(owner = "client!kb", name = "m", descriptor = "Lclient!ec;")
	public static Class22 aClass22_453 = Static60.method1113("blinken3:");

	@OriginalMember(owner = "client!kb", name = "n", descriptor = "Lclient!ec;")
	public static Class22 aClass22_454 = Static60.method1113("Clientscript error in: ");

	@OriginalMember(owner = "client!kb", name = "p", descriptor = "Lclient!ec;")
	public static Class22 aClass22_455 = Static60.method1113("Sie befinden sich in einem Mitglieder)2Gebiet(Q");

	@OriginalMember(owner = "client!kb", name = "s", descriptor = "Lclient!ec;")
	public static Class22 aClass22_456 = Static60.method1113("60 Sekunden noch einmal)3)3)3");

	@OriginalMember(owner = "client!kb", name = "x", descriptor = "[Lclient!ec;")
	public static Class22[] aClass22Array14 = new Class22[100];

	@OriginalMember(owner = "client!kb", name = "z", descriptor = "Lclient!ec;")
	public static Class22 aClass22_458 = Static60.method1113("Neuer Benutzer");

	@OriginalMember(owner = "client!kb", name = "A", descriptor = "Lclient!ec;")
	public static Class22 aClass22_459 = Static60.method1113("sl_back");

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(ILclient!hb;)V")
	public static void method1096(@OriginalArg(1) Class4_Sub1_Sub2_Sub3 arg0) {
		for (@Pc(12) int local12 = 0; local12 < Static5.anIntArray5.length; local12++) {
			Static5.anIntArray5[local12] = 0;
		}
		@Pc(37) int local37;
		for (@Pc(27) int local27 = 0; local27 < 5000; local27++) {
			local37 = (int) ((double) 256 * 128.0D * Math.random());
			Static5.anIntArray5[local37] = (int) (Math.random() * 256.0D);
		}
		@Pc(56) int local56;
		@Pc(60) int local60;
		@Pc(68) int local68;
		for (local37 = 0; local37 < 20; local37++) {
			for (local56 = 1; local56 < 255; local56++) {
				for (local60 = 1; local60 < 127; local60++) {
					local68 = (local56 << 7) + local60;
					Static8.anIntArray274[local68] = (Static5.anIntArray5[local68 - 1] + Static5.anIntArray5[local68 + 1] + Static5.anIntArray5[local68 + -128] + Static5.anIntArray5[local68 + 128]) / 4;
				}
			}
			@Pc(110) int[] local110 = Static5.anIntArray5;
			Static5.anIntArray5 = Static8.anIntArray274;
			Static8.anIntArray274 = local110;
		}
		if (arg0 == null) {
			return;
		}
		local56 = 0;
		for (local60 = 0; local60 < arg0.anInt1210; local60++) {
			for (local68 = 0; local68 < arg0.anInt1206; local68++) {
				if (arg0.aByteArray11[local56++] != 0) {
					@Pc(145) int local145 = arg0.anInt1209 + local68 + 16;
					@Pc(152) int local152 = local60 + arg0.anInt1205 + 16;
					@Pc(158) int local158 = (local152 << 7) + local145;
					Static5.anIntArray5[local158] = 0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIIIIII)I")
	public static int method1097(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if ((arg0 & 0x1) == 1) {
			@Pc(12) int local12 = arg4;
			arg4 = arg3;
			arg3 = local12;
		}
		@Pc(20) int local20 = arg2 & 0x3;
		if (local20 == 0) {
			return arg1;
		} else if (local20 == 1) {
			return 1 + 7 - arg4 - arg5;
		} else if (local20 == 2) {
			return 7 + 1 - arg1 - arg3;
		} else {
			return arg5;
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(II)Z")
	public static boolean method1098(@OriginalArg(0) int arg0) {
		return (arg0 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lclient!f;II)Lclient!ec;")
	public static Class22 method1099(@OriginalArg(0) Class4_Sub7 arg0, @OriginalArg(1) int arg1) {
		if (!Static11.method1907(Static124.method1890(arg0), arg1) && arg0.anObjectArray13 == null) {
			return null;
		} else if (arg0.aClass22Array3 == null || arg0.aClass22Array3.length <= arg1 || arg0.aClass22Array3[arg1] == null || arg0.aClass22Array3[arg1].method484().method449() == 0) {
			return Static123.aBoolean278 ? Static44.method856(new Class22[] { Static92.aClass22_726, Static134.method2042(arg1) }) : null;
		} else {
			return arg0.aClass22Array3[arg1];
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIIILclient!vc;)V")
	public static void method1100(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class4_Sub1_Sub17 arg3) {
		if (Static120.anInt2929 >= 50 || Static95.anInt1927 == 0 || (arg3.anIntArray326 == null || arg2 >= arg3.anIntArray326.length)) {
			return;
		}
		@Pc(25) int local25 = arg3.anIntArray326[arg2];
		if (local25 == 0) {
			return;
		}
		@Pc(32) int local32 = local25 >> 8;
		Static45.anIntArray133[Static120.anInt2929] = local32;
		@Pc(42) int local42 = local25 >> 4 & 0x7;
		@Pc(46) int local46 = local25 & 0xF;
		@Pc(52) int local52 = (arg0 - 64) / 128;
		@Pc(58) int local58 = (arg1 - 64) / 128;
		Static105.anIntArray296[Static120.anInt2929] = local42;
		Static93.anIntArray281[Static120.anInt2929] = 0;
		Static54.aClass65Array1[Static120.anInt2929] = null;
		Static95.anIntArray198[Static120.anInt2929] = local46 + (local58 << 16) + (local52 << 8);
		Static120.anInt2929++;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(I)V")
	public static void method1101() {
		Static30.aClass81_4 = new Class81(32);
	}

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "(I)V")
	public static void method1102() {
		aClass22_458 = null;
		aClass22_448 = null;
		aClass22_454 = null;
		aClass22_455 = null;
		aClass22_459 = null;
		aClass4_Sub7_12 = null;
		aClass22_456 = null;
		aClass22Array14 = null;
		aClass22_446 = null;
		aClass22_451 = null;
		aClass22_449 = null;
		aClass22_450 = null;
		aClass22_447 = null;
		aClass22_452 = null;
		aClass22_453 = null;
		aClass22_457 = null;
	}
}
