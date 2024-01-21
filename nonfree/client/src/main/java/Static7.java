import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static7 {

	@OriginalMember(owner = "client!ba", name = "h", descriptor = "Lclient!oa;")
	public static Class1_Sub1_Sub5_Sub3 aClass1_Sub1_Sub5_Sub3_2;

	@OriginalMember(owner = "client!ba", name = "l", descriptor = "Z")
	public static boolean aBoolean20;

	@OriginalMember(owner = "client!ba", name = "o", descriptor = "[Lclient!rd;")
	public static Class64[] aClass64Array3;

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "Lclient!rd;")
	private static Class64 aClass64_238 = Static69.method1153("Please close the interface you have open before using (Wreport abuse(W");

	@OriginalMember(owner = "client!ba", name = "c", descriptor = "Lclient!rd;")
	private static Class64 aClass64_239 = Static69.method1153("Error loading your profile)3");

	@OriginalMember(owner = "client!ba", name = "d", descriptor = "Lclient!rd;")
	public static Class64 aClass64_240 = aClass64_239;

	@OriginalMember(owner = "client!ba", name = "f", descriptor = "I")
	public static int anInt325 = 0;

	@OriginalMember(owner = "client!ba", name = "g", descriptor = "Lclient!rd;")
	private static Class64 aClass64_241 = Static69.method1153(" is already on your friend list");

	@OriginalMember(owner = "client!ba", name = "j", descriptor = "Lclient!rd;")
	public static Class64 aClass64_242 = aClass64_238;

	@OriginalMember(owner = "client!ba", name = "k", descriptor = "Lclient!rd;")
	private static Class64 aClass64_243 = Static69.method1153("yellow:");

	@OriginalMember(owner = "client!ba", name = "m", descriptor = "Lclient!rd;")
	public static Class64 aClass64_244 = aClass64_243;

	@OriginalMember(owner = "client!ba", name = "n", descriptor = "Lclient!rd;")
	public static Class64 aClass64_245 = aClass64_241;

	@OriginalMember(owner = "client!ba", name = "p", descriptor = "Lclient!rd;")
	public static Class64 aClass64_246 = Static69.method1153("mapdots");

	@OriginalMember(owner = "client!ba", name = "q", descriptor = "Lclient!rd;")
	public static Class64 aClass64_247 = Static69.method1153("Spiel)2Engine wird gestartet)3)3)3");

	@OriginalMember(owner = "client!ba", name = "r", descriptor = "[I")
	public static int[] anIntArray48 = new int[50];

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lclient!ua;[Lclient!nc;I[BII)V")
	public static void method214(@OriginalArg(0) Class68 arg0, @OriginalArg(1) Class52[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(5) int arg4) {
		@Pc(10) Class1_Sub6 local10 = new Class1_Sub6(arg3);
		@Pc(12) int local12 = -1;
		while (true) {
			@Pc(16) int local16 = local10.method1844();
			if (local16 == 0) {
				return;
			}
			local12 += local16;
			@Pc(27) int local27 = 0;
			while (true) {
				@Pc(31) int local31 = local10.method1844();
				if (local31 == 0) {
					break;
				}
				local27 += local31 - 1;
				@Pc(45) int local45 = local27 >> 6 & 0x3F;
				@Pc(49) int local49 = local27 & 0x3F;
				@Pc(53) int local53 = local10.method1837();
				@Pc(57) int local57 = local27 >> 12;
				@Pc(61) int local61 = local53 >> 2;
				@Pc(65) int local65 = local53 & 0x3;
				@Pc(70) int local70 = local45 + arg2;
				@Pc(74) int local74 = arg4 + local49;
				if (local70 > 0 && local74 > 0 && local70 < 103 && local74 < 103) {
					@Pc(93) int local93 = local57;
					@Pc(95) Class52 local95 = null;
					if ((Static18.aByteArrayArrayArray2[1][local70][local74] & 0x2) == 2) {
						local93 = local57 - 1;
					}
					if (local93 >= 0) {
						local95 = arg1[local93];
					}
					Static13.method288(local74, local61, local57, arg0, local95, local65, local12, local70);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(ZIIZZ)Lclient!ke;")
	public static Class41_Sub1 method215(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) boolean arg3) {
		@Pc(1) Class16 local1 = null;
		if (Static6.aClass8_1 != null) {
			local1 = new Class16(arg1, Static6.aClass8_1, Static20.aClass8Array1[arg1], 1000000);
		}
		return new Class41_Sub1(local1, Static57.aClass16_1, arg1, arg2, arg3, arg0);
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(B)V")
	public static void method216() {
		if (Static35.aString1.toLowerCase().indexOf("microsoft") != -1) {
			Static87.anIntArray292[219] = 42;
			Static87.anIntArray292[221] = 43;
			Static87.anIntArray292[220] = 74;
			Static87.anIntArray292[192] = 58;
			Static87.anIntArray292[186] = 57;
			Static87.anIntArray292[187] = 27;
			Static87.anIntArray292[189] = 26;
			Static87.anIntArray292[188] = 71;
			Static87.anIntArray292[191] = 73;
			Static87.anIntArray292[190] = 72;
			Static87.anIntArray292[223] = 28;
			Static87.anIntArray292[222] = 59;
			return;
		}
		Static87.anIntArray292[92] = 74;
		Static87.anIntArray292[93] = 43;
		Static87.anIntArray292[45] = 26;
		Static87.anIntArray292[47] = 73;
		Static87.anIntArray292[61] = 27;
		Static87.anIntArray292[59] = 57;
		Static87.anIntArray292[44] = 71;
		if (Static35.aMethod1 == null) {
			Static87.anIntArray292[222] = 59;
			Static87.anIntArray292[192] = 58;
		} else {
			Static87.anIntArray292[192] = 28;
			Static87.anIntArray292[520] = 59;
			Static87.anIntArray292[222] = 58;
		}
		Static87.anIntArray292[46] = 72;
		Static87.anIntArray292[91] = 42;
	}

	@OriginalMember(owner = "client!ba", name = "b", descriptor = "(B)V")
	public static void method217() {
		aClass64_246 = null;
		aClass64_240 = null;
		aClass64Array3 = null;
		aClass64_241 = null;
		anIntArray48 = null;
		aClass64_238 = null;
		aClass1_Sub1_Sub5_Sub3_2 = null;
		aClass64_245 = null;
		aClass64_239 = null;
		aClass64_243 = null;
		aClass64_242 = null;
		aClass64_247 = null;
		aClass64_244 = null;
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIII)V")
	public static void method218(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(13) Class1_Sub1_Sub11 local13 = Static75.method1258(arg2, arg1);
		if (local13 != null && local13.anObjectArray10 != null) {
			Static67.method1134(local13.anObjectArray10, 0, 0, 0, null, local13);
		}
		Static64.anInt1482 = arg1;
		Static103.aBoolean143 = true;
		Static18.anInt582 = arg0;
		Static114.anInt2740 = arg2;
	}
}
