import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static50 {

	@OriginalMember(owner = "client!ia", name = "bb", descriptor = "I")
	public static int anInt1308;

	@OriginalMember(owner = "client!ia", name = "db", descriptor = "Lclient!ja;")
	private static Class39 aClass39_747 = Static28.method504("Loaded wordpack");

	@OriginalMember(owner = "client!ia", name = "Z", descriptor = "Lclient!ja;")
	public static Class39 aClass39_746 = aClass39_747;

	@OriginalMember(owner = "client!ia", name = "ab", descriptor = "Z")
	public static boolean aBoolean68 = false;

	@OriginalMember(owner = "client!ia", name = "eb", descriptor = "Z")
	public static boolean aBoolean69 = false;

	@OriginalMember(owner = "client!ia", name = "ib", descriptor = "Lclient!ja;")
	public static Class39 aClass39_748 = Static28.method504("Unerwartete Antwort vom Anmelde)2Server)3");

	@OriginalMember(owner = "client!ia", name = "e", descriptor = "(I)V")
	public static void method815() {
		aClass39_747 = null;
		aClass39_746 = null;
		aClass39_748 = null;
	}

	@OriginalMember(owner = "client!ia", name = "f", descriptor = "(I)V")
	public static void method818() {
		Static5.aClass12_73.method233();
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(ILclient!s;I)Lclient!ja;")
	public static Class39 method819(@OriginalArg(1) Class4_Sub16 arg0) {
		try {
			@Pc(7) Class39 local7 = new Class39();
			local7.anInt1481 = arg0.method1450();
			if (local7.anInt1481 > 32767) {
				local7.anInt1481 = 32767;
			}
			local7.aByteArray10 = new byte[local7.anInt1481];
			arg0.anInt2019 += Static102.aClass44_1.method1122(local7.anInt1481, arg0.aByteArray22, 0, local7.aByteArray10, arg0.anInt2019);
			return local7;
		} catch (@Pc(53) Exception local53) {
			return Static74.aClass39_932;
		}
	}

	@OriginalMember(owner = "client!ia", name = "d", descriptor = "(II)V")
	public static void method820(@OriginalArg(1) int arg0) {
		if (arg0 == -1 || !Static24.aBooleanArray7[arg0]) {
			return;
		}
		Static105.aClass20_42.method489(arg0);
		if (Static109.aClass4_Sub5ArrayArray1[arg0] == null) {
			return;
		}
		@Pc(26) boolean local26 = true;
		for (@Pc(28) int local28 = 0; local28 < Static109.aClass4_Sub5ArrayArray1[arg0].length; local28++) {
			if (Static109.aClass4_Sub5ArrayArray1[arg0][local28] != null) {
				if (Static109.aClass4_Sub5ArrayArray1[arg0][local28].anInt1225 == 2) {
					local26 = false;
				} else {
					Static109.aClass4_Sub5ArrayArray1[arg0][local28] = null;
				}
			}
		}
		if (local26) {
			Static109.aClass4_Sub5ArrayArray1[arg0] = null;
		}
		Static24.aBooleanArray7[arg0] = false;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(BII)Lclient!ja;")
	public static Class39 method821(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg0 - arg1;
		if (local8 < -9) {
			return Static82.aClass39_1041;
		} else if (local8 < -6) {
			return Static45.aClass39_698;
		} else if (local8 < -3) {
			return Static15.aClass39_254;
		} else if (local8 < 0) {
			return Static71.aClass39_917;
		} else if (local8 > 9) {
			return Static27.aClass39_392;
		} else if (local8 > 6) {
			return Static78.aClass39_997;
		} else if (local8 > 3) {
			return Static36.aClass39_466;
		} else if (local8 > 0) {
			return Static16.aClass39_269;
		} else {
			return Static110.aClass39_1450;
		}
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(Lclient!pd;ILclient!pd;)V")
	public static void method822(@OriginalArg(0) Class20 arg0, @OriginalArg(2) Class20 arg1) {
		Static130.aClass20_63 = arg0;
		Static19.aClass20_14 = arg1;
	}
}
