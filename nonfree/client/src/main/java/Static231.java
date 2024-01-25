import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static231 {

	@OriginalMember(owner = "client!lq", name = "f", descriptor = "Lclient!ql;")
	public static Class4_Sub2_Sub2_Sub1 aClass4_Sub2_Sub2_Sub1_2;

	@OriginalMember(owner = "client!lq", name = "q", descriptor = "I")
	public static int anInt4398 = -1;

	@OriginalMember(owner = "client!lq", name = "t", descriptor = "I")
	public static final int anInt4401 = 1339;

	@OriginalMember(owner = "client!lq", name = "u", descriptor = "[I")
	public static final int[] anIntArray306 = new int[2048];

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(I)[Lclient!ok;")
	public static Class180[] method3534() {
		return new Class180[] { Static303.aClass180_11, Static246.aClass180_10, Static106.aClass180_5, Static26.aClass180_1, Static389.aClass180_13, Static72.aClass180_7, Static205.aClass180_8, Static444.aClass180_15, Static401.aClass180_14, Static48.aClass180_3, Static43.aClass180_2, Static452.aClass180_16, Static120.aClass180_6, Static233.aClass180_9, Static325.aClass180_12 };
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "([ILclient!ql;[IZ[I)V")
	public static void method3538(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class4_Sub2_Sub2_Sub1 arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) int[] arg3) {
		for (@Pc(3) int local3 = 0; local3 < arg3.length; local3++) {
			@Pc(9) int local9 = arg3[local3];
			@Pc(13) int local13 = arg0[local3];
			@Pc(17) int local17 = arg2[local3];
			@Pc(19) int local19 = 0;
			while (local13 != 0 && local19 < arg1.aClass268Array3.length) {
				if ((local13 & 0x1) != 0) {
					if (local9 == -1) {
						arg1.aClass268Array3[local19] = null;
					} else {
						@Pc(36) Class46 local36 = Static9.aClass194_1.method4371(local9);
						@Pc(39) int local39 = local36.anInt1764;
						@Pc(44) Class268 local44 = arg1.aClass268Array3[local19];
						if (local44 != null) {
							if (local9 == local44.anInt7848) {
								if (local39 == 0) {
									local44 = arg1.aClass268Array3[local19] = null;
								} else if (local39 == 1) {
									local44.anInt7841 = local17;
									local44.anInt7839 = 0;
									local44.anInt7843 = 0;
									local44.anInt7842 = 1;
									local44.anInt7840 = 0;
									Static4.method137(local36, 0, arg1.anInt7111, arg1.aByte92, arg1.anInt7117, aClass4_Sub2_Sub2_Sub1_2 == arg1);
								} else if (local39 == 2) {
									local44.anInt7840 = 0;
								}
							} else if (local36.anInt1767 >= Static9.aClass194_1.method4371(local44.anInt7848).anInt1767) {
								local44 = arg1.aClass268Array3[local19] = null;
							}
						}
						if (local44 == null) {
							local44 = arg1.aClass268Array3[local19] = new Class268();
							local44.anInt7840 = 0;
							local44.anInt7839 = 0;
							local44.anInt7842 = 1;
							local44.anInt7848 = local9;
							local44.anInt7841 = local17;
							local44.anInt7843 = 0;
							Static4.method137(local36, 0, arg1.anInt7111, arg1.aByte92, arg1.anInt7117, arg1 == aClass4_Sub2_Sub2_Sub1_2);
						}
					}
				}
				local19++;
				local13 >>>= 0x1;
			}
		}
	}

	@OriginalMember(owner = "client!lq", name = "c", descriptor = "(B)V")
	public static void method3539() {
		for (@Pc(10) Class2_Sub26 local10 = (Class2_Sub26) Static288.aClass265_41.method6005(); local10 != null; local10 = (Class2_Sub26) Static288.aClass265_41.method6001()) {
			if (Static139.method2015(local10.anInt4529)) {
				Static185.method2941(local10);
			}
		}
		if (Static168.anInt3255 == 1) {
			Static237.aBoolean384 = false;
			Static153.method2331(Static346.anInt6104, Static85.anInt3261, Static117.anInt2356, Static447.anInt4684);
			return;
		}
		Static153.method2331(Static346.anInt6104, Static85.anInt3261, Static117.anInt2356, Static447.anInt4684);
		@Pc(62) int local62 = Static55.aClass210_1.method4758(Static115.aClass256_129.method5720(Static272.anInt7537));
		for (@Pc(67) Class2_Sub26 local67 = (Class2_Sub26) Static288.aClass265_41.method6005(); local67 != null; local67 = (Class2_Sub26) Static288.aClass265_41.method6001()) {
			@Pc(75) int local75 = Static317.method4542(local67);
			if (local62 < local75) {
				local62 = local75;
			}
		}
		Static447.anInt4684 = Static168.anInt3255 * 16 + (Static417.aBoolean624 ? 26 : 22);
		Static85.anInt3261 = local62 + 8;
	}
}
