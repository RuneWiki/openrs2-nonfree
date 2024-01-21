import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static126 {

	@OriginalMember(owner = "client!od", name = "g", descriptor = "[I")
	public static int[] anIntArray310;

	@OriginalMember(owner = "client!od", name = "d", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1081 = Static161.method2971("mapscene");

	@OriginalMember(owner = "client!od", name = "f", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1082 = Static161.method2971("Ihre Freunde)2Liste ist voll(Q Mitglieder k-Onnen 200 Freunde hinzuf-Ugen)1 freie Spieler nur 100)3");

	@OriginalMember(owner = "client!od", name = "h", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1083 = Static161.method2971("sl_stars");

	@OriginalMember(owner = "client!od", name = "l", descriptor = "[I")
	public static int[] anIntArray312 = new int[1000];

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(Z)Z")
	public static boolean method2303() {
		try {
			if (Static48.anInt1535 == 2) {
				if (Static95.aClass1_Sub25_1 == null) {
					Static95.aClass1_Sub25_1 = Static195.method3064(Static115.aClass4_74, Static179.anInt4046, Static102.anInt2843);
					if (Static95.aClass1_Sub25_1 == null) {
						return false;
					}
				}
				if (Static84.aClass72_1 == null) {
					Static84.aClass72_1 = new Class72(Static170.aClass4_99, Static110.aClass4_73);
				}
				if (Static74.aClass1_Sub12_Sub4_1.method2637(Static95.aClass1_Sub25_1, Static18.aClass4_28, Static84.aClass72_1)) {
					Static74.aClass1_Sub12_Sub4_1.method2651();
					Static74.aClass1_Sub12_Sub4_1.method2656(Static23.anInt1010);
					Static74.aClass1_Sub12_Sub4_1.method2652(Static171.aBoolean308, Static95.aClass1_Sub25_1);
					Static48.anInt1535 = 0;
					Static84.aClass72_1 = null;
					Static115.aClass4_74 = null;
					Static95.aClass1_Sub25_1 = null;
					return true;
				}
			}
		} catch (@Pc(58) Exception local58) {
			local58.printStackTrace();
			Static74.aClass1_Sub12_Sub4_1.method2666();
			Static95.aClass1_Sub25_1 = null;
			Static84.aClass72_1 = null;
			Static115.aClass4_74 = null;
			Static48.anInt1535 = 0;
		}
		return false;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(ILclient!fd;ILclient!ba;III)V")
	public static void method2304(@OriginalArg(1) Class20 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class1_Sub2_Sub1_Sub3 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg2 == null) {
			return;
		}
		@Pc(12) int local12 = Static79.anInt2241 + Static2.anInt101 & 0x7FF;
		@Pc(24) int local24 = Math.max(arg0.anInt1559 / 2, arg0.anInt1603 / 2) + 10;
		@Pc(32) int local32 = arg3 * arg3 + arg5 * arg5;
		if (local32 > local24 * local24) {
			return;
		}
		@Pc(42) int local42 = Class1_Sub2_Sub1_Sub2.anIntArray38[local12];
		@Pc(50) int local50 = local42 * 256 / (Static60.anInt1871 + 256);
		@Pc(54) int local54 = Class1_Sub2_Sub1_Sub2.anIntArray41[local12];
		@Pc(62) int local62 = local54 * 256 / (Static60.anInt1871 + 256);
		@Pc(72) int local72 = arg3 * local50 - arg5 * local62 >> 16;
		@Pc(82) int local82 = arg3 * local62 + arg5 * local50 >> 16;
		arg2.method415(local82 + arg0.anInt1559 / 2 + arg1 - arg2.anInt354 / 2, -local72 + arg4 - (-(arg0.anInt1603 / 2) + arg2.anInt356 / 2), arg0.anIntArray173, arg0.anIntArray172);
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(Ljava/lang/String;I)Lclient!dd;")
	public static Class13 method2305(@OriginalArg(0) String arg0) {
		@Pc(9) byte[] local9;
		try {
			local9 = arg0.getBytes("ISO-8859-1");
		} catch (@Pc(11) UnsupportedEncodingException local11) {
			local9 = arg0.getBytes();
		}
		@Pc(18) Class13 local18 = new Class13();
		local18.anInt1080 = 0;
		local18.aByteArray19 = local9;
		for (@Pc(31) int local31 = 0; local31 < local9.length; local31++) {
			if (local9[local31] != 0) {
				local9[local18.anInt1080++] = local9[local31];
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(I)V")
	public static void method2306() {
		anIntArray312 = null;
		aClass13_1083 = null;
		aClass13_1082 = null;
		aClass13_1081 = null;
		anIntArray310 = null;
	}

	@OriginalMember(owner = "client!od", name = "b", descriptor = "(I)V")
	public static void method2307() {
		Static84.aClass47_16.method1995();
	}

	@OriginalMember(owner = "client!od", name = "b", descriptor = "(II)V")
	public static void method2308(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static46.aBooleanArray25[arg0]) {
			return;
		}
		Static62.aClass4_62.method2249(arg0);
		if (Static145.aClass20ArrayArray1[arg0] == null) {
			return;
		}
		@Pc(27) boolean local27 = true;
		for (@Pc(29) int local29 = 0; local29 < Static145.aClass20ArrayArray1[arg0].length; local29++) {
			if (Static145.aClass20ArrayArray1[arg0][local29] != null) {
				if (Static145.aClass20ArrayArray1[arg0][local29].anInt1619 == 2) {
					local27 = false;
				} else {
					Static145.aClass20ArrayArray1[arg0][local29] = null;
				}
			}
		}
		if (local27) {
			Static145.aClass20ArrayArray1[arg0] = null;
		}
		Static46.aBooleanArray25[arg0] = false;
	}
}
