import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static147 {

	@OriginalMember(owner = "client!pa", name = "b", descriptor = "I")
	public static int anInt3347;

	@OriginalMember(owner = "client!pa", name = "h", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray9;

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "Lclient!i;")
	public static Class41 aClass41_926 = Static184.method2923(")2");

	@OriginalMember(owner = "client!pa", name = "d", descriptor = "I")
	public static int anInt3349 = 0;

	@OriginalMember(owner = "client!pa", name = "g", descriptor = "Lclient!i;")
	public static Class41 aClass41_927 = Static184.method2923("<img=1>");

	@OriginalMember(owner = "client!pa", name = "i", descriptor = "Lclient!i;")
	public static Class41 aClass41_928 = Static184.method2923("Lade Benutzeroberfl-=che )2 ");

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(ZB)V")
	public static void method2312(@OriginalArg(0) boolean arg0) {
		if (Static213.aClass12_Sub3_Sub1_1.anInt3961 >> 7 == Static102.anInt2490 && Static125.anInt1524 == Static213.aClass12_Sub3_Sub1_1.anInt3949 >> 7) {
			Static102.anInt2490 = 0;
		}
		@Pc(25) int local25 = Static50.anInt2126;
		if (arg0) {
			local25 = 1;
		}
		for (@Pc(31) int local31 = 0; local31 < local25; local31++) {
			@Pc(46) Class12_Sub3_Sub1 local46;
			@Pc(53) long local53;
			if (arg0) {
				local53 = 8791798054912L;
				local46 = Static213.aClass12_Sub3_Sub1_1;
			} else {
				local46 = Static216.aClass12_Sub3_Sub1Array1[Static156.anIntArray386[local31]];
				local53 = (long) Static156.anIntArray386[local31] << 32;
			}
			if (local46 != null && local46.method2727()) {
				@Pc(70) int local70 = local46.anInt3961 >> 7;
				local46.aBoolean59 = false;
				if ((Static217.aBoolean290 && Static50.anInt2126 > 50 || Static50.anInt2126 > 200) && !arg0 && local46.anInt3934 == local46.anInt3935) {
					local46.aBoolean59 = true;
				}
				@Pc(98) int local98 = local46.anInt3949 >> 7;
				if (local70 >= 0 && local70 < 104 && local98 >= 0 && local98 < 104) {
					if (local46.aClass12_Sub2_1 == null || Static103.anInt2511 < local46.anInt1210 || Static103.anInt2511 >= local46.anInt1215) {
						if ((local46.anInt3961 & 0x7F) == 64 && (local46.anInt3949 & 0x7F) == 64) {
							if (Static186.anInt4273 == Static137.anIntArrayArray27[local70][local98]) {
								continue;
							}
							Static137.anIntArrayArray27[local70][local98] = Static186.anInt4273;
						}
						local46.anInt3926 = Static212.method3261(local46.anInt3961, local46.anInt3949, Static134.anInt3147);
						Static111.method1899(Static134.anInt3147, local46.anInt3961, local46.anInt3949, local46.anInt3926, 60, local46, local46.anInt3916, local53, local46.aBoolean243);
					} else {
						local46.aBoolean59 = false;
						local46.anInt3926 = Static212.method3261(local46.anInt3961, local46.anInt3949, Static134.anInt3147);
						Static111.method1895(Static134.anInt3147, local46.anInt3961, local46.anInt3949, local46.anInt3926, local46, local46.anInt3916, local53, local46.anInt1217, local46.anInt1198, local46.anInt1200, local46.anInt1201);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(I)Lclient!rh;")
	public static Class60_Sub1 method2313() {
		@Pc(25) Class60_Sub1 local25 = new Class60_Sub1(Static14.anInt415, Static114.anInt2772, Static219.anIntArray501[0], Static120.anIntArray310[0], Static89.anIntArray224[0], Static60.anIntArray498[0], Static102.aByteArrayArray6[0], Static25.anIntArray494);
		Static212.method3255();
		return local25;
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(BLclient!i;)Z")
	public static boolean method2314(@OriginalArg(1) Class41 arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(11) int local11 = 0; local11 < Static60.anInt4785; local11++) {
			if (arg0.method1413(Static131.aClass41Array44[local11])) {
				return true;
			}
		}
		return false;
	}
}
