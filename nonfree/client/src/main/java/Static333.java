import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static333 {

	@OriginalMember(owner = "client!qp", name = "e", descriptor = "I")
	public static int anInt5712;

	@OriginalMember(owner = "client!qp", name = "h", descriptor = "Lclient!bu;")
	public static Class32 aClass32_72;

	@OriginalMember(owner = "client!qp", name = "j", descriptor = "[I")
	public static final int[] anIntArray380 = new int[] { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(B)V")
	public static void method4463() {
		Static286.aClass44_2.method3065();
		for (@Pc(10) int local10 = 0; local10 < 32; local10++) {
			Static189.aLongArray8[local10] = 0L;
		}
		for (@Pc(22) int local22 = 0; local22 < 32; local22++) {
			Static374.aLongArray9[local22] = 0L;
		}
		Static233.anInt4468 = 0;
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(IIII)V")
	public static void method4467(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 == 0) {
			Static30.method641(Static38.aClass217_19);
		}
		if (arg1 == 1) {
			Static30.method641(Static10.aClass217_3);
		}
		Static302.aClass3_Sub7_Sub1_2.method2633(Static263.aClass10_1.method301(82) ? 1 : 0);
		Static302.aClass3_Sub7_Sub1_2.method2587(arg0 + Static57.anInt5085);
		Static302.aClass3_Sub7_Sub1_2.method2614(arg2 + Static223.anInt7618);
		Static78.anInt1944 = arg2;
		Static312.anInt5522 = arg0;
		Static246.aBoolean407 = false;
		Static39.method761();
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(Z)Z")
	public static boolean method4468(@OriginalArg(0) boolean arg0) {
		for (@Pc(1) int local1 = Static430.anInt3308; local1 < Static362.anInt6122; local1++) {
			@Pc(6) Class118[][] local6 = Static263.aClass118ArrayArrayArray2[local1];
			for (@Pc(9) int local9 = -Static80.anInt2001; local9 <= 0; local9++) {
				@Pc(14) int local14 = Static310.anInt5498 + local9;
				@Pc(18) int local18 = Static310.anInt5498 - local9;
				if (local14 >= Static295.anInt5287 || local18 < Static415.anInt6801) {
					for (@Pc(27) int local27 = -Static80.anInt2001; local27 <= 0; local27++) {
						@Pc(32) int local32 = Static111.anInt2450 + local27;
						@Pc(36) int local36 = Static111.anInt2450 - local27;
						@Pc(48) Class118 local48;
						if (local14 >= Static295.anInt5287) {
							if (local32 >= Static158.anInt3163) {
								local48 = local6[local14][local32];
								if (local48 != null && local48.aBoolean300) {
									Static437.aBoolean634 = arg0;
									Static275.aClass22_1.method1888(local48);
									Static275.aClass22_1.method1889();
								}
							}
							if (local36 < Static259.anInt4915) {
								local48 = local6[local14][local36];
								if (local48 != null && local48.aBoolean300) {
									Static437.aBoolean634 = arg0;
									Static275.aClass22_1.method1888(local48);
									Static275.aClass22_1.method1889();
								}
							}
						}
						if (local18 < Static415.anInt6801) {
							if (local32 >= Static158.anInt3163) {
								local48 = local6[local18][local32];
								if (local48 != null && local48.aBoolean300) {
									Static437.aBoolean634 = arg0;
									Static275.aClass22_1.method1888(local48);
									Static275.aClass22_1.method1889();
								}
							}
							if (local36 < Static259.anInt4915) {
								local48 = local6[local18][local36];
								if (local48 != null && local48.aBoolean300) {
									Static437.aBoolean634 = arg0;
									Static275.aClass22_1.method1888(local48);
									Static275.aClass22_1.method1889();
								}
							}
						}
						if (Static97.anInt2207 == 0) {
							if (Static204.aBoolean345) {
								Static275.aClass22_1.method1896(24);
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
