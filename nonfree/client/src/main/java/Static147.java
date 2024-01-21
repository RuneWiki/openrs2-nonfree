import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static147 {

	@OriginalMember(owner = "client!qg", name = "Z", descriptor = "Lclient!bc;")
	public static Class1 aClass1_26;

	@OriginalMember(owner = "client!qg", name = "bb", descriptor = "I")
	public static int anInt3287;

	@OriginalMember(owner = "client!qg", name = "sb", descriptor = "I")
	public static int anInt3300;

	@OriginalMember(owner = "client!qg", name = "ub", descriptor = "Lclient!sa;")
	public static Class3_Sub1_Sub4_Sub4 aClass3_Sub1_Sub4_Sub4_31;

	@OriginalMember(owner = "client!qg", name = "db", descriptor = "Lclient!rd;")
	private static final Class80 aClass80_1282 = Static120.method1824("No reply from loginserver)3");

	@OriginalMember(owner = "client!qg", name = "fb", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_1283 = Static120.method1824("hint_mapedge");

	@OriginalMember(owner = "client!qg", name = "mb", descriptor = "Lclient!rd;")
	public static Class80 aClass80_1284 = aClass80_1282;

	@OriginalMember(owner = "client!qg", name = "ob", descriptor = "I")
	public static int anInt3297 = 0;

	@OriginalMember(owner = "client!qg", name = "qb", descriptor = "Lclient!rd;")
	private static final Class80 aClass80_1285 = Static120.method1824("Press (Wchange your password(W on front page)3");

	@OriginalMember(owner = "client!qg", name = "wb", descriptor = "I")
	public static int anInt3303 = 0;

	@OriginalMember(owner = "client!qg", name = "xb", descriptor = "Lclient!rd;")
	public static Class80 aClass80_1286 = aClass80_1285;

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(Lclient!rd;ILclient!rd;I)V")
	public static void method2354(@OriginalArg(0) Class80 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class80 arg2) {
		Static86.method1249(arg2, null, arg1, arg0);
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(Z)V")
	public static void method2356() {
		for (@Pc(12) int local12 = 0; local12 < Static66.anInt1437; local12++) {
			@Pc(18) int local18 = Static145.anIntArray411[local12]--;
			if (Static145.anIntArray411[local12] >= -10) {
				@Pc(89) Class75 local89 = Static159.aClass75Array1[local12];
				if (local89 == null) {
					local89 = Static203.method2080(Static67.aClass1_Sub1_10, Static82.anIntArray215[local12], 0);
					if (local89 == null) {
						continue;
					}
					Static145.anIntArray411[local12] += local89.method2082();
					Static159.aClass75Array1[local12] = local89;
				}
				if (Static145.anIntArray411[local12] < 0) {
					@Pc(214) int local214;
					if (Static106.anIntArray303[local12] == 0) {
						local214 = Static5.anInt201;
					} else {
						@Pc(133) int local133 = (Static106.anIntArray303[local12] & 0xFF) * 128;
						@Pc(141) int local141 = Static106.anIntArray303[local12] >> 8 & 0xFF;
						@Pc(151) int local151 = local141 * 128 + 64 - Static156.aClass3_Sub1_Sub5_Sub4_Sub2_1.anInt4315;
						if (local151 < 0) {
							local151 = -local151;
						}
						@Pc(164) int local164 = Static106.anIntArray303[local12] >> 16 & 0xFF;
						@Pc(174) int local174 = local164 * 128 + 64 - Static156.aClass3_Sub1_Sub5_Sub4_Sub2_1.anInt4329;
						if (local174 < 0) {
							local174 = -local174;
						}
						@Pc(188) int local188 = local174 + local151 - 128;
						if (local188 > local133) {
							Static145.anIntArray411[local12] = -100;
							continue;
						}
						if (local188 < 0) {
							local188 = 0;
						}
						local214 = Static29.anInt739 * (local133 - local188) / local133;
					}
					if (local214 > 0) {
						@Pc(225) Class3_Sub19_Sub1 local225 = local89.method2079().method1922(Static162.aClass15_1);
						@Pc(230) Class3_Sub4_Sub4 local230 = Static202.method2005(local225, local214);
						local230.method1994(Static17.anIntArray63[local12] - 1);
						Static152.aClass3_Sub4_Sub2_2.method1516(local230);
					}
					Static145.anIntArray411[local12] = -100;
				}
			} else {
				Static66.anInt1437--;
				for (@Pc(32) int local32 = local12; local32 < Static66.anInt1437; local32++) {
					Static82.anIntArray215[local32] = Static82.anIntArray215[local32 + 1];
					Static159.aClass75Array1[local32] = Static159.aClass75Array1[local32 + 1];
					Static17.anIntArray63[local32] = Static17.anIntArray63[local32 + 1];
					Static145.anIntArray411[local32] = Static145.anIntArray411[local32 + 1];
					Static106.anIntArray303[local32] = Static106.anIntArray303[local32 + 1];
				}
				local12--;
			}
		}
		if (Static124.aBoolean108 && !Static102.method1536()) {
			if (Static187.anInt4245 != 0 && Static151.anInt3396 != -1) {
				Static92.method2211(Static102.aClass1_Sub1_17, Static187.anInt4245, Static151.anInt3396);
			}
			Static124.aBoolean108 = false;
		} else if (Static187.anInt4245 != 0 && Static151.anInt3396 != -1 && !Static102.method1536()) {
			Static146.aClass3_Sub17_Sub1_3.method2146(167);
			Static146.aClass3_Sub17_Sub1_3.method2131(Static151.anInt3396);
			Static151.anInt3396 = -1;
		}
	}

	@OriginalMember(owner = "client!qg", name = "f", descriptor = "(B)[Lclient!sa;")
	public static Class3_Sub1_Sub4_Sub4[] method2357() {
		@Pc(8) Class3_Sub1_Sub4_Sub4[] local8 = new Class3_Sub1_Sub4_Sub4[Static64.anInt1391];
		for (@Pc(10) int local10 = 0; local10 < Static64.anInt1391; local10++) {
			@Pc(19) Class3_Sub1_Sub4_Sub4 local19 = new Class3_Sub1_Sub4_Sub4();
			local19.anInt3598 = Static175.anInt3951;
			local19.anInt3603 = anInt3287;
			local19.anInt3601 = Static49.anIntArray152[local10];
			local19.anInt3600 = Static17.anIntArray64[local10];
			local19.anInt3602 = Static86.anIntArray220[local10];
			local19.anInt3599 = Static27.anIntArray523[local10];
			@Pc(49) byte[] local49 = Static167.aByteArrayArray10[local10];
			@Pc(55) int local55 = local19.anInt3602 * local19.anInt3599;
			local19.anIntArray449 = new int[local55];
			for (@Pc(61) int local61 = 0; local61 < local55; local61++) {
				local19.anIntArray449[local61] = Static101.anIntArray288[local49[local61] & 0xFF];
			}
			local8[local10] = local19;
		}
		Static164.method2645();
		return local8;
	}
}
