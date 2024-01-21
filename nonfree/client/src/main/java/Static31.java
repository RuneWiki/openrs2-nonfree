import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static31 {

	@OriginalMember(owner = "client!dd", name = "db", descriptor = "I")
	public static int anInt838;

	@OriginalMember(owner = "client!dd", name = "N", descriptor = "Lclient!nd;")
	public static Class59 aClass59_6 = new Class59(5);

	@OriginalMember(owner = "client!dd", name = "O", descriptor = "Lclient!tg;")
	public static Class81 aClass81_283 = Static120.method2057("Passwort: ");

	@OriginalMember(owner = "client!dd", name = "P", descriptor = "Lclient!tg;")
	private static Class81 aClass81_284 = Static120.method2057("To create a new account you need to");

	@OriginalMember(owner = "client!dd", name = "ab", descriptor = "Lclient!tg;")
	public static Class81 aClass81_285 = aClass81_284;

	@OriginalMember(owner = "client!dd", name = "bb", descriptor = "Lclient!th;")
	public static Class1_Sub22 aClass1_Sub22_1 = new Class1_Sub22(0, 0);

	@OriginalMember(owner = "client!dd", name = "cb", descriptor = "[S")
	public static short[] aShortArray4 = new short[] { -10304, 9104, -1, -1, -1 };

	@OriginalMember(owner = "client!dd", name = "eb", descriptor = "Lclient!rh;")
	public static Class77 aClass77_5 = null;

	@OriginalMember(owner = "client!dd", name = "fb", descriptor = "Lclient!tg;")
	private static Class81 aClass81_286 = Static120.method2057("Unable to find ");

	@OriginalMember(owner = "client!dd", name = "gb", descriptor = "Lclient!tg;")
	public static Class81 aClass81_287 = aClass81_286;

	@OriginalMember(owner = "client!dd", name = "hb", descriptor = "I")
	public static int anInt839 = -1;

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIIIII)V")
	public static void method677(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (Static35.anInt963 == arg1 && Static98.anInt2164 == arg2 && (Static77.anInt1824 == arg0 || !Static50.aBoolean45)) {
			return;
		}
		Static35.anInt963 = arg1;
		Static77.anInt1824 = arg0;
		if (!Static50.aBoolean45) {
			Static77.anInt1824 = 0;
		}
		Static98.anInt2164 = arg2;
		Static142.method2392(25);
		Static63.method1116(true, Static71.aClass81_597);
		@Pc(50) int local50 = Static114.anInt2140;
		Static114.anInt2140 = (arg2 - 6) * 8;
		@Pc(60) int local60 = Static114.anInt2140 - local50;
		@Pc(62) int local62 = Static51.anInt1219;
		Static51.anInt1219 = (arg1 - 6) * 8;
		@Pc(74) int local74 = Static51.anInt1219 - local62;
		for (@Pc(78) int local78 = 0; local78 < 32768; local78++) {
			@Pc(84) Class1_Sub2_Sub1_Sub3_Sub2 local84 = Static48.aClass1_Sub2_Sub1_Sub3_Sub2Array11[local78];
			if (local84 != null) {
				for (@Pc(88) int local88 = 0; local88 < 10; local88++) {
					local84.anIntArray326[local88] -= local74;
					local84.anIntArray324[local88] -= local60;
				}
				local84.anInt3026 -= local60 * 128;
				local84.anInt3040 -= local74 * 128;
			}
		}
		for (@Pc(132) int local132 = 0; local132 < 2048; local132++) {
			@Pc(138) Class1_Sub2_Sub1_Sub3_Sub1 local138 = Static51.aClass1_Sub2_Sub1_Sub3_Sub1Array1[local132];
			if (local138 != null) {
				for (@Pc(142) int local142 = 0; local142 < 10; local142++) {
					local138.anIntArray326[local142] -= local74;
					local138.anIntArray324[local142] -= local60;
				}
				local138.anInt3026 -= local60 * 128;
				local138.anInt3040 -= local74 * 128;
			}
		}
		Static44.anInt1086 = arg0;
		Static43.aClass1_Sub2_Sub1_Sub3_Sub1_1.method2362(arg4, arg3, false);
		@Pc(196) byte local196 = 104;
		@Pc(198) byte local198 = 0;
		@Pc(200) byte local200 = 1;
		@Pc(202) byte local202 = 104;
		if (local74 < 0) {
			local198 = 103;
			local196 = -1;
			local200 = -1;
		}
		@Pc(212) byte local212 = 1;
		@Pc(214) byte local214 = 0;
		if (local60 < 0) {
			local214 = 103;
			local202 = -1;
			local212 = -1;
		}
		for (@Pc(224) int local224 = local198; local224 != local196; local224 += local200) {
			for (@Pc(228) int local228 = local214; local228 != local202; local228 += local212) {
				@Pc(234) int local234 = local60 + local228;
				@Pc(239) int local239 = local224 + local74;
				for (@Pc(241) int local241 = 0; local241 < 4; local241++) {
					if (local239 >= 0 && local234 >= 0 && local239 < 104 && local234 < 104) {
						Static139.aClass30ArrayArrayArray1[local241][local224][local228] = Static139.aClass30ArrayArrayArray1[local241][local239][local234];
					} else {
						Static139.aClass30ArrayArrayArray1[local241][local224][local228] = null;
					}
				}
			}
		}
		for (@Pc(311) Class1_Sub23 local311 = (Class1_Sub23) Static70.aClass30_11.method1115(); local311 != null; local311 = (Class1_Sub23) Static70.aClass30_11.method1125()) {
			local311.anInt3739 -= local60;
			local311.anInt3742 -= local74;
			if (local311.anInt3742 < 0 || local311.anInt3739 < 0 || local311.anInt3742 >= 104 || local311.anInt3739 >= 104) {
				local311.method3134();
			}
		}
		Static81.anInt1859 = 0;
		Static184.aBoolean171 = false;
		Static168.anInt3903 = -1;
		if (Static37.anInt977 != 0) {
			Static37.anInt977 -= local74;
			Static135.anInt2049 -= local60;
		}
		Static47.aClass30_8.method1118();
		Static6.aClass30_3.method1118();
	}

	@OriginalMember(owner = "client!dd", name = "g", descriptor = "(I)V")
	public static void method678() {
		aClass59_6 = null;
		aClass81_284 = null;
		aClass81_286 = null;
		aClass81_287 = null;
		aClass77_5 = null;
		aClass81_283 = null;
		aClass81_285 = null;
		aShortArray4 = null;
		aClass1_Sub22_1 = null;
	}
}
