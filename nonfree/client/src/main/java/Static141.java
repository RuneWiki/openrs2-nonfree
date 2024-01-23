import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static141 {

	@OriginalMember(owner = "client!la", name = "a", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray4;

	@OriginalMember(owner = "client!la", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString142;

	@OriginalMember(owner = "client!la", name = "e", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray12 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!la", name = "f", descriptor = "I")
	public static int anInt3028 = 0;

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(I)V")
	public static void method2471() {
		if (Static292.aClass115_17 != null || Static23.aClass115_3 != null) {
			return;
		}
		@Pc(18) int local18 = Static246.anInt5126;
		@Pc(87) int local87;
		@Pc(93) int local93;
		if (!Static299.aBoolean203) {
			if (local18 == 1 && Static216.anInt4481 > 0) {
				@Pc(36) short local36 = Static289.aShortArray93[Static216.anInt4481 - 1];
				if (local36 == 57 || local36 == 18 || local36 == 33 || local36 == 49 || local36 == 7 || local36 == 40 || local36 == 4 || local36 == 2 || local36 == 30 || local36 == 23 || local36 == 47 || local36 == 1003) {
					local87 = Static163.anIntArray262[Static216.anInt4481 - 1];
					local93 = Static55.anIntArray97[Static216.anInt4481 - 1];
					@Pc(97) Class115 local97 = Static90.method1692(local93);
					@Pc(100) Class2_Sub11 local100 = Static35.method708(local97);
					if (local100.method1317() || local100.method1314()) {
						Static219.aBoolean384 = false;
						Static221.anInt4606 = 0;
						if (Static292.aClass115_17 != null) {
							Static298.method4263(Static292.aClass115_17);
						}
						Static292.aClass115_17 = Static90.method1692(local93);
						Static140.anInt3024 = Static122.anInt2587;
						Static173.anInt3684 = Static199.anInt4139;
						Static91.anInt2033 = local87;
						Static298.method4263(Static292.aClass115_17);
						return;
					}
				}
			}
			if (local18 == 1 && (Static109.anInt2341 == 1 && Static216.anInt4481 > 2 || Static146.method2585(Static216.anInt4481 - 1))) {
				local18 = 2;
			}
			if (local18 == 2 && Static216.anInt4481 > 0 || Static155.anInt6185 == 1) {
				Static119.method2205();
			}
			if (local18 == 1 && Static216.anInt4481 > 0 || Static155.anInt6185 == 2) {
				Static34.method1664();
			}
			return;
		}
		@Pc(189) int local189;
		if (local18 != 1) {
			local87 = Static238.anInt4852;
			local189 = Static86.anInt1911;
			if (Static221.anInt4607 - 10 > local189 || Static297.anInt6219 + Static221.anInt4607 + 10 < local189 || local87 < Static243.anInt3779 - 10 || Static243.anInt3779 + Static63.anInt1431 + 10 < local87) {
				Static299.aBoolean203 = false;
				Static121.method2215(Static63.anInt1431, Static221.anInt4607, Static243.anInt3779, Static297.anInt6219);
			}
		}
		if (local18 != 1) {
			return;
		}
		local189 = Static221.anInt4607;
		local87 = Static243.anInt3779;
		local93 = Static297.anInt6219;
		@Pc(247) int local247 = Static199.anInt4139;
		@Pc(249) int local249 = -1;
		@Pc(251) int local251 = Static122.anInt2587;
		for (@Pc(253) int local253 = 0; local253 < Static216.anInt4481; local253++) {
			@Pc(270) int local270;
			if (Static201.aBoolean347) {
				local270 = (Static216.anInt4481 - local253 - 1) * 15 + local87 + 33;
				if (local189 < local247 && local189 + local93 > local247 && local270 - 13 < local251 && local270 + 3 > local251) {
					local249 = local253;
				}
			} else {
				local270 = local87 + (-local253 + Static216.anInt4481 + -1) * 15 + 31;
				if (local189 < local247 && local247 < local93 + local189 && local251 > local270 - 13 && local270 + 3 > local251) {
					local249 = local253;
				}
			}
		}
		if (local249 != -1) {
			Static137.method2427(local249);
		}
		Static299.aBoolean203 = false;
		Static121.method2215(Static63.anInt1431, Static221.anInt4607, Static243.anInt3779, Static297.anInt6219);
	}

	@OriginalMember(owner = "client!la", name = "b", descriptor = "(I)V")
	public static void method2473() {
		if (Static219.aBoolean385) {
			return;
		}
		Static230.aBoolean329 = true;
		Static219.aBoolean385 = true;
		if (Static236.aBoolean408) {
			Static142.aFloat31 = (int) Static142.aFloat31 - 65 & 0xFFFFFF80;
		} else {
			Static21.aFloat3 += (-24.0F - Static21.aFloat3) / 2.0F;
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(II)V")
	public static void method2474(@OriginalArg(0) int arg0) {
		@Pc(4) Class2_Sub3_Sub16 local4 = Static119.method2204(arg0, 5);
		local4.method2719();
	}
}
