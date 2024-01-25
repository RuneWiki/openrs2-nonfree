import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static138 {

	@OriginalMember(owner = "client!fk", name = "h", descriptor = "B")
	public static byte aByte33;

	@OriginalMember(owner = "client!fk", name = "m", descriptor = "Lclient!cw;")
	public static Class58 aClass58_1;

	@OriginalMember(owner = "client!fk", name = "f", descriptor = "Lclient!cb;")
	public static final Class42 aClass42_7 = new Class42(32);

	@OriginalMember(owner = "client!fk", name = "j", descriptor = "Z")
	public static boolean aBoolean184 = false;

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(II)V")
	public static void method2578(@OriginalArg(0) int arg0) {
		Static72.method1328();
		@Pc(17) int local17 = Static117.aClass287_1.method6723(arg0).anInt3465;
		if (local17 == 0) {
			return;
		}
		@Pc(28) int local28 = Static540.aClass242_1.anIntArray553[arg0];
		if (local17 == 6) {
			Static507.anInt8630 = local28;
		}
		if (local17 == 5) {
			Static325.anInt6252 = local28;
		}
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(Lclient!co;I)V")
	public static void method2579(@OriginalArg(0) Class5_Sub3 arg0) {
		if (arg0.aByteArray66.length - arg0.anInt4960 < 1) {
			return;
		}
		@Pc(24) int local24 = arg0.method4220();
		if (local24 < 0 || local24 > 1 || arg0.aByteArray66.length - arg0.anInt4960 < 2) {
			return;
		}
		@Pc(51) int local51 = arg0.method4227();
		if (arg0.aByteArray66.length - arg0.anInt4960 < local51 * 6) {
			return;
		}
		for (@Pc(68) int local68 = 0; local68 < local51; local68++) {
			@Pc(74) int local74 = arg0.method4227();
			@Pc(80) int local80 = arg0.method4230();
			if (local74 < Static481.anIntArray650.length && Static466.aBooleanArray34[local74] && (Static169.aClass116_1.method2926(local74).aChar1 != '1' || local80 >= -1 && local80 <= 1)) {
				Static481.anIntArray650[local74] = local80;
			}
		}
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(Z)V")
	public static void method2580() {
		Static314.aClass99_28.method2524();
		for (@Pc(13) Class5_Sub47 local13 = (Class5_Sub47) Static521.aClass99_78.method2526(); local13 != null; local13 = (Class5_Sub47) Static521.aClass99_78.method2519()) {
			if (local13.anInt8474 < 1000) {
				local13.method7425();
				Static314.aClass99_28.method2513(local13);
			}
		}
		Static314.aClass99_28.method2525(Static521.aClass99_78);
		if (Static257.anInt5147 <= 1) {
			Static148.aClass5_Sub47_1 = null;
		} else if (Static2.aBoolean3 && Static59.aClass18_1.method5977(81) && Static257.anInt5147 > 2) {
			Static148.aClass5_Sub47_1 = (Class5_Sub47) Static521.aClass99_78.aClass5_102.aClass5_283.aClass5_283;
		} else {
			Static148.aClass5_Sub47_1 = (Class5_Sub47) Static521.aClass99_78.aClass5_102.aClass5_283;
		}
		@Pc(71) int local71 = -1;
		@Pc(76) Class5_Sub42 local76 = (Class5_Sub42) Static483.aClass99_76.method2526();
		if (local76 != null) {
			local71 = local76.method7431();
		}
		if (!Static218.aBoolean250) {
			if (local71 == 0 && (Static325.anInt6252 == 1 && Static257.anInt5147 > 2 || Static136.method2573())) {
				local71 = 2;
			}
			if (local71 == 2 && Static257.anInt5147 > 0 && local76 != null) {
				if (Static499.aClass220_17 == null && Static464.anInt7969 == 0) {
					Static191.method5463(local76.method7432(), local76.method7433());
				} else {
					Static97.anInt2211 = 2;
				}
			}
			if (local71 == 0 && Static257.anInt5147 > 0) {
				Static468.method6571();
			}
			if (Static499.aClass220_17 == null && Static464.anInt7969 == 0) {
				Static411.aClass5_Sub47_3 = null;
				Static97.anInt2211 = 0;
				return;
			}
			return;
		}
		@Pc(163) int local163;
		@Pc(167) int local167;
		if (local71 == -1) {
			local163 = Static280.aClass214_1.method6766();
			local167 = Static280.aClass214_1.method6770();
			if (Static159.anInt3261 - 10 > local163 || Static142.anInt2984 + Static159.anInt3261 + 10 < local163 || local167 < Static122.anInt2575 - 10 || local167 > Static122.anInt2575 + Static221.anInt4157 + 10) {
				Static454.method6370();
			}
		}
		if (local71 != 0) {
			return;
		}
		local163 = Static159.anInt3261;
		local167 = Static122.anInt2575;
		@Pc(212) int local212 = Static142.anInt2984;
		@Pc(216) int local216 = local76.method7433();
		@Pc(220) int local220 = local76.method7432();
		@Pc(222) int local222 = -1;
		@Pc(241) int local241;
		for (@Pc(224) int local224 = 0; local224 < Static257.anInt5147; local224++) {
			if (Static8.aBoolean8) {
				local241 = local167 + (Static257.anInt5147 - local224 + -1) * 16 + 33;
				if (local163 < local216 && local163 + local212 > local216 && local241 - 13 < local220 && local220 < local241 + 4) {
					local222 = local224;
				}
			} else {
				local241 = (Static257.anInt5147 - local224 - 1) * 16 + local167 + 31;
				if (local216 > local163 && local216 < local163 + local212 && local220 > local241 - 13 && local241 + 3 > local220) {
					local222 = local224;
				}
			}
		}
		if (local222 != -1) {
			local241 = 0;
			@Pc(335) Class59 local335 = new Class59(Static521.aClass99_78);
			for (@Pc(340) Class5_Sub47 local340 = (Class5_Sub47) local335.method1397(); local340 != null; local340 = (Class5_Sub47) local335.method1396()) {
				if (local222 == local241) {
					Static164.method2921(local340, local220, local216);
				}
				local241++;
			}
		}
		Static454.method6370();
	}
}
