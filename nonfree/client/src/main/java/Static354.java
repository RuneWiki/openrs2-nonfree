import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static354 {

	@OriginalMember(owner = "client!ml", name = "ub", descriptor = "[S")
	public static short[] aShortArray80;

	@OriginalMember(owner = "client!ml", name = "tb", descriptor = "I")
	public static int anInt5551 = 0;

	@OriginalMember(owner = "client!ml", name = "Bc", descriptor = "I")
	public static int anInt5584 = -2;

	@OriginalMember(owner = "client!ml", name = "c", descriptor = "(I)Z")
	public static boolean method4749() {
		try {
			if (Static317.anInt5047 == 2) {
				if (Static388.aClass2_Sub42_1 == null) {
					Static388.aClass2_Sub42_1 = Static654.method6897(Static93.aClass380_31, Static74.anInt1268, Static468.anInt7474);
					if (Static388.aClass2_Sub42_1 == null) {
						return false;
					}
				}
				if (Static591.aClass195_1 == null) {
					Static591.aClass195_1 = new Class195(Static522.aClass380_117, Static501.aClass380_113);
				}
				@Pc(34) Class2_Sub13_Sub3 local34 = Static267.aClass2_Sub13_Sub3_3;
				if (Static527.aClass2_Sub13_Sub3_4 != null) {
					local34 = Static527.aClass2_Sub13_Sub3_4;
				}
				if (local34.method6140(Static68.aClass380_20, Static388.aClass2_Sub42_1, Static591.aClass195_1)) {
					Static267.aClass2_Sub13_Sub3_3 = local34;
					Static267.aClass2_Sub13_Sub3_3.method6117();
					@Pc(75) int local75;
					if (Static350.anInt5487 > 0) {
						Static317.anInt5047 = 3;
						Static267.aClass2_Sub13_Sub3_3.method6126(Static33.anInt738 >= Static350.anInt5487 ? Static350.anInt5487 : Static33.anInt738);
						for (local75 = 0; local75 < Static501.anIntArray574.length; local75++) {
							Static267.aClass2_Sub13_Sub3_3.method6133(Static501.anIntArray574[local75], local75);
							Static501.anIntArray574[local75] = 255;
						}
					} else {
						Static317.anInt5047 = 0;
						Static267.aClass2_Sub13_Sub3_3.method6126(Static33.anInt738);
						for (local75 = 0; local75 < Static501.anIntArray574.length; local75++) {
							Static267.aClass2_Sub13_Sub3_3.method6133(Static501.anIntArray574[local75], local75);
							Static501.anIntArray574[local75] = 255;
						}
					}
					if (Static527.aClass2_Sub13_Sub3_4 == null) {
						if (Static186.aLong141 <= 0L) {
							Static267.aClass2_Sub13_Sub3_3.method6150(Static140.aBoolean200, Static388.aClass2_Sub42_1);
						} else {
							Static267.aClass2_Sub13_Sub3_3.method6132(Static388.aClass2_Sub42_1, Static140.aBoolean200, Static186.aLong141);
						}
					}
					if (Static223.aClass35_2 != null) {
						Static223.aClass35_2.method2738(Static267.aClass2_Sub13_Sub3_3);
					}
					Static527.aClass2_Sub13_Sub3_4 = null;
					Static186.aLong141 = 0L;
					Static591.aClass195_1 = null;
					Static388.aClass2_Sub42_1 = null;
					Static93.aClass380_31 = null;
					return true;
				}
			}
		} catch (@Pc(168) Exception local168) {
			local168.printStackTrace();
			Static267.aClass2_Sub13_Sub3_3.method6136();
			Static591.aClass195_1 = null;
			Static388.aClass2_Sub42_1 = null;
			Static527.aClass2_Sub13_Sub3_4 = null;
			Static93.aClass380_31 = null;
			Static317.anInt5047 = 0;
		}
		return false;
	}
}
