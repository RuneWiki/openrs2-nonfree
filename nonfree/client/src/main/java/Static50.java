import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static50 {

	@OriginalMember(owner = "client!bs", name = "i", descriptor = "[Lclient!f;")
	public static Class88[] aClass88Array1;

	@OriginalMember(owner = "client!bs", name = "b", descriptor = "I")
	public static int anInt1333 = -1;

	@OriginalMember(owner = "client!bs", name = "c", descriptor = "I")
	public static int anInt1334 = 0;

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(ILclient!r;)V")
	public static void method1165(@OriginalArg(1) Class7 arg0) {
		if (Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2.aByte127 != Static433.anInt8342 && (Static571.aClass182ArrayArrayArray3 != null && Static53.method7927(Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2.aByte127, arg0))) {
			Static433.anInt8342 = Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2.aByte127;
		}
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(Lclient!ph;Z)V")
	public static void method1166(@OriginalArg(0) Class4_Sub39 arg0) {
		Static10.aClass22_10.method894(arg0);
		arg0.anInt7832 = arg0.aClass4_Sub13_Sub2_1.anInt9170;
		arg0.aClass4_Sub13_Sub2_1.anInt9170 = 0;
		Static328.anInt6426 += arg0.anInt7832;
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(Z)V")
	public static void method1168() {
		Static296.aClass324_3.method7428();
		Static432.aClass335_3.method7600();
		Static516.aClass127_2.method2861();
		Static103.aClass298_1.method6816();
		Class21_Sub1_Sub2_Sub1.lb.method4991();
		Static338.aClass29_1.method986();
		Static17.aClass254_1.method5939();
		Static342.aClass132_2.method2954();
		Static420.aClass60_1.method1604();
		Static152.aClass290_1.method6673();
		Static203.aClass230_1.method5250();
		Static89.aClass121_1.method2681();
		Static259.aClass249_2.method5891();
		Static245.aClass107_2.method2502();
		Static5.aClass301_1.method6914();
		Static145.aClass56_1.method1552();
		Static240.aClass175_1.method4141();
		Static207.aClass201_1.method4807();
		Static198.aClass338_1.method7712();
		Static288.aClass47_1.method1275();
		Static248.method3971();
		Static382.method5909();
		Static188.method3094();
		Static384.method5953();
		Static159.method2596();
		Static365.aClass167_34.method3964(5);
		Static278.aClass167_20.method3964(5);
		Static499.aClass167_44.method3964(5);
		Static107.aClass167_7.method3964(5);
		Static471.aClass167_53.method3964(5);
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(ILjava/lang/String;)[B")
	public static byte[] method1169(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(11) byte[] local11 = new byte[local8];
		for (@Pc(21) int local21 = 0; local21 < local8; local21++) {
			@Pc(27) char local27 = arg0.charAt(local21);
			if (local27 > '\u0000' && local27 < '\u0080' || !(local27 < ' ' || local27 > 'ÿ')) {
				local11[local21] = (byte) local27;
			} else if (local27 == '€') {
				local11[local21] = -128;
			} else if (local27 == '‚') {
				local11[local21] = -126;
			} else if (local27 == 'ƒ') {
				local11[local21] = -125;
			} else if (local27 == '„') {
				local11[local21] = -124;
			} else if (local27 == '…') {
				local11[local21] = -123;
			} else if (local27 == '†') {
				local11[local21] = -122;
			} else if (local27 == '‡') {
				local11[local21] = -121;
			} else if (local27 == 'ˆ') {
				local11[local21] = -120;
			} else if (local27 == '‰') {
				local11[local21] = -119;
			} else if (local27 == 'Š') {
				local11[local21] = -118;
			} else if (local27 == '‹') {
				local11[local21] = -117;
			} else if (local27 == 'Œ') {
				local11[local21] = -116;
			} else if (local27 == 'Ž') {
				local11[local21] = -114;
			} else if (local27 == '‘') {
				local11[local21] = -111;
			} else if (local27 == '’') {
				local11[local21] = -110;
			} else if (local27 == '“') {
				local11[local21] = -109;
			} else if (local27 == '”') {
				local11[local21] = -108;
			} else if (local27 == '•') {
				local11[local21] = -107;
			} else if (local27 == '–') {
				local11[local21] = -106;
			} else if (local27 == '—') {
				local11[local21] = -105;
			} else if (local27 == '˜') {
				local11[local21] = -104;
			} else if (local27 == '™') {
				local11[local21] = -103;
			} else if (local27 == 'š') {
				local11[local21] = -102;
			} else if (local27 == '›') {
				local11[local21] = -101;
			} else if (local27 == 'œ') {
				local11[local21] = -100;
			} else if (local27 == 'ž') {
				local11[local21] = -98;
			} else if (local27 == 'Ÿ') {
				local11[local21] = -97;
			} else {
				local11[local21] = 63;
			}
		}
		return local11;
	}
}
