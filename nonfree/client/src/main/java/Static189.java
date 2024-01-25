import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static189 {

	@OriginalMember(owner = "client!mi", name = "d", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray6;

	@OriginalMember(owner = "client!mi", name = "e", descriptor = "I")
	public static int anInt4072 = 0;

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(I)I")
	public static int method3685() {
		if (Static28.aClass12_3 == null) {
			if (!Static146.aBoolean308 && Static115.anInt2635 > 0) {
				if (Static39.aBoolean120 && Static57.aClass171_1.method4638(81) && Static115.anInt2635 > 2) {
					return ((Class1_Sub23) Static188.aClass16_22.aClass1_25.aClass1_251.aClass1_251).anInt3591;
				}
				return ((Class1_Sub23) Static188.aClass16_22.aClass1_25.aClass1_251).anInt3591;
			}
			@Pc(18) int local18 = Static222.aClass84_1.method5408();
			@Pc(22) int local22 = Static222.aClass84_1.method5406();
			@Pc(24) int local24 = Static210.anInt4473;
			@Pc(26) int local26 = Static339.anInt6506;
			@Pc(28) int local28 = Static198.anInt1219;
			if (local24 < local18 && local18 < local28 + local24) {
				@Pc(38) int local38 = -1;
				@Pc(57) int local57;
				for (@Pc(40) int local40 = 0; local40 < Static115.anInt2635; local40++) {
					if (Static337.aBoolean630) {
						local57 = (Static115.anInt2635 - local40 - 1) * 16 + local26 + 33;
						if (local22 > local57 - 13 && local57 + 3 >= local22) {
							local38 = local40;
						}
					} else {
						local57 = (Static115.anInt2635 - local40 - 1) * 16 + local26 + 31;
						if (local57 - 13 < local22 && local22 <= local57 + 3) {
							local38 = local40;
						}
					}
				}
				if (local38 != -1) {
					local57 = 0;
					@Pc(118) Class183 local118 = new Class183(Static188.aClass16_22);
					for (@Pc(123) Class1_Sub23 local123 = (Class1_Sub23) local118.method4850(); local123 != null; local123 = (Class1_Sub23) local118.method4847()) {
						if (local57++ == local38) {
							return local123.anInt3591;
						}
					}
				}
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(B)Z")
	public static boolean method3686() {
		try {
			if (Static33.anInt1108 == 2) {
				if (Static295.aClass1_Sub5_2 == null) {
					Static295.aClass1_Sub5_2 = Static358.method333(Static70.aClass216_23, Static28.anInt1014, Static103.anInt2461);
					if (Static295.aClass1_Sub5_2 == null) {
						return false;
					}
				}
				if (Static314.aClass107_1 == null) {
					Static314.aClass107_1 = new Class107(Static291.aClass216_90, Static214.aClass216_73);
				}
				if (Static37.aClass1_Sub1_Sub1_1.method45(Static46.aClass216_11, Static295.aClass1_Sub5_2, Static314.aClass107_1)) {
					Static37.aClass1_Sub1_Sub1_1.method26();
					Static37.aClass1_Sub1_Sub1_1.method43(Static188.anInt4068);
					Static37.aClass1_Sub1_Sub1_1.method40(Static285.aBoolean421, Static295.aClass1_Sub5_2);
					Static33.anInt1108 = 0;
					Static70.aClass216_23 = null;
					Static295.aClass1_Sub5_2 = null;
					Static314.aClass107_1 = null;
					return true;
				}
			}
		} catch (@Pc(64) Exception local64) {
			local64.printStackTrace();
			Static37.aClass1_Sub1_Sub1_1.method41();
			Static70.aClass216_23 = null;
			Static314.aClass107_1 = null;
			Static33.anInt1108 = 0;
			Static295.aClass1_Sub5_2 = null;
		}
		return false;
	}

	@OriginalMember(owner = "client!mi", name = "b", descriptor = "(Z)V")
	public static void method3688() {
		Static28.aClass87_6.method2485();
	}
}
