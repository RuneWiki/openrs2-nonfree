import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static123 {

	@OriginalMember(owner = "client!eg", name = "d", descriptor = "[[B")
	public static byte[][] aByteArrayArray10;

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "Z")
	public static boolean aBoolean250 = true;

	@OriginalMember(owner = "client!eg", name = "g", descriptor = "Z")
	public static boolean aBoolean251 = false;

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(I)V")
	public static void method2957() {
		Static553.method8248(Static612.aClass24_17);
		Static170.anInt10313++;
		if (Static172.aBoolean307 && Static133.aBoolean254) {
			@Pc(26) int local26 = 0;
			@Pc(28) int local28 = 0;
			if (Static487.aBoolean676) {
				local26 = Static465.method7210();
				local28 = Static207.method4090();
			}
			@Pc(42) int local42 = local26 + Static628.aClass9_1.method803();
			@Pc(48) int local48 = local28 + Static628.aClass9_1.method800();
			local48 -= Static505.anInt9315;
			local42 -= Static257.anInt5500;
			if (local42 < Static146.anInt3560) {
				local42 = Static146.anInt3560;
			}
			if (local42 + Static612.aClass24_17.anInt441 > Static146.anInt3560 - -Static102.aClass24_7.anInt441) {
				local42 = Static102.aClass24_7.anInt441 + Static146.anInt3560 - Static612.aClass24_17.anInt441;
			}
			if (local48 < Static239.anInt5180) {
				local48 = Static239.anInt5180;
			}
			if (Static612.aClass24_17.anInt488 + local48 > Static239.anInt5180 - -Static102.aClass24_7.anInt488) {
				local48 = Static239.anInt5180 + Static102.aClass24_7.anInt488 - Static612.aClass24_17.anInt488;
			}
			@Pc(119) int local119 = local42 + Static102.aClass24_7.anInt463 - Static146.anInt3560;
			@Pc(127) int local127 = local48 + Static102.aClass24_7.anInt467 - Static239.anInt5180;
			@Pc(179) Class2_Sub44 local179;
			if (Static628.aClass9_1.method799()) {
				if (Static612.aClass24_17.anInt438 < Static170.anInt10313) {
					@Pc(218) int local218 = local42 - Static626.anInt1466;
					@Pc(223) int local223 = local48 - Static399.anInt7613;
					if (Static612.aClass24_17.anInt455 < local218 || -Static612.aClass24_17.anInt455 > local218 || local223 > Static612.aClass24_17.anInt455 || -Static612.aClass24_17.anInt455 > local223) {
						Static630.aBoolean747 = true;
					}
				}
				if (Static612.aClass24_17.anObjectArray27 != null && Static630.aBoolean747) {
					local179 = new Class2_Sub44();
					local179.aClass24_15 = Static612.aClass24_17;
					local179.anInt9077 = local119;
					local179.anObjectArray32 = Static612.aClass24_17.anObjectArray27;
					local179.anInt9083 = local127;
					Static284.method5153(local179);
				}
			} else {
				if (Static630.aBoolean747) {
					Static117.method2902();
					if (Static612.aClass24_17.anObjectArray7 != null) {
						local179 = new Class2_Sub44();
						local179.aClass24_14 = Static320.aClass24_13;
						local179.anInt9077 = local119;
						local179.anObjectArray32 = Static612.aClass24_17.anObjectArray7;
						local179.anInt9083 = local127;
						local179.aClass24_15 = Static612.aClass24_17;
						Static284.method5153(local179);
					}
					if (Static320.aClass24_13 != null && Static76.method2238(Static612.aClass24_17) != null) {
						Static16.method337(Static612.aClass24_17, Static320.aClass24_13);
					}
				} else if ((Static578.anInt8192 == 1 || Static578.method7000()) && Static298.anInt6262 > 2) {
					Static327.method5619(Static626.anInt1466 + Static257.anInt5500, Static505.anInt9315 - -Static399.anInt7613);
				} else if (Static192.method3945()) {
					Static327.method5619(Static626.anInt1466 + Static257.anInt5500, Static505.anInt9315 + Static399.anInt7613);
				}
				Static612.aClass24_17 = null;
			}
		} else if (Static170.anInt10313 > 1) {
			Static612.aClass24_17 = null;
		}
	}
}
