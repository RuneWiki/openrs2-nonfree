import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static102 {

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "I")
	public static int anInt3020;

	@OriginalMember(owner = "client!ub", name = "c", descriptor = "Lclient!fc;")
	public static Class21 aClass21_21;

	@OriginalMember(owner = "client!ub", name = "k", descriptor = "Lclient!fb;")
	public static Class20 aClass20_4;

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "Lclient!rc;")
	public static Class55 aClass55_1268 = Static34.method846("Lade Konfiguration )2 ");

	@OriginalMember(owner = "client!ub", name = "f", descriptor = "I")
	public static int anInt3022 = 10;

	@OriginalMember(owner = "client!ub", name = "n", descriptor = "[I")
	public static int[] anIntArray286 = new int[200];

	@OriginalMember(owner = "client!ub", name = "o", descriptor = "Lclient!rc;")
	private static Class55 aClass55_1269 = Static34.method846("Ok");

	@OriginalMember(owner = "client!ub", name = "s", descriptor = "Lclient!rc;")
	public static Class55 aClass55_1270 = aClass55_1269;

	@OriginalMember(owner = "client!ub", name = "t", descriptor = "[I")
	public static int[] anIntArray287 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!ub", name = "u", descriptor = "[I")
	public static int[] anIntArray288 = new int[2048];

	@OriginalMember(owner = "client!ub", name = "w", descriptor = "I")
	public static int anInt3029 = 0;

	@OriginalMember(owner = "client!ub", name = "C", descriptor = "I")
	public static int anInt3033 = 0;

	@OriginalMember(owner = "client!ub", name = "E", descriptor = "Lclient!rc;")
	private static Class55 aClass55_1271 = Static34.method846("Too many connections from your address)3");

	@OriginalMember(owner = "client!ub", name = "F", descriptor = "Lclient!rc;")
	public static Class55 aClass55_1272 = Static34.method846("sind fehlgeschlagen)3 Bitte warten Sie 5 Minuten)1");

	@OriginalMember(owner = "client!ub", name = "L", descriptor = "Lclient!rc;")
	public static Class55 aClass55_1273 = aClass55_1271;

	@OriginalMember(owner = "client!ub", name = "N", descriptor = "Lclient!rc;")
	public static Class55 aClass55_1274 = Static34.method846("Ignorieren");

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(IZIIII)Lclient!eb;")
	public static Class6_Sub2_Sub2_Sub2 method1950(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(25) long local25 = ((long) arg1 << 16) + ((long) arg3 - (-((long) arg4 << 38) - ((long) arg2 << 40)));
		@Pc(38) Class6_Sub2_Sub2_Sub2 local38;
		if (!arg0) {
			local38 = (Class6_Sub2_Sub2_Sub2) Static58.aClass36_22.method1154(local25);
			if (local38 != null) {
				return local38;
			}
		}
		@Pc(48) Class6_Sub2_Sub5 local48 = Static58.method1195(arg3);
		if (arg1 > 1 && local48.anIntArray68 != null) {
			@Pc(56) int local56 = -1;
			for (@Pc(58) int local58 = 0; local58 < 10; local58++) {
				if (arg1 >= local48.anIntArray67[local58] && local48.anIntArray67[local58] != 0) {
					local56 = local48.anIntArray68[local58];
				}
			}
			if (local56 != -1) {
				local48 = Static58.method1195(local56);
			}
		}
		@Pc(98) Class6_Sub2_Sub3_Sub3 local98 = local48.method692(1, true);
		if (local98 == null) {
			return null;
		}
		@Pc(104) Class6_Sub2_Sub2_Sub2 local104 = null;
		if (local48.anInt1091 != -1) {
			local104 = method1950(true, 10, 0, local48.anInt1082, 1);
			if (local104 == null) {
				return null;
			}
		}
		@Pc(124) int[] local124 = Static53.anIntArray180;
		@Pc(126) int local126 = Static53.anInt1865;
		@Pc(128) int local128 = Static53.anInt1863;
		@Pc(130) int local130 = Static53.anInt1862;
		@Pc(132) int local132 = Static53.anInt1860;
		@Pc(134) int local134 = Static53.anInt1861;
		@Pc(136) int local136 = Static53.anInt1864;
		@Pc(138) int[] local138 = Static30.method791();
		@Pc(140) int local140 = Static30.anInt1195;
		@Pc(142) int local142 = Static30.anInt1189;
		local38 = new Class6_Sub2_Sub2_Sub2(36, 32);
		Static53.method1278(local38.anIntArray62, 36, 32);
		Static114.anIntArray313 = Static30.method790(Static114.anIntArray313);
		Static53.method1276(0, 0, 36, 32, 0);
		Static30.aBoolean52 = false;
		Static30.method782(16, 16);
		@Pc(170) int local170 = local48.anInt1105;
		if (arg0) {
			local170 = (int) ((double) local170 * 1.5D);
		} else if (arg4 == 2) {
			local170 = (int) ((double) local170 * 1.04D);
		}
		@Pc(200) int local200 = local170 * Class6_Sub2_Sub2_Sub3.anIntArray73[local48.anInt1108] >> 16;
		@Pc(209) int local209 = local170 * Class6_Sub2_Sub2_Sub3.anIntArray77[local48.anInt1108] >> 16;
		local98.method970();
		local98.method952(local48.anInt1106, local48.anInt1068, local48.anInt1108, local48.anInt1072, local209 + local98.anInt3206 / 2 + local48.anInt1067, local48.anInt1067 + local200);
		if (arg4 >= 1) {
			local38.method635(1);
		}
		if (arg4 >= 2) {
			local38.method635(16777215);
		}
		if (arg2 != 0) {
			local38.method637(arg2);
		}
		Static53.method1278(local38.anIntArray62, 36, 32);
		if (local48.anInt1091 != -1) {
			local104.method646(0, 0);
		}
		if (!arg0 && (local48.anInt1084 == 1 || arg1 != 1)) {
			Static71.aClass6_Sub2_Sub2_Sub4_3.method1303(Static19.method586(arg1), 1, 10, 1);
			Static71.aClass6_Sub2_Sub2_Sub4_3.method1303(Static19.method586(arg1), 0, 9, 16776960);
		}
		if (!arg0) {
			Static58.aClass36_22.method1161(local25, local38);
		}
		Static53.method1278(local124, local126, local128);
		Static53.method1277(local132, local130, local136, local134);
		Static30.method790(local138);
		Static30.anInt1189 = local142;
		Static30.anInt1195 = local140;
		Static30.method788();
		Static30.aBoolean52 = true;
		return local38;
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(B)V")
	public static void method1954() {
		Static13.aByteArrayArrayArray4 = null;
		Static9.anIntArray28 = null;
		Static20.aByteArrayArrayArray6 = null;
		Static110.anIntArray299 = null;
		Static14.anIntArrayArrayArray2 = null;
		Static54.aByteArrayArrayArray9 = null;
		Static31.anIntArrayArray3 = null;
		Static35.anIntArray83 = null;
		Static20.aByteArrayArrayArray7 = null;
		Static101.anIntArray284 = null;
		Static51.anIntArray158 = null;
		Static106.aByteArrayArrayArray14 = null;
	}

	@OriginalMember(owner = "client!ub", name = "c", descriptor = "(B)V")
	public static void method1957() {
		anIntArray288 = null;
		aClass55_1272 = null;
		aClass55_1269 = null;
		aClass55_1273 = null;
		aClass21_21 = null;
		aClass55_1274 = null;
		aClass20_4 = null;
		aClass55_1268 = null;
		aClass55_1270 = null;
		anIntArray287 = null;
		aClass55_1271 = null;
		anIntArray286 = null;
	}
}
