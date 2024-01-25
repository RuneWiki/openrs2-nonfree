import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static143 {

	@OriginalMember(owner = "client!gt", name = "bb", descriptor = "[Lclient!kq;")
	public static Class151[] aClass151Array1;

	@OriginalMember(owner = "client!gt", name = "cb", descriptor = "Lclient!la;")
	public static Class14 aClass14_2;

	@OriginalMember(owner = "client!gt", name = "Y", descriptor = "Lclient!lm;")
	public static final Class163 aClass163_8 = new Class163(11, 7);

	@OriginalMember(owner = "client!gt", name = "ab", descriptor = "Lclient!lm;")
	public static final Class163 aClass163_9 = new Class163(8, 14);

	@OriginalMember(owner = "client!gt", name = "db", descriptor = "I")
	public static final int anInt2652 = 0;

	@OriginalMember(owner = "client!gt", name = "eb", descriptor = "[I")
	public static final int[] anIntArray226 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(I)V")
	public static void method2204() {
		if (Static434.aClass165_Sub1_1.method3397(Static404.anInt2752) || Static204.anInt3498 == Static184.anInt3250) {
			Static385.method5352(Static257.aClass75_8);
			if (Static204.anInt3498 != Static124.anInt2076) {
				Static120.method1949();
			}
		} else {
			Static144.method2216(false, 10, Static163.anInt2919, Static269.anInt2101);
		}
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(IIII)V")
	public static void method2205(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 1009) {
			Static76.method1146(Static295.aClass91_12, arg1, arg0);
		} else if (arg2 == 1008) {
			Static76.method1146(Static129.aClass91_5, arg1, arg0);
		} else if (arg2 == 1001) {
			Static76.method1146(Static258.aClass91_11, arg1, arg0);
		} else if (arg2 == 1010) {
			Static76.method1146(Static39.aClass91_2, arg1, arg0);
		} else if (arg2 == 1003) {
			Static76.method1146(Static239.aClass91_9, arg1, arg0);
			return;
		}
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(IIIIIII)V")
	public static void method2208(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(6) int arg3) {
		@Pc(11) Class166[] local11 = Static223.aClass166Array1;
		for (@Pc(13) int local13 = 0; local13 < local11.length; local13++) {
			@Pc(19) Class166 local19 = local11[local13];
			if (local19 != null && local19.anInt4251 == 2) {
				Static6.method90(arg3 >> 1, local19.anInt4245, local19.anInt4239, local19.anInt4238 * 2, arg2 >> 1, local19.anInt4243);
				if (Static242.anIntArray380[0] > -1 && Static277.anInt5022 % 20 < 10) {
					Static157.aClass41Array1[local19.anInt4242].method6090(arg1 + Static242.anIntArray380[0] - 12, arg0 - -Static242.anIntArray380[1] + -28);
				}
			}
		}
	}
}
