import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static160 {

	@OriginalMember(owner = "client!gd", name = "o", descriptor = "F")
	public static float aFloat62;

	@OriginalMember(owner = "client!gd", name = "x", descriptor = "Lclient!lfa;")
	public static Class207 aClass207_1;

	@OriginalMember(owner = "client!gd", name = "e", descriptor = "D")
	public static double aDouble1 = -1.0D;

	@OriginalMember(owner = "client!gd", name = "m", descriptor = "I")
	public static final int anInt3549 = 0;

	@OriginalMember(owner = "client!gd", name = "t", descriptor = "Lclient!cu;")
	public static final Class61 aClass61_37 = new Class61(44, 8);

	@OriginalMember(owner = "client!gd", name = "w", descriptor = "I")
	public static int anInt3554 = -1;

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(III)Z")
	public static boolean method3163(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x70000) != 0 | Static440.method6237(arg0, arg1) || Static442.method6257(arg0, arg1);
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIII)I")
	public static int method3164(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static112.aClass16Array3 == null) {
			return 0;
		}
		@Pc(11) int local11 = arg0 >> 9;
		@Pc(15) int local15 = arg2 >> 9;
		if (local11 < 0 || local15 < 0 || local11 > Static38.anInt740 - 1 || Static38.anInt741 - 1 < local15) {
			return 0;
		}
		@Pc(48) int local48 = arg1;
		if (arg1 < 3 && (Static97.aByteArrayArrayArray19[1][local11][local15] & 0x2) != 0) {
			local48 = arg1 + 1;
		}
		return Static112.aClass16Array3[local48].sa(arg0, arg2);
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(B)V")
	public static void method3165() {
		Static330.method4950(Static287.aClass115_12);
		Static302.anInt5525++;
		if (Static6.aBoolean5 && Static347.aBoolean454) {
			@Pc(26) int local26 = Static86.aClass50_1.method7100();
			@Pc(30) int local30 = Static86.aClass50_1.method7102();
			local26 -= Static399.anInt6953;
			local30 -= Static563.anInt9432;
			if (local26 < Static129.anInt2966) {
				local26 = Static129.anInt2966;
			}
			if (Static107.aClass115_13.anInt3474 + Static129.anInt2966 < local26 + Static287.aClass115_12.anInt3474) {
				local26 = Static129.anInt2966 + Static107.aClass115_13.anInt3474 - Static287.aClass115_12.anInt3474;
			}
			if (Static200.anInt4233 > local30) {
				local30 = Static200.anInt4233;
			}
			if (local30 + Static287.aClass115_12.anInt3481 > Static107.aClass115_13.anInt3481 + Static200.anInt4233) {
				local30 = Static200.anInt4233 + Static107.aClass115_13.anInt3481 - Static287.aClass115_12.anInt3481;
			}
			@Pc(104) int local104 = Static107.aClass115_13.anInt3485 + local26 - Static129.anInt2966;
			@Pc(111) int local111 = Static107.aClass115_13.anInt3526 + local30 - Static200.anInt4233;
			@Pc(126) Class4_Sub12 local126;
			if (Static86.aClass50_1.method7101()) {
				if (Static302.anInt5525 > Static287.aClass115_12.anInt3480) {
					@Pc(206) int local206 = local26 - Static125.anInt2918;
					@Pc(211) int local211 = local30 - Static61.anInt1147;
					if (local206 > Static287.aClass115_12.anInt3507 || local206 < -Static287.aClass115_12.anInt3507 || local211 > Static287.aClass115_12.anInt3507 || local211 < -Static287.aClass115_12.anInt3507) {
						Static320.aBoolean429 = true;
					}
				}
				if (Static287.aClass115_12.anObjectArray31 != null && Static320.aBoolean429) {
					local126 = new Class4_Sub12();
					local126.anObjectArray3 = Static287.aClass115_12.anObjectArray31;
					local126.aClass115_5 = Static287.aClass115_12;
					local126.anInt2447 = local104;
					local126.anInt2451 = local111;
					Static205.method3636(local126);
				}
			} else {
				if (Static320.aBoolean429) {
					Static400.method5802();
					if (Static287.aClass115_12.anObjectArray6 != null) {
						local126 = new Class4_Sub12();
						local126.anObjectArray3 = Static287.aClass115_12.anObjectArray6;
						local126.anInt2447 = local104;
						local126.aClass115_5 = Static287.aClass115_12;
						local126.aClass115_4 = Static149.aClass115_7;
						local126.anInt2451 = local111;
						Static205.method3636(local126);
					}
					if (Static149.aClass115_7 != null && Static69.method1234(Static287.aClass115_12) != null) {
						Static23.method435(Static287.aClass115_12, Static149.aClass115_7);
					}
				} else if ((Static7.anInt104 == 1 || Static317.method4845()) && Static300.anInt5730 > 2) {
					Static303.method4689(Static399.anInt6953 + Static125.anInt2918, Static61.anInt1147 + Static563.anInt9432);
				} else if (Static122.method6948()) {
					Static303.method4689(Static125.anInt2918 + Static399.anInt6953, Static61.anInt1147 + Static563.anInt9432);
				}
				Static287.aClass115_12 = null;
			}
		} else if (Static302.anInt5525 > 1) {
			Static287.aClass115_12 = null;
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(Ljava/lang/String;II)V")
	public static void method3167(@OriginalArg(0) String arg0) {
		Static410.method5899("", "", arg0, 4, "", 0);
	}
}
