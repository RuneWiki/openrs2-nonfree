import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static121 {

	@OriginalMember(owner = "client!vd", name = "s", descriptor = "Lclient!wd;")
	public static Class80 aClass80_1176 = Static2.method59(" Sekunde(Xn(Y -Ubertragen)3");

	@OriginalMember(owner = "client!vd", name = "t", descriptor = "I")
	public static int anInt3086 = 0;

	@OriginalMember(owner = "client!vd", name = "J", descriptor = "Lclient!wd;")
	private static Class80 aClass80_1183 = Static2.method59("Please wait)3)3)3");

	@OriginalMember(owner = "client!vd", name = "v", descriptor = "Lclient!wd;")
	public static Class80 aClass80_1177 = aClass80_1183;

	@OriginalMember(owner = "client!vd", name = "E", descriptor = "Lclient!wd;")
	private static Class80 aClass80_1182 = Static2.method59("Connection lost");

	@OriginalMember(owner = "client!vd", name = "x", descriptor = "Lclient!wd;")
	public static Class80 aClass80_1178 = aClass80_1182;

	@OriginalMember(owner = "client!vd", name = "z", descriptor = "[B")
	public static byte[] aByteArray39 = new byte[] { 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };

	@OriginalMember(owner = "client!vd", name = "A", descriptor = "Lclient!wd;")
	private static Class80 aClass80_1179 = Static2.method59("Loading)3)3)3");

	@OriginalMember(owner = "client!vd", name = "B", descriptor = "I")
	public static int anInt3090 = -1;

	@OriginalMember(owner = "client!vd", name = "hb", descriptor = "Lclient!wd;")
	private static Class80 aClass80_1186 = Static2.method59("button near the top of that page)3");

	@OriginalMember(owner = "client!vd", name = "C", descriptor = "Lclient!wd;")
	public static Class80 aClass80_1180 = aClass80_1186;

	@OriginalMember(owner = "client!vd", name = "D", descriptor = "Lclient!wd;")
	public static Class80 aClass80_1181 = aClass80_1183;

	@OriginalMember(owner = "client!vd", name = "H", descriptor = "I")
	public static int anInt3093 = -1;

	@OriginalMember(owner = "client!vd", name = "I", descriptor = "I")
	public static int anInt3094 = 0;

	@OriginalMember(owner = "client!vd", name = "M", descriptor = "Lclient!wd;")
	public static Class80 aClass80_1184 = aClass80_1179;

	@OriginalMember(owner = "client!vd", name = "ab", descriptor = "Lclient!wd;")
	public static Class80 aClass80_1185 = Static2.method59("-5berpr-Ufen Sie Ihr Mitteilungsfach)3");

	@OriginalMember(owner = "client!vd", name = "fb", descriptor = "[Z")
	public static boolean[] aBooleanArray15 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false };

	@OriginalMember(owner = "client!vd", name = "ib", descriptor = "Lclient!wd;")
	public static Class80 aClass80_1187 = Static2.method59("Lade)3)3)3");

	@OriginalMember(owner = "client!vd", name = "c", descriptor = "(B)V")
	public static void method1962() {
		if (Static44.aClass10_2 != null) {
			Static44.aClass10_2.method255();
			Static44.aClass10_2 = null;
		}
		Static71.method1138();
		Static93.aClass64_1.method1647();
		for (@Pc(18) int local18 = 0; local18 < 4; local18++) {
			Static17.aClass49Array1[local18].method1169();
		}
		System.gc();
		Static107.method1824();
		Static70.aBoolean132 = false;
		Static91.anInt2226 = -1;
		Static23.method472();
		Static10.method167(10);
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(BLclient!ce;I)V")
	public static void method1963(@OriginalArg(1) Class11_Sub1 arg0, @OriginalArg(2) int arg1) {
		if (Static124.aClass2_Sub17_6 == null) {
			Static31.method574((byte) 0, 255, 255, null, 0, true);
			Static18.aClass11_Sub1Array1[arg1] = arg0;
		} else {
			Static124.aClass2_Sub17_6.anInt2799 = arg1 * 4 + 5;
			@Pc(16) int local16 = Static124.aClass2_Sub17_6.method1747();
			arg0.method405(local16);
		}
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(IZBI)Lclient!wd;")
	public static Class80 method1964(@OriginalArg(1) boolean arg0, @OriginalArg(3) int arg1) {
		@Pc(19) int local19 = arg1 / 10;
		@Pc(21) int local21 = 1;
		while (local19 != 0) {
			local21++;
			local19 /= 10;
		}
		@Pc(35) int local35 = local21;
		if (arg1 < 0 || arg0) {
			local35 = local21 + 1;
		}
		@Pc(43) byte[] local43 = new byte[local35];
		if (arg1 < 0) {
			local43[0] = 45;
		} else if (arg0) {
			local43[0] = 43;
		}
		for (@Pc(59) int local59 = 0; local59 < local21; local59++) {
			@Pc(65) int local65 = arg1 % 10;
			arg1 /= 10;
			if (local65 < 0) {
				local65 = -local65;
			}
			if (local65 > 9) {
				local65 += 39;
			}
			local43[local35 - local59 - 1] = (byte) (local65 + 48);
		}
		@Pc(103) Class80 local103 = new Class80();
		local103.aByteArray40 = local43;
		local103.anInt3200 = local35;
		return local103;
	}

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "(I)Lclient!v;")
	public static Class2_Sub1_Sub9_Sub4 method1965() {
		@Pc(13) Class2_Sub1_Sub9_Sub4 local13 = new Class2_Sub1_Sub9_Sub4(Static40.anIntArray154, Static93.anIntArray314, Static86.anIntArray280, Static14.anIntArray65, Static9.aByteArrayArray2);
		Static35.method624();
		return local13;
	}

	@OriginalMember(owner = "client!vd", name = "d", descriptor = "(B)V")
	public static void method1966() {
		aClass80_1181 = null;
		aClass80_1185 = null;
		aByteArray39 = null;
		aClass80_1178 = null;
		aClass80_1177 = null;
		aClass80_1179 = null;
		aClass80_1186 = null;
		aBooleanArray15 = null;
		aClass80_1176 = null;
		aClass80_1183 = null;
		aClass80_1187 = null;
		aClass80_1180 = null;
		aClass80_1182 = null;
		aClass80_1184 = null;
	}
}
