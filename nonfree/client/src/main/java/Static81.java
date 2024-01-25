import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static81 {

	@OriginalMember(owner = "client!fb", name = "r", descriptor = "Lclient!kh;")
	public static Class54 aClass54_4;

	@OriginalMember(owner = "client!fb", name = "v", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray9;

	@OriginalMember(owner = "client!fb", name = "C", descriptor = "I")
	public static int anInt1955;

	@OriginalMember(owner = "client!fb", name = "u", descriptor = "[I")
	public static final int[] anIntArray111 = new int[] { 1, -1, -1, 1 };

	@OriginalMember(owner = "client!fb", name = "A", descriptor = "[I")
	public static final int[] anIntArray112 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!fb", name = "F", descriptor = "Ljava/lang/String;")
	public static final String aString117 = "white:";

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(II)V")
	public static void method1790(@OriginalArg(1) int arg0) {
		Static289.anIntArray417 = new int[Static339.anInt6352];
		aByteArrayArrayArray9 = new byte[arg0][Static266.anInt5101][Static339.anInt6352];
		Static296.aByteArrayArrayArray26 = new byte[arg0][Static266.anInt5101 + 1][Static339.anInt6352 + 1];
		Static200.anIntArrayArrayArray17 = new int[arg0][Static266.anInt5101 + 1][Static339.anInt6352 + 1];
		Static171.aByteArrayArrayArray17 = new byte[arg0][Static266.anInt5101][Static339.anInt6352];
		Static344.anInt1080 = 99;
		Static250.anIntArray379 = new int[Static339.anInt6352];
		Static95.aByteArrayArrayArray30 = new byte[arg0][Static266.anInt5101][Static339.anInt6352];
		Static175.anIntArray264 = new int[Static339.anInt6352];
		Static162.anIntArray225 = new int[Static339.anInt6352];
		Static222.anIntArray313 = new int[5];
		Static152.aByteArrayArrayArray14 = new byte[arg0][Static266.anInt5101][Static339.anInt6352];
		Static133.anIntArray563 = new int[Static339.anInt6352];
		Static54.aByteArrayArrayArray6 = null;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(ZI)I")
	public static int method1791(@OriginalArg(1) int arg0) {
		@Pc(5) int local5 = 0;
		if (arg0 < 0 || arg0 >= 65536) {
			local5 += 16;
			arg0 >>>= 0x10;
		}
		if (arg0 >= 256) {
			local5 += 8;
			arg0 >>>= 0x8;
		}
		if (arg0 >= 16) {
			local5 += 4;
			arg0 >>>= 0x4;
		}
		if (arg0 >= 4) {
			arg0 >>>= 0x2;
			local5 += 2;
		}
		if (arg0 >= 1) {
			local5++;
			arg0 >>>= 0x1;
		}
		return local5 + arg0;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(BIII)I")
	public static int method1794(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if ((Static32.aByteArrayArrayArray4[arg1][arg2][arg0] & 0x8) == 0) {
			return arg1 <= 0 || (Static32.aByteArrayArrayArray4[1][arg2][arg0] & 0x2) == 0 ? arg1 : arg1 - 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method1795(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return;
		}
		@Pc(12) String local12 = Static334.method5595(arg0);
		if (local12 == null) {
			return;
		}
		for (@Pc(26) int local26 = 0; local26 < Static32.anInt859; local26++) {
			@Pc(34) String local34 = Static334.method5595(Static31.aStringArray1[local26]);
			if (local34 != null && local34.equals(local12)) {
				Static32.anInt859--;
				for (@Pc(46) int local46 = local26; local46 < Static32.anInt859; local46++) {
					Static31.aStringArray1[local46] = Static31.aStringArray1[local46 + 1];
					Static138.aStringArray15[local46] = Static138.aStringArray15[local46 + 1];
					Static44.aStringArray25[local46] = Static44.aStringArray25[local46 + 1];
					Static50.aStringArray5[local46] = Static50.aStringArray5[local46 + 1];
					Static62.aBooleanArray5[local46] = Static62.aBooleanArray5[local46 + 1];
				}
				Static1.anInt8 = Static211.anInt4205;
				Static335.aClass5_Sub1_Sub1_3.method174(201);
				Static335.aClass5_Sub1_Sub1_3.method1886(Static344.method954(arg0));
				Static335.aClass5_Sub1_Sub1_3.method1849(arg0);
				return;
			}
		}
	}
}
