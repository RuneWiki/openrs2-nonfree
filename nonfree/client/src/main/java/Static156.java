import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static156 {

	@OriginalMember(owner = "client!te", name = "Z", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1880 = Static122.method531("Verbindung mit Update)2Server)3)3)3");

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(BI)Z")
	public static boolean method2509(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return false;
		}
		@Pc(16) int local16 = Static176.anIntArray419[arg0];
		if (local16 >= 2000) {
			local16 -= 2000;
		}
		return local16 == 1004;
	}

	@OriginalMember(owner = "client!te", name = "f", descriptor = "(I)V")
	public static void method2510() {
		aClass73_1880 = null;
	}

	@OriginalMember(owner = "client!te", name = "g", descriptor = "(I)V")
	public static void method2511() {
		for (@Pc(3) int local3 = 0; local3 < Static181.anInt3975; local3++) {
			@Pc(9) int local9 = Static2.anIntArray1[local3];
			@Pc(13) Class3_Sub1_Sub4_Sub7_Sub2 local13 = Static112.aClass3_Sub1_Sub4_Sub7_Sub2Array1[local9];
			@Pc(17) int local17 = Static159.aClass3_Sub12_Sub1_4.method1354();
			if ((local17 & 0x40) != 0) {
				local13.anInt3148 = Static159.aClass3_Sub12_Sub1_4.method1381();
				local13.anInt3136 = Static159.aClass3_Sub12_Sub1_4.method1359();
			}
			if ((local17 & 0x4) != 0) {
				local13.anInt3145 = Static159.aClass3_Sub12_Sub1_4.method1377();
				if (local13.anInt3145 == 65535) {
					local13.anInt3145 = -1;
				}
			}
			@Pc(71) int local71;
			if ((local17 & 0x20) != 0) {
				local13.anInt3149 = Static159.aClass3_Sub12_Sub1_4.method1352();
				local71 = Static159.aClass3_Sub12_Sub1_4.method1349();
				if (local13.anInt3149 == 65535) {
					local13.anInt3149 = -1;
				}
				local13.anInt3176 = (local71 & 0xFFFF) + Static44.anInt1024;
				local13.anInt3162 = 0;
				local13.anInt3157 = local71 >> 16;
				local13.anInt3189 = 0;
				if (Static44.anInt1024 < local13.anInt3176) {
					local13.anInt3189 = -1;
				}
			}
			if ((local17 & 0x10) != 0) {
				local13.aClass3_Sub1_Sub10_1 = Static164.method2578(Static159.aClass3_Sub12_Sub1_4.method1377());
				local13.anInt3154 = local13.aClass3_Sub1_Sub10_1.anInt1581;
				local13.anInt3144 = local13.aClass3_Sub1_Sub10_1.anInt1569;
				local13.anInt3142 = local13.aClass3_Sub1_Sub10_1.anInt1564;
				local13.anInt3171 = local13.aClass3_Sub1_Sub10_1.anInt1559;
				local13.anInt3155 = local13.aClass3_Sub1_Sub10_1.anInt1565;
				local13.anInt3168 = local13.aClass3_Sub1_Sub10_1.anInt1557;
				local13.anInt3140 = local13.aClass3_Sub1_Sub10_1.anInt1556;
				local13.anInt3180 = local13.aClass3_Sub1_Sub10_1.anInt1555;
				local13.anInt3161 = local13.aClass3_Sub1_Sub10_1.anInt1562;
			}
			if ((local17 & 0x1) != 0) {
				local13.aClass73_1747 = Static159.aClass3_Sub12_Sub1_4.method1390();
				local13.anInt3170 = 100;
			}
			@Pc(186) int local186;
			if ((local17 & 0x8) != 0) {
				local71 = Static159.aClass3_Sub12_Sub1_4.method1381();
				local186 = Static159.aClass3_Sub12_Sub1_4.method1347();
				if (local71 == 65535) {
					local71 = -1;
				}
				if (local13.anInt3184 == local71 && local71 != -1) {
					@Pc(210) int local210 = Static98.method1697(local71).anInt1321;
					if (local210 == 1) {
						local13.anInt3187 = 0;
						local13.anInt3164 = 0;
						local13.anInt3173 = local186;
						local13.anInt3172 = 0;
					}
					if (local210 == 2) {
						local13.anInt3187 = 0;
					}
				} else if (local71 == -1 || local13.anInt3184 == -1 || Static98.method1697(local71).anInt1325 >= Static98.method1697(local13.anInt3184).anInt1325) {
					local13.anInt3172 = 0;
					local13.anInt3184 = local71;
					local13.anInt3187 = 0;
					local13.anInt3135 = local13.anInt3160;
					local13.anInt3173 = local186;
					local13.anInt3164 = 0;
				}
			}
			if ((local17 & 0x2) != 0) {
				local71 = Static159.aClass3_Sub12_Sub1_4.method1378();
				local186 = Static159.aClass3_Sub12_Sub1_4.method1378();
				local13.method2265(local71, local186, Static44.anInt1024);
				local13.anInt3137 = Static44.anInt1024 + 300;
				local13.anInt3186 = Static159.aClass3_Sub12_Sub1_4.method1347();
				local13.anInt3150 = Static159.aClass3_Sub12_Sub1_4.method1378();
			}
			if ((local17 & 0x80) != 0) {
				local71 = Static159.aClass3_Sub12_Sub1_4.method1387();
				local186 = Static159.aClass3_Sub12_Sub1_4.method1387();
				local13.method2265(local71, local186, Static44.anInt1024);
				local13.anInt3137 = Static44.anInt1024 + 300;
				local13.anInt3186 = Static159.aClass3_Sub12_Sub1_4.method1347();
				local13.anInt3150 = Static159.aClass3_Sub12_Sub1_4.method1354();
			}
		}
	}
}
