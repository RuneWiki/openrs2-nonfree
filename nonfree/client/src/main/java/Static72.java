import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static72 {

	@OriginalMember(owner = "client!f", name = "Sc", descriptor = "I")
	public static int anInt1599 = 0;

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(Lclient!fh;Lclient!ke;IZLclient!fh;)V")
	public static void method1171(@OriginalArg(0) Class58 arg0, @OriginalArg(1) Class4_Sub3_Sub5_Sub2 arg1, @OriginalArg(4) Class58 arg2) {
		Static171.aClass58_75 = arg2;
		Static213.aClass58_81 = arg0;
		Static43.aBoolean200 = true;
		@Pc(11) int local11 = Static213.aClass58_81.method1351() - 1;
		Static188.anInt6076 = local11 * 256 + Static213.aClass58_81.method1371(local11);
		Static18.aClass4_Sub3_Sub5_Sub2_1 = arg1;
		Static249.aStringArray26 = new String[] { null, null, null, null, Static92.aString115 };
		Static257.aStringArray29 = new String[] { null, null, Static15.aString26, null, null };
	}

	@OriginalMember(owner = "client!f", name = "f", descriptor = "(I)V")
	public static void method1172() {
		Static68.aClass26_12.method515();
		Static138.aClass26_27.method515();
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(IIB)Z")
	public static boolean method1176(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!Static18.aBoolean17) {
			return false;
		}
		@Pc(13) int local13 = arg0 >> 16;
		@Pc(17) int local17 = arg0 & 0xFFFF;
		if (Static188.aClass189ArrayArray115[local13] == null || Static188.aClass189ArrayArray115[local13][local17] == null) {
			return false;
		}
		@Pc(37) Class189 local37 = Static188.aClass189ArrayArray115[local13][local17];
		@Pc(48) int local48;
		if (arg1 == -1 && local37.anInt5915 == 0) {
			for (local48 = 0; local48 < Static300.anInt5638; local48++) {
				if (Static262.aShortArray100[local48] == 1 || Static262.aShortArray100[local48] == 1009 || Static262.aShortArray100[local48] == 34 || Static262.aShortArray100[local48] == 23 || Static262.aShortArray100[local48] == 3) {
					for (@Pc(148) Class189 local148 = Static114.method1814(Static262.anIntArray543[local48]); local148 != null; local148 = Static183.method2955(local148)) {
						if (local148.anInt5918 == local37.anInt5918) {
							return true;
						}
					}
				}
			}
		} else {
			for (local48 = 0; local48 < Static300.anInt5638; local48++) {
				if (Static73.anIntArray117[local48] == arg1 && local37.anInt5918 == Static262.anIntArray543[local48] && (Static262.aShortArray100[local48] == 1 || Static262.aShortArray100[local48] == 1009 || Static262.aShortArray100[local48] == 34 || Static262.aShortArray100[local48] == 23 || Static262.aShortArray100[local48] == 3)) {
					return true;
				}
			}
		}
		return false;
	}
}
