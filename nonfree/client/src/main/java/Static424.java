import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static424 {

	@OriginalMember(owner = "client!rh", name = "n", descriptor = "[[Lclient!oh;")
	public static Class220[][] aClass220ArrayArray2;

	@OriginalMember(owner = "client!rh", name = "c", descriptor = "J")
	public static long aLong208 = 0L;

	@OriginalMember(owner = "client!rh", name = "g", descriptor = "Lclient!id;")
	public static final Class142 aClass142_18 = new Class142("", 14);

	@OriginalMember(owner = "client!rh", name = "i", descriptor = "Z")
	public static boolean aBoolean533 = false;

	@OriginalMember(owner = "client!rh", name = "r", descriptor = "Z")
	public static boolean aBoolean534 = false;

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(Z)Z")
	public static boolean method6086(@OriginalArg(0) boolean arg0) {
		for (@Pc(1) int local1 = Static179.anInt3489; local1 < Static460.anInt7893; local1++) {
			@Pc(6) Class37[][] local6 = Static152.aClass37ArrayArrayArray1[local1];
			for (@Pc(9) int local9 = -Static479.anInt8261; local9 <= 0; local9++) {
				@Pc(14) int local14 = Static489.anInt8410 + local9;
				@Pc(18) int local18 = Static489.anInt8410 - local9;
				if (local14 >= Static45.anInt1000 || local18 < Static546.anInt9152) {
					for (@Pc(27) int local27 = -Static479.anInt8261; local27 <= 0; local27++) {
						@Pc(32) int local32 = Static461.anInt7924 + local27;
						@Pc(36) int local36 = Static461.anInt7924 - local27;
						@Pc(48) Class37 local48;
						if (local14 >= Static45.anInt1000) {
							if (local32 >= Static226.anInt5120) {
								local48 = local6[local14][local32];
								if (local48 != null && local48.aBoolean57) {
									Static539.aBoolean659 = arg0;
									Static535.aClass2_1.method3047(local48);
									Static535.aClass2_1.method3039();
								}
							}
							if (local36 < Static243.anInt4911) {
								local48 = local6[local14][local36];
								if (local48 != null && local48.aBoolean57) {
									Static539.aBoolean659 = arg0;
									Static535.aClass2_1.method3047(local48);
									Static535.aClass2_1.method3039();
								}
							}
						}
						if (local18 < Static546.anInt9152) {
							if (local32 >= Static226.anInt5120) {
								local48 = local6[local18][local32];
								if (local48 != null && local48.aBoolean57) {
									Static539.aBoolean659 = arg0;
									Static535.aClass2_1.method3047(local48);
									Static535.aClass2_1.method3039();
								}
							}
							if (local36 < Static243.anInt4911) {
								local48 = local6[local18][local36];
								if (local48 != null && local48.aBoolean57) {
									Static539.aBoolean659 = arg0;
									Static535.aClass2_1.method3047(local48);
									Static535.aClass2_1.method3039();
								}
							}
						}
						if (Static432.anInt7595 == 0) {
							if (Static537.aBoolean655) {
								Static535.aClass2_1.method3043(24);
							}
							return true;
						}
					}
				}
			}
		}
		return false;
	}
}
